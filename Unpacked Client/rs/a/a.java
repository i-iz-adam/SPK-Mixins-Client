/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.awt.Color;
import java.awt.Polygon;
import rs.Client;
import rs.a.h;
import rs.a.j;
import rs.a.k;
import rs.d.d;
import rs.l.f;
import rs.l.f.e;
import rs.s_0;

public class a
extends rs.a {
    public s_0 f;
    public int g = 1000;

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        h h2;
        Object object;
        int n12;
        int n13;
        int n14;
        int n15;
        rs.l.f.e.d().a(rs.l.f.a.e, (Object)this, null);
        if (!rs.runelite.b.a.a().isEmpty()) {
            for (n15 = 0; n15 < rs.runelite.b.a.a().size(); ++n15) {
                if (rs.runelite.b.a.a().get(n15).draw(this, false)) continue;
                return;
            }
        }
        if (this instanceof k && Client.cw == 10806) {
            n15 = Client.eh + (((k)this).ac - 6 >> 7);
            n14 = Client.ei + (((k)this).ad - 6 >> 7);
        }
        if (this instanceof k && !rs.f.a.J) {
            return;
        }
        if (this instanceof j) {
            int n16;
            int n17;
            if (!rs.f.a.K) {
                return;
            }
            if (rs.f.a.aT) {
                j j2 = (j)this;
                if (Client.ed != 197 && j2.aG != null && j2.aG.h && j2.m != -1 && j2.m - 32768 != Client.di) {
                    return;
                }
            }
            if (rs.f.a.aU && ((n17 = (n13 = (n16 = Client.eh + (((j)this).ac - 6 >> 7)) >> 6) * 256 + (n12 = (n14 = Client.ei + (((j)this).ad - 6 >> 7)) >> 6)) == 10317 || n17 == 10831 || n17 == 7248 || n17 == 9011 || n17 == 8755 || n17 == 9012 || n17 == 8756)) {
                object = (j)this;
                if (((j)object).m != -1 && ((j)object).m - 32768 != Client.di) {
                    return;
                }
            }
        }
        if (this instanceof j && ((j)this).i) {
            rs.d.d.a = false;
            rs.d.d.b = this;
        }
        h h3 = this.c();
        rs.d.d.a = true;
        rs.d.d.b = null;
        if (this instanceof j && ((j)this).av) {
            ((j)this).i = false;
            ((j)this).av = false;
        }
        if (h3 != null) {
            if (this instanceof k) {
                rs.l.f.e.d().a(rs.l.f.a.g, (Object)this, h3);
            } else if (this instanceof j) {
                ((j)this).as = n8;
                ((j)this).at = n10;
                ((j)this).au = n11;
            }
            if (this instanceof j) {
                j j3 = (j)this;
                if (j3.aG.x == 5660L) {
                    Color color = new Color(152, 0, 255);
                    Color color2 = Color.MAGENTA;
                    Color color3 = new Color(93, 44, 255, 100);
                    object = h3.b(((j)this).ac, ((j)this).ad, n8 + Client.cK, 0);
                    rs.l.e.j j4 = new rs.l.e.j(this, (Polygon)object, color, color2, n10);
                    j4.f = color3;
                    Client.ab.c.a(n10, (Object)j4);
                }
            }
            this.g = h3.g;
            if (rs.f.a.az && !rs.f.a.ah && this instanceof j) {
                int n18 = ((j)this).aw;
                n13 = ((j)this).ax;
                n12 = ((j)this).ay;
                d d2 = ((j)this).aG;
                if (((j)this).aG.x == 1335L) {
                    if (n18 == 0) {
                        n18 = 6;
                    } else {
                        n13 = n13 == 0 ? 6 : 6;
                    }
                }
                if (((j)this).aG.x == 1334L || ((j)this).aG.x == 8210L) {
                    int n19 = 3;
                    if (n18 == 0) {
                        n18 = n19;
                    } else {
                        n13 = n13 == 0 ? n19 : n19;
                    }
                }
                if (((j)this).aG.x == 864L || ((j)this).aG.x == 6303L) {
                    if (n18 == 0) {
                        n18 = 50;
                    } else {
                        n13 = n13 == 0 ? 50 : 50;
                    }
                }
                if (((j)this).aG.x == 6304L || ((j)this).aG.x == 8192L) {
                    if (n18 == 0) {
                        n18 = 5;
                    } else {
                        n13 = n13 == 0 ? 5 : 5;
                    }
                }
                if (((j)this).aG.x == 2863L) {
                    if (n18 == 0) {
                        n18 = 9;
                    } else {
                        n13 = n13 == 0 ? 9 : 9;
                    }
                }
                boolean bl = false;
                if (((j)this).aG.x == 7005L && h3.L != null && h3.L.length > 0) {
                    int n20 = 3;
                    h3.a(239, n20 + 1, (byte)1);
                    h3.a(255, n20 + 1, (byte)1);
                    h3.a(115, n20 + 1, (byte)1);
                    h3.a(72, n20 + 1, (byte)1);
                    h3.a(76, n20 + 1, (byte)1);
                    h3.a(30, n20 + 1, (byte)1);
                    h3.a(32, n20 + 1, (byte)1);
                    h3.a(36, n20 + 1, (byte)1);
                    h3.a(37, n20 + 1, (byte)1);
                    bl = true;
                }
                if (!bl && n18 > 0 && h3.L.length >= 1) {
                    int n21 = 1;
                    if (n13 > 0) {
                        ++n21;
                    }
                    if (n12 > 0) {
                        ++n21;
                    }
                    int[] nArray = new int[n21];
                    nArray[0] = rs.d.d.a(n18);
                    if (nArray.length >= 2) {
                        nArray[1] = rs.d.d.a(n13);
                    }
                    if (nArray.length >= 3) {
                        nArray[2] = rs.d.d.a(n12);
                    }
                    h3.a(0, nArray[0], (byte)1);
                    int n22 = 15;
                    if (n21 == 1) {
                        n22 = 20;
                    }
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = h3.L.length;
                    if (d2.x == 4003L) {
                        n22 = 11;
                    }
                    if (d2.x == 2863L) {
                        n22 = 4;
                    }
                    if (d2.x == 862L || d2.x == 2862L) {
                        n22 = 11;
                    }
                    if (d2.x == 6303L) {
                        n22 = 40;
                    }
                    if (d2.x == 751L || d2.x == 752L) {
                        n22 = 5;
                    }
                    if (d2.x == 754L) {
                        n22 = 10;
                    }
                    if (d2.x >= 2012L && d2.x <= 2016L) {
                        n22 = 11;
                        n25 = 400;
                    }
                    if (d2.x == 4437L) {
                        n22 = 5;
                        n24 = 35;
                    }
                    if (d2.x == 1336L || d2.x == 1337L) {
                        // empty if block
                    }
                    for (int i2 = n24; i2 < n25; i2 += n22) {
                        if (h3.L.length <= i2) continue;
                        h3.a(i2, nArray[n23], (byte)1);
                        if (++n23 < nArray.length) continue;
                        n23 = 0;
                    }
                }
            }
            if (this instanceof j && (((j)this).aG.x == 1336L || ((j)this).aG.x == 1335L || ((j)this).aG.x == 8210L || ((j)this).aG.x == 1334L)) {
                int n26 = 0;
                if (((j)this).aG.x == 1334L) {
                    n26 = -50;
                }
                for (n13 = 0; n13 < h3.ah; ++n13) {
                    if (((j)this).aG.x != 1335L && ((j)this).aG.x != 1334L && ((j)this).aG.x != 8210L) continue;
                    h3.aq[n13] = 100 - n26;
                }
                if (((j)this).aG.x == 1334L) {
                    h3.aI = 319770;
                }
                if (((j)this).aG.x == 8210L) {
                    n13 = (int)(Math.sin(Client.fg) * 33.0) + 33;
                    h.H = rs.l.f.a(255 + 131072 * n13);
                } else {
                    h.H = 1;
                }
                h3.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
                h.H = -1;
                if (((j)this).aG.x == 1334L) {
                    h3.aI = 0;
                }
            } else {
                if (this instanceof j && ((j)this).q()) {
                    h3.K = (short)200;
                    h3.aI = 1;
                    h.H = 1;
                }
                if (this instanceof k && ((k)this).aR) {
                    h3.a(n2, n3, n4, n5, n6, n7, n8, n9, 0, 0);
                    h3.K = (short)256;
                    h h4 = this.a(true);
                    h4.aD = 62;
                    h4.g = 283;
                    h4.b(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
                } else {
                    h3.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
                    h3.K = (short)256;
                }
                h.H = -1;
            }
        } else if (this instanceof k && (h2 = this.a(true)) != null) {
            h2.b(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
        }
        h3 = null;
    }

    public h a(boolean bl) {
        if (!(this instanceof k)) {
            return null;
        }
        k.av.z = bl ? ((k)this).z : -1;
        k.av.D = ((k)this).D;
        k.av.A = ((k)this).A;
        k.av.aU = ((k)this).aU;
        k.av.bj = ((k)this).bj;
        k.av.bk = ((k)this).bk;
        k.av.bl = ((k)this).bl;
        k.av.bn = ((k)this).bn;
        k.av.bo = ((k)this).bo;
        k.av.bp = ((k)this).bp;
        k.av.I = ((k)this).I;
        k.av.x = ((k)this).x;
        k.av.F = ((k)this).F;
        k.av.w = ((k)this).w;
        k.av.s = ((k)this).s;
        k.av.ac = ((k)this).ac;
        k.av.ad = ((k)this).ad;
        return k.av.b(true);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, boolean bl) {
        if (this instanceof k) {
            k.av.z = bl ? ((k)this).z : -1;
            k.av.D = ((k)this).D;
            k.av.A = ((k)this).A;
            k.av.aU = ((k)this).aU;
            k.av.bj = ((k)this).bj;
            k.av.bk = ((k)this).bk;
            k.av.bl = ((k)this).bl;
            k.av.bn = ((k)this).bn;
            k.av.bo = ((k)this).bo;
            k.av.bp = ((k)this).bp;
            k.av.I = ((k)this).I;
            k.av.x = ((k)this).x;
            k.av.F = ((k)this).F;
            k.av.w = ((k)this).w;
            k.av.s = ((k)this).s;
            k.av.ac = ((k)this).ac;
            k.av.ad = ((k)this).ad;
            h h2 = k.av.b(true);
            if (h2 != null) {
                h2.b(128, 128, 160);
                h2.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
            }
        }
    }

    public h c() {
        return null;
    }

    a() {
    }
}

