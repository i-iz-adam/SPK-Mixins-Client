/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 */
package rs.ui.components.a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.WindowEvent;
import rs.e.i;
import rs.ui.components.a.q;

@Singleton
public class d {
    private final i a;
    private q b;

    public q a(Window window, Color color, String string, boolean bl) {
        if (this.b != null) {
            this.b.dispatchEvent(new WindowEvent(this.b, 201));
        }
        this.b = new q(window, color, string, bl, this.a, this);
        if (this.b.isAlwaysOnTopSupported() && window != null) {
            this.b.setAlwaysOnTop(window.isAlwaysOnTop());
        }
        return this.b;
    }

    @Inject
    public d(i i2) {
        this.a = i2;
    }

    void a(q q2) {
        this.b = q2;
    }

    q a() {
        return this.b;
    }
}

