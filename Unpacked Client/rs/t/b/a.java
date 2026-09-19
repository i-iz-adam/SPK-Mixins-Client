/*
 * Decompiled with CFR 0.152.
 */
package rs.t.b;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import rs.d.d;
import rs.t.a.b;

public class a {
    public static boolean a = false;
    public static boolean b = false;
    private static final String c = rs.v.a.b() + File.separator + "e.yaml";
    private static final String d = rs.v.a.b() + File.separator + "e.bin";

    public static void a() {
        if (rs.f.a.c != 1) {
            return;
        }
        a = true;
        LinkedHashMap<Integer, Map<String, Object>> linkedHashMap = new LinkedHashMap<Integer, Map<String, Object>>();
        for (int i2 = 0; i2 < 25000; ++i2) {
            try {
                b = true;
                d d2 = rs.d.d.c(i2);
                Map<String, Object> map = rs.t.b.a.a(d2, rs.d.d.b((int)d2.x));
                if (map.size() <= 0) continue;
                LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
                linkedHashMap2.put("name", d2.o);
                for (String string : map.keySet()) {
                    linkedHashMap2.put(string, map.get(string));
                }
                linkedHashMap.put(i2, linkedHashMap2);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        rs.t.a a2 = new rs.t.a(c, d);
        try {
            a2.a(linkedHashMap);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        System.out.println("..Dump completed!");
        a = false;
    }

    public static void b() {
        if (rs.f.a.c != 1) {
            return;
        }
        String[] stringArray = new String[]{"retextures", "srcColors", "destColors", "chatHeadModels"};
        b b2 = new b();
        b2.a();
        for (int i2 = 0; i2 < 25000; ++i2) {
            try {
                d d2 = (d)b2.a(i2);
                if (d2 == null) {
                    d2 = rs.d.d.b(i2);
                }
                int n2 = 0;
                Map<String, Object> map = rs.t.b.a.a(d2, rs.d.d.c(i2));
                for (String string : map.keySet()) {
                    if (Arrays.asList(stringArray).contains(string)) continue;
                    ++n2;
                }
                if (n2 <= 0) continue;
                System.out.println("Found differences in NPC " + i2 + " (" + rs.d.d.c((int)i2).o + ")");
                System.out.println("{ ");
                try {
                    for (String string : map.keySet()) {
                        System.out.print(string + " => " + rs.t.b.a.a(map.get(string)));
                        System.out.println();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                System.out.println("}\n");
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static Map<String, Object> a(d d2, d d3) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        if (!d2.o.equalsIgnoreCase(d3.o)) {
            linkedHashMap.put("name", d2.o);
        }
        if (d2.n != d3.n) {
            linkedHashMap.put("combatLevel", d2.n);
        }
        if (!Arrays.equals(d2.p, d3.p)) {
            linkedHashMap.put("actions", d2.p);
        }
        if (!Arrays.equals(d2.L, d3.L)) {
            linkedHashMap.put("models", d2.L);
        }
        if (d2.I != d3.I) {
            linkedHashMap.put("scaleWidth", d2.I);
        }
        if (d2.E != d3.E) {
            linkedHashMap.put("scaleHeight", d2.E);
        }
        if (!Arrays.equals(d2.v, d3.v)) {
            linkedHashMap.put("srcColors", d2.v);
        }
        if (!Arrays.equals(d2.s, d3.s)) {
            linkedHashMap.put("destColors", d2.s);
        }
        if (!Arrays.equals(d2.t, d3.t)) {
            linkedHashMap.put("chatHeadModels", d2.t);
        }
        if (d2.r != d3.r) {
            linkedHashMap.put("size", d2.r);
        }
        if (d2.w != d3.w) {
            linkedHashMap.put("standAnim", d2.w);
        }
        if (d2.q != d3.q) {
            linkedHashMap.put("walkAnim", d2.q);
        }
        if (d2.l == d2.B && d2.l == d2.j && d2.l != d3.l) {
            linkedHashMap.put("rotateAnim", d2.l);
        } else {
            if (d2.l != d3.l) {
                linkedHashMap.put("rotateAnim180", d2.l);
            }
            if (d2.B != d3.B) {
                linkedHashMap.put("rotateAnim90CW", d2.B);
            }
            if (d2.j != d3.j) {
                linkedHashMap.put("rotateAnim90CCW", d2.j);
            }
        }
        if (d2.F != d3.F) {
            linkedHashMap.put("minimap", d2.F);
        }
        if (d2.K != d3.K) {
            linkedHashMap.put("priorityRender", d2.K);
        }
        if (d2.D != d3.D) {
            linkedHashMap.put("ambient", d2.D);
        }
        if (d2.J != d3.J) {
            linkedHashMap.put("contrast", d2.J);
        }
        if (d2.u != d3.u) {
            linkedHashMap.put("headIcon", d2.u);
        }
        if (d2.y != d3.y) {
            linkedHashMap.put("rotationSpeed", d2.y);
        }
        if (d2.k != d3.k) {
            linkedHashMap.put("anInt57", d2.k);
        }
        if (d2.m != d3.m) {
            linkedHashMap.put("anInt59", d2.m);
        }
        if (d2.h != d3.h) {
            linkedHashMap.put("pet", d2.h);
        }
        if (d2.C != d3.C) {
            linkedHashMap.put("clickable", d2.C);
        }
        if (d2.g != d3.g) {
            linkedHashMap.put("renderIdle", d2.g);
        }
        return linkedHashMap;
    }

    private static String a(Object object) {
        if (object == null) {
            return "null";
        }
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

