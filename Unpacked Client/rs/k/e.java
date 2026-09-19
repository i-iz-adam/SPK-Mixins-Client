/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.runelite.rlawt.AWTContext
 *  org.lwjgl.opencl.CL10
 *  org.lwjgl.opencl.CL10GL
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL43C
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.GLUtil
 *  org.lwjgl.system.Callback
 *  org.lwjgl.system.Configuration
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.k;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.geom.AffineTransform;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nonnull;
import net.runelite.rlawt.AWTContext;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL10GL;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.f.a;
import rs.gui.Launcher;
import rs.i_0;
import rs.j_0;
import rs.k.b;
import rs.k.b.f;
import rs.k.b.g;
import rs.k.c;
import rs.k.d;
import rs.k.h;
import rs.k.i;
import rs.k.j;
import rs.k.k;
import rs.k.l;
import rs.k.m;
import rs.k.n;
import rs.k.q;
import rs.l.c_0;
import rs.l.e_0;
import rs.v_0;

public class e {
    private static final Logger m = LoggerFactory.getLogger(e.class);
    public static boolean a = true;
    public static boolean b = false;
    public static final int c = 6144;
    public static final int d = 512;
    private static final int n = Integer.MIN_VALUE;
    public int e = 2;
    private final q o = new q();
    private final k p = new k();
    private final l q = new l();
    private final i r = new i();
    private final f s = new f();
    private AWTContext t;
    static final String f = "#version 420\n#extension GL_ARB_compute_shader : require\n#extension GL_ARB_shader_storage_buffer_object : require\n#extension GL_ARB_explicit_attrib_location : require\n";
    static final String g = "#version 430\n";
    static final m h = new m().a(35633, "vert.glsl").a(35632, "frag.glsl");
    static final m i = new m().a(37305, "comp.glsl");
    static final m j = new m().a(37305, "comp.glsl");
    static final m k = new m().a(37305, "comp_unordered.glsl");
    static final m l = new m().a(35633, "vertui.glsl").a(35632, "fragui.glsl");
    private static final int[] u = new int[8];
    private a v = rs.k.e$a.a;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private final rs.k.a T = new rs.k.a("scene vertex buffer");
    private final rs.k.a U = new rs.k.a("scene tex buffer");
    private final rs.k.a V = new rs.k.a("tmp vertex buffer");
    private final rs.k.a W = new rs.k.a("tmp tex buffer");
    private final rs.k.a X = new rs.k.a("model buffer large");
    private final rs.k.a Y = new rs.k.a("model buffer small");
    private final rs.k.a Z = new rs.k.a("model buffer unordered");
    private final rs.k.a aa = new rs.k.a("out vertex buffer");
    private final rs.k.a ab = new rs.k.a("out tex buffer");
    private int ac;
    private final rs.k.a ad = new rs.k.a("uniform buffer");
    private Callback ae;
    private GLCapabilities af;
    private d ag;
    private d ah;
    private c ai;
    private d aj;
    private d ak;
    private d al;
    private int am;
    private boolean an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private long as = 0L;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private rs.k.a.a ay;
    private int az;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF = -1;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private int aZ;
    private int ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private boolean bg = false;

    public static boolean a() {
        return b;
    }

    public e() {
        this.c();
    }

    public Component b() {
        return Launcher.n().o().B();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        try {
            this.Q = -1;
            this.P = -1;
            this.av = 0;
            this.au = 0;
            this.at = 0;
            this.am = 0;
            AWTContext.loadNatives();
            Object object = this.b().getTreeLock();
            synchronized (object) {
                if (!this.b().isValid()) {
                    return;
                }
                this.t = new AWTContext(this.b());
                this.t.configurePixelFormat(0, 0, 0);
            }
            this.t.createGLContext();
            this.b().setIgnoreRepaint(true);
            this.v = rs.k.j.a() == rs.k.j.b ? rs.k.e$a.c : rs.k.e$a.b;
            Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.set((Object)("lwjgl-rl-" + System.getProperty("os.arch", "unknown")));
            this.af = GL.createCapabilities();
            m.info("Using device: {}", (Object)GL43C.glGetString((int)7937));
            m.info("Using driver: {}", (Object)GL43C.glGetString((int)7938));
            object = GL.getCapabilities();
            if (!this.af.OpenGL31) {
                throw new RuntimeException("OpenGL 3.1 is required but not available");
            }
            if (!this.af.OpenGL43 && this.v == rs.k.e$a.b) {
                m.info("disabling compute shaders because OpenGL 4.3 is not available");
                this.v = rs.k.e$a.a;
            }
            if (this.v == rs.k.e$a.a) {
                this.q.a();
            }
            this.bg = true;
            this.w();
            if (m.isDebugEnabled() && this.af.glDebugMessageControl != 0L) {
                this.ae = GLUtil.setupDebugMessageCallback();
                if (this.ae != null) {
                    GL43C.glDebugMessageControl((int)33350, (int)33361, (int)4352, (int)131185, (boolean)false);
                    GL43C.glDebugMessageControl((int)33350, (int)33360, (int)4352, (int)131154, (boolean)false);
                }
            }
            this.ag = new d();
            this.ah = new d();
            this.ai = new c();
            this.aj = new d();
            this.ak = new d();
            this.al = new d();
            this.e();
            this.m();
            try {
                this.j();
            }
            catch (n n2) {
                throw new RuntimeException(n2);
            }
            this.q();
            this.s();
            this.o();
            b = true;
            this.aC = -1;
            this.aB = -1;
            this.aE = -1;
            this.aD = -1;
            this.ay = null;
            this.aF = -1;
            this.ac = -1;
            if (Launcher.n().o().fc) {
                rs.k.e.a(new rs.k.f(this));
            }
            this.w();
        }
        catch (Throwable throwable) {
            m.error("Error starting GPU plugin", throwable);
            this.d();
        }
    }

