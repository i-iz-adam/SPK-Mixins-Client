/*
 * Decompiled with CFR 0.152.
 */
package rs.A;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t {
    private static final Pattern a = Pattern.compile("(?i)[^*]+|(\\*)");

    public static boolean a(String string, String string2) {
        Matcher matcher = a.matcher(string);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(?i)");
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                matcher.appendReplacement(stringBuffer, ".*");
                continue;
            }
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(Pattern.quote(matcher.group(0))));
        }
        matcher.appendTail(stringBuffer);
        String string3 = stringBuffer.toString();
        return string2.matches(string3);
    }
}

