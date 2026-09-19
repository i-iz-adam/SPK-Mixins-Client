/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.g;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import rs.a.j_0;
import rs.s.a;
import rs.s.e;
import rs.ui.l;

@e(a="Item ID Search", b="itemsearch", c="Enable the Item ID Search Panel", d={"panel"}, f=false)
public class b
extends a {
    @Inject
    private rs.ui.e b;
    private rs.s.g.a c;
    private l d;

    @Override
    protected void a() {
        this.c = (rs.s.g.a)this.a.getInstance(rs.s.g.a.class);
        this.c.b();
        BufferedImage bufferedImage = j_0.b(this.getClass(), "search.png");
        this.d = l.a().a("Item ID Search").a(bufferedImage).a(6).a(this.c).a();
        this.b.a(this.d);
    }

    @Override
    protected void b() {
        this.b.b(this.d);
    }
}

