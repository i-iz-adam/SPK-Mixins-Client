/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities
 *  org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities$ExtraComponentKind
 */
package rs.gui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import rs.Client;
import rs.e.i;
import rs.gui.a_0;
import rs.gui.b.h;
import rs.gui.c_0;
import rs.gui.d_0;
import rs.gui.e_0;
import rs.gui.j_0;
import rs.gui.m_0;
import rs.gui.o_0;
import rs.gui.u;
import rs.gui.y;
import rs.gui.z;
import rs.p.a;
import rs.ui.f;
import rs.z.d;

public class Launcher
extends Applet
implements ActionListener {
    public static final boolean a = false;
    private static final long u = 3432444016124110957L;
    public static final int b = 1134;
    public static final int c = 537;
    public static final int d = 765;
    public static final int e = 537;
    public static final int f = 765;
    public static final int g = 503;
    public static final int h = 765;
    public static final int i = 503;
    public static final Dimension j = new Dimension(765, 503);
    private static Launcher v;
    public static ImageIcon k;
    public j_0 l;
    private o_0 w;
    public JPanel m;
    public e_0 n;
    public u o;
    private JButton x;
    private d y = new d();
    public final Object p = new Object();
    public boolean q;
    public boolean r;
    public boolean s;
    private Icon z = null;
    private Icon A = null;
    private TrayIcon B;
    @Inject
    public Client t;
    @Inject
    private f C;
    @Inject
    private i D;

    @Inject
    public Launcher(Client client, f f2, i i2) {
        this.t = client;
        this.C = f2;
        this.D = i2;
    }

    public static void a(Launcher launcher) {
        v = launcher;
    }

    public static void main(String[] stringArray) {
        Locale.setDefault(Locale.ENGLISH);
        System.setProperty("jgoodies.popupDropShadowEnabled", "false");
        System.setProperty("sun.awt.noerasebackground", "true");
        System.setProperty("java.net.preferIPv4Stack", "true");
        m_0.a();
        rs.p.a.a();
        if (rs.f.a.e) {
            File[] fileArray;
            PrintStream printStream = null;
            File file = Paths.get(rs.v.a.b(), new String[0]).toFile();
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = Paths.get(rs.v.a.b(), "logs").toFile();
            String string = new SimpleDateFormat("dd-MM-yyyy HH mm ss").format(Calendar.getInstance().getTime());
            if (!file2.exists()) {
                file2.mkdir();
            }
            if ((fileArray = file2.listFiles()) != null && fileArray.length > 15) {
                Arrays.sort(fileArray, Comparator.comparingLong(File::lastModified));
                for (int i2 = 0; i2 < fileArray.length - 15; ++i2) {
                    if (!fileArray[i2].delete()) continue;
                }
            }
            try {
                printStream = new PrintStream(Paths.get(file2.toString(), string + ".txt").toFile());
                PrintStream printStream2 = System.out;
                System.setOut(printStream);
                System.setErr(printStream);
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new RuntimeException(fileNotFoundException);
            }
        }
    }

    public Launcher() {
    }

    public void a() {
        if (!SystemTray.isSupported()) {
            System.err.println("[Error] Tray icons not supported.");
            return;
        }
        k = null;
        try {
            InputStream inputStream = v.getClass().getResourceAsStream("/assets/icon.png");
            k = new ImageIcon(ImageIO.read(inputStream));
        }
        catch (Exception exception) {
            try {
                k = new ImageIcon("./assets/icon.png");
            }
            catch (Exception exception2) {
                // empty catch block
            }
        }
        if (k != null) {
            this.B = new TrayIcon(k.getImage(), "SpawnPK RSPS");
            this.B.setImageAutoSize(true);
            this.B.addMouseListener(new y(this));
        } else {
            System.out.println("No image!");
        }
    }

    public void b() {
        if (System.getProperty("os.name").contains("Mac OS X")) {
            this.s = true;
        }
        this.l = new j_0();
        this.o = new u();
        this.w = new o_0();
        this.o.setFocusable(false);
        this.o.setUndecorated(true);
        if (rs.f.a.h.booleanValue()) {
            this.o.setTitle("SpawnPK - [BETA TEST WORLD]");
        } else {
            this.o.setTitle("[V" + rs.f.a.c + "] " + rs.f.a.a.a());
        }
        if (rs.l.b.a.d.c) {
            this.o.setTitle("SPK Editor Kit");
        }
        this.o.setResizable(true);
        this.o.setFocusable(true);
        this.o.setDefaultCloseOperation(3);
        this.o.setLocationRelativeTo(this.o.getOwner());
        this.o.setMinimumSize(new Dimension(rs.f.a.v ? 1134 : 769, 537));
        this.o.setCursor(Cursor.getDefaultCursor());
        this.o.setFocusTraversalKeysEnabled(false);
        JComponent jComponent = SubstanceCoreUtilities.getTitlePaneComponent((Window)this.o);
        this.w.putClientProperty("substancelaf.internal.titlePane.extraComponentKind", SubstanceTitlePaneUtilities.ExtraComponentKind.TRAILING);
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel.png"));
            this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel2.png"));
        } else {
            try {
                this.z = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/panel.png")));
                this.A = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/panel2.png")));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        this.w.setLayout(new GridBagLayout());
        this.x = new JButton(this.z);
        this.x.setPreferredSize(new Dimension(23, 22));
        this.x.setMinimumSize(new Dimension(23, 22));
        this.x.setFocusable(false);
        this.x.setToolTipText("Hide/show side panel");
        this.x.addActionListener(new z(this));
        if (!rs.l.b.a.d.c) {
            this.w.add(this.x);
        }
        jComponent.add(this.w);
        LayoutManager layoutManager = jComponent.getLayout();
        jComponent.setLayout(new a_0(this, layoutManager, jComponent));
        this.m = new JPanel();
        this.m.setLayout(new BoxLayout(this.m, 0));
        this.t = new Client();
        this.t.setLayout(null);
        if (!rs.l.b.a.d.c) {
            this.t.setSize(new Dimension(765, 503));
        }
        this.t.setBackground(new Color(10, 10, 10));
        this.n = new e_0();
        if (!rs.l.b.a.d.c) {
            this.n.setSize(new Dimension(765, 503));
            this.n.setMinimumSize(new Dimension(765, 503));
        }
        this.n.setPreferredSize(new Dimension(765, 503));
        this.n.setLayout(new BorderLayout());
        this.n.setBackground(Color.black);
        this.t.init();
        this.t.start();
        this.n.add((Component)this.t, "Center");
        this.l.setBackground(new Color(10, 10, 10));
        this.n.setBackground(new Color(10, 10, 10));
        this.m.setBackground(new Color(10, 10, 10));
        this.m.add(this.n);
        if (!rs.l.b.a.d.c) {
            this.m.add(this.l);
        }
        this.o.getContentPane().add(this.m);
        this.o.pack();
        this.o.a();
        this.o.setLocationRelativeTo(this.o.getOwner());
        this.o.setVisible(true);
        this.o.toFront();
        this.requestFocus();
        this.t.requestFocus();
        if (!rs.f.a.v) {
            this.l.setVisible(false);
            this.o.setSize(772, 503);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    public void c() {
    }

    public void d() {
        this.a(20);
    }

    public void a(boolean bl) {
        this.C.a(bl);
    }

    public static boolean e() {
        return Launcher.n().p().o();
    }

    @Override
    public Dimension getSize() {
        return this.o.getSize();
    }

    public void a(int n2) {
        this.a(n2, false);
    }

    public void a(int n2, boolean bl) {
        if (!rs.l.b.a.d.c) {
            // empty if block
        }
    }

    public void b(boolean bl) {
        SwingUtilities.invokeLater(new c_0(this, bl));
    }

    public void a(String string, String string2) {
        this.a(string, string2, false);
    }

    public void a(String string, String string2, boolean bl) {
        if (this.B == null) {
            return;
        }
        if (!bl) {
            if (!rs.f.a.aP) {
                return;
            }
            if (this.i().isActive()) {
                return;
            }
            if (!this.y.a(string, 5000L)) {
                return;
            }
        }
        this.B.displayMessage(string, string2, TrayIcon.MessageType.NONE);
    }

    public d f() {
        return this.y;
    }

    public TrayIcon g() {
        return this.B;
    }

    public void a(int n2, int n3, int n4, int n5) {
        SwingUtilities.invokeLater(new d_0(this, n2, n3, n4, n5));
    }

    public boolean h() {
        return this.s;
    }

    public void a(Graphics graphics) {
    }

    public JFrame i() {
        return this.C.m();
    }

    public rs.ui.a j() {
        return this.C.n();
    }

    public h k() {
        return rs.gui.b.h.b;
    }

    public void b(int n2, boolean bl) {
        if (rs.f.a.br && !bl) {
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        Timer timer = new Timer(n2, actionEvent -> {
            Launcher.n().k().repaint();
            ((Timer)actionEvent.getSource()).stop();
            this.r = false;
        });
        timer.setInitialDelay(n2);
        timer.start();
    }

    public JPanel l() {
        return this.m;
    }

    public j_0 m() {
        return this.l;
    }

    public static Launcher n() {
        return v;
    }

    public Client o() {
        return this.t;
    }

    public f p() {
        return this.C;
    }

    public i q() {
        return this.D;
    }

    static /* synthetic */ o_0 b(Launcher launcher) {
        return launcher.w;
    }
}

