/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.bU
 *  org.yaml.snakeyaml.Yaml
 */
package rs.d;

import gnu.trove.f.b.bU;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import rs.s.s.b;

public class w {
    private static final HashMap<a, w> a = new HashMap();
    private final bU b = new bU();

    public static void a() {
        a.clear();
        for (a a2 : rs.d.w$a.values()) {
            w w2 = new w();
            a.put(a2, w2);
            File file = new File(rs.v.a.f() + File.separator + "configs" + File.separator + a2.b());
            if (!file.exists()) continue;
            FileInputStream fileInputStream = new FileInputStream(file);
            Yaml yaml = new Yaml();
            Map map = (Map)yaml.load((InputStream)fileInputStream);
            for (Object k2 : map.keySet()) {
                w2.c().a(((Integer)k2).intValue(), ((Integer)map.get(k2)).intValue());
            }
        }
    }

    public static String a(int n2, String object) {
        if (!rs.s.s.b.j) {
            return object;
        }
        for (int i2 = 0; i2 < rs.d.w$a.values().length; ++i2) {
            a a2 = rs.d.w$a.values()[i2];
            if (!a.get((Object)a2).c().r_(n2)) continue;
            object = (String)object + " @cya@(<img=" + a2.a() + ">" + String.format("%,d", a.get((Object)a2).c().c(n2)) + ")";
        }
        return object;
    }

    public static HashMap<a, w> b() {
        return a;
    }

    public bU c() {
        return this.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(180, "blood_core.yaml");
        public static final /* enum */ a b = new a(67, "blood_diamonds.yaml");
        public static final /* enum */ a c = new a(68, "blood_shards.yaml");
        private final int d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public int a() {
            return this.d;
        }

        public String b() {
            return this.e;
        }

        private a(int n3, String string2) {
            this.d = n3;
            this.e = string2;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c};
        }

        static {
            f = rs.d.w$a.c();
        }
    }
}

