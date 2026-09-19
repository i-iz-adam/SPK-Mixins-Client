/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.x.e;

/*
 * Renamed from rs.P
 */
public final class p_0 {
    private static final char[] a = new char[100];
    private static final e b = new e(new byte[100]);
    private static char[] c = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '\u00a3', '$', '%', '\"', '[', ']', '>', '<', '^', '/', '_'};

    public static String a(int n2, e e2) {
        int n3;
        int n4;
        int n5 = 0;
        int n6 = -1;
        for (n4 = 0; n4 < n2; ++n4) {
            n3 = e2.y();
            p_0.a[n5++] = c[n3];
        }
        n4 = 1;
        for (n3 = 0; n3 < n5; ++n3) {
            char c2 = a[n3];
            if (n4 != 0 && c2 >= 'a' && c2 <= 'z') {
                int n7 = n3;
                a[n7] = (char)(a[n7] + 65504);
                n4 = 0;
            }
            if (c2 != '.' && c2 != '!' && c2 != '?') continue;
            n4 = 1;
        }
        return new String(a, 0, n5);
    }

    public static void a(String string, e e2) {
        if (string.length() > 80) {
            string = string.substring(0, 80);
        }
        string = string.toLowerCase();
        int n2 = -1;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            int n3 = 0;
            for (int i3 = 0; i3 < c.length; ++i3) {
                if (c2 != c[i3]) continue;
                n3 = i3;
                break;
            }
            e2.b(n3);
        }
    }

    public static String a(String string) {
        p_0.b.h = 0;
        p_0.a(string, b);
        int n2 = p_0.b.h;
        p_0.b.h = 0;
        return p_0.a(n2, b);
    }
}

