/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.k;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.a.j_0;
import rs.gui.b.h;
import rs.s.e;
import rs.ui.l;

@e(a="Loadouts", b="loadouts", c="Set up and switch between loadouts", d={"panel"}, i=true, k=true)
public class a
extends rs.s.a {
    private static final Logger b = LoggerFactory.getLogger(a.class);
    @Inject
    private rs.ui.e c;
    private l d;
    private h e;

    @Override
    protected void a() {
        BufferedImage bufferedImage = j_0.b(this.getClass(), "ldt_icon.png");
        h.b = this.e = new h();
        this.d = l.a().a("Loadouts").a(bufferedImage).a(0).a(this.e).a();
        this.c.a(this.d);
    }
}

