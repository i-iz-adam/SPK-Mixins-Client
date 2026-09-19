/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  javax.annotation.Nullable
 *  javax.inject.Singleton
 *  org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities
 *  org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities$ExtraComponentKind
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.ui;

import com.google.inject.Inject;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.Window;
import java.awt.desktop.QuitStrategy;
import java.awt.image.BufferedImage;
import java.time.Duration;
import javax.annotation.Nullable;
import javax.inject.Singleton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.o;
import rs.A.u;
import rs.Client;
import rs.a.j_0;
import rs.e.i;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.gui.m_0;
import rs.gui.u;
import rs.gui.w;
import rs.k.j;
import rs.runelite.events.ClientShutdown;
import rs.runelite.events.NavigationButtonAdded;
import rs.runelite.events.NavigationButtonRemoved;
import rs.ui.a;
import rs.ui.b;
import rs.ui.c.c;
import rs.ui.g;
import rs.ui.h;
import rs.ui.l;
import rs.ui.m;

@Singleton
public class f {
    private static final Logger a = LoggerFactory.getLogger(f.class);
    private static final String b = "runelite";
    private static final String c = "clientBounds";
    private static final String d = "clientMaximized";
    private static final String e = "clientSidebarClosed";
    private final CardLayout f = new CardLayout();
    @Inject
    private final Client g;
    @Inject
    private final i h;
    @Inject
    private final EventBus i;
    private TrayIcon j;
    private rs.gui.u k;
    private a l;
    private boolean m;
    private boolean n;
    private JPanel o;
    private JPanel p;
    private b q;
    private rs.ui.c r;
    private BufferedImage s;
    private BufferedImage t;
    private l u;
    private JButton v;
    private l w;
    private JButton x;
    private m y;
    private Cursor z;
    private final rs.g.a.b A;
    private final rs.s.h B;

    @Inject
    public f(Client client, rs.g.a.b b2, i i2, rs.s.h h2, EventBus eventBus) {
        this.A = b2;
        this.g = client;
        this.h = i2;
        this.B = h2;
        this.i = eventBus;
    }

    public void a() {
        SwingUtilities.invokeAndWait(() -> {
            m_0.a();
            m_0.a((LookAndFeel)((Object)new c()));
            m_0.a(rs.gui.w.a());
            this.k = new rs.gui.u();
            rs.A.o.a(this.k);
            Launcher.n().a();
            if (Launcher.k != null) {
                Launcher.n();
                this.k.setIconImage(Launcher.k.getImage());
                Launcher.n();
                this.j = m_0.a(Launcher.k.getImage(), rs.f.a.A, this.k);
            }
            if (rs.f.a.h.booleanValue()) {
                this.k.setTitle(rs.f.a.a.a() + " - [BETA TEST WORLD]");
            } else {
                this.k.setTitle("[V" + rs.f.a.c + "] " + rs.f.a.a.a());
            }
            this.k.getLayeredPane().setCursor(Cursor.getDefaultCursor());
            this.k.setLocationRelativeTo(this.k.getOwner());
            this.k.setResizable(true);
            this.k.setDefaultCloseOperation(0);
            if (rs.k.j.a() == rs.k.j.b) {
                Desktop.getDesktop().setQuitStrategy(QuitStrategy.CLOSE_ALL_WINDOWS);
            }
            this.k.addWindowListener(new g(this));
            this.k.addWindowStateListener(windowEvent -> {
                if (windowEvent.getNewState() == 0) {
                    SwingUtilities.invokeLater(this.k::a);
                }
            });
            this.p = new JPanel();
            this.p.setLayout(new BoxLayout(this.p, 0));
            this.l = new a(this.g);
            this.p.add(this.l);
            this.g.init();
            this.g.start();
            this.o = new JPanel();
            this.o.setLayout(this.f);
            this.o.setMinimumSize(new Dimension(0, 0));
            this.o.setMaximumSize(new Dimension(0, 0));
            this.o.setPreferredSize(new Dimension(0, 0));
            this.o.putClientProperty("substancelaf.internal.colorizationFactor", 1.0);
            this.p.add(this.o);
            this.q = new b();
            this.r = new rs.ui.c();
            this.k.add(this.p);
            this.n = rs.k.j.a() == rs.k.j.a;
            this.k.setUndecorated(this.n);
            if (this.n) {
                this.k.getRootPane().setWindowDecorationStyle(1);
                JComponent jComponent = SubstanceCoreUtilities.getTitlePaneComponent((Window)this.k);
                this.r.putClientProperty("substancelaf.internal.titlePane.extraComponentKind", SubstanceTitlePaneUtilities.ExtraComponentKind.TRAILING);
                jComponent.add(this.r);
                LayoutManager layoutManager = jComponent.getLayout();
                jComponent.setLayout(new h(this, layoutManager, jComponent));
            }
            this.k.a(u.a.c);
            this.s = j_0.b(f.class, this.n ? "open.png" : "open_rs.png");
            this.t = j_0.a(this.s, true, false);
            this.u = rs.ui.l.a().a(100).a(this.s).a("Open SideBar").a(this::g).a();
            this.v = m_0.a(this.u, 0, null);
            this.r.a(this.u, this.v);
            this.a(true);
        });
    }

