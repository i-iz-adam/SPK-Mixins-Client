/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rs.Client;
import rs.a.h;
import rs.d.k;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.b.a.a.b;
import rs.l.b.a.a.c;
import rs.l.b.a.b.a;
import rs.l.b.a.e;
import rs.l.c_0;
import rs.l.e.f;
import rs.l.e_0;
import rs.n.c.ap;
import rs.n.c.y_0;
import rs.v_0;

public class d {
    public static int a = 10275839;
    public static d b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public Client f;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    private int n = 0;
    private int o = 0;
    private int p = 6208;
    private int q = 6208;
    private int r = 0;
    private boolean s = false;
    public boolean j = true;
    public int k = 0;
    private List<rs.l.b.a.a.a> t = new ArrayList<rs.l.b.a.a.a>();
    private List<a> u = new ArrayList<a>();
    public Graphics2D l;
    private boolean v;
    public static int m;
    private static final int[] w;
    private int x = 0;
    private long y = 0L;
    private boolean z = false;

    public d(Client client) {
        this.f = client;
    }

    public void a() {
        Client.al = 600;
        this.f.gq = 0;
        this.f.eU = 0;
        this.f.ft = 0;
        this.f.dp = 0;
        this.p = 6208;
        this.q = 6208;
        this.r = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a("bg gray");
    }

    public void b() {
        if (!this.z) {
            return;
        }
        if (System.currentTimeMillis() - this.y >= 2500L) {
            if (this.x >= w.length) {
                this.z = false;
                return;
            }
            m = w[this.x];
            this.f();
            this.c("@whi@Sample texture ID: @gre@" + m);
            ++this.x;
            this.y = System.currentTimeMillis();
        }
    }

    public void c() {
        this.z = true;
        this.x = 0;
    }

