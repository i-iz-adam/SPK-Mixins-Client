/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.c;

import rs.Client;
import rs.f.a;
import rs.n.c.c.a;
import rs.n.c.c.b;
import rs.n.c.c.c;

public class e
extends rs.q.a.a.a {
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 6;
    private static final int k = 7;

    @Override
    public void a() {
        b b2 = rs.n.c.c.a.h();
        c c2 = rs.n.c.c.a.i();
        int n2 = this.e();
        switch (n2) {
            case 0: {
                b2.a();
                break;
            }
            case 1: {
                int n3 = this.e();
                String string = this.h();
                if (n3 < 0 || n3 >= b.a.values().length) break;
                b2.a(b.a.values()[n3], string);
                break;
            }
            case 2: {
                int n4 = this.e();
                int n5 = this.e();
                if (n5 < 0 || n5 >= b.a.values().length) break;
                b2.a(n4, b.a.values()[n5]);
                break;
            }
            case 3: {
                if (this.e() == 1) {
                    c2.c();
                    break;
                }
                c2.b();
                break;
            }
            case 4: {
                c2.a(c.a.values()[this.e()]);
                break;
            }
            case 5: {
                b2.b();
                break;
            }
            case 6: {
                int n6 = 0;
                int n7 = 0;
                if (rs.f.a.ai == a.c.b) {
                    n6 = Client.ai / 2 - 356;
                    n7 = Client.ah / 2 - 230;
                }
                rs.l.f.e.d().g().b(20, 331 + n6 + 4, 291 + n7 + 10, 16764195);
                rs.l.f.e.d().g().b(10, 331 + n6 + 4, 291 + n7 + 10, 65315);
                break;
            }
            case 7: {
                b2.c();
                int n8 = this.e();
                if (n8 == -1) break;
                b2.a(n8, true);
            }
        }
    }
}