    @Subscribe
    public void onNavigationButtonAdded(NavigationButtonAdded navigationButtonAdded) {
        SwingUtilities.invokeLater(() -> {
            l l3 = navigationButtonAdded.getButton();
            m m2 = l3.h();
            boolean bl = !navigationButtonAdded.getButton().c() && this.n;
            int n2 = 16;
            if (m2 != null) {
                this.o.add((Component)m2.l(), l3.d());
            }
            JButton jButton2 = m_0.a(l3, 16, (l2, jButton) -> {
                boolean bl;
                m m2 = l2.h();
                if (m2 == null) {
                    return;
                }
                boolean bl2 = bl = this.x != null && this.x == jButton && this.x.isSelected();
                if (bl) {
                    this.t();
                    this.x.setSelected(false);
                    this.w.b(false);
                    this.x = null;
                    this.w = null;
                } else {
                    if (this.x != null) {
                        this.x.setSelected(false);
                    }
                    if (this.w != null) {
                        this.w.b(false);
                    }
                    this.x = jButton;
                    this.w = l2;
                    this.x.setSelected(true);
                    this.w.b(true);
                    this.a((l)l2);
                }
            });
            if (bl) {
                this.r.a(navigationButtonAdded.getButton(), jButton2);
                this.r.revalidate();
            } else {
                this.q.a(navigationButtonAdded.getButton(), jButton2);
                this.q.revalidate();
            }
        });
    }

    @Subscribe
    public void onNavigationButtonRemoved(NavigationButtonRemoved navigationButtonRemoved) {
        SwingUtilities.invokeLater(() -> {
            this.q.a(navigationButtonRemoved.getButton());
            this.q.revalidate();
            this.r.a(navigationButtonRemoved.getButton());
            this.r.revalidate();
            m m2 = navigationButtonRemoved.getButton().h();
            if (m2 != null) {
                this.o.remove(m2.l());
            }
        });
    }

    public void b() {
        this.r();
        SwingUtilities.invokeLater(() -> {
            this.k.pack();
            this.k.a();
            this.k.setLocationRelativeTo(this.k.getOwner());
            this.k.setVisible(true);
            this.k.setResizable(true);
            this.k.toFront();
            this.e();
            a.debug("Showing frame {}", (Object)this.k);
            this.k.a();
        });
    }

    public void a(int n2, int n3, int n4, int n5) {
        int n6 = Math.max(Math.min(n2, 7680), n4);
        int n7 = Math.max(Math.min(n3, 2160), n5);
        Dimension dimension = new Dimension(n6, n7);
        Dimension dimension2 = new Dimension(n4, n5);
        SwingUtilities.invokeLater(() -> {
            this.g.setSize(dimension);
            this.g.setPreferredSize(dimension);
            this.g.setMinimumSize(dimension2);
            this.g.getParent().setPreferredSize(dimension);
            this.g.getParent().setSize(dimension);
            this.g.getParent().setMinimumSize(dimension2);
            if (this.k.isVisible()) {
                this.k.pack();
                this.k.a();
            }
        });
    }

    public void a(int n2, int n3) {
        this.a(n2, n3, 765, 503);
    }

    public void c() {
    }

    public boolean d() {
        return this.k.isFocused();
    }

    public void e() {
        switch (rs.k.j.a()) {
            case b: {
                rs.A.o.a();
                break;
            }
            default: {
                this.k.requestFocus();
            }
        }
        this.w();
    }

    public void f() {
        switch (rs.k.j.a()) {
            case b: {
                rs.A.o.b();
                break;
            }
            case a: {
                rs.A.u.a(this.k);
                break;
            }
            default: {
                this.k.requestFocus();
            }
        }
        this.w();
    }

    private void r() {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        for (GraphicsDevice graphicsDevice : graphicsEnvironment.getScreenDevices()) {
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            a.debug("Graphics device {}: bounds {} transform: {}", new Object[]{graphicsDevice, graphicsConfiguration.getBounds(), graphicsConfiguration.getDefaultTransform()});
        }
    }

    private GraphicsConfiguration a(Rectangle rectangle) {
        GraphicsDevice[] graphicsDeviceArray;
        for (GraphicsDevice graphicsDevice : graphicsDeviceArray = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            Rectangle rectangle2 = graphicsConfiguration.getBounds();
            if (!rectangle2.contains(rectangle)) continue;
            return graphicsConfiguration;
        }
        return null;
    }

