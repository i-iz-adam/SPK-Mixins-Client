/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.k.b;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.k.b.a;
import rs.k.b.b;
import rs.k.b.c;
import rs.k.b.d;

public class e
extends LinkedHashMap<Integer, c> {
    private static final Logger a = LoggerFactory.getLogger(e.class);
    private a b;
    private d c;
    private b d;
    private b e;

    public void a(rs.k.e e2) {
        int n2 = 403;
        if (!Objects.equals(System.getProperty("sun.arch.data.model"), "64") && n2 > 512) {
            a.error("defaulting model cache to 512MiB due to non 64-bit client");
            n2 = 512;
        }
        try {
            long l2 = ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / 1024L / 1024L;
            if ((long)n2 > l2 / 2L) {
                n2 = (int)(l2 / 2L);
                a.error("limiting the cache to " + n2 + " since the selected amount exceeds half of the total physical memory for the system.");
            }
        }
        catch (Throwable throwable) {
            a.error("failed to check physical memory size: " + String.valueOf(throwable));
        }
        this.b = new a((long)n2 * 0x100000L, e2);
        this.b.b();
        this.c = new d(this.b);
        this.d = new b(this.b);
        this.e = new b(this.b);
    }

    public void a() {
        this.clear();
        if (this.b != null) {
            this.b.c();
        }
    }

    public IntBuffer a(int n2) {
        return (IntBuffer)this.c.get(n2);
    }

    public void a(int n2, IntBuffer intBuffer) {
        this.c.put(n2, intBuffer);
    }

    public FloatBuffer b(int n2) {
        return (FloatBuffer)this.d.get(n2);
    }

    public void a(int n2, FloatBuffer floatBuffer) {
        this.d.put(n2, floatBuffer);
    }

    public FloatBuffer c(int n2) {
        return (FloatBuffer)this.e.get(n2);
    }

    public void b(int n2, FloatBuffer floatBuffer) {
        this.e.put(n2, floatBuffer);
    }

    public IntBuffer d(int n2) {
        if (this.b.a() && !this.b()) {
            a.error("failed to make room for int buffer");
        }
        return this.b.a(n2);
    }

    public FloatBuffer e(int n2) {
        if (this.b.a() && !this.b()) {
            a.error("failed to make room for float buffer");
        }
        return this.b.b(n2);
    }

    public boolean b() {
        if (this.e.size() * 16 > this.d.size() && this.d.size() > 0) {
            return this.e.a();
        }
        if (this.d.size() * 2 > this.c.size()) {
            return this.d.a();
        }
        return this.c.a();
    }

    @Override
    public void clear() {
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
        if (this.e != null) {
            this.e.clear();
        }
    }
}

