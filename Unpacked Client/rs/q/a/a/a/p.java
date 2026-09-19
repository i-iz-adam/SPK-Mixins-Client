/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.ArrayList;
import rs.l.e.q;
import rs.q.a.a.a;

public class p
extends a {
    private q.a a(String string) {
        switch (string) {
            case "magic_sickness": {
                return q.a.q;
            }
            case "welfare_2x": {
                return q.a.Q;
            }
            case "event_elixir": {
                return q.a.H;
            }
        }
        try {
            return q.a.valueOf(string.toUpperCase());
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public void a() {
        String string = this.h();
        if (string.startsWith("dyn_")) {
            this.b(string);
            return;
        }
        int n2 = this.g();
        q.a a2 = this.a(string.toLowerCase());
        if (a2 == null) {
            return;
        }
        ArrayList<q> arrayList = new ArrayList<q>();
        boolean bl = false;
        for (q q2 : this.c.u) {
            if (q2.a() != a2) continue;
            if (n2 > 0) {
                q2.a(n2);
                bl = true;
                continue;
            }
            arrayList.add(q2);
        }
        for (q q2 : arrayList) {
            this.c.u.remove(q2);
        }
        if (!bl && a2 != null) {
            if (n2 > 0) {
                this.c.u.add(new q(this.c, a2, n2));
            }
            if (n2 == -1) {
                this.c.u.add(new q(this.c, a2, -1));
            }
        }
    }

    private void b(String string) {
        String string2 = string.substring(4);
        int n2 = this.g();
        int n3 = this.g();
        Object object = this.h();
        object = string2 + "\n" + ((String)object).replace("[br]", "\n");
        ArrayList<q> arrayList = new ArrayList<q>();
        boolean bl = false;
        for (q q2 : this.c.u) {
            if (!q2.b().equals(string2)) continue;
            arrayList.add(q2);
        }
        for (q q2 : arrayList) {
            this.c.u.remove(q2);
        }
        if (!bl) {
            this.c.u.add(new q(this.c, string2, (String)object, n3, n2));
        }
    }
}

