/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  com.google.a.d.ag
 *  com.google.c.l
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  lombok.NonNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.e;

import com.google.a.b.as;
import com.google.a.d.ag;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.a.g_0;
import rs.e.a;
import rs.e.b;
import rs.e.c;
import rs.e.d;
import rs.e.e;
import rs.e.f;
import rs.e.g;
import rs.e.h;
import rs.e.l;
import rs.e.m;
import rs.e.o;
import rs.e.q;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.runelite.events.ClientShutdown;
import rs.runelite.events.ConfigChanged;

@Singleton
public class i {
    private static final Logger a = LoggerFactory.getLogger(i.class);
    private final com.google.c.l b;
    private final EventBus c;
    private final c d = new c(new File(rs.v.a.b() + File.separator + "config.properties"));
    private final f e = new f(this);

    @Inject
    public i(EventBus eventBus, com.google.c.l l2) {
        this.c = eventBus;
        this.b = l2;
    }

    public void a() {
    }

    public <T extends b> T a(Class<T> clazz) {
        if (!Modifier.isPublic(clazz.getModifiers())) {
            throw new RuntimeException("Non-public configuration classes can't have default methods invoked");
        }
        b b2 = (b)Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, (InvocationHandler)this.e);
        return (T)b2;
    }

    public String a(String string, String string2) {
        return this.d.a(i.a(string, null, string2));
    }

    public static String a(String string, String string2, String string3) {
        if (string2 == null) {
            return string + "." + string3;
        }
        return string + "." + string2 + "." + string3;
    }

    public <T extends b> void a(T t2, boolean bl) {
        Class<?> clazz = t2.getClass().getInterfaces()[0];
        e e2 = clazz.getAnnotation(e.class);
        if (e2 == null) {
            return;
        }
        for (Method method : clazz.getDeclaredMethods()) {
            Object object;
            g g2 = method.getAnnotation(g.class);
            if (g2 == null || method.getParameterCount() != 0) continue;
            if (!method.isDefault()) {
                if (!bl || (object = this.a(e2.a(), g2.b())) == null) continue;
                this.b(e2.a(), g2.b());
                continue;
            }
            if (!bl && (object = this.a(e2.a(), g2.b(), method.getGenericReturnType())) != null) continue;
            try {
                object = f.a(t2, method, null);
            }
            catch (Throwable throwable) {
                a.warn(null, throwable);
                continue;
            }
            String string = this.a(e2.a(), g2.b());
            String string2 = this.a(object);
            if (Objects.equals(string, string2) || as.c((String)string) && as.c((String)string2)) continue;
            a.debug("Setting default configuration value for {}.{} to {}", new Object[]{e2.a(), g2.b(), object});
            this.b(e2.a(), g2.b(), string2);
        }
    }

    public List<String> a(String string) {
        return this.d.a().stream().filter(string2 -> string2.startsWith(string)).collect(Collectors.toList());
    }

    public <T> void a(String string, String string2, String string3, T t2) {
        this.a(string, string2, string3, this.a(t2));
    }

    public <T> void a(String string, String string2, T t2) {
        this.a(string, null, string2, t2);
    }

    public void b(String string, String string2, String string3) {
        this.a(this.d, string, null, string2, string3);
    }

    public void a(String string, String string2, String string3, @NonNull String string4) {
        if (string4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        this.a(this.d, string, null, string3, string4);
    }

    private void a(c c2, String string, String string2, String string3, @NonNull String string4) {
        if (string4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        if (as.c((String)string) || as.c((String)string3) || string3.indexOf(58) != -1 || string3.startsWith("$")) {
            throw new IllegalArgumentException();
        }
        String string5 = i.a(string, string2, string3);
        String string6 = c2.a(string5, string4);
        if (Objects.equals(string6, string4)) {
            return;
        }
        this.e.a();
        ConfigChanged configChanged = new ConfigChanged();
        configChanged.setGroup(string);
        configChanged.setProfile(string2);
        configChanged.setKey(string3);
        configChanged.setOldValue(string6);
        configChanged.setNewValue(string4);
        this.c.post(configChanged);
    }

    private void a(c c2, String string, String string2, String string3) {
        String string4 = i.a(string, string2, string3);
        String string5 = c2.b(string4);
        if (string5 == null) {
            return;
        }
        this.e.a();
        ConfigChanged configChanged = new ConfigChanged();
        configChanged.setGroup(string);
        configChanged.setProfile(string2);
        configChanged.setKey(string3);
        configChanged.setOldValue(string5);
        this.c.post(configChanged);
    }

    private String b(c c2, String string, String string2, String string3) {
        return c2.a(i.a(string, string2, string3));
    }

    public <T> T a(String string, String string2, Type type) {
        return this.a(string, (String)null, string2, type);
    }

    public String c(String string, String string2, String string3) {
        return this.b(this.d, string, null, string3);
    }

    public <T> T a(String string, String string2, String string3, Type type) {
        String string4 = this.c(string, string2, string3);
        if (!as.c((String)string4)) {
            try {
                return (T)this.a(string4, type);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public void d(String string, String string2, String string3) {
        this.a(this.d, string, null, string3);
    }

    public void b(String string, String string2) {
        this.a(this.d, string, null, string2);
    }

    @Subscribe(priority=-100.0f)
    private void onClientShutdown(ClientShutdown clientShutdown) {
        this.b();
    }

    public void b() {
        this.a(this.d);
    }

    private void a(c c2) {
        Map<String, String> map = c2.c();
        if (map.isEmpty()) {
            return;
        }
        a.debug("Saving profile (patch size: {})", (Object)map.size());
        c2.b(map);
    }

    Object a(String string, Type type) {
        ParameterizedType parameterizedType;
        if (type == Boolean.TYPE || type == Boolean.class) {
            return Boolean.parseBoolean(string);
        }
        if (type == Integer.TYPE || type == Integer.class) {
            return Integer.parseInt(string);
        }
        if (type == Long.TYPE || type == Long.class) {
            return Long.parseLong(string);
        }
        if (type == Double.TYPE || type == Double.class) {
            return Double.parseDouble(string);
        }
        if (type == Color.class) {
            return g_0.c(string);
        }
        if (type == Dimension.class) {
            String[] stringArray = string.split("x");
            int n2 = Integer.parseInt(stringArray[0]);
            int n3 = Integer.parseInt(stringArray[1]);
            return new Dimension(n2, n3);
        }
        if (type == Point.class) {
            String[] stringArray = string.split(":");
            int n4 = Integer.parseInt(stringArray[0]);
            int n5 = Integer.parseInt(stringArray[1]);
            return new Point(n4, n5);
        }
        if (type == Rectangle.class) {
            String[] stringArray = string.split(":");
            int n6 = Integer.parseInt(stringArray[0]);
            int n7 = Integer.parseInt(stringArray[1]);
            int n8 = Integer.parseInt(stringArray[2]);
            int n9 = Integer.parseInt(stringArray[3]);
            return new Rectangle(n6, n7, n8, n9);
        }
        if (type instanceof Class && ((Class)type).isEnum()) {
            return Enum.valueOf((Class)type, string);
        }
        if (type == Instant.class) {
            return Instant.parse(string);
        }
        if (type == rs.s.b.l.class || type == rs.s.b.m.class) {
            String[] stringArray = string.split(":");
            int n10 = Integer.parseInt(stringArray[0]);
            int n11 = Integer.parseInt(stringArray[1]);
            if (type == rs.s.b.m.class) {
                return new rs.s.b.m(n10, n11);
            }
            return new rs.s.b.l(n10, n11);
        }
        if (type == Duration.class) {
            return Duration.ofMillis(Long.parseLong(string));
        }
        if (type == byte[].class) {
            return Base64.getUrlDecoder().decode(string);
        }
        if (type instanceof ParameterizedType && (parameterizedType = (ParameterizedType)type).getRawType() == Set.class) {
            return this.b.a(string, (Type)parameterizedType);
        }
        return string;
    }

    public d a(b b2) {
        Class<?> clazz = b2.getClass().getInterfaces()[0];
        e e2 = clazz.getAnnotation(e.class);
        if (e2 == null) {
            throw new IllegalArgumentException("Not a config group");
        }
        List<m> list = Arrays.stream(clazz.getDeclaredFields()).filter(field -> field.isAnnotationPresent(l.class) && field.getType() == String.class).map(field -> {
            try {
                return new m(String.valueOf(field.get(clazz)), field.getDeclaredAnnotation(l.class));
            }
            catch (IllegalAccessException illegalAccessException) {
                a.warn("Unable to load section {}::{}", (Object)clazz.getSimpleName(), (Object)field.getName());
                return null;
            }
        }).filter(Objects::nonNull).sorted((m2, m3) -> ag.a().a(m2.e().c(), m3.e().c()).a((Comparable)((Object)m2.e().a()), (Comparable)((Object)m3.e().a())).b()).collect(Collectors.toList());
        List<h> list2 = Arrays.stream(clazz.getMethods()).filter(method -> method.getParameterCount() == 0 && method.isAnnotationPresent(g.class)).map(method -> new h(method.getDeclaredAnnotation(g.class), method.getGenericReturnType(), method.getDeclaredAnnotation(o.class), method.getDeclaredAnnotation(a.class), method.getDeclaredAnnotation(q.class))).sorted((h2, h3) -> ag.a().a(h2.d().a(), h3.d().a()).a((Comparable)((Object)h2.d().c()), (Comparable)((Object)h3.d().c())).b()).collect(Collectors.toList());
        return new d(e2, list, list2);
    }

    @Nullable
    String a(Object object) {
        if (object instanceof Color) {
            return String.valueOf(((Color)object).getRGB());
        }
        if (object instanceof Enum) {
            return ((Enum)object).name();
        }
        if (object instanceof Dimension) {
            Dimension dimension = (Dimension)object;
            return dimension.width + "x" + dimension.height;
        }
        if (object instanceof Point) {
            Point point = (Point)object;
            return point.x + ":" + point.y;
        }
        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle)object;
            return rectangle.x + ":" + rectangle.y + ":" + rectangle.width + ":" + rectangle.height;
        }
        if (object instanceof Instant) {
            return ((Instant)object).toString();
        }
        if (object instanceof rs.s.b.l) {
            rs.s.b.l l2 = (rs.s.b.l)object;
            return l2.a() + ":" + l2.b();
        }
        if (object instanceof Duration) {
            return Long.toString(((Duration)object).toMillis());
        }
        if (object instanceof byte[]) {
            return Base64.getUrlEncoder().encodeToString((byte[])object);
        }
        if (object instanceof Set) {
            return this.b.b(object, Set.class);
        }
        return object == null ? null : object.toString();
    }
}

