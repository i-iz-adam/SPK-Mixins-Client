/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.applet.Applet;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.b;
import rs.d_0;
import rs.e_0;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.b.a.d;
import rs.l.c;
import rs.l.e.a.q;
import rs.l.e.a.u;
import rs.l.j;
import rs.n.e;
import rs.runelite.a.i;
import rs.runelite.events.FocusChanged;

/*
 * Renamed from rs.C
 */
public class c_0
extends Applet
implements ComponentListener,
FocusListener,
KeyListener,
MouseListener,
MouseMotionListener,
MouseWheelListener,
WindowListener,
Runnable {
    public b gI;
    static c_0 gJ = null;
    static long gK = 0L;
    static boolean gL = false;
    static int gM = 20;
    static int gN = 1;
    volatile boolean gO;
    boolean gP;
    volatile boolean gQ;
    public static int gR = 0;
    static long[] gS = new long[32];
    static long[] gT = new long[32];
    static int gU;
    static int gV;
    static volatile boolean gW;
    static long gX;
    static long gY;
    public rs.l.c_0 gZ;
    public rs.l.c_0 ha;
    volatile long hb = 0L;
    int hc = 0;
    int hd = 0;
    public static int he;
    public static int hf;
    static int hg;
    long hh = System.currentTimeMillis();
    public static int hi;
    public static int hj;
    protected int hk;
    protected int hl;
    int hm;
    int hn;
    int ho;
    int hp;
    private boolean a = false;
    static rs.g.b hq;
    static long hr;
    static long hs;
    private int b = 0;
    private int c = 0;
    public boolean ht;
    public int hu;
    public int hv;
    public int hw;
    public int hx;
    public static boolean hy;
    public static boolean hz;
    private static final Stroke d;
    private static final Stroke e;
    private static final double f = 0.0030679615757712823;
    public static final int[] hA;
    public static final int[] hB;
    private int g = 20;
    int hC = 1;
    private final long[] h;
    boolean hD = false;
    public int hE;
    public int hF;
    public Graphics hG;
    public e_0 hH;
    public boolean hI = true;
    public boolean hJ = true;
    public int hK;
    public long hL;
    int hM;
    private volatile boolean i;
    private volatile int j;
    public static int hN;
    public static int hO;
    public static int hP;
    public static int hQ;
    protected final rs.m.a hR = new rs.m.a();
    protected volatile boolean hS;
    protected volatile int hT;
    private int k = 1;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;
    public int hU;
    int hV;
    int hW;
    long hX;
    public final int[] hY;
    private final int[] r;
    private int s;
    private int t;
    public static int hZ;

    public c_0() {
        this.h = new long[10];
        this.hY = new int[128];
        this.r = new int[128];
    }

    void aT() {
        long l2;
        c_0.gT[c_0.gU] = l2 = c_0.bf();
        gU = gU + 1 & 0x1F;
        this.a();
        this.q();
        this.s = this.t;
    }

    final synchronized void aU() {
        if (!gL) {
            gL = true;
        }
    }

    public final void l(int n2, int n3) {
        gJ = this;
        this.hE = n3;
        this.hF = n2;
        this.hH = new e_0(this, this.hE, this.hF);
        this.hG = this.B().getGraphics();
        this.ha = new rs.l.c_0(this.hE, this.hF, this.B());
        this.gZ = new rs.l.c_0(this.hE, this.hF, this.B());
        this.a(this, 1);
    }

    public final void m(int n2, int n3) {
        gJ = this;
        this.hE = n2;
        this.hF = n3;
        this.bc();
        this.hG = this.getGraphics();
    }

    public final void n(int n2, int n3) {
        gJ = this;
        this.hE = n3;
        this.hF = n2;
        this.hG = Launcher.n().j().getGraphics();
        this.setBackground(new Color(10, 10, 10));
        this.hc = 5;
        this.ha = new rs.l.c_0(this.hE, this.hF, this.B());
        this.gZ = new rs.l.c_0(this.hE, this.hF, this.B());
        this.setFocusTraversalKeysEnabled(false);
        this.a(this, 1);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        int n2;
        int n3;
        block16: {
            int n4;
            block19: {
                block18: {
                    block17: {
                        boolean bl;
                        n3 = mouseWheelEvent.getWheelRotation();
                        this.a(mouseWheelEvent);
                        boolean bl2 = !Client.ai() ? hP > 526 && hQ < 150 : (bl = Client.ai - hP <= 155 && hQ <= 162);
                        if (Launcher.n() == null || Launcher.n().o() == null || n3 == 0) break block16;
                        if (!bl) break block17;
                        Client client = Launcher.n().o();
                        client.fh += n3 * 35;
                        if (client.fh > 210) {
                            client.fh = 210;
                        }
                        if (client.fh < 0) {
                            client.fh = 0;
                        }
                        break block16;
                    }
                    if (!Launcher.n().o().fc || !Launcher.n().o().G()) break block18;
                    Launcher.n().o();
                    if (Client.cH == -1) break block19;
                }
                if (!rs.l.b.a.d.d) break block16;
            }
            int n5 = 100;
            if (Client.ch) {
                n5 = 200;
            }
            if (rs.l.b.a.d.g() && Client.al < 0) {
                n5 = 50;
            }
            int n6 = n3 < 0 ? -1 * n5 : n5;
            n2 = rs.f.a.ai == a.c.a ? he : hf;
            int n7 = n4 = rs.l.b.a.d.g() ? -500 : 0;
            if ((Client.al += n6) > n2) {
                Client.al = n2;
            }
            if (Client.al < n4) {
                Client.al = n4;
            }
        }
        if (Launcher.n().o().d(hP, hQ)) {
            int n8 = Client.eD;
            if ((n8 -= n3 * 30) < 0) {
                n8 = 0;
            }
            if (n8 > Client.fA - 110) {
                n8 = Client.fA - 110;
            }
            if (Client.eD != n8) {
                Client.eD = n8;
                Client.fM = true;
            }
            if (Launcher.n() != null && Launcher.n().o() != null && Launcher.n().o().gp == 67027) {
                e e2 = rs.n.e.H[67027];
                for (n2 = 0; n2 < e2.al.length; ++n2) {
                    if (rs.n.e.H[e2.al[n2]].aH <= 0) continue;
                    rs.n.e.H[e2.al[n2]].V += n3 * 30;
                }
            }
        }
    }

    public void a(MouseWheelEvent mouseWheelEvent) {
        int n2;
        e e2;
        int n3 = mouseWheelEvent.getWheelRotation();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = Client.eT[Client.fL];
        if (n11 != -1) {
            int n12 = n11;
            e2 = rs.n.e.H[n12];
            int n13 = rs.f.a.ai == a.c.a ? Client.ai - 218 : (n8 = rs.f.a.ai == a.c.a ? 28 : Client.ai - 197);
            n9 = rs.f.a.ai == a.c.a ? Client.ah - 298 : (rs.f.a.ai == a.c.a ? 37 : Client.ah - (Client.ai >= 1000 ? 37 : 74) - 267);
            for (n2 = 0; n2 < e2.al.length; ++n2) {
                if (rs.n.e.H[e2.al[n2]].aH <= 0) continue;
                n10 = n2;
                n4 = e2.am[n2];
                n5 = e2.bc[n2];
                n6 = rs.n.e.H[e2.al[n2]].P;
                n7 = rs.n.e.H[e2.al[n2]].aR;
                break;
            }
            if (hP > n8 + n4 && hQ > n9 + n5 && hP < n8 + n4 + n6 && hQ < n9 + n5 + n7) {
                rs.n.e.H[e2.al[n10]].V += n3 * 30;
                Client.eM = true;
                Client.fb = true;
            }
        }
        if (Client.cH != -1) {
            Client client = Launcher.n().o();
            e2 = rs.n.e.H[Client.cH == 23000 ? 5292 : Client.cH];
            n8 = rs.f.a.ai == a.c.a ? 4 : Client.ai / 2 - 360;
            int n14 = n9 = rs.f.a.ai == a.c.a ? 4 : Client.ah / 2 - 240;
            if (e2.C != Integer.MAX_VALUE) {
                n8 = e2.C;
            }
            if (e2.D != Integer.MAX_VALUE) {
                n9 = e2.D;
            }
            if (Client.aj() && client.v.h() && !client.f()) {
                n9 += 37;
            }
            for (n2 = 0; n2 < e2.al.length; ++n2) {
                if (rs.n.e.H[e2.al[n2]].aH <= 0 || Client.cI != -1 && rs.n.e.H[e2.al[n2]].bA != Client.cI) continue;
                n10 = n2;
                n4 = e2.am[n2];
                n5 = e2.bc[n2];
                n6 = rs.n.e.H[e2.al[n2]].P;
                n7 = rs.n.e.H[e2.al[n2]].aR;
                if (hP <= n8 + n4 || hQ <= n9 + n5 || hP >= n8 + n4 + n6 || hQ >= n9 + n5 + n7) continue;
                rs.n.e.H[e2.al[n10]].V += n3 * 30;
            }
        }
    }

    void aV() {
        long l2 = c_0.bf();
        long l3 = gS[hg];
        c_0.gS[c_0.hg] = l2;
        hg = hg + 1 & 0x1F;
        if (l3 != 0L && l2 > l3) {
            int n2 = (int)(l2 - l3);
            gR = ((n2 >> 1) + 32000) / n2;
        }
        if (++gV - 1 > 50) {
            gV -= 50;
        }
        this.aW();
        this.T();
        this.hh = System.currentTimeMillis();
    }

    final void aW() {
        rs.g.a a2 = this.aZ();
        if (this.hk != a2.c || a2.d != this.hl || this.gP) {
            this.ba();
            this.gP = false;
        }
    }

    final void aX() {
        this.gP = true;
    }

    Container aY() {
        return this.hH != null ? this.hH : this;
    }

    public rs.g.a aZ() {
        Container container = this.aY();
        int n2 = Math.max(container.getWidth(), 0);
        int n3 = Math.max(container.getHeight(), 0);
        if (this.hH != null) {
            Insets insets = this.hH.getInsets();
            n2 -= insets.left + insets.right;
            n3 -= insets.top + insets.bottom;
        }
        return new rs.g.a(n2, n3);
    }

    public void i() {
    }

    public void j() {
    }

    public final void ba() {
        if (!Launcher.n().o().ay()) {
            return;
        }
        Launcher.n().o().g(false);
        Dimension dimension = Launcher.n().o().aE();
        this.ho = dimension.width;
        this.hp = dimension.height;
        Container container = this.aY();
        if (container != null) {
            rs.g.a a2 = this.aZ();
            this.hk = Math.max(a2.c, 0);
            this.hl = Math.max(a2.d, 0);
            if (this.hk <= 0) {
                this.hk = 1;
            }
            if (this.hl <= 0) {
                this.hl = 1;
            }
            this.ho = this.hk;
            this.hp = this.hl;
            hi = Math.min(this.hk, this.ho);
            hj = Math.min(this.hl, this.hp);
            Client client = Launcher.n().o();
            this.hm = (int)((double)client.B().getWidth() - Launcher.n().o().aF().getWidth()) / 2;
            this.hn = 0;
            this.gI.setSize(hi, hj);
            this.gI.setLocation(this.hm, this.hn);
            this.i();
            this.j();
            rs.l.c.d();
            if (client.fc && client.cd && rs.k.e.a()) {
                rs.k.b.g = Launcher.n().p().n().getWidth();
                rs.k.b.h = Launcher.n().p().n().getHeight();
            }
        }
    }

    public boolean bb() {
        return this.a;
    }

    final synchronized void bc() {
        this.gI = new b(this);
        this.gQ = false;
    }

    @Override
    public void run() {
        int n2;
        this.bc();
        this.B().addMouseListener(this);
        this.B().addMouseMotionListener(this);
        this.B().addKeyListener(this);
        this.B().addFocusListener(this);
        this.B().addMouseWheelListener(this);
        this.B().addComponentListener(this);
        this.B().addComponentListener(new d_0(this));
        if (this.hH != null) {
            this.hH.addWindowListener(this);
        }
        this.a(0, "Loading...");
        this.L();
        int n3 = 0;
        int n4 = 256;
        int n5 = 1;
        int n6 = 0;
        int n7 = 0;
        for (n2 = 0; n2 < 10; ++n2) {
            this.h[n2] = System.currentTimeMillis();
        }
        n2 = 0;
        hq = c_0.be();
        while (gK == 0L) {
            int n8;
            if (rs.k.e.a()) {
                n2 = hq.a(this.g, 1);
                this.a = n2 > 0;
                for (n8 = 0; n8 < n2; ++n8) {
                    this.aT();
                }
                this.aV();
                continue;
            }
            n8 = n4;
            int n9 = n5;
            n4 = 300;
            n5 = 1;
            long l2 = System.currentTimeMillis();
            if (this.h[n3] == 0L) {
                n4 = n8;
                n5 = n9;
            } else if (l2 > this.h[n3]) {
                n4 = (int)((long)(2560 * this.g) / (l2 - this.h[n3]));
            }
            if (n4 < 25) {
                n4 = 25;
            }
            if (n4 > 256) {
                n4 = 256;
                n5 = (int)((long)this.g - (l2 - this.h[n3]) / 10L);
            }
            if (n5 > this.g) {
                n5 = this.g;
            }
            this.h[n3] = l2;
            n3 = (n3 + 1) % 10;
            if (n5 > 1) {
                for (int i2 = 0; i2 < 10; ++i2) {
                    if (this.h[i2] == 0L) continue;
                    int n10 = i2;
                    this.h[n10] = this.h[n10] + (long)n5;
                }
            }
            if (n5 < this.hC) {
                n5 = this.hC;
            }
            try {
                Thread.sleep(n5);
            }
            catch (InterruptedException interruptedException) {
                ++n7;
            }
            while (n6 < 256) {
                this.a();
                this.q();
                this.s = this.t;
                n6 += n4;
            }
            n6 &= 0xFF;
            if (this.g > 0) {
                gR = 1000 * n4 / (this.g * 256);
            }
            this.T();
            if (!this.hD) continue;
            System.out.println("ntime:" + l2);
            for (int i3 = 0; i3 < 10; ++i3) {
                int n11 = (n3 - i3 - 1 + 20) % 10;
                System.out.println("otim" + n11 + ":" + this.h[n11]);
            }
            System.out.println("fps:" + gR + " ratio:" + n4 + " count:" + n6);
            System.out.println("del:" + n5 + " deltime:" + this.g + " mindel:" + this.hC);
            System.out.println("intex:" + n7 + " opos:" + n3);
            this.hD = false;
            n7 = 0;
        }
        if (gK == -1L) {
            this.bd();
        }
    }

    public void bd() {
        gK = -2L;
        try {
            this.A();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.hH != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                System.exit(0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    public final void v(int n2) {
        this.g = 1000 / n2;
    }

    public static rs.g.b be() {
        try {
            return new rs.g.d();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return new rs.g.c();
        }
    }

    @Override
    public final void start() {
        if (this == gJ && !gL) {
            gK = 0L;
        }
    }

    @Override
    public final void stop() {
        if (this == gJ && !gL) {
            gK = c_0.bf() + 4000L;
        }
    }

    public static synchronized long bf() {
        long l2 = System.currentTimeMillis();
        if (l2 < hr) {
            hs += hr - l2;
        }
        hr = l2;
        return hs + l2;
    }

    @Override
    public final void destroy() {
        gK = -1L;
        try {
            Thread.sleep(5000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (gK == -1L) {
            this.bd();
        }
    }

    @Override
    public final void update(Graphics graphics) {
        if (this.hG == null) {
            this.hG = graphics.create();
        }
        this.hI = true;
        this.Z();
    }

    @Override
    public final void paint(Graphics graphics) {
        if (this.hG == null) {
            this.hG = graphics.create();
        } else if (Launcher.n().h()) {
            int n2 = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            int n3 = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            if (n2 != this.b || n3 != this.c) {
                this.hG = graphics.create();
            }
            this.b = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            this.c = this.getGraphicsConfiguration().getDevice().getDisplayMode().getHeight();
        }
        this.hI = true;
        this.Z();
    }

    @Override
    public final void mousePressed(MouseEvent mouseEvent) {
        boolean bl;
        this.hL = 0L;
        int n2 = mouseEvent.getX();
        int n3 = mouseEvent.getY();
        rs.l.f.e.d().m().a(mouseEvent);
        if (mouseEvent.isConsumed()) {
            return;
        }
        if (this.hH != null) {
            n2 -= 4;
            n3 -= 22 + this.hc;
        }
        if (Launcher.n().o().ax()) {
            n2 = this.b(n2, false);
            n3 = this.c(n3, false);
        }
        this.hK = 0;
        this.o = n2;
        this.p = n3;
        this.q = System.currentTimeMillis();
        if (rs.l.b.a.d.d && SwingUtilities.isLeftMouseButton(mouseEvent)) {
            rs.l.b.a.d.b.c(1);
        }
        if (rs.l.b.a.d.d && SwingUtilities.isRightMouseButton(mouseEvent)) {
            rs.l.b.a.d.b.c(2);
        }
        if (SwingUtilities.isMiddleMouseButton(mouseEvent) && Client.ee == 2) {
            this.ht = true;
            this.hw = mouseEvent.getX();
            this.hx = mouseEvent.getY();
            this.hu = n2;
            this.hv = n3;
            return;
        }
        boolean bl2 = bl = SwingUtilities.isRightMouseButton(mouseEvent) || System.getProperty("os.name").contains("Mac OS X") && (mouseEvent.getModifiers() & 0x10) != 0 && (mouseEvent.getModifiers() & 4) != 0;
        if (bl) {
            ++this.j;
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                this.k = 2;
            }
            this.a(1, 2, n2, n3, mouseEvent.getWhen());
        } else if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.i = true;
            this.k = 1;
            this.a(1, 1, n2, n3, mouseEvent.getWhen());
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        rs.l.f.e.d().m().d(mouseEvent);
        if (mouseEvent.isConsumed()) {
            this.bg();
            return;
        }
        this.hL = 0L;
        this.hK = 0;
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.i = false;
        }
        int n2 = mouseEvent.getX();
        int n3 = mouseEvent.getY();
        if (this.hH != null) {
            n2 -= 4;
            n3 -= 22 + this.hc;
        }
        if (Launcher.n().o().ax()) {
            n2 = this.b(n2, false);
            n3 = this.c(n3, false);
        }
        int n4 = SwingUtilities.isLeftMouseButton(mouseEvent) ? this.k : (SwingUtilities.isRightMouseButton(mouseEvent) ? 2 : 3);
        this.a(2, n4, n2, n3, mouseEvent.getWhen());
        this.ht = false;
        if (this.hH != null) {
            this.hH.requestFocus();
        }
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        if (Launcher.n() != null && mouseEvent.getX() <= 765 && mouseEvent.getY() <= 537 && this.hH != null) {
            this.hH.requestFocus();
        }
    }

    @Override
    public final void mouseEntered(MouseEvent mouseEvent) {
        if (this.hH != null) {
            this.hH.requestFocus();
        }
    }

    @Override
    public final void mouseExited(MouseEvent mouseEvent) {
        this.hK = 0;
        hO = -1;
        hN = -1;
        this.a(-1, -1);
    }

    public int b(int n2, boolean bl) {
        float f2 = Launcher.n().o().ae();
        float f3 = (float)this.B().getWidth() - f2 * 2.0f;
        double d2 = f3 / 765.0f;
        double d3 = 765.0f / f3;
        int n3 = 0;
        n3 = (int)((double)n3 - (double)f2 * d3);
        return (int)((double)n2 * d3) + n3;
    }

    public int c(int n2, boolean bl) {
        float f2 = 0.0f;
        float f3 = (float)this.B().getHeight() - f2 * 2.0f;
        double d2 = f3 / 503.0f;
        double d3 = 503.0f / f3;
        int n3 = 0;
        n3 = (int)((double)n3 - (double)f2 * d3);
        return (int)((double)n2 * d3) + n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void mouseDragged(MouseEvent mouseEvent) {
        Object object;
        int n2 = mouseEvent.getX();
        int n3 = mouseEvent.getY();
        rs.l.f.e.d().m().c(mouseEvent);
        if (mouseEvent.isConsumed()) {
            return;
        }
        if (this.hH != null) {
            object = this.hH.getInsets();
            n2 -= ((Insets)object).left + 4;
            n3 -= ((Insets)object).top + 22 + this.hc;
        }
        hN = n2;
        hO = n3;
        if (Launcher.n().o().ax()) {
            n2 = this.b(n2, false);
            n3 = this.c(n3, false);
        }
        if (this.ht) {
            n3 = this.hw - mouseEvent.getX();
            int n4 = this.hx - mouseEvent.getY();
            this.e(n3, -n4);
            this.hw = mouseEvent.getX();
            this.hx = mouseEvent.getY();
            return;
        }
        this.hK = 0;
        this.a(n2, n3);
        object = this.hR;
        synchronized (object) {
            if (this.hS) {
                this.hR.a(3, 0, n2, n3, mouseEvent.getWhen());
            }
        }
    }

    void e(int n2, int n3) {
    }

    @Override
    public final void mouseMoved(MouseEvent mouseEvent) {
        int n2 = mouseEvent.getX();
        int n3 = mouseEvent.getY();
        rs.l.f.e.d().m().b(mouseEvent);
        if (this.hH != null) {
            n2 -= 4;
            n3 -= 22 + this.hc;
            this.hH.requestFocus();
        }
        this.hK = 0;
        hN = n2;
        hO = n3;
        if (Launcher.n().o().ax()) {
            n2 = this.b(n2, false);
            n3 = this.c(n3, false);
        }
        this.a(n2, n3);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (this.hH != null) {
            this.hH.requestFocus();
        } else {
            this.requestFocus();
        }
        this.hL = 0L;
        this.hK = 0;
        Launcher.n().p().p().a(keyEvent);
        if (keyEvent.isConsumed()) {
            return;
        }
        int n2 = keyEvent.getKeyCode();
        int n3 = keyEvent.getKeyChar();
        if (keyEvent.isControlDown()) {
            Client.ci = System.currentTimeMillis();
            Client.ch = true;
        }
        if (keyEvent.isShiftDown()) {
            Client.ag = true;
        }
        if (rs.l.b.a.d.d) {
            rs.l.b.a.d.b.a(n3);
        }
        if (n2 == 37 && Client.w.b) {
            --Client.w.f;
            if (Client.w.f < 0) {
                Client.w.f = 0;
            }
        }
        if (n2 == 39 && Client.w.b) {
            ++Client.w.f;
            if (Client.w.f > Client.w.g.length()) {
                Client.w.f = Client.w.g.length();
            }
        }
        if (n2 == 38 && Client.w.b) {
            Client.w.b(Client.w.e - 1);
        }
        if (n2 == 40 && Client.w.b) {
            Client.w.b(Client.w.e + 1);
        }
        if (Client.ch && n2 == 38 && rs.l.j.b(Client.cT) && Client.dm != null) {
            Client.dk = Client.dm;
        }
        if (u.j.r) {
            if (n2 == 37 || n2 == 39) {
                int n4 = u.j.s;
                if ((n4 += n2 == 37 ? -1 * u.p * u.q : u.p * u.q) < 0) {
                    n4 = 0;
                }
                if (n4 >= rs.l.e_0.y.length) {
                    return;
                }
                u.j.s = n4;
                return;
            }
            if (n2 == 27) {
                u.j.r = false;
                return;
            }
        }
        if (rs.l.e.a.q.i.f() && !Client.w.b) {
            if (n2 == 87 || n2 == 65 || n2 == 68 || n2 == 83 || n2 >= 37 && n2 <= 40) {
                switch (n2) {
                    case 37: 
                    case 65: {
                        rs.l.e.a.q.i.c(n2 == 65 ? -10 : -1);
                        break;
                    }
                    case 38: 
                    case 87: {
                        rs.l.e.a.q.i.d(n2 == 87 ? -10 : -1);
                        break;
                    }
                    case 39: 
                    case 68: {
                        rs.l.e.a.q.i.c(n2 == 68 ? 10 : 1);
                        break;
                    }
                    case 40: 
                    case 83: {
                        rs.l.e.a.q.i.d(n2 == 83 ? 10 : 1);
                    }
                }
                rs.n.e.H[rs.l.e.a.q.i.g()].am[rs.l.e.a.q.i.h()] = rs.l.e.a.q.i.i();
                rs.n.e.H[rs.l.e.a.q.i.g()].bc[rs.l.e.a.q.i.h()] = rs.l.e.a.q.i.j();
                Client.fb = true;
                Client.eM = true;
                return;
            }
            if (n2 == 9) {
                rs.l.e.a.q.i.a(false);
                return;
            }
        }
        if (n2 >= 37 && n2 <= 40 && (Client.ba || Client.aW != -1)) {
            if (Client.ba) {
                switch (n2) {
                    case 37: {
                        if (hy) {
                            --Client.bf;
                            break;
                        }
                        Client.bc -= Client.bc - 10 > 0 ? 10 : 0;
                        break;
                    }
                    case 38: {
                        if (hz) {
                            Client.be += Client.be + 100 < 50000 ? 100 : 0;
                            break;
                        }
                        if (hy) {
                            ++Client.bg;
                            break;
                        }
                        Client.bd += Client.bd + 10 < 2050 ? 10 : 0;
                        break;
                    }
                    case 39: {
                        if (hy) {
                            ++Client.bf;
                            break;
                        }
                        Client.bc += Client.bc + 10 < 2050 ? 10 : 0;
                        break;
                    }
                    case 40: {
                        if (hz) {
                            Client.be -= Client.be - 100 > 0 ? 100 : 0;
                            break;
                        }
                        if (hy) {
                            --Client.bg;
                            break;
                        }
                        Client.bd -= Client.bd - 10 > 0 ? 10 : 0;
                    }
                }
            } else if (Client.aW != -1) {
                switch (n2) {
                    case 37: {
                        --Client.aX;
                        break;
                    }
                    case 38: {
                        ++Client.aY;
                    }
                    case 39: {
                        ++Client.aX;
                        break;
                    }
                    case 40: {
                        --Client.aY;
                    }
                }
            }
            if (Client.aW > 0) {
                rs.n.e.H[Client.aW].am[Client.aV] = Client.aX;
                rs.n.e.H[Client.aW].bc[Client.aV] = Client.aY;
            }
            Client.fb = true;
            Client.eM = true;
            return;
        }
        if (u.j.r) {
            if (n2 == 37 || n2 == 39) {
                int n5 = u.j.s;
                if ((n5 += n2 == 37 ? -43 : 43) < 0) {
                    n5 = 0;
                }
                if (n5 >= rs.l.e_0.y.length) {
                    return;
                }
                u.j.s = n5;
                return;
            }
            if (n2 == 27) {
                u.j.r = false;
                return;
            }
        }
        if (n2 == 16 && Client.ba) {
            boolean bl = hy = !hy;
        }
        if (n2 == 20 && Client.ba) {
            boolean bl = hz = !hz;
        }
        if (n3 < 30) {
            n3 = 0;
        }
        if (n2 == 37) {
            n3 = 1;
        }
        if (n2 == 39) {
            n3 = 2;
        }
        if (n2 == 38) {
            n3 = 3;
        }
        if (n2 == 40) {
            n3 = 4;
        }
        if (n2 == 17) {
            n3 = 5;
        }
        if (n2 == 8) {
            n3 = 8;
        }
        if (n2 == 127) {
            n3 = 8;
        }
        if (n2 == 9) {
            n3 = 9;
        }
        if (n2 == 10) {
            n3 = 10;
        }
        if (n2 >= 112 && n2 <= 123) {
            n3 = 1008 + n2 - 112;
        }
        if (n2 == 36) {
            n3 = 1000;
        }
        if (n2 == 35) {
            n3 = 1001;
        }
        if (n2 == 33) {
            n3 = 1002;
        }
        if (n2 == 34) {
            n3 = 1003;
        }
        if (n3 > 0 && n3 < 128) {
            this.hY[n3] = 1;
        }
        for (int i2 = 0; i2 < rs.f.a.G.length; ++i2) {
            if (rs.f.a.G[i2] == -1 || rs.f.a.G[i2] != n2) continue;
            this.x(i2);
        }
        if (n2 == 27) {
            this.x(3);
        }
        Launcher.n().o().cv.b(keyEvent);
        if (Launcher.n().o().cv.b()) {
            Launcher.n().o().cv.a(false);
            return;
        }
        if (n3 > 4) {
            this.r[this.t] = n3;
            this.t = this.t + 1 & 0x7F;
        }
        if (rs.l.b.a.d.d && Client.ch && n2 == 86) {
            String string = null;
            try {
                string = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                for (char c2 : string.toCharArray()) {
                    Client.w.a(c2);
                }
            }
            catch (UnsupportedFlavorException | IOException exception) {
                // empty catch block
            }
        }
        if (n2 == 18) {
            keyEvent.consume();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        this.hL = 0L;
        this.hK = 0;
        Launcher.n().p().p().b(keyEvent);
        if (keyEvent.isConsumed()) {
            // empty if block
        }
        int n2 = keyEvent.getKeyCode();
        int n3 = keyEvent.getKeyChar();
        if (rs.l.b.a.d.d) {
            rs.l.b.a.d.b.b(n3);
        }
        if (n3 < 30) {
            n3 = 0;
        }
        if (n2 == 37) {
            n3 = 1;
        }
        if (n2 == 39) {
            n3 = 2;
        }
        if (n2 == 38) {
            n3 = 3;
        }
        if (n2 == 40) {
            n3 = 4;
        }
        if (n2 == 17) {
            n3 = 5;
        }
        if (n2 == 8) {
            n3 = 8;
        }
        if (n2 == 127) {
            n3 = 8;
        }
        if (n2 == 9) {
            n3 = 9;
        }
        if (n2 == 10) {
            n3 = 10;
        }
        if (n3 > 0 && n3 < 128) {
            this.hY[n3] = 0;
        }
        if (n2 == 17) {
            Client.ci = System.currentTimeMillis();
            Client.ch = false;
        }
        if (n2 == 16) {
            Client.ag = false;
        }
    }

    @Override
    public final void keyTyped(KeyEvent keyEvent) {
        Launcher.n().p().p().c(keyEvent);
        if (keyEvent.isConsumed()) {
            return;
        }
    }

    public final int w(int n2) {
        int n3;
        while (n2 >= 0) {
            for (n3 = 1; n3 > 0; ++n3) {
            }
        }
        n3 = -1;
        if (this.t != this.s) {
            n3 = this.r[this.s];
            this.s = this.s + 1 & 0x7F;
        }
        return n3;
    }

    @Override
    public final void focusGained(FocusEvent focusEvent) {
        this.hJ = true;
        this.hI = true;
        FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(true);
        Launcher.n().o().p.post(focusChanged);
        this.Z();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.bg();
        Client.ch = false;
        Client.ag = false;
        this.i = false;
        FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(false);
        Launcher.n().o().p.post(focusChanged);
        this.hJ = false;
        for (int i2 = 0; i2 < 128; ++i2) {
            this.hY[i2] = 0;
        }
    }

    @Override
    public final void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public final void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        try {
            this.destroy();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        System.exit(0);
    }

    @Override
    public final void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public final void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public final void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public final void windowOpened(WindowEvent windowEvent) {
    }

    void L() {
    }

    void q() {
    }

    void A() {
    }

    void T() {
    }

    void Z() {
    }

    Component B() {
        if (this.hH != null) {
            return this.hH;
        }
        return this.gI;
    }

    public void a(Runnable runnable, int n2) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(n2);
    }

    public void a(boolean bl, int n2, int n3, boolean bl2, boolean bl3) {
        boolean bl4 = false;
        this.hE = n2;
        this.hF = n3;
        if (Launcher.n() == null) {
            if (this.hH != null) {
                this.hH.dispose();
            }
            if (!bl4) {
                this.hH = new e_0(this, n2, n3);
                this.hH.addWindowListener(this);
            }
            this.hG = (bl4 ? this : this.hH).getGraphics();
            if (!bl4) {
                this.B().addMouseWheelListener(this);
                this.B().addMouseListener(this);
                this.B().addMouseMotionListener(this);
                this.B().addKeyListener(this);
                this.B().addFocusListener(this);
            }
        }
    }

    void a(int n2, String string) {
        while (this.hG == null) {
            this.hG = this.B().getGraphics();
            try {
                this.B().repaint();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                Thread.sleep(1000L);
            }
            catch (Exception exception) {}
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontMetrics = this.B().getFontMetrics(font);
        Font font2 = new Font("Helvetica", 0, 13);
        this.B().getFontMetrics(font2);
        if (this.hI) {
            this.hG.setColor(Color.black);
            this.hG.fillRect(0, 0, this.hE, this.hF);
            this.hI = false;
        }
        Color color = new Color(140, 17, 17);
        int n3 = this.hF / 2 - 18;
        this.hG.setColor(color);
        this.hG.drawRect(this.hE / 2 - 152, n3, 304, 34);
        this.hG.fillRect(this.hE / 2 - 150, n3 + 2, n2 * 3, 30);
        this.hG.setColor(Color.black);
        this.hG.fillRect(this.hE / 2 - 150 + n2 * 3, n3 + 2, 300 - n2 * 3, 30);
        this.hG.setFont(font);
        this.hG.setColor(Color.white);
        this.hG.drawString(string, (this.hE - fontMetrics.stringWidth(string)) / 2, n3 + 22 + this.hc);
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.setCursor(Cursor.getDefaultCursor());
        if (Launcher.n() != null) {
            Launcher.n().i().setCursor(Cursor.getDefaultCursor());
        }
    }

    public static void a(Graphics2D graphics2D, Polygon polygon, Color color) {
        graphics2D.setColor(color);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(2.0f));
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(new Color(0, 0, 0, 50));
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static void a(Graphics2D graphics2D, Polygon polygon, Color color, Color color2) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(d);
        if (rs.k.e.a()) {
            AlphaComposite alphaComposite = AlphaComposite.getInstance(5, 1.0f);
            graphics2D.setComposite(alphaComposite);
            graphics2D.setStroke(e);
        }
        graphics2D.setColor(color);
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(color2);
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static void b(Graphics2D graphics2D, Polygon polygon, Color color, Color color2) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(d);
        if (rs.k.e.a()) {
            AlphaComposite alphaComposite = AlphaComposite.getInstance(3, 1.0f);
            graphics2D.setComposite(alphaComposite);
            graphics2D.setStroke(d);
        }
        graphics2D.setColor(color);
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(color2);
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static List<i> a(List<i> list) {
        i i2;
        i i3;
        if (list.size() < 3) {
            return null;
        }
        ArrayList<i> arrayList = new ArrayList<i>();
        i i4 = i3 = c_0.b(list);
        do {
            if (i4.a() != 0 || i4.b() != 0) {
                arrayList.add(i4);
            }
            assert (arrayList.size() <= list.size()) : "hull has more points than graph";
            if (arrayList.size() > list.size()) {
                return null;
            }
            i2 = null;
            for (i i5 : list) {
                if (i2 == null) {
                    i2 = i5;
                    continue;
                }
                long l2 = c_0.a(i4, i5, i2);
                if (l2 <= 0L && (l2 != 0L || i4.a(i5) <= i4.a(i2))) continue;
                i2 = i5;
            }
            if (i2 != null) continue;
            return null;
        } while ((i4 = i2) != i3);
        return arrayList;
    }

    private static i b(List<i> list) {
        i i2 = null;
        for (i i3 : list) {
            if (i2 == null || i3.a() < i2.a()) {
                i2 = i3;
                continue;
            }
            if (i3.a() != i2.a() || i3.b() >= i2.b()) continue;
            i2 = i3;
        }
        return i2;
    }

    private static long a(i i2, i i3, i i4) {
        long l2 = (long)(i3.b() - i2.b()) * (long)(i4.a() - i3.a()) - (long)(i3.a() - i2.a()) * (long)(i4.b() - i3.b());
        return l2;
    }

    public static i a(Client client, int n2, int n3, int n4) {
        boolean bl = false;
        boolean bl2 = false;
        int n5 = n2;
        int n6 = n3;
        if (n2 >= 128 && n3 >= 128 && n2 <= 13056 && n3 <= 13056) {
            n2 -= Client.cJ;
            n3 -= Client.cL;
            n4 -= Client.cK;
            int n7 = client.cR;
            int n8 = client.cS;
            int n9 = hA[n7];
            int n10 = hB[n7];
            int n11 = hA[n8];
            int n12 = hB[n8];
            int n13 = n12 * n2 + n3 * n11 >> 16;
            n3 = n12 * n3 - n11 * n2 >> 16;
            n2 = n13;
            n13 = n10 * n4 - n3 * n9 >> 16;
            if ((n3 = n4 * n9 + n3 * n10 >> 16) >= 50) {
                int n14 = Client.aj;
                int n15 = Client.ak;
                if (rs.l.b.a.d.c) {
                    n14 = client.B().getWidth();
                    n15 = client.B().getHeight();
                }
                int n16 = 500;
                int n17 = n14 / 2 + n2 * n16 / n3;
                int n18 = n15 / 2 + n13 * n16 / n3;
                int n19 = 0;
                int n20 = 0;
                return new i(n17 + n19, n18 + n20);
            }
        }
        return null;
    }

    protected boolean u() {
        return false;
    }

    protected void v() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void bg() {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            if (this.hS) {
                ++this.hT;
                this.hR.c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            boolean bl = this.u();
            if (bl != this.hS) {
                this.l = hP;
                this.m = hQ;
                this.hS = bl;
                ++this.hT;
                this.hR.b();
                this.hU = 0;
                this.hM = 0;
                this.n = 0;
                this.v();
            }
            if (this.hS) {
                this.hU = 0;
                this.bh();
            } else {
                this.hU = this.n;
                this.hV = this.o;
                this.hW = this.p;
                this.hX = this.q;
                this.n = 0;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void x(int n2) {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            if (this.hS) {
                this.hR.a(5, n2, 0, 0, System.currentTimeMillis());
            } else {
                Client.n(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n2, int n3, int n4, int n5, long l2) {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            if (this.hS) {
                this.hR.a(n2, n3, n4, n5, l2);
            } else if (n2 == 1) {
                this.n = this.hM = n3;
            } else {
                this.hM = 0;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n2, int n3) {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            this.l = n2;
            this.m = n3;
            if (!this.hS) {
                hP = n2;
                hQ = n3;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void bh() {
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            hP = this.l;
            hQ = this.m;
        }
    }

    public int bi() {
        return this.hV;
    }

    public boolean bj() {
        return this.i;
    }

    public int bk() {
        return this.j;
    }

    public int bl() {
        return this.hW;
    }

    static {
        gV = 500;
        gW = true;
        gX = -1L;
        gY = -1L;
        he = 1500;
        hf = 900;
        hy = false;
        hz = false;
        d = new BasicStroke(2.0f);
        e = new BasicStroke(3.0f);
        hA = new int[2048];
        hB = new int[2048];
        for (int i2 = 0; i2 < 2048; ++i2) {
            c_0.hA[i2] = (int)(65536.0 * Math.sin((double)i2 * 0.0030679615757712823));
            c_0.hB[i2] = (int)(65536.0 * Math.cos((double)i2 * 0.0030679615757712823));
        }
    }
}

