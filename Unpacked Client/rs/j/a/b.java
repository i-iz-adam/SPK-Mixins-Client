/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  javax.inject.Inject
 */
package rs.j.a;

import com.google.inject.Singleton;
import javax.inject.Inject;
import rs.Client;
import rs.j.a.d;

@Singleton
public class b {
    private final Client a;
    private d b;

    @Inject
    public b(Client client) {
        this.a = client;
    }

    public d a(String string) {
        this.b = new d(this).a(string);
        return this.b;
    }

    public void a() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    public Client b() {
        return this.a;
    }

    public d c() {
        return this.b;
    }
}

