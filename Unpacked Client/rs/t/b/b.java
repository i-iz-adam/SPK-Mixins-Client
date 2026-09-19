/*
 * Decompiled with CFR 0.152.
 */
package rs.t.b;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import rs.d.k;
import rs.t.a;
import rs.t.a.d;

public class b {
    private static final String a = rs.v.a.b() + File.separator + "i.yaml";
    private static final String b = rs.v.a.b() + File.separator + "i.bin";

    public static void a() {
        if (rs.f.a.c != 1) {
            return;
        }
        rs.f.a.aa = false;
        LinkedHashMap<Integer, Map<String, Object>> linkedHashMap = new LinkedHashMap<Integer, Map<String, Object>>();
        for (int i2 = 0; i2 < k.a; ++i2) {
            try {
                k k2 = k.f(i2);
                Map<String, Object> map = rs.t.b.b.a(k2, k.e(k2.i), true);
                if (map.size() <= 0) continue;
                LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
                linkedHashMap2.put("name", k2.w);
                for (String string : map.keySet()) {
                    if (string.equals("name")) continue;
                    linkedHashMap2.put(string, map.get(string));
                }
                linkedHashMap.put(i2, linkedHashMap2);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        a a2 = new a(a, b);
        try {
            a2.a(linkedHashMap);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        System.out.println("..Dump completed!");
    }

    public static void b() {
        if (rs.f.a.c != 1) {
            return;
        }
        String[] stringArray = new String[]{"srcColors", "destColors", "retextures", "maleOffsets", "femaleOffsets", "maleChatModels", "femaleChatModels", "ambient", "contrast", "stackable"};
        String[] stringArray2 = new String[]{"modelId", "rotations", "zoom", "offsets"};
        d d2 = new d();
        d2.a();
        System.out.println("Running test..");
        for (int i2 = 0; i2 < k.a; ++i2) {
            if (d2.a(i2) == null) continue;
            k k2 = k.f(i2);
            k k3 = (k)d2.a(i2);
            Map<String, Object> map = rs.t.b.b.a(k3, k2, false);
            if (map.size() <= 0) continue;
            int n2 = 0;
            for (String string : map.keySet()) {
                if (Arrays.asList(stringArray).contains(string) || k3.F > 0 && k2.F > 0 && k3.F == k2.F && Arrays.asList(stringArray2).contains(string)) continue;
                ++n2;
            }
            if (n2 <= 0) continue;
            System.out.println("Found differences in item " + i2 + " (" + k.f((int)i2).w + ")");
            System.out.println("{ ");
            for (String string : map.keySet()) {
                if (Arrays.asList(stringArray).contains(string) || k3.F > 0 && k2.F > 0 && k3.F == k2.F && Arrays.asList(stringArray2).contains(string)) continue;
                System.out.print(string + " => " + rs.t.b.b.a(map.get(string)));
                if (string.equalsIgnoreCase("modelid")) {
                    System.out.print("  vs. (old) " + k2.A);
                }
                if (string.equalsIgnoreCase("actions")) {
                    System.out.print("  vs. (old) " + Arrays.toString(k2.L));
                }
                if (string.equalsIgnoreCase("maleModels")) {
                    System.out.print("  vs. (old) " + Arrays.toString(new int[]{k2.r, k2.K, k2.J}));
                }
                if (string.equalsIgnoreCase("femaleModels")) {
                    System.out.print("  vs. (old) " + Arrays.toString(new int[]{k2.aa, k2.q, k2.o}));
                }
                System.out.println();
            }
            System.out.println("}\n");
        }
        System.out.println("..Test completed!");
    }

    public static Map<String, Object> a(k k2, k k3, boolean bl) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        if (k2.w.equals("Dwarf remains") && k3.w.equals("Dwarf remains")) {
            return linkedHashMap;
        }
        if (k2.w == null && k3.w == null) {
            return linkedHashMap;
        }
        if (!k2.w.equalsIgnoreCase(k3.w)) {
            linkedHashMap.put("name", k2.w);
        }
        boolean bl2 = false;
        if (k2.F != k3.F) {
            linkedHashMap.put("note", k2.F);
            bl2 = true;
        }
        if (k2.p != k3.p) {
            if (bl2 && k2.p != 799) {
                linkedHashMap.put("template", k2.p);
            }
            if (!Arrays.equals(k2.L, new String[]{null, null, null, null, "Drop"})) {
                linkedHashMap.put("actions", k2.L);
            }
        }
        if (bl2) {
            if (k2.F == -1 || k2.p == -1) {
                linkedHashMap.put("note", -1);
                linkedHashMap.put("template", -1);
            } else {
                return linkedHashMap;
            }
        }
        if (k2.w.toLowerCase().contains("(broken)")) {
            linkedHashMap.put("broken", true);
        } else {
            if (!Arrays.equals(k2.L, k3.L)) {
                linkedHashMap.put("actions", k2.L);
            }
            if (!Arrays.equals(k2.u, k3.u)) {
                linkedHashMap.put("groundActions", k2.u);
            }
            if (k2.D != k3.D) {
                linkedHashMap.put("stackable", k2.D);
            }
            if (!Arrays.equals(k2.P, k3.P)) {
                linkedHashMap.put("stackIds", k2.P);
            }
            if (!Arrays.equals(k2.ab, k3.ab)) {
                linkedHashMap.put("stackAmounts", k2.ab);
            }
        }
        if (!Arrays.equals(k2.g, k3.g) || !Arrays.equals(k2.h, k3.h)) {
            linkedHashMap.put("srcColors", k2.g);
            linkedHashMap.put("destColors", k2.h);
        }
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl && linkedHashMap.size() > 1 && k2.A != k3.A && k2.A > 0) {
            for (int i2 = 0; i2 < k2.i; ++i2) {
                k k4 = k.f(i2);
                if (k2.F != -1 || k2.A != k4.A || k2.G != k4.G || k2.M != k4.M || k2.Z != k4.Z || k2.v != k4.v || k2.W != k4.W || k2.ae != k4.ae) continue;
                boolean bl5 = false;
                if (bl5) break;
                linkedHashMap.put("clone", i2);
                if (Arrays.equals(k2.L, k4.L)) {
                    linkedHashMap.remove("actions");
                }
                if (Arrays.equals(k2.u, k4.u)) {
                    linkedHashMap.remove("groundActions");
                }
                bl3 = true;
                if (k2.r != k4.r || k2.K != k4.K || k2.J != k4.J || k2.aa != k4.aa || k2.q != k4.q || k2.o != k4.o || k2.af != k4.af || k2.ag != k4.ag || k2.ah != k4.ah || k2.ai != k4.ai || k2.ak != k4.ak || k2.aj != k4.aj) break;
                bl4 = true;
                break;
            }
        }
        if (!bl3) {
            if (k2.A != k3.A) {
                linkedHashMap.put("modelId", k2.A);
            }
            if (k2.G != k3.G) {
                linkedHashMap.put("zoom", k2.G);
            }
            if (k2.M != k3.M || k2.Z != k3.Z) {
                linkedHashMap.put("rotations", new int[]{k2.M, k2.Z});
            }
            if (k2.v != k3.v || k2.W != k3.W) {
                linkedHashMap.put("offsets", new int[]{k2.v, k2.W});
            }
            if (k2.ae != k3.ae) {
                linkedHashMap.put("zan2d", k2.ae);
            }
        }
        if (k2.R != k3.R) {
            linkedHashMap.put("fullTexture", k2.R);
        }
        if (k2.U != k3.U) {
            linkedHashMap.put("textureInvAnim", k2.U);
        }
        if (!Arrays.equals(k2.S, k3.S) || !Arrays.equals(k2.T, k3.T)) {
            linkedHashMap.put("retextures", new int[][][]{new int[][]{k2.S, k2.T}});
        }
        if (k2.t != k3.t || k2.O != k3.O || k2.N != k3.N) {
            linkedHashMap.put("resize", new int[]{k2.t, k2.O, k2.N});
        }
        if (!bl4 && k2.L[1] != null) {
            if (k2.r != k3.r || k2.K != k3.K || k2.J != k3.J) {
                linkedHashMap.put("maleModels", new int[]{k2.r, k2.K, k2.J});
            }
            if (k2.aa != k3.aa || k2.q != k3.q || k2.o != k3.o) {
                linkedHashMap.put("femaleModels", new int[]{k2.aa, k2.q, k2.o});
            }
            if (k2.af != k3.af || k2.ag != k3.ag || k2.ah != k3.ah) {
                linkedHashMap.put("maleOffsets", new int[]{k2.af, k2.ag, k2.ah});
            }
            if (k2.ai != k3.ai || k2.ak != k3.ak || k2.aj != k3.aj) {
                linkedHashMap.put("femaleOffsets", new int[]{k2.ai, k2.ak, k2.aj});
            }
        }
        if (k2.B != k3.B || k2.s != k3.s) {
            linkedHashMap.put("maleChatModels", new int[]{k2.B, k2.s});
        }
        if (k2.Y != k3.Y || k2.z != k3.z) {
            linkedHashMap.put("femaleChatModels", new int[]{k2.Y, k2.z});
        }
        if (k2.X != k3.X) {
            linkedHashMap.put("ambient", k2.X);
        }
        if (k2.I != k3.I) {
            linkedHashMap.put("contrast", k2.I);
        }
        return linkedHashMap;
    }

    private static String a(Object object) {
        if (object instanceof int[]) {
            return Arrays.toString((int[])object);
        }
        if (object.getClass().isArray()) {
            try {
                return Arrays.toString((Object[])object);
            }
            catch (Exception exception) {
                return object.toString();
            }
        }
        return object.toString();
    }
}

