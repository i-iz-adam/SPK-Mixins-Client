/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import rs.l.c;

public final class e {
    public final int[] a;
    public final int b;
    public final int c;
    final BufferedImage d;

    public e(int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = new BufferedImage(n2, n3, 1);
        this.a = ((DataBufferInt)this.d.getRaster().getDataBuffer()).getData();
        this.a();
    }

    public e(int n2, int n3, Component component) {
        this(n2, n3);
    }

    public void a(int n2, Graphics graphics, int n3) {
        graphics.drawImage(this.d, n3, n2, null);
    }

    public void a() {
        rs.l.c.a(this.b, this.c, this.a);
    }
}

