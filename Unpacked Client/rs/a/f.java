/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.Client;
import rs.a.c;
import rs.a.j;
import rs.f.a;
import rs.l.f_0;
import rs.l.j_0;

public class f {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public f(int n2, int n3, int n4) {
        this.d = n2;
        this.e = n3;
        this.c = n4;
    }

    public void a(Client client, c c2, int n2, int n3, int n4) {
        if (n3 <= -1) {
            return;
        }
        if (n2 == 1) {
            n4 -= 20;
        }
        if (n2 == 2) {
            n3 -= 15;
            n4 -= 10;
        }
        if (n2 == 3) {
            n3 += 15;
            n4 -= 10;
        }
        if (this.e == 0) {
            client.dS[0].f(n3 - 12, n4 - 12);
        } else {
            switch (this.d) {
                case 1: {
                    if (c2 instanceof j && ((j)c2).aG.x == 3329L) {
                        client.db.f(n3 - 12, n4 - 12);
                        break;
                    }
                    client.dS[this.d].f(n3 - 12, n4 - 12);
                    break;
                }
                case 2: {
                    client.dS[2].f(n3 - 11, n4 - 12);
                    break;
                }
                case 3: {
                    client.cZ.f(n3 - 11, n4 - 12);
                    break;
                }
                case 4: {
                    client.dS[4].f(n3 - 11, n4 - 12);
                    n4 += 2;
                    n3 += 2;
                    break;
                }
                case 5: {
                    client.dc.f(n3 - 11, n4 - 12);
                    break;
                }
                case 6: {
                    client.da.f(n3 - 12, n4 - 12);
                    break;
                }
                case 7: {
                    client.db.f(n3 - 12, n4 - 12);
                    break;
                }
                case 8: {
                    j_0.g.f(n3 - 11, n4 - 12);
                    break;
                }
                default: {
                    client.dS[this.d].f(n3 - 12, n4 - 12);
                }
            }
        }
        if (rs.f.a.aq && this.c != 255 && this.e > 0) {
            int n5 = 200;
            if (n2 == 0) {
                client.df[this.c].a(n3 - 3, n4 - 8, n5);
            } else if (n2 == 1) {
                client.df[this.c].a(n3 - 3, n4 - 8, n5);
            } else if (n2 == 2) {
                client.df[this.c].a(n3 - 26, n4 - 13, n5);
            } else {
                client.df[this.c].a(n3 - 3, n4 - 13, n5);
            }
        }
        Client.gh.e(0, this.e, n4 + 4, n3);
        Client.gh.e(0xFFFFFF, this.e, n4 + 3, n3 - 1);
    }

    public void b(Client client, c c2, int n2, int n3, int n4) {
        int n5;
        n4 += 20 * n2;
        if (!rs.l.b.a.a()) {
            if (Client.ff % 5 == 0 && this.a > -15) {
                --this.a;
            }
            if (this.g - 40 < Client.ff) {
                this.b -= 5;
            }
        }
        int n6 = 1;
        if (this.e >= 10 && this.e < 100) {
            n6 = 2;
        }
        if (this.e >= 100) {
            n6 = 3;
        }
        if ((n5 = this.b) < 0) {
            n5 = 0;
        }
        if (this.e <= 0) {
            client.dd.a(n3 - 12, n4 - 14 + this.a, n5);
            return;
        }
        f_0 f_02 = null;
        f_0 f_03 = null;
        f_0 f_04 = null;
        int n7 = 0;
        switch (n6) {
            case 1: {
                n7 = 8;
                break;
            }
            case 2: {
                n7 = 4;
                break;
            }
            case 3: {
                n7 = 1;
            }
        }
        switch (this.d) {
            case 0: 
            case 1: {
                f_02 = client.de[0];
                f_03 = client.de[1];
                f_04 = client.de[2];
                break;
            }
            case 2: {
                f_02 = client.de[6];
                f_03 = client.de[7];
                f_04 = client.de[8];
                break;
            }
            case 3: {
                f_02 = client.de[9];
                f_03 = client.de[10];
                f_04 = client.de[11];
                break;
            }
            case 4: {
                f_02 = client.de[18];
                f_03 = client.de[19];
                f_04 = client.de[20];
                break;
            }
            case 5: {
                f_02 = client.de[12];
                f_03 = client.de[13];
                f_04 = client.de[14];
                break;
            }
            case 6: {
                f_02 = client.de[3];
                f_03 = client.de[4];
                f_04 = client.de[5];
                break;
            }
            case 7: {
                f_02 = client.de[16];
                f_03 = client.de[15];
                f_04 = client.de[17];
                break;
            }
            case 8: {
                f_02 = client.de[18];
                f_03 = client.de[19];
                f_04 = client.de[20];
            }
        }
        if (this.c != 255) {
            client.df[this.c].a(n3 - 34 + n7, n4 - 14 + this.a, n5);
        }
        f_02.a(n3 - 12 + n7, n4 - 12 + this.a, n5);
        n7 += 4;
        for (int i2 = 0; i2 < n6 * 2; ++i2) {
            f_03.a(n3 - 12 + n7, n4 - 12 + this.a, n5);
            n7 += 4;
        }
        f_04.a(n3 - 12 + n7, n4 - 12 + this.a, n5);
        if (n5 > 100) {
            (this.d == 1 ? Client.gh : Client.gh).e(0xFFFFFF, this.e, n4 + (this.d != 0 ? 2 : 32) + this.a + 2, n3 + 4);
        }
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public int b() {
        return this.b;
    }

    public void b(int n2) {
        this.b = n2;
    }

    public int c() {
        return this.c;
    }

    public void c(int n2) {
        this.c = n2;
    }

    public int d() {
        return this.d;
    }

    public void d(int n2) {
        this.d = n2;
    }

    public int e() {
        return this.e;
    }

    public void e(int n2) {
        this.e = n2;
    }

    public int f() {
        return this.f;
    }

    public void f(int n2) {
        this.f = n2;
    }

    public int g() {
        return this.g;
    }

    public void g(int n2) {
        this.g = n2;
    }
}

