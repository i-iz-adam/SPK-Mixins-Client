/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.e.a.d;
import rs.l.e.f;
import rs.q.a.a.a;

public class c
extends f {
    public static boolean p = false;
    public static final int q = 140;
    public static final int r = 160;
    public static final int s = 88;
    public static final int t = 5918522;
    public static final int u = 2367511;
    private static final String w = "Correct F3:";
    private static final String x = "Magic:";
    private static final String y = "Damage:";
    public static a v = new d();
    private static String z;
    private static String A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static String F;
    private static String G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static String L;
    private static String M;
    private static int N;
    private static int O;
    private static String P;
    private static String Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;
    private static String V;
    private static String W;
    private static String X;
    private static String Y;
    private static boolean Z;
    private static boolean aa;
    private static boolean ab;

    @Override
    public void b() {
        rs.l.e.a.c.g();
        p = true;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 == f.a.b) {
            return;
        }
        int n2 = 1;
        int n3 = 1;
        int n4 = 350;
        int n5 = 1;
        if (rs.f.a.ai == a.c.b) {
            n2 = 10;
            n4 = Client.aj - 400;
            n5 = 5;
            n3 = 5;
        } else {
            n2 += 4;
            n3 += 4;
            n4 += 4;
            n5 += 4;
        }
        this.a(n2, n3, z, B, C, F, L, P, V, X);
        this.a(n4, n5, A, D, E, G, M, Q, W, Y);
    }

    @Override
    public void c() {
    }

    @Override
    public boolean a(Client client) {
        return rs.l.e.a.c.f();
    }

    public void a(int n2, int n3, String string, int n4, int n5, String string2, String string3, String string4, String string5, String string6) {
        int n6;
        int n7 = 88;
        if (!Z) {
            n7 -= 17;
        }
        if (!aa) {
            n7 -= 17;
        }
        if (!ab) {
            n7 -= 17;
        }
        rs.l.c.b(n7, n3, n2, 5918522, 160, 140);
        rs.l.c.b(n7 - 4, n3 + 2, n2 + 2, 2367511, 156, 140);
        int n8 = n3 + 18;
        int n9 = 156;
        int n10 = 15;
        int n11 = n2 + 2 + (160 - n9) / 2;
        rs.l.c.b(n10 + 2, n8 - 1, n11 - 1, 0, n9 - 4 + 2, 90);
        rs.l.c.b(n10, n8, n11, 13960709, n9 - 4, 150);
        rs.l.c.b(n10, n8, n11, 30976, this.a(n4, n5, n9), 255);
        Client.fE[80].f(n11, n8 - 17);
        Client.gl.b(string, n11 + 15, n8 - 3, 16750623, 0);
        Client.gl.c(string2, n11 + n9 / 2, n8 + 12, 0xFFFFFF, 0);
        int n12 = 83;
        int n13 = 32;
        n8 += 29;
        if (aa) {
            n6 = n2 + 5;
            rs.l.c.b(15, n8 - 12, n2 + 3, 65401, 154, 62);
            Client.fE[85].f(n6 + 1, n8 - 12);
            Client.gl.b(w, n6 + 19, n8, 0xFFFFFF, 0);
            Client.gl.b(string3, n6 + 83 - 6, n8, 65401, 0);
            n8 += n10 + 2;
        }
        if (ab) {
            n6 = n2 + 5;
            rs.l.c.b(15, n8 - 12, n2 + 3, 47103, 154, 62);
            Client.fE[55].f(n6, n8 - 11);
            Client.gl.b(x, n6 + 19, n8, 0xFFFFFF, 0);
            Client.gl.b(string5, n6 + 83 - 30, n8, 47103, 0);
            Client.gl.a(string6, n6 + 83 + 68, n8, 12171349, 0);
            n8 += n10 + 2;
        }
        if (Z) {
            n6 = n2 + 5;
            rs.l.c.b(15, n8 - 12, n2 + 3, 16750623, 154, 62);
            Client.fE[53].f(n6, n8 - 11);
            Client.gl.b(y, n6 + 19, n8, 0xFFFFFF, 0);
            Client.gl.b(string4, n6 + 83 - 20, n8, 16750623, 0);
        }
    }

    public void a(boolean bl) {
        p = bl;
    }

    public static boolean f() {
        return p && rs.f.a.bk;
    }

    public static void g() {
        A = "N/A";
        z = "N/A";
        E = 0;
        D = 0;
        C = 0;
        B = 0;
        G = "0 / 0";
        F = "0 / 0";
        J = 0;
        H = 0;
        K = 0;
        I = 0;
        M = "0/0 (0%)";
        L = "0/0 (0%)";
        O = 0;
        N = 0;
        Q = "0 (0)";
        P = "0 (0)";
        T = 0;
        R = 0;
        U = 0;
        S = 0;
        W = "0/0 (0%)";
        V = "0/0 (0%)";
        Y = "[0%]";
        X = "[0%]";
    }

    private int a(int n2, int n3, int n4) {
        int n5 = (int)((float)(n4 - 4) * ((float)n2 / (float)n3));
        if (n2 > 0 && n5 <= 0) {
            n5 = 1;
        }
        if (n5 > n4 - 4) {
            n5 = n4 - 4;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        return n5;
    }

    static /* synthetic */ boolean b(boolean bl) {
        aa = bl;
        return aa;
    }

    static /* synthetic */ boolean c(boolean bl) {
        ab = bl;
        return ab;
    }

    static /* synthetic */ boolean d(boolean bl) {
        Z = bl;
        return Z;
    }

    static /* synthetic */ String a(String string) {
        z = string;
        return z;
    }

    static /* synthetic */ String b(String string) {
        A = string;
        return A;
    }

    static /* synthetic */ int a(int n2) {
        B = n2;
        return B;
    }

    static /* synthetic */ int b(int n2) {
        C = n2;
        return C;
    }

    static /* synthetic */ String c(String string) {
        F = string;
        return F;
    }

    static /* synthetic */ int h() {
        return B;
    }

    static /* synthetic */ int i() {
        return C;
    }

    static /* synthetic */ int c(int n2) {
        D = n2;
        return D;
    }

    static /* synthetic */ int d(int n2) {
        E = n2;
        return E;
    }

    static /* synthetic */ String d(String string) {
        G = string;
        return G;
    }

    static /* synthetic */ int j() {
        return D;
    }

    static /* synthetic */ int k() {
        return E;
    }

    static /* synthetic */ int e(int n2) {
        H = n2;
        return H;
    }

    static /* synthetic */ int f(int n2) {
        I = n2;
        return I;
    }

    static /* synthetic */ int l() {
        return H;
    }

    static /* synthetic */ int m() {
        return I;
    }

    static /* synthetic */ String e(String string) {
        L = string;
        return L;
    }

    static /* synthetic */ int g(int n2) {
        J = n2;
        return J;
    }

    static /* synthetic */ int h(int n2) {
        K = n2;
        return K;
    }

    static /* synthetic */ int n() {
        return J;
    }

    static /* synthetic */ int o() {
        return K;
    }

    static /* synthetic */ String f(String string) {
        M = string;
        return M;
    }

    static /* synthetic */ int i(int n2) {
        R = n2;
        return R;
    }

    static /* synthetic */ int j(int n2) {
        S = n2;
        return S;
    }

    static /* synthetic */ int p() {
        return R;
    }

    static /* synthetic */ int q() {
        return S;
    }

    static /* synthetic */ String g(String string) {
        V = string;
        return V;
    }

    static /* synthetic */ int k(int n2) {
        T = n2;
        return T;
    }

    static /* synthetic */ int l(int n2) {
        U = n2;
        return U;
    }

    static /* synthetic */ int r() {
        return T;
    }

    static /* synthetic */ int s() {
        return U;
    }

    static /* synthetic */ String h(String string) {
        W = string;
        return W;
    }

    static /* synthetic */ int m(int n2) {
        N = n2;
        return N;
    }

    static /* synthetic */ int n(int n2) {
        O = n2;
        return O;
    }

    static /* synthetic */ int t() {
        return N;
    }

    static /* synthetic */ int u() {
        return O;
    }

    static /* synthetic */ String i(String string) {
        P = string;
        return P;
    }

    static /* synthetic */ String j(String string) {
        Q = string;
        return Q;
    }

    static /* synthetic */ String k(String string) {
        X = string;
        return X;
    }

    static /* synthetic */ String l(String string) {
        Y = string;
        return Y;
    }

    static /* synthetic */ String v() {
        return z;
    }

    static {
        Z = true;
        aa = true;
        ab = true;
    }
}

