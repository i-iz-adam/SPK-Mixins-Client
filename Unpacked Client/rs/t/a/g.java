/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.type.TypeReference
 *  gnu.trove.i.a.i
 *  org.msgpack.jackson.dataformat.MessagePackMapper
 *  org.yaml.snakeyaml.Yaml
 */
package rs.t.a;

import com.fasterxml.jackson.core.type.TypeReference;
import gnu.trove.i.a.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.Yaml;
import rs.d.k;
import rs.t.a;
import rs.t.d;

public class g
extends a {
    public static i a = new i();
    private static final String c = rs.v.a.f() + File.separator + "configs" + File.separator + "wandering_merchant.yaml";
    private static final String d = rs.v.a.f() + File.separator + "configs" + File.separator + "w.bin";
    protected boolean b = !rs.f.a.c();

    public g() {
        super(c, d);
    }

    public void a() {
        Map<String, Map<String, Object>> map = this.b(this.b);
        for (String string : map.keySet()) {
            Map<String, Object> map2 = map.get(string);
            Map map3 = (Map)map2.get("items");
            for (String string2 : map3.keySet()) {
                this.a((Integer)((HashMap)map3.get(string2)).get("id"));
            }
        }
    }

    private void a(int n2) {
        if (n2 == 995 || n2 == 20693 || n2 == 20842) {
            return;
        }
        k k2 = k.f(n2);
        if (k2 != null && k2.F > 0 && k2.p == 799) {
            n2 = k2.F;
        }
        a.b(n2);
    }

    private Map<String, Map<String, Object>> b(boolean bl) {
        if (bl) {
            int n2;
            InputStream inputStream = Files.newInputStream(new File(this.g).toPath(), new OpenOption[0]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((n2 = inputStream.read()) != -1) {
                byteArrayOutputStream.write(n2);
            }
            byte[] byArray = byteArrayOutputStream.toByteArray();
            MessagePackMapper messagePackMapper = new MessagePackMapper();
            return (Map)messagePackMapper.readValue(byArray, (TypeReference)new d());
        }
        Yaml yaml = new Yaml();
        InputStream inputStream = Files.newInputStream(new File(this.f).toPath(), new OpenOption[0]);
        return (Map)yaml.load(inputStream);
    }
}

