/*
 * Decompiled with CFR 0.152.
 */
package rs.z;

import java.util.HashMap;
import java.util.Map;
import rs.z.a;
import rs.z.b;

public class d {
    private Map<String, b> a = new HashMap<String, b>();

    public boolean a(String string, long l2) {
        if (this.a(string)) {
            return false;
        }
        a a2 = new a(l2);
        a2.a();
        this.a.put(string, a2);
        return true;
    }

    public void b(String string, long l2) {
        this.a.remove(string);
        this.a(string, l2);
    }

    public boolean a(String string) {
        if (this.a.get(string) == null) {
            return false;
        }
        return this.a.get(string).b();
    }

    public long b(String string) {
        if (this.a.get(string) == null) {
            return 0L;
        }
        return this.a.get(string).c();
    }

    public void c(String string) {
        this.a.remove(string);
    }

    public void a() {
        this.a.clear();
    }

    public Map<String, b> b() {
        return this.a;
    }
}

