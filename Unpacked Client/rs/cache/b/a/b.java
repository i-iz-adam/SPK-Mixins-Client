/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b.a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.cache.a.a;
import rs.cache.b.d;
import rs.cache.b.e;

public class b
extends d {
    private static final String e = rs.f.a.z + "/assets/client.jar";
    private static final String f = rs.v.a.b() + "client.jar";
    private e g = new e(f, "client_version");

    public b(String string) {
        super(string);
    }

    @Override
    public boolean a() {
        try {
            URL uRL = new URL(e);
            File file = new File(f);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            a a2 = new a(this.c, "Downloading client..", uRL, new File(file.getAbsolutePath()));
            File file2 = a2.b();
            return file2 != null && file2.exists();
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public e b() {
        return this.g;
    }

    @Override
    public boolean f() {
        return true;
    }
}

