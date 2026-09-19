/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.c;
import rs.l.s;
import rs.l.w;

public final class v {
    public static final int a = 15;
    public static final int b = 0;
    private static final int c = 1536;
    private static final int d = 512;
    private static final int e = 20;
    private static final int f = 300;
    private static final int g = 9;
    private static final int h = 40;
    private static final int i = 0x181818;
    private static final int j = 0x606060;
    private static final int k = 49151;
    private static final int l = 256;
    private static final String[] m = new String[256];
    private static final int[] n = new int[256];
    private static final int[] o = new int[256];
    private static final a[] p = new a[256];
    private static final int[] q = new int[]{0, 0, 15022389, 2201331, 4431943, 16757504, 0, 11225020};
    private static final int[][] r = new int[][]{null, null, {0xFF3030, 0x700000}, {1402367, 0x66CCFF}, {43067, 0x7DFF7D}, {14260736, 16772469}, null, {8072447, 13868287}};

    private v() {
    }

    public static a a(String string, int n2, int n3) {
        String string2;
        int n4;
        int n5;
        if (string == null || n2 < 0 || n3 <= n2) {
            return null;
        }
        int n6 = System.identityHashCode(string) * 31 + n2 * 17 + n3 & 0xFF;
        if (m[n6] == string && n[n6] == n2 && o[n6] == n3) {
            return p[n6];
        }
        int n7 = n2 + 1;
        if (!v.a(string, n7, "pbar")) {
            return null;
        }
        int n8 = 1;
        if ((n7 += 4) < n3 && string.charAt(n7) >= '2' && string.charAt(n7) <= '7') {
            n8 = string.charAt(n7++) - 48;
        }
        if (n7 >= n3 || string.charAt(n7++) != '=') {
            return null;
        }
        int n9 = v.a(string, ':', n7, n3);
        if (n9 == -1) {
            return null;
        }
        int n10 = v.a(string, ':', n9 + 1, n3);
        int n11 = v.c(string, n7, n9);
        if (n11 < 0) {
            return null;
        }
        int n12 = n10 == -1 ? n3 : n10;
        int n13 = v.a(string, n9 + 1, n12, (n11 = Math.max(20, Math.min(300, n11))) - 4);
        if (n13 < 0) {
            return null;
        }
        int n14 = 0x181818;
        int n15 = 0x606060;
        int n16 = 15;
        if (n8 == 1) {
            n5 = 49151;
            if (n10 != -1) {
                int n17 = v.a(string, ':', n10 + 1, n3);
                n4 = n17 == -1 ? n3 : n17;
                n5 = v.d(string, n10 + 1, n4);
                if (n5 < 0) {
                    return null;
                }
                if (n17 != -1) {
                    int n18 = v.a(string, ':', n17 + 1, n3);
                    int n19 = n18 == -1 ? n3 : n18;
                    n14 = v.d(string, n17 + 1, n19);
                    if (n14 < 0) {
                        return null;
                    }
                    if (n18 != -1) {
                        int n20 = v.a(string, ':', n18 + 1, n3);
                        int n21 = n20 == -1 ? n3 : n20;
                        n15 = v.d(string, n18 + 1, n21);
                        if (n15 < 0) {
                            return null;
                        }
                        if (n20 != -1 && (n16 = v.b(string, n20 + 1, n3)) < 0) {
                            return null;
                        }
                    }
                }
            }
        } else {
            if (n10 != -1 && (n16 = v.b(string, n10 + 1, n3)) < 0) {
                return null;
            }
            n5 = q[n8];
        }
        if ((n4 = string.indexOf(string2 = "</pbar" + (n8 == 1 ? "" : Integer.toString(n8)) + ">", n3 + 1)) == -1) {
            return v.a(string, n2, n3, n6, new a(n11, n16, n13, n5, n14, n15, "", n3, n8, null));
        }
        String string3 = string.substring(n3 + 1, n4);
        return v.a(string, n2, n3, n6, new a(n11, n16, n13, n5, n14, n15, string3, n4 + string2.length() - 1, n8, null));
    }

    private static a a(String string, int n2, int n3, int n4, a a2) {
        v.m[n4] = string;
        v.n[n4] = n2;
        v.o[n4] = n3;
        v.p[n4] = a2;
        return a2;
    }

