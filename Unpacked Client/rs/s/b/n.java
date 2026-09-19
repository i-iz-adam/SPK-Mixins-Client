/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.s.b;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.swing.JMenuItem;
import rs.a.l_0;
import rs.e.b;
import rs.e.d;
import rs.s.a;

public final class n {
    private final String a;
    private final String b;
    private final String[] c;
    @Nullable
    private final a d;
    @Nullable
    private final b e;
    @Nullable
    private final d f;
    @Nullable
    private final List<String> g;

    boolean a() {
        return this.f != null && !this.f.c().stream().allMatch(h2 -> h2.d().e());
    }

    n(String string, String string2, String[] stringArray, b b2, d d2) {
        this(string, string2, stringArray, null, b2, d2, null);
    }

    @Nullable
    JMenuItem b() {
        JMenuItem jMenuItem = new JMenuItem("Support");
        jMenuItem.addActionListener(actionEvent -> l_0.a("https://spawnpk.net"));
        return jMenuItem;
    }

    @Nullable
    String c() {
        return null;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String[] f() {
        return this.c;
    }

    @Nullable
    public b g() {
        return this.e;
    }

    @Nullable
    public d h() {
        return this.f;
    }

    @Nullable
    public List<String> i() {
        return this.g;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        n n2 = (n)object;
        String string = this.d();
        String string2 = n2.d();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.e();
        String string4 = n2.e();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        if (!Arrays.deepEquals(this.f(), n2.f())) {
            return false;
        }
        a a2 = this.j();
        a a3 = n2.j();
        if (a2 == null ? a3 != null : !((Object)a2).equals(a3)) {
            return false;
        }
        b b2 = this.g();
        b b3 = n2.g();
        if (b2 == null ? b3 != null : !b2.equals(b3)) {
            return false;
        }
        d d2 = this.h();
        d d3 = n2.h();
        if (d2 == null ? d3 != null : !d2.equals(d3)) {
            return false;
        }
        List<String> list = this.i();
        List<String> list2 = n2.i();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.d();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.e();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        n3 = n3 * 59 + Arrays.deepHashCode(this.f());
        a a2 = this.j();
        n3 = n3 * 59 + (a2 == null ? 43 : ((Object)a2).hashCode());
        b b2 = this.g();
        n3 = n3 * 59 + (b2 == null ? 43 : b2.hashCode());
        d d2 = this.h();
        n3 = n3 * 59 + (d2 == null ? 43 : d2.hashCode());
        List<String> list = this.i();
        n3 = n3 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n3;
    }

    public String toString() {
        return "PluginConfigurationDescriptor(name=" + this.d() + ", description=" + this.e() + ", tags=" + Arrays.deepToString(this.f()) + ", plugin=" + String.valueOf(this.j()) + ", config=" + String.valueOf(this.g()) + ", configDescriptor=" + String.valueOf(this.h()) + ", conflicts=" + String.valueOf(this.i()) + ")";
    }

    public n(String string, String string2, String[] stringArray, @Nullable a a2, @Nullable b b2, @Nullable d d2, @Nullable List<String> list) {
        this.a = string;
        this.b = string2;
        this.c = stringArray;
        this.d = a2;
        this.e = b2;
        this.f = d2;
        this.g = list;
    }

    @Nullable
    public a j() {
        return this.d;
    }
}

