/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.a.F
 */
package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import org.apache.commons.a.F;
import rs.gui.d;
import rs.gui.m_0;
import rs.gui.w;
import rs.ui.components.i;
import rs.ui.components.l;
import rs.ui.components.m;
import rs.ui.components.n;
import rs.ui.components.o;
import rs.ui.components.p;

public class k
extends JPanel {
    private final JLabel b;
    private final i c;
    private final JButton d;
    private final JButton e;
    private final DefaultListModel<String> f;
    private final List<Runnable> g = new ArrayList<Runnable>();

    public k() {
        this.setLayout(new BorderLayout());
        this.b = new JLabel();
        this.b.setPreferredSize(new Dimension(30, 0));
        this.b.setVerticalAlignment(0);
        this.b.setHorizontalAlignment(0);
        this.c = new i();
        this.c.setBorder(null);
        JTextField jTextField = this.c.c();
        jTextField.removeMouseListener(jTextField.getMouseListeners()[jTextField.getMouseListeners().length - 1]);
        l l2 = new l(this);
        this.c.addMouseListener(l2);
        jTextField.addMouseListener(l2);
        this.d = this.a(rs.gui.d.j, Color.PINK, w.c());
        this.d.setText("\u00d7");
        this.d.addActionListener(actionEvent -> {
            this.a((String)null);
            for (Runnable runnable : this.g) {
                runnable.run();
            }
        });
        this.f = new DefaultListModel();
        this.f.addListDataListener(new m(this));
        JList<String> jList = new JList<String>();
        jList.setSelectionMode(0);
        jList.setModel(this.f);
        jList.addListSelectionListener(listSelectionEvent -> {
            String string = (String)jList.getSelectedValue();
            if (string == null) {
                return;
            }
            this.c.a(string);
            this.c.c().selectAll();
            this.c.c().requestFocusInWindow();
        });
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.setLightWeightPopupEnabled(true);
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(jList, "Center");
        jPopupMenu.addFocusListener(new n(this, jPopupMenu, jList));
        this.e = this.a(rs.gui.d.f, rs.gui.d.e, w.e());
        this.e.setText("\u25be");
        this.e.addActionListener(actionEvent -> {
            jPopupMenu.setPopupSize(this.getWidth(), jList.getPreferredSize().height);
            jPopupMenu.show(this, 0, this.e.getHeight());
            jPopupMenu.revalidate();
            jPopupMenu.requestFocusInWindow();
        });
        this.c.c().getDocument().addDocumentListener(new o(this));
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(0, 0, 0, 0));
        jPanel.setOpaque(false);
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)this.d, "East");
        jPanel.add((Component)this.e, "West");
        this.d();
        this.add((Component)this.b, "West");
        this.add((Component)this.c, "Center");
        this.add((Component)jPanel, "East");
    }

    private JButton a(Color color, Color color2, Font font) {
        JButton jButton = new JButton();
        jButton.setPreferredSize(new Dimension(30, 0));
        jButton.setFont(font);
        jButton.setBorder(null);
        jButton.setRolloverEnabled(true);
        m_0.a(jButton);
        jButton.setForeground(color);
        jButton.addMouseListener(new p(this, jButton, color2, color));
        return jButton;
    }

    private void d() {
        boolean bl = F.c((CharSequence)this.c.a());
        this.d.setVisible(!bl);
        this.e.setVisible(!this.f.isEmpty() && bl);
    }

    public void a(ActionListener actionListener) {
        this.c.a(actionListener);
    }

    public void a(a a2) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(a2.a()));
        this.b.setIcon(imageIcon);
    }

    public void a(ImageIcon imageIcon) {
        this.b.setIcon(imageIcon);
    }

    public String a() {
        return this.c.a();
    }

    public void a(String string) {
        assert (SwingUtilities.isEventDispatchThread());
        this.c.a(string);
    }

    @Override
    public void setBackground(Color color) {
        if (color == null) {
            return;
        }
        super.setBackground(color);
        if (this.c != null) {
            this.c.setBackground(color);
        }
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        this.c.a(color);
    }

    @Override
    public void addKeyListener(KeyListener keyListener) {
        this.c.addKeyListener(keyListener);
    }

    public void a(Runnable runnable) {
        this.g.add(runnable);
    }

    @Override
    public void removeKeyListener(KeyListener keyListener) {
        this.c.removeKeyListener(keyListener);
    }

    public void a(boolean bl) {
        this.c.a(bl);
        if (!bl) {
            super.setBackground(this.c.d());
        }
    }

    @Override
    public boolean requestFocusInWindow() {
        super.requestFocusInWindow();
        return this.c.requestFocusInWindow();
    }

    public Document b() {
        return this.c.b();
    }

    public DefaultListModel<String> c() {
        return this.f;
    }

    static /* synthetic */ i a(k k2) {
        return k2.c;
    }

    static /* synthetic */ void a(k k2, Color color) {
        super.setBackground(color);
    }

    static /* synthetic */ void b(k k2) {
        k2.d();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("search.png");
        public static final /* enum */ a b = new a("loading_spinner.gif");
        public static final /* enum */ a c = new a("loading_spinner_darker.gif");
        public static final /* enum */ a d = new a("error.png");
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public String a() {
            return this.e;
        }

        private a(String string2) {
            this.e = string2;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            f = rs.ui.components.k$a.b();
        }
    }
}

