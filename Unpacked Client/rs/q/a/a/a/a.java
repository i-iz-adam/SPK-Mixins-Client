/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import rs.Client;
import rs.n.c.ag_0;
import rs.n.e;

public class a
extends rs.q.a.a.a {
    @Override
    public void a() {
        int n2 = this.e();
        if (n2 == 1) {
            Client.cT = this.c();
        } else if (n2 == 2) {
            boolean bl;
            boolean bl2 = bl = this.e() == 1;
            if (bl) {
                e.H[12929].aG = e.j(14, "magic/on");
                e.H[12929].N = "Infernal barrage";
                e.H[12931].at = "Level 92 : Infernal barrage";
                e.H[12911].aG = e.j(16, "magic/on");
                e.H[12911].N = "Infernal blitz";
                e.H[12913].at = "Level 80 : Infernal blitz";
            } else {
                e.H[12929].aG = e.j(13, "magic/on");
                e.H[12929].N = "Blood barrage";
                e.H[12931].at = "Level 92 : Blood barrage";
                e.H[12911].aG = e.j(15, "magic/on");
                e.H[12911].N = "Infernal blitz";
                e.H[12913].at = "Level 80 : Blood blitz";
            }
        } else if (n2 == 3) {
            Client.dx = this.c();
        } else if (n2 == 4) {
            this.c.dW = this.h();
            this.c.gb = false;
            this.c.fN = 1;
            this.c.dY = "";
            Client.fM = true;
        } else if (n2 == 5) {
            int n3 = this.e();
            int n4 = this.e();
            int n5 = this.e();
        } else if (n2 == 6) {
            this.c.v.i = this.e() == 1;
        } else if (n2 == 7) {
            Client.bC = this.c();
            Client.bE = this.c();
            Client.bG = this.c();
            Client.bF = this.c();
            Client.bH = this.c();
            Client.bD = false;
        } else if (n2 == 8) {
            ag_0.c = this.e() == 1;
        }
    }
}

