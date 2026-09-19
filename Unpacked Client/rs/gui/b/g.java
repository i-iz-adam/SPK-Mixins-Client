/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import rs.gui.b.b.b;
import rs.gui.b.f;
import rs.gui.x;

public class g {
    public static final int a = 5;
    public static ConcurrentHashMap<Integer, x> b = new ConcurrentHashMap();
    public static ExecutorService c = Executors.newFixedThreadPool(5);
    public static b[] d = new b[5];
    private static int e;
    private x f;
    private f g;

    public static void a() {
        for (int i2 = 0; i2 < 5; ++i2) {
            rs.gui.b.g.d[i2] = new b();
            c.submit(d[i2]);
        }
    }

    public g(f f2) {
        this.g = f2;
    }

    public g(int n2) {
        this.g = new f(n2);
    }

    public x b() {
        if (this.f == null) {
            x x2 = b.get(this.g.a());
            if (x2 == null) {
                if (++e >= 5) {
                    e = 0;
                }
                d[e].a(this.g.a());
                return null;
            }
            this.f = x2;
        }
        return this.f;
    }
}

