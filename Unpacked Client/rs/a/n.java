/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.FullScreenAdapter
 *  com.apple.eawt.FullScreenListener
 *  com.apple.eawt.FullScreenUtilities
 *  com.apple.eawt.event.FullScreenEvent
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.A;

import com.apple.eawt.FullScreenAdapter;
import com.apple.eawt.FullScreenListener;
import com.apple.eawt.FullScreenUtilities;
import com.apple.eawt.event.FullScreenEvent;
import java.awt.Frame;
import java.awt.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class n
extends FullScreenAdapter {
    private static final Logger a = LoggerFactory.getLogger(n.class);
    private final Frame b;

    public void a(FullScreenEvent fullScreenEvent) {
        a.debug("Window entered fullscreen mode--setting extended state to {}", (Object)6);
        this.b.setExtendedState(6);
    }

    public void b(FullScreenEvent fullScreenEvent) {
        a.debug("Window exited fullscreen mode--setting extended state to {}", (Object)0);
        this.b.setExtendedState(0);
    }

    public static void a(Frame frame) {
        FullScreenUtilities.addFullScreenListenerTo((Window)frame, (FullScreenListener)new n(frame));
    }

    public n(Frame frame) {
        this.b = frame;
    }
}

