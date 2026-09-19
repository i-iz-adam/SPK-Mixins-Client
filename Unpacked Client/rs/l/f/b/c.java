/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.b;

import rs.Client;
import rs.a.k;
import rs.l.f.b;

public abstract class c
extends b {
    protected k e;

    @Override
    public void b() {
        this.e = null;
    }

    protected boolean k() {
        if (this.e == null || this.a == null) {
            return false;
        }
        return this.e == Client.eR;
    }

    public k l() {
        return this.e;
    }

    public void a(k k2) {
        this.e = k2;
    }
}

