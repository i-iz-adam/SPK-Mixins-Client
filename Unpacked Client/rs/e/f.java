/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.c.c
 *  com.google.a.c.d
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.e;

import com.google.a.c.c;
import com.google.a.c.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.q;
import rs.e.e;
import rs.e.g;
import rs.e.i;

class f
implements InvocationHandler {
    private static final Logger a = LoggerFactory.getLogger(f.class);
    private static final Object b = new Object();
    private final i c;
    private final c<Method, Object> d = com.google.a.c.d.a().a(256L).u();

    f(i i2) {
        this.c = i2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objectArray) {
        Object object2;
        Class<?> clazz;
        if (objectArray == null && (clazz = this.d.d((Object)method)) != null) {
            return clazz == b ? null : clazz;
        }
        clazz = object.getClass().getInterfaces()[0];
        if ("toString".equals(method.getName()) && objectArray == null) {
            return clazz.getSimpleName();
        }
        if ("hashCode".equals(method.getName()) && objectArray == null) {
            return System.identityHashCode(object);
        }
        if ("equals".equals(method.getName()) && objectArray != null && objectArray.length == 1) {
            return object == objectArray[0];
        }
        e e2 = clazz.getAnnotation(e.class);
        g g2 = method.getAnnotation(g.class);
        if (e2 == null) {
            a.warn("Configuration proxy class {} has no @ConfigGroup!", object.getClass());
            return null;
        }
        if (g2 == null) {
            a.warn("Configuration method {} has no @ConfigItem!", (Object)method);
            return null;
        }
        if (objectArray == null) {
            a.trace("cache miss (size: {}, group: {}, key: {})", new Object[]{this.d.b(), e2.a(), g2.b()});
            String string = this.c.a(e2.a(), g2.b());
            if (string == null) {
                if (method.isDefault()) {
                    Object object3 = f.a(object, method, null);
                    this.d.a((Object)method, object3 == null ? b : object3);
                    return object3;
                }
                this.d.a((Object)method, b);
                return null;
            }
            try {
                Object object4 = this.c.a(string, method.getGenericReturnType());
                this.d.a((Object)method, object4 == null ? b : object4);
                return object4;
            }
            catch (Exception exception) {
                a.warn("Unable to unmarshal {}.{} ", new Object[]{e2.a(), g2.b(), exception});
                if (method.isDefault()) {
                    return f.a(object, method, null);
                }
                return null;
            }
        }
        if (objectArray.length != 1) {
            throw new RuntimeException("Invalid number of arguments to configuration method");
        }
        Object object5 = objectArray[0];
        Class<?> clazz2 = method.getParameterTypes()[0];
        Object t2 = this.c.a(e2.a(), g2.b(), clazz2);
        if (Objects.equals(t2, object5)) {
            return null;
        }
        if (method.isDefault() && Objects.equals(object5, object2 = f.a(object, method, objectArray))) {
            this.c.b(e2.a(), g2.b());
            return null;
        }
        if (object5 == null) {
            this.c.b(e2.a(), g2.b());
        } else {
            object2 = this.c.a(object5);
            this.c.b(e2.a(), g2.b(), (String)object2);
        }
        return null;
    }

    static Object a(Object object, Method method, Object[] objectArray) {
        Class<?> clazz = method.getDeclaringClass();
        return q.a(clazz).unreflectSpecial(method, clazz).bindTo(object).invokeWithArguments(objectArray);
    }

    void a() {
        a.trace("cache invalidate");
        this.d.c();
    }
}

