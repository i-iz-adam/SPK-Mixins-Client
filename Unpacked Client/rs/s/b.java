/*
 * Decompiled with CFR 0.152.
 */
package rs.s;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

class b
extends URLClassLoader {
    private final ClassLoader a;

    b(File file, ClassLoader classLoader) {
        super(new URL[]{file.toURI().toURL()}, (ClassLoader)null);
        this.a = classLoader;
    }

    @Override
    public Class<?> loadClass(String string) {
        try {
            return super.loadClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return this.a.loadClass(string);
        }
    }
}

