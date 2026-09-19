/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.A;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class r
implements Runnable {
    private static final Logger a = LoggerFactory.getLogger(r.class);
    private final Runnable b;

    @Override
    public void run() {
        try {
            this.b.run();
        }
        catch (Throwable throwable) {
            a.error("Uncaught exception in runnable {}", (Object)this.b, (Object)throwable);
            throw throwable;
        }
    }

    public static r a(Runnable runnable) {
        return new r(runnable);
    }

    public r(Runnable runnable) {
        this.b = runnable;
    }
}

