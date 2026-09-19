/*
 * Decompiled with CFR 0.152.
 */
package rs.r;

import java.util.Random;
import rs.m_0;
import rs.r.C;
import rs.r.a_0;
import rs.r.b_0;
import rs.r.d;
import rs.r.d_0;
import rs.r.e;
import rs.r.e_0;
import rs.r.f;
import rs.r.f_0;
import rs.r.g;
import rs.r.g_0;
import rs.r.h;
import rs.r.h_0;
import rs.r.i;
import rs.r.i_0;
import rs.r.j;
import rs.r.k;
import rs.r.l;
import rs.r.m;
import rs.r.n;
import rs.r.o;
import rs.r.p;
import rs.r.q;
import rs.r.r;
import rs.r.s;
import rs.r.t;
import rs.r.u;
import rs.r.v;
import rs.r.w;
import rs.r.x;
import rs.r.y;
import rs.r.z;
import rs.r_0;

/*
 * Renamed from rs.r.c
 */
public class c_0 {
    public static int a = 0;
    public static final Random b = new Random(System.currentTimeMillis());
    public static c_0[] c = new c_0[]{new d(), new o(), new z(), new d_0(), new e_0(), new f_0(), new g_0(), new h_0(), new i_0(), new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m(), new n(), new p(), new q(), new r(), new s(), new t(), new u(), new v(), new w(), new x(), new y(), new a_0(), new b_0(), new C()};
    private float d = 1.0f;
    private float e = 1.0f;
    private int f = -1;
    private int g = -1;
    private r_0 h = r_0.a;
    private r_0 i = r_0.a;
    private int j = 1;
    private static int k = 10000;
    private int l = 1;
    private int m;
    private rs.l.f_0 n;
    private boolean o = false;
    private float p = 1.0f;
    private float q = 0.05f;
    private r_0 r;
    private m_0 s = new rs.a_0(r_0.a);
    private int t;
    private r_0 u;
    private int v;
    private float w;
    private float x;

    public r_0 a() {
        if (this.t == 31 && this.a(1, 3) == 1) {
            return new r_0(0, 0, 0);
        }
        return this.r;
    }

    public void a(r_0 r_02) {
        this.r = r_02;
    }

    public int b() {
        return this.m;
    }

    public void a(int n2) {
        this.m = n2;
    }

    public float c() {
        return this.p;
    }

    public void a(float f2) {
        this.p = f2;
    }

    public float d() {
        return this.q;
    }

    public void b(float f2) {
        this.q = f2;
    }

    public float e() {
        return this.x;
    }

    public void c(float f2) {
        this.x = f2;
    }

    public rs.l.f_0 f() {
        return this.n;
    }

    public void a(rs.l.f_0 f_02) {
        this.n = f_02;
    }

    public m_0 g() {
        return this.s;
    }

    public void a(m_0 m_02) {
        this.s = m_02;
    }

    public int a(int n2, int n3) {
        int n4 = n3 - n2 + 1;
        return (int)(Math.random() * (double)n4) + n2;
    }

    public int h() {
        return this.l;
    }

    public void b(int n2) {
        this.l = n2;
    }

    public static int i() {
        return k;
    }

    public void c(int n2) {
        k = n2;
    }

    public float j() {
        return this.d;
    }

    public void d(float f2) {
        this.d = f2;
    }

    public float k() {
        return this.e;
    }

    public void e(float f2) {
        this.e = f2;
    }

    public int l() {
        return this.f;
    }

    public void d(int n2) {
        this.f = n2;
    }

    public int m() {
        return this.g;
    }

    public void e(int n2) {
        this.g = n2;
    }

    public r_0 n() {
        return this.h;
    }

    public r_0 f(int n2) {
        switch (n2) {
            default: 
        }
        return new r_0(this.h.a() + this.a(-1, 1), this.h.b() + this.a(0, 1), this.h.c() + this.a(-1, 1));
    }

    public void g(int n2) {
        this.t = n2;
    }

    public void b(r_0 r_02) {
        this.h = r_02;
    }

    public r_0 o() {
        return this.i;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public boolean p() {
        return this.o;
    }

    public void c(r_0 r_02) {
        this.i = r_02;
    }

    public int q() {
        return this.j;
    }

    public void h(int n2) {
        this.j = n2;
    }

    public void d(r_0 r_02) {
        this.u = r_02;
    }

    public void i(int n2) {
        this.v = n2;
    }

    public void f(float f2) {
        this.w = f2;
    }

    public float r() {
        return this.w;
    }

    public r_0 s() {
        return this.u;
    }

    public int t() {
        return this.v;
    }

    public void u() {
        this.w = (this.e - this.d) / ((float)this.j * 1.0f);
        this.v = (this.g - this.f) / this.j;
        this.u = this.h.a() != 0 || this.h.b() != 0 || this.h.c() != 0 ? this.i.a(this.h).a(this.j) : new r_0(0, 0, 0);
        this.x = (this.q - this.p) / (float)this.j;
    }

    public void v() {
        this.w = (this.e - this.d) / ((float)this.j * 1.0f);
        this.v = (this.g - this.f) / this.j;
        this.u = this.i.a(this.h).a(this.j);
    }

    public int w() {
        return this.t;
    }
}

