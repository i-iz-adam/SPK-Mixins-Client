/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a.a;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.n.a.a.c;
import rs.n.a.a.d;
import rs.n.a.f;
import rs.n.e;

public class a
extends e {
    public static final int a = 42;
    private rs.n.d.c b;
    private List<d> c;
    private int d;
    private int e = 0;
    private int f = 16750623;
    private boolean g = true;
    private int bI;
    private int bJ;
    private int bK;

    public static a a(int n2, String ... stringArray) {
        a a2 = new a(n2);
        a2.c = new ArrayList<d>();
        for (String string : stringArray) {
            a2.c.add(new d(string, "Select"));
        }
        a2.at = stringArray[0];
        return a2;
    }

    private a(int n2) {
        this.Q = "Select";
        this.aI = 42;
        this.J = 0;
        this.M = 1;
        this.ab = -1;
        this.L = 0xFFFFFF;
        this.aw = n2;
        this.P = 120;
        this.aR = 21;
        this.bI = this.aR + 90;
        this.ao = rs.n.a.f.a[0];
        this.S = true;
        this.aS = true;
        this.a();
        rs.n.a.a.a.H[n2] = this;
    }

    public void a(int n2) {
        int n3 = n2 - 32432;
        if (n3 < 0 || n3 >= this.h()) {
            return;
        }
        this.d = n3;
        this.at = this.c.get(n3).a();
        if (Client.cI > 0) {
            rs.n.a.a.c.b();
        }
    }

    public a g(int n2, int n3) {
        this.ad = n2;
        this.f = n3;
        return this;
    }

    public a h(int n2, int n3) {
        this.P = n2;
        this.bJ = n3;
        if (n3 > 0) {
            this.bI = n3;
        }
        return this;
    }

    public a a() {
        this.e = 0;
        this.ao = rs.n.a.f.a[this.e];
        return this;
    }

    public a b() {
        this.e = 1;
        this.ao = rs.n.a.f.a[this.e];
        return this;
    }

    public a c() {
        this.e = 2;
        this.ao = rs.n.a.f.a[this.e];
        return this;
    }

    public a m(int n2) {
        this.P = n2;
        return this;
    }

    public int h() {
        return this.c.size();
    }

    public List<d> i() {
        return this.c;
    }

    public void a(List<d> list) {
        this.c = list;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return this.g;
    }

    public int n() {
        return this.bI;
    }

    public void n(int n2) {
        this.bI = n2;
    }

    public int o() {
        return this.bJ;
    }

    public int p() {
        return this.bK;
    }

    public void o(int n2) {
        this.bK = n2;
    }
}

