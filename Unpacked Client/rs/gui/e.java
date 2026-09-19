/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import rs.gui.f;
import rs.gui.g;
import rs.gui.h;
import rs.gui.i;
import rs.gui.j;
import rs.gui.k;
import rs.gui.l;
import rs.gui.m;
import rs.gui.n;
import rs.gui.o;
import rs.gui.p;
import rs.gui.q;
import rs.gui.r;
import rs.gui.s;
import rs.gui.t;

public class e
extends JPanel {
    private static final int a = 6;
    private static final long b = 6217721914414303902L;

    public e() {
        this.setLayout(new BoxLayout(this, 1));
        this.setAlignmentX(0.5f);
        JLabel jLabel = new JLabel("Check these pages out for server information!");
        jLabel.setAlignmentX(0.5f);
        this.add(jLabel);
        this.add(Box.createRigidArea(new Dimension(0, 9)));
        JButton jButton = new JButton("Server rules");
        jButton.setAlignmentX(0.5f);
        jButton.addActionListener(new f(this));
        this.add(jButton);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton2 = new JButton("Forums/Community");
        jButton2.setAlignmentX(0.5f);
        jButton2.addActionListener(new m(this));
        this.add(jButton2);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton3 = new JButton("Latest updates");
        jButton3.setAlignmentX(0.5f);
        jButton3.addActionListener(new n(this));
        this.add(jButton3);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton4 = new JButton("Price guide");
        jButton4.setAlignmentX(0.5f);
        jButton4.addActionListener(new o(this));
        this.add(jButton4);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JLabel jLabel2 = new JLabel("These commands will aid your PKing needs!");
        jLabel2.setAlignmentX(0.5f);
        this.add(jLabel2);
        this.add(Box.createRigidArea(new Dimension(0, 9)));
        JButton jButton5 = new JButton("::switch (Switches your magic spell book)");
        jButton5.setAlignmentX(0.5f);
        jButton5.addActionListener(new p(this));
        this.add(jButton5);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton6 = new JButton("::food (Spawns x28 un-noted food)");
        jButton6.setAlignmentX(0.5f);
        jButton6.addActionListener(new q(this));
        this.add(jButton6);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton7 = new JButton("::veng (Spawns a set of veng runes)");
        jButton7.setAlignmentX(0.5f);
        jButton7.addActionListener(new r(this));
        this.add(jButton7);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton8 = new JButton("::barrage (Spawns a set of barrage runes)");
        jButton8.setAlignmentX(0.5f);
        jButton8.addActionListener(new s(this));
        this.add(jButton8);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton9 = new JButton("::tb (Spawns a set of teleblock runes)");
        jButton9.setAlignmentX(0.5f);
        jButton9.addActionListener(new t(this));
        this.add(jButton9);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton10 = new JButton("::entangle (Spawns a set of entangle runes)");
        jButton10.setAlignmentX(0.5f);
        jButton10.addActionListener(new g(this));
        this.add(jButton10);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton11 = new JButton("::pots (Spawns a set of melee pots)");
        jButton11.setAlignmentX(0.5f);
        jButton11.addActionListener(new h(this));
        this.add(jButton11);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton12 = new JButton("::brew (Spawns a saradomin brew)");
        jButton12.setAlignmentX(0.5f);
        jButton12.addActionListener(new i(this));
        this.add(jButton12);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton13 = new JButton("::rest (Spawns a restore pot)");
        jButton13.setAlignmentX(0.5f);
        jButton13.addActionListener(new j(this));
        this.add(jButton13);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton14 = new JButton("::range (Spawns a ranger pot set)");
        jButton14.setAlignmentX(0.5f);
        jButton14.addActionListener(new k(this));
        this.add(jButton14);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
        JButton jButton15 = new JButton("::mage (Spawns a set of mage pot set)");
        jButton15.setAlignmentX(0.5f);
        jButton15.addActionListener(new l(this));
        this.add(jButton15);
        this.add(Box.createRigidArea(new Dimension(0, 6)));
    }
}

