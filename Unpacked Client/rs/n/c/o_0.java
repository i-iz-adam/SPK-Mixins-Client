/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.List;
import rs.l.k_0;
import rs.n.b.a.d;
import rs.n.c;
import rs.n.c.p_0;
import rs.n.c.q_0;
import rs.n.c.r_0;
import rs.n.c.s_0;
import rs.n.e;
import rs.q.a.a.a;

/*
 * Renamed from rs.n.c.O
 */
public class o_0
extends c {
    public static a c = new p_0();
    static final d d = new q_0(1000L);
    public static final String e = "@gre@<img=24> Active";
    public static long f = 0L;
    public static String g = "";
    public static long bI = 0L;
    public static int bJ = 995;
    public static int bK = 1;
    public static String bL = "";
    public static long bM = 0L;
    public static long bN = 0L;
    public static String bO = "Event Global Boss";
    public static long bP = -1L;
    public static String bQ = "Event Wildy Boss";
    public static long bR = -1L;
    public static long bS = -1L;
    public static long bT = -1L;
    public static List<String> bU = new ArrayList<String>();
    public static List<Long> bV = new ArrayList<Long>();

    public o_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = o_0.d(40087);
        o_0.c(40088, 7, "gameframe/SPRITE");
        o_0.a(62150, "Hotspot: @or2@N/A", this.a, 0, 16750623, true, true);
        o_0.a(62151, "@yel@N/A", this.a, 0, 16750623, true, true);
        o_0.a(62152, false);
        o_0.H[62152].P = 4;
        o_0.H[62152].ac = 11;
        o_0.a(62153, 1, 0, 62154, 1, "gameframe/skip", 16, 15, "Vote to skip hotspot");
        o_0.a(62154, 2, "gameframe/skip", 16, 15, 62155);
        o_0.a(62156, "@yel@0 / 55", this.a, 0, 16750623, false, true);
        o_0.a(40089, "<img=128> Dharok PK Tournament", this.a, 0, 16750623, true, true);
        o_0.a(40090, "@yel@Starts in.. <img=37> 4:47:17", this.a, 0, 16750623, true, true);
        o_0.a(40091, false);
        o_0.H[40091].P = 4;
        o_0.H[40091].ac = 11;
        o_0.H[40091].az[0] = 16002;
        o_0.H[40091].ax[0] = 1;
        o_0.a(40092, "<img=245>Golden HG", this.a, 0, 16750623, true, true);
        o_0.a(40093, "<img=261>Blood LMS", this.a, 0, 16750623, true, true);
        o_0.a(40094, "@yel@<img=37> 26:57", this.a, 0, 16750623, true, true);
        o_0.a(40095, e, this.a, 0, 16750623, true, true);
        o_0.a(40096, "gameframe/button", 1, 150, 32, "<img=100> View all events", -1, 40097, 1);
        o_0.a(40097, "gameframe/button", 2, 150, 32, 40098);
        o_0.a(40099, "<img=100> View Active Events", this.a, 0, 16751360, true, true);
        o_0.a(40101, "<img=82> Event Global Boss:@yel@ <img=37> None", this.a, 0, 16750623, false);
        o_0.a(40102, "<img=82> Event Wildy Boss:@yel@ <img=37> None", this.a, 0, 16750623, false);
        o_0.a(40103, "<img=82> Event Brawl:@yel@ <img=37> None", this.a, 0, 16750623, false);
        int n2 = 24;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        e e3 = o_0.d(40100);
        e3.k(20);
        e3.P = 168;
        e3.aR = 225 - n2;
        e3.aH = 750;
        n4 = -10;
        e3.b(n5++, 40088, n4, 5);
        n3 = 163;
        e3.b(n5++, 62150, n4 + 117 - 5, n3 + 4);
        e3.b(n5++, 62151, n4 + 78 + 5 - 5, n3 + 15 + 11 - 1);
        e3.b(n5++, 62152, n4 + 13, n3 + 15 + 4 - 18);
        e3.b(n5++, 62153, n4 + 113 + 4 + 5 - 5, n3 + 12 + 11 - 1);
        e3.b(n5++, 62154, n4 + 113 + 4 + 5 - 5, n3 + 12 + 11 - 1);
        e3.b(n5++, 62156, n4 + 133 + 4 + 5 - 5, n3 + 15 + 11 - 1);
        n3 = 106;
        e3.b(n5++, 40089, n4 + 117 - 5, n3 + 4);
        e3.b(n5++, 40090, n4 + 117 - 5, n3 + 15 + 11 - 1);
        e3.b(n5++, 40091, n4 + 13, n3 + 15 + 4 - 15);
        n3 = 52;
        e3.b(n5++, 40092, n4 + 50, n3);
        e3.b(n5++, 40093, n4 + 50 + 85, n3);
        e3.b(n5++, 40094, n4 + 50, n3 + 23);
        e3.b(n5++, 40095, n4 + 50 + 85, n3 + 23);
        n4 = 10;
        n3 = 8;
        e3.b(n5++, 40096, n4, n3);
        e3.b(n5++, 40097, n4, n3);
        e3.b(n5++, 40099, n4 + 75, n3 + 11);
        n3 = 220;
        n4 = 5;
        e3.b(n5++, 40101, n4, n3);
        e3.b(n5++, 40102, n4, n3 + 18);
        e3.b(n5++, 40103, n4, n3 + 18 + 18);
        int n6 = 0;
        while (n6 < n5) {
            int n7 = n6++;
            e3.bc[n7] = e3.bc[n7] - 5;
        }
        e2.k(4);
        e2.b(0, 32000, 0, 0);
        e2.b(1, 16022, 0, 28 + n2);
        e2.b(2, 16023, 4, 251);
        e2.b(3, 40100, 6, 30 + n2);
        rs.n.b.a.d.a(40087, d);
        r_0 r_02 = new r_0(this, 0L);
        s_0 s_02 = new s_0(this, 0L, r_02);
        rs.n.b.a.b.a(62150, s_02);
        rs.n.b.a.b.a(62151, s_02);
        rs.n.b.a.b.a(62152, s_02);
        rs.n.b.a.b.a(62156, s_02);
        rs.n.b.a.b.a(62153, r_02);
    }
}

