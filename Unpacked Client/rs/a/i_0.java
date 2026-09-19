/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.awt.event.KeyEvent;
import java.util.function.Supplier;
import rs.g.a.a;
import rs.s.b.l;

/*
 * Renamed from rs.A.i
 */
public abstract class i_0
implements a {
    private final Supplier<l> a;
    private boolean b = false;
    private boolean c = false;
    private boolean d;

    @Override
    public boolean L_() {
        return this.d;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if (this.c) {
            keyEvent.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (this.a.get().a(keyEvent)) {
            boolean bl = this.b;
            this.b = true;
            if (!bl) {
                this.b();
            }
            if (l.a(keyEvent.getKeyCode()) == null) {
                this.c = true;
                keyEvent.consume();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (this.a.get().a(keyEvent) && this.b) {
            this.b = false;
            this.c = false;
            this.c();
        }
    }

    public void b() {
    }

    public void c() {
    }

    public i_0(Supplier<l> supplier) {
        this.a = supplier;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

