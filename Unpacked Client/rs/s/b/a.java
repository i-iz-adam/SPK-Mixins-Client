/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.L
 *  com.google.a.b.as
 *  com.google.a.d.ag
 *  com.google.a.d.fR
 *  com.google.a.m.l
 *  javax.inject.Inject
 *  org.apache.commons.a.d
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.b;

import com.google.a.b.L;
import com.google.a.b.as;
import com.google.a.d.ag;
import com.google.a.d.fR;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.inject.Inject;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.s;
import rs.a.g_0;
import rs.a.j_0;
import rs.gui.m_0;
import rs.gui.w;
import rs.s.b.b;
import rs.s.b.c;
import rs.s.b.d;
import rs.s.b.f;
import rs.s.b.h;
import rs.s.b.i;
import rs.s.b.l;
import rs.s.b.m;
import rs.s.b.n;
import rs.s.b.o;
import rs.s.b.q;
import rs.s.b.u;
import rs.s.b.y;
import rs.s.e;
import rs.s.g;
import rs.ui.j;

public class a
extends rs.ui.m {
    private static final Logger k = LoggerFactory.getLogger(a.class);
    private static final int l = 6;
    public static final ImageIcon a;
    public static final ImageIcon b;
    public static final ImageIcon c;
    public static final ImageIcon d;
    static final ImageIcon e;
    static final ImageIcon f;
    private static final Map<rs.e.m, Boolean> m;
    private final q n;
    private final rs.e.i o;
    private final g p;
    private final rs.ui.components.a.d q;
    private final ListCellRenderer<Enum<?>> r = new rs.ui.components.c();
    private final h s;
    private final JLabel t;
    private final u u;
    private final JButton v;
    private n w = null;

    @Inject
    private a(q q2, rs.e.i i2, g g2, rs.ui.components.a.d d2) {
        super(false);
        this.n = q2;
        this.o = i2;
        this.p = g2;
        this.q = d2;
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setLayout(new BorderLayout(0, 6));
        this.add((Component)jPanel, "North");
        this.s = new h();
        this.s.setBorder(new EmptyBorder(8, 10, 10, 10));
        this.s.setLayout(new j(0, 1, 0, 5));
        this.s.setAlignmentX(0.0f);
        h h2 = new h();
        h2.setLayout(new BorderLayout());
        h2.add((Component)this.s, "North");
        JScrollPane jScrollPane = new JScrollPane(h2);
        jScrollPane.setHorizontalScrollBarPolicy(31);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        this.add((Component)jScrollPane, "Center");
        this.v = new JButton(e);
        this.v.setRolloverIcon(f);
        m_0.a(this.v);
        this.v.setPreferredSize(new Dimension(22, 0));
        this.v.setBorder(new EmptyBorder(0, 0, 0, 5));
        this.v.addActionListener(actionEvent -> q2.e().c());
        this.v.setToolTipText("Back");
        jPanel.add((Component)this.v, "West");
        this.u = new u();
        jPanel.add((Component)this.u, "East");
        this.t = new JLabel();
        this.t.setForeground(Color.WHITE);
        jPanel.add(this.t);
    }

    void a(n n2) {
        assert (this.w == null);
        this.w = n2;
        String string = n2.d();
        this.t.setText(string);
        this.t.setForeground(Color.WHITE);
        this.t.setToolTipText("<html>" + string + ":<br>" + n2.e() + "</html>");
        String string2 = n2.c();
        Object var4_4 = null;
        if (n2.j() != null && !n2.j().getClass().getAnnotation(e.class).k()) {
            this.u.a(n2.i());
            this.u.setSelected(this.p.d(n2.j()));
            this.u.addItemListener(itemEvent -> {
                if (this.u.isSelected()) {
                    this.n.c(n2.j());
                } else {
                    this.n.d(n2.j());
                }
            });
        } else {
            this.u.setVisible(false);
        }
        if (n2.j().getClass().getAnnotation(e.class).l()) {
            this.u.setVisible(false);
        }
        this.b();
    }

    private void a(rs.e.m m2, JButton jButton, JPanel jPanel) {
        boolean bl = !jPanel.isVisible();
        jPanel.setVisible(bl);
        jButton.setIcon(bl ? c : a);
        jButton.setRolloverIcon(bl ? d : b);
        jButton.setToolTipText(bl ? "Retract" : "Expand");
        m.put(m2, bl);
        SwingUtilities.invokeLater(jPanel::revalidate);
    }

    private void b() {
        Object object;
        Object object2;
        JComponent jComponent;
        Object object3;
        this.s.removeAll();
        rs.e.d d2 = this.w.h();
        HashMap<String, JPanel> hashMap = new HashMap<String, JPanel>();
        TreeMap<rs.e.j, Object> treeMap = new TreeMap<rs.e.j, Object>((j2, j3) -> ag.a().a(j2.c(), j3.c()).a((Comparable)((Object)j2.b()), (Comparable)((Object)j3.b())).b());
        Object object5 = d2.b().iterator();
        while (object5.hasNext()) {
            rs.e.m object42;
            object3 = (object42 = object5.next()).e();
            boolean bl = m.getOrDefault(object42, !object3.d());
            jComponent = new JPanel();
            jComponent.setLayout(new BoxLayout(jComponent, 1));
            jComponent.setMinimumSize(new Dimension(350, 0));
            object2 = new JPanel();
            ((Container)object2).setLayout(new BorderLayout());
            ((JComponent)object2).setMinimumSize(new Dimension(350, 0));
            ((JComponent)object2).setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.gui.d.e), new EmptyBorder(0, 0, 3, 1)));
            jComponent.add((Component)object2, "North");
            object = new JButton(bl ? c : a);
            ((AbstractButton)object).setRolloverIcon(bl ? d : b);
            ((JComponent)object).setPreferredSize(new Dimension(18, 0));
            ((JComponent)object).setBorder(new EmptyBorder(0, 0, 0, 5));
            ((JComponent)object).setToolTipText(bl ? "Retract" : "Expand");
            m_0.a((AbstractButton)object);
            ((Container)object2).add((Component)object, "West");
            String string = object3.a();
            JLabel jLabel = new JLabel(string);
            jLabel.setForeground(rs.gui.d.a);
            jLabel.setFont(rs.gui.w.c());
            jLabel.setToolTipText("<html>" + string + ":<br>" + object3.b() + "</html>");
            ((Container)object2).add((Component)jLabel, "Center");
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new j(0, 1, 0, 5));
            jPanel.setMinimumSize(new Dimension(350, 0));
            jPanel.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.gui.d.e), new EmptyBorder(6, 0, 6, 0)));
            jPanel.setVisible(bl);
            jComponent.add((Component)jPanel, "South");
            b b2 = new b(this, object42, (JButton)object, jPanel);
            ((AbstractButton)object).addActionListener(arg_0 -> this.a(object42, (JButton)object, jPanel, arg_0));
            jLabel.addMouseListener(b2);
            ((Component)object2).addMouseListener(b2);
            hashMap.put(object42.d(), jPanel);
            treeMap.put(object42, jComponent);
        }
        for (rs.e.h h2 : d2.c()) {
            if (h2.d().e()) continue;
            object3 = new JPanel();
            ((Container)object3).setLayout(new BorderLayout());
            ((JComponent)object3).setMinimumSize(new Dimension(350, 0));
            String string = h2.d().c();
            jComponent = new JLabel(string);
            jComponent.setForeground(Color.WHITE);
            object2 = h2.d().d();
            if (!"".equals(object2)) {
                jComponent.setToolTipText("<html>" + string + ":<br>" + (String)object2 + "</html>");
            }
            rs.s.b.o.a((JLabel)jComponent, this.a(this.w, h2));
            ((Container)object3).add((Component)jComponent, "Center");
            if (h2.e() == Boolean.TYPE) {
                ((Container)object3).add((Component)this.a(d2, h2), "East");
            } else if (h2.e() == Integer.TYPE) {
                ((Container)object3).add((Component)this.b(d2, h2), "East");
            } else if (h2.e() == Double.TYPE) {
                ((Container)object3).add((Component)this.c(d2, h2), "East");
            } else if (h2.e() == String.class) {
                ((Container)object3).add((Component)this.d(d2, h2), "South");
            } else if (h2.e() == Color.class) {
                ((Container)object3).add((Component)this.e(d2, h2), "East");
            } else if (h2.e() == Dimension.class) {
                ((Container)object3).add((Component)this.f(d2, h2), "East");
            } else if (h2.e() instanceof Class && ((Class)h2.e()).isEnum()) {
                ((Container)object3).add(this.g(d2, h2), "East");
            } else if (h2.e() == l.class || h2.e() == m.class) {
                ((Container)object3).add((Component)this.h(d2, h2), "East");
            } else if (h2.e() instanceof ParameterizedType && (object = (ParameterizedType)h2.e()).getRawType() == Set.class) {
                ((Container)object3).add(this.i(d2, h2), "East");
            }
            object = (JPanel)hashMap.get(h2.d().h());
            if (object == null) {
                treeMap.put(h2, object3);
                continue;
            }
            ((Container)object).add((Component)object3);
        }
        treeMap.values().forEach(this.s::add);
        object5 = new JButton("Reset");
        ((AbstractButton)object5).addActionListener(arg_0 -> this.a((JButton)object5, arg_0));
        this.s.add((Component)object5);
        if (!this.w.j().getClass().getAnnotation(e.class).k()) {
            JButton jButton = new JButton("Back");
            jButton.addActionListener(actionEvent -> this.n.e().c());
            this.s.add(jButton);
            this.v.setVisible(true);
        } else {
            this.v.setVisible(false);
        }
        this.revalidate();
    }

    private JCheckBox a(rs.e.d d2, rs.e.h h2) {
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setBackground(rs.gui.d.f);
        jCheckBox.setSelected(Boolean.parseBoolean(this.o.a(d2.a().a(), h2.d().b())));
        jCheckBox.addActionListener(actionEvent -> this.a(jCheckBox, d2, h2));
        return jCheckBox;
    }

    private JSpinner b(rs.e.d d2, rs.e.h h2) {
        int n2 = (Integer)L.a((Object)((Integer)this.o.a(d2.a().a(), h2.d().b(), Integer.TYPE)), (Object)0);
        rs.e.o o2 = h2.f();
        int n3 = 0;
        int n4 = Integer.MAX_VALUE;
        if (o2 != null) {
            n3 = o2.a();
            n4 = o2.b();
        }
        n2 = com.google.a.m.l.a((int)n2, (int)n3, (int)n4);
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(n2, n3, n4, 1);
        JSpinner jSpinner = new JSpinner(spinnerNumberModel);
        JComponent jComponent = jSpinner.getEditor();
        JFormattedTextField jFormattedTextField = ((JSpinner.DefaultEditor)jComponent).getTextField();
        jFormattedTextField.setColumns(6);
        jSpinner.addChangeListener(changeEvent -> this.a(jSpinner, d2, h2));
        rs.e.q q2 = h2.h();
        if (q2 != null) {
            jFormattedTextField.setFormatterFactory(new y(q2));
        }
        return jSpinner;
    }

    private JSpinner c(rs.e.d d2, rs.e.h h2) {
        double d3 = (Double)L.a((Object)((Double)this.o.a(d2.a().a(), h2.d().b(), Double.TYPE)), (Object)0.0);
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(d3, 0.0, Double.MAX_VALUE, 0.1);
        JSpinner jSpinner = new JSpinner(spinnerNumberModel);
        JComponent jComponent = jSpinner.getEditor();
        JFormattedTextField jFormattedTextField = ((JSpinner.DefaultEditor)jComponent).getTextField();
        jFormattedTextField.setColumns(6);
        jSpinner.addChangeListener(changeEvent -> this.a(jSpinner, d2, h2));
        return jSpinner;
    }

    private JTextComponent d(rs.e.d d2, rs.e.h h2) {
        JTextComponent jTextComponent;
        if (h2.d().g()) {
            jTextComponent = new JPasswordField();
        } else {
            JTextArea jTextArea = new JTextArea();
            jTextArea.setLineWrap(true);
            jTextArea.setWrapStyleWord(true);
            jTextComponent = jTextArea;
        }
        jTextComponent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextComponent.setText(this.o.a(d2.a().a(), h2.d().b()));
        jTextComponent.addFocusListener(new c(this, jTextComponent, d2, h2));
        return jTextComponent;
    }

    private rs.ui.components.b e(rs.e.d d2, rs.e.h h2) {
        rs.ui.components.b b2;
        boolean bl;
        Color color = (Color)this.o.a(d2.a().a(), h2.d().b(), (Type)((Object)Color.class));
        boolean bl2 = bl = h2.g() == null;
        if (color == null) {
            b2 = new rs.ui.components.b("Pick a color", Color.BLACK);
        } else {
            String string = "#" + (bl ? g_0.c(color) : g_0.d(color)).toUpperCase();
            b2 = new rs.ui.components.b(string, color);
        }
        b2.setFocusable(false);
        b2.addMouseListener(new d(this, b2, h2, bl, d2));
        return b2;
    }

    private JPanel f(rs.e.d d2, rs.e.h h2) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        Dimension dimension = (Dimension)L.a((Object)((Dimension)this.o.a(d2.a().a(), h2.d().b(), (Type)((Object)Dimension.class))), (Object)new Dimension());
        int n2 = dimension.width;
        int n3 = dimension.height;
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(n2, 0, Integer.MAX_VALUE, 1);
        JSpinner jSpinner = new JSpinner(spinnerNumberModel);
        JComponent jComponent = jSpinner.getEditor();
        JFormattedTextField jFormattedTextField = ((JSpinner.DefaultEditor)jComponent).getTextField();
        jFormattedTextField.setColumns(4);
        SpinnerNumberModel spinnerNumberModel2 = new SpinnerNumberModel(n3, 0, Integer.MAX_VALUE, 1);
        JSpinner jSpinner2 = new JSpinner(spinnerNumberModel2);
        JComponent jComponent2 = jSpinner2.getEditor();
        JFormattedTextField jFormattedTextField2 = ((JSpinner.DefaultEditor)jComponent2).getTextField();
        jFormattedTextField2.setColumns(4);
        ChangeListener changeListener = changeEvent -> this.o.b(d2.a().a(), h2.d().b(), String.valueOf(jSpinner.getValue()) + "x" + String.valueOf(jSpinner2.getValue()));
        jSpinner.addChangeListener(changeListener);
        jSpinner2.addChangeListener(changeListener);
        jPanel.add((Component)jSpinner, "West");
        jPanel.add((Component)new JLabel(" x "), "Center");
        jPanel.add((Component)jSpinner2, "East");
        return jPanel;
    }

    private JComboBox<Enum<?>> g(rs.e.d d2, rs.e.h h2) {
        Class clazz = (Class)h2.e();
        JComboBox jComboBox = new JComboBox((Enum[])clazz.getEnumConstants());
        jComboBox.setRenderer(this.r);
        jComboBox.setPreferredSize(new Dimension(jComboBox.getPreferredSize().width, 25));
        jComboBox.setForeground(Color.WHITE);
        jComboBox.setFocusable(false);
        try {
            Object t2 = Enum.valueOf(clazz, this.o.a(d2.a().a(), h2.d().b()));
            jComboBox.setSelectedItem(t2);
            jComboBox.setToolTipText(rs.A.s.a(t2));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            k.debug("invalid selected item", (Throwable)illegalArgumentException);
        }
        jComboBox.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == 1) {
                this.a(jComboBox, d2, h2);
                jComboBox.setToolTipText(rs.A.s.a((Enum)jComboBox.getSelectedItem()));
            }
        });
        return jComboBox;
    }

    private i h(rs.e.d d2, rs.e.h h2) {
        l l2 = (l)this.o.a(d2.a().a(), h2.d().b(), (Class)h2.e());
        i i2 = new i(l2, h2.e() == m.class);
        i2.addFocusListener(new rs.s.b.e(this, i2, d2, h2));
        return i2;
    }

    private JList<Enum<?>> i(rs.e.d d2, rs.e.h h2) {
        ParameterizedType parameterizedType = (ParameterizedType)h2.e();
        Class clazz = (Class)parameterizedType.getActualTypeArguments()[0];
        Set set = (Set)this.o.a(d2.a().a(), (String)null, h2.d().b(), parameterizedType);
        JList jList = new JList((Enum[])clazz.getEnumConstants());
        jList.setCellRenderer(this.r);
        jList.setSelectionMode(2);
        jList.setLayoutOrientation(0);
        jList.setSelectedIndices(((Set)L.a((Object)set, Collections.emptySet())).stream().mapToInt(object -> org.apache.commons.a.d.a((Object[])clazz.getEnumConstants(), (Object)object)).toArray());
        jList.addFocusListener(new f(this, jList, d2, h2));
        return jList;
    }

    private void a(Component component, rs.e.d d2, rs.e.h h2) {
        int n2;
        rs.e.g g2 = h2.d();
        if (!as.c((String)g2.f()) && (n2 = JOptionPane.showOptionDialog(component, g2.f(), "Are you sure?", 0, 2, null, new String[]{"Yes", "No"}, "No")) != 0) {
            this.b();
            return;
        }
        if (component instanceof JCheckBox) {
            JCheckBox jCheckBox = (JCheckBox)component;
            this.o.b(d2.a().a(), h2.d().b(), "" + jCheckBox.isSelected());
        } else if (component instanceof JSpinner) {
            JSpinner jSpinner = (JSpinner)component;
            this.o.b(d2.a().a(), h2.d().b(), String.valueOf(jSpinner.getValue()));
        } else if (component instanceof JTextComponent) {
            JTextComponent jTextComponent = (JTextComponent)component;
            this.o.b(d2.a().a(), h2.d().b(), jTextComponent.getText());
        } else if (component instanceof rs.ui.components.a.q) {
            rs.ui.components.a.q q2 = (rs.ui.components.a.q)component;
            this.o.b(d2.a().a(), h2.d().b(), "" + q2.a().getRGB());
        } else if (component instanceof JComboBox) {
            JComboBox jComboBox = (JComboBox)component;
            this.o.b(d2.a().a(), h2.d().b(), ((Enum)jComboBox.getSelectedItem()).name());
        } else if (component instanceof i) {
            i i2 = (i)component;
            this.o.a(d2.a().a(), h2.d().b(), i2.a());
        } else if (component instanceof JList) {
            JList jList = (JList)component;
            List list = jList.getSelectedValuesList();
            this.o.a(d2.a().a(), h2.d().b(), fR.b(list));
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(367, super.getPreferredSize().height);
    }

    private JMenuItem a(n n2, rs.e.h h2) {
        JMenuItem jMenuItem = new JMenuItem("Reset");
        jMenuItem.addActionListener(actionEvent -> {
            rs.e.d d2 = n2.h();
            rs.e.e e2 = d2.a();
            rs.e.g g2 = h2.d();
            this.o.b(e2.a(), g2.b());
            this.o.a(n2.g(), false);
            this.b();
        });
        return jMenuItem;
    }

    private /* synthetic */ void a(JButton jButton, ActionEvent actionEvent) {
        int n2 = JOptionPane.showOptionDialog(jButton, "Are you sure you want to reset this plugin's configuration?", "Are you sure?", 0, 2, null, new String[]{"Yes", "No"}, "No");
        if (n2 == 0) {
            this.o.a(this.w.g(), true);
            rs.s.a a2 = this.w.j();
            if (a2 != null) {
                a2.c();
            }
            this.b();
        }
    }

    private /* synthetic */ void a(rs.e.m m2, JButton jButton, JPanel jPanel, ActionEvent actionEvent) {
        this.a(m2, jButton, jPanel);
    }

    static /* synthetic */ void a(a a2, rs.e.m m2, JButton jButton, JPanel jPanel) {
        a2.a(m2, jButton, jPanel);
    }

    static /* synthetic */ void a(a a2, Component component, rs.e.d d2, rs.e.h h2) {
        a2.a(component, d2, h2);
    }

    static /* synthetic */ rs.ui.components.a.d a(a a2) {
        return a2.q;
    }

    static {
        m = new HashMap<rs.e.m, Boolean>();
        BufferedImage bufferedImage = j_0.b(a.class, "config_back_icon.png");
        e = new ImageIcon(bufferedImage);
        f = new ImageIcon(j_0.a((Image)bufferedImage, -100));
        BufferedImage bufferedImage2 = j_0.b(a.class, "/util/arrow_right.png");
        bufferedImage2 = j_0.b((Image)bufferedImage2, -121);
        a = new ImageIcon(bufferedImage2);
        b = new ImageIcon(j_0.a((Image)bufferedImage2, -100));
        BufferedImage bufferedImage3 = j_0.a(bufferedImage2, 1.5707963267948966);
        c = new ImageIcon(bufferedImage3);
        d = new ImageIcon(j_0.a((Image)bufferedImage3, -100));
    }
}

