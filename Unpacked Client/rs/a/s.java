/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.H
 *  com.google.a.b.af
 *  com.google.a.b.k
 *  org.apache.commons.text.WordUtils
 *  org.apache.commons.text.similarity.JaroWinklerDistance
 */
package rs.A;

import com.google.a.b.H;
import com.google.a.b.af;
import com.google.a.b.k;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import rs.a.k_0;

public class s {
    private static final JaroWinklerDistance b = new JaroWinklerDistance();
    private static final Pattern c = Pattern.compile("<[^>]*>");
    private static final af d = af.a((String)",").a().b();
    private static final H e = H.a((String)",").a();
    public static final k a = new k_0();

    public static List<String> a(String string) {
        return d.b((CharSequence)string);
    }

    public static String a(Collection<String> collection) {
        return e.a(collection);
    }

    public static String b(String string) {
        return c.matcher(string).replaceAll("");
    }

    public static String c(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = c.matcher(string);
        while (matcher.find()) {
            String string2;
            matcher.appendReplacement(stringBuffer, "");
            switch (string2 = matcher.group(0)) {
                case "<lt>": 
                case "<gt>": {
                    stringBuffer.append(string2);
                }
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String d(String string) {
        return s.b(string).replace('\u00a0', ' ').trim().toLowerCase();
    }

    public static String e(String string) {
        return k.e().j((CharSequence)string.replaceAll("[\u00a0_-]", " ")).trim();
    }

    public static String f(String string) {
        return s.b(string.replaceAll("-<br>", "-").replaceAll("<br>", " ").replaceAll("[ ]+", " "));
    }

    public static String g(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '<') {
                stringBuilder.append("<lt>");
                continue;
            }
            if (c2 == '>') {
                stringBuilder.append("<gt>");
                continue;
            }
            if (c2 == '\n') {
                stringBuilder.append("<br>");
                continue;
            }
            if (c2 == '\r') continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static String h(String string) {
        String string2 = string.contains("<img") ? string.substring(string.lastIndexOf(62) + 1) : string;
        return string2.replace('\u00a0', ' ');
    }

    public static String a(Enum enum_) {
        String string = enum_.toString();
        if (enum_.name().equals(string)) {
            return WordUtils.capitalize((String)string.toLowerCase(), (char[])new char[]{'_'}).replace("_", " ");
        }
        return string;
    }

    public static boolean a(Iterable<String> iterable, Collection<String> collection) {
        for (String string : iterable) {
            if (!collection.stream().noneMatch(string2 -> string2.contains(string) || b.apply((CharSequence)string2, (CharSequence)string) > 0.9)) continue;
            return false;
        }
        return true;
    }
}

