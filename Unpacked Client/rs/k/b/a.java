/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package rs.k.b;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.Stack;
import org.lwjgl.system.MemoryUtil;
import rs.k.e;

public class a {
    private final Stack<Long> a = new Stack();
    private final long b;
    private boolean c;
    private final e d;

    public a(long l2, e e2) {
        this.b = l2;
        this.c = false;
        this.d = e2;
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public void b() {
        if (this.c) {
            return;
        }
        long l2 = 294912L;
        long l3 = this.b;
        try {
            while (l3 - l2 >= 0L) {
                this.a.push(MemoryUtil.nmemAllocChecked((long)l2));
                l3 -= l2;
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            // empty catch block
        }
        this.c = true;
    }

    public void c() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            Long l2 = (Long)iterator.next();
            MemoryUtil.nmemFree((long)l2);
            iterator.remove();
        }
    }

    public void a(IntBuffer intBuffer) {
        this.a.push(MemoryUtil.memAddress((IntBuffer)intBuffer));
    }

    public IntBuffer a(int n2) {
        if (this.a.isEmpty()) {
            return null;
        }
        return MemoryUtil.memIntBuffer((long)this.a.pop(), (int)n2);
    }

    public void a(FloatBuffer floatBuffer) {
        this.a.push(MemoryUtil.memAddress((FloatBuffer)floatBuffer));
    }

    public FloatBuffer b(int n2) {
        if (this.a.isEmpty()) {
            return null;
        }
        return MemoryUtil.memFloatBuffer((long)this.a.pop(), (int)n2);
    }
}

