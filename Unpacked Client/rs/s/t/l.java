/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  com.google.c.B
 *  com.google.c.t
 *  com.google.c.w
 *  com.google.c.z
 *  javax.inject.Inject
 */
package rs.s.t;

import com.google.a.b.as;
import com.google.c.B;
import com.google.c.t;
import com.google.c.w;
import com.google.c.z;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.a.j_0;
import rs.gui.Launcher;
import rs.gui.d;
import rs.s.t.b;
import rs.s.t.c;
import rs.s.t.i;
import rs.s.t.m;
import rs.ui.components.k;
import rs.ui.components.u;

public class l
extends JPanel {
    private static final String a = "ERROR_PANEL";
    private static final String b = "RESULTS_PANEL";
    private static final String c = "PAGE_PANEL";
    private static final int d = 15;
    private static final ImageIcon e;
    private static final ImageIcon f;
    private static final ImageIcon g;
    private static final ImageIcon h;
    private final GridBagConstraints i = new GridBagConstraints();
    private final CardLayout j = new CardLayout();
    private final k k = new k();
    private final JPanel l = new JPanel();
    private final JPanel m = new JPanel(this.j);
    private final ScheduledExecutorService n;
    private final i o;
    private final JLabel p = new JLabel();
    private final JButton q = new JButton();
    private final JButton r = new JButton();
    private final u s = new u();
    private String t = "";
    private int u = 1;
    private int v = 0;
    private int w = 0;

    @Inject
    private l(ScheduledExecutorService scheduledExecutorService, i i2) {
        this.o = i2;
        this.n = scheduledExecutorService;
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(5, 5));
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setBackground(rs.gui.d.d);
        this.k.a(k.a.a);
        this.k.setPreferredSize(new Dimension(100, 30));
        this.k.setBackground(rs.gui.d.c);
        this.k.a(rs.gui.d.h);
        this.k.a((ActionEvent actionEvent) -> {
            this.t = this.k.a();
            this.a(1, false);
            this.a(false);
        });
        this.k.a(() -> {
            this.t = "";
            this.a();
        });
        this.l.setLayout(new GridBagLayout());
        this.l.setBackground(rs.gui.d.d);
        this.i.fill = 2;
        this.i.weightx = 1.0;
        this.i.gridx = 0;
        this.i.gridy = 0;
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setBackground(rs.gui.d.d);
        jPanel2.add((Component)this.l, "North");
        JScrollPane jScrollPane = new JScrollPane(jPanel2);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        jScrollPane.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        jScrollPane.setVisible(false);
        this.q.setIcon(e);
        this.q.setRolloverIcon(f);
        this.q.addActionListener(actionEvent -> this.a(this.u - 1, true));
        this.r.setIcon(g);
        this.r.setRolloverIcon(h);
        this.r.addActionListener(actionEvent -> this.a(this.u + 1, true));
        this.p.setBorder(new EmptyBorder(0, 111, 0, 0));
        this.p.setText("Page 1");
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.add((Component)this.q, "West");
        jPanel3.add((Component)this.p, "Center");
        jPanel3.add((Component)this.r, "East");
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.setBackground(rs.gui.d.d);
        jPanel4.add((Component)this.s, "North");
        this.s.a("Trading Post Search", "Here you can search for an item by its name to find its sale history.");
        this.m.add((Component)jScrollPane, b);
        this.m.add((Component)jPanel4, a);
        jPanel.add((Component)this.k, "North");
        jPanel.add((Component)this.m, "Center");
        jPanel.add((Component)jPanel3, "South");
        this.add((Component)jPanel, "Center");
    }

    void a(String string) {
        this.t = string;
        this.k.a(this.t);
        this.n.execute(() -> this.a(true));
    }

    private boolean a() {
        String string = this.t;
        if (as.c((String)string)) {
            this.l.removeAll();
            SwingUtilities.invokeLater(this.l::updateUI);
            return false;
        }
        this.l.removeAll();
        this.k.setBackground(rs.gui.d.c);
        this.k.a(false);
        this.r.setEnabled(false);
        this.q.setEnabled(false);
        this.k.a(k.a.b);
        return true;
    }

    private void a(boolean bl) {
        if (!Launcher.n().o().fc) {
            this.k.a(k.a.d);
            this.s.a("Please login!", "You must be logged into the server to use this feature.");
            this.j.show(this.m, a);
            this.k.a(true);
            return;
        }
        if (!this.a()) {
            return;
        }
        String string = this.t;
        int n2 = this.u;
        this.n.execute(() -> {
            try {
                this.a(string, n2);
            }
            catch (IOException iOException) {
                this.k.a(k.a.d);
                this.s.a("Error", "There has been an issue with your search!");
                this.j.show(this.m, a);
                this.k.a(true);
                iOException.printStackTrace();
            }
        });
    }

    private void a(String string, int n2) {
        String string2 = "https://hqxg0u8s64.execute-api.ca-central-1.amazonaws.com/Production/tradingpost?search_text=" + URLEncoder.encode(string, StandardCharsets.UTF_8.toString()) + "&page=" + n2;
        URL uRL = new URL(string2);
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        B b2 = new B();
        w w2 = b2.a((Reader)new InputStreamReader((InputStream)uRLConnection.getContent()));
        t t2 = w2.u();
        ArrayList<c> arrayList = new ArrayList<c>();
        for (w w3 : t2) {
            Image image;
            c c2 = this.a(w3);
            arrayList.add(c2);
            this.w = c2.e();
            for (int i2 = 0; i2 <= 5 && (image = this.o.a(c2.f())) == null; ++i2) {
                try {
                    Thread.sleep(100L);
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
        }
        rs.h.c.a(() -> this.a(arrayList));
    }

    private c a(w w2) {
        z z2 = w2.t();
        int n2 = z2.c("id").j();
        int n3 = z2.c("item_id").j();
        String string = z2.c("time").d();
        String string2 = z2.c("item_name").d();
        String string3 = z2.c("seller").d();
        String string4 = z2.c("buyer").d();
        int n4 = z2.c("currency").j();
        int n5 = z2.c("price").j();
        int n6 = z2.c("amount").j();
        c c2 = new c();
        c2.a(n2);
        c2.b(n3);
        c2.c(string2);
        c2.b(string3.replaceAll("_", " "));
        c2.a(string4.replaceAll("_", " "));
        c2.a(rs.s.t.b.values()[n4]);
        c2.e(n5);
        c2.c(n6);
        c2.d(string);
        return c2;
    }

    private void a(List<c> list) {
        this.v = 0;
        this.j.show(this.m, b);
        SwingUtilities.invokeLater(() -> {
            if (list.isEmpty()) {
                this.k.a(k.a.d);
                this.s.a("No results found.", "No items were found with that name, please try again.");
                this.j.show(this.m, a);
                this.k.a(true);
                return;
            }
            int n2 = 0;
            for (c c2 : list) {
                Image image = this.o.a(c2.f());
                m m2 = new m(this.o, image, c2.a(), c2.f(), c2.i(), c2.g(), c2.k(), c2.j(), c2.d(), c2.c());
                if (n2++ > 0) {
                    JPanel jPanel = new JPanel(new BorderLayout());
                    jPanel.setBackground(rs.gui.d.d);
                    jPanel.setBorder(new EmptyBorder(5, 0, 0, 0));
                    jPanel.add((Component)m2, "North");
                    this.l.add((Component)jPanel, this.i);
                } else {
                    this.l.add((Component)m2, this.i);
                }
                ++this.v;
                ++this.i.gridy;
            }
            this.k.a(true);
            this.r.setEnabled(true);
            this.q.setEnabled(true);
            if (!list.isEmpty()) {
                this.k.a(k.a.a);
            }
        });
    }

    private void a(int n2, boolean bl) {
        if (n2 < 1) {
            n2 = 1;
        }
        if (this.v < 15 && n2 > this.u) {
            return;
        }
        boolean bl2 = this.u != n2;
        this.u = n2;
        if (bl2) {
            this.p.setText("Page " + this.u);
            if (bl && this.a()) {
                this.a(false);
            }
        }
    }

    static {
        BufferedImage bufferedImage = j_0.b(l.class, "back_icon.png");
        BufferedImage bufferedImage2 = j_0.b(l.class, "fwd_icon.png");
        e = new ImageIcon(bufferedImage);
        f = new ImageIcon(j_0.a((Image)bufferedImage, -180));
        g = new ImageIcon(bufferedImage2);
        h = new ImageIcon(j_0.a((Image)bufferedImage2, -180));
    }
}

