/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

class d {
    private IntBuffer a = d.b(65536);

    d() {
    }

    public void a(int n2, int n3, int n4) {
        this.a.put(n2).put(n3).put(n4);
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.a.put(n2).put(n3).put(n4).put(n5);
    }

    public void a(int[] nArray) {
        this.a.put(nArray);
    }

    public void a(int[] nArray, int n2, int n3) {
        this.a.put(nArray, n2, n3);
    }

    void a() {
        this.a.flip();
    }

    void b() {
        this.a.clear();
    }

    public d a(int n2) {
        int n3;
        int n4 = this.a.capacity();
        if (n4 - (n3 = this.a.position()) < n2) {
            while ((n4 *= 2) - n3 < n2) {
            }
            IntBuffer intBuffer = d.b(n4);
            this.a.flip();
            intBuffer.put(this.a);
            this.a = intBuffer;
        }
        return this;
    }

    IntBuffer c() {
        return this.a;
    }

    static IntBuffer b(int n2) {
        return ByteBuffer.allocateDirect(n2 * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
    }
}

