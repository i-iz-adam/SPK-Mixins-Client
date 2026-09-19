/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.a.a;
import rs.a.m;
import rs.c;
import rs.cache.d;
import rs.d.h;
import rs.d.r;
import rs.d.t;
import rs.f.a;
import rs.l.e_0;
import rs.l.f;
import rs.p;
import rs.v_0;
import rs.x.e;

public final class x {
    public static final int[][] a = new int[][]{{3283, 3935}, {3088, 3509}, {3095, 3523}, {3095, 3524}, {3096, 3523}, {3096, 3524}, {3099, 3525}, {3099, 3526}, {3100, 3525}, {3100, 3526}, {3098, 3523}, {3098, 3522}, {3099, 3523}, {3099, 3522}, {3101, 3523}, {3097, 3525}, {3090, 3503}, {3086, 3526}};
    public static final int[] b = new int[]{13728, 13729, 13730, 13731, 13732, 13733, 15256, 15257, 15258, 15259, 15260, 15261, 15262, 15263, 15264, 15265, 15266, 15267, 15268, 15269, 15270, 15271, 15272, 15273, 15274, 15275, 15276, 15277, 15278, 15279, 15280, 15281, 15282, 15283, 15284, 15285, 15286, 15287, 15288, 15289, 15290, 15291, 15292, 15293, 15294, 15295, 15296, 15297, 15298, 15299, 15300, 15301, 15302, 15303, 15304, 15305, 15306, 15307, 15308, 15309, 15310, 15311, 15312, 15313, 15314, 15315, 15316, 15317, 15318, 15319, 15320, 15321, 15322, 15323, 15324, 15325, 15326, 15327, 15328, 15329, 15330, 15331, 15332, 15333, 15334, 15335, 15336, 15337, 15338, 15339, 15340, 15341, 15342, 15343, 15344, 15345, 15346, 15347, 15348, 15349, 15350, 15351, 15352, 15353, 15354, 15355, 15356, 15357, 15358, 15359, 15360, 15361, 15362, 15363, 15364, 15365, 15366, 15367, 15368, 15369, 15370, 15371, 15372, 15373, 15374, 15375, 15376, 15377, 15378, 15379, 15380, 15381, 15382, 15383, 15384, 15385, 15386, 15387, 15388, 15389, 15390, 15391, 15392, 15393, 15394, 15395, 15396, 15397, 15398, 15399, 15400, 15401, 15402, 15403, 15404, 15405, 15406, 15407, 15408, 15409, 15410, 15411, 15412, 15413, 15414, 15415, 15416, 15417, 15418, 15419, 15420, 15421, 15422, 15423, 15424, 15425, 15426, 15427, 15428, 15429, 15430, 15431, 15432, 15433, 15434, 15435, 15436, 15437, 15438, 15439, 15440, 15441, 15442, 15443, 15444, 15445, 15446, 15447, 15448, 15449, 15450, 18810, 18811, 18812, 18813, 18814, 18815, 22457, 29131, 29132, 29133, 29113, 29136, 29137, 29138, 29139, 29120, 29130, 29122, 29121, 29123, 29124, 29125, 29126, 29127, 29128, 29129};
    public static final int[][] c = new int[][]{{1, 3088, 3509}, {1, 3283, 3935}};
    public static Map<String, Integer> d = new HashMap<String, Integer>();
    public static boolean e = false;
    private static int i = (int)(Math.random() * 17.0) - 8;
    private final int[] j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private final int[][][] o;
    private static int[][][] p;
    public static int f;
    private static int q;
    private final byte[][][] r;
    private final int[][][] s;
    private final byte[][][] t;
    private static final int[] u;
    private static final int v = 323;
    private final int[][] w;
    private static final int[] x;
    private final int[][][] y;
    private static final int[] z;
    public static int g;
    private final int A;
    private final int B;
    private final byte[][][] C;
    private final byte[][][] D;
    public static boolean h;
    private static final int[] E;

    public x(byte[][][] byArray, int[][][] nArray) {
        g = 99;
        this.A = 104;
        this.B = 104;
        this.o = nArray;
        this.D = byArray;
        this.y = new int[4][this.A][this.B];
        p = new int[4][this.A][this.B];
        this.t = new byte[4][this.A][this.B];
        this.C = new byte[4][this.A][this.B];
        this.s = new int[4][this.A + 1][this.B + 1];
        this.r = new byte[4][this.A + 1][this.B + 1];
        this.w = new int[this.A + 1][this.B + 1];
        this.j = new int[this.B];
        this.k = new int[this.B];
        this.l = new int[this.B];
        this.m = new int[this.B];
        this.n = new int[this.B];
    }

