/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import rs.gui.Launcher;

public final class b
extends Canvas {
    Component a;
    private static boolean b;

    public b(Component component) {
        this.a = component;
    }

    @Override
    public void update(Graphics graphics) {
        this.a.update(graphics);
    }

    @Override
    public void paint(Graphics graphics) {
        this.a.paint(graphics);
    }

    @Override
    public void removeFocusListener(FocusListener focusListener) {
        super.removeFocusListener(focusListener);
        b = !this.hasFocus();
    }

    @Override
    public void requestFocus() {
        if (!b) {
            this.requestFocusInWindow();
        }
    }

    @Override
    public void setSize(int n2, int n3) {
        if (Launcher.n().o().ay()) {
            super.setSize(Launcher.n().o().aF().width, Launcher.n().o().aF().height);
        } else {
            super.setSize(n2, n3);
        }
    }

    @Override
    public void setLocation(int n2, int n3) {
        super.setLocation(n2, n3);
    }
}

