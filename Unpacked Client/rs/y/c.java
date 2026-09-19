/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.y;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.y.a;
import rs.y.b;

@Singleton
public class c {
    private static final Logger b = LoggerFactory.getLogger(c.class);
    private final List<b> c = new CopyOnWriteArrayList<b>();
    @Inject
    ScheduledExecutorService a;

    public void a(b b2) {
        this.c.add(b2);
    }

    public void b(b b2) {
        this.c.remove(b2);
    }

    public List<b> a() {
        return Collections.unmodifiableList(this.c);
    }

    public void b() {
        Instant instant = Instant.now();
        for (b b2 : this.c) {
            a a2;
            Duration duration;
            Instant instant2 = b2.e();
            Duration duration2 = Duration.between(instant2, instant);
            if (duration2.compareTo(duration = Duration.of((a2 = b2.a()).a(), a2.b())) <= 0) continue;
            b.trace("Scheduled task triggered: {}", (Object)b2);
            b2.a(instant);
            if (a2.c()) {
                this.a.submit(() -> this.c(b2));
                continue;
            }
            this.c(b2);
        }
    }

    private void c(b b2) {
        try {
            Runnable runnable = b2.d();
            if (runnable != null) {
                runnable.run();
            } else {
                Method method = b2.b();
                method.invoke(b2.c(), new Object[0]);
            }
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            b.warn("error invoking scheduled task", (Throwable)exception);
        }
        catch (Exception exception) {
            b.warn("error during scheduled task", (Throwable)exception);
        }
    }
}

