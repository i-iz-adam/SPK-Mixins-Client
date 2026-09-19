/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 */
package rs.ui.components.a;

import com.google.a.b.as;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.function.Consumer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import rs.a.g_0;
import rs.e.i;
import rs.ui.components.a.a;
import rs.ui.components.a.d;
import rs.ui.components.a.e;
import rs.ui.components.a.k;
import rs.ui.components.a.n;
import rs.ui.components.a.o;
import rs.ui.components.a.r;
import rs.ui.components.a.s;
import rs.ui.components.a.t;
import rs.ui.components.a.u;

public class q
extends JDialog {
    static final String a = "colorpicker";
    private static final int b = 410;
    private static final int c = 380;
    private static final int d = 160;
    private static final String e = "#000";
    private final a f = new a(160);
    private final k g = new k(160);
    private final n h = new n();
    private final e i = new e("Red");
    private final e j = new e("Green");
    private final e k = new e("Blue");
    private final e l = new e("Opacity");
    private final JTextField m = new JTextField();
    private final boolean n;
    private Color o;
    private Consumer<Color> p;
    private Consumer<Color> q;

    q(Window window, Color color2, String string, boolean bl, i i2, d d2) {
        super(window, "Color Picker - " + string, Dialog.ModalityType.MODELESS);
        this.o = color2;
        this.n = bl;
        o o2 = new o(i2);
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.setSize(410, 380);
        this.setBackground(rs.gui.d.i);
        this.setDefaultCloseOperation(2);
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.putClientProperty("substancelaf.internal.colorizationFactor", 1.0);
        jPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        JPanel jPanel2 = new JPanel(new BorderLayout(15, 0));
        JPanel jPanel3 = new JPanel(new BorderLayout(15, 0));
        jPanel3.add((Component)this.g, "West");
        jPanel3.add((Component)this.f, "Center");
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        JLabel jLabel = new JLabel("Previous");
        jLabel.setHorizontalAlignment(0);
        JLabel jLabel2 = new JLabel(" Current ");
        jLabel2.setHorizontalAlignment(0);
        n n3 = new n();
        n3.a(color2);
        this.h.a(color2);
        JPanel jPanel5 = new JPanel(new GridBagLayout());
        JLabel jLabel3 = new JLabel("#");
        this.m.setBackground(rs.gui.d.c);
        JLabel jLabel4 = new JLabel("Hex color");
        jLabel4.setVerticalAlignment(3);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 1, 0, 1);
        jPanel5.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridwidth = 0;
        jPanel5.add((Component)this.m, gridBagConstraints);
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        JPanel jPanel6 = o2.a(color -> {
            if (!bl) {
                this.l.a(color.getAlpha());
            }
            this.a((Color)color);
            this.b();
        }, bl);
        jPanel4.add((Component)jPanel6, gridBagConstraints);
        gridBagConstraints.gridwidth = -1;
        ++gridBagConstraints.gridy;
        jPanel4.add((Component)jLabel, gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel4.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.gridwidth = -1;
        gridBagConstraints.fill = 1;
        jPanel4.add((Component)n3, gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel4.add((Component)this.h, gridBagConstraints);
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        jPanel4.add((Component)jLabel4, gridBagConstraints);
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 2;
        jPanel4.add((Component)jPanel5, gridBagConstraints);
        JPanel jPanel7 = new JPanel(new GridLayout(4, 1, 0, 10));
        jPanel7.setBorder(new EmptyBorder(15, 0, 0, 0));
        jPanel7.add(this.i);
        jPanel7.add(this.j);
        jPanel7.add(this.k);
        jPanel7.add(this.l);
        if (bl) {
            this.l.setVisible(false);
            this.setSize(410, 340);
        }
        jPanel2.add((Component)jPanel3, "West");
        jPanel2.add((Component)jPanel4, "Center");
        jPanel2.add((Component)jPanel7, "South");
        jPanel.add((Component)jPanel2, "North");
        this.setContentPane(jPanel);
        n3.addMouseListener(new r(this, bl, n3));
        this.g.a((Integer n2) -> {
            this.f.a((int)n2);
            this.c();
        });
        this.f.a(this::a);
        ((AbstractDocument)this.m.getDocument()).setDocumentFilter(new s(this));
        this.m.addFocusListener(new t(this));
        this.m.addActionListener(actionEvent -> this.d());
        this.i.a((Integer n2) -> {
            this.a(new Color((int)n2, this.o.getGreen(), this.o.getBlue()));
            this.b();
        });
        this.j.a((Integer n2) -> {
            this.a(new Color(this.o.getRed(), (int)n2, this.o.getBlue()));
            this.b();
        });
        this.k.a((Integer n2) -> {
            this.a(new Color(this.o.getRed(), this.o.getGreen(), (int)n2));
            this.b();
        });
        this.l.a((Integer n2) -> this.a(new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), (int)n2)));
        this.b();
        this.c();
        this.addWindowListener(new u(this, color2, o2, d2));
    }

    private void b() {
        this.g.a(this.o);
        this.f.a(this.g.a(), this.o);
    }

    private void c() {
        String string = this.n ? g_0.c(this.a()) : g_0.d(this.a());
        this.m.setText(string.toUpperCase());
        this.h.a(this.o);
        this.i.a(this.o.getRed());
        this.j.a(this.o.getGreen());
        this.k.a(this.o.getBlue());
        if (!this.n) {
            this.l.a(this.o.getAlpha());
        }
    }

    private void a(Color color) {
        if (color == this.o) {
            return;
        }
        this.o = color;
        if (this.o.getAlpha() != this.l.a()) {
            this.o = new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), this.l.a());
        }
        this.c();
        if (this.p != null) {
            this.p.accept(this.o);
        }
    }

    private void d() {
        Color color;
        String string = this.m.getText();
        if (as.c((String)string)) {
            string = e;
        }
        if ((color = g_0.d(string)) == null) {
            return;
        }
        if (!this.n && g_0.a(string)) {
            this.l.a(color.getAlpha());
        }
        this.a(color);
        this.b();
    }

    @Override
    public void setLocationRelativeTo(Component component) {
        if (this.getOwner() == null) {
            super.setLocationRelativeTo(component);
            return;
        }
        GraphicsConfiguration graphicsConfiguration = this.getOwner().getGraphicsConfiguration();
        Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
        Rectangle rectangle = graphicsConfiguration.getBounds();
        rectangle.setRect(rectangle.x + insets.left, rectangle.y + insets.top, rectangle.width - insets.left - insets.right, rectangle.height - insets.top - insets.bottom);
        Dimension dimension = component.getSize();
        Point point = component.getLocationOnScreen();
        Dimension dimension2 = this.getSize();
        int n2 = point.x + (dimension.width - dimension2.width) / 2;
        int n3 = point.y + (dimension.height - dimension2.height) / 2;
        if (n3 + dimension2.height > rectangle.y + rectangle.height) {
            n3 = rectangle.y + rectangle.height - dimension2.height;
        }
        if (n3 < rectangle.y) {
            n3 = rectangle.y;
        }
        if (n2 + dimension2.width > rectangle.x + rectangle.width) {
            n2 = rectangle.x + rectangle.width - dimension2.width;
        }
        if (n2 < rectangle.x) {
            n2 = rectangle.x;
        }
        this.setLocation(n2, n3);
    }

    static String a(DocumentFilter.FilterBypass filterBypass, int n2, int n3, String string) {
        Document document = filterBypass.getDocument();
        StringBuilder stringBuilder = new StringBuilder(document.getText(0, document.getLength()));
        stringBuilder.replace(n2, n2 + n3, string);
        return stringBuilder.toString();
    }

    public Color a() {
        return this.o;
    }

    public void a(Consumer<Color> consumer) {
        this.p = consumer;
    }

    public void b(Consumer<Color> consumer) {
        this.q = consumer;
    }

    static /* synthetic */ e a(q q2) {
        return q2.l;
    }

    static /* synthetic */ void a(q q2, Color color) {
        q2.a(color);
    }

    static /* synthetic */ void b(q q2) {
        q2.b();
    }

    static /* synthetic */ void c(q q2) {
        q2.d();
    }

    static /* synthetic */ Consumer d(q q2) {
        return q2.q;
    }

    static /* synthetic */ Color e(q q2) {
        return q2.o;
    }
}

