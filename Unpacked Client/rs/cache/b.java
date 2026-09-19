/*
 * Decompiled with CFR 0.152.
 */
package rs.cache;

import java.io.RandomAccessFile;
import rs.cache.a;

public class b {
    private final a[] a;
    private RandomAccessFile b;
    private final RandomAccessFile[] c = new RandomAccessFile[5];

    public b() {
        this.a = new a[5];
    }

    public void a(String string, String string2) {
        int n2;
        try {
            this.b = new RandomAccessFile(rs.v.a.f() + string, "rw");
            for (n2 = 0; n2 < 5; ++n2) {
                this.c[n2] = new RandomAccessFile(rs.v.a.f() + string2 + n2, "rw");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.a[n2] = new a(this.b, this.c[n2], n2 + 1);
        }
    }

    public a[] a() {
        return this.a;
    }
}

