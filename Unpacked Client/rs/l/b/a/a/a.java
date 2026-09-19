/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.l.b.a.d;

public abstract class a {
    private static int t = 10;
    protected boolean a;
    protected int b = 6208;
    protected int c = 6208;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected rs.d.a g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected boolean n;
    protected boolean o = true;
    protected Map<Integer, Boolean> p = new HashMap<Integer, Boolean>();
    protected Map<Integer, Boolean> q = new HashMap<Integer, Boolean>();
    protected int r;
    protected List<Integer> s = new ArrayList<Integer>();

    public a() {
        this.f = ++t;
    }

    public void a() {
        if (!this.a) {
            this.b();
            this.a = true;
        }
        try {
            this.c();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.g != null) {
            ++this.j;
            if (this.i < this.g.d && this.j > this.g.a(this.i)) {
                this.j = 1;
                ++this.i;
            }
            if (this.i >= this.g.d) {
                this.j = 1;
                this.i = 0;
            }
        }
    }

    protected abstract void b();

    protected abstract void c();

    public void a(int n2) {
        this.b = n2;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public void c(int n2) {
        rs.l.b.a.d.b.f.g(this.b, n2, this.c);
        this.k = rs.l.b.a.d.b.f.dN;
        this.l = rs.l.b.a.d.b.f.dO;
    }

    public void d(int n2) {
        if (n2 == -1) {
            n2 = 0;
        }
        this.h = n2;
        this.g = rs.d.a.a[this.h];
        this.i = 0;
        this.j = 0;
    }

    public void f() {
        if (this.q.size() > 0) {
            System.out.println();
            System.out.print("Default color map: \t");
            for (Integer n3 : this.q.keySet()) {
                System.out.print(n3 + ",");
            }
            System.out.println();
        }
        if (this.p.size() > 0) {
            System.out.print("Final color map: \t");
            for (Integer n3 : this.p.keySet()) {
                System.out.print(n3 + ",");
            }
            System.out.println();
            System.out.println("Selected colors: \t" + Arrays.toString(this.s.stream().mapToInt(n2 -> n2).toArray()).replaceAll(" ", ""));
        }
    }

    public int g() {
        return this.m;
    }

    public void e(int n2) {
        this.m = n2;
    }

    public boolean h() {
        return this.n;
    }

    public void a(boolean bl) {
        this.n = bl;
        this.s.clear();
    }

    public Map<Integer, Boolean> i() {
        return this.p;
    }

    public Map<Integer, Boolean> j() {
        return this.q;
    }

    public List<Integer> k() {
        return this.s;
    }

    public boolean l() {
        return this.o;
    }

    public int m() {
        return this.r;
    }

    public void f(int n2) {
        this.r = n2;
    }
}

