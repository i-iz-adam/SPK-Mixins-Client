/*
 * Decompiled with CFR 0.152.
 */
package rs;

public class p {
    private static final int a = 2048;
    private static final double b = 0.17578125;
    private static final double c = Math.toRadians(0.17578125);
    private static final int[] d = new int[2048];
    private static final int[] e = new int[2048];

    public static int a(int n2, int n3) {
        int n4 = p.a(n2 + 45365, n3 + 91923, 4) - 128 + (p.a(10294 + n2, n3 + 37821, 2) - 128 >> 1) + (p.a(n2, n3, 1) - 128 >> 2);
        if ((n4 = 35 + (int)((double)n4 * 0.3)) < 10) {
            n4 = 10;
        } else if (n4 > 60) {
            n4 = 60;
        }
        return n4;
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = n2 / n4;
        int n6 = n2 & n4 - 1;
        int n7 = n3 / n4;
        int n8 = n3 & n4 - 1;
        int n9 = p.b(n5, n7);
        int n10 = p.b(n5 + 1, n7);
        int n11 = p.b(n5, n7 + 1);
        int n12 = p.b(1 + n5, 1 + n7);
        int n13 = p.a(n9, n10, n6, n4);
        int n14 = p.a(n11, n12, n6, n4);
        return p.a(n13, n14, n8, n4);
    }

    public static int b(int n2, int n3) {
        int n4 = p.c(n2 - 1, n3 - 1) + p.c(n2 + 1, n3 - 1) + p.c(n2 - 1, 1 + n3) + p.c(n2 + 1, n3 + 1);
        int n5 = p.c(n2 - 1, n3) + p.c(1 + n2, n3) + p.c(n2, n3 - 1) + p.c(n2, 1 + n3);
        int n6 = p.c(n2, n3);
        return n6 / 4 + n5 / 8 + n4 / 16;
    }

    public static int c(int n2, int n3) {
        int n4 = n2 + n3 * 57;
        n4 ^= n4 << 13;
        return (n4 * (n4 * n4 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }

    public static int a(int n2, int n3, int n4, int n5) {
        int n6 = 65536 - e[1024 * n4 / n5] >> 1;
        return (n6 * n3 >> 16) + (n2 * (65536 - n6) >> 16);
    }

    static {
        for (int i2 = 0; i2 < 2048; ++i2) {
            p.d[i2] = (int)(65536.0 * Math.sin((double)i2 * c));
            p.e[i2] = (int)(65536.0 * Math.cos((double)i2 * c));
        }
    }
}

