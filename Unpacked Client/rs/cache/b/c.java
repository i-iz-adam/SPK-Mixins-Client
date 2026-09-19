/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.cache.b.a.a;
import rs.cache.b.a.d;
import rs.cache.b.b;
import rs.gui.Launcher;
import rs.l.h;

public class c {
    private final rs.cache.b.d a = new a();
    private final rs.cache.b.d b = new d();
    private final rs.cache.b.d c = new rs.cache.b.a.c();
    private final List<rs.cache.b.d> d = new ArrayList<rs.cache.b.d>();
    private Client e;

    public c(Client client) {
        this.e = client;
        this.d.add(this.a);
        this.d.add(this.b);
        this.d.add(this.c);
        for (rs.cache.b.d d2 : this.d) {
            d2.a(client);
        }
    }

    public boolean a() {
        this.e.G = new rs.l.d.c(this.e);
        Client.gl = new h(false, "assets/", "assets/p11_full");
        this.e.gm = new h(false, "assets/", "assets/p12_full");
        this.e.a(0, "Please wait, checking assets..");
        Thread thread = new Thread(this.e.G);
        thread.start();
        if (!this.a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            this.b(this.b);
            return false;
        }
        this.e.cf = true;
        if (Launcher.n() != null) {
            // empty if block
        }
        if (!this.a(this.a)) {
            this.a.c().add(0, "Error with the cache updater!");
            this.b(this.a);
            return false;
        }
        if (!this.a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            this.b(this.b);
            return false;
        }
        if (!this.a(this.c)) {
            this.c.c().add(0, "Error with configuration updater!");
            this.b(this.c);
            return false;
        }
        return true;
    }

    public boolean b() {
        for (rs.cache.b.d d2 : this.d) {
            if (d2.b().c() == d2.b().b()) continue;
            return true;
        }
        return false;
    }

    public boolean a(rs.cache.b.d d2) {
        double d3 = d2.b().c();
        double d4 = d2.b().b();
        if (d4 == -1.0) {
            d2.a(rs.cache.b.b.a);
            return false;
        }
        if (d3 != d4) {
            System.out.println("Updating outdated game asset: " + d2.d());
            if (d2.a()) {
                return d2.b().a();
            }
        } else {
            return true;
        }
        return false;
    }

    public void b(rs.cache.b.d d2) {
        for (String string : d2.c()) {
            System.out.println(string);
        }
    }

    public rs.cache.b.d c() {
        return this.a;
    }

    public rs.cache.b.d d() {
        return this.b;
    }

    public rs.cache.b.d e() {
        return this.c;
    }
}

