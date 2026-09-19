/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.l.e.l;

public class m {
    private l a = null;
    private List<l> b = new ArrayList<l>();
    private Client c;

    public m(Client client) {
        this.c = client;
    }

    public void a() {
        if (this.a == null) {
            if (!this.b.isEmpty()) {
                this.a = new l(this.b.get((int)0).a);
                this.b.remove(0);
            }
        } else {
            int n2 = this.c.gm.c(this.a.a);
            if (this.a.b <= -1 * n2) {
                this.a = null;
                return;
            }
            --this.a.b;
            this.c.gm.b(this.a.a, this.a.b, this.a.c, 0xFFFFFF, 0);
        }
    }

    public void a(String string) {
        this.b.add(new l(string));
    }
}