    public static void a(a a2, int n2, int n3) {
        rs.l.c.a(a2.b, n3, n2, a2.f, a2.a);
        rs.l.c.a(a2.b - 2, n3 + 1, n2 + 1, a2.e, a2.a - 2);
        if (a2.i >= 2 && a2.c > 0) {
            long l2 = System.nanoTime() / 1000000L / 8L;
            int n4 = a2.i == 6 ? 1536 : 512;
            int n5 = (int)(l2 % (long)n4);
            for (int i2 = 0; i2 < a2.c; ++i2) {
                int n6 = (n5 + i2 * n4 / Math.max(1, a2.c)) % n4;
                int n7 = a2.i == 6 ? v.a(n6) : v.a(a2.i, n6);
                rs.l.c.a(a2.b - 4, n3 + 2, n2 + 2 + i2, n7, 1);
            }
            s.c();
        } else if (a2.c > 0) {
            rs.l.c.a(a2.b - 4, n3 + 2, n2 + 2, a2.d, a2.c);
        }
    }

    private static int b(String string, int n2, int n3) {
        int n4 = v.c(string, n2, n3);
        return n4 < 0 ? -1 : Math.max(9, Math.min(40, n4));
    }

    private static int a(String string, int n2, int n3, int n4) {
        long l2;
        long l3;
        int n5 = v.a(string, '/', n2, n3);
        if (n5 == -1) {
            l3 = v.c(string, n2, n3);
            l2 = 100L;
        } else {
            l3 = v.c(string, n2, n5);
            l2 = v.c(string, n5 + 1, n3);
        }
        if (l3 < 0L || l2 <= 0L) {
            return -1;
        }
        double d2 = Math.max(0.0, Math.min(1.0, (double)l3 / (double)l2));
        return (int)Math.round((double)n4 * d2);
    }

    private static int c(String string, int n2, int n3) {
        if (n2 >= n3) {
            return -1;
        }
        int n4 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') {
                return -1;
            }
            if ((n4 = n4 * 10 + c2 - 48) <= 1000000) continue;
            return -1;
        }
        return n4;
    }

    private static int d(String string, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        if (n2 >= n3 || n3 - n2 > 6) {
            return -1;
        }
        int n7 = n6 = n3 - n2 >= 6 ? 16 : 10;
        if (n6 == 10) {
            for (n5 = n2; n5 < n3; ++n5) {
                n4 = string.charAt(n5);
                if ((n4 < 97 || n4 > 102) && (n4 < 65 || n4 > 70)) continue;
                n6 = 16;
                break;
            }
        }
        n5 = 0;
        for (n4 = n2; n4 < n3; ++n4) {
            int n8 = Character.digit(string.charAt(n4), n6);
            if (n8 == -1) {
                return -1;
            }
            n5 = n5 * n6 + n8;
        }
        return n5 & 0xFFFFFF;
    }

    private static int a(int n2) {
        int n3 = n2 >>> 8;
        int n4 = n2 & 0xFF;
        switch (n3) {
            case 0: {
                return 0xFF0000 | n4 << 8;
            }
            case 1: {
                return 255 - n4 << 16 | 0xFF00;
            }
            case 2: {
                return 0xFF00 | n4;
            }
            case 3: {
                return 255 - n4 << 8 | 0xFF;
            }
            case 4: {
                return n4 << 16 | 0xFF;
            }
        }
        return 0xFF0000 | 255 - n4;
    }

    private static int a(int n2, int n3) {
        int[] nArray = r[n2];
        int n4 = n3 & 0xFF;
        return n3 < 256 ? v.a(nArray[0], nArray[1], n4) : v.a(nArray[1], nArray[0], n4);
    }

    private static int a(int n2, int n3, int n4) {
        int n5 = 255 - n4;
        int n6 = ((n2 >> 16 & 0xFF) * n5 + (n3 >> 16 & 0xFF) * n4) / 255;
        int n7 = ((n2 >> 8 & 0xFF) * n5 + (n3 >> 8 & 0xFF) * n4) / 255;
        int n8 = ((n2 & 0xFF) * n5 + (n3 & 0xFF) * n4) / 255;
        return n6 << 16 | n7 << 8 | n8;
    }

    private static int a(String string, char c2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (string.charAt(i2) != c2) continue;
            return i2;
        }
        return -1;
    }

    private static boolean a(String string, int n2, String string2) {
        if (n2 < 0 || n2 + string2.length() > string.length()) {
            return false;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            if (string.charAt(n2 + i2) == string2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final String g;
        public final int h;
        public final int i;

        private a(int n2, int n3, int n4, int n5, int n6, int n7, String string, int n8, int n9) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
            this.e = n6;
            this.f = n7;
            this.g = string;
            this.h = n8;
            this.i = n9;
        }

        /* synthetic */ a(int n2, int n3, int n4, int n5, int n6, int n7, String string, int n8, int n9, w w2) {
            this(n2, n3, n4, n5, n6, n7, string, n8, n9);
        }
    }
}

