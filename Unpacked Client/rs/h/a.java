/*
 * Decompiled with CFR 0.152.
 */
package rs.h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.h.b;
import rs.h.e;

public class a {
    private static final CopyOnWriteArrayList<b> a = new CopyOnWriteArrayList();
    private static final ConcurrentHashMap<String, b> b = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, e> c = new ConcurrentHashMap();

    public static void a(b b2) {
        a.add(b2);
    }

    public static void a(String string, b b2) {
        b.put(string, b2);
    }

    public static void a(String string, e e2) {
        c.put(string, e2);
    }

    public static boolean a(String string) {
        return c.containsKey(string);
    }

    public static void a() {
        if (!a.isEmpty()) {
            for (b object : a) {
                object.invoke();
            }
            a.clear();
        }
        if (!c.isEmpty()) {
            Iterator<b> iterator = new ArrayList();
            for (String string : c.keySet()) {
                e e2 = c.get(string);
                if (e2.loop()) continue;
                iterator.add((b)((Object)string));
            }
            Iterator iterator2 = iterator.iterator();
            while (iterator2.hasNext()) {
                String string;
                string = (String)iterator2.next();
                c.remove(string);
            }
        }
        if (!b.isEmpty()) {
            for (b b2 : b.values()) {
                b2.invoke();
            }
            b.clear();
        }
    }
}

