/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.a.d
 *  com.google.a.b.as
 *  com.google.a.g.O
 *  com.google.a.g.P
 *  com.google.a.g.S
 *  com.google.a.g.ag
 *  com.google.a.n.b
 *  com.google.a.n.b$a
 *  com.google.inject.CreationException
 *  com.google.inject.Injector
 *  com.google.inject.Key
 *  com.google.inject.Module
 *  javax.inject.Inject
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s;

import com.google.a.b.as;
import com.google.a.g.O;
import com.google.a.g.P;
import com.google.a.g.S;
import com.google.a.g.ag;
import com.google.a.n.b;
import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.q;
import rs.e.i;
import rs.eventbus.EventBus;
import rs.runelite.events.PluginChanged;
import rs.s.a;
import rs.s.d;
import rs.s.e;
import rs.s.f;
import rs.y.c;

@Singleton
public class g {
    private static final Logger c = LoggerFactory.getLogger(g.class);
    private static final String d = g.class.getPackageName();
    private final boolean e;
    private final boolean f;
    private final EventBus g;
    private final c h;
    private final i i;
    private final List<a> j = new CopyOnWriteArrayList<a>();
    private final List<a> k = new CopyOnWriteArrayList<a>();
    boolean a;

    @Inject
    @com.google.a.a.d
    public g(@Named(value="developerMode") boolean bl, @Named(value="safeMode") boolean bl2, EventBus eventBus, c c2, i i2) {
        this.e = bl;
        this.f = bl2;
        this.g = eventBus;
        this.h = c2;
        this.i = i2;
    }

    private void d() {
        this.b((Collection<a>)null);
        SwingUtilities.invokeLater(() -> {
            for (a a2 : this.c()) {
                try {
                    if (this.d(a2) == this.k.contains(a2)) continue;
                    if (this.k.contains(a2)) {
                        this.c(a2);
                        continue;
                    }
                    this.b(a2);
                }
                catch (f f2) {
                    c.warn("Error during starting/stopping plugin {}", (Object)a2.getClass().getSimpleName(), (Object)f2);
                }
            }
        });
    }

    public rs.e.b a(a a2) {
        try {
            Injector injector = a2.d();
            for (Key key : injector.getBindings().keySet()) {
                Class clazz = key.getTypeLiteral().getRawType();
                if (!rs.e.b.class.isAssignableFrom(clazz)) continue;
                return (rs.e.b)injector.getInstance(key);
            }
        }
        catch (Throwable throwable) {
            c.warn("Unable to get plugin config", throwable);
        }
        return null;
    }

    public List<rs.e.b> a(Collection<a> collection) {
        ArrayList<Injector> arrayList = new ArrayList<Injector>();
        if (collection == null) {
            arrayList.add(rs.p.a.c());
            collection = this.c();
        }
        collection.forEach(a2 -> arrayList.add(a2.d()));
        ArrayList<rs.e.b> arrayList2 = new ArrayList<rs.e.b>();
        for (Injector injector : arrayList) {
            for (Key key : injector.getBindings().keySet()) {
                Class clazz = key.getTypeLiteral().getRawType();
                if (!rs.e.b.class.isAssignableFrom(clazz)) continue;
                rs.e.b b2 = (rs.e.b)injector.getInstance(key);
                arrayList2.add(b2);
            }
        }
        return arrayList2;
    }

    public void b(Collection<a> collection) {
        try {
            for (rs.e.b b2 : this.a(collection)) {
                this.i.a(b2, false);
            }
        }
        catch (Throwable throwable) {
            c.warn("Unable to reset plugin configuration", throwable);
        }
    }

    public void a() {
        ArrayList<a> arrayList = new ArrayList<a>(this.j);
        int n2 = 0;
        for (a a2 : arrayList) {
            try {
                SwingUtilities.invokeAndWait(() -> {
                    try {
                        this.b(a2);
                    }
                    catch (f f2) {
                        c.warn("Unable to start plugin {}", (Object)a2.getClass().getSimpleName(), (Object)f2);
                        this.j.remove(a2);
                    }
                });
            }
            catch (InterruptedException | InvocationTargetException exception) {
                throw new RuntimeException(exception);
            }
            ++n2;
        }
        for (a a2 : this.j) {
            q.a(a2.a);
        }
    }

