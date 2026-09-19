/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

class c {
    private FloatBuffer a = c.b(65536);

    c() {
    }

    void a(float f2, float f3, float f4, float f5) {
        this.a.put(f2).put(f3).put(f4).put(f5);
    }

    public void a(float[] fArray) {
        this.a.put(fArray);
    }

    public void a(float[] fArray, int n2, int n3) {
        this.a.put(fArray, n2, n3);
    }

    void a() {
        this.a.flip();
    }

    void b() {
        this.a.clear();
    }

    void a(int n2) {
        int n3;
        int n4 = this.a.capacity();
        if (n4 - (n3 = this.a.position()) < n2) {
            while ((n4 *= 2) - n3 < n2) {
            }
            FloatBuffer floatBuffer = c.b(n4);
            this.a.flip();
            floatBuffer.put(this.a);
            this.a = floatBuffer;
        }
    }

    FloatBuffer c() {
        return this.a;
    }

    static FloatBuffer b(int n2) {
        return ByteBuffer.allocateDirect(n2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
}

