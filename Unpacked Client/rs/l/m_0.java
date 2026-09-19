/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

/*
 * Renamed from rs.l.m
 */
public final class m_0 {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = 0;
    private static final int l = 256;
    private static final int m = 255;
    private static final int n = 21;
    private static final long o = 40L;
    public static final int d = 256;
    public static final int e = 512;
    public static final int f = 768;
    public static final int g = 1024;
    public static final int h = 1280;
    public static final int i = 1536;
    public static final int j = 1792;
    public static final int k = 2048;
    private static final int[][] p = new int[9][256];

    private m_0() {
    }

    public static int a() {
        return (int)(System.nanoTime() / 1000000L / 40L & 0xFFL);
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = n2 + (n4 & 0xFF) + n3 * 21 & 0xFF;
        return p[n4 / 256][n5];
    }

    public static int a(String string, int n2) {
        char c2;
        if (string.startsWith("@glo@", n2)) {
            return 0;
        }
        if (n2 + 5 < string.length() && string.charAt(n2) == '@' && string.charAt(n2 + 1) == 'g' && string.charAt(n2 + 2) == 'l' && string.charAt(n2 + 3) == 'o' && string.charAt(n2 + 5) == '@' && (c2 = string.charAt(n2 + 4)) >= '2' && c2 <= '9') {
            return (c2 - 49) * 256;
        }
        return -1;
    }

    public static int a(String string, int n2, int n3) {
        int n4;
        int n5 = n2 - n3 - 1;
        if (n5 == 3 && string.charAt(n3 + 1) == 'g' && string.charAt(n3 + 2) == 'l' && string.charAt(n3 + 3) == 'o') {
            return 0;
        }
        if (n5 == 4 && string.charAt(n3 + 1) == 'g' && string.charAt(n3 + 2) == 'l' && string.charAt(n3 + 3) == 'o' && (n4 = string.charAt(n3 + 4)) >= 50 && n4 <= 57) {
            return (n4 - 49) * 256;
        }
        if (n5 == 4 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'g' && string.charAt(n3 + 3) == 'l' && string.charAt(n3 + 4) == 'o') {
            return -2;
        }
        if (n5 == 5 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'g' && string.charAt(n3 + 3) == 'l' && string.charAt(n3 + 4) == 'o' && (n4 = string.charAt(n3 + 5)) >= 50 && n4 <= 57) {
            return -2;
        }
        if (n5 <= 4 || string.charAt(n3 + 1) != 'g' || string.charAt(n3 + 2) != 'l' || string.charAt(n3 + 3) != 'o' || string.charAt(n3 + 4) != '=') {
            return -1;
        }
        n4 = n3 + 5;
        int n6 = n2 - n4;
        int n7 = n6 >= 6 ? 16 : 10;
        int n8 = 0;
        for (int i2 = n4; i2 < n2; ++i2) {
            int n9 = Character.digit(string.charAt(i2), n7);
            if (n9 == -1) {
                return -1;
            }
            n8 = n8 * n7 + n9;
        }
        return m_0.a(n8);
    }

    private static int a(int n2) {
        int n3;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        int n7 = Math.max(n4, Math.max(n5, n6));
        int n8 = n7 - (n3 = Math.min(n4, Math.min(n5, n6)));
        if (n8 == 0) {
            return 0;
        }
        int n9 = n7 == n4 ? 43 * (n5 - n6) / n8 : (n7 == n5 ? 85 + 43 * (n6 - n4) / n8 : 171 + 43 * (n4 - n5) / n8);
        return n9 & 0xFF;
    }

    private static int b(int n2) {
        int n3;
        int n4 = n2 / 43;
        int n5 = n3 = (n2 - n4 * 43) * 6;
        int n6 = 255 - n3;
        switch (n4) {
            case 0: {
                return 0xFF0000 | n5 << 8;
            }
            case 1: {
                return n6 << 16 | 0xFF00;
            }
            case 2: {
                return 0xFF00 | n5;
            }
            case 3: {
                return n6 << 8 | 0xFF;
            }
            case 4: {
                return n5 << 16 | 0xFF;
            }
        }
        return 0xFF0000 | n6;
    }

    private static int a(int n2, int n3, int n4, int n5) {
        int n6 = n2 * 3;
        int n7 = n6 >>> 8;
        int n8 = n6 & 0xFF;
        if (n7 == 0) {
            return m_0.b(n3, n4, n8);
        }
        if (n7 == 1) {
            return m_0.b(n4, n5, n8);
        }
        return m_0.b(n5, n3, n8);
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 * 4;
        int n8 = n7 >>> 8;
        int n9 = n7 & 0xFF;
        if (n8 == 0) {
            return m_0.b(n3, n4, n9);
        }
        if (n8 == 1) {
            return m_0.b(n4, n5, n9);
        }
        if (n8 == 2) {
            return m_0.b(n5, n6, n9);
        }
        return m_0.b(n6, n3, n9);
    }

    private static int b(int n2, int n3, int n4) {
        int n5 = 255 - n4;
        int n6 = ((n2 >> 16 & 0xFF) * n5 + (n3 >> 16 & 0xFF) * n4) / 255;
        int n7 = ((n2 >> 8 & 0xFF) * n5 + (n3 >> 8 & 0xFF) * n4) / 255;
        int n8 = ((n2 & 0xFF) * n5 + (n3 & 0xFF) * n4) / 255;
        return n6 << 16 | n7 << 8 | n8;
    }

    static {
        for (int i2 = 0; i2 < 256; ++i2) {
            m_0.p[0][i2] = m_0.b(i2);
            int n2 = 255 - Math.min(255, Math.abs(128 - i2) * 2);
            m_0.p[1][i2] = n2 << 16 | n2 << 8 | n2;
            m_0.p[2][i2] = m_0.a(i2, 0xFF0000, 0xFF8000, 0xFFFF00);
            m_0.p[3][i2] = m_0.a(i2, 65535, 255, 0x8000FF);
            m_0.p[4][i2] = m_0.a(i2, 65280, 255, 65535);
            m_0.p[5][i2] = m_0.a(i2, 0x8000FF, 0xFF0000, 0xFF8000);
            m_0.p[6][i2] = m_0.a(i2, 0xFF4FCF, 10170623, 26367);
            m_0.p[7][i2] = m_0.a(i2, 14129920, 0xFFFF33, 16761856);
            m_0.p[8][i2] = m_0.a(i2, 49151, 16720343, 7995647, 3800852);
        }
    }
}

