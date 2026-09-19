/*
 * Decompiled with CFR 0.152.
 */
package rs.s.q.b;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.s.q.d;

public class b
extends JPanel {
    public b(String string, boolean bl) {
        this.setLayout(new GridLayout(bl ? 2 : 1, 1));
        this.setBorder(new EmptyBorder(4, 6, 4, 6));
        this.setBackground(rs.gui.d.c);
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem jMenuItem = new JMenuItem("Copy Fight History Data");
        jMenuItem.addActionListener(actionEvent -> d.e.g());
        JMenuItem jMenuItem2 = new JMenuItem("Import Fight History Data");
        jMenuItem2.addActionListener(actionEvent -> {
            String string = JOptionPane.showInputDialog(this, "Enter the fight history data you wish to import:", "Import Fight History", 1);
            if (string == null || string.length() < 2) {
                return;
            }
            d.e.b(string);
        });
        JMenuItem jMenuItem3 = new JMenuItem("Remove All Fights");
        jMenuItem3.addActionListener(actionEvent -> {
            int n2 = JOptionPane.showConfirmDialog(this, "Are you sure you want to reset all fight history data? This cannot be undone.", "Warning", 0);
            if (n2 == 0) {
                d.e.h();
            }
        });
        jPopupMenu.add(jMenuItem3);
        if (bl) {
            this.setComponentPopupMenu(jPopupMenu);
        }
        JLabel jLabel = new JLabel();
        jLabel.setText(string);
        jLabel.setHorizontalAlignment(0);
        jLabel.setForeground(Color.WHITE);
        this.add(jLabel);
        this.setMaximumSize(new Dimension(350, (int)this.getPreferredSize().getHeight()));
    }
}

