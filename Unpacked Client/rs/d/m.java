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
import rs.v.a;

public class m {
    public static final cc<String> a = new cc();

    public static String a(String string, int n2) {
        return string + (a.w_(n2) ? (String)a.b(n2) : "");
    }

    public static void a(int n2, String string) {
        a.a(n2, (Object)string);
    }

    public static void a() {
        if (d.c) {
            return;
        }
        a.clear();
        File file = new File(rs.v.a.f() + File.separator + "configs" + File.separator + "hovers.yaml");
        if (!file.exists()) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        Yaml yaml = new Yaml();
        Map map = (Map)yaml.load((InputStream)fileInputStream);
        for (Object k2 : map.keySet()) {
            a.a(((Integer)k2).intValue(), (Object)((String)map.get(k2)));
        }
    }
}

