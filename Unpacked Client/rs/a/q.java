/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.j.p
 *  com.google.inject.Injector
 *  com.google.inject.Key
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.A;

import com.google.a.j.p;
import com.google.inject.Injector;
import com.google.inject.Key;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class q {
    private static final Logger a = LoggerFactory.getLogger(q.class);
    private static Set<Class<?>> b = Collections.newSetFromMap(new WeakHashMap());

    public static MethodHandles.Lookup a(Class<?> clazz) {
        try {
            MethodHandles.Lookup lookup = clazz.getClassLoader() instanceof b ? ((b)((Object)clazz.getClassLoader())).a() : MethodHandles.lookup();
            return MethodHandles.privateLookupIn(clazz, lookup);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    public static void a(b b2) {
        String string = a.class.getName();
        try (InputStream inputStream = q.class.getResourceAsStream("/" + string.replace('.', '/') + ".class");){
            byte[] byArray = p.a((InputStream)inputStream);
            Class<?> clazz = b2.a(string, byArray, 0, byArray.length);
            clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (IOException | ReflectiveOperationException exception) {
            throw new RuntimeException("unable to install lookup helper", exception);
        }
    }

    public static synchronized void a(Injector injector) {
        if (b == null) {
            return;
        }
        for (Key key : injector.getAllBindings().keySet()) {
            for (Class clazz = key.getTypeLiteral().getRawType(); clazz != null; clazz = clazz.getSuperclass()) {
                b.add(clazz);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static synchronized void a() {
        try {
            for (Class<?> clazz : b) {
                for (Method method : clazz.getDeclaredMethods()) {
                    q.a(method, Executable.class);
                }
                for (AccessibleObject accessibleObject : clazz.getDeclaredFields()) {
                    q.a(accessibleObject, Field.class);
                }
                for (AccessibleObject accessibleObject : clazz.getDeclaredConstructors()) {
                    q.a(accessibleObject, Executable.class);
                }
            }
        }
        catch (Exception exception) {
            a.debug(null, (Throwable)exception);
        }
        finally {
            b.clear();
            b = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(Object object, Class<?> clazz) {
        Object object2;
        if (object == null) {
            return;
        }
        Field field = clazz.getDeclaredField("declaredAnnotations");
        field.setAccessible(true);
        Object object3 = object;
        synchronized (object3) {
            object2 = (Map)field.get(object);
            if (object2 != null && object2 != Collections.emptyMap()) {
                field.set(object, null);
            }
        }
        object3 = object.getClass().getDeclaredField("root");
        ((Field)object3).setAccessible(true);
        object2 = ((Field)object3).get(object);
        q.a(object2, clazz);
    }

    private q() {
    }

    public static interface b {
        public Class<?> a(String var1, byte[] var2, int var3, int var4);

        public MethodHandles.Lookup a();

        public void a(MethodHandles.Lookup var1);
    }

    public static class a {
        static {
            b b2 = (b)((Object)a.class.getClassLoader());
            b2.a(MethodHandles.lookup());
        }
    }
}

