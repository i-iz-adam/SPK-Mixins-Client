/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.j.v
 */
package rs.k.d;

import com.google.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class a {
    private final List<Function<String, String>> a = new ArrayList<Function<String, String>>();

    public String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : string.split("\r?\n")) {
            if (string2.startsWith("#include ")) {
                String string3 = string2.substring(9);
                String string4 = this.b(string3);
                stringBuilder.append(string4);
                continue;
            }
            stringBuilder.append(string2).append('\n');
        }
        return stringBuilder.toString();
    }

    public String b(String string) {
        for (Function<String, String> function : this.a) {
            String string2 = function.apply(string);
            if (string2 == null) continue;
            return this.a(string2);
        }
        return "";
    }

    public a a(Function<String, String> function) {
        this.a.add(function);
        return this;
    }

    public a a(Class<?> clazz) {
        return this.a((String string) -> {
            try (InputStream inputStream = clazz.getResourceAsStream((String)string);){
                if (inputStream == null) return null;
                String string2 = rs.k.d.a.a(inputStream);
                return string2;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return null;
        });
    }

    private static String a(InputStream inputStream) {
        try {
            return v.a((Readable)new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

