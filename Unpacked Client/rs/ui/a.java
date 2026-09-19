/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.annotation.Nullable;
import javax.swing.JPanel;

public final class a
extends JPanel {
    public static final int a = 765;
    public static final int b = 503;
    public static final Dimension c = new Dimension(765, 503);

    public a(@Nullable Applet applet) {
        this.setSize(c);
        this.setMinimumSize(c);
        this.setPreferredSize(c);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.black);
        if (applet == null) {
            return;
        }
        this.add((Component)applet, "Center");
    }
}

