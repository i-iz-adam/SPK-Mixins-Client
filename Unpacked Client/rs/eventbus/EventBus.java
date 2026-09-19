/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.V
 *  com.google.a.d.cv
 *  com.google.a.d.cv$a
 *  com.google.a.d.db
 *  com.google.a.d.hW
 *  javax.annotation.Nonnull
 *  javax.annotation.concurrent.ThreadSafe
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
package rs.eventbus;

import com.google.a.b.V;
import com.google.a.d.cv;
import com.google.a.d.db;
import com.google.a.d.hW;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import rs.A.q;
import rs.eventbus.Subscribe;

@ThreadSafe
public class EventBus {
    private static final Logger log = LoggerFactory.getLogger(EventBus.class);
    private static final Marker DEDUPLICATE = MarkerFactory.getMarker((String)"DEDUPLICATE");
    private final Consumer<Throwable> exceptionHandler;
    @Nonnull
    private cv<Class<?>, Subscriber> subscribers = cv.f();

    public EventBus() {
        this(throwable -> log.warn(DEDUPLICATE, "Uncaught exception in event subscriber", throwable));
    }

    public synchronized void register(@Nonnull Object object) {
        cv.a a2 = cv.x();
        a2.b(this.subscribers);
        a2.c(Comparator.comparingDouble(Subscriber::getPriority).reversed().thenComparing(subscriber -> ((Subscriber)subscriber).object.getClass().getName()));
        for (Class<?> clazz = object.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            for (Method method : clazz.getDeclaredMethods()) {
                Object object2;
                Class clazz2;
                Subscribe subscribe = method.getAnnotation(Subscribe.class);
                if (subscribe == null) continue;
                V.a((method.getReturnType() == Void.TYPE ? 1 : 0) != 0, (Object)("@Subscribed method \"" + String.valueOf(method) + "\" cannot return a value"));
                V.a((method.getParameterCount() == 1 ? 1 : 0) != 0, (Object)("@Subscribed method \"" + String.valueOf(method) + "\" must take exactly 1 argument"));
                V.a((!Modifier.isStatic(method.getModifiers()) ? 1 : 0) != 0, (Object)("@Subscribed method \"" + String.valueOf(method) + "\" cannot be static"));
                Class<?> clazz3 = method.getParameterTypes()[0];
                V.a((!clazz3.isPrimitive() ? 1 : 0) != 0, (Object)("@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to primitives"));
                V.a(((clazz3.getModifiers() & 0x600) == 0 ? 1 : 0) != 0, (Object)("@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to polymorphic classes"));
                for (clazz2 = clazz3.getSuperclass(); clazz2 != null; clazz2 = clazz2.getSuperclass()) {
                    if (!this.subscribers.f(clazz2)) continue;
                    throw new IllegalArgumentException("@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to class which inherits from subscribed class \"" + String.valueOf(clazz2) + "\"");
                }
                clazz2 = "on" + clazz3.getSimpleName();
                V.a((boolean)method.getName().equals(clazz2), (Object)("Subscribed method " + String.valueOf(method) + " should be named " + clazz2));
                method.setAccessible(true);
                Consumer consumer = null;
                try {
                    object2 = q.a(clazz);
                    MethodType methodType = MethodType.methodType(Void.TYPE, clazz3);
                    MethodHandle methodHandle = ((MethodHandles.Lookup)object2).findVirtual(clazz, method.getName(), methodType);
                    CallSite callSite = LambdaMetafactory.metafactory((MethodHandles.Lookup)object2, "accept", MethodType.methodType(Consumer.class, clazz), methodType.changeParameterType(0, Object.class), methodHandle, methodType);
                    MethodHandle methodHandle2 = callSite.getTarget();
                    consumer = methodHandle2.bindTo(object).invokeExact();
                }
                catch (Throwable throwable) {
                    log.warn("Unable to create lambda for method {}", (Object)method, (Object)throwable);
                }
                object2 = new Subscriber(object, method, subscribe.priority(), consumer);
                a2.b(clazz3, object2);
                log.debug("Registering {} - {}", clazz3, object2);
            }
        }
        this.subscribers = a2.b();
    }

    public synchronized <T> Subscriber register(Class<T> clazz, Consumer<T> consumer, float f2) {
        cv.a a2 = cv.x();
        a2.b(this.subscribers);
        a2.c(Comparator.comparingDouble(Subscriber::getPriority).reversed().thenComparing(subscriber -> ((Subscriber)subscriber).object.getClass().getName()));
        Subscriber subscriber2 = new Subscriber(consumer, null, f2, consumer);
        a2.b(clazz, (Object)subscriber2);
        this.subscribers = a2.b();
        return subscriber2;
    }

    public synchronized void unregister(@Nonnull Object object) {
        this.subscribers = cv.b((Iterable)db.c((Iterable)this.subscribers.B(), entry -> ((Subscriber)entry.getValue()).getObject() != object));
    }

    public synchronized void unregister(Subscriber subscriber) {
        if (subscriber == null) {
            return;
        }
        this.subscribers = cv.b((Iterable)db.c((Iterable)this.subscribers.B(), entry -> subscriber != entry.getValue()));
    }

    public void post(@Nonnull Object object) {
        hW hW2 = this.subscribers.i(object.getClass()).e_();
        while (hW2.hasNext()) {
            Subscriber subscriber = (Subscriber)hW2.next();
            try {
                subscriber.invoke(object);
            }
            catch (Exception exception) {
                this.exceptionHandler.accept(exception);
            }
        }
    }

    public EventBus(Consumer<Throwable> consumer) {
        this.exceptionHandler = consumer;
    }

    public static final class Subscriber {
        private final Object object;
        private final Method method;
        private final float priority;
        private final Consumer<Object> lambda;

        void invoke(Object object) {
            if (this.lambda != null) {
                this.lambda.accept(object);
            } else {
                this.method.invoke(this.object, object);
            }
        }

        public Subscriber(Object object, Method method, float f2, Consumer<Object> consumer) {
            this.object = object;
            this.method = method;
            this.priority = f2;
            this.lambda = consumer;
        }

        public Object getObject() {
            return this.object;
        }

        public Method getMethod() {
            return this.method;
        }

        public float getPriority() {
            return this.priority;
        }

        public Consumer<Object> getLambda() {
            return this.lambda;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Subscriber)) {
                return false;
            }
            Subscriber subscriber = (Subscriber)object;
            if (Float.compare(this.getPriority(), subscriber.getPriority()) != 0) {
                return false;
            }
            Object object2 = this.getObject();
            Object object3 = subscriber.getObject();
            if (object2 == null ? object3 != null : !object2.equals(object3)) {
                return false;
            }
            Method method = this.getMethod();
            Method method2 = subscriber.getMethod();
            return !(method == null ? method2 != null : !((Object)method).equals(method2));
        }

        public int hashCode() {
            int n2 = 59;
            int n3 = 1;
            n3 = n3 * 59 + Float.floatToIntBits(this.getPriority());
            Object object = this.getObject();
            n3 = n3 * 59 + (object == null ? 43 : object.hashCode());
            Method method = this.getMethod();
            n3 = n3 * 59 + (method == null ? 43 : ((Object)method).hashCode());
            return n3;
        }

        public String toString() {
            return "EventBus.Subscriber(object=" + String.valueOf(this.getObject()) + ", method=" + String.valueOf(this.getMethod()) + ", priority=" + this.getPriority() + ", lambda=" + String.valueOf(this.getLambda()) + ")";
        }
    }
}