    private static int c(int n2, int n3) {
        if (rs.d.h.a == h.a.c) {
            int n4 = n2 + n3 * 57;
            n4 ^= n4 << 13;
            return (n4 * (n4 * n4 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 0xFF;
        }
        int n5 = n2 + n3 * 57;
        n5 = n5 << 13 ^ n5;
        int n6 = n5 * (n5 * n5 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return n6 >> 19 & rs.x.a();
    }

    private static int a() {
        return rs.d.h.a == h.a.c ? Short.MAX_VALUE : 255;
    }

    public final void a(rs.f[] fArray, v_0 v_02) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (n15 = 0; n15 < 4; ++n15) {
            for (int i2 = 0; i2 < 104; ++i2) {
                for (n14 = 0; n14 < 104; ++n14) {
                    if ((this.D[n15][i2][n14] & 1) != 1) continue;
                    n13 = n15;
                    if ((this.D[1][i2][n14] & 2) == 2) {
                        --n13;
                    }
                    if (n13 < 0) continue;
                    fArray[n13].a(n14, i2);
                }
            }
        }
        if ((i += (int)(Math.random() * 5.0) - 2) < -8) {
            i = -8;
        }
        if (i > 8) {
            i = 8;
        }
        if ((q += (int)(Math.random() * 5.0) - 2) < -16) {
            q = -16;
        }
        if (q > 16) {
            q = 16;
        }
        for (n15 = 0; n15 < 4; ++n15) {
            int n16;
            int n17;
            byte[][] byArray = this.r[n15];
            n14 = 96;
            n13 = 768;
            n12 = -50;
            n11 = -10;
            n10 = -50;
            n9 = (int)Math.sqrt(n12 * n12 + n11 * n11 + n10 * n10);
            n8 = n13 * n9 >> 8;
            for (n7 = 1; n7 < this.B - 1; ++n7) {
                for (n6 = 1; n6 < this.A - 1; ++n6) {
                    n5 = this.o[n15][n6 + 1][n7] - this.o[n15][n6 - 1][n7];
                    n4 = this.o[n15][n6][n7 + 1] - this.o[n15][n6][n7 - 1];
                    int n18 = (int)Math.sqrt(n5 * n5 + 65536 + n4 * n4);
                    int n19 = (n5 << 8) / n18;
                    n3 = 65536 / n18;
                    n2 = (n4 << 8) / n18;
                    n17 = n14 + (n12 * n19 + n11 * n3 + n10 * n2) / n8;
                    n16 = (byArray[n6 - 1][n7] >> 2) + (byArray[n6 + 1][n7] >> 3) + (byArray[n6][n7 - 1] >> 2) + (byArray[n6][n7 + 1] >> 3) + (byArray[n6][n7] >> 1);
                    this.w[n6][n7] = n17 - n16;
                }
            }
            for (n7 = 0; n7 < this.B; ++n7) {
                this.j[n7] = 0;
                this.k[n7] = 0;
                this.l[n7] = 0;
                this.m[n7] = 0;
                this.n[n7] = 0;
            }
            for (n7 = -5; n7 < this.A + 5; ++n7) {
                for (n6 = 0; n6 < this.B; ++n6) {
                    int n20;
                    n5 = n7 + 5;
                    if (n5 >= 0 && n5 < this.A && (n4 = this.y[n15][n5][n6] & rs.x.a()) > 0) {
                        if (n4 - 1 >= rs.d.h.b.length) {
                            n4 = rs.d.h.b.length;
                        }
                        h h2 = rs.d.h.b[n4 - 1];
                        int n21 = n6;
                        this.j[n21] = this.j[n21] + h2.i;
                        int n22 = n6;
                        this.k[n22] = this.k[n22] + h2.g;
                        int n23 = n6;
                        this.l[n23] = this.l[n23] + h2.h;
                        int n24 = n6;
                        this.m[n24] = this.m[n24] + h2.j;
                        int n25 = n6;
                        this.n[n25] = this.n[n25] + 1;
                    }
                    if ((n4 = n7 - 5) < 0 || n4 >= this.A || (n20 = this.y[n15][n4][n6] & rs.x.a()) <= 0) continue;
                    if (n20 - 1 >= rs.d.h.b.length) {
                        n20 = rs.d.h.b.length;
                    }
                    h h3 = rs.d.h.b[n20 - 1];
                    int n26 = n6;
                    this.j[n26] = this.j[n26] - h3.i;
                    int n27 = n6;
                    this.k[n27] = this.k[n27] - h3.g;
                    int n28 = n6;
                    this.l[n28] = this.l[n28] - h3.h;
                    int n29 = n6;
                    this.m[n29] = this.m[n29] - h3.j;
                    int n30 = n6;
                    this.n[n30] = this.n[n30] - 1;
                }
                if (n7 < 1 || n7 >= this.A - 1) continue;
                n6 = 0;
                n5 = 0;
                n4 = 0;
                int n31 = 0;
                int n32 = 0;
                for (n3 = -5; n3 < this.B + 5; ++n3) {
                    boolean bl;
                    n2 = n3 + 5;
                    if (n2 >= 0 && n2 < this.B) {
                        n6 += this.j[n2];
                        n5 += this.k[n2];
                        n4 += this.l[n2];
                        n31 += this.m[n2];
                        n32 += this.n[n2];
                    }
                    if ((n17 = n3 - 5) >= 0 && n17 < this.B) {
                        n6 -= this.j[n17];
                        n5 -= this.k[n17];
                        n4 -= this.l[n17];
                        n31 -= this.m[n17];
                        n32 -= this.n[n17];
                    }
                    n16 = 0;
                    int n33 = n7 + Client.eh;
                    int n34 = n3 + Client.ei;
                    int n35 = (n33 >> 6) * 256 + (n34 >> 6);
                    if (n33 >= 2867 && n33 <= 2871 && n34 >= 2981 && n34 <= 2984) {
                        n16 = 1;
                    }
                    boolean bl2 = false;
                    if (n35 != 12693 && n35 != 12949) {
                        bl2 = n3 >= 1 && n3 < this.B - 1 && this.b(n7, n3, n15);
                    }
                    boolean bl3 = bl = n3 >= 1 && n3 < this.B - 1 && (!h || (this.D[0][n7][n3] & 2) != 0 || (this.D[n15][n7][n3] & 0x10) == 0 && this.e(n3, n15, n7) == f);
                    if (rs.d.h.a == h.a.c) {
                        boolean bl4 = bl = n3 >= 1 && n3 < 103 && (!h || (this.D[0][n7][n3] & 2) != 0 || (this.D[n15][n7][n3] & 0x10) == 0);
                    }
                    if (bl) {
                        if (n15 < g) {
                            g = n15;
                        }
                        int n36 = this.y[n15][n7][n3] & rs.x.a();
                        int n37 = p[n15][n7][n3] & rs.x.a();
                        if (n37 >= rs.d.t.b.length) {
                            n37 = 134;
                        }
                        if (n36 > 0 || n37 > 0) {
                            int n38;
                            int n39;
                            int n40;
                            int n41 = this.o[n15][n7][n3];
                            int n42 = this.o[n15][n7 + 1][n3];
                            int n43 = this.o[n15][n7 + 1][n3 + 1];
                            int n44 = this.o[n15][n7][n3 + 1];
                            int n45 = this.w[n7][n3];
                            int n46 = this.w[n7 + 1][n3];
                            int n47 = this.w[n7 + 1][n3 + 1];
                            int n48 = this.w[n7][n3 + 1];
                            int n49 = -1;
                            int n50 = -1;
                            if (n36 > 0) {
                                n40 = 0;
                                if (n31 > 0) {
                                    n40 = n6 * 256 / n31;
                                }
                                n39 = n5 / n32;
                                n38 = n4 / n32;
                                n49 = this.d(n40, n39, n38);
                                n40 = n40 + i & rs.x.a();
                                if ((n38 += q) < 0) {
                                    n38 = 0;
                                } else if (n38 > 255) {
                                    n38 = 255;
                                }
                                n50 = this.d(n40, n39, n38);
                            }
                            if (n15 > 0) {
                                n40 = 1;
                                if (n36 == 0 && this.t[n15][n7][n3] != 0) {
                                    n40 = 0;
                                }
                                if (n37 > 0 && !rs.d.t.b[n37 - 1].e) {
                                    n40 = 0;
                                }
                                if (n40 != 0 && n41 == n42 && n41 == n43 && n41 == n44) {
                                    int[] nArray = this.s[n15][n7];
                                    int n51 = n3;
                                    nArray[n51] = nArray[n51] | 0x924;
                                }
                            }
                            n40 = 0;
                            n39 = 96;
                            if (n49 != -1) {
                                n40 = e_0.B[rs.x.g(n50, 96)];
                            }
                            n38 = 0;
                            if (n37 == 0) {
                                if (n33 >= 3076 && n33 <= 3082 && n34 >= 3487 && n34 <= 3497) {
                                    n49 = this.d(0, 0, 65);
                                }
                                if (n38 != 0) {
                                    n49 = this.d(0, 0, n38);
                                }
                                v_02.a(n15, n7, n3, 0, 0, -1, n41, n42, n43, n44, rs.x.g(n49, n45), rs.x.g(n49, n46), rs.x.g(n49, n47), rs.x.g(n49, n48), 0, 0, 0, 0, n40, 0);
                            } else {
                                int n52;
                                int n53;
                                int n54 = this.t[n15][n7][n3] + 1;
                                byte by = this.C[n15][n7][n3];
                                if (n37 - 1 > rs.d.t.b.length) {
                                    n37 = rs.d.t.b.length;
                                }
                                t t2 = rs.d.t.b[n37 - 1];
                                int n55 = t2.c;
                                if (n55 > 50) {
                                    n55 = -1;
                                }
                                if (n55 == 1 && rs.k.e.a()) {
                                    n55 = 24;
                                }
                                if (n55 >= 0) {
                                    n53 = e_0.b(n55 == 1 ? 24 : n55);
                                    n52 = -1;
                                } else if (t2.d == 0xFF00FF || rs.d.h.a != h.a.c && t2.d == 0) {
                                    n52 = -2;
                                    n55 = -1;
                                    n53 = 0;
                                } else {
                                    n52 = n33 >= 3076 && n33 <= 3082 && n34 >= 3487 && n34 <= 3498 ? this.d(0, 0, 70) : (n33 >= 3091 && n33 <= 3100 && n34 >= 3507 && n34 <= 3513 ? this.d(0, 0, 70) : (n33 >= 3076 && n33 <= 3084 && n34 >= 3507 && n34 <= 3513 ? this.d(0, 0, 70) : this.d(t2.o, t2.p, t2.q)));
                                    n53 = e_0.B[this.e(t2.w, 96)];
                                    if (rs.f.a.r == a.b.d && n33 >= 2729 && n33 <= 2746 && n34 >= 3460 && n34 <= 3476) {
                                        if (n37 == 38) {
                                            n52 = this.d(10, 175, 150);
                                            n53 = 16749077;
                                        } else if (n37 == 1) {
                                            // empty if block
                                        }
                                    }
                                    if (rs.f.a.r == a.b.c && n33 >= 2729 && n33 <= 2746 && n34 >= 3460 && n34 <= 3476) {
                                        if (n37 == 38) {
                                            n52 = rs.l.f.a(11430143);
                                            n53 = 11430143;
                                        } else if (n37 == 1) {
                                            // empty if block
                                        }
                                    }
                                }
                                if (t2.f != -1 && n53 == 0) {
                                    int n56 = t2.r;
                                    int n57 = t2.t;
                                    if (n57 < 0) {
                                        n57 = 0;
                                    } else if (n57 > 255) {
                                        n57 = 255;
                                    }
                                    int n58 = this.d(n56, t2.s, n57);
                                    n53 = e_0.B[rs.x.b(n58, 96)];
                                }
                                if (rs.d.h.a != h.a.c) {
                                    if (n37 - 1 == 111) {
                                        n53 = e_0.b(1);
                                        n52 = -1;
                                        n55 = 1;
                                    } else if (n52 == 6363) {
                                        n53 = 4733729;
                                        n52 = this.d(25, 146, 24);
                                    } else if (n37 - 1 == 151) {
                                        n53 = 16753198;
                                        n52 = -2;
                                        n55 = -1;
                                    }
                                    if (n37 - 1 == 54) {
                                        t2.d = 0x8B8B83;
                                        n53 = 0x8B8B83;
                                        n52 = -2;
                                        n55 = -1;
                                    }
                                }
                                v_02.a(n15, n7, n3, n54, by, n55, n41, n42, n43, n44, rs.x.g(n49, n45), rs.x.g(n49, n46), rs.x.g(n49, n47), rs.x.g(n49, n48), this.e(n52, n45), this.e(n52, n46), this.e(n52, n47), this.e(n52, n48), n40, n53);
                            }
                        }
                    }
                    if (!bl2) continue;
                    h = true;
                }
            }
            for (n7 = 1; n7 < this.B - 1; ++n7) {
                for (n6 = 1; n6 < this.A - 1; ++n6) {
                    v_02.a(n15, n6, n7, this.e(n7, n15, n6));
                }
            }
        }
        v_02.q(-10, -50, -50);
        for (n15 = 0; n15 < this.A; ++n15) {
            for (int i3 = 0; i3 < this.B; ++i3) {
                if ((this.D[1][n15][i3] & 2) != 2) continue;
                v_02.a(i3, n15);
            }
        }
        n15 = 1;
        int n59 = 2;
        n14 = 4;
        for (n13 = 0; n13 < 4; ++n13) {
            if (n13 > 0) {
                n15 <<= 3;
                n59 <<= 3;
                n14 <<= 3;
            }
            for (n12 = 0; n12 <= n13; ++n12) {
                for (n11 = 0; n11 <= this.B; ++n11) {
                    for (n10 = 0; n10 <= this.A; ++n10) {
                        int n60;
                        int n61;
                        if ((this.s[n12][n10][n11] & n15) != 0) {
                            n8 = n11;
                            n7 = n12;
                            n6 = n12;
                            for (n9 = n11; n9 > 0 && (this.s[n12][n10][n9 - 1] & n15) != 0; --n9) {
                            }
                            while (n8 < this.B && (this.s[n12][n10][n8 + 1] & n15) != 0) {
                                ++n8;
                            }
                            block20: while (n7 > 0) {
                                for (n5 = n9; n5 <= n8; ++n5) {
                                    if ((this.s[n7 - 1][n10][n5] & n15) == 0) break block20;
                                }
                                --n7;
                            }
                            block22: while (n6 < n13) {
                                for (n5 = n9; n5 <= n8; ++n5) {
                                    if ((this.s[n6 + 1][n10][n5] & n15) == 0) break block22;
                                }
                                ++n6;
                            }
                            if ((n5 = (n6 + 1 - n7) * (n8 - n9 + 1)) >= 8) {
                                n4 = 240;
                                n61 = this.o[n6][n10][n9] - n4;
                                n60 = this.o[n7][n10][n9];
                                v_0.a(n13, n10 * 128, n60, n10 * 128, n8 * 128 + 128, n61, n9 * 128, 1);
                                for (n3 = n7; n3 <= n6; ++n3) {
                                    n2 = n9;
                                    while (n2 <= n8) {
                                        int[] nArray = this.s[n3][n10];
                                        int n62 = n2++;
                                        nArray[n62] = nArray[n62] & ~n15;
                                    }
                                }
                            }
                        }
                        if ((this.s[n12][n10][n11] & n59) != 0) {
                            n8 = n10;
                            n7 = n12;
                            n6 = n12;
                            for (n9 = n10; n9 > 0 && (this.s[n12][n9 - 1][n11] & n59) != 0; --n9) {
                            }
                            while (n8 < this.A && (this.s[n12][n8 + 1][n11] & n59) != 0) {
                                ++n8;
                            }
                            block28: while (n7 > 0) {
                                for (n5 = n9; n5 <= n8; ++n5) {
                                    if ((this.s[n7 - 1][n5][n11] & n59) == 0) break block28;
                                }
                                --n7;
                            }
                            block30: while (n6 < n13) {
                                for (n5 = n9; n5 <= n8; ++n5) {
                                    if ((this.s[n6 + 1][n5][n11] & n59) == 0) break block30;
                                }
                                ++n6;
                            }
                            if ((n5 = (n6 + 1 - n7) * (n8 - n9 + 1)) >= 8) {
                                n4 = 240;
                                n61 = this.o[n6][n9][n11] - n4;
                                n60 = this.o[n7][n9][n11];
                                v_0.a(n13, n9 * 128, n60, n8 * 128 + 128, n11 * 128, n61, n11 * 128, 2);
                                for (n3 = n7; n3 <= n6; ++n3) {
                                    for (n2 = n9; n2 <= n8; ++n2) {
                                        int[] nArray = this.s[n3][n2];
                                        int n63 = n11;
                                        nArray[n63] = nArray[n63] & ~n59;
                                    }
                                }
                            }
                        }
                        if ((this.s[n12][n10][n11] & n14) == 0) continue;
                        n9 = n10;
                        n8 = n10;
                        n6 = n11;
                        for (n7 = n11; n7 > 0 && (this.s[n12][n10][n7 - 1] & n14) != 0; --n7) {
                        }
                        while (n6 < this.B && (this.s[n12][n10][n6 + 1] & n14) != 0) {
                            ++n6;
                        }
                        block36: while (n9 > 0) {
                            for (n5 = n7; n5 <= n6; ++n5) {
                                if ((this.s[n12][n9 - 1][n5] & n14) == 0) break block36;
                            }
                            --n9;
                        }
                        block38: while (n8 < this.A) {
                            for (n5 = n7; n5 <= n6; ++n5) {
                                if ((this.s[n12][n8 + 1][n5] & n14) == 0) break block38;
                            }
                            ++n8;
                        }
                        if ((n8 - n9 + 1) * (n6 - n7 + 1) < 4) continue;
                        n5 = this.o[n12][n9][n7];
                        v_0.a(n13, n9 * 128, n5, n8 * 128 + 128, n6 * 128 + 128, n5, n7 * 128, 4);
                        for (n4 = n9; n4 <= n8; ++n4) {
                            n61 = n7;
                            while (n61 <= n6) {
                                int[] nArray = this.s[n12][n4];
                                int n64 = n61++;
                                nArray[n64] = nArray[n64] & ~n14;
                            }
                        }
                    }
                }
            }
        }
    }

    private static int d(int n2, int n3) {
        int n4 = rs.x.c(n2 + 45365, n3 + 91923, 4) - 128 + (rs.x.c(n2 + 10294, n3 + 37821, 2) - 128 >> 1) + (rs.x.c(n2, n3, 1) - 128 >> 2);
        if ((n4 = (int)((double)n4 * 0.3) + 35) < 10) {
            n4 = 10;
        } else if (n4 > 60) {
            n4 = 60;
        }
        return n4;
    }

    public static void a(e e2, d d2) {
        int n2;
        int n3 = -1;
        while ((n2 = e2.f()) != 0) {
            int n4;
            r r2 = rs.d.r.c(n3 += n2);
            r2.a(d2);
            while ((n4 = e2.f()) != 0) {
                e2.y();
            }
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            for (int i3 = n5; i3 <= n5 + n4; ++i3) {
                if (i3 < 0 || i3 >= this.A || i2 < 0 || i2 >= this.B) continue;
                this.r[0][i3][i2] = 127;
                if (i3 == n5 && i3 > 0) {
                    this.o[0][i3][i2] = this.o[0][i3 - 1][i2];
                }
                if (i3 == n5 + n4 && i3 < this.A - 1) {
                    this.o[0][i3][i2] = this.o[0][i3 + 1][i2];
                }
                if (i2 == n2 && i2 > 0) {
                    this.o[0][i3][i2] = this.o[0][i3][i2 - 1];
                }
                if (i2 != n2 + n3 || i2 >= this.B - 1) continue;
                this.o[0][i3][i2] = this.o[0][i3][i2 + 1];
            }
        }
    }

    private static boolean a(int n2) {
        if (n2 == 42950) {
            return true;
        }
        return n2 > 32176 && n2 <= 34561;
    }

    public void a(int n2, v_0 v_02, rs.f f2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        byte by;
        int n9;
        int n10;
        int n11;
        int n12;
        r r2;
        int n13;
        int n14;
        int n15;
        int n16;
        block92: {
            block93: {
                block94: {
                    int n17;
                    int n18;
                    boolean bl = rs.x.a(n6);
                    if (n4 >= 0 && n4 < 4 && !bl) {
                        int n19 = n16 = rs.d.h.a != h.a.c || (this.D[n4][n5][n2] & 0x10) != 0 ? 1 : 0;
                        if (h && (this.D[0][n5][n2] & 2) == 0 && n16 != 0) {
                            if ((this.D[n4][n5][n2] & 0x10) != 0) {
                                return;
                            }
                            if (this.e(n2, n4, n5) != f) {
                                return;
                            }
                        }
                    }
                    if (n4 < g) {
                        g = n4;
                    }
                    n16 = this.o[n4][n5][n2];
                    n15 = this.o[n4][n5 + 1][n2];
                    n14 = this.o[n4][n5 + 1][n2 + 1];
                    n13 = this.o[n4][n5][n2 + 1];
                    r2 = rs.d.r.c(n6);
                    if (n7 != 1 && n7 != 3) {
                        n18 = r2.U;
                        n17 = r2.af;
                    } else {
                        n18 = r2.af;
                        n17 = r2.U;
                    }
                    n12 = n16 + n15 + n14 + n13 >> 2;
                    n11 = (n5 << 7) + (n18 << 6);
                    n10 = (n2 << 7) + (n17 << 6);
                    int n20 = Client.eh + (n11 - 6 >> 7);
                    int n21 = Client.ei + (n10 - 6 >> 7);
                    n9 = n5 + (n2 << 7) + ((n6 > Short.MAX_VALUE ? n6 & Short.MAX_VALUE : n6) << 14) + 0x40000000;
                    if (!r2.ar) {
                        n9 -= Integer.MIN_VALUE;
                    }
                    by = (byte)((n7 << 6) + n3);
                    if (n3 != 22) break block92;
                    if (bl || !h || r2.ar || r2.P) break block93;
                    if (!r2.aj) break block94;
                    if (rs.d.h.a == h.a.c) break block93;
                }
                return;
            }
            a a2 = r2.au == -1 && r2.ad == null ? r2.a(22, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, 22, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n4, n12, n2, a2, by, n9, n5, n6);
            if (r2.aj && r2.ar && f2 != null) {
                f2.a(n2, n5);
            }
            return;
        }
        if (n3 == 10 || n3 == 11) {
            a a3 = r2.au == -1 && r2.ad == null ? r2.a(10, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, 10, n15, n14, n16, n13, r2.au, r2.at);
            if (a3 != null) {
                rs.a.h h2;
                int n22;
                int n23;
                int n24 = 0;
                if (n3 == 11) {
                    n24 += 256;
                }
                if (n7 == 1 || n7 == 3) {
                    n23 = r2.af;
                    n22 = r2.U;
                } else {
                    n23 = r2.U;
                    n22 = r2.af;
                }
                if (v_02.a(n9, by, n12, n22, a3, n23, n4, n24, n2, n5, n6) && r2.as && (h2 = a3 instanceof rs.a.h ? (rs.a.h)a3 : r2.a(10, n7, n16, n15, n14, n13, -1, -1)) != null) {
                    for (int i2 = 0; i2 <= n23; ++i2) {
                        for (int i3 = 0; i3 <= n22; ++i3) {
                            int n25 = h2.aD / 4;
                            if (n25 > 30) {
                                n25 = 30;
                            }
                            if (n25 <= this.r[n4][n5 + i2][n2 + i3]) continue;
                            this.r[n4][n5 + i2][n2 + i3] = (byte)n25;
                        }
                    }
                }
            }
            if (r2.aj && f2 != null) {
                f2.a(r2.ab, r2.U, r2.af, n5, n2, n7);
            }
            return;
        }
        if (n3 >= 12) {
            a a4 = r2.au == -1 && r2.ad == null ? r2.a(n3, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, n3, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, by, n12, 1, a4, 1, n4, 0, n2, n5, n6);
            if (n3 >= 12 && n3 <= 17 && n3 != 13 && n4 > 0) {
                int[] nArray = this.s[n4][n5];
                int n26 = n2;
                nArray[n26] = nArray[n26] | 0x924;
            }
            if (r2.aj && f2 != null) {
                f2.a(r2.ab, r2.U, r2.af, n5, n2, n7);
            }
            return;
        }
        if (n3 == 0) {
            a a5 = r2.au == -1 && r2.ad == null ? r2.a(0, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, 0, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(E[n7], a5, n9, n2, by, n5, null, n12, 0, n4, n6);
            if (n7 == 0) {
                if (r2.as) {
                    this.r[n4][n5][n2] = 50;
                    this.r[n4][n5][n2 + 1] = 50;
                }
                if (r2.ah) {
                    int[] nArray = this.s[n4][n5];
                    int n27 = n2;
                    nArray[n27] = nArray[n27] | 0x249;
                }
            } else if (n7 == 1) {
                if (r2.as) {
                    this.r[n4][n5][n2 + 1] = 50;
                    this.r[n4][n5 + 1][n2 + 1] = 50;
                }
                if (r2.ah) {
                    int[] nArray = this.s[n4][n5];
                    int n28 = n2 + 1;
                    nArray[n28] = nArray[n28] | 0x492;
                }
            } else if (n7 == 2) {
                if (r2.as) {
                    this.r[n4][n5 + 1][n2] = 50;
                    this.r[n4][n5 + 1][n2 + 1] = 50;
                }
                if (r2.ah) {
                    int[] nArray = this.s[n4][n5 + 1];
                    int n29 = n2;
                    nArray[n29] = nArray[n29] | 0x249;
                }
            } else if (n7 == 3) {
                if (r2.as) {
                    this.r[n4][n5][n2] = 50;
                    this.r[n4][n5 + 1][n2] = 50;
                }
                if (r2.ah) {
                    int[] nArray = this.s[n4][n5];
                    int n30 = n2;
                    nArray[n30] = nArray[n30] | 0x492;
                }
            }
            if (r2.aj && f2 != null) {
                if (n6 == 1415) {
                    // empty if block
                }
                f2.a(n2, n7, n5, n3, r2.ab);
            }
            if (r2.ap != 16) {
                v_02.c(n2, r2.ap, n5, n4);
            }
            return;
        }
        if (n3 == 1) {
            a a6 = r2.au == -1 && r2.ad == null ? r2.a(1, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, 1, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(x[n7], a6, n9, n2, by, n5, null, n12, 0, n4, n6);
            if (r2.as) {
                if (n7 == 0) {
                    this.r[n4][n5][n2 + 1] = 50;
                } else if (n7 == 1) {
                    this.r[n4][n5 + 1][n2 + 1] = 50;
                } else if (n7 == 2) {
                    this.r[n4][n5 + 1][n2] = 50;
                } else if (n7 == 3) {
                    this.r[n4][n5][n2] = 50;
                }
            }
            if (r2.aj && f2 != null) {
                f2.a(n2, n7, n5, n3, r2.ab);
            }
            return;
        }
        if (n3 == 2) {
            a a7;
            a a8;
            int n31 = n7 + 1 & 3;
            if (r2.au == -1 && r2.ad == null) {
                a8 = r2.a(2, 4 + n7, this.o[n4], n11, n12, n10, true, 0);
                a7 = r2.a(2, n31, this.o[n4], n11, n12, n10, true, 0);
            } else {
                a8 = new m(n6, 4 + n7, 2, n15, n14, n16, n13, r2.au, r2.at);
                a7 = new m(n6, n31, 2, n15, n14, n16, n13, r2.au, r2.at);
            }
            v_02.a(E[n7], a8, n9, n2, by, n5, a7, n12, E[n31], n4, n6);
            if (r2.ah) {
                if (n7 == 0) {
                    int[] nArray = this.s[n4][n5];
                    int n32 = n2;
                    nArray[n32] = nArray[n32] | 0x249;
                    int[] nArray2 = this.s[n4][n5];
                    int n33 = n2 + 1;
                    nArray2[n33] = nArray2[n33] | 0x492;
                } else if (n7 == 1) {
                    int[] nArray = this.s[n4][n5];
                    int n34 = n2 + 1;
                    nArray[n34] = nArray[n34] | 0x492;
                    int[] nArray3 = this.s[n4][n5 + 1];
                    int n35 = n2;
                    nArray3[n35] = nArray3[n35] | 0x249;
                } else if (n7 == 2) {
                    int[] nArray = this.s[n4][n5 + 1];
                    int n36 = n2;
                    nArray[n36] = nArray[n36] | 0x249;
                    int[] nArray4 = this.s[n4][n5];
                    int n37 = n2;
                    nArray4[n37] = nArray4[n37] | 0x492;
                } else if (n7 == 3) {
                    int[] nArray = this.s[n4][n5];
                    int n38 = n2;
                    nArray[n38] = nArray[n38] | 0x492;
                    int[] nArray5 = this.s[n4][n5];
                    int n39 = n2;
                    nArray5[n39] = nArray5[n39] | 0x249;
                }
            }
            if (r2.aj && f2 != null) {
                f2.a(n2, n7, n5, n3, r2.ab);
            }
            if (r2.ap != 16) {
                v_02.c(n2, r2.ap, n5, n4);
            }
            return;
        }
        if (n3 == 3) {
            a a9 = r2.au == -1 && r2.ad == null ? r2.a(3, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, 3, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(x[n7], a9, n9, n2, by, n5, null, n12, 0, n4, n6);
            if (r2.as) {
                if (n7 == 0) {
                    this.r[n4][n5][n2 + 1] = 50;
                } else if (n7 == 1) {
                    this.r[n4][n5 + 1][n2 + 1] = 50;
                } else if (n7 == 2) {
                    this.r[n4][n5 + 1][n2] = 50;
                } else if (n7 == 3) {
                    this.r[n4][n5][n2] = 50;
                }
            }
            if (r2.aj && f2 != null) {
                f2.a(n2, n7, n5, n3, r2.ab);
            }
            return;
        }
        if (n3 == 9) {
            a a10 = r2.au == -1 && r2.ad == null ? r2.a(n3, n7, this.o[n4], n11, n12, n10, true, 0) : new m(n6, n7, n3, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, by, n12, 1, a10, 1, n4, 0, n2, n5, n6);
            if (r2.aj && f2 != null) {
                f2.a(r2.ab, r2.U, r2.af, n5, n2, n7);
            }
            return;
        }
        if (r2.ag) {
            if (n7 == 1) {
                n8 = n13;
                n13 = n14;
                n14 = n15;
                n15 = n16;
                n16 = n8;
            } else if (n7 == 2) {
                n8 = n13;
                n13 = n15;
                n15 = n8;
                n8 = n14;
                n14 = n16;
                n16 = n8;
            } else if (n7 == 3) {
                n8 = n13;
                n13 = n16;
                n16 = n15;
                n15 = n14;
                n14 = n8;
            }
        }
        if (n3 == 4) {
            a a11 = r2.au == -1 && r2.ad == null ? r2.a(4, 0, this.o[n4], n11, n12, n10, true, 0) : new m(n6, 0, 4, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, n2, n7 * 512, n4, 0, n12, a11, n5, by, 0, E[n7], n6);
            return;
        }
        if (n3 == 5) {
            n8 = 16;
            int n40 = v_02.a(n4, n5, n2);
            if (n40 > 0) {
                n8 = rs.d.r.c((int)v_02.b((int)n4, (int)n5, (int)n2)).ap;
            }
            a a12 = r2.au == -1 && r2.ad == null ? r2.a(4, 0, this.o[n4], n11, n12, n10, true, 0) : new m(n6, 0, 4, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, n2, n7 * 512, n4, u[n7] * n8, n12, a12, n5, by, z[n7] * n8, E[n7], n6);
            return;
        }
        if (n3 == 6) {
            a a13 = r2.au == -1 && r2.ad == null ? r2.a(4, 0, this.o[n4], n11, n12, n10, true, 0) : new m(n6, 0, 4, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, n2, n7, n4, 0, n12, a13, n5, by, 0, 256, n6);
            return;
        }
        if (n3 == 7) {
            a a14 = r2.au == -1 && r2.ad == null ? r2.a(4, 0, this.o[n4], n11, n12, n10, true, 0) : new m(n6, 0, 4, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, n2, n7, n4, 0, n12, a14, n5, by, 0, 512, n6);
            return;
        }
        if (n3 == 8) {
            a a15 = r2.au == -1 && r2.ad == null ? r2.a(4, 0, this.o[n4], n11, n12, n10, true, 0) : new m(n6, 0, 4, n15, n14, n16, n13, r2.au, r2.at);
            v_02.a(n9, n2, n7, n4, 0, n12, a15, n5, by, 0, 768, n6);
        }
    }

    private static int c(int n2, int n3, int n4) {
        int n5 = n2 / n4;
        int n6 = n2 & n4 - 1;
        int n7 = n3 / n4;
        int n8 = n3 & n4 - 1;
        int n9 = rs.x.f(n5, n7);
        int n10 = rs.x.f(n5 + 1, n7);
        int n11 = rs.x.f(n5, n7 + 1);
        int n12 = rs.x.f(n5 + 1, n7 + 1);
        int n13 = rs.x.b(n9, n10, n6, n4);
        int n14 = rs.x.b(n11, n12, n6, n4);
        return rs.x.b(n13, n14, n8, n4);
    }

    private int d(int n2, int n3, int n4) {
        if (n4 > 179) {
            n3 /= 2;
        }
        if (n4 > 192) {
            n3 /= 2;
        }
        if (n4 > 217) {
            n3 /= 2;
        }
        if (n4 > 243) {
            n3 /= 2;
        }
        return (n2 / 4 << 10) + (n3 / 32 << 7) + n4 / 2;
    }

    public static boolean a(int n2, int n3) {
        r r2 = rs.d.r.c(n2);
        if (n3 == 11) {
            n3 = 10;
        }
        if (n3 >= 5 && n3 <= 8) {
            n3 = 4;
        }
        return r2.d(n3);
    }

    public final void a(int n2, int n3, rs.f[] fArray, int n4, int n5, byte[] byArray, int n6, int n7, int n8) {
        int n9;
        for (int i2 = 0; i2 < 8; ++i2) {
            for (n9 = 0; n9 < 8; ++n9) {
                if (n4 + i2 <= 0 || n4 + i2 >= 103 || n8 + n9 <= 0 || n8 + n9 >= 103) continue;
                int[] nArray = fArray[n7].a[n4 + i2];
                int n10 = n8 + n9;
                nArray[n10] = nArray[n10] & 0xFEFFFFFF;
            }
        }
        e e2 = new e(byArray);
        for (n9 = 0; n9 < 4; ++n9) {
            for (int i3 = 0; i3 < 64; ++i3) {
                for (int i4 = 0; i4 < 64; ++i4) {
                    if (n9 == n2 && i3 >= n5 && i3 < n5 + 8 && i4 >= n6 && i4 < n6 + 8) {
                        this.a(e2, 0, 0, n4 + rs.c.a(n3, i4 & 7, i3 & 7), n8 + rs.c.b(i4 & 7, n3, i3 & 7), n7, n3);
                        continue;
                    }
                    this.a(e2, 0, 0, -1, -1, 0, 0);
                }
            }
        }
    }

    public void a(byte[] byArray, int n2, int n3, int n4, int n5, rs.f[] fArray) {
        int n6;
        int n7;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (n7 = 0; n7 < 64; ++n7) {
                for (n6 = 0; n6 < 64; ++n6) {
                    if (n2 + n7 <= 0 || n2 + n7 >= 103 || n3 + n6 <= 0 || n3 + n6 >= 103) continue;
                    int[] nArray = fArray[i2].a[n2 + n7];
                    int n8 = n3 + n6;
                    nArray[n8] = nArray[n8] & 0xFEFFFFFF;
                }
            }
        }
        e e2 = new e(byArray);
        for (n7 = 0; n7 < 4; ++n7) {
            for (n6 = 0; n6 < 64; ++n6) {
                for (int i3 = 0; i3 < 64; ++i3) {
                    try {
                        this.a(e2, n4, n5, n6 + n2, i3 + n3, n7, 0);
                        continue;
                    }
                    catch (Exception exception) {
                        if (!rs.f.a.d.booleanValue()) continue;
                        exception.printStackTrace();
                    }
                }
            }
        }
    }

    private void a(e e2, int n2, int n3, int n4, int n5, int n6, int n7) {
        block14: {
            if (n6 >= 0 && n6 < 4 && n4 >= 0 && n4 < 104 && n5 >= 0 && n5 < 104) {
                this.D[n6][n4][n5] = 0;
                while (true) {
                    int n8;
                    int n9 = n8 = rs.d.h.a == h.a.c ? e2.A() : e2.y();
                    if (n8 == 0) {
                        if (n6 == 0) {
                            int n10 = n2 + n4;
                            int n11 = n3 + n5;
                            int n12 = n10 >> 6;
                            int n13 = n11 >> 6;
                            int n14 = n12 * 256 + n13;
                            int n15 = n10 & 0x3F;
                            int n16 = n11 & 0x3F;
                            if (Client.ew.g.h().r_(n14)) {
                                int n17 = Client.ew.g.h().c(n14);
                                int n18 = n17 >> 8;
                                int n19 = n17 & 0xFF;
                                n10 = (n18 << 6) + n15;
                                n11 = (n19 << 6) + n16;
                            }
                            this.o[0][n4][n5] = -rs.p.a(n10 + 932731, n11 + 556238) * 8;
                            break block14;
                        }
                        this.o[n6][n4][n5] = this.o[n6 - 1][n4][n5] - 240;
                        return;
                    }
                    if (n8 == 1) {
                        int n20 = e2.y();
                        if (n20 == 1) {
                            n20 = 0;
                        }
                        if (n6 == 0) {
                            this.o[0][n4][n5] = -n20 * 8;
                        } else {
                            this.o[n6][n4][n5] = this.o[n6 - 1][n4][n5] - n20 * 8;
                        }
                        break block14;
                    }
                    if (n8 <= 49) {
                        rs.x.p[n6][n4][n5] = (short)(rs.d.h.a == h.a.c ? e2.B() : e2.y());
                        if (Client.b(n4 + n2, n5 + n3, n6)) {
                            rs.x.p[n6][n4][n5] = 0;
                            continue;
                        }
                        this.t[n6][n4][n5] = (byte)((n8 - 2) / 4);
                        this.C[n6][n4][n5] = (byte)(n8 - 2 + n7 & 3);
                        continue;
                    }
                    if (n8 <= 81) {
                        if (Client.b(n4 + n2, n5 + n3, n6)) continue;
                        this.D[n6][n4][n5] = (byte)(n8 - 49);
                        continue;
                    }
                    if (Client.b(n4 + n2, n5 + n3, n6)) continue;
                    this.y[n6][n4][n5] = n8 - 81;
                }
            }
            while (true) {
                int n21;
                int n22 = n21 = rs.d.h.a == h.a.c ? e2.A() : e2.y();
                if (n21 == 0) break;
                if (n21 == 1) {
                    e2.y();
                    return;
                }
                if (n21 > 49) continue;
                int n23 = rs.d.h.a == h.a.c ? e2.B() : e2.y();
            }
        }
    }

    private int e(int n2, int n3, int n4) {
        if ((this.D[n3][n4][n2] & 8) != 0) {
            int n5 = n4 + Client.eh;
            int n6 = n2 + Client.ei;
            int n7 = (n5 >> 6) * 256 + (n6 >> 6);
            if (rs.f.a.ax || n7 != 11601) {
                return 0;
            }
        }
        if (n3 > 0 && (this.D[1][n4][n2] & 2) != 0) {
            return n3 - 1;
        }
        return n3;
    }

    public final void a(rs.f[] fArray, v_0 v_02, int n2, int n3, int n4, int n5, byte[] byArray, int n6, int n7, int n8) {
        int n9;
        e e2 = new e(byArray);
        int n10 = -1;
        while ((n9 = e2.f()) != 0) {
            int n11;
            n10 += n9;
            int n12 = 0;
            while ((n11 = e2.f()) != 0) {
                int n13;
                int n14 = (n12 += n11 - 1) & 0x3F;
                int n15 = n12 >> 6 & 0x3F;
                int n16 = n12 >> 12;
                int n17 = e2.y();
                int n18 = n17 >> 2;
                int n19 = n17 & 3;
                if (n16 != n2 || n15 < n6 || n15 >= n6 + 8 || n14 < n4 || n14 >= n4 + 8) continue;
                r r2 = rs.d.r.c(n10);
                int n20 = n3 + rs.c.a(n7, n19 == 0 || n19 == 2 ? r2.af : r2.U, n15 & 7, n14 & 7, n19 == 0 || n19 == 2 ? r2.U : r2.af);
                int n21 = n8 + rs.c.b(n14 & 7, n19 == 0 || n19 == 2 ? r2.af : r2.U, n7, n19 == 0 || n19 == 2 ? r2.U : r2.af, n15 & 7);
                if (n20 <= 0 || n21 <= 0 || n20 >= 103 || n21 >= 103) continue;
                int n22 = n16;
                if ((this.D[1][n20][n21] & 2) == 2) {
                    --n22;
                }
                rs.f f2 = null;
                if (n5 >= 0) {
                    f2 = fArray[n5];
                }
                if (!rs.f.a.ae) {
                    n13 = 0;
                    for (int n23 : b) {
                        if (n23 != n10) continue;
                        n13 = 1;
                        break;
                    }
                    if (n13 != 0) {
                        if (n18 != 0 || n10 >= 15305 && n10 <= 15317 || n10 == 15402 || n10 == 15403 || n10 >= 15000) continue;
                        n10 = 13830;
                    }
                }
                n13 = n20 + Client.eh;
                int n24 = n21 + Client.ei;
                this.a(n21, v_02, f2, n18, n5, n20, n10, n19 + n7 & 3);
            }
        }
    }

    private static int b(int n2, int n3, int n4, int n5) {
        if (rs.d.h.a == h.a.c) {
            int n6 = 65536 - e_0.w[n4 * 1024 / n5] >> 1;
            return ((65536 - n6) * n2 >> 16) + (n6 * n3 >> 16);
        }
        int n7 = 65536 - e_0.w[n4 * 1024 / n5] >> 1;
        return (n2 * (65536 - n7) >> 16) + (n3 * n7 >> 16);
    }

    static final int a(int n2, int n3, int n4) {
        if (n4 > 179) {
            n3 /= 2;
        }
        if (n4 > 192) {
            n3 /= 2;
        }
        if (n4 > 217) {
            n3 /= 2;
        }
        if (n4 > 243) {
            n3 /= 2;
        }
        int n5 = n4 / 2 + (n2 / 4 << 10) + (n3 / 32 << 7);
        return n5;
    }

    static final int b(int n2, int n3) {
        if (n2 == -2) {
            return 12345678;
        }
        if (n2 == -1) {
            if (n3 < 2) {
                n3 = 2;
            } else if (n3 > 126) {
                n3 = 126;
            }
            return n3;
        }
        if ((n3 = n3 * (n2 & 0x7F) / 128) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return n3 + (n2 & 0xFF80);
    }

    private int e(int n2, int n3) {
        if (n2 == -2) {
            return 12345678;
        }
        if (n2 == -1) {
            if (n3 < 0) {
                n3 = 0;
            } else if (n3 > 127) {
                n3 = 127;
            }
            n3 = 127 - n3;
            return n3;
        }
        if ((n3 = n3 * (n2 & 0x7F) / 128) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 0xFF80) + n3;
    }

    private static int f(int n2, int n3) {
        int n4 = rs.x.c(n2 - 1, n3 - 1) + rs.x.c(n2 + 1, n3 - 1) + rs.x.c(n2 - 1, n3 + 1) + rs.x.c(n2 + 1, n3 + 1);
        int n5 = rs.x.c(n2 - 1, n3) + rs.x.c(n2 + 1, n3) + rs.x.c(n2, n3 - 1) + rs.x.c(n2, n3 + 1);
        int n6 = rs.x.c(n2, n3);
        return n4 / 16 + n5 / 8 + n6 / 4;
    }

    private static int g(int n2, int n3) {
        if (n2 == -1) {
            return 12345678;
        }
        if ((n3 = n3 * (n2 & 0x7F) / 128) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 0xFF80) + n3;
    }

    public static void a(v_0 v_02, int n2, int n3, int n4, int n5, rs.f f2, int[][][] nArray, int n6, int n7, int n8) {
        int n9;
        int n10 = nArray[n5][n6][n3];
        int n11 = nArray[n5][n6 + 1][n3];
        int n12 = nArray[n5][n6 + 1][n3 + 1];
        int n13 = nArray[n5][n6][n3 + 1];
        int n14 = n10 + n11 + n12 + n13 >> 2;
        r r2 = rs.d.r.c(n7);
        int n15 = n6 + (n3 << 7) + ((n7 > Short.MAX_VALUE ? n7 & Short.MAX_VALUE : n7) << 14) + 0x40000000;
        if (!r2.ar) {
            n15 -= Integer.MIN_VALUE;
        }
        byte by = (byte)((n2 << 6) + n4);
        if (!r2.ar) {
            n15 -= Integer.MIN_VALUE;
        }
        if (n4 == 22) {
            a a2 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(22, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, 22, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n8, n14, n3, a2, by, n15, n6, n7);
            if (r2.aj && r2.ar) {
                f2.a(n3, n6);
            }
            return;
        }
        if (n4 == 10 || n4 == 11) {
            a a3 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(10, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, 10, n11, n12, n10, n13, r2.au, r2.at);
            if (a3 != null) {
                int n16;
                int n17;
                int n18 = 0;
                if (n4 == 11) {
                    n18 += 256;
                }
                if (n2 == 1 || n2 == 3) {
                    n17 = r2.af;
                    n16 = r2.U;
                } else {
                    n17 = r2.U;
                    n16 = r2.af;
                }
                v_02.a(n15, by, n14, n16, a3, n17, n8, n18, n3, n6, n7);
            }
            if (r2.aj) {
                f2.a(r2.ab, r2.U, r2.af, n6, n3, n2);
            }
            return;
        }
        if (n4 >= 12) {
            a a4 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(n4, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, n4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, by, n14, 1, a4, 1, n8, 0, n3, n6, n7);
            if (r2.aj) {
                f2.a(r2.ab, r2.U, r2.af, n6, n3, n2);
            }
            return;
        }
        if (n4 == 0) {
            a a5 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(0, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, 0, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(E[n2], a5, n15, n3, by, n6, null, n14, 0, n8, n7);
            if (r2.aj) {
                f2.a(n3, n2, n6, n4, r2.ab);
            }
            return;
        }
        if (n4 == 1) {
            a a6 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(1, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, 1, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(x[n2], a6, n15, n3, by, n6, null, n14, 0, n8, n7);
            if (r2.aj) {
                f2.a(n3, n2, n6, n4, r2.ab);
            }
            return;
        }
        if (n4 == 2) {
            a a7;
            a a8;
            int n19 = n2 + 1 & 3;
            if (r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7)) {
                a8 = r2.a(2, 4 + n2, n10, n11, n12, n13, -1, -1);
                a7 = r2.a(2, n19, n10, n11, n12, n13, -1, -1);
            } else {
                a8 = new m(n7, 4 + n2, 2, n11, n12, n10, n13, r2.au, r2.at);
                a7 = new m(n7, n19, 2, n11, n12, n10, n13, r2.au, r2.at);
            }
            v_02.a(E[n2], a8, n15, n3, by, n6, a7, n14, E[n19], n8, n7);
            if (r2.aj) {
                f2.a(n3, n2, n6, n4, r2.ab);
            }
            return;
        }
        if (n4 == 3) {
            a a9 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(3, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, 3, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(x[n2], a9, n15, n3, by, n6, null, n14, 0, n8, n7);
            if (r2.aj) {
                f2.a(n3, n2, n6, n4, r2.ab);
            }
            return;
        }
        if (n4 == 9) {
            a a10 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(n4, n2, n10, n11, n12, n13, -1, -1) : new m(n7, n2, n4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, by, n14, 1, a10, 1, n8, 0, n3, n6, n7);
            if (r2.aj) {
                f2.a(r2.ab, r2.U, r2.af, n6, n3, n2);
            }
            return;
        }
        if (r2.ag) {
            if (n2 == 1) {
                n9 = n13;
                n13 = n12;
                n12 = n11;
                n11 = n10;
                n10 = n9;
            } else if (n2 == 2) {
                n9 = n13;
                n13 = n11;
                n11 = n9;
                n9 = n12;
                n12 = n10;
                n10 = n9;
            } else if (n2 == 3) {
                n9 = n13;
                n13 = n10;
                n10 = n11;
                n11 = n12;
                n12 = n9;
            }
        }
        if (n4 == 4) {
            a a11 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(4, 0, n10, n11, n12, n13, -1, -1) : new m(n7, 0, 4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, n3, n2 * 512, n8, 0, n14, a11, n6, by, 0, E[n2], n7);
            return;
        }
        if (n4 == 5) {
            n9 = 16;
            int n20 = v_02.a(n8, n6, n3);
            if (n20 > 0) {
                n9 = rs.d.r.c((int)v_02.b((int)n8, (int)n6, (int)n3)).ap;
            }
            a a12 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(4, 0, n10, n11, n12, n13, -1, -1) : new m(n7, 0, 4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, n3, n2 * 512, n8, u[n2] * n9, n14, a12, n6, by, z[n2] * n9, E[n2], n7);
            return;
        }
        if (n4 == 6) {
            a a13 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(4, 0, n10, n11, n12, n13, -1, -1) : new m(n7, 0, 4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, n3, n2, n8, 0, n14, a13, n6, by, 0, 256, n7);
            return;
        }
        if (n4 == 7) {
            a a14 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(4, 0, n10, n11, n12, n13, -1, -1) : new m(n7, 0, 4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, n3, n2, n8, 0, n14, a14, n6, by, 0, 512, n7);
            return;
        }
        if (n4 == 8) {
            a a15 = r2.au == -1 && r2.ad == null && !rs.l.f.e.d().l().a(n7) ? r2.a(4, 0, n10, n11, n12, n13, -1, -1) : new m(n7, 0, 4, n11, n12, n10, n13, r2.au, r2.at);
            v_02.a(n15, n3, n2, n8, 0, n14, a15, n6, by, 0, 768, n7);
        }
    }

    public static boolean a(int n2, byte[] byArray, int n3) {
        int n4;
        boolean bl = true;
        e e2 = new e(byArray);
        int n5 = -1;
        block0: while ((n4 = e2.f()) != 0) {
            n5 += n4;
            int n6 = 0;
            boolean bl2 = false;
            while (true) {
                int n7;
                if (bl2) {
                    n7 = e2.f();
                    if (n7 == 0) continue block0;
                    e2.y();
                    continue;
                }
                n7 = e2.f();
                if (n7 == 0) continue block0;
                int n8 = (n6 += n7 - 1) & 0x3F;
                int n9 = n6 >> 6 & 0x3F;
                int n10 = e2.y() >> 2;
                int n11 = n9 + n2;
                int n12 = n8 + n3;
                if (n11 <= 0 || n12 <= 0 || n11 >= 103 || n12 >= 103) continue;
                r r2 = rs.d.r.c(n5);
                boolean bl3 = h;
                bl3 = false;
                if (n10 == 22 && bl3 && !r2.ar && !r2.P && !rs.x.a(n5)) continue;
                bl &= r2.c();
                bl2 = true;
            }
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(int n2, rs.f[] fArray, int n3, v_0 v_02, byte[] byArray) {
        int n4;
        e e2 = new e(byArray);
        int n5 = -1;
        while ((n4 = e2.d()) != 0) {
            int n6;
            n5 += n4;
            int n7 = 0;
            while ((n6 = e2.e()) != 0) {
                int n8;
                int n9;
                int n10 = (n7 += n6 - 1) & 0x3F;
                int n11 = n7 >> 6 & 0x3F;
                int n12 = n7 >> 12 & 3;
                int n13 = e2.y();
                int n14 = n13 >> 2;
                int n15 = n13 & 3;
                int n16 = n11 + n2;
                int n17 = n10 + n3;
                if (n16 <= 0 || n17 <= 0 || n16 >= 103 || n17 >= 103 || n12 < 0 || n12 >= 4) continue;
                int n18 = n12;
                if ((this.D[1][n16][n17] & 2) == 2) {
                    --n18;
                }
                rs.f f2 = null;
                if (n18 >= 0) {
                    if (n18 >= fArray.length) continue;
                    f2 = fArray[n18];
                }
                if (Client.b(n9 = n16 + Client.eh, n8 = n17 + Client.ei, n18) || rs.f.a.r == a.b.d && n9 >= 2729 && n9 <= 2746 && n8 >= 3460 && n8 <= 3476 && n5 == 1092 && n14 == 10 || n9 == 2958 && n8 == 3820 && n5 == 1516 || n9 == 2958 && n8 == 3821 && n5 == 1519 || n5 == 1032 || n5 == 1596 || n5 == 1597 || n5 == 2038 || n5 == 11699 || n5 == 28928 || n9 == 3336 && n8 == 3896 || n9 == 3337 && n8 == 3896 || n5 == 15516 || n5 == 15514 || n5 == 24381 || n9 == 3084 && n8 == 3512 && n5 == 24123 || n9 == 3084 && n8 == 3510 && n5 == 26962 || n9 == 3084 && n8 == 3509 && n5 == 26962 || n9 == 3078 && n8 == 3510 && n5 == 26957 || n9 == 3081 && n8 == 3510 && n5 == 26957 || n9 == 3080 && n8 == 3510 && n5 == 26961 || n5 == 26945 || (n9 == 3091 && n8 == 3495 || n9 == 3092 && n8 == 3496 || n9 == 3090 && n8 == 3496 || n9 == 3090 && n8 == 3494) && (n5 == 26956 || n5 == 26959) || (n9 == 3095 && n8 == 3499 || n9 == 3095 && n8 == 3498) && (n5 == 26970 || n5 == 26956) || n9 == 3100 && n8 == 3513 && n14 == 10 || n9 == 3096 && n8 == 3501 && n5 == 1276 || n9 == 3085 && n8 == 3506 && n5 == 14507 || n5 == 10802 || n5 == 10801 || n5 == 10800 || n5 == 10799) continue;
                if (n5 == 5582) {
                    n5 = 12110;
                }
                if (n9 == 3169 && n8 == 9572 || n5 == 26690 || n5 == 26825 || n5 == 7127 || n5 == 14209 || n5 == 26827 || n5 == 26828 || n5 == 26829 || n5 == 26353 || n5 == 26357 || n5 == 26349 || n5 == 26356 || n5 == 26352 || n5 == 26323 || n5 == 26327) continue;
                if (n5 == 733) {
                    n14 = 0;
                }
                boolean bl = true;
                for (int[] nArray : a) {
                    if (n9 != nArray[0] || n8 != nArray[1]) continue;
                    bl = false;
                }
                if (n9 == 3079 && n8 == 3258 && n14 == 10 || n5 == 30018 || n5 == 29845 || n5 == 10653 || n9 >= 2588 && n9 <= 2596 && n8 >= 3159 && n8 <= 3165 || n9 >= 2584 && n9 <= 2587 && n8 >= 3156 && n8 <= 3159 || n9 >= 2962 && n9 <= 2990 && n8 >= 3744 && n8 <= 3759 || n9 == 2283 && n8 == 3321 || n9 == 2282 && n8 == 3315 || n9 == 3727 && n8 == 5104 || n9 == 3729 && n8 == 5071 || n9 == 3734 && n8 == 5086 || n9 == 3754 && n8 == 5079 || n9 == 3754 && n8 == 5104 || n9 == 2900 && n8 == 2725 || n9 == 3248 && n8 == 9364 || rs.f.a.r == a.b.d && (n5 >= 26893 && n5 <= 26895 || n5 >= 4736 && n5 <= 4741 || n5 == 1189) || n9 >= 3076 && n9 <= 3082 && n8 >= 3487 && n8 <= 3497 && (n9 != 3076 || n8 != 3487 || n14 == 22) || n9 == 3083 && (n8 == 3492 || n8 == 3491) || n14 == 10 && n9 >= 2816 && n9 <= 2824 && n8 >= 2932 && n8 <= 2941 && n9 != 2821 && n8 != 2934 || n9 >= 2867 && n9 <= 2871 && n8 >= 2980 && n8 <= 2984 && n18 != 0 && n14 != 22 || n12 == 0 && n9 >= 3091 && n9 <= 3100 && (n8 >= 3507 && n8 <= 3513 && (n5 == 26948 || n5 == 26885 || n5 == 26923 || n5 == 26946 || n5 == 26947 || n5 == 26955 || n5 == 26957 || n5 == 26958 || n5 == 26960 || n5 == 26961 || n5 == 26963 || n5 == 26982 || n5 == 26983) || n9 >= 3091 && n9 <= 3092 && n8 == 3513 || n9 >= 3094 && n9 <= 3095 && n8 == 3510 || n9 == 3092 && n8 == 3511 || n9 == 3097 && n8 == 3513) || n9 >= 3103 && n9 <= 3113 && n8 >= 3686 && n8 <= 3694 || n9 >= 3040 && n9 <= 3041 && n8 >= 10307 && n8 <= 10308 || n9 >= 3022 && n9 <= 3023 && n8 >= 10311 && n8 <= 10312 || n9 >= 3044 && n9 <= 3045 && n8 >= 10341 && n8 <= 10342 || !bl) continue;
                int n19 = (n9 >> 6) * 256 + (n8 >> 6);
                int n20 = n19 != 12693 && n19 != 12949 && this.b(n16, n17, n12) ? 1 : 0;
                try {
                    this.a(n17, v_02, f2, n14, n12, n16, n5, n15);
                }
                finally {
                    if (n20 == 0) continue;
                    h = true;
                }
            }
        }
    }

    public boolean b(int n2, int n3, int n4) {
        int n5;
        if (rs.d.h.a != h.a.c) {
            return false;
        }
        if (h && (n5 = p[n4][n2][n3] & rs.x.a()) > 0 && n5 - 1 < rs.d.t.b.length) {
            t t2 = rs.d.t.b[n5 - 1];
            if (t2.d == 0xFF00FF || t2.d == 0) {
                h = false;
                return true;
            }
        }
        return false;
    }

    static {
        q = (int)(Math.random() * 33.0) - 16;
        u = new int[]{1, 0, -1, 0};
        x = new int[]{16, 32, 64, 128};
        z = new int[]{0, -1, 0, 1};
        g = 99;
        h = true;
        E = new int[]{1, 2, 4, 8};
    }
}

