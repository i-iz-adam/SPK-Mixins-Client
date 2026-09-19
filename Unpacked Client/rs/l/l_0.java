/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

/*
 * Renamed from rs.l.L
 */
public final class l_0 {
    public static final int a = 256;

    private l_0() {
    }

    public static int a(int n2) {
        if (n2 <= 0 || n2 >= 256) {
            return 0;
        }
        return n2;
    }

    public static int b(int n2) {
        return Math.max(0, Math.min(100, n2));
    }

    public static int a(int n2, int n3) {
        int n4 = l_0.a(n3);
        if (n4 == 0) {
            return n2;
        }
        int n5 = (n2 >> 10 & 0x3F) + (n4 * 64 + 255) / 256 & 0x3F;
        return n5 << 10 | n2 & 0x3FF;
    }

    public static int b(int n2, int n3) {
        return l_0.a(n2, n3, 100);
    }

    public static int a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = l_0.a(n3);
        int n8 = l_0.b(n4);
        if (n2 == 0 || n7 == 0 || n8 == 0) {
            return n2;
        }
        int n9 = n2 >> 16 & 0xFF;
        int n10 = n2 >> 8 & 0xFF;
        int n11 = n2 & 0xFF;
        int n12 = Math.max(n9, Math.max(n10, n11));
        int n13 = n12 - (n6 = Math.min(n9, Math.min(n10, n11)));
        if (n13 == 0) {
            return n2;
        }
        int n14 = n12 == n9 ? 256 * (n10 - n11) / n13 : (n12 == n10 ? 512 + 256 * (n11 - n9) / n13 : 1024 + 256 * (n9 - n10) / n13);
        if ((n14 = (n14 + n7 * 6) % 1536) < 0) {
            n14 += 1536;
        }
        int n15 = n12 == 0 ? 0 : n13 * 255 / n12;
        int n16 = n14 >> 8;
        int n17 = n14 & 0xFF;
        int n18 = n12 * (255 - n15) / 255;
        int n19 = n12 * (255 - n15 * n17 / 255) / 255;
        int n20 = n12 * (255 - n15 * (255 - n17) / 255) / 255;
        switch (n16) {
            case 0: {
                n5 = n12 << 16 | n20 << 8 | n18;
                break;
            }
            case 1: {
                n5 = n19 << 16 | n12 << 8 | n18;
                break;
            }
            case 2: {
                n5 = n18 << 16 | n12 << 8 | n20;
                break;
            }
            case 3: {
                n5 = n18 << 16 | n19 << 8 | n12;
                break;
            }
            case 4: {
                n5 = n20 << 16 | n18 << 8 | n12;
                break;
            }
            default: {
                n5 = n12 << 16 | n18 << 8 | n19;
            }
        }
        if (n8 == 100) {
            return n5;
        }
        int n21 = 100 - n8;
        int n22 = n5 >> 16 & 0xFF;
        int n23 = n5 >> 8 & 0xFF;
        int n24 = n5 & 0xFF;
        int n25 = (n9 * n21 + n22 * n8 + 50) / 100;
        int n26 = (n10 * n21 + n23 * n8 + 50) / 100;
        int n27 = (n11 * n21 + n24 * n8 + 50) / 100;
        return n25 << 16 | n26 << 8 | n27;
    }
}

