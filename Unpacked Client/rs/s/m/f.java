/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.m;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import rs.a.j_0;
import rs.e.i;
import rs.s.a;
import rs.s.e;
import rs.s.m.b;
import rs.ui.l;

@e(a="Notes", b="notes", c="Enable the Notes panel", d={"panel"}, i=true, k=true)
public class f
extends a {
    @Inject
    private rs.ui.e b;
    @Inject
    private rs.s.m.a c;
    private b d;
    private l e;

    @Provides
    rs.s.m.a a(i i2) {
        return i2.a(rs.s.m.a.class);
    }

    @Override
    protected void a() {
        this.d = (b)this.a.getInstance(b.class);
        this.d.a(this.c);
        BufferedImage bufferedImage = j_0.b(this.getClass(), "notes_icon.png");
        this.e = l.a().a("Notes").a(bufferedImage).a(5).a(this.d).a();
        this.b.a(this.e);
    }

    @Override
    protected void b() {
        this.b.b(this.e);
    }
}

