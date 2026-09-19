/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.runelite.events;

import java.time.Duration;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ClientShutdown {
    private static final Logger log = LoggerFactory.getLogger(ClientShutdown.class);
    private final Queue<Future<?>> tasks = new ConcurrentLinkedQueue();

    public void waitFor(Future<?> future) {
        this.tasks.add(future);
    }

    public void waitForAllConsumers(Duration duration) {
        Future<?> future;
        long l2 = System.nanoTime() + duration.toNanos();
        while ((future = this.tasks.poll()) != null) {
            long l3 = l2 - System.nanoTime();
            if (l3 < 0L) {
                log.warn("Timed out waiting for task completion");
                return;
            }
            try {
                future.get(l3, TimeUnit.NANOSECONDS);
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
            catch (Throwable throwable) {
                log.warn("Error during shutdown: ", throwable);
            }
        }
    }

    public Queue<Future<?>> getTasks() {
        return this.tasks;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ClientShutdown)) {
            return false;
        }
        ClientShutdown clientShutdown = (ClientShutdown)object;
        Queue<Future<?>> queue = this.getTasks();
        Queue<Future<?>> queue2 = clientShutdown.getTasks();
        return !(queue == null ? queue2 != null : !queue.equals(queue2));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        Queue<Future<?>> queue = this.getTasks();
        n3 = n3 * 59 + (queue == null ? 43 : queue.hashCode());
        return n3;
    }

    public String toString() {
        return "ClientShutdown(tasks=" + String.valueOf(this.getTasks()) + ")";
    }
}

