/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.r;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.e.i;
import rs.s.e;
import rs.s.r.a;
import rs.s.r.b;

@e(a="Tile Indicators", b="tileindicators", c="Highlight the tile you are currently moving to", d={"highlight", "overlay"}, f=false)
public class c
extends rs.s.a {
    @Inject
    private b b;

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    @Override
    protected void a() {
        rs.l.f.e.d().a(this.b);
    }

    @Override
    protected void b() {
        rs.l.f.e.d().b(this.b);
    }
}

