/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import rs.a.h;

public class b {
    public static List<Integer> a = new ArrayList<Integer>();
    public static List<Integer> b = new ArrayList<Integer>();
    public static List<Integer> c = new ArrayList<Integer>();
    public static List<Integer> d = new ArrayList<Integer>();
    public static List<Integer> e = new ArrayList<Integer>();
    public static List<Integer> f = new ArrayList<Integer>();

    public static void a() {
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        File file = new File("./debug");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./debug/textures.txt")));
            a a2 = null;
            while ((string = bufferedReader.readLine()) != null) {
                if (string.contains("#")) continue;
                if (string.toLowerCase().contains("[textur")) {
                    a2 = rs.l.b.a.b.b$a.a;
                    continue;
                }
                if (string.toLowerCase().contains("[random")) {
                    a2 = rs.l.b.a.b.b$a.b;
                    continue;
                }
                if (string.toLowerCase().contains("[recolor")) {
                    a2 = rs.l.b.a.b.b$a.c;
                    continue;
                }
                if (a2 == null || string.isEmpty() || a2 != rs.l.b.a.b.b$a.a) continue;
                String string2 = string.split(" ")[0];
                String string3 = string.split(" ")[1];
                int n2 = 1;
                if (string2.contains(",")) {
                    n2 = 0;
                    for (String string4 : string2.split(",")) {
                        ++n2;
                        a.add(Integer.parseInt(string4));
                    }
                } else {
                    a.add(Integer.parseInt(string2));
                }
                for (int i2 = 0; i2 < n2; ++i2) {
                    b.add(Integer.parseInt(string3));
                }
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void a(h h2) {
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.l.b.a.b.b$a.a();
        }
    }
}

