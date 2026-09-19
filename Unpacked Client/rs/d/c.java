/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import rs.x.e;
import rs.x.f;

public final class c {
    private static String[] a = new String[]{"ass", "bastard", "beaner", "bitch", "blow job", "blowjob", "boner", "butt pirate", "carpetmuncher", "chink", "chode", "clit", "cancer", "aids", "my cock", "his cock", "coon", "cum", "cunt", "dick", "dike", "dildo", "dipshit", "douche", "dumbass", "dumbfuck", "dumbshit", "dyke", "fag", "fagg", "faggot", "fatass", "fuck", "gay", "handjob", "hard on", "hoe", "homo", "honkey", "humping", "jackass", "jap", "jerk off", "jizz", "kunt", "kyke", "lesbian", "lesbo", "nigga", "nigger", "niglet", "porch monkey", "porchmonkey", "porn", "prick", "punta", "pussy", "pussy", "puto", "queer", "rimjob", "skank", "skeet", "slut", "spic", "shit", "splooge", "spook", "tard", "suck my", "wank", "wetback", "whore", "xxx"};
    private static int[] b;
    private static char[][] c;
    private static byte[][][] d;
    private static char[][] e;
    private static char[][] f;
    private static int[] g;
    private static final String[] h;

    public static String a(String string) {
        String string2 = string;
        for (String string3 : a) {
            if (!string.toLowerCase().contains(string3.toLowerCase())) continue;
            string2 = string2.toLowerCase().replace(string3.toLowerCase(), rs.d.c.a(string3.length()));
        }
        return string2;
    }

