/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import rs.Client;
import rs.l.a;
import rs.l.b_0;
import rs.l.c;
import rs.l.g_0;
import rs.l.h_0;
import rs.x.e;
import rs.x.f;

/*
 * Renamed from rs.l.F
 */
public final class f_0
extends b_0 {
    private static final int u = 140;
    public static final String f = rs.v.a.f() + "sprites/";
    public Image g;
    public Object h;
    public boolean i = true;
    public boolean j = false;
    public int k = 0;
    public int l = 0;
    public int[] m;
    public int n;
    public int o;
    public int p;
    int q;
    public int r;
    public int s;
    public String t;

    public f_0(boolean bl, String string) {
        if (bl) {
            try {
                this.t = string = string.toLowerCase();
                this.g = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
                ImageIcon imageIcon = new ImageIcon(this.g);
                this.n = imageIcon.getIconWidth();
                this.o = imageIcon.getIconHeight();
                this.r = this.n;
                this.s = this.o;
                this.p = 0;
                this.q = 0;
                this.m = new int[this.n * this.o];
                PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
                pixelGrabber.grabPixels();
                this.c(255, 0, 255);
                this.c(255, 255, 255);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            this.t = string = string.toLowerCase();
            this.i = false;
            this.a(string);
        }
    }

    public f_0() {
    }

    public void a(String string) {
        BufferedImage bufferedImage = null;
        try {
            String string2 = (f + string + ".png").replace("/", File.separator).replace("//", File.separator).replace("\\\\", File.separator);
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(new File(string2));
            if (imageInputStream != null) {
                bufferedImage = ImageIO.read(imageInputStream);
                ImageIcon imageIcon = new ImageIcon(bufferedImage);
                this.n = imageIcon.getIconWidth();
                this.o = imageIcon.getIconHeight();
                this.r = this.n;
                this.s = this.o;
                this.p = 0;
                this.q = 0;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void c() {
        try {
            this.g = Toolkit.getDefaultToolkit().getImage(f + this.t + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            if (!this.j) {
                this.c(255, 0, 255);
                this.c(255, 255, 255);
            }
            this.i = true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(int n2, int n3) {
        this.m = new int[n2 * n3];
        this.n = this.r = n2;
        this.o = this.s = n3;
        this.q = 0;
        this.p = 0;
    }

    public void a(int n2, int n3, int n4) {
        int n5;
        int n6 = n4;
        int n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n8 = 0;
        int n9 = this.o;
        int n10 = this.n;
        int n11 = rs.l.c.h - n10;
        int n12 = 0;
        if (n3 < rs.l.c.j) {
            n5 = rs.l.c.j - n3;
            n9 -= n5;
            n3 = rs.l.c.j;
            n8 += n5 * n10;
            n7 += n5 * rs.l.c.h;
        }
        if (n3 + n9 > rs.l.c.k) {
            n9 -= n3 + n9 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n5 = rs.l.c.l - n2;
            n10 -= n5;
            n2 = rs.l.c.l;
            n8 += n5;
            n7 += n5;
            n12 += n5;
            n11 += n5;
        }
        if (n2 + n10 > rs.l.c.m) {
            n5 = n2 + n10 - rs.l.c.m;
            n10 -= n5;
            n12 += n5;
            n11 += n5;
        }
        if (n10 > 0 && n9 > 0) {
            this.c(n8, n10, rs.l.c.g, this.m, n12, n9, n11, n6, n7);
        }
    }

    public static Image b(String string) {
        return Toolkit.getDefaultToolkit().getImage(f + string + ".png");
    }

    public static Image a(Image image, int n2, int n3) {
        return image.getScaledInstance(n2, n3, 4);
    }

    public Image a(int n2, int n3) {
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 1);
        bufferedImage.setRGB(0, 0, n2, n3, this.m, 0, n2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.dispose();
        return bufferedImage;
    }

    public static BufferedImage a(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    private static BufferedImage b(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static Image a(Image image, Color color) {
        if (image == null) {
            return null;
        }
        g_0 g_02 = new g_0(color);
        FilteredImageSource filteredImageSource = new FilteredImageSource(image.getSource(), g_02);
        return Toolkit.getDefaultToolkit().createImage(filteredImageSource);
    }

    private static boolean h(int n2, int n3) {
        return Math.abs(n2 - n3) <= 140;
    }

    private static int i(int n2, int n3, int n4) {
        int n5 = n2 - n3;
        if (Math.abs(n5) <= 140) {
            return n4 + n5;
        }
        return n2;
    }

    public static Image a(BufferedImage bufferedImage, Color color, Color color2) {
        h_0 h_02 = new h_0(bufferedImage, color, color2);
        FilteredImageSource filteredImageSource = new FilteredImageSource(bufferedImage.getSource(), h_02);
        return Toolkit.getDefaultToolkit().createImage(filteredImageSource);
    }

    public f_0(String string, boolean bl) {
        try {
            string = string.toLowerCase();
            this.g = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            if (bl) {
                this.c(255, 255, 255);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(Image image) {
        try {
            this.g = image;
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(String string) {
        try {
            this.t = string = string.toLowerCase();
            this.g = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(String string, String string2) {
        try {
            string2 = string2.toLowerCase();
            string = string.toLowerCase();
            this.g = Client.class.getResource("Client.class").toString().startsWith("file") ? Toolkit.getDefaultToolkit().getImage("./" + string + string2 + ".png") : ImageIO.read(this.getClass().getResource(string + string2 + ".png"));
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(String string, String string2, Color color, Color color2) {
        try {
            string = string.toLowerCase();
            string2 = string2.toLowerCase();
            this.g = Client.class.getResource("Client.class").toString().startsWith("file") ? Toolkit.getDefaultToolkit().getImage("./" + string + string2 + ".png") : ImageIO.read(this.getClass().getResource(string + string2 + ".png"));
            if (color != null && color2 != null && !color.equals(color2)) {
                try {
                    this.g = f_0.a(f_0.a(this.g), color, color2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            if (color != null && color2 != null && color.equals(color2)) {
                this.c(255, 0, 255);
                this.c(255, 255, 255);
            }
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public void b(int n2, int n3) {
        if (this.g == null) {
            this.g = this.a(this.n, this.o);
        }
        if (this.g == null) {
            return;
        }
        Image image = this.g.getScaledInstance(n2, n3, 1);
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        this.g = image;
        this.n = n2;
        this.o = n3;
        this.m = new int[n2 * n3];
        PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, n2, n3, this.m, 0, n2);
        try {
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public f_0(String string, Color color, Color color2) {
        try {
            string = string.toLowerCase();
            this.g = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
            if (color != null && color2 != null) {
                try {
                    this.g = f_0.a(f_0.a(this.g), color, color2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public f_0(String string, int n2, int n3) {
        try {
            string = string.toLowerCase();
            Image image = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
            this.n = n2;
            this.o = n3;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.c(255, 0, 255);
            image = null;
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public f_0(String string, String string2, int n2, int n3, boolean bl) {
        try {
            string2 = string2.toLowerCase();
            string = string.toLowerCase();
            this.g = Client.class.getResource("Client.class").toString().startsWith("file") ? Toolkit.getDefaultToolkit().getImage("./" + string + string2 + ".png") : ImageIO.read(this.getClass().getResource(string + string2 + ".png"));
            this.n = n2;
            this.o = n3;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            this.g = null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f_0(String string, int n2, int n3, boolean bl) {
        try {
            string = string.toLowerCase();
            Image image = Toolkit.getDefaultToolkit().getImage(f + string + ".png");
            this.n = n2;
            this.o = n3;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
            image = null;
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public f_0(byte[] byArray, Component component) {
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(byArray);
            MediaTracker mediaTracker = new MediaTracker(component);
            mediaTracker.addImage(image, 0);
            mediaTracker.waitForAll();
            this.n = image.getWidth(component);
            this.o = image.getHeight(component);
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.n, this.o, this.m, 0, this.n);
            pixelGrabber.grabPixels();
        }
        catch (Exception exception) {
            System.out.println("Error converting jpg");
        }
    }

    public f_0(f f2, String string, int n2) {
        int n3;
        e e2 = new e(f2.a(string + ".dat"));
        e e3 = new e(f2.a("index.dat"));
        e3.h = e2.A();
        this.r = e3.A();
        this.s = e3.A();
        int n4 = e3.y();
        int[] nArray = new int[n4];
        for (n3 = 0; n3 < n4 - 1; ++n3) {
            nArray[n3 + 1] = e3.C();
            if (nArray[n3 + 1] != 0) continue;
            nArray[n3 + 1] = 1;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            e3.h += 2;
            e2.h += e3.A() * e3.A();
            ++e3.h;
        }
        this.p = e3.y();
        this.q = e3.y();
        this.n = e3.A();
        this.o = e3.A();
        n3 = e3.y();
        int n5 = this.n * this.o;
        this.m = new int[n5];
        if (n3 == 0) {
            for (int i2 = 0; i2 < n5; ++i2) {
                this.m[i2] = nArray[e2.y()];
            }
            return;
        }
        if (n3 == 1) {
            for (int i3 = 0; i3 < this.n; ++i3) {
                for (int i4 = 0; i4 < this.o; ++i4) {
                    this.m[i3 + i4 * this.n] = nArray[e2.y()];
                }
            }
        }
    }

    public void b(int n2, int n3, int n4) {
        int n5;
        int n6 = n4;
        int n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n8 = 0;
        int n9 = this.o;
        int n10 = this.n;
        int n11 = rs.l.c.h - n10;
        int n12 = 0;
        if (n3 < rs.l.c.j) {
            n5 = rs.l.c.j - n3;
            n9 -= n5;
            n3 = rs.l.c.j;
            n8 += n5 * n10;
            n7 += n5 * rs.l.c.h;
        }
        if (n3 + n9 > rs.l.c.k) {
            n9 -= n3 + n9 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n5 = rs.l.c.l - n2;
            n10 -= n5;
            n2 = rs.l.c.l;
            n8 += n5;
            n7 += n5;
            n12 += n5;
            n11 += n5;
        }
        if (n2 + n10 > rs.l.c.m) {
            n5 = n2 + n10 - rs.l.c.m;
            n10 -= n5;
            n12 += n5;
            n11 += n5;
        }
        if (n10 > 0 && n9 > 0) {
            this.b(n8, n10, rs.l.c.g, this.m, n12, n9, n11, n6, n7);
        }
    }

    public void c(int n2, int n3) {
        int n4;
        this.k = n2;
        this.l = n3;
        int n5 = 256;
        int n6 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n7 = 0;
        int n8 = this.o;
        int n9 = this.n;
        int n10 = rs.l.c.h - n9;
        int n11 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n8 -= n4;
            n3 = rs.l.c.j;
            n7 += n4 * n9;
            n6 += n4 * rs.l.c.h;
        }
        if (n3 + n8 > rs.l.c.k) {
            n8 -= n3 + n8 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n9 -= n4;
            n2 = rs.l.c.l;
            n7 += n4;
            n6 += n4;
            n11 += n4;
            n10 += n4;
        }
        if (n2 + n9 > rs.l.c.m) {
            n4 = n2 + n9 - rs.l.c.m;
            n9 -= n4;
            n11 += n4;
            n10 += n4;
        }
        if (n9 > 0 && n8 > 0) {
            this.a(n9, n8, this.m, rs.l.c.g, n6, n5, n7, n11, n10);
        }
    }

    private void a(int n2, int n3, int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n5;
        for (int i2 = -n3; i2 < 0; ++i2) {
            for (int i3 = -n2; i3 < 0; ++i3) {
                int n10;
                n5 = this.m[n6] >> 24 & n9 - 1;
                int n11 = 256 - n5;
                if (n11 > 256) {
                    n5 = 0;
                }
                if (n9 == 0) {
                    n11 = 256;
                    n5 = 0;
                }
                if ((n10 = nArray[n6++]) != 0) {
                    int n12 = nArray2[n4];
                    f_0.b(nArray2, n4++, ((n10 & 0xFF00FF) * n5 + (n12 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n10 & 0xFF00) * n5 + (n12 & 0xFF00) * n11 & 0xFF0000) >> 8, ((n10 & 0xFF00FF) * n5 + (n12 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n10 & 0xFF00) * n5 + (n12 & 0xFF00) * n11 & 0xFF0000) >> 8, n5);
                    continue;
                }
                ++n4;
            }
            n4 += n8;
            n6 += n7;
        }
    }

    private void b(int n2, int n3, int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n7;
        for (int i2 = -n5; i2 < 0; ++i2) {
            for (int i3 = -n3; i3 < 0; ++i3) {
                int n10;
                n7 = this.m[n2] >> 24 & 0xFF;
                int n11 = 256 - n7;
                if ((n10 = nArray2[n2++]) != 0) {
                    int n12 = nArray[n8];
                    f_0.b(nArray, n8++, ((n10 & 0xFF00FF) * n7 + (n12 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n10 & 0xFF00) * n7 + (n12 & 0xFF00) * n11 & 0xFF0000) >> 8, n10, n7);
                    continue;
                }
                ++n8;
            }
            n8 += n6;
            n2 += n4;
        }
    }

    public void c(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.m.length; ++i2) {
            if ((this.m[i2] >> 16 & 0xFF) != n2 || (this.m[i2] >> 8 & 0xFF) != n3 || (this.m[i2] & 0xFF) != n4) continue;
            this.m[i2] = 0;
        }
    }

    public void d() {
        rs.l.c.a(this.n, this.o, this.m);
    }

    public void d(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.m.length; ++i2) {
            int n5 = this.m[i2];
            if (n5 == 0) continue;
            int n6 = n5 >> 16 & 0xFF;
            if ((n6 += n2) < 1) {
                n6 = 1;
            } else if (n6 > 255) {
                n6 = 255;
            }
            int n7 = n5 >> 8 & 0xFF;
            if ((n7 += n3) < 1) {
                n7 = 1;
            } else if (n7 > 255) {
                n7 = 255;
            }
            int n8 = n5 & 0xFF;
            if ((n8 += n4) < 1) {
                n8 = 1;
            } else if (n8 > 255) {
                n8 = 255;
            }
            this.m[i2] = (n6 << 16) + (n7 << 8) + n8;
        }
    }

    public void e() {
        int[] nArray = new int[this.r * this.s];
        for (int i2 = 0; i2 < this.o; ++i2) {
            System.arraycopy(this.m, i2 * this.n, nArray, i2 + this.q * this.r + this.p, this.n);
        }
        this.m = nArray;
        this.n = this.r;
        this.o = this.s;
        this.p = 0;
        this.q = 0;
    }

    public void f() {
        int[] nArray = new int[this.n * this.o];
        int n2 = 0;
        for (int i2 = 0; i2 < this.o; ++i2) {
            for (int i3 = this.n - 1; i3 >= 0; --i3) {
                nArray[n2++] = this.m[i3 + i2 * this.n];
            }
        }
        this.m = nArray;
        this.q = this.r - this.n - this.q;
    }

    public void g() {
        int[] nArray = new int[this.n * this.o];
        int n2 = 0;
        for (int i2 = this.o - 1; i2 >= 0; --i2) {
            for (int i3 = 0; i3 < this.n; ++i3) {
                nArray[n2++] = this.m[i3 + i2 * this.n];
            }
        }
        this.m = nArray;
        this.p = this.s - this.o - this.p;
    }

    public void d(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n6 = 0;
        int n7 = this.o;
        int n8 = this.n;
        int n9 = rs.l.c.h - n8;
        int n10 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n7 -= n4;
            n3 = rs.l.c.j;
            n6 += n4 * n8;
            n5 += n4 * rs.l.c.h;
        }
        if (n3 + n7 > rs.l.c.k) {
            n7 -= n3 + n7 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n8 -= n4;
            n2 = rs.l.c.l;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > rs.l.c.m) {
            n4 = n2 + n8 - rs.l.c.m;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            this.a(n5, n8, n7, n10, n6, n9, this.m, rs.l.c.g);
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, int[] nArray, int[] nArray2) {
        int n8 = -(n3 >> 2);
        n3 = -(n3 & 3);
        for (int i2 = -n4; i2 < 0; ++i2) {
            int n9;
            int n10;
            for (n10 = n8; n10 < 0; ++n10) {
                n9 = nArray[n6++];
                f_0.b(nArray2, n2++, n9, n9, 255);
                n9 = nArray[n6++];
                f_0.b(nArray2, n2++, n9, n9, 255);
                n9 = nArray[n6++];
                f_0.b(nArray2, n2++, n9, n9, 255);
                n9 = nArray[n6++];
                f_0.b(nArray2, n2++, n9, n9, 255);
            }
            for (n10 = n3; n10 < 0; ++n10) {
                n9 = nArray[n6++];
                f_0.b(nArray2, n2++, n9, n9, 255);
            }
            n2 += n7;
            n6 += n5;
        }
    }

    public void e(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8 = this.n + 2;
        int n9 = this.o + 2;
        int[] nArray = new int[n8 * n9];
        for (n7 = 0; n7 < this.n; ++n7) {
            for (n6 = 0; n6 < this.o; ++n6) {
                if (this.m[n7 + n6 * this.n] == 0) continue;
                nArray[n7 + 1 + (n6 + 1) * n8] = this.m[n7 + n6 * this.n];
            }
        }
        for (n7 = 0; n7 < n8; ++n7) {
            for (n6 = 0; n6 < n9; ++n6) {
                if (nArray[n7 + n6 * n8] != 0) continue;
                if (n7 < n8 - 1 && nArray[n7 + 1 + n6 * n8] > 0 && nArray[n7 + 1 + n6 * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n7 > 0 && nArray[n7 - 1 + n6 * n8] > 0 && nArray[n7 - 1 + n6 * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n6 < n9 - 1 && nArray[n7 + (n6 + 1) * n8] > 0 && nArray[n7 + (n6 + 1) * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n6 <= 0 || nArray[n7 + (n6 - 1) * n8] <= 0 || nArray[n7 + (n6 - 1) * n8] == 0xFFFFFF) continue;
                nArray[n7 + n6 * n8] = n4;
            }
        }
        --n2;
        --n3;
        n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        n6 = 0;
        int n10 = n9;
        int n11 = n8;
        int n12 = rs.l.c.h - n11;
        int n13 = 0;
        if (n3 < rs.l.c.j) {
            n5 = rs.l.c.j - n3;
            n10 -= n5;
            n3 = rs.l.c.j;
            n6 += n5 * n11;
            n7 += n5 * rs.l.c.h;
        }
        if (n3 + n10 > rs.l.c.k) {
            n10 -= n3 + n10 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n5 = rs.l.c.l - n2;
            n11 -= n5;
            n2 = rs.l.c.l;
            n6 += n5;
            n7 += n5;
            n13 += n5;
            n12 += n5;
        }
        if (n2 + n11 > rs.l.c.m) {
            n5 = n2 + n11 - rs.l.c.m;
            n11 -= n5;
            n13 += n5;
            n12 += n5;
        }
        if (n11 > 0 && n10 > 0) {
            this.a(rs.l.c.g, nArray, n6, n7, n11, n10, n12, n13);
        }
    }

    public void f(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8 = this.n + 2;
        int n9 = this.o + 2;
        int[] nArray = new int[n8 * n9];
        for (n7 = 0; n7 < this.n; ++n7) {
            for (n6 = 0; n6 < this.o; ++n6) {
                if (this.m[n7 + n6 * this.n] == 0) continue;
                nArray[n7 + 1 + (n6 + 1) * n8] = this.m[n7 + n6 * this.n];
            }
        }
        for (n7 = 0; n7 < n8; ++n7) {
            for (n6 = 0; n6 < n9; ++n6) {
                if (nArray[n7 + n6 * n8] != 0) continue;
                if (n7 < n8 - 1 && nArray[n7 + 1 + n6 * n8] != 0 && nArray[n7 + 1 + n6 * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n7 > 0 && nArray[n7 - 1 + n6 * n8] != 0 && nArray[n7 - 1 + n6 * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n6 < n9 - 1 && nArray[n7 + (n6 + 1) * n8] != 0 && nArray[n7 + (n6 + 1) * n8] != 0xFFFFFF) {
                    nArray[n7 + n6 * n8] = n4;
                }
                if (n6 <= 0 || nArray[n7 + (n6 - 1) * n8] == 0 || nArray[n7 + (n6 - 1) * n8] == 0xFFFFFF) continue;
                nArray[n7 + n6 * n8] = n4;
            }
        }
        --n2;
        --n3;
        n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        n6 = 0;
        int n10 = n9;
        int n11 = n8;
        int n12 = rs.l.c.h - n11;
        int n13 = 0;
        if (n3 < rs.l.c.j) {
            n5 = rs.l.c.j - n3;
            n10 -= n5;
            n3 = rs.l.c.j;
            n6 += n5 * n11;
            n7 += n5 * rs.l.c.h;
        }
        if (n3 + n10 > rs.l.c.k) {
            n10 -= n3 + n10 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n5 = rs.l.c.l - n2;
            n11 -= n5;
            n2 = rs.l.c.l;
            n6 += n5;
            n7 += n5;
            n13 += n5;
            n12 += n5;
        }
        if (n2 + n11 > rs.l.c.m) {
            n5 = n2 + n11 - rs.l.c.m;
            n11 -= n5;
            n13 += n5;
            n12 += n5;
        }
        if (n11 > 0 && n10 > 0) {
            this.a(rs.l.c.g, nArray, n6, n7, n11, n10, n12, n13);
        }
    }

    public void e(int n2, int n3) {
        int n4;
        this.k = n2;
        this.l = n3;
        int n5 = 128;
        int n6 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n7 = 0;
        int n8 = this.o;
        int n9 = this.n;
        int n10 = rs.l.c.h - n9;
        int n11 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n8 -= n4;
            n3 = rs.l.c.j;
            n7 += n4 * n9;
            n6 += n4 * rs.l.c.h;
        }
        if (n3 + n8 > rs.l.c.k) {
            n8 -= n3 + n8 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n9 -= n4;
            n2 = rs.l.c.l;
            n7 += n4;
            n6 += n4;
            n11 += n4;
            n10 += n4;
        }
        if (n2 + n9 > rs.l.c.m) {
            n4 = n2 + n9 - rs.l.c.m;
            n9 -= n4;
            n11 += n4;
            n10 += n4;
        }
        if (n9 > 0 && n8 > 0) {
            this.c(n7, n9, rs.l.c.g, this.m, n11, n8, n10, n5, n6);
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        int n6;
        if (n4 == 0 || n5 == 0) {
            return;
        }
        int n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n8 = 0;
        int n9 = this.o;
        int n10 = this.n;
        int n11 = rs.l.c.h - n10;
        int n12 = 0;
        if (n3 < rs.l.c.j) {
            n6 = rs.l.c.j - n3;
            n9 -= n6;
            n3 = rs.l.c.j;
            n8 += n6 * n10;
            n7 += n6 * rs.l.c.h;
        }
        if (n3 + n9 > rs.l.c.k) {
            n9 -= n3 + n9 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n6 = rs.l.c.l - n2;
            n10 -= n6;
            n2 = rs.l.c.l;
            n8 += n6;
            n7 += n6;
            n12 += n6;
            n11 += n6;
        }
        if (n2 + n10 > rs.l.c.m) {
            n6 = n2 + n10 - rs.l.c.m;
            n10 -= n6;
            n12 += n6;
            n11 += n6;
        }
        if (n10 > 0 && n9 > 0) {
            this.a(rs.l.c.g, this.m, n8, n7, n10, n9, n11, n12, n4, n5);
        }
    }

    public void f(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n6 = 0;
        int n7 = this.o;
        int n8 = this.n;
        int n9 = rs.l.c.h - n8;
        int n10 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n7 -= n4;
            n3 = rs.l.c.j;
            n6 += n4 * n8;
            n5 += n4 * rs.l.c.h;
        }
        if (n3 + n7 > rs.l.c.k) {
            n7 -= n3 + n7 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n8 -= n4;
            n2 = rs.l.c.l;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > rs.l.c.m) {
            n4 = n2 + n8 - rs.l.c.m;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            this.a(rs.l.c.g, this.m, n6, n5, n8, n7, n9, n10);
        }
    }

    public void g(int n2, int n3, int n4) {
        int n5;
        this.k = n2;
        this.l = n3;
        int n6 = n4;
        int n7 = (n2 += this.p) + (n3 += this.q) * rs.l.c.h;
        int n8 = 0;
        int n9 = this.o;
        int n10 = this.n;
        int n11 = rs.l.c.h - n10;
        int n12 = 0;
        if (n3 < rs.l.c.j) {
            n5 = rs.l.c.j - n3;
            n9 -= n5;
            n3 = rs.l.c.j;
            n8 += n5 * n10;
            n7 += n5 * rs.l.c.h;
        }
        if (n3 + n9 > rs.l.c.k) {
            n9 -= n3 + n9 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n5 = rs.l.c.l - n2;
            n10 -= n5;
            n2 = rs.l.c.l;
            n8 += n5;
            n7 += n5;
            n12 += n5;
            n11 += n5;
        }
        if (n2 + n10 > rs.l.c.m) {
            n5 = n2 + n10 - rs.l.c.m;
            n10 -= n5;
            n12 += n5;
            n11 += n5;
        }
        if (n10 > 0 && n9 > 0) {
            this.c(n8, n10, rs.l.c.g, this.m, n12, n9, n11, n6, n7);
        }
    }

    private void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a(nArray, nArray2, n2, n3, n4, n5, n6, n7, n8, n9, false);
    }

    private void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        int n10 = -(n4 >> 2);
        n4 = -(n4 & 3);
        boolean bl2 = false;
        int n11 = (n2 + 1) % this.n * this.n - 1;
        for (int i2 = -n5; i2 < 0; ++i2) {
            int n12;
            int n13;
            for (n13 = n10; n13 < 0; ++n13) {
                n12 = nArray2[n2++];
                if (n11 >= n8) {
                    if (n11 < this.n) {
                        bl2 = true;
                        ++n11;
                    } else {
                        bl2 = false;
                        n11 = 0;
                    }
                } else {
                    ++n11;
                }
                if (n12 != 0 && n12 != -1 && !bl2) {
                    f_0.b(nArray, n3++, n12, n12, 255);
                } else {
                    ++n3;
                }
                n12 = nArray2[n2++];
                if (n11 >= n8) {
                    if (n11 < this.n) {
                        bl2 = true;
                        ++n11;
                    } else {
                        bl2 = false;
                        n11 = 0;
                    }
                } else {
                    ++n11;
                }
                if (n12 != 0 && n12 != -1 && !bl2) {
                    f_0.b(nArray, n3++, n12, n12, 255);
                } else {
                    ++n3;
                }
                n12 = nArray2[n2++];
                if (n11 >= n8) {
                    if (n11 < this.n) {
                        bl2 = true;
                        ++n11;
                    } else {
                        bl2 = false;
                        n11 = 0;
                    }
                } else {
                    ++n11;
                }
                if (n12 != 0 && n12 != -1 && !bl2) {
                    f_0.b(nArray, n3++, n12, n12, 255);
                } else {
                    ++n3;
                }
                n12 = nArray2[n2++];
                if (n11 >= n8) {
                    if (n11 < this.n) {
                        bl2 = true;
                        ++n11;
                    } else {
                        bl2 = false;
                        n11 = 0;
                    }
                } else {
                    ++n11;
                }
                if (n12 != 0 && n12 != -1 && !bl2) {
                    f_0.b(nArray, n3++, n12, n12, 255);
                    continue;
                }
                ++n3;
            }
            for (n13 = n4; n13 < 0; ++n13) {
                n12 = nArray2[n2++];
                if (n11 >= n8) {
                    if (n11 < this.n) {
                        bl2 = true;
                        ++n11;
                    } else {
                        bl2 = false;
                        n11 = 0;
                    }
                } else {
                    ++n11;
                }
                if (n12 != 0 && n12 != -1 && !bl2) {
                    f_0.b(nArray, n3++, n12, n12, 255);
                    continue;
                }
                ++n3;
            }
            n3 += n6;
            n11 = ((n2 += n7) + 1) % this.n * this.n - 1;
            if (bl && n2 >= n8 * n9) break;
        }
    }

    private void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = -(n4 >> 2);
        n4 = -(n4 & 3);
        for (int i2 = -n5; i2 < 0; ++i2) {
            int n9;
            int n10;
            for (n10 = n8; n10 < 0; ++n10) {
                if ((n9 = nArray2[n2++]) != 0 && n9 != -1) {
                    f_0.b(nArray, n3++, n9, n9, 255);
                } else {
                    ++n3;
                }
                n9 = nArray2[n2++];
                if (n9 != 0 && n9 != -1) {
                    f_0.b(nArray, n3++, n9, n9, 255);
                } else {
                    ++n3;
                }
                n9 = nArray2[n2++];
                if (n9 != 0 && n9 != -1) {
                    f_0.b(nArray, n3++, n9, n9, 255);
                } else {
                    ++n3;
                }
                n9 = nArray2[n2++];
                if (n9 != 0 && n9 != -1) {
                    f_0.b(nArray, n3++, n9, n9, 255);
                    continue;
                }
                ++n3;
            }
            for (n10 = n4; n10 < 0; ++n10) {
                if ((n9 = nArray2[n2++]) != 0 && n9 != -1) {
                    f_0.b(nArray, n3++, n9, n9, 255);
                    continue;
                }
                ++n3;
            }
            n3 += n6;
            n2 += n7;
        }
    }

    private void c(int n2, int n3, int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 256 - n7;
        for (int i2 = -n5; i2 < 0; ++i2) {
            for (int i3 = -n3; i3 < 0; ++i3) {
                int n10;
                if ((n10 = nArray2[n2++]) != 0) {
                    int n11 = nArray[n8];
                    int n12 = ((n10 & 0xFF00FF) * n7 + (n11 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n10 & 0xFF00) * n7 + (n11 & 0xFF00) * n9 & 0xFF0000) >> 8;
                    f_0.b(nArray, n8++, n12, n12, n7);
                    continue;
                }
                ++n8;
            }
            n8 += n6;
            n2 += n4;
        }
    }

    public void a(int n2, int n3, int[] nArray, int n4, int[] nArray2, int n5, int n6, int n7, int n8, int n9) {
        try {
            int n10 = -n8 / 2;
            int n11 = -n2 / 2;
            int n12 = (int)(Math.sin((double)n3 / 326.11) * 65536.0);
            int n13 = (int)(Math.cos((double)n3 / 326.11) * 65536.0);
            n12 = n12 * n4 >> 8;
            n13 = n13 * n4 >> 8;
            int n14 = (n9 << 16) + (n11 * n12 + n10 * n13);
            int n15 = (n5 << 16) + (n11 * n13 - n10 * n12);
            int n16 = n7 + n6 * rs.l.c.h;
            for (n6 = 0; n6 < n2; ++n6) {
                int n17 = nArray2[n6];
                int n18 = n16 + n17;
                int n19 = n14 + n13 * n17;
                int n20 = n15 - n12 * n17;
                for (n7 = -nArray[n6]; n7 < 0; ++n7) {
                    if ((n19 >> 16) + (n20 >> 16) * this.n < 0) {
                        ++n18;
                        n19 += n13;
                        n20 -= n12;
                        continue;
                    }
                    if ((n19 >> 16) + (n20 >> 16) * this.n >= this.m.length) {
                        ++n18;
                    } else {
                        f_0.b(rs.l.c.g, n18++, this.m[(n19 >> 16) + (n20 >> 16) * this.n], this.m[(n19 >> 16) + (n20 >> 16) * this.n], 255);
                    }
                    n19 += n13;
                    n20 -= n12;
                }
                n14 += n12;
                n15 += n13;
                n16 += rs.l.c.h;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void a(int n2, double d2, int n3) {
        int n4 = 15;
        int n5 = 20;
        int n6 = 15;
        int n7 = 256;
        int n8 = 20;
        try {
            int n9 = -n5 / 2;
            int n10 = -n8 / 2;
            int n11 = (int)(Math.sin(d2) * 65536.0);
            int n12 = (int)(Math.cos(d2) * 65536.0);
            n11 = n11 * n7 >> 8;
            n12 = n12 * n7 >> 8;
            int n13 = (n6 << 16) + (n10 * n11 + n9 * n12);
            int n14 = (n4 << 16) + (n10 * n12 - n9 * n11);
            int n15 = n3 + n2 * rs.l.c.h;
            for (n2 = 0; n2 < n8; ++n2) {
                int n16 = n15;
                int n17 = n13;
                int n18 = n14;
                for (n3 = -n5; n3 < 0; ++n3) {
                    int n19 = this.m[(n17 >> 16) + (n18 >> 16) * this.n];
                    if (n19 != 0) {
                        f_0.b(rs.l.c.g, n16++, n19, n19, 255);
                    } else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += rs.l.c.h;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(a a2, int n2, int n3) {
        int n4;
        int n5 = (n3 += this.p) + (n2 += this.q) * rs.l.c.h;
        int n6 = 0;
        int n7 = this.o;
        int n8 = this.n;
        int n9 = rs.l.c.h - n8;
        int n10 = 0;
        if (n2 < rs.l.c.j) {
            n4 = rs.l.c.j - n2;
            n7 -= n4;
            n2 = rs.l.c.j;
            n6 += n4 * n8;
            n5 += n4 * rs.l.c.h;
        }
        if (n2 + n7 > rs.l.c.k) {
            n7 -= n2 + n7 - rs.l.c.k;
        }
        if (n3 < rs.l.c.l) {
            n4 = rs.l.c.l - n3;
            n8 -= n4;
            n3 = rs.l.c.l;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n3 + n8 > rs.l.c.m) {
            n4 = n3 + n8 - rs.l.c.m;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            this.a(this.m, n8, a2.i, n7, rs.l.c.g, 0, n9, n5, n10, n6);
        }
    }

    private void a(int[] nArray, int n2, byte[] byArray, int n3, int[] nArray2, int n4, int n5, int n6, int n7, int n8) {
        int n9 = -(n2 >> 2);
        n2 = -(n2 & 3);
        for (int i2 = -n3; i2 < 0; ++i2) {
            int n10;
            for (n10 = n9; n10 < 0; ++n10) {
                if ((n4 = nArray[n8++]) != 0 && byArray[n6] == 0) {
                    f_0.b(nArray2, n6++, n4, n4, 255);
                } else {
                    ++n6;
                }
                n4 = nArray[n8++];
                if (n4 != 0 && byArray[n6] == 0) {
                    f_0.b(nArray2, n6++, n4, n4, 255);
                } else {
                    ++n6;
                }
                n4 = nArray[n8++];
                if (n4 != 0 && byArray[n6] == 0) {
                    f_0.b(nArray2, n6++, n4, n4, 255);
                } else {
                    ++n6;
                }
                n4 = nArray[n8++];
                if (n4 != 0 && byArray[n6] == 0) {
                    f_0.b(nArray2, n6++, n4, n4, 255);
                    continue;
                }
                ++n6;
            }
            for (n10 = n2; n10 < 0; ++n10) {
                if ((n4 = nArray[n8++]) != 0 && byArray[n6] == 0) {
                    f_0.b(nArray2, n6++, n4, n4, 255);
                    continue;
                }
                ++n6;
            }
            n6 += n5;
            n8 += n7;
        }
    }

    public boolean h() {
        return Client.hP >= this.k && Client.hQ <= this.k + this.n && Client.hQ >= this.l && Client.hQ <= this.l + this.o;
    }

    static /* synthetic */ boolean g(int n2, int n3) {
        return f_0.h(n2, n3);
    }

    static /* synthetic */ int h(int n2, int n3, int n4) {
        return f_0.i(n2, n3, n4);
    }
}

