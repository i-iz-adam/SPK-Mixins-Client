/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import rs.Client;
import rs.gui.b.a.o;
import rs.gui.b.a.p;
import rs.gui.b.a.r;
import rs.gui.b.a.t;
import rs.gui.b.a.u;
import rs.gui.b.a.v;
import rs.gui.b.h;

public class n {
    private static Icon a = null;
    private static Icon b = null;
    private static Icon c = null;
    private static Icon d = null;
    private static Icon e = null;
    private static Icon f = null;

    public static JPopupMenu a(h h2) {
        JMenuItem jMenuItem;
        Object object2;
        n.a();
        JPopupMenu jPopupMenu = new JPopupMenu("Loadout folders");
        boolean bl = false;
        for (Object object2 : h2.f().keySet()) {
            jMenuItem = new JMenuItem((String)object2, a);
            jMenuItem.addActionListener(new o(jPopupMenu, jMenuItem, h2, (String)object2));
            if (jMenuItem.getText().equalsIgnoreCase(h2.f().e())) {
                jMenuItem.setBackground(Color.ORANGE);
            }
            jPopupMenu.add(jMenuItem);
        }
        JMenuItem jMenuItem2 = new JMenuItem("Create new folder", b);
        jMenuItem2.addActionListener(new p(h2));
        jPopupMenu.add(jMenuItem2);
        object2 = new JMenuItem("Rename", d);
        ((AbstractButton)object2).addActionListener(new r(h2));
        jPopupMenu.add((JMenuItem)object2);
        jMenuItem = new JMenuItem("Move up", e);
        jMenuItem.addActionListener(new t(h2));
        if (h2.f().size() > 1) {
            jPopupMenu.add(jMenuItem);
        }
        JMenuItem jMenuItem3 = new JMenuItem("Move down", f);
        jMenuItem3.addActionListener(new u(h2));
        if (h2.f().size() > 1) {
            jPopupMenu.add(jMenuItem3);
        }
        JMenuItem jMenuItem4 = new JMenuItem("Delete", c);
        jMenuItem4.addActionListener(new v(h2));
        jPopupMenu.add(jMenuItem4);
        return jPopupMenu;
    }

    public static void a() {
        if (a == null || b == null || c == null || d == null || e == null || f == null) {
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                a = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
                b = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
                c = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
                d = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
                e = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
                f = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
            } else {
                try {
                    a = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/folder.png")));
                    b = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/create.png")));
                    c = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/delete.png")));
                    d = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/edit.png")));
                    e = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/up.png")));
                    f = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/down.png")));
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }
}

