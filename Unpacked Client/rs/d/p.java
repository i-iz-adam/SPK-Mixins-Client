/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 *  org.yaml.snakeyaml.Yaml
 */
package rs.d;

import gnu.trove.f.b.cc;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import rs.l.b.a.d;

public class p {
    public static final cc<a> a = new cc();

    public static void a() {
        if (d.c) {
            return;
        }
        a.clear();
        File file = new File(rs.v.a.f() + File.separator + "configs" + File.separator + "rarities.yaml");
        if (!file.exists()) {
            return;
        }
        Yaml yaml = new Yaml();
        FileInputStream fileInputStream = new FileInputStream(file);
        Map map = (Map)yaml.load((InputStream)fileInputStream);
        if (map == null) {
            return;
        }
        for (Object k2 : map.keySet()) {
            String string = (String)map.get(k2);
            if (string.equalsIgnoreCase("uncommon")) {
                a.a(((Integer)k2).intValue(), (Object)rs.d.p$a.a);
            }
            if (string.equalsIgnoreCase("rare")) {
                a.a(((Integer)k2).intValue(), (Object)rs.d.p$a.b);
            }
            if (!string.equalsIgnoreCase("legendary")) continue;
            a.a(((Integer)k2).intValue(), (Object)rs.d.p$a.c);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("<col=65BFFF>");
        public static final /* enum */ a b = new a("<col=BD73FF><shad=773494>");
        public static final /* enum */ a c = new a("<col=FFC81A><shad=9A7705>");
        public String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(String string2) {
            this.d = string2;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            e = rs.d.p$a.a();
        }
    }
}

