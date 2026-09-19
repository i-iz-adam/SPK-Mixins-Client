/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.b;

import rs.Client;
import rs.d.d;
import rs.gui.Launcher;
import rs.l.k_0;
import rs.n.a.f;
import rs.n.e;

public class b {
    private static final int d = 155;
    private static final int e = 17;
    private static a f = rs.n.c.b.b$a.a;
    private static boolean g = false;
    static int a = 0;
    static int b = 0;
    private static int h = 0;
    private static int i = 0;
    public static int c = 0;
    private static int j = 0;
    private static int k = 0;
    private static int l = 32;
    private static int m = 40;
    private static int n = 5;
    private static String o = null;
    private static String[] p = null;
    private static int q = 155;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;

    public static void a(int n2, String string) {
        int n3 = a = 57017 + n2 * 2;
        int n4 = rs.n.c.b.a.e.d().size();
        int n5 = 57017 + n2 * 2 + 1;
        int n6 = n5 - 57017;
        g = false;
        j = 0;
        k = 0;
        l = 32;
        m = 40;
        n = 5;
        h = 0;
        i = 0;
        f = rs.n.c.b.b$a.a;
        o = null;
        p = null;
        q = 155;
        r = -1;
        s = 100;
        w = 0;
        u = 0;
        v = 0;
        t = 0;
        y = 100;
        x = 100;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (n2 >= 100) {
            return;
        }
        if ((string = rs.n.c.b.b.a(string)).contains("<tab")) {
            h = Integer.parseInt(string.split("<tab=")[1].split(">")[0]);
        }
        switch (f) {
            case c: {
                rs.n.e.b(n5, x, y);
                d d2 = rs.d.d.c(r);
                rs.n.e.l((int)n5).af = r;
                rs.n.e.l((int)n5).aW = d2.I;
                rs.n.e.l((int)n5).aX = d2.E;
                rs.n.e.l((int)n5).aD = t > 0 ? t : d2.w;
                if (w > 0) {
                    rs.n.e.l((int)n5).aY = false;
                    rs.n.e.l((int)n5).aT = w;
                } else {
                    rs.n.e.l((int)n5).aY = true;
                }
                rs.n.e.l((int)n3).bf = false;
                n10 = rs.n.c.b.b.a() + 17 + 20;
                c = n10 + s;
                n9 += u;
                n10 += v;
                break;
            }
            case b: {
                if (o != null) {
                    o = string;
                }
                boolean bl = false;
                if (p[0].contains("{M}")) {
                    rs.n.c.b.b.p[0] = p[0].replace("{M}", "");
                    bl = true;
                }
                rs.n.a.a.a.a(n5, p).h(q, 0).g(0xFFFFFF, 16750623);
                if (bl) {
                    ((rs.n.a.a.a)rs.n.e.l(n5)).b();
                }
                n7 = 5;
                n9 = 5;
                if (o != null) {
                    rs.n.e.l((int)n3).at = o;
                    n9 += h;
                } else {
                    rs.n.e.l((int)n3).bf = false;
                }
                if (g) {
                    n9 += rs.n.e.l((int)57016).P / 2 - q / 2;
                    if (o != null) {
                        n7 -= h;
                    }
                }
                n10 = n4 == 0 ? 10 : rs.n.c.b.b.a() + 17 + (o == null ? 0 : rs.n.c.b.b.a(n3));
                n8 = n10 + 3;
                if (rs.n.e.l((int)n3).ao == Client.gh) {
                    n8 += 3;
                }
                c = n10;
                if (i == 1) {
                    c += 7;
                }
                if (i != 2) break;
                c += 9;
                break;
            }
            default: {
                rs.n.e.l((int)n3).at = string;
                rs.n.e.l((int)n3).bf = true;
                if (j > 0) {
                    rs.n.e.a(n5, j, k, l);
                    rs.n.e.l((int)n5).T = rs.n.e.l((int)n3).T;
                    if (g) {
                        int n11 = rs.n.e.l((int)n3).ao.a(string) / 2;
                        n9 = -n11 - 10;
                        n7 = 5;
                    } else {
                        n7 = m;
                        n9 = 3;
                    }
                    if (h > 0) {
                        n9 += h - (l > 20 ? l / 2 : 5);
                    }
                } else {
                    rs.n.e.l((int)n5).bf = false;
                    n7 = 5;
                }
                if (n4 == 0) {
                    n8 = j > 0 ? 17 : 7;
                    n10 = 5;
                } else if (j > 0 || rs.n.e.H[n3 - 1].bf) {
                    n10 = rs.n.c.b.b.a() + 17 + 3 - Math.abs(32 - l) / 2;
                    n8 = rs.n.c.b.b.a() + 17 + l / 2 - 3;
                } else {
                    n8 = rs.n.c.b.b.a() + 17 + rs.n.c.b.b.a(n3);
                }
                c = n8;
            }
        }
        rs.n.c.b.a.e.a(n3).a(n7, n8);
        rs.n.c.b.a.e.a(n5, false).a(n9, n10);
    }

