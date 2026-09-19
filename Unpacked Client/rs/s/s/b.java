/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.s;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.Client;
import rs.a.c;
import rs.a.j;
import rs.a.k;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.q_0;
import rs.runelite.a.g;
import rs.runelite.events.ConfigChanged;
import rs.s.e;
import rs.s.s.a;

@e(a="Hover Descriptions", b="hoverdesc", i=true)
public class b
extends rs.s.a {
    @Inject
    private a s;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int p;
    public static int q;
    public static int r;
    private static final rs.l.f.a.j.a t;

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    @Override
    public void a() {
        b = true;
        this.g();
    }

    @Override
    public void b() {
        b = false;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        rs.h.c.a(this::g);
    }

    private void g() {
        p = this.s.a().getRGB();
        q = this.s.b().getRGB();
        r = this.s.c().getRGB();
        c = this.s.d();
        d = this.s.e();
        e = this.s.l();
        i = this.s.f();
        f = this.s.g();
        g = this.s.h();
        h = this.s.i();
        j = this.s.j();
        k = this.s.k();
        l = this.s.m();
        n = this.s.o();
        m = this.s.n();
        o = this.s.p();
    }

    public static void f() {
        int n2;
        int n3;
        int n4;
        q_0 q_02;
        c c2;
        int n5;
        int n6;
        int n7;
        Client client;
        block15: {
            block17: {
                block16: {
                    boolean bl;
                    if (Client.dj || Client.cH > 0) {
                        return;
                    }
                    client = Launcher.n().o();
                    n7 = client.eV - 1;
                    if (n7 < 0) {
                        return;
                    }
                    n6 = client.eI[n7];
                    if (client.fx[n7] == null) {
                        return;
                    }
                    boolean bl2 = bl = Client.ed == 197;
                    if (e && bl) {
                        return;
                    }
                    if (!l || !rs.runelite.a.g.b(n6)) break block15;
                    n5 = client.eJ[n7];
                    if (n5 < 0) break block16;
                    if (n5 < Client.do.length) break block17;
                }
                return;
            }
            c2 = Client.do[n5];
            if (c2 == null || ((k)c2).o() == null) {
                return;
            }
            t.a(client.fx[n7]);
            t.a(false);
            rs.l.f.e.d().f().a(t);
        }
        if (rs.runelite.a.g.a(n6)) {
            n5 = client.eJ[n7];
            if (n5 < 0 || n5 >= client.cA.length) {
                return;
            }
            c2 = client.cA[n5];
            if (c2 == null || ((j)c2).aG == null) {
                return;
            }
            if (m || ((j)c2).aG.Y) {
                String string;
                if (((j)c2).aG.X != null) {
                    string = ((j)c2).aG.X;
                    t.a(((j)c2).aG.Z);
                } else {
                    string = client.fx[n7];
                    t.a(false);
                }
                t.a(string);
                rs.l.f.e.d().f().a(t);
            }
        }
        if (n && rs.runelite.a.g.c(n6) && (q_02 = client.a(n4 = client.eF[n7], n3 = client.eG[n7], n2 = Client.dw, n5 = client.eJ[n7])) != null) {
            t.a(client.fx[n7]);
            t.a(false);
            rs.l.f.e.d().f().a(t);
        }
    }

    static {
        t = new rs.l.f.a.j.a("", false);
    }
}