    public void d() {
        rs.k.e.a(() -> {
            this.q.b();
            if (this.bg) {
                this.p.a();
                if (this.ac != -1) {
                    this.o.a(this.ac);
                    this.ac = -1;
                }
                this.b(this.ad);
                this.p();
                this.r();
                this.l();
                this.n();
                this.t();
            }
            if (this.t != null) {
                this.t.destroy();
                this.t = null;
            }
            if (this.ae != null) {
                this.ae.free();
                this.ae = null;
            }
            this.af = null;
            this.ah = null;
            this.ai = null;
            this.ak = null;
            this.al = null;
            this.aj = null;
            this.aF = -1;
            b = false;
            rs.k.e.a(false);
        });
    }

    public static void a(boolean bl) {
        Launcher.n().o().hG = Launcher.n().o().B().getGraphics();
        Launcher.n().o().B().setIgnoreRepaint(bl);
        Launcher.n().o().F();
        Launcher.n().o().a(rs.f.a.ai);
        Launcher.n().o().b(true);
        Launcher.n().o().h();
        Launcher.n().o().repaint();
    }

    public void e() {
        boolean bl = true;
        int n2 = 0;
        switch (rs.k.b.d) {
            case b: {
                n2 = 1;
                break;
            }
            case a: {
                n2 = 0;
                break;
            }
            case c: {
                n2 = -1;
            }
        }
        int n3 = this.t.setSwapInterval(n2);
        if (n3 != n2) {
            m.info("unsupported swap interval {}, got {}", (Object)n2, (Object)n3);
        }
        this.w();
    }

    private rs.k.d.a b(int n2, int n3) {
        String string = rs.k.j.a() == rs.k.j.c ? f : g;
        rs.k.d.a a2 = new rs.k.d.a();
        a2.a((String string2) -> {
            if ("version_header".equals(string2)) {
                return string;
            }
            if ("thread_config".equals(string2)) {
                return "#define THREAD_COUNT " + n2 + "\n#define FACES_PER_THREAD " + n3 + "\n";
            }
            return null;
        });
        a2.a(e.class);
        return a2;
    }

    private void j() {
        rs.k.d.a a2 = this.b(-1, -1);
        this.x = h.a(a2);
        this.K = l.a(a2);
        if (this.v == rs.k.e$a.b) {
            this.B = i.a(this.b(1024, 6));
            this.D = j.a(this.b(512, 1));
            this.F = k.a(a2);
        } else if (this.v == rs.k.e$a.c) {
            this.p.a(this.t);
        }
        this.k();
    }

