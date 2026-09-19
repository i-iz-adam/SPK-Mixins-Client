/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.CreationException
 *  com.google.inject.Injector
 *  com.google.inject.Module
 */
package rs.q.a.a;

import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.l.e.a.v;
import rs.n.c.a_0;
import rs.n.c.ag;
import rs.n.c.am_0;
import rs.n.c.ao_0;
import rs.n.c.aq;
import rs.n.c.aw;
import rs.n.c.j_0;
import rs.n.c.o_0;
import rs.n.c.v_0;
import rs.q.a.a.a.a;
import rs.q.a.a.a.c;
import rs.q.a.a.a.d;
import rs.q.a.a.a.e;
import rs.q.a.a.a.f;
import rs.q.a.a.a.g;
import rs.q.a.a.a.h;
import rs.q.a.a.a.i;
import rs.q.a.a.a.j;
import rs.q.a.a.a.k;
import rs.q.a.a.a.l;
import rs.q.a.a.a.m;
import rs.q.a.a.a.n;
import rs.q.a.a.a.o;
import rs.q.a.a.a.p;

public class b {
    public static final Map<Integer, rs.q.a.a.a> a = new HashMap<Integer, rs.q.a.a.a>();

    public static void a() {
        b.a(1, d.class);
        b.a(2, k.class);
        b.a(3, l.class);
        b.a(4, rs.l.e.a.h.D.getClass());
        b.a(5, n.class);
        b.a(6, j_0.c.getClass());
        b.a(7, rs.l.f.a.c.b.class);
        b.a(8, rs.l.e.a.c.v.getClass());
        b.a(9, ag.e.getClass());
        b.a(10, rs.n.c.b.d.class);
        b.a(11, rs.l.e.a.a.w.getClass());
        b.a(12, rs.l.e.o.a.getClass());
        b.a(13, o_0.c.getClass());
        b.a(14, h.class);
        b.a(15, v_0.bI.getClass());
        b.a(16, am_0.c.getClass());
        b.a(17, ao_0.g.getClass());
        b.a(18, v.w.getClass());
        b.a(19, p.class);
        b.a(20, rs.q.b.d.b.getClass());
        b.a(21, c.class);
        b.a(22, rs.n.c.c.bL.getClass());
        b.a(23, rs.l.f.a.a.d.class);
        b.a(24, rs.l.f.a.i.d.class);
        b.a(25, rs.l.e.a.f.s.getClass());
        b.a(26, rs.l.e.a.k.p.getClass());
        b.a(27, rs.l.f.a.h.b.class);
        b.a(28, a_0.c.getClass());
        b.a(29, m.class);
        b.a(30, rs.s.t.i.b.getClass());
        b.a(31, rs.n.c.c.e.class);
        b.a(32, a.class);
        b.a(33, rs.n.c.a.a.e.getClass());
        b.a(34, e.class);
        b.a(35, aq.f.getClass());
        b.a(36, aw.d.getClass());
        b.a(37, f.class);
        b.a(38, o.class);
        b.a(39, g.class);
        b.a(40, rs.q.a.a.a.b.class);
        b.a(41, rs.n.c.d.d.class);
        b.a(42, i.class);
        b.a(43, j.class);
    }

    private static void a(Integer n2, Class<? extends rs.q.a.a.a> clazz) {
        if (a.get(n2) != null) {
            throw new RuntimeException("ScriptPacket ID " + n2 + " already in use!");
        }
        Class<? extends rs.q.a.a.a> clazz2 = clazz;
        try {
            Injector injector;
            rs.q.a.a.a a2;
            Module module;
            Injector injector2 = rs.p.a.c();
            try {
                module = clazz2.getDeclaredConstructor(new Class[0]);
                module.setAccessible(true);
                a2 = module.newInstance(new Object[0]);
            }
            catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
            module = binder -> {
                binder.bind(clazz2).toInstance((Object)a2);
                binder.install((Module)a2);
            };
            a2.a = injector = injector2.createChildInjector(new Module[]{module});
            a.put(n2, a2);
        }
        catch (CreationException creationException) {
            throw new RuntimeException(creationException);
        }
    }

    public static void a(Client client, rs.x.e e2, int n2) {
        rs.q.a.a.a a2 = a.get(n2);
        if (a2 == null) {
            System.out.println("Could not find ScriptPacket ID " + n2 + "!");
            return;
        }
        a2.a(e2);
        a2.a(client);
        a2.a();
    }
}

