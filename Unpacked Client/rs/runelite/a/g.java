/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import rs.Client;
import rs.a.j;
import rs.gui.Launcher;

public class g {
    public static final int a = 516;
    public static final int b = 20;
    public static final int c = 412;
    public static final int d = 225;
    public static final int e = 965;
    public static final int f = 478;
    public static final int g = 1025;
    public static final int h = 582;
    public static final int i = 413;
    public static final int j = 561;
    public static final int k = 779;
    public static final int l = 27;
    public static final int m = 577;
    public static final int n = 729;
    public static final int o = 491;
    public static final int p = 365;
    public static final int q = 502;
    public static final int r = 900;
    public static final int s = 113;
    public static final int t = 872;
    public static final int u = 1062;
    public static final int v = 1226;
    public static final int w = 454;
    public static final int x = 74;
    public static final int y = 454;
    public static final int z = 539;
    public static final int A = 493;
    public static final int B = 847;
    public static final int C = 1125;
    public static final int D = 1504;

    public static boolean a(int n2) {
        return n2 == 20 || n2 == 412 || n2 == 225 || n2 == 965 || n2 == 478 || n2 == 1025 || n2 == 582 || n2 == 413;
    }

    public static boolean b(int n2) {
        return n2 == 561 || n2 == 779 || n2 == 27 || n2 == 577 || n2 == 729 || n2 == 491 || n2 == 365;
    }

    public static boolean c(int n2) {
        return n2 == 502 || n2 == 900 || n2 == 113 || n2 == 872 || n2 == 1062;
    }

    public static boolean d(int n2) {
        return n2 == 454 || n2 == 74 || n2 == 454 || n2 == 539 || n2 == 493 || n2 == 847 || n2 == 447;
    }

    public static int e(int n2) {
        j j2 = rs.runelite.a.g.f(n2);
        if (j2 == null) {
            return -1;
        }
        return j2.n();
    }

    public static j f(int n2) {
        Client client = Launcher.n().o();
        int n3 = client.eJ[n2];
        if (n3 < 0 || n3 >= client.cA.length) {
            return null;
        }
        return client.cA[n3];
    }
}

