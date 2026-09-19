/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.t;

public class a
extends t {
    public a a;
    public a b;

    public final void a() {
        if (this.b != null) {
            this.b.a = this.a;
            this.a.b = this.b;
            this.a = null;
            this.b = null;
        }
    }
}

