/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.awt.event.KeyEvent;
import rs.s.b.l;

public class m
extends l {
    public m(int n2, int n3) {
        super(n2, n3, true);
    }

    public m(KeyEvent keyEvent) {
        this(keyEvent.getExtendedKeyCode(), keyEvent.getModifiersEx());
        assert (this.a(keyEvent));
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return this.a(keyEvent, true);
    }
}

