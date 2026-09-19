/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

public class h {
    private h() {
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] a(float f2, float f3, float f4) {
        return new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] b(float f2, float f3, float f4) {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f2, f3, f4, 1.0f};
    }

    public static float[] a(float f2) {
        float f3 = (float)Math.sin(f2);
        float f4 = (float)Math.cos(f2);
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4, f3, 0.0f, 0.0f, -f3, f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] b(float f2) {
        float f3 = (float)Math.sin(f2);
        float f4 = (float)Math.cos(f2);
        return new float[]{f4, 0.0f, -f3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, f3, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] c(float f2, float f3, float f4) {
        return new float[]{2.0f / f2, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -2.0f * f4, 0.0f};
    }

    public static void a(float[] fArray, float[] fArray2) {
        float f2 = fArray2[0];
        float f3 = fArray2[1];
        float f4 = fArray2[2];
        float f5 = fArray2[3];
        float f6 = fArray2[4];
        float f7 = fArray2[5];
        float f8 = fArray2[6];
        float f9 = fArray2[7];
        float f10 = fArray2[8];
        float f11 = fArray2[9];
        float f12 = fArray2[10];
        float f13 = fArray2[11];
        float f14 = fArray2[12];
        float f15 = fArray2[13];
        float f16 = fArray2[14];
        float f17 = fArray2[15];
        float f18 = fArray[0];
        float f19 = fArray[4];
        float f20 = fArray[8];
        float f21 = fArray[12];
        fArray[0] = f18 * f2 + f19 * f3 + f20 * f4 + f21 * f5;
        fArray[4] = f18 * f6 + f19 * f7 + f20 * f8 + f21 * f9;
        fArray[8] = f18 * f10 + f19 * f11 + f20 * f12 + f21 * f13;
        fArray[12] = f18 * f14 + f19 * f15 + f20 * f16 + f21 * f17;
        f18 = fArray[1];
        f19 = fArray[5];
        f20 = fArray[9];
        f21 = fArray[13];
        fArray[1] = f18 * f2 + f19 * f3 + f20 * f4 + f21 * f5;
        fArray[5] = f18 * f6 + f19 * f7 + f20 * f8 + f21 * f9;
        fArray[9] = f18 * f10 + f19 * f11 + f20 * f12 + f21 * f13;
        fArray[13] = f18 * f14 + f19 * f15 + f20 * f16 + f21 * f17;
        f18 = fArray[2];
        f19 = fArray[6];
        f20 = fArray[10];
        f21 = fArray[14];
        fArray[2] = f18 * f2 + f19 * f3 + f20 * f4 + f21 * f5;
        fArray[6] = f18 * f6 + f19 * f7 + f20 * f8 + f21 * f9;
        fArray[10] = f18 * f10 + f19 * f11 + f20 * f12 + f21 * f13;
        fArray[14] = f18 * f14 + f19 * f15 + f20 * f16 + f21 * f17;
        f18 = fArray[3];
        f19 = fArray[7];
        f20 = fArray[11];
        f21 = fArray[15];
        fArray[3] = f18 * f2 + f19 * f3 + f20 * f4 + f21 * f5;
        fArray[7] = f18 * f6 + f19 * f7 + f20 * f8 + f21 * f9;
        fArray[11] = f18 * f10 + f19 * f11 + f20 * f12 + f21 * f13;
        fArray[15] = f18 * f14 + f19 * f15 + f20 * f16 + f21 * f17;
    }
}

