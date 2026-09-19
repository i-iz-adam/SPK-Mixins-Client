/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import rs.Client;
import rs.gui.Launcher;
import rs.gui.b.a;
import rs.gui.b.a.a_0;
import rs.gui.b.a.b_0;
import rs.gui.b.c;
import rs.gui.b.c.b;
import rs.gui.b.d;
import rs.gui.b.g;
import rs.gui.b.i;
import rs.gui.b.j;
import rs.gui.b.k;
import rs.gui.b.l;
import rs.gui.b.n;
import rs.gui.b.o;
import rs.gui.b.p;
import rs.gui.f_0;
import rs.ui.m;

public class h
extends m {
    public static final String a = "Main folder";
    public static h b;
    public f_0 c;
    private d e;
    private rs.gui.b.b.d f;
    private b g;
    public JComboBox<String> d;
    private JPopupMenu k;
    private JButton l;
    private a_0 m;
    private Icon n;
    private Icon o;
    private Icon p;
    private Icon q;
    private Icon r;
    private Icon s;

    public h() {
        Object object2;
        block7: {
            super(false);
            rs.gui.b.g.a();
            this.g = new b();
            this.f = new rs.gui.b.b.d(this);
            this.e = new d(this);
            boolean bl = false;
            c c2 = this.f.a(a, true);
            if (c2.isEmpty()) {
                if (this.f.a().isEmpty()) {
                    object2 = new c(a);
                    this.e.put(a, object2);
                    rs.gui.b.c.a.a(a, (c)object2, this.f);
                    this.e.a(a, (a)((ArrayList)object2).get(0));
                }
            } else {
                this.e.put(a, c2);
                this.f.a(a, (List)this.e.get(a));
            }
            for (String object3 : this.f.a()) {
                this.e.put(object3, this.f.a(object3, false));
            }
            this.f.b();
            new File(rs.gui.b.b.d.e).delete();
            new File(rs.gui.b.b.d.e).delete();
            new File(rs.gui.b.b.d.e).delete();
            new File(rs.gui.b.b.d.b).delete();
            new File(rs.gui.b.b.d.c).delete();
            new File(rs.gui.b.b.d.d).delete();
            try {
                this.e.a((String)this.e.keySet().toArray()[0], 0);
            }
            catch (Exception exception) {
                System.out.println("Loadout Error 120");
                if (!rs.f.a.h.booleanValue()) break block7;
                this.e.clear();
                c c3 = new c(a);
                this.e.put(a, c3);
                rs.gui.b.c.a.a(a, c3, this.f);
                this.e.a(a, (a)c3.get(0));
                this.f.b();
            }
        }
        object2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout((Container)object2, 1);
        ((JComponent)object2).setPreferredSize(new Dimension(350, 488));
        ((Container)object2).setLayout(boxLayout);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setPreferredSize(new Dimension(350, 55));
        for (JPanel jPanel2 : this.m()) {
            jPanel.add(jPanel2);
        }
        ((Container)object2).add(jPanel);
        this.c = new f_0();
        this.c.setPreferredSize(new Dimension(0, 400));
        this.c.setBackground(new Color(50, 50, 50));
        ((Container)object2).add(this.c);
        this.add((Component)object2, "North");
    }

    private List<JPanel> m() {
        ArrayList<JPanel> arrayList = new ArrayList<JPanel>();
        JPanel jPanel = new JPanel();
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.n = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
            this.o = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
            this.p = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
            this.q = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
            this.r = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
            this.s = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
        } else {
            try {
                this.n = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/folder.png")));
                this.o = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/create.png")));
                this.p = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/delete.png")));
                this.q = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/edit.png")));
                this.r = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/up.png")));
                this.s = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/down.png")));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        this.d();
        JButton jButton = b_0.a(this);
        JButton jButton2 = rs.gui.b.a.a.a(this);
        this.l = new JButton("", this.n);
        this.l.setToolTipText("<html>Loadout folders</html>");
        this.l.setPreferredSize(new Dimension(38, 30));
        this.l.addMouseListener(new i(this));
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(this.l);
        JPanel jPanel2 = new JPanel();
        rs.gui.b.a.g g2 = new rs.gui.b.a.g(this.o, this.e);
        g2.setToolTipText("Create a new loadout");
        g2.setPreferredSize(new Dimension(20, 25));
        JButton jButton3 = new JButton("", this.p);
        jButton3.setToolTipText("Delete this loadout");
        jButton3.setPreferredSize(new Dimension(20, 25));
        jButton3.addActionListener(actionEvent -> {
            a a2 = this.e.c();
            String string = this.e.e();
            if (a2 == null) {
                return;
            }
            JFrame jFrame = new JFrame("Delete " + a2.f() + "?");
            JButton jButton = new JButton("Yes, delete \"" + a2.f() + "\"");
            JButton jButton2 = new JButton("No, Nevermind.");
            JPanel jPanel = new JPanel();
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(400, 90);
            jFrame.setLocationRelativeTo(Launcher.n().i().getContentPane());
            jPanel.add(jButton);
            jPanel.add(jButton2);
            jFrame.add(jPanel);
            jButton.addActionListener(new j(this, string, a2, jFrame));
            jButton2.addActionListener(new k(this, jFrame));
            jFrame.setVisible(true);
        });
        JButton jButton4 = new JButton("", this.q);
        jButton4.setToolTipText("Rename the active loadout");
        jButton4.setPreferredSize(new Dimension(20, 25));
        jButton4.addActionListener(new l(this));
        JButton jButton5 = new JButton("", this.r);
        jButton5.setToolTipText("Move loadout up in the list");
        jButton5.setPreferredSize(new Dimension(20, 25));
        jButton5.addActionListener(new n(this));
        JButton jButton6 = new JButton("", this.s);
        jButton6.setToolTipText("Move loadout down in the list");
        jButton6.setPreferredSize(new Dimension(20, 25));
        jButton6.addActionListener(new o(this));
        this.addMouseListener(new p(this));
        this.a(0);
        jPanel2.add(g2);
        jPanel2.add(jButton3);
        jPanel2.add(this.d);
        jPanel2.add(jButton4);
        jPanel2.add(jButton5);
        jPanel2.add(jButton6);
        arrayList.add(jPanel);
        arrayList.add(jPanel2);
        return arrayList;
    }

    public void a(Graphics graphics) {
        this.g.a(graphics);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.g.a(graphics);
    }

    public void a() {
        Launcher.n().b(20, true);
    }

    public void a(int n2) {
        c c2 = this.e.d();
        if (n2 < 0 || n2 >= c2.size()) {
            n2 = 0;
        }
        String[] stringArray = new String[c2.size()];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = ((a)c2.get(i2)).f();
        }
        if (this.d == null) {
            this.d = new rs.gui.b.a.k(this.e, stringArray);
        } else {
            DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.d.getModel();
            defaultComboBoxModel.removeAllElements();
            for (String string : stringArray) {
                defaultComboBoxModel.addElement(string);
            }
            this.d.setModel(defaultComboBoxModel);
        }
        this.e.a(this.e.e(), (a)c2.get(this.d.getSelectedIndex()));
        if (n2 != 0) {
            this.d.setSelectedIndex(n2);
        }
    }

    public void b() {
        this.a(0);
    }

    public void c() {
        if (this.m != null) {
            this.m.dispose();
            this.m = null;
        }
    }

    public void d() {
        this.k = rs.gui.b.a.n.a(this);
    }

    public rs.gui.b.b.d e() {
        return this.f;
    }

    public d f() {
        return this.e;
    }

    public b g() {
        return this.g;
    }

    public JComboBox<String> h() {
        return this.d;
    }

    public JButton i() {
        return this.l;
    }

    public JPopupMenu j() {
        return this.k;
    }

    static /* synthetic */ JPopupMenu a(h h2) {
        return h2.k;
    }

    static /* synthetic */ d b(h h2) {
        return h2.e;
    }

    static /* synthetic */ a_0 a(h h2, a_0 a_02) {
        h2.m = a_02;
        return h2.m;
    }

    static /* synthetic */ a_0 c(h h2) {
        return h2.m;
    }
}

