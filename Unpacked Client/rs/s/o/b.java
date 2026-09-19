/*
 * Decompiled with CFR 0.152.
 */
package rs.s.o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rs.a.j;
import rs.runelite.a.p;

class b {
    private int a;
    private String b;
    private int c;
    private int d;
    private int e;
    private List<p> f;

    b(j j2) {
        this.b = j2.aG.o;
        Objects.requireNonNull(j2);
        this.a = -1;
        this.f = new ArrayList<p>(2);
        this.e = -1;
        this.d = -1;
        if (j2.aG != null) {
            this.c = j2.aG.r;
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public int e() {
        return this.e;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public List<p> f() {
        return this.f;
    }

    public void a(List<p> list) {
        this.f = list;
    }
}

