/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class r
extends MouseAdapter {
    private final Component a;

    public r(Component component) {
        this.a = component;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    private void a(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            MouseEvent mouseEvent2 = SwingUtilities.convertMouseEvent((Component)mouseEvent.getSource(), mouseEvent, this.a);
            this.a.dispatchEvent(mouseEvent2);
        }
    }
}

