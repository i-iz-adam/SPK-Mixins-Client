/*
 * Decompiled with CFR 0.152.
 */
package rs.q;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import rs.c_0;
import rs.f.a;

public final class b
implements Runnable {
    private InputStream a;
    private OutputStream b;
    private final Socket c;
    private boolean d = false;
    private final c_0 e;
    private byte[] f;
    private int g;
    private int h;
    private boolean i = false;
    private boolean j = false;

    public b(c_0 c_02, Socket socket) {
        this.e = c_02;
        this.c = socket;
        if (rs.f.a.l.booleanValue()) {
            this.c.setSoTimeout(30000);
        } else {
            this.c.setSoTimeout(0);
        }
        this.c.setTcpNoDelay(true);
        this.c.setReceiveBufferSize(rs.f.a.bt);
        this.a = this.c.getInputStream();
        this.b = this.c.getOutputStream();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        this.d = true;
        try {
            if (this.a != null) {
                this.a.close();
            }
            if (this.b != null) {
                this.b.close();
            }
            if (this.c != null) {
                this.c.close();
            }
        }
        catch (IOException iOException) {
            System.out.println("Error closing stream");
        }
        this.i = false;
        b b2 = this;
        synchronized (b2) {
            this.notify();
        }
        this.f = null;
    }

    public int b() {
        if (this.d) {
            return 0;
        }
        return this.a.read();
    }

    public int c() {
        if (this.d) {
            return 0;
        }
        return this.a.available();
    }

    public void a(byte[] byArray, int n2) {
        int n3 = 0;
        if (this.d) {
            return;
        }
        while (n2 > 0) {
            int n4 = this.a.read(byArray, n3, n2);
            if (n4 <= 0) {
                throw new IOException("EOF");
            }
            n3 += n4;
            n2 -= n4;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, byte[] byArray) {
        if (this.d) {
            return;
        }
        if (this.j) {
            this.j = false;
            throw new IOException("Error in writer thread");
        }
        if (this.f == null) {
            this.f = new byte[rs.f.a.bt.intValue()];
        }
        b b2 = this;
        synchronized (b2) {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.f[this.h] = byArray[i2];
                this.h = (this.h + 1) % rs.f.a.bt;
                if (this.h != (this.g + 4900) % rs.f.a.bt) continue;
                throw new IOException("buffer overflow");
            }
            if (!this.i) {
                this.i = true;
                this.e.a(this, 3);
            }
            this.notify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (this.i) {
            int n2;
            int n3;
            b b2 = this;
            synchronized (b2) {
                if (this.h == this.g) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
                if (!this.i) {
                    return;
                }
                n3 = this.g;
                n2 = this.h >= this.g ? this.h - this.g : rs.f.a.bt - this.g;
            }
            if (n2 <= 0) continue;
            try {
                this.b.write(this.f, n3, n2);
            }
            catch (IOException iOException) {
                this.j = true;
                iOException.printStackTrace();
            }
            this.g = (this.g + n2) % rs.f.a.bt;
            try {
                if (this.h != this.g) continue;
                this.b.flush();
            }
            catch (IOException iOException) {
                this.j = true;
                iOException.printStackTrace();
            }
        }
    }

    public void d() {
        System.out.println("dummy:" + this.d);
        System.out.println("tcycl:" + this.g);
        System.out.println("tnum:" + this.h);
        System.out.println("writer:" + this.i);
        System.out.println("ioerror:" + this.j);
        try {
            System.out.println("available:" + this.c());
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

