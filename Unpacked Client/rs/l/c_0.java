/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.Raster;
import java.util.Hashtable;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.k.e;
import rs.l.b.a.d;
import rs.l.c;
import rs.l.d_0;
import rs.v.a;

/*
 * Renamed from rs.l.C
 */
public final class c_0 {
    public static boolean a;
    public static Client b;
    public int[] c;
    private final int g;
    public final float[] d;
    private final int h;
    public final BufferedImage e;
    public final Component f;
    private final Rectangle i = new Rectangle();
    private static final ColorModel j;
    private static final ColorModel k;

    public c_0(int n2, int n3, Component component) {
        int n4 = n2 * n3;
        this.g = n2;
        this.h = n3;
        this.f = component;
        this.c = new int[n4];
        this.d = new float[n2 * n3];
        boolean bl = rs.k.e.a();
        this.e = bl ? new BufferedImage(k, Raster.createWritableRaster(k.createCompatibleSampleModel(n2, n3), new DataBufferInt(this.c, n4), null), true, new Hashtable()) : new BufferedImage(j, Raster.createWritableRaster(j.createCompatibleSampleModel(n2, n3), new DataBufferInt(this.c, n4), null), false, new Hashtable());
        this.a();
    }

    public void a() {
        rs.l.c.a(this.g, this.h, this.c, this.d);
    }

    public void a(int n2, Graphics graphics, int n3) {
        if (graphics == null) {
            return;
        }
        if (rs.k.e.a()) {
            return;
        }
        graphics.drawImage(this.e, n3, n2, this.f);
        if (!a) {
            if (!rs.v.a.d() || rs.l.b.a.d.c) {
                SwingUtilities.invokeLater(new d_0(this));
            }
            a = true;
        }
    }

    public void a(ImageConsumer imageConsumer) {
    }

    public boolean a(Image image, int n2, int n3, int n4, int n5, int n6) {
        return true;
    }

    public int[] b() {
        return this.c;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    static {
        j = new DirectColorModel(32, 0xFF0000, 65280, 255);
        k = new DirectColorModel(ColorSpace.getInstance(1000), 32, 0xFF0000, 65280, 255, -16777216, true, 3);
    }
}

