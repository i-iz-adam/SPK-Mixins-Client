/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.l
 *  javax.annotation.Nonnull
 */
package rs.a;

import com.google.a.m.l;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

/*
 * Renamed from rs.A.g
 */
public class g_0 {
    public static final int a = 255;
    public static final int b = 0;
    private static final String d = "<col=";
    private static final String e = ">";
    public static final String c = "</col>";
    private static final Pattern f = Pattern.compile("^(#|0x)?[0-9a-fA-F]{7,8}");
    private static final Pattern g = Pattern.compile("^(#|0x)?[0-9a-fA-F]{1,8}");

    public static String a(Color color) {
        return d + g_0.c(color) + e;
    }

    public static String a(String string, Color color) {
        return g_0.a(color) + string;
    }

    public static String b(String string, Color color) {
        return g_0.a(string, color) + c;
    }

    public static String b(Color color) {
        return "#" + g_0.c(color);
    }

    public static Color a(Color color, Color color2, double d2) {
        double d3 = color.getRed();
        double d4 = color2.getRed();
        double d5 = color.getGreen();
        double d6 = color2.getGreen();
        double d7 = color.getBlue();
        double d8 = color2.getBlue();
        double d9 = color.getAlpha();
        double d10 = color2.getAlpha();
        return new Color((int)Math.round(d3 + d2 * (d4 - d3)), (int)Math.round(d5 + d2 * (d6 - d5)), (int)Math.round(d7 + d2 * (d8 - d7)), (int)Math.round(d9 + d2 * (d10 - d9)));
    }

    public static String c(Color color) {
        return String.format("%06x", color.getRGB() & 0xFFFFFF);
    }

    public static String d(Color color) {
        return String.format("%08x", color.getRGB());
    }

    public static Color a(Color color, int n2) {
        if (color.getAlpha() == n2) {
            return color;
        }
        n2 = g_0.a(n2);
        return new Color(color.getRGB() & 0xFFFFFF | n2 << 24, true);
    }

    public static boolean a(String string) {
        return f.matcher(string).matches();
    }

    public static boolean b(String string) {
        return g.matcher(string).matches();
    }

    public static int a(int n2) {
        return l.a((int)n2, (int)0, (int)255);
    }

    public static Color c(String string) {
        try {
            int n2 = Integer.decode(string);
            return new Color(n2, true);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static Color d(String object) {
        if (!((String)object).startsWith("#") && !((String)object).startsWith("0x")) {
            object = "#" + (String)object;
        }
        if (((String)object).length() <= 7 && ((String)object).startsWith("#") || ((String)object).length() <= 8 && ((String)object).startsWith("0x")) {
            try {
                return Color.decode((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        try {
            return new Color(Long.decode((String)object).intValue(), true);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static Color a(@Nonnull Object object) {
        int n2 = object.hashCode();
        float f2 = (float)(n2 % 360) / 360.0f;
        return Color.getHSBColor(f2, 1.0f, 1.0f);
    }
}