    private static String a(String string) {
        String string2;
        int n2 = a;
        if (string.contains("{DD")) {
            f = rs.n.c.b.b$a.b;
            p = string.split("\\{DD=")[1].split("/}")[0].split("<i>");
            if (string.contains("{SIZE=")) {
                q = Integer.parseInt(string.split("\\{SIZE=")[1].split("}")[0]);
                string = string.replace("{SIZE=" + q + "}", "");
            } else {
                q = 155;
            }
            if (string.contains("{LABEL=")) {
                string = string.split("\\{LABEL=")[1].split("/}")[0];
                o = "";
            }
        }
        if (string.contains("{NPC")) {
            String string3 = string.split("\\{NPC=")[1].split("}")[0];
            if (string3.contains(",")) {
                String[] stringArray = string3.split(",");
                r = Integer.parseInt(stringArray[0]);
                s = Integer.parseInt(stringArray[1]);
            } else {
                r = Integer.parseInt(string.split("\\{NPC=")[1].split("}")[0]);
            }
            if (string.contains("{Z=")) {
                w = Integer.parseInt(string.split("\\{Z=")[1].split("}")[0]);
            }
            if (string.contains("{X=")) {
                u = Integer.parseInt(string.split("\\{X=")[1].split("}")[0]);
            }
            if (string.contains("{Y=")) {
                v = Integer.parseInt(string.split("\\{Y=")[1].split("}")[0]);
            }
            if (string.contains("{A=")) {
                t = Integer.parseInt(string.split("\\{A=")[1].split("}")[0]);
            }
            if (string.contains("{SIZE=")) {
                x = y = Integer.parseInt(string.split("\\{SIZE=")[1].split("}")[0]);
            }
            f = rs.n.c.b.b$a.c;
            return "";
        }
        rs.n.e.H[n2] = rs.n.a.f.a(n2, string).m().a("Select option", 300);
        if (string.equalsIgnoreCase("{line}") || string.startsWith("{line=")) {
            rs.n.e.l((int)n2).M = 0;
            rs.n.e.l((int)n2).L = 0;
            e e2 = rs.n.e.l(n2);
            Launcher.n().o();
            e2.ao = Client.gh;
            rs.n.e.l((int)n2).S = false;
            rs.n.e.l((int)n2).br = 0;
            rs.n.e.l((int)n2).bt = 0;
            rs.n.e.l((int)n2).bs = 0;
            g = false;
            if (string.startsWith("{line=")) {
                String string4 = string.split("\\{line=")[1];
                String string5 = string4.substring(0, string4.indexOf("}"));
                return "<str=" + string5 + ">                                                                                                                                                    </str>";
            }
            return "<str=8683352>                                                                                                                                                    </str>";
        }
        if (string.contains("{C}")) {
            rs.n.e.l((int)n2).S = true;
            rs.n.e.l((int)n2).T = true;
            string = string.replace("{C}", "");
            g = true;
        } else if (string.contains("{RA}")) {
            rs.n.e.l((int)n2).U = true;
            rs.n.e.l((int)n2).S = false;
            rs.n.e.l((int)n2).T = true;
            string = string.replace("{RA}", "");
            g = true;
        } else {
            rs.n.e.l((int)n2).U = false;
            rs.n.e.l((int)n2).S = false;
            rs.n.e.l((int)n2).T = false;
            g = false;
        }
        if (string.contains("{L}")) {
            rs.n.e.l((int)n2).M = 1;
            rs.n.e.l((int)n2).L = 0xFFFFFF;
            rs.n.e.l((int)n2).bo = true;
            b = n2;
            string = string.replace("{L}", "");
        } else {
            rs.n.e.l((int)n2).M = 0;
            rs.n.e.l((int)n2).L = 0;
            rs.n.e.l((int)n2).bx = false;
        }
        if (string.contains("{B}")) {
            i = 2;
            e e3 = rs.n.e.l(n2);
            Launcher.n().o();
            e3.ao = Client.gj;
            string = string.replace("{B}", "");
        } else if (string.contains("{M}")) {
            i = 1;
            rs.n.e.l((int)n2).ao = Launcher.n().o().gi;
            string = string.replace("{M}", "");
        } else {
            i = 0;
            e e4 = rs.n.e.l(n2);
            Launcher.n().o();
            e4.ao = Client.gh;
        }
        if (string.contains("{H=")) {
            string2 = string.split("\\{H=")[1];
            String string6 = string2.substring(0, string2.indexOf("}"));
            boolean bl = string6.contains(",");
            rs.n.e.l((int)n2).bu = -1;
            if (bl) {
                rs.n.e.l((int)n2).bu = Integer.parseInt(string6.split(",")[1]);
                string6 = string6.split(",")[0];
            }
            rs.n.e.l((int)n2).br = Integer.parseInt(string6);
            rs.n.e.l((int)n2).bt = (short)rs.n.e.l((int)n2).aR;
            if (rs.n.e.l((int)n2).ao == Launcher.n().o().gi) {
                rs.n.e.l((int)n2).bt = (short)(rs.n.e.l((int)n2).bt + 4);
            }
            k_0 k_02 = rs.n.e.l((int)n2).ao;
            Launcher.n().o();
            if (k_02 == Client.gj) {
                rs.n.e.l((int)n2).bt = (short)(rs.n.e.l((int)n2).bt + 5);
            }
            rs.n.e.l((int)n2).bs = (short)75;
            string = bl ? string.replace("{H=" + string6 + "," + rs.n.e.l((int)n2).bu + "}", "") : string.replace("{H=" + string6 + "}", "");
        } else {
            rs.n.e.l((int)n2).br = 0;
            rs.n.e.l((int)n2).bt = 0;
            rs.n.e.l((int)n2).bs = 0;
            rs.n.e.l((int)n2).bu = -1;
        }
        if (f == rs.n.c.b.b$a.a) {
            if (string.contains("{IS=")) {
                l = 20;
                m = 30;
                string2 = string.substring(string.indexOf("{IS=") + 4, string.indexOf("}"));
                if (string2.contains(",")) {
                    j = Integer.parseInt(string2.split(",")[0]);
                    k = Integer.parseInt(string2.split(",")[1]);
                } else {
                    j = Integer.parseInt(string2);
                }
                string = string.replace("{IS=" + string2 + "}", "");
            }
            if (string.contains("{")) {
                string2 = string.substring(string.indexOf("{") + 1, string.indexOf("}"));
                if (string2.contains(",")) {
                    j = Integer.parseInt(string2.split(",")[0]);
                    k = Integer.parseInt(string2.split(",")[1]);
                } else {
                    j = Integer.parseInt(string2);
                }
                string = string.replace("{" + string2 + "}", "");
            }
        }
        return string;
    }

    private static int a(int n2) {
        int n3 = 0;
        if (rs.n.e.l((int)(n2 - 2)).ao.q.equalsIgnoreCase("b12_full")) {
            n3 = 3;
        }
        if (rs.n.e.l((int)(n2 - 2)).ao.q.equalsIgnoreCase("p11_full") && rs.n.e.l((int)n2).ao.q.equalsIgnoreCase("b12_full")) {
            n3 = 3;
        }
        if (rs.n.e.l((int)(n2 - 2)).ao.q.equalsIgnoreCase("p12_full")) {
            n3 = 2;
        }
        if (rs.n.e.l((int)(n2 - 2)).ao.q.equalsIgnoreCase("p11_full") && rs.n.e.l((int)n2).ao.q.equalsIgnoreCase("p12_full")) {
            n3 = 2;
        }
        return n3;
    }

    private static int a() {
        return c;
    }

    static {
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        w = 0;
        x = 100;
        y = 100;
    }

    private static final class a
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
            d = rs.n.c.b.b$a.a();
        }
    }
}

