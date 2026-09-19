/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 */
package rs.j.b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.gui.Launcher;
import rs.h.b;
import rs.j.b.a;

@Singleton
public class d {
    private static final String a = "Choose Sub-Option";
    private static final Map<Integer, b> b = new HashMap<Integer, b>();
    private static final Map<Integer, a> c = new HashMap<Integer, a>();
    private final Client d;
    private a e;

    @Inject
    public d(Client client) {
        this.d = client;
    }

    public void a(int n2) {
        if (b.get(n2) != null) {
            b.get(n2).invoke();
        }
        b.clear();
    }

    public a a(String string, int n2) {
        a a2 = new a(string, n2);
        if (this.d.fx[n2] != null) {
            this.d.fx[n2] = this.d.fx[n2] + " <img=46>";
        }
        c.put(n2, a2);
        return a2;
    }

    public a b(int n2) {
        return this.a(a, n2);
    }

    public void a() {
        this.e = null;
        c.clear();
        b.clear();
    }

    public boolean b() {
        return this.e != null;
    }

    public void c(int n2) {
        if (this.e != null && this.e.a()) {
            return;
        }
        this.e = c.get(n2) != null ? c.get(n2) : null;
    }

    public static void a(int n2, int n3) {
        Client client = Launcher.n().o();
        String string = client.fx[n2];
        int n4 = client.eJ[n2];
        int n5 = client.eF[n2];
        int n6 = client.eG[n2];
        int n7 = client.eH[n2];
        int n8 = client.eI[n2];
        b b2 = b.remove(n2);
        String string2 = client.fx[n3];
        int n9 = client.eJ[n3];
        int n10 = client.eF[n3];
        int n11 = client.eG[n3];
        int n12 = client.eH[n3];
        int n13 = client.eI[n3];
        b b3 = b.remove(n3);
        client.fx[n2] = string2;
        client.eJ[n2] = n9;
        client.eF[n2] = n10;
        client.eG[n2] = n11;
        client.eH[n2] = n12;
        client.eI[n2] = n13;
        b.put(n2, b3);
        client.fx[n3] = string;
        client.eJ[n3] = n4;
        client.eF[n3] = n5;
        client.eG[n3] = n6;
        client.eH[n3] = n7;
        client.eI[n3] = n8;
        b.put(n3, b2);
    }

    public int a(String string, b b2) {
        return this.a(this.d.eV, string, b2);
    }

    public int b(String string, b b2) {
        return this.a(this.d.eV - 1, string, b2);
    }

    public int c(String string, b b2) {
        return this.a(1, string, b2);
    }

    private int a(int n2, String string, b b2) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > this.d.eV - 1) {
            n2 = this.d.eV - 1;
        }
        if (this.d.eV > n2) {
            for (int i2 = this.d.eV; i2 >= n2; --i2) {
                this.d.fx[i2 + 1] = this.d.fx[i2];
                this.d.eI[i2 + 1] = this.d.eI[i2];
                this.d.eJ[i2 + 1] = this.d.eJ[i2];
                this.d.eF[i2 + 1] = this.d.eF[i2];
                this.d.eG[i2 + 1] = this.d.eG[i2];
                this.d.eH[i2 + 1] = this.d.eH[i2];
                if (b.get(i2) != null) {
                    b b3 = b.remove(i2);
                    b.put(i2 + 1, b3);
                    this.d.eJ[i2 + 1] = i2 + 1;
                }
                if (c.get(i2) == null) continue;
                c.put(i2 + 1, c.remove(i2));
                c.get(i2 + 1).a(i2 + 1);
                this.d.eJ[i2 + 1] = i2 + 1;
            }
        }
        this.d.fx[n2] = string;
        this.d.eI[n2] = 1924;
        this.d.eJ[n2] = n2;
        b.put(n2, b2);
        ++this.d.eV;
        this.d.dJ += 15;
        if (this.d.dI < this.d.gm.a(string, false) + 8) {
            this.d.dI = this.d.gm.a(string, false) + 8;
        }
        return n2;
    }

    public a c() {
        return this.e;
    }
}

