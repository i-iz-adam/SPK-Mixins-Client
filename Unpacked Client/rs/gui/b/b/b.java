/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.b;

import java.awt.Color;
import java.awt.Image;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.a.a_0;
import rs.d.k;
import rs.gui.Launcher;
import rs.gui.b.g;
import rs.gui.x;
import rs.h.a;
import rs.l.f_0;

public class b
implements Runnable {
    private static final long a = 50L;
    private static final int b = 3;
    private static final long c = 5000L;
    private List<Integer> d = new CopyOnWriteArrayList<Integer>();
    private List<Integer> e = new CopyOnWriteArrayList<Integer>();
    private final a_0 f = new a_0();

    public void a(int n2) {
        if (n2 == -1) {
            return;
        }
        rs.h.a.a("LoadoutIco_" + n2, () -> {
            try {
                f_0 f_02 = k.a(n2, 1, 0, 32);
                if (f_02 == null) {
                    return true;
                }
                Image image = f_02.a(32, 32);
                image = f_0.a(image, new Color(0, 0, 0));
                x x2 = new x(0);
                x2.a(image);
                g.b.put(n2, x2);
                Launcher.n().b(100, true);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return false;
        });
    }

    @Override
    public void run() {
    }
}