    public void g() {
        this.a(!this.m);
    }

    public void a(boolean bl) {
        boolean bl2 = this.m;
        this.m = bl;
        if (this.x != null) {
            this.x.setSelected(this.m);
        }
        if (this.w != null) {
            this.w.b(this.m);
        }
        if (bl2) {
            this.v.setIcon(new ImageIcon(this.s));
            this.v.setToolTipText("Open SideBar");
            this.h.a(b, e, true);
            this.t();
            this.p.remove(this.q);
        } else {
            this.v.setIcon(new ImageIcon(this.t));
            this.v.setToolTipText("Close SideBar");
            this.h.b(b, e);
            this.a(this.w);
            this.p.add(this.q);
        }
        this.p.revalidate();
        this.w();
        if (this.m) {
            this.k.a(this.q.getWidth());
        } else {
            this.k.b(this.q.getWidth());
        }
    }

    private void s() {
        boolean bl;
        boolean bl2 = bl = this.y != null;
        if (this.x != null) {
            this.x.setSelected(!bl);
        }
        if (bl) {
            this.t();
        } else {
            this.a(this.w);
        }
    }

    private void a(@Nullable l l2) {
        int n2;
        if (l2 == null) {
            return;
        }
        m m2 = l2.h();
        if (m2 == null) {
            return;
        }
        if (!this.m) {
            this.g();
        }
        int n3 = m2.l().getPreferredSize().width;
        int n4 = n2 = this.y != null ? this.y.l().getPreferredSize().width - n3 : n3;
        if (this.y != null) {
            this.y.K_();
        }
        this.y = m2;
        this.o.setMinimumSize(new Dimension(n3, 0));
        this.o.setMaximumSize(new Dimension(n3, Integer.MAX_VALUE));
        this.o.setPreferredSize(new Dimension(n3, 0));
        this.o.revalidate();
        this.f.show(this.o, l2.d());
        this.w();
        m2.J_();
        if (n2 > 0) {
            this.k.a(n2);
        } else if (n2 < 0) {
            this.k.b(n2);
        }
    }

    private void t() {
        if (this.y == null) {
            return;
        }
        this.y.K_();
        this.o.setMinimumSize(new Dimension(0, 0));
        this.o.setMaximumSize(new Dimension(0, 0));
        this.o.setPreferredSize(new Dimension(0, 0));
        this.o.revalidate();
        this.w();
        this.k.b(this.y.l().getPreferredSize().width);
        this.y = null;
    }

    private void u() {
        ClientShutdown clientShutdown = new ClientShutdown();
        this.i.post(clientShutdown);
        new Thread(() -> {
            clientShutdown.waitForAllConsumers(Duration.ofSeconds(10L));
            if (this.g != null) {
                int n2;
                if (this.g instanceof Client) {
                    this.g.stop();
                    n2 = 1000;
                } else {
                    this.g.stop();
                    this.k.setVisible(false);
                    n2 = 6000;
                }
                try {
                    Thread.sleep(n2);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            System.exit(0);
        }, "RuneLite Shutdown").start();
    }

    private boolean v() {
        return true;
    }

    private void w() {
        this.g.requestFocusInWindow();
    }

    public void h() {
        Taskbar.getTaskbar().requestWindowUserAttention(this.k);
    }

    public Cursor i() {
        return this.g.getCursor();
    }

    public Cursor j() {
        return this.z != null ? this.z : Cursor.getDefaultCursor();
    }

    public void a(BufferedImage bufferedImage, String string) {
        Cursor cursor;
        if (this.g == null) {
            return;
        }
        Point point = new Point(0, 0);
        this.z = cursor = Toolkit.getDefaultToolkit().createCustomCursor(bufferedImage, point, string);
        this.a(cursor);
    }

    public void a(Cursor cursor) {
        this.g.setCursor(cursor);
    }

    public void k() {
        if (this.g == null) {
            return;
        }
        this.z = null;
        this.g.setCursor(Cursor.getDefaultCursor());
    }

    public TrayIcon l() {
        return this.j;
    }

    public rs.gui.u m() {
        return this.k;
    }

    public a n() {
        return this.l;
    }

    public boolean o() {
        return this.m;
    }

    public rs.g.a.b p() {
        return this.A;
    }

    static /* synthetic */ boolean a(f f2) {
        return f2.v();
    }

    static /* synthetic */ rs.gui.u b(f f2) {
        return f2.k;
    }

    static /* synthetic */ Logger q() {
        return a;
    }

    static /* synthetic */ void c(f f2) {
        f2.u();
    }

    static /* synthetic */ rs.ui.c d(f f2) {
        return f2.r;
    }
}

