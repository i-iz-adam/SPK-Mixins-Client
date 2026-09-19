/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Native
 *  com.sun.jna.platform.win32.aT$Z
 *  com.sun.jna.platform.win32.aT$g
 *  com.sun.jna.platform.win32.aT$z
 *  com.sun.jna.platform.win32.aw
 *  com.sun.jna.platform.win32.ba$k
 */
package rs.A;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.aT;
import com.sun.jna.platform.win32.aw;
import com.sun.jna.platform.win32.ba;
import java.awt.Component;
import java.awt.Frame;

public class u {
    public static void a(Frame frame) {
        frame.setState(0);
        aw aw2 = aw.j;
        ba.k k2 = new ba.k();
        k2.d = new aT.g(1L);
        k2.l.b.l = new aT.Z(133L);
        aw2.a(new aT.g(1L), (ba.k[])k2.d(1), k2.g());
        aT.z z2 = new aT.z(Native.b((Component)frame));
        aw2.e(z2);
    }
}

