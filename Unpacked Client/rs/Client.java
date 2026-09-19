/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.d
 *  gnu.trove.f.b.cc
 *  javax.inject.Inject
 */
package rs;

import gnu.trove.f.b.cc;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.d;
import rs.d.h;
import rs.d.r;
import rs.d.t;
import rs.d.v;
import rs.d.y;
import rs.d.z;
import rs.e;
import rs.eventbus.EventBus;
import rs.f;
import rs.f.a;
import rs.gui.Launcher;
import rs.h_0;
import rs.j;
import rs.k;
import rs.k.p;
import rs.l;
import rs.l.a_0;
import rs.l.d.c;
import rs.l.e.g;
import rs.l.e.o;
import rs.l.e.q;
import rs.l.e_0;
import rs.l.f.a.c.c;
import rs.l.f_0;
import rs.l.i_0;
import rs.l.s;
import rs.l_0;
import rs.m;
import rs.m.a;
import rs.n.c.ab;
import rs.n.c.ac;
import rs.n.c.ad_0;
import rs.n.c.ae;
import rs.n.c.af;
import rs.n.c.ag_0;
import rs.n.c.ah_0;
import rs.n.c.ai;
import rs.n.c.al;
import rs.n.c.ap;
import rs.n.c.at;
import rs.n.c.au;
import rs.n.c.av;
import rs.n.c.b;
import rs.n.c.ba;
import rs.n.c.g_0;
import rs.n.c.h;
import rs.n.c.v_0;
import rs.n.c.w;
import rs.n.c.y_0;
import rs.n_0;
import rs.o_0;
import rs.p_0;
import rs.q;
import rs.q.a.a.a.i;
import rs.q_0;
import rs.r.c_0;
import rs.r.j_0;
import rs.r.k_0;
import rs.runelite.events.ChatMessage;
import rs.runelite.events.ClientStartUp;
import rs.runelite.events.EntityInteraction;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.runelite.events.MenuOpened;
import rs.runelite.events.NpcSpawned;
import rs.runelite.events.ObjectInteraction;
import rs.runelite.events.PrivateChatMessage;
import rs.runelite.events.SkillLevelChanged;
import rs.t_0;
import rs.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Client
extends rs.c_0 {
    public rs.k.e a;
    public p b;
    public static final Map<Integer, Boolean> c;
    final Integer[] d = new Integer[]{13129, 13642, 13641, 13386, 13130, 13131, 13387, 13655, 1365, 13646, 13647, 13135, 13134, 13133, 12621, 13899, 13900, 14155, 14156, 13388, 13644, 12877, 12878, 12879, 13390, 13391, 13389, 13132, 13645, 13385, 12873, 12874, 12875, 13903, 13902, 13901, 14157, 14413, 14412, 14411, 14410, 13643, 13898, 13897, 13640, 12623, 12622, 12367, 12366, 12365, 12620, 13361, 13360, 13362, 13105, 13617, 9023, 9022, 9024, 8768, 8767, 8766, 9278, 9279, 9280, 12956, 12700, 12444, 12445, 12446, 12447, 12703, 12702, 12701, 12957, 12958, 12959, 6810, 7066, 7065, 6811, 6809, 6553, 6554, 6555, 12704, 12488, 12960, 13396, 13136, 12881, 12882, 12883, 12884, 12885, 12886, 13142, 13398, 14654, 13653, 13652, 13651, 13650, 13649, 13648, 13392, 13216, 13215, 13214, 13213, 13212, 12448, 14927, 14926, 14928, 14672, 14671, 14670, 15184, 15183, 15182, 6481, 6226, 6482, 6738, 6737, 6736, 6480, 6224, 6225, 6479, 6223, 6735, 5771, 5772, 5770, 5515, 6027, 5514, 6026, 5513, 5769, 6025, 5773, 6029, 5774, 5517, 5518, 6030, 5516, 6028, 12611, 12355, 12354, 12610, 12866, 12867, 12868, 12612, 12356, 12613, 12357, 12358, 12614, 12870, 12869, 13125, 12868, 12869, 12870, 13126, 13382, 13381, 13380, 13124, 13122, 13123, 13379, 13378, 13337, 13121, 12865, 12866, 12867, 13123, 13124, 13380, 12868, 13379, 13378, 12886, 12613, 12357, 12869, 12356, 12868, 13404, 13403, 13402, 13401, 13657, 13913, 14169, 14170, 14171, 14172, 13916, 13660, 13659, 13915, 13658, 13914, 5956, 5957, 5955, 5770, 6211, 6212, 6213, 5701, 5700, 5699, 11622, 11878, 12134, 11621, 11877, 12133, 11620, 11876, 12132, 11601, 11345, 11857, 11600, 11856, 11344, 11602, 11858, 11346};
    final Integer[] e = new Integer[0];
    public static boolean f;
    public static final boolean g = false;
    public static boolean h;
    public static boolean i;
    public static long j;
    public String k;
    public rs.cache.b.c l = new rs.cache.b.c(this);
    public rs.l.e.h m;
    public rs.l.e.m n;
    public rs.l.e.e o;
    @Inject
    public EventBus p;
    @Inject
    public rs.j.a.b q;
    @Inject
    public rs.j.b.d r;
    public int s;
    public int t;
    public List<rs.l.e.q> u = new ArrayList<rs.l.e.q>();
    public rs.i.b v;
    public static rs.l.e.c w;
    public c x;
    public rs.l.c.a y;
    public rs.l.f.a.c.d z;
    public static final int A = 2940;
    public static final int B = 3390;
    public static final int C = 3521;
    public static final int D = 3972;
    public static long E;
    public static double F;
    public rs.l.d.c G;
    public f_0[] H;
    public f_0 I;
    public f_0[] J;
    public boolean K;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public long O = 0L;
    public int P = 0;
    public int Q = 0;
    public long R = 0L;
    public int S = 0;
    public static int T;
    public boolean U = false;
    public static int V;
    public static int W;
    public static int X;
    private static long ib;
    public f_0 Y;
    private static long ic;
    private long id;
    private List<rs.q.a.a> ie = new ArrayList<rs.q.a.a>();
    private Map<String, Boolean> if = new HashMap<String, Boolean>();
    public j Z = new j();
    public static o aa;
    public static rs.l.e.k ab;
    public static final int[] ac;
    public List<Integer> ad = new ArrayList<Integer>();
    public boolean ae = false;
    public String af = "";
    public static boolean ag;
    public static int ah;
    public static int ai;
    public static int aj;
    public static int ak;
    public static int al;
    public List<String> am = new ArrayList<String>();
    public String an;
    public static String ao;
    public static String ap;
    public static String aq;
    public String ar;
    public String as;
    public String at;
    public static String au;
    public static String av;
    public static String aw;
    public static String ax;
    public static String ay;
    public static String az;
    public f_0 aA;
    public boolean aB = false;
    public boolean aC = false;
    public boolean aD = false;
    public boolean aE = false;
    public boolean aF = false;
    public String aG = "";
    public String aH = "";
    public String aI = "";
    public boolean aJ = false;
    public boolean aK = false;
    public double aL = 0.0;
    public int aM = 0;
    public int aN = 0;
    int aO = 0;
    int aP = 0;
    long aQ = 0L;
    String aR = "";
    public f_0 aS;
    public f_0 aT;
    private f_0 ig;
    public f_0 aU;
    private int ih = 14;
    public static int aV;
    public static int aW;
    public static int aX;
    public static int aY;
    public static final int[] aZ;
    public static boolean ba;
    public static int bb;
    public static int bc;
    public static int bd;
    public static int be;
    public static int bf;
    public static int bg;
    private static long ii;
    public static long bh;
    public static long bi;
    private long ij = 0L;
    private String ik = "";
    public boolean bj = true;
    private f_0[] il = null;
    private int[] im = null;
    private long in;
    private int io = 1;
    private String ip = "";
    private final long iq = 200L;
    public static rs.l.k_0[] bk;
    public int bl;
    public int bm;
    public static cc<Boolean> bn;
    public List<rs.d.q> bo = new ArrayList<rs.d.q>();
    public List<rs.d.q> bp = new ArrayList<rs.d.q>();
    private f_0 ir;
    private f_0 is;
    private f_0 it;
    private f_0 iu;
    private f_0 iv;
    public int bq;
    public static int br;
    public f_0 bs;
    public boolean bt = false;
    public boolean bu = false;
    public boolean bv = false;
    public boolean bw = false;
    private final rs.l.l iw = new rs.l.l();
    private final a_0 ix = new a_0();
    public int[] bx;
    public static k_0[] by;
    private ArrayList<rs.r.a> iy;
    private ArrayList<rs.r.a> iz;
    public int[] bz = new int[2000];
    public int[] bA = new int[2000];
    public int[] bB = new int[2000];
    public static int bC;
    public static boolean bD;
    public static int bE;
    public static int bF;
    public static int bG;
    public static int bH;
    private static final Random iA;
    private boolean iB = false;
    private long iC;
    public boolean bI;
    private Long[] iD = null;
    private Long[] iE = null;
    private boolean iF = false;
    public static final int[] bJ;
    public static final int[] bK;
    public static int bL;
    public static int bM;
    public static int bN;
    public static int bO;
    public static int bP;
    public static int bQ;
    public static boolean bR;
    public String bS = "";
    public long bT = 0L;
    public int bU = 0;
    public int[] bV = new int[]{23034, 23035, 23036};
    private int iG = 0;
    private String[] iH = new String[]{"::home", "::mb", "::gamble"};
    private long iI = System.currentTimeMillis();
    private int iJ = -1;
    public static int bW;
    private boolean iK = false;
    public boolean bX = false;
    private static final int iL = 16;
    private final a.a[] iM = rs.m.a.a();
    private long iN;
    private int iO;
    private final a iP = new a(null);
    private boolean iQ;
    private long iR;
    long bY;
    public boolean bZ = false;
    private Object iS;
    private String iT;
    public boolean ca = false;
    public boolean cb = false;
    private final int[] iU = new int[]{38, 33, 33, 33, 33, 33, 38, 38, 33, 33, 33, 33, 33, 38};
    private final int[] iV = new int[]{522, 560, 593, 625, 659, 692, 724, 522, 560, 593, 625, 659, 692, 724};
    private final int[] iW = new int[]{169, 169, 169, 169, 169, 169, 169, 466, 466, 466, 466, 466, 466, 466};
    public boolean cc = false;
    public boolean cd = false;
    int ce = 0;
    public boolean cf = false;
    public boolean cg = false;
    private f_0 iX;
    private f_0 iY;
    private f_0 iZ;
    private f_0 ja;
    private f_0 jb;
    private f_0 jc;
    public static boolean ch;
    public static long ci;
    private int jd;
    public int cj = -1;
    public int ck;
    private final int[] je = new int[]{17, 49, 83, 114, 146, 180, 214, 16, 49, 82, 116, 148, 184, 214};
    private final int[] jf = new int[]{9, 7, 7, 5, 2, 3, 7, 303, 306, 306, 302, 305, 303, 303, 303};
    private final int[] jg = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private final int[] jh = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private final int[] ji = new int[]{6, 44, 77, 110, 143, 176, 209, 6, 44, 77, 110, 143, 176, 209};
    private final int[] jj = new int[]{0, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298};
    private final int[] jk = new int[]{35, 39, 39, 39, 39, 39, 36, 37, 39, 39, 39, 39, 39, 38};
    int cl = 0;
    public final int[] cm = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 19101, 19111, 19121, 19122, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
    public final int[] cn = new int[]{1202, 1203, 1209, 1210, 1211, 1218, 1219, 1220, 1227, 1228, 1234, 1235, 1236, 1243, 1244, 1245, 1252, 1253, 1254, 1261, 1262, 1263, 1270, 1271, 1277, 1278, 1279, 1286, 1287, 1293, 1294, 1295, 1302, 1303, 1304, 1311, 1312, 1318, 1319, 1320, 1327, 1328, 1329, 1336, 1337, 1343, 1344, 1345, 1352, 1353, 1354, 1361, 1362, 1363, 1370, 1371, 1377, 1378, 1384, 1385, 1391, 1392, 1393, 1400, 1401, 1407, 1408, 1410, 1417, 1418, 1424, 1425, 1426, 1433, 1434, 1440, 1441, 1442, 1449, 1450, 1456, 1457, 1463, 1464, 1465, 1472, 1473, 1474, 1481, 1482, 1488, 1489, 1490, 1497, 1498, 1499, 1506, 1507, 1508, 1515, 1516, 1517, 1524, 1525, 1526, 1533, 1534, 1535, 1547, 1548, 1549, 1556, 1557, 1558, 1566, 1567, 1568, 1576, 1577, 1578, 1586, 1587, 1588, 1596, 1597, 1598, 1605, 1606, 1607, 1616, 1617, 1618, 1627, 1628, 1629, 1638, 1639, 1640, 6007, 6008, 6011, 8673, 8674, 12041, 12042, 12429, 12430, 12431, 12439, 12440, 12441, 12449, 12450, 12451, 12459, 12460, 15881, 15882, 15885, 18474, 18475, 18478};
    private int jl = -1;
    public String co = "";
    private String jm;
    public boolean cp;
    private boolean jn;
    private String jo = "";
    private Map<Integer, String> jp = new HashMap<Integer, String>();
    private int jq;
    private long jr;
    private int js;
    private String jt;
    public static int cq;
    public static int cr;
    private String[] ju = new String[300];
    long cs = 0L;
    boolean ct = false;
    boolean cu = false;
    private int jv = 0;
    private long jw;
    private long jx;
    private static final int[] jy;
    private static final int[] jz;
    public rs.h.d cv = new rs.h.d(this);
    private final long jA = 0L;
    private Map<Integer, rs.x.d> jB = new HashMap<Integer, rs.x.d>();
    public static int cw;
    private static final ArrayList<Integer> jC;
    public static final ArrayList<String> cx;
    public static final int[] cy;
    private int jD;
    private long jE;
    private int[][] jF;
    private int[] jG;
    private rs.h[][][] jH;
    private int[] jI;
    private int[] jJ;
    private volatile boolean jK;
    private Socket jL;
    public int cz;
    private rs.x.e jM;
    public rs.a.j[] cA;
    public int cB;
    public int[] cC;
    private int jN;
    private int[] jO;
    private int jP;
    private int jQ;
    private int jR;
    public String cD;
    public int cE;
    private rs.x.e jS;
    private boolean jT;
    public static int cF;
    private int[] jU;
    private int[] jV;
    private int[] jW;
    private int[] jX;
    private static int jY;
    private int jZ;
    public int cG;
    public static int cH;
    public static int cI;
    public static int cJ;
    public static int cK;
    public static int cL;
    public static int cM;
    public static int cN;
    public static int cO;
    public static int cP;
    public static int cQ;
    public int cR;
    public int cS;
    public static int cT;
    private final int[] ka;
    private rs.l.a kb;
    private rs.l.a kc;
    private rs.l.a kd;
    private rs.l.a ke;
    private rs.l.a kf;
    private f_0 kg;
    private f_0 kh;
    public f_0 cU;
    public f_0 cV;
    public f_0 cW;
    public f_0 cX;
    public int cY = 0;
    private f_0 ki;
    private f_0 kj;
    public f_0 cZ;
    public f_0 da;
    public f_0 db;
    public f_0 dc;
    public f_0 dd;
    public f_0[] de = new f_0[21];
    public f_0[] df = new f_0[20];
    private f_0[] kk = new f_0[2];
    private f_0 kl;
    private boolean km;
    public final int[] dg;
    private int kn;
    public final boolean[] dh;
    private int ko;
    private rs.b.a kp;
    private volatile boolean kq;
    private String kr;
    public static int di;
    public static boolean dj;
    private int ks;
    public static String dk;
    public String dl = null;
    public static String dm;
    private final int kt;
    public static final int dn = 2047;
    public static rs.a.k[] do;
    private int ku;
    private int[] kv;
    private int kw;
    private int[] kx;
    private rs.x.e[] ky;
    public int dp;
    private int kz;
    private int kA;
    private int kB;
    private int[][] kC;
    private final int kD;
    public rs.l.e dq;
    private rs.l.e kE;
    private rs.l.e kF;
    private rs.l.e kG;
    public rs.l.e dr;
    private rs.l.e kH;
    private rs.l.e kI;
    private rs.l.e kJ;
    private rs.l.e kK;
    private byte[] kL;
    private int kM;
    public int ds;
    public int dt;
    public int du;
    public int dv;
    public static int dw;
    public static int dx;
    private final int[] kN;
    private static int kO;
    private final long[] kP;
    private boolean kQ;
    private final int kR;
    public final int[] dy;
    private int[][] kS;
    private f_0 kT;
    private f_0 kU;
    private int kV;
    private int kW;
    private int kX;
    private int kY;
    private int kZ;
    private int la;
    private static int lb;
    public final int[] dz;
    public final int[] dA;
    public final String[] dB;
    public final String[] dC;
    public final boolean[] dD;
    public int dE;
    public rs.v_0 dF;
    public f_0[] dG;
    public int dH;
    private int lc;
    private int ld;
    public int dI;
    public int dJ;
    private long le;
    private boolean lf;
    private long[] lg;
    private int lh;
    public static int dK;
    public static int dL;
    public static boolean dM;
    private static boolean li;
    private volatile boolean lj;
    public int dN;
    public int dO;
    private final int[] lk = new int[]{0xFFFF00, 0xFF0000, 65280, 65535, 0xFF00FF, 0xFFFFFF};
    private rs.l.a ll;
    private rs.l.a lm;
    private final int[] ln;
    private final int[] lo;
    public int[] dP;
    private boolean lp;
    private final int lq;
    private final int[] lr;
    private final int[] ls;
    private final int[] lt;
    private final int[] lu;
    private final int[] lv;
    private final int[] lw;
    private final int[] lx;
    private final String[] ly;
    public int dQ;
    public int dR;
    private static int lz;
    public f_0[] dS;
    private int lA;
    public int dT;
    private final int[] lB;
    private static boolean lC;
    private final boolean lD;
    private int lE;
    private int lF;
    private int lG;
    private int lH;
    private int lI;
    private rs.q.a lJ;
    private f_0 lK;
    private final int lL;
    public static final int[][] dU;
    public static final int[][] dV;
    public String dW = "Enter amount:";
    public String dX = "Enter name:";
    public String dY;
    public static int dZ;
    private int lM;
    private int lN;
    private int lO;
    private int lP;
    private int lQ;
    private int lR;
    public rs.h ea;
    public int eb;
    public int ec;
    private int lS;
    private boolean lT;
    public static int ed;
    private static final int[] lU;
    private int lV;
    private int lW;
    public static int ee;
    private f_0 lX;
    private f_0 lY;
    public int ef;
    private f_0 lZ;
    private rs.l.a ma;
    private f_0 mb;
    private f_0 mc;
    public final int[] eg;
    private boolean md;
    private f_0[] me;
    public static int eh;
    public static int ei;
    public static int ej;
    public static String ek;
    private int mf;
    private int mg;
    public int el;
    public int em;
    private int mh;
    private int mi;
    public int en;
    public final int[] eo;
    private final int[] mj;
    private int mk;
    private boolean ml;
    public int ep;
    private String mm;
    private static int mn;
    public final int[] eq;
    private rs.x.f mo;
    public int er;
    public int es;
    public rs.h et;
    private final int[] mp;
    public final rs.n.e eu;
    private rs.l.a[] mq;
    private static int mr;
    private int ms;
    private final int mt;
    public int ev;
    private final int[] mu;
    private int mv;
    private int mw;
    public static rs.cache.d ew;
    private int mx;
    private int my;
    private int mz;
    private int[] mA;
    private int[] mB;
    private f_0 mC;
    private f_0 mD;
    private f_0 mE;
    private f_0 mF;
    private f_0 mG;
    private f_0 mH;
    private f_0 mI;
    private f_0 mJ;
    private f_0 mK;
    private f_0 mL;
    private f_0 mM;
    private f_0 mN;
    private f_0 mO;
    private f_0 mP;
    private f_0 mQ;
    private int mR;
    private boolean mS;
    private String[] mT;
    private rs.x.e mU;
    public int ex;
    public int ey;
    private int mV;
    public int ez;
    public int eA;
    public int eB;
    public int eC;
    public static int eD;
    public final int[] eE;
    public int[] eF;
    public int[] eG;
    public int[] eH;
    public int[] eI;
    public int[] eJ;
    private f_0[] mW;
    public f_0[] eK;
    public f_0[] eL;
    private f_0[] mX;
    private static int mY;
    private int mZ;
    private int na;
    private int nb;
    private int nc;
    private int nd;
    public static boolean eM;
    public long eN;
    public int eO;
    public boolean eP;
    private static int ne;
    private int nf;
    public String eQ;
    private f_0 ng;
    public static rs.a.k eR;
    private final String[] nh;
    private final boolean[] ni;
    public final int[][][] eS;
    public static final int[] eT;
    public int eU;
    private int nj;
    public int eV;
    private static int nk;
    public int eW;
    private int nl;
    private int nm;
    private String nn;
    private f_0[] no;
    private boolean np;
    public static int eX;
    private rs.l.a nq;
    private rs.l.a nr;
    private rs.l.a ns;
    private rs.l.a nt;
    private rs.l.a nu;
    public int eY;
    public boolean eZ;
    public f_0[] fa;
    private boolean nv;
    private rs.l.a[] nw;
    public static boolean fb;
    private int nx;
    private static int ny;
    public boolean fc;
    public boolean fd;
    private boolean nz;
    private boolean nA;
    public boolean fe;
    public static int ff;
    public static double fg;
    private static final String nB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    private int nC;
    private rs.q.b nD;
    private int nE;
    public int fh;
    private int nF;
    public int fi;
    public int fj;
    private long nG;
    public String fk;
    public String fl;
    public String fm;
    public static String fn;
    private static int nH;
    private boolean nI;
    private final int[] nJ = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    private int nK;
    private rs.h nL;
    public int[] fo;
    public int[] fp;
    public int[] fq;
    public byte[][] fr;
    public int fs;
    public int ft;
    private int nM;
    private int nN;
    private static int nO;
    public int fu;
    private int[] nP;
    private int[] nQ;
    public static rs.x.e fv;
    private int nR;
    private int nS;
    public f_0 fw;
    private rs.l.a nT;
    private f_0 nU;
    public String[] fx;
    private f_0 nV;
    private f_0 nW;
    public final int[] fy;
    public static final int[] fz;
    private static boolean nX;
    private final int[] nY;
    private int nZ;
    private int oa;
    private int ob;
    public static int fA;
    public String fB;
    private int oc;
    public int[][][] fC;
    private long od;
    public int fD;
    public static f_0[] fE;
    public f_0 fF;
    public f_0 fG;
    public f_0 fH;
    public f_0 fI;
    public f_0 fJ;
    public f_0 fK;
    private long oe;
    public static int fL;
    private int of;
    public static boolean fM;
    public int fN;
    private int og;
    private static int oh;
    private int oi;
    private boolean oj;
    public final int[] fO;
    public f[] fP;
    public static int[] fQ;
    private boolean ok;
    public int[] fR;
    public int[] fS;
    public int[] fT;
    private int ol;
    private int om;
    public final int fU = 100;
    private final int[] on;
    private final int[] oo;
    private boolean op;
    private int oq;
    public int fV;
    public int fW;
    public int fX;
    public byte[][] fY;
    public int fZ;
    private int or;
    private final int[] os;
    private final int[] ot;
    private int ou;
    private final boolean ov;
    private int ow;
    private int ox;
    public boolean ga;
    public boolean gb;
    private int oy;
    public byte[][][] gc;
    private int oz;
    public int gd;
    public int ge;
    private f_0 oA;
    private int oB;
    public static int gf;
    public static int gg;
    private String oC;
    private String oD;
    private int oE;
    private int oF;
    private rs.l.k_0 oG;
    private rs.l.k_0 oH;
    public static rs.l.k_0 gh;
    public rs.l.k_0 gi;
    public static rs.l.k_0 gj;
    public rs.l.k_0 gk;
    public static rs.l.h gl;
    public rs.l.h gm;
    public rs.l.h gn;
    public rs.l.h go;
    private int oI;
    public int gp;
    public int gq;
    private int oJ;
    private int[] oK;
    private int[] oL;
    public int gr;
    public int gs;
    public int gt;
    private int oM;
    private String oN;
    public int gu;
    public int gv;
    public int gw;
    public int gx;
    private static int oO;
    private int oP;
    public int gy = 0;
    public static int gz;
    public long gA;
    public long gB;
    public static double gC;
    public static double gD;
    public static final int gE = 128;
    public static final int gF = 383;
    public static final int gG = 512;
    public int gH = 1;
    private static boolean oQ;
    private static double oR;
    private static Dimension oS;
    private static Dimension oT;

    public void a(boolean bl) {
        File file = new File(rs.v.a.f() + "rsimg/");
        file.mkdir();
        file = new File(rs.v.a.f() + "rsimg/dump/");
        file.mkdir();
        int[] nArray = new int[]{13072, 13073};
        for (int i2 = 10000; i2 < 30000; ++i2) {
            Image image;
            rs.d.k k2 = rs.d.k.f(i2);
            if (k2 == null || k2.w == null || k2.w.equalsIgnoreCase("Dwarf remains") || (image = rs.d.k.a(i2, 0)) == null) continue;
            Client.a(image, bl ? rs.d.k.f((int)i2).w : Integer.toString(i2));
        }
    }

    public void a(int n2) {
        File file = new File(rs.v.a.f() + "rsimg/");
        file.mkdir();
        file = new File(rs.v.a.f() + "rsimg/dump/");
        file.mkdir();
        rs.d.k k2 = rs.d.k.f(n2);
        if (k2 == null || k2.w == null || k2.w.equalsIgnoreCase("Dwarf remains")) {
            return;
        }
        Image image = rs.d.k.a(n2, 0);
        if (image != null) {
            Client.a(image, Integer.toString(n2));
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            File[] fileArray;
            for (File file2 : fileArray = file.listFiles()) {
                if (file2.isDirectory()) {
                    Client.a(file2);
                    continue;
                }
                file2.delete();
            }
            file.delete();
        }
    }

    public static void a(Image image, String string) {
        BufferedImage bufferedImage = Client.a(image);
        try {
            File file = new File("./rsimg/" + string + ".png");
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static int a(int n2, int n3) {
        if (n2 >= 2940 && n2 <= 3390 && n3 >= 3521 && n3 <= 3972) {
            return (int)Math.ceil((double)(n3 - 3520) / 8.0);
        }
        return 0;
    }

    public void a(int n2, int n3, String object, String string, String string2, int[] nArray) {
        int n4;
        int n5;
        int n6;
        if (rs.c_0.hP == -1 || rs.c_0.hP == -1) {
            return;
        }
        if (object == null) {
            return;
        }
        if (ch && cH != rs.n.c.ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
            ap = "::wikiarticle " + string;
            this.jr = System.currentTimeMillis();
            this.ij = System.currentTimeMillis();
        }
        object = (String)object + "\nPress @or2@CTRL@whi@ " + string2;
        int n7 = 3;
        Object object2 = object;
        object = (String)object2 + "\n";
        String[] stringArray = ((String)object).split("\n");
        int n8 = stringArray.length * 16 + 3 + 35;
        int n9 = 0;
        String string3 = stringArray[0].replace("@gre@", "").replace("@whi@", "").replace("@cya@", "").replace("@or1@", "").replace("@or2@", "").replace("@or3@", "").replace("@yel@", "");
        n9 = (int)Math.floor(gl.c(string3)) + 20;
        for (n6 = 1; n6 < stringArray.length; ++n6) {
            if (n9 > gl.c(stringArray[n6].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6) continue;
            n9 = gl.c(stringArray[n6].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6;
        }
        n7 = n9 / 40;
        if (n7 < 3) {
            n7 = 3;
        }
        if (n9 < (n6 = n7 * 40 + 18)) {
            n9 = n6;
        }
        if (rs.f.a.ai == a.c.a && cH == 3824 && hQ <= 112) {
            n3 = hQ + n8 + 10;
            n2 = hP - 10;
        }
        int n10 = n3 -= n8;
        if ((n2 -= n9 / 2) < 5) {
            n2 = 5;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        rs.l.c.b(n8, n3, n2, 4077096, n9, 200);
        if (this.il == null || !this.ip.equals(object) || System.currentTimeMillis() - this.in >= 200L) {
            this.il = new f_0[n7];
            this.im = new int[n7];
            if (this.io >= nArray.length) {
                this.io = 1;
            }
            n5 = this.io;
            for (n4 = 0; n4 < n7; ++n4) {
                if (n5 >= nArray.length) {
                    n5 = 0;
                }
                this.il[n4] = rs.d.k.a(nArray[n5], 0, 0, 32);
                this.im[n4] = nArray[n5];
                ++n5;
            }
            this.ip = object;
            ++this.io;
            this.in = System.currentTimeMillis();
        }
        this.aU.c(n2 + n9 - 14, n3 + 3);
        n3 += 14;
        n5 = 0xFFFFFF;
        for (n4 = 0; n4 < stringArray.length; ++n4) {
            if (n4 == 0) {
                gl.b(stringArray[n4], n2, n3, n5, 0);
            } else {
                gl.b(" " + stringArray[n4], n2, n3, 0xFFFFFF, 0);
            }
            n3 += 16;
        }
        rs.l.c.b(n8 - ((n3 -= 10) - n10), n3, n2, 2367511, n9, 100);
        if (this.il != null) {
            for (n4 = 0; n4 < this.il.length; ++n4) {
                if (this.il[n4] == null) {
                    this.il[n4] = rs.d.k.a(this.im[n4], 0, 0, 32);
                }
                if (this.il[n4] == null) continue;
                this.il[n4].f(17 + n2 + n4 * 35, n3);
            }
        }
        rs.l.c.d(n2, n9, n8, 5918522, n10);
        n4 = 1;
        rs.l.c.d(n2 - n4, n9 + n4 * 2, n8 + n4 * 2, 2367511, n10 - n4);
    }

    public void a(int n2, int n3, String object, String string) {
        if (rs.c_0.hP == -1 || rs.c_0.hP == -1) {
            return;
        }
        if (object == null) {
            return;
        }
        if (!rs.s.s.b.o) {
            return;
        }
        if (ch && cH != rs.n.c.ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
            ap = "::wikiarticle " + string;
            this.jr = System.currentTimeMillis();
            this.ij = System.currentTimeMillis();
        }
        object = (String)object + (ch ? "\nLoading, please wait.." : "\nPress @or2@CTRL@whi@ to view guide");
        this.ik = string;
        rs.l.f.a.j.a a2 = new rs.l.f.a.j.a((String)object, true);
        a2.b(true);
        rs.l.f.e.d().f().a(a2);
    }

    public void a(int n2, int n3, String string) {
        if (rs.c_0.hP == -1 || rs.c_0.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.l.f.e.d().f().a(string, true);
    }

    public void a(int n2, int n3, String string, String[] stringArray, boolean bl) {
        if (rs.c_0.hP == -1 || rs.c_0.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.l.f.a.j.a a2 = new rs.l.f.a.j.a(string, true);
        a2.a(stringArray);
        rs.l.f.e.d().f().a(a2);
    }

    public q_0 a(int n2, int n3, int n4, int n5) {
        h_0 h_02 = this.dF.i[n4][n2][n3];
        if (h_02 == null) {
            return null;
        }
        if (h_02.j != null && h_02.j.m == n5) {
            return h_02.j;
        }
        if (h_02.k != null && h_02.k.m == n5) {
            return h_02.k;
        }
        if (h_02.l != null && h_02.l.m == n5) {
            return h_02.l;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            if (h_02.o[i2].m != n5) continue;
            return h_02.o[i2];
        }
        return null;
    }

    public void b(int n2, int n3, String string) {
        if (this.bj && (rs.c_0.hP == -1 || rs.c_0.hP == -1)) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.l.f.e.d().f().a(string, true);
    }

    public void a(int n2, int n3, String string, int[] nArray) {
        if (rs.c_0.hP == -1 || rs.c_0.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.l.f.a.j.a a2 = new rs.l.f.a.j.a(string, true);
        a2.a(nArray);
        rs.l.f.e.d().f().a(a2);
    }

    public static BufferedImage a(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8 = this.bl - 6;
        int n9 = this.bm - 6;
        int n10 = n2 - n8 * 8;
        int n11 = n3 - n9 * 8;
        int n12 = 10;
        int n13 = this.nJ[n12];
        if (n11 > 0 && n11 < 103 && n10 > 0 && n10 < 103) {
            if (Client.b(n2, n3, n7)) {
                this.a(-1, -1, n5, n13, n11, n6, n7, n10, 0);
            } else {
                this.a(-1, n4, n5, n13, n11, n6, n7, n10, 0, bl);
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(n2, n3, n4, n5, n6, n7, false);
    }

    public void a() {
        rs.x.f f2 = this.a(3, "interface", "interface", this.eE[3], 35);
        rs.x.f f3 = this.a(4, "2d graphics", "media", this.eE[4], 40);
        rs.l.k_0[] k_0Array = new rs.l.k_0[]{gh, this.gi, gj, this.gk};
        rs.n.e.a(f2, k_0Array, f3);
        fb = true;
    }

    public void b() {
        int n2;
        for (int i2 = 0; i2 < rs.d.k.y.length; ++i2) {
            rs.d.k.y[i2] = new rs.d.k();
        }
        rs.d.a.a = rs.f.a.aj ? rs.d.a.c : rs.d.a.b;
        rs.a.h.a(ew.j(), ew);
        rs.x.f f2 = this.a(2, "config", "config", this.eE[2], 30);
        rs.d.d.z = new rs.d.d[20];
        for (n2 = 0; n2 < 20; ++n2) {
            rs.d.d.z[n2] = new rs.d.d();
        }
        rs.d.r.J.a();
        rs.d.r.K.a();
        rs.d.r.L.a();
        rs.d.r.M.a();
        rs.d.r.N.a();
        rs.d.r.O.a();
        rs.n.e.n.a();
        rs.n.e.aO.a();
        rs.d.k.k.a();
        rs.d.k.l.a();
        rs.a.k.v();
        rs.d.d.M.a();
        rs.d.d.N.a();
        rs.d.x.p.a();
        rs.d.x.q.a();
        rs.d.d.z = new rs.d.d[20];
        for (n2 = 0; n2 < 20; ++n2) {
            rs.d.d.z[n2] = new rs.d.d();
        }
        rs.d.k.a(f2, rs.f.a.aj);
        rs.d.j.a(f2);
        if (Client.eR.aT != null) {
            Client.eR.aT = rs.d.d.c(Client.eR.ay);
        }
        for (n2 = 0; n2 < this.cB; ++n2) {
            rs.a.j j2 = this.cA[this.cC[n2]];
            if (j2.aG == null) continue;
            j2.aG = rs.d.d.c((int)j2.aG.x);
        }
        ee = 1;
        fb = true;
    }

    public long c() {
        if (this.eN == 0L) {
            return 0L;
        }
        long l2 = this.eN - System.currentTimeMillis();
        return l2 < 0L ? 0L : l2;
    }

    public void d() {
        this.b(false);
    }

    public void b(boolean bl) {
        rs.x.f f2;
        int n2;
        for (n2 = 0; n2 < rs.d.k.y.length; ++n2) {
            rs.d.k.y[n2] = new rs.d.k();
        }
        if (!rs.f.a.bs) {
            rs.d.a.a = rs.f.a.aj ? rs.d.a.c : rs.d.a.b;
        }
        rs.a.h.a(ew.j(), ew);
        if (this.cd && (f2 = this.a(2, "config", "config", this.eE[2], 30)) != null) {
            rs.d.k.a(f2, rs.f.a.aj);
            rs.d.j.a(f2);
        }
        rs.d.k.k.a();
        rs.d.k.l.a();
        rs.d.k.m.a();
        rs.d.k.j.a();
        rs.a.k.v();
        rs.d.d.M.a();
        rs.d.d.N.a();
        rs.d.x.p.a();
        rs.d.x.q.a();
        rs.d.d.z = new rs.d.d[20];
        for (n2 = 0; n2 < 20; ++n2) {
            rs.d.d.z[n2] = new rs.d.d();
        }
        if (eR != null && Client.eR.aT != null) {
            Client.eR.aT = rs.d.d.c(Client.eR.ay);
        }
        for (n2 = 0; n2 < this.cB; ++n2) {
            rs.a.j j2 = this.cA[this.cC[n2]];
            if (j2.aG == null) continue;
            j2.aG = rs.d.d.c((int)j2.aG.x);
        }
        if (this.cc) {
            ee = 1;
            fb = true;
        }
    }

    public void c(boolean bl) {
        File[] fileArray;
        File file = new File(rs.v.a.f() + "raw/");
        if (!file.exists()) {
            return;
        }
        for (File file2 : fileArray = new File(rs.v.a.f() + "raw/").listFiles()) {
            String string = file2.getName().replace(".dat", "");
            int n2 = Integer.parseInt(string);
            bn.a(n2, (Object)true);
        }
    }

    public static final byte[] a(String string) {
        try {
            File file = new File(string);
            int n2 = (int)file.length();
            byte[] byArray = new byte[n2];
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(string)));
            dataInputStream.readFully(byArray, 0, n2);
            dataInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void e() {
        rs.v.a.a.c();
    }

    private void a(boolean bl, double d2) {
        rs.v.a.a(d2);
        if (bl) {
            rs.v.a.j = "voladjust";
        }
    }

    public void a(int n2, boolean bl) {
        if (!this.nv) {
            return;
        }
        if (this.lh != n2 || bl) {
            this.oi = n2;
            this.oj = !bl;
            ew.a(2, this.oi);
        }
    }

    private boolean y(int n2) {
        if (n2 < 0) {
            return false;
        }
        int n3 = this.eI[n2];
        if (n3 >= 2000) {
            n3 -= 2000;
        }
        return n3 == 337;
    }

    public boolean f() {
        if (this.bw) {
            return true;
        }
        return this.cD != null || this.gb || this.fN > 0 && this.fN != 25 && this.fN != 31 || this.en != -1 || this.gp != -1;
    }

    public String b(String string) {
        return this.ix.c(this.iw.c(string));
    }

    public void g() {
        rs.l.q.a();
        int n2 = !Client.ai() ? 338 : ah - 165;
        e_0.x = this.fo;
        if (!this.f() && this.v.h()) {
            this.is.f(0, n2 + 136);
            if (Client.aj()) {
                this.it.f(0, n2);
            }
            this.v.b();
            e_0.x = this.fq;
            rs.l.q.b();
            return;
        }
        this.ir.f(0, n2);
        this.v.b();
        if (this.gb) {
            this.gn.c(this.eQ, 259, 60 + n2, 0, -1);
            this.gn.c(this.fB + "*", 259, 80 + n2, 128, -1);
        } else if (this.fN == 1) {
            this.gn.c(this.dW, 259, 60 + n2, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n2, 128, -1);
        } else if (this.fN == 2) {
            this.gn.c(this.dX, 259, 60 + n2, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n2, 128, -1);
        } else if (this.fN == 3) {
            this.gn.c("Enter the item's name (or part of it) to search:", 259, 60 + n2, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n2, 128, -1);
        } else if (this.fN == 4) {
            this.gn.c("Enter the amount you'd like to spawn:", 259, n2 + 60, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n2, 128, -1);
        } else if (this.fN == 6 && this.q.c() != null) {
            this.q.c().c().c(this.q.c().f(), 259, n2 + 60, 0, -1);
            this.q.c().d().c(this.q.c().c(this.dY) + "*", 259, 80 + n2, 128, -1);
        } else if (this.cD != null) {
            this.gn.c(this.cD, 259, 60 + n2, 0, -1);
            this.gn.c("Click to continue", 259, 80 + n2, 128, -1);
        } else if (this.gp != -1) {
            this.a(0, 20, rs.n.e.H[this.gp], 20 + n2);
            if (!(this.gp != 6179 || cH != ad_0.bI || rs.n.e.H[6181].at != null && rs.n.e.H[6181].at.contains("Unlocked!"))) {
                int n3 = 385;
                int n4 = 15;
                int n5 = 0;
                if (rs.f.a.ai == a.c.a) {
                    n5 = 340;
                }
                if (hP >= n3 && hP <= n3 + 120 && hQ >= n4 + n2 + n5 && hQ <= n4 + n2 + 34 + n5) {
                    ad_0.g.c(n3, n4 + n2);
                } else {
                    ad_0.f.c(n3, n4 + n2);
                }
                this.gm.c("        Purchase", n3 + 59, n4 + 21 + n2, 16750623, -1);
            }
        } else if ((double)this.en != -1.0) {
            this.a(0, 20, rs.n.e.H[this.en], 20 + n2);
        } else {
            int n6;
            int n7;
            int n8;
            rs.l.k_0 k_02 = this.gi;
            int n9 = 0;
            rs.l.c.c(122 + n2, 8, 497, 7 + n2);
            for (int i2 = 0; i2 < 200; ++i2) {
                int n10;
                if (this.dC[i2] == null) continue;
                n8 = this.dz[i2];
                n7 = this.dD[i2];
                String string = this.dB[i2];
                n6 = this.dA[i2];
                int n11 = 70 - (n9 - 3) * 14 + eD + 5;
                int n12 = 0;
                int n13 = 0;
                if (n6 == 18 || n6 == 1 || n6 == 9 || n6 == 28) {
                    n12 = 1;
                    n13 = -1;
                }
                if (n6 == 94) {
                    n13 = -1;
                }
                if (n8 == rs.i.a.j && (this.fi == rs.i.a.h || this.fi == rs.i.a.b) && (this.gx == rs.i.a.v || this.gx == rs.i.a.z && n7 == 0)) {
                    if (n11 > 0 && n11 < 210) {
                        this.gm.b(this.dC[i2], 11, n11 + n2, 0, -1);
                    }
                    ++n9;
                }
                if (n8 == rs.i.a.s && (this.fi == rs.i.a.i || this.fi == rs.i.a.b || this.fi == rs.i.a.h && n7 == 0) && (this.gv == rs.i.a.v || n7 == 0)) {
                    if (n11 > 0 && n11 < 210) {
                        this.gm.b(this.dC[i2], 11, n11 + n2, 0, -1);
                    }
                    ++n9;
                }
                if (!(n8 != rs.i.a.u || this.fi != rs.i.a.f && this.fi != rs.i.a.b || this.gw != rs.i.a.v && n7 != 0)) {
                    if (n11 > 0 && n11 < 210) {
                        this.gm.b(this.dC[i2], 11, n11 + n2, 0, -1);
                    }
                    ++n9;
                }
                if (!(n8 != rs.i.a.t || this.fi != rs.i.a.g && this.fi != rs.i.a.b || this.gy != rs.i.a.v && n7 != 0)) {
                    if (n11 > 0 && n11 < 210) {
                        this.gm.b(this.dC[i2], 11, n11 + n2, 0, -1);
                    }
                    ++n9;
                }
                if (!(n8 != rs.i.a.k && n8 != rs.i.a.l || this.gu != rs.i.a.v && (this.gu != rs.i.a.w || !this.i(string)) || this.fi != rs.i.a.c && this.fi != rs.i.a.b)) {
                    if (n11 > 0 && n11 < 210) {
                        n10 = 11;
                        if (n6 > 0 && n6 < fE.length) {
                            fE[rs.l.h.b(n6)].f(n10 + n13, n11 - 12 + n2 + n12);
                            n10 += 14;
                            if (rs.l.j.b.w_(n6)) {
                                n10 += ((rs.l.a.a)rs.l.j.b.b(n6)).j();
                            }
                        }
                        this.gm.b(string, n10, n11 + n2, 0, -1);
                        this.gm.b(":", n10 + this.gm.c(string), n11 + n2, 0, -1);
                        this.gm.b(this.dC[i2], n10 + this.gm.c(string) + 6, n11 + n2, 255, -1);
                    }
                    ++n9;
                }
                if (!(n8 != rs.i.a.p && n8 != rs.i.a.q || this.nS != 0 && this.fi != rs.i.a.d || n8 != rs.i.a.p && this.cE != 0 && (this.cE != 1 || !this.i(string)))) {
                    if (n11 > 0 && n11 < 210) {
                        n10 = 11;
                        k_02.b(0, "From", n11 + n2, n10);
                        n10 += k_02.a("From ");
                        if (n6 > 0 && n6 < fE.length) {
                            fE[rs.l.h.b(n6)].f(n10 + n13, n11 - 12 + n2 + n12);
                            n10 += 14;
                        }
                        k_02.b(0, string + ":", n11 + n2, n10);
                        k_02.b(0x800000, this.dC[i2], n11 + n2, n10 += k_02.a(string) + 8);
                    }
                    ++n9;
                }
                if (n8 == rs.i.a.o && (this.nS == 0 || this.fi == 2) && this.cE < 2) {
                    if (n11 > 0 && n11 < 210) {
                        k_02.b(0, "To " + string + ":", n11 + n2, 11);
                        k_02.b(0x800000, this.dC[i2], n11 + n2, 17 + k_02.a("To " + string));
                    }
                    ++n9;
                }
                if (n8 == rs.i.a.m && this.nS == 0 && this.cE < 2) {
                    if (n11 > 0 && n11 < 210) {
                        k_02.b(0x800000, this.dC[i2], n11 + n2, 11);
                    }
                    ++n9;
                }
                if (n8 == rs.i.a.n && (this.fZ == 0 || this.fZ == 1 && this.i(string))) {
                    if (n11 > 0 && n11 < 210) {
                        this.gm.b(string + " " + this.dC[i2], 11, n11 + n2, 0x800080, -1);
                    }
                    ++n9;
                }
                if (n8 != rs.i.a.r || this.fZ != 0 && (this.fZ != 1 || !this.i(string))) continue;
                if (n11 > 0 && n11 < 210) {
                    k_02.b(8270336, string + " " + this.dC[i2], n11 + n2, 11);
                }
                ++n9;
            }
            this.gZ.a();
            fA = n9 * 14 + 7;
            if (fA < 111) {
                fA = 111;
            }
            this.b(114, fA - eD - 113, 7 + n2, 496, fA);
            String string = eR != null && eR.o() != null ? eR.d(true) : o_0.c(this.fk);
            rs.l.c.c(140 + n2, 8, 509, 120 + n2);
            n8 = 0;
            if (cT > 0) {
                n7 = 0;
                int n14 = cT;
                if (cT == 1) {
                    n14 = 0;
                }
                if (cT == 2) {
                    n14 = 1;
                }
                n6 = 0;
                if (n14 == 94) {
                    n6 = -1;
                }
                if (rs.l.j.b.w_(n14)) {
                    n6 += ((rs.l.a.a)rs.l.j.b.b(n14)).i();
                    n7 += ((rs.l.a.a)rs.l.j.b.b(n14)).h();
                }
                fE[rs.l.h.b(n14)].f(10 + n7, 122 + n2 + n6);
                if (rs.l.j.b.w_(n14)) {
                    n8 += ((rs.l.a.a)rs.l.j.b.b(n14)).j();
                }
                n8 += 14;
            }
            int n15 = (n7 = 0) != 0 ? 0 : -1;
            this.gm.b(string, n8 + 11, 133 + n2, n7 != 0 ? 0xFFFFFF : 0, n15);
            this.gm.b(":", n8 + 11 + this.gm.c(string), 133 + n2, n7 != 0 ? 0xFFFFFF : 0, n15);
            if (this.dl != null) {
                this.gm.b(this.dl, n8 + 11 + this.gm.c(string) + 6, 133 + n2, 0, n15);
            } else {
                this.gm.b(dk, n8 + 11 + this.gm.c(string) + 6, 133 + n2, n7 != 0 ? 0xFFFFFF : 255, n15);
                this.gm.b("*", n8 + 11 + this.gm.c(string) + 6 + 1 + this.gm.c(dk), 133 + n2, n7 != 0 ? 0xFFFFFF : 255, n15);
            }
            rs.l.c.b(7, 121 + n2, 506, n7 != 0 ? 0x575757 : 8418912);
            this.gZ.a();
        }
        e_0.x = this.fq;
        rs.l.q.b();
    }

    @Override
    public void init() {
        try {
            dK = 10;
            dL = 0;
            Client.aa();
            dM = true;
            rs.v.a.d = 32;
            rs.v.a.a(InetAddress.getLocalHost());
            this.n(503, 765);
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public void a(Runnable runnable, int n2) {
        if (n2 > 10) {
            n2 = 10;
        }
        if (rs.v.a.h != null) {
            rs.v.a.a(runnable, n2);
        } else {
            super.a(runnable, n2);
        }
    }

    public Socket b(int n2) {
        return new Socket(InetAddress.getByName(rs.f.a.j), n2);
    }

    public void a(a.c c2) {
        oT = null;
        if (c2 == a.c.a) {
            ai = 765;
            ah = 503;
            boolean bl = rs.k.e.a() && this.az();
            int n2 = bl ? rs.k.b.g : 765;
            int n3 = bl ? rs.k.b.h : 503;
            SwingUtilities.invokeLater(() -> {
                Launcher.n().p().a(n2, n3);
                Launcher.n().p().m().pack();
            });
            al = 600;
        } else if (c2 == a.c.b) {
            ai = 821;
            ah = 624;
            SwingUtilities.invokeLater(() -> {
                Launcher.n().p().a(1198, 624, 821, 624);
                Launcher.n().p().m().repaint();
            });
            al = 300;
        } else if (c2 == a.c.c) {
            ai = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            ah = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            al = 600;
        }
        this.a(c2, ai, ah);
    }

    public void a(a.c c2, int n2, int n3) {
        try {
            aj = c2 == a.c.a ? 512 : n2;
            ak = c2 == a.c.a ? 334 : n3;
            ai = n2;
            ah = n3;
            this.a(c2 == a.c.c, n2, n3, c2 == a.c.b, c2 != a.c.a);
            this.i();
            this.j();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void h() {
        if (rs.f.a.ai != a.c.a) {
            int n2 = this.B().getWidth();
            int n3 = this.B().getHeight();
            if (n2 < 1) {
                n2 = 1;
            }
            if (n3 < 1) {
                n3 = 1;
            }
            if (ai != n2 || ah != n3) {
                if (ai != n2) {
                    aj = ai = n2;
                }
                if (ah != n3) {
                    ak = ah = n3;
                }
                this.hG = null;
                this.i();
                this.j();
                this.repaint();
                if (Launcher.e()) {
                    Launcher.n().a(30);
                }
                rs.n.d.a();
                oT = null;
            }
        }
    }

    @Override
    public void i() {
        int n2 = ai;
        int n3 = ah;
        e_0.a(n2, n3);
        this.bx = e_0.x;
        this.fo = e_0.x;
        this.fp = e_0.x;
        e_0.x = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            e_0.x[i2] = n2 * i2;
        }
        this.fq = e_0.x;
        if (this.fc) {
            this.gZ = new rs.l.c_0(this.av(), this.aw(), this.B());
        }
    }

    @Override
    public void j() {
        if (Client.aj()) {
            ak = this.v != null && this.v.h() ? 469 : 334;
        }
        e_0.s = this.at() / 2;
        e_0.t = this.as() / 2;
        if (!rs.k.e.a()) {
            rs.v_0.d(500, 800, aj, ak);
        }
    }

    public static void a(rs.r.a a2) {
        by[a2.d().w()].b().add(a2);
    }

    private void bm() {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.eA != 0) {
            return;
        }
        int n6 = this.hU;
        if (n6 == 1 && rs.l.q.a(this, this.hV, this.hW)) {
            return;
        }
        if (rs.f.a.ai == a.c.a && this.eW == 1 && this.hV >= 516 && this.hW >= 160 && this.hV <= 765 && this.hW <= 205) {
            n6 = 0;
        }
        if ((cH == 35000 || this.gp == 35112) && br != 35062 && n6 == 1 && br != 35079) {
            rs.n.c.ai.m(-1);
        }
        if (cH == ad_0.bI && n6 == 1) {
            n5 = 385;
            n4 = 15;
            n3 = rs.f.a.ai == a.c.a ? 0 : ah - 165;
            n2 = 0;
            if (rs.f.a.ai == a.c.a) {
                n2 = 340;
            }
            if (hP >= n5 && hP <= n5 + 120 && hQ >= n4 + n3 + n2 && hQ <= n4 + n3 + 34 + n2) {
                fv.a(185);
                fv.d(65313);
            }
        }
        if (dj) {
            if (n6 != 1) {
                n5 = rs.c_0.hP;
                n4 = rs.c_0.hQ;
                if (this.dH == 0) {
                    n5 -= 4;
                    n4 -= 4;
                }
                if (this.dH == 1) {
                    n5 -= 553;
                    n4 -= 205;
                }
                if (this.dH == 2) {
                    n5 -= 5;
                    n4 -= 338;
                }
                if (this.dH == 3) {
                    n5 -= 516;
                    n4 += 0;
                }
                if (n5 < this.lc - 10 || n5 > this.lc + this.dI + 10 || n4 < this.ld - 10 || n4 > this.ld + this.dJ + 10) {
                    n3 = 0;
                    if (this.r.b()) {
                        n3 = this.r.c().a() ? 1 : 0;
                    }
                    if (n3 == 0) {
                        dj = false;
                        this.r.a();
                        if (this.dH == 1) {
                            fb = true;
                        }
                        if (this.dH == 2) {
                            fM = true;
                        }
                    }
                }
            }
            if (n6 == 1) {
                rs.j.b.b b2;
                n5 = this.lc;
                n4 = this.ld;
                n3 = this.dI;
                n2 = this.hV;
                int n7 = this.hW;
                switch (this.dH) {
                    case 0: {
                        n2 -= 4;
                        n7 -= 4;
                        break;
                    }
                    case 1: {
                        n2 -= 519;
                        n7 -= 168;
                        break;
                    }
                    case 2: {
                        n2 -= 5;
                        n7 -= 338;
                        break;
                    }
                    case 3: {
                        n2 -= 519;
                        n7 += 0;
                    }
                }
                int n8 = -1;
                for (int i2 = 0; i2 < this.eV; ++i2) {
                    int n9 = n4 + 31 + (this.eV - 1 - i2) * 15;
                    if (n2 <= n5 || n2 >= n5 + n3 || n7 <= n9 - 13 || n7 >= n9 + 3) continue;
                    n8 = i2;
                }
                if (n8 != -1) {
                    this.D(n8);
                } else if (this.r.b() && this.r.c().a() && (b2 = this.r.c().b()) != null) {
                    b2.b().invoke();
                }
                dj = false;
                if (this.dH == 1) {
                    fb = true;
                }
                if (this.dH == 2) {
                    fM = true;
                }
            }
            return;
        }
        if (n6 == 1 && this.eV > 0 && ((n5 = this.eI[this.eV - 1]) == 632 || n5 == 78 || n5 == 867 || n5 == 431 || n5 == 53 || n5 == 74 || n5 == 454 || n5 == 539 || n5 == 638 || n5 == 493 || n5 == 847 || n5 == 447 || n5 == 1125)) {
            int n10;
            int n11;
            n4 = this.eF[this.eV - 1];
            n3 = this.eG[this.eV - 1];
            rs.n.e e2 = rs.n.e.H[n3];
            if (ch && this.fx[4] != null && this.fx[4].startsWith("Check") && this.fx[4].endsWith("ooting bag")) {
                this.D(4);
                return;
            }
            if (rs.f.a.aC && ag && !rs.s.l.c.b) {
                n11 = 0;
                n10 = 0;
                for (int i3 = 0; i3 < this.fx.length; ++i3) {
                    if (this.fx[i3] == null || !this.fx[i3].contains("Drop") && !this.fx[i3].contains("Destroy") && !this.fx[i3].contains("Release") || cH == 23000) continue;
                    n11 = 1;
                    n10 = i3;
                    break;
                }
                if (n11 != 0) {
                    this.D(n10);
                    return;
                }
            }
            if (e2.aF || e2.ag) {
                if (this.hS) {
                    this.iN = this.hX;
                    this.iO = n6;
                    this.iP.a(this, this.eV - 1);
                    this.iQ = true;
                }
                this.op = false;
                this.dT = 0;
                this.ex = n3;
                this.ey = n4;
                n11 = rs.f.a.ai == a.c.b ? ai / 2 - 356 : 0;
                int n12 = n10 = rs.f.a.ai == a.c.b ? ah / 2 - 230 : 0;
                if (rs.c_0.hP >= 28 + n11 && rs.c_0.hP <= 74 + n11) {
                    this.mV = 0;
                }
                if (rs.c_0.hP >= 75 + n11 && rs.c_0.hP <= 121 + n11) {
                    this.mV = 1;
                }
                if (rs.c_0.hP >= 122 + n11 && rs.c_0.hP <= 168 + n11) {
                    this.mV = 2;
                }
                if (rs.c_0.hP >= 169 + n11 && rs.c_0.hP <= 215 + n11) {
                    this.mV = 3;
                }
                if (rs.c_0.hP >= 216 + n11 && rs.c_0.hP <= 262 + n11) {
                    this.mV = 4;
                }
                if (rs.c_0.hP >= 263 + n11 && rs.c_0.hP <= 309 + n11) {
                    this.mV = 5;
                }
                if (rs.c_0.hP >= 310 + n11 && rs.c_0.hP <= 356 + n11) {
                    this.mV = 6;
                }
                if (rs.c_0.hP >= 357 + n11 && rs.c_0.hP <= 403 + n11) {
                    this.mV = 7;
                }
                if (rs.c_0.hP >= 404 + n11 && rs.c_0.hP <= 450 + n11) {
                    this.mV = 8;
                }
                this.eA = 2;
                this.eB = this.hV;
                this.eC = this.hW;
                if (rs.n.e.H[n3].ah == cH) {
                    this.eA = 1;
                }
                if (rs.n.e.H[n3].ah == this.gp) {
                    this.eA = 3;
                }
                return;
            }
        }
        if (n6 == 1 && (this.ow == 1 || this.y(this.eV - 1)) && this.eV > 2) {
            n6 = 2;
        }
        if (n6 == 1 && this.eV > 0) {
            this.D(this.eV - 1);
        }
        if (n6 == 2 && this.eV > 0) {
            n5 = 0;
            if (this.eV - 1 >= 0 && this.eV - 1 <= this.fx.length - 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
                n4 = br + 5;
                if (br == 64036) {
                    n4 = 70002;
                }
                if (n4 >= 70000 && n4 <= 70600 && rs.n.c.af.e.get(n4) != null) {
                    this.iS = rs.n.c.af.e.get(n4).b();
                    ap = "::tabitem " + String.valueOf(this.iS) + " 1";
                    n5 = 1;
                }
            }
            if (n5 == 0) {
                this.bK();
            }
        }
        if (!this.E() && !rs.l.b.a.b()) {
            this.bD();
        }
        this.n();
    }

    private void a(boolean bl, byte[] byArray) {
        rs.v.a.l = bl ? 1 : 0;
        rs.v.a.b(byArray, byArray.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(int n2) {
        boolean bl = false;
        if (Client.ew.g.g().a_(n2)) {
            System.out.println("Dumping OSRS map region " + n2 + "..");
            bl = true;
            if (rs.d.h.a != h.a.c) {
                rs.d.h.a(h.a.c);
                rs.d.t.a(h.a.c);
            }
            if (rs.d.r.E != r.a.d) {
                rs.d.r.a(r.a.d);
            }
        } else {
            System.out.println("Dumping standard map region " + n2 + "..");
            if (Arrays.asList(this.d).contains(new Integer(n2))) {
                if (rs.d.r.E != r.a.b) {
                    rs.d.r.a(r.a.b);
                }
            } else if (rs.d.r.E != r.a.a) {
                rs.d.r.a(r.a.a);
            }
        }
        boolean bl2 = false;
        block3: for (int i2 = 0; i2 < 10000; ++i2) {
            for (int i3 = 0; i3 < 10000; ++i3) {
                int n3 = i2 >> 6;
                int n4 = i3 >> 6;
                int n5 = n3 * 256 + n4;
                if (n5 == n2) {
                    for (int i4 = -30; i4 <= 30; i4 += 10) {
                        for (int i5 = -30; i5 <= 30; i5 += 10) {
                            rs.cache.osrs.c.a(bl);
                            try {
                                this.a(i2 + i4, i3 + i5, n2);
                                continue;
                            }
                            finally {
                                rs.cache.osrs.c.a(false);
                            }
                        }
                    }
                    bl2 = true;
                    continue block3;
                }
                if (bl2) continue block3;
            }
        }
        rs.cache.osrs.c.a(false);
    }

    public void a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        this.bX = true;
        this.dR = -1;
        this.et.f();
        this.ea.f();
        e_0.g();
        this.m();
        this.dF.b();
        System.gc();
        int n12 = n2 / 8;
        int n13 = n3 / 8;
        int n14 = (n12 - 6) * 8;
        int n15 = (n13 - 6) * 8;
        for (n11 = 0; n11 < 4; ++n11) {
            for (n10 = 0; n10 < 104; ++n10) {
                for (n9 = 0; n9 < 104; ++n9) {
                    this.gc[n11][n10][n9] = 0;
                }
            }
        }
        for (n11 = 0; n11 < 4; ++n11) {
            this.fP[n11].a();
        }
        x x2 = new x(this.gc, this.fC);
        n10 = 62;
        n9 = 0;
        for (n8 = (n12 - 6) / 8; n8 <= (n12 + 6) / 8; ++n8) {
            for (n7 = (n13 - 6) / 8; n7 <= (n13 + 6) / 8; ++n7) {
                ++n9;
            }
        }
        this.fr = new byte[n9][];
        this.fY = new byte[n9][];
        this.fR = new int[n9];
        this.fS = new int[n9];
        this.fT = new int[n9];
        n8 = this.fr.length;
        n9 = 0;
        for (n7 = (n12 - 6) / 8; n7 <= (n12 + 6) / 8; ++n7) {
            for (n6 = (n13 - 6) / 8; n6 <= (n13 + 6) / 8; ++n6) {
                int n16;
                this.fR[n9] = (n7 << 8) + n6;
                this.fS[n9] = ew.b(0, n6, n7);
                n5 = this.fS[n9];
                if (n5 != -1) {
                    ew.a(3, n5);
                }
                if ((n16 = (this.fT[n9] = ew.b(1, n6, n7))) != -1) {
                    ew.a(3, n16);
                }
                ++n9;
            }
        }
        while (ew.g() != 0) {
            this.s();
        }
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = (this.fR[n7] >> 8) * 64 - n14;
            n5 = (this.fR[n7] & 0xFF) * 64 - n15;
            byte[] byArray = this.fr[n7];
            if (byArray == null) continue;
            x2.a(byArray, n6, n5, (n12 - 6) * 8, (n13 - 6) * 8, this.fP);
        }
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = (this.fR[n7] >> 8) * n10 - n14;
            n5 = (this.fR[n7] & 0xFF) * n10 - n15;
            byte[] byArray = this.fr[n7];
            if (byArray != null || n13 >= 800) continue;
            x2.a(n5, 64, 64, n6);
        }
        if (++mY > 160) {
            mY = 0;
        }
        for (n7 = 0; n7 < n8; ++n7) {
            byte[] byArray = this.fY[n7];
            if (byArray == null) continue;
            n5 = (this.fR[n7] >> 8) * 64 - n14;
            int n17 = (this.fR[n7] & 0xFF) * 64 - n15;
            x2.a(n5, this.fP, n17, this.dF, byArray);
        }
        x2.a(this.fP, this.dF);
        n7 = 104;
        int n18 = 104;
        for (n5 = 0; n5 < 4; ++n5) {
            int[][] nArray = this.fP[n5].a;
            for (int i2 = 0; i2 < n7; ++i2) {
                for (int i3 = 0; i3 < n18; ++i3) {
                    int n19 = n14 + i2;
                    int n20 = n19 >> 6;
                    int n21 = n15 + i3;
                    int n22 = n21 >> 6;
                    int n23 = n20 * 256 + n22;
                    if (n23 != n4 || this.c(n2, n3, n19, n21)) continue;
                    String string = rs.e.a(n19, n21, n5);
                    boolean bl = false;
                    boolean bl2 = false;
                    if (nArray[i2][i3] != 0 && rs.x.d.get(string) != null) {
                        int n24 = rs.x.d.get(string);
                        r r2 = rs.d.r.c(n24);
                        bl = r2.ag;
                        bl2 = true;
                    }
                    rs.e.a(n19, n21, n5, nArray[i2][i3], bl);
                }
            }
        }
    }

    private boolean c(int n2, int n3, int n4, int n5) {
        int n6 = n2 - (n4 / 8 - 6) * 8;
        int n7 = n3 - (n5 / 8 - 6) * 8;
        return n6 < 16 || n6 >= 88 || n7 < 16 || n7 >= 88;
    }

    public static boolean b(int n2, int n3, int n4) {
        if (bC == -1) {
            return false;
        }
        if (n4 != dw) {
            return false;
        }
        if (bC != W) {
            return false;
        }
        return n2 < bE || n2 > bG || n3 < bF || n3 > bH;
    }

    public static void k() {
        bD = false;
        bC = -1;
        bE = 0;
        bF = 0;
        bG = 0;
        bH = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void l() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        try {
            int n8;
            int n9;
            this.dR = -1;
            this.et.f();
            this.ea.f();
            e_0.g();
            this.m();
            this.dF.b();
            GameStateChanged gameStateChanged = new GameStateChanged();
            gameStateChanged.setGameState(rs.runelite.a.c.f);
            this.p.post(gameStateChanged);
            System.gc();
            for (n9 = 0; n9 < 4; ++n9) {
                this.fP[n9].a();
            }
            for (n9 = 0; n9 < 4; ++n9) {
                for (n7 = 0; n7 < 104; ++n7) {
                    for (n6 = 0; n6 < 104; ++n6) {
                        this.gc[n9][n7][n6] = 0;
                    }
                }
            }
            x x2 = new x(this.gc, this.fC);
            n7 = this.fr.length;
            n6 = 62;
            for (n5 = 0; n5 < n7; ++n5) {
                for (n8 = 0; n8 < 2000; ++n8) {
                    if (this.fR[n5] != this.bz[n8]) continue;
                    this.fS[n5] = this.bA[n8];
                    this.fT[n5] = this.bB[n8];
                }
            }
            fv.a(0);
            if (!this.nA) {
                byte[] byArray;
                for (n5 = 0; n5 < n7; ++n5) {
                    n8 = (this.fR[n5] >> 8) * 64 - eh;
                    n4 = (this.fR[n5] & 0xFF) * 64 - ei;
                    byArray = this.fr[n5];
                    try {
                        if (byArray == null) continue;
                        x2.a(byArray, n8, n4, (this.mx - 6) * 8, (this.my - 6) * 8, this.fP);
                        continue;
                    }
                    catch (Exception exception) {
                        if (!rs.f.a.f.booleanValue()) continue;
                        exception.printStackTrace();
                    }
                }
                for (n5 = 0; n5 < n7; ++n5) {
                    n8 = (this.fR[n5] >> 8) * n6 - eh;
                    n4 = (this.fR[n5] & 0xFF) * n6 - ei;
                    byArray = this.fr[n5];
                    if (byArray != null || this.my >= 800) continue;
                    x2.a(n4, 64, 64, n8);
                }
                if (++mY > 160) {
                    mY = 0;
                }
                fv.a(0);
                for (n5 = 0; n5 < n7; ++n5) {
                    byte[] byArray2 = this.fY[n5];
                    if (byArray2 == null) continue;
                    n4 = (this.fR[n5] >> 8) * 64 - eh;
                    int n10 = (this.fR[n5] & 0xFF) * 64 - ei;
                    try {
                        x2.a(n4, this.fP, n10, this.dF, byArray2);
                        continue;
                    }
                    catch (Exception exception) {
                        if (!rs.f.a.f.booleanValue()) continue;
                        exception.printStackTrace();
                    }
                }
            }
            if (this.nA) {
                int n11;
                int n12;
                int n13;
                int n14;
                for (n5 = 0; n5 < 4; ++n5) {
                    for (int i2 = 0; i2 < 13; ++i2) {
                        block20: for (n4 = 0; n4 < 13; ++n4) {
                            int n15 = this.eS[n5][i2][n4];
                            if (n15 == -1) continue;
                            int n16 = n15 >> 24 & 3;
                            n3 = n15 >> 1 & 3;
                            n14 = n15 >> 14 & 0x3FF;
                            n13 = n15 >> 3 & 0x7FF;
                            n12 = (n14 / 8 << 8) + n13 / 8;
                            for (n11 = 0; n11 < this.fR.length; ++n11) {
                                if (this.fR[n11] != n12 || this.fr[n11] == null) continue;
                                x2.a(n16, n3, this.fP, i2 * 8, (n14 & 7) * 8, this.fr[n11], (n13 & 7) * 8, n5, n4 * 8);
                                continue block20;
                            }
                        }
                    }
                }
                for (n5 = 0; n5 < 13; ++n5) {
                    for (int i3 = 0; i3 < 13; ++i3) {
                        n4 = this.eS[0][n5][i3];
                        if (n4 != -1) continue;
                        x2.a(i3 * 8, 8, 8, n5 * 8);
                    }
                }
                fv.a(0);
                for (n5 = 0; n5 < 4; ++n5) {
                    for (int i4 = 0; i4 < 13; ++i4) {
                        block26: for (n4 = 0; n4 < 13; ++n4) {
                            int n17 = this.eS[n5][i4][n4];
                            if (n17 == -1) continue;
                            int n18 = n17 >> 24 & 3;
                            n3 = n17 >> 1 & 3;
                            n14 = n17 >> 14 & 0x3FF;
                            n13 = n17 >> 3 & 0x7FF;
                            n12 = (n14 / 8 << 8) + n13 / 8;
                            for (n11 = 0; n11 < this.fR.length; ++n11) {
                                if (this.fR[n11] != n12 || this.fY[n11] == null) continue;
                                x2.a(this.fP, this.dF, n18, i4 * 8, (n13 & 7) * 8, n5, this.fY[n11], (n14 & 7) * 8, n3, n4 * 8);
                                continue block26;
                            }
                        }
                    }
                }
            }
            fv.a(0);
            x2.a(this.fP, this.dF);
            fv.a(0);
            n5 = rs.x.g;
            if (n5 > dw) {
                n5 = dw;
            }
            if (n5 < dw - 1) {
                n5 = dw - 1;
            }
            if (li) {
                this.dF.a(rs.x.g);
            } else {
                this.dF.a(0);
            }
            for (n2 = 0; n2 < 104; ++n2) {
                for (n4 = 0; n4 < 104; ++n4) {
                    this.o(n2, n4);
                }
            }
            if (++mn > 98) {
                mn = 0;
                fv.a(150);
            }
            this.bA();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        j_0.a();
        rs.d.r.J.a();
        rs.d.r.L.a();
        rs.d.r.M.a();
        rs.d.r.N.a();
        rs.d.r.O.a();
        if (this.hH != null) {
            fv.a(210);
            fv.g(1057001181);
        }
        System.gc();
        e_0.h();
        ew.d();
        int n19 = (this.mx - 6) / 8 - 1;
        int n20 = (this.mx + 6) / 8 + 1;
        n7 = (this.my - 6) / 8 - 1;
        n6 = (this.my + 6) / 8 + 1;
        if (this.np) {
            n19 = 49;
            n20 = 50;
            n7 = 49;
            n6 = 50;
        }
        try {
            for (n5 = n19; n5 <= n20; ++n5) {
                for (n2 = n7; n2 <= n6; ++n2) {
                    int n21;
                    if (n5 != n19 && n5 != n20 && n2 != n7 && n2 != n6) continue;
                    n4 = (n5 << 8) + n2;
                    if (ek != null && !Client.ew.g.a(n4, ek)) continue;
                    boolean bl = rs.cache.osrs.c.a();
                    if (Client.ew.g.g().a_(n4)) {
                        rs.cache.osrs.c.a(true);
                    }
                    if ((n21 = ew.b(0, n2, n5)) != -1) {
                        ew.b(n21, 3);
                    }
                    if ((n3 = ew.b(1, n2, n5)) != -1) {
                        ew.b(n3, 3);
                    }
                    rs.cache.osrs.c.a(bl);
                }
            }
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (rs.k.e.a()) {
            this.a.i();
        }
        if (bD) {
            Client.k();
        }
    }

    public void m() {
        j_0.a();
        rs.d.r.J.a();
        rs.d.r.K.a();
        rs.d.r.L.a();
        rs.d.r.M.a();
        rs.d.r.N.a();
        rs.d.r.O.a();
        rs.d.d.M.a();
        rs.d.d.N.a();
        rs.d.k.l.a();
        rs.d.k.m.a();
        rs.d.k.j.a();
        rs.d.k.k.a();
        rs.a.k.v();
        rs.d.x.p.a();
        rs.d.x.q.a();
    }

    private void z(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int[] nArray = this.aT.m;
        int n7 = nArray.length;
        for (n6 = 0; n6 < n7; ++n6) {
            nArray[n6] = 0;
        }
        for (n6 = 1; n6 < 103; ++n6) {
            n5 = 24628 + (103 - n6) * 512 * 4;
            for (n4 = 1; n4 < 103; ++n4) {
                if ((this.gc[n2][n4][n6] & 0x18) == 0) {
                    this.dF.a(nArray, n5, n2, n4, n6);
                }
                if (n2 < 3 && (this.gc[n2 + 1][n4][n6] & 8) != 0) {
                    this.dF.a(nArray, n5, n2 + 1, n4, n6);
                }
                n5 += 4;
            }
        }
        n6 = 0xFFFFFF;
        n5 = 0xEE0000;
        this.aT.d();
        for (n4 = 1; n4 < 103; ++n4) {
            for (n3 = 1; n3 < 103; ++n3) {
                if ((this.gc[n2][n3][n4] & 0x18) == 0) {
                    this.d(n4, n6, n3, n5, n2);
                }
                if (n2 >= 3 || (this.gc[n2 + 1][n3][n4] & 8) == 0) continue;
                this.d(n4, n6, n3, n5, n2 + 1);
            }
        }
        this.gZ.a();
        this.mz = 0;
        for (n4 = 0; n4 < 104; ++n4) {
            for (n3 = 0; n3 < 104; ++n3) {
                int n8 = this.dF.g(dw, n4, n3);
                if (n8 == 0) continue;
                n8 = n8 >> 14 & Short.MAX_VALUE;
                int n9 = rs.d.r.c((int)n8).V;
                if (n9 < 0 || n9 == 39) continue;
                int n10 = n4;
                int n11 = n3;
                this.no[this.mz] = this.me[n9];
                this.mA[this.mz] = n10;
                this.mB[this.mz] = n11;
                ++this.mz;
            }
        }
    }

    public static int d(int n2) {
        if (n2 < 0) {
            n2 = 0;
        }
        return iA.nextInt(n2 + 1);
    }

    private void o(int n2, int n3) {
        rs.h h2 = this.jH[dw][n2][n3];
        if (h2 == null) {
            this.dF.l(dw, n2, n3);
            return;
        }
        long l2 = -99999999L;
        boolean bl = false;
        rs.a.g g2 = null;
        rs.a.g g3 = null;
        rs.a.g g4 = null;
        rs.a.g g5 = (rs.a.g)h2.b();
        while (g5 != null) {
            rs.d.k k2 = rs.d.k.f(g5.h);
            long l3 = k2.f;
            if (k2.C) {
                l3 *= (long)(g5.k + 1);
            }
            if (l3 > l2) {
                l2 = l3;
                g2 = g5;
            }
            g5 = (rs.a.g)h2.d();
        }
        h2.b(g2);
        g5 = (rs.a.g)h2.b();
        while (g5 != null) {
            if (g5.h != g2.h && g3 == null) {
                g3 = g5;
            }
            if (g5.h != g2.h && g5.h != g3.h && g4 == null) {
                g4 = g5;
            }
            g5 = (rs.a.g)h2.d();
        }
        int n4 = n2 + (n3 << 7) + 0x60000000;
        this.dF.a(n2, n4, g3, this.c(dw, n3 * 128 + 64, n2 * 128 + 64), g4, g2, dw, n3);
    }

    public void d(boolean bl) {
        for (int i2 = 0; i2 < this.cB; ++i2) {
            int n2;
            int n3;
            int n4;
            rs.a.j j2 = this.cA[this.cC[i2]];
            int n5 = 0x20000000 + (this.cC[i2] << 14);
            if (j2 == null || !j2.l() || j2.aG.K != bl) continue;
            int n6 = j2.ac >> 7;
            int n7 = j2.ad >> 7;
            if (n6 < 0 || n6 >= 104 || n7 < 0 || n7 >= 104 || !bl && (n4 = ((n3 = eh + (j2.ac - 6 >> 7)) >> 6) * 256 + ((n2 = ei + (j2.ad - 6 >> 7)) >> 6)) == 10806 && this.if.get(n3 + "," + n2) != null) continue;
            if (j2.S == 1 && (j2.ac & 0x7F) == 64 && (j2.ad & 0x7F) == 64) {
                if (this.kS[n6][n7] == gf) continue;
                this.kS[n6][n7] = gf;
            }
            if (!j2.aG.C) {
                n5 -= Integer.MIN_VALUE;
            }
            this.dF.a(dw, j2.ae, this.c(dw, j2.ad, j2.ac), n5, j2.ad, (j2.S - 1) * 64 + 60, j2.ac, j2, j2.T);
        }
    }

    private boolean bn() {
        return rs.v.a.h();
    }

    private void bo() {
        String string = "ondemand";
        System.out.println(string);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + string + ".html"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        while (true) {
            try {
                while (true) {
                    Thread.sleep(1000L);
                }
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
    }

    public int e(int n2) {
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 1; i2 <= n2; ++i2) {
            n3 = (int)((double)n3 + Math.floor((double)i2 + 300.0 * Math.pow(2.0, (double)i2 / 7.0)));
            if (i2 >= n2) {
                return n4;
            }
            n4 = (int)Math.floor(n3 / 4);
        }
        return 0;
    }

    private void A(int n2) {
        if (n2 <= 0) {
            return;
        }
        rs.d.k k2 = rs.d.k.f(n2);
        if (k2 == null) {
            return;
        }
        if (k2.F > 0 && k2.p > 0) {
            n2 = k2.F;
            k2 = rs.d.k.f(n2);
        }
        this.ez = n2;
        if (k2 == null) {
            return;
        }
        if (k2.L == null) {
            return;
        }
        boolean bl = false;
        for (String string : k2.L) {
            if (string == null || !string.toLowerCase().contains("equip") && !string.toLowerCase().contains("wear") && !string.toLowerCase().contains("wield")) continue;
            bl = true;
            break;
        }
        if (bl || n2 == 21739) {
            this.jq = n2;
            this.jt = k2.w;
        }
    }

    private void a(int n2, rs.n.e e2, int n3, int n4, int n5, int n6) {
        int n7;
        if (e2 == null) {
            return;
        }
        if (e2.aI != 0 || e2.al == null || e2.aQ) {
            return;
        }
        int n8 = !Client.ai() ? 4 : 0;
        int n9 = n7 = !Client.ai() ? 4 : 0;
        if (n3 < n2 || n5 < n4 || n3 > n2 + e2.P || n5 > n4 + e2.aR) {
            return;
        }
        int n10 = e2.al.length;
        for (int i2 = 0; i2 < n10; ++i2) {
            int n11;
            int n12;
            int n13;
            int n14 = e2.am[i2] + n2 - (Client.ai() ? 0 : -2);
            int n15 = e2.bc[i2] + n4 - n6;
            rs.n.e e3 = rs.n.e.H[e2.al[i2]];
            if (e3 == null) break;
            if (!e3.bf || e3.aw == 32431 && e3 instanceof rs.n.a.a.b && ((rs.n.a.a.b)e3).i() != i2) continue;
            if (cI != -1 && e3.bA != cI && e3.aw != cI) {
                if (e3.aI != 0) continue;
                this.a(n14, e3, n3, n15, n5, e3.V - (Client.ai() ? 0 : -4));
                if (e3.aH <= e3.aR) continue;
                this.a(n14 + e3.P, e3.aR, n3, n5, e3, n15, true, e3.aH);
                continue;
            }
            if ((e3.aw == 40603 || e3.aw == 40604) && rs.n.e.H[40602].at.equalsIgnoreCase("Hunger games loot chest") || !this.j(e3.aw)) continue;
            if (e3.aw >= 62150 && e3.aw <= 62152 && n3 >= (n14 += e3.aJ) && n5 >= (n15 += e3.aP)) {
                this.iB = true;
            }
            if (rs.n.b.a.b.b().w_(e3.aw)) {
                n13 = e3.P;
                n12 = e3.aR;
                int n16 = n14;
                n11 = n15;
                if (e3.aI == 4) {
                    n13 = e3.ao.a(e3.at);
                    n11 -= 5;
                    if (e3.S) {
                        n16 -= n13 / 2;
                    }
                }
                if (n3 >= n16 && n5 >= n11 && n3 < n16 + n13 && n5 < n11 + n12 + 5) {
                    rs.n.b.a.b.a(e3.aw);
                }
            }
            if ((e3.ab >= 0 || e3.L != 0 || e3.bz) && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR + 5) {
                if (e3.aw >= 47115 && e3.aw < 47330 && e3.aw % 5 == 0) {
                    this.A(rs.n.e.H[e3.aw + 1].af);
                    this.fx[this.eV] = "View row " + rs.n.e.H[e3.aw + 2].at;
                    this.eI[this.eV] = 1126;
                    this.eG[this.eV] = 1;
                    ++this.eV;
                    this.a(rs.n.e.H[e3.aw + 1].af, this.fx[this.eV - 1], false);
                }
                if (rs.n.c.ab.bT && cH == 47500 && e3.aw >= 47505 && e3.aw <= 47704) {
                    return;
                }
                if (e3.bn && e3.aw != 65757 && e3.aw != 65804 && e3.aw != 65776 && e3.aw != 65778 && e3.aw != 56057 && e3.aw != 49987 && e3.aw != 65765 && e3.aw != 65780 && e3.aw != 55791 && e3.aw != 47009 && e3.aw != 47005 && e3.aw != 55790 && e3.aw != 60607 && e3.aw != 61022 && e3.aw != 61023 && e3.aw != 61018 && e3.aw != 61019 && e3.aw != 60271 && e3.aw != 60272 && e3.aw != 47813 && e3.aw != 47815 && e3.aw != 61084 && e3.aw != 61089 && e3.aw != 61094 && e3.aw != 61199 && e3.aw != 52012 && e3.aw != 61104 && e3.aw != 905 && e3.aw != 947 && e3.aw != 39978 && e3.aw != 951 && e3.aw != 63052 && e3.aw != 16018 && e3.aw != 52009 && e3.aw != 55027 && e3.aw != 55028 && e3.aw != 57222) {
                    if (e3.ab >= 0) {
                        if (!(!rs.f.a.aW && e3.ab == 18555 || e3.ab >= 18050 && e3.ab <= 18104 && e3.ab % 2 == 0)) {
                            this.ks = e3.ab;
                        }
                    } else {
                        this.ks = e3.aw;
                    }
                }
            }
            if (e3.bn) {
                if (e3.aI == 5 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR + 5) {
                    br = e3.aw;
                }
                if (e3.aI == 10 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR + 5) {
                    br = e3.aw;
                }
            }
            if (e3.aI == 0) {
                this.a(n14, e3, n3, n15, n5, e3.V - (Client.ai() ? 0 : -4));
                if (e3.aH <= e3.aR) continue;
                this.a(n14 + e3.P, e3.aR, n3, n5, e3, n15, true, e3.aH);
                continue;
            }
            if (e3.M == 1 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR + 5) {
                n13 = 0;
                if (e3.J != 0) {
                    n13 = this.d(e3) ? 1 : 0;
                }
                if (n13 == 0) {
                    if (e3.aw == 30162 || e3.aw == 7455 || e3.aw == 13095) {
                        this.fx[this.eV] = rs.f.a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                        this.eI[this.eV] = 647;
                        this.eG[this.eV] = e3.aw;
                        ++this.eV;
                    }
                    this.fx[this.eV] = e3.Q;
                    this.eI[this.eV] = 315;
                    this.eG[this.eV] = e3.aw;
                    if (e3.Q != null && e3.Q.equalsIgnoreCase("Select this market listing") && rs.n.e.H[e2.al[i2] + 3] != null) {
                        rs.n.e e4 = rs.n.e.H[e2.al[i2] + 3];
                        if (e4.af > 0) {
                            rs.d.k k2 = rs.d.k.f(e4.af);
                            this.fx[this.eV] = "Purchase listing @lre@" + k2.w;
                            this.a(e4.af, this.fx[this.eV], false);
                        }
                    }
                    ++this.eV;
                }
            }
            if (e3.M == 2 && this.eW == 0 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR) {
                String string = e3.R;
                if (string.indexOf(" ") != -1) {
                    string = string.substring(0, string.indexOf(" "));
                }
                this.fx[this.eV] = string + " @gre@" + e3.N;
                this.eI[this.eV] = 626;
                this.eG[this.eV] = e3.aw;
                ++this.eV;
            }
            if (e3.M == 3 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR) {
                this.fx[this.eV] = "Close";
                this.eI[this.eV] = 200;
                this.eG[this.eV] = e3.aw;
                ++this.eV;
            }
            if (e3.M == 4 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR) {
                this.fx[this.eV] = e3.Q;
                this.eI[this.eV] = 169;
                this.eG[this.eV] = e3.aw;
                ++this.eV;
                if (e3.k != null) {
                    // empty if block
                }
            }
            if (e3.M == 5 && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR) {
                if (e3.aw == 30162 || e3.aw == 7455 || e3.aw == 13095) {
                    this.fx[this.eV] = rs.f.a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                    this.eI[this.eV] = 647;
                    this.eG[this.eV] = e3.aw;
                    ++this.eV;
                }
                this.fx[this.eV] = e3.Q;
                this.eI[this.eV] = 646;
                this.eG[this.eV] = e3.aw;
                ++this.eV;
            }
            if (e3.M == 6 && !this.eZ && n3 >= n14 && n5 >= n15 && n3 < n14 + e3.P && n5 < n15 + e3.aR) {
                this.fx[this.eV] = e3.Q;
                this.eI[this.eV] = 679;
                this.eG[this.eV] = e3.aw;
                ++this.eV;
            }
            if (n3 >= n14 && n5 >= n15 && n3 < n14 + (e3.aI == 4 ? 100 : e3.P) && n5 < n15 + e3.aR && e3.W != null && (e3.aI == 4 && e3.at.length() > 0 || e3.aI == 5)) {
                for (int i3 = e3.W.length - 1; i3 >= 0; --i3) {
                    if (e3.W[i3] == null) continue;
                    this.fx[this.eV] = e3.W[i3] + (String)(e3.aI == 4 ? " " + e3.at : "");
                    this.eI[this.eV] = 647;
                    this.eF[this.eV] = i3;
                    this.eG[this.eV] = e3.aw;
                    ++this.eV;
                }
            }
            if (e3.aI != 2) continue;
            int n17 = 0;
            for (n12 = 0; n12 < e3.aR; ++n12) {
                for (int i4 = 0; i4 < e3.P; ++i4) {
                    n11 = n14 + i4 * (32 + e3.ac);
                    int n18 = n15 + n12 * (32 + e3.ap);
                    if (n17 < 20) {
                        n11 += e3.K[n17];
                        n18 += e3.as[n17];
                    }
                    if (n3 >= n11 && n5 >= n18 && n3 < n11 + 32 && n5 < n18 + 32) {
                        this.mv = n17;
                        this.mw = e3.aw;
                        if (e3.az[n17] > 0) {
                            rs.d.k k3 = rs.d.k.f(e3.az[n17] - 1);
                            if (this.gr == 1 && e3.av) {
                                if (e3.aw != this.gt || n17 != this.gs) {
                                    this.fx[this.eV] = "Use " + this.oN + " with @lre@" + k3.w;
                                    this.eI[this.eV] = 870;
                                    this.eJ[this.eV] = k3.i;
                                    this.eF[this.eV] = n17;
                                    this.eG[this.eV] = e3.aw;
                                    ++this.eV;
                                }
                            } else if (this.eW == 1 && e3.av) {
                                if ((this.nm & 0x10) == 16) {
                                    this.fx[this.eV] = this.nn + " @lre@" + k3.w;
                                    this.eI[this.eV] = 543;
                                    this.eJ[this.eV] = k3.i;
                                    this.eF[this.eV] = n17;
                                    this.eG[this.eV] = e3.aw;
                                    ++this.eV;
                                }
                            } else {
                                int n19;
                                if (e3.av) {
                                    for (n19 = 4; n19 >= 3; --n19) {
                                        if (k3.L != null && k3.L[n19] != null) {
                                            this.fx[this.eV] = k3.L[n19] + " @lre@" + k3.w;
                                            if (n19 == 3) {
                                                this.eI[this.eV] = 493;
                                            }
                                            if (n19 == 4) {
                                                this.eI[this.eV] = 847;
                                            }
                                            this.eJ[this.eV] = k3.i;
                                            this.eF[this.eV] = n17;
                                            this.eG[this.eV] = e3.aw;
                                            ++this.eV;
                                            continue;
                                        }
                                        if (n19 != 4) continue;
                                        this.fx[this.eV] = "Drop @lre@" + k3.w;
                                        this.eI[this.eV] = 847;
                                        this.eJ[this.eV] = k3.i;
                                        this.eF[this.eV] = n17;
                                        this.eG[this.eV] = e3.aw;
                                        ++this.eV;
                                    }
                                }
                                if (e3.an) {
                                    this.fx[this.eV] = "Use @lre@" + k3.w;
                                    this.eI[this.eV] = 447;
                                    this.eJ[this.eV] = k3.i;
                                    this.eF[this.eV] = n17;
                                    this.eG[this.eV] = e3.aw;
                                    ++this.eV;
                                }
                                if (e3.av && k3.L != null) {
                                    for (n19 = 2; n19 >= 0; --n19) {
                                        if (k3.L[n19] == null) continue;
                                        this.fx[this.eV] = k3.L[n19] + " @lre@" + k3.w;
                                        if (n19 == 0) {
                                            this.eI[this.eV] = k3.L[n19].toLowerCase().contains("wear") || k3.L[n19].toLowerCase().contains("wield") || k3.L[n19].toLowerCase().contains("equip") ? 454 : 74;
                                        }
                                        if (n19 == 1) {
                                            this.eI[this.eV] = 454;
                                        }
                                        if (n19 == 2) {
                                            this.eI[this.eV] = 539;
                                        }
                                        this.eJ[this.eV] = k3.i;
                                        this.eF[this.eV] = n17;
                                        this.eG[this.eV] = e3.aw;
                                        ++this.eV;
                                    }
                                }
                                if (e3.W != null) {
                                    if (e3.ah == 5292 && cH == 23000 && (e3.aw < 10335 || e3.aw > 10342)) {
                                        if (e3.ax[n17] == 0) {
                                            e3.W = rs.n.c.h.bJ;
                                        } else if (e3.aw < 10335 || e3.aw > 10342) {
                                            e3.W = k3.i == 995 ? rs.n.c.h.bL : rs.n.c.h.bK;
                                        }
                                    }
                                    if (e3.aw == 2006) {
                                        for (n19 = 0; n19 <= 1; ++n19) {
                                            if (k3 == null || k3.L == null || k3.L[n19] == null) continue;
                                            this.fx[this.eV] = k3.L[n19] + " @lre@" + k3.w;
                                            this.eJ[this.eV] = k3.i;
                                            this.eF[this.eV] = n17;
                                            this.eG[this.eV] = e3.aw;
                                            this.eI[this.eV] = k3.L[n19].toLowerCase().contains("wear") || k3.L[n19].toLowerCase().contains("wield") || k3.L[n19].toLowerCase().contains("equip") ? 454 : 74;
                                            ++this.eV;
                                        }
                                        if (k3.i == 995 || k3.i == 20693) {
                                            this.fx[this.eV] = k3.L[3] + " @lre@" + k3.w;
                                            this.eJ[this.eV] = k3.i;
                                            this.eF[this.eV] = n17;
                                            this.eG[this.eV] = e3.aw;
                                            this.eI[this.eV] = 493;
                                            ++this.eV;
                                        }
                                    }
                                    for (n19 = 6; n19 >= 0; --n19) {
                                        if (n19 > e3.W.length - 1 || e3.W[n19] == null) continue;
                                        this.fx[this.eV] = e3.W[n19] + " @lre@" + k3.w;
                                        if (n19 == 0) {
                                            this.eI[this.eV] = 632;
                                        }
                                        if (n19 == 1) {
                                            this.eI[this.eV] = 78;
                                        }
                                        if (n19 == 2) {
                                            this.eI[this.eV] = 867;
                                        }
                                        if (n19 == 3) {
                                            this.eI[this.eV] = 431;
                                        }
                                        if (n19 == 4) {
                                            this.eI[this.eV] = 53;
                                        }
                                        if (e3.ah == 3824 && n19 == 5) {
                                            this.eI[this.eV] = 638;
                                        }
                                        if (e3.ah == 5292) {
                                            if (e3.W.length < 7) {
                                                if (n19 == 5) {
                                                    this.eI[this.eV] = 291;
                                                }
                                            } else {
                                                if (n19 == 5) {
                                                    this.eI[this.eV] = 300;
                                                }
                                                if (n19 == 6) {
                                                    this.eI[this.eV] = 291;
                                                }
                                            }
                                        }
                                        this.eJ[this.eV] = k3.i;
                                        this.eF[this.eV] = n17;
                                        this.eG[this.eV] = e3.aw;
                                        ++this.eV;
                                    }
                                }
                                this.fx[this.eV] = rs.f.a.c() && cH == -1 && rs.s.c.c.d ? "<img=191> @mag@Colors @lre@" + k3.w : "Examine @lre@" + k3.w;
                                this.eI[this.eV] = 1125;
                                this.eJ[this.eV] = k3.i;
                                this.eF[this.eV] = n17;
                                this.eG[this.eV] = e3.aw;
                                ++this.eV;
                                this.A(k3.i);
                            }
                        }
                    }
                    ++n17;
                }
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        this.lX.f(n5, n4);
        this.lY.f(n5, n4 + n2 - 16);
        rs.l.c.e(n5, n4 + 16, 16, n2 - 32, 1);
        rs.l.c.e(n5, n4 + 16, 15, n2 - 32, 4011046);
        rs.l.c.e(n5, n4 + 16, 13, n2 - 32, 3419425);
        rs.l.c.e(n5, n4 + 16, 11, n2 - 32, 3024925);
        rs.l.c.e(n5, n4 + 16, 10, n2 - 32, 2696219);
        rs.l.c.e(n5, n4 + 16, 9, n2 - 32, 2433049);
        rs.l.c.e(n5, n4 + 16, 1, n2 - 32, 1);
        int n7 = (n2 - 32) * n2 / n6;
        if (n7 < 8) {
            n7 = 8;
        }
        int n8 = (n2 - 32 - n7) * n3 / (n6 - n2);
        rs.l.c.e(n5, n4 + 16 + n8, 16, n7, 5063219);
        rs.l.c.d(n4 + 16 + n8, 1, n7, n5);
        rs.l.c.d(n4 + 16 + n8, 8482897, n7, n5 + 1);
        rs.l.c.d(n4 + 16 + n8, 7562570, n7, n5 + 2);
        rs.l.c.d(n4 + 16 + n8, 6970435, n7, n5 + 3);
        rs.l.c.d(n4 + 16 + n8, 6970435, n7, n5 + 4);
        rs.l.c.d(n4 + 16 + n8, 6641729, n7, n5 + 5);
        rs.l.c.d(n4 + 16 + n8, 6641729, n7, n5 + 6);
        rs.l.c.d(n4 + 16 + n8, 6378814, n7, n5 + 7);
        rs.l.c.d(n4 + 16 + n8, 6378814, n7, n5 + 8);
        rs.l.c.d(n4 + 16 + n8, 6115644, n7, n5 + 9);
        rs.l.c.d(n4 + 16 + n8, 6115644, n7, n5 + 10);
        rs.l.c.d(n4 + 16 + n8, 5852730, n7, n5 + 11);
        rs.l.c.d(n4 + 16 + n8, 5852730, n7, n5 + 12);
        rs.l.c.d(n4 + 16 + n8, 5326389, n7, n5 + 13);
        rs.l.c.d(n4 + 16 + n8, 4931889, n7, n5 + 14);
        rs.l.c.b(n5, n4 + 16 + n8, 15, 1);
        rs.l.c.b(n5, n4 + 17 + n8, 15, 1);
        rs.l.c.b(n5, n4 + 17 + n8, 14, 6641729);
        rs.l.c.b(n5, n4 + 17 + n8, 13, 6970435);
        rs.l.c.b(n5, n4 + 17 + n8, 11, 7167816);
        rs.l.c.b(n5, n4 + 17 + n8, 10, 7562570);
        rs.l.c.b(n5, n4 + 17 + n8, 7, 7759947);
        rs.l.c.b(n5, n4 + 17 + n8, 5, 8088141);
        rs.l.c.b(n5, n4 + 17 + n8, 4, 8285776);
        rs.l.c.b(n5, n4 + 17 + n8, 3, 8482897);
        rs.l.c.b(n5, n4 + 17 + n8, 2, 1);
        rs.l.c.b(n5, n4 + 18 + n8, 16, 1);
        rs.l.c.b(n5, n4 + 18 + n8, 15, 5655352);
        rs.l.c.b(n5, n4 + 18 + n8, 14, 6115644);
        rs.l.c.b(n5, n4 + 18 + n8, 11, 6444608);
        rs.l.c.b(n5, n4 + 18 + n8, 10, 6641729);
        rs.l.c.b(n5, n4 + 18 + n8, 7, 6970435);
        rs.l.c.b(n5, n4 + 18 + n8, 5, 7233606);
        rs.l.c.b(n5, n4 + 18 + n8, 4, 7430727);
        rs.l.c.b(n5, n4 + 18 + n8, 3, 8088141);
        rs.l.c.b(n5, n4 + 18 + n8, 2, 8482897);
        rs.l.c.b(n5, n4 + 18 + n8, 1, 1);
        rs.l.c.b(n5, n4 + 19 + n8, 16, 1);
        rs.l.c.b(n5, n4 + 19 + n8, 15, 5326389);
        rs.l.c.b(n5, n4 + 19 + n8, 14, 5655352);
        rs.l.c.b(n5, n4 + 19 + n8, 11, 6115644);
        rs.l.c.b(n5, n4 + 19 + n8, 9, 6378814);
        rs.l.c.b(n5, n4 + 19 + n8, 7, 6641729);
        rs.l.c.b(n5, n4 + 19 + n8, 5, 6970435);
        rs.l.c.b(n5, n4 + 19 + n8, 4, 7233606);
        rs.l.c.b(n5, n4 + 19 + n8, 3, 7562570);
        rs.l.c.b(n5, n4 + 19 + n8, 2, 8482897);
        rs.l.c.b(n5, n4 + 19 + n8, 1, 1);
        rs.l.c.b(n5, n4 + 20 + n8, 16, 1);
        rs.l.c.b(n5, n4 + 20 + n8, 15, 4931889);
        rs.l.c.b(n5, n4 + 20 + n8, 14, 5523766);
        rs.l.c.b(n5, n4 + 20 + n8, 13, 5852730);
        rs.l.c.b(n5, n4 + 20 + n8, 10, 6115644);
        rs.l.c.b(n5, n4 + 20 + n8, 8, 6378814);
        rs.l.c.b(n5, n4 + 20 + n8, 6, 6641729);
        rs.l.c.b(n5, n4 + 20 + n8, 4, 6970435);
        rs.l.c.b(n5, n4 + 20 + n8, 3, 7562570);
        rs.l.c.b(n5, n4 + 20 + n8, 2, 8482897);
        rs.l.c.b(n5, n4 + 20 + n8, 1, 1);
        rs.l.c.d(n4 + 16 + n8, 1, n7, n5 + 15);
        rs.l.c.b(n5, n4 + 15 + n8 + n7, 16, 1);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 15, 1);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 14, 4142890);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 10, 4471853);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 9, 4734511);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 7, 4866095);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 4, 4931889);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 3, 5655352);
        rs.l.c.b(n5, n4 + 14 + n8 + n7, 2, 1);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 16, 1);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 15, 4471853);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 11, 4931889);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 9, 5326389);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 7, 5523766);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 6, 5655352);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 4, 5852730);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 3, 6444608);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 2, 6970435);
        rs.l.c.b(n5, n4 + 13 + n8 + n7, 1, 1);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 16, 1);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 15, 4471853);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 14, 4931889);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 12, 5523766);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 11, 5655352);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 10, 5852730);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 7, 6115644);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 4, 6378814);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 3, 7233606);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 2, 8088141);
        rs.l.c.b(n5, n4 + 12 + n8 + n7, 1, 1);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 16, 1);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 15, 4931889);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 14, 5326389);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 13, 5655352);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 11, 5852730);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 9, 6115644);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 7, 6378814);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 5, 6641729);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 4, 6970435);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 3, 7562570);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 2, 8088141);
        rs.l.c.b(n5, n4 + 11 + n8 + n7, 1, 1);
    }

    public void b(int n2, int n3, int n4, int n5, int n6) {
        this.a(n2, n3, n4, n5, n6);
    }

    private void a(rs.x.e e2, int n2) {
        int n3;
        this.jN = 0;
        this.kw = 0;
        this.e(e2);
        this.a(n2, e2);
        this.b(e2);
        for (n3 = 0; n3 < this.jN; ++n3) {
            int n4 = this.jO[n3];
            int n5 = 0x20000000 + (n4 << 14);
            if (!this.cA[n4].aG.C) {
                n5 -= Integer.MIN_VALUE;
            }
            if (this.cA[n4].P == ff) continue;
            this.cA[n4].aG = null;
            this.cA[n4] = null;
            rs.k.c.c.a(n5);
        }
        if (e2.h != n2) {
            rs.v.a.e(this.fk + " size mismatch in getnpcpos - pos:" + e2.h + " psize:" + n2);
            throw new RuntimeException("eek");
        }
        for (n3 = 0; n3 < this.cB; ++n3) {
            if (this.cA[this.cC[n3]] != null) continue;
            rs.v.a.e(this.fk + " null entry in npc list - pos:" + n3 + " size:" + this.cB);
            throw new RuntimeException("eek");
        }
    }

    public void n() {
        int n2;
        int n3 = n2 = rs.f.a.ai == a.c.a ? 0 : ah - 530;
        if (rs.c_0.hP >= 5 && rs.c_0.hP <= 61 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 71 && rs.c_0.hP <= 127 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 137 && rs.c_0.hP <= 193 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 203 && rs.c_0.hP <= 259 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 269 && rs.c_0.hP <= 325 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 335 && rs.c_0.hP <= 391 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else if (rs.c_0.hP >= 404 && rs.c_0.hP <= 515 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.ok = true;
            fM = true;
        } else {
            this.ok = true;
            fM = true;
        }
    }

    private void p(int n2, int n3) {
        if (n2 == 1) {
            if (n3 == 1) {
                e_0.b(0.9);
            }
            if (n3 == 2) {
                e_0.b(0.8);
            }
            if (n3 == 3) {
                e_0.b(0.7);
            }
            if (n3 == 4) {
                e_0.b(0.6);
            }
            rs.d.k.k.a();
            this.ga = true;
        }
        if (n2 == 2) {
            if (n3 == 1) {
                l_0.a(4);
                this.a(true, 0.0);
                this.nv = false;
            } else if (n3 == 2) {
                l_0.a(3);
                this.a(true, 0.25);
                this.nv = true;
            } else if (n3 == 3) {
                l_0.a(2);
                this.a(true, 0.5);
                this.nv = true;
            } else if (n3 == 4) {
                l_0.a(1);
                this.a(true, 0.75);
                this.nv = true;
            }
            rs.f.a.s = n3;
            rs.f.a.d();
        }
        if (n2 == 4) {
            rs.f.a.al = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[12466] != null) {
                this.dP[rs.n.e.H[12466].X[0][1]] = n3;
                rs.n.e.H[12466].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 3) {
            rs.f.a.ak = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[12464] != null) {
                this.dP[rs.n.e.H[12464].X[0][1]] = n3;
                rs.n.e.H[12464].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 5) {
            rs.f.a.ap = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[12468] != null) {
                this.dP[rs.n.e.H[12468].X[0][1]] = n3;
                rs.n.e.H[12468].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 6) {
            if (this.cY == 1) {
                this.cY = 2;
            }
            rs.f.a.aj = n3 == 1;
            rs.f.a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.n.e.H[915] != null) {
                this.dP[rs.n.e.H[915].X[0][1]] = n3;
                rs.n.e.H[915].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 8) {
            this.nS = n3;
            rs.f.a.bu = n3;
            fM = true;
            rs.f.a.d();
            if (rs.n.e.H[957] != null) {
                this.dP[rs.n.e.H[957].X[0][1]] = n3;
                rs.n.e.H[957].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 7) {
            fb = true;
        }
        if (n2 == 9) {
            this.kM = n3;
        }
        if (n2 == 10) {
            rs.f.a.ax = n3 == 1;
            int n4 = eh + (eh - 6 >> 7);
            int n5 = ei + (ei - 6 >> 7);
            int n6 = n4 >> 6;
            int n7 = n5 >> 6;
            int n8 = n6 * 256 + n7;
            if (!this.aC && n8 != 9023 && n8 != 9022 && n8 != 9023 && n8 != 9024 && n8 != 8767 && n8 != 9279 && c.get(n8) == null && c.get(W) == null) {
                boolean bl = rs.x.h = !rs.f.a.ax;
                if (this.fr != null && !this.bI) {
                    ee = 1;
                } else {
                    this.bI = false;
                }
            }
            rs.f.a.d();
            if (rs.n.e.H[12470] != null) {
                this.dP[rs.n.e.H[12470].X[0][1]] = n3;
                rs.n.e.H[12470].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 11) {
            rs.f.a.aw = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[12480] != null) {
                this.dP[rs.n.e.H[12480].X[0][1]] = n3;
                rs.n.e.H[12480].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 12) {
            rs.f.a.ay = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[12482] != null) {
                this.dP[rs.n.e.H[12482].X[0][1]] = n3;
                rs.n.e.H[12482].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 13) {
            if (rs.f.a.ah) {
                if (this.cc) {
                    this.a("<img=163> This feature is disabled in Lite mode!", 0, null);
                }
                rs.f.a.az = false;
                n3 = 0;
            } else {
                rs.f.a.az = n3 == 1;
                rs.f.a.d();
                if (this.cc) {
                    this.d();
                }
            }
            if (rs.n.e.H[39975] != null) {
                this.dP[rs.n.e.H[39975].X[0][1]] = n3;
                rs.n.e.H[39975].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 14) {
            rs.f.a.aA = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[39973] != null) {
                this.dP[rs.n.e.H[39973].X[0][1]] = n3;
                rs.n.e.H[39973].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 15) {
            rs.f.a.aB = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19099] != null) {
                this.dP[rs.n.e.H[19099].X[0][1]] = n3;
                rs.n.e.H[19099].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 16) {
            rs.f.a.aC = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19097] != null) {
                this.dP[rs.n.e.H[19097].X[0][1]] = n3;
                rs.n.e.H[19097].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 17) {
            rs.f.a.aE = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19095] != null) {
                this.dP[rs.n.e.H[19095].X[0][1]] = n3;
                rs.n.e.H[19095].I[0] = n3 == 0 ? 1 : 0;
                this.at = n3 == 0 ? "::newticks" : "::oldticks";
            }
            fb = true;
        }
        if (n2 == 18) {
            rs.f.a.aF = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19093] != null) {
                this.dP[rs.n.e.H[19093].X[0][1]] = n3;
                rs.n.e.H[19093].I[0] = n3 == 0 ? 1 : 0;
                this.at = n3 == 0 ? "::instantswitching" : "::queuedswitching";
            }
            fb = true;
        }
        if (n2 == 19) {
            rs.f.a.aG = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19091] != null) {
                this.dP[rs.n.e.H[19091].X[0][1]] = n3;
                rs.n.e.H[19091].I[0] = n3 == 0 ? 1 : 0;
                ah_0.i();
            }
            fb = true;
        }
        if (n2 == 20) {
            rs.f.a.aI = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19089] != null) {
                this.dP[rs.n.e.H[19089].X[0][1]] = n3;
                rs.n.e.H[19089].I[0] = n3 == 0 ? 1 : 0;
                ah_0.i();
            }
            fb = true;
        }
        if (n2 == 21) {
            rs.f.a.aJ = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19087] != null) {
                this.dP[rs.n.e.H[19087].X[0][1]] = n3;
                rs.n.e.H[19087].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 22) {
            if (rs.f.a.ai == a.c.b) {
                rs.f.a.ai = a.c.a;
                this.a(a.c.a);
            } else {
                rs.f.a.ai = a.c.b;
                this.a(a.c.b);
            }
            rs.f.a.d();
            if (rs.n.e.H[12472] != null) {
                this.dP[rs.n.e.H[12472].X[0][1]] = n3;
                rs.n.e.H[12472].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 23) {
            if (this.cc) {
                this.iC = System.currentTimeMillis();
            }
            if (rs.f.a.ah) {
                rs.f.a.a(false);
                if (this.cc) {
                    this.a("<img=163> Lite mode has been @red@disabled", 0, null);
                }
            } else {
                rs.f.a.a(true);
                if (this.cc) {
                    this.a("<img=163> Lite mode @blu@enabled.@bla@ Graphics have been lowered to increase performance..", 0, null);
                }
            }
            rs.f.a.d();
            if (rs.n.e.H[12474] != null) {
                this.dP[rs.n.e.H[12474].X[0][1]] = n3;
                int n9 = rs.n.e.H[12474].I[0] = n3 == 0 ? 1 : 0;
            }
            if (this.cc) {
                this.a(1, "Loading - please wait.", null);
                this.b();
                rs.x.f = dw;
                this.l();
                fv.a(121);
                if (rs.f.a.ah) {
                    this.cc = false;
                    rs.n.e.H[39974].at = "<str>Particle/glow effects</str>";
                    this.p(13, 0);
                    this.cc = true;
                } else {
                    rs.n.e.H[39974].at = "Particle/glow effects";
                }
            }
        }
        if (n2 == 24) {
            rs.f.a.aO = n3 == 1;
            rs.f.a.d();
            rs.v_0.a(rs.f.a.aO);
            if (rs.n.e.H[19085] != null) {
                this.dP[rs.n.e.H[19085].X[0][1]] = n3;
                rs.n.e.H[19085].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 25) {
            rs.f.a.aP = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19083] != null) {
                this.dP[rs.n.e.H[19083].X[0][1]] = n3;
                rs.n.e.H[19083].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 26) {
            rs.f.a.aQ = n3 == 1;
            rs.f.a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.n.e.H[19081] != null) {
                this.dP[rs.n.e.H[19081].X[0][1]] = n3;
                rs.n.e.H[19081].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 27) {
            rs.f.a.aT = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19079] != null) {
                this.dP[rs.n.e.H[19079].X[0][1]] = n3;
                rs.n.e.H[19079].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 28) {
            rs.f.a.aZ = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19077] != null) {
                this.dP[rs.n.e.H[19077].X[0][1]] = n3;
                rs.n.e.H[19077].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 29) {
            rs.f.a.bb = n3 == 1;
            rs.f.a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.n.e.H[19075] != null) {
                this.dP[rs.n.e.H[19075].X[0][1]] = n3;
                rs.n.e.H[19075].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 30) {
            rs.f.a.aK = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19073] != null) {
                this.dP[rs.n.e.H[19073].X[0][1]] = n3;
                rs.n.e.H[19073].I[0] = n3 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n2 == 31) {
            rs.f.a.aL = n3 == 1;
            rs.f.a.d();
            if (rs.n.e.H[19071] != null) {
                this.dP[rs.n.e.H[19071].X[0][1]] = n3;
                rs.n.e.H[19071].I[0] = n3 == 0 ? 1 : 0;
            }
        }
    }

    private void B(int n2) {
        int n3 = rs.d.z.a[n2].b;
        int n4 = this.dP[n2];
        if (n2 == 174) {
            n3 = 10;
        }
        if (n2 == 175) {
            n3 = 11;
        }
        if (n2 == 176) {
            n3 = 12;
        }
        if (n2 == 177) {
            n3 = 13;
        }
        if (n2 == 178) {
            n3 = 14;
        }
        if (n2 == 179) {
            n3 = 15;
        }
        if (n2 == 180) {
            n3 = 16;
        }
        if (n2 == 181) {
            n3 = 17;
        }
        if (n2 == 182) {
            n3 = 18;
        }
        if (n2 == 183) {
            n3 = 19;
        }
        if (n2 == 184) {
            n3 = 20;
        }
        if (n2 == 185) {
            n3 = 21;
        }
        if (n2 == 186) {
            n3 = 22;
        }
        if (n2 == 187) {
            n3 = 23;
        }
        if (n2 == 188) {
            n3 = 24;
        }
        if (n2 == 189) {
            n3 = 25;
        }
        if (n2 == 190) {
            n3 = 26;
        }
        if (n2 == 191) {
            n3 = 27;
        }
        if (n2 == 192) {
            n3 = 28;
        }
        if (n2 == 193) {
            n3 = 29;
        }
        if (n2 == 194) {
            n3 = 30;
        }
        if (n2 == 195) {
            n3 = 31;
        }
        this.p(n3, n4);
    }

    private void a(String string, rs.a.k k2, int n2, int n3) {
        if (k2.q == null) {
            k2.v = 10;
            k2.O = 150;
            k2.q = string;
        } else if (k2.q != string) {
            gj.a(0xFF0000, string, n3 - 10, n2);
        }
    }

    private void a(rs.a.k k2, int n2, int n3) {
        this.a("[HIDDEN]", k2, n2, n3);
    }

    public void o() {
        try {
            int n2;
            int n3;
            int n4;
            int n5 = 0;
            for (n4 = -1; n4 < this.ku + this.cB; ++n4) {
                int n6;
                rs.d.d d2;
                rs.a.c c2 = n4 == -1 ? eR : (n4 < this.ku ? do[this.kv[n4]] : this.cA[this.cC[n4 - this.ku]]);
                if (c2 == null || !c2.l()) continue;
                n3 = 0;
                if (c2 instanceof rs.a.j) {
                    d2 = ((rs.a.j)c2).aG;
                    if (d2.G != null) {
                        d2 = d2.c();
                    }
                    if (d2 == null) continue;
                    if (((rs.a.j)c2).aG.L != null) {
                        rs.l.f.e.d().a(rs.l.f.a.f, (Object)((rs.a.j)c2), ((rs.a.j)c2).c());
                    }
                    if (((rs.a.j)c2).aF >= 0) {
                        this.a(c2, c2.r + 15);
                        this.mW[((rs.a.j)c2).aF].f(this.dN - 12, this.dO - 25);
                    }
                    if (((rs.a.j)c2).aB >= 0 && ((rs.a.j)c2).aG.x == 8330L) {
                        this.a(c2, c2.r + 15);
                        ((rs.a.j)c2).a(rs.l.j_0.h, this.dN - 12, this.dO - 17);
                    }
                    if (d2.T > 0) {
                        this.a(c2, c2.r + d2.W);
                        if (rs.l.j.b.w_(d2.T)) {
                            fE[((rs.l.a.a)rs.l.j.b.b(d2.T)).b()].f(this.dN + d2.U, this.dO + d2.V);
                        } else {
                            fE[d2.T].f(this.dN + d2.U, this.dO + d2.V);
                        }
                    }
                    if (d2.x >= 8184L && d2.x <= 8186L && ((rs.a.j)c2).az > 0) {
                        this.a(c2, c2.r + 100);
                        if (((rs.a.j)c2).az == 1) {
                            fE[59].f(this.dN - 8, this.dO);
                        }
                        if (((rs.a.j)c2).az == 2) {
                            fE[58].f(this.dN - 8, this.dO);
                        }
                        if (((rs.a.j)c2).az == 3) {
                            fE[369].f(this.dN - 8, this.dO);
                        }
                    }
                    if ((d2.x == 3962L || d2.x == 3965L) && ((rs.a.j)c2).az > 0) {
                        this.a(c2, c2.r - 40);
                        fE[53].f(this.dN - 8, this.dO);
                    }
                    if ((d2.x == 6991L || d2.x == 8124L || d2.x == 8125L || d2.x == 8126L) && ((rs.a.j)c2).az > 0) {
                        this.a(c2, c2.r + 40);
                        fE[53].f(this.dN - 8, this.dO);
                    }
                    if ((d2.x == 6650L || d2.x >= 5159L && d2.x <= 5164L || d2.x == 6049L) && ((rs.a.j)c2).az > 0) {
                        this.a(c2, c2.r + 15);
                        if (((rs.a.j)c2).az == 1) {
                            fE[22].f(this.dN - 8, this.dO);
                        } else if (((rs.a.j)c2).az == 2) {
                            fE[22].f(this.dN - 8, this.dO - 10);
                            fE[22].f(this.dN - 8, this.dO - 5);
                        } else if (((rs.a.j)c2).az == 3) {
                            fE[22].f(this.dN - 8, this.dO - 10);
                            fE[22].f(this.dN - 8, this.dO - 5);
                            fE[22].f(this.dN - 8, this.dO);
                        }
                    }
                    if (d2.x == 2476L) {
                        this.a(c2, c2.r + 15);
                        fE[94].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 6537L) {
                        this.a(c2, c2.r + 15);
                        fE[87].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1208L) {
                        this.a(c2, c2.r + 15);
                        fE[164].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 401L) {
                        this.a(c2, c2.r + 15);
                        fE[190].f(this.dN - 8, this.dO - 18);
                    }
                    if (d2.x == 2399L) {
                        this.a(c2, c2.r + 15);
                        fE[112].f(this.dN - 8, this.dO - 18);
                    }
                    if (d2.x == 5942L) {
                        this.a(c2, c2.r + 15);
                        fE[100].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 6184L) {
                        this.a(c2, c2.r + 15);
                        fE[92].f(this.dN - 8, this.dO - 5);
                    }
                    if (d2.x == 6L) {
                        this.a(c2, c2.r + 15);
                        fE[3].f(this.dN - 6, this.dO - 15);
                    }
                    if (d2.x == 410L) {
                        this.a(c2, c2.r + 15);
                        fE[92].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 2165L) {
                        this.a(c2, c2.r + 15);
                        fE[189].f(this.dN - 10, this.dO - 25);
                    }
                    if (d2.x == 1780L) {
                        this.a(c2, c2.r + 15);
                        fE[9].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 851L) {
                        this.a(c2, c2.r + 15);
                        fE[9].f(this.dN - 8, this.dO - 15);
                    }
                    if (((rs.a.j)c2).aH && !((rs.a.j)c2).q()) {
                        this.a(c2, c2.r + 15);
                        if (ff % 20 < 10) {
                            this.mX[0].f(this.dN - 12, this.dO - 28);
                        }
                    }
                    if (d2.x == 2998L || d2.x == 1835L || d2.x == 4658L || d2.x == 4659L || d2.x == 4965L || d2.x == 5112L || d2.x == 8028L) {
                        this.a(c2, c2.r + 15);
                        this.fJ.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 2790L) {
                        this.a(c2, c2.r + 15);
                        this.fK.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 692L) {
                        this.a(c2, c2.r + 15);
                        fE[152].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 4088L) {
                        this.a(c2, c2.r + 15);
                        fE[228].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 830L) {
                        this.a(c2, c2.r + 15);
                        fE[87].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 4621L) {
                        this.a(c2, c2.r + 15);
                        fE[59].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 4623L) {
                        this.a(c2, c2.r + 15);
                        fE[73].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1798L) {
                        this.a(c2, c2.r - 325);
                        fE[51].f(this.dN - 8, this.dO + 5);
                    }
                    if (d2.x == 1839L || d2.x >= 727L && d2.x <= 730L || d2.x >= 3682L && d2.x <= 3694L) {
                        this.a(c2, c2.r + 15);
                        this.mK.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1019L || d2.x == 4100L || d2.x == 4101L || d2.x == 4102L || d2.x >= 7072L && d2.x <= 7076L) {
                        this.a(c2, c2.r + 5);
                        this.mL.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 6390L) {
                        this.a(c2, c2.r + 50);
                        fE[79].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1552L) {
                        this.a(c2, c2.r + 50);
                        fE[82].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 4416L) {
                        this.a(c2, c2.r + 15);
                        this.mP.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 251L) {
                        this.a(c2, c2.r + 15);
                        this.fI.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 2830L) {
                        this.a(c2, c2.r + 15);
                        fE[258].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 373L) {
                        this.a(c2, c2.r + 15);
                        fE[192].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1596L || d2.x == 8031L) {
                        this.a(c2, c2.r + 15);
                        this.me[51].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1917L) {
                        this.a(c2, c2.r + 15);
                        fE[122].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 6750L) {
                        this.a(c2, c2.r + 15);
                        fE[123].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 554L) {
                        this.a(c2, c2.r + 15);
                        fE[120].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1699L) {
                        this.a(c2, c2.r + 15);
                        fE[118].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1050L) {
                        this.a(c2, 245);
                        fE[321].f(this.dN - 6, this.dO - 15);
                    }
                    if (d2.x == 7484L) {
                        this.a(c2, 230);
                        fE[274].f(this.dN - 10, this.dO - 15);
                    }
                    if (d2.x == 7482L) {
                        this.a(c2, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (d2.x == 2575L) {
                        this.a(c2, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (d2.x == 2333L) {
                        this.a(c2, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (d2.x == 6174L || d2.x == 6175L) {
                        this.a(c2, 230);
                        this.fJ.f(this.dN - 8, this.dO - 18);
                    }
                    if (d2.x == 6179L) {
                        this.a(c2, 230);
                        this.eK[1].f(this.dN - 12, this.dO - 24);
                        this.fJ.f(this.dN + 15, this.dO - 18);
                    }
                    if (d2.x == 1597L) {
                        this.a(c2, c2.r + 15);
                        this.fH.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1799L) {
                        this.a(c2, c2.r - 220);
                        this.fG.f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1800L) {
                        this.a(c2, c2.r - 300);
                        this.me[1].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1797L) {
                        this.a(c2, c2.r - 300);
                        this.me[1].f(this.dN - 8, this.dO - 18);
                    }
                    if (d2.x == 1802L) {
                        this.a(c2, c2.r - 135);
                        fE[182].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1801L) {
                        this.a(c2, c2.r - 400);
                        fE[194].f(this.dN - 8, this.dO - 15);
                    }
                    if (d2.x == 1803L) {
                        this.a(c2, c2.r + 100);
                        fE[194].f(this.dN - 8, this.dO - 15);
                    }
                }
                if (n4 < this.ku) {
                    int n7;
                    int n8 = 25;
                    rs.a.c c3 = c2;
                    if (!rs.runelite.b.a.b().isEmpty()) {
                        for (n7 = 0; n7 < rs.runelite.b.a.b().size(); ++n7) {
                            if (rs.runelite.b.a.b().get(n7).draw(c3, false)) continue;
                            n3 = 1;
                            break;
                        }
                    }
                    if (((rs.a.k)c3).bd == 10 && n3 == 0) {
                        this.a(c2, c2.r + 15);
                        this.a((rs.a.k)c3, this.dN, this.dO);
                    } else if (((rs.a.k)c3).bd == 11 && n3 == 0) {
                        this.a(c2, c2.r + 15);
                        this.a("[SUPER HIDDEN]", (rs.a.k)c3, this.dN, this.dO);
                    } else if (rs.f.a.bf > 0 && n3 == 0) {
                        this.a(c2, c2.r + 15);
                        fE[rs.f.a.bf].f(this.dN - 8, this.dO - 18);
                    } else if (((rs.a.k)c3).bd >= 0 && n3 == 0) {
                        this.a(c2, c2.r + 15);
                        if (this.dN > -1) {
                            if (((rs.a.k)c3).by > 0) {
                                n7 = c2.L > ff ? 4 : 0;
                                long l2 = System.currentTimeMillis() - ((rs.a.k)c3).bz;
                                long l3 = (long)((rs.a.k)c3).by - l2 / 1000L;
                                Date date = new Date(l3 * 1000L);
                                String string = new SimpleDateFormat("m:ss").format(date);
                                int n9 = this.dN;
                                int n10 = this.dO;
                                if (((rs.a.k)c3).bf != 255 && ((rs.a.k)c3).bf >= 2) {
                                    n9 = this.dN + 31;
                                    n10 = c2.L > ff ? this.dO - 3 : this.dO + 1;
                                }
                                gl.c(string, n9, n10 - n7, 0xFFFFFF, 1);
                                n8 += 10 + n7;
                            }
                            try {
                                if (((rs.a.k)c3).bg > 0 && ed == 197) {
                                    n7 = 0;
                                    int n11 = 15;
                                    if (((rs.a.k)c3).bf == 0) {
                                        if (((rs.a.k)c3).bd != 0) {
                                            n11 = 17;
                                        }
                                    } else if (((rs.a.k)c3).bf >= 9 && ((rs.a.k)c3).bf <= 18) {
                                        if (((rs.a.k)c3).bd != 0) {
                                            n11 = 17;
                                        }
                                    } else {
                                        n7 = 5;
                                        int n12 = n11 = ((rs.a.k)c3).bd != 255 ? 20 : -4;
                                    }
                                    if (((rs.a.k)c3).bh > 0) {
                                        n7 -= 15;
                                        n11 -= 3;
                                    }
                                    this.J[((rs.a.k)c3).bg - 1].f(this.dN + n11, this.dO - 25 + 10 + n7);
                                }
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            try {
                                int n13;
                                int n14 = n13 = c2.L > ff ? 4 : 0;
                                if (((rs.a.k)c3).bf < 2) {
                                    this.eK[((rs.a.k)c3).bf].f(this.dN - 12, this.dO - n8 - n13);
                                    n8 += 30 + n13;
                                } else if (((rs.a.k)c3).bf == 8) {
                                    this.I.f(this.dN - 11, this.dO + 15 - n8 - n13);
                                    n8 += 20 + n13;
                                } else if (((rs.a.k)c3).bf >= 9 && ((rs.a.k)c3).bf <= 18) {
                                    this.eL[((rs.a.k)c3).bf - 9].f(this.dN - 12, this.dO - n8 - n13);
                                    n8 += 30 + n13;
                                } else if (((rs.a.k)c3).bf >= 2 && ((rs.a.k)c3).bf != 255) {
                                    this.x.z[((rs.a.k)c3).bf - 1].f(this.dN - 11, this.dO + 20 - n8 - n13);
                                    n8 += 10 + n13;
                                }
                                if (((rs.a.k)c3).br[0] - 512 == 23481) {
                                    fE[rs.l.h.b(0)].f(this.dN - 7, this.dO - n8 - n13 + 10);
                                    n8 += 16 + n13;
                                }
                                if ((((rs.a.k)c3).br[0] - 512 == 22131 || ((rs.a.k)c3).br[0] - 512 == 22132 || ((rs.a.k)c3).br[0] - 512 == 23480 || ((rs.a.k)c3).br[0] - 512 == 23482 || ((rs.a.k)c3).br[0] - 512 == 23483) && rs.l.h.b(((rs.a.k)c3).aC) > 0) {
                                    fE[rs.l.h.b(((rs.a.k)c3).aC)].f(this.dN - 6, this.dO - n8 - n13 + 10);
                                    n8 += 16 + n13;
                                }
                                if (((rs.a.k)c3).br[0] - 512 == 22133) {
                                    fE[rs.l.h.b(31)].f(this.dN - 8, this.dO - n8 - n13 + 10);
                                    n8 += 16 + n13;
                                }
                                if (((rs.a.k)c3).br[0] - 512 == 22130) {
                                    fE[rs.l.h.b(19)].f(this.dN - 6, this.dO - n8 - n13 + 10);
                                    n8 += 16 + n13;
                                }
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            if (((rs.a.k)c3).bd < 21) {
                                this.mW[((rs.a.k)c3).bd].f(this.dN - 12, this.dO - n8);
                                n8 += 18;
                            }
                        }
                    }
                    if (n4 >= 0 && this.jZ == 10 && this.kV == this.kv[n4] && n3 == 0) {
                        this.a(c2, c2.r + 15);
                        if (this.dN > -1) {
                            this.mX[((rs.a.k)c3).be].f(this.dN - 12, this.dO - n8);
                        }
                    }
                    try {
                        if (((rs.a.k)c3).bh > 0 && ((rs.a.k)c3).bh != 255 && (((rs.a.k)c3).aC != 25 || rs.f.a.bp) && n3 == 0) {
                            this.a(c2, c2.r + 15);
                            n7 = ((rs.a.k)c3).bd >= 0 && ((rs.a.k)c3).bd != 255 || ((rs.a.k)c3).bf >= 0 && ((rs.a.k)c3).bf != 255 ? 15 : -8;
                            switch (((rs.a.k)c3).bh) {
                                case 1: {
                                    fE[73].f(this.dN + n7, this.dO - 10);
                                    break;
                                }
                                case 2: {
                                    fE[59].f(this.dN + n7, this.dO - 15);
                                    break;
                                }
                                case 3: {
                                    fE[73].f(this.dN + n7 + 4, this.dO - 10);
                                    fE[49].f(this.dN + n7 - 5 + 5, this.dO - 5);
                                    break;
                                }
                                case 4: {
                                    fE[59].f(this.dN + n7 + 4, this.dO - 15);
                                    fE[49].f(this.dN + n7 - 5 + 4, this.dO - 8);
                                    break;
                                }
                                case 5: {
                                    fE[273].f(this.dN + n7, this.dO - 15);
                                }
                            }
                        }
                    }
                    catch (Exception exception) {}
                } else if (n3 == 0) {
                    d2 = ((rs.a.j)c2).aG;
                    if (rs.q.a.a.a.j.d.size() > 0 && rs.q.a.a.a.j.d.get((int)d2.x) != null) {
                        n6 = rs.q.a.a.a.j.d.get((int)d2.x);
                        if (n6 >= 0 && n6 < this.mW.length) {
                            this.a(c2, c2.r + 15);
                            if (this.dN > -1) {
                                this.mW[n6].f(this.dN - 12, this.dO - 30);
                            }
                        }
                    } else if (d2.u >= 0 && d2.u < this.mW.length) {
                        this.a(c2, c2.r + 15);
                        if (this.dN > -1) {
                            this.mW[d2.u].f(this.dN - 12, this.dO - 30);
                        }
                    }
                    if (this.jZ == 1 && this.of == this.cC[n4 - this.ku] && ff % 20 < 10) {
                        this.a(c2, c2.r + 15);
                        if (this.dN > -1) {
                            this.mX[0].f(this.dN - 12, this.dO - 28);
                        }
                    }
                }
                if (c2.q != null && (n4 >= this.ku || this.gu == 0 || this.gu == 3 || this.gu == 1 && this.i(((rs.a.k)c2).aZ))) {
                    this.a(c2, c2.r);
                    if (this.dN > -1 && n5 < this.lq) {
                        this.lu[n5] = gj.a(c2.q) / 2;
                        this.lt[n5] = Client.gj.r;
                        this.lr[n5] = this.dN;
                        this.ls[n5] = this.dO;
                        this.lv[n5] = c2.v;
                        this.lw[n5] = c2.K;
                        this.lx[n5] = c2.O;
                        this.ly[n5++] = c2.q;
                        if (this.or == 0 && c2.K >= 1 && c2.K <= 3) {
                            int n15 = n5;
                            this.lt[n15] = this.lt[n15] + 10;
                            int n16 = n5;
                            this.ls[n16] = this.ls[n16] + 5;
                        }
                        if (this.or == 0 && c2.K == 4) {
                            this.lu[n5] = 60;
                        }
                        if (this.or == 0 && c2.K == 5) {
                            int n17 = n5;
                            this.lt[n17] = this.lt[n17] + 5;
                        }
                    }
                }
                if (c2.L > ff && n3 == 0) {
                    try {
                        this.a(c2, c2.r + 15);
                        boolean bl = true;
                        if (c2 instanceof rs.a.j && !((rs.a.j)c2).aG.O) {
                            bl = false;
                        }
                        if (this.dN > -1 && bl) {
                            byte by;
                            byte by2 = by = c2 instanceof rs.a.j ? ((rs.a.j)c2).aG.P : (byte)0;
                            if (rs.f.a.al && by == 0) {
                                f_0 f_02 = rs.l.j_0.d;
                                f_0 f_03 = rs.l.j_0.c;
                                if (c2 instanceof rs.a.j && c2.N >= 1000) {
                                    f_02 = rs.l.j_0.f;
                                    f_03 = rs.l.j_0.e;
                                }
                                if ((n2 = c2.N > 0 ? c2.M * f_02.n / c2.N : f_02.n) > f_02.n) {
                                    n2 = f_02.n;
                                }
                                if (n2 < 1 && c2.M > 0) {
                                    n2 = 1;
                                }
                                f_02.a(this.dN - f_02.n / 2, this.dO - 5, f_02.n, f_02.o);
                                f_03.a(this.dN - f_02.n / 2, this.dO - 5, n2, f_03.o);
                            } else {
                                int n18 = 30;
                                if (c2 instanceof rs.a.j) {
                                    if (c2.N >= 2500) {
                                        n18 *= 4;
                                    } else if (c2.N >= 1000) {
                                        n18 *= 3;
                                    } else if (c2.N >= 500) {
                                        n18 *= 2;
                                    }
                                }
                                int n19 = 65280;
                                n2 = 0xFF0000;
                                if (by == 1) {
                                    n19 = 65535;
                                    n2 = 255;
                                }
                                if (by == 2) {
                                    n19 = 0xFFFF00;
                                    n2 = 0x333300;
                                }
                                if (by == 255 && c2 instanceof rs.a.j) {
                                    n19 = ((rs.a.j)c2).aG.Q;
                                    n2 = ((rs.a.j)c2).aG.R;
                                }
                                int n20 = c2.N > 0 ? Math.min(n18, c2.M * n18 / c2.N) : n18;
                                if (c2.M > 0 && n20 <= 0) {
                                    n20 = 1;
                                }
                                rs.l.c.e(this.dN - n18 / 2, this.dO - 3, n20, 5, n19);
                                rs.l.c.e(this.dN - n18 / 2 + n20, this.dO - 3, n18 - n20, 5, n2);
                            }
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (c2 instanceof rs.a.k && n3 == 0 && ((rs.a.k)c2).az > System.currentTimeMillis()) {
                    this.a(c2, c2.r / 2);
                    if (((rs.a.k)c2).aA == 1) {
                        this.kk[0].c(this.dN - 12, this.dO - 15);
                    } else {
                        this.kk[0].c(this.dN - 35, this.dO - 25);
                    }
                }
                if (n3 == 0) {
                    for (int i2 = 0; i2 < 4; ++i2) {
                        n6 = 0;
                        if (!c2.h.a(i2)) continue;
                        ++n6;
                        if (!rs.f.a.ap) {
                            this.a(c2, c2.r / 2);
                            c2.h.d()[i2].a(this, c2, i2, this.dN, this.dO);
                            continue;
                        }
                        this.a(c2, c2.r / 2);
                        if (this.dN <= -1) continue;
                        this.a(c2, (int)((double)c2.r * 0.75));
                        rs.a.c c4 = c2;
                        c2.h.d()[i2].b(this, c2, i2, this.dN, this.dO);
                    }
                }
                c2.f();
            }
            for (n4 = 0; n4 < n5; ++n4) {
                int n21 = this.lr[n4];
                n3 = this.ls[n4];
                int n22 = this.lu[n4];
                int n23 = this.lt[n4];
                boolean bl = true;
                while (bl) {
                    bl = false;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        if (n3 + 2 <= this.ls[i3] - this.lt[i3] || n3 - n23 >= this.ls[i3] + 2 || n21 - n22 >= this.lr[i3] + this.lu[i3] || n21 + n22 <= this.lr[i3] - this.lu[i3] || this.ls[i3] - this.lt[i3] >= n3) continue;
                        n3 = this.ls[i3] - this.lt[i3];
                        bl = true;
                    }
                }
                this.dN = this.lr[n4];
                this.dO = this.ls[n4] = n3;
                String string = this.ly[n4];
                if (this.or == 0) {
                    int n24;
                    int n25;
                    n2 = 0xFFFF00;
                    if (this.lv[n4] < 6) {
                        n2 = this.lk[this.lv[n4]];
                    }
                    if (this.lv[n4] == 6) {
                        int n26 = n2 = gg % 20 >= 10 ? 0xFFFF00 : 0xFF0000;
                    }
                    if (this.lv[n4] == 7) {
                        int n27 = n2 = gg % 20 >= 10 ? 65535 : 255;
                    }
                    if (this.lv[n4] == 8) {
                        int n28 = n2 = gg % 20 >= 10 ? 0x80FF80 : 45056;
                    }
                    if (this.lv[n4] == 9) {
                        n25 = 150 - this.lx[n4];
                        if (n25 < 50) {
                            n2 = 0xFF0000 + 1280 * n25;
                        } else if (n25 < 100) {
                            n2 = 0xFFFF00 - 327680 * (n25 - 50);
                        } else if (n25 < 150) {
                            n2 = 65280 + 5 * (n25 - 100);
                        }
                    }
                    if (this.lv[n4] == 10) {
                        n25 = 150 - this.lx[n4];
                        if (n25 < 50) {
                            n2 = 0xFF0000 + 5 * n25;
                        } else if (n25 < 100) {
                            n2 = 0xFF00FF - 327680 * (n25 - 50);
                        } else if (n25 < 150) {
                            n2 = 255 + 327680 * (n25 - 100) - 5 * (n25 - 100);
                        }
                    }
                    if (this.lv[n4] == 11) {
                        n25 = 150 - this.lx[n4];
                        if (n25 < 50) {
                            n2 = 0xFFFFFF - 327685 * n25;
                        } else if (n25 < 100) {
                            n2 = 65280 + 327685 * (n25 - 50);
                        } else if (n25 < 150) {
                            n2 = 0xFFFFFF - 327680 * (n25 - 100);
                        }
                    }
                    if (this.lw[n4] == 0) {
                        gj.a(0, string, this.dO + 1, this.dN);
                        gj.a(n2, string, this.dO, this.dN);
                    }
                    if (this.lw[n4] == 1) {
                        gj.a(0, string, this.dN, gg, this.dO + 1);
                        gj.a(n2, string, this.dN, gg, this.dO);
                    }
                    if (this.lw[n4] == 2) {
                        gj.b(this.dN, string, gg, this.dO + 1, 0);
                        gj.b(this.dN, string, gg, this.dO, n2);
                    }
                    if (this.lw[n4] == 3) {
                        gj.a(150 - this.lx[n4], string, gg, this.dO + 1, this.dN, 0);
                        gj.a(150 - this.lx[n4], string, gg, this.dO, this.dN, n2);
                    }
                    if (this.lw[n4] == 4) {
                        n25 = gj.a(string);
                        n24 = (150 - this.lx[n4]) * (n25 + 100) / 150;
                        rs.l.c.c(334, this.dN - 50, this.dN + 50, 0);
                        gj.b(0, string, this.dO + 1, this.dN + 50 - n24);
                        gj.b(n2, string, this.dO, this.dN + 50 - n24);
                        rs.l.c.c();
                    }
                    if (this.lw[n4] != 5) continue;
                    n25 = 150 - this.lx[n4];
                    n24 = 0;
                    if (n25 < 25) {
                        n24 = n25 - 25;
                    } else if (n25 > 125) {
                        n24 = n25 - 125;
                    }
                    rs.l.c.c(this.dO + 5, 0, 512, this.dO - Client.gj.r - 1);
                    gj.a(0, string, this.dO + 1 + n24, this.dN);
                    gj.a(n2, string, this.dO + n24, this.dN);
                    rs.l.c.c();
                    continue;
                }
                gj.a(0, string, this.dO + 1, this.dN);
                gj.a(0xFFFF00, string, this.dO, this.dN);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void f(long l2) {
        try {
            if (l2 == 0L) {
                return;
            }
            for (int i2 = 0; i2 < this.kA; ++i2) {
                if (this.lg[i2] != l2) continue;
                --this.kA;
                fb = true;
                for (int i3 = i2; i3 < this.kA; ++i3) {
                    this.mT[i3] = this.mT[i3 + 1];
                    this.jG[i3] = this.jG[i3 + 1];
                    this.lg[i3] = this.lg[i3 + 1];
                }
                fv.a(215);
                fv.a(l2);
                break;
            }
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("18622, false, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    private void bp() {
        int n2;
        if (this.iE == null) {
            this.iE = new Long[341];
            for (n2 = 0; n2 < this.iE.length; ++n2) {
                this.iE[n2] = 0L;
            }
        }
        if (this.iD == null) {
            this.iD = new Long[341];
            for (n2 = 0; n2 < this.iD.length; ++n2) {
                this.iD[n2] = 0L;
            }
        }
    }

    public void a(int n2, long l2) {
        int n3;
        if (this.iE == null) {
            return;
        }
        if (!rs.k.e.a() ? System.currentTimeMillis() - this.iE[n2] <= l2 : rs.l.b.a.a() || System.currentTimeMillis() - this.iE[n2] <= l2 / 2L) {
            return;
        }
        if (l2 > 50L) {
            l2 = 50L;
        }
        this.bp();
        this.iE[n2] = System.currentTimeMillis();
        this.iD[n2] = l2;
        rs.l.a a2 = e_0.y[n2];
        int n4 = a2.j * a2.k - 1;
        int n5 = a2.j * this.dE * 2;
        byte[] byArray = a2.i;
        byte[] byArray2 = this.kL;
        for (n3 = 0; n3 <= n4; ++n3) {
            byArray2[n3] = byArray[n3 - n5 & n4];
        }
        a2.i = byArray2;
        this.kL = byArray;
        e_0.c(n2);
        if (++jY > 1235) {
            jY = 0;
            if (!rs.l.b.a.d.c) {
                fv.a(226);
                fv.b(0);
                n3 = Client.fv.h;
                fv.d(58722);
                fv.b(240);
                fv.d((int)(Math.random() * 65536.0));
                fv.b((int)(Math.random() * 256.0));
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(51825);
                }
                fv.b((int)(Math.random() * 256.0));
                fv.d((int)(Math.random() * 65536.0));
                fv.d(7130);
                fv.d((int)(Math.random() * 65536.0));
                fv.d(61657);
                fv.j(Client.fv.h - n3);
            }
        }
    }

    public void f(int n2) {
        this.d(n2, true);
    }

    private void d(int n2, boolean bl) {
        byte[] byArray;
        int n3;
        this.bp();
        for (int n4 : bJ) {
            if (System.currentTimeMillis() - this.iE[n4] <= 100L || e_0.z[n4] < n2) continue;
            int n5 = 1;
            if (n4 != 57) {
                n5 = 2;
            }
            rs.l.a a2 = e_0.y[n4];
            n3 = a2.j * a2.k - 1;
            int n6 = a2.j * this.dE * n5;
            byArray = a2.i;
            byte[] byArray2 = this.kL;
            for (int i2 = 0; i2 <= n3; ++i2) {
                byArray2[i2] = byArray[i2 - n6 & n3];
            }
            a2.i = byArray2;
            this.kL = byArray;
            e_0.c(n4);
        }
        for (int n4 : bK) {
            int n7;
            if (System.currentTimeMillis() - this.iE[n4] <= 100L || e_0.z[n4] < n2) continue;
            rs.l.a a3 = e_0.y[n4];
            int n8 = a3.j * a3.k - 1;
            n3 = a3.j * this.dE * 2;
            byte[] byArray3 = a3.i;
            byArray = this.kL;
            for (n7 = 0; n7 <= n8; ++n7) {
                byArray[n7] = byArray3[n7 - n3 & n8];
            }
            a3.i = byArray;
            this.kL = byArray3;
            e_0.c(n4);
            if (++jY <= 1235) continue;
            jY = 0;
            if (rs.l.b.a.d.g()) continue;
            fv.a(226);
            fv.b(0);
            n7 = Client.fv.h;
            fv.d(58722);
            fv.b(240);
            fv.d((int)(Math.random() * 65536.0));
            fv.b((int)(Math.random() * 256.0));
            if ((int)(Math.random() * 2.0) == 0) {
                fv.d(51825);
            }
            fv.b((int)(Math.random() * 256.0));
            fv.d((int)(Math.random() * 65536.0));
            fv.d(7130);
            fv.d((int)(Math.random() * 65536.0));
            fv.d(61657);
            fv.j(Client.fv.h - n7);
        }
    }

    private void bq() {
        rs.a.c c2;
        int n2;
        int n3;
        if (rs.l.b.a.a()) {
            return;
        }
        rs.l.k.b.a();
        rs.l.k.c.a();
        rs.l.k.d.a();
        rs.l.k.e.a();
        if ((bN += bO) == 1) {
            bO = 1;
        } else if (bN == 149) {
            bO = -1;
        }
        if ((bP += bQ) == 1) {
            bQ = 1;
        } else if (bP == 149) {
            bQ = -1;
        }
        for (n3 = -1; n3 < this.ku; ++n3) {
            n2 = n3 == -1 ? 2047 : this.kv[n3];
            c2 = do[n2];
            if (c2 == null || c2.O <= 0) continue;
            --c2.O;
            if (c2.O != 0) continue;
            c2.q = null;
        }
        for (n3 = 0; n3 < this.cB; ++n3) {
            n2 = this.cC[n3];
            c2 = this.cA[n2];
            if (c2 == null || ((rs.a.j)c2).O <= 0) continue;
            --((rs.a.j)c2).O;
            if (((rs.a.j)c2).O != 0) continue;
            ((rs.a.j)c2).q = null;
        }
    }

    public void p() {
        int n2;
        int n3;
        int n4 = this.mZ * 128 + 64;
        int n5 = this.na * 128 + 64;
        int n6 = this.c(dw, n5, n4) - this.nb;
        if (cJ < n4 && (cJ += this.nc + (n4 - cJ) * this.nd / 1000) > n4) {
            cJ = n4;
        }
        if (cJ > n4 && (cJ -= this.nc + (cJ - n4) * this.nd / 1000) < n4) {
            cJ = n4;
        }
        if (cK < n6 && (cK += this.nc + (n6 - cK) * this.nd / 1000) > n6) {
            cK = n6;
        }
        if (cK > n6 && (cK -= this.nc + (cK - n6) * this.nd / 1000) < n6) {
            cK = n6;
        }
        if (cL < n5 && (cL += this.nc + (n5 - cL) * this.nd / 1000) > n5) {
            cL = n5;
        }
        if (cL > n5 && (cL -= this.nc + (cL - n5) * this.nd / 1000) < n5) {
            cL = n5;
        }
        n4 = this.lE * 128 + 64;
        n5 = this.lF * 128 + 64;
        n6 = this.c(dw, n5, n4) - this.lG;
        int n7 = n4 - cJ;
        int n8 = n6 - cK;
        int n9 = n5 - cL;
        int n10 = (int)Math.sqrt(n7 * n7 + n9 * n9);
        int n11 = (int)(Math.atan2(n8, n10) * 325.949) & 0x7FF;
        int n12 = (int)(Math.atan2(n7, n9) * -325.949) & 0x7FF;
        if (n11 < 128) {
            n11 = 128;
        }
        if (n11 > 383) {
            n11 = 383;
        }
        if (this.cR < n11) {
            this.cR += this.lH + (n11 - this.cR) * this.lI / 1000;
            if (this.cR > n11) {
                this.cR = n11;
            }
        }
        if (this.cR > n11) {
            this.cR -= this.lH + (this.cR - n11) * this.lI / 1000;
            if (this.cR < n11) {
                this.cR = n11;
            }
        }
        if ((n3 = n12 - this.cS) > 1024) {
            n3 -= 2048;
        }
        if (n3 < -1024) {
            n3 += 2048;
        }
        if (n3 > 0) {
            this.cS += this.lH + n3 * this.lI / 1000;
            this.cS &= 0x7FF;
        }
        if (n3 < 0) {
            this.cS -= this.lH + -n3 * this.lI / 1000;
            this.cS &= 0x7FF;
        }
        if ((n2 = n12 - this.cS) > 1024) {
            n2 -= 2048;
        }
        if (n2 < -1024) {
            n2 += 2048;
        }
        if (n2 < 0 && n3 > 0 || n2 > 0 && n3 < 0) {
            this.cS = n12;
        }
    }

    public void a(String string, int n2) {
        this.fx[this.eV] = string;
        this.eI[this.eV] = n2;
        ++this.eV;
    }

    public void b(int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.lc - (n2 - 4);
        int n7 = -n3 + 4 + this.ld;
        int n8 = this.dI;
        int n9 = this.dJ + 1;
        fM = true;
        eM = true;
        int n10 = 6116423;
        rs.l.c.a(n9, n7, n6, n10, n8);
        rs.l.c.a(16, n7 + 1, n6 + 1, 0, n8 - 2);
        rs.l.c.d(n6 + 1, n8 - 2, n9 - 19, 0, n7 + 18);
        gj.b(n10, "Choose Option", n7 + 14, n6 + 3);
        int n11 = rs.c_0.hP - n2;
        int n12 = -n3 + rs.c_0.hQ;
        boolean bl = false;
        for (int i2 = 0; i2 < this.eV; ++i2) {
            n5 = n7 + 31 + (this.eV - 1 - i2) * 15;
            n4 = 0xFFFFFF;
            if (n11 > n6 && n11 < n6 + n8 && n12 > n5 - 13 && n12 < n5 + 3) {
                rs.l.c.a(15, n5 - 11, n6 + 3, 7301469, this.dI - 6);
                n4 = 0xFFFF00;
                this.r.c(i2);
                bl = true;
            }
            this.gn.a(this.fx[i2], n6 + 3, n5, n4, 0, false);
        }
        if (this.r.b()) {
            rs.j.b.a a2 = this.r.c();
            n5 = n6;
            n6 += n8;
            n7 = n7 + 5 + (this.eV - 1 - a2.d()) * 15;
            n8 = a2.g();
            n9 = a2.h();
            if (n6 + n8 > ai) {
                n6 = n5 - n8;
            }
            a2.b(n6);
            a2.c(n7);
            rs.l.c.a(n9, n7, n6, n10, n8);
            rs.l.c.a(16, n7 + 1, n6 + 1, 0, n8 - 2);
            rs.l.c.d(n6 + 1, n8 - 2, n9 - 19, 0, n7 + 18);
            gj.b(n10, this.r.c().c(), n7 + 14, n6 + 3);
            a2.d(-1);
            for (n4 = 0; n4 < a2.e(); ++n4) {
                int n13 = n7 + 31 + (a2.e() - 1 - n4) * 15;
                int n14 = 0xFFFFFF;
                if (!bl && n11 > n6 && n11 < n6 + n8 && n12 > n13 - 13 && n12 < n13 + 3) {
                    rs.l.c.a(15, n13 - 11, n6 + 3, 7301469, a2.g() - 6);
                    n14 = 0xFFFF00;
                    a2.d(n4);
                }
                this.gn.a(a2.f()[n4].a(), n6 + 3, n13, n14, 0, false);
            }
        }
    }

    public void a(long l2) {
        try {
            int n2;
            if (l2 == 0L) {
                return;
            }
            if (this.kA >= 350) {
                this.a("Your friendlist is full. Max of 350 users.", 0, "");
                return;
            }
            String string = o_0.c(o_0.a(l2));
            for (n2 = 0; n2 < this.kA; ++n2) {
                if (this.lg[n2] != l2) continue;
                this.a(string + " is already on your friend list", 0, "");
                return;
            }
            for (n2 = 0; n2 < this.jD; ++n2) {
                if (this.kP[n2] != l2) continue;
                this.a("Please remove " + string + " from your ignore list first", 0, "");
                return;
            }
            if (string.equals(Client.eR.aZ)) {
                return;
            }
            this.mT[this.kA] = string;
            this.lg[this.kA] = l2;
            this.jG[this.kA] = 0;
            ++this.kA;
            fb = true;
            fv.a(188);
            fv.a(l2);
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("15283, 68, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public int c(int n2, int n3, int n4) {
        int n5 = n4 >> 7;
        int n6 = n3 >> 7;
        if (n5 < 0 || n6 < 0 || n5 > 103 || n6 > 103) {
            return 0;
        }
        int n7 = n2;
        if (n7 < 3 && (this.gc[1][n5][n6] & 2) == 2) {
            ++n7;
        }
        int n8 = n4 & 0x7F;
        int n9 = n3 & 0x7F;
        int n10 = this.fC[n7][n5][n6] * (128 - n8) + this.fC[n7][n5 + 1][n6] * n8 >> 7;
        int n11 = this.fC[n7][n5][n6 + 1] * (128 - n8) + this.fC[n7][n5 + 1][n6 + 1] * n8 >> 7;
        return n10 * (128 - n9) + n11 * n9 >> 7;
    }

    public static String g(int n2) {
        if (n2 < 100000) {
            return String.valueOf(n2);
        }
        if (n2 < 10000000) {
            return n2 / 1000 + "K";
        }
        return n2 / 1000000 + "M";
    }

    public static String b(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l2 / 1000000L;
        long l5 = l2 / 1000000000L;
        long l6 = l2 / 1000000000000L;
        String string = "" + l2;
        if (l2 > 999L && l2 <= 999999L) {
            string = Long.toString(l3) + "K";
        } else if (l2 > 999999L && l2 <= 999999999L) {
            string = Long.toString(l4) + "M";
        } else if (l2 > 999999999L && l2 <= 999999999999L) {
            string = Long.toString(l5) + "B";
        } else if (l2 > 999999999999L) {
            string = Long.toString(l6) + "T";
        }
        return string;
    }

    private void br() {
        this.bg();
        this.v();
        SwingUtilities.invokeLater(() -> Launcher.n().q().b());
        if (rs.k.e.a()) {
            rs.k.b.d();
            this.a.d();
            this.a(a.c.a);
        }
        rs.l.f.a.i.b.m();
        GameStateChanged gameStateChanged = new GameStateChanged();
        gameStateChanged.setGameState(rs.runelite.a.c.c);
        this.p.post(gameStateChanged);
        rs.d.e.a();
        try {
            if (this.nD != null) {
                this.nD.a();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        int n2 = rs.n.c.ae.e;
        for (int i2 = 0; i2 < rs.n.c.ae.c.size(); ++i2) {
            int n3 = n2++;
            if (i2 == 0) {
                rs.n.e.H[n3].E = new f_0("vote/sprite 2");
                rs.n.e.H[n3].aG = new f_0("vote/sprite 2");
                continue;
            }
            rs.n.e.H[n3].E = new f_0("vote/sprite 1");
            rs.n.e.H[n3].aG = new f_0("vote/sprite 2");
        }
        for (rs.l.e.f f2 : rs.l.e.f.k) {
            f2.c();
        }
        for (rs.l.e.f f3 : rs.l.e.f.l) {
            f3.c();
        }
        rs.l.f.e.d().a();
        rs.f.a.O = false;
        rs.d.s.a.clear();
        rs.n.c.b.d.clear();
        this.fm = "";
        this.G.j = false;
        ii = 0L;
        bh = 0L;
        this.s = 0;
        this.iJ = -1;
        this.aE = false;
        this.aJ = false;
        this.eP = false;
        this.ae = false;
        this.jl = -1;
        this.eN = 0L;
        this.eO = 0;
        this.cp = false;
        this.iK = false;
        this.aD = false;
        this.cc = false;
        this.cd = false;
        this.v.i = false;
        this.v.c();
        this.jn = false;
        for (rs.n.c c2 : rs.n.d.a) {
            c2.b();
        }
        this.u.clear();
        this.if.clear();
        this.jD = 0;
        this.cY = 0;
        this.nD = null;
        rs.l.d.c.b = true;
        this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
        this.fc = false;
        this.cz = 2;
        this.v.b[2] = new f_0("orbs/hp_fill");
        this.m();
        this.dF.b();
        for (int i3 = 0; i3 < 4; ++i3) {
            this.fP[i3].a();
        }
        System.gc();
        this.e();
        this.lh = -1;
        this.oi = -1;
        this.oz = 0;
        this.K = false;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0L;
        this.a(a.c.a);
    }

    private void bs() {
        this.md = true;
        block0: for (int i2 = 0; i2 < 7; ++i2) {
            this.mu[i2] = -1;
            for (int i3 = 0; i3 < rs.d.j.a; ++i3) {
                if (rs.d.j.b[i3].e || rs.d.j.b[i3].c != i2 + (this.ml ? 0 : 7)) continue;
                this.mu[i2] = i3;
                continue block0;
            }
        }
    }

    private void a(int n2, rs.x.e e2) {
        int n3;
        while (e2.i + 21 < n2 * 8 && (n3 = e2.k(14)) != 16383) {
            boolean bl;
            int n4;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            int n5;
            int n6 = -1;
            if (this.cA[n3] == null) {
                this.cA[n3] = new rs.a.j();
            } else if (this.cA[n3].aG != null) {
                n6 = (int)this.cA[n3].aG.x;
            }
            rs.a.j j2 = this.cA[n3];
            this.cC[this.cB++] = n3;
            j2.P = ff;
            int n7 = e2.k(5);
            if (n7 > 15) {
                n7 -= 32;
            }
            if ((n5 = e2.k(5)) > 15) {
                n5 -= 32;
            }
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            boolean bl5 = bl4 = e2.k(1) == 1;
            if (bl4) {
                n9 = n8 = e2.k(8);
            }
            j2.aw = n8;
            j2.ax = n9;
            j2.ay = n10;
            boolean bl6 = bl3 = e2.k(1) == 1;
            if (bl3) {
                j2.ar = (byte)e2.k(8);
                j2.ao = (byte)e2.k(8);
                j2.ap = (byte)e2.k(8);
                j2.aq = (byte)e2.k(8);
            }
            boolean bl7 = bl2 = e2.k(1) == 1;
            if (bl2) {
                n4 = e2.k(8);
                j2.s = 1024 + n4 * 256;
            } else {
                j2.Q = 0;
                j2.R = 0;
            }
            n4 = 1;
            j2.aH = e2.k(1) == 1;
            j2.aG = rs.d.d.c(e2.k(14));
            if ((long)n6 != j2.aG.x) {
                j2.h.b();
                j2.L = 0;
            }
            boolean bl8 = bl = e2.k(1) == 1;
            if (bl) {
                this.kx[this.kw++] = n3;
            }
            j2.S = j2.aG.r;
            j2.o = j2.aG.y;
            j2.ag = j2.aG.q;
            j2.ah = j2.aG.l;
            j2.ai = j2.aG.B;
            j2.aj = j2.aG.j;
            j2.t = j2.aG.w;
            j2.a(Client.eR.k[0] + n5, Client.eR.l[0] + n7, n4 == 1);
            NpcSpawned npcSpawned = new NpcSpawned();
            npcSpawned.setNpc(j2);
            this.p.post(npcSpawned);
        }
        e2.K();
    }

    public static String c(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l3 / 3600L;
        long l5 = l3 / 60L % 60L;
        long l6 = l3 % 60L;
        String string = l6 >= 10L ? "" + l6 : "0" + l6;
        String string2 = l5 >= 10L ? "" + l5 : "0" + l5;
        return l4 + ":" + string2 + ":" + string + " ";
    }

    public static String d(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l3 / 60L % 60L;
        long l5 = l3 % 60L;
        String string = l5 >= 10L ? "" + l5 : "0" + l5;
        return l4 + ":" + string + " ";
    }

    @Override
    public void q() {
        int n2;
        if (!bR) {
            bR = true;
        }
        if (!this.cg || this.ov || this.kQ || this.nI) {
            return;
        }
        if (++ff >= 0x7FFFFFFE) {
            ff = 0;
        }
        if (this.jv < 65) {
            ++this.jv;
        }
        if (ff % 7 == 0) {
            for (n2 = 0; n2 < rs.l.j.c.length; ++n2) {
                int n3 = rs.l.j.c[n2];
                ((rs.l.a.a)rs.l.j.b.b(n3)).a();
            }
        }
        if (ff % 15 == 0 && this.bT > 0L) {
            rs.n.e.H[62151].at = "<img=37> @yel@" + Client.c(this.bT - System.currentTimeMillis());
        }
        if (ff % 30 == 0) {
            rs.n.e.H[62152].az[0] = this.bV[this.bU] + 1;
            rs.n.e.H[62152].ax[0] = 1;
            ++this.bU;
            if (this.bU >= this.bV.length) {
                this.bU = 0;
            }
        }
        if (!this.fc) {
            if (!rs.l.b.a.d.g()) {
                this.bO();
            } else {
                rs.l.b.a.d.b.e();
            }
        } else {
            this.bz();
            if (this.iw.b() || this.ix.a() || rs.l.s.d()) {
                fM = true;
            }
            this.h();
            for (n2 = 0; n2 < this.am.size(); ++n2) {
                fv.a(103);
                fv.b(this.am.get(n2).length() - 1);
                fv.a(this.am.get(n2).substring(2));
            }
            this.am.clear();
            n2 = 0;
            if (this.an != null) {
                fv.a(103);
                fv.b(this.an.length() - 1);
                fv.a(this.an.substring(2));
                this.an = null;
            }
            if (ap != null) {
                if (ap.startsWith("::item_loadout")) {
                    n2 = 1;
                    String string = ap.replace("::item_loadout ", "");
                    ArrayList<String> arrayList = new ArrayList<String>();
                    for (int i2 = 0; i2 < string.split(" ").length; ++i2) {
                        String string2 = string.split(" ")[i2];
                        arrayList.add(string2);
                        if (arrayList.size() < 3 && i2 != string.split(" ").length - 1) continue;
                        Object object = "::item_loadout ";
                        for (String string3 : arrayList) {
                            object = (String)object + string3 + " ";
                        }
                        fv.a(103);
                        fv.b(((String)object).length() - 1);
                        fv.a(((String)object).substring(2));
                        arrayList.clear();
                    }
                } else {
                    fv.a(103);
                    fv.b(ap.length() - 1);
                    fv.a(ap.substring(2));
                }
                ap = null;
            }
            if (ao != null) {
                if (ao.startsWith("::equip_loadout")) {
                    n2 = 1;
                }
                fv.a(103);
                fv.b(ao.length() - 1);
                fv.a(ao.substring(2));
                ao = null;
            }
            if (aq != null) {
                fv.a(103);
                fv.b(aq.length() - 1);
                fv.a(aq.substring(2));
                aq = null;
            }
            if (this.ar != null) {
                fv.a(103);
                fv.b(this.ar.length() - 1);
                fv.a(this.ar.substring(2));
                this.ar = null;
            }
            if (this.at != null) {
                fv.a(103);
                fv.b(this.at.length() - 1);
                fv.a(this.at.substring(2));
                this.at = null;
            }
            if (this.as != null) {
                fv.a(103);
                fv.b(this.as.length() - 1);
                fv.a(this.as.substring(2));
                this.as = null;
            }
            rs.n.a.a();
            if (n2 != 0) {
                String string = "::spawn_loadout";
                fv.a(103);
                fv.b(string.length() - 1);
                fv.a(string.substring(2));
            }
            this.cv.a();
        }
        if (rs.h.f.a(this) || rs.h.f.b(this)) {
            this.a(1, "Loading - please wait.", null);
            try {
                Thread.sleep(250L);
            }
            catch (InterruptedException interruptedException) {
                throw new RuntimeException(interruptedException);
            }
            return;
        }
        this.s();
        rs.h.a.a();
        if (this.fc) {
            rs.h.c.a();
        }
    }

    public void e(boolean bl) {
        rs.a.k k2;
        rs.a.k k3;
        if (Client.eR.ac >> 7 == this.gd && Client.eR.ad >> 7 == this.ge) {
            this.gd = 0;
        }
        int n2 = this.ku;
        if (bl) {
            n2 = 1;
        }
        rs.a.k k4 = null;
        if (!bl && Client.eR.m >= 32768) {
            int n3 = Client.eR.m - 32768;
            if (n3 == di) {
                n3 = 2047;
            }
            this.iJ = n3;
            k3 = do[n3];
            if (k3 != null && !k3.aZ.equalsIgnoreCase(Client.eR.aZ)) {
                k4 = k3;
            }
        } else if (this.iJ >= 0 && this.iJ <= do.length - 1 && (k2 = do[this.iJ]) != null && !k2.aZ.equalsIgnoreCase(Client.eR.aZ)) {
            k4 = k2;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            int n5;
            int n6;
            int n7;
            if (bl && rs.f.a.N) {
                k3 = eR;
                n7 = 33538048;
            } else {
                k3 = do[this.kv[i2]];
                n7 = this.kv[i2] << 14;
            }
            if (k3 == null || !k3.l()) continue;
            k3.aU = false;
            int n8 = k3.ac >> 7;
            int n9 = k3.ad >> 7;
            if (n8 < 0 || n8 >= 104 || n9 < 0 || n9 >= 104 || (bl ? rs.f.a.bq : (n6 = ((n5 = eh + (k3.ac - 6 >> 7)) >> 6) * 256 + ((n4 = ei + (k3.ad - 6 >> 7)) >> 6)) == 10806 && this.if.get(n5 + "," + n4) != null)) continue;
            if (k4 != null && k4.ac == k3.ac && k4.ad == k3.ad && !k4.aZ.equals(k3.aZ) && !k3.aZ.equalsIgnoreCase(Client.eR.aZ)) continue;
            if (ed != 197 && rs.f.a.aY && !rs.k.e.a()) {
                boolean bl2 = k3.aU = this.ku >= 35 && !bl && k3.w == k3.t && k3.F <= 0;
            }
            if (k3.bq != null && ff >= k3.bj && ff < k3.bk) {
                k3.aU = false;
                k3.bl = this.c(dw, k3.ad, k3.ac);
                this.dF.a(dw, k3.ad, k3, k3.ae, k3.bw, k3.ac, k3.bl, k3.bt, k3.bv, n7, k3.bu);
                continue;
            }
            if ((k3.ac & 0x7F) == 64 && (k3.ad & 0x7F) == 64) {
                if (this.kS[n8][n9] == gf) continue;
                this.kS[n8][n9] = gf;
            }
            k3.bl = this.c(dw, k3.ad, k3.ac);
            this.dF.a(dw, k3.ae, k3.bl, n7, k3.ad, 60, k3.ac, k3, k3.T);
        }
    }

    private boolean c(rs.n.e e2) {
        int n2;
        int n3;
        int n4;
        int n5 = e2.J;
        if (this.kB == 2) {
            if (n5 == 201) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 1;
                this.eQ = "Enter name of friend to add to list";
            }
            if (n5 == 202) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 2;
                this.eQ = "Enter name of friend to delete from list";
            }
        }
        if (n5 == 205) {
            this.lR = 250;
            return true;
        }
        if (n5 == 501) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 4;
            this.eQ = "Enter name of player to add to list";
        }
        if (n5 == 502) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 5;
            this.eQ = "Enter name of player to delete from list";
        }
        if (n5 >= 300 && n5 <= 313) {
            n4 = (n5 - 300) / 2;
            n3 = n5 & 1;
            n2 = this.mu[n4];
            if (n2 != -1) {
                do {
                    if (n3 == 0 && --n2 < 0) {
                        n2 = rs.d.j.a - 1;
                    }
                    if (n3 != 1 || ++n2 < rs.d.j.a) continue;
                    n2 = 0;
                } while (rs.d.j.b[n2].e || rs.d.j.b[n2].c != n4 + (this.ml ? 0 : 7));
                this.mu[n4] = n2;
                this.md = true;
            }
        }
        if (n5 >= 314 && n5 <= 323) {
            n4 = (n5 - 314) / 2;
            n3 = n5 & 1;
            n2 = this.lB[n4];
            if (n3 == 0 && --n2 < 0) {
                n2 = dU[n4].length - 1;
            }
            if (n3 == 1 && ++n2 >= dU[n4].length) {
                n2 = 0;
            }
            this.lB[n4] = n2;
            this.md = true;
        }
        if (n5 == 324 && !this.ml) {
            this.ml = true;
            this.bs();
        }
        if (n5 == 325 && this.ml) {
            this.ml = false;
            this.bs();
        }
        if (n5 == 326) {
            fv.a(101);
            fv.b(this.ml ? 0 : 1);
            for (n4 = 0; n4 < 7; ++n4) {
                fv.b(this.mu[n4]);
            }
            for (n4 = 0; n4 < 5; ++n4) {
                fv.b(this.lB[n4]);
            }
            return true;
        }
        if (n5 == 613) {
            boolean bl = this.nz = !this.nz;
        }
        if (n5 >= 601 && n5 <= 612) {
            this.bQ();
            if (this.kr.length() > 0) {
                fv.a(218);
                fv.a(o_0.a(this.kr));
                fv.b(n5 - 601);
                fv.b(this.nz ? 1 : 0);
            }
        }
        return false;
    }

    private void a(rs.x.e e2) {
        long l2 = System.currentTimeMillis();
        for (int i2 = 0; i2 < this.kw; ++i2) {
            int n2 = this.kx[i2];
            rs.a.k k2 = do[n2];
            int n3 = e2.y();
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t->[" + n2 + "] STARTING mask=" + n3);
            }
            if ((n3 & 0x40) != 0) {
                n3 += e2.y() << 8;
                if (rs.f.a.d.booleanValue()) {
                    cx.add("\t->shiftingMask=" + n3);
                }
            }
            this.a(n3, n2, e2, k2);
        }
    }

    private void d(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        int n10;
        Object object;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15 = this.dF.a(n6, n4, n2);
        if (((long)n15 ^ 0xFFFFFFFFFFFFFFFFL) != -1L || n15 != 0) {
            n14 = this.dF.b(n6, n4, n2, n15);
            n13 = n14 >> 6 & 3;
            n12 = n14 & 0x1F;
            n11 = n3;
            if (n15 > 0) {
                n11 = n5;
            }
            object = this.aT.m;
            n10 = 24624 + n4 * 4 + (103 - n2) * 512 * 4;
            n9 = this.dF.b(n6, n4, n2);
            r r2 = rs.d.r.c(n9);
            if (r2.ac != -1) {
                rs.l.a a2;
                rs.l.a a3 = a2 = r2.ac >= 0 && r2.ac < this.mq.length ? this.mq[r2.ac] : null;
                if (a2 != null) {
                    int n16 = (r2.U * 4 - a2.j) / 2;
                    int n17 = (r2.af * 4 - a2.k) / 2;
                    a2.a(48 + n4 * 4 + n16, 48 + (104 - n2 - r2.af) * 4 + n17);
                }
            } else if (~r2.ac == 0) {
                if (n12 == 0 || n12 == 2) {
                    if (n13 == 0) {
                        object[n10] = n11;
                        object[n10 + 512] = n11;
                        object[n10 + 1024] = n11;
                        object[n10 + 1536] = n11;
                    } else if (~n13 == -2 || n13 == 1) {
                        object[n10] = n11;
                        object[n10 + 1] = n11;
                        object[n10 + 2] = n11;
                        object[n10 + 3] = n11;
                    } else if (n13 == 2) {
                        object[n10 + 3] = n11;
                        object[n10 + 3 + 512] = n11;
                        object[n10 + 3 + 1024] = n11;
                        object[n10 + 3 + 1536] = n11;
                    } else if (n13 == 3) {
                        object[n10 + 1536] = n11;
                        object[n10 + 1536 + 1] = n11;
                        object[n10 + 1536 + 2] = n11;
                        object[n10 + 1536 + 3] = n11;
                    }
                }
                if (n12 == 3) {
                    if (n13 == 0) {
                        object[n10] = n11;
                    } else if (n13 == 1) {
                        object[n10 + 3] = n11;
                    } else if (n13 == 2) {
                        object[n10 + 3 + 1536] = n11;
                    } else if (n13 == 3) {
                        object[n10 + 1536] = n11;
                    }
                }
                if (n12 == 2) {
                    if (n13 == 3) {
                        object[n10] = n11;
                        object[n10 + 512] = n11;
                        object[n10 + 1024] = n11;
                        object[n10 + 1536] = n11;
                    } else if (n13 == 0) {
                        object[n10] = n11;
                        object[n10 + 1] = n11;
                        object[n10 + 2] = n11;
                        object[n10 + 3] = n11;
                    } else if (n13 == 1) {
                        object[n10 + 3] = n11;
                        object[n10 + 3 + 512] = n11;
                        object[n10 + 3 + 1024] = n11;
                        object[n10 + 3 + 1536] = n11;
                    } else if (n13 == 2) {
                        object[n10 + 1536] = n11;
                        object[n10 + 1536 + 1] = n11;
                        object[n10 + 1536 + 2] = n11;
                        object[n10 + 1536 + 3] = n11;
                    }
                }
            }
        }
        if ((n15 = this.dF.e(n6, n4, n2)) != 0) {
            n14 = this.dF.b(n6, n4, n2, n15);
            n13 = n14 >> 6 & 3;
            n12 = n14 & 0x1F;
            n11 = this.dF.f(n6, n4, n2);
            object = rs.d.r.c(n11);
            if (object.ac != -1) {
                rs.l.a a4;
                rs.l.a a5 = a4 = object.ac >= 0 && object.ac < this.mq.length ? this.mq[object.ac] : null;
                if (a4 != null) {
                    n9 = (object.U * 4 - a4.j) / 2;
                    int n18 = (object.af * 4 - a4.k) / 2;
                    a4.a(48 + n4 * 4 + n9, 48 + (104 - n2 - object.af) * 4 + n18);
                }
            } else if (n12 == 9) {
                n10 = 0xEEEEEE;
                if (n15 > 0) {
                    n10 = 0xEE0000;
                }
                int[] nArray = this.aT.m;
                int n19 = 24624 + n4 * 4 + (103 - n2) * 512 * 4;
                if (n13 == 0 || n13 == 2) {
                    nArray[n19 + 1536] = n10;
                    nArray[n19 + 1024 + 1] = n10;
                    nArray[n19 + 512 + 2] = n10;
                    nArray[n19 + 3] = n10;
                } else {
                    nArray[n19] = n10;
                    nArray[n19 + 512 + 1] = n10;
                    nArray[n19 + 1024 + 2] = n10;
                    nArray[n19 + 1536 + 3] = n10;
                }
            }
        }
        if ((n15 = this.dF.h(n6, n4, n2)) > 0 || n15 != 0) {
            r r3 = rs.d.r.c(n15);
            if (r3.ac != -1) {
                rs.l.a a6;
                rs.l.a a7 = a6 = r3.ac >= 0 && r3.ac < this.mq.length ? this.mq[r3.ac] : null;
                if (a6 != null) {
                    n12 = (r3.U * 4 - a6.j) / 2;
                    n11 = (r3.af * 4 - a6.k) / 2;
                    a6.a(48 + n4 * 4 + n12, 48 + (104 - n2 - r3.af) * 4 + n11);
                }
            }
        }
        if (rs.f.a.aX && this.x.N() && ed == 197 && this.k(n8 = n4 + eh, n7 = n2 + ei)) {
            n12 = 24624 + n4 * 4 + (103 - n2) * 512 * 4;
            if (n12 < 0 || n12 + 3 >= this.aT.m.length) {
                return;
            }
            n11 = this.aT.m[n12];
            int n20 = 0xFF0000;
            n10 = 100;
            int n21 = 256 - n10;
            this.aT.m[n12] = n11 = ((n20 & 0xFF00FF) * n10 + (n11 & 0xFF00FF) * n21 & 0xFF00FF00) + ((n20 & 0xFF00) * n10 + (n11 & 0xFF00) * n21 & 0xFF0000) >> 8;
            this.aT.m[n12 + 1] = n11;
            this.aT.m[n12 + 2] = n11;
            this.aT.m[n12 + 3] = n11;
        }
    }

    private void bt() {
        int n2;
        this.ll = new rs.l.a(this.mo, "titlebox", 0);
        this.lm = new rs.l.a(this.mo, "titlebutton", 0);
        this.nw = new rs.l.a[12];
        int n3 = 0;
        try {
            n3 = Integer.parseInt(this.getParameter("fl_icon"));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (n3 == 0) {
            for (n2 = 0; n2 < 12; ++n2) {
                this.nw[n2] = new rs.l.a(this.mo, "runes", n2);
            }
        } else {
            for (n2 = 0; n2 < 12; ++n2) {
                this.nw[n2] = new rs.l.a(this.mo, "runes", 12 + (n2 & 3));
            }
        }
        this.nV = new f_0(128, 265);
        this.nW = new f_0(128, 265);
        this.jV = new int[256];
        for (n2 = 0; n2 < 64; ++n2) {
            this.jV[n2] = n2 * 262144;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jV[n2 + 64] = 0xFF0000 + 1024 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jV[n2 + 128] = 0xFFFF00 + 4 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jV[n2 + 192] = 0xFFFFFF;
        }
        this.jW = new int[256];
        for (n2 = 0; n2 < 64; ++n2) {
            this.jW[n2] = n2 * 1024;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jW[n2 + 64] = 65280 + 4 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jW[n2 + 128] = 65535 + 262144 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jW[n2 + 192] = 0xFFFFFF;
        }
        this.jX = new int[256];
        for (n2 = 0; n2 < 64; ++n2) {
            this.jX[n2] = n2 * 4;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jX[n2 + 64] = 255 + 262144 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jX[n2 + 128] = 0xFF00FF + 1024 * n2;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.jX[n2 + 192] = 0xFFFFFF;
        }
        this.jU = new int[256];
        this.nP = new int[32768];
        this.nQ = new int[32768];
        this.a((rs.l.a)null);
        this.jI = new int[32768];
        this.jJ = new int[32768];
        this.a(10, "Connecting to fileserver");
        if (!this.jK) {
            this.kq = true;
            this.jK = true;
            this.a(this, 2);
        }
    }

    private static void bu() {
        rs.v_0.h = false;
        e_0.n = false;
        li = false;
        rs.x.h = false;
        rs.d.r.Z = false;
    }

    public static void main(String[] stringArray) {
        try {
            dK = 10;
            dL = 0;
            Client.aa();
            dM = true;
            bW = 32;
            Client client = new Client();
            client.l(503, 765);
            client.a(a.c.b);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(int n2, String string, String string2) {
        int n3 = this.gi.a(n2 == 1 ? string : string2);
        int n4 = string2 == null ? 25 : 38;
        int n5 = !Client.ai() ? 4 : 0;
        int n6 = !Client.ai() ? 4 : 0;
        int n7 = 1 + n5;
        int n8 = 1 + n6;
        rs.l.c.a(n4, n8, n7, 0, n3 + 6);
        rs.l.c.a(1, n8, n7, 0xFFFFFF, n3 + 6);
        rs.l.c.a(n4, n8, n7, 0xFFFFFF, 1);
        rs.l.c.a(1, n4 + n6, n7, 0xFFFFFF, n3 + 6);
        rs.l.c.a(n4, n8, n3 + 6 + n5, 0xFFFFFF, 1);
        this.gi.a(0xFFFFFF, string, 18 + n6, n3 / 2 + 5 + n5);
        if (string2 != null) {
            this.gi.a(0xFFFFFF, string2, 31 + n6, n3 / 2 + 5 + n5);
        }
    }

    private void bv() {
        int n2;
        if (this.iK) {
            this.a(1, "Loading - please wait.", null);
            ee = 1;
            this.jE = System.currentTimeMillis();
            return;
        }
        if (li && ee == 2 && rs.x.f != dw) {
            this.a(1, "Loading - please wait.", null);
            ee = 1;
            this.jE = System.currentTimeMillis();
        }
        if (ee == 1 && (n2 = this.bw()) != 0 && System.currentTimeMillis() - this.jE > 360000L) {
            rs.v.a.e(this.fk + " glcfb " + this.od + "," + n2 + "," + li + "," + ew.g() + "," + dw + "," + this.mx + "," + this.my);
            this.jE = System.currentTimeMillis();
        }
        if (ee == 2 && dw != this.dR) {
            this.dR = dw;
            this.z(dw);
            if (rs.f.a.Q && !rs.k.e.a()) {
                try {
                    rs.k.b.b();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    System.exit(0);
                }
            }
        }
    }

    private int bw() {
        int n2;
        for (n2 = 0; n2 < this.fr.length; ++n2) {
            if (this.fr[n2] == null && this.fS[n2] != -1) {
                return -1;
            }
            if (this.fY[n2] != null || this.fT[n2] == -1) continue;
            return -2;
        }
        n2 = 1;
        for (int i2 = 0; i2 < this.fr.length; ++i2) {
            byte[] byArray = this.fY[i2];
            if (byArray == null) continue;
            int n3 = (this.fR[i2] >> 8) * 64 - eh;
            int n4 = (this.fR[i2] & 0xFF) * 64 - ei;
            if (this.nA) {
                n3 = 10;
                n4 = 10;
            }
            try {
                n2 &= rs.x.a(n3, byArray, n4);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (n2 == 0) {
            return -3;
        }
        if (this.mS) {
            return -4;
        }
        ee = 2;
        rs.x.f = dw;
        this.l();
        fv.a(121);
        return 0;
    }

    public void r() {
        rs.a.l l2 = (rs.a.l)this.ea.b();
        while (l2 != null) {
            if (l2.p != dw || ff > l2.i) {
                l2.b();
            } else if (ff >= l2.h) {
                int n2;
                rs.a.k k2;
                rs.a.j j2;
                if (l2.n > 0 && (j2 = this.cA[l2.n - 1]) != null && j2.ac >= 0 && j2.ac < 13312 && j2.ad >= 0 && j2.ad < 13312) {
                    l2.a(ff, j2.ad, this.c(l2.p, j2.ad, j2.ac) - l2.j, j2.ac);
                }
                if (l2.n < 0 && (k2 = (n2 = -l2.n - 1) == di ? eR : do[n2]) != null && k2.ac >= 0 && k2.ac < 13312 && k2.ad >= 0 && k2.ad < 13312) {
                    l2.a(ff, k2.ad, this.c(l2.p, k2.ad, k2.ac) - l2.j, k2.ac);
                }
                l2.a(this.dE);
                this.dF.a(dw, l2.o, (int)l2.m, -1, (int)l2.l, 60, (int)l2.k, l2, false);
            }
            l2 = (rs.a.l)this.ea.d();
        }
    }

    @Override
    public AppletContext getAppletContext() {
        return rs.v.a.h.getAppletContext();
    }

    public void s() {
        rs.cache.c c2;
        while ((c2 = ew.b()) != null) {
            int n2;
            if (c2.j == 0) {
                rs.a.h.a(c2.l, c2.m, c2.k == 1);
                fb = true;
                if (this.gp != -1) {
                    fM = true;
                }
            }
            if (c2.j == 1) {
                n2 = (c2.l[1] & 0xFF) + ((c2.l[0] & 0xFF) << 8);
                if (n2 == 420) {
                    rs.u.b.a(c2.m, c2.l);
                } else {
                    rs.k.a(c2.m, c2.l, c2.k == 1);
                }
            }
            if (c2.j == 2) {
                if (c2.k == 1) {
                    l_0.a.a(c2.m, (Object)c2.l);
                } else if (c2.m == this.oi && c2.l != null) {
                    this.a(this.oj, c2.l);
                }
            }
            if (c2.j == 3 && (ee == 1 || this.bX)) {
                for (n2 = 0; n2 < this.fr.length; ++n2) {
                    if (this.fS[n2] == c2.m) {
                        this.fr[n2] = c2.l;
                        if (c2.l != null) break;
                        this.fS[n2] = -1;
                        break;
                    }
                    if (this.fT[n2] != c2.m) continue;
                    this.fY[n2] = c2.l;
                    if (c2.l != null) break;
                    this.fT[n2] = -1;
                    break;
                }
            }
            if (c2.j != 93 || !ew.c(c2.m)) continue;
            rs.x.a(new rs.x.e(c2.l), ew);
        }
        return;
    }

    private boolean a(byte[] byArray, int n2) {
        return byArray == null || rs.v.a.a(byArray, n2);
    }

    private void C(int n2) {
        rs.n.e e2 = rs.n.e.H[n2];
        if (rs.n.e.H[n2] == null) {
            System.out.println("Nulled interface!");
        }
        for (int i2 = 0; i2 < e2.al.length && e2.al[i2] != -1; ++i2) {
            rs.n.e e3 = rs.n.e.H[e2.al[i2]];
            if (e3.aI == 1) {
                this.C(e3.aw);
            }
            e3.ar = 0;
            e3.F = 0;
        }
    }

    public void t() {
        if (this.jZ != 2) {
            return;
        }
        this.g((this.kW - eh << 7) + this.kZ, this.kY * 2, (this.kX - ei << 7) + this.la);
        if (this.dN > -1 && ff % 20 < 10) {
            this.mX[0].f(this.dN - 12, this.dO - 28);
        }
    }

    private void bx() {
        if (this.eA != 0) {
            int n2;
            if (!this.hS) {
                ++this.dT;
            }
            int n3 = n2 = this.hS ? 16 : 5;
            if (rs.c_0.hP > this.eB + n2 || rs.c_0.hP < this.eB - n2 || rs.c_0.hQ > this.eC + n2 || rs.c_0.hQ < this.eC - n2) {
                this.op = true;
            }
            if (this.hM == 0) {
                if (this.eA == 2) {
                    fb = true;
                }
                if (this.eA == 3) {
                    fM = true;
                }
                this.eA = 0;
                if (this.op && this.dT >= rs.f.a.bd) {
                    this.mw = -1;
                    this.H();
                    if (this.mw == this.ex && this.mv != this.ey) {
                        rs.n.e e2 = rs.n.e.H[this.ex];
                        boolean bl = false;
                        if (this.ex == 33003 && (this.mv == 0 || this.mv == 2 || this.mv == 9 || this.mv == 11 || this.ey == 0 || this.ey == 2 || this.ey == 9 || this.ey == 11)) {
                            bl = true;
                        }
                        if (!bl) {
                            int n4 = 0;
                            if (this.kM == 1 && e2.J == 206) {
                                n4 = 1;
                            }
                            if (e2.az[this.mv] <= 0) {
                                n4 = 0;
                            }
                            if (e2.ag) {
                                int n5 = this.ey;
                                int n6 = this.mv;
                                e2.az[n6] = e2.az[n5];
                                e2.ax[n6] = e2.ax[n5];
                                e2.az[n5] = -1;
                                e2.ax[n5] = 0;
                            } else if (n4 == 1) {
                                int n7 = this.ey;
                                int n8 = this.mv;
                                while (n7 != n8) {
                                    if (n7 > n8) {
                                        e2.a(n7, n7 - 1);
                                        --n7;
                                        continue;
                                    }
                                    if (n7 >= n8) continue;
                                    e2.a(n7, n7 + 1);
                                    ++n7;
                                }
                            } else {
                                e2.a(this.ey, this.mv);
                            }
                            fv.a(214);
                            fv.p(this.ex);
                            fv.l(n4);
                            fv.p(this.ey);
                            fv.n(this.mv);
                        }
                    } else if (this.mw == 33003 && this.ex == 33002 || this.mw == 33002 && this.ex == 33003) {
                        int n9 = this.ey;
                        int n10 = this.mv;
                        boolean bl = false;
                        if (this.mw == 33003 && (n10 == 0 || n10 == 2 || n10 == 9 || n10 == 11)) {
                            bl = true;
                        }
                        if (this.ex == 3303 && (n9 == 0 || n9 == 2 || n9 == 9 || n9 == 11)) {
                            bl = true;
                        }
                        if (!bl) {
                            rs.n.e e3 = rs.n.e.H[this.ex];
                            rs.n.e e4 = rs.n.e.H[this.mw];
                            int n11 = e4.az[n10];
                            int n12 = e4.ax[n10];
                            e4.az[n10] = e3.az[n9];
                            e4.ax[n10] = e3.ax[n9];
                            e3.az[n9] = n11;
                            e3.ax[n9] = n12;
                        }
                    }
                } else if ((this.ow == 1 || this.y(this.eV - 1)) && this.eV > 2) {
                    this.bK();
                } else if (this.hS && this.iQ) {
                    this.a(this.iP.a, this.iP.b, this.iP.c, this.iP.d, this.iP.e, this.iP.l);
                } else if (this.eV > 0) {
                    this.D(this.eV - 1);
                }
                this.oq = 10;
                this.hU = 0;
            }
        }
    }

    @Override
    protected boolean u() {
        return rs.f.a.be && this.fc;
    }

    @Override
    protected void v() {
        this.eA = 0;
        this.dT = 0;
        this.op = false;
        this.iQ = false;
        this.iO = 0;
        this.hU = 0;
        this.hM = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void by() {
        int n2;
        int n3;
        rs.m.a a2 = this.hR;
        synchronized (a2) {
            n3 = this.hT;
            n2 = this.hR.a(this.iM);
        }
        try {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (n3 != this.hT || !this.fc || !this.hJ) {
                    this.v();
                    break;
                }
                a.a a3 = this.iM[i2];
                this.hU = 0;
                if (a3.a == 4) {
                    this.v();
                    continue;
                }
                if (a3.a == 5) {
                    Client.n(a3.b);
                    continue;
                }
                hP = a3.c;
                hQ = a3.d;
                if (a3.a == 1) {
                    this.hV = a3.c;
                    this.hW = a3.d;
                    this.hX = a3.i;
                    this.hU = a3.b;
                    this.hM = a3.b;
                    if (this.cD != null && a3.b == 1) {
                        this.cD = null;
                        fM = true;
                        continue;
                    }
                    if (!dj && this.eA == 0) {
                        this.H();
                        this.bM();
                    }
                    this.bm();
                    continue;
                }
                if (a3.a == 2) {
                    if (a3.b == this.iO) {
                        if (this.iQ && !this.iP.a(this)) {
                            this.v();
                            continue;
                        }
                        this.hM = 0;
                        this.g(a3.i);
                        this.bx();
                        this.iQ = false;
                        this.iO = 0;
                        continue;
                    }
                    if (a3.b != this.hM) continue;
                    this.hM = 0;
                    continue;
                }
                if (a3.a != 3 || this.eA == 0) continue;
                if (a3.e < this.eB - 16 || a3.f > this.eB + 16 || a3.g < this.eC - 16 || a3.h > this.eC + 16) {
                    this.op = true;
                }
                this.g(a3.i);
                this.bx();
            }
        }
        catch (RuntimeException runtimeException) {
            this.v();
            this.bg();
            throw runtimeException;
        }
        finally {
            this.hU = 0;
            this.bh();
        }
        if (this.eA != 0) {
            this.g(System.currentTimeMillis());
        }
    }

    private void g(long l2) {
        this.dT = (int)Math.min(Integer.MAX_VALUE, Math.max(0L, l2 - this.iN) / 20L);
    }

    private void bz() {
        int n2;
        int n3;
        if (this.lR > 0) {
            --this.lR;
        }
        for (n3 = 0; n3 < 100 && this.bP(); ++n3) {
        }
        if (!this.fc) {
            return;
        }
        if (System.currentTimeMillis() - this.iR >= 500L) {
            this.iR = System.currentTimeMillis() + 500L;
            if (rs.d.d.e == 0) {
                rs.d.d.e = 1;
            }
            if (++rs.d.d.e > 5) {
                rs.d.d.e = 1;
            }
        }
        if (this.hU != 0) {
            long l2 = (this.hX - this.oe) / 50L;
            if (l2 > 4095L) {
                l2 = 4095L;
            }
            this.oe = this.hX;
            n2 = this.hW;
            if (n2 < 0) {
                n2 = 0;
            } else if (n2 > 502) {
                n2 = 502;
            }
            int n4 = this.hV;
            if (n4 < 0) {
                n4 = 0;
            } else if (n4 > 764) {
                n4 = 764;
            }
            int n5 = n2 * 765 + n4;
            boolean bl = false;
            if (this.hU == 2) {
                bl = true;
            }
            int n6 = (int)l2;
        }
        if (this.lS > 0) {
            --this.lS;
        }
        if (this.hY[1] == 1 || this.hY[2] == 1 || this.hY[3] == 1 || this.hY[4] == 1) {
            this.lT = true;
        }
        if (this.lT && this.lS <= 0) {
            this.lS = 20;
            this.lT = false;
            fv.a(86);
            fv.d(this.fs);
            fv.o(this.ft);
        }
        if (this.hJ && !this.lf) {
            this.lf = true;
            fv.a(3);
            fv.b(1);
        }
        if (!this.hJ && this.lf) {
            this.lf = false;
            fv.a(3);
            fv.b(0);
        }
        this.bv();
        this.bJ();
        this.K();
        ++this.lP;
        if (this.lP > 750 && rs.f.a.l.booleanValue()) {
            this.x();
        }
        this.bI();
        this.bF();
        this.bq();
        ++this.dE;
        if (this.dv != 0) {
            this.du += 20;
            if (this.du >= 400) {
                this.dv = 0;
            }
        }
        if (this.fX != 0) {
            ++this.oq;
            if (this.oq >= 15) {
                if (this.fX == 2) {
                    fb = true;
                }
                if (this.fX == 3) {
                    fM = true;
                }
                this.fX = 0;
            }
        }
        if (this.hS) {
            this.by();
        } else {
            this.bx();
        }
        if (rs.v_0.r != -1 && !rs.v_0.q) {
            n3 = rs.v_0.r;
            int n7 = rs.v_0.s;
            n2 = this.a(0, 0, 0, 0, Client.eR.l[0], 0, 0, n7, Client.eR.k[0], true, n3) ? 1 : 0;
            rs.v_0.r = -1;
            if (n2 != 0) {
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 1;
                this.du = 0;
            }
        }
        if (this.hU == 1 && this.cD != null) {
            this.cD = null;
            fM = true;
            this.hU = 0;
        }
        this.bm();
        if (this.hM == 1 || this.hU == 1) {
            ++this.oc;
        }
        if (ee == 2) {
            this.S();
        }
        if (ee == 2 && this.fe) {
            this.p();
        }
        n3 = 0;
        while (n3 < 5) {
            int n8 = n3++;
            this.eg[n8] = this.eg[n8] + 1;
        }
        this.C();
        ++this.hL;
        ++this.hK;
        if (this.hK > 4500) {
            this.lR = 250;
            this.hK -= 500;
            fv.a(202);
        }
        ++this.lQ;
        if (this.lQ > 50) {
            fv.a(0);
        }
        if (!rs.f.a.aF && ic > 0L && !rs.f.a.aE && System.currentTimeMillis() - this.id > ic && this.ie.size() > 0) {
            for (rs.q.a.a a2 : this.ie) {
                fv.a(41);
                fv.d(a2.a());
                fv.o(a2.b());
                fv.o(a2.c());
            }
            this.ie.clear();
        }
        try {
            if (this.nD != null && Client.fv.h > 0) {
                this.nD.a(Client.fv.h, Client.fv.g);
                Client.fv.h = 0;
                this.lQ = 0;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.x();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.br();
        }
    }

    private void bA() {
        n_0 n_02 = (n_0)this.nL.b();
        while (n_02 != null) {
            if (n_02.g == -1) {
                n_02.o = 0;
                this.a(n_02);
            } else {
                n_02.b();
            }
            n_02 = (n_0)this.nL.d();
        }
    }

    public void w() {
    }

    public void b(int n2, String string, String string2) {
        if (this.G == null) {
            return;
        }
        this.G.a(n2, string, string2);
    }

    @Override
    public void a(int n2, String string) {
        if (this.G == null) {
            return;
        }
        this.G.a(n2, string, "@yel@Current Progress - " + n2 + "%");
    }

    public void a(int n2, int n3, int n4, int n5, rs.n.e e2, int n6, boolean bl, int n7) {
        int n8 = this.lp ? 32 : 0;
        this.lp = false;
        if (n4 >= n2 && n4 < n2 + 16 && n5 >= n6 && n5 < n6 + 16) {
            e2.V -= this.oc * 4;
            if (bl) {
                fb = true;
            }
        } else if (n4 >= n2 && n4 < n2 + 16 && n5 >= n6 + n3 - 16 && n5 < n6 + n3) {
            e2.V += this.oc * 4;
            if (bl) {
                fb = true;
            }
        } else if (n4 >= n2 - n8 && n4 < n2 + 16 + n8 && n5 >= n6 + 16 && n5 < n6 + n3 - 16 && this.oc > 0) {
            int n9 = (n3 - 32) * n3 / n7;
            if (n9 < 8) {
                n9 = 8;
            }
            int n10 = n5 - n6 - 16 - n9 / 2;
            int n11 = n3 - 32 - n9;
            e2.V = (n7 - n3) * n10 / n11;
            if (bl) {
                fb = true;
            }
            this.lp = true;
        }
    }

    private boolean d(int n2, int n3, int n4, int n5) {
        Object object;
        int n6 = this.dF.b(dw, n4, n3, n2);
        if (n2 == -1) {
            return false;
        }
        int n7 = n6 & 0x1F;
        int n8 = n6 >> 6 & 3;
        if (n7 == 10 || n7 == 11 || n7 == 22) {
            int n9;
            int n10;
            object = rs.d.r.c(n5);
            if (n8 == 0 || n8 == 2) {
                n10 = ((r)object).U;
                n9 = ((r)object).af;
            } else {
                n10 = ((r)object).af;
                n9 = ((r)object).U;
            }
            if (rs.f.a.c()) {
                System.out.println("on :interact_object, " + n5 + ", :width => " + n10 + ", :height => " + n9 + ", :source => pos(" + (n4 + eh) + ", " + (n3 + ei) + ") do |player, event|");
            }
            int n11 = ((r)object).ak & 0xF;
            if (n8 != 0) {
                n11 = (n11 << n8 & 0xF) + (n11 >> 4 - n8);
            }
            boolean bl = this.a(2, 0, n9, 0, Client.eR.l[0], n10, n11, n3, Client.eR.k[0], false, n4);
        } else {
            if (rs.f.a.c()) {
                System.out.println("on :interact_object, " + n5 + ", :width => 1, :height => 1, :source => pos(" + (n4 + eh) + ", " + (n3 + ei) + ") do |player, event|");
            }
            this.a(2, n8, 0, n7 + 1, Client.eR.l[0], 0, 0, n3, Client.eR.k[0], false, n4);
        }
        object = new ObjectInteraction();
        ((ObjectInteraction)object).setX(n4);
        ((ObjectInteraction)object).setY(n3);
        ((ObjectInteraction)object).setZ(dw);
        ((ObjectInteraction)object).setHash(n2);
        ((ObjectInteraction)object).setId(n5);
        this.p.post(object);
        this.ds = this.hV;
        this.dt = this.hW;
        this.dv = 2;
        this.du = 0;
        return true;
    }

    private boolean h(int n2, int n3, int n4) {
        int n5 = n2 >> 14 & Short.MAX_VALUE;
        int n6 = this.dF.b(dw, n4, n3, n2);
        if (n6 == -1) {
            return false;
        }
        int n7 = n6 & 0x1F;
        int n8 = n6 >> 6 & 3;
        if (n7 == 10 || n7 == 11 || n7 == 22) {
            int n9;
            int n10;
            r r2 = rs.d.r.c(n5);
            if (n8 == 0 || n8 == 2) {
                n10 = r2.U;
                n9 = r2.af;
            } else {
                n10 = r2.af;
                n9 = r2.U;
            }
            int n11 = r2.ak & 0xF;
            if (n8 != 0) {
                n11 = (n11 << n8 & 0xF) + (n11 >> 4 - n8);
            }
            this.a(2, 0, n9, 0, Client.eR.l[0], n10, n11, n3, Client.eR.k[0], false, n4);
        } else {
            this.a(2, n8, 0, n7 + 1, Client.eR.l[0], 0, 0, n3, Client.eR.k[0], false, n4);
        }
        this.ds = this.hV;
        this.dt = this.hW;
        this.dv = 2;
        this.du = 0;
        return true;
    }

    public rs.x.f a(int n2, String string, String string2, int n3, int n4) {
        byte[] byArray = null;
        try {
            if (Client.ew.b.a()[0] != null) {
                byArray = Client.ew.b.a()[0].a(n2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (byArray != null) {
            return new rs.x.f(byArray, string);
        }
        this.a(n4, "Error loading: " + string);
        System.out.println("Error loading \"" + string + "\"");
        return null;
    }

    public void x() {
        try {
            if (this.lR > 0) {
                this.br();
                return;
            }
            this.gi.a(0, "Connection lost", 144, 257);
            this.gi.a(0xFFFFFF, "Connection lost", 143, 256);
            this.gi.a(0, "Please wait - attempting to reestablish", 159, 257);
            this.gi.a(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
            if (rs.k.e.a()) {
                this.a.b(false);
            }
            this.lV = 0;
            this.gd = 0;
            rs.q.b b2 = this.nD;
            this.fc = false;
            this.el = 0;
            this.a(this.fk, this.fl, true);
            if (!this.fc) {
                this.br();
            }
            b2.a();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static int c(int n2, int n3) {
        Random random = new Random();
        int n4 = random.nextInt(n3 - n2 + 1) + n2;
        return n4;
    }

    private void D(int n2) {
        if (n2 < 0) {
            return;
        }
        this.a(this.eI[n2], this.eJ[n2], this.eF[n2], this.eG[n2], this.eH[n2], this.fx[n2]);
    }

    private void a(int n2, int n3, int n4, int n5, int n6, String string) {
        rs.a.j j2;
        int n7;
        String string2;
        int n8;
        rs.a.k k2;
        String string3;
        int n9;
        rs.a.k k3;
        rs.a.k k4;
        rs.a.k k5;
        rs.a.j j3;
        rs.a.j j4;
        rs.a.j j5;
        rs.a.j j6;
        rs.a.j j7;
        Object object;
        rs.a.j j8;
        int n10;
        int n11;
        int n12;
        EntityInteraction entityInteraction;
        Object object2;
        int n13;
        if (this.fN != 0 && this.fN != 25) {
            this.fN = 0;
            fM = true;
        }
        int n14 = n4;
        int n15 = n5;
        int n16 = n13 = n3 > Short.MAX_VALUE ? n6 : n3 >> 14 & Short.MAX_VALUE;
        if (n2 == 1107 && cI > 0 && !rs.n.a.a.c.c()) {
            rs.n.a.a.c.b();
        }
        if (n2 == 632) {
            if (cH == 36000 && ag) {
                n2 = n5 == 30074 ? rs.n.c.ac.bL : rs.n.c.ac.bK;
            }
            if (cH == 40600 && ag) {
                n2 = 431;
            }
            if ((n5 == 2006 || n5 == 5382) && cH == 23000 && ag) {
                n2 = 431;
            }
        }
        if (n2 >= 2000) {
            n2 -= 2000;
        }
        if (n2 == 582 && (object2 = this.cA[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, ((rs.a.j)object2).l[0], Client.eR.k[0], false, ((rs.a.j)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(57);
            fv.o(this.oM);
            fv.o(n3);
            fv.n(this.gs);
            fv.o(this.gt);
            entityInteraction = new EntityInteraction();
            entityInteraction.setEntity((rs.a.c)object2);
            this.p.post(entityInteraction);
        }
        if (n2 == 234) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(236);
            fv.n(n5 + ei);
            fv.d(n3);
            fv.n(n4 + eh);
        }
        if (n2 == 291) {
            fv.a(140);
            fv.o(n4);
            fv.d(n5);
            fv.o(n3);
        }
        if (n2 == 300) {
            fv.a(141);
            fv.o(n4);
            fv.d(n5);
            fv.o(n3);
            fv.g(this.ih);
        }
        if (n2 == 62 && this.d(n3, n15, n14, n13)) {
            fv.a(192);
            fv.d(this.gt);
            fv.n(n13);
            fv.p(n15 + ei);
            fv.n(this.gs);
            fv.p(n14 + eh);
            fv.d(this.oM);
        }
        if (n2 == 511) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(25);
            fv.n(this.gt);
            fv.o(this.oM);
            fv.d(n3);
            fv.o(n5 + ei);
            fv.p(this.gs);
            fv.d(n4 + eh);
        }
        if (n2 == 1500) {
            this.cp = !this.cp;
            fv.a(185);
            if (this.cp) {
                fv.d(5000);
            } else {
                fv.d(4999);
            }
            this.v.c();
        }
        if (n2 == 1506) {
            fv.a(185);
            fv.d(5001);
        }
        if (n2 == 2245) {
            rs.n.c.ap.h();
        }
        if (n2 == 2246) {
            Client.n(6);
        }
        if (n2 == 74) {
            fv.a(122);
            fv.p(n5);
            fv.o(n4);
            fv.n(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
            if (n3 == 23195 || n3 == 27405) {
                this.eW = 1;
                this.bq = 1339;
                this.nl = 1339;
                this.nm = 10;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@catch@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if (n2 == 315) {
            object2 = rs.n.e.H[n5];
            boolean bl = true;
            if (((rs.n.e)object2).J > 0) {
                bl = this.c((rs.n.e)object2);
            }
            if (object2 instanceof rs.n.a.a.a) {
                if (cI == -1) {
                    rs.n.a.a.c.a(((rs.n.e)object2).aw);
                } else {
                    rs.n.a.a.c.b();
                }
            }
            if (n5 >= 70000 && n5 <= 70600 && rs.n.c.af.e.get(n5) != null) {
                this.gb = false;
                this.fN = 4;
                this.dY = "";
                fM = true;
                this.iS = rs.n.c.af.e.get(n5).b();
                return;
            }
            if (bl) {
                int n17 = -1;
                if (n5 == 65796 && rs.n.e.H[44000].at.equals("")) {
                    n17 = this.og;
                }
                if (n5 == 47002 || n5 == 64606) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 27;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item to search";
                }
                if (n5 == 47006 || n5 == 64605) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 26;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of monster to search";
                }
                if (n5 == 25115 || n17 == 0) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 28;
                    this.og = 0;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item to search:";
                }
                if (n5 == 25113 || n17 == 1) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 29;
                    this.og = 1;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of player to search:";
                }
                if (n5 == 24710 || n17 == 2) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 30;
                    this.og = 2;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item history to search:";
                }
                rs.n.c.ap.m(n5);
                rs.n.c.ai.m(n5);
                if (n5 == 43508) {
                    rs.f.a.bj = !rs.f.a.bj;
                    ah_0.i();
                }
                if (cH == ad_0.bI) {
                    ad_0.b(n5, true);
                }
                if (n5 >= 63001 && n5 <= 63021 || n5 == 63025 || n5 == 63024 || n5 == 63027 || n5 >= 63046 && n5 <= 63051) {
                    rs.n.c.w.m(n5);
                }
                for (rs.n.c c2 : rs.n.d.a) {
                    c2.a(n5);
                }
                y_0.m(n5);
                if (n5 == 26004) {
                    rs.n.c.h.a(this);
                }
                if ((n5 == 30162 || n5 == 7455 || n5 == 13095) && rs.f.a.ba) {
                    this.a("<img=25> You currently have this spell locked!", 0, null);
                } else {
                    fv.a(185);
                    fv.d(n5);
                }
                if (n5 == 39002) {
                    this.gp = 35112;
                    rs.n.e.H[35115].E = rs.f.a.aS ? v_0.f : v_0.g;
                    f_0 f_02 = rs.n.e.H[35115].aG = rs.f.a.aS ? v_0.f : v_0.g;
                }
                if (n5 == 33006) {
                    rs.n.c.al.h();
                }
                if (cH == rs.n.c.ae.d) {
                    int n18;
                    boolean bl2 = false;
                    int n19 = rs.n.c.ae.e;
                    for (n18 = 0; n18 < rs.n.c.ae.c.size(); ++n18) {
                        if (n5 != (n12 = n19++)) continue;
                        bl2 = true;
                        break;
                    }
                    n19 = rs.n.c.ae.e;
                    if (bl2) {
                        for (n18 = 0; n18 < rs.n.c.ae.c.size(); ++n18) {
                            if (n5 == (n12 = n19++)) {
                                rs.n.e.H[n12].E = new f_0("vote/sprite 2");
                                rs.n.e.H[n12].aG = new f_0("vote/sprite 2");
                                continue;
                            }
                            rs.n.e.H[n12].E = new f_0("vote/sprite 1");
                            rs.n.e.H[n12].aG = new f_0("vote/sprite 2");
                        }
                    }
                }
            }
        }
        if (n2 == 561 && (object2 = do[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, ((rs.a.k)object2).l[0], Client.eR.k[0], false, ((rs.a.k)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((nO += n3) >= 90) {
                fv.a(136);
                nO = 0;
            }
            fv.a(128);
            fv.d(n3);
        }
        if (n2 == 20 && (object2 = this.cA[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, ((rs.a.j)object2).l[0], Client.eR.k[0], false, ((rs.a.j)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(155);
            fv.n(n3);
            entityInteraction = new EntityInteraction();
            entityInteraction.setEntity((rs.a.c)object2);
            this.p.post(entityInteraction);
        }
        if (n2 == 779 && (object2 = do[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, ((rs.a.k)object2).l[0], Client.eR.k[0], false, ((rs.a.k)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(153);
            fv.n(n3);
        }
        if (n2 == 516) {
            if (!dj) {
                this.dF.b(this.hW - 4, this.hV - 4);
            } else if (rs.v_0.q) {
                rs.v_0.q = false;
            } else {
                this.dF.b(n5 - 4, n4 - 4);
            }
        }
        if (n2 == 518) {
            if (!dj) {
                this.dF.b(this.hW - 4, this.hV - 4);
            } else {
                this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 1;
                this.du = 0;
            }
        }
        if (n2 == 517) {
            ap = "::skipbh";
        }
        if (n2 == 519) {
            this.x.C = true;
        }
        if (n2 == 520) {
            this.x.C = false;
        }
        if (n2 == 521) {
            ap = "::bhtask";
        }
        if (n2 == 522) {
            ap = "::bhtaskinfo";
        }
        if (n2 == 523) {
            ap = "::bhtaskskip";
        }
        if (n2 == 1062) {
            if ((kO += eh) >= 113) {
                fv.a(183);
                fv.f(15086193);
                kO = 0;
            }
            this.d(n3, n5, n4, n13);
            fv.a(228);
            fv.o(n13);
            fv.o(n5 + ei);
            fv.d(n4 + eh);
        }
        if (n2 == 679 && !this.eZ) {
            fv.a(40);
            fv.d(n5);
            this.eZ = true;
        }
        if (n2 == 431) {
            fv.a(129);
            fv.o(n4);
            fv.d(n5);
            fv.o(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if ((n2 == 337 || n2 == 42 || n2 == 792 || n2 == 322) && (n11 = ((String)(object2 = string)).indexOf("@whi@")) != -1) {
            long l2 = o_0.a(((String)object2).substring(n11 + 5).trim());
            if (n2 == 337) {
                this.a(l2);
            }
            if (n2 == 42) {
                this.h(l2);
            }
            if (n2 == 792) {
                this.f(l2);
            }
            if (n2 == 322) {
                this.i(l2);
            }
        }
        if (n2 == 53) {
            fv.a(135);
            fv.n(n4);
            fv.o(n5);
            fv.n(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 638) {
            fv.a(176);
            fv.n(n4);
            fv.o(n5);
            fv.n(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 539) {
            fv.a(16);
            fv.o(n3);
            fv.p(n4);
            fv.p(n5);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
            if (n3 == 23912) {
                this.eW = 1;
                this.bq = 1339;
                this.nl = 1339;
                this.nm = 10;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@catch@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if ((n2 == 484 || n2 == 6) && (n10 = ((String)(object2 = string)).indexOf("@whi@")) != -1) {
            object2 = ((String)object2).substring(n10 + 5).trim();
            String string4 = o_0.c(o_0.a(o_0.a((String)object2)));
            boolean bl = false;
            for (int i2 = 0; i2 < this.ku; ++i2) {
                rs.a.k k6 = do[this.kv[i2]];
                if (k6 == null || k6.aZ == null || !k6.aZ.equalsIgnoreCase(string4)) continue;
                if (n2 == 484) {
                    fv.a(39);
                    fv.n(this.kv[i2]);
                } else {
                    this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, k6.l[0], Client.eR.k[0], false, k6.k[0]);
                }
                if (n2 == 6) {
                    if ((nO += n3) >= 90) {
                        fv.a(136);
                        nO = 0;
                    }
                    fv.a(73);
                    fv.n(this.kv[i2]);
                }
                bl = true;
                break;
            }
            if (!bl) {
                this.a("Unable to find " + string4, 0, "");
            }
        }
        if (n2 == 870) {
            fv.a(53);
            fv.d(n4);
            fv.o(this.gs);
            fv.p(n3);
            fv.d(this.gt);
            fv.n(this.oM);
            fv.d(n5);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 847) {
            if (!(!rs.f.a.aL || rs.n.e.H[n5].ah == cH || rs.n.e.H[n5].ah == this.gp || (object2 = rs.d.k.f(n3)) == null || ((rs.d.k)object2).w == null || ((rs.d.k)object2).w.startsWith("@") || ((rs.d.k)object2).w.startsWith("<") || ((rs.d.k)object2).w.contains(" pet") || ((rs.d.k)object2).w.contains(" flask") || ((rs.d.k)object2).w.contains(" potion"))) {
                this.a("You have spawnable item dropping locked / disabled!", 0, null);
                return;
            }
            fv.a(87);
            fv.o(n3);
            fv.d(n5);
            fv.o(n4);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 1300) {
            Client.f("https://spawnpk.net/forums/index.php?/forum/23-report-a-player/");
        }
        if (n2 == 626) {
            String string5;
            object2 = rs.n.e.H[n5];
            this.eW = 1;
            this.bq = ((rs.n.e)object2).aw;
            this.nl = n5;
            this.nm = ((rs.n.e)object2).ai;
            this.gr = 0;
            fb = true;
            String string6 = ((rs.n.e)object2).R;
            if (string6.indexOf(" ") != -1) {
                string6 = string6.substring(0, string6.indexOf(" "));
            }
            if ((string5 = ((rs.n.e)object2).R).indexOf(" ") != -1) {
                string5 = string5.substring(string5.indexOf(" ") + 1);
            }
            this.nn = string6 + " " + ((rs.n.e)object2).N + " " + string5;
            if (this.nm == 16) {
                fb = true;
                fL = 3;
                eM = true;
            }
            return;
        }
        if (n2 == 104) {
            object2 = rs.n.e.H[n5];
            T = ((rs.n.e)object2).aw;
            if (!this.U) {
                this.U = true;
                this.S = ((rs.n.e)object2).aw;
                fv.a(185);
                fv.d(((rs.n.e)object2).aw);
            } else if (this.S == ((rs.n.e)object2).aw) {
                this.U = false;
                this.S = 0;
                fv.a(185);
                fv.d(6666);
            } else if (this.S != ((rs.n.e)object2).aw) {
                this.U = true;
                this.S = ((rs.n.e)object2).aw;
                fv.a(185);
                fv.d(((rs.n.e)object2).aw);
            }
        }
        if (n2 == 78) {
            fv.a(117);
            fv.p(n5);
            fv.p(n3);
            fv.n(n4);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 27 && (object2 = do[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((lz += n3) >= 54) {
                fv.a(189);
                fv.b(234);
                lz = 0;
            }
            fv.a(73);
            fv.n(n3);
        }
        if (n2 == 213) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(79);
            fv.n(n5 + ei);
            fv.d(n3);
            fv.o(n4 + eh);
        }
        if (n2 == 632) {
            if (rs.n.e.H[n5] != null && n5 == 5382) {
                rs.n.e e2 = rs.n.e.H[n5];
                if (e2.ax != null && e2.ax.length > n4 && e2.ax[n4] == 0) {
                    if (dj) {
                        ap = "::phrelease " + n3;
                    } else {
                        this.bK();
                    }
                }
            }
            fv.a(145);
            fv.o(n5);
            fv.o(n4);
            fv.o(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        int n20 = this.gy;
        int n21 = this.gu;
        int n22 = this.cE;
        int n23 = this.fZ;
        int n24 = this.fj;
        if (n2 == 1003) {
            this.gy = 2;
            fM = true;
        }
        if (n2 == 1002) {
            this.gy = 1;
            fM = true;
        }
        if (n2 == 1001) {
            this.gy = 0;
            fM = true;
        }
        if (n2 == 1000) {
            this.v.a(rs.i.a.g);
        }
        if (n2 == 999) {
            this.v.a(rs.i.a.b);
        }
        if (n2 == 1600) {
            this.v.a(rs.i.a.f);
        }
        if (n2 == 1601) {
            this.gw = 0;
            this.ok = true;
            fM = true;
        }
        if (n2 == 1602) {
            this.gw = 2;
            this.ok = true;
            fM = true;
        }
        if (n2 == 997) {
            this.gu = 3;
            this.ok = true;
            fM = true;
        }
        if (n2 == 996) {
            this.gu = 2;
            this.ok = true;
            fM = true;
        }
        if (n2 == 995) {
            this.gu = 1;
            this.ok = true;
            fM = true;
        }
        if (n2 == 994) {
            this.gu = 0;
            this.ok = true;
            fM = true;
        }
        if (n2 == 993) {
            this.v.a(rs.i.a.c);
        }
        if (n2 == 992) {
            this.cE = 2;
            this.ok = true;
            fM = true;
        }
        if (n2 == 991) {
            this.cE = 1;
            this.ok = true;
            fM = true;
        }
        if (n2 == 990) {
            this.cE = 0;
            this.ok = true;
            fM = true;
        }
        if (n2 == 989) {
            this.v.a(rs.i.a.d);
        }
        if (n2 == 1425) {
            for (int i3 = 0; i3 < 200; ++i3) {
                if (this.dC[i3] == null || (n12 = this.dz[i3]) != 3 && n12 != 5 && n12 != 6 && n12 != 7) continue;
                this.dC[i3] = null;
            }
        }
        if (n2 == 1300) {
            // empty if block
        }
        if (n2 == 987) {
            this.fZ = 2;
            this.ok = true;
            fM = true;
        }
        if (n2 == 986) {
            this.fZ = 1;
            this.ok = true;
            fM = true;
        }
        if (n2 == 985) {
            this.fZ = 0;
            this.ok = true;
            fM = true;
        }
        if (n2 == 984) {
            this.v.a(rs.i.a.e);
        }
        if (n2 == 983) {
            this.fj = 2;
            this.ok = true;
            fM = true;
        }
        if (n2 == 982) {
            this.fj = 1;
            this.ok = true;
            fM = true;
        }
        if (n2 == 981) {
            this.fj = 0;
            this.ok = true;
            fM = true;
        }
        if (n2 == 980) {
            this.v.a(4);
        }
        if (n2 == 1604) {
            this.gx = this.gx == rs.i.a.z ? rs.i.a.v : rs.i.a.z;
            this.ok = true;
            fM = true;
        }
        if (n2 == 1603) {
            this.v.a(rs.i.a.h);
        }
        if (n2 == 1007) {
            this.gv = this.gv == rs.i.a.z ? rs.i.a.v : rs.i.a.z;
            this.ok = true;
            fM = true;
        }
        if (n2 == 1006) {
            this.v.a(rs.i.a.i);
        }
        if (n20 != this.gy || n21 != this.gu || n22 != this.cE || n23 != this.fZ || n24 != this.fj) {
            fv.a(95);
            fv.b(this.gu);
            fv.b(this.cE);
            fv.b(this.fZ);
        }
        if (n2 == 493) {
            fv.a(75);
            fv.p(n5);
            fv.n(n4);
            fv.o(n3);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 652) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(156);
            fv.o(n4 + eh);
            fv.n(n5 + ei);
            fv.p(n3);
        }
        if (n2 == 94) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(181);
            fv.n(n5 + ei);
            fv.d(n3);
            fv.n(n4 + eh);
            fv.o(this.nl);
        }
        if (n2 == 647) {
            rs.f.a.ba = !rs.f.a.ba;
            rs.f.a.d();
        }
        if (n2 == 646) {
            if ((n5 == 1164 || n5 == 30064) && this.cY == 2) {
                this.cY = 3;
            }
            if (n5 == 915 || n5 == 19081) {
                if (System.currentTimeMillis() - ib < 500L) {
                    return;
                }
                ib = System.currentTimeMillis();
            }
            if ((n5 == 30162 || n5 == 7455 || n5 == 13095) && rs.f.a.ba) {
                this.a("<img=25> You currently have this spell locked!", 0, null);
            } else {
                fv.a(185);
                fv.d(n5);
            }
            rs.n.e e3 = rs.n.e.H[n5];
            if (e3.X != null && e3.X[0][0] == 5) {
                n12 = e3.X[0][1];
                if (n5 == 12474) {
                    if (System.currentTimeMillis() - this.iC < 1000L) {
                        this.a("<img=25> Please wait a few seconds before re-toggling Lite Mode!", 0, null);
                        return;
                    }
                    this.iC = System.currentTimeMillis();
                }
                if (n5 == 19085) {
                    ao = "::extended";
                    return;
                }
                if (this.dP[n12] != e3.I[0]) {
                    this.g("@blu@CONFIGS:@bla@ Setting ID @red@" + n12 + "@bla@ to option @red@" + e3.I[0]);
                    this.dP[n12] = e3.I[0];
                    this.B(n12);
                    fb = true;
                }
            }
        }
        if (n2 == 225 && (j8 = this.cA[n3]) != null) {
            long l3;
            long l4 = l3 = j8.aG != null ? j8.aG.x : -1L;
            if (l3 == 2347L || l3 == 2346L || l3 == 2345L || l3 == 2344L) {
                this.eW = 1;
                this.bq = 1337;
                this.nl = 1337;
                this.nm = 12;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@Polymorphism@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, j8.l[0], Client.eR.k[0], false, j8.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((oh += n3) >= 85) {
                fv.a(230);
                fv.b(239);
                oh = 0;
            }
            fv.a(17);
            fv.p(n3);
            object = new EntityInteraction();
            ((EntityInteraction)object).setEntity(j8);
            this.p.post(object);
        }
        if (n2 == 965 && (j7 = this.cA[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, j7.l[0], Client.eR.k[0], false, j7.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if (++nk >= 96) {
                fv.a(152);
                fv.b(88);
                nk = 0;
            }
            fv.a(21);
            fv.d(n3);
            EntityInteraction entityInteraction2 = new EntityInteraction();
            entityInteraction2.setEntity(j7);
            this.p.post(entityInteraction2);
        }
        if (n2 == 413 && (j6 = this.cA[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(131);
            fv.p(n3);
            fv.o(this.nl);
            EntityInteraction entityInteraction3 = new EntityInteraction();
            entityInteraction3.setEntity(j6);
            entityInteraction3.setCombat(true);
            this.p.post(entityInteraction3);
        }
        if (n2 == 200) {
            this.bQ();
        }
        if (n2 == 1026 && (j5 = this.cA[n3]) != null) {
            rs.s.c.c.b.a(j5, false);
            EntityInteraction entityInteraction4 = new EntityInteraction();
            entityInteraction4.setEntity(j5);
            this.p.post(entityInteraction4);
        }
        if (n2 == 1025 && (j4 = this.cA[n3]) != null) {
            rs.d.d d2 = j4.aG;
            if (d2.G != null) {
                d2 = d2.c();
            }
            if (d2 != null) {
                Object object3 = d2.H != null ? new String(d2.H) : "It's a " + d2.o + ".";
                ap = "::dropnpcid " + d2.x;
            }
        }
        if (n2 == 900) {
            this.d(n3, n5, n4, n13);
            fv.a(252);
            fv.p(n13);
            fv.n(n5 + ei);
            fv.o(n4 + eh);
        }
        if (n2 == 412 && (j3 = this.cA[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(72);
            fv.o(n3);
            EntityInteraction entityInteraction5 = new EntityInteraction();
            entityInteraction5.setEntity(j3);
            entityInteraction5.setCombat(true);
            this.p.post(entityInteraction5);
        }
        if (n2 == 365 && (k5 = do[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(249);
            fv.o(n3);
            fv.n(this.nl);
        }
        if (n2 == 729 && (k4 = do[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(39);
            fv.n(n3);
        }
        if (n2 == 577 && (k3 = do[n3]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(139);
            fv.n(n3);
        }
        if (n2 == 956 && this.d(n3, n5, n4, n13)) {
            fv.a(35);
            fv.n(n4 + eh);
            fv.o(this.nl);
            fv.o(n5 + ei);
            fv.n(n13);
        }
        if (n2 == 567) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(23);
            fv.n(n5 + ei);
            fv.n(n3);
            fv.n(n4 + eh);
        }
        if (n2 == 867) {
            if ((n3 & 3) == 0) {
                ++nH;
            }
            if (nH >= 59) {
                fv.a(200);
                fv.d(25501);
                nH = 0;
            }
            fv.a(43);
            fv.n(n5);
            fv.o(n3);
            fv.o(n4);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
            if (n3 == 21671 || n3 == 21670) {
                this.eW = 1;
                this.bq = 1338;
                this.nl = 1338;
                this.nm = 12;
                this.gr = 0;
                fb = true;
                this.nn = "@mag@Punch";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if (n2 == 543) {
            fv.a(237);
            fv.d(n4);
            fv.o(n3);
            fv.d(n5);
            fv.o(this.nl);
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 606 && (n9 = (string3 = string).indexOf("@whi@")) != -1) {
            if (cH == -1) {
                this.bQ();
                this.kr = string3.substring(n9 + 5).trim();
                this.nz = false;
                for (int i4 = 0; i4 < rs.n.e.H.length; ++i4) {
                    if (rs.n.e.H[i4] == null || rs.n.e.H[i4].J != 600) continue;
                    this.nK = cH = rs.n.e.H[i4].ah;
                    break;
                }
            } else {
                this.a("Please close the interface you have open before using 'report abuse'", 0, "");
            }
        }
        if (n2 == 491 && (k2 = do[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, k2.l[0], Client.eR.k[0], false, k2.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(14);
            fv.o(this.gt);
            fv.d(n3);
            fv.d(this.oM);
            fv.n(this.gs);
        }
        if (n2 == 639 && (n8 = (string2 = string).indexOf("@whi@")) != -1) {
            long l5 = o_0.a(string2.substring(n8 + 5).trim());
            int n25 = -1;
            for (n7 = 0; n7 < this.kA; ++n7) {
                if (this.lg[n7] != l5) continue;
                n25 = n7;
                break;
            }
            if (n25 != -1 && this.jG[n25] > 0) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 3;
                this.le = this.lg[n25];
                this.eQ = "Enter message to send to " + this.mT[n25];
            }
        }
        if (n2 == 454) {
            if (!rs.f.a.aF && ic > 0L && !rs.f.a.aE) {
                this.ie.add(new rs.q.a.a(n3, n4, n5));
                if (System.currentTimeMillis() - this.id > ic) {
                    this.id = System.currentTimeMillis();
                }
            } else {
                fv.a(41);
                fv.d(n3);
                fv.o(n4);
                fv.o(n5);
            }
            this.oq = 0;
            this.fV = n5;
            this.fW = n4;
            this.fX = 2;
            if (rs.n.e.H[n5].ah == cH) {
                this.fX = 1;
            }
            if (rs.n.e.H[n5].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n2 == 478 && (j2 = this.cA[n3]) != null) {
            this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, j2.l[0], Client.eR.k[0], false, j2.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((n3 & 3) == 0) {
                ++ny;
            }
            if (ny >= 53) {
                fv.a(85);
                fv.b(66);
                ny = 0;
            }
            fv.a(18);
            fv.n(n3);
            EntityInteraction entityInteraction6 = new EntityInteraction();
            entityInteraction6.setEntity(j2);
            this.p.post(entityInteraction6);
        }
        if (n2 == 113) {
            this.d(n3, n5, n4, n13);
            fv.a(70);
            fv.n(n4 + eh);
            fv.d(n5 + ei);
            fv.p(n13);
        }
        if (n2 == 872) {
            this.d(n3, n5, n4, n13);
            fv.a(234);
            fv.p(n4 + eh);
            fv.o(n13);
            fv.p(n5 + ei);
        }
        if (n2 == 502) {
            this.d(n3, n15, n14, n13);
            fv.a(132);
            fv.p(n14 + eh);
            fv.d(n13);
            fv.o(n15 + ei);
        }
        if (n2 == 1125) {
            rs.d.k k7 = rs.d.k.f(n3);
            rs.n.e e4 = rs.n.e.H[n5];
            if (rs.f.a.c() && cH == -1 && rs.s.c.c.d) {
                rs.s.c.c.b.a(n3, false);
            } else {
                Object object4;
                object = k7.w;
                if (k7.w.contains("@gre@")) {
                    object = ((String)object).replace("@gre@", "");
                }
                if (e4 != null && e4.ax != null && e4.ax[n4] >= 100000) {
                    object4 = Client.a(e4.ax[n4]) + " x " + (String)object;
                } else if (k7.E != null) {
                    object4 = new String(k7.E);
                    ((String)object4).replace("@gre@", "");
                } else {
                    object4 = "It's a " + rs.l.j.b(k7.w) + ".";
                    rs.n.a.a("::iexam " + k7.i);
                }
                if (cH == 47500 && k7.w != null) {
                    ap = "::igsearch " + k7.w;
                } else {
                    String string7 = rs.d.m.a("", k7.i);
                    if (string7 != null && !string7.isEmpty()) {
                        n7 = gl.c(string7 = rs.l.j.b(string7).replace('\n', '^'));
                        if (n7 >= 475) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i5 = 0; i5 < string7.length(); ++i5) {
                                boolean bl;
                                if (string7.charAt(i5) == '^') {
                                    stringBuilder.append(' ');
                                } else {
                                    stringBuilder.append(string7.charAt(i5));
                                }
                                int n26 = gl.c(stringBuilder.toString());
                                boolean bl3 = bl = n26 >= 380 && (string7.charAt(i5) == ' ' || string7.charAt(i5) == '^' || string7.charAt(i5) == '-' || string7.charAt(i5) == '.' || string7.charAt(i5) == ',');
                                if (!bl && i5 != string7.length() - 1) continue;
                                this.a(stringBuilder.toString(), 0, "");
                                stringBuilder = new StringBuilder();
                            }
                        } else {
                            this.a(string7.replace('^', ' '), 0, "");
                        }
                    } else {
                        this.a((String)object4, 0, "");
                    }
                }
            }
        }
        if (n2 == 169) {
            fv.a(185);
            fv.d(n5);
            if (n5 == 64029) {
                this.gb = false;
                this.fN = 3;
                this.dY = "";
                fM = true;
                return;
            }
            rs.n.e e5 = rs.n.e.H[n5];
            if (e5.X != null && e5.X[0][0] == 5) {
                int n27 = e5.X[0][1];
                this.dP[n27] = 1 - this.dP[n27];
                this.B(n27);
                fb = true;
            }
        }
        if (n2 == 447) {
            this.gr = 1;
            this.gs = n4;
            this.gt = n5;
            this.oM = n3;
            this.oN = rs.d.k.f((int)n3).w;
            this.eW = 0;
            fb = true;
            return;
        }
        if (n2 == 1227) {
            r r2 = rs.d.r.c(n13);
            rs.s.c.c.b.b(n13, false);
        }
        if (n2 == 1226) {
            r r3 = rs.d.r.c(n13);
            Object object5 = r3.aq != null ? new String(r3.aq) : "It's a " + r3.R + ".";
            this.a((String)object5, 0, "");
        }
        if (n2 == 244) {
            boolean bl = this.a(2, 0, 0, 0, Client.eR.l[0], 0, 0, n5, Client.eR.k[0], false, n4);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, Client.eR.l[0], 1, 0, n5, Client.eR.k[0], false, n4);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(253);
            fv.n(n4 + eh);
            fv.p(n5 + ei);
            fv.o(n3);
        }
        if (n2 == 1448) {
            rs.d.k k8 = rs.d.k.f(n3);
            Object object6 = k8.E != null ? new String(k8.E) : "It's a " + k8.w + ".";
            this.a((String)object6, 0, "");
        }
        if (n2 == 1924) {
            this.r.a(n3);
        }
        this.gr = 0;
        this.eW = 0;
        fb = true;
    }

    private void g(String string) {
        if (eR != null && cT == 2 && rs.f.a.am) {
            this.a("@red@[@mag@CLIENT DEBUG@red@]@bla@ " + string, 0, "");
        }
    }

    public void y() {
        this.ou = 0;
        int n2 = (Client.eR.ac >> 7) + eh;
        int n3 = (Client.eR.ad >> 7) + ei;
        if (n2 >= 3053 && n2 <= 3156 && n3 >= 3056 && n3 <= 3136) {
            this.ou = 1;
        }
        if (n2 >= 3072 && n2 <= 3118 && n3 >= 9492 && n3 <= 9535) {
            this.ou = 1;
        }
        if (this.ou == 1 && n2 >= 3139 && n2 <= 3199 && n3 >= 3008 && n3 <= 3062) {
            this.ou = 0;
        }
    }

    @Override
    public void run() {
        if (!this.kq) {
            super.run();
        }
    }

    public void z() {
        rs.l.e.f.o = 0;
        for (rs.l.e.a a2 : rs.l.e.f.n) {
            if (a2 == null || !a2.e()) continue;
            if (a2 instanceof rs.l.e.a.s) {
                ++rs.l.e.f.o;
            }
            if (!a2.a(this.hM)) continue;
            return;
        }
        if (this.gr == 0 && this.eW == 0) {
            this.fx[this.eV] = "Walk here";
            this.eI[this.eV] = 516;
            this.eF[this.eV] = rs.c_0.hP;
            this.eG[this.eV] = rs.c_0.hQ;
            ++this.eV;
        }
        int n2 = -1;
        block1: for (int i2 = 0; i2 < rs.a.h.bw; ++i2) {
            int n3;
            Object object;
            int n4 = rs.a.h.bx[i2];
            int n5 = n4 & 0x7F;
            int n6 = n4 >> 7 & 0x7F;
            int n7 = n4 >> 29 & 3;
            int n8 = -1;
            if (n7 != 2) {
                n8 = n4 >> 14 & Short.MAX_VALUE;
            }
            if (n4 == n2) continue;
            n2 = n4;
            if (n7 == 2 && this.dF.b(dw, n5, n6, n4) >= 0) {
                n8 = rs.a.h.by[i2];
                object = rs.d.r.c(n8);
                if (object != null && ((r)object).ad != null) {
                    object = ((r)object).d();
                }
                if (object == null || ((r)object).R == null || ((r)object).R == "null") continue;
                if (this.gr == 1) {
                    this.fx[this.eV] = "Use " + this.oN + " with @cya@" + ((r)object).R;
                    this.eI[this.eV] = 62;
                    this.eJ[this.eV] = n4;
                    this.eF[this.eV] = n5;
                    this.eG[this.eV] = n6;
                    this.eH[this.eV] = n8;
                    ++this.eV;
                } else if (this.eW == 1) {
                    if ((this.nm & 4) == 4) {
                        this.fx[this.eV] = this.nn + " @cya@" + ((r)object).R;
                        this.eI[this.eV] = 956;
                        this.eJ[this.eV] = n4;
                        this.eF[this.eV] = n5;
                        this.eG[this.eV] = n6;
                        this.eH[this.eV] = n8;
                        ++this.eV;
                    }
                } else {
                    if (((r)object).ay != null) {
                        for (n3 = 4; n3 >= 0; --n3) {
                            if (((r)object).ay[n3] == null) continue;
                            this.fx[this.eV] = ((r)object).ay[n3] + " @cya@" + ((r)object).R;
                            if (n3 == 0) {
                                this.eI[this.eV] = 502;
                            }
                            if (n3 == 1) {
                                this.eI[this.eV] = 900;
                            }
                            if (n3 == 2) {
                                this.eI[this.eV] = 113;
                            }
                            if (n3 == 3) {
                                this.eI[this.eV] = 872;
                            }
                            if (n3 == 4) {
                                this.eI[this.eV] = 1062;
                            }
                            this.eJ[this.eV] = n4;
                            this.eF[this.eV] = n5;
                            this.eG[this.eV] = n6;
                            this.eH[this.eV] = n8;
                            ++this.eV;
                        }
                    }
                    this.fx[this.eV] = "Examine @cya@" + ((r)object).R;
                    this.eI[this.eV] = 1226;
                    this.eJ[this.eV] = ((r)object).aa << 14;
                    this.eF[this.eV] = n5;
                    this.eG[this.eV] = n6;
                    this.eH[this.eV] = n8;
                    ++this.eV;
                    if (rs.d.v.a(cT) && rs.f.a.c() && rs.s.c.c.d) {
                        this.fx[this.eV] = "<img=191> @mag@Colors@cya@ " + ((r)object).R;
                        this.eI[this.eV] = 1227;
                        this.eJ[this.eV] = ((r)object).aa << 14;
                        this.eF[this.eV] = n5;
                        this.eG[this.eV] = n6;
                        this.eH[this.eV] = n8;
                        ++this.eV;
                    }
                }
            }
            if (n7 == 1) {
                object = this.cA[n8];
                if (object == null || ((rs.a.j)object).aG == null) continue;
                if (((rs.a.j)object).aG.r == 1 && (((rs.a.j)object).ac & 0x7F) == 64 && (((rs.a.j)object).ad & 0x7F) == 64) {
                    rs.a.c c2;
                    for (n3 = 0; n3 < this.cB; ++n3) {
                        c2 = this.cA[this.cC[n3]];
                        if (c2 == null || c2 == object || c2.aG == null || c2.aG.r != 1 || c2.ac != ((rs.a.j)object).ac || c2.ad != ((rs.a.j)object).ad) continue;
                        this.a(c2.aG, this.cC[n3], n6, n5);
                    }
                    for (n3 = 0; n3 < this.ku; ++n3) {
                        c2 = do[this.kv[n3]];
                        if (c2 == null || ((rs.a.k)c2).ac != ((rs.a.j)object).ac || ((rs.a.k)c2).ad != ((rs.a.j)object).ad) continue;
                        this.a(n5, this.kv[n3], (rs.a.k)c2, n6);
                    }
                }
                this.a(((rs.a.j)object).aG, n8, n6, n5);
            }
            if (n7 == 0) {
                Object object2;
                object = do[n8];
                if (object == null) continue;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                if ((((rs.a.k)object).ac & 0x7F) == 64 && (((rs.a.k)object).ad & 0x7F) == 64) {
                    int n9;
                    for (n9 = 0; n9 < this.cB; ++n9) {
                        object2 = this.cA[this.cC[n9]];
                        if (object2 == null || ((rs.a.j)object2).aG.r != 1 || ((rs.a.j)object2).ac != ((rs.a.k)object).ac || ((rs.a.j)object2).ad != ((rs.a.k)object).ad) continue;
                        this.a(((rs.a.j)object2).aG, this.cC[n9], n6, n5);
                    }
                    for (n9 = 0; n9 < this.ku; ++n9) {
                        object2 = do[this.kv[n9]];
                        if (object2 == null || object2 == object || ((rs.a.k)object2).ac != ((rs.a.k)object).ac || ((rs.a.k)object2).ad != ((rs.a.k)object).ad) continue;
                        arrayList.add(this.kv[n9]);
                    }
                }
                arrayList.add(n8);
                int n10 = -1;
                for (Integer n11 : arrayList) {
                    int n12 = Client.do[n11.intValue()].m - 32768;
                    if (n12 == di && n10 == -1) {
                        n10 = n11;
                    }
                    if (Client.eR.m - 32768 == n11) {
                        n10 = n11;
                    }
                    if (do[n11] == null || Client.do[n11.intValue()].aZ == null || this.z.r == null || this.z.r.equalsIgnoreCase(Client.do[n11.intValue()].aZ)) continue;
                    n10 = n11;
                    break;
                }
                if (n10 != -1) {
                    object2 = do[n10];
                    this.a(n5, n10, (rs.a.k)object2, n6);
                }
                for (Integer n11 : arrayList) {
                    if (n10 != -1 && n10 == n11) continue;
                    rs.a.k k2 = do[n11];
                    this.a(n5, (int)n11, k2, n6);
                }
            }
            if (n7 != 3 || (object = this.jH[dw][n5][n6]) == null) continue;
            rs.a.g g2 = (rs.a.g)((rs.h)object).c();
            while (g2 != null) {
                rs.d.k k3 = rs.d.k.f(g2.h);
                if (k3 != null && k3.w != null) {
                    if (this.eV > this.fx.length - 1) continue block1;
                    if (this.gr == 1) {
                        this.fx[this.eV] = "Use " + this.oN + " with @lre@" + k3.w;
                        this.eI[this.eV] = 511;
                        this.eJ[this.eV] = g2.h;
                        this.eF[this.eV] = n5;
                        this.eG[this.eV] = n6;
                        ++this.eV;
                    } else if (this.eW == 1) {
                        if ((this.nm & 1) == 1) {
                            this.fx[this.eV] = this.nn + " @lre@" + k3.w;
                            this.eI[this.eV] = 94;
                            this.eJ[this.eV] = g2.h;
                            this.eF[this.eV] = n5;
                            this.eG[this.eV] = n6;
                            ++this.eV;
                        }
                    } else {
                        for (int i3 = 4; i3 >= 0; --i3) {
                            if (k3.u != null && k3.u[i3] != null) {
                                this.fx[this.eV] = k3.u[i3] + " @lre@" + k3.w;
                                if (i3 == 0) {
                                    this.eI[this.eV] = 652;
                                }
                                if (i3 == 1) {
                                    this.eI[this.eV] = 567;
                                }
                                if (i3 == 2) {
                                    this.eI[this.eV] = 234;
                                }
                                if (i3 == 3) {
                                    this.eI[this.eV] = 244;
                                }
                                if (i3 == 4) {
                                    this.eI[this.eV] = 213;
                                }
                                this.eJ[this.eV] = g2.h;
                                this.eF[this.eV] = n5;
                                this.eG[this.eV] = n6;
                                ++this.eV;
                                continue;
                            }
                            if (i3 != 2) continue;
                            this.fx[this.eV] = "Take @lre@" + k3.w;
                            this.eI[this.eV] = 234;
                            this.eJ[this.eV] = g2.h;
                            this.eF[this.eV] = n5;
                            this.eG[this.eV] = n6;
                            ++this.eV;
                        }
                        this.fx[this.eV] = "Examine @lre@" + k3.w;
                        this.eI[this.eV] = 1448;
                        this.eJ[this.eV] = g2.h;
                        this.eF[this.eV] = n5;
                        this.eG[this.eV] = n6;
                        this.iT = rs.d.k.f((int)g2.h).w;
                        ++this.eV;
                    }
                }
                g2 = (rs.a.g)((rs.h)object).e();
            }
        }
    }

    @Override
    public void A() {
        rs.v.a.n = false;
        try {
            if (this.nD != null) {
                this.nD.a();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.jn = false;
        this.nD = null;
        this.e();
        if (this.kp != null) {
            this.kp.c = false;
        }
        this.kp = null;
        try {
            ew.h();
        }
        catch (Exception exception) {
            // empty catch block
        }
        ew = null;
        this.eH = null;
        this.jM = null;
        fv = null;
        this.jS = null;
        this.mU = null;
        this.fR = null;
        this.fr = null;
        this.fY = null;
        this.fS = null;
        this.fT = null;
        this.fC = null;
        this.gc = null;
        this.dF = null;
        this.fP = null;
        this.kC = null;
        this.jF = null;
        this.oK = null;
        this.oL = null;
        this.kL = null;
        this.dq = null;
        this.kE = null;
        this.kF = null;
        this.kG = null;
        this.dr = null;
        this.kH = null;
        this.kI = null;
        this.kJ = null;
        this.kK = null;
        this.fw = null;
        this.nT = null;
        this.nU = null;
        this.ma = null;
        this.mb = null;
        this.mc = null;
        this.dG = null;
        this.nq = null;
        this.nr = null;
        this.ns = null;
        this.nt = null;
        this.nu = null;
        this.kb = null;
        this.kc = null;
        this.kd = null;
        this.ke = null;
        this.kf = null;
        this.ng = null;
        this.dS = null;
        this.mW = null;
        this.eK = null;
        this.mX = null;
        this.fa = null;
        this.mC = null;
        this.mD = null;
        this.mM = null;
        this.mN = null;
        this.mQ = null;
        this.mq = null;
        this.me = null;
        this.kS = null;
        do = null;
        this.kv = null;
        this.kx = null;
        this.ky = null;
        this.jO = null;
        this.cA = null;
        this.cC = null;
        this.jH = null;
        this.nL = null;
        this.ea = null;
        this.et = null;
        this.eF = null;
        this.eG = null;
        this.eI = null;
        this.eJ = null;
        this.fx = null;
        this.dP = null;
        this.mA = null;
        this.mB = null;
        this.no = null;
        this.oA = null;
        this.mT = null;
        this.lg = null;
        this.jG = null;
        this.bL();
        rs.d.r.b();
        rs.d.d.d();
        rs.d.k.a();
        rs.d.h.b = null;
        rs.d.j.b = null;
        rs.n.e.H = null;
        rs.d.a.a = null;
        rs.d.x.c = null;
        rs.d.x.p = null;
        rs.d.z.a = null;
        this.ha = null;
        rs.a.k.aL = null;
        rs.a.k.aM = null;
        rs.a.k.aN = null;
        rs.d.x.q = null;
        e_0.e();
        rs.v_0.a();
        rs.a.h.g();
        rs.k.b();
        System.gc();
        System.exit(0);
    }

    private void bB() {
    }

    @Override
    public Component B() {
        if (rs.v.a.h != null) {
            return rs.v.a.h;
        }
        if (this.hH != null) {
            return this.hH;
        }
        return this;
    }

    public void C() {
        int n2;
        while ((n2 = this.w(-796)) != -1) {
            if (this.ac() && (n2 == 96 || n2 == 42 && this.fk.equalsIgnoreCase("bsouth"))) {
                w.a();
                return;
            }
            if (Client.w.b && !this.gb && this.gp <= 0) {
                w.a(n2);
                fM = true;
                return;
            }
            if (cH != -1 && cH == this.nK) {
                if (n2 == 8 && this.kr.length() > 0) {
                    this.kr = this.kr.substring(0, this.kr.length() - 1);
                }
                if (!(n2 >= 97 && n2 <= 122 || n2 >= 65 && n2 <= 90 || n2 >= 48 && n2 <= 57) && n2 != 32 || this.kr.length() >= 12) continue;
                this.kr = this.kr + (char)n2;
                continue;
            }
            if (this.gb) {
                long l2;
                if (n2 >= 32 && n2 <= 122 && this.fB.length() < 80) {
                    this.fB = this.fB + (char)n2;
                    if (this.fN == 25) {
                        this.ar = "::banksearch " + this.fB;
                    }
                    fM = true;
                }
                if (n2 == 8 && this.fB.length() > 0) {
                    this.fB = this.fB.substring(0, this.fB.length() - 1);
                    if (this.fN == 25) {
                        this.ar = "::banksearch " + this.fB;
                    }
                    fM = true;
                }
                if (n2 == 9) {
                    this.J();
                }
                if (n2 != 13 && n2 != 10) continue;
                this.gb = false;
                fM = true;
                if (this.fN == 25) {
                    this.ar = this.fB.equalsIgnoreCase("") ? "::banksearch ~clear" : "::banksearch " + this.fB;
                }
                if (this.fN == 26) {
                    ap = "::dropnpcse " + this.fB;
                }
                if (this.fN == 27) {
                    ap = "::dropitemse " + this.fB;
                }
                if (this.fN == 28) {
                    ap = "::tpsitem " + this.fB;
                }
                if (this.fN == 29) {
                    ap = "::tpsuser " + this.fB;
                }
                if (this.fN == 30) {
                    ap = "::tpshist " + this.fB;
                }
                if (this.fN == 31) {
                    ap = "::description " + this.fB;
                }
                if (this.fN == 32) {
                    ap = "::yelltag " + this.fB;
                }
                if (this.fN == 33) {
                    ap = "::title " + this.fB;
                }
                if (this.ev == 1) {
                    l2 = o_0.a(this.fB);
                    this.a(l2);
                }
                if (this.ev == 2 && this.kA > 0) {
                    l2 = o_0.a(this.fB);
                    this.f(l2);
                }
                if (this.ev == 3 && this.fB.length() > 0) {
                    fv.a(126);
                    fv.b(0);
                    int n3 = Client.fv.h;
                    fv.a(this.le);
                    p_0.a(this.fB, fv);
                    fv.j(Client.fv.h - n3);
                    this.fB = p_0.a(this.fB);
                    this.fB = rs.d.c.b(this.fB);
                    this.a(this.fB, 6, o_0.c(o_0.a(this.le)));
                    if (this.cE == 2) {
                        this.cE = 1;
                        this.ok = true;
                        fv.a(95);
                        fv.b(this.gu);
                        fv.b(this.cE);
                        fv.b(this.fZ);
                    }
                }
                if (this.ev == 4 && this.jD < 100) {
                    long l3 = o_0.a(this.fB);
                    this.h(l3);
                }
                if (this.ev != 5 || this.jD <= 0) continue;
                long l4 = o_0.a(this.fB);
                this.i(l4);
                continue;
            }
            if (this.fN == 1) {
                if (n2 >= 48 && n2 <= 57 && this.dY.length() < 10) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (!((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n2 != 107 && n2 != 109) && n2 != 98 && n2 != 75 && n2 != 77 && n2 != 66)) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (n2 == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n2 != 13 && n2 != 10) continue;
                if (this.dY.length() > 0) {
                    if (this.dY.toLowerCase().contains("k")) {
                        this.dY = this.dY.replaceAll("k", "000");
                        this.dY = this.dY.replaceAll("K", "000");
                    } else if (this.dY.toLowerCase().contains("m")) {
                        this.dY = this.dY.replaceAll("m", "000000");
                        this.dY = this.dY.replaceAll("M", "000000");
                    } else if (this.dY.toLowerCase().contains("b")) {
                        this.dY = this.dY.replaceAll("b", "000000000");
                        this.dY = this.dY.replaceAll("B", "000000000");
                    }
                    int n4 = 0;
                    try {
                        n4 = Integer.parseInt(this.dY);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n4 = Integer.MAX_VALUE;
                    }
                    if (cH == 23000 && n4 > 0) {
                        this.ih = n4;
                        rs.n.c.h.m(this.ih);
                    }
                    fv.a(208);
                    fv.g(n4);
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.fN == 2) {
                if (n2 >= 32 && n2 <= 122 && this.dY.length() < 24) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (n2 == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n2 != 13 && n2 != 10) continue;
                if (this.dY.length() > 0) {
                    fv.a(60);
                    fv.a(o_0.a(this.dY));
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.fN == 3) {
                if (n2 >= 32 && n2 <= 122 && this.dY.length() < 25) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (n2 == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n2 != 13 && n2 != 10) continue;
                this.fN = 0;
                this.gb = false;
                fM = true;
                rs.n.c.af.a(this, this.dY);
                rs.n.c.af.b(bk);
                fb = true;
                continue;
            }
            if (this.fN == 6 && this.q.c() != null) {
                switch (this.q.c().e()) {
                    case b: {
                        if (n2 >= 48 && n2 <= 57 && this.dY.length() < 10) {
                            this.dY = this.dY + (char)n2;
                            fM = true;
                        }
                        if ((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n2 != 107 && n2 != 109) && n2 != 98 && n2 != 75 && n2 != 77 && n2 != 66) break;
                        this.dY = this.dY + (char)n2;
                        fM = true;
                        break;
                    }
                    case c: {
                        if (n2 < 32 || n2 > 122 || this.dY.length() >= 12) break;
                        this.dY = this.dY + (char)n2;
                        fM = true;
                        break;
                    }
                    case a: {
                        if (n2 < 32 || n2 > 122 || this.dY.length() >= 25) break;
                        this.dY = this.dY + (char)n2;
                        fM = true;
                    }
                }
                if (n2 == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n2 != 13 && n2 != 10) continue;
                this.q.a();
                this.fN = 0;
                this.gb = false;
                fM = true;
                fb = true;
                continue;
            }
            if (this.fN == 4) {
                if (n2 >= 48 && n2 <= 57 && this.dY.length() < 10) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (!((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n2 != 107 && n2 != 109) && n2 != 98)) {
                    this.dY = this.dY + (char)n2;
                    fM = true;
                }
                if (n2 == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n2 != 13 && n2 != 10) continue;
                if (this.dY.length() > 0) {
                    if (this.dY.toLowerCase().contains("k")) {
                        this.dY = this.dY.replaceAll("k", "000");
                    } else if (this.dY.toLowerCase().contains("m")) {
                        this.dY = this.dY.replaceAll("m", "000000");
                    } else if (this.dY.toLowerCase().contains("b")) {
                        this.dY = this.dY.replaceAll("b", "000000000");
                    }
                    int n5 = 0;
                    try {
                        n5 = Integer.parseInt(this.dY);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n5 = Integer.MAX_VALUE;
                    }
                    ap = "::tabitem " + String.valueOf(this.iS) + " " + n5;
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.gp != -1 || this.dl != null) continue;
            if (n2 == 9) {
                this.J();
            }
            if (dk.isEmpty() && n2 == 58) {
                this.bw = true;
            }
            if (this.v.h() && !this.f()) continue;
            if (n2 >= 32 && n2 <= 122 && dk.length() < 80) {
                dk = dk + (char)n2;
                fM = true;
            }
            if (n2 == 8 && dk.length() > 0) {
                dk = dk.substring(0, dk.length() - 1);
                fM = true;
                if (dk.isEmpty()) {
                    this.bw = false;
                }
            }
            if (n2 != 13 && n2 != 10 || dk.length() <= 0) continue;
            this.bw = false;
            if (rs.f.a.O && !dk.startsWith("::")) {
                dk = "::" + dk;
            }
            dm = dk;
            if (dk.startsWith("/")) {
                dk = dk.replace("/", "");
                dk = "::clan " + dk;
                dk = dk.substring(0, dk.length());
            }
            this.d(dk);
            if (dk.startsWith("::")) {
                if (!Client.h(dk)) {
                    fv.a(103);
                    fv.b(dk.length() - 1);
                    fv.a(dk.substring(2));
                }
            } else {
                String string = dk.toLowerCase();
                int n6 = 0;
                if (string.startsWith("yellow:")) {
                    n6 = 0;
                    dk = dk.substring(7);
                } else if (string.startsWith("red:")) {
                    n6 = 1;
                    dk = dk.substring(4);
                } else if (string.startsWith("green:")) {
                    n6 = 2;
                    dk = dk.substring(6);
                } else if (string.startsWith("cyan:")) {
                    n6 = 3;
                    dk = dk.substring(5);
                } else if (string.startsWith("purple:")) {
                    n6 = 4;
                    dk = dk.substring(7);
                } else if (string.startsWith("white:")) {
                    n6 = 5;
                    dk = dk.substring(6);
                } else if (string.startsWith("flash1:")) {
                    n6 = 6;
                    dk = dk.substring(7);
                } else if (string.startsWith("flash2:")) {
                    n6 = 7;
                    dk = dk.substring(7);
                } else if (string.startsWith("flash3:")) {
                    n6 = 8;
                    dk = dk.substring(7);
                } else if (string.startsWith("glow1:")) {
                    n6 = 9;
                    dk = dk.substring(6);
                } else if (string.startsWith("glow2:")) {
                    n6 = 10;
                    dk = dk.substring(6);
                } else if (string.startsWith("glow3:")) {
                    n6 = 11;
                    dk = dk.substring(6);
                }
                string = dk.toLowerCase();
                int n7 = 0;
                if (string.startsWith("wave:")) {
                    n7 = 1;
                    dk = dk.substring(5);
                } else if (string.startsWith("wave2:")) {
                    n7 = 2;
                    dk = dk.substring(6);
                } else if (string.startsWith("shake:")) {
                    n7 = 3;
                    dk = dk.substring(6);
                } else if (string.startsWith("scroll:")) {
                    n7 = 4;
                    dk = dk.substring(7);
                } else if (string.startsWith("slide:")) {
                    n7 = 5;
                    dk = dk.substring(6);
                }
                fv.a(4);
                fv.b(0);
                int n8 = Client.fv.h;
                fv.m(n7);
                fv.m(n6);
                this.jM.h = 0;
                p_0.a(dk, this.jM);
                fv.a(0, this.jM.g, this.jM.h);
                fv.j(Client.fv.h - n8);
                dk = p_0.a(dk);
                Client.eR.q = dk = rs.d.c.b(dk);
                Client.eR.v = n6;
                Client.eR.K = n7;
                Client.eR.O = 150;
                if (cT > 0) {
                    int n9 = cT;
                    this.a(Client.eR.q, 2, "@cr" + n9 + "@" + eR.d(true));
                } else {
                    this.a(Client.eR.q, 2, eR.d(true));
                }
                if (this.gu == 2) {
                    this.gu = 3;
                    this.ok = true;
                    fv.a(95);
                    fv.b(this.gu);
                    fv.b(this.cE);
                    fv.b(this.fZ);
                }
            }
            dk = "";
            fM = true;
        }
    }

    private void E(int n2) {
        int n3 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < this.dC.length; ++i2) {
            if (this.dC[i2] == null) continue;
            int n4 = 70 - n3 * 14 + 42 + eD + 4 + 5;
            if (n4 < -23) break;
            int n5 = this.dz[i2];
            String string = this.dB[i2];
            String string2 = this.dC[i2];
            boolean bl2 = this.dD[i2];
            if (!(n5 != rs.i.a.j || this.fi != rs.i.a.h && this.fi != rs.i.a.b || this.gx != rs.i.a.v && (this.gx != rs.i.a.z || bl2))) {
                ++n3;
            }
            if (!(n5 != rs.i.a.s || this.fi != rs.i.a.i && this.fi != rs.i.a.b && (this.fi != rs.i.a.h || bl2) || this.gv != rs.i.a.v && bl2)) {
                ++n3;
            }
            if (!(n5 != rs.i.a.t || this.fi != rs.i.a.g && this.fi != rs.i.a.b || this.gy != rs.i.a.v && bl2)) {
                ++n3;
            }
            if (!(n5 != rs.i.a.u || this.fi != rs.i.a.f && this.fi != rs.i.a.b || this.gw != rs.i.a.v && bl2)) {
                ++n3;
            }
            if (!(n5 != rs.i.a.k && n5 != rs.i.a.l || this.gu != rs.i.a.v && (this.gu != rs.i.a.w || !this.i(string)) || this.fi != rs.i.a.c && this.fi != rs.i.a.b)) {
                if (n2 > n4 - 14 && n2 <= n4 && !string.equals(eR.o())) {
                    if (cT >= 1) {
                        this.a("Report abuse @whi@" + string, 606);
                    }
                    this.a("Add ignore @whi@" + string, 42);
                    this.a("Add friend @whi@" + string, 337);
                }
                ++n3;
            }
            if ((n5 == rs.i.a.q || n5 == rs.i.a.p) && this.nS == 0 && (n5 == rs.i.a.p || this.cE == 0 || this.cE == 1 && this.i(string))) {
                if (n2 > n4 - 14 && n2 <= n4) {
                    if (cT >= 1) {
                        this.a("Report abuse @whi@" + string, 606);
                    }
                    this.a("Add ignore @whi@" + string, 42);
                    this.a("Add friend @whi@" + string, 337);
                }
                ++n3;
            }
            if ((n5 == 5 || n5 == 6) && this.nS == 0 && this.cE < 2) {
                ++n3;
            }
            if (n5 == rs.i.a.n && (this.fZ == 0 || this.fZ == 1 && this.i(string))) {
                if (n2 > n4 - 14 && n2 <= n4) {
                    this.a("Accept trade @whi@" + string, 484);
                }
                ++n3;
            }
            if (n5 != 8 || this.fZ != 0 && (this.fZ != 1 || !this.i(string))) continue;
            if (n2 > n4 - 14 && n2 <= n4) {
                this.a("Accept challenge @whi@" + string, 6);
            }
            ++n3;
        }
    }

    public boolean c(String string) {
        if (string == null || string.isEmpty() || string.length() > 80) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9' || c2 == ' ' || c2 == '_' || c2 == '-') continue;
            return false;
        }
        String string2 = "::" + string;
        this.d(string2);
        if (Client.h(string2)) {
            return true;
        }
        fv.a(103);
        fv.b(string2.length() - 1);
        fv.a(string);
        return true;
    }

    private static boolean h(String string) {
        return string.equalsIgnoreCase("::queuedclicks") || string.equalsIgnoreCase("::queuedclicks on") || string.equalsIgnoreCase("::queuedclicks off");
    }

    public void d(String string) {
        String[] stringArray;
        if (Client.h(string)) {
            rs.f.a.be = string.equalsIgnoreCase("::queuedclicks") ? !rs.f.a.be : string.equalsIgnoreCase("::queuedclicks on");
            this.bg();
            this.v();
            rs.f.a.d();
            this.a("<img=163> Queued item clicks: " + (rs.f.a.be ? "on" : "off") + ". Use ::queuedclicks to toggle.", 0, null);
            return;
        }
        if (string.equals("::fixed")) {
            rs.f.a.ai = a.c.a;
            this.a(a.c.a);
        }
        if (string.equals("::resizable")) {
            rs.f.a.ai = a.c.b;
            this.a(a.c.b);
        }
        if (string.startsWith("::")) {
            try {
                rs.n.a.a(this, string, cT);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (cT == 2) {
            Object object;
            Object object2;
            int n2;
            stringArray = string.toLowerCase();
            if (stringArray.equals("::clear chat")) {
                for (n2 = 0; n2 < 200; ++n2) {
                    this.dC[n2] = null;
                }
            }
            if (stringArray.startsWith("::chatinterface")) {
                this.gp = n2 = Integer.valueOf(string.split(" ")[1]).intValue();
            }
            if (stringArray.startsWith("::resetoverlays")) {
                rs.l.e.f.a();
            }
            if (stringArray.startsWith("::find ")) {
                Object object3;
                String string2 = stringArray.replace("::find ", "");
                object2 = new ArrayList();
                for (int i2 = 1; i2 < 40000; ++i2) {
                    try {
                        object3 = rs.d.k.f(i2);
                        if (object3 == null || ((rs.d.k)object3).w == null || !((rs.d.k)object3).w.toLowerCase().contains(string2) || !((rs.d.k)object3).w.contains("@gre@") && this.ca || ((rs.d.k)object3).b() && this.cb) continue;
                        String string3 = ((rs.d.k)object3).w.contains("@gre@") ? "<col=007A00>[Unspawnable] " : "@red@[Spawnable] ";
                        String string4 = ((rs.d.k)object3).b() ? " <col=5700FF>(Noted) " : "";
                        object2.add(string3 + string4 + "@dre@" + ((rs.d.k)object3).w.replace("@gre@", "") + " @or3@- @mag@" + i2);
                        continue;
                    }
                    catch (Exception exception) {
                        break;
                    }
                }
                this.a("<img=9> Resulted @blu@" + object2.size() + "@bla@ item(s) for term \"@blu@" + string2 + "\":", 0, null);
                object = object2.iterator();
                while (object.hasNext()) {
                    object3 = (String)object.next();
                    this.a((String)object3, 0, null);
                }
            }
            if (stringArray.startsWith("::filter")) {
                if (stringArray.equals("::filters")) {
                    this.a("<img=163> Spawnable item searches are: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    this.a("<img=163> Noted item searches are: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                } else {
                    String string5 = stringArray.replace("::filter ", "");
                    if (string5.startsWith("spawn")) {
                        this.ca = !this.ca;
                        this.a("<img=163> Spawnable item searches are now: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    }
                    if (string5.startsWith("note")) {
                        this.cb = !this.cb;
                        this.a("<img=163> Noted item searches are now: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    }
                }
            }
            if (stringArray.startsWith("::nodes")) {
                this.a("PLAYER_NODES=" + rs.a.k.aL.b, 0, null);
                this.a("NPC_NODES=" + rs.d.d.M.b, 0, null);
            }
            if (stringArray.startsWith("::render ")) {
                String[] stringArray2 = stringArray.split(" ");
                object2 = stringArray2[1];
                object = stringArray2[2];
                if (((String)object2).startsWith("player")) {
                    rs.f.a.J = ((String)object).equals("on");
                    this.a("RENDER_PLAYERS=" + rs.f.a.J, 0, null);
                }
                if (((String)object2).startsWith("npc")) {
                    rs.f.a.K = ((String)object).equals("on");
                    this.a("RENDER_NPCS=" + rs.f.a.K, 0, null);
                }
                if (((String)object2).startsWith("texture")) {
                    rs.f.a.M = ((String)object).equals("on");
                    this.a("RENDER_TEXTURES=" + rs.f.a.M, 0, null);
                }
            }
            if (string.startsWith("::setinterface") && rs.l.j.b(cT)) {
                int n3 = cH;
                int n4 = Integer.valueOf(string.split(" ")[1]);
                if (n4 == -1) {
                    aW = -1;
                } else {
                    aW = n3;
                    object = rs.n.e.H[n3];
                    for (int i3 = 0; i3 < ((rs.n.e)object).al.length; ++i3) {
                        if (((rs.n.e)object).al[i3] != n4) continue;
                        aV = i3;
                        aX = ((rs.n.e)object).am[i3];
                        aY = ((rs.n.e)object).bc[i3];
                    }
                }
            }
            if (string.startsWith("::colors")) {
                int n5 = Integer.valueOf(string.split(" ")[1]);
                rs.d.k k2 = rs.d.k.f(n5);
                if (k2 == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.a.h(k2.A);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.a.h)object).ar != null) {
                        int n6;
                        for (n6 = 0; n6 < ((rs.a.h)object).ah; ++n6) {
                            if (arrayList.contains(((rs.a.h)object).ar[n6])) continue;
                            arrayList.add(((rs.a.h)object).ar[n6]);
                        }
                        for (n6 = 0; n6 < arrayList.size(); ++n6) {
                            this.a("[" + n6 + "] = " + String.valueOf(arrayList.get(n6)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n6)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.startsWith("::m1models")) {
                int n7 = Integer.valueOf(string.split(" ")[1]);
                rs.d.k k3 = rs.d.k.f(n7);
                if (k3 == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    System.out.print(k3.r + ", ");
                }
            }
            if (string.startsWith("::m1colors")) {
                int n8 = Integer.valueOf(string.split(" ")[1]);
                rs.d.k k4 = rs.d.k.f(n8);
                if (k4 == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.a.h(k4.r);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.a.h)object).ar != null) {
                        int n9;
                        for (n9 = 0; n9 < ((rs.a.h)object).ah; ++n9) {
                            if (arrayList.contains(((rs.a.h)object).ar[n9])) continue;
                            arrayList.add(((rs.a.h)object).ar[n9]);
                        }
                        for (n9 = 0; n9 < arrayList.size(); ++n9) {
                            this.a("[" + n9 + "] = " + String.valueOf(arrayList.get(n9)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n9)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.startsWith("::m2colors")) {
                int n10 = Integer.valueOf(string.split(" ")[1]);
                rs.d.k k5 = rs.d.k.f(n10);
                if (k5 == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.a.h(k5.K);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.a.h)object).ar != null) {
                        int n11;
                        for (n11 = 0; n11 < ((rs.a.h)object).ah; ++n11) {
                            if (arrayList.contains(((rs.a.h)object).ar[n11])) continue;
                            arrayList.add(((rs.a.h)object).ar[n11]);
                        }
                        for (n11 = 0; n11 < arrayList.size(); ++n11) {
                            this.a("[" + n11 + "] = " + String.valueOf(arrayList.get(n11)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n11)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.equals("::map") && rs.l.j.b(cT)) {
                rs.d.r.a(true);
            }
            if (string.equals("::dumpitems") && rs.l.j.b(cT)) {
                this.a(false);
            }
            if (string.startsWith("::selectdump") && rs.l.j.b(cT)) {
                int n12 = Integer.parseInt(string.split(" ")[1]);
                this.a(n12);
            }
            if (string.equals("::lag") && rs.l.j.b(cT)) {
                this.bB();
            }
        }
        if (string.equals("::clienthide") && rs.l.j.b(cT)) {
            Client.eR.bm = false;
        }
        if (string.equals("::clientshow") && rs.l.j.b(cT)) {
            Client.eR.bm = true;
        }
        if (string.equals("::coordson")) {
            rs.f.a.ao = true;
        }
        if (string.equals("::coordsoff")) {
            rs.f.a.ao = false;
        }
        if (string.equals("::dataon")) {
            rs.f.a.am = true;
        }
        if (string.equals("::dataoff")) {
            rs.f.a.am = false;
        }
        if (string.equals("::teletoggle") && rs.l.j.c(cT)) {
            rs.f.a.t = !rs.f.a.t;
            this.a("<img=6> You've " + (rs.f.a.t ? "enabled" : "disabled") + " this option!", 0, null);
            rs.f.a.d();
        }
        if (string.equals("::damage_test prepare")) {
            for (String string6 : stringArray = new String[]{"::infspec", "::boost", "::tank"}) {
                fv.a(103);
                fv.b(string6.length() - 1);
                fv.a(string6.substring(2));
            }
        }
        if (string.equals("::fps")) {
            rs.f.a.bm = !rs.f.a.bm;
            this.a("<img=163> You've " + (rs.f.a.bm ? "enabled" : "disabled") + " FPS display! Re-enter the command @blu@::fps@bla@ again to toggle.", 0, null);
        }
        if (string.equals("::ping") && rs.l.j.b(cT)) {
            rs.f.a.bn = !rs.f.a.bn;
            this.a("<img=163> You've " + (rs.f.a.bn ? "enabled" : "disabled") + " ping display! Re-enter the command @blu@::ping@bla@ again to toggle.", 0, null);
        }
        if (string.toLowerCase().startsWith("::displayicon") && rs.l.j.b(cT)) {
            try {
                int n13;
                rs.f.a.bf = n13 = Integer.parseInt(string.split(" ")[1]);
                this.a("<img=163> You have set displayed icon to: @blu@" + n13, 0, null);
                rs.n.c.ai.h();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.equals("::showbh")) {
            rs.f.a.bo = true;
            this.a("<img=163> You've enabled BH display! Re-enter the command @blu@::hidebh@bla@ to hide it.", 0, null);
        }
        if (string.equals("::hidebh")) {
            rs.f.a.bo = false;
            this.a("<img=163> You've disabled BH display! Re-enter the command @blu@::showbh@bla@ to show it again.", 0, null);
        }
        if (string.equalsIgnoreCase("::gsdecor")) {
            rs.f.a.aV = !rs.f.a.aV;
            this.a("<img=163> You've " + (!rs.f.a.aV ? "@blu@enabled@bla@" : "@red@disabled@bla@") + " godsword special scroll decorations!", 0, null);
        }
        if (string.equalsIgnoreCase("::bots")) {
            rs.f.a.bp = !rs.f.a.bp;
            this.a("<img=163> You've " + (rs.f.a.bp ? "enabled" : "disabled") + " bots! Re-enter the command @blu@::bots@bla@ again to toggle.", 0, null);
        }
        if (string.toLowerCase().startsWith("::setdrag")) {
            try {
                int n14;
                rs.f.a.bd = n14 = Integer.parseInt(string.split(" ")[1]);
                this.a("<img=163> You have set item dragging to: @blu@" + n14, 0, null);
                rs.n.c.ai.h();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.toLowerCase().startsWith("::setswitch")) {
            try {
                if (rs.f.a.aE) {
                    this.a("<img=25> This value is set to @blu@0@bla@ by default with 07 ticks enabled!", 0, null);
                } else {
                    int n15 = Integer.parseInt(string.split(" ")[1]);
                    if (n15 < 0) {
                        n15 = 0;
                    }
                    if (n15 > 500) {
                        n15 = 500;
                    }
                    ic = n15;
                    this.a("<img=163> You have set item switching to: @blu@" + n15, 0, null);
                    rs.n.c.ai.h();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.equals("::console")) {
            rs.f.a.aM = !rs.f.a.aM;
            this.a("<img=163> Developer console is now: " + (rs.f.a.aM ? "@blu@ON" : "@red@OFF"), 0, null);
            rs.f.a.d();
        }
        if (string.equals("::noclip") && rs.l.j.b(cT)) {
            for (int i4 = 0; i4 < 4; ++i4) {
                for (int i5 = 1; i5 < 103; ++i5) {
                    for (int i6 = 1; i6 < 103; ++i6) {
                        this.fP[i4].a[i5][i6] = 0;
                    }
                }
            }
        }
        if (string.equals("::walktest") && rs.l.j.b(cT)) {
            boolean bl = this.a(0, 0, 0, 0, Client.eR.l[0], 0, 0, 67, Client.eR.k[0], true, 16);
        }
        if (string.equals("::testregion") && rs.l.j.b(cT)) {
            int[] nArray;
            int n16 = 0;
            for (int n17 : nArray = new int[]{16170}) {
                long l2 = System.currentTimeMillis();
                this.c(n17);
                rs.e.b();
                rs.e.a();
                long l3 = System.currentTimeMillis() - l2;
                System.out.println("Progress: " + ++n16 + "/" + nArray.length + " (" + l3 + " ms)");
            }
        }
        if (string.startsWith("::setitem") && rs.l.j.b(cT)) {
            String string7 = string.substring(10);
            if (string7.equalsIgnoreCase("-1")) {
                ba = false;
            } else {
                ba = true;
                bb = Integer.parseInt(string7);
                fb = true;
                rs.d.k k6 = rs.d.k.f(bb);
                bd = k6.Z;
                be = k6.G;
                bc = k6.M;
                bf = k6.v;
                bg = k6.W;
            }
        }
    }

    public void a(rs.n.e e2) {
        int n2 = e2.J;
        if (n2 >= 1 && n2 <= 100 || n2 >= 701 && n2 <= 800) {
            if (n2 == 1 && this.kB == 0) {
                e2.at = "Loading friend list";
                e2.M = 0;
                return;
            }
            if (n2 == 1 && this.kB == 1) {
                e2.at = "Connecting to friendserver";
                e2.M = 0;
                return;
            }
            if (n2 == 2 && this.kB != 2) {
                e2.at = "Please wait...";
                e2.M = 0;
                return;
            }
            int n3 = this.kA;
            if (this.kB != 2) {
                n3 = 0;
            }
            n2 = n2 > 700 ? (n2 -= 601) : --n2;
            if (n2 >= n3) {
                e2.at = "";
                e2.M = 0;
                return;
            }
            e2.at = this.mT[n2];
            e2.M = 1;
            return;
        }
        if (n2 >= 101 && n2 <= 200 || n2 >= 801 && n2 <= 900) {
            int n4 = this.kA;
            if (this.kB != 2) {
                n4 = 0;
            }
            n2 = n2 > 800 ? (n2 -= 701) : (n2 -= 101);
            if (n2 >= n4) {
                e2.at = "";
                e2.M = 0;
                return;
            }
            if (this.jG[n2] == 0) {
                e2.at = "@red@Offline";
            } else if (this.jG[n2] == 10) {
                e2.at = "@gre@Online";
            } else if (this.jG[n2] == 11) {
                e2.at = "<img=203> @yel@AFK";
            }
            e2.M = 1;
            return;
        }
        if (n2 == 203) {
            int n5 = this.kA;
            if (this.kB != 2) {
                n5 = 0;
            }
            e2.aH = n5 * 15 + 20;
            if (e2.aH <= e2.aR) {
                e2.aH = e2.aR + 1;
            }
            return;
        }
        if (n2 >= 401 && n2 <= 500) {
            if ((n2 -= 401) == 0 && this.kB == 0) {
                e2.at = "Loading ignore list";
                e2.M = 0;
                return;
            }
            if (n2 == 1 && this.kB == 0) {
                e2.at = "Please wait...";
                e2.M = 0;
                return;
            }
            int n6 = this.jD;
            if (this.kB == 0) {
                n6 = 0;
            }
            if (n2 >= n6) {
                e2.at = "";
                e2.M = 0;
                return;
            }
            e2.at = o_0.c(o_0.a(this.kP[n2]));
            e2.M = 1;
            return;
        }
        if (n2 == 503) {
            e2.aH = this.jD * 15 + 20;
            if (e2.aH <= e2.aR) {
                e2.aH = e2.aR + 1;
            }
            return;
        }
        if (n2 == 327) {
            e2.aU = 150;
            e2.aV = (int)(Math.sin((double)ff / 40.0) * 256.0) & 0x7FF;
            if (this.md) {
                int n7;
                int n8;
                for (int i2 = 0; i2 < 7; ++i2) {
                    n8 = this.mu[i2];
                    if (n8 < 0 || rs.d.j.b[n8].a()) continue;
                    return;
                }
                this.md = false;
                rs.a.h[] hArray = new rs.a.h[7];
                n8 = 0;
                for (int i3 = 0; i3 < 7; ++i3) {
                    n7 = this.mu[i3];
                    if (n7 < 0) continue;
                    hArray[n8++] = rs.d.j.b[n7].b();
                    int n9 = n8 - 1;
                    if (hArray[n9] == null) continue;
                    for (int[] nArray : dV) {
                        if (dU[4][this.lB[4]] != nArray[0]) continue;
                        hArray[n9].e(4550, nArray[1]);
                    }
                }
                rs.a.h h2 = new rs.a.h(n8, hArray);
                for (n7 = 0; n7 < 5; ++n7) {
                    if (this.lB[n7] == 0) continue;
                    if (dU[4][this.lB[4]] == 10 || dU[4][this.lB[4]] == 491769) {
                        h2.b(new int[]{4550}, -50);
                    }
                    h2.i(dU[n7][0], dU[n7][this.lB[n7]]);
                    if (n7 != 1) continue;
                    h2.i(fz[0], fz[this.lB[n7]]);
                }
                h2.n();
                h2.f(rs.d.a.a[Client.eR.t].e[0], Client.eR.t);
                h2.b(64, 850, -30, -50, -30, true);
                e2.ae = 5;
                e2.af = 0;
                rs.n.e.a(this.lD, h2);
            }
            return;
        }
        if (n2 == 328) {
            int n10 = 150;
            int n11 = (int)(Math.sin((double)ff / 40.0) * 256.0) & 0x7FF;
            e2.aU = n10;
            e2.aV = n11;
            if (this.md) {
                int n12;
                rs.a.h h3 = eR.m();
                for (n12 = 0; n12 < 5; ++n12) {
                    if (this.lB[n12] == 0) continue;
                    h3.i(dU[n12][0], dU[n12][this.lB[n12]]);
                    if (n12 != 1) continue;
                    h3.i(fz[0], fz[this.lB[n12]]);
                }
                n12 = eR.p();
                if (h3 == null) {
                    return;
                }
                h3.n();
                h3.f(rs.d.a.a[n12].e[0], n12);
                e2.ae = 5;
                e2.af = 0;
                rs.n.e.a(this.lD, h3);
            }
        }
        if (n2 == 324) {
            if (this.kT == null) {
                this.kT = e2.E;
                this.kU = e2.aG;
            }
            if (this.ml) {
                e2.E = this.kU;
                return;
            }
            e2.E = this.kT;
            return;
        }
        if (n2 == 325) {
            if (this.kT == null) {
                this.kT = e2.E;
                this.kU = e2.aG;
            }
            if (this.ml) {
                e2.E = this.kT;
                return;
            }
            e2.E = this.kU;
            return;
        }
        if (n2 == 600) {
            e2.at = this.kr;
            if (ff % 20 < 10) {
                e2.at = e2.at + "|";
                return;
            }
            e2.at = e2.at + " ";
            return;
        }
        if (n2 == 613) {
            if (cT == 1 || cT == 2) {
                if (this.nz) {
                    e2.ad = 0xFF0000;
                    e2.at = "Moderator option: Mute player for 48 hours: <ON>";
                } else {
                    e2.ad = 0xFFFFFF;
                    e2.at = "Moderator option: Mute player for 48 hours: <OFF>";
                }
            } else {
                e2.at = "";
            }
        }
        if (n2 == 650 || n2 == 655) {
            if (this.nR != 0) {
                Object object = this.lM == 0 ? "earlier today" : (this.lM == 1 ? "yesterday" : this.lM + " days ago");
                e2.at = "You last logged in " + (String)object + " from: " + rs.v.a.i;
            } else {
                e2.at = "";
            }
        }
        if (n2 == 651) {
            if (this.nx == 0) {
                e2.at = "0 unread messages";
                e2.ad = 0xFFFF00;
            }
            if (this.nx == 1) {
                e2.at = "1 unread message";
                e2.ad = 65280;
            }
            if (this.nx > 1) {
                e2.at = this.nx + " unread messages";
                e2.ad = 65280;
            }
        }
        if (n2 == 652) {
            if (this.nC == 201) {
                e2.at = this.nf == 1 ? "@yel@This is a non-members world: @whi@Since you are a member we" : "";
            } else if (this.nC == 200) {
                e2.at = "You have not yet set any password recovery questions.";
            } else {
                Object object = this.nC == 0 ? "Earlier today" : (this.nC == 1 ? "Yesterday" : this.nC + " days ago");
                e2.at = (String)object + " you changed your recovery questions";
            }
        }
        if (n2 == 653) {
            e2.at = this.nC == 201 ? (this.nf == 1 ? "@whi@recommend you use a members world instead. You may use" : "") : (this.nC == 200 ? "We strongly recommend you do so now to secure your account." : "If you do not remember making this change then cancel it immediately");
        }
        if (n2 == 654) {
            if (this.nC == 201) {
                if (this.nf == 1) {
                    e2.at = "@whi@this world but member benefits are unavailable whilst here.";
                    return;
                }
                e2.at = "";
                return;
            }
            if (this.nC == 200) {
                e2.at = "Do this from the 'account management' area on our front webpage";
                return;
            }
            e2.at = "Do this from the 'account management' area on our front webpage";
        }
    }

    public void D() {
        int n2;
        int n3;
        if (this.eN == 0L && this.nS == 0) {
            if (rs.f.a.aA && this.co != null && !this.co.equals("")) {
                int n4 = rs.f.a.ai == a.c.a ? 0 : ah - 499;
                this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4, 329 + n4, 0xFFFFFF, 0);
            }
            return;
        }
        int n5 = Client.ai() ? 0 : 4;
        int n6 = n3 = Client.ai() ? 0 : -4;
        if (this.v.h() && !this.f()) {
            n3 -= 135;
        }
        rs.l.k_0 k_02 = this.gi;
        int n7 = 0;
        if (this.eN != 0L || rs.f.a.aA && this.co != null && !this.co.equals("")) {
            int n8 = n2 = rs.f.a.ai == a.c.a ? 0 : ah - 499;
            if (this.eN == 0L) {
                this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4 + n5, 329 + n2 - n3, 0xFFFFFF, 0);
            }
            n7 = 1;
        }
        for (n2 = 0; n2 < 200; ++n2) {
            int n9;
            if (this.dC[n2] == null) continue;
            int n10 = this.dz[n2];
            String string = this.dB[n2];
            int n11 = this.dA[n2];
            int n12 = 170;
            int n13 = rs.l.j.a(string, n11);
            if ((n10 == 3 || n10 == 7) && (n10 == 7 || this.cE == 0 || this.cE == 1 && this.i(string))) {
                n9 = 329 - n7 * 13;
                if (rs.f.a.ai != a.c.a) {
                    n9 = ah - n12 - n7 * 13;
                }
                int n14 = 4 + n5;
                this.gm.b("From", n14, n9 -= n3, n13, 0);
                n14 += k_02.a("From ");
                if (n11 >= 1 && n11 < fE.length) {
                    int n15 = 0;
                    if (rs.l.h.b(n11) == 94) {
                        n15 = -1;
                    }
                    if (rs.l.j.b.w_(n11)) {
                        n14 += ((rs.l.a.a)rs.l.j.b.b(n11)).h();
                    }
                    fE[rs.l.h.b(n11)].f(n14 + n15, n9 - 12);
                    n14 += 14;
                    if (rs.l.j.b.w_(n11)) {
                        n14 += ((rs.l.a.a)rs.l.j.b.b(n11)).j();
                    }
                }
                this.gm.b(string + ": " + this.dC[n2], n14, n9, n13, 0);
                if (++n7 >= 5) {
                    return;
                }
            }
            if (n10 == 5 && this.cE < 2) {
                n9 = 329 - n7 * 13;
                if (rs.f.a.ai != a.c.a) {
                    n9 = ah - n12 - n7 * 13;
                }
                k_02.b(0, this.dC[n2], n9 -= n3, 4 + n5);
                k_02.b(65535, this.dC[n2], n9 - 1, 4 + n5);
                if (++n7 >= 5) {
                    return;
                }
            }
            if (n10 != 6 || this.cE >= 2) continue;
            n9 = 329 - n7 * 13;
            if (rs.f.a.ai != a.c.a) {
                n9 = ah - n12 - n7 * 13;
            }
            k_02.b(0, "To " + string + ": " + this.dC[n2], n9 -= n3, 4 + n5);
            k_02.b(65535, "To " + string + ": " + this.dC[n2], n9 - 1, 4 + n5);
            if (++n7 < 5) continue;
            return;
        }
    }

    public void a(String string, int n2, String string2) {
        int n3;
        String string3 = string;
        string = this.ix.a(this.iw.a(string));
        if (n2 == 0 && this.en != -1) {
            this.cD = string;
            this.hU = 0;
        }
        if (this.gp == -1) {
            fM = true;
        }
        n2 = rs.i.a.a(string, n2);
        string = rs.i.a.b(string, n2);
        boolean bl = rs.i.a.c(string, n2);
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage(string);
        this.p.post(chatMessage);
        for (n3 = 199; n3 > 0; --n3) {
            this.dA[n3] = this.dA[n3 - 1];
            this.dz[n3] = this.dz[n3 - 1];
            this.dB[n3] = this.dB[n3 - 1];
            this.dC[n3] = this.dC[n3 - 1];
            this.dD[n3] = this.dD[n3 - 1];
        }
        n3 = 0;
        for (int i2 = 0; i2 <= fE.length; ++i2) {
            if (string2 == null || !string2.startsWith("@cr" + i2 + "@")) continue;
            int n4 = 5;
            if (i2 >= 10 && i2 <= 99) {
                n4 = 6;
            }
            if (i2 >= 100) {
                n4 = 7;
            }
            string2 = string2.substring(n4);
            n3 = i2;
        }
        if (n2 == 7) {
            this.p.post(new PrivateChatMessage(string2, string));
        }
        string2 = rs.l.h.d(string2);
        string = this.ix.b(this.iw.b(rs.l.h.d(rs.i.a.b(string3, n2))));
        this.dA[0] = n3;
        this.dz[0] = n2;
        this.dB[0] = string2;
        this.dC[0] = string;
        this.dD[0] = bl;
    }

    public boolean E() {
        int n2;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = rs.f.a.ai == a.c.a ? 0 : ai - 772;
        int n4 = n2 = rs.f.a.ai == a.c.a ? 0 : ah - 505;
        if (this.hU == 1) {
            if (rs.f.a.ai == a.c.a || rs.f.a.ai != a.c.a && !bl) {
                for (int i2 = 0; i2 < this.iU.length; ++i2) {
                    if (rs.c_0.hP < this.iV[i2] + n3 || rs.c_0.hP > this.iV[i2] + this.iU[i2] + n3 || rs.c_0.hQ < this.iW[i2] + n2 || rs.c_0.hQ >= this.iW[i2] + 37 + n2 || eT[i2] == -1) continue;
                    fL = i2;
                    eM = true;
                    return true;
                }
            } else if (bl && ai < 1000) {
                if (this.hV >= ai - 226 && this.hV <= ai - 195 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[0] != -1) {
                    bl2 = fL == 0 ? !bl2 : true;
                    fL = 0;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 194 && this.hV <= ai - 163 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[1] != -1) {
                    bl2 = fL == 1 ? !bl2 : true;
                    fL = 1;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 162 && this.hV <= ai - 131 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[2] != -1) {
                    bl2 = fL == 2 ? !bl2 : true;
                    fL = 2;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 129 && this.hV <= ai - 98 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[3] != -1) {
                    bl2 = fL == 3 ? !bl2 : true;
                    fL = 3;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 97 && this.hV <= ai - 66 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[4] != -1) {
                    bl2 = fL == 4 ? !bl2 : true;
                    fL = 4;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 65 && this.hV <= ai - 34 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[5] != -1) {
                    bl2 = fL == 5 ? !bl2 : true;
                    fL = 5;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 33 && this.hV <= ai && this.hW >= ah - 72 && this.hW < ah - 40 && eT[6] != -1) {
                    bl2 = fL == 6 ? !bl2 : true;
                    fL = 6;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 194 && this.hV <= ai - 163 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[8] != -1) {
                    bl2 = fL == 8 ? !bl2 : true;
                    fL = 8;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 162 && this.hV <= ai - 131 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[9] != -1) {
                    bl2 = fL == 9 ? !bl2 : true;
                    fL = 9;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 129 && this.hV <= ai - 98 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[10] != -1) {
                    bl2 = fL == 7 ? !bl2 : true;
                    fL = 7;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 97 && this.hV <= ai - 66 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[11] != -1) {
                    bl2 = fL == 11 ? !bl2 : true;
                    fL = 11;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 65 && this.hV <= ai - 34 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[12] != -1) {
                    bl2 = fL == 12 ? !bl2 : true;
                    fL = 12;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 33 && this.hV <= ai && this.hW >= ah - 37 && this.hW < ah - 0 && eT[13] != -1) {
                    bl2 = fL == 13 ? !bl2 : true;
                    fL = 13;
                    eM = true;
                    return true;
                }
            } else if (bl && ai >= 1000 && rs.c_0.hQ >= ah - 37 && rs.c_0.hQ <= ah) {
                if (rs.c_0.hP >= ai - 417 && rs.c_0.hP <= ai - 386) {
                    bl2 = fL == 0 ? !bl2 : true;
                    fL = 0;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 385 && rs.c_0.hP <= ai - 354) {
                    bl2 = fL == 1 ? !bl2 : true;
                    fL = 1;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 353 && rs.c_0.hP <= ai - 322) {
                    bl2 = fL == 2 ? !bl2 : true;
                    fL = 2;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 321 && rs.c_0.hP <= ai - 290) {
                    bl2 = fL == 3 ? !bl2 : true;
                    fL = 3;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 289 && rs.c_0.hP <= ai - 258) {
                    bl2 = fL == 4 ? !bl2 : true;
                    fL = 4;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 257 && rs.c_0.hP <= ai - 226) {
                    bl2 = fL == 5 ? !bl2 : true;
                    fL = 5;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 225 && rs.c_0.hP <= ai - 194) {
                    bl2 = fL == 6 ? !bl2 : true;
                    fL = 6;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 193 && rs.c_0.hP <= ai - 163) {
                    bl2 = fL == 8 ? !bl2 : true;
                    fL = 8;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 162 && rs.c_0.hP <= ai - 131) {
                    bl2 = fL == 9 ? !bl2 : true;
                    fL = 9;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 130 && rs.c_0.hP <= ai - 99) {
                    bl2 = fL == 7 ? !bl2 : true;
                    fL = 7;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 98 && rs.c_0.hP <= ai - 67) {
                    bl2 = fL == 11 ? !bl2 : true;
                    fL = 11;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 66 && rs.c_0.hP <= ai - 45) {
                    bl2 = fL == 12 ? !bl2 : true;
                    fL = 12;
                    eM = true;
                    return true;
                }
                if (rs.c_0.hP >= ai - 31 && rs.c_0.hP <= ai) {
                    bl2 = fL == 13 ? !bl2 : true;
                    fL = 13;
                    eM = true;
                    return true;
                }
            }
        }
        return false;
    }

    public void F() {
        this.bL();
        this.ha = null;
        this.gZ = null;
        this.gZ = new rs.l.c_0(765, 503, this.B());
        this.ga = true;
    }

    private String bC() {
        if (rs.v.a.h != null) {
            return rs.v.a.h.getDocumentBase().getHost().toLowerCase();
        }
        if (this.hH != null) {
            return "runescape.com";
        }
        return null;
    }

    private void b(f_0 f_02, int n2, int n3) {
        int n4 = n3 * n3 + n2 * n2;
        if (n4 > 4225 && this.jZ == 2) {
            if (n2 <= -45) {
                n2 = -45;
            }
            if (n2 >= 45) {
                n2 = 45;
            }
            if (n3 <= -45) {
                n3 = -45;
            }
            if (n3 >= 45) {
                n3 = 45;
            }
            this.a(this.lK, n3, n2);
            return;
        }
        if (n4 <= 4225 || n4 >= 90000) {
            this.a(f_02, n3, n2);
        }
    }

    public boolean b(int n2, int n3, int n4, int n5) {
        return rs.c_0.hP >= n2 && rs.c_0.hP <= n4 && rs.c_0.hQ >= n3 && rs.c_0.hQ <= n5;
    }

    public boolean d(int n2, int n3) {
        int n4 = 175;
        if (this.v != null && this.v.h() && !this.f()) {
            n4 = 29;
        }
        return n2 > 0 && n2 < 519 && n3 > ah - n4 && n3 < ah;
    }

    public static String a(double d2) {
        return NumberFormat.getInstance().format(d2);
    }

    public boolean G() {
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = true;
        if (this.b(ai - (ai <= 1000 ? 240 : 420), ah - (ai <= 1000 ? 90 : 37), ai, ah)) {
            return false;
        }
        if (rs.l.e.q.a) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? (ah <= 649 ? hQ >= 192 && hQ <= 211 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 281 && hQ <= 301 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 141 && hQ <= 161 && hP >= 721 && hP <= 736) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? hP >= ai - 119 && hP <= ai - 96 && hQ >= 166 && hQ <= 188 : hP >= 718 && hP <= 744 && hQ >= 57 && hQ <= 79) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? hP >= ai - 86 && hP <= ai - 62 && hQ >= 172 && hQ <= 198 : hP >= 710 && hP <= 733 && hQ >= 22 && hQ <= 48) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6 : hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (this.v.h) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? (ah <= 670 ? hQ >= 166 && hQ <= 182 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 313 && hQ <= 333 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 116 && hQ <= 134 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (rs.f.a.ai == a.c.b ? (ah <= 609 ? hQ >= 219 && hQ <= 238 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 250 && hQ <= 269 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 141 && hQ <= 161 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (this.d(rs.c_0.hP, rs.c_0.hQ)) {
            return false;
        }
        if (rs.f.a.ai == a.c.b && hQ >= 75 && hQ <= 107 && hP >= ai - 192 - 20 && hP <= ai - 133 - 20) {
            return false;
        }
        if (this.b(ai - 190, 0, ai, rs.f.a.ai == a.c.b ? 163 : 172)) {
            return false;
        }
        if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
            return false;
        }
        if (bl4 && (rs.c_0.hP >= ai - 420 && rs.c_0.hP <= ai && rs.c_0.hQ >= ah - 37 && rs.c_0.hQ <= ah || rs.c_0.hP > ai - 242 && rs.c_0.hP < ai && rs.c_0.hQ > ah - 335 && rs.c_0.hQ < ah)) {
            return false;
        }
        if (!bl3) {
            if (rs.c_0.hP > 0 && rs.c_0.hQ > 0 && rs.c_0.hQ < ai && rs.c_0.hQ < ah) {
                return rs.c_0.hP < ai - 242 || rs.c_0.hQ < ah - 335;
            }
            return false;
        }
        return true;
    }

    public void H() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        if (this.eA != 0) {
            return;
        }
        int n9 = rs.f.a.ai == a.c.a ? 0 : ah - 505;
        int n10 = rs.f.a.ai == a.c.a ? 0 : ai - 765;
        this.iB = false;
        this.fx[0] = "Cancel";
        this.eI[0] = 1107;
        this.eV = 1;
        if (!rs.l.b.a.b()) {
            this.bN();
            n8 = ah - 545;
            if (rs.f.a.ai == a.c.a) {
                n8 = 0;
            }
            if (rs.c_0.hP > 4 && rs.c_0.hQ > 480 + n8 && rs.c_0.hP < 516 && rs.c_0.hQ < ah) {
                this.W();
            }
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 75 && hQ <= 107 && hP >= ai - 192 - 20 && hP <= ai - 133 - 20) {
                    this.fx[2] = this.cp ? "Turn prayers off" : "Turn quick prayers on";
                    this.eI[2] = 1500;
                    this.eV = 2;
                    this.fx[1] = "Select quick prayers";
                    this.eI[1] = 1506;
                    this.eV = 3;
                }
            } else if (hQ >= 75 && hQ <= 107 && hP >= 518 && hP <= 575) {
                this.fx[2] = this.cp ? "Turn prayers off" : "Turn quick prayers on";
                this.eI[2] = 1500;
                this.eV = 2;
                this.fx[1] = "Select quick prayers";
                this.eI[1] = 1506;
                this.eV = 3;
            }
            if (rs.c_0.hP >= this.iV[6] + n10 && rs.c_0.hP <= this.iV[6] + this.iU[6] + n10 && rs.c_0.hQ >= this.iW[6] + n9 && rs.c_0.hQ < this.iW[6] + 37 + n9) {
                this.fx[2] = "Magic tab";
                this.eI[2] = 4246;
                this.eV = 2;
                this.fx[1] = (rs.n.c.ap.d ? "Disable" : "Enable") + " spell filtering";
                this.eI[1] = 4245;
                this.eV = 3;
            }
        }
        br = 0;
        if (!rs.l.b.a.b() && rs.c_0.hP >= 515 && rs.c_0.hQ >= 0 && rs.c_0.hP <= 765 && rs.c_0.hQ <= 167 && cH != -1) {
            this.a(cq, rs.n.e.H[cH], rs.c_0.hP, cr, rs.c_0.hQ, Client.ai() ? 0 : -4);
        }
        if (this.ks != this.ef) {
            this.ef = this.ks;
        }
        this.ks = 0;
        if (rs.l.b.a.b()) {
            if (cH != -1) {
                if (Client.aj()) {
                    this.a(0, rs.n.e.H[cH], rs.c_0.hP, 0, rs.c_0.hQ, Client.ai() ? 0 : -4);
                } else {
                    this.a(ai / 2 - 356, rs.n.e.H[cH], rs.c_0.hP, ah / 2 - 255, rs.c_0.hQ, 0);
                }
            }
        } else if (Client.aj()) {
            if (!(rs.l.e.q.a && cH == -1 || rs.c_0.hP <= 0 || rs.c_0.hQ <= 0 || rs.c_0.hP >= 516 || rs.c_0.hQ >= ak + 4)) {
                if (cH != -1) {
                    this.a(cq, rs.n.e.H[cH], rs.c_0.hP, cr, rs.c_0.hQ, Client.ai() ? 0 : -4);
                } else {
                    this.z();
                }
            }
        } else if (this.G()) {
            n8 = ai / 2 - 356;
            n7 = ah / 2 - 230;
            n6 = ai / 2 + 356;
            n5 = ah / 2 + 230;
            if (cH > 0) {
                rs.n.e e2 = rs.n.e.H[cH];
                n4 = Math.max(356, e2.P);
                int n11 = Math.max(230, e2.aR);
                n3 = e2.C != Integer.MAX_VALUE ? e2.C : ai / 2 - 356;
                int n12 = e2.D != Integer.MAX_VALUE ? e2.D : ah / 2 - 230;
                n8 = n3;
                n7 = n12;
                n6 = n3 + n4;
                n5 = n12 + n11;
            }
            if (rs.c_0.hP > n8 && rs.c_0.hQ > n7 && rs.c_0.hP < n6 && rs.c_0.hQ < n5 && cH != -1) {
                this.a(n8, rs.n.e.H[cH], rs.c_0.hP, n7, rs.c_0.hQ, 0);
            } else {
                this.z();
            }
        }
        if (this.ks != this.ef) {
            this.ef = this.ks;
        }
        this.ks = 0;
        n8 = 548;
        n7 = 207;
        n6 = 740;
        n5 = 468;
        if (!rs.l.b.a.b()) {
            if (rs.f.a.ai == a.c.a) {
                if (rs.c_0.hP > n8 && rs.c_0.hQ > n7 && rs.c_0.hP < n6 && rs.c_0.hQ < n5) {
                    if (this.fu != -1) {
                        this.a(n8 - (Client.ai() ? 0 : 4), rs.n.e.H[this.fu], rs.c_0.hP, n7, rs.c_0.hQ, Client.ai() ? 0 : 0);
                    } else if (eT[fL] != -1) {
                        this.a(n8 - (Client.ai() ? 0 : 4), rs.n.e.H[eT[fL]], rs.c_0.hP, n7, rs.c_0.hQ, Client.ai() ? 0 : 0);
                    }
                }
            } else if (rs.c_0.hP > 548 + n10 && rs.c_0.hP < 740 + n10 && rs.c_0.hQ > 207 + n9 && rs.c_0.hQ < 468 + n9) {
                if (this.fu != -1) {
                    this.a(548 + n10, rs.n.e.H[this.fu], rs.c_0.hP, 207 + n9, rs.c_0.hQ, 0);
                } else if (eT[fL] != -1) {
                    this.a(548 + n10, rs.n.e.H[eT[fL]], rs.c_0.hP, 207 + n9, rs.c_0.hQ, 0);
                }
            }
        }
        if (this.ks != this.ep) {
            fb = true;
            this.ep = this.ks;
        }
        this.ks = 0;
        if (rs.f.a.ai == a.c.a) {
            n8 = 0;
            n7 = this.f() ? 334 : ak;
            n6 = 490;
            n5 = 459;
            n2 = 20;
            n4 = 354;
            if (rs.c_0.hP > n8 && rs.c_0.hQ > n7 && rs.c_0.hP < n6 && rs.c_0.hQ < n5) {
                if (this.gp != -1) {
                    this.a(n2, rs.n.e.H[this.gp], rs.c_0.hP, n4, rs.c_0.hQ, Client.ai() ? 0 : -4);
                } else if (!rs.l.b.a.b() && rs.c_0.hQ < n5 && rs.c_0.hP < n6) {
                    this.E(rs.c_0.hQ - n7);
                }
            }
        } else {
            int n13 = n2 = !this.v.h() || this.f() ? 1 : 0;
            if (rs.c_0.hP > 0 && rs.c_0.hQ > ah - 163 && rs.c_0.hP < 490 && rs.c_0.hQ < ah && n2 != 0) {
                if (this.gp != -1) {
                    this.a(20, rs.n.e.H[this.gp], rs.c_0.hP, ah - 145, rs.c_0.hQ, 0);
                } else if (!rs.l.b.a.b() && rs.c_0.hQ < ah && rs.c_0.hP < 490) {
                    this.E(rs.c_0.hQ - ah - 166);
                }
            }
        }
        if (this.gp != -1 && this.ks != this.em) {
            fM = true;
            this.em = this.ks;
        }
        if (rs.c_0.hP >= 515 && rs.c_0.hQ >= 0 && rs.c_0.hP <= 765 && rs.c_0.hQ <= 167 && cH != -1) {
            this.a(cq, rs.n.e.H[cH], rs.c_0.hP, cr, rs.c_0.hQ, Client.ai() ? 0 : -4);
        }
        n2 = 0;
        while (n2 == 0) {
            n2 = 1;
            for (n4 = 0; n4 < this.eV - 1; ++n4) {
                if (this.eI[n4] >= 1000 || this.eI[n4 + 1] <= 1000) continue;
                String string = this.fx[n4];
                this.fx[n4] = this.fx[n4 + 1];
                this.fx[n4 + 1] = string;
                n3 = this.eI[n4];
                this.eI[n4] = this.eI[n4 + 1];
                this.eI[n4 + 1] = n3;
                n3 = this.eF[n4];
                this.eF[n4] = this.eF[n4 + 1];
                this.eF[n4 + 1] = n3;
                n3 = this.eG[n4];
                this.eG[n4] = this.eG[n4 + 1];
                this.eG[n4 + 1] = n3;
                n3 = this.eJ[n4];
                this.eJ[n4] = this.eJ[n4 + 1];
                this.eJ[n4 + 1] = n3;
                n3 = this.eH[n4];
                this.eH[n4] = this.eH[n4 + 1];
                this.eH[n4 + 1] = n3;
                n2 = 0;
            }
        }
    }

    private int i(int n2, int n3, int n4) {
        int n5 = 256 - n4;
        return ((n2 & 0xFF00FF) * n5 + (n3 & 0xFF00FF) * n4 & 0xFF00FF00) + ((n2 & 0xFF00) * n5 + (n3 & 0xFF00) * n4 & 0xFF0000) >> 8;
    }

    public void a(String string, String string2, boolean bl) {
        rs.v.a.o = string;
        try {
            int n2;
            Object object;
            int n3;
            if (this.fc && !bl) {
                return;
            }
            String string3 = this.fm;
            if (bl) {
                rs.l.d.c.b = false;
                this.G.a("Hello, @yel@" + Client.eR.aZ + "@whi@! Apparently, you've DCed..", "Please wait patiently while we attempt to reconnect you..");
            } else {
                if (string.equalsIgnoreCase("") || string2.equalsIgnoreCase("")) {
                    this.G.a("You can't login with a blank username or password!", "Please enter your valid account information and try again!");
                    return;
                }
                if (string2.startsWith(" ")) {
                    this.G.a("You can't login with a password starting with a blank", "space! Please re-type your password and try again!");
                    return;
                }
                this.G.a("Attempting to log you in..", "Please wait..");
            }
            rs.l.d.c.a = true;
            if (!rs.f.a.d.booleanValue() && this.l.b()) {
                rs.l.d.c.a = false;
                rs.l.d.c.b = true;
                this.G.a(rs.f.a.A + " has been updated!", "Please re-load your client");
                this.h(true);
                return;
            }
            this.nD = new rs.q.b(this, this.b(rs.f.a.b));
            rs.l.d.c.a = false;
            long l2 = o_0.a(string);
            int n4 = (int)(l2 >> 16 & 0x1FL);
            Client.fv.h = 0;
            fv.b(14);
            fv.b(n4);
            this.nD.a(2, Client.fv.g);
            for (n3 = 0; n3 < 8; ++n3) {
                this.nD.b();
            }
            n3 = this.nD.b();
            rs.l.d.c.b = true;
            int n5 = n3;
            if (n3 == 0) {
                this.nD.a(this.mU.g, 8);
                this.mU.h = 0;
                this.od = this.mU.E();
                object = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(this.od >> 32), (int)this.od};
                Client.fv.h = 0;
                fv.b(10);
                fv.g(object[0]);
                fv.g(object[1]);
                fv.g(object[2]);
                fv.g(object[3]);
                fv.g(rs.v.a.c);
                fv.g(rs.f.a.c);
                if (rs.f.a.h.booleanValue() || rs.f.a.c == 1) {
                    fv.g(rs.f.a.i);
                }
                if (rs.f.a.h.booleanValue()) {
                    fv.a(fn);
                }
                fv.a(string);
                fv.a(string2);
                fv.a(rs.v.a.e() == null ? "null" : rs.v.a.e());
                fv.a(string3);
                fv.M();
                this.jS.h = 0;
                if (bl) {
                    this.jS.b(18);
                } else {
                    this.jS.b(16);
                }
                this.jS.b(Client.fv.h + 36 + 1 + 1 + 2);
                this.jS.b(255);
                this.jS.d(317);
                this.jS.b(li ? 1 : 0);
                for (n2 = 0; n2 < 9; ++n2) {
                    this.jS.g(this.eE[n2]);
                }
                this.jS.a(Client.fv.g, Client.fv.h, 0);
                Client.fv.l = new rs.q.a((int[])object);
                n2 = 0;
                while (n2 < 4) {
                    int n6 = n2++;
                    object[n6] = object[n6] + 50;
                }
                this.lJ = new rs.q.a((int[])object);
                this.nD.a(this.jS.h, this.jS.g);
                n3 = this.nD.b();
            }
            if (n3 == 1) {
                try {
                    Thread.sleep(2000L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.a(string, string2, bl);
                return;
            }
            if (n3 == 2) {
                cT = this.nD.b();
                nX = this.nD.b() == 1;
                this.I();
                fv.a(185);
                fv.d(912);
                object = rs.n.e.H[912];
                if (object.X != null && object.X[0][0] == 5 && this.dP[n2 = object.X[0][1]] != object.I[0]) {
                    this.dP[n2] = object.I[0];
                    this.B(n2);
                    fb = true;
                }
                this.cc = false;
                this.cd = false;
                this.p(2, rs.f.a.s);
                this.p(5, rs.f.a.ap ? 1 : 0);
                this.p(8, rs.f.a.bu);
                this.p(6, rs.f.a.aj ? 1 : 0);
                this.p(3, rs.f.a.ak ? 1 : 0);
                this.p(4, rs.f.a.al ? 1 : 0);
                this.bI = true;
                this.p(10, rs.f.a.ax ? 1 : 0);
                this.p(11, rs.f.a.aw ? 1 : 0);
                this.p(12, rs.f.a.ay ? 1 : 0);
                this.p(13, rs.f.a.az ? 1 : 0);
                this.p(14, rs.f.a.aA ? 1 : 0);
                this.p(15, rs.f.a.aB ? 1 : 0);
                this.p(16, rs.f.a.aC ? 1 : 0);
                this.p(17, rs.f.a.aE ? 1 : 0);
                this.p(18, rs.f.a.aF ? 1 : 0);
                this.p(19, rs.f.a.aG ? 1 : 0);
                this.p(20, rs.f.a.aI ? 1 : 0);
                this.dP[167] = rs.f.a.s;
                this.p(21, rs.f.a.aJ ? 1 : 0);
                rs.f.a.ai = rs.f.a.ai == a.c.b ? a.c.a : a.c.b;
                this.p(22, rs.f.a.ai == a.c.b ? 0 : 1);
                rs.f.a.ah = !rs.f.a.ah;
                this.p(23, rs.f.a.ah ? 0 : 1);
                this.p(24, rs.f.a.aO ? 1 : 0);
                this.p(25, rs.f.a.aP ? 1 : 0);
                this.p(26, rs.f.a.aQ ? 1 : 0);
                this.p(27, rs.f.a.aT ? 1 : 0);
                this.p(28, rs.f.a.aZ ? 1 : 0);
                this.p(29, rs.f.a.bb ? 1 : 0);
                this.p(30, rs.f.a.aK ? 1 : 0);
                this.p(31, rs.f.a.aL ? 1 : 0);
                this.v.d();
                this.l(-1);
                if (rs.f.a.aE) {
                    this.at = "::oldtickslogin";
                }
                if (rs.f.a.Q) {
                    ao = "::gpuflagon";
                    if (rs.k.b.i) {
                        ao = "::stretchflagon";
                    }
                }
                rs.n.c.ai.h();
                rs.n.c.af.b(bk);
                if (f) {
                    rs.f.a.aj = false;
                    this.d();
                    return;
                }
                this.d();
                this.a(rs.f.a.ai);
                y_0.m(32001);
                rs.n.c.ap.j();
                rs.n.c.ap.i();
                this.cc = true;
                this.h();
                return;
            }
            if (n3 == 3) {
                this.G.a("Invalid username or password!", "Are you sure you typed everything in correctly?");
                return;
            }
            if (n3 == 4) {
                this.G.a("You have been banned.", "Please check the main site for details");
                return;
            }
            if (n3 == 5) {
                this.G.a("Your account is already logged in.", "Try again in 60 seconds..");
                return;
            }
            if (n3 == 6) {
                this.G.a(rs.f.a.A + " has been updated!", "Please reload your game client.");
                return;
            }
            if (n3 == 7) {
                this.G.a("This world is full.", "Please use a different world");
                return;
            }
            if (n3 == 8) {
                this.G.a("Unable to connect.", "Login server offline.");
                return;
            }
            if (n3 == 9) {
                this.G.a("Login limit exceeded.", "Too many connections from your address.");
                return;
            }
            if (n3 == 10) {
                this.G.a("This account is pending email verification..", "If you don't see the email, check your spam folder!");
                return;
            }
            if (n3 == 11) {
                this.G.a("Login server rejected session.", "Please try again.");
                return;
            }
            if (n3 == 12) {
                this.G.a("This account does not exist!", "Please register at @yel@www.spawnpk.net/register");
                return;
            }
            if (n3 == 13) {
                this.G.a("Could not complete login.", "Please try using a different world.");
                return;
            }
            if (n3 == 14) {
                this.G.a("The server is being updated.", "Please wait 1 minute and try again.");
                return;
            }
            if (n3 == 15) {
                this.fc = true;
                Client.fv.h = 0;
                this.mU.h = 0;
                this.lO = -1;
                this.jP = -1;
                this.jQ = -1;
                this.jR = -1;
                this.lN = 0;
                this.lP = 0;
                this.eN = 0L;
                this.eV = 0;
                dj = false;
                this.jE = System.currentTimeMillis();
                return;
            }
            if (n3 == 16) {
                this.G.a("Login attempts exceeded.", "Please wait 1 minute and try again.");
                return;
            }
            if (n3 == 17) {
                this.G.a(rs.f.a.A + " has been updated!", "Please reload your game client.");
                return;
            }
            if (n3 == 20) {
                this.G.a("Invalid loginserver requested", "Please try using a different world.");
                return;
            }
            if (n3 == 21) {
                for (int i2 = this.nD.b(); i2 >= 0; --i2) {
                    this.G.a("You have only just left another world", "Your profile will be transferred in: " + i2 + " seconds");
                    this.h(true);
                    try {
                        Thread.sleep(1000L);
                        continue;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                this.a(string, string2, bl);
                this.fd = false;
                return;
            }
            if (n3 == 22) {
                this.G.a("Your account is temporary locked! Please wait a few mins..", "This is usually for refunds, name changes, etc.");
                return;
            }
            if (n3 == 23) {
                this.G.a("Your username has been changed!", "Please login with your new username..");
                return;
            }
            if (n3 == 24) {
                this.G.a("Invation code is invalid or expired!", "Are you sure you typed it correctly?");
                return;
            }
            if (n3 == 25) {
                this.G.a("You can not login with a VPN connection!", "Please try on a different network..");
                return;
            }
            if (n3 == 26) {
                this.G.a(0);
                return;
            }
            if (n3 == 27) {
                this.G.a(1);
                return;
            }
            if (n3 == 28) {
                this.G.a(2);
                return;
            }
            if (n3 == 29) {
                this.G.a("This name was changed before SPK's Fresh Start.", "Please use the most recent username!");
                return;
            }
            if (n3 == 30) {
                this.G.a("SPK is currently under maintenance..", "Please try again later!");
                return;
            }
            if (n3 == -1) {
                if (n5 == 0) {
                    if (this.el < 2) {
                        try {
                            Thread.sleep(2000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        ++this.el;
                        this.a(string, string2, bl);
                        this.fd = false;
                        return;
                    }
                    this.G.a("No response from loginserver", "Please wait 1 minute and try again.");
                    return;
                }
                this.G.a("No response from server", "Please try using a different world.");
                return;
            }
            System.out.println("response:" + n3);
            this.G.a("Unexpected server response", "Please try using a different world.");
            return;
        }
        catch (IOException iOException) {
            this.oC = "";
            iOException.printStackTrace();
            rs.l.d.c.a = false;
            rs.l.d.c.b = true;
            this.G.a("Error connecting to server!", "The server, or your connection, may be offline!");
            return;
        }
    }

    @Override
    void e(int n2, int n3) {
        if (!this.ht) {
            return;
        }
        this.nM += n2 * 3;
        this.nN += n3 << 1;
    }

    public void I() {
        int n2;
        this.oe = 0L;
        this.lW = 0;
        this.kp.e = 0;
        this.iK = false;
        this.hJ = true;
        this.lf = true;
        this.fc = true;
        this.z = new rs.l.f.a.c.d();
        rs.l.f.e.d().a(this.z);
        if (this.x != null) {
            rs.l.f.e.d().b(this.x);
        }
        this.x = new c();
        rs.l.f.e.d().a(this.x);
        GameStateChanged gameStateChanged = new GameStateChanged();
        gameStateChanged.setGameState(rs.runelite.a.c.e);
        this.p.post(gameStateChanged);
        Client.fv.h = 0;
        this.mU.h = 0;
        this.lO = -1;
        this.jP = -1;
        this.jQ = -1;
        this.jR = -1;
        this.lN = 0;
        this.lP = 0;
        this.eN = 0L;
        this.lR = 0;
        this.jZ = 0;
        this.eV = 0;
        dj = false;
        this.hK = 0;
        for (n2 = 0; n2 < 200; ++n2) {
            this.dC[n2] = null;
        }
        this.gr = 0;
        this.eW = 0;
        ee = 0;
        this.ms = 0;
        this.ab();
        this.lV = 0;
        this.dR = -1;
        this.gd = 0;
        this.ge = 0;
        this.ku = 0;
        this.cB = 0;
        for (n2 = 0; n2 < this.kt; ++n2) {
            Client.do[n2] = null;
            this.ky[n2] = null;
        }
        for (n2 = 0; n2 < 16384; ++n2) {
            this.cA[n2] = null;
        }
        eR = Client.do[2047] = new rs.a.k();
        this.ea.f();
        this.et.f();
        for (n2 = 0; n2 < 4; ++n2) {
            for (int i2 = 0; i2 < 104; ++i2) {
                for (int i3 = 0; i3 < 104; ++i3) {
                    this.jH[n2][i2][i3] = null;
                }
            }
        }
        this.nL = new rs.h();
        this.kB = 0;
        this.kA = 0;
        this.en = -1;
        this.gp = -1;
        cH = -1;
        rs.n.a.a.c.b();
        this.fu = -1;
        ed = -1;
        this.eZ = false;
        fL = 3;
        this.fN = 0;
        dj = false;
        this.gb = false;
        this.cD = null;
        this.es = 0;
        this.er = -1;
        this.ml = true;
        this.bs();
        for (n2 = 0; n2 < 5; ++n2) {
            this.lB[n2] = 0;
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.nh[n2] = null;
            this.ni[n2] = false;
        }
        nH = 0;
        nk = 0;
        lz = 0;
        oO = 0;
        kO = 0;
        nO = 0;
        ny = 0;
        oh = 0;
        this.F();
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl, int n11) {
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18 = 104;
        int n19 = 104;
        if (n10 < 0 || n6 < 0) {
            System.out.println("Prevented walk crash #1");
            return false;
        }
        if (n6 >= this.kC.length || n10 >= this.jF.length) {
            System.out.println("Prevented walk crash #2");
            return false;
        }
        for (n17 = 0; n17 < n18; ++n17) {
            for (n16 = 0; n16 < n19; ++n16) {
                this.kC[n17][n16] = 0;
                this.jF[n17][n16] = 99999999;
            }
        }
        n17 = n10;
        n16 = n6;
        int n20 = n11 + eh;
        int n21 = n9 + ei;
        int n22 = (n20 >> 6) * 256 + (n21 >> 6);
        if (rs.l.j.c(cT) && ch && rs.f.a.t) {
            this.q(n20, n21);
            return true;
        }
        this.kC[n10][n6] = 99;
        this.jF[n10][n6] = 0;
        int n23 = 0;
        int n24 = 0;
        this.oK[n23] = n10;
        this.oL[n23++] = n6;
        boolean bl2 = false;
        int n25 = this.oK.length;
        int[][] nArray = this.fP[Client.dw].a;
        if (n22 == 13660 || n22 == 13916 || n22 == 14172 || n22 == 14171 || n22 == 14170 || n22 == 14169 || n22 == 13913 || n22 == 13657 || n22 == 13401 || n22 == 13402 || n22 == 13403 || n22 == 13404) {
            return false;
        }
        if (n22 == 11309) {
            for (n15 = 2816; n15 <= 2821; ++n15) {
                for (n14 = 2933; n14 <= 2941; ++n14) {
                    n13 = Math.abs(n15 - eh);
                    n12 = Math.abs(n14 - ei);
                    if (n13 > nArray.length - 1 || n12 > nArray[n13].length - 1) continue;
                    nArray[n13][n12] = 0;
                }
            }
        }
        if (n22 == 12611 && this.aB) {
            for (n15 = 3154; n15 <= 3182; ++n15) {
                for (n14 = 4303; n14 <= 4323; ++n14) {
                    n13 = Math.abs(n15 - eh);
                    n12 = Math.abs(n14 - ei);
                    nArray[n13][n12] = 0;
                }
            }
        }
        if (n22 == 12342) {
            n15 = Math.abs(n20 - eh);
            n14 = Math.abs(n21 - ei);
            if (n20 == 3083 && n21 == 3491) {
                nArray[n15][n14] = 0;
            }
            if (n20 == 3083 && n21 == 3492) {
                nArray[n15][n14] = 0;
            }
        }
        while (n24 != n23) {
            n17 = this.oK[n24];
            n16 = this.oL[n24];
            n24 = (n24 + 1) % n25;
            if (n17 >= 103) {
                n17 = 102;
            }
            if (n16 >= 103) {
                n16 = 102;
            }
            if (n17 == n11 && n16 == n9) {
                bl2 = true;
                break;
            }
            if (n5 != 0) {
                if ((n5 < 5 || n5 == 10) && this.fP[dw].a(n11, n17, n16, n3, n5 - 1, n9)) {
                    bl2 = true;
                    break;
                }
                if (n5 < 10 && this.fP[dw].b(n11, n9, n16, n5 - 1, n3, n17)) {
                    bl2 = true;
                    break;
                }
            }
            if (n7 != 0 && n4 != 0 && this.fP[dw].a(n9, n11, n17, n4, n8, n7, n16)) {
                bl2 = true;
                break;
            }
            n15 = this.jF[n17][n16] + 1;
            if (n17 > 0 && this.kC[n17 - 1][n16] == 0 && (nArray[n17 - 1][n16] & 0x1280108) == 0) {
                this.oK[n23] = n17 - 1;
                this.oL[n23] = n16;
                n23 = (n23 + 1) % n25;
                this.kC[n17 - 1][n16] = 2;
                this.jF[n17 - 1][n16] = n15;
            }
            if (n17 < n18 - 1 && this.kC[n17 + 1][n16] == 0 && (nArray[n17 + 1][n16] & 0x1280180) == 0) {
                this.oK[n23] = n17 + 1;
                this.oL[n23] = n16;
                n23 = (n23 + 1) % n25;
                this.kC[n17 + 1][n16] = 8;
                this.jF[n17 + 1][n16] = n15;
            }
            if (n16 > 0 && this.kC[n17][n16 - 1] == 0 && (nArray[n17][n16 - 1] & 0x1280102) == 0) {
                this.oK[n23] = n17;
                this.oL[n23] = n16 - 1;
                n23 = (n23 + 1) % n25;
                this.kC[n17][n16 - 1] = 1;
                this.jF[n17][n16 - 1] = n15;
            }
            if (n16 < n19 - 1 && this.kC[n17][n16 + 1] == 0 && (nArray[n17][n16 + 1] & 0x1280120) == 0) {
                this.oK[n23] = n17;
                this.oL[n23] = n16 + 1;
                n23 = (n23 + 1) % n25;
                this.kC[n17][n16 + 1] = 4;
                this.jF[n17][n16 + 1] = n15;
            }
            if (n17 > 0 && n16 > 0 && this.kC[n17 - 1][n16 - 1] == 0 && (nArray[n17 - 1][n16 - 1] & 0x128010E) == 0 && (nArray[n17 - 1][n16] & 0x1280108) == 0 && (nArray[n17][n16 - 1] & 0x1280102) == 0) {
                this.oK[n23] = n17 - 1;
                this.oL[n23] = n16 - 1;
                n23 = (n23 + 1) % n25;
                this.kC[n17 - 1][n16 - 1] = 3;
                this.jF[n17 - 1][n16 - 1] = n15;
            }
            if (n17 < n18 - 1 && n16 > 0 && this.kC[n17 + 1][n16 - 1] == 0 && (nArray[n17 + 1][n16 - 1] & 0x1280183) == 0 && (nArray[n17 + 1][n16] & 0x1280180) == 0 && (nArray[n17][n16 - 1] & 0x1280102) == 0) {
                this.oK[n23] = n17 + 1;
                this.oL[n23] = n16 - 1;
                n23 = (n23 + 1) % n25;
                this.kC[n17 + 1][n16 - 1] = 9;
                this.jF[n17 + 1][n16 - 1] = n15;
            }
            if (n17 > 0 && n16 < n19 - 1 && this.kC[n17 - 1][n16 + 1] == 0 && (nArray[n17 - 1][n16 + 1] & 0x1280138) == 0 && (nArray[n17 - 1][n16] & 0x1280108) == 0 && (nArray[n17][n16 + 1] & 0x1280120) == 0) {
                this.oK[n23] = n17 - 1;
                this.oL[n23] = n16 + 1;
                n23 = (n23 + 1) % n25;
                this.kC[n17 - 1][n16 + 1] = 6;
                this.jF[n17 - 1][n16 + 1] = n15;
            }
            if (n17 >= n18 - 1 || n16 >= n19 - 1 || this.kC[n17 + 1][n16 + 1] != 0 || (nArray[n17 + 1][n16 + 1] & 0x12801E0) != 0 || (nArray[n17 + 1][n16] & 0x1280180) != 0 || (nArray[n17][n16 + 1] & 0x1280120) != 0) continue;
            this.oK[n23] = n17 + 1;
            this.oL[n23] = n16 + 1;
            n23 = (n23 + 1) % n25;
            this.kC[n17 + 1][n16 + 1] = 12;
            this.jF[n17 + 1][n16 + 1] = n15;
        }
        this.oB = 0;
        if (!bl2) {
            if (bl) {
                n15 = 100;
                for (n14 = 1; n14 < 2; ++n14) {
                    for (n13 = n11 - n14; n13 <= n11 + n14; ++n13) {
                        for (n12 = n9 - n14; n12 <= n9 + n14; ++n12) {
                            if (n13 < 0 || n12 < 0 || n13 >= 104 || n12 >= 104 || this.jF[n13][n12] >= n15) continue;
                            n15 = this.jF[n13][n12];
                            n17 = n13;
                            n16 = n12;
                            this.oB = 1;
                            bl2 = true;
                        }
                    }
                    if (bl2) break;
                }
            }
            if (!bl2) {
                return false;
            }
        }
        n24 = 0;
        this.oK[n24] = n17;
        this.oL[n24++] = n16;
        n14 = n15 = this.kC[n17][n16];
        while (n17 != n10 || n16 != n6) {
            if (n14 != n15) {
                n15 = n14;
                this.oK[n24] = n17;
                this.oL[n24++] = n16;
            }
            if ((n14 & 2) != 0) {
                ++n17;
            } else if ((n14 & 8) != 0) {
                --n17;
            }
            if ((n14 & 1) != 0) {
                ++n16;
            } else if ((n14 & 4) != 0) {
                --n16;
            }
            n14 = this.kC[n17][n16];
        }
        if (n24 > 0) {
            int n26;
            n14 = n24;
            if (n14 > 25) {
                n14 = 25;
            }
            n13 = this.oK[--n24];
            n12 = this.oL[n24];
            if ((oO += n14) >= 92) {
                fv.a(36);
                fv.g(0);
                oO = 0;
            }
            if (n2 == 0) {
                fv.a(164);
                fv.b(n14 + n14 + 3);
            }
            if (n2 == 1) {
                fv.a(248);
                fv.b(n14 + n14 + 3 + 14);
            }
            if (n2 == 2) {
                fv.a(98);
                fv.b(n14 + n14 + 3);
            }
            fv.p(n13 + eh);
            this.gd = this.oK[0];
            this.ge = this.oL[0];
            for (n26 = 1; n26 < n14; ++n26) {
                fv.b(this.oK[--n24] - n13);
                fv.b(this.oL[n24] - n12);
            }
            n26 = eh + (Client.eR.ac - 6 >> 7);
            int n27 = ei + (Client.eR.ad - 6 >> 7);
            fv.n(n12 + ei);
            fv.l(this.hY[5] != 1 ? 0 : 1);
            return true;
        }
        return n2 != 1;
    }

    private void b(rs.x.e e2) {
        for (int i2 = 0; i2 < this.kw; ++i2) {
            int n2;
            int n3;
            int n4;
            int n5 = this.kx[i2];
            rs.a.j j2 = this.cA[n5];
            int n6 = e2.A();
            if ((n6 & 0x100) != 0) {
                j2.V = e2.P();
                j2.X = e2.P();
                j2.W = e2.P();
                j2.Y = e2.P();
                j2.Z = e2.U() + ff;
                j2.aa = e2.T() + ff;
                j2.ab = e2.P();
                j2.e();
            }
            if ((n6 & 0x10) != 0) {
                n4 = e2.S();
                if (n4 == 65535) {
                    n4 = -1;
                }
                n3 = e2.y();
                if (n4 == j2.F && n4 != -1) {
                    n2 = j2.d()[n4].q;
                    if (n2 == 1) {
                        j2.G = 0;
                        j2.H = 0;
                        j2.I = n3;
                        j2.J = 0;
                    }
                    if (n2 == 2) {
                        j2.J = 0;
                    }
                } else if (n4 == -1 || j2.F == -1 || j2.d()[n4].k >= j2.d()[j2.F].k) {
                    j2.F = n4;
                    j2.G = 0;
                    j2.H = 0;
                    j2.I = n3;
                    j2.J = 0;
                    j2.U = j2.E;
                }
            }
            if ((n6 & 8) != 0) {
                n4 = e2.y();
                for (n3 = 0; n3 < n4; ++n3) {
                    n2 = e2.o();
                    int n7 = e2.y();
                    int n8 = e2.y();
                    j2.a(n7, n2, ff, n8);
                }
                j2.L = ff + 300;
                j2.M = e2.o();
                j2.N = e2.o();
            }
            if ((n6 & 0x40) != 0) {
                n4 = e2.O();
                n3 = e2.P();
                n2 = e2.y();
                j2.a(n3, n4, ff, n2);
                j2.L = ff + 300;
                j2.M = e2.P();
                j2.N = e2.O();
            }
            if ((n6 & 0x80) != 0) {
                j2.z = e2.A();
                n4 = e2.D();
                j2.D = n4 >> 16;
                j2.C = ff + (n4 & 0xFFFF);
                j2.A = 0;
                j2.B = 0;
                if (j2.C > ff) {
                    j2.A = -1;
                }
                if (j2.z == 65535) {
                    j2.z = -1;
                }
            }
            if ((n6 & 0x20) != 0) {
                j2.m = e2.A();
                if (j2.m == 65535) {
                    j2.m = -1;
                }
            }
            if ((n6 & 1) != 0) {
                j2.q = e2.F();
                j2.O = 100;
                if (j2.aG.x == 8330L && j2.q.equals("SNIPE")) {
                    j2.aA = 0;
                    j2.aB = 0;
                    j2.aC = 1;
                    j2.aD = 8;
                    j2.aE = 3;
                    j2.q = null;
                    j2.O = 0;
                }
                if (j2.q != null && j2.q.length() > 0 && j2.q.charAt(0) == ']') {
                    String[] stringArray = j2.q.replace(']', ',').split(",");
                    j2.ao = (byte)Integer.parseInt(stringArray[1]);
                    j2.ap = (byte)Integer.parseInt(stringArray[2]);
                    j2.aq = (byte)Integer.parseInt(stringArray[3]);
                    j2.ar = (byte)Integer.parseInt(stringArray[4]);
                    j2.q = null;
                    j2.O = 0;
                }
                if (j2.aG.x == 6650L || j2.aG.x >= 8184L && j2.aG.x <= 8186L || j2.aG.x >= 5159L && j2.aG.x <= 5164L || j2.aG.x == 6049L || j2.aG.x == 3962L || j2.aG.x == 3965L || j2.aG.x == 6991L || j2.aG.x == 8124L || j2.aG.x == 8125L || j2.aG.x == 8126L) {
                    if (j2.q.equals("0")) {
                        j2.az = 0;
                    }
                    if (j2.q.equals("1")) {
                        j2.az = 1;
                    }
                    if (j2.q.equals("2")) {
                        j2.az = (short)2;
                    }
                    if (j2.q.equals("3")) {
                        j2.az = (short)3;
                    }
                    j2.q = null;
                    j2.O = 0;
                }
                if (j2.aG.x == 4442L) {
                    j2.v = 11;
                }
            }
            if ((n6 & 2) != 0) {
                int n9 = e2.y();
                if (n9 == 0) {
                    j2.aG = rs.d.d.c(e2.U());
                    j2.S = j2.aG.r;
                    j2.o = j2.aG.y;
                    j2.ag = j2.aG.q;
                    j2.ah = j2.aG.l;
                    j2.ai = j2.aG.B;
                    j2.aj = j2.aG.j;
                    j2.t = j2.aG.w;
                } else {
                    j2.aF = e2.U();
                }
            }
            if ((n6 & 4) == 0) continue;
            j2.Q = e2.S();
            j2.R = e2.S();
        }
    }

    public void J() {
        String string = null;
        this.ce = this.ev != 3 || this.fN != 0 || !this.gb ? 0 : ++this.ce;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = this.ce;
        for (int i2 = 0; i2 < 200; ++i2) {
            int n3;
            if (this.dC[i2] == null || (n3 = this.dz[i2]) != rs.i.a.q && n3 != rs.i.a.p || arrayList.contains(this.dB[i2])) continue;
            arrayList.add(this.dB[i2]);
            if (n2 == 0) {
                string = this.dB[i2];
                break;
            }
            --n2;
        }
        if (string == null) {
            if (this.ce == 0) {
                this.a("You haven't received any messages to which you can reply.", 0, "");
            }
            return;
        }
        if (string.contains("@cr")) {
            String string2 = string.replace("@cr", "");
            string = string2.split("@")[1];
        }
        long l2 = o_0.a(string.trim());
        fM = true;
        this.fN = 0;
        this.gb = true;
        this.fB = "";
        this.ev = 3;
        this.le = l2;
        this.eQ = "Enter message to send to " + string.replaceAll("@", "");
    }

    private void a(rs.d.d d2, int n2, int n3, int n4) {
        int n5;
        boolean bl;
        if (this.eV >= 400) {
            return;
        }
        if (d2.G != null) {
            d2 = d2.c();
        }
        if (d2 == null) {
            return;
        }
        if (this.cA[n2].q() && this.cA[n2].aH) {
            return;
        }
        boolean bl2 = bl = d2 != null && d2.h;
        if (!d2.C && !bl) {
            return;
        }
        Object object = d2.o;
        if (d2.n != 0 && !d2.h) {
            object = (String)object + Client.r(Client.eR.bc, d2.n) + " (level-" + d2.n + ")";
        }
        if (this.cA[n2].aH) {
            object = (String)object + " @mag@(Spawned)";
        }
        if (bl) {
            if (!this.cA[n2].j()) {
                return;
            }
            if (ed == 197) {
                return;
            }
        }
        if (this.gr == 1) {
            this.fx[this.eV] = "Use " + this.oN + " with @yel@" + (String)object;
            this.eI[this.eV] = 582;
            this.eJ[this.eV] = n2;
            this.eF[this.eV] = n4;
            this.eG[this.eV] = n3;
            ++this.eV;
            return;
        }
        int n6 = n5 = d2.x == 1488L ? rs.f.a.bh : rs.f.a.bi;
        if (Client.eR.bh >= 1 && Client.eR.bh <= 4) {
            if (Client.eR.bh == 3 || Client.eR.bh == 4) {
                n5 = 3;
            }
            if (Client.eR.bh == 1 && (d2.x == 4620L || d2.x == 4623L)) {
                n5 = 3;
            }
            if (Client.eR.bh == 2 && (d2.x == 4660L || d2.x == 4621L)) {
                n5 = 3;
            }
        }
        boolean bl3 = false;
        if (this.eW == 1) {
            if ((this.nm & 2) == 2 && n5 != 3) {
                boolean bl4 = n5 == 1;
                this.fx[this.eV] = this.nn + " @yel@" + (String)object;
                this.eI[this.eV] = 413 + (bl4 ? 2000 : 0);
                this.eJ[this.eV] = n2;
                this.eF[this.eV] = n4;
                this.eG[this.eV] = n3;
                ++this.eV;
                if (this.eV == 2 && bl4) {
                    this.fx[this.eV] = "Walk here";
                    this.eI[this.eV] = 516;
                    this.eF[this.eV] = rs.c_0.hP;
                    this.eG[this.eV] = rs.c_0.hQ;
                    ++this.eV;
                }
            }
        } else {
            int n7;
            if (Client.eR.bh == 3 && (d2.x == 4620L || d2.x == 4623L) || Client.eR.bh == 4 && (d2.x == 4660L || d2.x == 4621L)) {
                this.fx[this.eV] = "<img=53> @or2@Upgrade @yel@" + (String)object;
                this.eI[this.eV] = 965;
                this.eJ[this.eV] = n2;
                this.eF[this.eV] = n4;
                this.eG[this.eV] = n3;
                ++this.eV;
                this.fx[this.eV] = "<img=49> @gre@Heal @yel@" + (String)object;
                this.eI[this.eV] = 225;
                this.eJ[this.eV] = n2;
                this.eF[this.eV] = n4;
                this.eG[this.eV] = n3;
                ++this.eV;
            }
            if (d2.p != null && !rs.q.a.a.a.i.d.contains((int)d2.x)) {
                for (n7 = 4; n7 >= 0; --n7) {
                    if (d2.p[n7] == null || d2.p[n7].equalsIgnoreCase("attack") || d2.p[n7].equalsIgnoreCase("switch-effect") || d2.p[n7].equalsIgnoreCase("poltergust-pull") || d2.p[n7].equalsIgnoreCase("lure") || d2.p[n7].equalsIgnoreCase("catch") || d2.p[n7].equalsIgnoreCase("<img=51> Teleport") || d2.p[n7].equalsIgnoreCase("approach")) continue;
                    this.fx[this.eV] = d2.p[n7] + " @yel@" + (String)object;
                    if (n7 == 0) {
                        this.eI[this.eV] = 20;
                    }
                    if (n7 == 0 && bl) {
                        this.eI[this.eV] = 2020;
                    }
                    if (n7 == 1) {
                        this.eI[this.eV] = 412;
                    }
                    if (n7 == 2) {
                        this.eI[this.eV] = 225;
                    }
                    if (n7 == 3) {
                        this.eI[this.eV] = 965;
                    }
                    if (n7 == 4) {
                        this.eI[this.eV] = 478;
                    }
                    this.eJ[this.eV] = n2;
                    this.eF[this.eV] = n4;
                    this.eG[this.eV] = n3;
                    ++this.eV;
                }
            }
            if (d2.p != null && !rs.q.a.a.a.i.d.contains((int)d2.x)) {
                for (n7 = 4; n7 >= 0; --n7) {
                    if (d2.p[n7] == null || !d2.p[n7].equalsIgnoreCase("attack") && !d2.p[n7].equalsIgnoreCase("switch-effect") && !d2.p[n7].equalsIgnoreCase("poltergust-pull") && !d2.p[n7].equalsIgnoreCase("<img=51> Teleport") && !d2.p[n7].equalsIgnoreCase("lure") && !d2.p[n7].equalsIgnoreCase("approach") && !d2.p[n7].equalsIgnoreCase("catch")) continue;
                    bl3 = true;
                    int n8 = 0;
                    if (d2.n > Client.eR.bc && !d2.o.equals("Zulrah") && n5 != 2) {
                        n8 = 2000;
                    }
                    if (d2.p[n7].equalsIgnoreCase("switch-effect")) {
                        n8 = 2000;
                    } else {
                        if (n5 == 3) continue;
                        if (n5 == 1) {
                            n8 = 2000;
                        }
                    }
                    this.fx[this.eV] = d2.p[n7] + " @yel@" + (String)object;
                    if (n7 == 0) {
                        this.eI[this.eV] = 20 + n8;
                    }
                    if (n7 == 1) {
                        this.eI[this.eV] = 412 + n8;
                    }
                    if (n7 == 2) {
                        this.eI[this.eV] = 225 + n8;
                    }
                    if (n7 == 3) {
                        this.eI[this.eV] = 965 + n8;
                    }
                    if (n7 == 4) {
                        this.eI[this.eV] = 478 + n8;
                    }
                    this.eJ[this.eV] = n2;
                    this.eF[this.eV] = n4;
                    this.eG[this.eV] = n3;
                    ++this.eV;
                }
            }
            this.fx[this.eV] = bl3 ? "<img=39> Drops @yel@" + (String)object + " " : "Examine @yel@" + (String)object;
            if (rs.d.v.b(cT) && rs.f.a.c() && rs.s.c.c.f) {
                int n9 = this.eV;
                this.fx[n9] = this.fx[n9] + " @gre@(@cya@ID: @whi@" + d2.x + "@gre@)";
            }
            this.eI[this.eV] = 1025;
            this.eJ[this.eV] = n2;
            this.eF[this.eV] = n4;
            this.eG[this.eV] = n3;
            ++this.eV;
            if (rs.f.a.c() && rs.s.c.c.d) {
                this.fx[this.eV] = "<img=191> @mag@Colors@yel@ " + (String)object;
                this.eI[this.eV] = 1026;
                this.eJ[this.eV] = n2;
                this.eF[this.eV] = n4;
                this.eG[this.eV] = n3;
                ++this.eV;
            }
        }
    }

    private void a(int n2, int n3, rs.a.k k2, int n4) {
        int n5;
        String string;
        block79: {
            int n6;
            boolean bl;
            int n7;
            boolean bl2;
            block80: {
                block78: {
                    if (k2 == eR) {
                        return;
                    }
                    if (this.eV >= 400) {
                        return;
                    }
                    bl2 = false;
                    if (this.eW == 0 && this.gr == 0) {
                        this.eI[1] = 518;
                        this.eF[1] = k2.k[0];
                        this.eG[1] = k2.l[0];
                    }
                    if (!(rs.n.e.H[18139].at.equals("Talking in: @yel@Help") || Client.eR.bh >= 1 && Client.eR.bh <= 4)) {
                        String string2;
                        int n8;
                        for (n8 = 18144; n8 <= 18244 && !rs.n.e.H[n8].at.equals(""); ++n8) {
                            string2 = rs.n.e.H[n8].at;
                            if (string2.contains(">")) {
                                string2 = rs.n.e.H[n8].at.split("> ")[1];
                            }
                            if (!string2.equalsIgnoreCase(k2.aZ)) continue;
                            bl2 = true;
                            break;
                        }
                        for (n8 = 25800; n8 <= 25999 && !rs.n.e.H[n8].at.equals(""); ++n8) {
                            string2 = rs.n.e.H[n8].at;
                            if (string2.contains(">")) {
                                string2 = rs.n.e.H[n8].at.split("> ")[1];
                            }
                            if (!string2.equalsIgnoreCase(k2.aZ)) continue;
                            bl2 = true;
                            break;
                        }
                    }
                    string = k2.bx == 0 ? k2.a(false, bl2 ? "<col=8A72DA>" : null) + Client.r(Client.eR.bc, k2.bc) + " (level-" + k2.bc + ")" : k2.a(false, bl2 ? "<col=8A72DA>" : null) + " (skill-" + k2.bx + ")";
                    if (k2.aC == 2) {
                        string = "<img=1> " + string;
                    } else if (k2.aC == 1) {
                        string = "<img=0> " + string;
                    } else if (k2.aC == 6) {
                        string = "<img=6> " + string;
                    } else if (k2.aC == 18) {
                        string = "<img=18> " + string;
                    } else if (k2.aC == 19) {
                        string = "<img=19> " + string;
                    } else if (k2.aC == 20) {
                        string = "<img=20> " + string;
                    } else if (k2.aC == 26) {
                        string = "<img=2> " + string;
                    } else if (k2.aC == 3) {
                        string = "<img=3> " + string;
                    } else if (k2.aC == 4) {
                        string = "<img=4> " + string;
                    } else if (k2.aC == 5) {
                        string = "<img=5> " + string;
                    } else if (k2.aC == 7) {
                        string = "<img=7> " + string;
                    } else if (k2.aC == 21) {
                        string = "<img=21> " + string;
                    } else if (k2.aC == 32) {
                        string = "<img=32> " + string;
                    } else if (k2.aC == 25) {
                        string = "@yel@[BOT] @whi@" + string;
                    } else if (k2.aC == 38) {
                        string = "<img=38> " + string;
                    } else if (k2.aC == 86) {
                        string = "<img=86> " + string;
                    } else if (k2.aC == 94) {
                        string = "<img=94> " + string;
                    } else if (k2.aC == 204) {
                        string = "<img=204> " + string;
                    } else if (k2.aC == 205) {
                        string = "<img=205> " + string;
                    } else if (k2.aC == 45) {
                        string = "<img=45> " + string;
                    } else if (rs.l.j.d.a_(k2.aC)) {
                        string = "<img=" + k2.aC + "> " + string;
                    }
                    n7 = k2.aC == 25 && !rs.l.e.f.a.e() ? rs.f.a.bi : rs.f.a.bh;
                    bl = rs.f.a.aS;
                    if (rs.n.e.H[199].at.contains("LMS") && ed == 197) {
                        bl = false;
                    }
                    if (rs.l.e.f.a.e()) {
                        bl = false;
                    }
                    if (Client.eR.bh >= 1 && Client.eR.bh <= 4) {
                        bl = false;
                        if (k2.bh == Client.eR.bh || k2.bh == 3 || k2.bh == 4 || Client.eR.bh == 3 || Client.eR.bh == 4) {
                            n7 = 3;
                        }
                    }
                    if (this.gr != 1) break block78;
                    this.fx[this.eV] = "Use " + this.oN + " with @whi@" + string;
                    this.eI[this.eV] = 491;
                    this.eJ[this.eV] = n3;
                    this.eF[this.eV] = n2;
                    this.eG[this.eV] = n4;
                    ++this.eV;
                    break block79;
                }
                if (this.eW != 1) break block80;
                if ((this.nm & 8) != 8) break block79;
                n5 = n7 == 1 || n7 == 3 || bl2 && bl ? 1 : 0;
                n6 = 1;
                if (cw != 14927 && rs.f.a.aK && this.z.r != null && !this.z.r.equalsIgnoreCase(k2.aZ)) {
                    n5 = 1;
                }
                if (n7 != 3) {
                    this.fx[this.eV] = this.nn + " " + (!bl2 ? "@whi@" : "") + string;
                    this.eI[this.eV] = 365 + (n5 != 0 ? 2000 : 0);
                    this.eJ[this.eV] = n3;
                    this.eF[this.eV] = n2;
                    this.eG[this.eV] = n4;
                    ++this.eV;
                }
                if (this.eV != 2 || n5 == 0) break block79;
                this.fx[this.eV] = "Walk here";
                this.eI[this.eV] = 516;
                this.eF[this.eV] = rs.c_0.hP;
                this.eG[this.eV] = rs.c_0.hQ;
                ++this.eV;
                break block79;
            }
            for (n5 = 4; n5 >= 0; --n5) {
                if (this.nh[n5] == null) continue;
                this.fx[this.eV] = this.nh[n5] + " @whi@" + string;
                n6 = 0;
                if (this.nh[n5].equalsIgnoreCase("attack")) {
                    boolean bl3 = false;
                    if (k2.aC == 25 && !rs.l.e.f.a.e() && k2.m - 32768 != di && cw != 13130 && cw != 13129 && cw != 6480 && cw != 6481) {
                        bl3 = true;
                    }
                    if (ed == 197 && rs.n.e.H[199].at != null && rs.n.e.H[199].at.contains("Tourney")) {
                        if (this.jZ == 10 && this.kV >= 0 && this.kV < do.length) {
                            if (k2.aZ != null && do[this.kV] != null && Client.do[this.kV].aZ != null && !Client.do[this.kV].aZ.equalsIgnoreCase(k2.aZ)) {
                                bl3 = true;
                            }
                        } else {
                            bl3 = true;
                        }
                    } else {
                        if (k2.bc > Client.eR.bc && n7 != 2 || bl2 && bl || bl3) {
                            n6 = 2000;
                        }
                        if (rs.f.a.aJ && this.z.r != null && !this.z.r.equalsIgnoreCase(k2.aZ)) {
                            n6 = 2000;
                        }
                        if (n7 == 1) {
                            n6 = 2000;
                        }
                        if (n7 == 3 || rs.l.e.f.a.e() && (k2.ay == 6095 && k2.aT != null || Client.eR.ay == 6095 && Client.eR.aT != null)) continue;
                        if (Client.eR.aX != 0 && k2.aX != 0) {
                            n6 = Client.eR.aX == k2.aX ? 2000 : 0;
                        }
                    }
                    if (bl3) {
                        n6 = 2000;
                    }
                } else if (this.ni[n5]) {
                    n6 = 2000;
                }
                if (this.nh[n5].equalsIgnoreCase("fight") && cw == 13362 && this.jZ == 10 && this.kV != n3) {
                    n6 = 2000;
                }
                if (n5 == 0) {
                    this.eI[this.eV] = 561 + n6;
                }
                if (n5 == 1) {
                    this.eI[this.eV] = 779 + n6;
                }
                if (n5 == 2) {
                    this.eI[this.eV] = 27 + n6;
                }
                if (n5 == 3) {
                    this.eI[this.eV] = 577 + n6;
                }
                if (n5 == 4) {
                    this.eI[this.eV] = 729 + n6;
                }
                this.eJ[this.eV] = n3;
                this.eF[this.eV] = n2;
                this.eG[this.eV] = n4;
                ++this.eV;
            }
        }
        if (this.eW == 0 && this.gr == 0) {
            for (n5 = 0; n5 < this.eV; ++n5) {
                if (this.eI[n5] != 516 && this.eI[n5] != 518) continue;
                this.fx[n5] = "Walk here @whi@" + string;
                return;
            }
        }
    }

    private void a(n_0 n_02) {
        int n2 = 0;
        int n3 = -1;
        int n4 = 0;
        int n5 = 0;
        if (n_02.i == 0) {
            n2 = this.dF.a(n_02.h, n_02.j, n_02.k);
        }
        if (n_02.i == 1) {
            n2 = this.dF.c(n_02.h, n_02.j, n_02.k);
        }
        if (n_02.i == 2) {
            n2 = this.dF.e(n_02.h, n_02.j, n_02.k);
        }
        if (n_02.i == 3) {
            n2 = this.dF.g(n_02.h, n_02.j, n_02.k);
        }
        if (n2 != 0) {
            int n6 = this.dF.b(n_02.h, n_02.j, n_02.k, n2);
            n3 = n2 >> 14 & Short.MAX_VALUE;
            n4 = n6 & 0x1F;
            n5 = n6 >> 6;
        }
        n_02.l = n3;
        n_02.n = n4;
        n_02.m = n5;
    }

    public final void K() {
        for (int i2 = 0; i2 < this.ms; ++i2) {
            boolean bl = false;
            try {
                if (!l_0.a.w_(this.nY[i2])) {
                    rs.cache.osrs.c.a(true);
                    try {
                        ew.a(2, this.nY[i2]);
                        continue;
                    }
                    finally {
                        rs.cache.osrs.c.a(false);
                    }
                }
                byte[] byArray = (byte[])l_0.a.b(this.nY[i2]);
                new l_0(new ByteArrayInputStream(byArray), this.ot[i2], this.os[i2]).a(byArray);
                if (System.currentTimeMillis() + (long)(Client.fv.h / 22) > this.nG + (long)(this.oy / 22)) {
                    this.oy = Client.fv.h;
                    this.nG = System.currentTimeMillis();
                    bl = false;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (!bl || this.os[i2] == -5) {
                --this.ms;
                for (int i3 = i2; i3 < this.ms; ++i3) {
                    this.nY[i3] = this.nY[i3 + 1];
                    this.oo[i3] = this.oo[i3 + 1];
                    this.os[i3] = this.os[i3 + 1];
                    this.ot[i3] = this.ot[i3 + 1];
                }
                --i2;
                continue;
            }
            this.os[i2] = -5;
        }
        if (this.oz > 0) {
            this.oz -= 20;
            if (this.oz < 0) {
                this.oz = 0;
            }
            if (this.oz == 0 && this.nv) {
                this.oi = this.lh;
                this.oj = true;
                ew.a(2, this.oi);
            }
        }
    }

    @Override
    void L() {
        Object object;
        Object object2;
        rs.f.a.f();
        if (!rs.f.a.d.booleanValue()) {
            if (!this.l.a()) {
                this.a(20, "Error loading game assets!");
                rs.l.d.c.a = false;
                return;
            }
        } else {
            this.G = new rs.l.d.c(this);
            this.gm = new rs.l.h(false, "assets/", "assets/p12_full");
            this.a(0, "Please wait, checking assets..");
            object2 = new Thread(this.G);
            ((Thread)object2).start();
            this.cf = true;
            if (Launcher.n() != null) {
                Launcher.n().d();
            }
        }
        this.cg = true;
        this.a(20, "Starting up");
        if (rs.v.a.g) {
            this.hC = 5;
        }
        lC = true;
        ew = new rs.cache.d();
        ew.a();
        if (rs.f.a.d.booleanValue()) {
            try {
                this.m(4);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        for (Object object3 : (Object)ac) {
            object = new File(rs.v.a.f() + "raw/" + (int)object3);
            if (((File)object).exists()) {
                ((File)object).delete();
            }
            if (!((File)(object = new File(rs.v.a.f() + "raw/" + (int)object3 + ".dat"))).exists()) continue;
            ((File)object).delete();
        }
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            this.mo = this.a(1, "title screen", "title", this.eE[1], 25);
            gh = new rs.l.k_0(false, "p11_full", this.mo);
            this.gi = new rs.l.k_0(false, "p12_full", this.mo);
            gj = new rs.l.k_0(false, "b12_full", this.mo);
            this.gk = this.gi;
            gl = new rs.l.h(false, "p11_full", this.mo);
            this.gm = new rs.l.h(false, "p12_full", this.mo);
            this.gn = new rs.l.h(false, "b12_full", this.mo);
            this.go = new rs.l.h(true, "q8_full", this.mo);
            object2 = this.a(2, "config", "config", this.eE[2], 30);
            rs.x.f f2 = this.a(3, "interface", "interface", this.eE[3], 35);
            rs.x.f f3 = this.a(4, "2d graphics", "media", this.eE[4], 40);
            rs.x.f f4 = this.a(6, "textures", "textures", this.eE[6], 45);
            object = this.a(7, "chat system", "wordenc", this.eE[7], 50);
            rs.x.f f5 = this.a(8, "sound effects", "sounds", this.eE[8], 55);
            this.gc = new byte[4][104][104];
            this.fC = new int[4][105][105];
            this.dF = new rs.v_0(this.fC);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.fP[i2] = new f();
            }
            this.oA = new f_0(512, 512);
            rs.x.f f6 = this.a(5, "update list", "versionlist", this.eE[5], 60);
            this.a(60, "Connecting to update server");
            rs.secure.c.a();
            ew.a(f6, this);
            rs.k.a(ew.i());
            rs.a.h.a(ew.j(), ew);
            if (!li) {
                this.oi = 0;
                try {
                    this.oi = Integer.parseInt(this.getParameter("music"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.oj = true;
                ew.a(2, this.oi);
                while (ew.g() > 0) {
                    this.s();
                    try {
                        Thread.sleep(100L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (Client.ew.k <= 3) continue;
                    this.bo();
                    return;
                }
            }
            this.a(80, "Unpacking media");
            long l2 = System.currentTimeMillis();
            this.c(true);
            try {
                rs.d.m.a();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                rs.d.p.a();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            rs.d.w.a();
            rs.l.j_0.a();
            i_0.a();
            rs.l.a.b.a();
            System.out.println("[Loader] Unpacking media load time: " + (System.currentTimeMillis() - l2) + "ms");
            this.aA = new f_0("popups/fog");
            this.I = new f_0("popups/amnestyskull");
            this.fG = new f_0("icons/bmmap");
            this.fF = new f_0("misc/summer 2020");
            this.fH = new f_0("icons/bloodslayer");
            this.fI = new f_0("icons/tourneymap");
            this.fJ = new f_0("icons/eventmap");
            this.fK = new f_0("icons/eventmap2");
            this.jc = new f_0("icons/pktele");
            this.iX = new f_0("icons/skilltele");
            this.iY = new f_0("icons/moneytele");
            this.jb = new f_0("magic/home 2");
            this.iZ = new f_0("icons/bosstele");
            this.ja = new f_0("icons/storetele");
            this.ki = new f_0("hitmarks/old/hit");
            this.kj = new f_0("hitmarks/old/poison");
            this.cZ = new f_0("hitmarks/old/venom");
            this.da = new f_0("hitmarks/old/crit");
            this.db = new f_0("hitmarks/old/shield");
            this.dc = new f_0("hitmarks/old/heal");
            this.kl = new f_0("hitmarks/old/block");
            this.dd = new f_0("hitmarks/new/block");
            this.kk[0] = new f_0("hitmarks/old/kapow");
            this.kk[1] = new f_0("hitmarks/old/kapow 2");
            this.aS = new f_0("popups/HP 0");
            this.ig = new f_0("popups/HP 1");
            this.fw = new f_0("gameframe/invback");
            this.nU = new f_0("gameframe/chatback");
            this.ir = new f_0("gameframe/chatarea");
            this.is = new f_0("gameframe/chatcollapsed");
            this.it = new f_0("gameframe/chatcollapsededge");
            this.iv = new f_0("gameframe/map");
            this.iu = new f_0("gameframe/map2");
            this.nT = new rs.l.a(f3, "mapback", 0);
            this.mb = new f_0("gameframe/backbase2");
            this.mc = new f_0("gameframe/backhmid1");
            this.aT = new f_0(512, 512);
            this.cU = new f_0("orbs/arrow");
            this.cV = new f_0("orbs/arrow 2");
            this.cW = new f_0("orbs/arrow 3");
            this.cX = new f_0("orbs/arrow 4");
            this.aU = new f_0("wiki/icon");
            this.J = new f_0[5];
            this.J[0] = new f_0("popups/orb 1");
            this.J[1] = new f_0("popups/orb 2");
            this.J[2] = new f_0("popups/orb 3");
            this.J[3] = new f_0("popups/orb 4");
            this.J[4] = new f_0("popups/orb 5");
            this.eL = new f_0[10];
            for (int i3 = 0; i3 < 5; ++i3) {
                this.eL[i3] = new f_0("icons/keyskull " + (i3 + 1));
                this.eL[i3 + 5] = new f_0("icons/keyredskull " + (i3 + 1));
            }
            File[] fileArray = new File(rs.v.a.f() + "/sprites/gameframe/fullscreen").listFiles();
            int n6 = fileArray.length;
            this.H = new f_0[n6];
            for (n5 = 0; n5 < n6; ++n5) {
                this.H[n5] = new f_0("gameframe/fullscreen/" + n5);
            }
            for (n5 = 0; n5 < 21; ++n5) {
                this.de[n5] = new f_0("hitmarks/new/hit " + n5);
            }
            for (n5 = 0; n5 < 5; ++n5) {
                this.df[n5] = new f_0("hitmarks/new/icon " + n5);
            }
            rs.l.j.b();
            this.Y = new f_0("magic/autocast");
            gl.a(fE);
            this.gm.a(fE);
            this.gn.a(fE);
            this.go.a(fE);
            this.lZ = new f_0("gameframe/chatbuttons");
            this.ng = new f_0("gameframe/compass");
            this.lK = new f_0("popups/mapedge");
            try {
                for (n5 = 0; n5 < 100; ++n5) {
                    this.mq[n5] = new rs.l.a(f3, "mapscene", n5);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i4 = 0; i4 < 100; ++i4) {
                    this.me[i4] = new f_0(f3, "mapfunction", i4);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i5 = 0; i5 < 20; ++i5) {
                    this.dS[i5] = new f_0(f3, "hitmarks", i5);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i6 = 0; i6 < 6; ++i6) {
                    this.mX[i6] = new f_0(f3, "headicons_hint", i6);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i7 = 0; i7 < 21; ++i7) {
                    this.mW[i7] = new f_0(f3, "headicons_prayer", i7);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.mW[7] = new f_0("prayer/protmagemelee");
            this.mW[8] = new f_0("prayer/protmeleerange");
            this.mW[9] = new f_0("prayer/protall");
            try {
                for (int i8 = 0; i8 < 3; ++i8) {
                    this.eK[i8] = new f_0(f3, "headicons_pk", i8);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.bs = new f_0(f3, "overlay_multiway", 0);
            this.kg = new f_0(f3, "mapmarker", 0);
            this.kh = new f_0(f3, "mapmarker", 1);
            for (int i9 = 0; i9 < 8; ++i9) {
                this.fa[i9] = new f_0(f3, "cross", i9);
            }
            this.mC = new f_0(f3, "mapdots", 0);
            this.mD = new f_0(f3, "mapdots", 1);
            this.mM = new f_0(f3, "mapdots", 2);
            this.mN = new f_0(f3, "mapdots", 3);
            this.mQ = new f_0(f3, "mapdots", 4);
            this.mO = new f_0("icons/clandot");
            this.mE = new f_0("icons/hweendot");
            this.mF = new f_0("icons/xmasdot");
            this.mG = new f_0("icons/nmxmasdot");
            this.mH = new f_0("icons/bloodrev");
            this.mI = new f_0("icons/brutalbloodrev");
            this.mJ = new f_0("icons/impling");
            this.mK = new f_0("icons/easterdot");
            this.mL = new f_0("icons/summerdot");
            this.mP = new f_0("icons/biohazard");
            this.lX = new f_0("gameframe/scrollbar0");
            this.lY = new f_0("gameframe/scrollbar1");
            this.nq = new rs.l.a(f3, "redstone1", 0);
            this.nr = new rs.l.a(f3, "redstone2", 0);
            this.ns = new rs.l.a(f3, "redstone3", 0);
            this.nt = new rs.l.a(f3, "redstone1", 0);
            this.nt.g();
            this.nu = new rs.l.a(f3, "redstone2", 0);
            this.nu.g();
            this.kb = new rs.l.a(f3, "redstone1", 0);
            this.kb.h();
            this.kc = new rs.l.a(f3, "redstone2", 0);
            this.kc.h();
            this.kd = new rs.l.a(f3, "redstone3", 0);
            this.kd.h();
            this.ke = new rs.l.a(f3, "redstone1", 0);
            this.ke.g();
            this.ke.h();
            this.kf = new rs.l.a(f3, "redstone2", 0);
            this.kf.g();
            this.kf.h();
            this.bt = true;
            f_0 f_02 = new f_0("gameframe/backleft1");
            this.dq = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backleft2");
            this.kE = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backright1");
            this.kF = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backright2");
            this.kG = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backtop1");
            this.dr = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backvmid1");
            this.kH = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backvmid2");
            this.kI = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backvmid3");
            this.kJ = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            f_02 = new f_0("gameframe/backhmid2");
            this.kK = new rs.l.e(f_02.n, f_02.o, this.B());
            f_02.d(0, 0);
            this.bt = false;
            int n7 = (int)(Math.random() * 21.0) - 10;
            int n8 = (int)(Math.random() * 21.0) - 10;
            int n9 = (int)(Math.random() * 21.0) - 10;
            int n10 = (int)(Math.random() * 41.0) - 20;
            for (n4 = 0; n4 < 100; ++n4) {
                if (this.me[n4] != null) {
                    this.me[n4].d(n7 + n10, n8 + n10, n9 + n10);
                }
                if (this.mq[n4] == null) continue;
                this.mq[n4].a(n7 + n10, n8 + n10, n9 + n10);
            }
            this.a(83, "Unpacking textures");
            e_0.a(f4);
            e_0.b(0.8);
            e_0.h();
            this.a(86, "Unpacking config");
            rs.d.a.a((rs.x.f)object2);
            rs.d.r.a((rs.x.f)object2);
            rs.d.t.a(h.a.a);
            rs.d.h.a((rs.x.f)object2);
            rs.d.k.a((rs.x.f)object2);
            rs.d.d.a((rs.x.f)object2);
            rs.d.j.a((rs.x.f)object2);
            rs.d.x.a((rs.x.f)object2);
            rs.d.z.a((rs.x.f)object2);
            rs.d.y.a((rs.x.f)object2);
            rs.d.k.H = dM;
            this.m = new rs.l.e.h(this);
            this.o = new rs.l.e.e(this);
            this.n = new rs.l.e.m(this);
            if (!li) {
                this.a(90, "Unpacking sounds");
                byte[] byArray = f5.a("sounds.dat");
                rs.x.e e2 = new rs.x.e(byArray);
                rs.w.e.a(e2);
            }
            this.a(95, "Unpacking interfaces");
            bk = new rs.l.k_0[]{gh, this.gi, gj, this.gk};
            rs.n.e.a(f2, bk, f3);
            this.a(100, "Preparing game engine");
            for (n4 = 0; n4 < 33; ++n4) {
                int n11 = 999;
                n3 = 0;
                for (n2 = 0; n2 < 34; ++n2) {
                    if (this.nT.i[n2 + n4 * this.nT.j] == 0) {
                        if (n11 != 999) continue;
                        n11 = n2;
                        continue;
                    }
                    if (n11 == 999) continue;
                    n3 = n2;
                    break;
                }
                this.ln[n4] = n11;
                this.mp[n4] = n3 - n11;
            }
            for (n4 = 1; n4 < 153; ++n4) {
                int n12 = 999;
                n3 = 0;
                for (n2 = 24; n2 < 177; ++n2) {
                    if (this.nT.i[n2 + n4 * this.nT.j] == 0 && (n2 > 34 || n4 > 34)) {
                        if (n12 != 999) continue;
                        n12 = n2;
                        continue;
                    }
                    if (n12 == 999) continue;
                    n3 = n2;
                    break;
                }
                this.eq[n4 - 1] = n12 - 24;
                this.fO[n4 - 1] = n3 - n12;
            }
            this.fO[0] = 22;
            this.fO[1] = 34;
            this.fO[2] = 42;
            this.fO[3] = 50;
            this.fO[4] = 56;
            this.fO[5] = 60;
            this.fO[6] = 66;
            this.fO[7] = 70;
            this.fO[8] = 74;
            this.fO[9] = 78;
            this.fO[10] = 82;
            this.fO[11] = 84;
            this.fO[12] = 88;
            this.fO[13] = 90;
            this.fO[14] = 94;
            this.fO[15] = 96;
            this.fO[16] = 98;
            this.fO[17] = 102;
            this.fO[18] = 104;
            this.fO[19] = 106;
            this.fO[20] = 108;
            this.fO[21] = 110;
            this.fO[22] = 112;
            this.fO[23] = 114;
            this.fO[24] = 116;
            this.fO[25] = 118;
            this.fO[26] = 120;
            this.fO[27] = 122;
            this.fO[28] = 122;
            this.fO[29] = 124;
            this.fO[30] = 126;
            this.fO[31] = 128;
            this.fO[32] = 128;
            this.fO[33] = 130;
            this.fO[34] = 132;
            this.fO[35] = 132;
            this.fO[36] = 134;
            this.fO[37] = 136;
            this.fO[38] = 136;
            this.fO[39] = 138;
            this.fO[40] = 138;
            this.fO[41] = 140;
            this.fO[42] = 140;
            this.fO[43] = 142;
            this.fO[44] = 142;
            this.fO[45] = 144;
            this.fO[46] = 144;
            this.fO[47] = 144;
            this.fO[48] = 146;
            this.fO[49] = 146;
            this.fO[50] = 148;
            this.fO[51] = 148;
            this.fO[52] = 148;
            this.fO[53] = 150;
            this.fO[54] = 150;
            this.fO[55] = 150;
            this.fO[56] = 150;
            this.fO[57] = 152;
            this.fO[58] = 152;
            this.fO[59] = 152;
            this.fO[60] = 152;
            this.fO[61] = 152;
            this.fO[62] = 154;
            this.fO[63] = 154;
            this.fO[64] = 154;
            this.fO[65] = 154;
            this.fO[66] = 154;
            this.fO[67] = 154;
            this.fO[68] = 156;
            this.fO[69] = 156;
            this.fO[70] = 156;
            this.fO[71] = 156;
            this.fO[72] = 156;
            this.fO[73] = 156;
            this.fO[74] = 156;
            this.fO[75] = 156;
            this.fO[150] = 22;
            this.fO[149] = 34;
            this.fO[148] = 42;
            this.fO[147] = 50;
            this.fO[146] = 56;
            this.fO[145] = 60;
            this.fO[144] = 66;
            this.fO[143] = 70;
            this.fO[142] = 74;
            this.fO[141] = 78;
            this.fO[140] = 82;
            this.fO[139] = 84;
            this.fO[138] = 88;
            this.fO[137] = 90;
            this.fO[136] = 94;
            this.fO[135] = 96;
            this.fO[134] = 98;
            this.fO[133] = 102;
            this.fO[132] = 104;
            this.fO[131] = 106;
            this.fO[130] = 108;
            this.fO[129] = 110;
            this.fO[128] = 112;
            this.fO[127] = 114;
            this.fO[126] = 116;
            this.fO[125] = 118;
            this.fO[124] = 120;
            this.fO[123] = 122;
            this.fO[122] = 122;
            this.fO[121] = 124;
            this.fO[120] = 126;
            this.fO[119] = 128;
            this.fO[118] = 128;
            this.fO[117] = 130;
            this.fO[116] = 132;
            this.fO[115] = 132;
            this.fO[114] = 134;
            this.fO[113] = 136;
            this.fO[112] = 136;
            this.fO[111] = 138;
            this.fO[110] = 138;
            this.fO[109] = 140;
            this.fO[108] = 140;
            this.fO[107] = 142;
            this.fO[106] = 142;
            this.fO[105] = 144;
            this.fO[104] = 144;
            this.fO[103] = 144;
            this.fO[102] = 146;
            this.fO[101] = 146;
            this.fO[100] = 148;
            this.fO[99] = 148;
            this.fO[98] = 148;
            this.fO[97] = 150;
            this.fO[96] = 150;
            this.fO[95] = 150;
            this.fO[94] = 150;
            this.fO[93] = 152;
            this.fO[92] = 152;
            this.fO[91] = 152;
            this.fO[90] = 152;
            this.fO[89] = 152;
            this.fO[88] = 154;
            this.fO[87] = 154;
            this.fO[86] = 154;
            this.fO[85] = 154;
            this.fO[84] = 154;
            this.fO[83] = 154;
            this.fO[82] = 156;
            this.fO[81] = 156;
            this.fO[80] = 156;
            this.fO[79] = 156;
            this.fO[78] = 156;
            this.fO[77] = 156;
            this.fO[76] = 156;
            this.fO[75] = 156;
            this.eq[0] = 67;
            this.eq[1] = 61;
            this.eq[2] = 57;
            this.eq[3] = 53;
            this.eq[4] = 50;
            this.eq[5] = 48;
            this.eq[6] = 45;
            this.eq[7] = 43;
            this.eq[8] = 41;
            this.eq[9] = 39;
            this.eq[10] = 37;
            this.eq[11] = 36;
            this.eq[12] = 34;
            this.eq[13] = 33;
            this.eq[14] = 31;
            this.eq[15] = 30;
            this.eq[16] = 29;
            this.eq[17] = 28;
            this.eq[18] = 27;
            this.eq[19] = 26;
            this.eq[20] = 25;
            this.eq[21] = 24;
            this.eq[22] = 23;
            this.eq[23] = 22;
            this.eq[24] = 21;
            this.eq[25] = 20;
            this.eq[26] = 19;
            this.eq[27] = 18;
            this.eq[28] = 17;
            this.eq[29] = 17;
            this.eq[30] = 16;
            this.eq[31] = 15;
            this.eq[32] = 14;
            this.eq[33] = 14;
            this.eq[34] = 13;
            this.eq[35] = 12;
            this.eq[36] = 12;
            this.eq[37] = 11;
            this.eq[38] = 10;
            this.eq[39] = 10;
            this.eq[40] = 9;
            this.eq[41] = 9;
            this.eq[42] = 8;
            this.eq[43] = 8;
            this.eq[44] = 7;
            this.eq[45] = 7;
            this.eq[46] = 6;
            this.eq[47] = 6;
            this.eq[48] = 6;
            this.eq[49] = 5;
            this.eq[50] = 5;
            this.eq[51] = 4;
            this.eq[52] = 4;
            this.eq[53] = 4;
            this.eq[54] = 3;
            this.eq[55] = 3;
            this.eq[56] = 3;
            this.eq[57] = 3;
            this.eq[58] = 2;
            this.eq[59] = 2;
            this.eq[60] = 2;
            this.eq[61] = 2;
            this.eq[62] = 1;
            this.eq[63] = 1;
            this.eq[64] = 1;
            this.eq[65] = 1;
            this.eq[66] = 1;
            this.eq[67] = 1;
            this.eq[68] = 0;
            this.eq[69] = 0;
            this.eq[70] = 0;
            this.eq[71] = 0;
            this.eq[72] = 0;
            this.eq[73] = 0;
            this.eq[74] = 0;
            this.eq[75] = 0;
            this.eq[150] = 67;
            this.eq[149] = 61;
            this.eq[148] = 57;
            this.eq[147] = 53;
            this.eq[146] = 50;
            this.eq[145] = 48;
            this.eq[144] = 45;
            this.eq[143] = 43;
            this.eq[142] = 41;
            this.eq[141] = 39;
            this.eq[140] = 37;
            this.eq[139] = 36;
            this.eq[138] = 34;
            this.eq[137] = 33;
            this.eq[136] = 31;
            this.eq[135] = 30;
            this.eq[134] = 29;
            this.eq[133] = 28;
            this.eq[132] = 27;
            this.eq[131] = 26;
            this.eq[130] = 25;
            this.eq[129] = 24;
            this.eq[128] = 23;
            this.eq[127] = 22;
            this.eq[126] = 21;
            this.eq[125] = 20;
            this.eq[124] = 19;
            this.eq[123] = 18;
            this.eq[122] = 17;
            this.eq[121] = 17;
            this.eq[120] = 16;
            this.eq[119] = 15;
            this.eq[118] = 14;
            this.eq[117] = 14;
            this.eq[116] = 13;
            this.eq[115] = 12;
            this.eq[114] = 12;
            this.eq[113] = 11;
            this.eq[112] = 10;
            this.eq[111] = 10;
            this.eq[110] = 9;
            this.eq[109] = 9;
            this.eq[108] = 8;
            this.eq[107] = 8;
            this.eq[106] = 7;
            this.eq[105] = 7;
            this.eq[104] = 6;
            this.eq[103] = 6;
            this.eq[102] = 6;
            this.eq[101] = 5;
            this.eq[100] = 5;
            this.eq[99] = 4;
            this.eq[98] = 4;
            this.eq[97] = 4;
            this.eq[96] = 3;
            this.eq[95] = 3;
            this.eq[94] = 3;
            this.eq[93] = 3;
            this.eq[92] = 2;
            this.eq[91] = 2;
            this.eq[90] = 2;
            this.eq[89] = 2;
            this.eq[88] = 1;
            this.eq[87] = 1;
            this.eq[86] = 1;
            this.eq[85] = 1;
            this.eq[84] = 1;
            this.eq[83] = 1;
            this.eq[82] = 0;
            this.eq[81] = 0;
            this.eq[80] = 0;
            this.eq[79] = 0;
            this.eq[78] = 0;
            this.eq[77] = 0;
            this.eq[76] = 0;
            this.eq[75] = 0;
            by = new k_0[c_0.c.length];
            for (n4 = 0; n4 < by.length; ++n4) {
                Client.by[n4] = new k_0(c_0.c[n4]);
            }
            this.i();
            this.j();
            rs.d.c.a((rs.x.f)object);
            this.kp = new rs.b.a(this);
            this.a(this.kp, 10);
            rs.a.m.h = this;
            rs.d.r.ai = this;
            rs.d.d.A = this;
            rs.l.e.f.a();
            rs.q.a.a.b.a();
            rs.u.b.b();
            new rs.t.a.g().a();
            this.v = new rs.i.b(this);
            this.y = new rs.l.c.a(this);
            w = new rs.l.e.c(this);
            rs.l.d.c.a = false;
            this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
            if (rs.f.a.d.booleanValue()) {
                rs.c.b.a.a(this);
            }
            Client.M();
            this.cz = 2;
            this.G.a(c.a.b);
            ClientStartUp clientStartUp = new ClientStartUp();
            this.p.post(clientStartUp);
            return;
        }
        catch (Exception exception) {
            rs.v.a.e("loaderror " + this.mm + " " + this.mR);
            exception.printStackTrace();
            this.kQ = true;
            rs.l.d.c.a = false;
            return;
        }
    }

    public static void M() {
        rs.d.k.c.clear();
        if (rs.d.k.ad > 0) {
            for (int i2 = 0; i2 < rs.d.k.a; ++i2) {
                rs.d.k k2 = rs.d.k.f(i2);
                if (k2 == null || k2.w == null) continue;
                rs.d.k k3 = new rs.d.k();
                k3.w = k2.w.equals(rs.d.k.d) ? rs.d.k.d : k2.w;
                k3.F = k2.F;
                k3.p = k2.p;
                k3.i = k2.i;
                k3.A = k2.A;
                k3.aa = k2.aa;
                k3.r = k2.r;
                k3.q = k2.q;
                k3.K = k2.K;
                k3.J = k2.J;
                k3.o = k2.o;
                k3.B = k2.B;
                k3.s = k2.s;
                k3.R = k2.R;
                k3.U = k2.U;
                k3.T = k2.T;
                rs.d.k.b(k2, k3);
                rs.d.k.a(k2, k3);
                rs.d.k.c.a(i2, (Object)k3);
            }
        }
    }

    private static boolean a(String[] stringArray, String[] stringArray2) {
        if (stringArray == null || stringArray2 == null || stringArray.length != stringArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2] == null && stringArray2[i2] == null) continue;
            if (stringArray[i2] == null && stringArray2[i2] != null && !stringArray2[i2].equals("null")) {
                return false;
            }
            if (stringArray[i2] != null && stringArray2[i2] == null && !stringArray[i2].equals("null")) {
                return false;
            }
            if (stringArray[i2].equals(stringArray2[i2])) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, File file2) {
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel = null;
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            abstractInterruptibleChannel = new FileOutputStream(file2).getChannel();
            ((FileChannel)abstractInterruptibleChannel).transferFrom(fileChannel, 0L, fileChannel.size());
        }
        finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (abstractInterruptibleChannel != null) {
                abstractInterruptibleChannel.close();
            }
        }
    }

    private void b(rs.x.e e2, int n2) {
        while (e2.i + 10 < n2 * 8) {
            int n3;
            int n4 = e2.k(11);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t-> index=" + n4);
            }
            if (n4 == 2047) break;
            if (do[n4] == null) {
                Client.do[n4] = new rs.a.k();
                if (this.ky[n4] != null) {
                    if (rs.f.a.d.booleanValue()) {
                        cx.add("\t-> updatePlayer() call for index=" + n4);
                    }
                    do[n4].a(this.ky[n4]);
                }
            }
            this.kv[this.ku++] = n4;
            rs.a.k k2 = do[n4];
            k2.P = ff;
            int n5 = e2.k(1);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t-> update=" + n5);
            }
            if (n5 == 1) {
                this.kx[this.kw++] = n4;
            }
            int n6 = e2.k(1);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t-> discardWalkingQueue=" + n6);
            }
            int n7 = e2.k(5);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t-> y=" + n7);
            }
            if (n7 > 15) {
                n7 -= 32;
            }
            if ((n3 = e2.k(5)) > 15) {
                n3 -= 32;
            }
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t-> x=" + n3);
            }
            k2.a(Client.eR.k[0] + n3, Client.eR.l[0] + n7, n6 == 1);
        }
        e2.K();
    }

    public boolean c(int n2, int n3, int n4, int n5, int n6) {
        return Math.pow(n2 + n6 - n4, 2.0) + Math.pow(n3 + n6 - n5, 2.0) < Math.pow(n6, 2.0);
    }

    public boolean N() {
        if (rs.c_0.hP >= ai - 21 && rs.c_0.hP <= ai && rs.c_0.hQ >= 0 && rs.c_0.hQ <= 21) {
            return false;
        }
        return !this.v.h;
    }

    private void q(int n2, int n3) {
        String string = "::clicktele " + n2 + " " + n3;
        fv.a(103);
        fv.b(string.length() - 1);
        fv.a(string.substring(2));
    }

    public void a(rs.o.a.a.a a2) {
        if (!this.fc || this.lJ == null) {
            this.jd = 0;
            return;
        }
        a2.a(fv);
        try {
            if (this.nD != null) {
                this.nD.a(fv.h(), Client.fv.g);
                fv.i();
                this.lQ = 0;
            }
        }
        catch (IOException iOException) {
            this.x();
            System.out.println(iOException);
        }
        catch (Exception exception) {
            this.br();
            System.out.println(exception);
        }
        this.jd = 0;
    }

    private void bD() {
        if (this.lV != 0) {
            return;
        }
        if (this.hU > 0) {
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 120 && hQ <= 153 && hP >= ai - 192 && hP <= ai - 133) {
                    fv.a(185);
                    fv.d(152);
                    return;
                }
            } else if (hQ >= 109 && hQ <= 142 && hP >= 540 && hP <= 575) {
                fv.a(185);
                fv.d(152);
                return;
            }
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 2 && hQ <= 42 && hP >= ai - 178 && hP <= ai - 140) {
                    this.ft = 0;
                    gC = 0.0;
                }
            } else if (hQ >= 4 && hQ <= 37 && hP >= 546 && hP <= 575) {
                this.ft = 0;
                gC = 0.0;
            }
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 154 && hQ <= 173 && hP >= ai - 23 && hP <= ai - 6) {
                    this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
                    this.a("<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")), 0, "");
                }
            } else if (hQ >= 25 && hQ <= 43 && hP >= 515 && hP <= 545) {
                this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
                this.a("<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")), 0, "");
            }
            if (rs.l.e.q.a && this.hU == 1) {
                rs.f.a.aD = !rs.f.a.aD;
                rs.f.a.d();
            }
            if (this.v.h) {
                this.ar = "::adventurebook";
            }
            if (rs.f.a.ai == a.c.b) {
                if (ah <= 649) {
                    if (hQ >= 186 && hQ <= 202 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::nurse";
                    }
                } else if (hQ >= 281 && hQ <= 301 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::nurse";
                }
            } else if (hQ >= 141 && hQ <= 161 && hP >= 721 && hP <= 736) {
                this.ar = "::nurse";
            }
            if (rs.f.a.ai == a.c.b) {
                if (hP >= ai - 119 && hP <= ai - 96 && hQ >= 166 && hQ <= 188) {
                    this.ar = "::donate";
                    if (this.cY == 3) {
                        this.cY = 4;
                    }
                }
            } else if (hP >= 718 && hP <= 744 && hQ >= 57 && hQ <= 79) {
                this.ar = "::donate";
                if (this.cY == 3) {
                    this.cY = 4;
                }
            }
            if (rs.f.a.ai == a.c.b) {
                if (hP >= ai - 86 && hP <= ai - 62 && hQ >= 172 && hQ <= 198) {
                    this.ar = "::items";
                    if (this.cY == 4) {
                        this.cY = 0;
                    }
                }
            } else if (hP >= 710 && hP <= 733 && hQ >= 22 && hQ <= 48) {
                this.ar = "::items";
                if (this.cY == 4) {
                    this.cY = 0;
                }
            }
            if (rs.f.a.ai == a.c.b) {
                if (ah <= 670) {
                    if (hQ >= 166 && hQ <= 182 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::bankall";
                        if (rs.f.a.aZ) {
                            this.ar = this.ar + " with_pet";
                        }
                    }
                } else if (hQ >= 313 && hQ <= 333 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::bankall";
                    if (rs.f.a.aZ) {
                        this.ar = this.ar + " with_pet";
                    }
                }
            } else if (hQ >= 116 && hQ <= 134 && hP >= 744 && hP <= 759) {
                this.ar = "::bankall";
                if (rs.f.a.aZ) {
                    this.ar = this.ar + " with_pet";
                }
            }
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::epicbosses";
                }
            } else if (hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
                this.ar = "::epicbosses";
            }
            if (rs.f.a.ai == a.c.b) {
                if (ah <= 609) {
                    if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::refill";
                    }
                } else if (hQ >= 250 && hQ <= 269 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::refill";
                }
            } else if (hQ >= 141 && hQ <= 161 && hP >= 744 && hP <= 759) {
                this.ar = "::refill";
            }
            if (rs.f.a.ai == a.c.b) {
                if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
                    SwingUtilities.invokeLater(() -> ((rs.ui.f)rs.p.a.c().getInstance(rs.ui.f.class)).g());
                }
            } else if (hQ >= 11 && hQ <= 30 && hP >= 736 && hP <= 757) {
                SwingUtilities.invokeLater(() -> ((rs.ui.f)rs.p.a.c().getInstance(rs.ui.f.class)).g());
            }
        }
        if (this.hU == 1) {
            int n2;
            int n3 = this.hV - 25 - 547;
            int n4 = this.hW - 5 - 13;
            if (rs.f.a.ai != a.c.a) {
                n3 = this.hV - (ai - 182 + 26);
                n4 = this.hW - 15;
            }
            if (this.c(-6, -6, n3, n4, 76) && this.N()) {
                n3 -= 73;
                n4 -= 75;
                n2 = this.ft + this.oa & 0x7FF;
                int n5 = e_0.v[n2];
                int n6 = e_0.w[n2];
                n5 = n5 * (this.fh + 256) >> 8;
                n6 = n6 * (this.fh + 256) >> 8;
                int n7 = n4 * n5 + n3 * n6 >> 11;
                int n8 = n4 * n6 - n3 * n5 >> 11;
                int n9 = Client.eR.ac + n7 >> 7;
                int n10 = Client.eR.ad - n8 >> 7;
                if (rs.l.j.c(cT) && ch) {
                    this.q(eh + n9, ei + n10);
                } else {
                    boolean bl = this.a(1, 0, 0, 0, Client.eR.l[0], 0, 0, n10, Client.eR.k[0], true, n9);
                    if (bl) {
                        fv.b(n3);
                        fv.b(n4);
                        fv.d(this.ft);
                        fv.b(57);
                        fv.b(this.oa);
                        fv.b(this.fh);
                        fv.b(89);
                        fv.d(Client.eR.ac);
                        fv.d(Client.eR.ad);
                        fv.b(this.oB);
                        fv.b(63);
                    }
                }
            }
            if (++ne > 1151) {
                ne = 0;
                fv.a(246);
                fv.b(0);
                n2 = Client.fv.h;
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.b(101);
                }
                fv.b(197);
                fv.d((int)(Math.random() * 65536.0));
                fv.b((int)(Math.random() * 256.0));
                fv.b(67);
                fv.d(14214);
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(29487);
                }
                fv.d((int)(Math.random() * 65536.0));
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.b(220);
                }
                fv.b(180);
                fv.j(Client.fv.h - n2);
            }
        }
    }

    public String h(int n2) {
        if (n2 < 999999999) {
            return String.valueOf(n2);
        }
        return "*";
    }

    private void bE() {
        int n2;
        Graphics graphics = this.B().getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 765, 503);
        this.v(1);
        if (this.kQ) {
            this.jK = false;
            graphics.setFont(new Font("Helvetica", 1, 16));
            graphics.setColor(Color.yellow);
            n2 = 35;
            graphics.drawString("Sorry, an error has occured whilst loading SpawnPK", 30, n2);
            graphics.setColor(Color.white);
            graphics.drawString("To fix this try the following (in order):", 30, n2 += 50);
            graphics.setColor(Color.white);
            graphics.setFont(new Font("Helvetica", 1, 12));
            graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, n2 += 50);
            graphics.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, n2 += 30);
            graphics.drawString("3: Try using a different game-world", 30, n2 += 30);
            graphics.drawString("4: Try rebooting your computer", 30, n2 += 30);
            graphics.drawString("5: Try selecting a different version of Java from the play-game menu", 30, n2 += 30);
        }
        if (this.nI) {
            this.jK = false;
            graphics.setFont(new Font("Helvetica", 1, 20));
            graphics.setColor(Color.white);
            graphics.drawString("Error - unable to load game!", 50, 50);
            graphics.drawString("To play RuneScape make sure you play from", 50, 100);
            graphics.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.ov) {
            this.jK = false;
            graphics.setColor(Color.yellow);
            n2 = 35;
            graphics.drawString("Error a copy of RuneScape already appears to be loaded", 30, n2);
            graphics.setColor(Color.white);
            graphics.drawString("To fix this try the following (in order):", 30, n2 += 50);
            graphics.setColor(Color.white);
            graphics.setFont(new Font("Helvetica", 1, 12));
            graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, n2 += 50);
            graphics.drawString("2: Try rebooting your computer, and reloading", 30, n2 += 30);
            n2 += 30;
        }
    }

    @Override
    public URL getCodeBase() {
        if (rs.v.a.h != null) {
            return rs.v.a.h.getCodeBase();
        }
        try {
            if (this.hH != null) {
                return new URL("http://" + rs.f.a.j + ":" + (80 + dL));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private void bF() {
        for (int i2 = 0; i2 < this.cB; ++i2) {
            int n2 = this.cC[i2];
            rs.a.j j2 = this.cA[n2];
            if (j2 != null) {
                this.b(j2);
            }
            if (j2.aG.x == 1552L) {
                j2.s = 512;
            }
            if (j2.aG.x == 2476L || j2.aG.x == 1208L || j2.aG.x == 8163L) {
                j2.s = 1534;
            }
            if (j2.aG.x == 4502L) {
                j2.s = 1534;
            }
            if (j2.aG.x == 251L) {
                j2.s = 1534;
            }
            if (j2.aG.x == 212L || j2.aG.x == 8030L) {
                j2.s = 512;
            }
            if (j2.aG.x == 401L) {
                j2.s = 512;
            }
            if (j2.aG.x == 410L || j2.aG.x == 6184L) {
                j2.s = 512;
            }
            if (j2.aG.x == 2790L) {
                j2.s = 1784;
            }
            if (j2.aG.x == 2165L) {
                j2.s = 1334;
            }
            if (j2.aG.x == 5942L) {
                j2.s = 512;
            }
            if (j2.aG.x == 8032L) {
                j2.s = 512;
            }
            if (j2.aG.x == 8000L) {
                j2.s = 512;
            }
            if (j2.aG.x != 4247L && j2.aG.x != 4250L) continue;
            j2.s = 1003;
        }
    }

    private void b(rs.a.c c2) {
        if (c2.ac < 128 || c2.ad < 128 || c2.ac >= 13184 || c2.ad >= 13184) {
            c2.F = -1;
            c2.z = -1;
            c2.Z = 0;
            c2.aa = 0;
            c2.ac = c2.k[0] * 128 + c2.S * 64;
            c2.ad = c2.l[0] * 128 + c2.S * 64;
            c2.e();
        }
        if (c2 == eR && (c2.ac < 1536 || c2.ad < 1536 || c2.ac >= 11776 || c2.ad >= 11776)) {
            c2.F = -1;
            c2.z = -1;
            c2.Z = 0;
            c2.aa = 0;
            c2.ac = c2.k[0] * 128 + c2.S * 64;
            c2.ad = c2.l[0] * 128 + c2.S * 64;
            c2.e();
        }
        if (c2.Z > ff) {
            this.c(c2);
        } else if (c2.aa >= ff) {
            this.d(c2);
        } else {
            this.e(c2);
        }
        this.a(c2);
        this.f(c2);
    }

    private void c(rs.a.c c2) {
        int n2 = c2.Z - ff;
        int n3 = c2.V * 128 + c2.S * 64;
        int n4 = c2.X * 128 + c2.S * 64;
        c2.ac += (n3 - c2.ac) / n2;
        c2.ad += (n4 - c2.ad) / n2;
        c2.n = 0;
        if (c2.ab == 0) {
            c2.s = 1024;
        }
        if (c2.ab == 1) {
            c2.s = 1536;
        }
        if (c2.ab == 2) {
            c2.s = 0;
        }
        if (c2.ab == 3) {
            c2.s = 512;
        }
    }

    private void d(rs.a.c c2) {
        int n2 = c2.aa - c2.Z;
        int n3 = ff - c2.Z;
        int n4 = c2.V * 128 + c2.S * 64;
        int n5 = c2.X * 128 + c2.S * 64;
        int n6 = c2.W * 128 + c2.S * 64;
        int n7 = c2.Y * 128 + c2.S * 64;
        c2.ac = (n4 * (n2 - n3) + n6 * n3) / n2;
        c2.ad = (n5 * (n2 - n3) + n7 * n3) / n2;
        c2.n = 0;
        if (c2.ab == 0) {
            c2.s = 1024;
        }
        if (c2.ab == 1) {
            c2.s = 1536;
        }
        if (c2.ab == 2) {
            c2.s = 0;
        }
        if (c2.ab == 3) {
            c2.s = 512;
        }
        c2.ae = c2.s;
    }

    private void e(rs.a.c c2) {
        c2.w = c2.t;
        if (c2.E == 0) {
            c2.n = 0;
            return;
        }
        if (c2.F != -1 && c2.I == 0) {
            rs.d.a a2 = c2.d()[c2.F];
            if (c2.U > 0 && a2.o == 0) {
                ++c2.n;
                return;
            }
            if (c2.U <= 0 && a2.p == 0) {
                ++c2.n;
                return;
            }
        }
        int n2 = c2.ac;
        int n3 = c2.ad;
        int n4 = c2.k[c2.E - 1] * 128 + c2.S * 64;
        int n5 = c2.l[c2.E - 1] * 128 + c2.S * 64;
        if (n4 - n2 > 256 || n4 - n2 < -256 || n5 - n3 > 256 || n5 - n3 < -256) {
            c2.ac = n4;
            c2.ad = n5;
            return;
        }
        c2.s = n2 < n4 ? (n3 < n5 ? 1280 : (n3 > n5 ? 1792 : 1536)) : (n2 > n4 ? (n3 < n5 ? 768 : (n3 > n5 ? 256 : 512)) : (n3 < n5 ? 1024 : 0));
        int n6 = c2.s - c2.ae & 0x7FF;
        if (n6 > 1024) {
            n6 -= 2048;
        }
        int n7 = c2.ah;
        if (n6 >= -256 && n6 <= 256) {
            n7 = c2.ag;
        } else if (n6 >= 256 && n6 < 768) {
            n7 = c2.aj;
        } else if (n6 >= -768 && n6 <= -256) {
            n7 = c2.ai;
        }
        if (n7 == -1) {
            n7 = c2.ag;
        }
        c2.w = n7;
        int n8 = 4;
        if (c2.ae != c2.s && c2.m == -1 && c2.o != 0) {
            n8 = 2;
        }
        if (c2.E > 2) {
            n8 = 6;
        }
        if (c2.E > 3) {
            n8 = 8;
        }
        if (c2.n > 0 && c2.E > 1) {
            n8 = 8;
            --c2.n;
        }
        if (c2.af[c2.E - 1]) {
            n8 <<= 1;
        }
        if (n8 >= 8 && (c2.w == c2.ag || c2.m != -1) && c2.p != -1) {
            c2.w = c2.p;
        }
        if (n2 < n4) {
            c2.ac += n8;
            if (c2.ac > n4) {
                c2.ac = n4;
            }
        } else if (n2 > n4) {
            c2.ac -= n8;
            if (c2.ac < n4) {
                c2.ac = n4;
            }
        }
        if (n3 < n5) {
            c2.ad += n8;
            if (c2.ad > n5) {
                c2.ad = n5;
            }
        } else if (n3 > n5) {
            c2.ad -= n8;
            if (c2.ad < n5) {
                c2.ad = n5;
            }
        }
        if (c2.ac == n4 && c2.ad == n5) {
            --c2.E;
            if (c2.U > 0) {
                --c2.U;
            }
        }
    }

    public void a(rs.a.c c2) {
        int n2;
        int n3;
        int n4;
        rs.a.j j2;
        if (c2.o == 0) {
            return;
        }
        if (c2.m != -1 && c2.m < 32768 && (j2 = this.cA[c2.m]) != null) {
            n4 = c2.ac - j2.ac;
            n3 = c2.ad - j2.ad;
            if (n4 != 0 || n3 != 0) {
                c2.s = (int)(Math.atan2(n4, n3) * 325.949) & 0x7FF;
            }
        }
        if (c2.m >= 32768) {
            rs.a.k k2;
            int n5 = c2.m - 32768;
            if (n5 == di) {
                n5 = 2047;
            }
            if ((k2 = do[n5]) != null) {
                n3 = c2.ac - k2.ac;
                int n6 = c2.ad - k2.ad;
                if (n3 != 0 || n6 != 0) {
                    c2.s = (int)(Math.atan2(n3, n6) * 325.949) & 0x7FF;
                }
            }
        }
        if (!(c2.Q == 0 && c2.R == 0 || c2.E != 0 && c2.n <= 0)) {
            int n7 = c2.ac - (c2.Q - eh - eh) * 64;
            n4 = c2.ad - (c2.R - ei - ei) * 64;
            if (n7 != 0 || n4 != 0) {
                c2.s = (int)(Math.atan2(n7, n4) * 325.949) & 0x7FF;
            }
            c2.Q = 0;
            c2.R = 0;
        }
        if ((n2 = c2.s - c2.ae & 0x7FF) != 0) {
            c2.ae = n2 < c2.o || n2 > 2048 - c2.o ? c2.s : (n2 > 1024 ? (c2.ae -= c2.o) : (c2.ae += c2.o));
            c2.ae &= 0x7FF;
            if (c2.w == c2.t && c2.ae != c2.s) {
                if (c2.u != -1) {
                    c2.w = c2.u;
                    return;
                }
                c2.w = c2.ag;
            }
        }
    }

    private void f(rs.a.c c2) {
        int n2;
        rs.d.a a2;
        c2.T = false;
        int n3 = c2.w;
        if (n3 != -1) {
            a2 = c2.d()[n3];
            if (c2 instanceof rs.a.k) {
                a2 = ((rs.a.k)c2).c(n3);
            }
            if (a2.b()) {
                ++c2.x;
                n2 = a2.c();
                if (c2.x >= n2) {
                    if (a2.h > 0) {
                        c2.x -= a2.h;
                        if (a2.q == 1) {
                            ++c2.y;
                        }
                        if (c2.x < 0 || c2.x >= n2 || a2.q == 1 && c2.y >= a2.n) {
                            c2.x = 0;
                            c2.y = 0;
                        }
                    } else {
                        c2.y = 0;
                        c2.x = 0;
                    }
                }
            } else {
                ++c2.y;
                if (c2.x < a2.d && c2.y > a2.a(c2.x)) {
                    c2.y = 1;
                    ++c2.x;
                }
                if (c2.x >= a2.d) {
                    c2.y = 1;
                    c2.x = 0;
                }
            }
        }
        if (c2.z != -1 && ff >= c2.C) {
            if (c2.A < 0) {
                c2.A = 0;
            }
            if (!(a2 = rs.d.x.c[c2.z].g).b()) {
                ++c2.B;
                while (c2.A < a2.d && c2.B > a2.a(c2.A)) {
                    c2.B -= a2.a(c2.A);
                    ++c2.A;
                }
                if (c2.A >= a2.d && (c2.A < 0 || c2.A >= a2.d)) {
                    c2.z = -1;
                }
            } else {
                ++c2.A;
                n2 = a2.c();
                if (c2.A >= n2 && (c2.A < 0 || c2.A >= n2)) {
                    c2.z = -1;
                }
            }
        }
        if (c2.F != -1 && c2.I <= 1) {
            a2 = c2.d()[c2.F];
            if (a2 == null) {
                System.out.println("NULLED ANIM: " + c2.F);
            }
            if (a2.o == 1 && c2.U > 0 && c2.Z <= ff && c2.aa < ff) {
                c2.I = 1;
                return;
            }
        }
        if (c2.F != -1 && c2.I == 0) {
            a2 = c2.d()[c2.F];
            if (a2.b()) {
                ++c2.G;
                n2 = a2.c();
                if (c2.G >= n2) {
                    c2.G -= a2.h;
                    ++c2.J;
                    if (c2.J >= a2.n) {
                        c2.F = -1;
                    } else if (c2.G < 0 || c2.G >= n2) {
                        c2.F = -1;
                    }
                }
            } else {
                ++c2.H;
                while (c2.G < a2.d && c2.H > a2.a(c2.G)) {
                    c2.H -= a2.a(c2.G);
                    ++c2.G;
                }
                if (c2.G >= a2.d) {
                    c2.G -= a2.h;
                    ++c2.J;
                    if (c2.J >= a2.n) {
                        c2.F = -1;
                    }
                    if (c2.G < 0 || c2.G >= a2.d) {
                        c2.F = -1;
                    }
                }
            }
            c2.T = a2.j;
        }
        if (c2.I > 0) {
            --c2.I;
        }
    }

    public void O() {
    }

    public void P() {
        if (rs.l.b.a.b()) {
            return;
        }
        int n2 = !Client.ai() ? 516 : ai - 247;
        int n3 = !Client.ai() ? 168 : ah - 335;
        boolean bl = false;
        if (rs.f.a.ai == a.c.a || rs.f.a.ai != a.c.a && !bl) {
            for (int i2 = 0; i2 < this.v.a.length; ++i2) {
                if (eT[this.jh[i2]] == -1 || this.jg[i2] == -1) continue;
                this.v.a[this.jg[i2]].f(this.je[i2] + n2, this.jf[i2] + n3);
            }
        } else if (bl && ai < 1000) {
            int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] nArray2 = new int[]{219, 189, 156, 126, 93, 62, 30, 219, 189, 156, 124, 92, 59, 28};
            int[] nArray3 = new int[]{67, 69, 67, 69, 72, 72, 69, 32, 29, 29, 32, 30, 33, 31, 32};
            for (int i3 = 0; i3 < this.v.a.length; ++i3) {
                if (eT[this.jh[i3]] == -1 || nArray[i3] == -1) continue;
                this.v.a[nArray[i3]].f(ai - nArray2[i3], ah - nArray3[i3]);
            }
        } else if (bl && ai >= 1000) {
            int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] nArray4 = new int[]{50, 80, 114, 143, 176, 208, 240, 242, 273, 306, 338, 370, 404, 433};
            int[] nArray5 = new int[]{30, 32, 30, 32, 34, 34, 32, 32, 29, 29, 32, 31, 32, 32, 32};
            for (int i4 = 0; i4 < this.v.a.length; ++i4) {
                if (eT[this.jh[i4]] == -1 || nArray[i4] == -1) continue;
                this.v.a[nArray[i4]].f(ai - 461 + nArray4[i4], ah - nArray5[i4]);
            }
        }
        if (rs.l.f.a.i.b.n() != null && ff % 20 < 10) {
            switch (rs.l.f.a.i.b.n()) {
                case a: {
                    if (fL == 2) break;
                    rs.l.f.a.i.e.b.a().f(n2 + 83 - 30, n3 + 7 - 4);
                    break;
                }
                case b: {
                    if (fL == 3) break;
                    rs.l.f.a.i.e.b.a().f(n2 + 114 - 30, n3 + 7 - 4);
                    break;
                }
                case c: {
                    if (fL == 4) break;
                    rs.l.f.a.i.e.b.a().f(n2 + 146 - 30, n3 + 7 - 4);
                    break;
                }
                case d: {
                    if (fL == 6) break;
                    rs.l.f.a.i.e.b.a().f(n2 + 214 - 30, n3 + 7 - 4);
                }
            }
        }
    }

    private void bG() {
        int n2 = !Client.ai() ? 516 : ai - 247;
        int n3 = !Client.ai() ? 168 : ah - 335;
        boolean bl = false;
        boolean bl2 = false;
        if (rs.f.a.ai == a.c.a || rs.f.a.ai != a.c.a && !bl) {
            if (eT[fL] != -1 && fL != 15) {
                this.H[this.jk[fL]].f(this.ji[fL] + n2, this.jj[fL] + n3);
            }
        } else if (bl && ai < 1000) {
            int[] nArray = new int[]{226, 194, 162, 130, 99, 65, 34, 219, 195, 161, 130, 98, 65, 33};
            int[] nArray2 = new int[]{73, 73, 73, 73, 73, 73, 73, -1, 37, 37, 37, 37, 37, 37, 37};
            if (eT[fL] != -1 && fL != 10 && bl2) {
                if (fL == 7) {
                    this.H[39].f(ai - 130, ah - 37);
                }
                this.H[39].f(ai - nArray[fL], ah - nArray2[fL]);
            }
        } else if (bl && ai >= 1000) {
            int[] nArray = new int[]{417, 385, 353, 321, 289, 256, 224, 129, 193, 161, 130, 98, 65, 33};
            if (eT[fL] != -1 && fL != 10 && bl2) {
                this.H[39].f(ai - nArray[fL], ah - 37);
            }
        }
    }

    public void Q() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = !Client.ai() ? 516 : ai - 240;
        int n8 = !Client.ai() ? 168 : ah - 335;
        e_0.x = this.fp;
        if (rs.f.a.ai == a.c.a) {
            this.H[21].f(0 + n7, 0 + n8);
        } else if (rs.f.a.ai != a.c.a) {
            rs.l.c.d(ai - 217, ah - 305, 195, 270, 4076841, rs.f.a.ai == a.c.b ? 150 : 256);
            this.H[47].f(n7, n8);
        } else {
            n6 = 1;
            n5 = 1;
            if (ai >= 1000) {
                if (n6 != 0) {
                    rs.l.c.d(ai - 197, ah - 304, 197, 265, 4076841, n5 != 0 ? 80 : 256);
                    this.H[50].f(ai - 204, ah - 311);
                }
                n4 = ai - 417;
                n3 = ah - 37;
                for (n2 = 0; n4 <= ai - 30 && n2 < 13; n4 += 32, ++n2) {
                    this.H[46].f(n4, n3);
                }
            } else if (ai < 1000) {
                if (n6 != 0) {
                    rs.l.c.d(ai - 197, ah - 341, 195, 265, 4076841, n5 != 0 ? 80 : 256);
                    this.H[50].f(ai - 204, ah - 348);
                }
                n4 = ai - 226;
                n3 = ah - 73;
                for (n2 = 0; n4 <= ai - 32 && n2 < 7; n4 += 32, ++n2) {
                    this.H[46].f(n4, n3);
                }
                n4 = ai - 226;
                n3 = ah - 37;
                for (n2 = 0; n4 <= ai - 32 && n2 < 7; n4 += 32, ++n2) {
                    this.H[46].f(n4, n3);
                }
            }
        }
        if (this.fu == -1) {
            this.bG();
            this.P();
        }
        n6 = rs.f.a.ai == a.c.a ? 31 + n7 : ai - 215;
        int n9 = n5 = rs.f.a.ai == a.c.a ? 37 + n8 : ah - 298;
        if (this.fu != -1) {
            this.a(0, n6, rs.n.e.H[this.fu], n5);
        } else if (eT[fL] != -1) {
            this.a(0, n6, rs.n.e.H[eT[fL]], n5);
        }
        n4 = rs.f.a.ai == a.c.a ? -526 : -10;
        n3 = rs.f.a.ai == a.c.a ? -178 : -10;
        rs.n.b.a.c.d();
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
            if (rs.l.j.b(cT)) {
                n2 = br + 5;
                if (br == 64036) {
                    n2 = 70002;
                }
                if (rs.n.c.af.e.get(n2) != null) {
                    int n10 = rs.n.c.af.e.get(n2).b();
                    this.b(hP + n4, hQ + n3, " @gre@Item ID: @yel@" + n10 + "    ");
                    rs.n.e.H[64033].at = "@gre@Last hovered: @yel@" + n10;
                } else {
                    this.b(hP + n4, hQ + n3, " Right-click @yel@quick spawn    ");
                }
            } else {
                n2 = br + 5;
                if (br == 64036) {
                    n2 = 70002;
                }
                boolean bl = false;
                if (n2 >= 0 && n2 <= rs.n.e.H.length - 1 && rs.n.e.H[n2] != null && rs.n.e.H[n2].at != null && rs.n.e.H[n2].at.contains("@gre@")) {
                    this.b(hP + n4, hQ + n3, " <img=25> @or2@Unspawnable   ");
                    bl = true;
                }
                if (!bl) {
                    this.b(hP + n4, hQ + n3, " Right-click @yel@quick spawn    ");
                }
            }
        }
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Lite mode")) {
            this.b(hP + n4, hQ + n3, " Toggle \"Lite mode\"\nExperiencing lag? This mode will\nreduce your graphic settings\nand improve performance!");
        }
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Resizable mode")) {
            this.b(hP + n4, hQ + n3, " Resizable mode\nToggle this setting\nif you want to experience\nSpawnPK in fullscreen!");
        }
        if (this.eV >= 2 && this.fx[this.eV - 1] != null) {
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open achievement tab")) {
                this.b(hP + n4, hQ + n3, " Achievements");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open events")) {
                this.b(hP + n4, hQ + n3, " World events");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open guides")) {
                this.b(hP + n4, hQ + n3, " Knowledgebase");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open account information")) {
                this.b(hP + n4, hQ + n3, " Account information");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open pk ratings")) {
                this.b(hP + n4, hQ + n3, " PK ratings");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Collect reward")) {
                this.b(hP + n4, hQ + n3, " <img=9> Collect ");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("View information")) {
                this.b(hP + n4, hQ + n3, " <img=40>  Information ");
            }
        }
        if (this.cY > 0 && this.fu == -1 && ff % 20 < 10) {
            if (this.cY == 1) {
                if (fL != 11) {
                    if (rs.f.a.ai == a.c.b) {
                        this.cU.f(ai - 101, ah - 70);
                    } else {
                        this.cU.f(146, 265);
                    }
                } else if (rs.f.a.ai == a.c.b) {
                    this.cU.f(ai - 213, ah - 280);
                } else {
                    this.cU.f(33, 55);
                }
            } else if (this.cY == 2) {
                if (fL != 6) {
                    if (rs.f.a.ai == a.c.b) {
                        this.cV.f(ai - 35, ah - 300);
                    } else {
                        this.cV.f(212, 38);
                    }
                } else if (rs.f.a.ai == a.c.b) {
                    this.cU.f(ai - 182, ah - 290);
                } else {
                    this.cU.f(65, 44);
                }
            }
        }
        rs.l.f.e.d().a(rs.l.f.a.t);
        rs.l.f.e.d().a(rs.l.f.a.u);
        if (dj) {
            this.b(0, 0);
        }
        e_0.x = this.fq;
    }

    private void bH() {
        rs.l.b.a.a(this);
    }

    private boolean d(rs.n.e e2) {
        int n2 = e2.J;
        if (n2 >= 1 && n2 <= 200 || n2 >= 701 && n2 <= 900) {
            n2 = n2 >= 801 ? (n2 -= 701) : (n2 >= 701 ? (n2 -= 601) : (n2 >= 101 ? (n2 -= 101) : --n2));
            if (ag) {
                this.fx[this.eV] = "Message @whi@" + this.mT[n2];
                this.eI[this.eV] = 639;
                ++this.eV;
                this.fx[this.eV] = "Remove @whi@" + this.mT[n2];
                this.eI[this.eV] = 792;
                ++this.eV;
            } else {
                this.fx[this.eV] = "Remove @whi@" + this.mT[n2];
                this.eI[this.eV] = 792;
                ++this.eV;
                this.fx[this.eV] = "Message @whi@" + this.mT[n2];
                this.eI[this.eV] = 639;
                ++this.eV;
            }
            return true;
        }
        if (n2 >= 401 && n2 <= 500) {
            this.fx[this.eV] = "Remove @whi@" + e2.at;
            this.eI[this.eV] = 322;
            ++this.eV;
            return true;
        }
        return false;
    }

    public void R() {
        rs.a.b b2 = (rs.a.b)this.et.b();
        while (b2 != null) {
            if (b2.h != dw || b2.m) {
                b2.b();
            } else if (ff >= b2.l) {
                b2.a(this.dE);
                if (b2.m) {
                    b2.b();
                } else {
                    this.dF.a(b2.h, 0, b2.k, -1, b2.j, 60, b2.i, b2, false);
                }
            }
            b2 = (rs.a.b)this.et.d();
        }
    }

    public boolean i(int n2) {
        boolean bl = false;
        if (n2 <= 0) {
            return true;
        }
        rs.n.e e2 = rs.n.e.H[rs.n.c.h.bI[n2 - 1][1]];
        bl = e2.az == null || e2.az[0] <= 0;
        if (!bl) {
            return true;
        }
        e2 = rs.n.e.H[rs.n.c.h.bI[n2][1]];
        return e2.az != null && e2.az[0] > 0;
    }

    public boolean j(int n2) {
        if (n2 == 54195 && cH == ad_0.bI) {
            return false;
        }
        if ((n2 >= 45694 && n2 <= 45701 || n2 >= 45149 && n2 <= 45156 || n2 >= 45751 && n2 <= 45758 || n2 >= 45743 && n2 <= 45750) && Client.eR.br[3] != 21208) {
            return false;
        }
        if (eT[0] == 1829) {
            if ((n2 == 12055 || n2 == 12081) && Client.eR.br[3] != 12303 && Client.eR.br[3] != 13416 && Client.eR.br[3] != 27718) {
                return false;
            }
            if ((n2 == 12056 || n2 == 12091) && Client.eR.br[3] != 23673) {
                return false;
            }
            if ((n2 == 12054 || n2 == 12071) && Client.eR.br[3] != 21544 && Client.eR.br[3] != 21545 && Client.eR.br[3] != 21546 && Client.eR.br[3] != 21547 && Client.eR.br[3] != 25934 && Client.eR.br[3] != 25935) {
                return false;
            }
        }
        return true;
    }

    public void a(int n2, int n3, rs.n.e e2, int n4) {
        rs.l.b.d.a(this, n2, n3, e2, n4);
    }

    public void f(int n2, int n3) {
        rs.l.c.a(71, n3 - 1, n2 - 2, 7496785, 1);
        rs.l.c.a(69, n3, n2 + 174, 7496785, 1);
        rs.l.c.a(1, n3 - 2, n2 - 2, 7496785, 178);
        rs.l.c.a(1, n3 + 68, n2, 7496785, 174);
        rs.l.c.a(71, n3 - 1, n2 - 1, 3025699, 1);
        rs.l.c.a(71, n3 - 1, n2 + 175, 3025699, 1);
        rs.l.c.a(1, n3 - 1, n2, 3025699, 175);
        rs.l.c.a(1, n3 + 69, n2, 3025699, 175);
        rs.l.c.d(n2, n3, 174, 68, 0, 220);
    }

    public final String k(int n2) {
        if (n2 >= 0 && n2 < 10000) {
            return String.valueOf(n2);
        }
        if (n2 >= 10000 && n2 < 10000000) {
            return n2 / 1000 + "K";
        }
        if (n2 >= 10000000 && n2 < 999999999) {
            return n2 / 1000000 + "M";
        }
        if (n2 >= 999999999) {
            return "*";
        }
        return "?";
    }

    public void c(int n2, int n3, String string) {
        int n4;
        String[] stringArray = string.split("\n");
        int n5 = stringArray.length * 16 + 3;
        int n6 = this.gi.a(stringArray[0]) + 6;
        for (n4 = 1; n4 < stringArray.length; ++n4) {
            if (n6 > this.gi.a(stringArray[n4]) + 6) continue;
            n6 = this.gi.a(stringArray[n4]) + 6;
        }
        rs.l.c.a(n5, n3, n2, 0xFFFFA0, n6);
        rs.l.c.d(n2, n6, n5, 0, n3);
        n3 += 14;
        for (n4 = 0; n4 < stringArray.length; ++n4) {
            this.gi.a(false, n2 + 3, 0, stringArray[n4], n3);
            n3 += 16;
        }
    }

    public void l(int n2) {
        this.jl = n2;
        rs.n.e.H[5385].V = 0;
        rs.n.e.H[10324].E = rs.n.c.h.d;
        rs.n.e.H[10324].aG = rs.n.c.h.d;
        for (int[] nArray : rs.n.c.h.bI) {
            if (rs.n.e.H[nArray[1]].az[0] <= 0) {
                rs.n.e.H[nArray[0]].E = rs.n.c.h.g;
                continue;
            }
            rs.n.e.H[nArray[0]].E = rs.n.c.h.f;
            rs.n.e.H[nArray[0]].aG = rs.n.c.h.f;
        }
        if (n2 == -1) {
            rs.n.e.H[10324].E = rs.n.c.h.c;
            rs.n.e.H[10324].aG = rs.n.c.h.c;
        } else {
            rs.n.e.H[rs.n.c.h.bI[n2][0]].E = rs.n.c.h.e;
            rs.n.e.H[rs.n.c.h.bI[n2][0]].aG = rs.n.c.h.e;
        }
    }

    public void d(int n2, int n3, int n4) {
        if (n3 <= 0) {
            rs.n.e.H[rs.n.c.h.bI[n2][1]].az[0] = 0;
            rs.n.e.H[rs.n.c.h.bI[n2][1]].ax[0] = 0;
            rs.n.e.H[rs.n.c.h.bI[n2][0]].E = rs.n.c.h.g;
        } else {
            rs.n.e.H[rs.n.c.h.bI[n2][1]].az[0] = n3 + 1;
            rs.n.e.H[rs.n.c.h.bI[n2][1]].ax[0] = n4;
            rs.n.e.H[rs.n.c.h.bI[n2][1]].bh = false;
            rs.n.e.H[rs.n.c.h.bI[n2][0]].E = this.jl == n2 ? rs.n.c.h.e : rs.n.c.h.f;
            rs.n.e.H[rs.n.c.h.bI[n2][0]].aG = this.jl == n2 ? rs.n.c.h.e : rs.n.c.h.f;
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int n2;
        super.mouseReleased(mouseEvent);
        int n3 = rs.f.a.ai == a.c.b ? ai / 2 - 356 : 0;
        int n4 = n2 = rs.f.a.ai == a.c.b ? ah / 2 - 230 : 0;
        if (this.eA == 2 && (this.ex == 5382 || this.ex >= 10335 && this.ex <= 10342) && rs.c_0.hQ >= 40 + n2 && rs.c_0.hQ <= 77 + n2) {
            String string;
            String string2 = string = this.ex == 5382 ? "::setbanktab" : "::swapbanktab";
            if (rs.c_0.hP >= 28 + n3 && rs.c_0.hP <= 74 + n3) {
                ap = string + " " + this.ey + " 0" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 75 + n3 && rs.c_0.hP <= 121 + n3) {
                ap = string + " " + this.ey + " 1" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 122 + n3 && rs.c_0.hP <= 168 + n3) {
                ap = string + " " + this.ey + " 2" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 169 + n3 && rs.c_0.hP <= 215 + n3) {
                ap = string + " " + this.ey + " 3" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 216 + n3 && rs.c_0.hP <= 262 + n3) {
                ap = string + " " + this.ey + " 4" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 263 + n3 && rs.c_0.hP <= 309 + n3) {
                ap = string + " " + this.ey + " 5" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 310 + n3 && rs.c_0.hP <= 356 + n3) {
                ap = string + " " + this.ey + " 6" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 357 + n3 && rs.c_0.hP <= 403 + n3) {
                ap = string + " " + this.ey + " 7" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.c_0.hP >= 404 + n3 && rs.c_0.hP <= 450 + n3) {
                ap = string + " " + this.ey + " 8" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
        }
    }

    private void a(rs.l.a a2) {
        int n2;
        int n3;
        int n4;
        int n5 = 256;
        for (n4 = 0; n4 < this.nP.length; ++n4) {
            this.nP[n4] = 0;
        }
        for (n4 = 0; n4 < 5000; ++n4) {
            int n6 = (int)(Math.random() * 128.0 * (double)n5);
            this.nP[n6] = (int)(Math.random() * 256.0);
        }
        for (n4 = 0; n4 < 20; ++n4) {
            for (int i2 = 1; i2 < n5 - 1; ++i2) {
                for (n3 = 1; n3 < 127; ++n3) {
                    n2 = n3 + (i2 << 7);
                    this.nQ[n2] = (this.nP[n2 - 1] + this.nP[n2 + 1] + this.nP[n2 - 128] + this.nP[n2 + 128]) / 4;
                }
            }
            int[] nArray = this.nP;
            this.nP = this.nQ;
            this.nQ = nArray;
        }
        if (a2 != null) {
            n4 = 0;
            for (int i3 = 0; i3 < a2.k; ++i3) {
                for (n3 = 0; n3 < a2.j; ++n3) {
                    if (a2.i[n4++] == 0) continue;
                    n2 = n3 + 16 + a2.l;
                    int n7 = i3 + 16 + a2.m;
                    int n8 = n2 + (n7 << 7);
                    this.nP[n8] = 0;
                }
            }
        }
    }

    private void a(int n2, int n3, rs.x.e e2, rs.a.k k2) {
        int n4;
        int n5;
        int n6;
        int n7;
        if (rs.f.a.f.booleanValue()) {
            cx.add("Parsing synchronization mask..");
        }
        if ((n2 & 0x400) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting forcemovement block..");
            }
            k2.V = e2.P();
            k2.X = e2.P();
            k2.W = e2.P();
            k2.Y = e2.P();
            k2.Z = e2.U() + ff;
            k2.aa = e2.T() + ff;
            k2.ab = e2.P();
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->forceMovement direction=" + k2.ab);
            }
            k2.e();
        }
        if ((n2 & 0x100) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting GFX block..");
            }
            k2.z = e2.S();
            n7 = e2.D();
            if (k2.z == 1950 && rs.f.a.aj) {
                k2.z = 1171;
            }
            if (k2.z == 1339 && rs.f.a.aV) {
                k2.z = 1222;
            }
            if (k2.z == 1338 && rs.f.a.aV) {
                k2.z = 1223;
            }
            if (k2.z == 1340 && rs.f.a.aV) {
                k2.z = 3001;
            }
            k2.D = n7 >> 16;
            k2.C = ff + (n7 & 0xFFFF);
            k2.A = 0;
            k2.B = 0;
            if (k2.C > ff) {
                k2.A = -1;
            }
            if (k2.z == 65535) {
                k2.z = -1;
            }
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->GFX=" + k2.z);
            }
        }
        if ((n2 & 8) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting animation block..");
            }
            if ((n7 = e2.S()) == 65535) {
                n7 = -1;
            }
            n6 = e2.O();
            n5 = e2.O();
            if (n7 > 0 && n7 < rs.d.a.a.length && n5 == 2 && rs.d.a.a[n7].k < 8) {
                rs.d.a.a[n7].k = 8;
                rs.d.a.c[n7].k = 8;
                rs.d.a.b[n7].k = 8;
            }
            if (n7 == k2.F && n7 != -1) {
                n4 = rs.d.a.a[n7].q;
                if (n5 == 2) {
                    n4 = 1;
                }
                if (n4 == 1) {
                    k2.G = 0;
                    k2.H = 0;
                    k2.I = n6;
                    k2.J = 0;
                }
                if (n4 == 2) {
                    k2.J = 0;
                }
            } else if (n7 == -1 || k2.F == -1 || rs.d.a.a[n7].k >= rs.d.a.a[k2.F].k) {
                k2.F = n7;
                k2.G = 0;
                k2.H = 0;
                k2.I = n6;
                k2.J = 0;
                k2.U = k2.E;
            }
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->i2: " + n6);
            }
        }
        if ((n2 & 4) != 0) {
            String string;
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting forcechat block..");
            }
            if ((string = e2.F()).charAt(0) == '~') {
                string = string.substring(1);
                k2.aA = k2.aA == 1 ? 2 : 1;
                k2.az = System.currentTimeMillis() + 1200L;
            }
            if (!string.endsWith("__")) {
                k2.q = string;
                k2.v = 0;
                k2.K = 0;
                k2.O = 150;
            }
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->..done!");
            }
        }
        if ((n2 & 0x80) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting chat block..");
            }
            int n8 = e2.S();
            n6 = e2.B();
            n5 = e2.O();
            n4 = e2.h;
            if (k2.aZ != null && k2.bm) {
                long l2 = o_0.a(k2.d(true));
                boolean bl = false;
                if (!rs.l.j.a(n6)) {
                    for (int i2 = 0; i2 < this.jD; ++i2) {
                        if (this.kP[i2] != l2) continue;
                        bl = true;
                        break;
                    }
                }
                if (!bl && this.ou == 0) {
                    try {
                        this.jM.h = 0;
                        e2.b(n5, 0, this.jM.g);
                        this.jM.h = 0;
                        String string = p_0.a(n5, this.jM);
                        k2.q = string = rs.d.c.b(string);
                        k2.v = n8 >> 8;
                        k2.aC = n6;
                        k2.K = n8 & 0xFF;
                        k2.O = 150;
                        if (n6 > 0) {
                            this.a(string, 1, "@cr" + n6 + "@" + k2.d(true));
                        } else {
                            this.a(string, 2, k2.d(true));
                        }
                    }
                    catch (Exception exception) {
                        rs.v.a.e("cde2");
                    }
                }
            }
            e2.h = n4 + n5;
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->..done!");
            }
        }
        if ((n2 & 1) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting interaction bloc..");
            }
            k2.m = e2.S();
            if (k2.m == 65535) {
                k2.m = -1;
            }
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->interactingEntity=" + k2.m);
            }
        }
        if ((n2 & 0x10) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting appearence block..");
            }
            int n9 = e2.O();
            byte[] byArray = new byte[n9];
            rs.x.e e3 = new rs.x.e(byArray);
            e2.a(n9, 0, byArray);
            this.ky[n3] = e3;
            k2.a(e3);
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->..appearence block done!");
            }
        }
        if ((n2 & 2) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting turn to tile block..");
            }
            k2.Q = e2.U();
            k2.R = e2.S();
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->faceX=" + k2.Q + " faceY" + k2.R);
            }
        }
        if ((n2 & 0x20) != 0) {
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->Starting hits update block..");
            }
            int n10 = e2.y();
            for (int i3 = 0; i3 < n10; ++i3) {
                int n11 = e2.o();
                n4 = e2.y();
                int n12 = e2.y();
                k2.a(n4, n11, ff, n12);
            }
            k2.L = ff + 300;
            k2.M = e2.o();
            k2.N = e2.o();
            if (rs.f.a.f.booleanValue()) {
                cx.add("\t\t->health=" + k2.M + "/" + k2.N);
            }
        }
    }

    public void S() {
        this.g(Client.eR.ac, Client.eR.ad);
    }

    public void g(int n2, int n3) {
        try {
            int n4;
            int n5 = n2 + this.gq;
            int n6 = n3 + this.eU;
            if (this.eb - n5 < -500 || this.eb - n5 > 500 || this.ec - n6 < -500 || this.ec - n6 > 500) {
                this.eb = n5;
                this.ec = n6;
            }
            if (this.eb != n5) {
                this.eb += (n5 - this.eb) / 16;
            }
            if (this.ec != n6) {
                this.ec += (n6 - this.ec) / 16;
            }
            this.nM = this.hY[1] == 1 && !Client.w.b ? (this.nM += (-24 - this.nM) / 2) : (this.hY[2] == 1 && !Client.w.b ? (this.nM += (24 - this.nM) / 2) : (this.nM /= 2));
            if (this.hY[3] == 1 && !Client.w.b) {
                if (rs.l.b.a.d.g() && ch) {
                    rs.l.b.a.d.b.i -= 5;
                } else {
                    this.nN += (12 - this.nN) / 2;
                }
            } else if (this.hY[4] == 1 && !Client.w.b) {
                if (rs.l.b.a.d.g() && ch) {
                    rs.l.b.a.d.b.i += 5;
                } else {
                    this.nN += (-12 - this.nN) / 2;
                }
            } else {
                this.nN /= 2;
            }
            this.ft = this.ft + this.nM / 2 & 0x7FF;
            this.fs += this.nN / 2;
            if (this.fs < 128) {
                this.fs = 128;
            }
            if (this.fs > 383) {
                this.fs = 383;
            }
            int n7 = this.eb >> 7;
            int n8 = this.ec >> 7;
            int n9 = this.c(dw, this.ec, this.eb);
            int n10 = 0;
            if (n7 > 3 && n8 > 3 && n7 < 100 && n8 < 100) {
                for (n4 = n7 - 4; n4 <= n7 + 4; ++n4) {
                    for (int i2 = n8 - 4; i2 <= n8 + 4; ++i2) {
                        int n11;
                        int n12 = dw;
                        if (n12 < 3 && (this.gc[1][n4][i2] & 2) == 2) {
                            ++n12;
                        }
                        if ((n11 = n9 - this.fC[n12][n4][i2]) <= n10) continue;
                        n10 = n11;
                    }
                }
            }
            if (++dZ > 1512) {
                dZ = 0;
                fv.a(77);
                fv.b(0);
                n4 = Client.fv.h;
                fv.b((int)(Math.random() * 256.0));
                fv.b(101);
                fv.b(233);
                fv.d(45092);
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(35784);
                }
                fv.b((int)(Math.random() * 256.0));
                fv.b(64);
                fv.b(38);
                fv.d((int)(Math.random() * 65536.0));
                fv.d((int)(Math.random() * 65536.0));
                fv.j(Client.fv.h - n4);
            }
            if ((n4 = n10 * 192) > 98048) {
                n4 = 98048;
            }
            if (n4 < 32768) {
                n4 = 32768;
            }
            if (n4 > this.dQ) {
                this.dQ += (n4 - this.dQ) / 24;
                return;
            }
            if (n4 < this.dQ) {
                this.dQ += (n4 - this.dQ) / 80;
            }
        }
        catch (Exception exception) {
            rs.v.a.e("glfc_ex " + Client.eR.ac + "," + Client.eR.ad + "," + this.eb + "," + this.ec + "," + this.mx + "," + this.my + "," + eh + "," + ei);
            exception.printStackTrace();
            throw new RuntimeException("eek");
        }
    }

    @Override
    public void T() {
        if (this.ov || this.kQ || this.nI) {
            this.bE();
            return;
        }
        ++mr;
        if (!rs.l.b.a.a() && (fg += 0.05) >= Double.MAX_VALUE) {
            fg = 0.0;
        }
        if (!this.fc) {
            this.h(false);
            if (rs.k.e.a()) {
                this.a.g();
            }
        } else {
            this.ad();
            this.bH();
        }
        if ((bL += bM) >= 100) {
            bM = -1;
        } else if (bL <= 1) {
            bM = 1;
        }
        this.oc = 0;
    }

    private boolean i(String string) {
        if (string == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.kA; ++i2) {
            if (!string.equalsIgnoreCase(this.mT[i2])) continue;
            return true;
        }
        return string.equalsIgnoreCase(Client.eR.aZ);
    }

    private static String r(int n2, int n3) {
        int n4 = n2 - n3;
        if (n4 < -9) {
            return "@red@";
        }
        if (n4 < -6) {
            return "@or3@";
        }
        if (n4 < -3) {
            return "@or2@";
        }
        if (n4 < 0) {
            return "@or1@";
        }
        if (n4 > 9) {
            return "@gre@";
        }
        if (n4 > 6) {
            return "@gr3@";
        }
        if (n4 > 3) {
            return "@gr2@";
        }
        if (n4 > 0) {
            return "@gr1@";
        }
        return "@yel@";
    }

    private void F(int n2) {
        rs.v.a.m = n2;
    }

    public String h(int n2, int n3) {
        return rs.v.a.f() + "index" + n2 + "/" + (String)(n3 != -1 ? n3 + ".gz" : "");
    }

    public static String e(String string) {
        File file = new File(string);
        file.getName();
        int n2 = file.getName().lastIndexOf(46);
        if (0 < n2 && n2 <= file.getName().length() - 2) {
            return file.getName().substring(0, n2);
        }
        return "";
    }

    public void m(int n2) {
        if (!rs.f.a.d.booleanValue()) {
            return;
        }
        System.out.println("[Cache Repacking] Started repacking index " + n2 + ".");
        int n3 = new File(this.h(n2, -1)).listFiles().length;
        File[] fileArray = new File(this.h(n2, -1)).listFiles();
        int n4 = 0;
        try {
            for (int i2 = 0; i2 < n3; ++i2) {
                if (fileArray[i2].getName().contains(".jar")) continue;
                System.out.println("Packing: " + fileArray[i2].toString());
                String string = Client.e(fileArray[i2].toString());
                int n5 = Integer.parseInt(Client.e(fileArray[i2].toString()));
                byte[] byArray = this.i(n2, n5);
                boolean bl = false;
                if (n2 != 1 || rs.f.a.d.booleanValue()) {
                    // empty if block
                }
                if (bl) continue;
                if (byArray != null && byArray.length > 0) {
                    if (n2 == 1) {
                        File file;
                        File file2 = new File(rs.v.a.b() + "raws/" + n5 + ".dat");
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if ((file = new File(rs.v.a.b() + "raws/" + n5)).exists()) {
                            file.delete();
                        }
                    }
                    ++n4;
                    Client.ew.b.a()[n2].a(byArray.length, byArray, n5);
                    continue;
                }
                System.out.println("[Cache] Unable to locate index #" + n5 + ".");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        String string = "unknown";
        if (n2 == 1) {
            string = "models";
        }
        if (n2 == 2) {
            string = "animations";
        }
        if (n2 == 3) {
            string = "sounds";
        }
        if (n2 == 4) {
            string = "maps";
        }
        if (n4 > 0) {
            System.out.println("[Cache] Repacked index #" + n2 + " (" + string + ") (Files: " + n4 + ")");
        }
    }

    public byte[] i(int n2, int n3) {
        try {
            if (this.h(n2, n3).length() <= 0 || this.h(n2, n3) == null) {
                return null;
            }
            File file = new File(this.h(n2, n3));
            byte[] byArray = new byte[(int)file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(byArray);
            fileInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void h(long l2) {
        try {
            int n2;
            if (l2 == 0L) {
                return;
            }
            if (this.jD >= 100) {
                this.a("Your ignore list is full. Max of 100 hit", 0, "");
                return;
            }
            String string = o_0.c(o_0.a(l2));
            for (n2 = 0; n2 < this.jD; ++n2) {
                if (this.kP[n2] != l2) continue;
                this.a(string + " is already on your ignore list", 0, "");
                return;
            }
            for (n2 = 0; n2 < this.kA; ++n2) {
                if (this.lg[n2] != l2) continue;
                this.a("Please remove " + string + " from your friend list first", 0, "");
                return;
            }
            this.kP[this.jD++] = l2;
            fb = true;
            fv.a(133);
            fv.a(l2);
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("45688, " + l2 + ", 4, " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    private void bI() {
        for (int i2 = -1; i2 < this.ku; ++i2) {
            int n2 = i2 == -1 ? 2047 : this.kv[i2];
            rs.a.k k2 = do[n2];
            if (k2 == null) continue;
            this.b(k2);
        }
    }

    private void bJ() {
        if (ee == 2) {
            n_0 n_02 = (n_0)this.nL.b();
            while (n_02 != null) {
                if (n_02.g > 0) {
                    --n_02.g;
                }
                if (n_02.g == 0) {
                    if (n_02.l < 0 || rs.x.a(n_02.l, n_02.n)) {
                        this.a(n_02.k, n_02.h, n_02.m, n_02.n, n_02.j, n_02.i, n_02.l);
                        n_02.b();
                    }
                } else {
                    if (n_02.o > 0) {
                        --n_02.o;
                    }
                    if (n_02.o == 0 && n_02.j >= 1 && n_02.k >= 1 && n_02.j <= 102 && n_02.k <= 102 && (n_02.a < 0 || rs.x.a(n_02.a, n_02.f))) {
                        this.a(n_02.k, n_02.h, n_02.b, n_02.f, n_02.j, n_02.i, n_02.a);
                        n_02.o = -1;
                        if (n_02.a == n_02.l && n_02.l == -1) {
                            n_02.b();
                        } else if (n_02.a == n_02.l && n_02.b == n_02.m && n_02.f == n_02.n) {
                            n_02.b();
                        }
                    }
                }
                n_02 = (n_0)this.nL.d();
            }
        }
    }

    private void bK() {
        int n2;
        int n3;
        int n4 = gj.a("Choose option");
        for (n3 = 0; n3 < this.eV; ++n3) {
            n2 = gj.a(this.fx[n3]);
            if (n2 <= n4) continue;
            n4 = n2;
        }
        n4 += 8;
        n3 = 15 * this.eV + 21;
        if (this.hV > 0 && this.hW > 0 && this.hV < ai && this.hW < ah) {
            int n5;
            n2 = this.hV - n4 / 2;
            if (n2 + n4 > ai - 4) {
                n2 = ai - 4 - n4;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if ((n5 = this.hW - 0) + n3 > ah - 6) {
                n5 = ah - 6 - n3;
            }
            if (n5 < 0) {
                n5 = 0;
            }
            dj = true;
            this.lc = n2;
            this.ld = n5;
            for (int i2 = 0; i2 < this.eV; ++i2) {
                if (this.eI[i2] != 516) continue;
                int n6 = this.eF[i2];
                int n7 = this.eG[i2];
                this.dF.b(n7 - 4, n6 - 4);
                rs.v_0.q = true;
            }
            this.dI = n4;
            this.dJ = 15 * this.eV + 22;
            MenuOpened menuOpened = new MenuOpened();
            this.p.post(menuOpened);
        }
    }

    private void c(rs.x.e e2) {
        e2.J();
        int n2 = e2.k(1);
        if (rs.f.a.f.booleanValue()) {
            cx.add("\t-> Update: " + n2);
        }
        if (n2 == 0) {
            return;
        }
        int n3 = e2.k(2);
        if (rs.f.a.d.booleanValue()) {
            cx.add("\t-> type: " + n3);
        }
        if (n3 == 0) {
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> Set entitiesAwaitingUpdate to self");
            }
            this.kx[this.kw++] = 2047;
            return;
        }
        if (n3 == 1) {
            int n4 = e2.k(3);
            eR.a(false, n4);
            int n5 = e2.k(1);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> direction=" + n4 + " updateRequired=" + n5);
            }
            if (n5 == 1) {
                this.kx[this.kw++] = 2047;
            }
            return;
        }
        if (n3 == 2) {
            int n6 = e2.k(3);
            eR.a(true, n6);
            int n7 = e2.k(3);
            eR.a(true, n7);
            int n8 = e2.k(1);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> firstDirection=" + n6 + " secondDirection=" + n7 + " updateRequired=" + n8);
            }
            if (n8 == 1) {
                this.kx[this.kw++] = 2047;
            }
            return;
        }
        if (n3 == 3) {
            dw = e2.k(2);
            int n9 = e2.k(1);
            int n10 = e2.k(1);
            if (n10 == 1) {
                this.kx[this.kw++] = 2047;
            }
            int n11 = e2.k(7);
            int n12 = e2.k(7);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> teleport=" + n9 + " updateRequired=" + n10 + " y=" + n11 + " x=" + n12);
            }
            eR.a(n12, n11, true);
        }
    }

    private void bL() {
        this.jK = false;
        while (this.lj) {
            this.jK = false;
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
        this.ll = null;
        this.lm = null;
        this.nw = null;
        this.jU = null;
        this.jV = null;
        this.jW = null;
        this.jX = null;
        this.nP = null;
        this.nQ = null;
        this.jI = null;
        this.jJ = null;
        this.nV = null;
        this.nW = null;
    }

    public boolean j(int n2, int n3) {
        if (rs.l.b.a.a()) {
            return false;
        }
        if (n3 == 56998 || n3 == 32019) {
            this.j(n2, 57016);
        }
        boolean bl = false;
        rs.n.e e2 = rs.n.e.H[n3];
        for (int i2 = 0; i2 < e2.al.length && e2.al[i2] != -1; ++i2) {
            boolean bl2;
            int n4;
            rs.n.e e3 = rs.n.e.H[e2.al[i2]];
            if (e3.aI == 1) {
                bl |= this.j(n2, e3.aw);
            }
            if (e3.aI != 6 || e3.aD == -1 && e3.aE == -1 || (n4 = (bl2 = this.b(e3)) ? e3.aE : e3.aD) == -1) continue;
            rs.d.a a2 = rs.d.a.a[n4];
            if (a2.b()) {
                ++e3.ar;
                int n5 = a2.c();
                e3.F -= n5 + 1;
                if (e3.ar >= n5) {
                    e3.ar -= a2.h;
                    if (e3.ar < 0 || e3.ar >= a2.d) {
                        e3.ar = 0;
                    }
                }
                bl = true;
                continue;
            }
            e3.F += n2;
            while (e3.F > a2.a(e3.ar)) {
                e3.F -= a2.a(e3.ar) + 1;
                ++e3.ar;
                if (e3.ar >= a2.d) {
                    e3.ar -= a2.h;
                    if (e3.ar < 0 || e3.ar >= a2.d) {
                        e3.ar = 0;
                    }
                }
                bl = true;
            }
        }
        return bl;
    }

    public int U() {
        int n2 = 3;
        if (this.cR < 310) {
            int n3;
            int n4;
            int n5 = cJ >> 7;
            int n6 = cL >> 7;
            int n7 = Client.eR.ac >> 7;
            int n8 = Client.eR.ad >> 7;
            if (dw < 0 || dw >= this.gc.length) {
                System.out.println("Prevented crash C 1.0");
                return n2;
            }
            if (n5 < 0 || n5 >= this.gc[dw].length) {
                System.out.println("Prevented crash C 1.1");
                return n2;
            }
            if (n6 < 0 || n6 >= this.gc[dw][n5].length) {
                return dw;
            }
            if ((this.gc[dw][n5][n6] & 4) != 0) {
                n2 = dw;
            }
            if ((n4 = n7 > n5 ? n7 - n5 : n5 - n7) > (n3 = n8 > n6 ? n8 - n6 : n6 - n8)) {
                int n9 = n3 * 65536 / n4;
                int n10 = 32768;
                while (n5 != n7) {
                    if (n5 < n7) {
                        ++n5;
                    } else if (n5 > n7) {
                        --n5;
                    }
                    if ((this.gc[dw][n5][n6] & 4) != 0) {
                        n2 = dw;
                    }
                    if ((n10 += n9) < 65536) continue;
                    n10 -= 65536;
                    if (n6 < n8) {
                        ++n6;
                    } else if (n6 > n8) {
                        --n6;
                    }
                    if ((this.gc[dw][n5][n6] & 4) == 0) continue;
                    n2 = dw;
                }
            } else {
                int n11 = n4 * 65536 / n3;
                int n12 = 32768;
                while (n6 != n8) {
                    if (n6 < n8) {
                        ++n6;
                    } else if (n6 > n8) {
                        --n6;
                    }
                    if ((this.gc[dw][n5][n6] & 4) != 0) {
                        n2 = dw;
                    }
                    if ((n12 += n11) < 65536) continue;
                    n12 -= 65536;
                    if (n5 < n7) {
                        ++n5;
                    } else if (n5 > n7) {
                        --n5;
                    }
                    if ((this.gc[dw][n5][n6] & 4) == 0) continue;
                    n2 = dw;
                }
            }
        }
        if ((this.gc[dw][Client.eR.ac >> 7][Client.eR.ad >> 7] & 4) != 0) {
            n2 = dw;
        }
        return n2;
    }

    public int e(int n2, int n3, int n4) {
        int n5 = n2 >> 7;
        int n6 = n3 >> 7;
        if (n5 >= 0 && n6 >= 0 && n5 < 104 && n6 < 104) {
            int[][][] nArray = this.fC;
            int n7 = n2 & 0x7F;
            int n8 = n3 & 0x7F;
            int n9 = n7 * nArray[n4][n5 + 1][n6] + (128 - n7) * nArray[n4][n5][n6] >> 7;
            int n10 = nArray[n4][n5][n6 + 1] * (128 - n7) + n7 * nArray[n4][n5 + 1][n6 + 1] >> 7;
            return (128 - n8) * n9 + n8 * n10 >> 7;
        }
        return 0;
    }

    public rs.runelite.a.i f(int n2, int n3, int n4) {
        if (n2 >= 128 && n3 >= 128 && n2 <= 13056 && n3 <= 13056) {
            n2 -= cJ;
            n3 -= cL;
            n4 -= cK;
            int n5 = this.cS;
            int n6 = this.cR;
            int n7 = rs.a.h.bA[n6];
            int n8 = rs.a.h.bB[n6];
            int n9 = rs.a.h.bA[n5];
            int n10 = rs.a.h.bB[n5];
            int n11 = n10 * n2 + n3 * n9 >> 16;
            n3 = n10 * n3 - n9 * n2 >> 16;
            n2 = n11;
            int n12 = n8 * n4 - n3 * n7 >> 16;
            if ((n3 = n4 * n7 + n3 * n8 >> 16) >= 50) {
                return new rs.runelite.a.i(e_0.s + (n2 << 9) / n3, e_0.t + (n12 << 9) / n3);
            }
        }
        return null;
    }

    public Polygon a(rs.runelite.a.f f2, int n2) {
        int n3 = f2.b() - n2 * 128 / 2;
        int n4 = f2.c() - n2 * 128 / 2;
        int n5 = f2.b() + n2 * 128 / 2;
        int n6 = f2.c() + n2 * 128 / 2;
        byte[][][] byArray = this.gc;
        int n7 = f2.d();
        int n8 = f2.e();
        if (n7 < 0 || n8 < 0 || n7 >= 104 || n8 >= 104) {
            return null;
        }
        int n9 = dw;
        if (dw < 3 && (byArray[1][n7][n8] & 2) == 2) {
            n9 = dw + 1;
        }
        int n10 = this.e(n3, n4, n9);
        int n11 = this.e(n5, n4, n9);
        int n12 = this.e(n5, n6, n9);
        int n13 = this.e(n3, n6, n9);
        rs.runelite.a.i i2 = this.f(n3, n4, n10);
        rs.runelite.a.i i3 = this.f(n5, n4, n11);
        rs.runelite.a.i i4 = this.f(n5, n6, n12);
        rs.runelite.a.i i5 = this.f(n3, n6, n13);
        if (i2 == null || i3 == null || i4 == null || i5 == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(i2.a(), i2.b());
        polygon.addPoint(i3.a(), i3.b());
        polygon.addPoint(i4.a(), i4.b());
        polygon.addPoint(i5.a(), i5.b());
        return polygon;
    }

    public int V() {
        int n2 = this.c(dw, cL, cJ);
        if (n2 - cK < 800 && (this.gc[dw][cJ >> 7][cL >> 7] & 4) != 0) {
            return dw;
        }
        return 3;
    }

    private void i(long l2) {
        try {
            if (l2 == 0L) {
                return;
            }
            for (int i2 = 0; i2 < this.jD; ++i2) {
                if (this.kP[i2] != l2) continue;
                --this.jD;
                fb = true;
                System.arraycopy(this.kP, i2 + 1, this.kP, i2, this.jD - i2);
                fv.a(74);
                fv.a(l2);
                return;
            }
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("47229, 3, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public static void n(int n2) {
        fb = true;
        fL = n2;
        eM = true;
    }

    @Override
    public String getParameter(String string) {
        if (rs.v.a.h != null) {
            return rs.v.a.h.getParameter(string);
        }
        return null;
    }

    private void a(boolean bl, int n2) {
        rs.v.a.k = n2;
        if (bl) {
            rs.v.a.j = "voladjust";
        }
    }

    public int a(rs.n.e e2, int n2) {
        if (e2.X == null || n2 >= e2.X.length) {
            return -2;
        }
        try {
            int[] nArray = e2.X[n2];
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                int n6;
                int n7;
                rs.n.e e3;
                int n8 = nArray[n4++];
                int n9 = 0;
                int n10 = 0;
                if (n8 == 0) {
                    return n3;
                }
                if (n8 == 1) {
                    n9 = this.kN[nArray[n4++]];
                }
                if (n8 == 2) {
                    n9 = this.eo[nArray[n4++]];
                }
                if (n8 == 3) {
                    n9 = this.ka[nArray[n4++]];
                }
                if (n8 == 4) {
                    e3 = rs.n.e.H[nArray[n4++]];
                    if ((n7 = nArray[n4++]) == 20987 || n7 >= 0 && n7 < rs.d.k.ad) {
                        for (n6 = 0; n6 < e3.az.length; ++n6) {
                            if (e3.aw == 3214 && (e2.ah == 1151 || e2.ah == 12855 || e2.ah == 1689 || e2.ah == 1829 || e2.ah == 12050)) {
                                if (e3.az[n6] == 6820 || e3.az[n6] == 23112) {
                                    n9 = 100000000;
                                }
                                if (e2.aw == 30306 && e3.az[n6] == 966) {
                                    n9 = 100000000;
                                }
                            }
                            if (e3.az[n6] == n7 + 1) {
                                n9 += e3.ax[n6];
                            }
                            if (n7 == 2417 && (e3.az[n6] == 11792 || e3.az[n6] == 12905)) {
                                n9 += e3.ax[n6];
                            }
                            if (n7 != 2415 || e3.az[n6] != 21033 && e3.az[n6] != 21034 && e3.az[n6] != 21035 && e3.az[n6] != 21036 && e3.az[n6] != 25423 && e3.az[n6] != 25424) continue;
                            n9 += e3.ax[n6];
                        }
                    }
                }
                if (n8 == 5) {
                    n9 = this.dP[nArray[n4++]];
                }
                if (n8 == 6) {
                    n9 = lU[this.eo[nArray[n4++]] - 1];
                }
                if (n8 == 7) {
                    n9 = this.dP[nArray[n4++]] * 100 / 46875;
                }
                if (n8 == 8) {
                    n9 = Client.eR.bc;
                }
                if (n8 == 9) {
                    for (int i2 = 0; i2 < rs.f.e.a; ++i2) {
                        if (!rs.f.e.d[i2]) continue;
                        n9 += this.eo[i2];
                    }
                }
                if (n8 == 10) {
                    e3 = rs.n.e.H[nArray[n4++]];
                    if ((n7 = nArray[n4++] + 1) >= 0 && n7 < rs.d.k.ad) {
                        for (n6 = 0; n6 < e3.az.length; ++n6) {
                            if (n7 == 1388 && e3.az[n6] == 20450) {
                                n9 = 999999999;
                                break;
                            }
                            if (n7 == 1388 && e3.az[n6] == 22853) {
                                n9 = 999999999;
                                break;
                            }
                            if (n7 == 1384 && e3.az[n6] == 20691) {
                                n9 = 999999999;
                                break;
                            }
                            if (n7 == 1384 && e3.az[n6] == 22854) {
                                n9 = 999999999;
                                break;
                            }
                            if (n7 == 1384 && e3.az[n6] == 20487) {
                                n9 = 999999999;
                                break;
                            }
                            if (n7 == 1384 && e3.az[n6] == 20811) {
                                n9 = 999999999;
                                break;
                            }
                            if (e3.az[n6] != n7) continue;
                            n9 = 999999999;
                            break;
                        }
                    }
                }
                if (n8 == 11) {
                    n9 = this.eY;
                }
                if (n8 == 12) {
                    n9 = this.ko;
                }
                if (n8 == 13) {
                    int n11;
                    int n12 = n9 = ((n11 = this.dP[nArray[n4++]]) & 1 << (n7 = nArray[n4++])) == 0 ? 0 : 1;
                }
                if (n8 == 14) {
                    int n13 = nArray[n4++];
                    y y2 = rs.d.y.a[n13];
                    n6 = y2.b;
                    int n14 = y2.c;
                    int n15 = y2.d;
                    int n16 = fQ[n15 - n14];
                    n9 = this.dP[n6] >> n14 & n16;
                }
                if (n8 == 15) {
                    n10 = 1;
                }
                if (n8 == 16) {
                    n10 = 2;
                }
                if (n8 == 17) {
                    n10 = 3;
                }
                if (n8 == 18) {
                    n9 = (Client.eR.ac >> 7) + eh;
                }
                if (n8 == 19) {
                    n9 = (Client.eR.ad >> 7) + ei;
                }
                if (n8 == 20) {
                    n9 = nArray[n4++];
                }
                if (n10 == 0) {
                    if (n5 == 0) {
                        n3 += n9;
                    }
                    if (n5 == 1) {
                        n3 -= n9;
                    }
                    if (n5 == 2 && n9 != 0) {
                        n3 /= n9;
                    }
                    if (n5 == 3) {
                        n3 *= n9;
                    }
                    n5 = 0;
                    continue;
                }
                n5 = n10;
            }
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public void W() {
        int n2 = ah - 504;
        if (rs.f.a.ai == a.c.a) {
            n2 = 0;
        }
        if (rs.c_0.hP >= 5 && rs.c_0.hP <= 61 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "View All";
            this.eI[1] = 999;
            this.eV = 2;
        } else if (rs.c_0.hP >= 71 && rs.c_0.hP <= 127 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Game chat: " + (this.gx == rs.i.a.z ? "@cya@Filtered" : "@gre@On");
            this.eI[1] = 1604;
            this.fx[2] = "View game chat";
            this.eI[2] = 1603;
            this.eV = 3;
        } else if (rs.c_0.hP >= 137 && rs.c_0.hP <= 193 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Off yell chat";
            this.eI[1] = 1602;
            this.fx[2] = "On yell chat";
            this.eI[2] = 1601;
            this.fx[3] = "View yell chat";
            this.eI[3] = 1600;
            this.eV = 4;
        } else if (rs.c_0.hP >= 203 && rs.c_0.hP <= 259 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Hide public";
            this.eI[1] = 997;
            this.fx[2] = "Off public";
            this.eI[2] = 996;
            this.fx[3] = "Friends public";
            this.eI[3] = 995;
            this.fx[4] = "On public";
            this.eI[4] = 994;
            this.fx[5] = "View public";
            this.eI[5] = 993;
            this.eV = 6;
        } else if (rs.c_0.hP >= 269 && rs.c_0.hP <= 325 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Off private";
            this.eI[1] = 992;
            this.fx[2] = "Friends private";
            this.eI[2] = 991;
            this.fx[3] = "On private";
            this.eI[3] = 990;
            this.fx[4] = "View private";
            this.eI[4] = 989;
            this.fx[5] = "Clear history";
            this.eI[5] = 1425;
            this.eV = 6;
        } else if (rs.c_0.hP >= 335 && rs.c_0.hP <= 391 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Off clan chat";
            this.eI[1] = 1003;
            this.fx[2] = "On clan chat";
            this.eI[2] = 1001;
            this.fx[3] = "View clan chat";
            this.eI[3] = 1000;
            this.eV = 4;
        } else if (rs.c_0.hP >= 400 && rs.c_0.hP <= 456 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "Off trade";
            this.eI[1] = 987;
            this.fx[2] = "Friends trade";
            this.eI[2] = 986;
            this.fx[3] = "On trade";
            this.eI[3] = 985;
            this.fx[4] = "View trade";
            this.eI[4] = 984;
            this.eV = 5;
        } else if (rs.c_0.hP >= 460 && rs.c_0.hP <= 516 && rs.c_0.hQ >= 482 + n2 && rs.c_0.hQ <= 503 + n2) {
            this.fx[1] = "News: " + (this.gv == rs.i.a.z ? "@cya@Filtered" : "@gre@On");
            this.eI[1] = 1007;
            this.fx[2] = "View news chat";
            this.eI[2] = 1006;
            this.eV = 3;
        }
    }

    private void bM() {
        if (this.eV < 2 && this.gr == 0 && this.eW == 0) {
            return;
        }
        if (this.aH() >= 0) {
            this.r.a();
            MenuHover.get().setRow(this.aH());
            MenuHover.get().setMenuId(this.aI());
            MenuHover.get().setMenuCmd1(this.eJ[this.aH()]);
            MenuHover.get().setMenuCmd2(this.eF[this.aH()]);
            MenuHover.get().setMenuCmd3(this.eG[this.aH()]);
            MenuHover.get().setMenuCmd4(this.eH[this.aH()]);
            this.p.post(MenuHover.SINGLETON);
        }
    }

    public void X() {
        Object object;
        int n2;
        int n3;
        if (br == 55761 && cH == 18559) {
            if (this.jo.endsWith("\n ")) {
                this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo.substring(0, this.jo.length() - 2) + " ");
            } else {
                this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo);
            }
            return;
        }
        if (this.eV < 2 && this.gr == 0 && this.eW == 0) {
            return;
        }
        this.bM();
        Object object2 = this.gr == 1 && this.eV < 2 ? "Use " + this.oN + " with..." : (this.eW == 1 && this.eV < 2 ? this.nn + "..." : this.fx[this.eV - 1]);
        if (object2 != null && cH == 61000 && ((String)object2).contains("leaderboard")) {
            n3 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains("Daily PK")) {
                this.b(n2, n3, " <img=16> " + (String)object2 + "\nVarious daily leaderboards\nfor PKing, offering roster rewards!");
            } else {
                this.b(n2, n3, " <img=16> " + (String)object2 + "\nCheck out which players and\nclans are dominating the arena!");
            }
        }
        if (object2 != null && cH == 54100) {
            n3 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains("Select timed task")) {
                this.b(n2, n3, " Monster hunter\nSlay an amount of wildy monsters in 25 mins.\n<item=23132>@or1@@yel@1/35@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select boss hunter task")) {
                this.b(n2, n3, " Boss hunter\nSlay an amount of wildy bosses in 25 mins.\n<item=23132>@or1@@yel@1/10@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select man hunter")) {
                this.b(n2, n3, " Bounty hunter\nKill 3-6 bounty hunter targets in 15 minutes.\nEarn a flat <img=125>@gre@+5@whi@ bonus for each Cursed Bounty kill\n<item=23132>@yel@1/5@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select man slaughter task")) {
                this.b(n2, n3, " Slaughter\nKill as many players as you can in 20 minutes!\n- The higher your killcount, the better your reward!\n- Kills while risking a <item=1484>Cursed orb count as 2 KC.\n- Reaching the kill cap (20) ends the task early.\n<item=23132>@yel@@yel@1/8@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if you kill less than 3!");
            }
        }
        if (object2 != null && cH == 47500 && ((String)object2).contains("View equipment bonuses")) {
            n3 = hQ - 10;
            n2 = hP - 10;
            this.b(n2, n3, " Equipment set bonuses\nDid you know you can also hover\nover items and hold the CTRL key\nto view stats of individual items?");
        }
        if (object2 != null && cH == 60200) {
            n3 = hQ - 10;
            n2 = hP + 10;
            if (((String)object2).contains("PayPal")) {
                this.b(n2, n3, " Payment method\nPay with credit card, debit\ncard, or with PayPal!");
            } else if (((String)object2).contains("BMT")) {
                this.b(n2, n3, " Payment method\nPay with bitcoins (BitPay)\nor with Paysafe cards!");
            }
        }
        if (object2 != null && cH == 60050 && ((String)object2).contains("Vote for us")) {
            n3 = hQ - 10;
            n2 = hP - 10;
            this.b(n2, n3, " " + (String)object2 + "\nand receive @yel@+2 vote points!\nType @yel@::claim@whi@ in-game after voting");
        }
        if (object2 != null && cH == 60600) {
            n3 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains(" 10,000,000")) {
                this.b(n2, n3, " @whi@Once the entire server has spent\n@yel@10,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Goodie bag.");
            } else if (((String)object2).contains("15,000,000")) {
                this.b(n2, n3, " @whi@Once the entire server has spent\n@yel@15,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery box.");
            } else if (((String)object2).contains("20,000,000")) {
                if (rs.f.a.ai == a.c.a) {
                    n2 -= 100;
                }
                this.b(n2, n3, " @whi@Once the entire server has spent\n@yel@20,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery chest.");
            } else if (((String)object2).contains("Donator promotional shop")) {
                this.b(n2, n3, " Event lottery\nEnter for a chance to win\nrares from previous events!");
            } else if (((String)object2).contains("Reset event items")) {
                this.b(n2, n3, " Reset exchange\nOnce you've earned all of the\nitems in the chest, you can reset\nthe stock and purchase more rolls!");
            }
        }
        if (br > 0 && rs.n.e.l(br) != null && rs.n.e.l((int)Client.br).bx) {
            if (rs.n.e.l((int)Client.br).by != null) {
                this.a(hP - 10, hQ - 10, " " + rs.n.e.l((int)Client.br).by);
            } else {
                this.a(hP - 10, hQ - 10, " " + (String)object2);
            }
        } else if (this.ef > 0 && rs.n.e.l(this.ef) != null && rs.n.e.l((int)this.ef).bx) {
            Object object3 = rs.n.e.l((int)this.ef).by == null ? object2 : rs.n.e.l((int)this.ef).by;
            this.a(hP - 10, hQ - 10, " " + (String)object3);
        }
        if (object2 != null && cH == 61150) {
            int n4 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains("Enter bloodcore lottery")) {
                this.b(n2, n4, " Entering will also grant you:\n- 1 hour of blood lust @yel@(non-stackable)\n- 1 hour of +5% DR bonus @yel@(time stackable)\\n- 1 hour of +25% GP from PvM @yel@(time stackable)");
            }
        }
        if (object2 != null && (((String)object2).contains("@mag@Polymorphism") || ((String)object2).contains("@mag@Punch") || ((String)object2).contains("@mag@catch"))) {
            int n5 = hQ - 10;
            n2 = hP - 10;
            this.b(n2, n5, " @whi@" + (String)object2);
        }
        if (object2 != null && cH == 45900) {
            int n6 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains("Toggle gold auto")) {
                this.b(n2, n6, " @whi@Broken items will automatically       \nrepair on death, using gold\nstored in the coffer.");
            } else if (((String)object2).contains("Toggle shard auto")) {
                this.b(n2, n6, " @whi@Broken items will automatically        \nrepair on death, using shards\nstored in the coffer.");
            }
        }
        if (object2 != null && ((String)object2).contains("@cya@Blood fountain")) {
            this.a(hP - 10, hQ - 10, " Blood fountain", "BLOOD_FOUNTAIN");
        } else if (object2 != null && ((String)object2).contains("Reward exchange @cya@")) {
            this.a(hP - 15, hQ - 10, " " + ((String)object2).split("@cya@")[1], "WORLD_EVENT_GUIDE");
        } else if (object2 != null && ((String)object2).contains("@yel@Mandrith")) {
            this.a(hP - 10, hQ - 10, " Statuettes and aritfacts", "MANDRITH");
        } else if (object2 != null && ((String)object2).contains("@yel@Blood slayer master")) {
            this.a(hP - 10, hQ - 10, " Blood slayer master", "BLOOD_SLAYER");
        } else if (object2 != null && ((String)object2).contains("@cya@Magic chest")) {
            this.a(hP - 10, hQ - 10, " Enchanting chest", "ENCHANTING_CHEST");
        } else if (object2 != null && ((String)object2).contains("@yel@Pet-keeper")) {
            this.a(hP - 10, hQ - 10, " Pet fusing", "PET_FUSING");
        } else if (object2 != null && !((String)object2).contains("@cya@Summer oasis")) {
            this.jv = 0;
        }
        if (object2 != null && cH == 19600) {
            int n7 = hQ - 10;
            n2 = hP - 10;
            if (((String)object2).contains("Invite member")) {
                this.b(n2, n7, " Invite a member ");
            }
            if (((String)object2).contains("Remove member")) {
                this.b(n2, n7, " Remove member ");
            }
            if (((String)object2).contains("Refresh")) {
                this.b(n2, n7, " Refresh ");
            }
            if (((String)object2).contains("Re-invite")) {
                this.b(n2 + 50, n7, " Reload last party  ");
            }
            if (((String)object2).contains("Start raid")) {
                this.b(n2, n7, " Start raid ");
            }
            if (((String)object2).contains("Leave/disband party")) {
                this.b(n2, n7, " Leave party ");
            }
            if (((String)object2).contains("Adept difficulty")) {
                this.b(n2, n7, " Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage");
            }
            if (((String)object2).contains("Expert difficulty")) {
                this.b(n2, n7, " Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage");
            }
            if (((String)object2).contains("Master difficulty")) {
                this.b(n2, n7, " Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage");
            }
            if (((String)object2).contains("Grandmaster difficulty")) {
                this.b(n2, n7, " Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage");
            }
        }
        if (object2 != null && cH == ad_0.bI && !((String)object2).toLowerCase().contains("close window") && !((String)object2).toLowerCase().contains("@lre@")) {
            this.b(hP, hQ - 10, " @gre@" + (String)object2 + " ");
        }
        if (this.eV > 1) {
            int n8 = this.eI[this.eV - 1];
            if (n8 == 1125 || n8 == 632 && cH != -1 || n8 == 78 || n8 == 867 || n8 == 431 || n8 == 53 || n8 == 291 || n8 == 300 || n8 == 291 || n8 == 315 && cH == 22952) {
                n2 = this.eJ[this.eV - 1];
                if (cH == 22952) {
                    if (((String)object2).contains("Select item")) {
                        this.a(n2, (String)object2, false);
                    }
                } else {
                    this.a(n2, (String)object2, false);
                }
            }
            if (n8 == 447 || n8 == 847 || n8 == 493 || n8 == 454 || n8 == 74 || n8 == 539) {
                n2 = this.eJ[this.eV - 1];
                object = " " + rs.d.k.f((int)n2).w;
                this.a(n2, (String)object2, true);
            }
        }
        if (object2 != null && cH == 64272 && (((String)object2).contains("Collect reward") || ((String)object2).contains("Collect all rewards"))) {
            this.b(hP - 10, hQ - 10, " " + (String)object2 + "  ");
        } else if (object2 != null && ((String)object2).contains("@lre@") && !((String)object2).contains("Take") && rs.f.a.aC && ag && !rs.s.l.c.b) {
            boolean bl = false;
            for (n2 = 0; n2 < this.fx.length; ++n2) {
                if (this.fx[n2] == null || !this.fx[n2].contains("Drop") && !this.fx[n2].contains("Destroy") && !this.fx[n2].contains("Release") || cH == 23000) continue;
                bl = true;
            }
            if (bl) {
                String[] stringArray = this.fx[this.eV - 1].split(" ");
                stringArray[0] = "Drop";
                object = "";
                for (String string : stringArray) {
                    object = (String)object + string + " ";
                }
                object2 = object = ((String)object).trim();
            }
        }
        if (this.eV > 2) {
            object2 = (String)object2 + "@whi@ / " + (this.eV - 2) + " more options";
        }
        this.gn.b((String)object2, 4 + (!Client.ai() ? 4 : 0), 15 + (!Client.ai() ? 4 : 0), 0xFFFFFF, 0);
    }

    public void a(int n2, String string, boolean bl) {
        boolean bl2;
        if (n2 < 0 || n2 > rs.d.k.a) {
            return;
        }
        rs.d.k k2 = rs.d.k.f(n2);
        if (k2 == null) {
            return;
        }
        boolean bl3 = bl2 = ed == 197;
        if (rs.s.s.b.c && bl2 && cH != 15106) {
            return;
        }
        if (k2.F > 0 && k2.p == 799) {
            n2 = k2.F;
            k2 = rs.d.k.f(k2.F);
        }
        String string2 = " " + rs.d.w.a(n2, rs.d.k.f((int)n2).w);
        if (rs.s.s.b.k && rs.t.a.g.a.a_(n2)) {
            string2 = string2 + " <img=370>";
        }
        Object object = string2;
        if (!bl || rs.s.s.b.h) {
            Object object2 = object = bl ? rs.q.a(string2) : rs.d.m.a(string2, n2);
        }
        if (bl && object == null && rs.s.s.b.h) {
            object = rs.d.m.a(string2, n2);
        }
        boolean bl4 = false;
        boolean bl5 = false;
        if (cH == 23000 && !rs.s.s.b.f) {
            bl5 = true;
        }
        if (cH == 15106 && !rs.s.s.b.g) {
            bl5 = true;
        }
        if (bl && cH == -1 && !rs.s.s.b.h) {
            bl5 = true;
        }
        if (bl && cH == -1 && k2 != null && k2.ax) {
            bl5 = true;
        }
        if (bl2 && rs.s.s.b.d) {
            bl5 = true;
        }
        if (bl && object == null && !bl5) {
            bl4 = true;
        }
        if (bl5) {
            object = string2;
        }
        if (bl && cH != 15106 && object == null) {
            return;
        }
        if (!rs.s.s.b.b) {
            return;
        }
        if (!rs.s.s.b.i && bl && cH != 15106) {
            return;
        }
        if (object == null) {
            object = string2;
        }
        boolean bl6 = false;
        if (!bl || cH == 15106 || rs.s.s.b.i) {
            this.A(n2);
            if (this.jq == n2) {
                bl6 = true;
                if (!ch) {
                    object = (String)object + "\nHold @yel@CTRL@whi@ to view stats";
                }
            }
        }
        if (bl && bl4 && !bl6) {
            return;
        }
        if (string != null) {
            if (string.contains("Select tab")) {
                object = " @whi@Select tab @lre@" + k2.w;
                bl6 = false;
            }
            if (string.contains("<img=83> Info")) {
                object = " <img=83> Info" + (String)object;
                bl6 = false;
            }
        }
        if (bl && bl4 && !bl6) {
            return;
        }
        if (ch && bl6) {
            Object object3 = this.jp.get(this.jq);
            if (object3 == null) {
                if (this.js != this.jq || System.currentTimeMillis() - this.jr >= 1000L) {
                    this.js = this.jq;
                    ap = "::equipstr " + this.js;
                    this.jr = System.currentTimeMillis();
                }
                object3 = "Loading, please wait..";
                this.b(0, 0, (String)object + "\n" + (String)object3);
            } else {
                String[] stringArray = this.jp.get(this.jq).split(" ");
                object3 = "                  <u=16748608>@lre@Attack@whi@</u>      <u=16748608>@lre@Defence@whi@</u>  \n<col=FFBD5C>Stab:\n<col=FFBD5C>Slash:\n<col=FFBD5C>Crush:\n<col=FFBD5C>Magic:\n<col=FFBD5C>Range:\n\n<u=16748608>@lre@Other Bonuses</u> \n<col=FFBD5C>Strength:@whi@ " + stringArray[11].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Prayer:@whi@ " + stringArray[12].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Range strength:@whi@ " + stringArray[13].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Magic damage:@whi@ +" + stringArray[14].replace("@g3re@ ", " @gre@").replaceAll("@red@", " @red@");
                this.a(0, 0, string2 + "\n" + (String)object3, stringArray, false);
            }
        } else if (!bl || object != null) {
            this.b(0, 0, (String)object);
        }
    }

    public boolean k(int n2, int n3) {
        int n4 = n2 >> 6;
        int n5 = n3 >> 6;
        int n6 = n4 * 256 + n5;
        if (n6 == 11601) {
            return false;
        }
        if (n6 == 12946 || n6 == 13202) {
            return false;
        }
        if (n6 == 11877) {
            return true;
        }
        if (n6 == 9811) {
            return true;
        }
        if (n6 == 11322) {
            return true;
        }
        if (n6 == 13136 || n6 == 13393 || n6 == 13394 || n6 == 13138 || n6 == 13139 || n6 == 13395 || n6 == 13396 || n6 == 13140 || n6 == 13141 || n6 == 13397 || n6 == 12889) {
            return true;
        }
        if (n6 == 12346 || n6 == 12602) {
            return false;
        }
        if (n6 == 12605) {
            return false;
        }
        if (n6 == 12861 && n2 <= 3215) {
            return false;
        }
        if (n2 >= 3007 && n2 <= 3047 && n3 >= 3856 && n3 <= 3903) {
            return true;
        }
        if (n2 >= 2945 && n2 <= 2959 && n3 >= 3813 && n3 <= 3827) {
            return true;
        }
        if (n2 >= 3331 && n2 <= 3373 && n3 <= 3854) {
            return false;
        }
        if (n6 == 12347) {
            return false;
        }
        if (n6 == 12603 && n2 <= 3150) {
            return false;
        }
        if (n6 == 6810) {
            return true;
        }
        if (n6 == 13131 || n6 == 13387) {
            return true;
        }
        if (n2 >= 2744 && n2 <= 2993 && n3 >= 2872 && n3 <= 2956) {
            return true;
        }
        if (n6 == 11668) {
            return true;
        }
        if (n6 == 12703 || n6 == 12702 || n6 == 12701 || n6 == 12959 || n6 == 12958 || n6 == 12957) {
            return true;
        }
        if (n6 == 9023) {
            return true;
        }
        if (n6 == 11412 || n6 == 11562 || n6 == 9875 || n6 == 11310 || n6 == 11054 || n6 == 11566) {
            return true;
        }
        if (n6 == 9369) {
            return true;
        }
        if (n6 == 9008 || n6 == 9007) {
            return true;
        }
        if (n6 == 13462) {
            return true;
        }
        if (n6 == 9033) {
            return true;
        }
        if (n6 == 10036) {
            return true;
        }
        if (n6 == 9802) {
            return true;
        }
        if (n6 == 14235 || n6 == 13979) {
            return true;
        }
        return n2 >= 1721 && n2 <= 1791 && n3 >= 5123 && n3 <= 5249 || n2 >= 3029 && n2 <= 3393 && n3 >= 3759 && n3 <= 3903 || n2 >= 2250 && n2 <= 2280 && n3 >= 4670 && n3 <= 4720 || n2 >= 3198 && n2 <= 3380 && n3 >= 3904 && n3 <= 3970 || n2 >= 3191 && n2 <= 3326 && n3 >= 3510 && n3 <= 3759 || n2 >= 2987 && n2 <= 3006 && n3 >= 3912 && n3 <= 3937 || n2 >= 2245 && n2 <= 2295 && n3 >= 4675 && n3 <= 4720 || n2 >= 2481 && n2 <= 2563 && n3 >= 10138 && n3 <= 10175 || n2 >= 3006 && n2 <= 3071 && n3 >= 3602 && n3 <= 3710 || n2 >= 3134 && n2 <= 3192 && n3 >= 3519 && n3 <= 3646 || n2 >= 2815 && n2 <= 2966 && n3 >= 5240 && n3 <= 5375 || n2 >= 2840 && n2 <= 2950 && n3 >= 5190 && n3 <= 5230 || n2 >= 3547 && n2 <= 3555 && n3 >= 9690 && n3 <= 9699 || n2 >= 2970 && n2 <= 3000 && n3 >= 4365 && n3 <= 4400 || n3 >= 4423 && n3 <= 4468 && n2 >= 2885 && n2 <= 3934 || n2 >= 3195 && n2 <= 3327 && n3 >= 3520 && n3 <= 3970 || n2 >= 2376 && 5127 >= n3 && n2 <= 2422 && 5168 <= n3 || n2 >= 2374 && n3 >= 5129 && n2 <= 2424 && n3 <= 5168 || n2 >= 2622 && n3 >= 5696 && n2 <= 2573 && n3 <= 5752 || n2 >= 2368 && n3 >= 3072 && n2 <= 2431 && n3 <= 3135 || n2 >= 2365 && n3 >= 9470 && n2 <= 2436 && n3 <= 9532 || n2 >= 2948 && n3 >= 5537 && n2 <= 3071 && n3 <= 5631 || n2 >= 2756 && n3 >= 5537 && n2 <= 2879 && n3 <= 5631 || n2 >= 4159 && n3 >= 5687 && n2 <= 4220 && n3 <= 5733 || n2 >= 3011 && n2 <= 3132 && n3 >= 10052 && n3 <= 10175 && (n3 >= 10066 || n2 >= 3094) || n2 <= 2420 && n2 >= 2337 && n3 <= 3872 && n3 >= 3842;
    }

    public void Y() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl = this.lV == 2;
        int n7 = n6 = !Client.ai() ? 517 : 0;
        if (bl) {
            if (rs.f.a.ai == a.c.a) {
                this.iu.f(2 + n6, 0);
            } else {
                this.H[44].f(ai - 181, 0);
                this.H[45].f(ai - 158, 7);
            }
            this.v.a();
            return;
        }
        int n8 = this.ft + this.oa & 0x7FF;
        int n9 = 48 + Client.eR.ac / 32;
        int n10 = 464 - Client.eR.ad / 32;
        this.aT.a(151, n8, this.fO, 256 + this.fh, this.eq, n10, rs.f.a.ai == a.c.a ? 9 : 7, rs.f.a.ai == a.c.a ? n6 + 54 : ai - 158, 146, n9);
        for (n5 = 0; n5 < this.mz; ++n5) {
            n4 = this.mA[n5] * 4 + 2 - Client.eR.ac / 32;
            int n11 = this.mB[n5] * 4 + 2 - Client.eR.ad / 32;
            n3 = this.mA[n5] + eh;
            n2 = this.mB[n5] + ei;
            if (n3 == 3086 && n2 == 3481 || n3 == 3092 && n2 == 3488 || n3 == 3089 && n2 == 3474 || n3 == 3086 && n2 == 3469 || n3 == 3077 && n2 == 3496 || n3 == 3077 && n2 == 3489 || n3 == 3084 && n2 == 3502) continue;
            this.a(this.no[n5], n4, n11);
        }
        this.a(this.fI, (3094 - eh) * 4 + 2 - Client.eR.ac / 32, (3472 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.fI, (3077 - eh) * 4 + 2 - Client.eR.ac / 32, (3496 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.fG, (3080 - eh) * 4 + 2 - Client.eR.ac / 32, (3492 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.fH, (3108 - eh) * 4 + 2 - Client.eR.ac / 32, (3494 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[109], (3095 - eh) * 4 + 2 - Client.eR.ac / 32, (3506 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[189], (3082 - eh) * 4 + 2 - Client.eR.ac / 32, (3486 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[92], (3083 - eh) * 4 + 2 - Client.eR.ac / 32, (3499 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.fK, (3087 - eh) * 4 + 2 - Client.eR.ac / 32, (3507 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[64], (3086 - eh) * 4 + 2 - Client.eR.ac / 32, (3484 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[5], (4059 - eh) * 4 + 2 - Client.eR.ac / 32, (3373 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[16], (4064 - eh) * 4 + 2 - Client.eR.ac / 32, (3349 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[((rs.l.a.a)rs.l.j.b.b(21)).b()], (4071 - eh) * 4 + 2 - Client.eR.ac / 32, (3367 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[16], (4063 - eh) * 4 + 2 - Client.eR.ac / 32, (3077 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[16], (4069 - eh) * 4 + 2 - Client.eR.ac / 32, (3086 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[16], (4062 - eh) * 4 + 2 - Client.eR.ac / 32, (3094 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[5], (4082 - eh) * 4 + 2 - Client.eR.ac / 32, (3070 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2952 - eh) * 4 + 2 - Client.eR.ac / 32, (2900 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2860 - eh) * 4 + 2 - Client.eR.ac / 32, (2943 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2788 - eh) * 4 + 2 - Client.eR.ac / 32, (2958 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2920 - eh) * 4 + 2 - Client.eR.ac / 32, (2920 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2854 - eh) * 4 + 2 - Client.eR.ac / 32, (2919 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2794 - eh) * 4 + 2 - Client.eR.ac / 32, (2907 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2876 - eh) * 4 + 2 - Client.eR.ac / 32, (2912 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[152], (2928 - eh) * 4 + 2 - Client.eR.ac / 32, (2733 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[118], (2881 - eh) * 4 + 2 - Client.eR.ac / 32, (2926 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[51], (3206 - eh) * 4 + 2 - Client.eR.ac / 32, (9571 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[51], (3220 - eh) * 4 + 2 - Client.eR.ac / 32, (9554 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3226 - eh) * 4 + 2 - Client.eR.ac / 32, (9542 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (3294 - eh) * 4 + 2 - Client.eR.ac / 32, (3858 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (3190 - eh) * 4 + 2 - Client.eR.ac / 32, (3793 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (3317 - eh) * 4 + 2 - Client.eR.ac / 32, (3760 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1505 - eh) * 4 + 2 - Client.eR.ac / 32, (4385 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1506 - eh) * 4 + 2 - Client.eR.ac / 32, (4383 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1532 - eh) * 4 + 2 - Client.eR.ac / 32, (4412 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1534 - eh) * 4 + 2 - Client.eR.ac / 32, (4394 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1529 - eh) * 4 + 2 - Client.eR.ac / 32, (4358 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1504 - eh) * 4 + 2 - Client.eR.ac / 32, (4354 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1481 - eh) * 4 + 2 - Client.eR.ac / 32, (4356 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1475 - eh) * 4 + 2 - Client.eR.ac / 32, (4378 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1479 - eh) * 4 + 2 - Client.eR.ac / 32, (4408 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (1503 - eh) * 4 + 2 - Client.eR.ac / 32, (4406 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[118], (3376 - eh) * 4 + 2 - Client.eR.ac / 32, (3892 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (2950 - eh) * 4 + 2 - Client.eR.ac / 32, (3925 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[182], (3167 - eh) * 4 + 2 - Client.eR.ac / 32, (9572 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3999 - eh) * 4 + 2 - Client.eR.ac / 32, (2501 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (4000 - eh) * 4 + 2 - Client.eR.ac / 32, (2529 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (4000 - eh) * 4 + 2 - Client.eR.ac / 32, (2554 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (3977 - eh) * 4 + 2 - Client.eR.ac / 32, (2543 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[50], (4022 - eh) * 4 + 2 - Client.eR.ac / 32, (2544 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3286 - eh) * 4 + 2 - Client.eR.ac / 32, (3812 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3256 - eh) * 4 + 2 - Client.eR.ac / 32, (9348 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3261 - eh) * 4 + 2 - Client.eR.ac / 32, (9401 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3578 - eh) * 4 + 2 - Client.eR.ac / 32, (9927 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(fE[194], (3475 - eh) * 4 + 2 - Client.eR.ac / 32, (9938 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[5], (3093 - eh) * 4 + 2 - Client.eR.ac / 32, (3510 - ei) * 4 + 2 - Client.eR.ad / 32);
        this.a(this.me[51], (3102 - eh) * 4 + 2 - Client.eR.ac / 32, (3488 - ei) * 4 + 2 - Client.eR.ad / 32);
        if (rs.l.e.f.a.a(this)) {
            this.a(fE[73], (1510 - eh) * 4 + 2 - Client.eR.ac / 32, (4363 - ei) * 4 + 2 - Client.eR.ad / 32);
        }
        for (n5 = 0; n5 < 104; ++n5) {
            for (n4 = 0; n4 < 104; ++n4) {
                rs.h h2 = this.jH[dw][n5][n4];
                if (h2 == null) continue;
                n3 = n5 * 4 + 2 - Client.eR.ac / 32;
                n2 = n4 * 4 + 2 - Client.eR.ad / 32;
                this.a(this.mC, n3, n2);
            }
        }
        for (n5 = 0; n5 < this.cB; ++n5) {
            rs.a.j j2 = this.cA[this.cC[n5]];
            if (j2 == null || !j2.l()) continue;
            rs.d.d d2 = j2.aG;
            if (d2.G != null) {
                d2 = d2.c();
            }
            if (d2 == null || !d2.F || !d2.C) continue;
            n3 = j2.ac / 32 - Client.eR.ac / 32;
            n2 = j2.ad / 32 - Client.eR.ad / 32;
            if (d2.x == 3261L || d2.x == 3262L || d2.x == 6100L || d2.x == 3066L || d2.x == 6748L || d2.x == 6747L || d2.x == 6749L || d2.x == 1951L) {
                this.a(this.mG, n3, n2);
                continue;
            }
            if (d2.x == 5413L || d2.x == 5871L || d2.x == 1901L || d2.x == 1902L || d2.x == 1904L || d2.x == 1905L || d2.x == 6735L || d2.x == 1950L || d2.x == 1931L || d2.x == 1930L) {
                this.a(this.mF, n3, n2);
                continue;
            }
            if (d2.x == 692L) {
                this.a(fE[152], n3, n2);
                continue;
            }
            if (d2.x == 1472L) {
                this.a(fE[248], n3, n2);
                continue;
            }
            if (d2.x == 4704L) {
                this.a(fE[229], n3, n2);
                continue;
            }
            if (d2.x == 5399L) {
                this.a(this.fJ, n3, n2);
                continue;
            }
            if (d2.x == 6730L || d2.x == 6999L || d2.x == 6729L) {
                this.a(this.mH, n3, n2);
                continue;
            }
            if (d2.x == 5328L || d2.x == 8341L || d2.x == 8095L) {
                this.a(this.mI, n3, n2);
                continue;
            }
            if (d2.x == 8085L || d2.x == 8086L || d2.x == 8087L || d2.x == 8150L || d2.x == 8151L) {
                this.a(this.mJ, n3, n2);
                continue;
            }
            if (d2.x >= 6736L && d2.x <= 6739L || d2.x == 7284L || d2.x == 1839L || d2.x >= 727L && d2.x <= 730L || d2.x >= 3682L && d2.x <= 3694L) {
                this.a(this.mK, n3, n2);
                continue;
            }
            if (d2.x == 8495L || d2.x == 3794L || d2.x == 3795L || d2.x == 3796L || d2.x == 3797L || d2.x >= 7072L && d2.x <= 7076L) {
                this.a(this.mL, n3, n2);
                continue;
            }
            if (d2.S > 0) {
                this.a(fE[d2.S], n3, n2);
                continue;
            }
            this.a(this.mD, n3, n2);
        }
        for (n5 = 0; n5 < this.ku; ++n5) {
            rs.a.k k2 = do[this.kv[n5]];
            if (k2 == null || !k2.l() || k2.aC == 25 && !rs.f.a.bp && k2.m == -1 || rs.l.e.f.a.e() && k2.aT != null) continue;
            int n12 = k2.ac / 32 - Client.eR.ac / 32;
            n3 = k2.ad / 32 - Client.eR.ad / 32;
            n2 = 0;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            if (Client.eR.bh < 1 || Client.eR.bh > 4) {
                for (int i2 = 0; i2 < this.ju.length; ++i2) {
                    if (this.ju[i2] == null || !this.ju[i2].equalsIgnoreCase(k2.aZ)) continue;
                    bl3 = true;
                }
                long l2 = o_0.a(k2.aZ);
                for (int i3 = 0; i3 < this.kA; ++i3) {
                    if (l2 != this.lg[i3] || this.jG[i3] == 0) continue;
                    n2 = 1;
                    break;
                }
                if (Client.eR.aX != 0 && k2.aX != 0 && Client.eR.aX == k2.aX) {
                    bl4 = true;
                }
            } else {
                boolean bl5 = bl4 = k2.bh == Client.eR.bh;
                if (k2.bh == 1 && Client.eR.bh == 3 || k2.bh == 3 && Client.eR.bh == 1) {
                    bl4 = true;
                }
                if (k2.bh == 2 && Client.eR.bh == 4 || k2.bh == 4 && Client.eR.bh == 2) {
                    bl4 = true;
                }
            }
            if (bl3 && n2 == 0) {
                this.a(this.mO, n12, n3);
                continue;
            }
            if (n2 != 0) {
                this.a(this.mN, n12, n3);
                continue;
            }
            if (bl4) {
                this.a(this.mQ, n12, n3);
                continue;
            }
            this.a(this.mM, n12, n3);
        }
        if (this.jZ != 0 && ff % 20 < 10) {
            rs.a.k k3;
            rs.a.j j3;
            if (this.jZ == 1 && this.of >= 0 && this.of < this.cA.length && (j3 = this.cA[this.of]) != null) {
                int n13 = j3.ac / 32 - Client.eR.ac / 32;
                int n14 = j3.ad / 32 - Client.eR.ad / 32;
                this.b(this.kh, n14, n13);
            }
            if (this.jZ == 2) {
                int n15 = (this.kW - eh) * 4 + 2 - Client.eR.ac / 32;
                int n16 = (this.kX - ei) * 4 + 2 - Client.eR.ad / 32;
                this.b(this.kh, n16, n15);
            }
            if (this.jZ == 10 && this.kV >= 0 && this.kV < do.length && (k3 = do[this.kV]) != null) {
                int n17 = k3.ac / 32 - Client.eR.ac / 32;
                int n18 = k3.ad / 32 - Client.eR.ad / 32;
                this.b(this.kh, n18, n17);
            }
        }
        if (this.gd != 0) {
            int n19 = this.gd * 4 + 2 - Client.eR.ac / 32;
            int n20 = this.ge * 4 + 2 - Client.eR.ad / 32;
            this.a(this.kg, n19, n20);
        }
        rs.l.c.a(3, rs.f.a.ai == a.c.a ? 83 : 80, rs.f.a.ai == a.c.a ? n6 + 127 : ai - 88, 0xFFFFFF, 3);
        if (rs.f.a.ai == a.c.a) {
            this.H[19].f(0 + n6, 0);
            this.H[19].f(2 + n6, 0);
        } else {
            this.H[44].f(ai - 181, 0);
        }
        this.ng.a(33, this.ft, this.mp, 256, this.ln, rs.f.a.ai == a.c.a ? 25 : 24, 4, rs.f.a.ai == a.c.a ? n6 + 29 : ai - 176, 33, 25);
        this.v.a();
        if (this.cY == 3 && ff % 20 < 10 && rs.f.a.ai == a.c.a) {
            this.cX.f(175, 53);
        }
    }

    private void a(rs.a.c c2, int n2) {
        this.g(c2.ac, n2, c2.ad);
    }

    public void g(int n2, int n3, int n4) {
        if (n2 < 128 || n4 < 128 || n2 > 13056 || n4 > 13056) {
            this.dN = -1;
            this.dO = -1;
            return;
        }
        int n5 = this.c(dw, n4, n2) - n3;
        n2 -= cJ;
        n5 -= cK;
        int n6 = rs.a.h.bA[this.cR];
        int n7 = rs.a.h.bB[this.cR];
        int n8 = rs.a.h.bA[this.cS];
        int n9 = rs.a.h.bB[this.cS];
        int n10 = (n4 -= cL) * n8 + n2 * n9 >> 16;
        n4 = n4 * n9 - n2 * n8 >> 16;
        n2 = n10;
        n10 = n5 * n7 - n4 * n6 >> 16;
        n4 = n5 * n6 + n4 * n7 >> 16;
        n5 = n10;
        if (n4 >= 50) {
            this.dN = (Client.ai() ? 4 : 4) + e_0.s + (n2 << 9) / n4;
            this.dO = e_0.t + (n5 << 9) / n4;
        } else {
            this.dN = -1;
            this.dO = -1;
        }
    }

    private void bN() {
        if (this.nS == 0) {
            return;
        }
        int n2 = 0;
        if (this.eN != 0L || rs.f.a.aA && this.co != null && !this.co.equals("")) {
            n2 = 1;
        }
        for (int i2 = 0; i2 < 200; ++i2) {
            if (this.dC[i2] == null) continue;
            int n3 = this.dz[i2];
            String string = this.dB[i2];
            int n4 = this.dA[i2];
            int n5 = 175;
            if ((n3 == 3 || n3 == 7) && (n3 == 7 || this.cE == 0 || this.cE == 1 && this.i(string))) {
                int n6 = rs.f.a.ai == a.c.a ? 4 : 0;
                int n7 = 329 - n2 * 13;
                if (rs.f.a.ai != a.c.a) {
                    n7 = ah - n5 - n2 * 13;
                }
                if (rs.c_0.hP > 4 && rs.c_0.hQ - n6 > n7 - 10 && rs.c_0.hQ - n6 <= n7 + 3) {
                    int n8 = this.gi.a("From:  " + string + this.dC[i2]) + 25;
                    if (n8 > 450) {
                        n8 = 450;
                    }
                    if (rs.c_0.hP < 4 + n8) {
                        if (cT == 1 || cT == 2) {
                            this.fx[this.eV] = "Report abuse @whi@" + string;
                            this.eI[this.eV] = 2606;
                            ++this.eV;
                        }
                        this.fx[this.eV] = "Add ignore @whi@" + string;
                        this.eI[this.eV] = 2042;
                        ++this.eV;
                        this.fx[this.eV] = "Add friend @whi@" + string;
                        this.eI[this.eV] = 2337;
                        ++this.eV;
                    }
                }
                if (++n2 >= 5) {
                    return;
                }
            }
            if (n3 != 5 && n3 != 6 || this.cE >= 2 || ++n2 < 5) continue;
            return;
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, false);
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl) {
        n_0 n_02 = null;
        if (!bl) {
            n_0 n_03 = (n_0)this.nL.b();
            while (n_03 != null) {
                if (n_03.h == n8 && n_03.j == n9 && n_03.k == n6 && n_03.i == n5) {
                    n_02 = n_03;
                    break;
                }
                n_03 = (n_0)this.nL.d();
            }
        }
        if (n_02 == null) {
            n_02 = new n_0();
            n_02.h = n8;
            n_02.i = n5;
            n_02.j = n9;
            n_02.k = n6;
            this.a(n_02);
            this.nL.a(n_02);
        }
        n_02.a = n3;
        n_02.f = n7;
        n_02.b = n4;
        n_02.o = n10;
        n_02.g = n2;
    }

    public boolean b(rs.n.e e2) {
        if (e2.aq == null) {
            return false;
        }
        for (int i2 = 0; i2 < e2.aq.length; ++i2) {
            int n2 = this.a(e2, i2);
            int n3 = e2.I[i2];
            if ((e2.aw == 957 || e2.aw == 915 || e2.aw == 12464 || e2.aw == 12466 || e2.aw == 12468 || e2.aw == 12470 || e2.aw == 68510 || e2.aw == 12480 || e2.aw == 12482 || e2.aw == 39975 || e2.aw == 39974 || e2.aw == 39973 || e2.aw == 39972 || e2.aw == 19099 || e2.aw == 19097 || e2.aw == 19095 || e2.aw == 19093 || e2.aw == 19091 || e2.aw == 19089 || e2.aw == 19087 || e2.aw == 19085 || e2.aw == 19083 || e2.aw == 12472 || e2.aw == 12474 || e2.aw == 19081 || e2.aw == 19079 || e2.aw == 19077 || e2.aw == 19075 || e2.aw == 19073 || e2.aw == 19071) && n2 == 1) {
                return true;
            }
            if (!(e2.aw != 22584 && e2.aw != 22586 || ag_0.c)) {
                return true;
            }
            if (!(e2.aq[i2] == 2 ? n2 >= n3 : (e2.aq[i2] == 3 ? n2 <= n3 : (e2.aq[i2] == 4 ? n2 == n3 : n2 != n3)))) continue;
            return false;
        }
        return true;
    }

    private DataInputStream j(String string) {
        if (this.jL != null) {
            try {
                this.jL.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.jL = null;
        }
        this.jL = this.b(43595);
        this.jL.setSoTimeout(10000);
        InputStream inputStream = this.jL.getInputStream();
        OutputStream outputStream = this.jL.getOutputStream();
        outputStream.write(("JAGGRAB /" + string + "\n\n").getBytes());
        return new DataInputStream(inputStream);
    }

    private void a(f_0 f_02) {
        int n2;
        int n3 = hQ - 15;
        int n4 = hP - 10;
        if (this.jv > 10) {
            n2 = n4 - 110;
            int n5 = n3 - 100;
            f_02.a(n2, n5, (this.jv - 10) * 3);
            int n6 = 1;
            rs.l.c.e(n2 - n6, 251 + n6 * 2, 219 + n6 * 2, 2367511, n5 - n6, (this.jv - 10) * 3);
        }
        if (this.jv > 10) {
            n2 = rs.l.h.ap;
            rs.l.h.ap = (this.jv - 10) * 3;
            this.b(n4 + 16, n3 + 5, "       <img=50> @yel@Summer Battlefield Minigame <img=50>\nYou'll be auto-assigned to one of the teams\nin a war between Wizards vs Warriors. Join as@whi@\na pvp @or2@<img=53> Fighter@whi@ or non-pvp @gre@<img=49> Medic!");
            rs.l.h.ap = n2;
        }
    }

    private void d(rs.x.e e2) {
        int n2;
        int n3 = e2.k(8);
        if (rs.f.a.d.booleanValue()) {
            cx.add("\t-> newPlayerCount=" + n3);
        }
        if (n3 < this.ku) {
            for (n2 = n3; n2 < this.ku; ++n2) {
                this.jO[this.jN++] = this.kv[n2];
            }
        }
        if (n3 > this.ku) {
            rs.v.a.e(this.fk + " Too many players");
            throw new RuntimeException("eek");
        }
        this.ku = 0;
        n2 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            int n5;
            int n6 = this.kv[i2];
            rs.a.k k2 = do[n6];
            int n7 = e2.k(1);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> [" + n6 + "] j1=" + n7);
            }
            if (n7 == 0) {
                this.kv[this.ku++] = n6;
                k2.P = ff;
                continue;
            }
            int n8 = e2.k(2);
            if (rs.f.a.d.booleanValue()) {
                cx.add("\t\t-> [" + n6 + "] k1=" + n8);
            }
            if (n8 == 0) {
                this.kv[this.ku++] = n6;
                k2.P = ff;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 == 1) {
                this.kv[this.ku++] = n6;
                k2.P = ff;
                n5 = e2.k(3);
                k2.a(false, n5);
                n4 = e2.k(1);
                if (rs.f.a.d.booleanValue()) {
                    cx.add("\t\t-> [" + n6 + "] direction=" + n5 + ", updateRequired=" + n4);
                }
                if (n4 != 1) continue;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 == 2) {
                ++n2;
                this.kv[this.ku++] = n6;
                k2.P = ff;
                n5 = e2.k(3);
                k2.a(true, n5);
                n4 = e2.k(3);
                k2.a(true, n4);
                int n9 = e2.k(1);
                if (rs.f.a.d.booleanValue()) {
                    cx.add("\t\t-> [" + n6 + "] firstDirection=" + n5 + ", secondDirection=" + n4 + ", updaterequired=" + n9);
                }
                if (n9 != 1) continue;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 != 3) continue;
            this.jO[this.jN++] = n6;
        }
    }

    private void h(boolean bl) {
        this.G.a();
    }

    @Override
    public void Z() {
        this.ga = true;
    }

    private void c(rs.x.e e2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        if (n2 == 84) {
            rs.h h2;
            int n16 = e2.y();
            int n17 = this.oE + (n16 >> 4 & 7);
            int n18 = this.oF + (n16 & 7);
            int n19 = e2.A();
            int n20 = e2.A();
            int n21 = e2.A();
            if (n17 >= 0 && n18 >= 0 && n17 < 104 && n18 < 104 && (h2 = this.jH[dw][n17][n18]) != null) {
                rs.a.g g2 = (rs.a.g)h2.b();
                while (g2 != null) {
                    if (g2.h == (n19 & Short.MAX_VALUE) && g2.k == n20) {
                        g2.k = n21;
                        break;
                    }
                    g2 = (rs.a.g)h2.d();
                }
                this.o(n17, n18);
            }
            return;
        }
        if (n2 == 105) {
            n15 = e2.y();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.A();
            n11 = e2.y();
            n10 = n11 >> 4 & 0xF;
            n9 = n11 & 7;
            if (Client.eR.k[0] >= n14 - n10 && Client.eR.k[0] <= n14 + n10 && Client.eR.l[0] >= n13 - n10 && Client.eR.l[0] <= n13 + n10 && this.jT && !li && this.ms < 50) {
                this.nY[this.ms] = n12;
                this.oo[this.ms] = n9;
                this.os[this.ms] = rs.w.e.a[n12];
                ++this.ms;
            }
        }
        if (n2 == 215) {
            n15 = e2.T();
            n14 = e2.P();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = e2.T();
            n10 = e2.A();
            if (n13 >= 0 && n12 >= 0 && n13 < 104 && n12 < 104 && n11 != di) {
                rs.a.g g3 = new rs.a.g();
                g3.h = n15;
                g3.k = n10;
                if (this.jH[dw][n13][n12] == null) {
                    this.jH[Client.dw][n13][n12] = new rs.h();
                }
                this.jH[dw][n13][n12].a(g3);
                this.o(n13, n12);
            }
            return;
        }
        if (n2 == 156) {
            rs.h h3;
            n15 = e2.N();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.A();
            if (n14 >= 0 && n13 >= 0 && n14 < 104 && n13 < 104 && (h3 = this.jH[dw][n14][n13]) != null) {
                rs.a.g g4 = (rs.a.g)h3.b();
                while (g4 != null) {
                    if (g4.h == (n12 & Short.MAX_VALUE)) {
                        g4.b();
                        break;
                    }
                    g4 = (rs.a.g)h3.d();
                }
                if (h3.b() == null) {
                    this.jH[Client.dw][n14][n13] = null;
                }
                this.o(n14, n13);
            }
            return;
        }
        if (n2 == 160) {
            n15 = e2.P();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.P();
            n11 = n12 >> 2;
            n10 = n12 & 3;
            n9 = this.nJ[n11];
            int n22 = e2.T();
            if (n14 >= 0 && n13 >= 0 && n14 < 103 && n13 < 103) {
                q_0 q_02;
                int n23 = this.fC[dw][n14][n13];
                int n24 = this.fC[dw][n14 + 1][n13];
                int n25 = this.fC[dw][n14 + 1][n13 + 1];
                int n26 = this.fC[dw][n14][n13 + 1];
                if (n9 == 0 && (q_02 = this.dF.m(dw, n14, n13)) != null) {
                    int n27 = q_02.m >> 14 & Short.MAX_VALUE;
                    if (n11 == 2) {
                        q_02.f = new rs.a.m(n27, 4 + n10, 2, n24, n25, n23, n26, n22, false);
                        q_02.g = new rs.a.m(n27, n10 + 1 & 3, 2, n24, n25, n23, n26, n22, false);
                    } else {
                        q_02.f = new rs.a.m(n27, n10, n11, n24, n25, n23, n26, n22, false);
                    }
                }
                if (n9 == 1 && (q_02 = this.dF.n(n14, n13, dw)) != null) {
                    ((t_0)q_02).e = new rs.a.m(((t_0)q_02).a, 0, 4, n24, n25, n23, n26, n22, false);
                }
                if (n9 == 2) {
                    q_02 = this.dF.o(n14, n13, dw);
                    if (n11 == 11) {
                        n11 = 10;
                    }
                    if (q_02 != null) {
                        ((l)q_02).d = new rs.a.m(((l)q_02).a, n10, n11, n24, n25, n23, n26, n22, false);
                    }
                }
                if (n9 == 3 && (q_02 = this.dF.p(n13, n14, dw)) != null) {
                    ((m)q_02).c = new rs.a.m(((m)q_02).a, n10, 22, n24, n25, n23, n26, n22, false);
                }
            }
            return;
        }
        if (n2 == 147) {
            int n28;
            int n29;
            int n30;
            int n31;
            r r2;
            rs.a.h h4;
            n15 = e2.P();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.A();
            n11 = e2.R();
            n10 = e2.S();
            n9 = e2.Q();
            n8 = e2.A();
            n7 = e2.P();
            n6 = n7 >> 2;
            n5 = n7 & 3;
            n4 = this.nJ[n6];
            n3 = e2.z();
            int n32 = e2.A();
            int n33 = e2.Q();
            rs.a.k k2 = n12 == di ? eR : do[n12];
            if (k2 != null && (h4 = (r2 = rs.d.r.c(n32)).a(n6, n5, n31 = this.fC[dw][n14][n13], n30 = this.fC[dw][n14 + 1][n13], n29 = this.fC[dw][n14 + 1][n13 + 1], n28 = this.fC[dw][n14][n13 + 1], -1, -1)) != null) {
                int n34;
                this.a(n8 + 1, -1, 0, n4, n13, 0, dw, n14, n10 + 1);
                k2.bj = n10 + ff;
                k2.bk = n8 + ff;
                k2.bq = h4;
                int n35 = r2.U;
                int n36 = r2.af;
                if (n5 == 1 || n5 == 3) {
                    n35 = r2.af;
                    n36 = r2.U;
                }
                k2.bn = n14 * 128 + n35 * 64;
                k2.bp = n13 * 128 + n36 * 64;
                k2.bo = this.c(dw, k2.bp, k2.bn);
                if (n3 > n11) {
                    n34 = n3;
                    n3 = n11;
                    n11 = n34;
                }
                if (n33 > n9) {
                    n34 = n33;
                    n33 = n9;
                    n9 = n34;
                }
                k2.bt = n14 + n3;
                k2.bv = n14 + n11;
                k2.bu = n13 + n33;
                k2.bw = n13 + n9;
            }
        }
        if (n2 == 151) {
            n15 = e2.N();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.S();
            n11 = e2.P();
            n10 = n11 >> 2;
            n9 = n11 & 3;
            n8 = this.nJ[n10];
            if (n14 >= 0 && n13 >= 0 && n14 < 104 && n13 < 104) {
                this.a(-1, n12, n9, n8, n13, n10, dw, n14, 0);
            }
            return;
        }
        if (n2 == 4) {
            n15 = e2.y();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = e2.A();
            n11 = e2.y();
            n10 = e2.A();
            if (n14 >= 0 && n13 >= 0 && n14 < 104 && n13 < 104) {
                n14 = n14 * 128 + 64;
                n13 = n13 * 128 + 64;
                rs.a.b b2 = new rs.a.b(dw, ff, n10, n12, this.c(dw, n13, n14) - n11, n13, n14);
                this.et.a(b2);
            }
            return;
        }
        if (n2 == 44) {
            n15 = e2.U();
            n14 = e2.A();
            n13 = e2.y();
            n12 = this.oE + (n13 >> 4 & 7);
            n11 = this.oF + (n13 & 7);
            if (n12 >= 0 && n11 >= 0 && n12 < 104 && n11 < 104) {
                rs.a.g g5 = new rs.a.g();
                g5.h = n15;
                g5.k = n14;
                if (this.jH[dw][n12][n11] == null) {
                    this.jH[Client.dw][n12][n11] = new rs.h();
                }
                this.jH[dw][n12][n11].a(g5);
                this.o(n12, n11);
            }
            return;
        }
        if (n2 == 101) {
            n15 = e2.O();
            n14 = n15 >> 2;
            n13 = n15 & 3;
            n12 = this.nJ[n14];
            n11 = e2.y();
            n10 = this.oE + (n11 >> 4 & 7);
            n9 = this.oF + (n11 & 7);
            n8 = n10 + eh;
            n7 = n9 + ei;
            this.if.remove(n8 + "," + n7);
            if (n10 >= 0 && n9 >= 0 && n10 < 104 && n9 < 104) {
                this.a(-1, -1, n13, n12, n9, n14, dw, n10, 0);
            }
            return;
        }
        if (n2 == 117) {
            n15 = e2.y();
            n14 = this.oE + (n15 >> 4 & 7);
            n13 = this.oF + (n15 & 7);
            n12 = n14 + e2.z();
            n11 = n13 + e2.z();
            n10 = e2.B();
            n9 = e2.A();
            n8 = e2.y() * 4;
            n7 = e2.y() * 4;
            n6 = e2.A();
            n5 = e2.A();
            n4 = e2.y();
            n3 = e2.y();
            if (n14 >= 0 && n13 >= 0 && n14 < 104 && n13 < 104 && n12 >= 0 && n11 >= 0 && n12 < 104 && n11 < 104 && n9 != 65535) {
                n14 = n14 * 128 + 64;
                n13 = n13 * 128 + 64;
                n12 = n12 * 128 + 64;
                n11 = n11 * 128 + 64;
                rs.a.l l2 = new rs.a.l(n4, n7, n6 + ff, n5 + ff, n3, dw, this.c(dw, n13, n14) - n8, n13, n14, n10, n9);
                l2.a(n6 + ff, n11, this.c(dw, n11, n12) - n7, n12);
                this.ea.a(l2);
            }
        }
    }

    public static void aa() {
        rs.v_0.h = true;
        e_0.n = false;
        li = true;
        rs.x.h = !rs.f.a.ax;
        rs.d.r.Z = true;
    }

    private void e(rs.x.e e2) {
        int n2;
        e2.J();
        int n3 = e2.k(8);
        if (n3 < this.cB) {
            for (n2 = n3; n2 < this.cB; ++n2) {
                this.jO[this.jN++] = this.cC[n2];
            }
        }
        if (n3 > this.cB) {
            rs.v.a.e(this.fk + " Too many npcs");
            throw new RuntimeException("eek");
        }
        this.cB = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            int n4;
            int n5;
            int n6 = this.cC[n2];
            rs.a.j j2 = this.cA[n6];
            int n7 = e2.k(1);
            if (n7 == 0) {
                this.cC[this.cB++] = n6;
                j2.P = ff;
                continue;
            }
            int n8 = e2.k(2);
            if (n8 == 0) {
                this.cC[this.cB++] = n6;
                j2.P = ff;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 == 1) {
                this.cC[this.cB++] = n6;
                j2.P = ff;
                n5 = e2.k(3);
                j2.a(false, n5);
                n4 = e2.k(1);
                if (n4 != 1) continue;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 == 2) {
                this.cC[this.cB++] = n6;
                j2.P = ff;
                n5 = e2.k(3);
                j2.a(true, n5);
                n4 = e2.k(3);
                j2.a(true, n4);
                int n9 = e2.k(1);
                if (n9 != 1) continue;
                this.kx[this.kw++] = n6;
                continue;
            }
            if (n8 != 3) continue;
            this.jO[this.jN++] = n6;
        }
    }

    private void bO() {
        if (this.cz == 0) {
            int n2 = this.hE / 2 - 80;
            int n3 = this.hF / 2 + 20;
            if (this.hU == 1 && this.hV >= n2 - 75 && this.hV <= n2 + 75 && this.hW >= (n3 += 20) - 20 && this.hW <= n3 + 20) {
                this.cz = 2;
                this.fD = 0;
            }
            n2 = this.hE / 2 + 80;
            if (this.hU == 1 && this.hV >= n2 - 75 && this.hV <= n2 + 75 && this.hW >= n3 - 20 && this.hW <= n3 + 20) {
                this.oC = "";
                this.oD = "Enter your username & password.";
                this.cz = 2;
                this.fD = 0;
            }
        } else {
            if (this.cz == 2) {
                int n4;
                this.G.a(this.hU, rs.c_0.hP, rs.c_0.hQ, this.hV, this.hW);
                int n5 = this.hF / 2 - 40;
                n5 += 30;
                n5 += 25;
                n5 += 15;
                n5 += 15;
                int n6 = this.hE / 2 - 80;
                int n7 = this.hF / 2 + 50;
                n6 = this.hE / 2 + 80;
                if (this.hU != 1 || this.hV < n6 - 75 || this.hV > n6 + 75 || this.hW < (n7 += 20) - 20 || this.hW <= n7 + 20) {
                    // empty if block
                }
                while ((n4 = this.w(-796)) != -1) {
                    boolean bl = false;
                    for (int i2 = 0; i2 < nB.length(); ++i2) {
                        if (n4 != nB.charAt(i2)) continue;
                        bl = true;
                        break;
                    }
                    if (this.fD == 0) {
                        if (n4 == 8 && this.fk.length() > 0) {
                            this.fk = this.fk.substring(0, this.fk.length() - 1);
                        }
                        if (n4 == 9 || n4 == 10 || n4 == 13) {
                            this.fD = 1;
                        }
                        if (bl && (n4 != 32 || !this.fk.startsWith(" ") && !this.fk.equals(""))) {
                            this.fk = this.fk + (char)n4;
                        }
                        if (this.fk.length() <= 12) continue;
                        this.fk = this.fk.substring(0, 12);
                        continue;
                    }
                    if (this.fD == 1) {
                        if (n4 == 8 && this.fl.length() > 0) {
                            this.fl = this.fl.substring(0, this.fl.length() - 1);
                        }
                        if (n4 == 9 || n4 == 10 || n4 == 13) {
                            if (this.fk == "") {
                                this.fD = 0;
                            } else if (this.fl == "") {
                                this.fD = 0;
                            } else if (!rs.f.a.h.booleanValue()) {
                                if (Launcher.n().f().a("LOGIN_COOLDOWN", 500L)) {
                                    this.a(this.fk, this.fl, false);
                                }
                            } else {
                                this.fD = 2;
                            }
                        }
                        if (bl) {
                            this.fl = this.fl + (char)n4;
                        }
                        if (this.fl.length() <= 20) continue;
                        this.fl = this.fl.substring(0, 20);
                        continue;
                    }
                    if (this.fD == 2) {
                        if (n4 == 8 && fn.length() > 0) {
                            fn = fn.substring(0, fn.length() - 1);
                        }
                        if (n4 == 9 || n4 == 10 || n4 == 13) {
                            if (this.fk == "") {
                                this.fD = 0;
                            } else if (this.fl == "") {
                                this.fD = 0;
                            } else {
                                this.a(this.fk, this.fl, false);
                            }
                        }
                        if (bl) {
                            fn = fn + (char)n4;
                        }
                        if (fn.length() <= 20) continue;
                        fn = fn.substring(0, 20);
                        continue;
                    }
                    if (this.fD != 3) continue;
                    if (n4 == 8 && this.fm.length() > 0) {
                        this.fm = this.fm.substring(0, this.fm.length() - 1);
                    }
                    if (n4 == 10 && this.fm.length() == 5) {
                        this.fD = 0;
                        this.G.j = false;
                        this.a(this.fk, this.fl, false);
                    }
                    if (bl && n4 <= 57 && n4 >= 49 || n4 == 48) {
                        this.fm = this.fm + (char)n4;
                    }
                    if (this.fm.length() <= 5) continue;
                    this.fm = this.fm.substring(0, 5);
                }
                return;
            }
            if (this.cz == 3) {
                int n8 = this.hE / 2;
                int n9 = this.hF / 2 + 50;
                if (this.hU == 1 && this.hV >= n8 - 75 && this.hV <= n8 + 75 && this.hW >= (n9 += 20) - 20 && this.hW <= n9 + 20) {
                    this.cz = 0;
                }
            }
        }
    }

    public void a(f_0 f_02, int n2, int n3) {
        if (f_02 == null) {
            return;
        }
        int n4 = this.ft + this.oa & 0x7FF;
        int n5 = n2 * n2 + n3 * n3;
        if (f_02 == this.kg ? n5 > 6400 * (this.fh > 0 ? 3 : 1) : n5 > (int)(6400.0 * (this.fh > 0 ? 1.0 + (double)this.fh / 210.0 + 0.25 : 1.0))) {
            return;
        }
        int n6 = !Client.ai() ? 516 : 0;
        boolean bl = !Client.ai() ? false : false;
        int n7 = rs.a.h.bA[n4];
        int n8 = rs.a.h.bB[n4];
        n7 = n7 * 256 / (this.fh + 256);
        n8 = n8 * 256 / (this.fh + 256);
        int n9 = n3 * n7 + n2 * n8 >> 16;
        int n10 = n3 * n8 - n2 * n7 >> 16;
        if (rs.f.a.ai == a.c.a) {
            f_02.f(n6 + (94 + n9 - f_02.n / 2) + 4 + 30, 83 - n10 - f_02.o / 2 - 4 + 5);
        } else {
            f_02.f(77 + n9 - f_02.n / 2 + 4 + (ai - 167), 85 - n10 - f_02.o / 2 - 4);
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n6 >= 1 && n2 >= 1 && n6 <= 102 && n2 <= 102) {
            int n9;
            if (li && n3 != dw && (n8 != -1 && n8 != 30029 && n8 != 30030 && n8 != 30031 || n3 != 1 || dw != 0)) {
                return;
            }
            int n10 = 0;
            if (n7 == 0) {
                n10 = this.dF.a(n3, n6, n2);
            }
            if (n7 == 1) {
                n10 = this.dF.c(n3, n6, n2);
            }
            if (n7 == 2) {
                n10 = this.dF.e(n3, n6, n2);
            }
            if (n7 == 3) {
                n10 = this.dF.g(n3, n6, n2);
            }
            if (n10 != 0) {
                r r2;
                n9 = this.dF.b(n3, n6, n2, n10);
                int n11 = n10 >> 14 & Short.MAX_VALUE;
                int n12 = n9 & 0x1F;
                int n13 = n9 >> 6;
                if (n7 == 0) {
                    this.dF.a(n6, n3, n2, (byte)-119);
                    r2 = rs.d.r.c(n11);
                    if (r2.aj) {
                        this.fP[n3].a(n13, n12, r2.ab, n6, n2);
                    }
                }
                if (n7 == 1) {
                    this.dF.i(n2, n3, n6);
                }
                if (n7 == 2) {
                    this.dF.j(n3, n6, n2);
                    r2 = rs.d.r.c(n11);
                    if (n6 + r2.U > 103 || n2 + r2.U > 103 || n6 + r2.af > 103 || n2 + r2.af > 103) {
                        return;
                    }
                    if (r2.aj) {
                        this.fP[n3].a(n13, r2.U, n6, n2, r2.af, r2.ab);
                    }
                }
                if (n7 == 3) {
                    this.dF.k(n3, n2, n6);
                    r2 = rs.d.r.c(n11);
                    if (r2.aj && r2.ar) {
                        this.fP[n3].b(n2, n6);
                    }
                }
            }
            if (n8 >= 0) {
                n9 = n3;
                if (n9 < 3 && (this.gc[1][n6][n2] & 2) == 2) {
                    ++n9;
                }
                rs.x.a(this.dF, n4, n2, n5, n9, this.fP[n3], this.fC, n6, n8, n3);
            }
        }
    }

    private void b(int n2, rs.x.e e2) {
        int n3;
        this.jN = 0;
        this.kw = 0;
        long l2 = System.currentTimeMillis();
        if (rs.f.a.d.booleanValue()) {
            cx.add("Updating local player movement..");
        }
        this.c(e2);
        if (rs.f.a.d.booleanValue()) {
            cx.add("Updating other player movement..");
        }
        this.d(e2);
        if (rs.f.a.d.booleanValue()) {
            cx.add("Updating player list..");
        }
        this.b(e2, n2);
        if (rs.f.a.d.booleanValue()) {
            cx.add("Parsing synchronization mask..");
        }
        this.a(e2);
        if (rs.f.a.d.booleanValue()) {
            cx.add("..Done!");
        }
        for (n3 = 0; n3 < this.jN; ++n3) {
            int n4 = this.jO[n3];
            int n5 = n4 << 14;
            if (Client.do[n4].P == ff) continue;
            Client.do[n4] = null;
            rs.k.c.c.a(n5);
        }
        if (e2.h != n2) {
            for (String string : cx) {
                System.out.println(string);
            }
            rs.v.a.e("Error packet size mismatch in getplayer pos:" + e2.h + " psize:" + n2);
            throw new RuntimeException("eek");
        }
        for (n3 = 0; n3 < this.ku; ++n3) {
            if (do[this.kv[n3]] != null) continue;
            rs.v.a.e(this.fk + " null entry in pl list - pos:" + n3 + " size:" + this.ku);
            throw new RuntimeException("eek");
        }
    }

    public void ab() {
        this.gq = 0;
        this.eU = 0;
        this.ft = 0;
        this.oa = 0;
        this.fh = 0;
        this.dp = 0;
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11 = 2048 - n3 & 0x7FF;
        int n12 = 2048 - n6 & 0x7FF;
        int n13 = 0;
        int n14 = 0;
        int n15 = n2;
        if (n11 != 0) {
            n10 = rs.a.h.bA[n11];
            n9 = rs.a.h.bB[n11];
            n8 = n14 * n9 - n15 * n10 >> 16;
            n15 = n14 * n10 + n15 * n9 >> 16;
            n14 = n8;
        }
        if (n12 != 0) {
            n10 = rs.a.h.bA[n12];
            n9 = rs.a.h.bB[n12];
            n8 = n15 * n10 + n13 * n9 >> 16;
            n15 = n15 * n9 - n13 * n10 >> 16;
            n13 = n8;
        }
        cJ = n4 - n13;
        cK = n5 - n14;
        cL = n7 - n15;
        this.cR = n3;
        this.cS = n6;
    }

    public boolean ac() {
        if (rs.l.b.a.d.g()) {
            return true;
        }
        boolean bl = rs.l.j.b(cT);
        if (rs.f.a.aM && (rs.l.j.a(cT) || eR != null && Client.eR.aZ != null && Client.eR.aZ.equalsIgnoreCase("Staff stash"))) {
            bl = true;
        }
        return bl;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        super.keyReleased(keyEvent);
        int n2 = keyEvent.getKeyCode();
        char c2 = keyEvent.getKeyChar();
        if (this.fN == 2 || this.fN == 1) {
            return;
        }
        if (this.gp == 55290 || this.gp == 55291 || this.gp == 55292 || this.gp == 55293) {
            if (n2 == 49 || n2 == 32) {
                fv.a(185);
                fv.d(55313);
            }
            if (n2 == 50) {
                fv.a(185);
                fv.d(55315);
            }
            if (n2 == 51) {
                fv.a(185);
                fv.d(55317);
            }
            if (n2 == 52) {
                fv.a(185);
                fv.d(55319);
            }
        }
        if (this.gp == 55333) {
            if (n2 == 49 || n2 == 32) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55321);
            }
            if (n2 == 50) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55323);
            }
            if (n2 == 51) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55325);
            }
            if (n2 == 52) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55327);
            }
            if (n2 == 53) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55329);
            }
        }
        if (System.currentTimeMillis() - this.jx < 100L) {
            return;
        }
        if (c2 == '\u001b' && Client.w.b && this.ac()) {
            w.a();
            return;
        }
        this.cv.a(keyEvent);
        for (int n3 : jy) {
            if (n3 != this.gp) continue;
            if (n2 >= 49 && n2 <= 53) {
                this.jx = System.currentTimeMillis();
                ap = "::dialogueoption " + (n2 - 48);
            }
            if (n2 < 97 || n2 > 101) break;
            this.jx = System.currentTimeMillis();
            ap = "::dialogueoption " + (n2 - 96);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        super.keyPressed(keyEvent);
        if (System.currentTimeMillis() - this.jw < 1000L) {
            return;
        }
        if (this.fN == 2) {
            return;
        }
        int n2 = keyEvent.getKeyCode();
        char c2 = keyEvent.getKeyChar();
        if (!this.fc) {
            if (this.fD == 3 && n2 == 27 && this.G.j) {
                this.fm = "";
                this.fD = 0;
                this.G.j = false;
                this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
            }
            return;
        }
        if (n2 == 81 && (ch || keyEvent.isControlDown())) {
            this.jw = System.currentTimeMillis();
            if (av == null) {
                this.a("<img=25> You haven't equipped a loadout that you can shortcut to yet!", 0, null);
            } else {
                ap = av;
                ao = aw;
                this.as = az;
                this.ar = ax;
                this.an = au;
            }
        }
        if (n2 == 32) {
            for (int n3 : jz) {
                if (n3 != this.gp) continue;
                this.jw = System.currentTimeMillis();
                fv.a(40);
                fv.d(4907);
                this.eZ = true;
                break;
            }
        }
        if (n2 == 27 && !Client.w.b) {
            if (cH == 3323 || cH == 3443 || cH == 59835 || cH == 59868 || cH == 25754 || cH == 6575 || cH == 6412) {
                return;
            }
            this.jw = System.currentTimeMillis();
            fv.a(185);
            fv.d(63740);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean bP() {
        if (this.nD == null) {
            return false;
        }
        try {
            int n2 = this.nD.c();
            if (n2 == 0) {
                return false;
            }
            if (this.lO == -1) {
                this.nD.a(this.mU.g, 1);
                this.lO = this.mU.g[0] & 0xFF;
                if (this.lJ != null) {
                    this.lO = this.lO - this.lJ.a() & 0xFF;
                }
                this.lN = rs.f.d.b[this.lO];
                --n2;
            }
            if (this.lN == -1) {
                if (n2 > 0) {
                    this.nD.a(this.mU.g, 1);
                    this.lN = this.mU.g[0] & 0xFF;
                    --n2;
                } else {
                    return false;
                }
            }
            if (this.lN == -2) {
                if (n2 > 1) {
                    this.nD.a(this.mU.g, 2);
                    this.mU.h = 0;
                    this.lN = this.mU.A();
                    n2 -= 2;
                } else {
                    return false;
                }
            }
            if (n2 < this.lN) {
                return false;
            }
            if (rs.f.a.d.booleanValue() && this.lO > 0) {
                jC.add(this.lO);
                if (jC.size() >= 10) {
                    jC.remove(0);
                }
            }
            this.mU.h = 0;
            this.nD.a(this.mU.g, this.lN);
            this.lP = 0;
            this.jR = this.jQ;
            this.jQ = this.jP;
            this.jP = this.lO;
            if (this.lO == 81) {
                if (ii != 0L && (bh = System.currentTimeMillis() - ii - 600L) < 0L) {
                    bh = 0L;
                }
                ii = System.currentTimeMillis();
                if (rs.f.a.f.booleanValue()) {
                    cx.clear();
                }
                this.b(this.lN, this.mU);
                this.mS = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 176) {
                this.nC = this.mU.O();
                this.nx = this.mU.T();
                this.nf = this.mU.y();
                this.nR = this.mU.Y();
                this.lM = this.mU.A();
                if (this.nR != 0 && cH == -1) {
                    rs.v.a.d(o_0.a(this.nR));
                    this.bQ();
                    int n3 = 650;
                    if (this.nC != 201 || this.nf == 1) {
                        n3 = 655;
                    }
                    this.kr = "";
                    this.nz = false;
                    for (int i2 = 0; i2 < rs.n.e.H.length; ++i2) {
                        if (rs.n.e.H[i2] == null || rs.n.e.H[i2].J != n3) continue;
                        cH = rs.n.e.H[i2].ah;
                        break;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 64) {
                this.oE = this.mU.O();
                this.oF = this.mU.P();
                for (int i3 = this.oE; i3 < this.oE + 8; ++i3) {
                    for (int i4 = this.oF; i4 < this.oF + 8; ++i4) {
                        if (this.jH[dw][i3][i4] == null) continue;
                        this.jH[Client.dw][i3][i4] = null;
                        this.o(i3, i4);
                    }
                }
                n_0 n_02 = (n_0)this.nL.b();
                while (n_02 != null) {
                    if (n_02.j >= this.oE && n_02.j < this.oE + 8 && n_02.k >= this.oF && n_02.k < this.oF + 8 && n_02.h == dw) {
                        n_02.g = 0;
                    }
                    n_02 = (n_0)this.nL.d();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 185) {
                int n4 = this.mU.U();
                rs.n.e.H[n4].ae = 3;
                rs.n.e.H[n4].af = Client.eR.aT == null ? (Client.eR.aV[0] << 25) + (Client.eR.aV[4] << 20) + (Client.eR.br[0] << 15) + (Client.eR.br[8] << 10) + (Client.eR.br[11] << 5) + Client.eR.br[1] : (int)(305419896L + Client.eR.aT.x);
                this.lO = -1;
                return true;
            }
            if (this.lO == 107) {
                this.fe = false;
                for (int i5 = 0; i5 < 5; ++i5) {
                    this.dh[i5] = false;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 72) {
                int n5 = this.mU.S();
                rs.n.e e2 = rs.n.e.H[n5];
                for (int i6 = 0; i6 < e2.az.length; ++i6) {
                    e2.az[i6] = -1;
                    e2.az[i6] = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 214) {
                this.jD = this.lN / 8;
                for (int i7 = 0; i7 < this.jD; ++i7) {
                    this.kP[i7] = this.mU.E();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 166) {
                this.fe = true;
                this.mZ = this.mU.y();
                this.na = this.mU.y();
                this.nb = this.mU.A();
                this.nc = this.mU.y();
                this.nd = this.mU.y();
                if (this.nd >= 100) {
                    cJ = this.mZ * 128 + 64;
                    cL = this.na * 128 + 64;
                    cK = this.c(dw, cL, cJ) - this.nb;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 250) {
                int n6 = this.mU.A();
                rs.q.a.a.b.a(this, this.mU, n6);
                this.lO = -1;
                return true;
            }
            if (this.lO == 255) {
                int n7 = this.mU.A();
                long l2 = this.mU.E();
                int n8 = this.mU.A();
                if (n7 > -1) {
                    this.m.a(n7, l2, n8);
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 134) {
                int n9;
                int n10 = this.mU.y();
                int n11 = this.ka[n10];
                int n12 = this.kN[n10];
                int n13 = this.mU.X();
                int n14 = this.mU.y();
                this.ka[n10] = n13;
                this.kN[n10] = n14;
                this.eo[n10] = 1;
                for (n9 = 0; n9 < 98; ++n9) {
                    if (n13 < lU[n9]) continue;
                    this.eo[n10] = n9 + 2;
                }
                this.p.post(new SkillLevelChanged(n10, n13, n14, this.eo[n10]));
                n9 = this.eo[n10];
                int n15 = 0;
                for (int i8 = 0; i8 < this.eo.length; ++i8) {
                    n15 += this.eo[i8];
                }
                String string = "XP: " + n13 + "\n";
                if (n9 != 99) {
                    int n16 = lU[n9 - 1];
                    string = string + "Next Lvl: " + n16 + "\n";
                    string = string + "Remainder: " + (n16 - this.ka[n10]) + "\n";
                }
                rs.n.e.H[((Integer)rs.f.e.c[n10][1]).intValue() + 1].at = string;
                rs.n.e.H[50240].at = "Total Level: " + n15;
                if (n12 > 0) {
                    this.o.a(n10, n13 - n11);
                }
                if (n10 == 6 && this.eo[6] != rs.n.c.ap.c && rs.n.c.ap.d) {
                    rs.n.c.ap.c = this.eo[6];
                    rs.n.c.ap.j();
                }
                fb = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 71) {
                int n17 = this.mU.A();
                int n18 = this.mU.N();
                if (n17 == 65535) {
                    n17 = -1;
                }
                if (n17 == 0) {
                    n17 = 67027;
                }
                if (n18 == 2) {
                    n17 = 44100;
                }
                Client.eT[n18] = n17;
                fb = true;
                eM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 74) {
                int n19 = this.mU.S();
                if (n19 == 65535) {
                    n19 = -1;
                }
                if (n19 != this.lh && this.nv && !li && this.oz == 0) {
                    this.oi = n19;
                    this.oj = true;
                    ew.a(2, this.oi);
                }
                this.lh = n19;
                this.lO = -1;
                return true;
            }
            if (this.lO == 121) {
                int n20 = this.mU.U();
                int n21 = this.mU.T();
                if (this.nv && !li) {
                    this.oi = n20;
                    this.oj = false;
                    ew.a(2, this.oi);
                    this.oz = n21;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 109) {
                this.br();
                this.lO = -1;
                return false;
            }
            if (this.lO == 70) {
                int n22 = this.mU.B();
                int n23 = this.mU.V();
                int n24 = this.mU.S();
                rs.n.e e3 = rs.n.e.H[n24];
                e3.aJ = n22;
                e3.aP = n23;
                this.lO = -1;
                return true;
            }
            if (this.lO == 73 || this.lO == 241) {
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                boolean object2;
                int n122;
                int n35;
                int n36;
                int n37;
                int n38 = this.mx;
                int n39 = this.my;
                if (this.lO == 73) {
                    n38 = this.mU.T();
                    n39 = this.mU.A();
                    this.nA = false;
                }
                if (this.lO == 241) {
                    n39 = this.mU.T();
                    this.mU.J();
                    for (n37 = 0; n37 < 4; ++n37) {
                        for (n36 = 0; n36 < 13; ++n36) {
                            for (n35 = 0; n35 < 13; ++n35) {
                                this.eS[n37][n36][n35] = this.mU.k(1) == 1 ? this.mU.k(26) : -1;
                            }
                        }
                    }
                    this.mU.K();
                    n38 = this.mU.A();
                    this.nA = true;
                } else if (this.mx == n38 && this.my == n39 && ee == 2) {
                    this.lO = -1;
                    return true;
                }
                this.mx = this.bl = n38;
                this.my = this.bm = n39;
                eh = (this.mx - 6) * 8;
                ei = (this.my - 6) * 8;
                n37 = this.mx / 8 * 256 + this.my / 8;
                System.out.println("[Region] Stand in region: " + n37);
                W = n37;
                if (Client.ew.g.a(n37)) {
                    ek = (String)Client.ew.g.a().b(n37);
                    System.out.println("[Region] Region group: " + ek);
                } else {
                    ek = null;
                }
                boolean bl = this.np = (this.mx / 8 == 48 || this.mx / 8 == 49) && this.my / 8 == 48;
                if (this.mx / 8 == 48 && this.my / 8 == 148) {
                    this.np = true;
                }
                n36 = eh + (eh - 6 >> 7);
                n35 = ei + (ei - 6 >> 7);
                int n40 = n36 >> 6;
                int n41 = n35 >> 6;
                int n42 = n40 * 256 + n41;
                if (rs.d.r.B.size() == 0) {
                    if (rs.d.h.a != h.a.b) {
                        rs.d.h.a(h.a.b);
                        rs.d.t.a(!this.aC ? h.a.b : h.a.a);
                    }
                    if (rs.d.r.E != r.a.b) {
                        rs.d.r.a(r.a.b);
                    }
                    for (int n122 : rs.d.r.D) {
                        rs.d.r.B.a(n122, (Object)new r(rs.d.r.c(n122)));
                    }
                }
                if (this.aC || n42 == 9023 || n42 == 9022 || n42 == 9024 || n42 == 8767 || n42 == 9279 || c.get(n42) != null || c.get(W) != null) {
                    if (!rs.f.a.ax) {
                        rs.x.h = false;
                        if (this.fr != null && !this.bI) {
                            ee = 1;
                        } else {
                            this.bI = false;
                        }
                    }
                } else if (!rs.f.a.ax && !rs.x.h) {
                    boolean bl2 = rs.x.h = !rs.f.a.ax;
                    if (this.fr != null && !this.bI) {
                        ee = 1;
                    } else {
                        this.bI = false;
                    }
                }
                boolean bl3 = false;
                int n13 = eh + (Client.eR.ac - 6 >> 7);
                int n14 = ei + (Client.eR.ad - 6 >> 7);
                n122 = n13 >> 6;
                int n15 = n14 >> 6;
                if (ek == null && Client.ew.g.g().a_(n42)) {
                    boolean l11 = true;
                }
                if (Client.ew.g.g().a_(n37)) {
                    object2 = true;
                }
                if (object2) {
                    if (rs.d.h.a != h.a.c) {
                        rs.d.h.a(h.a.c);
                        rs.d.t.a(h.a.c);
                    }
                    if (rs.d.r.E != r.a.d) {
                        rs.d.r.a(r.a.d);
                    }
                } else {
                    int n16 = n11 = ek == null ? n42 : n37;
                    if (Arrays.asList(this.e).contains(new Integer(n11))) {
                        if (rs.d.h.a != h.a.a) {
                            rs.d.h.a(h.a.a);
                            rs.d.t.a(h.a.a);
                        }
                        if (rs.d.r.E != r.a.c) {
                            rs.d.r.a(r.a.c);
                        }
                    } else if (Arrays.asList(this.d).contains(new Integer(n11))) {
                        if (rs.d.h.a != h.a.b) {
                            rs.d.h.a(h.a.b);
                            rs.d.t.a(h.a.b);
                        }
                        if (rs.d.r.E != r.a.b) {
                            rs.d.r.a(r.a.b);
                        }
                    } else {
                        if (rs.d.h.a != h.a.a) {
                            rs.d.h.a(h.a.a);
                            rs.d.t.a(h.a.a);
                        }
                        if (rs.d.r.E != r.a.a) {
                            rs.d.r.a(r.a.a);
                        }
                    }
                }
                System.out.println("[Regions] Loaded region ID: " + n42 + " (" + rs.d.r.E.name() + ")");
                cw = n42;
                bD = true;
                ee = 1;
                this.jE = System.currentTimeMillis();
                if (this.lO == 73) {
                    int n17;
                    n11 = 0;
                    for (n17 = (this.mx - 6) / 8; n17 <= (this.mx + 6) / 8; ++n17) {
                        for (n10 = (this.my - 6) / 8; n10 <= (this.my + 6) / 8; ++n10) {
                            ++n11;
                        }
                    }
                    this.fr = new byte[n11][];
                    this.fY = new byte[n11][];
                    this.fR = new int[n11];
                    this.fS = new int[n11];
                    this.fT = new int[n11];
                    n11 = 0;
                    for (n17 = (this.mx - 6) / 8; n17 <= (this.mx + 6) / 8; ++n17) {
                        for (n10 = (this.my - 6) / 8; n10 <= (this.my + 6) / 8; ++n10) {
                            n9 = (n17 << 8) + n10;
                            if (Client.ew.g.g().a_(n9)) {
                                rs.cache.osrs.c.a(true);
                            }
                            try {
                                this.fR[n11] = (n17 << 8) + n10;
                                if (this.np && (n10 == 49 || n10 == 149 || n10 == 147 || n17 == 50 || n17 == 49 && n10 == 47)) {
                                    this.fS[n11] = -1;
                                    this.fT[n11] = -1;
                                    ++n11;
                                    continue;
                                }
                                if (ek != null && !Client.ew.g.a(n9, ek)) {
                                    this.fS[n11] = -1;
                                    this.fT[n11] = -1;
                                    ++n11;
                                    continue;
                                }
                                this.fS[n11] = ew.b(0, n10, n17);
                                n8 = this.fS[n11];
                                if (n8 != -1) {
                                    ew.a(3, n8);
                                }
                                if ((n7 = (this.fT[n11] = ew.b(1, n10, n17))) != -1) {
                                    ew.a(3, n7);
                                }
                                ++n11;
                                continue;
                            }
                            finally {
                                rs.cache.osrs.c.a(false);
                            }
                        }
                    }
                }
                if (this.lO == 241) {
                    n11 = 0;
                    int[] nArray = new int[676];
                    for (n10 = 0; n10 < 4; ++n10) {
                        for (n9 = 0; n9 < 13; ++n9) {
                            for (n8 = 0; n8 < 13; ++n8) {
                                n7 = this.eS[n10][n9][n8];
                                if (n7 == -1) continue;
                                n6 = n7 >> 14 & 0x3FF;
                                n5 = n7 >> 3 & 0x7FF;
                                n4 = (n6 / 8 << 8) + n5 / 8;
                                for (n3 = 0; n3 < n11; ++n3) {
                                    if (nArray[n3] != n4) continue;
                                    n4 = -1;
                                    break;
                                }
                                if (n4 == -1) continue;
                                nArray[n11++] = n4;
                            }
                        }
                    }
                    this.fr = new byte[n11][];
                    this.fY = new byte[n11][];
                    this.fR = new int[n11];
                    this.fS = new int[n11];
                    this.fT = new int[n11];
                    for (n10 = 0; n10 < n11; ++n10) {
                        this.fR[n10] = nArray[n10];
                        n9 = this.fR[n10];
                        n7 = n9 & 0xFF;
                        n8 = n9 >> 8 & 0xFF;
                        this.fS[n10] = ew.b(0, n7, n8);
                        n6 = this.fS[n10];
                        if (n6 != -1) {
                            ew.a(3, n6);
                        }
                        if ((n5 = (this.fT[n10] = ew.b(1, n7, n8))) == -1) continue;
                        ew.a(3, n5);
                    }
                }
                n11 = eh - this.mf;
                int n18 = ei - this.mg;
                this.mf = eh;
                this.mg = ei;
                for (n10 = 0; n10 < 16384; ++n10) {
                    rs.a.j j2 = this.cA[n10];
                    if (j2 == null) continue;
                    n8 = 0;
                    while (n8 < 10) {
                        int n19 = n8;
                        j2.k[n19] = j2.k[n19] - n11;
                        int n20 = n8++;
                        j2.l[n20] = j2.l[n20] - n18;
                    }
                    j2.ac -= n11 * 128;
                    j2.ad -= n18 * 128;
                }
                for (n10 = 0; n10 < this.kt; ++n10) {
                    rs.a.k k2 = do[n10];
                    if (k2 == null) continue;
                    n8 = 0;
                    while (n8 < 10) {
                        int n21 = n8;
                        k2.k[n21] = k2.k[n21] - n11;
                        int n22 = n8++;
                        k2.l[n22] = k2.l[n22] - n18;
                    }
                    k2.ac -= n11 * 128;
                    k2.ad -= n18 * 128;
                }
                this.mS = true;
                n10 = 0;
                int n23 = 104;
                n8 = 1;
                if (n11 < 0) {
                    n10 = 103;
                    n23 = -1;
                    n8 = -1;
                }
                n7 = 0;
                n6 = 104;
                n5 = 1;
                if (n18 < 0) {
                    n7 = 103;
                    n6 = -1;
                    n5 = -1;
                }
                for (n4 = n10; n4 != n23; n4 += n8) {
                    for (n3 = n7; n3 != n6; n3 += n5) {
                        int n24 = n4 + n11;
                        int n25 = n3 + n18;
                        for (int i2 = 0; i2 < 4; ++i2) {
                            this.jH[i2][n4][n3] = n24 >= 0 && n25 >= 0 && n24 < 104 && n25 < 104 ? this.jH[i2][n24][n25] : null;
                        }
                    }
                }
                n_0 n_02 = (n_0)this.nL.b();
                while (n_02 != null) {
                    n_02.j -= n11;
                    n_02.k -= n18;
                    if (n_02.j < 0 || n_02.k < 0 || n_02.j >= 104 || n_02.k >= 104) {
                        n_02.b();
                    }
                    n_02 = (n_0)this.nL.d();
                }
                if (this.gd != 0) {
                    this.gd -= n11;
                    this.ge -= n18;
                }
                this.fe = false;
                this.lO = -1;
                rs.d.s.a(this);
                return true;
            }
            if (this.lO == 208) {
                int n56 = this.mU.V();
                this.x.k(n56 == 197 && !this.x.M());
                if (n56 >= 0) {
                    this.C(n56);
                }
                ed = n56;
                this.lO = -1;
                return true;
            }
            if (this.lO == 99) {
                this.lV = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 75) {
                int n57 = this.mU.U();
                int n58 = this.mU.U();
                if (rs.n.e.H[n58].ae != 10) {
                    rs.n.e.H[n58].ae = 2;
                }
                rs.n.e.H[n58].af = n57;
                if (rs.n.e.H[n58].ae == 10) {
                    rs.d.d d2 = rs.d.d.c(rs.n.e.H[n58].af);
                    if (rs.n.e.H[n58].aY) {
                        rs.n.e.H[n58].aW = d2.I;
                        rs.n.e.H[n58].aX = d2.E;
                    } else {
                        rs.n.e.H[n58].aT = d2.r == 1 ? 1500 : d2.r * 500;
                    }
                    if (d2.o.equalsIgnoreCase("Greater demon") || d2.o.equalsIgnoreCase("Black demon") || d2.o.equalsIgnoreCase("Lesser demon")) {
                        rs.n.e.H[n58].aT = 2750;
                    }
                    if (d2.o.equalsIgnoreCase("Abyssal sire") || d2.o.equalsIgnoreCase("Kraken")) {
                        rs.n.e.H[n58].aT = 3500;
                    }
                    if (d2.o.equalsIgnoreCase("Jungle demon")) {
                        rs.n.e.H[n58].aT = 2900;
                    }
                    if (d2.o.equalsIgnoreCase("Infernal imp")) {
                        rs.n.e.H[n58].aT = 800;
                    }
                    if (d2.o.equalsIgnoreCase("Chaos giant")) {
                        rs.n.e.H[n58].aT = 1900;
                    }
                    if (d2.o.equalsIgnoreCase("Tormented demon")) {
                        rs.n.e.H[n58].aT = 2900;
                    }
                    if (d2.o.equalsIgnoreCase("Dark araxyte")) {
                        rs.n.e.H[n58].aT = 4000;
                    }
                    if (d2.o.equalsIgnoreCase("Yama")) {
                        rs.n.e.H[n58].aT = 3500;
                    }
                    if (d2.x == 7572L) {
                        rs.n.e.H[n58].aT = 1400;
                    }
                    if (d2.x == 315L) {
                        rs.n.e.H[n58].aT = 1400;
                    }
                    if (d2.x == 3555L) {
                        rs.n.e.H[n58].aT = 2300;
                    }
                    if (d2.o.equalsIgnoreCase("Zulrah")) {
                        rs.n.e.H[n58].aT = 3400;
                    }
                    if (d2.o.equalsIgnoreCase("The Maiden of Sugadinti")) {
                        rs.n.e.H[n58].aT = 4000;
                    }
                    if (d2.o.equalsIgnoreCase("Blood hydra")) {
                        rs.n.e.H[n58].aT = 5000;
                    }
                    if (d2.o.equalsIgnoreCase("Basilisk knight")) {
                        rs.n.e.H[n58].aT = 2750;
                    }
                    if (d2.o.equalsIgnoreCase("Blood reaver")) {
                        rs.n.e.H[n58].aT = 2250;
                    }
                    if (d2.o.equalsIgnoreCase("Skotizo")) {
                        rs.n.e.H[n58].aT = 5000;
                    }
                    if (d2.o.equalsIgnoreCase("Chaos elemental")) {
                        rs.n.e.H[n58].aT = 2750;
                    }
                    if (d2.o.equalsIgnoreCase("Corporeal beast") || d2.o.equalsIgnoreCase("Mystical corp beast")) {
                        rs.n.e.H[n58].aT = 4000;
                    }
                    if (d2.o.equalsIgnoreCase("Tekton") || d2.o.equalsIgnoreCase("Mystical tekton")) {
                        rs.n.e.H[n58].aT = 4000;
                    }
                    if (d2.o.equalsIgnoreCase("Barrelchest")) {
                        rs.n.e.H[n58].aT = 2150;
                    }
                    if (d2.o.equalsIgnoreCase("Demonic gorilla")) {
                        rs.n.e.H[n58].aT = 2750;
                    }
                    if (d2.o.equalsIgnoreCase("Revenant ork")) {
                        rs.n.e.H[n58].aT = 1750;
                    }
                    if (d2.o.equalsIgnoreCase("Abyssal demon")) {
                        rs.n.e.H[n58].aT = 1850;
                    }
                    if (d2.o.equalsIgnoreCase("Undead pker")) {
                        rs.n.e.H[n58].aT = 1400;
                    }
                    if (d2.o.equalsIgnoreCase("Vet'ion")) {
                        rs.n.e.H[n58].aT = 2100;
                    }
                    if (d2.o.equalsIgnoreCase("Goblin fish")) {
                        rs.n.e.H[n58].aT = 500;
                    }
                    rs.n.e.H[n58].ar = 0;
                    rs.n.e.H[n58].F = 0;
                    rs.n.e.H[n58].aD = d2.w;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 114) {
                this.eN = System.currentTimeMillis() + (long)(1000 * this.mU.S());
                this.eO = 1;
                this.lO = -1;
                return true;
            }
            if (this.lO == 60) {
                this.oF = this.mU.y();
                this.oE = this.mU.O();
                while (this.mU.h < this.lN) {
                    int n59 = this.mU.y();
                    this.c(this.mU, n59);
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 35) {
                int n60 = this.mU.y();
                int n61 = this.mU.y();
                int n62 = this.mU.y();
                int n63 = this.mU.y();
                this.dh[n60] = true;
                this.dg[n60] = n61;
                this.fy[n60] = n62;
                this.dy[n60] = n63;
                this.eg[n60] = 0;
                this.lO = -1;
                return true;
            }
            if (this.lO == 174) {
                int n64 = this.mU.A();
                int n65 = this.mU.A();
                int n66 = this.mU.A();
                if (this.jT && this.ms < 50) {
                    this.nY[this.ms] = n64;
                    this.oo[this.ms] = 0;
                    this.os[this.ms] = 0 + n65 + rs.w.e.a[n64];
                    this.ot[this.ms] = n66;
                    ++this.ms;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 104) {
                int n67 = this.mU.O();
                int n68 = this.mU.N();
                String string = this.mU.F();
                if (n67 >= 1 && n67 <= 5) {
                    if (string.equalsIgnoreCase("null")) {
                        string = null;
                    }
                    this.nh[n67 - 1] = string;
                    this.ni[n67 - 1] = n68 == 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 78) {
                this.gd = 0;
                this.lO = -1;
                return true;
            }
            if (this.lO == 253) {
                String string = this.mU.F();
                if (string.endsWith(":tradereq:")) {
                    String string2 = string.substring(0, string.indexOf(":"));
                    long l3 = o_0.a(string2);
                    boolean bl = false;
                    for (int i10 = 0; i10 < this.jD; ++i10) {
                        if (this.kP[i10] != l3) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to trade with you.", 4, string2);
                    }
                } else if (string.endsWith(":duelreq:")) {
                    String string3 = string.substring(0, string.indexOf(":"));
                    long l4 = o_0.a(string3);
                    boolean bl = false;
                    for (int i11 = 0; i11 < this.jD; ++i11) {
                        if (this.kP[i11] != l4) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to duel with you.", 8, string3);
                    }
                } else if (string.endsWith(":cwarreq:")) {
                    String string4 = string.substring(0, string.indexOf(":"));
                    long l5 = o_0.a(string4);
                    boolean bl = false;
                    for (int i12 = 0; i12 < this.jD; ++i12) {
                        if (this.kP[i12] != l5) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to challenge your clan to a Clan War.", 8, string4);
                    }
                } else if (string.endsWith(":whipddsreq:")) {
                    String string5 = string.substring(0, string.indexOf(":"));
                    long l6 = o_0.a(string5);
                    boolean bl = false;
                    for (int i13 = 0; i13 < this.jD; ++i13) {
                        if (this.kP[i13] != l6) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to whip + dds duel with you.", 8, string5);
                    }
                } else if (string.endsWith(":whipduelreq:")) {
                    String string6 = string.substring(0, string.indexOf(":"));
                    long l7 = o_0.a(string6);
                    boolean bl = false;
                    for (int i14 = 0; i14 < this.jD; ++i14) {
                        if (this.kP[i14] != l7) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to whip duel with you.", 8, string6);
                    }
                } else if (string.endsWith(":gambreq:")) {
                    String string7 = string.substring(0, string.indexOf(":"));
                    long l8 = o_0.a(string7);
                    boolean bl = false;
                    for (int i15 = 0; i15 < this.jD; ++i15) {
                        if (this.kP[i15] != l8) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to gamble with you.", 8, string7);
                    }
                } else if (string.endsWith(":chalreq:")) {
                    String string8 = string.substring(0, string.indexOf(":"));
                    long l9 = o_0.a(string8);
                    boolean bl = false;
                    for (int i16 = 0; i16 < this.jD; ++i16) {
                        if (this.kP[i16] != l9) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        String string9 = string.substring(string.indexOf(":") + 1, string.length() - 9);
                        this.a(string9, 8, string8);
                    }
                } else {
                    if (string.startsWith("<img=1><shad=FFFF3F><col=FE610C>[News]:")) {
                        // empty if block
                    }
                    this.a(string, 0, "");
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 1) {
                int n69;
                for (n69 = 0; n69 < do.length; ++n69) {
                    if (do[n69] == null) continue;
                    Client.do[n69].F = -1;
                }
                for (n69 = 0; n69 < this.cA.length; ++n69) {
                    if (this.cA[n69] == null) continue;
                    this.cA[n69].F = -1;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 50) {
                int n70;
                int n71;
                long l10 = this.mU.E();
                int n72 = this.mU.y();
                String string = o_0.c(o_0.a(l10));
                for (n71 = 0; n71 < this.kA; ++n71) {
                    if (l10 != this.lg[n71]) continue;
                    if (this.jG[n71] != n72) {
                        n70 = this.jG[n71];
                        this.jG[n71] = n72;
                        fb = true;
                        if (n72 > 0 && n70 == 0) {
                            this.a(string + " has logged in.", 5, "");
                        }
                        if (n72 == 0) {
                            this.a(string + " has logged out.", 5, "");
                        }
                    }
                    string = null;
                    break;
                }
                if (string != null && this.kA < 350) {
                    this.lg[this.kA] = l10;
                    this.mT[this.kA] = string;
                    this.jG[this.kA] = n72;
                    ++this.kA;
                    fb = true;
                }
                n71 = 0;
                while (n71 == 0) {
                    n71 = 1;
                    for (n70 = 0; n70 < this.kA - 1; ++n70) {
                        if ((this.jG[n70] == dK || this.jG[n70 + 1] != dK) && (this.jG[n70] != 0 || this.jG[n70 + 1] == 0)) continue;
                        int n73 = this.jG[n70];
                        this.jG[n70] = this.jG[n70 + 1];
                        this.jG[n70 + 1] = n73;
                        String string10 = this.mT[n70];
                        this.mT[n70] = this.mT[n70 + 1];
                        this.mT[n70 + 1] = string10;
                        long l2 = this.lg[n70];
                        this.lg[n70] = this.lg[n70 + 1];
                        this.lg[n70 + 1] = l2;
                        fb = true;
                        n71 = 0;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 110) {
                if (fL == 12) {
                    fb = true;
                }
                this.eY = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 254) {
                this.jZ = this.mU.y();
                if (this.jZ == 1) {
                    this.of = this.mU.A();
                }
                if (this.jZ >= 2 && this.jZ <= 6) {
                    if (this.jZ == 2) {
                        this.kZ = 64;
                        this.la = 64;
                    }
                    if (this.jZ == 3) {
                        this.kZ = 0;
                        this.la = 64;
                    }
                    if (this.jZ == 4) {
                        this.kZ = 128;
                        this.la = 64;
                    }
                    if (this.jZ == 5) {
                        this.kZ = 64;
                        this.la = 0;
                    }
                    if (this.jZ == 6) {
                        this.kZ = 64;
                        this.la = 128;
                    }
                    this.jZ = 2;
                    this.kW = this.mU.A();
                    this.kX = this.mU.A();
                    this.kY = this.mU.y();
                }
                if (this.jZ == 10) {
                    this.kV = this.mU.A();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 248) {
                int n74 = this.mU.T();
                int n75 = this.mU.A();
                if (this.gp != -1) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && cH != 3323) {
                    this.fN = 0;
                    fM = true;
                }
                cH = n74;
                this.fu = n75;
                fb = true;
                eM = true;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 79) {
                int n76 = this.mU.S();
                int n77 = this.mU.T();
                rs.n.e e4 = rs.n.e.H[n76];
                if (e4 != null && e4.aI == 0) {
                    if (n77 < 0) {
                        n77 = 0;
                    }
                    if (n77 > e4.aH - e4.aR) {
                        n77 = e4.aH - e4.aR;
                    }
                    e4.V = n77;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 68) {
                for (int i17 = 0; i17 < this.dP.length; ++i17) {
                    if (this.dP[i17] == this.mj[i17]) continue;
                    this.dP[i17] = this.mj[i17];
                    this.B(i17);
                    fb = true;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 196) {
                long l12 = this.mU.E();
                int n78 = this.mU.D();
                int n79 = this.mU.D();
                boolean bl = false;
                if (!rs.l.j.a(n79)) {
                    for (int i18 = 0; i18 < this.jD; ++i18) {
                        if (this.kP[i18] != l12) continue;
                        bl = true;
                    }
                }
                if (!bl && this.ou == 0) {
                    try {
                        String[] stringArray;
                        this.on[this.nE] = n78;
                        this.nE = (this.nE + 1) % 100;
                        String string = this.mU.F();
                        String string11 = o_0.c(o_0.a(l12));
                        if (string.contains("<N>") && (stringArray = string.split("<N>")).length == 2) {
                            string11 = stringArray[0];
                            string = stringArray[1];
                        }
                        if (n79 != 3) {
                            string = rs.d.c.b(string);
                        }
                        if (n79 > 0) {
                            this.a(string, 7, "@cr" + n79 + "@" + string11);
                        } else {
                            this.a(string, 3, string11);
                        }
                    }
                    catch (Exception exception) {
                        rs.v.a.e("cde1");
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 85) {
                this.oF = this.mU.O();
                this.oE = this.mU.O();
                this.lO = -1;
                return true;
            }
            if (this.lO == 24) {
                this.er = this.mU.P();
                if (this.er == fL) {
                    fL = this.er == 3 ? 1 : 3;
                    fb = true;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 246) {
                int n80 = this.mU.S();
                int n81 = this.mU.A();
                int n82 = this.mU.A();
                if (n82 == 65535) {
                    rs.n.e.H[n80].ae = 0;
                    this.lO = -1;
                    return true;
                }
                rs.d.k k3 = rs.d.k.f(n82);
                rs.n.e.H[n80].ae = 4;
                rs.n.e.H[n80].af = n82;
                rs.n.e.H[n80].aU = k3.M;
                rs.n.e.H[n80].aV = k3.Z;
                rs.n.e.H[n80].aT = k3.G * 100 / n81;
                this.lO = -1;
                return true;
            }
            if (this.lO == 171) {
                boolean bl = this.mU.y() == 1;
                int n83 = this.mU.A();
                rs.n.e.H[n83].aQ = bl;
                this.lO = -1;
                return true;
            }
            if (this.lO == 142) {
                int n84 = this.mU.S();
                if (n84 != 0) {
                    this.C(n84);
                }
                if (this.gp != -1) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && this.fN != 25) {
                    this.fN = 0;
                    fM = true;
                }
                this.fu = n84 == 0 ? -1 : n84;
                fb = true;
                eM = true;
                if (n84 != 26700 && n84 != 2005) {
                    rs.n.d.b();
                    rs.n.a.a.c.b();
                }
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 126) {
                int n85;
                String[] stringArray;
                String[] stringArray2;
                int n86;
                String[] stringArray3;
                Object object;
                String string = this.mU.F();
                int n87 = this.mU.T();
                this.lO = -1;
                for (rs.n.c c2 : rs.n.d.a) {
                    c2.a(n87, string);
                }
                if (n87 == 0) {
                    if (string.startsWith("www.") || string.startsWith("http://") || string.startsWith("https://")) {
                        Client.f(string);
                        this.lO = -1;
                        return true;
                    }
                    if (string.startsWith(":quicks:")) {
                        this.jn = string.substring(8).equalsIgnoreCase("on");
                    }
                    if (string.startsWith(":quickdisable:")) {
                        this.cp = false;
                        this.v.c();
                    }
                }
                if (n87 >= 47709 && n87 <= 47808) {
                    if (string.startsWith("{L}")) {
                        rs.n.c.ab.a(string.replace("{L}", ""), true);
                    } else if (string.startsWith("{I}")) {
                        rs.n.c.ab.b(string.replace("{I}", ""));
                    } else {
                        rs.n.c.ab.a(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n87 >= 47505 && n87 <= 47704) {
                    if (string.startsWith("{T}")) {
                        rs.n.c.ab.a(string.replace("{T}", ""), true, false);
                    } else if (string.startsWith("{S}")) {
                        rs.n.c.ab.a(string.replace("{S}", ""), true, true);
                    } else {
                        rs.n.c.ab.a(string, false, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n87 >= 46608 && n87 <= 46758) {
                    if (string.startsWith("{L}")) {
                        rs.n.c.ba.b(string.replace("{L}", ""), true);
                    } else if (string.startsWith("{I}")) {
                        rs.n.c.ba.b(string.replace("{I}", ""));
                    } else {
                        rs.n.c.ba.b(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n87 >= 46506 && n87 <= 46606) {
                    if (string.startsWith("{T}")) {
                        rs.n.c.ba.a(string.replace("{T}", ""), true);
                    } else {
                        rs.n.c.ba.a(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n87 >= 18144 && n87 <= 18244) {
                    object = string;
                    if (object.contains(">")) {
                        object = object.split("> ")[1];
                    }
                    this.ju[n87 - 18144] = object;
                }
                if (n87 >= 25800 && n87 <= 25999) {
                    object = string;
                    if (object.contains(">")) {
                        object = object.split("> ")[1];
                    }
                    this.ju[n87 - 25800 + 100] = object;
                }
                if (n87 == 55004) {
                    if (string.equalsIgnoreCase("Track")) {
                        rs.n.e.H[18551].am[32] = 330;
                        rs.n.e.H[18551].am[48] = 309;
                    } else {
                        rs.n.e.H[18551].am[32] = 324;
                        rs.n.e.H[18551].am[48] = 303;
                    }
                }
                if (n87 == 1) {
                    int n88;
                    if (string.equalsIgnoreCase("CLEAR_CLICK_TEXT_INT")) {
                        for (int i19 = 51320; i19 < 51920; ++i19) {
                            rs.n.e.H[i19].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("TOGGLE_DZONE_HIDE")) {
                        rs.f.a.aU = !rs.f.a.aU;
                        this.a("<img=163> Hiding other player's dzone bosses has been toggled: " + (rs.f.a.aU ? "@blu@ON" : "@red@OFF"), 0, "");
                    }
                    if (string.equalsIgnoreCase("RIMMINGTON") || string.equalsIgnoreCase("TAVERLY") || string.equalsIgnoreCase("POLLNIVERNEACH") || string.equalsIgnoreCase("RELLEKA") || string.equalsIgnoreCase("FALADOR") || string.equalsIgnoreCase("ARDOUGNE")) {
                        rs.f.a.af = string;
                    }
                    if (string.equalsIgnoreCase("CLEAR_ENCHANTMENT_CHEST")) {
                        rs.n.e.H[50244].V = 0;
                        rs.n.e.H[50249].at = "Success chance: @gre@N/A";
                        rs.n.e.H[49996].at = "N/A";
                        rs.n.e.H[50245].at = "N/A";
                    }
                    if (string.startsWith("WHIP_DDS")) {
                        this.cG = 1;
                    }
                    if (string.startsWith("RESET_FULL_TEXT_INTERFACE")) {
                        for (int i20 = 51203; i20 < 51303; ++i20) {
                            rs.n.e.H[i20].at = "";
                        }
                    }
                    if (string.startsWith("RESET_FULL_TEXT_SCROLL")) {
                        for (int i21 = 51203; i21 < 51303; ++i21) {
                            rs.n.e.H[i21].at = "";
                        }
                        rs.n.e.H[51202].V = 0;
                    }
                    if (string.startsWith("WHIP_ONLY")) {
                        this.cG = 2;
                    }
                    if (string.startsWith("RESET_DUEL_TYPE")) {
                        this.cG = 0;
                    }
                    if (string.startsWith("LMS_LOBBY_OVERLAY_ON")) {
                        this.aE = true;
                    }
                    if (string.startsWith("LMS_LOBBY_OVERLAY_OFF")) {
                        this.aE = false;
                    }
                    if (string.startsWith("HG_LOBBY_OVERLAY_ON")) {
                        this.aJ = true;
                    }
                    if (string.startsWith("HG_LOBBY_OVERLAY_OFF")) {
                        this.aJ = false;
                    }
                    if (string.startsWith("TOGGLE_EXTENDED_ZOOM")) {
                        rs.f.a.aO = !rs.f.a.aO;
                        rs.f.a.d();
                        rs.v_0.a(rs.f.a.aO);
                    }
                    if (string.equalsIgnoreCase("FORCE_LOAD_ON")) {
                        this.iK = true;
                    }
                    if (string.startsWith("SPEC_RESTORE_TICK")) {
                        this.v.j = System.currentTimeMillis();
                    }
                    if (string.startsWith("HEALTH_RESTORE_TICK")) {
                        this.v.k = System.currentTimeMillis();
                    }
                    if (string.startsWith("COMP_CAPE_RESET_COLORS")) {
                        rs.n.c.w.bJ[4] = Client.eR.aD;
                        rs.n.c.w.bJ[0] = Client.eR.aE;
                        rs.n.c.w.bJ[2] = Client.eR.aF;
                        rs.n.c.w.bJ[1] = Client.eR.aG;
                        rs.n.c.w.bJ[3] = Client.eR.aH;
                        rs.n.c.w.bJ[5] = Client.eR.aI;
                    }
                    if (string.startsWith("ITEM_GUIDE_RESET_PREVIEW")) {
                        rs.n.c.ab.l();
                    }
                    if (string.startsWith("ITEM_GUIDE_REFRESH_PREVIEW")) {
                        rs.n.c.ab.m();
                    }
                    if (string.startsWith("ITEM_GUIDE_SELECTED_")) {
                        rs.n.c.ab.c(string);
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_CATEGORY_ATTRIBUTES")) {
                        rs.n.c.ab.h();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_FLUSH_CATEGORIES")) {
                        rs.n.c.ab.j();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_FLUSH_DESCRIPTION")) {
                        rs.n.c.ab.i();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_DESCRIPTION_ATTRIBUTES")) {
                        rs.n.c.ab.k();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_SET_ITEM_SPRITE")) {
                        rs.n.e.H[47708].am[3] = -5000;
                        rs.n.e.H[47708].am[4] = -5000;
                        rs.n.e.h(47706, "wiki/item 0");
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_SET_REVERSE_ROTATION")) {
                        rs.n.c.ab.bM = true;
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_CAT_SCROLL")) {
                        rs.n.e.H[47504].V = 0;
                    }
                    if (string.startsWith("ITEM_GUIDE_BONUS_WIDGET")) {
                        if (string.split(" ")[1].equalsIgnoreCase("ON")) {
                            rs.n.c.ab.a(true);
                        } else {
                            rs.n.c.ab.a(false);
                        }
                    }
                    if (string.startsWith("CLEAR_SYSTEM_UPDATE")) {
                        this.eN = 0L;
                        this.eO = 0;
                    }
                    if (string.startsWith("WARN_UPDATE")) {
                        int n89 = Integer.parseInt(string.split(" ")[1]);
                        if (this.eO != 1) {
                            this.eN = System.currentTimeMillis() + (long)(1000 * n89);
                            this.eO = 2;
                        }
                    }
                    if (string.equalsIgnoreCase("cleardialog")) {
                        this.gb = false;
                        this.fN = 0;
                        fM = true;
                    }
                    if (string.startsWith("WIKI_SELECTED_")) {
                        rs.n.c.ba.c(string);
                    }
                    if (string.equalsIgnoreCase("WIKI_RESET_CATEGORY_ATTRIBUTES")) {
                        rs.n.c.ba.h();
                    }
                    if (string.equalsIgnoreCase("WIKI_FLUSH_CATEGORIES")) {
                        rs.n.c.ba.j();
                    }
                    if (string.equalsIgnoreCase("WIKI_RESET_DESCRIPTION_ATTRIBUTES")) {
                        rs.n.c.ba.i();
                    }
                    if (string.equalsIgnoreCase("WIKI_FLUSH_DESCRIPTION")) {
                        rs.n.c.ba.k();
                    }
                    if (string.equalsIgnoreCase("RESET_HOVER_EQUIPMENT")) {
                        this.jp.clear();
                    }
                    if (string.equalsIgnoreCase("ENABLE_MONEY_HOVER") || string.equalsIgnoreCase("ENABLE_OVERLAY_BAR")) {
                        this.ae = true;
                    }
                    if (string.equalsIgnoreCase("DISABLE_MONEY_HOVER") || string.equalsIgnoreCase("DISABLE_OVERLAY_BAR")) {
                        this.ae = false;
                    }
                    if (string.equalsIgnoreCase("ENABLE_CLAN_WARS_OVERLAY")) {
                        this.K = true;
                    }
                    if (string.equalsIgnoreCase("DISABLE_CLAN_WARS_OVERLAY")) {
                        this.K = false;
                        this.O = 0L;
                    }
                    if (string.equalsIgnoreCase("CLEAR_RIGHT_LEADERBOARD_PANEL")) {
                        for (int i22 = 0; i22 < 25; ++i22) {
                            rs.n.e.H[61052 + i22].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_LEFT_LEADERBOARD_PANEL")) {
                        for (int i23 = 0; i23 < 25; ++i23) {
                            rs.n.e.H[61025 + i23].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("QUICK_PRAYERS_ON")) {
                        this.cp = true;
                        this.v.c();
                    }
                    if (string.equalsIgnoreCase("QUICK_PRAYERS_OFF")) {
                        this.cp = false;
                        this.v.c();
                    }
                    if (string.equalsIgnoreCase("CLEAR_VERZIK_REGION_OFF")) {
                        this.aB = false;
                    }
                    if (string.equalsIgnoreCase("CLEAR_VERZIK_REGION_ON")) {
                        this.aB = true;
                    }
                    if (string.equalsIgnoreCase("CONSTRUCTION_BUILD_OFF")) {
                        rs.f.a.ae = false;
                    }
                    if (string.equalsIgnoreCase("CONSTRUCTION_BUILD_ON")) {
                        rs.f.a.ae = true;
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_DESCRIPTION")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 31;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter description";
                    }
                    if (string.startsWith("PROMPT_DESC,,")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 31;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = string.split(",,")[1];
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_YELL_TAG")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 32;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter yell tag";
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_TITLE")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 33;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter title";
                    }
                    if (string.equalsIgnoreCase("BEGIN_TUTORIAL")) {
                        this.cY = 2;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE")) {
                        this.cY = 5;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE_ORB")) {
                        this.cY = 6;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE_BOOK")) {
                        this.cY = 7;
                    }
                    if (string.equalsIgnoreCase("END_ADVENTURE")) {
                        this.cY = 0;
                    }
                    if (string.equalsIgnoreCase("SUMMER_2020_ON")) {
                        this.aD = true;
                    }
                    if (string.equalsIgnoreCase("SUMMER_2020_OFF")) {
                        this.aD = false;
                    }
                    if (string.equalsIgnoreCase("RAID_INSTANCE_ON")) {
                        this.aC = true;
                    }
                    if (string.equalsIgnoreCase("RAID_INSTANCE_OFF")) {
                        if (this.aC && !rs.f.a.ax) {
                            rs.x.h = true;
                            if (this.fr != null && !this.bI) {
                                ee = 1;
                            } else {
                                this.bI = false;
                            }
                        }
                        this.aC = false;
                    }
                    if (string.equalsIgnoreCase("CLEAR_DROP_SEARCH")) {
                        rs.n.e.H[47010].V = 0;
                        for (int i24 = 47011; i24 <= 47110; ++i24) {
                            rs.n.e.H[i24].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_DROP_INTERFACE")) {
                        int n90 = 47115;
                        rs.n.e.H[47114].V = 0;
                        for (int i25 = 0; i25 < 43; ++i25) {
                            int n26 = ++n90;
                            rs.n.e.H[n26].af = -1;
                            int n27 = ++n90;
                            rs.n.e.H[n27].at = "";
                            int n28 = ++n90;
                            rs.n.e.H[n28].at = "";
                            int n29 = ++n90;
                            ++n90;
                            rs.n.e.H[n29].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_ACHIEVEMENT_TAB")) {
                        rs.n.c.b.d.clear();
                    }
                    if (string.equalsIgnoreCase("BUILD_ACHIEVEMENT_TAB")) {
                        rs.n.c.b.h();
                    }
                    if (string.startsWith("clearcc")) {
                        String[] stringArray4 = string.split(" ");
                        int n95 = Integer.parseInt(stringArray4[1]);
                        if (n95 < 18144) {
                            n95 = 18144;
                        }
                        if (n95 <= 18224) {
                            for (n88 = n95; n88 <= 18244; ++n88) {
                                rs.n.e.H[n88].at = "";
                                this.ju[n88 - 18144] = null;
                            }
                            for (n88 = 25800; n88 <= 25998; ++n88) {
                                rs.n.e.H[n88].at = "";
                                this.ju[n88 - 25800 + 100] = null;
                            }
                        }
                        if (n95 >= 25800) {
                            for (n88 = n95; n88 <= 25998; ++n88) {
                                rs.n.e.H[n88].at = "";
                                this.ju[n88 - 25800 + 100] = null;
                            }
                        }
                    }
                    if (string.equalsIgnoreCase("togglebh")) {
                        rs.f.a.au = !rs.f.a.au;
                        rs.f.a.d();
                        this.a("<img=8> Bounty streak streak display is now: " + (rs.f.a.au ? "@blu@ENABLED" : "@red@DISABLED"), 0, "");
                    }
                    if (string.equalsIgnoreCase("clear_exchange")) {
                        rs.n.c.ae.c.clear();
                    }
                    if (string.startsWith("add_exchange")) {
                        String string12 = string.split(" ")[1];
                        String[] stringArray5 = string12.split(",");
                        n88 = Integer.valueOf(stringArray5[0]);
                        int n96 = Integer.valueOf(stringArray5[1]);
                        rs.n.c.ae.c.add(new Integer[]{n88, n96});
                    }
                    if (string.equalsIgnoreCase("update_exchange")) {
                        rs.n.c.ae.h();
                    }
                    if (string.equalsIgnoreCase("clearsellmarket")) {
                        rs.n.c.au.h();
                    }
                    if (string.startsWith("LOGIN_REWARD_IDX")) {
                        String[] stringArray6 = string.split(" ");
                        this.P = Integer.parseInt(stringArray6[1]);
                    }
                    if (string.equalsIgnoreCase("clearinvoverlay") && this.gp != -1) {
                        this.gp = -1;
                        fM = true;
                    }
                    if (string.equalsIgnoreCase("RESET_BLOOD_POOL_SHOP_SLOTS")) {
                        this.ad.clear();
                    }
                    if (string.equalsIgnoreCase("RESET_BLOOD_TREE_SCROLL")) {
                        rs.n.e.H[65600].V = rs.n.e.H[65600].aH;
                    }
                    if (string.equalsIgnoreCase("clearbuymarket")) {
                        rs.n.c.at.h();
                        rs.n.e.H[65803].V = 0;
                    }
                    if (string.startsWith("setsellitem")) {
                        String[] stringArray7 = string.split(",");
                        int n97 = Integer.parseInt(stringArray7[1]);
                        rs.n.e.c(25342, n97, 32);
                    }
                    if (string.startsWith("DISABLE_QUICK_PRAYERS")) {
                        this.cp = false;
                        this.v.c();
                    }
                    return true;
                }
                if (n87 == 2) {
                    this.x.G = string.equals("null") ? null : string;
                    return true;
                }
                if (n87 == 3) {
                    this.x.H = string.equals("null") ? null : string;
                    return true;
                }
                if (n87 == 4) {
                    this.x.I = string.equals("null") ? null : string;
                    return true;
                }
                if (n87 == 5) {
                    this.x.N = Integer.parseInt(string);
                    return true;
                }
                if (n87 == 6) {
                    this.x.O = Integer.parseInt(string);
                    return true;
                }
                if (n87 == 7) {
                    this.x.P = Integer.parseInt(string);
                    return true;
                }
                if (n87 == 8) {
                    this.x.Q = Integer.parseInt(string);
                    return true;
                }
                if (n87 == 9) {
                    object = string.split(",");
                    this.x.M = Integer.parseInt(object[0]);
                    int n98 = Integer.parseInt(object[1]);
                    this.x.y = n98 > 0 ? this.J[n98 - 1] : null;
                    return true;
                }
                if (n87 == 10) {
                    int n99 = Integer.parseInt(string);
                    ad_0.a(n99 + ad_0.bJ, true);
                }
                if (n87 == 11) {
                    int n100 = Integer.parseInt(string);
                    ad_0.b(n100 + ad_0.bJ, false);
                }
                if (n87 == 12) {
                    int n101 = Integer.parseInt(string);
                    ad_0.a(n101 + ad_0.bJ, false);
                }
                if (n87 == 13 && (stringArray3 = string.split(",")).length == 4) {
                    int n102 = Integer.parseInt(stringArray3[0]);
                    n86 = Integer.parseInt(stringArray3[1]);
                    int n103 = Integer.parseInt(stringArray3[2]);
                    int n104 = Integer.parseInt(stringArray3[3]);
                    this.y.a(n102, n86, n103, n104);
                }
                if (n87 == 14 && (stringArray2 = string.split(",")).length == 2) {
                    int n105 = Integer.parseInt(stringArray2[0]);
                    n86 = Integer.parseInt(stringArray2[1]);
                    q.a a2 = null;
                    switch (n105) {
                        case 1: {
                            a2 = q.a.h;
                            break;
                        }
                        case 2: {
                            a2 = q.a.d;
                            break;
                        }
                        case 3: {
                            a2 = q.a.g;
                            break;
                        }
                        case 4: {
                            a2 = q.a.i;
                            break;
                        }
                        case 5: {
                            a2 = q.a.j;
                            break;
                        }
                        case 6: {
                            a2 = q.a.k;
                            break;
                        }
                        case 7: {
                            a2 = q.a.l;
                            break;
                        }
                        case 8: {
                            a2 = q.a.n;
                            break;
                        }
                        case 14: {
                            a2 = q.a.o;
                            break;
                        }
                        case 15: {
                            a2 = q.a.p;
                            break;
                        }
                        case 16: {
                            a2 = q.a.s;
                            break;
                        }
                        case 17: {
                            a2 = q.a.q;
                            break;
                        }
                        case 18: {
                            a2 = q.a.r;
                            break;
                        }
                        case 19: {
                            a2 = q.a.t;
                            break;
                        }
                        case 20: {
                            a2 = q.a.e;
                            break;
                        }
                        case 21: {
                            a2 = q.a.v;
                            break;
                        }
                        case 22: {
                            a2 = q.a.u;
                            break;
                        }
                        case 23: {
                            a2 = q.a.m;
                            break;
                        }
                        case 24: {
                            a2 = q.a.w;
                            break;
                        }
                        case 25: {
                            a2 = q.a.x;
                            break;
                        }
                        case 26: {
                            a2 = q.a.y;
                            break;
                        }
                        case 27: {
                            a2 = q.a.z;
                            break;
                        }
                        case 28: {
                            a2 = q.a.A;
                            break;
                        }
                        case 29: {
                            a2 = q.a.C;
                            break;
                        }
                        case 30: {
                            a2 = q.a.D;
                            break;
                        }
                        case 31: {
                            a2 = q.a.B;
                            break;
                        }
                        case 32: {
                            a2 = q.a.E;
                            break;
                        }
                        case 33: {
                            a2 = q.a.G;
                            break;
                        }
                        case 34: {
                            a2 = q.a.K;
                            break;
                        }
                        case 35: {
                            a2 = q.a.H;
                            break;
                        }
                        case 36: {
                            a2 = q.a.S;
                            break;
                        }
                        case 37: {
                            a2 = q.a.T;
                            break;
                        }
                        case 38: {
                            a2 = q.a.F;
                            break;
                        }
                        case 39: {
                            a2 = q.a.L;
                            break;
                        }
                        case 40: {
                            a2 = q.a.R;
                            break;
                        }
                        case 41: {
                            a2 = q.a.V;
                            break;
                        }
                        case 42: {
                            a2 = q.a.W;
                            break;
                        }
                        case 43: {
                            a2 = q.a.X;
                            break;
                        }
                        case 44: {
                            a2 = q.a.Y;
                            break;
                        }
                        case 45: {
                            a2 = q.a.J;
                            break;
                        }
                        case 46: {
                            a2 = q.a.M;
                            break;
                        }
                        case 47: {
                            a2 = q.a.O;
                            break;
                        }
                        case 48: {
                            a2 = q.a.U;
                            break;
                        }
                        case 49: {
                            a2 = q.a.P;
                            break;
                        }
                        case 50: {
                            a2 = q.a.N;
                            break;
                        }
                        case 51: {
                            a2 = q.a.Q;
                        }
                    }
                    ArrayList<rs.l.e.q> arrayList = new ArrayList<rs.l.e.q>();
                    boolean bl = false;
                    for (rs.l.e.q q2 : this.u) {
                        if (q2.a() != a2) continue;
                        if (n86 > 0) {
                            q2.a(n86);
                            bl = true;
                            continue;
                        }
                        arrayList.add(q2);
                    }
                    for (rs.l.e.q q2 : arrayList) {
                        this.u.remove(q2);
                    }
                    if (!bl && a2 != null && n86 > 0) {
                        this.u.add(new rs.l.e.q(this, a2, n86));
                    }
                }
                if (n87 == 15 && (stringArray = string.split(",")).length == 3) {
                    int n106 = Integer.valueOf(Integer.parseInt(stringArray[0])) - 1;
                    n86 = Integer.parseInt(stringArray[1]);
                    int n107 = Integer.parseInt(stringArray[2]);
                    this.d(n106, n86, n107);
                }
                if (n87 == 16) {
                    int n108 = Integer.parseInt(string);
                    this.l(n108 - 1);
                }
                if (n87 == 17 && (n85 = Integer.valueOf(Integer.parseInt(string)).intValue()) == 0) {
                    long[] lArray = new long[this.kA];
                    for (n86 = 0; n86 < this.kA; ++n86) {
                        lArray[n86] = this.lg[n86];
                    }
                    for (long l13 : lArray) {
                        this.f(l13);
                    }
                }
                if (n87 == 18) {
                    int n109 = Integer.parseInt(string);
                    if (n109 >= 24057 && n109 <= 24067) {
                        for (int i26 = 24057; i26 <= 24067; ++i26) {
                            rs.n.e.H[i26].E = n109 == i26 ? v_0.f : v_0.g;
                            rs.n.e.H[i26].aG = n109 == i26 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24044 && n109 <= 24049) {
                        for (int i27 = 24044; i27 <= 24049; ++i27) {
                            rs.n.e.H[i27].E = n109 == i27 ? v_0.f : v_0.g;
                            rs.n.e.H[i27].aG = n109 == i27 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24039 && n109 <= 24040) {
                        for (int i28 = 24039; i28 <= 24040; ++i28) {
                            rs.n.e.H[i28].E = n109 == i28 ? v_0.f : v_0.g;
                            rs.n.e.H[i28].aG = n109 == i28 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24033 && n109 <= 24035) {
                        for (int i29 = 24033; i29 <= 24035; ++i29) {
                            rs.n.e.H[i29].E = n109 == i29 ? v_0.f : v_0.g;
                            rs.n.e.H[i29].aG = n109 == i29 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24027 && n109 <= 24029) {
                        for (int i30 = 24027; i30 <= 24029; ++i30) {
                            rs.n.e.H[i30].E = n109 == i30 ? v_0.f : v_0.g;
                            rs.n.e.H[i30].aG = n109 == i30 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24019 && n109 <= 24022) {
                        for (int i31 = 24019; i31 <= 24022; ++i31) {
                            rs.n.e.H[i31].E = n109 == i31 ? v_0.f : v_0.g;
                            rs.n.e.H[i31].aG = n109 == i31 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24003 && n109 <= 24004) {
                        for (int i32 = 24003; i32 <= 24004; ++i32) {
                            rs.n.e.H[i32].E = n109 == i32 ? v_0.f : v_0.g;
                            rs.n.e.H[i32].aG = n109 == i32 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24007 && n109 <= 24008) {
                        for (int i33 = 24007; i33 <= 24008; ++i33) {
                            rs.n.e.H[i33].E = n109 == i33 ? v_0.f : v_0.g;
                            rs.n.e.H[i33].aG = n109 == i33 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24011 && n109 <= 24012) {
                        for (int i34 = 24011; i34 <= 24012; ++i34) {
                            rs.n.e.H[i34].E = n109 == i34 ? v_0.f : v_0.g;
                            rs.n.e.H[i34].aG = n109 == i34 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 24015 && n109 <= 24016) {
                        for (int i35 = 24015; i35 <= 24016; ++i35) {
                            rs.n.e.H[i35].E = n109 == i35 ? v_0.f : v_0.g;
                            rs.n.e.H[i35].aG = n109 == i35 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 61022 && n109 <= 61023) {
                        for (int i36 = 61022; i36 <= 61023; ++i36) {
                            rs.n.e.H[i36].E = n109 == i36 ? v_0.f : v_0.g;
                            rs.n.e.H[i36].aG = n109 == i36 ? v_0.f : v_0.g;
                        }
                    } else if (n109 >= 61018 && n109 <= 61019) {
                        for (int i37 = 61018; i37 <= 61019; ++i37) {
                            rs.n.e.H[i37].E = n109 == i37 ? v_0.f : v_0.g;
                            rs.n.e.H[i37].aG = n109 == i37 ? v_0.f : v_0.g;
                        }
                    } else {
                        int[] nArray;
                        for (int n110 : nArray = new int[]{51311, 51313, 59847, 59848, 59849, 59850, 59851, 59852, 25756, 25757, 25758, 25337, 25338, 54000, 45912, 45923, 61018, 61019, 61022, 61023, 54105, 54106, 54107, 54108, 60271, 60272}) {
                            rs.n.e.H[n110].E = n109 == n110 ? v_0.f : v_0.g;
                            rs.n.e.H[n110].aG = n109 == n110 ? v_0.f : v_0.g;
                        }
                    }
                }
                if (n87 == 19) {
                    int n111 = Integer.parseInt(string);
                    if (n111 == 0) {
                        this.v.b[2] = new f_0("orbs/hp_fill");
                    } else if (n111 == 1) {
                        this.v.b[2] = new f_0("orbs/poison_fill");
                    } else if (n111 == 2) {
                        this.v.b[2] = new f_0("orbs/venom_fill");
                    }
                }
                if (n87 == 20) {
                    String[] stringArray8 = string.split(",");
                    int n112 = Integer.parseInt(stringArray8[0]);
                    int n113 = Integer.parseInt(stringArray8[1]);
                    rs.n.e.c(n112, n113, 32);
                }
                if (n87 == 21) {
                    String[] stringArray9 = string.split(",");
                    String string13 = stringArray9[0];
                    int n114 = Integer.parseInt(stringArray9[1]);
                    int n115 = Integer.parseInt(stringArray9[2]);
                    int n116 = Integer.parseInt(stringArray9[3]);
                    rs.n.e.H[n114].E = new f_0(string13, n115, n116);
                }
                if (n87 == 22) {
                    this.jo = string.replace("[bl]", "\n") + " ";
                }
                if (n87 == 23) {
                    this.co = string.equalsIgnoreCase("null") ? "" : string;
                }
                if (n87 == 24) {
                    String[] stringArray10 = string.split(" ");
                    int n117 = Integer.parseInt(stringArray10[0]);
                    this.jp.put(n117, string);
                }
                if (n87 == 25) {
                    String[] stringArray11 = string.split("/");
                    String string14 = stringArray11[0];
                    int n118 = Integer.parseInt(stringArray11[1]);
                    int n119 = Integer.parseInt(stringArray11[2]);
                    this.z.w = System.currentTimeMillis();
                    this.z.r = string14;
                    this.z.s = n119;
                    this.z.t = n118;
                    this.z.v = -1;
                }
                if (n87 == 26) {
                    this.af = string;
                }
                if (n87 == 27) {
                    String[] stringArray12 = string.split(",");
                    int n120 = Integer.parseInt(stringArray12[0]);
                    int n121 = Integer.parseInt(stringArray12[1]);
                    rs.n.e.H[n120].E = n121 == 1 ? v_0.f : v_0.g;
                    f_0 f_02 = rs.n.e.H[n120].aG = n121 == 1 ? v_0.f : v_0.g;
                }
                if (n87 == 28) {
                    this.O = System.currentTimeMillis() + (long)(Integer.parseInt(string) * 1000);
                }
                if (n87 == 29) {
                    String[] stringArray13 = string.split(",");
                    this.M = Integer.parseInt(stringArray13[0]);
                    this.N = Integer.parseInt(stringArray13[1]);
                }
                if (n87 == 30) {
                    this.L = Integer.parseInt(string);
                }
                if (n87 == 31) {
                    F = Double.parseDouble(string);
                }
                if (n87 == 32) {
                    Client.eR.bd = Integer.parseInt(string);
                }
                if (n87 == 33) {
                    String[] stringArray14 = string.split(" ");
                    int n122 = Integer.parseInt(stringArray14[0]);
                    int n123 = Integer.parseInt(stringArray14[1]);
                    if (do != null && n122 <= do.length - 1 && do[n122] != null) {
                        Client.do[n122].bd = n123;
                    }
                }
                if (n87 == 34) {
                    String[] stringArray15 = string.split(",");
                    int n124 = Integer.parseInt(stringArray15[0]);
                    int n125 = Integer.parseInt(stringArray15[1]);
                    this.if.put(n124 + "," + n125, true);
                }
                if (n87 == 35) {
                    String[] stringArray16 = string.split(",");
                    int n126 = Integer.parseInt(stringArray16[0]);
                    long l14 = Long.parseLong(stringArray16[1]);
                    int n127 = Integer.parseInt(stringArray16[2]);
                    if (l14 != 0L) {
                        for (g g2 : this.m.a) {
                            if (g2.m != l14) continue;
                            g2.i = n126;
                            g2.l = n127;
                        }
                        for (g g3 : this.m.b) {
                            if (g3.m != l14) continue;
                            g3.i = n126;
                            g3.l = n127;
                        }
                    }
                }
                if (n87 == 36) {
                    int n128 = Integer.parseInt(string);
                    rs.n.c.av.m(n128);
                }
                if (n87 == 37) {
                    int n129 = Integer.parseInt(string);
                    this.ad.add(n129);
                }
                if (n87 == 38) {
                    int n130 = Integer.parseInt(string);
                    g_0.m(n130);
                }
                if (n87 == 39) {
                    String[] stringArray17 = string.split(",");
                    int n131 = Integer.parseInt(stringArray17[0]);
                    int n132 = Integer.parseInt(stringArray17[1]);
                    this.Q = n131;
                    long l3 = this.R = n132 != -1 ? System.currentTimeMillis() + (long)(n132 * 1000) : -1L;
                }
                if (n87 == 40) {
                    int n133 = Integer.parseInt(string);
                    rs.n.e.H[n133].bf = false;
                }
                if (n87 == 41) {
                    int n134 = Integer.parseInt(string);
                    rs.n.e.H[n134].bf = true;
                }
                if (n87 == 42) {
                    int n135;
                    this.x.L = n135 = Integer.parseInt(string);
                }
                if (n87 == 43) {
                    String[] stringArray18 = string.split(" ");
                    int n136 = Integer.parseInt(stringArray18[0]);
                    int n137 = Integer.parseInt(stringArray18[1]);
                    this.s = n136;
                    this.t = n137;
                }
                if (n87 == 44) {
                    if (string.contains(",")) {
                        String[] stringArray19 = string.split(",");
                        rs.n.c.w.e = stringArray19[0];
                        rs.n.c.w.f = stringArray19[1];
                        rs.n.c.w.h();
                    } else {
                        rs.n.c.w.e = string;
                        rs.n.c.w.f = null;
                        rs.n.c.w.h();
                    }
                }
                if (n87 == 45) {
                    rs.n.c.w.d = string;
                }
                if (n87 == 46) {
                    String[] stringArray20 = string.split(",");
                    this.aM = Integer.parseInt(stringArray20[0]);
                    this.aN = Integer.parseInt(stringArray20[1]);
                }
                if (n87 == 47) {
                    System.out.println(string);
                }
                if (n87 == 48) {
                    this.bT = System.currentTimeMillis() + Long.parseLong(string);
                }
                if (n87 == 49) {
                    this.bS = string.replace("{n}", "\n");
                }
                if (n87 == 53) {
                    String[] stringArray21 = string.split(" ");
                    int n138 = Integer.valueOf(stringArray21[1]);
                    rs.n.c.ab.a(stringArray21[0], n138);
                }
                if (n87 == 54) {
                    Launcher.n().a("SpawnPK RSPS", string);
                }
                if (n87 == 55) {
                    String[] stringArray22 = string.split(";");
                    int n139 = Integer.parseInt(stringArray22[0]);
                    int n140 = Integer.parseInt(stringArray22[1]);
                    int n141 = Integer.parseInt(stringArray22[4]);
                    int n142 = Integer.parseInt(stringArray22[5]);
                    rs.n.c.b.a(stringArray22[2], stringArray22[3], n139, n140, n141, n142);
                }
                if (n87 == 56) {
                    String[] stringArray23 = string.split(";");
                    String string15 = stringArray23[0];
                    int n143 = Integer.parseInt(stringArray23[1]);
                    int n144 = Integer.parseInt(stringArray23[2]);
                    rs.n.c.b.a(string15, n143, n144);
                }
                if (n87 == 57) {
                    this.aL = Double.parseDouble(string);
                    this.aK = false;
                }
                if (n87 == 58) {
                    this.aL = Double.parseDouble(string);
                    this.aK = true;
                }
                if (n87 == 59) {
                    this.aG = string;
                }
                if (n87 == 60) {
                    this.aH = string;
                }
                if (n87 == 61) {
                    this.aI = string;
                }
                if (n87 == 62) {
                    this.aF = string.equals("FOG_ACTIVE");
                }
                if (n87 == 63) {
                    String[] stringArray24 = string.split(" ");
                    int n145 = Integer.parseInt(stringArray24[0]);
                    rs.n.e.H[n145].V = Integer.parseInt(stringArray24[1]);
                }
                if (n87 == 64) {
                    boolean bl = this.x.D = !this.x.D;
                }
                if (n87 == 65) {
                    this.x.R = System.currentTimeMillis() + Long.parseLong(string);
                }
                if (n87 == 66) {
                    if (string.contains("^")) {
                        String[] stringArray25 = string.split("\\^");
                        this.x.J = stringArray25[0];
                        this.x.K = stringArray25[1];
                    } else {
                        this.x.K = null;
                        this.x.J = null;
                    }
                    if (this.x.J != null && this.x.J.equalsIgnoreCase("None")) {
                        this.x.J = null;
                    }
                }
                if (n87 == 67) {
                    this.x.E = string.equals("CURSED");
                }
                if (n87 == 68) {
                    Launcher.n().a("SpawnPK RSPS", string, true);
                }
                if (n87 == 69) {
                    this.k = string;
                }
                if (n87 == 70) {
                    String[] stringArray26 = string.split(" ");
                    this.aO = Integer.parseInt(stringArray26[0]);
                    this.aP = Integer.parseInt(stringArray26[1]);
                    this.aQ = System.currentTimeMillis() + Long.parseLong(stringArray26[2]);
                    this.aR = stringArray26[3];
                }
                if (n87 == 71) {
                    int n146 = Integer.parseInt(string);
                    for (int i38 = 0; i38 < 60; ++i38) {
                        if (i38 == n146) {
                            rs.n.e.H[50254 + i38].E = rs.n.e.H[50254 + i38].aG = g_0.bI;
                            continue;
                        }
                        if (!rs.n.e.H[50254 + i38].E.t.contains("sprite 30")) continue;
                        rs.n.e.H[50254 + i38].E = rs.n.e.H[50254 + i38].aG = g_0.bJ;
                    }
                }
                if (n87 >= 47000 && n87 <= 47333) {
                    rs.n.e.H[n87].bb = string.contains("\\n") ? -5 : 0;
                }
                if (n87 > 0) {
                    rs.n.e.H[n87].at = string;
                    if (rs.n.e.H[n87].ah == eT[fL]) {
                        fb = true;
                    }
                    if (n87 == 199 && ed == 197) {
                        this.x.k(!this.x.M());
                    }
                }
                return true;
            }
            if (this.lO == 206) {
                this.gw = 0;
                this.gu = this.mU.y();
                this.cE = this.mU.y();
                this.fZ = this.mU.y();
                this.ok = true;
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 240) {
                if (fL == 12) {
                    fb = true;
                }
                this.ko = this.mU.B();
                this.lO = -1;
                return true;
            }
            if (this.lO == 8) {
                int n147 = this.mU.U();
                int n148 = this.mU.A();
                rs.n.e.H[n147].ae = 1;
                rs.n.e.H[n147].af = n148;
                this.lO = -1;
                return true;
            }
            if (this.lO == 122) {
                int n149 = this.mU.U();
                int n150 = this.mU.U();
                int n151 = n150 >> 10 & 0x1F;
                int n152 = n150 >> 5 & 0x1F;
                int n153 = n150 & 0x1F;
                rs.n.e.H[n149].ad = (n151 << 19) + (n152 << 11) + (n153 << 3);
                this.lO = -1;
                return true;
            }
            if (this.lO == 53) {
                int n154;
                fb = true;
                int n155 = this.mU.A();
                rs.n.e e5 = rs.n.e.H[n155];
                int n156 = this.mU.A();
                for (n154 = 0; n154 < n156; ++n154) {
                    int n157;
                    int n158 = this.mU.y();
                    if (n158 == 255) {
                        n158 = this.mU.Y();
                    }
                    e5.az[n154] = n157 = this.mU.U();
                    e5.ax[n154] = n158;
                }
                for (n154 = n156; n154 < e5.az.length; ++n154) {
                    e5.az[n154] = 0;
                    e5.ax[n154] = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 230) {
                int n159 = this.mU.T();
                int n160 = this.mU.A();
                int n161 = this.mU.A();
                int n162 = this.mU.U();
                rs.n.e.H[n160].aU = n161;
                rs.n.e.H[n160].aV = n162;
                rs.n.e.H[n160].aT = n159;
                this.lO = -1;
                return true;
            }
            if (this.lO == 221) {
                this.kB = this.mU.y();
                fb = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 177) {
                this.fe = true;
                this.lE = this.mU.y();
                this.lF = this.mU.y();
                this.lG = this.mU.A();
                this.lH = this.mU.y();
                this.lI = this.mU.y();
                if (this.lI >= 100) {
                    int n163 = this.lE * 128 + 64;
                    int n164 = this.lF * 128 + 64;
                    int n165 = this.c(dw, n164, n163) - this.lG;
                    int n166 = n163 - cJ;
                    int n167 = n165 - cK;
                    int n168 = n164 - cL;
                    int n169 = (int)Math.sqrt(n166 * n166 + n168 * n168);
                    this.cR = (int)(Math.atan2(n167, n169) * 325.949) & 0x7FF;
                    this.cS = (int)(Math.atan2(n166, n168) * -325.949) & 0x7FF;
                    if (this.cR < 128) {
                        this.cR = 128;
                    }
                    if (this.cR > 383) {
                        this.cR = 383;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 249) {
                this.mk = this.mU.N();
                di = this.mU.U();
                this.lO = -1;
                return true;
            }
            if (this.lO == 65) {
                this.a(this.mU, this.lN);
                this.lO = -1;
                return true;
            }
            if (this.lO == 27) {
                this.gb = false;
                this.fN = 1;
                this.dW = "Enter amount:";
                this.dY = "";
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 187) {
                this.gb = false;
                this.fN = 2;
                this.dX = "Enter name:";
                this.dY = "";
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 97) {
                int n170 = this.mU.A();
                this.C(n170);
                if (!(rs.n.e.H[199].at.contains("LMS") && ed == 197 && Client.eR.ay == 6095 || this.fu == -1)) {
                    this.fu = -1;
                    fb = true;
                    eM = true;
                }
                if (this.gp != -1 && this.cY == 0) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0) {
                    this.fN = 0;
                    fM = true;
                }
                if (n170 == 8134) {
                    rs.n.e.H[8143].V = 0;
                }
                if (n170 == 35000) {
                    rs.n.c.ai.e = -1;
                }
                if (n170 == 47500) {
                    rs.n.c.ab.l();
                }
                if (n170 == 63036) {
                    rs.n.c.w.i();
                }
                cH = n170;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 218) {
                this.en = this.mU.W();
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 87) {
                int n171;
                int n172 = this.mU.S();
                this.mj[n172] = n171 = this.mU.X();
                if (this.dP[n172] != n171) {
                    this.dP[n172] = n171;
                    this.B(n172);
                    fb = true;
                    if (this.en != -1) {
                        fM = true;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 36) {
                int n173 = this.mU.S();
                byte by = this.mU.z();
                this.mj[n173] = by;
                if (this.dP[n173] != by) {
                    this.g("@blu@PACKET 36:@bla@ Setting " + n173 + " to " + by);
                    this.dP[n173] = by;
                    this.B(n173);
                    fb = true;
                    if (this.en != -1) {
                        fM = true;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 61) {
                this.es = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 200) {
                int[] nArray;
                int n174 = this.mU.A();
                int n175 = this.mU.B();
                rs.n.e e6 = rs.n.e.H[n174];
                e6.aD = n175;
                for (int n176 : nArray = new int[]{4883, 4888, 4894, 4901, 969, 974, 980, 987}) {
                    if (n174 != n176) continue;
                    e6.aT = 2000;
                    e6.aU = 100;
                    e6.aV = 1900;
                    break;
                }
                if (n175 == -1) {
                    e6.ar = 0;
                    e6.F = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 219) {
                if (!(rs.n.e.H[199].at.contains("LMS") && ed == 197 && Client.eR.ay == 6095 || this.fu == -1)) {
                    this.fu = -1;
                    fb = true;
                    eM = true;
                }
                if (this.gp != -1 && this.cY == 0) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && this.fN != 25) {
                    this.fN = 0;
                    fM = true;
                }
                if (rs.l.f.a.i.b.l() && rs.l.f.a.i.b.k().r()) {
                    rs.l.f.a.i.b.m();
                }
                rs.n.d.b();
                rs.n.a.a.c.b();
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 34) {
                fb = true;
                int n177 = this.mU.A();
                rs.n.e e7 = rs.n.e.H[n177];
                while (this.mU.h < this.lN) {
                    int n178 = this.mU.f();
                    int n179 = this.mU.A();
                    int n180 = this.mU.y();
                    if (n180 == 255) {
                        n180 = this.mU.D();
                    }
                    if (n178 < 0 || n178 >= e7.az.length) continue;
                    e7.az[n178] = n179;
                    e7.ax[n178] = n180;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 105 || this.lO == 84 || this.lO == 147 || this.lO == 215 || this.lO == 4 || this.lO == 117 || this.lO == 156 || this.lO == 44 || this.lO == 160 || this.lO == 101 || this.lO == 151) {
                this.c(this.mU, this.lO);
                this.lO = -1;
                return true;
            }
            if (this.lO == 106) {
                fL = this.mU.O();
                fb = true;
                eM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 164) {
                int n181 = this.mU.S();
                this.C(n181);
                if (this.fN == 25 && this.gb) {
                    this.gb = false;
                }
                this.gp = n181;
                fM = true;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            rs.v.a.e("T1 - " + this.lO + "," + this.lN + " - " + this.jQ + "," + this.jR);
            this.br();
        }
        catch (IOException iOException) {
            this.x();
        }
        catch (Exception exception) {
            int n182;
            Object object;
            exception.printStackTrace();
            if (rs.f.a.d.booleanValue()) {
                System.out.println("Previous packets: ");
                object = jC.iterator();
                while (object.hasNext()) {
                    n182 = object.next();
                    System.out.println(n182);
                }
            }
            object = "T2 - " + this.lO + "," + this.jQ + "," + this.jR + " - " + this.lN + "," + (eh + Client.eR.k[0]) + "," + (ei + Client.eR.l[0]) + " - ";
            for (n182 = 0; n182 < this.lN && n182 < 50; ++n182) {
                object = (String)object + this.mU.g[n182] + ",";
            }
            rs.v.a.e((String)object);
            this.br();
        }
        return true;
    }

    public final void a(int[] nArray, int n2, int n3, int n4) {
        if (n2 >= 128 && n4 >= 128 && n2 <= 13056 && n4 <= 13056) {
            int n5;
            int n6 = this.c(dw, n4, n2) - n3;
            n2 -= cJ;
            n6 -= cK;
            int n7 = rs.a.h.bA[this.cR];
            int n8 = rs.a.h.bB[this.cR];
            int n9 = rs.a.h.bA[this.cS];
            int n10 = rs.a.h.bB[this.cS];
            int n11 = (n4 -= cL) * n9 + n2 * n10 >> 16;
            n4 = n4 * n10 - n2 * n9 >> 16;
            n2 = n11;
            n11 = n6 * n8 - n4 * n7 >> 16;
            n4 = n6 * n7 + n4 * n8 >> 16;
            int n12 = 9;
            int n13 = n5 = rs.f.a.aO ? 4500 : 3500;
            if (n4 >= 50 && n4 <= n5) {
                nArray[0] = e_0.s + (n2 << n12) / n4;
                nArray[1] = e_0.t + (n11 << n12) / n4;
                nArray[2] = n4;
                nArray[3] = e_0.s + (n2 / 2 << n12) / n4;
                nArray[4] = e_0.t + (n11 / 2 << n12) / n4;
                nArray[5] = e_0.s + (n2 / 2 << n12) / n4;
                nArray[6] = e_0.t + (n11 / 2 << n12) / n4;
            } else {
                nArray[0] = 0;
                nArray[1] = 0;
                nArray[2] = 0;
                nArray[3] = 0;
                nArray[4] = 0;
                nArray[5] = 0;
                nArray[6] = 0;
            }
        } else {
            nArray[0] = 0;
            nArray[1] = 0;
            nArray[2] = 0;
            nArray[3] = 0;
            nArray[4] = 0;
            nArray[5] = 0;
            nArray[6] = 0;
        }
    }

    private void bQ() {
        fv.a(130);
        if (!(rs.n.e.H[199].at.contains("LMS") && ed == 197 && Client.eR.ay == 6095 || this.fu == -1)) {
            this.fu = -1;
            fb = true;
            this.eZ = false;
            eM = true;
        }
        if (this.gp != -1) {
            this.gp = -1;
            fM = true;
            this.eZ = false;
        }
        rs.n.d.b();
    }

    public static String o(int n2) {
        Object object = String.valueOf(n2);
        for (int i2 = ((String)object).length() - 3; i2 > 0; i2 -= 3) {
            object = ((String)object).substring(0, i2) + "," + ((String)object).substring(i2);
        }
        if (((String)object).length() > 8) {
            object = "@gre@" + ((String)object).substring(0, ((String)object).length() - 8) + " million @whi@(" + (String)object + ")";
        } else if (((String)object).length() > 4) {
            object = "@cya@" + ((String)object).substring(0, ((String)object).length() - 4) + "K @whi@(" + (String)object + ")";
        }
        return " " + (String)object;
    }

    public Client() {
        rs.l.c_0.b = this;
        this.iy = new ArrayList(10000);
        this.iz = new ArrayList();
        this.jF = new int[104][104];
        this.jG = new int[350];
        this.jH = new rs.h[4][104][104];
        this.jK = false;
        this.jM = new rs.x.e(new byte[rs.f.a.bt.intValue()]);
        this.cA = new rs.a.j[16384];
        this.cC = new int[16384];
        this.jO = new int[1000];
        this.jS = rs.x.e.c();
        this.jT = true;
        cH = -1;
        rs.n.a.a.c.b();
        this.ka = new int[rs.f.e.a];
        this.km = false;
        this.dg = new int[5];
        this.kn = -1;
        this.dh = new boolean[5];
        this.kq = false;
        this.kr = "";
        di = -1;
        dj = false;
        dk = "";
        this.kt = 2048;
        do = new rs.a.k[this.kt];
        this.kv = new int[this.kt];
        this.kx = new int[this.kt];
        this.ky = new rs.x.e[this.kt];
        this.kz = 1;
        this.kC = new int[104][104];
        this.kD = 7759444;
        this.kL = new byte[16384];
        this.kN = new int[rs.f.e.a];
        this.kP = new long[100];
        this.kQ = false;
        this.kR = 3353893;
        this.dy = new int[5];
        this.kS = new int[104][104];
        this.dz = new int[200];
        this.dA = new int[200];
        this.dB = new String[200];
        this.dC = new String[200];
        this.dD = new boolean[200];
        this.dG = new f_0[15];
        this.lf = true;
        this.lg = new long[700];
        this.lh = -1;
        this.lj = false;
        this.dN = -1;
        this.dO = -1;
        this.ln = new int[33];
        this.lo = new int[256];
        this.dP = new int[2000];
        this.lp = false;
        this.lq = 50;
        this.lr = new int[this.lq];
        this.ls = new int[this.lq];
        this.lt = new int[this.lq];
        this.lu = new int[this.lq];
        this.lv = new int[this.lq];
        this.lw = new int[this.lq];
        this.lx = new int[this.lq];
        this.ly = new String[this.lq];
        this.dR = -1;
        this.dS = new f_0[20];
        this.lB = new int[5];
        this.lD = false;
        this.lL = 2301979;
        this.dY = "";
        this.ea = new rs.h();
        this.lT = false;
        ed = -1;
        this.eg = new int[5];
        this.md = false;
        this.me = new f_0[100];
        this.en = -1;
        this.eo = new int[rs.f.e.a];
        this.mj = new int[2000];
        this.ml = true;
        this.eq = new int[152];
        this.er = -1;
        this.et = new rs.h();
        this.mp = new int[33];
        this.eu = new rs.n.e();
        this.mq = new rs.l.a[100];
        this.mt = 5063219;
        this.mu = new int[7];
        this.mA = new int[1000];
        this.mB = new int[1000];
        this.mS = false;
        this.mT = new String[350];
        this.mU = rs.x.e.c();
        this.eE = new int[9];
        this.eF = new int[500];
        this.eG = new int[500];
        this.eH = new int[500];
        this.eI = new int[500];
        this.eJ = new int[500];
        this.mW = new f_0[21];
        this.eK = new f_0[20];
        this.mX = new f_0[20];
        eM = false;
        this.eQ = "";
        this.nh = new String[5];
        this.ni = new boolean[5];
        this.eS = new int[4][13][13];
        this.nj = 2;
        this.no = new f_0[1000];
        this.np = false;
        this.eZ = false;
        this.fa = new f_0[8];
        this.nv = true;
        fb = false;
        this.fc = false;
        this.nz = false;
        this.nA = false;
        this.fe = false;
        this.nF = 1;
        this.fk = "";
        this.fl = "";
        this.fm = "";
        this.nI = false;
        this.nK = -1;
        this.nL = new rs.h();
        this.fs = 128;
        this.fu = -1;
        fv = rs.x.e.c();
        this.fx = new String[500];
        this.fy = new int[5];
        this.nY = new int[50];
        this.ob = 2;
        fA = 78;
        this.fB = "";
        fE = new f_0[107];
        fL = 3;
        fM = false;
        this.oj = true;
        this.fO = new int[152];
        this.fP = new f[4];
        this.ok = false;
        this.on = new int[100];
        this.oo = new int[50];
        this.op = false;
        this.os = new int[50];
        this.ot = new int[50];
        this.ov = false;
        this.ga = false;
        this.gb = false;
        this.oC = "";
        this.oD = "";
        this.gp = -1;
        this.oJ = 2;
        this.oK = new int[4000];
        this.oL = new int[4000];
        this.oP = -1;
    }

    public static void f(String string) {
        if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uRI = new URI(string);
                Desktop.getDesktop().browse(uRI);
                return;
            }
            catch (IOException | URISyntaxException exception) {
                exception.printStackTrace();
            }
        }
        String string2 = System.getProperty("os.name");
        try {
            if (string2.toLowerCase().indexOf("mac") >= 0) {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("open " + string);
            } else if (string2.toLowerCase().indexOf("win") >= 0) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + string);
            } else {
                String[] stringArray = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
                String string3 = null;
                for (int i2 = 0; i2 < stringArray.length && string3 == null; ++i2) {
                    if (Runtime.getRuntime().exec(new String[]{"which", stringArray[i2]}).waitFor() != 0) continue;
                    string3 = stringArray[i2];
                }
                if (string3 == null) {
                    throw new Exception("Could not find web browser");
                }
                Runtime.getRuntime().exec(new String[]{string3, string});
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void ad() {
        if (this.au()) {
            long l2 = System.nanoTime();
            long l3 = l2 - this.gB;
            this.gB = l2;
            if (this.fc) {
                this.e(l3);
            }
        }
    }

    public void e(long l2) {
        double d2 = Client.b(this.ar(), l2);
        double d3 = Client.b(this.ap(), l2);
        if (gC <= -5000000.0) {
            gC = 0.0;
        }
        if (gC >= 5000000.0) {
            gC = 0.0;
        }
        gD += d3 / 2.0;
        gD = com.google.a.m.d.a((double)gD, (double)0.39269908169872414, (double)(this.aq() ? 1.5707963267948966 : 1.175029283520401));
        int n2 = Client.b(gC += d2 / 2.0);
        int n3 = Client.b(gD);
        this.r(n2);
        this.q(n3);
    }

    public static int b(double d2) {
        return (int)(d2 / 0.0030679615757712823) & 0x7FF;
    }

    public static double b(int n2, long l2) {
        double d2 = (double)n2 * 0.0030679615757712823;
        double d3 = (double)l2 / 2.0E7;
        return d2 * d3;
    }

    public int ae() {
        return this.ax() && this.aC() ? (int)(((double)this.B().getWidth() - this.aF().getWidth()) / 2.0) : 0;
    }

    public int af() {
        return this.ax() && this.aC() ? (int)(((double)this.B().getHeight() - this.aF().getHeight()) / 2.0) : 0;
    }

    public int ag() {
        return !Client.ai() ? 4 : 0;
    }

    public int ah() {
        return !Client.ai() ? 4 : 0;
    }

    public static boolean ai() {
        return rs.f.a.ai == a.c.b;
    }

    public static boolean aj() {
        return rs.f.a.ai == a.c.a;
    }

    public void p(int n2) {
        this.gH = n2;
    }

    public int ak() {
        return this.gH;
    }

    public int al() {
        return this.at() / 2;
    }

    public int am() {
        return this.as() / 2;
    }

    public int an() {
        return this.cS;
    }

    public int ao() {
        return this.cR;
    }

    public int ap() {
        return this.nN;
    }

    public void q(int n2) {
        this.fs = n2;
    }

    public void r(int n2) {
        this.ft = n2;
    }

    public boolean aq() {
        return rs.v_0.g;
    }

    public void s(int n2) {
        this.nN = n2;
    }

    public int ar() {
        return this.nM;
    }

    public void t(int n2) {
        this.nM = n2;
    }

    public int as() {
        return ak;
    }

    public int at() {
        return aj;
    }

    public boolean au() {
        return rs.k.e.a();
    }

    public int av() {
        return ai;
    }

    public int aw() {
        return ah;
    }

    public boolean ax() {
        return this.ay() && (this.aF().getWidth() > 775.0 || this.aF().getHeight() > 513.0);
    }

    public boolean ay() {
        return this.az() && !Client.ai() && rs.k.e.a() && this.fc;
    }

    public boolean az() {
        return rs.k.e.a() && rs.k.b.i;
    }

    public boolean aA() {
        return oQ;
    }

    public void f(boolean bl) {
        oQ = bl;
    }

    public boolean aB() {
        return rs.k.b.l;
    }

    public boolean aC() {
        return rs.k.b.j;
    }

    public void u(int n2) {
        oR = 1.0 + (double)n2 / 100.0;
    }

    public double aD() {
        return oR;
    }

    public Dimension aE() {
        if (!this.ay()) {
            this.gI.getSize();
        }
        if (oT == null) {
            if (Client.ai()) {
                Container container = this.aY();
                int n2 = container.getWidth();
                int n3 = container.getHeight();
                int n4 = (int)((double)n2 / oR);
                int n5 = (int)((double)n3 / oR);
                if (n4 < 765 || n5 < 503) {
                    double d2 = (double)n2 / 765.0;
                    double d3 = (double)n3 / 503.0;
                    double d4 = Math.min(d2, d3);
                    n4 = (int)((double)n2 / d4);
                    n5 = (int)((double)n3 / d4);
                }
                oT = new Dimension(ai, ah);
            } else {
                oT = new Dimension(765, 503);
            }
        }
        return oT;
    }

    public Dimension aF() {
        if (oS == null) {
            Component component = this.B();
            if (this.gI == null) {
                this.aX();
                return this.aE();
            }
            int n2 = component.getWidth();
            int n3 = component.getHeight();
            Dimension dimension = this.aE();
            if (this.aC()) {
                double d2 = dimension.getWidth() / dimension.getHeight();
                int n4 = (int)((double)n3 * d2);
                int n5 = n3;
                if (n4 > n2) {
                    n5 = (int)((double)n2 / d2);
                    if ((double)(this.B().getHeight() - n5) / 2.0 <= 0.0) {
                        n3 = n5;
                    }
                } else {
                    n2 = n4;
                }
            }
            if (this.aB()) {
                if (n2 > dimension.width) {
                    n2 -= n2 % dimension.width;
                }
                if (n3 > dimension.height) {
                    n3 -= n3 % dimension.height;
                }
            }
            oS = new Dimension(n2, n3);
        }
        return oS;
    }

    public void g(boolean bl) {
        oT = null;
        oS = null;
        if (!bl || Client.ai()) {
            // empty if block
        }
    }

    public rs.runelite.a.f aG() {
        if (rs.v_0.t != -1 && rs.v_0.u != -1) {
            return rs.runelite.a.f.a(rs.v_0.t, rs.v_0.u);
        }
        return null;
    }

    public int aH() {
        return this.eV - 1;
    }

    public int aI() {
        int n2 = this.eV - 1;
        if (n2 < 0) {
            return -1;
        }
        return this.eI[n2];
    }

    public rs.a.k aJ() {
        return eR;
    }

    public rs.a.j[] aK() {
        return this.cA;
    }

    public int aL() {
        return 512;
    }

    public int aM() {
        return al;
    }

    public int aN() {
        return rs.v_0.j;
    }

    public int aO() {
        return rs.v_0.k;
    }

    public int aP() {
        return rs.v_0.l;
    }

    public int[][][] aQ() {
        return this.fC;
    }

    public int aR() {
        return eh;
    }

    public int aS() {
        return ei;
    }

    static {
        int n2;
        c = new HashMap<Integer, Boolean>();
        f = false;
        h = false;
        j = 0L;
        E = 0L;
        F = 10.0;
        T = 0;
        ib = 0L;
        ic = 0L;
        aa = new o();
        ab = new rs.l.e.k();
        ac = new int[]{12282, 28990, 5312, 2295, 13838, 12616, 31236, 31523, 27731, 31546, 31548, 31549, 31550, 31545, 7735, 6578, 6577, 6590, 6844, 5419, 2399, 31524, 31231, 31779, 31789, 32002, 31749, 31746, 31995, 32005, 31996, 31766, 31767, 28975, 28976, 28977, 28978, 28979, 28980, 28981, 28982, 28983, 28984, 28988, 28989, 28996, 28997, 28998, 28999, 29000, 29001, 29002, 29003, 29004, 29005, 29006, 29007, 29021, 29022, 29023, 29025, 29026, 29027, 29028, 29030, 29031, 29039, 32792, 32788, 32789, 32790, 32787, 32204, 54062, 55763, 32211, 51781, 27728, 27728, 28045, 50939, 34668, 24587, 24582, 17423, 13191, 12409, 10482, 57610, 58210, 58211, 58213, 58214, 58434, 58435, 59042, 59043, 59057, 59062, 59065, 59066, 59068, 59074, 59077, 59082, 59085, 59086, 59089, 59092, 59093, 59127, 59129, 59132, 59138, 59147, 59151, 59157, 59159, 59160, 59162, 2260, 48516, 48584, 48706, 4935, 2929, 3788, 31993, 56202, 56203, 56204, 56205, 56206, 56207, 42001, 42003, 35106, 34648, 33263, 33273, 56284, 56285, 58219, 58220, 58223, 58224, 58226, 58849, 58850, 58853, 58530, 58610, 60121, 60177, 58539, 58615, 58543, 58601, 52298, 12778, 12817, 34134, 40946, 40947, 40948, 33202, 33200, 33201, 42002, 42783, 42818, 31751, 31999, 31988, 31773, 32011, 31770, 31971, 31772, 32416, 32421, 32689, 32680, 32466, 32516, 32517, 32526, 32525, 32523, 32522, 32681, 32411, 32427, 42015, 42016, 42017, 42018, 42019, 42003, 42004, 42005, 42006, 42007, 42008, 42009, 42010, 42012, 42013, 5214, 34655, 34662, 58288, 2412, 41969, 58199, 58200, 58196, 58197, 58198, 58201, 58195, 58203, 43237, 43123, 43159, 48483, 48560, 48648, 43174, 43172, 43246, 39672, 43235, 43177, 43176, 43226, 43209, 43249, 43178, 27705, 27706, 27709, 27762, 27823, 43180, 43186, 43187, 43190, 43192, 43193, 43194, 43195, 43196, 43248, 60776, 2361, 40949, 40950, 2676};
        ag = false;
        aj = 512;
        ak = 334;
        aV = 0;
        aW = -1;
        aX = 0;
        aY = 0;
        aZ = new int[]{4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562};
        ba = false;
        bb = 0;
        bc = 0;
        bd = 0;
        be = 0;
        bf = 0;
        bg = 0;
        ii = 0L;
        bh = 0L;
        bi = 0L;
        bn = new cc();
        bC = -1;
        bD = false;
        bE = 0;
        bF = 0;
        bG = 0;
        bH = 0;
        iA = new Random();
        bJ = new int[]{40, 57, 58, 59, 60, 61, 24, 1, 64, 66, 34, 52, 51, 62, 67, 68, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339};
        bK = new int[]{17, 53, 54, 55, 63, 56};
        bL = 0;
        bM = 1;
        bN = 150;
        bO = -1;
        bP = 150;
        bQ = -1;
        bR = false;
        ch = false;
        ci = 0L;
        cq = 0;
        cr = 0;
        jy = new int[]{2459, 2469, 2480, 2492, 14170};
        jz = new int[]{4882, 4887, 4893, 4900, 30700};
        jC = new ArrayList();
        cx = new ArrayList();
        cy = new int[]{0, 0, 0, 0, 0, 0, 0};
        cI = -1;
        cM = -1;
        dK = 10;
        dM = true;
        dU = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 491769, 10, 17050, 1, 491770, 130770, 374770, 926, 76770, 34770, 2, 3, 6, 4, 5, 123770}};
        dV = new int[][]{{2, 40}, {3, 56}, {6, 60}, {4, 62}, {5, 54}};
        ej = -1;
        ek = null;
        eT = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        fn = "";
        fz = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
        lU = new int[99];
        int n3 = 0;
        for (n2 = 0; n2 < 99; ++n2) {
            int n4 = n2 + 1;
            int n5 = (int)((double)n4 + 300.0 * Math.pow(2.0, (double)n4 / 7.0));
            Client.lU[n2] = (n3 += n5) / 4;
        }
        fQ = new int[32];
        n3 = 2;
        for (n2 = 0; n2 < 32; ++n2) {
            Client.fQ[n2] = n3 - 1;
            n3 += n3;
        }
    }

    private static final class a {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        rs.n.e k;
        String l;

        private a() {
        }

        void a(Client client, int n2) {
            this.a = client.eI[n2];
            this.b = client.eJ[n2];
            this.c = client.eF[n2];
            this.d = client.eG[n2];
            this.e = client.eH[n2];
            this.l = client.fx[n2];
            this.k = rs.n.e.H[this.d];
            this.f = rs.Client$a.a(this.k, cH) ? cH : -1;
            this.g = rs.Client$a.a(this.k, client.fu) ? client.fu : -1;
            this.h = rs.Client$a.a(this.k, client.gp) ? client.gp : -1;
            this.i = fL;
            this.j = rs.Client$a.a(this.k, eT[this.i]) ? eT[this.i] : -1;
        }

        private static boolean a(rs.n.e e2, int n2) {
            if (n2 < 0) {
                return false;
            }
            for (int i2 = 0; e2 != null && i2 < 32; ++i2) {
                if (e2.aw == n2 || e2.ah == n2) {
                    return true;
                }
                int n3 = e2.ah;
                if (n3 == e2.aw || n3 < 0 || n3 >= rs.n.e.H.length) {
                    return false;
                }
                e2 = rs.n.e.H[n3];
            }
            return false;
        }

        boolean a(Client client) {
            rs.n.e e2 = rs.n.e.H[this.d];
            return !(this.f != -1 && this.f != cH || this.g != -1 && this.g != client.fu || this.h != -1 && this.h != client.gp || this.j != -1 && this.j != eT[this.i] || e2 == null || e2 != this.k || e2.az == null || this.c < 0 || this.c >= e2.az.length || e2.az[this.c] != this.b + 1);
        }

        /* synthetic */ a(d d2) {
            this();
        }
    }
}