    public void b() {
        b b2 = com.google.a.n.b.a((ClassLoader)this.getClass().getClassLoader());
        List<Class<?>> list = b2.b(d).stream().map(b.a::d).collect(Collectors.toList());
        this.a(list, (BiConsumer<Integer, Integer>)null);
    }

    public List<a> a(List<Class<?>> list, BiConsumer<Integer, Integer> biConsumer) {
        Object object;
        ag ag2 = P.a().c();
        for (Class<Object> clazz : list) {
            object = clazz.getAnnotation(e.class);
            if (object == null) {
                if (clazz.getSuperclass() != a.class) continue;
                c.warn("Class {} is a plugin, but has no plugin descriptor", clazz);
                continue;
            }
            if (clazz.getSuperclass() != a.class) {
                c.warn("Class {} has plugin descriptor, but is not a plugin", clazz);
                continue;
            }
            if (!object.i() && this.a || object.h() && !this.e) continue;
            if (this.f && !object.j()) {
                c.debug("Disabling {} due to safe mode", clazz);
                this.i.b(rs.f.a.A, (as.c((String)object.b()) ? clazz.getSimpleName() : object.b()).toLowerCase());
                continue;
            }
            ag2.i(clazz);
        }
        for (Class<Object> clazz : ag2.c()) {
            for (Object object2 : object = (d[])clazz.getAnnotationsByType(d.class)) {
                if (!ag2.c().contains(object2.a())) continue;
                ag2.b(object2.a(), clazz);
            }
        }
        if (S.a((O)ag2)) {
            throw new f("Plugin dependency graph contains a cycle!");
        }
        List list2 = rs.s.g.a(ag2);
        int n2 = 0;
        object = new ArrayList();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            Class clazz = (Class)iterator.next();
            try {
                a a2 = this.a(this.j, clazz);
                object.add(a2);
                this.j.add(a2);
            }
            catch (f f2) {
                c.warn("Error instantiating plugin!", (Throwable)f2);
            }
            ++n2;
            if (biConsumer == null) continue;
            biConsumer.accept(n2, list2.size());
        }
        return object;
    }

    public boolean b(a a2) {
        assert (SwingUtilities.isEventDispatchThread());
        if (this.k.contains(a2) || !this.d(a2)) {
            return false;
        }
        List<a> list = this.g(a2);
        for (a a3 : list) {
            if (this.d(a3)) {
                this.a(a3, false);
            }
            if (!this.k.contains(a3)) continue;
            this.c(a3);
        }
        this.k.add(a2);
        try {
            a2.a();
            c.debug("Plugin {} is now running", (Object)a2.getClass().getSimpleName());
            this.g.register(a2);
            this.h(a2);
            this.g.post(new PluginChanged(a2, true));
        }
        catch (Throwable throwable) {
            throw new f(throwable);
        }
        return true;
    }

    public boolean c(a a2) {
        assert (SwingUtilities.isEventDispatchThread());
        if (!this.k.remove(a2)) {
            return false;
        }
        this.i(a2);
        this.g.unregister(a2);
        try {
            a2.b();
            c.debug("Plugin {} is now stopped", (Object)a2.getClass().getSimpleName());
            this.g.post(new PluginChanged(a2, false));
        }
        catch (Exception exception) {
            throw new f(exception);
        }
        return true;
    }

    public void a(a a2, boolean bl) {
        e e2 = a2.getClass().getAnnotation(e.class);
        String string = as.c((String)e2.b()) ? a2.getClass().getSimpleName() : e2.b();
        this.i.b(rs.f.a.A, string.toLowerCase(), String.valueOf(bl));
        if (bl) {
            List<a> list = this.g(a2);
            for (a a3 : list) {
                if (!this.d(a3)) continue;
                this.a(a3, false);
            }
        }
    }

    public boolean d(a a2) {
        e e2 = a2.getClass().getAnnotation(e.class);
        String string = as.c((String)e2.b()) ? a2.getClass().getSimpleName() : e2.b();
        String string2 = this.i.a(rs.f.a.A, string.toLowerCase());
        return string2 != null ? Boolean.parseBoolean(string2) : e2.f();
    }

    private a a(List<a> list, Class<a> clazz) {
        a a3;
        d[] dArray = (d[])clazz.getAnnotationsByType(d.class);
        ArrayList<a> arrayList = new ArrayList<a>();
        for (d d2 : dArray) {
            Optional<a> optional = list.stream().filter(a2 -> a2.getClass() == d2.a()).findFirst();
            if (!optional.isPresent()) {
                throw new f("Unmet dependency for " + clazz.getSimpleName() + ": " + d2.a().getSimpleName());
            }
            arrayList.add(optional.get());
        }
        try {
            a3 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Throwable injector) {
            throw new f(injector);
        }
        try {
            Injector injector;
            Injector creationException = rs.p.a.c();
            if (arrayList.size() > 1) {
                ArrayList<Module> module = new ArrayList<Module>(arrayList.size());
                for (a a4 : arrayList) {
                    Module module2 = binder -> {
                        binder.bind(a4.getClass()).toInstance((Object)a4);
                        binder.install((Module)a4);
                    };
                    module.add(module2);
                }
                creationException = creationException.createChildInjector(module);
            } else if (!arrayList.isEmpty()) {
                creationException = ((a)arrayList.get((int)0)).a;
            }
            Module module = binder -> {
                binder.bind(clazz).toInstance((Object)a3);
                binder.install((Module)a3);
            };
            a3.a = injector = creationException.createChildInjector(new Module[]{module});
        }
        catch (CreationException creationException) {
            throw new f(creationException);
        }
        c.debug("Loaded plugin {}", (Object)clazz.getSimpleName());
        return a3;
    }

    public void e(a a2) {
        this.j.add(a2);
    }

    public void f(a a2) {
        this.j.remove(a2);
    }

    public Collection<a> c() {
        return this.j;
    }

    private void h(a a2) {
        for (Method method : a2.getClass().getMethods()) {
            Object object;
            rs.y.a a3 = method.getAnnotation(rs.y.a.class);
            if (a3 == null) continue;
            Runnable runnable = null;
            try {
                object = method.getDeclaringClass();
                MethodHandles.Lookup lookup = q.a(object);
                MethodType methodType = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                MethodHandle methodHandle = lookup.findVirtual((Class<?>)object, method.getName(), methodType);
                CallSite callSite = LambdaMetafactory.metafactory(lookup, "run", MethodType.methodType(Runnable.class, object), methodType, methodHandle, methodType);
                MethodHandle methodHandle2 = callSite.getTarget();
                runnable = methodHandle2.bindTo(a2).invokeExact();
            }
            catch (Throwable throwable) {
                c.warn("Unable to create lambda for method {}", (Object)method, (Object)throwable);
            }
            object = new rs.y.b(a3, method, a2, runnable);
            c.debug("Scheduled task {}", object);
            this.h.a((rs.y.b)object);
        }
    }

    private void i(a a2) {
        ArrayList<rs.y.b> arrayList = new ArrayList<rs.y.b>(this.h.a());
        for (rs.y.b b2 : arrayList) {
            if (b2.c() != a2) continue;
            c.debug("Removing scheduled task {}", (Object)b2);
            this.h.b(b2);
        }
    }

    @com.google.a.a.d
    static <T> List<T> a(O<T> o2) {
        ag ag2 = S.d(o2);
        ArrayList arrayList = new ArrayList();
        Set set = ag2.c().stream().filter(object -> ag2.b(object) == 0).collect(Collectors.toSet());
        while (!set.isEmpty()) {
            Iterator iterator = set.iterator();
            Object t2 = iterator.next();
            iterator.remove();
            arrayList.add(t2);
            for (Object e2 : new HashSet(ag2.f(t2))) {
                ag2.c(t2, e2);
                if (ag2.b(e2) != 0) continue;
                set.add(e2);
            }
        }
        if (!ag2.b().isEmpty()) {
            throw new RuntimeException("Graph has at least one cycle");
        }
        return arrayList;
    }

    public List<a> g(a a2) {
        e e2 = a2.getClass().getAnnotation(e.class);
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(e2.e()));
        hashSet.add(e2.a());
        return this.j.stream().filter(a3 -> {
            if (a3 == a2) {
                return false;
            }
            e e2 = a3.getClass().getAnnotation(e.class);
            if (hashSet.contains(e2.a())) {
                return true;
            }
            for (String string : e2.e()) {
                if (!hashSet.contains(string)) continue;
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public void a(boolean bl) {
        this.a = bl;
    }
}

