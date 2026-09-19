/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.b;

import java.util.ArrayList;
import rs.Client;
import rs.gui.Launcher;
import rs.l.f_0;
import rs.n.a.a.c;
import rs.n.c.b.a;
import rs.n.c.b.b;
import rs.n.e;

public class d
extends rs.q.a.a.a {
    @Override
    public void a() {
        int n2 = this.e();
        switch (n2) {
            case 0: {
                rs.n.c.b.a.e.b();
                rs.n.c.b.a.bJ = 0;
                rs.n.c.b.b.c = 0;
                rs.n.c.b.a.bI = null;
                e.l((int)57220).bv = false;
                break;
            }
            case 1: {
                String string = this.h();
                rs.n.c.b.b.a(rs.n.c.b.a.bJ, string);
                ++rs.n.c.b.a.bJ;
                break;
            }
            case 2: {
                double d2 = (double)this.g() / 100.0;
                double d3 = 367.0 * d2;
                e.l((int)57222).E = new f_0("event/task 2", (int)d3, 15);
                break;
            }
            case 3: {
                e.l((int)57223).bf = this.e() == 1;
                break;
            }
            case 4: {
                e.l((int)57220).bv = this.e() == 1;
                Launcher.n().o();
                Client.bP = 149;
                Launcher.n().o();
                Client.bQ = -1;
                break;
            }
            case 5: {
                String string = this.h();
                int n3 = this.g();
                rs.n.c.b.b.a(n3, string);
                break;
            }
            case 6: {
                int n4;
                rs.n.c.b.a.bI = this.h();
                if (!rs.n.c.b.a.c.a((Object)rs.n.c.b.a.bI)) break;
                e.l((int)56997).V = n4 = rs.n.c.b.a.c.b((Object)rs.n.c.b.a.bI);
                e.l((int)57016).V = n4;
                break;
            }
            case 7: {
                int n5;
                ArrayList<rs.n.d.b> arrayList = new ArrayList<rs.n.d.b>();
                for (rs.n.d.b b2 : rs.n.c.b.a.e.d()) {
                    if (!(e.H[b2.c()] instanceof rs.n.a.a.a)) continue;
                    arrayList.add(b2);
                }
                for (rs.n.d.b b2 : arrayList) {
                    rs.n.a.a.a a2 = (rs.n.a.a.a)e.l(b2.c());
                    a2.o(rs.n.c.b.a.e.d().size());
                    rs.n.c.b.a.e.a(rs.n.a.a.c.c).b(b2.c(), 0, a2.aR + 1);
                }
                try {
                    rs.n.c.b.a.e.a();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                for (int i2 = n5 = 57017 + rs.n.c.b.a.bJ * 2; i2 <= 57217; i2 += 2) {
                    e.l((int)i2).at = "";
                    e.l((int)(i2 + 1)).bf = false;
                    e.l((int)i2).br = 0;
                    e.l((int)i2).bt = 0;
                    e.l((int)i2).bs = 0;
                }
                e.l((int)57016).aH = rs.n.c.b.b.c + 25;
                break;
            }
            case 8: {
                int n6;
                e.l((int)56997).V = n6 = this.c();
                e.l((int)57016).V = n6;
                break;
            }
            case 9: {
                e.l((int)56997).V = 0;
                e.l((int)57016).V = 0;
                rs.n.c.b.a.c.c((Object)rs.n.c.b.a.bI);
                break;
            }
            case 10: {
                int n7 = this.e();
                String string = this.h();
                int n8 = rs.n.c.b.b.b;
                e.l((int)n8).bx = true;
                e.l((int)n8).by = n7 > 0 ? e.l((int)n8).by + "\n" + string : string;
            }
        }
    }
}

