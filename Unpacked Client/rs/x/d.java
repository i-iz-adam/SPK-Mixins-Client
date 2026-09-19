/*
 * Decompiled with CFR 0.152.
 */
package rs.x;

import java.util.ArrayList;
import java.util.List;
import rs.x.c;

public class d {
    private final List<c> a = new ArrayList<c>();
    private final long b;
    private final int c;

    public d(int n2, long l2) {
        this.c = n2;
        this.b = l2;
    }

    public void a() {
        if (this.b == 0L) {
            return;
        }
        ArrayList<c> arrayList = new ArrayList<c>();
        for (c c2 : this.a) {
            if (System.currentTimeMillis() - c2.c() < this.b) continue;
            arrayList.add(c2);
        }
        for (c c2 : arrayList) {
            this.a.remove(c2);
        }
    }

    public int b() {
        return this.c;
    }

    public void a(int n2, long l2) {
        c c2 = new c(this.c, n2, l2);
        this.a.add(c2);
    }

    public int c() {
        int n2 = 0;
        for (c c2 : this.a) {
            n2 += c2.b();
        }
        return n2;
    }

    public int d() {
        int n2 = 0;
        for (c c2 : this.a) {
            ++n2;
        }
        return n2;
    }
}

