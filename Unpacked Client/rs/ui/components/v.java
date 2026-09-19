/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import rs.gui.w;
import rs.ui.components.f;
import rs.ui.components.shadowlabel.a;

public class v
extends f {
    private int a;
    private int b;
    private List<Integer> c = Collections.emptyList();
    private final JLabel d = new a();
    private final JLabel e = new a();
    private final JLabel f = new a();
    private String g = "";
    private String h = "";

    public v() {
        this.setLayout(new GridLayout(1, 3));
        this.setBackground(Color.GREEN.darker());
        this.setForeground(Color.GREEN.brighter());
        this.setPreferredSize(new Dimension(100, 16));
        this.d.setFont(w.b());
        this.d.setForeground(Color.WHITE);
        this.d.setBorder(new EmptyBorder(2, 5, 0, 0));
        this.e.setFont(w.b());
        this.e.setForeground(Color.WHITE);
        this.e.setHorizontalAlignment(4);
        this.e.setBorder(new EmptyBorder(2, 0, 0, 5));
        this.f.setFont(w.b());
        this.f.setForeground(Color.WHITE);
        this.f.setHorizontalAlignment(0);
        this.f.setBorder(new EmptyBorder(2, 0, 0, 0));
        this.add(this.d);
        this.add(this.f);
        this.add(this.e);
    }

    @Override
    public void paint(Graphics graphics) {
        int n2 = this.b();
        int n3 = (int)((float)this.getSize().width * ((float)n2 / 100.0f));
        super.paint(graphics);
        graphics.setColor(this.getForeground());
        graphics.fillRect(0, 0, n3, 16);
        for (Integer n4 : this.c) {
            int n5 = this.getSize().width * n4 / this.a;
            if (n5 <= n3) continue;
            graphics.fillRect(n5, 0, 1, 16);
        }
        super.paintComponents(graphics);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (bl) {
            this.d.setForeground(Color.GRAY);
            this.e.setForeground(Color.GRAY);
            this.f.setText(this.h);
        } else {
            this.d.setForeground(Color.WHITE);
            this.e.setForeground(Color.WHITE);
            this.f.setText(this.g);
        }
    }

    public void a(String string) {
        this.d.setText(string);
    }

    public void b(String string) {
        this.e.setText(string);
    }

    public void c(String string) {
        this.g = string;
        this.f.setText(this.a() ? this.h : string);
    }

    public void d(String string) {
        this.h = string;
        this.f.setText(this.a() ? string : this.g);
    }

    public int b() {
        if (this.a == 0) {
            return 0;
        }
        return this.b * 100 / this.a;
    }

    public void a(int n2) {
        this.a = n2;
        this.repaint();
    }

    public void b(int n2) {
        this.b = n2;
        this.repaint();
    }

    public void a(List<Integer> list) {
        this.c = list;
        this.repaint();
    }
}

