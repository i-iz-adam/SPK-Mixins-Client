/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
    public static final String a = "./clipdump/";
    public static final Map<Integer, List<a>> b = new HashMap<Integer, List<a>>();
    public static final List<String> c = new ArrayList<String>();

    public static int a(int n2, int n3) {
        int n4 = n2 >> 6;
        int n5 = n3 >> 6;
        return n4 * 256 + n5;
    }

    public static String a(int n2, int n3, int n4) {
        return n2 + "," + n3 + "," + n4;
    }

    public static void a(int n2, int n3, int n4, int n5, boolean bl) {
        String string = e.a(n2, n3, n4);
        if (c.contains(string)) {
            return;
        }
        if (n5 == 0) {
            return;
        }
        int n6 = n2 >> 6;
        int n7 = n3 >> 6;
        int n8 = n6 * 256 + n7;
        a a2 = new a(n2, n3, n4, n5, bl);
        List<a> list = b.get(n8);
        if (list == null) {
            list = new ArrayList<a>();
        }
        list.add(a2);
        c.add(string);
        b.put(n8, list);
    }

    public static void a() {
        b.clear();
        c.clear();
        System.out.println("Cleared saved map and position cache!");
    }

    public static void b() {
        System.out.println("Dumping " + b.size() + " regions..");
        for (int n2 : b.keySet()) {
            File file = new File(a + n2);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    for (a a2 : b.get(n2)) {
                        dataOutputStream.writeInt(a2.a);
                        dataOutputStream.writeInt(a2.b);
                        dataOutputStream.writeInt(a2.c);
                        dataOutputStream.writeInt(a2.d);
                        dataOutputStream.writeBoolean(a2.d == 0);
                        dataOutputStream.writeBoolean(a2.e);
                    }
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    file.delete();
                }
                dataOutputStream.close();
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        System.out.println("Dump successful!");
    }

    static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public a(int n2, int n3, int n4, int n5, boolean bl) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
            this.e = bl;
        }
    }
}

