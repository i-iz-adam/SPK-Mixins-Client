/*
 * Decompiled with CFR 0.152.
 */
package rs.A;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p {
    private static final String[] a = new String[]{"", "K", "M", "B", "T"};
    private static final Pattern b = Pattern.compile("^-?[0-9,.]+([a-zA-Z]?)$");
    private static final NumberFormat c = NumberFormat.getInstance(Locale.ENGLISH);
    private static final NumberFormat d = new DecimalFormat("#,###.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
    private static final NumberFormat e = new DecimalFormat("#,###.###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    public static synchronized String a(long l2) {
        String string;
        if (l2 < 0L) {
            return "-" + p.a(l2 == Long.MIN_VALUE ? Long.MAX_VALUE : -l2);
        }
        if (l2 < 10000L) {
            return c.format(l2);
        }
        String string2 = a[0];
        long l3 = 1L;
        for (int i2 = a.length - 1; i2 >= 0; --i2) {
            l3 = (long)Math.pow(10.0, i2 * 3);
            if (!((double)l2 / (double)l3 >= 1.0)) continue;
            string2 = a[i2];
            break;
        }
        string = (string = c.format((double)l2 / (double)l3)).length() > 4 ? string.substring(0, 4) : string;
        return (string.endsWith(".") ? string.substring(0, 3) : string) + string2;
    }

    public static String a(int n2) {
        return p.a(n2, false);
    }

    public static synchronized String a(int n2, boolean bl) {
        String string = String.valueOf(n2);
        if (string.length() <= 4) {
            return string;
        }
        int n3 = (int)Math.log10(n2);
        NumberFormat numberFormat = bl && n3 >= 6 ? e : d;
        return numberFormat.format((double)n2 / Math.pow(10.0, n3 / 3 * 3)) + a[n3 / 3];
    }

    public static synchronized long a(String string) {
        int n2 = p.b(string);
        float f2 = c.parse(string).floatValue();
        return (long)(f2 * (float)n2);
    }

    public static synchronized String b(long l2) {
        return c.format(l2);
    }

    public static synchronized String a(double d2) {
        return c.format(d2);
    }

    private static int b(String string) {
        Matcher matcher = b.matcher(string);
        if (!matcher.find()) {
            throw new ParseException(string + " does not resemble a properly formatted stack.", string.length() - 1);
        }
        String string2 = matcher.group(1);
        if (!string2.equals("")) {
            for (int i2 = 1; i2 < a.length; ++i2) {
                if (!a[i2].equals(string2.toUpperCase())) continue;
                return (int)Math.pow(10.0, i2 * 3);
            }
            throw new ParseException("Invalid Suffix: " + string2, string.length() - 1);
        }
        return 1;
    }
}

