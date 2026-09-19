/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.a;

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from rs.A.e
 */
public class e_0<V>
implements Callable<V> {
    private static final Logger a = LoggerFactory.getLogger(e_0.class);
    private final Callable<V> b;

    @Override
    public V call() {
        try {
            return this.b.call();
        }
        catch (Throwable throwable) {
            a.error("Uncaught exception in callable {}", this.b, (Object)throwable);
            throw throwable;
        }
    }

    public static <V> e_0<V> a(Callable<V> callable) {
        return new e_0<V>(callable);
    }

    public e_0(Callable<V> callable) {
        this.b = callable;
    }
}

