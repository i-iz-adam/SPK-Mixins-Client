/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b.a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.cache.a.a;
import rs.cache.b.b;
import rs.cache.b.e;

public class d
extends rs.cache.b.d {
    private static final String e = rs.f.a.m + "sprites.zip";
    private static final String f = "sprites.zip";
    private static final String g = rs.v.a.f() + "sprites";
    private e h = new e("sprite_version");

    public d() {
        super("Sprites");
    }

    @Override
    public boolean a() {
        try {
            URL uRL = new URL(e);
            File file = new File(g);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            a a2 = new a(this.c, "Downloading sprites..", uRL, new File(file.getAbsolutePath() + File.separator + f));
            File file2 = a2.b();
            if (file2 != null) {
                if (!this.a(file.getAbsolutePath(), file2)) {
                    this.a(rs.cache.b.b.b);
                    return false;
                }
                file2.delete();
                return true;
            }
            this.a(rs.cache.b.b.b);
            return false;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public e b() {
        return this.h;
    }

    @Override
    public boolean f() {
        return true;
    }
}

