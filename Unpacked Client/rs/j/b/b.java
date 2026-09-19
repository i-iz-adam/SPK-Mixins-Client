/*
 * Decompiled with CFR 0.152.
 */
package rs.j.b;

public class b {
    private String a;
    private rs.h.b b;

    public String a() {
        return this.a;
    }

    public rs.h.b b() {
        return this.b;
    }

    public void a(String string) {
        this.a = string;
    }

    public void a(rs.h.b b2) {
        this.b = b2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        if (!b2.a(this)) {
            return false;
        }
        String string = this.a();
        String string2 = b2.a();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        rs.h.b b3 = this.b();
        rs.h.b b4 = b2.b();
        return !(b3 == null ? b4 != null : !b3.equals(b4));
    }

    protected boolean a(Object object) {
        return object instanceof b;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.a();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        rs.h.b b2 = this.b();
        n3 = n3 * 59 + (b2 == null ? 43 : b2.hashCode());
        return n3;
    }

    public String toString() {
        return "CustomMenuEntry(text=" + this.a() + ", event=" + String.valueOf(this.b()) + ")";
    }
}

