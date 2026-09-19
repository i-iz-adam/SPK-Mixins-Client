/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import rs.A.r;
import rs.a.e_0;

/*
 * Renamed from rs.A.h
 */
public class h_0
implements ScheduledExecutorService {
    private final ScheduledExecutorService a;

    private static Runnable a(Runnable runnable) {
        return r.a(runnable);
    }

    private static <V> Callable<V> a(Callable<V> callable) {
        return e_0.a(callable);
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(h_0.a(callable));
    }

    @Override
    public <T> Future<T> submit(Runnable runnable, T t2) {
        return this.a.submit(h_0.a(runnable), t2);
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        return this.a.submit(h_0.a(runnable));
    }

    @Override
    public void execute(Runnable runnable) {
        this.a.execute(h_0.a(runnable));
    }

    @Override
    public void shutdown() {
        this.a.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.a.invokeAll(collection);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, l2, timeUnit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.a.invokeAny(collection);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, l2, timeUnit);
    }

    @Override
    public ScheduledFuture<?> schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.a.schedule(runnable, l2, timeUnit);
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long l2, TimeUnit timeUnit) {
        return this.a.schedule(callable, l2, timeUnit);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, l2, l3, timeUnit);
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, l2, l3, timeUnit);
    }

    public h_0(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }
}