    public void d() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        d = true;
        int n7 = this.f.B().getWidth();
        int n8 = this.f.B().getHeight();
        if (this.n != n7 || this.o != n8 || this.f.gZ == null) {
            if (!this.s) {
                this.a();
                this.f.I();
                this.f.d();
                this.f.a(rs.f.a.ai);
                y_0.m(32001);
                ap.j();
                ap.i();
                this.f.fc = false;
                this.s = true;
            }
            this.a(n7, n8);
        }
        this.f.gZ.a();
        if (this.f.ck != 0) {
            this.f.ha = null;
            this.f.ck = 0;
        }
        if (this.f.fX == 3) {
            Client.fM = true;
        }
        if (this.f.eA == 3) {
            Client.fM = true;
        }
        if (this.f.cD != null) {
            Client.fM = true;
        }
        if (Client.fM) {
            Client.fM = false;
        }
        ++Client.gf;
        ++this.f.dE;
        this.f.g(this.p, this.q);
        Client.dZ = 0;
        if (!this.f.fe) {
            n6 = this.f.fs;
            if (this.f.dQ / 256 > n6) {
                n6 = this.f.dQ / 256;
            }
            if (this.f.dh[4] && this.f.fy[4] + 128 > n6) {
                n6 = this.f.fy[4] + 128;
            }
            n5 = this.f.ft + this.f.dp & 0x7FF;
            n4 = -50;
            this.f.b(Client.al + n6 * 3, n6, this.f.eb + this.g, this.f.c(Client.dw, this.q, this.p) + n4 + this.i, n5, this.f.ec + this.h);
        }
        n6 = 0;
        n5 = Client.cJ;
        n4 = Client.cK;
        int n9 = Client.cL;
        int n10 = this.f.cR;
        int n11 = this.f.cS;
        for (n3 = 0; n3 < 5; ++n3) {
            if (!this.f.dh[n3]) continue;
            n2 = (int)(Math.random() * (double)(this.f.dg[n3] * 2 + 1) - (double)this.f.dg[n3] + Math.sin((double)this.f.eg[n3] * ((double)this.f.dy[n3] / 100.0)) * (double)this.f.fy[n3]);
            if (n3 == 0) {
                Client.cJ += n2;
            }
            if (n3 == 1) {
                Client.cK += n2;
            }
            if (n3 == 2) {
                Client.cL += n2;
            }
            if (n3 == 3) {
                this.f.cS = this.f.cS + n2 & 0x7FF;
            }
            if (n3 != 4) continue;
            this.f.cR += n2;
            if (this.f.cR < 128) {
                this.f.cR = 128;
            }
            if (this.f.cR <= 383) continue;
            this.f.cR = 383;
        }
        n3 = e_0.A;
        rs.a.h.bt = true;
        rs.a.h.bw = 0;
        rs.a.h.bu = Client.hP - (rs.f.a.ai == a.c.a ? 4 : 0);
        rs.a.h.bv = Client.hQ - (rs.f.a.ai == a.c.a ? 4 : 0);
        rs.l.c.d();
        rs.l.c.a(0, 0, n7, n8, a, 255);
        this.f.dF.a(Client.cJ, Client.cL, this.f.cS, Client.cK, n6, this.f.cR);
        this.l = rs.l.c.a(rs.l.c.g, rs.l.c.h, rs.l.c.i);
        n2 = 0;
        ArrayList<rs.l.b.a.a.a> arrayList = new ArrayList<rs.l.b.a.a.a>();
        for (int i2 = 0; i2 < this.t.size(); ++i2) {
            this.t.get(i2).e(i2);
            if (!this.t.get(i2).h()) continue;
            ++n2;
        }
        ArrayList<rs.l.b.a.a.a> arrayList2 = new ArrayList<rs.l.b.a.a.a>(this.t);
        arrayList2.sort(new e(this));
        for (rs.l.b.a.a.a a2 : arrayList2) {
            a2.a();
            if (a2.l()) continue;
            arrayList.add(a2);
        }
        for (rs.l.b.a.a.a a2 : arrayList) {
            this.t.remove(a2);
        }
        this.f.dF.d();
        Iterator<Object> iterator = this.u.iterator();
        int n12 = 5;
        int n13 = n8 - 7;
        int n14 = -17;
        while (iterator.hasNext()) {
            a a3 = (a)iterator.next();
            if (a3.a()) {
                a3.a(n12, n13);
                n13 += n14;
                continue;
            }
            iterator.remove();
        }
        if (rs.f.a.az && !rs.f.a.ah) {
            int n15 = 0;
            while (true) {
                if (n15 >= Client.by.length) break;
                if (Client.by[n15].b().size() > 0) {
                    Client.by[n15].a();
                }
                ++n15;
            }
        }
        int n16 = 20;
        if (e) {
            Client.gl.a("@whi@Camera pos: @yel@" + Client.cJ + ", " + Client.cL, n7 - 5, n16, 0, 0);
            Client.gl.a("@whi@Camera curve: @yel@" + this.f.cS + ", " + this.f.cR, n7 - 5, n16 += 15, 0, 0);
            Client.gl.a("@whi@Camera zoom: @yel@" + Client.al, n7 - 5, n16 += 15, 0, 0);
            Client.gl.a("@whi@Total entities: @yel@" + this.t.size(), n7 - 5, n16 += 15, 0, 0);
            Client.gl.a("@whi@Selected entities: @yel@" + n2, n7 - 5, n16 += 15, 0, 0);
        }
        this.f.f(n3);
        this.b();
        for (f f2 : rs.l.e.f.k) {
            f2.a(this.f, f.a.b);
        }
        for (f f2 : rs.l.e.f.l) {
            f2.a(this.f, f.a.b);
        }
        if (Client.w.b) {
            Client.w.b();
        }
        if (rs.l.e.f.j.a(this.f)) {
            rs.l.e.f.j.a(this.f, f.a.b);
        }
        this.f.gZ.a(0, this.f.hG, 0);
        Client.cJ = n5;
        Client.cK = n4;
        Client.cL = n9;
        this.f.cR = n10;
        this.f.cS = n11;
        this.f.dE = 0;
        this.j = false;
        Client.ab.c.clear();
        if (this.v) {
            this.f.a(1, "Loading - please wait.", null);
            this.f.gZ.a();
            this.f.gZ.a(0, this.f.hG, 0);
            rs.d.d.M.a();
            rs.d.d.N.a();
            Client.M();
            rs.d.k.b = new rs.t.a.d();
            rs.d.k.b.a();
            rs.d.k.k.a();
            rs.d.k.l.a();
            this.f.b();
            this.v = false;
        }
    }

    public void a(String string, String[] stringArray) {
        int n2;
        if (string.equalsIgnoreCase("script")) {
            this.c();
        }
        block66: for (int i2 = 0; i2 < this.t.size(); ++i2) {
            if (!string.startsWith("e" + (i2 + 1) + ".") && !string.startsWith("player.") && !string.startsWith("p.") && !string.startsWith("npc.")) continue;
            rs.l.b.a.a.a a3 = this.t.get(i2);
            String string2 = string.replace("e" + (i2 + 1), "").substring(1);
            if (string.startsWith("player.") || string.startsWith("p.")) {
                if (!(a3 instanceof rs.l.b.a.a.d)) continue;
                String string3 = string2 = string.startsWith("player.") ? string.replace("player", "").substring(1) : string.substring(2);
            }
            if (string.startsWith("npc.") || string.startsWith("n.")) {
                if (!(a3 instanceof c)) continue;
                String string4 = string2 = string.startsWith("npc.") ? string.replace("npc", "").substring(1) : string.substring(2);
            }
            if (a3 instanceof rs.l.b.a.a.d) {
                rs.l.b.a.c.a(string2, stringArray, (rs.l.b.a.a.d)a3);
            }
            if (a3 instanceof c) {
                rs.l.b.a.b.a(string2, stringArray, (c)a3);
            }
            switch (string2.toLowerCase()) {
                case "x": {
                    a3.a(a3.d() + Integer.parseInt(stringArray[0]));
                    continue block66;
                }
                case "y": {
                    a3.b(a3.e() + Integer.parseInt(stringArray[0]));
                    continue block66;
                }
                case "left": 
                case "l": {
                    a3.a(a3.d() - 100);
                    continue block66;
                }
                case "right": 
                case "r": {
                    a3.a(a3.d() + 100);
                    continue block66;
                }
                case "up": 
                case "u": {
                    a3.b(a3.e() - 100);
                    continue block66;
                }
                case "down": 
                case "d": {
                    a3.b(a3.e() + 100);
                    continue block66;
                }
                case "set_anim": 
                case "anim": 
                case "setanim": {
                    n2 = Integer.parseInt(stringArray[0]);
                    a3.d(n2);
                    rs.l.b.a.d.b("@whi@<img=24> @gre@Entity #" + (i2 + 1) + "@whi@ animation set to @gre@" + n2 + "!");
                }
            }
        }
        switch (string.toLowerCase()) {
            case "delete": 
            case "del": {
                this.t.remove(Integer.parseInt(stringArray[0]) - 1);
                this.c("Deleted @red@Entity #" + Integer.parseInt(stringArray[0]));
                break;
            }
            case "npc": {
                int n3 = Integer.parseInt(stringArray[0]);
                Object object = new c(n3);
                ((rs.l.b.a.a.a)object).e(this.t.size());
                ((rs.l.b.a.a.a)object).a(this.p);
                ((rs.l.b.a.a.a)object).b(this.q);
                this.t.add((rs.l.b.a.a.a)object);
                this.c("Added @gre@NPC @cya@(index " + (this.t.size() - 1) + ")");
                break;
            }
            case "player": {
                rs.l.b.a.a.d d2 = new rs.l.b.a.a.d();
                d2.e(this.t.size());
                d2.a(this.p);
                d2.b(this.q);
                this.t.add(d2);
                this.c("Added @gre@Player @cya@(index " + (this.t.size() - 1) + ")");
                break;
            }
            case "item": {
                n2 = Integer.parseInt(stringArray[0]);
                this.c("Set the active item to: @gre@" + rs.d.k.f((int)n2).w);
                this.t.removeIf(a2 -> a2 instanceof b);
                this.t.add(new b(n2));
                break;
            }
            case "reset": 
            case "wipe": {
                this.a();
                this.t.clear();
                this.c("Entities cleared!");
                this.c("Camera reset!");
                break;
            }
            case "reverse": {
                Collections.reverse(this.t);
                this.c("Entity indices reversed!");
                break;
            }
            case "hud": {
                e = !e;
                this.c("HUD has been " + (e ? "@gre@Enabled" : "@red@Disabled"));
                break;
            }
            case "background": 
            case "bg": {
                int n4 = -1;
                switch (stringArray[0].toLowerCase()) {
                    case "blue": {
                        n4 = 10275839;
                        break;
                    }
                    case "black": {
                        n4 = 0;
                        break;
                    }
                    case "white": {
                        n4 = 0xFFFFFF;
                        break;
                    }
                    case "green": {
                        n4 = 34560;
                        break;
                    }
                    case "orange": {
                        n4 = 16746240;
                        break;
                    }
                    case "red": {
                        n4 = 16719132;
                        break;
                    }
                    case "gray": 
                    case "grey": {
                        n4 = 9803411;
                    }
                }
                if (n4 == -1) {
                    this.c("@red@Could not find BG color '" + stringArray[0] + "'");
                    break;
                }
                this.c("@whi@Background color set to: " + stringArray[0]);
                a = n4;
            }
        }
    }

    public void e() {
        int n3;
        while ((n3 = this.f.w(-796)) != -1) {
            if (this.f.ac() && n3 == 96) {
                Client.w.a();
                return;
            }
            if (Client.w.b) {
                Client.w.a(n3);
                Client.fM = true;
                return;
            }
            if (n3 != 32 && n3 != 1002 && n3 != 1003) continue;
            rs.l.b.a.a.a a2 = null;
            for (rs.l.b.a.a.a a3 : this.t) {
                if (!a3.h() && !(a3 instanceof b)) continue;
                a2 = a3;
            }
            if (a2 == null) {
                return;
            }
            if (n3 == 32) {
                Object object2 = a2.j().keySet().stream().mapToInt(n2 -> n2).toArray();
                if (a2.m() >= ((Object)object2).length) {
                    a2.f(((Object)object2).length - 1);
                }
                Integer n4 = (int)object2[a2.m()];
                if (a2.k().contains(n4)) {
                    a2.k().remove(n4);
                } else {
                    a2.k().add(n4);
                }
                a2.f();
            }
            if (n3 == 1002) {
                a2.f(a2.m() + 1);
            }
            if (n3 == 1003) {
                a2.f(a2.m() - 1);
            }
            if (a2.m() > a2.j().keySet().size()) {
                a2.f(a2.j().keySet().size() - 1);
            }
            if (a2.m() >= 0) continue;
            a2.f(0);
        }
    }

    public void a(int n2) {
        if (Client.w.b) {
            return;
        }
        if (n2 == 23) {
            this.i -= 25;
        }
        if (n2 == 19) {
            this.i += 25;
        }
        int n3 = 97;
        int n4 = 100;
        int n5 = 119;
        int n6 = 115;
        if (n2 == n3) {
            this.p -= 35 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
        }
        if (n2 == n4) {
            this.p += 35 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
        }
        if (n2 == n5) {
            this.q += 50 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
        }
        if (n2 == n6) {
            this.q -= 50 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
        }
    }

    public void b(int n2) {
        if (Client.w.b) {
            return;
        }
        if (n2 == 99) {
            this.a();
            this.c("Camera position reset");
        }
        if (n2 == 116) {
            if (rs.l.e.f.j.r) {
                rs.l.e.f.j.r = false;
            } else {
                rs.l.e.f.j.r = true;
                rs.l.e.f.j.s = 0;
            }
        }
        if (n2 == 49) {
            rs.f.a.a(!rs.f.a.ah);
            this.c("Lite mode toggled: " + (rs.f.a.ah ? "@gre@ON" : "@red@OFF"));
        }
        if (n2 == 50) {
            rs.f.a.aj = !rs.f.a.aj;
            this.c("Oldschool graphics toggled: " + (rs.f.a.aj ? "@gre@ON" : "@red@OFF"));
        }
        if (n2 == 9 || n2 == 49 || n2 == 50) {
            this.f();
            if (n2 == 9) {
                this.c("Graphics and definitions have been reset!");
            }
        }
    }

    public void c(int n2) {
        if (n2 == 1) {
            for (rs.l.b.a.a.a a2 : this.t) {
                a2.a(false);
            }
        }
        this.j = true;
        this.k = n2;
    }

    public void a(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        if (!(string = string.replace("::", "")).contains(" ")) {
            rs.l.b.a.a.a(string, string, new String[0]);
            this.a(string, new String[0]);
            return;
        }
        String[] stringArray = string.split(" ");
        String[] stringArray2 = new String[]{};
        if (stringArray.length > 1) {
            stringArray2 = new String[stringArray.length - 1];
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                stringArray2[i2 - 1] = stringArray[i2];
            }
        }
        this.a(stringArray[0], stringArray2);
        rs.l.b.a.a.a(string, stringArray[0], stringArray2);
    }

    public void a(int n2, int n3) {
        this.f.hG = null;
        this.n = n2;
        this.o = n3;
        this.f.hE = Client.ai = n2;
        this.f.hF = Client.ah = n3;
        e_0.a(n2, n3);
        this.f.bx = e_0.x;
        e_0.a(n2, n3);
        this.f.fo = e_0.x;
        e_0.a(n2, n3);
        this.f.fp = e_0.x;
        e_0.a(n2, n3);
        this.f.fq = e_0.x;
        v_0.d(500, 800, n2, n3);
        this.f.gZ = new c_0(n2, n3, this.f.B());
        this.f.repaint();
        if (Launcher.e()) {
            Launcher.n().a(100);
        }
    }

    public void f() {
        this.v = true;
    }

    public static void b(String string) {
        Client.w.b("@yel@-> " + string);
    }

    public void c(String string) {
        this.u.add(0, new a(string));
    }

    public static boolean g() {
        return d;
    }

    public List<rs.l.b.a.a.a> h() {
        return this.t;
    }

    static {
        c = false;
        d = false;
        e = true;
        m = 81;
        w = new int[]{163, 206, 221, 63, 56, 71};
    }
}

