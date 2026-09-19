/*
 * Decompiled with CFR 0.152.
 */
package rs.s.c;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.stream.Collectors;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import rs.Client;
import rs.a.j;
import rs.gui.Launcher;
import rs.l.f.a.d.b;
import rs.l.f.a.d.c;
import rs.l.f.e;
import rs.n.a;
import rs.ui.m;

public class d
extends m {
    private static final String a = "Recoloring N/A";
    private static final String b = "Recoloring NPC";
    private static final String c = "Recoloring Item";
    private static final String d = "Recoloring Object";
    private static final Dimension e = new Dimension(150, 27);
    private JList<String> f;
    private JLabel g;
    private b k;
    private c l = rs.l.f.e.d().j();
    private rs.l.f.a.d.a m = rs.l.f.e.d().k();

    public d() {
        this.k = this.l;
        this.j();
    }

    public static boolean b() {
        return rs.f.a.c();
    }

    public void a(j j2, boolean bl) {
        if (this.l.u() != null && this.l.u() == j2 && !bl) {
            this.i();
            return;
        }
        this.i();
        this.a(b);
        this.a(this.l, j2, bl);
        this.a(j2);
    }

    public void a(j j2) {
        if (j2 != null && j2.aG != null && j2.aG.L != null) {
            System.out.println("Models for NPC id " + j2.n() + " (" + j2.o() + "):");
            for (int n2 : j2.aG.L) {
                System.out.println(" - Model ID: " + n2);
            }
        } else {
            System.out.println("No models found for NPC " + String.valueOf(j2 != null ? Integer.valueOf(j2.n()) : "null"));
        }
    }

    public void a(int n2, boolean bl) {
        this.i();
        this.a(c);
        this.a(rs.l.f.e.d().k(), (Object)n2, bl);
    }

    public void b(int n2, boolean bl) {
        this.i();
        this.a(d);
        this.a(rs.l.f.e.d().l(), (Object)n2, bl);
    }

    public void c() {
        this.a(a);
    }

    public boolean e() {
        return b.equals(this.g.getText());
    }

    public boolean f() {
        return c.equals(this.g.getText());
    }

    private void i() {
        Client.ba = false;
        this.l.m();
    }

    private void a(String string) {
        this.g.setText(string);
    }

    private void a(b b2, Object object, boolean bl) {
        this.k = b2;
        b2.a(object, bl);
        Launcher.n().d();
    }

    private void j() {
        this.a(5);
        this.a("Reset Item Defs", "::itemdef reset");
        this.a("Reset NPC Defs", "::resetnpcdefs");
        this.a("Repack cache", "::repack");
        this.a(5);
        this.g = new JLabel(a);
        this.a(this.g);
        this.add(this.g);
        this.f = this.m();
        JScrollPane jScrollPane = this.b(this.f);
        this.add(jScrollPane);
        this.a(5);
        this.a("Color inverse", (ActionEvent actionEvent) -> this.k.c(((JCheckBox)actionEvent.getSource()).isSelected()));
        this.a("Hide modified", (ActionEvent actionEvent) -> this.k.b(((JCheckBox)actionEvent.getSource()).isSelected()));
        this.a(5);
        JButton jButton = this.a("Copy selected", 100, 27);
        jButton.addActionListener(this::a);
        this.add(jButton);
    }

    private JButton a(String string, int n2, int n3) {
        JButton jButton = new JButton(string);
        Dimension dimension = new Dimension(n2, n3);
        jButton.setPreferredSize(dimension);
        jButton.setMinimumSize(dimension);
        jButton.setMaximumSize(dimension);
        jButton.setFocusable(false);
        return jButton;
    }

    private JButton a(String string, String string2) {
        JButton jButton = this.a(string, rs.s.c.d.e.width, rs.s.c.d.e.height);
        jButton.addActionListener(actionEvent -> this.b(string2));
        this.add(jButton);
        return jButton;
    }

    private void a(int n2) {
        this.add(Box.createVerticalStrut(n2));
    }

    private JCheckBox a(String string, ActionListener actionListener) {
        JCheckBox jCheckBox = new JCheckBox(string);
        jCheckBox.addActionListener(actionListener);
        this.add(jCheckBox);
        return jCheckBox;
    }

    private JList<String> m() {
        DefaultListModel defaultListModel = new DefaultListModel();
        JList<String> jList = new JList<String>(defaultListModel);
        jList.setSelectionMode(2);
        jList.addListSelectionListener(listSelectionEvent -> this.a(jList));
        return jList;
    }

    private void a(JList<String> jList) {
        this.k.t().clear();
        for (String string : jList.getSelectedValuesList()) {
            this.k.t().add(Integer.parseInt(string.replaceAll("[^\\d-]", "")));
        }
    }

    private JScrollPane b(JList<String> jList) {
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setFocusable(false);
        jScrollPane.setAlignmentX(0.5f);
        jScrollPane.getViewport().setBackground(Color.BLACK);
        jScrollPane.setPreferredSize(new Dimension(jScrollPane.getPreferredSize().width, 211));
        return jScrollPane;
    }

    private void a(ActionEvent actionEvent) {
        String string = String.join((CharSequence)",", this.k.t().stream().map(String::valueOf).collect(Collectors.toCollection(HashSet::new)));
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(string), null);
        Launcher.n().a("Development", "Color string added to keyboard!", true);
    }

    private void b(String string) {
        Client.ap = string.equals("::itemdef reset") ? "::resetitems" : string;
        rs.n.a.a(Launcher.n().o(), string, Client.cT);
    }

    private void a(JComponent jComponent) {
        jComponent.setAlignmentX(0.0f);
    }

    public JList<String> g() {
        return this.f;
    }

    public JLabel h() {
        return this.g;
    }
}

