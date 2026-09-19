/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 */
package rs.q.a.a.a;

import com.google.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import rs.a.a_0;
import rs.a.d_0;
import rs.e.i;
import rs.q.a.a.a;
import rs.ui.a.b;
import rs.ui.a.c;
import rs.ui.a.f;
import rs.ui.a.j;

public class e
extends a {
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    @Inject
    private a_0 g;
    @Inject
    private f h;
    @Inject
    private i i;

    @Override
    public void a() {
        int n2 = this.e();
        this.b(n2);
    }

    private void b(int n2) {
        c c2;
        int n3 = this.e();
        String string = this.h();
        if (n3 == 0) {
            this.h.b(string);
            return;
        }
        if (n3 == 2) {
            int n4 = this.g();
            c c3 = this.h.a(string);
            if (c3 == null || !(c3 instanceof b)) {
                return;
            }
            b b2 = (b)c3;
            b2.a(n4);
            return;
        }
        String string2 = this.h();
        if (string2.equalsIgnoreCase("def")) {
            string2 = "InfoBoxOverlay";
        }
        int n5 = 0;
        if (n2 != 3) {
            n5 = this.g();
        }
        int n6 = this.e();
        String string3 = null;
        int n7 = 1;
        switch (n6) {
            case 1: {
                string3 = this.h();
                break;
            }
            case 2: {
                n7 = this.g();
            }
        }
        boolean bl = this.e() == 1;
        Object object = null;
        if (bl) {
            object = this.h();
            object = "@lre@" + string + "\n" + ((String)object).replace("[br]", "\n");
        }
        if ((c2 = this.h.a(string)) != null) {
            switch (n2) {
                case 1: {
                    if (c2 instanceof j) {
                        ((j)c2).b(Duration.of(n5, ChronoUnit.SECONDS));
                        return;
                    }
                    this.h.b(string);
                    break;
                }
                case 2: {
                    if (c2 instanceof b) {
                        ((b)c2).a(n5);
                        c2.a(Instant.now());
                        this.h.b(string);
                        break;
                    }
                    this.h.b(string);
                    break;
                }
                case 3: {
                    return;
                }
            }
        }
        d_0 d_02 = this.a(string3, n7);
        c c4 = null;
        switch (n2) {
            case 1: {
                if (n5 <= 0) {
                    return;
                }
                c4 = new j(n5, ChronoUnit.SECONDS, d_02, string2, string);
                break;
            }
            case 2: {
                c4 = new b(d_02, string2, string, n5);
                break;
            }
            case 3: {
                c4 = new rs.ui.a.i(d_02, string2, string);
            }
        }
        if (c4 == null) {
            return;
        }
        if (string3 != null) {
            c4.a(rs.ui.a.e.b);
        } else {
            c4.a(rs.ui.a.e.a);
        }
        c4.a(Objects.requireNonNullElseGet(object, () -> "@lre@" + string));
        this.h.b(c4);
    }

    private d_0 a(String string, int n2) {
        if (string != null) {
            return this.g.a(string, -1);
        }
        return this.g.a(n2, Integer.MAX_VALUE, 32);
    }
}

