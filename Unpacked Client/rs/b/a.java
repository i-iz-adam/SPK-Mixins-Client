/*
 * Decompiled with CFR 0.152.
 */
package rs.b;

import rs.Client;

public final class a
implements Runnable {
    private Client f;
    public final Object a = new Object();
    public final int[] b = new int[500];
    public boolean c = true;
    public final int[] d = new int[500];
    public int e;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (this.c) {
            Object object = this.a;
            synchronized (object) {
                if (this.e < 500) {
                    this.d[this.e] = Client.hP;
                    this.b[this.e] = Client.hQ;
                    ++this.e;
                }
            }
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
    }

    public a(Client client) {
        this.f = client;
    }
}

