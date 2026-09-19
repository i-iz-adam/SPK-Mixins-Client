/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Provider
 */
package rs.s.b;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Provider;
import rs.a.j_0;
import rs.e.i;
import rs.s.a;
import rs.s.b.q;
import rs.s.b.w;
import rs.s.e;
import rs.ui.l;

@e(a="Configuration", b="configs", i=true, g=true)
public class g
extends a {
    @Inject
    private rs.ui.e b;
    @Inject
    private Provider<q> c;
    @Inject
    private Provider<w> d;
    @Inject
    private i e;
    private w f;
    private l g;

    @Override
    protected void a() {
        this.f = (w)this.d.get();
        BufferedImage bufferedImage = j_0.b(this.getClass(), "config_icon.png");
        this.g = l.a().a("Configuration").a(bufferedImage).a(3).a(this.f).a();
        this.b.a(this.g);
    }

    @Override
    protected void b() {
        this.b.b(this.g);
    }
}

