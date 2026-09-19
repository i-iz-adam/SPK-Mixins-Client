/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rs.d.d;
import rs.d.k;
import rs.d.r;
import rs.d.x;

public class u {
    public static void a(String string) {
        File[] fileArray;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        File file = new File(string);
        if (!file.exists()) {
            System.out.println("[Model Checker] Could not find directory \"" + string + "\"");
            return;
        }
        for (File file2 : fileArray = file.listFiles()) {
            String string2 = file2.getName();
            if (string2 == null) continue;
            string2 = string2.replaceAll(".gz", "");
            string2 = string2.replaceAll(".dat", "");
            try {
                int n2 = Integer.parseInt(string2);
                arrayList.add(n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("[Model Checker] Checking " + arrayList.size() + " models from [" + string + "]..");
        try {
            u.a(arrayList);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void a(List<Integer> list) {
        Object object;
        Object object22;
        int n2;
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (n2 = 1; n2 < k.ad; ++n2) {
            object22 = k.f(n2);
            if (object22 == null) continue;
            object = ((k)object22).w == null ? "null" : ((k)object22).w;
            for (int n3 : list) {
                if (((k)object22).A == n3) {
                    System.out.println("[Model Checker] Found model ID " + n3 + " for ITEM: " + (String)object + " (" + n2 + ") (modelID)");
                    hashMap.put(n3, true);
                }
                if (((k)object22).r == n3) {
                    System.out.println("[Model Checker] Found model ID " + n3 + " for ITEM: " + (String)object + " (" + n2 + ") (maleEquip1)");
                    hashMap.put(n3, true);
                }
                if (((k)object22).K == n3) {
                    System.out.println("[Model Checker] Found model ID " + n3 + " for ITEM: " + (String)object + " (" + n2 + ") (maleEquip2)");
                    hashMap.put(n3, true);
                }
                if (((k)object22).aa == n3) {
                    System.out.println("[Model Checker] Found model ID " + n3 + " for ITEM: " + (String)object + " (" + n2 + ") (femaleEquip1)");
                    hashMap.put(n3, true);
                }
                if (((k)object22).q != n3) continue;
                System.out.println("[Model Checker] Found model ID " + n3 + " for ITEM: " + (String)object + " (" + n2 + ") (femaleEquip2)");
                hashMap.put(n3, true);
            }
        }
        for (n2 = 1; n2 < r.A; ++n2) {
            object22 = r.c(n2);
            if (object22 == null || ((r)object22).an == null) continue;
            object = ((r)object22).R == null ? "null" : ((r)object22).R;
            for (int n3 : list) {
                for (int n4 : ((r)object22).an) {
                    if (n3 != n4) continue;
                    System.out.println("[Model Checker] Found model ID " + n3 + " for OBJECT: " + (String)object + " (" + n2 + ")");
                    hashMap.put(n3, true);
                }
            }
        }
        for (n2 = 1; n2 < d.f; ++n2) {
            object22 = d.c(n2);
            if (object22 == null || ((d)object22).L == null) continue;
            object = ((d)object22).o == null ? "null" : ((d)object22).o;
            for (int n3 : list) {
                for (int n4 : ((d)object22).L) {
                    if (n3 != n4) continue;
                    System.out.println("[Model Checker] Found model ID " + n3 + " for NPC: " + (String)object + " (" + n2 + ")");
                    hashMap.put(n3, true);
                }
            }
        }
        for (n2 = 0; n2 < x.c.length; ++n2) {
            object22 = x.c[n2];
            if (object22 == null) continue;
            object = list.iterator();
            while (object.hasNext()) {
                int n5 = (Integer)object.next();
                if (((x)object22).e != n5) continue;
                System.out.println("[Model Checker] Found model ID " + n5 + " for GFX: " + n2);
                hashMap.put(n5, true);
            }
        }
        System.out.println("[Model Checker] Model scan complete! Found a total of " + hashMap.size() + " used models..");
        if (hashMap.size() > 0) {
            System.out.print("[Model Checker] " + hashMap.size() + " used models: ");
            for (Object object22 : hashMap.keySet()) {
                System.out.print((Integer)object22 + ",");
            }
            System.out.print("\n");
        }
    }
}

