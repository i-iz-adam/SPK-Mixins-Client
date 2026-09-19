/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class o {
    private static final double a = Math.sqrt(2.0);
    private static final double b = 3.075;
    private static final int c = 5;
    private static final int d = 13;
    private static final int e = 15;
    private static final Pattern f = Pattern.compile("^[ \\t]*(?<expr>//.*$|m[ \\t]*(?<mrx>[0-9]+)[ \\t]+(?<mry>[0-9]+)|r[ \\t]*(?<rx>[0-9]+)[ \\t]+(?<ry>[0-9]+)|R[ \\t]*(?<rx1>[0-9]+)[ \\t]+(?<ry1>[0-9]+)[ \\t]+(?<rx2>[0-9]+)[ \\t]+(?<ry2>[0-9]+)|c[ \\t]*(?<cx>[0-9-]+)[ \\t]+(?<cy>[0-9-]+)|C[ \\t]*(?<cx1>[0-9-]+)[ \\t]+(?<cy1>[0-9-]+)[ \\t]+(?<cx2>[0-9-]+)[ \\t]+(?<cy2>[0-9-]+)|#[ \\t]*(?<color>[0-9a-fA-F]{6}|[0-9a-fA-F]{3})|p[ \\t]*(?<plane>all|0?[ \\t]*1?[ \\t]*2?[ \\t]*3?)|b[ \\t]*(?<blend>[0-9]+)|bounds[ \\t]+(?<bx1>[0-9]+)[ \\t]+(?<by1>[0-9]+)[ \\t]+(?<bx2>[0-9]+)[ \\t]+(?<by2>[0-9]+))[ \\t]*");
    private final int[] g;
    private final int[] h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    public o(InputStream inputStream, String string) {
        this(new InputStreamReader(inputStream), string);
    }

    public o(Reader reader, String string) {
        int[] nArray = null;
        int[] nArray2 = new int[64];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        BufferedReader bufferedReader = new BufferedReader(reader);
        int n8 = 1;
        int n9 = 0;
        int n10 = 15;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        try {
            String string2;
            Matcher matcher = f.matcher("");
            while ((string2 = bufferedReader.readLine()) != null) {
                matcher.reset(string2);
                int n15 = 0;
                block11: while (n15 < string2.length()) {
                    matcher.region(n15, string2.length());
                    if (!matcher.find()) {
                        throw new IllegalArgumentException("Unexpected: \"" + string2.substring(n15) + "\" (" + string + ":" + n8 + ")");
                    }
                    n15 = matcher.end();
                    String string3 = matcher.group("expr");
                    if (string3 == null || string3.length() <= 0 || string3.startsWith("//")) continue;
                    if (nArray == null) {
                        if (!string3.startsWith("bounds")) {
                            throw new IllegalArgumentException("Expected bounds (" + string + ":" + n8 + ")");
                        }
                        n3 = Integer.parseInt(matcher.group("bx1")) * 8;
                        n4 = Integer.parseInt(matcher.group("by1")) * 8;
                        n5 = (Integer.parseInt(matcher.group("bx2")) + 1) * 8;
                        n6 = (Integer.parseInt(matcher.group("by2")) + 1) * 8;
                        n7 = n5 - n3;
                        nArray = new int[n7 * (n6 - n4)];
                        Arrays.fill(nArray, -1);
                        continue;
                    }
                    char c2 = string3.charAt(0);
                    switch (c2) {
                        case '#': {
                            int n16;
                            int n17;
                            int n18;
                            String string4 = matcher.group("color");
                            int n19 = Integer.parseInt(string4, 16);
                            if (string4.length() == 3) {
                                n18 = n19 >> 8 & 0xF;
                                n18 |= n18 << 4;
                                n17 = n19 >> 4 & 0xF;
                                n17 |= n17 << 4;
                                n16 = n19 & 0xF;
                                n16 |= n16 << 4;
                            } else {
                                n18 = n19 >> 16 & 0xFF;
                                n17 = n19 >> 8 & 0xFF;
                                n16 = n19 & 0xFF;
                            }
                            byte by = (byte)(n16 - n18);
                            byte by2 = (byte)(n18 + (by >> 1));
                            byte by3 = (byte)(by2 - n17);
                            byte by4 = (byte)(n17 + (by3 >> 1));
                            n9 = n9 & 0xFF000000 | (by4 & 0xFF) << 16 | (by & 0xFF) << 8 | by3 & 0xFF;
                            break;
                        }
                        case 'b': {
                            int n20 = Integer.parseInt(matcher.group("blend"));
                            if (n20 < 0) {
                                throw new IllegalArgumentException("Blend must be >=0 (" + string + ":" + n8 + ")");
                            }
                            if (n20 > 13) {
                                throw new IllegalArgumentException("Blend must be <= 13 (" + string + ":" + n8 + ")");
                            }
                            n9 = n9 & 0xFFFFFF | n20 << 24;
                            break;
                        }
                        case 'm': {
                            n13 = n11 = Integer.parseInt(matcher.group("mrx"));
                            n14 = n12 = Integer.parseInt(matcher.group("mry"));
                            break;
                        }
                        case 'p': {
                            int n21;
                            String string5 = matcher.group("plane");
                            if ("all".equals(string5)) {
                                n10 = 15;
                                break;
                            }
                            n10 = 0;
                            for (n21 = 0; n21 < string5.length(); ++n21) {
                                n10 |= 1 << string5.charAt(n21) - 48;
                            }
                            continue block11;
                        }
                        case 'R': 
                        case 'r': {
                            if (c2 == 'r') {
                                n13 = n11 = Integer.parseInt(matcher.group("rx"));
                                n14 = n12 = Integer.parseInt(matcher.group("ry"));
                            } else {
                                n11 = Integer.parseInt(matcher.group("rx1"));
                                n12 = Integer.parseInt(matcher.group("ry1"));
                                n13 = Integer.parseInt(matcher.group("rx2"));
                                n14 = Integer.parseInt(matcher.group("ry2"));
                            }
                        }
                        case 'C': 
                        case 'c': {
                            int n21 = n11 * 8;
                            int n22 = n12 * 8;
                            int n23 = n13 * 8 + 7;
                            int n24 = n14 * 8 + 7;
                            if (c2 == 'c') {
                                n23 = n21 += Integer.parseInt(matcher.group("cx"));
                                n24 = n22 += Integer.parseInt(matcher.group("cy"));
                            } else if (c2 == 'C') {
                                n23 = n21 + Integer.parseInt(matcher.group("cx2"));
                                n24 = n22 + Integer.parseInt(matcher.group("cy2"));
                                n21 += Integer.parseInt(matcher.group("cx1"));
                                n22 += Integer.parseInt(matcher.group("cy1"));
                            }
                            if (n21 < n3 || n22 < n4 || n23 >= n5 || n24 >= n6) {
                                throw new IllegalArgumentException("Coordinate out of bounds (" + string + ":" + n8 + ")");
                            }
                            if (n21 > n23 || n22 > n24) {
                                throw new IllegalArgumentException("First coord must be before second (" + string + ":" + n8 + ")");
                            }
                            for (int i2 = n22; i2 <= n24; ++i2) {
                                int n25 = n7 * (i2 - n4);
                                for (int i3 = n21; i3 <= n23; ++i3) {
                                    int n26;
                                    int n27;
                                    int n28 = i3 - n3 + n25;
                                    if (n10 == 15) {
                                        nArray[n28] = n9;
                                        continue;
                                    }
                                    int n29 = nArray[n28];
                                    if ((n29 & Integer.MIN_VALUE) != 0 && n29 != -1) {
                                        n27 = n29 & Integer.MAX_VALUE;
                                    } else {
                                        n27 = n2;
                                        if ((n2 += 4) > nArray2.length) {
                                            nArray2 = Arrays.copyOf(nArray2, n2 + 64);
                                        }
                                        nArray[n28] = n27 | Integer.MIN_VALUE;
                                        for (n26 = 0; n26 < 4; ++n26) {
                                            nArray2[n27 + n26] = n29;
                                        }
                                    }
                                    for (n26 = 0; n26 < 4; ++n26) {
                                        if ((n10 & 1 << n26) == 0) continue;
                                        nArray2[n27 + n26] = n9;
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                ++n8;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException("Expected number (" + string + ":" + n8 + ")", numberFormatException);
        }
        if (nArray == null) {
            throw new IllegalArgumentException(string + ": no data");
        }
        this.g = nArray;
        this.h = nArray2;
        this.m = n7;
        this.i = n3;
        this.j = n4;
        this.k = n5;
        this.l = n6;
    }

    private int a(int n2, int n3, int n4, a a2) {
        int n5;
        if (a2 != null) {
            n5 = a2.a(n2, n3, n4);
            if (n5 == -1) {
                return -1;
            }
            n3 = n5 >> 3 & 0x7FF;
            n2 = n5 >> 14 & 0x3FF;
            n4 = n5 >> 24 & 3;
        }
        if (n2 < this.i) {
            n2 = this.i;
        }
        if (n2 >= this.k) {
            n2 = this.k - 1;
        }
        if (n3 < this.j) {
            n3 = this.j;
        }
        if (n3 >= this.l) {
            n3 = this.l - 1;
        }
        if ((n5 = this.g[this.m * (n3 - this.j) + (n2 - this.i)]) == -1) {
            return -1;
        }
        if ((n5 & Integer.MIN_VALUE) != 0) {
            n5 = this.h[n5 & Integer.MAX_VALUE | n4];
        }
        return n5;
    }

    public int a(double d2, double d3, int n2, int n3, int n4, double d4, a a2) {
        int n5;
        int n6;
        int n7;
        int n8 = (int)(d2 /= 8.0);
        int n9 = (int)(d3 /= 8.0);
        int n10 = this.a(n2 / 8, n3 / 8, n4, a2);
        if (n10 == -1) {
            return 0;
        }
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        double d8 = 0.0;
        int n11 = (int)(d2 - 5.0);
        int n12 = (int)Math.ceil(d2 + 5.0);
        int n13 = (int)(d3 - 5.0);
        int n14 = (int)Math.ceil(d3 + 5.0);
        for (n7 = n11; n7 < n12; ++n7) {
            for (n6 = n13; n6 <= n14; ++n6) {
                n5 = this.a(n7, n6, n4, a2);
                if (n5 == -1) continue;
                double d9 = ((double)(n5 >>> 24) + 0.125) / 8.0;
                double d10 = 1.0 + d9 * 3.075;
                double d11 = (double)n7 - d2;
                double d12 = d11 + 1.0;
                if (d11 < -d10 || d11 > d10) continue;
                double d13 = (double)n6 - d3;
                double d14 = d13 + 1.0;
                if (d13 < -d10 || d14 > d10) continue;
                double d15 = d9 * a;
                double d16 = (this.a(d11 / d15) - this.a(d12 / d15)) * (this.a(d13 / d15) - this.a(d14 / d15));
                double d17 = (double)(n5 >>> 16 & 0xFF) / 255.0;
                double d18 = (double)((byte)(n5 >>> 8)) / 128.0;
                double d19 = (double)((byte)n5) / 128.0;
                d6 += d17 * d16;
                d7 += d18 * d16;
                d8 += d19 * d16;
                d5 += d16;
            }
        }
        n7 = (byte)Math.min(Math.max(Math.round(d6 / d5 * 255.0), 0L), 255L);
        n6 = (byte)Math.min(Math.max(Math.round(d7 * 128.0 / d5), -128L), 127L);
        n5 = (byte)Math.min(Math.max(Math.round(d8 * 128.0 / d5), -128L), 127L);
        int n15 = n7 - (n5 >> 1) & 0xFF;
        int n16 = n15 + n5 & 0xFF;
        int n17 = n16 - (n6 >> 1) & 0xFF;
        int n18 = n17 + n6 & 0xFF;
        float[] fArray = Color.RGBtoHSB(n17, n15, n18, null);
        fArray[2] = (float)Math.pow(fArray[2], d4);
        return 0xFFFFFF & Color.HSBtoRGB(fArray[0], fArray[1], fArray[2]);
    }

    private double a(double d2) {
        double d3 = Math.abs(d2);
        double d4 = 1.0 / (1.0 + d3 * 0.3275911);
        double d5 = 1.0 - ((((1.061405429 * d4 - 1.453152027) * d4 + 1.421413741) * d4 - 0.284496736) * d4 + 0.254829592) * d4 * Math.exp(-d3 * d3);
        return Math.copySign(d5, d2);
    }

    BufferedImage a(double d2, int n2, int n3, a a2) {
        int n4 = (int)((double)((this.k - this.i) * 8) * d2);
        int n5 = (int)((double)((this.l - this.j) * 8) * d2);
        BufferedImage bufferedImage = new BufferedImage(n4, n5, 2);
        int n6 = n2 <= 0 ? Integer.MAX_VALUE : (int)((double)n2 * d2);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                if (i3 % n6 == 0 || i2 % n6 == 0) {
                    n7 = 0xFFFFFF;
                } else {
                    double d3 = (double)(this.i * 8) + (double)i3 / d2;
                    double d4 = (double)(this.j * 8) + (double)i2 / d2;
                    n7 = this.a(d3, d4, (int)d3, (int)d4, n3, 0.8, a2);
                }
                bufferedImage.setRGB(i3, n5 - 1 - i2, n7 | 0xFF000000);
            }
        }
        return bufferedImage;
    }

    @FunctionalInterface
    public static interface a {
        public int a(int var1, int var2, int var3);
    }
}