    private void k() {
        this.aQ = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"projectionMatrix");
        this.aR = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"brightness");
        this.bc = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"smoothBanding");
        this.aM = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"useFog");
        this.aN = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"fogColor");
        this.aO = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"fogDepth");
        this.aP = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"drawDistance");
        this.aK = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"colorBlindMode");
        this.bd = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"textureLightMode");
        this.be = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"tick");
        this.bb = GL43C.glGetUniformBlockIndex((int)this.x, (CharSequence)"uniforms");
        this.aX = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"textures");
        this.aY = GL43C.glGetUniformLocation((int)this.x, (CharSequence)"textureAnimations");
        this.aS = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"tex");
        this.aT = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"samplingMode");
        this.aV = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"targetDimensions");
        this.aU = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"sourceDimensions");
        this.aL = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"colorBlindMode");
        this.aW = GL43C.glGetUniformLocation((int)this.K, (CharSequence)"alphaOverlay");
        if (this.v == rs.k.e$a.b) {
            this.aZ = GL43C.glGetUniformBlockIndex((int)this.D, (CharSequence)"uniforms");
            this.ba = GL43C.glGetUniformBlockIndex((int)this.B, (CharSequence)"uniforms");
        }
    }

    private void l() {
        GL43C.glDeleteProgram((int)this.x);
        this.x = -1;
        GL43C.glDeleteProgram((int)this.B);
        this.B = -1;
        GL43C.glDeleteProgram((int)this.D);
        this.D = -1;
        GL43C.glDeleteProgram((int)this.F);
        this.F = -1;
        GL43C.glDeleteProgram((int)this.K);
        this.K = -1;
    }

    private void m() {
        this.H = GL43C.glGenVertexArrays();
        this.N = GL43C.glGenVertexArrays();
        this.O = GL43C.glGenBuffers();
        GL43C.glBindVertexArray((int)this.N);
        FloatBuffer floatBuffer = rs.k.c.b(20);
        floatBuffer.put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f});
        floatBuffer.rewind();
        GL43C.glBindBuffer((int)34962, (int)this.O);
        GL43C.glBufferData((int)34962, (FloatBuffer)floatBuffer, (int)35044);
        GL43C.glVertexAttribPointer((int)0, (int)3, (int)5126, (boolean)false, (int)20, (long)0L);
        GL43C.glEnableVertexAttribArray((int)0);
        GL43C.glVertexAttribPointer((int)1, (int)2, (int)5126, (boolean)false, (int)20, (long)12L);
        GL43C.glEnableVertexAttribArray((int)1);
        GL43C.glBindBuffer((int)34962, (int)0);
    }

    private void n() {
        GL43C.glDeleteVertexArrays((int)this.H);
        this.H = -1;
        GL43C.glDeleteBuffers((int)this.O);
        this.O = -1;
        GL43C.glDeleteVertexArrays((int)this.N);
        this.N = -1;
    }

    private void o() {
        this.a(this.T);
        this.a(this.U);
        this.a(this.V);
        this.a(this.W);
        this.a(this.X);
        this.a(this.Y);
        this.a(this.Z);
        this.a(this.aa);
        this.a(this.ab);
    }

    private void a(rs.k.a a2) {
        a2.b = GL43C.glGenBuffers();
    }

    private void p() {
        this.b(this.T);
        this.b(this.U);
        this.b(this.V);
        this.b(this.W);
        this.b(this.X);
        this.b(this.Y);
        this.b(this.Z);
        this.b(this.aa);
        this.b(this.ab);
    }

    private void b(rs.k.a a2) {
        if (a2.b != -1) {
            GL43C.glDeleteBuffers((int)a2.b);
            a2.b = -1;
        }
        a2.c = -1;
        if (a2.d != -1L) {
            a2.d = -1L;
        }
    }

    private void q() {
        this.J = GL43C.glGenBuffers();
        this.I = GL43C.glGenTextures();
        GL43C.glBindTexture((int)3553, (int)this.I);
        GL43C.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL43C.glTexParameteri((int)3553, (int)10243, (int)33071);
        GL43C.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL43C.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL43C.glBindTexture((int)3553, (int)0);
    }

    private void r() {
        GL43C.glDeleteBuffers((int)this.J);
        GL43C.glDeleteTextures((int)this.I);
        this.I = -1;
    }

    private void s() {
        this.a(this.ad);
        IntBuffer intBuffer = rs.k.d.b(8200);
        intBuffer.put(new int[8]);
        int[] nArray = new int[2];
        for (int i2 = 0; i2 < 2048; ++i2) {
            intBuffer.put(rs.runelite.a.h.e[i2]);
            intBuffer.put(rs.runelite.a.h.f[i2]);
            intBuffer.put(nArray);
        }
        intBuffer.flip();
        this.a(this.ad, 35345, intBuffer, 35048, 4L);
        GL43C.glBindBuffer((int)35345, (int)0);
    }

    private void a(int n2, int n3, int n4) {
        if (rs.k.j.a() != rs.k.j.b) {
            GraphicsConfiguration graphicsConfiguration = this.b().getGraphicsConfiguration();
            AffineTransform affineTransform = graphicsConfiguration.getDefaultTransform();
            n2 = this.a(affineTransform.getScaleX(), n2);
            n3 = this.a(affineTransform.getScaleY(), n3);
        }
        this.P = GL43C.glGenFramebuffers();
        GL43C.glBindFramebuffer((int)36160, (int)this.P);
        this.Q = GL43C.glGenRenderbuffers();
        GL43C.glBindRenderbuffer((int)36161, (int)this.Q);
        GL43C.glRenderbufferStorageMultisample((int)36161, (int)n4, (int)6408, (int)n2, (int)n3);
        GL43C.glFramebufferRenderbuffer((int)36160, (int)36064, (int)36161, (int)this.Q);
        int n5 = GL43C.glCheckFramebufferStatus((int)36160);
        if (n5 != 36053) {
            throw new RuntimeException("FBO is incomplete. status: " + n5);
        }
        GL43C.glBindFramebuffer((int)36160, (int)this.t.getFramebuffer(false));
        GL43C.glBindRenderbuffer((int)36161, (int)0);
    }

    private void t() {
        if (this.P != -1) {
            GL43C.glDeleteFramebuffers((int)this.P);
            this.P = -1;
        }
        if (this.Q != -1) {
            GL43C.glDeleteRenderbuffers((int)this.Q);
            this.Q = -1;
        }
    }

    private float[] a(float f2, float f3, float f4) {
        return new float[]{2.0f / f2, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -2.0f * f4, 0.0f};
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(n2, n3, n4, n5, n6, n7);
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.aG = Launcher.n().o().al();
        this.aH = Launcher.n().o().am();
        this.aI = Launcher.n().o().an();
        this.aJ = Launcher.n().o().ao();
        this.ah.b();
        this.ah.a(32);
        IntBuffer intBuffer = this.ah.c();
        intBuffer.put(this.aI).put(this.aJ).put(this.aG).put(this.aH).put(Launcher.n().o().aL()).put(Launcher.n().o().aN()).put(Launcher.n().o().aO()).put(Launcher.n().o().aP());
        intBuffer.flip();
        GL43C.glBindBuffer((int)35345, (int)this.ad.b);
        GL43C.glBufferSubData((int)35345, (long)0L, (IntBuffer)intBuffer);
        GL43C.glBindBuffer((int)35345, (int)0);
        GL43C.glBindBufferBase((int)35345, (int)0, (int)this.ad.b);
        intBuffer.clear();
    }

    public void f() {
        this.u();
    }

    private void u() {
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, j_0 j_02, int n10, int n11, int n12, int n13, int n14, int n15) {
        if (this.v == rs.k.e$a.a) {
            this.av += this.q.a(j_02, n10, n11, n12, this.ah, this.ai, 128 * n11, 128 * n12, true);
        } else if (j_02.f() > 0) {
            int n16 = n11 * 128;
            boolean bl = false;
            int n17 = n12 * 128;
            d d2 = this.aj;
            ++this.am;
            d2.a(8);
            IntBuffer intBuffer = d2.c();
            intBuffer.put(j_02.g());
            intBuffer.put(j_02.h());
            intBuffer.put(2);
            intBuffer.put(this.av);
            intBuffer.put(Integer.MIN_VALUE);
            intBuffer.put(n16).put(0).put(n17);
            this.av += 6;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, i_0 i_02, int n10, int n11, int n12, int n13, int n14, int n15) {
        if (i_02.a() > 0) {
            n7 = n11 * 128;
            n8 = 0;
            n9 = n12 * 128;
            d d2 = this.aj;
            ++this.am;
            d2.a(8);
            IntBuffer intBuffer = d2.c();
            intBuffer.put(i_02.b());
            intBuffer.put(i_02.c());
            intBuffer.put(i_02.a() / 3);
            intBuffer.put(this.av);
            intBuffer.put(Integer.MIN_VALUE);
            intBuffer.put(n7).put(n8).put(n9);
            this.av += i_02.a();
        }
    }

    public void g() {
        this.a(1, true);
    }

    public void b(boolean bl) {
        this.a(1, bl);
    }

    public void a(int n2, boolean bl) {
        Object object;
        int n3;
        int n4;
        int n5;
        int n6;
        Object object2;
        int n7 = Launcher.n().o().aw();
        int n8 = Launcher.n().o().av();
        int n9 = Launcher.n().o().as() + 5;
        int n10 = Launcher.n().o().at() + 5;
        rs.k.a.a a2 = rs.k.b.b;
        boolean bl2 = a2 != rs.k.a.a.a;
        this.c(n8, n7);
        if (bl2) {
            GL43C.glEnable((int)32925);
            object2 = Launcher.n().o().aF();
            int n11 = Launcher.n().o().ax() ? ((Dimension)object2).width : n8;
            int n12 = n6 = Launcher.n().o().ax() ? ((Dimension)object2).height : n7;
            if (this.aD != n11 || this.aE != n6 || this.ay != a2) {
                this.t();
                GL43C.glBindFramebuffer((int)36160, (int)this.t.getFramebuffer(false));
                n5 = GL43C.glGetInteger((int)32937);
                n4 = GL43C.glGetInteger((int)36183);
                n3 = n5 != 0 ? n5 : Math.min(a2.a(), n4);
                m.debug("AA samples: {}, max samples: {}, forced samples: {}", new Object[]{n3, n4, n5});
                this.a(n11, n6, n3);
                this.aD = n11;
                this.aE = n6;
            }
            GL43C.glBindFramebuffer((int)36009, (int)this.P);
        } else {
            GL43C.glDisable((int)32925);
            this.t();
        }
        this.ay = a2;
        if (this.v == rs.k.e$a.a) {
            this.ah.a();
            this.ai.a();
            object2 = this.ah.c();
            object = this.ai.c();
            this.a(this.V, 34962, (IntBuffer)object2, 35048, 0L);
            this.a(this.W, 34962, (FloatBuffer)object, 35048, 0L);
            this.w();
        } else {
            this.ah.a();
            this.ai.a();
            this.al.a();
            this.ak.a();
            this.aj.a();
            object2 = this.ah.c();
            object = this.ai.c();
            IntBuffer intBuffer = this.al.c();
            IntBuffer intBuffer2 = this.ak.c();
            IntBuffer intBuffer3 = this.aj.c();
            this.a(this.V, 34962, (IntBuffer)object2, 35048, 4L);
            this.a(this.W, 34962, (FloatBuffer)object, 35048, 4L);
            this.a(this.X, 34962, intBuffer, 35048, 4L);
            this.a(this.Y, 34962, intBuffer2, 35048, 4L);
            this.a(this.Z, 34962, intBuffer3, 35048, 4L);
            this.a(this.aa, 34962, this.av * 16, 35040, 2L);
            this.a(this.ab, 34962, this.av * 16, 35040, 2L);
            if (this.v == rs.k.e$a.c) {
                this.p.a(this.am, this.at, this.au, this.T, this.U, this.V, this.W, this.Z, this.Y, this.X, this.aa, this.ab, this.ad);
            } else if (this.v == rs.k.e$a.b) {
                GL43C.glUniformBlockBinding((int)this.D, (int)this.aZ, (int)0);
                GL43C.glUniformBlockBinding((int)this.B, (int)this.ba, (int)0);
                GL43C.glUseProgram((int)this.F);
                GL43C.glBindBufferBase((int)37074, (int)0, (int)this.Z.b);
                GL43C.glBindBufferBase((int)37074, (int)1, (int)this.T.b);
                GL43C.glBindBufferBase((int)37074, (int)2, (int)this.V.b);
                GL43C.glBindBufferBase((int)37074, (int)3, (int)this.aa.b);
                GL43C.glBindBufferBase((int)37074, (int)4, (int)this.ab.b);
                GL43C.glBindBufferBase((int)37074, (int)5, (int)this.U.b);
                GL43C.glBindBufferBase((int)37074, (int)6, (int)this.W.b);
                GL43C.glDispatchCompute((int)this.am, (int)1, (int)1);
                GL43C.glUseProgram((int)this.D);
                GL43C.glBindBufferBase((int)37074, (int)0, (int)this.Y.b);
                GL43C.glBindBufferBase((int)37074, (int)1, (int)this.T.b);
                GL43C.glBindBufferBase((int)37074, (int)2, (int)this.V.b);
                GL43C.glBindBufferBase((int)37074, (int)3, (int)this.aa.b);
                GL43C.glBindBufferBase((int)37074, (int)4, (int)this.ab.b);
                GL43C.glBindBufferBase((int)37074, (int)5, (int)this.U.b);
                GL43C.glBindBufferBase((int)37074, (int)6, (int)this.W.b);
                GL43C.glDispatchCompute((int)this.at, (int)1, (int)1);
                GL43C.glUseProgram((int)this.B);
                GL43C.glBindBufferBase((int)37074, (int)0, (int)this.X.b);
                GL43C.glBindBufferBase((int)37074, (int)1, (int)this.T.b);
                GL43C.glBindBufferBase((int)37074, (int)2, (int)this.V.b);
                GL43C.glBindBufferBase((int)37074, (int)3, (int)this.aa.b);
                GL43C.glBindBufferBase((int)37074, (int)4, (int)this.ab.b);
                GL43C.glBindBufferBase((int)37074, (int)5, (int)this.U.b);
                GL43C.glBindBufferBase((int)37074, (int)6, (int)this.W.b);
                GL43C.glDispatchCompute((int)this.au, (int)1, (int)1);
                this.w();
            }
        }
        int n13 = Launcher.n().o().ak();
        object = Launcher.n().o();
        if (bl) {
            GL43C.glClearColor((float)((float)(n13 >> 16 & 0xFF) / 255.0f), (float)((float)(n13 >> 8 & 0xFF) / 255.0f), (float)((float)(n13 & 0xFF) / 255.0f), (float)1.0f);
            GL43C.glClear((int)16384);
        }
        if (this.R != -1) {
            int n14;
            int n15;
            int n16;
            if (this.ac == -1) {
                this.ac = this.o.a();
                if (this.ac > -1) {
                    float[] fArray = this.o.b();
                    GL43C.glUseProgram((int)this.x);
                    GL43C.glUniform2fv((int)this.aY, (float[])fArray);
                    GL43C.glUseProgram((int)0);
                }
            }
            n6 = 0;
            n5 = 0;
            n4 = n7;
            n3 = n9;
            int n17 = n10;
            this.e = rs.k.b.c;
            if (this.ac != -1 && this.aF != this.e) {
                this.o.a(this.ac, this.e);
                this.aF = this.e;
            }
            if (Launcher.n().o().ax()) {
                Dimension dimension = Launcher.n().o().aF();
                n4 = dimension.height;
                double d2 = dimension.getHeight() / (double)n7;
                double d3 = dimension.getWidth() / (double)n8;
                boolean bl3 = true;
                n3 = (int)Math.ceil(d2 * (double)n3) + 2;
                n17 = (int)Math.ceil(d3 * (double)n17) + 2;
                n6 = (int)Math.floor(d2 * (double)n6) - 1;
                n5 = (int)Math.floor(d3 * (double)n5) - 1;
            }
            if ((n16 = ((Client)object).ae()) > 1) {
                ++n16;
            }
            this.a(n5 + n16, n4 - n3 - n6, n17, n3);
            GL43C.glUseProgram((int)this.x);
            this.w();
            int n18 = v_0.e;
            boolean bl4 = false;
            GL43C.glUniform1i((int)this.aM, (int)0);
            GL43C.glUniform4f((int)this.aN, (float)((float)(n13 >> 16 & 0xFF) / 255.0f), (float)((float)(n13 >> 8 & 0xFF) / 255.0f), (float)((float)(n13 & 0xFF) / 255.0f), (float)1.0f);
            GL43C.glUniform1i((int)this.aO, (int)0);
            GL43C.glUniform1i((int)this.aP, (int)(n18 * 128));
            boolean bl5 = true;
            boolean bl6 = rs.k.b.f;
            GL43C.glUniform1f((int)this.aR, (float)((float)e_0.c()));
            GL43C.glUniform1f((int)this.bc, (float)(bl6 ? 0.0f : 1.0f));
            GL43C.glUniform1i((int)this.aK, (int)rs.k.b.e.ordinal());
            GL43C.glUniform1f((int)this.bd, (float)(bl5 ? 1.25f : 0.0f));
            Launcher.n().o();
            GL43C.glUniform1i((int)this.be, (int)Client.ff);
            float[] fArray = rs.k.h.a(Launcher.n().o().aL(), Launcher.n().o().aL(), 1.0f);
            rs.k.h.a(fArray, rs.k.h.c(n10, n9, 50.0f));
            rs.k.h.a(fArray, rs.k.h.a((float)(-(Math.PI - (double)this.aJ * 0.0030679615757712823))));
            rs.k.h.a(fArray, rs.k.h.b((float)((double)this.aI * 0.0030679615757712823)));
            rs.k.h.a(fArray, rs.k.h.b(-Launcher.n().o().aN(), -Launcher.n().o().aO(), -Launcher.n().o().aP()));
            GL43C.glUniformMatrix4fv((int)this.aQ, (boolean)false, (float[])fArray);
            GL43C.glUniformBlockBinding((int)this.x, (int)this.bb, (int)0);
            GL43C.glUniform1i((int)this.aX, (int)1);
            GL43C.glEnable((int)2884);
            GL43C.glEnable((int)3042);
            GL43C.glBlendFuncSeparate((int)770, (int)771, (int)1, (int)1);
            GL43C.glBindVertexArray((int)this.H);
            if (this.v != rs.k.e$a.a) {
                if (this.v == rs.k.e$a.b) {
                    GL43C.glMemoryBarrier((int)8192);
                } else {
                    this.p.b();
                }
                n15 = this.aa.b;
                n14 = this.ab.b;
            } else {
                n15 = this.V.b;
                n14 = this.W.b;
            }
            GL43C.glEnableVertexAttribArray((int)0);
            GL43C.glBindBuffer((int)34962, (int)n15);
            GL43C.glVertexAttribIPointer((int)0, (int)4, (int)5124, (int)0, (long)0L);
            GL43C.glEnableVertexAttribArray((int)1);
            GL43C.glBindBuffer((int)34962, (int)n14);
            GL43C.glVertexAttribPointer((int)1, (int)4, (int)5126, (boolean)false, (int)0, (long)0L);
            GL43C.glDrawArrays((int)4, (int)0, (int)this.av);
            GL43C.glDisable((int)3042);
            GL43C.glDisable((int)2884);
            GL43C.glUseProgram((int)0);
            this.w();
        }
        if (bl2) {
            n6 = this.aD;
            n5 = this.aE;
            if (rs.k.j.a() != rs.k.j.b) {
                GraphicsConfiguration graphicsConfiguration = this.b().getGraphicsConfiguration();
                AffineTransform affineTransform = graphicsConfiguration.getDefaultTransform();
                n6 = this.a(affineTransform.getScaleX(), n6);
                n5 = this.a(affineTransform.getScaleY(), n5);
            }
            GL43C.glBindFramebuffer((int)36008, (int)this.P);
            GL43C.glBindFramebuffer((int)36009, (int)this.t.getFramebuffer(false));
            GL43C.glBlitFramebuffer((int)0, (int)0, (int)n6, (int)n5, (int)0, (int)0, (int)n6, (int)n5, (int)16384, (int)9728);
            GL43C.glBindFramebuffer((int)36008, (int)this.t.getFramebuffer(false));
        }
        this.ah.b();
        this.ai.b();
        this.al.b();
        this.ak.b();
        this.aj.b();
        this.am = 0;
        this.au = 0;
        this.at = 0;
        this.aw = 0;
        this.ax = 0;
        rs.k.b.g.a();
        this.a(n7, n8);
        this.w();
        this.t.swapBuffers();
        this.w();
        this.av = 0;
        this.w();
        if (++this.as > 5L && !rs.f.a.Q) {
            rs.f.a.Q = true;
            rs.f.a.d();
        }
    }

    public void h() {
        this.aC = -1;
        this.aB = -1;
        this.aE = -1;
        this.aD = -1;
    }

    private void c(int n2, int n3) {
        Client client = Launcher.n().o();
        if (n2 != this.aB || n3 != this.aC) {
            this.aB = n2;
            this.aC = n3;
            GL43C.glBindBuffer((int)35052, (int)this.J);
            GL43C.glBufferData((int)35052, (long)((long)(n2 * n3) * 4L), (int)35040);
            GL43C.glBindBuffer((int)35052, (int)0);
            GL43C.glBindTexture((int)3553, (int)this.I);
            GL43C.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)5121, (long)0L);
            GL43C.glBindTexture((int)3553, (int)0);
        }
        c_0[] c_0Array = new c_0[]{client.gZ};
        int[] nArray = new int[]{0};
        int[] nArray2 = new int[]{0};
        boolean bl = rs.f.a.ai == a.c.b;
        for (int i2 = 0; i2 < c_0Array.length; ++i2) {
            int[] nArray3 = c_0Array[i2].b();
            int n4 = c_0Array[i2].c();
            int n5 = c_0Array[i2].d();
            GL43C.glBindBuffer((int)35052, (int)this.J);
            GL43C.glMapBuffer((int)35052, (int)35001).asIntBuffer().put(nArray3, 0, n4 * n5);
            GL43C.glUnmapBuffer((int)35052);
            GL43C.glBindTexture((int)3553, (int)this.I);
            GL43C.glTexSubImage2D((int)3553, (int)0, (int)nArray[i2], (int)nArray2[i2], (int)n4, (int)n5, (int)32993, (int)33639, (long)0L);
            GL43C.glBindBuffer((int)35052, (int)0);
            GL43C.glBindTexture((int)3553, (int)0);
        }
    }

    public void a(int n2, int n3) {
        boolean bl = false;
        GL43C.glEnable((int)3042);
        GL43C.glBlendFunc((int)1, (int)771);
        GL43C.glBindTexture((int)3553, (int)this.I);
        int n4 = rs.k.b.k;
        if (!Launcher.n().o().ay()) {
            n4 = 2;
        }
        int n5 = rs.k.b.e.ordinal();
        GL43C.glUseProgram((int)this.K);
        GL43C.glUniform1i((int)this.aS, (int)0);
        GL43C.glUniform1i((int)this.aT, (int)n4);
        GL43C.glUniform2i((int)this.aU, (int)n3, (int)n2);
        GL43C.glUniform1i((int)this.aL, (int)n5);
        GL43C.glUniform4f((int)this.aW, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        Client client = Launcher.n().o();
        if (client.ax()) {
            Dimension dimension = client.aF();
            int n6 = client.ae();
            this.a(n6, 0, dimension.width, dimension.height);
            GL43C.glUniform2i((int)this.aV, (int)dimension.width, (int)dimension.height);
        } else {
            this.a(0, this.v == rs.k.e$a.c && rs.f.a.ai == a.c.a ? 2 : 0, n3, n2);
            GL43C.glUniform2i((int)this.aV, (int)n3, (int)n2);
        }
        if (Launcher.n().o().ax()) {
            int n7 = 9728;
            GL43C.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL43C.glTexParameteri((int)3553, (int)10240, (int)9728);
        }
        GL43C.glBindVertexArray((int)this.N);
        GL43C.glDrawArrays((int)6, (int)0, (int)4);
        GL43C.glBindTexture((int)3553, (int)0);
        GL43C.glBindVertexArray((int)0);
        GL43C.glUseProgram((int)0);
        GL43C.glBlendFunc((int)770, (int)771);
        GL43C.glDisable((int)3042);
    }

    public void i() {
        if (!Launcher.n().o().fc) {
            System.out.println("Shutting down..");
            this.d();
            return;
        }
        this.v();
    }

    private void v() {
        this.ah.b();
        this.ai.b();
        this.q.a(Launcher.n().o().dF, this.ah, this.ai);
        this.ah.a();
        this.ai.a();
        IntBuffer intBuffer = this.ah.c();
        FloatBuffer floatBuffer = this.ai.c();
        this.a(this.T, 34962, intBuffer, 35046, 4L);
        this.a(this.U, 34962, floatBuffer, 35046, 4L);
        GL43C.glBindBuffer((int)34962, (int)0);
        intBuffer.clear();
        floatBuffer.clear();
    }

    public void a(rs.a.h h2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        if (h2 == null || h2.ah == 0) {
            return;
        }
        if (this.v == rs.k.e$a.a) {
            if (h2 != null) {
                // empty if block
            }
            return;
        }
        if (h2.r() == this.q.b) {
            int n10 = Math.min(6144, h2.ah);
            int n11 = h2.s();
            d d2 = this.a(n10);
            d2.a(8);
            IntBuffer intBuffer = d2.c();
            rs.k.e.u[0] = h2.t();
            rs.k.e.u[1] = n11;
            rs.k.e.u[2] = n10;
            rs.k.e.u[3] = this.av;
            rs.k.e.u[4] = Integer.MIN_VALUE | h2.v() << 12 | n2;
            rs.k.e.u[5] = n7 + Launcher.n().o().aN();
            rs.k.e.u[6] = n8 + Launcher.n().o().aO();
            rs.k.e.u[7] = n9 + Launcher.n().o().aP();
            intBuffer.put(u);
            this.av += n10 * 3;
        } else {
            boolean bl = a && (h2.Y != null || h2.d());
            int n12 = Math.min(6144, h2.ah);
            this.ah.a(12 * n12);
            this.ai.a(12 * n12);
            int n13 = 0;
            rs.k.e.u[3] = this.av;
            rs.k.e.u[4] = h2.v() << 12 | n2;
            rs.k.e.u[5] = n7 + Launcher.n().o().aN();
            rs.k.e.u[6] = n8 + Launcher.n().o().aO();
            rs.k.e.u[7] = n9 + Launcher.n().o().aP();
            Object var15_18 = null;
            int n14 = -1;
            n13 = this.r.a(h2, this.ah, this.ai, l2);
            int n15 = h2.ah;
            int n16 = bl ? this.ax : -1;
            rs.k.e.u[0] = this.aw;
            rs.k.e.u[1] = bl ? n16 : -1;
            rs.k.e.u[2] = n13 / 3;
            this.a(n13 / 3).a(8).a(u);
            this.aw += n13;
            if (bl) {
                this.ax += n13;
            }
            this.av += n13;
        }
    }

    private boolean a(rs.a.h h2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        Client client = Launcher.n().o();
        int n16 = h2.u();
        int n17 = h2.g;
        int n18 = client.aM();
        int n19 = h2.g;
        int n20 = rs.l.c.n;
        int n21 = rs.l.c.n * -1;
        int n22 = rs.l.c.o * -1;
        int n23 = rs.l.c.o;
        int n24 = n5 * n8 - n4 * n6 >> 16;
        int n25 = n2 * n7 + n3 * n24 >> 16;
        int n26 = n3 * n16 >> 16;
        int n27 = n25 + n26;
        if (n27 > 50 && (n15 = ((n14 = n8 * n4 + n5 * n6 >> 16) - n16) * n18) / n27 < n20 && (n13 = (n14 + n16) * n18) / n27 > n21 && (n12 = ((n11 = n3 * n7 - n24 * n2 >> 16) + (n10 = (n3 * n17 >> 16) + (n9 = n2 * n16 >> 16))) * n18) / n27 > n22) {
            int n28 = (n3 * n19 >> 16) + n9;
            int n29 = (n11 - n28) * n18;
            return n29 / n27 < n23;
        }
        return false;
    }

    public void a(rs.k.c.a a2, int n2, int n3, int n4, int n5, boolean bl) {
        if (this.v == rs.k.e$a.a) {
            return;
        }
        int n6 = 655360;
        int n7 = 255 - (int)(255.0f * a2.g());
        int n8 = (n7 & 0xFF) << 24;
        int n9 = rs.l.f.a(a2.e());
        int n10 = !bl ? 18 : 6;
        int n11 = 3 * n10;
        this.ah.a(12 * n10);
        int n12 = (int)(3.5f + a2.f());
        int n13 = a2.j();
        int n14 = a2.k() * -1;
        int n15 = a2.l();
        if (bl) {
            this.ah.a(rs.k.c.b.b(n13, n14, n15, n12, n8 | n6 | n9));
        } else {
            this.ah.a(rs.k.c.b.a(n13, n14, n15, n12, n8 | n6 | n9));
        }
        d d2 = this.a(n10);
        d2 = this.ak;
        rs.k.e.u[0] = this.aw;
        rs.k.e.u[1] = -1;
        rs.k.e.u[2] = n11 / 3;
        rs.k.e.u[3] = this.av;
        rs.k.e.u[4] = 0 | n2;
        rs.k.e.u[5] = n3 + Launcher.n().o().aN();
        rs.k.e.u[6] = n4 + Launcher.n().o().aO();
        rs.k.e.u[7] = n5 + Launcher.n().o().aP();
        d2.a(8).a(u);
        this.aw += n11;
        this.av += n11;
    }

    private d a(int n2) {
        if (n2 < 512) {
            ++this.at;
            return this.ak;
        }
        ++this.au;
        return this.al;
    }

    private static void a(Runnable runnable) {
        runnable.run();
    }

    private int a(double d2, int n2) {
        return (int)((double)n2 * d2 + 0.5);
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (rs.k.j.a() == rs.k.j.b) {
            GL43C.glViewport((int)n2, (int)n3, (int)n4, (int)n5);
        } else {
            GraphicsConfiguration graphicsConfiguration = this.b().getGraphicsConfiguration();
            AffineTransform affineTransform = graphicsConfiguration.getDefaultTransform();
            GL43C.glViewport((int)this.a(affineTransform.getScaleX(), n2), (int)this.a(affineTransform.getScaleY(), n3), (int)this.a(affineTransform.getScaleX(), n4), (int)this.a(affineTransform.getScaleY(), n5));
        }
    }

    private void a(@Nonnull rs.k.a a2, int n2, @Nonnull IntBuffer intBuffer, int n3, long l2) {
        int n4 = intBuffer.remaining() << 2;
        this.a(a2, n2, n4, n3, l2);
        GL43C.glBufferSubData((int)n2, (long)0L, (IntBuffer)intBuffer);
    }

    private void a(@Nonnull rs.k.a a2, int n2, @Nonnull FloatBuffer floatBuffer, int n3, long l2) {
        int n4 = floatBuffer.remaining() << 2;
        this.a(a2, n2, n4, n3, l2);
        GL43C.glBufferSubData((int)n2, (long)0L, (FloatBuffer)floatBuffer);
    }

    private void a(@Nonnull rs.k.a a2, int n2, int n3, int n4, long l2) {
        GL43C.glBindBuffer((int)n2, (int)a2.b);
        if (this.af.glInvalidateBufferData != 0L) {
            GL43C.glInvalidateBufferData((int)a2.b);
        }
        if (n3 > a2.c) {
            int n5 = Math.max(1024, rs.k.e.b(n3));
            m.trace("Buffer resize: {} {} -> {}", new Object[]{a2, a2.c, n5});
            a2.c = n5;
            GL43C.glBufferData((int)n2, (long)n5, (int)n4);
            this.a(a2, l2);
        }
    }

    private static int b(int n2) {
        --n2;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return ++n2;
    }

    private void a(rs.k.a a2, long l2) {
        if (this.v == rs.k.e$a.c) {
            if (a2.d != -1L) {
                CL10.clReleaseMemObject((long)a2.d);
            }
            a2.d = a2.c == 0 ? -1L : CL10GL.clCreateFromGLBuffer((long)this.p.a, (long)l2, (int)a2.b, (int[])null);
        }
    }

    private void w() {
        if (!m.isDebugEnabled()) {
            return;
        }
        int n2;
        while ((n2 = GL43C.glGetError()) != 0) {
            Object object;
            switch (n2) {
                case 1280: {
                    object = "INVALID_ENUM";
                    break;
                }
                case 1281: {
                    object = "INVALID_VALUE";
                    break;
                }
                case 1282: {
                    object = "INVALID_OPERATION";
                    break;
                }
                case 1286: {
                    object = "INVALID_FRAMEBUFFER_OPERATION";
                    break;
                }
                default: {
                    object = "" + n2;
                }
            }
            m.debug("glGetError:", (Throwable)new Exception((String)object));
        }
        return;
    }

    static /* synthetic */ a a(e e2) {
        return e2.v;
    }

    static /* synthetic */ void b(e e2) {
        e2.v();
    }

    static /* synthetic */ void c(e e2) {
        e2.w();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.k.e$a.a();
        }
    }
}

