/*
 * Decompiled with CFR 0.152.
 */
package rs.l.c;

import rs.Client;

public abstract class d {
    protected Client a;
    protected boolean b;

    public d(Client client) {
        this.a = client;
    }

    public abstract void a();

    public abstract boolean b();

    public void c() {
        this.b = false;
    }

    public boolean d() {
        return this.b;
    }
}

