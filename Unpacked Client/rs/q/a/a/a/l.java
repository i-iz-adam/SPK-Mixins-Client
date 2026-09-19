/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.q.a.a.a;

import javax.inject.Inject;
import rs.Client;
import rs.l.f.e;
import rs.q.a.a.a;

public class l
extends a {
    private final rs.l.f.a.b.a d = new rs.l.f.a.b.a("<img=9> Claim", "misc/treasure", "misc/treasure 2", 16753931, 7359745).a((int n2, int n3, int n4, boolean bl) -> Client.fE[106].g(n2 + 21, n3 + 21, n4 - 25)).a(() -> rs.n.a.a("::claimcoffer"));
    private final rs.l.f.a.b.a e = new rs.l.f.a.b.a("<img=288> View", "misc/mail 7", "misc/mail 8", 9568136, 26904).a((int n2, int n3, int n4, boolean bl) -> Client.fE[106].g(n2 + 21, n3 + 21, n4 - 25)).a(() -> rs.n.a.a("::mail"));
    @Inject
    private e f;

    @Override
    public void a() {
        int n2 = this.c();
        boolean bl = this.e() == 1;
        rs.l.f.a.b.a a2 = null;
        switch (n2) {
            case 1: {
                a2 = this.d;
                break;
            }
            case 2: {
                a2 = this.e;
            }
        }
        if (a2 != null) {
            if (bl) {
                if (!this.f.c(a2)) {
                    this.f.a(a2);
                }
            } else {
                this.f.b(a2);
            }
        }
    }
}

