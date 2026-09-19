/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
 */
package rs.cache;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import rs.Client;
import rs.b_0;
import rs.cache.e;
import rs.cache.osrs.b;
import rs.cache.osrs.c;
import rs.h;
import rs.v.a;
import rs.x.f;

public final class d
extends e
implements Runnable {
    private static int o = 0;
    public static List<Integer> a = new ArrayList<Integer>();
    private final Object p = new Object();
    public final rs.cache.b b = new rs.cache.b();
    public final rs.cache.b c = new rs.cache.b();
    public final rs.cache.b d = new rs.cache.b();
    public final rs.cache.b e = new rs.cache.b();
    public static int f = 0;
    private final h q = new h();
    private final h r;
    private final h s;
    private final h t;
    private final h u;
    private int v;
    private int w;
    private rs.cache.c x;
    public rs.t.a.e g;
    private int y;
    private int z;
    public String h = "";
    private int A;
    private long B;
    public int[] i;
    private final CRC32 C = new CRC32();
    private final byte[] D = new byte[500];
    public int j;
    private final byte[][] E = new byte[4][];
    private Client F;
    private int G;
    private int H;
    private int[] I;
    public int k;
    public int[] l;
    private int J;
    private boolean K = true;
    private OutputStream L;
    public int[] m;
    private boolean M = false;
    private final byte[] N;
    private int[] O;
    private final b_0 P;
    private InputStream Q;
    private Socket R;
    private final int[][] S;
    private final int[][] T;
    public int[] n;
    private byte[] U;
    private int V;

    public void a() {
        this.b.a("main_file_cache.dat", "main_file_cache.idx");
        this.c.a("main_file_osrs.dat", "main_file_osrs.idx");
        this.d.a("main_file_cache.dat", "main_file_cache.idx");
        this.e.a("main_file_osrs.dat", "main_file_osrs.idx");
        if (rs.f.a.d.booleanValue()) {
            b b2 = new b(this.c);
            b2.a();
        }
    }

    private boolean a(int n2, int n3, byte[] byArray) {
        if (byArray == null || byArray.length < 2) {
            return false;
        }
        int n4 = byArray.length - 2;
        int n5 = ((byArray[n4] & 0xFF) << 8) + (byArray[n4 + 1] & 0xFF);
        this.C.reset();
        this.C.update(byArray, 0, n4);
        return n5 == n2 && (int)this.C.getValue() == n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (n2 < 0 || n3 < 0) {
            return;
        }
        Object object = this.p;
        synchronized (object) {
            rs.cache.c c2 = (rs.cache.c)this.P.b();
            while (c2 != null) {
                if (c2.j == n2 && c2.m == n3) {
                    return;
                }
                c2 = (rs.cache.c)this.P.c();
            }
            c2 = new rs.cache.c();
            c2.j = n2;
            c2.k = rs.cache.osrs.c.a() ? 1 : 0;
            c2.m = n3;
            c2.n = true;
            c2.p = n4;
            c2.q = n5;
            c2.r = n6;
            h h2 = this.r;
            synchronized (h2) {
                this.r.a(c2);
            }
            this.P.a(c2);
        }
    }

    @Override
    public void a(int n2) {
        this.a(0, n2);
    }

    public void a(int n2, int n3) {
        this.a(n2, n3, 0, 0, 0);
    }

    public int b(int n2) {
        return Short.MAX_VALUE;
    }

    @Override
    public void run() {
        try {
            while (this.K) {
                int n2;
                ++this.j;
                int n3 = 20;
                if (this.z == 0 && this.b.a()[0] != null) {
                    n3 = 50;
                }
                try {
                    Thread.sleep(n3);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                this.M = true;
                for (n2 = 0; n2 < 100 && this.M; ++n2) {
                    this.M = false;
                    this.k();
                    this.l();
                    if (this.v == 0 && n2 >= 5) break;
                    this.m();
                    if (this.Q == null) continue;
                    this.n();
                }
                n2 = 0;
                rs.cache.c c2 = (rs.cache.c)this.q.b();
                while (c2 != null) {
                    if (c2.n) {
                        n2 = 1;
                        ++c2.o;
                        if (c2.o > 50) {
                            c2.o = 0;
                            this.a(c2);
                        }
                    }
                    c2 = (rs.cache.c)this.q.d();
                }
                if (n2 == 0) {
                    c2 = (rs.cache.c)this.q.b();
                    while (c2 != null) {
                        n2 = 1;
                        ++c2.o;
                        if (c2.o > 50) {
                            c2.o = 0;
                            this.a(c2);
                        }
                        c2 = (rs.cache.c)this.q.d();
                    }
                }
                if (n2 != 0) {
                    ++this.V;
                    if (this.V <= 750) continue;
                    try {
                        this.R.close();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.R = null;
                    this.Q = null;
                    this.L = null;
                    this.H = 0;
                    continue;
                }
                this.V = 0;
                this.h = "";
            }
        }
        catch (Exception exception) {
            rs.v.a.e("od_ex " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(int n2, int n3) {
        if (this.b.a()[0] == null) {
            return;
        }
        if (this.z == 0) {
            return;
        }
        rs.cache.c c2 = new rs.cache.c();
        c2.j = n3;
        c2.m = n2;
        c2.n = false;
        if (rs.cache.osrs.c.a()) {
            c2.k = 1;
        }
        h h2 = this.s;
        synchronized (h2) {
            this.s.a(c2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public rs.cache.c b() {
        rs.cache.c c2;
        Object object = this.u;
        synchronized (object) {
            c2 = (rs.cache.c)this.u.a();
        }
        if (c2 == null) {
            return null;
        }
        object = this.p;
        synchronized (object) {
            c2.a();
        }
        if (c2.l == null) {
            return c2;
        }
        boolean bl = false;
        if (c2.i) {
            try (GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream((InputStream)new ByteArrayInputStream(c2.l));){
                c2.l = gzipCompressorInputStream.readAllBytes();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                System.out.println("[dataType=" + c2.j + "] [fileID=" + c2.m + "] [osrs=" + (c2.k == 1) + "]");
            }
        }
        return c2;
    }

    public byte[] a(int n2, int n3, int n4) {
        byte[] byArray = (n4 == 1 ? this.e : this.d).a()[n2 + 1].a(n3);
        if (byArray != null) {
            try (GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream((InputStream)new ByteArrayInputStream(byArray));){
                byte[] byArray2 = gzipCompressorInputStream.readAllBytes();
                return byArray2;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void k() {
        rs.cache.c c2;
        Object object = this.r;
        synchronized (object) {
            c2 = (rs.cache.c)this.r.a();
        }
        while (c2 != null) {
            h h2;
            h h3;
            Object object2;
            this.M = true;
            object = null;
            if (c2.j == 0 && !rs.f.a.aj && Client.bn.b(c2.m) != null && c2.k != 1) {
                object2 = new File(rs.v.a.f() + "raw/" + c2.m + ".dat");
                if (!((File)object2).exists()) {
                    object2 = new File(rs.v.a.f() + "raw/" + c2.m);
                }
                if (((File)object2).exists()) {
                    object = Client.a(((File)object2).getAbsolutePath());
                    h3 = this.r;
                    synchronized (h3) {
                        c2.l = (byte[])object;
                        c2.i = false;
                        h2 = this.u;
                        synchronized (h2) {
                            this.u.a(c2);
                        }
                        c2 = (rs.cache.c)this.r.a();
                        continue;
                    }
                }
            }
            Object object3 = object2 = c2.k == 1 ? this.c : this.b;
            if (((rs.cache.b)object2).a()[0] != null) {
                object = ((rs.cache.b)object2).a()[c2.j + 1].a(c2.m);
            }
            h3 = this.r;
            synchronized (h3) {
                if (object == null) {
                    this.t.a(c2);
                } else {
                    c2.l = (byte[])object;
                    h2 = this.u;
                    synchronized (h2) {
                        this.u.a(c2);
                    }
                }
                c2 = (rs.cache.c)this.r.a();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(byte by, int n2, int n3) {
        if (this.b.a()[0] == null) {
            return;
        }
        Object object = this.p;
        synchronized (object) {
            byte[] byArray = this.b.a()[n2 + 1].a(n3);
            this.E[n2][n3] = by;
            if (by > this.z) {
                this.z = by;
            }
            ++this.y;
        }
    }

    public boolean c(int n2) {
        for (int i2 = 0; i2 < this.n.length; ++i2) {
            if (this.i[i2] != n2) continue;
            return true;
        }
        return false;
    }

    private void l() {
        this.v = 0;
        this.w = 0;
        rs.cache.c c2 = (rs.cache.c)this.q.b();
        while (c2 != null) {
            if (c2.n) {
                ++this.v;
                if (f < 100 || rs.f.a.d.booleanValue()) {
                    System.out.println("Error: model is incomplete or missing  [ type = " + c2.j + "]  [id = " + c2.m + "]  [rev = " + c2.k + "]");
                    ++f;
                }
            } else {
                ++this.w;
            }
            c2 = (rs.cache.c)this.q.d();
        }
        while (this.v < rs.cache.d.c()) {
            c2 = (rs.cache.c)this.t.a();
            try {
                if (c2 == null) break;
                if (this.E[c2.j][c2.m] != 0) {
                    ++this.J;
                }
                this.E[c2.j][c2.m] = 0;
                this.q.a(c2);
                ++this.v;
                this.a(c2);
                this.M = true;
                if (f >= 100 && !rs.f.a.d.booleanValue()) continue;
                System.out.println("Error: file is missing  [ type = " + c2.j + "]  [id = " + c2.m + "]");
                ++f;
            }
            catch (Exception exception) {
                if (f >= 100 && !rs.f.a.d.booleanValue()) continue;
                System.out.println("missing: type: " + c2.j + " ID" + c2.m + " REV" + c2.k);
                ++f;
            }
        }
    }

    public static int c() {
        return rs.f.a.d != false ? 100 : 10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        h h2 = this.s;
        synchronized (h2) {
            this.s.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void m() {
        while (this.v == 0 && this.w < rs.cache.d.c() && this.z != 0) {
            rs.cache.c c2;
            h h2 = this.s;
            synchronized (h2) {
                c2 = (rs.cache.c)this.s.a();
            }
            while (c2 != null) {
                if (this.E[c2.j][c2.m] != 0) {
                    this.E[c2.j][c2.m] = 0;
                    this.q.a(c2);
                    this.a(c2);
                    this.M = true;
                    if (this.J < this.y) {
                        ++this.J;
                    }
                    this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
                    ++this.w;
                    if (this.w == 10) {
                        return;
                    }
                }
                h2 = this.s;
                synchronized (h2) {
                    c2 = (rs.cache.c)this.s.a();
                }
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                byte[] byArray = this.E[i2];
                int n2 = byArray.length;
                for (int i3 = 0; i3 < n2; ++i3) {
                    if (byArray[i3] != this.z) continue;
                    byArray[i3] = 0;
                    rs.cache.c c3 = new rs.cache.c();
                    c3.j = i2;
                    c3.m = i3;
                    c3.n = false;
                    this.q.a(c3);
                    this.a(c3);
                    this.M = true;
                    if (this.J < this.y) {
                        ++this.J;
                    }
                    this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
                    ++this.w;
                    if (this.w != 10) continue;
                    return;
                }
            }
            --this.z;
        }
    }

    public boolean d(int n2) {
        return this.I[n2] == 1;
    }

    public d() {
        this.s = new h();
        this.u = new h();
        this.N = new byte[465000];
        this.P = new b_0();
        this.S = new int[4][];
        this.T = new int[4][];
        this.t = new h();
        this.r = new h();
    }

    public void e(int n2) {
        System.out.println("[Regions] Attempting to dump region " + n2 + "..");
        for (int i2 = 0; i2 < this.n.length; ++i2) {
            if (this.n[i2] != n2) continue;
            System.out.println("-> Region dump (ID " + n2 + "):");
            System.out.println("mapIndices1[" + i2 + "] = " + n2 + ";");
            System.out.println("mapIndices2[" + i2 + "] = " + this.l[i2] + ";");
            System.out.println("mapIndices3[" + i2 + "] = " + this.i[i2] + ";");
            System.out.println();
            return;
        }
        System.out.println("-> Failed to find region map data!");
    }

    public void e() {
        File file = new File("./dumps/maps");
        file.mkdir();
        for (int i2 = 0; i2 < this.l.length; ++i2) {
            try {
                byte[] byArray = this.b.a()[4].a(this.l[i2]);
                File file2 = new File("./dumps/maps/" + this.l[i2] + ".gz");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byArray);
                fileOutputStream.close();
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void f() {
        byte[] byArray = Client.a(rs.v.a.f() + "map_index.dat");
        rs.x.e e2 = new rs.x.e(byArray);
        int n2 = byArray.length / 6;
        this.n = new int[n2];
        this.l = new int[n2];
        this.i = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.n[i2] = e2.A();
            this.l[i2] = e2.A();
            this.i[i2] = e2.A();
        }
    }

    public void a(f f2, Client client) {
        int n2;
        int n3;
        String[] stringArray = new String[]{"model_version", "anim_version", "midi_version", "map_version"};
        for (int i2 = 0; i2 < 4; ++i2) {
            byte[] byArray = f2.a(stringArray[i2]);
            int n4 = byArray.length / 2;
            rs.x.e e2 = new rs.x.e(byArray);
            this.S[i2] = new int[n4];
            this.E[i2] = new byte[n4];
            for (int i3 = 0; i3 < n4; ++i3) {
                this.S[i2][i3] = e2.A();
            }
        }
        String[] stringArray2 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};
        for (int i4 = 0; i4 < 4; ++i4) {
            byte[] byArray = f2.a(stringArray2[i4]);
            int n5 = byArray.length / 4;
            rs.x.e e3 = new rs.x.e(byArray);
            this.T[i4] = new int[n5];
            for (n3 = 0; n3 < n5; ++n3) {
                this.T[i4][n3] = e3.D();
            }
        }
        byte[] byArray = f2.a("model_index");
        int n6 = this.S[0].length;
        this.U = new byte[n6];
        for (int i5 = 0; i5 < n6; ++i5) {
            this.U[i5] = i5 < byArray.length ? byArray[i5] : (byte)0;
        }
        byArray = Client.a(rs.v.a.f() + "map_index.dat");
        rs.x.e e4 = new rs.x.e(byArray);
        o = n2 = byArray.length / 6;
        n3 = n2 + 100;
        this.n = new int[n3 + 1000];
        this.l = new int[n3 + 1000];
        this.i = new int[n3 + 1000];
        this.m = new int[n3 + 1000];
        for (int i6 = 0; i6 < n2; ++i6) {
            this.n[i6] = e4.A();
            this.l[i6] = e4.A();
            this.i[i6] = e4.A();
        }
        this.g = new rs.t.a.e();
        this.g.a(this.n, this.l, this.i, this.m);
        this.n[107] = 8751;
        this.l[107] = 1946;
        this.i[107] = 1947;
        this.n[108] = 8752;
        this.l[108] = 938;
        this.i[108] = 939;
        this.n[129] = 9007;
        this.l[129] = 1938;
        this.i[129] = 1939;
        this.n[130] = 9008;
        this.l[130] = 946;
        this.i[130] = 947;
        this.n[149] = 9263;
        this.l[149] = 1210;
        this.i[149] = 1211;
        this.n[150] = 9264;
        this.l[150] = 956;
        this.i[150] = 957;
        this.n[1047] = 13361;
        this.l[1047] = 584;
        this.i[1047] = 585;
        this.n[1088] = 13617;
        this.l[1088] = 238;
        this.i[1088] = 239;
        this.n[1106] = -1;
        this.l[1106] = -1;
        this.i[1106] = -1;
        this.n[1105] = -1;
        this.l[1105] = -1;
        this.i[1105] = -1;
        this.n[1064] = 13386;
        this.l[1064] = 1912;
        this.i[1064] = 1913;
        this.n[rs.cache.d.o] = 13130;
        this.l[rs.cache.d.o] = 1900;
        this.i[rs.cache.d.o++] = 1901;
        this.n[1065] = 13387;
        this.l[1065] = 1880;
        this.i[1065] = 1881;
        this.n[rs.cache.d.o] = -1;
        this.l[rs.cache.d.o] = -1;
        this.i[rs.cache.d.o++] = -1;
        this.n[1108] = -1;
        this.l[1108] = -1;
        this.i[1108] = -1;
        this.n[rs.cache.d.o] = -1;
        this.l[rs.cache.d.o] = -1;
        this.i[rs.cache.d.o++] = -1;
        this.n[1109] = -1;
        this.l[1109] = -1;
        this.i[1109] = -1;
        this.n[1021] = 13135;
        this.l[1021] = 1892;
        this.i[1021] = 1893;
        this.n[rs.cache.d.o] = 13134;
        this.l[rs.cache.d.o] = 1884;
        this.i[rs.cache.d.o++] = 1885;
        this.n[1020] = -1;
        this.l[1020] = -1;
        this.i[1020] = -1;
        this.n[925] = -1;
        this.l[925] = -1;
        this.i[925] = -1;
        this.n[1135] = 13899;
        this.l[1135] = 1890;
        this.i[1135] = 1891;
        this.n[rs.cache.d.o] = 13900;
        this.l[rs.cache.d.o] = 1910;
        this.i[rs.cache.d.o++] = 1911;
        this.n[rs.cache.d.o] = 14155;
        this.l[rs.cache.d.o] = 1904;
        this.i[rs.cache.d.o++] = 1905;
        this.n[rs.cache.d.o] = 14156;
        this.l[rs.cache.d.o] = 1878;
        this.i[rs.cache.d.o++] = 1879;
        this.n[1019] = 13131;
        this.l[1019] = 1894;
        this.i[1019] = 1895;
        this.n[926] = -1;
        this.l[926] = -1;
        this.i[926] = -1;
        this.n[rs.cache.d.o] = 12703;
        this.l[rs.cache.d.o] = 3212;
        this.i[rs.cache.d.o++] = 3213;
        this.n[rs.cache.d.o] = 12702;
        this.l[rs.cache.d.o] = 3204;
        this.i[rs.cache.d.o++] = 3205;
        this.n[rs.cache.d.o] = 12701;
        this.l[rs.cache.d.o] = 3208;
        this.i[rs.cache.d.o++] = 3209;
        this.n[rs.cache.d.o] = 12959;
        this.l[rs.cache.d.o] = 3206;
        this.i[rs.cache.d.o++] = 3207;
        this.n[rs.cache.d.o] = 12958;
        this.l[rs.cache.d.o] = 3210;
        this.i[rs.cache.d.o++] = 3211;
        this.n[rs.cache.d.o] = 12957;
        this.l[rs.cache.d.o] = 3214;
        this.i[rs.cache.d.o++] = 3215;
        this.n[rs.cache.d.o] = 14927;
        this.l[rs.cache.d.o] = 1876;
        this.i[rs.cache.d.o++] = 1877;
        this.n[180] = 9023;
        this.l[180] = 1624;
        this.i[180] = 1625;
        this.n[251] = 6810;
        this.l[251] = 2700;
        this.i[251] = 2701;
        this.n[49] = 7513;
        this.l[49] = 2724;
        this.i[49] = 2725;
        this.n[239] = 9377;
        this.l[239] = 1440;
        this.i[239] = 1441;
        this.n[rs.cache.d.o] = 7514;
        this.l[rs.cache.d.o] = 2728;
        this.i[rs.cache.d.o++] = 2729;
        this.n[rs.cache.d.o] = 6481;
        this.l[rs.cache.d.o] = 1348;
        this.i[rs.cache.d.o++] = 1349;
        this.n[rs.cache.d.o] = 6480;
        this.l[rs.cache.d.o] = 1350;
        this.i[rs.cache.d.o++] = 1351;
        this.n[rs.cache.d.o] = 5771;
        this.l[rs.cache.d.o] = 1352;
        this.i[rs.cache.d.o++] = 1353;
        this.n[rs.cache.d.o] = 5772;
        this.l[rs.cache.d.o] = 1354;
        this.i[rs.cache.d.o++] = 1355;
        this.n[++rs.cache.d.o] = 13396;
        this.l[rs.cache.d.o] = 2814;
        this.i[rs.cache.d.o++] = 2815;
        ++o;
        ++o;
        ++o;
        ++o;
        ++o;
        this.n[493] = -1;
        this.l[493] = -1;
        this.i[493] = -1;
        this.n[918] = 0;
        this.l[918] = 0;
        this.i[918] = 0;
        this.n[1063] = -1;
        this.l[1063] = -1;
        this.i[1063] = -1;
        this.n[1424] = 0;
        this.l[1424] = 0;
        this.i[1424] = 0;
        this.n[1016] = 0;
        this.l[1016] = 0;
        this.i[1016] = 0;
        this.n[1423] = 0;
        this.l[1423] = 0;
        this.i[1423] = 0;
        this.n[1513] = 13660;
        this.l[1513] = 2708;
        this.i[1513] = 2709;
        this.n[1544] = 13916;
        this.l[1544] = 2716;
        this.i[1544] = 2717;
        this.n[1512] = 13659;
        this.l[1512] = 2712;
        this.i[1512] = 2713;
        this.n[1543] = 13915;
        this.l[1543] = 2718;
        this.i[1543] = 2719;
        this.n[1511] = 13658;
        this.l[1511] = 2710;
        this.i[1511] = 2711;
        this.n[1542] = 13914;
        this.l[1542] = 2702;
        this.i[1542] = 2703;
        this.n[1573] = 14170;
        this.l[1573] = 2704;
        this.i[1573] = 2705;
        this.n[1572] = 14169;
        this.l[1572] = 2706;
        this.i[1572] = 2707;
        this.n[1541] = 13913;
        this.l[1541] = 2714;
        this.i[1541] = 2715;
        this.n[1555] = 5956;
        this.l[1555] = 3528;
        this.i[1555] = 3529;
        this.n[1556] = 11877;
        this.l[1556] = 3526;
        this.i[1556] = 3527;
        this.n[878] = 11601;
        this.l[878] = 3474;
        this.i[878] = 3475;
        this.n[725] = 0;
        this.l[725] = 0;
        this.i[725] = 0;
        this.n[726] = 0;
        this.l[726] = 0;
        this.i[726] = 0;
        this.n[783] = 0;
        this.l[783] = 0;
        this.i[783] = 0;
        this.n[666] = 0;
        this.l[666] = 0;
        this.i[666] = 0;
        this.n[665] = 0;
        this.l[665] = 0;
        this.i[665] = 0;
        this.n[417] = 0;
        this.l[417] = 0;
        this.i[417] = 0;
        this.n[242] = 0;
        this.l[242] = 0;
        this.i[242] = 0;
        this.n[880] = -1;
        this.l[880] = -1;
        this.i[880] = -1;
        this.n[971] = -1;
        this.l[971] = -1;
        this.i[971] = -1;
        this.n[972] = -1;
        this.l[972] = -1;
        this.i[972] = -1;
        byArray = f2.a("anim_index");
        e4 = new rs.x.e(byArray);
        n6 = byArray.length / 2;
        this.O = new int[n6];
        for (n2 = 0; n2 < n6; ++n2) {
            this.O[n2] = e4.A();
        }
        byArray = f2.a("midi_index");
        e4 = new rs.x.e(byArray);
        n6 = byArray.length;
        this.I = new int[n6];
        for (n2 = 0; n2 < n6; ++n2) {
            this.I[n2] = e4.y();
        }
        this.F = client;
        this.K = true;
        this.F.a(this, 2);
        if (rs.f.a.c == 1) {
            int n7;
            int n8;
            n2 = 0;
            int[] nArray = new int[]{};
            int[] nArray2 = new int[]{};
            int[] nArray3 = new int[]{};
            for (int i7 = 0; i7 < this.n.length; ++i7) {
                for (int n9 : nArray3) {
                    if (i7 != n9) continue;
                    System.out.println("[IDX] [FOUND MATCH FOR IDX " + i7 + "]");
                    System.out.println("mapIndices1[" + i7 + "] = " + this.n[i7]);
                    System.out.println("mapIndices2[" + i7 + "] = " + this.l[i7]);
                    System.out.println("mapIndices3[" + i7 + "] = " + this.i[i7]);
                    System.out.println();
                }
                for (int n9 : nArray) {
                    if (this.l[i7] != n9 && this.i[i7] != n9) continue;
                    System.out.println("[FILE] [FOUND MATCH FOR FILE " + n9 + "]");
                    System.out.println("mapIndices1[" + i7 + "] = " + this.n[i7]);
                    System.out.println("mapIndices2[" + i7 + "] = " + this.l[i7]);
                    System.out.println("mapIndices3[" + i7 + "] = " + this.i[i7]);
                    System.out.println();
                }
                int[] nArray4 = nArray2;
                n8 = nArray4.length;
                for (n7 = 0; n7 < n8; ++n7) {
                    int n9;
                    n9 = nArray4[n7];
                    if (this.n[i7] != n9) continue;
                    System.out.println("[REGION] [FOUND MATCH FOR REGION " + n9 + "]");
                    System.out.println("mapIndices1[" + i7 + "] = " + this.n[i7]);
                    System.out.println("mapIndices2[" + i7 + "] = " + this.l[i7]);
                    System.out.println("mapIndices3[" + i7 + "] = " + this.i[i7]);
                    System.out.println();
                }
            }
            if (n2 != 0) {
                HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
                int n10 = 3530;
                block12: for (n8 = 0; n8 < n10; ++n8) {
                    for (n7 = 0; n7 < this.n.length; ++n7) {
                        if (this.l[n7] != n8 && this.i[n7] != n8) continue;
                        hashMap.put(n8, true);
                        continue block12;
                    }
                }
                for (n8 = 0; n8 < n10; ++n8) {
                    if (hashMap.get(n8) != null) continue;
                    System.out.println("[MAP TOOL] Found unused region .GZ FILE id: " + n8);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void n() {
        try {
            int n2;
            int n3 = this.Q.available();
            if (this.H == 0 && n3 >= 6) {
                this.M = true;
                this.Q.read(this.D, 0, 6);
                int n4 = this.D[0] & 0xFF;
                n2 = ((this.D[1] & 0xFF) << 8) + (this.D[2] & 0xFF);
                int n5 = ((this.D[3] & 0xFF) << 8) + (this.D[4] & 0xFF);
                int n6 = this.D[5] & 0xFF;
                this.x = null;
                Object object = (rs.cache.c)this.q.b();
                while (object != null) {
                    if (((rs.cache.c)object).j == n4 && ((rs.cache.c)object).m == n2) {
                        this.x = object;
                    }
                    if (this.x != null) {
                        ((rs.cache.c)object).o = 0;
                    }
                    object = (rs.cache.c)this.q.d();
                }
                if (this.x != null) {
                    this.V = 0;
                    if (n5 == 0) {
                        rs.v.a.e("Rej: " + n4 + "," + n2);
                        this.x.l = null;
                        if (this.x.n) {
                            object = this.u;
                            synchronized (object) {
                                this.u.a(this.x);
                            }
                        } else {
                            this.x.b();
                        }
                        this.x = null;
                    } else {
                        if (this.x.l == null && n6 == 0) {
                            this.x.l = new byte[n5];
                        }
                        if (this.x.l == null) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.G = n6 * 500;
                this.H = 500;
                if (this.H > n5 - n6 * 500) {
                    this.H = n5 - n6 * 500;
                }
            }
            if (this.H > 0 && n3 >= this.H) {
                this.M = true;
                byte[] byArray = this.D;
                n2 = 0;
                if (this.x != null) {
                    byArray = this.x.l;
                    n2 = this.G;
                }
                this.Q.read(byArray, n2, this.H);
                if (this.H + this.G >= byArray.length && this.x != null) {
                    rs.cache.b b2;
                    rs.cache.b b3 = b2 = this.x.k == 1 ? this.c : this.b;
                    if (b2.a()[0] != null) {
                        b2.a()[this.x.j + 1].a(byArray.length, byArray, this.x.m);
                    }
                    if (!this.x.n && this.x.j == 3) {
                        this.x.n = true;
                        this.x.j = 93;
                    }
                    if (this.x.n) {
                        h h2 = this.u;
                        synchronized (h2) {
                            this.u.a(this.x);
                        }
                    } else {
                        this.x.b();
                    }
                }
                this.H = 0;
            }
        }
        catch (IOException iOException) {
            try {
                this.R.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.R = null;
            this.Q = null;
            this.L = null;
            this.H = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int g() {
        b_0 b_02 = this.P;
        synchronized (b_02) {
            return this.P.d();
        }
    }

    public void h() {
        this.K = false;
    }

    public void a(boolean bl) {
        int n2 = this.n.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!bl && this.m[i2] == 0) continue;
            this.a((byte)2, 3, this.i[i2]);
            this.a((byte)2, 3, this.l[i2]);
        }
    }

    public int f(int n2) {
        return this.S[n2].length;
    }

    private void a(rs.cache.c c2) {
        this.R = null;
        this.Q = null;
        this.L = null;
        this.H = 0;
        ++this.k;
    }

    public int i() {
        return 29192;
    }

    public int j() {
        return 72000;
    }

    public int b(int n2, int n3, int n4) {
        int n5 = (n4 << 8) + n3;
        for (int i2 = 0; i2 < this.n.length; ++i2) {
            int n6;
            if (this.n[i2] != n5) continue;
            int n7 = n6 = n2 == 0 ? this.l[i2] : this.i[i2];
            if (n6 > 3535 && !this.g.f().a_(n6)) {
                if (rs.f.a.d.booleanValue()) {
                    System.out.println("[Map warning] Capped map file " + n6 + " (reached max)");
                }
                return -1;
            }
            return n6;
        }
        return -1;
    }
}

