/*
 * Decompiled with CFR 0.152.
 */
package rs.u;

public class h {
    public float[] a;
    public int b;

    public h(float[] fArray, int n2) {
        this.a = fArray;
        this.b = n2;
    }

    public static float a(float[] fArray, int n2, float f2) {
        float f3 = fArray[n2];
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            f3 = f2 * f3 + fArray[i2];
        }
        return f3;
    }

    static float[] a(int n2, float[] fArray) {
        float[] fArray2 = new float[1 + n2];
        for (int i2 = 1; i2 <= n2; ++i2) {
            fArray2[i2 - 1] = fArray[i2] * (float)i2;
        }
        return fArray2;
    }
}

