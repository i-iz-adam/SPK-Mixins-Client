/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.v.a;

/*
 * Renamed from rs.O
 */
public final class o_0 {
    public static final String a = ":";
    public static final String b = "*";
    private static final char[] c = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static long a(String string) {
        long l2 = 0L;
        for (int i2 = 0; i2 < string.length() && i2 < 12; ++i2) {
            char c2 = string.charAt(i2);
            l2 *= 37L;
            if (c2 >= 'A' && c2 <= 'Z') {
                l2 += (long)('\u0001' + c2 - 65);
                continue;
            }
            if (c2 >= 'a' && c2 <= 'z') {
                l2 += (long)('\u0001' + c2 - 97);
                continue;
            }
            if (c2 < '0' || c2 > '9') continue;
            l2 += (long)(27 + c2 - 48);
        }
        while (l2 % 37L == 0L && l2 != 0L) {
            l2 /= 37L;
        }
        return l2;
    }

    public static String a(long l2) {
        try {
            if (l2 <= 0L || l2 >= 6582952005840035281L) {
                return "invalid_name";
            }
            if (l2 % 37L == 0L) {
                return "invalid_name";
            }
            int n2 = 0;
            char[] cArray = new char[12];
            while (l2 != 0L) {
                long l3 = l2;
                cArray[11 - n2++] = c[(int)(l3 - (l2 /= 37L) * 37L)];
            }
            return new String(cArray, 12 - n2, n2);
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("81570, " + l2 + ", -99, " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public static long b(String string) {
        string = string.toUpperCase();
        long l2 = 0L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            l2 = l2 * 61L + (long)string.charAt(i2) - 32L;
            l2 = l2 + (l2 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return l2;
    }

    public static String a(int n2) {
        return (n2 >> 24 & 0xFF) + "." + (n2 >> 16 & 0xFF) + "." + (n2 >> 8 & 0xFF) + "." + (n2 & 0xFF);
    }

    public static String c(String string) {
        if (string.length() > 0) {
            char[] cArray = string.toCharArray();
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                if (cArray[i2] != '_') continue;
                cArray[i2] = 32;
                if (i2 + 1 >= cArray.length || cArray[i2 + 1] < 'a' || cArray[i2 + 1] > 'z') continue;
                cArray[i2 + 1] = (char)(cArray[i2 + 1] + 65 - 97);
            }
            if (cArray[0] >= 'a' && cArray[0] <= 'z') {
                cArray[0] = (char)(cArray[0] + 65 - 97);
            }
            return o_0.d(new String(cArray));
        }
        return string;
    }

    public static String d(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (i2 == 0 || i2 > 0 && string.charAt(i2 - 1) == ' ') {
                stringBuilder.append(("" + string.charAt(i2)).toUpperCase());
                continue;
            }
            stringBuilder.append(("" + string.charAt(i2)).toLowerCase());
        }
        return stringBuilder.toString();
    }

    public static String e(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            stringBuffer.append(b);
        }
        return stringBuffer.toString();
    }
}

