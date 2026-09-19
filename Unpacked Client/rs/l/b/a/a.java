/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import rs.Client;
import rs.d.k;
import rs.l.b.a.a.b;
import rs.l.b.a.d;
import rs.l.e.f;

public class a {
    private static final boolean a = true;

    public static void a(String string, String string2, String[] stringArray) {
        switch (string2.toLowerCase()) {
            case "col": 
            case "cols": 
            case "color": 
            case "colors": {
                boolean bl = true;
                for (rs.l.b.a.a.a a2 : d.b.h()) {
                    if (!a2.h() && !(a2 instanceof b)) continue;
                    if (a2 instanceof b) {
                        bl = false;
                    }
                    if (stringArray.length == 0) {
                        a2.f();
                        return;
                    }
                    if (string2.toLowerCase().equals("colors") || string2.toLowerCase().equals("cols") || stringArray[0].equalsIgnoreCase("reset")) {
                        a2.k().clear();
                    }
                    if (!stringArray[0].equalsIgnoreCase("reset") && stringArray.length > 0) {
                        for (String string3 : stringArray[0].split(",")) {
                            int n2 = Integer.parseInt(string3);
                            if (a2.k().contains(n2)) continue;
                            a2.k().add(n2);
                        }
                    }
                    d.b.c("Selected colors: @gre@" + Arrays.toString(a2.k().toArray()));
                }
                if (!bl) break;
                d.b.f();
                break;
            }
            case "finditem": 
            case "findnpc": {
                int n3;
                ArrayList<String> arrayList = new ArrayList<String>();
                Object object = "";
                for (String string4 : stringArray) {
                    if (!((String)object).isEmpty()) {
                        object = (String)object + " ";
                    }
                    if (string4.contains("-")) {
                        arrayList.add(string4.substring(1).toLowerCase());
                        continue;
                    }
                    object = (String)object + string4.toLowerCase();
                }
                ArrayList arrayList2 = new ArrayList();
                if (string2.toLowerCase().contains("item")) {
                    for (n3 = 1; n3 < 40000; ++n3) {
                        try {
                            k k2 = k.f(n3);
                            if (k2 == null || k2.w == null || !k2.w.toLowerCase().contains((CharSequence)object) || k2.b()) continue;
                            if (!k2.w.contains("@gre@")) {
                                // empty if block
                            }
                            boolean bl = false;
                            for (String string5 : arrayList) {
                                if (!k2.w.contains(string5)) continue;
                                bl = true;
                                break;
                            }
                            if (bl) continue;
                            arrayList2.add("@whi@" + k2.w + " @cya@[" + k2.i + "]");
                            continue;
                        }
                        catch (Exception exception) {
                            break;
                        }
                    }
                }
                if (string2.toLowerCase().contains("npc")) {
                    for (n3 = 1; n3 < 40000; ++n3) {
                        try {
                            rs.d.d d2 = rs.d.d.c(n3);
                            if (d2 == null || d2.o == null || d2.o.equals("null") || !d2.o.toLowerCase().contains((CharSequence)object)) continue;
                            boolean bl = false;
                            for (String string5 : arrayList) {
                                if (!d2.o.contains(string5)) continue;
                                bl = true;
                                break;
                            }
                            if (bl) continue;
                            arrayList2.add("@whi@" + d2.o + " @cya@[" + d2.x + "]");
                            continue;
                        }
                        catch (Exception exception) {
                            break;
                        }
                    }
                }
                Iterator iterator = arrayList2.iterator();
                while (iterator.hasNext()) {
                    String string6 = (String)iterator.next();
                    d.b(string6);
                }
                break;
            }
            case "itemdef": {
                if (stringArray[0].equalsIgnoreCase("reset")) {
                    Client.M();
                    k.b = new rs.t.a.d();
                    k.b.a();
                    k.k.a();
                    k.l.a();
                    d.b.f();
                    d.b.c("Item definitions reset!");
                    break;
                }
                int n4 = Integer.valueOf(stringArray[0]);
                k k3 = k.f(n4);
                System.out.println();
                System.out.println("[ITEM " + n4 + "]");
                System.out.println("modelID=" + k3.A);
                if (k3.r > 0) {
                    System.out.println("maleEquip1=" + k3.r);
                }
                if (k3.K > 0) {
                    System.out.println("maleEquip2=" + k3.K);
                }
                if (k3.aa > 0) {
                    System.out.println("femaleEquip1=" + k3.aa);
                }
                if (k3.q > 0) {
                    System.out.println("femaleEquip2=" + k3.q);
                }
                System.out.println("rotationX=" + k3.M);
                System.out.println("rotationY=" + k3.Z);
                System.out.println("zoom=" + k3.G);
                System.out.println("offset1=" + k3.v);
                System.out.println("offset2=" + k3.W);
                if (k3.o != -1) {
                    System.out.println("anInt162=" + k3.o);
                }
                if (k3.ae != 0) {
                    System.out.println("anInt204=" + k3.ae);
                }
                if (k3.h != null) {
                    System.out.println("modifiedModelColors=" + Arrays.toString(k3.g).replace("[", "").replace("]", "").replace(" ", ""));
                    System.out.println("originalModelColors=" + Arrays.toString(k3.h).replace("[", "").replace("]", "").replace(" ", ""));
                }
                if (k3.P != null) {
                    System.out.println("stackIds=" + Arrays.toString(k3.P).replace("[", "").replace("]", "").replace(" ", ""));
                    System.out.println("stackAmounts=" + Arrays.toString(k3.ab).replace("[", "").replace("]", "").replace(" ", ""));
                }
                Client.M();
                System.out.println();
                break;
            }
            case "texture": 
            case "textures": {
                f.j.r = true;
                f.j.s = 0;
                d.b.c("Textures opened");
            }
        }
    }
}

