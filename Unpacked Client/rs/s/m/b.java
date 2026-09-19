/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.m;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.s.m.a;
import rs.s.m.c;
import rs.s.m.d;
import rs.s.m.e;
import rs.ui.m;

class b
extends m {
    private static final Logger a = LoggerFactory.getLogger(b.class);
    private final JTextArea b = new JTextArea();
    private final UndoManager c = new UndoManager();

    b() {
    }

    void a(a a2) {
        this.getParent().setLayout(new BorderLayout());
        this.getParent().add((Component)this, "Center");
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setBackground(rs.gui.d.d);
        this.b.setTabSize(2);
        this.b.setLineWrap(true);
        this.b.setWrapStyleWord(true);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.setBackground(rs.gui.d.c);
        this.b.setOpaque(false);
        String string = a2.a();
        this.b.setText(string);
        this.c.setLimit(500);
        this.b.getDocument().addUndoableEditListener(undoableEditEvent -> this.c.addEdit(undoableEditEvent.getEdit()));
        this.b.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
        this.b.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
        this.b.getActionMap().put("Undo", new c(this, "Undo"));
        this.b.getActionMap().put("Redo", new d(this, "Redo"));
        this.b.addFocusListener(new e(this, a2));
        jPanel.add((Component)this.b, "Center");
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add((Component)jPanel, "Center");
    }

    void a(String string) {
        this.b.setText(string);
    }

    static /* synthetic */ UndoManager a(b b2) {
        return b2.c;
    }

    static /* synthetic */ Logger b() {
        return a;
    }

    static /* synthetic */ JTextArea b(b b2) {
        return b2.b;
    }
}

