/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.Application
 *  com.apple.eawt.FullScreenUtilities
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.A;

import com.apple.eawt.Application;
import com.apple.eawt.FullScreenUtilities;
import java.awt.Window;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.n;
import rs.k.j;

public class o {
    private static final Logger a = LoggerFactory.getLogger(o.class);

    public static void a(JFrame jFrame) {
        if (j.a() == j.b) {
            n.a(jFrame);
            FullScreenUtilities.setWindowCanFullScreen((Window)jFrame, (boolean)true);
            a.debug("Enabled fullscreen on macOS");
        }
    }

    public static void a() {
        Application application = Application.getApplication();
        application.requestUserAttention(true);
        a.debug("Requested user attention on macOS");
    }

    public static void b() {
        Application application = Application.getApplication();
        application.requestForeground(true);
        a.debug("Forced focus on macOS");
    }
}

