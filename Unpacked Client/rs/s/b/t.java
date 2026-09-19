/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.af
 *  org.apache.commons.a.F
 */
package rs.s.b;

import com.google.a.b.af;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.a.F;
import rs.A.s;
import rs.s.b.v;

public class t {
    private static final af a = af.a((String)" ").b().a();

    public static <T extends v> List<T> a(Collection<T> collection, String string) {
        return collection.stream().filter(v2 -> s.a(a.a((CharSequence)string.toLowerCase()), v2.d())).sorted(t.a(string)).collect(Collectors.toList());
    }

    private static Comparator<v> a(String string) {
        if (F.c((CharSequence)string)) {
            return Comparator.nullsLast(Comparator.comparing(v::b, Comparator.nullsLast(Comparator.reverseOrder()))).thenComparing(v::a, Comparator.nullsLast(Comparator.naturalOrder()));
        }
        Iterable iterable = a.a((CharSequence)string.toLowerCase());
        return Comparator.nullsLast(Comparator.comparing(v2 -> string.equalsIgnoreCase(v2.a()), Comparator.reverseOrder())).thenComparing(v2 -> {
            if (v2.a() == null) {
                return 0L;
            }
            return t.a(a.a((CharSequence)v2.a())).filter(string -> t.a(iterable).anyMatch(string2 -> t.a(string.toLowerCase(), string2))).count();
        }, Comparator.reverseOrder()).thenComparing(v2 -> {
            if (v2.d() == null) {
                return 0L;
            }
            return t.a(v2.d()).filter(string -> t.a(iterable).anyMatch(string2 -> t.a(string.toLowerCase(), string2))).count();
        }, Comparator.reverseOrder()).thenComparing(v::b, Comparator.nullsLast(Comparator.reverseOrder())).thenComparing(v::a, Comparator.nullsLast(Comparator.naturalOrder()));
    }

    private static Stream<String> a(Iterable<String> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    private static boolean a(String string, String string2) {
        return string.contains(string2) || string2.contains(string);
    }
}

