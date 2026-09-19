/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.d.L
 *  com.google.a.d.bX$a
 *  javax.annotation.Nullable
 */
package rs.s.b;

import com.google.a.d.L;
import com.google.a.d.bX;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.annotation.Nullable;

public class l {
    private static final L<Integer, Integer> f = new bX.a().a((Object)128, (Object)17).a((Object)512, (Object)18).a((Object)64, (Object)16).a((Object)256, (Object)157).a();
    private static final int g = (Integer)f.keySet().stream().reduce((n2, n3) -> n2 | n3).get();
    public static final l a = new l(0, 0);
    public static final l b = new l(0, 128);
    public static final l c = new l(0, 512);
    public static final l d = new l(0, 64);
    private final int h;
    private final int i;

    protected l(int n2, int n3, boolean bl) {
        n3 &= g;
        Integer n4 = l.a(n2);
        if (n4 != null) {
            assert ((n3 & n4) != 0);
            n2 = 0;
        }
        if (bl && n2 != 0) {
            n3 = 0;
        }
        this.h = n2;
        this.i = n3;
    }

    public l(int n2, int n3) {
        this(n2, n3, false);
    }

    public l(KeyEvent keyEvent) {
        this(keyEvent.getExtendedKeyCode(), keyEvent.getModifiersEx());
        assert (this.a(keyEvent));
    }

    public boolean a(KeyEvent keyEvent) {
        return this.a(keyEvent, false);
    }

    protected boolean a(KeyEvent keyEvent, boolean bl) {
        if (a.equals(this)) {
            return false;
        }
        int n2 = keyEvent.getExtendedKeyCode();
        int n3 = keyEvent.getModifiersEx() & g;
        Integer n4 = l.a(n2);
        if (n4 != null) {
            n3 |= n4.intValue();
            n2 = 0;
        }
        if (keyEvent.getID() == 402 && n2 != 0) {
            return this.h == n2;
        }
        if (bl && n2 != 0) {
            return this.h == n2;
        }
        return this.h == n2 && this.i == n3;
    }

    public String toString() {
        if (this.h == 0 && this.i == 0) {
            return "Not set";
        }
        String string = this.h == 0 ? "" : KeyEvent.getKeyText(this.h);
        String string2 = "";
        if (this.i != 0) {
            string2 = InputEvent.getModifiersExText(this.i);
        }
        if (string2.isEmpty() && string.isEmpty()) {
            return "Not set";
        }
        if (!string2.isEmpty() && !string.isEmpty()) {
            return string2 + "+" + string;
        }
        if (string2.isEmpty()) {
            return string;
        }
        return string2;
    }

    @Nullable
    public static Integer a(int n2) {
        return (Integer)f.k_().get((Object)n2);
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        if (!l2.a(this)) {
            return false;
        }
        if (this.a() != l2.a()) {
            return false;
        }
        return this.b() == l2.b();
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.a();
        n3 = n3 * 59 + this.b();
        return n3;
    }
}

