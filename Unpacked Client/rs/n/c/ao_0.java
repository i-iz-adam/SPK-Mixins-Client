/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.ap_0;
import rs.n.e;
import rs.q.a.a.a;

/*
 * Renamed from rs.n.c.aO
 */
public class ao_0
extends c {
    public static final String[] c = new String[]{"Main stock"};
    public static f_0 d;
    public static f_0 e;
    public static int f;
    public static a g;

    public ao_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        Object object;
        int n2;
        e e2 = rs.n.e.H[3824];
        for (n2 = 0; n2 < e2.al.length; ++n2) {
            int n3 = e2.al[n2];
            object = rs.n.e.H[n3];
            if (((e)object).at != null && ((e)object).at.contains("Right-click on shop")) {
                ((e)object).at = "";
            }
            if (n3 != 3900) continue;
            int n4 = n2;
            e2.bc[n4] = e2.bc[n4] + 23;
        }
        n2 = 10;
        int[] nArray = new int[e2.al.length + 10];
        object = new int[e2.al.length + 10];
        int[] nArray2 = new int[e2.al.length + 10];
        int n5 = 0;
        for (int i2 = 0; i2 < e2.al.length; ++i2) {
            nArray[i2] = e2.am[i2];
            object[i2] = e2.bc[i2];
            nArray2[i2] = e2.al[i2];
            ++n5;
        }
        d = rs.n.e.j(10, "slayer/image");
        e = rs.n.e.j(9, "slayer/image");
        ao_0.b(41043, 10, "slayer/image", "Select shop tab");
        ao_0.b(41044, 9, "slayer/image", "Select shop tab");
        ao_0.b(41045, 9, "slayer/image", "Select shop tab");
        ao_0.b(41046, 9, "slayer/image", "Select shop tab");
        ao_0.b(41047, 9, "slayer/image", "Select shop tab");
        ao_0.a(41048, "Tab 1", this.a, 0, 16750623, true, true);
        ao_0.a(41049, "Tab 2", this.a, 0, 16750623, true, true);
        ao_0.a(41050, "Tab 3", this.a, 0, 16750623, true, true);
        ao_0.a(41051, "Tab 4", this.a, 0, 16750623, true, true);
        ao_0.a(41052, "Tab 5", this.a, 0, 16750623, true, true);
        e2.am = nArray;
        e2.bc = (int[])object;
        e2.al = nArray2;
        e2.b(n5++, 41043, 30, 59);
        e2.b(n5++, 41048, 71, 63);
        e2.b(n5++, 41044, 121, 59);
        e2.b(n5++, 41049, 162, 63);
        e2.b(n5++, 41045, 212, 59);
        e2.b(n5++, 41050, 253, 63);
        e2.b(n5++, 41046, 303, 59);
        e2.b(n5++, 41051, 344, 63);
        e2.b(n5++, 41047, 394, 59);
        e2.b(n5++, 41052, 435, 63);
        ao_0.a(0, new String[]{"Main stock"});
    }

    public static void m(int n2) {
        e e2 = rs.n.e.H[3824];
        for (int i2 = 0; i2 < f; ++i2) {
            int n3 = 92 + i2 * 2;
            int n4 = 41043 + i2;
            if (n2 == i2) {
                rs.n.e.H[n4].E = d;
                rs.n.e.H[n4].aG = d;
                continue;
            }
            rs.n.e.H[n4].E = e;
            rs.n.e.H[n4].aG = e;
        }
    }

    public static void a(int n2, String[] stringArray) {
        f = 0;
        e e2 = rs.n.e.H[3824];
        for (int i2 = 0; i2 < 5; ++i2) {
            int n3 = 92 + i2 * 2;
            int n4 = 41043 + i2;
            int n5 = 92 + i2 * 2 + 1;
            int n6 = 41048 + i2;
            if (i2 < stringArray.length) {
                int n7 = 30 + 91 * i2;
                int n8 = 59;
                int n9 = 71 + 91 * i2;
                int n10 = 63;
                if (n2 == i2) {
                    rs.n.e.H[n4].E = d;
                    rs.n.e.H[n4].aG = d;
                } else {
                    rs.n.e.H[n4].E = e;
                    rs.n.e.H[n4].aG = e;
                }
                e2.am[n3] = n7;
                e2.bc[n3] = n8;
                e2.am[n5] = n9;
                e2.bc[n5] = n10;
                rs.n.e.H[n6].at = stringArray[i2];
                ++f;
                continue;
            }
            e2.am[n3] = -1500;
            e2.am[n5] = -1500;
        }
    }

    static {
        g = new ap_0();
    }
}

