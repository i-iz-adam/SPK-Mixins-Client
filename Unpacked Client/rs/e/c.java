/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.e;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class c {
    private static final Logger a = LoggerFactory.getLogger(c.class);
    private final File b;
    private final ConcurrentHashMap<String, String> c;
    private Map<String, String> d = new HashMap<String, String>();

    c(File file) {
        this.b = file;
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader((InputStream)fileInputStream, StandardCharsets.UTF_8);){
            properties.load(inputStreamReader);
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        this.c = new ConcurrentHashMap(properties.size());
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> this.c.put((String)object, (String)object2)));
    }

    String a(String string) {
        return this.c.get(string);
    }

    synchronized String a(String string, String string2) {
        String string3 = this.c.put(string, string2);
        if (!Objects.equals(string3, string2)) {
            this.d.put(string, string2);
        }
        return string3;
    }

    synchronized String b(String string) {
        String string2 = this.c.remove(string);
        if (string2 != null) {
            this.d.put(string, null);
        }
        return string2;
    }

    synchronized void a(Map<String, String> map) {
        this.d.putAll(map);
        this.c.putAll(map);
    }

    Set<String> a() {
        return this.c.keySet();
    }

    Map<String, String> b() {
        return Collections.unmodifiableMap(this.c);
    }

    synchronized Map<String, String> c() {
        if (this.d.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> map = this.d;
        this.d = new HashMap<String, String>();
        return map;
    }

    void b(Map<String, String> map) {
        File file = new File(this.b.getParentFile(), this.b.getName() + ".lck");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             FileChannel fileChannel = fileOutputStream.getChannel();){
            Object object2;
            fileChannel.lock();
            Properties properties = new Properties();
            try {
                object2 = new FileInputStream(this.b);
                try (InputStreamReader object3 = new InputStreamReader((InputStream)object2, StandardCharsets.UTF_8);){
                    properties.load(object3);
                }
                finally {
                    ((FileInputStream)object2).close();
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.debug("config file {} does not exist", (Object)this.b);
            }
            if (properties.isEmpty()) {
                properties.putAll((Map<?, ?>)this.c);
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() == null) {
                        properties.remove(entry.getKey());
                        continue;
                    }
                    properties.put(entry.getKey(), entry.getValue());
                }
            }
            object2 = File.createTempFile("runelite_config", null, this.b.getParentFile());
            try (FileOutputStream fileOutputStream2 = new FileOutputStream((File)object2);
                 FileChannel fileChannel2 = fileOutputStream2.getChannel();
                 OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream2, StandardCharsets.UTF_8);){
                fileChannel2.lock();
                properties.store(outputStreamWriter, "RL configurations");
                outputStreamWriter.flush();
                fileChannel2.force(true);
            }
            try {
                Files.move(((File)object2).toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                a.debug("atomic move not supported", (Throwable)atomicMoveNotSupportedException);
                Files.move(((File)object2).toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException iOException) {
            a.error("unable to save configuration file", (Throwable)iOException);
        }
        file.delete();
    }
}

