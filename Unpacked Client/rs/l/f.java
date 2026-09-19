/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Color;

public final class f {
    public static final int a = 63;
    public static final int b = 7;
    public static final int c = 127;
    private static float[] d = new float[3];

    public static short a(int n2, int n3, int n4) {
        return (short)((short)(n2 & 0x3F) << 10 | (short)(n3 & 7) << 7 | (short)(n4 & 0x7F));
    }

    public static int a(short s2) {
        return s2 >> 10 & 0x3F;
    }

    public static int b(short s2) {
        return s2 >> 7 & 7;
    }

    public static int c(short s2) {
        return s2 & 0x7F;
    }

    public static String d(short s2) {
        return String.format("%02Xh%Xs%02Xl", f.a(s2), f.b(s2), f.c(s2));
    }

    public static short a(int n2, double d2) {
        if (n2 == 1) {
            return 0;
        }
        d2 = 1.0 / d2;
        double d3 = (double)(n2 >> 16 & 0xFF) / 256.0;
        double d4 = (double)(n2 >> 8 & 0xFF) / 256.0;
        double d5 = (double)(n2 & 0xFF) / 256.0;
        d3 = Math.pow(d3, d2);
        d4 = Math.pow(d4, d2);
        d5 = Math.pow(d5, d2);
        Color.RGBtoHSB((int)(d3 * 256.0), (int)(d4 * 256.0), (int)(d5 * 256.0), d);
        double d6 = d[0];
        double d7 = d[2] - d[2] * d[1] / 2.0f;
        double d8 = ((double)d[2] - d7) / Math.min(d7, 1.0 - d7);
        return f.a((int)(Math.ceil(d6 * 64.0) % 63.0), (int)Math.ceil(d8 * 7.0), (int)Math.ceil(d7 * 127.0));
    }

    public static int b(int n2, int n3, int n4) {
        return (short)(n2 & 0x3F) << 10 | (short)(n3 & 7) << 7 | (short)(n4 & 0x7F);
    }

    public static int a(int n2) {
        if (n2 == 1) {
            return 0;
        }
        double d2 = (double)(n2 >> 16 & 0xFF) / 256.0;
        double d3 = (double)(n2 >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n2 & 0xFF) / 256.0;
        Color.RGBtoHSB((int)(d2 * 256.0), (int)(d3 * 256.0), (int)(d4 * 256.0), d);
        double d5 = d[0];
        double d6 = d[2] - d[2] * d[1] / 2.0f;
        double d7 = ((double)d[2] - d6) / Math.min(d6, 1.0 - d6);
        return f.b((int)(Math.ceil(d5 * 64.0) % 63.0), (int)Math.ceil(d7 * 7.0), (int)Math.ceil(d6 * 127.0));
    }
}

