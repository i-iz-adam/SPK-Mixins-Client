/*
 * Decompiled with CFR 0.152.
 */
package rs.g;

import rs.Client;
import rs.g.b;
import rs.g.e;
import rs.gui.Launcher;

public class d
extends b {
    long a = System.nanoTime();
    private long b;

    @Override
    public void a() {
        this.a = System.nanoTime();
    }

    @Override
    public int a(int n2, int n3) {
        Client client = Launcher.n().o();
        long l2 = 0L;
        boolean bl = client.au();
        boolean bl2 = client.cc;
        if (bl && bl2) {
            long l3 = System.nanoTime();
            if (l3 >= this.b() && l3 >= this.b) {
                long l4;
                long l5;
                if (l2 > 0L) {
                    l5 = l3 - this.b;
                    l4 = l2 - l5;
                    if ((l4 /= 1000000L) > 0L) {
                        try {
                            if (l4 % 10L == 0L) {
                                Thread.sleep(l4 - 1L);
                                Thread.sleep(1L);
                            } else {
                                Thread.sleep(l4);
                            }
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        l3 = System.nanoTime();
                    }
                }
                this.b = l3;
                l5 = (long)n2 * 1000000L;
                l4 = l3 - this.b();
                int n4 = (int)(l4 / l5);
                this.a(this.b() + (long)n4 * l5);
                if (n4 > 10) {
                    n4 = 10;
                }
                return n4;
            }
            this.b = l3;
            this.a(this.b);
            return 1;
        }
        long l6 = (long)n3 * 1000000L;
        long l7 = this.a - System.nanoTime();
        if (l7 < l6) {
            l7 = l6;
        }
        e.a(l7 / 1000000L);
        long l8 = System.nanoTime();
        int n5 = 0;
        while (n5 < 10 && (n5 < 1 || this.a < l8)) {
            ++n5;
            this.a += (long)n2 * 1000000L;
        }
        if (this.a < l8) {
            this.a = l8;
        }
        return n5;
    }

    public long b() {
        return this.a;
    }

    public void a(long l2) {
        this.a = l2;
    }
}

