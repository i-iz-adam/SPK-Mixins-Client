/*
 * Decompiled with CFR 0.152.
 */
package rs.h;

import java.awt.event.KeyEvent;
import rs.Client;
import rs.n.c.h;

public class d {
    private int a;
    private String b;
    private Client c;
    private boolean d;

    public d(Client client) {
        this.c = client;
    }

    public void a(KeyEvent keyEvent) {
        boolean bl;
        this.a = this.c.gp;
        int n2 = Client.cH;
        int n3 = keyEvent.getKeyCode();
        boolean bl2 = keyEvent.isControlDown();
        boolean bl3 = bl = n2 == 23000;
        if (this.e()) {
            if (n3 == 77) {
                this.a("::tm");
            }
            if (!this.c() && n3 == 72) {
                this.a("::home");
            }
            if (!this.c() && n3 == 84) {
                this.a("::opentp");
            }
            if (n3 == 76 && !this.d()) {
                this.a("::loot");
            }
            if (n3 == 66 && !bl) {
                this.a("::bank");
            }
            if (!(n3 != 67 || this.c() || this.d() || bl)) {
                this.a("::clogs");
            }
            if (n3 == 69 && !this.c() && !this.d()) {
                this.a("::e");
            }
            if (n3 == 83 && !bl) {
                Client.fL = 13;
                Client.fb = true;
                Client.fM = true;
                this.c.gb = false;
                this.c.fN = 3;
                this.c.dY = "";
            }
        }
    }

    public void b(KeyEvent keyEvent) {
        this.a = this.c.gp;
        int n2 = Client.cH;
        int n3 = keyEvent.getKeyCode();
        if (n2 == 23000 && !this.c()) {
            if (this.e() && n3 == 83) {
                h.a(this.c);
                return;
            }
            if (this.e() && n3 == 68) {
                this.a(38976);
                this.a(26012);
                this.a(26016);
                return;
            }
            if (this.e() && n3 == 82) {
                this.a(5294);
                return;
            }
            if (this.e() && n3 == 67) {
                this.a(38980);
                return;
            }
        }
    }

    public void a(String string) {
        this.b = string;
    }

    public void a(int n2) {
        Client.fv.a(185);
        Client.fv.d(n2);
    }

    public void a() {
        if (this.b == null) {
            return;
        }
        this.b(this.b);
        this.b = null;
    }

    private void b(String string) {
        Client.fv.a(103);
        Client.fv.b(string.length() - 1);
        Client.fv.a(string.substring(2));
    }

    private boolean c() {
        return this.a > 0;
    }

    private boolean d() {
        return Client.cH > 0;
    }

    private boolean e() {
        return Client.ch || System.currentTimeMillis() - Client.ci < 100L;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