    public static String a(int n2) {
        Object object = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            object = (String)object + "*";
        }
        return object;
    }

    public static void a(f f2) {
        e e2 = new e(f2.a("fragmentsenc.txt"));
        e e3 = new e(f2.a("badenc.txt"));
        e e4 = new e(f2.a("domainenc.txt"));
        e e5 = new e(f2.a("tldlist.txt"));
        rs.d.c.a(e2, e3, e4, e5);
    }

    private static void a(e e2, e e3, e e4, e e5) {
        rs.d.c.b(e3);
        rs.d.c.c(e4);
        rs.d.c.d(e2);
        rs.d.c.a(e5);
    }

    private static void a(e e2) {
        int n2 = e2.D();
        f = new char[n2][];
        g = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            rs.d.c.g[i2] = e2.y();
            char[] cArray = new char[e2.y()];
            for (int i3 = 0; i3 < cArray.length; ++i3) {
                cArray[i3] = (char)e2.y();
            }
            rs.d.c.f[i2] = cArray;
        }
    }

    private static void b(e e2) {
        int n2 = e2.D();
        c = new char[n2][];
        d = new byte[n2][][];
        rs.d.c.a(e2, c, d);
    }

    private static void c(e e2) {
        int n2 = e2.D();
        e = new char[n2][];
        rs.d.c.a(e, e2);
    }

    private static void d(e e2) {
        b = new int[e2.D()];
        for (int i2 = 0; i2 < b.length; ++i2) {
            rs.d.c.b[i2] = e2.A();
        }
    }

    private static void a(e e2, char[][] cArray, byte[][][] byArray) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char[] cArray2 = new char[e2.y()];
            for (int i3 = 0; i3 < cArray2.length; ++i3) {
                cArray2[i3] = (char)e2.y();
            }
            cArray[i2] = cArray2;
            byte[][] byArray2 = new byte[e2.y()][2];
            for (int i4 = 0; i4 < byArray2.length; ++i4) {
                byArray2[i4][0] = (byte)e2.y();
                byArray2[i4][1] = (byte)e2.y();
            }
            if (byArray2.length <= 0) continue;
            byArray[i2] = byArray2;
        }
    }

    private static void a(char[][] cArray, e e2) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char[] cArray2 = new char[e2.y()];
            for (int i3 = 0; i3 < cArray2.length; ++i3) {
                cArray2[i3] = (char)e2.y();
            }
            cArray[i2] = cArray2;
        }
    }

    private static void a(char[] cArray) {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < cArray.length; ++n2) {
            cArray[n3] = rs.d.c.a(cArray[n2]) ? cArray[n2] : 32;
            if (n3 != 0 && cArray[n3] == ' ' && cArray[n3 - 1] == ' ') continue;
            ++n3;
        }
        for (n2 = n3; n2 < cArray.length; ++n2) {
            cArray[n2] = 32;
        }
    }

    private static boolean a(char c2) {
        return c2 >= ' ' && c2 <= '\u007f' || c2 == ' ' || c2 == '\n' || c2 == '\t' || c2 == '\u00a3' || c2 == '\u20ac';
    }

    public static String b(String string) {
        return string;
    }

    private static void a(char[] cArray, char[] cArray2) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            if (cArray2[i2] == '*' || !rs.d.c.h(cArray[i2])) continue;
            cArray2[i2] = cArray[i2];
        }
    }

    private static void b(char[] cArray) {
        boolean bl = true;
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char c2 = cArray[i2];
            if (rs.d.c.e(c2)) {
                if (bl) {
                    if (!rs.d.c.g(c2)) continue;
                    bl = false;
                    continue;
                }
                if (!rs.d.c.h(c2)) continue;
                cArray[i2] = (char)(c2 + 97 - 65);
                continue;
            }
            bl = true;
        }
    }

    private static void c(char[] cArray) {
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = c.length - 1; i3 >= 0; --i3) {
                rs.d.c.a(d[i3], cArray, c[i3]);
            }
        }
    }

    private static void d(char[] cArray) {
        char[] cArray2 = (char[])cArray.clone();
        char[] cArray3 = new char[]{'(', 'a', ')'};
        rs.d.c.a(null, cArray2, cArray3);
        char[] cArray4 = (char[])cArray.clone();
        char[] cArray5 = new char[]{'d', 'o', 't'};
        rs.d.c.a(null, cArray4, cArray5);
        for (int i2 = e.length - 1; i2 >= 0; --i2) {
            rs.d.c.a(cArray, e[i2], cArray4, cArray2);
        }
    }

    private static void a(char[] cArray, char[] cArray2, char[] cArray3, char[] cArray4) {
        int n2;
        if (cArray2.length > cArray.length) {
            return;
        }
        for (int i2 = 0; i2 <= cArray.length - cArray2.length; i2 += n2) {
            int n3;
            char c2;
            char c3;
            int n4 = i2;
            int n5 = 0;
            n2 = 1;
            while (n4 < cArray.length) {
                c3 = cArray[n4];
                c2 = '\u0000';
                if (n4 + 1 < cArray.length) {
                    c2 = cArray[n4 + 1];
                }
                if (n5 < cArray2.length && (n3 = rs.d.c.a(c3, cArray2[n5], c2)) > 0) {
                    n4 += n3;
                    ++n5;
                    continue;
                }
                if (n5 == 0) break;
                n3 = rs.d.c.a(c3, cArray2[n5 - 1], c2);
                if (n3 > 0) {
                    n4 += n3;
                    if (n5 != 1) continue;
                    ++n2;
                    continue;
                }
                if (n5 >= cArray2.length || !rs.d.c.c(c3)) break;
                ++n4;
            }
            if (n5 < cArray2.length) continue;
            n3 = 0;
            c3 = rs.d.c.a(cArray, cArray4, i2);
            c2 = rs.d.c.a(cArray3, n4 - 1, cArray);
            if (c3 > '\u0002' || c2 > '\u0002') {
                n3 = 1;
            }
            if (n3 == 0) continue;
            for (int i3 = i2; i3 < n4; ++i3) {
                cArray[i3] = 42;
            }
        }
    }

    private static int a(char[] cArray, char[] cArray2, int n2) {
        int n3;
        if (n2 == 0) {
            return 2;
        }
        for (n3 = n2 - 1; n3 >= 0 && rs.d.c.c(cArray[n3]); --n3) {
            if (cArray[n3] != '@') continue;
            return 3;
        }
        n3 = 0;
        for (int i2 = n2 - 1; i2 >= 0 && rs.d.c.c(cArray2[i2]); --i2) {
            if (cArray2[i2] != '*') continue;
            ++n3;
        }
        if (n3 >= 3) {
            return 4;
        }
        return !rs.d.c.c(cArray[n2 - 1]) ? 0 : 1;
    }

    private static int a(char[] cArray, int n2, char[] cArray2) {
        int n3;
        if (n2 + 1 == cArray2.length) {
            return 2;
        }
        for (n3 = n2 + 1; n3 < cArray2.length && rs.d.c.c(cArray2[n3]); ++n3) {
            if (cArray2[n3] != '.' && cArray2[n3] != ',') continue;
            return 3;
        }
        n3 = 0;
        for (int i2 = n2 + 1; i2 < cArray2.length && rs.d.c.c(cArray[i2]); ++i2) {
            if (cArray[i2] != '*') continue;
            ++n3;
        }
        if (n3 >= 3) {
            return 4;
        }
        return !rs.d.c.c(cArray2[n2 + 1]) ? 0 : 1;
    }

    private static void e(char[] cArray) {
        char[] cArray2 = (char[])cArray.clone();
        char[] cArray3 = new char[]{'d', 'o', 't'};
        rs.d.c.a(null, cArray2, cArray3);
        char[] cArray4 = (char[])cArray.clone();
        char[] cArray5 = new char[]{'s', 'l', 'a', 's', 'h'};
        rs.d.c.a(null, cArray4, cArray5);
        for (int i2 = 0; i2 < f.length; ++i2) {
            rs.d.c.a(cArray4, f[i2], g[i2], cArray2, cArray);
        }
    }

    private static void a(char[] cArray, char[] cArray2, int n2, char[] cArray3, char[] cArray4) {
        int n3;
        if (cArray2.length > cArray4.length) {
            return;
        }
        for (int i2 = 0; i2 <= cArray4.length - cArray2.length; i2 += n3) {
            int n4;
            int n5;
            int n6;
            char c2;
            char c3;
            int n7 = i2;
            int n8 = 0;
            n3 = 1;
            while (n7 < cArray4.length) {
                c3 = cArray4[n7];
                c2 = '\u0000';
                if (n7 + 1 < cArray4.length) {
                    c2 = cArray4[n7 + 1];
                }
                if (n8 < cArray2.length && (n6 = rs.d.c.a(c3, cArray2[n8], c2)) > 0) {
                    n7 += n6;
                    ++n8;
                    continue;
                }
                if (n8 == 0) break;
                n6 = rs.d.c.a(c3, cArray2[n8 - 1], c2);
                if (n6 > 0) {
                    n7 += n6;
                    if (n8 != 1) continue;
                    ++n3;
                    continue;
                }
                if (n8 >= cArray2.length || !rs.d.c.c(c3)) break;
                ++n7;
            }
            if (n8 < cArray2.length) continue;
            n6 = 0;
            c3 = rs.d.c.b(cArray4, i2, cArray3);
            c2 = rs.d.c.b(cArray4, cArray, n7 - 1);
            if (n2 == 1 && c3 > '\u0000' && c2 > '\u0000') {
                n6 = 1;
            }
            if (n2 == 2 && (c3 > '\u0002' && c2 > '\u0000' || c3 > '\u0000' && c2 > '\u0002')) {
                n6 = 1;
            }
            if (n2 == 3 && c3 > '\u0000' && c2 > '\u0002') {
                n6 = 1;
            }
            if (n6 == 0) continue;
            int n9 = i2;
            int n10 = n7 - 1;
            if (c3 > '\u0002') {
                if (c3 == '\u0004') {
                    n5 = 0;
                    for (n4 = n9 - 1; n4 >= 0; --n4) {
                        if (n5 != 0) {
                            if (cArray3[n4] != '*') break;
                            n9 = n4;
                            continue;
                        }
                        if (cArray3[n4] != '*') continue;
                        n9 = n4;
                        n5 = 1;
                    }
                }
                n5 = 0;
                for (n4 = n9 - 1; n4 >= 0; --n4) {
                    if (n5 != 0) {
                        if (rs.d.c.c(cArray4[n4])) break;
                        n9 = n4;
                        continue;
                    }
                    if (rs.d.c.c(cArray4[n4])) continue;
                    n5 = 1;
                    n9 = n4;
                }
            }
            if (c2 > '\u0002') {
                if (c2 == '\u0004') {
                    n5 = 0;
                    for (n4 = n10 + 1; n4 < cArray4.length; ++n4) {
                        if (n5 != 0) {
                            if (cArray[n4] != '*') break;
                            n10 = n4;
                            continue;
                        }
                        if (cArray[n4] != '*') continue;
                        n10 = n4;
                        n5 = 1;
                    }
                }
                n5 = 0;
                for (n4 = n10 + 1; n4 < cArray4.length; ++n4) {
                    if (n5 != 0) {
                        if (rs.d.c.c(cArray4[n4])) break;
                        n10 = n4;
                        continue;
                    }
                    if (rs.d.c.c(cArray4[n4])) continue;
                    n5 = 1;
                    n10 = n4;
                }
            }
            for (n5 = n9; n5 <= n10; ++n5) {
                cArray4[n5] = 42;
            }
        }
    }

    private static int b(char[] cArray, int n2, char[] cArray2) {
        int n3;
        if (n2 == 0) {
            return 2;
        }
        for (n3 = n2 - 1; n3 >= 0 && rs.d.c.c(cArray[n3]); --n3) {
            if (cArray[n3] != ',' && cArray[n3] != '.') continue;
            return 3;
        }
        n3 = 0;
        for (int i2 = n2 - 1; i2 >= 0 && rs.d.c.c(cArray2[i2]); --i2) {
            if (cArray2[i2] != '*') continue;
            ++n3;
        }
        if (n3 >= 3) {
            return 4;
        }
        return !rs.d.c.c(cArray[n2 - 1]) ? 0 : 1;
    }

    private static int b(char[] cArray, char[] cArray2, int n2) {
        int n3;
        if (n2 + 1 == cArray.length) {
            return 2;
        }
        for (n3 = n2 + 1; n3 < cArray.length && rs.d.c.c(cArray[n3]); ++n3) {
            if (cArray[n3] != '\\' && cArray[n3] != '/') continue;
            return 3;
        }
        n3 = 0;
        for (int i2 = n2 + 1; i2 < cArray.length && rs.d.c.c(cArray2[i2]); ++i2) {
            if (cArray2[i2] != '*') continue;
            ++n3;
        }
        if (n3 >= 5) {
            return 4;
        }
        return !rs.d.c.c(cArray[n2 + 1]) ? 0 : 1;
    }

    private static void a(byte[][] byArray, char[] cArray, char[] cArray2) {
        int n2;
        if (cArray2.length > cArray.length) {
            return;
        }
        for (int i2 = 0; i2 <= cArray.length - cArray2.length; i2 += n2) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = i2;
            int n9 = 0;
            int n10 = 0;
            n2 = 1;
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            while (!(n8 >= cArray.length || bl2 && bl3)) {
                n7 = cArray[n8];
                n6 = 0;
                if (n8 + 1 < cArray.length) {
                    n6 = cArray[n8 + 1];
                }
                if (n9 < cArray2.length && (n5 = rs.d.c.b((char)n6, (char)n7, cArray2[n9])) > 0) {
                    if (n5 == 1 && rs.d.c.f((char)n7)) {
                        bl2 = true;
                    }
                    if (n5 == 2 && (rs.d.c.f((char)n7) || rs.d.c.f((char)n6))) {
                        bl2 = true;
                    }
                    n8 += n5;
                    ++n9;
                    continue;
                }
                if (n9 == 0) break;
                n5 = rs.d.c.b((char)n6, (char)n7, cArray2[n9 - 1]);
                if (n5 > 0) {
                    n8 += n5;
                    if (n9 != 1) continue;
                    ++n2;
                    continue;
                }
                if (n9 >= cArray2.length || !rs.d.c.d((char)n7)) break;
                if (rs.d.c.c((char)n7) && n7 != 39) {
                    bl = true;
                }
                if (rs.d.c.f((char)n7)) {
                    bl3 = true;
                }
                if (++n10 * 100 / (++n8 - i2) <= 90) continue;
                break;
            }
            if (n9 < cArray2.length || bl2 && bl3) continue;
            n5 = 1;
            if (!bl) {
                n7 = 32;
                if (i2 - 1 >= 0) {
                    n7 = cArray[i2 - 1];
                }
                n6 = 32;
                if (n8 < cArray.length) {
                    n6 = cArray[n8];
                }
                n4 = rs.d.c.b((char)n7);
                n3 = rs.d.c.b((char)n6);
                if (byArray != null && rs.d.c.a((byte)n4, byArray, (byte)n3)) {
                    n5 = 0;
                }
            } else {
                n7 = 0;
                n6 = 0;
                if (i2 - 1 < 0 || rs.d.c.c(cArray[i2 - 1]) && cArray[i2 - 1] != '\'') {
                    n7 = 1;
                }
                if (n8 >= cArray.length || rs.d.c.c(cArray[n8]) && cArray[n8] != '\'') {
                    n6 = 1;
                }
                if (n7 == 0 || n6 == 0) {
                    n4 = 0;
                    n3 = i2 - 2;
                    if (n7 != 0) {
                        n3 = i2;
                    }
                    while (n4 == 0 && n3 < n8) {
                        if (!(n3 < 0 || rs.d.c.c(cArray[n3]) && cArray[n3] != '\'')) {
                            int n11;
                            char[] cArray3 = new char[3];
                            for (n11 = 0; !(n11 >= 3 || n3 + n11 >= cArray.length || rs.d.c.c(cArray[n3 + n11]) && cArray[n3 + n11] != '\''); ++n11) {
                                cArray3[n11] = cArray[n3 + n11];
                            }
                            boolean bl4 = true;
                            if (n11 == 0) {
                                bl4 = false;
                            }
                            if (!(n11 >= 3 || n3 - 1 < 0 || rs.d.c.c(cArray[n3 - 1]) && cArray[n3 - 1] != '\'')) {
                                bl4 = false;
                            }
                            if (bl4 && !rs.d.c.g(cArray3)) {
                                n4 = 1;
                            }
                        }
                        ++n3;
                    }
                    if (n4 == 0) {
                        n5 = 0;
                    }
                }
            }
            if (n5 == 0) continue;
            n7 = 0;
            n6 = 0;
            n4 = -1;
            for (n3 = i2; n3 < n8; ++n3) {
                if (rs.d.c.f(cArray[n3])) {
                    ++n7;
                    continue;
                }
                if (!rs.d.c.e(cArray[n3])) continue;
                ++n6;
                n4 = n3;
            }
            if (n4 > -1) {
                n7 -= n8 - 1 - n4;
            }
            if (n7 <= n6) {
                for (n3 = i2; n3 < n8; ++n3) {
                    cArray[n3] = 42;
                }
                continue;
            }
            n2 = 1;
        }
    }

    private static boolean a(byte by, byte[][] byArray, byte by2) {
        int n2 = 0;
        if (byArray[n2][0] == by && byArray[n2][1] == by2) {
            return true;
        }
        int n3 = byArray.length - 1;
        if (byArray[n3][0] == by && byArray[n3][1] == by2) {
            return true;
        }
        do {
            int n4;
            if (byArray[n4 = (n2 + n3) / 2][0] == by && byArray[n4][1] == by2) {
                return true;
            }
            if (by < byArray[n4][0] || by == byArray[n4][0] && by2 < byArray[n4][1]) {
                n3 = n4;
                continue;
            }
            n2 = n4;
        } while (n2 != n3 && n2 + 1 != n3);
        return false;
    }

    private static int a(char c2, char c3, char c4) {
        if (c3 == c2) {
            return 1;
        }
        if (c3 == 'o' && c2 == '0') {
            return 1;
        }
        if (c3 == 'o' && c2 == '(' && c4 == ')') {
            return 2;
        }
        if (c3 == 'c' && (c2 == '(' || c2 == '<' || c2 == '[')) {
            return 1;
        }
        if (c3 == 'e' && c2 == '\u20ac') {
            return 1;
        }
        if (c3 == 's' && c2 == '$') {
            return 1;
        }
        return c3 != 'l' || c2 != 'i' ? 0 : 1;
    }

    private static int b(char c2, char c3, char c4) {
        if (c4 == c3) {
            return 1;
        }
        if (c4 >= 'a' && c4 <= 'm') {
            if (c4 == 'a') {
                if (c3 == '4' || c3 == '@' || c3 == '^') {
                    return 1;
                }
                return c3 != '/' || c2 != '\\' ? 0 : 2;
            }
            if (c4 == 'b') {
                if (c3 == '6' || c3 == '8') {
                    return 1;
                }
                return !(c3 == '1' && c2 == '3' || c3 == 'i' && c2 == '3') ? 0 : 2;
            }
            if (c4 == 'c') {
                return c3 != '(' && c3 != '<' && c3 != '{' && c3 != '[' ? 0 : 1;
            }
            if (c4 == 'd') {
                return !(c3 == '[' && c2 == ')' || c3 == 'i' && c2 == ')') ? 0 : 2;
            }
            if (c4 == 'e') {
                return c3 != '3' && c3 != '\u20ac' ? 0 : 1;
            }
            if (c4 == 'f') {
                if (c3 == 'p' && c2 == 'h') {
                    return 2;
                }
                return c3 != '\u00a3' ? 0 : 1;
            }
            if (c4 == 'g') {
                return c3 != '9' && c3 != '6' && c3 != 'q' ? 0 : 1;
            }
            if (c4 == 'h') {
                return c3 != '#' ? 0 : 1;
            }
            if (c4 == 'i') {
                return c3 != 'y' && c3 != 'l' && c3 != 'j' && c3 != '1' && c3 != '!' && c3 != ':' && c3 != ';' && c3 != '|' ? 0 : 1;
            }
            if (c4 == 'j') {
                return 0;
            }
            if (c4 == 'k') {
                return 0;
            }
            if (c4 == 'l') {
                return c3 != '1' && c3 != '|' && c3 != 'i' ? 0 : 1;
            }
            if (c4 == 'm') {
                return 0;
            }
        }
        if (c4 >= 'n' && c4 <= 'z') {
            if (c4 == 'n') {
                return 0;
            }
            if (c4 == 'o') {
                if (c3 == '0' || c3 == '*') {
                    return 1;
                }
                return !(c3 == '(' && c2 == ')' || c3 == '[' && c2 == ']' || c3 == '{' && c2 == '}' || c3 == '<' && c2 == '>') ? 0 : 2;
            }
            if (c4 == 'p') {
                return 0;
            }
            if (c4 == 'q') {
                return 0;
            }
            if (c4 == 'r') {
                return 0;
            }
            if (c4 == 's') {
                return c3 != '5' && c3 != 'z' && c3 != '$' && c3 != '2' ? 0 : 1;
            }
            if (c4 == 't') {
                return c3 != '7' && c3 != '+' ? 0 : 1;
            }
            if (c4 == 'u') {
                if (c3 == 'v') {
                    return 1;
                }
                return !(c3 == '\\' && c2 == '/' || c3 == '\\' && c2 == '|' || c3 == '|' && c2 == '/') ? 0 : 2;
            }
            if (c4 == 'v') {
                return !(c3 == '\\' && c2 == '/' || c3 == '\\' && c2 == '|' || c3 == '|' && c2 == '/') ? 0 : 2;
            }
            if (c4 == 'w') {
                return c3 != 'v' || c2 != 'v' ? 0 : 2;
            }
            if (c4 == 'x') {
                return !(c3 == ')' && c2 == '(' || c3 == '}' && c2 == '{' || c3 == ']' && c2 == '[' || c3 == '>' && c2 == '<') ? 0 : 2;
            }
            if (c4 == 'y') {
                return 0;
            }
            if (c4 == 'z') {
                return 0;
            }
        }
        if (c4 >= '0' && c4 <= '9') {
            if (c4 == '0') {
                if (c3 == 'o' || c3 == 'O') {
                    return 1;
                }
                return !(c3 == '(' && c2 == ')' || c3 == '{' && c2 == '}' || c3 == '[' && c2 == ']') ? 0 : 2;
            }
            if (c4 == '1') {
                return c3 != 'l' ? 0 : 1;
            }
            return 0;
        }
        if (c4 == ',') {
            return c3 != '.' ? 0 : 1;
        }
        if (c4 == '.') {
            return c3 != ',' ? 0 : 1;
        }
        if (c4 == '!') {
            return c3 != 'i' ? 0 : 1;
        }
        return 0;
    }

    private static byte b(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return (byte)(c2 - 97 + 1);
        }
        if (c2 == '\'') {
            return 28;
        }
        if (c2 >= '0' && c2 <= '9') {
            return (byte)(c2 - 48 + 29);
        }
        return 27;
    }

    private static void f(char[] cArray) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while ((n2 = rs.d.c.a(cArray, n3)) != -1) {
            int n6;
            int n7;
            boolean bl = false;
            for (n7 = n3; n7 >= 0 && n7 < n2 && !bl; ++n7) {
                if (rs.d.c.c(cArray[n7]) || rs.d.c.d(cArray[n7])) continue;
                bl = true;
            }
            if (bl) {
                n4 = 0;
            }
            if (n4 == 0) {
                n5 = n2;
            }
            n3 = rs.d.c.b(cArray, n2);
            n7 = 0;
            for (n6 = n2; n6 < n3; ++n6) {
                n7 = n7 * 10 + cArray[n6] - 48;
            }
            n4 = n7 > 255 || n3 - n2 > 8 ? 0 : ++n4;
            if (n4 != 4) continue;
            for (n6 = n5; n6 < n3; ++n6) {
                cArray[n6] = 42;
            }
            n4 = 0;
        }
    }

    private static int a(char[] cArray, int n2) {
        for (int i2 = n2; i2 < cArray.length && i2 >= 0; ++i2) {
            if (cArray[i2] < '0' || cArray[i2] > '9') continue;
            return i2;
        }
        return -1;
    }

    private static int b(char[] cArray, int n2) {
        for (int i2 = n2; i2 < cArray.length && i2 >= 0; ++i2) {
            if (cArray[i2] >= '0' && cArray[i2] <= '9') continue;
            return i2;
        }
        return cArray.length;
    }

    private static boolean c(char c2) {
        return !rs.d.c.e(c2) && !rs.d.c.f(c2);
    }

    private static boolean d(char c2) {
        return c2 < 'a' || c2 > 'z' || c2 == 'v' || c2 == 'x' || c2 == 'j' || c2 == 'q' || c2 == 'z';
    }

    private static boolean e(char c2) {
        return c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z';
    }

    private static boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean g(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    private static boolean h(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static boolean g(char[] cArray) {
        int n2;
        boolean bl = true;
        for (n2 = 0; n2 < cArray.length; ++n2) {
            if (rs.d.c.f(cArray[n2]) || cArray[n2] == '\u0000') continue;
            bl = false;
        }
        if (bl) {
            return true;
        }
        n2 = rs.d.c.h(cArray);
        int n3 = 0;
        int n4 = b.length - 1;
        if (n2 == b[n3] || n2 == b[n4]) {
            return true;
        }
        do {
            int n5;
            if (n2 == b[n5 = (n3 + n4) / 2]) {
                return true;
            }
            if (n2 < b[n5]) {
                n4 = n5;
                continue;
            }
            n3 = n5;
        } while (n3 != n4 && n3 + 1 != n4);
        return false;
    }

    private static int h(char[] cArray) {
        if (cArray.length > 6) {
            return 0;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char c2 = cArray[cArray.length - i2 - 1];
            if (c2 >= 'a' && c2 <= 'z') {
                n2 = n2 * 38 + (c2 - 97 + 1);
                continue;
            }
            if (c2 == '\'') {
                n2 = n2 * 38 + 27;
                continue;
            }
            if (c2 >= '0' && c2 <= '9') {
                n2 = n2 * 38 + (c2 - 48 + 28);
                continue;
            }
            if (c2 == '\u0000') continue;
            return 0;
        }
        return n2;
    }

    static {
        h = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
    }
}

