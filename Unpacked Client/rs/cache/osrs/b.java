/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.cache.osrs;

import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.cache.osrs.a;

public class b {
    private static final Logger a = LoggerFactory.getLogger(b.class);
    private final rs.cache.b b;

    public b(rs.cache.b b2) {
        this.b = b2;
    }

    public void a() {
        if (!rs.f.a.c()) {
            return;
        }
        for (a a2 : rs.cache.osrs.a.values()) {
            File file = new File(a2.c());
            if (!file.exists() || file.listFiles().length <= 0) continue;
            this.a(a2, file.listFiles());
        }
    }

    public void a(a a2, File[] fileArray) {
        int n2 = 0;
        a.info("Scanning assets in pack directory {} index (file count: {})", (Object)a2.b(), (Object)fileArray.length);
        for (File file : fileArray) {
            if (!file.getName().contains(".gz")) continue;
            int n3 = Integer.parseInt(Client.e(file.getName()));
            byte[] byArray = this.a(file);
            if (byArray != null && byArray.length > 0) {
                this.b.a()[a2.a()].a(byArray.length, byArray, n3);
                ++n2;
                continue;
            }
            a.info("Unable to locate index {}.", (Object)a2.b());
        }
        if (n2 > 0) {
            a.info("Packed new assets into {} index ({} files)", (Object)a2.b(), (Object)n2);
        }
    }

    private byte[] a(File file) {
        try {
            byte[] byArray = new byte[(int)file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(byArray);
            fileInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

