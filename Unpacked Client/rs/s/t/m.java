/*
 * Decompiled with CFR 0.152.
 */
package rs.s.t;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import rs.A.p;
import rs.a.g_0;
import rs.a.j_0;
import rs.gui.d;
import rs.gui.w;
import rs.s.t.b;
import rs.s.t.i;
import rs.s.t.n;

public class m
extends JPanel {
    private static final Dimension c = new Dimension(32, 32);
    public static Icon a = new ImageIcon(j_0.b(m.class, "ge_icon.png"));
    public static Icon b = new ImageIcon(j_0.b(m.class, "time.png"));

    m(i i2, Image image, String string, int n2, int n3, int n4, String string2, b b2, String string3, String string4) {
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(5);
        this.setLayout(borderLayout);
        this.setToolTipText(string);
        this.setBackground(d.c);
        Color color = this.getBackground();
        ArrayList<JPanel> arrayList = new ArrayList<JPanel>();
        arrayList.add(this);
        n n5 = new n(this, arrayList, color);
        this.addMouseListener(n5);
        this.setBorder(new EmptyBorder(5, 5, 5, 0));
        JLabel jLabel = new JLabel();
        jLabel.setPreferredSize(c);
        if (image != null) {
            jLabel.setIcon(new ImageIcon(image));
        }
        this.add((Component)jLabel, "Before");
        JPanel jPanel = new JPanel(new GridLayout(3, 1));
        arrayList.add(jPanel);
        jPanel.setBackground(color);
        JLabel jLabel2 = new JLabel();
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setMaximumSize(new Dimension(0, 0));
        jLabel2.setPreferredSize(new Dimension(0, 0));
        if (n4 > 1) {
            jLabel2.setText(this.a(string, " <font color='yellow'>(x" + p.b(n4) + ")</font>"));
        } else {
            jLabel2.setText(string);
        }
        jPanel.add(jLabel2);
        JLabel jLabel3 = new JLabel();
        jLabel3.setIcon(new ImageIcon(b2.c()));
        if (b2.b() > 1) {
            jLabel3.setText(this.a("<font color='#6EE16E'>" + p.b(n3) + "</font>", " <font color='#2FFF9F'>(" + p.a((long)n3 * (long)b2.b()) + ")</font>"));
        } else {
            jLabel3.setText(p.b(n3));
        }
        jLabel3.setForeground(d.l);
        jPanel.add(jLabel3);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        arrayList.add(jPanel2);
        jPanel2.setBackground(color);
        JLabel jLabel4 = new JLabel();
        jLabel4.setText(this.a(string2));
        jLabel4.setFont(w.b());
        jLabel4.setForeground(d.m);
        jPanel2.add((Component)jLabel4, "West");
        JLabel jLabel5 = new JLabel();
        String string5 = string3 + " &#8594; " + string4;
        jLabel5.setIcon(a);
        jLabel5.setFont(w.b());
        jLabel5.setText(this.a(string5, ""));
        jLabel5.setForeground(d.n);
        jLabel5.setBorder(new CompoundBorder(jLabel5.getBorder(), new EmptyBorder(0, 0, 0, 7)));
        jPanel2.add((Component)jLabel5, "East");
        jPanel.add(jPanel2);
        this.add((Component)jPanel, "Center");
    }

    private void a(JPanel jPanel, Color color) {
        jPanel.setBackground(color);
        for (Component component : jPanel.getComponents()) {
            component.setBackground(color);
        }
    }

    private String a(String string) {
        ZonedDateTime zonedDateTime;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS").withZone(ZoneId.of("UTC"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(string, dateTimeFormatter);
        if (zonedDateTime2.isAfter(zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC")))) {
            return "Very recent";
        }
        Duration duration = Duration.between(zonedDateTime2, zonedDateTime);
        long l2 = duration.toDays() / 365L;
        long l3 = duration.toDays() % 365L / 30L;
        long l4 = duration.toDays() % 365L % 30L;
        long l5 = duration.toHours() % 24L;
        long l6 = duration.toMinutes() % 60L;
        long l7 = duration.getSeconds() % 60L;
        if (l2 > 0L) {
            return l2 + " years ago";
        }
        if (l3 > 0L) {
            return l3 + " months ago";
        }
        if (l4 > 0L) {
            return l4 + " days ago";
        }
        if (l5 > 0L) {
            return l5 + " hours ago";
        }
        if (l6 > 0L) {
            return l6 + " minutes ago";
        }
        return l7 + " seconds ago";
    }

    private String a(String string, String string2) {
        return "<html><body style = 'color:white'>" + string + "<span style = 'color:" + g_0.b(d.f) + "'>" + string2 + "</span></body></html>";
    }

    static /* synthetic */ void a(m m2, JPanel jPanel, Color color) {
        m2.a(jPanel, color);
    }
}

