/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import rs.l.f_0;

/*
 * Renamed from rs.l.I
 */
public class i_0 {
    private static final List<f_0> a = new ArrayList<f_0>();

    public static void a() {
        for (f_0 f_02 : a) {
            try {
                f_02.g = Toolkit.getDefaultToolkit().getImage(f_0.f + f_02.t + ".png");
                ImageIcon imageIcon = new ImageIcon(f_02.g);
                f_02.n = imageIcon.getIconWidth();
                f_02.o = imageIcon.getIconHeight();
                f_02.r = f_02.n;
                f_02.s = f_02.o;
                f_02.p = 0;
                f_02.q = 0;
                f_02.m = new int[f_02.n * f_02.o];
                PixelGrabber pixelGrabber = new PixelGrabber(f_02.g, 0, 0, f_02.n, f_02.o, f_02.m, 0, f_02.n);
                pixelGrabber.grabPixels();
                if (f_02.j) continue;
                f_02.c(255, 0, 255);
                f_02.c(255, 255, 255);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static f_0 a(String string) {
        return i_0.a(string, false);
    }

    public static f_0 a(String string, boolean bl) {
        f_0 f_02 = new f_0();
        f_02.t = string;
        a.add(f_02);
        return a.get(a.size() - 1);
    }
}

