/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a.a;

public class d {
    String a;
    String b;

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        if (!d2.a(this)) {
            return false;
        }
        String string = this.a();
        String string2 = d2.a();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.b();
        String string4 = d2.b();
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    protected boolean a(Object object) {
        return object instanceof d;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.a();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.b();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n3;
    }

    public String toString() {
        return "DropDownOption(text=" + this.a() + ", tooltip=" + this.b() + ")";
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.a = string;
    }

    public void b(String string) {
        this.b = string;
    }

    public d(String string, String string2) {
        this.a = string;
        this.b = string2;
    }
}

