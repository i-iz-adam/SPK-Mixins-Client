/*
 * Decompiled with CFR 0.152.
 */
package rs.r;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.gui.Launcher;
import rs.k.e;
import rs.l.c;
import rs.l.e_0;
import rs.r.a;
import rs.r.c_0;
import rs.r.j_0;
import rs.r_0;

/*
 * Renamed from rs.r.K
 */
public class k_0 {
    private static final r_0 a = new r_0(0, 0, 0);
    private final int[] b = Client.cy;
    private final c_0 c;
    private final List<a> d;
    private final List<a> e;

    public k_0(c_0 c_02) {
        this.c = c_02;
        this.d = new ArrayList<a>(c_02.i());
        this.e = new ArrayList<a>();
    }

    public void a() {
        int n2;
        Client client = Launcher.n().o();
        this.e.clear();
        for (n2 = 0; n2 < this.d.size(); ++n2) {
            int n3;
            a a2 = this.d.get(n2);
            a2.c();
            if (a2.f()) {
                j_0.a(a2);
                this.e.add(a2);
                continue;
            }
            if (rs.k.e.a()) continue;
            int n4 = a2.k();
            int n5 = a2.l();
            int n6 = a2.m();
            boolean bl = false;
            int n7 = 500;
            int n8 = Math.abs(n4 - Client.eR.ac);
            int n9 = Math.abs(n6 - Client.eR.ad);
            int n10 = Math.max(n8, n9);
            if (n10 >= n7) {
                bl = true;
            }
            client.a(this.b, n4, n5, n6);
            float f2 = a2.j();
            int n11 = (int)(a2.e() * 255.0f);
            int n12 = (int)(4.0f * a2.j());
            if (!bl) {
                float f3 = 200.0f;
                if (Client.al >= 200) {
                    f3 = 40.0f;
                }
                if (n10 >= 300) {
                    f3 += 40.0f;
                }
                float f4 = (float)(30.0 - (double)((float)Client.al / f3));
                f4 /= 10.0f;
                if (n10 >= 200) {
                    f4 = 0.0f;
                }
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                n12 = client.cR <= 200 ? (int)((float)n12 + f4) : (client.cR > 150 && client.cR <= 245 ? (int)((double)n12 + (double)f4 * 0.75) : (int)((float)n12 + f4 / 2.0f));
            } else if (n10 >= 1000) {
                n12 = (int)((double)n12 * 0.9);
            }
            int n13 = 256 - n11;
            int n14 = (a2.i() >> 16 & 0xFF) * n11;
            int n15 = (a2.i() >> 8 & 0xFF) * n11;
            int n16 = (a2.i() & 0xFF) * n11;
            int n17 = this.b[1] - n12;
            if (n17 < 0) {
                n17 = 0;
            }
            if ((n3 = this.b[1] + n12) >= rs.l.c.i) {
                n3 = rs.l.c.i - 1;
            }
            for (int i2 = n17; i2 <= n3; ++i2) {
                int n18;
                int n19 = i2 - this.b[1];
                int n20 = (int)Math.sqrt(n12 * n12 - n19 * n19);
                int n21 = this.b[0] - n20;
                if (n21 < 0) {
                    n21 = 0;
                }
                if ((n18 = this.b[0] + n20) >= rs.l.c.h) {
                    n18 = rs.l.c.h - 1;
                }
                int n22 = n21 + i2 * rs.l.c.h;
                if (e_0.k == null || n22 >= e_0.k.length || n22 + 1 >= e_0.k.length || n22 + (n18 - n21) + 2 >= client.gZ.c.length || e_0.k == null) continue;
                if (!(e_0.k[n22] >= (float)this.b[2] - f2 - 15.0f)) {
                    int n23 = n22++;
                    if (!(e_0.k[n23] >= (float)this.b[2] + f2 + 15.0f)) continue;
                }
                for (int i3 = n21; i3 <= n18; ++i3) {
                    int n24 = (client.gZ.c[n22] >> 16 & 0xFF) * n13;
                    int n25 = (client.gZ.c[n22] >> 8 & 0xFF) * n13;
                    int n26 = (client.gZ.c[n22] & 0xFF) * n13;
                    int n27 = (n14 + n24 >> 8 << 16) + (n15 + n25 >> 8 << 8) + (n16 + n26 >> 8);
                    rs.l.c.a(client.gZ.c, n22++, n27, n27, 255);
                }
            }
        }
        for (n2 = 0; n2 < this.e.size(); ++n2) {
            this.d.remove(this.e.get(n2));
        }
    }

    public List<a> b() {
        return this.d;
    }
}

