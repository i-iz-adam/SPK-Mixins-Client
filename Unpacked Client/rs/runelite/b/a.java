/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 */
package rs.runelite.b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Singleton;

@Singleton
public class a {
    private static final List<a> a = new CopyOnWriteArrayList<a>();
    private static final List<a> b = new CopyOnWriteArrayList<a>();

    public static List<a> a() {
        return a;
    }

    public static List<a> b() {
        return b;
    }

    @FunctionalInterface
    public static interface a {
        public boolean draw(rs.a.a var1, boolean var2);
    }
}

