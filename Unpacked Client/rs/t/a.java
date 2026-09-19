/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.type.TypeReference
 *  org.msgpack.jackson.dataformat.MessagePackMapper
 *  org.yaml.snakeyaml.DumperOptions
 *  org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  org.yaml.snakeyaml.LoaderOptions
 *  org.yaml.snakeyaml.Yaml
 */
package rs.t;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import rs.t.b;
import rs.t.c;

public class a {
    protected String f;
    protected String g;

    public a(String string, String string2) {
        this.f = string;
        this.g = string2;
    }

    public Map<Integer, Map<String, Object>> a(boolean bl) {
        if (bl) {
            int n2;
            InputStream inputStream = Files.newInputStream(new File(this.g).toPath(), new OpenOption[0]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((n2 = inputStream.read()) != -1) {
                byteArrayOutputStream.write(n2);
            }
            byte[] byArray = byteArrayOutputStream.toByteArray();
            MessagePackMapper messagePackMapper = new MessagePackMapper();
            return (Map)messagePackMapper.readValue(byArray, (TypeReference)new b());
        }
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setMaxAliasesForCollections(200);
        Yaml yaml = new Yaml(loaderOptions);
        InputStream inputStream = Files.newInputStream(new File(this.f).toPath(), new OpenOption[0]);
        return (Map)yaml.load(inputStream);
    }

    public void a(Map<Integer, Map<String, Object>> map) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.AUTO);
        Yaml yaml = new Yaml(dumperOptions);
        try (FileWriter fileWriter = new FileWriter(this.f);){
            yaml.dump(map, (Writer)fileWriter);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void b() {
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setMaxAliasesForCollections(200);
        Yaml yaml = new Yaml(loaderOptions);
        InputStream inputStream = Files.newInputStream(new File(this.f).toPath(), new OpenOption[0]);
        Map map = (Map)yaml.load(inputStream);
        this.b(map);
    }

    public void b(Map<Integer, Map<String, Object>> map) {
        Object object;
        MessagePackMapper messagePackMapper;
        if (this instanceof c) {
            messagePackMapper = map.keySet().iterator();
            while (messagePackMapper.hasNext()) {
                Object object2;
                int n2 = (Integer)messagePackMapper.next();
                object = new HashMap();
                for (String string : map.get(n2).keySet()) {
                    if (!string.equalsIgnoreCase("textures")) continue;
                    object2 = (Map)map.get(n2).get(string);
                    int[][][] nArrayArray = new int[object2.size()][][];
                    int n3 = 0;
                    Iterator iterator = object2.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n4 = (Integer)iterator.next();
                        List list = (List)object2.get(n4);
                        nArrayArray[n3] = new int[2][];
                        nArrayArray[n3][0] = this.a(list);
                        nArrayArray[n3][1] = new int[list.size()];
                        for (int i2 = 0; i2 < list.size(); ++i2) {
                            nArrayArray[n3][1][i2] = n4;
                        }
                        ++n3;
                    }
                    object.put(string, new AbstractMap.SimpleEntry<String, int[][][]>("retextures", nArrayArray));
                }
                for (String string : object.keySet()) {
                    object2 = (AbstractMap.SimpleEntry)object.get(string);
                    map.get(n2).remove(string);
                    map.get(n2).put((String)((AbstractMap.SimpleEntry)object2).getKey(), ((AbstractMap.SimpleEntry)object2).getValue());
                }
            }
        }
        messagePackMapper = new MessagePackMapper();
        byte[] byArray = messagePackMapper.writeValueAsBytes(map);
        object = new FileOutputStream(new File(this.g));
        ((FileOutputStream)object).write(byArray);
        ((FileOutputStream)object).close();
    }

    protected int[] a(Object object) {
        if (object == null || ((List)object).size() == 0) {
            return null;
        }
        return ((List)object).stream().mapToInt(Integer::intValue).toArray();
    }

    public String c() {
        return this.f;
    }

    public void a(String string) {
        this.f = string;
    }

    public String d() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }
}

