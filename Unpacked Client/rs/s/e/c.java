/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.e;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.a.j_0;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.events.ConfigChanged;
import rs.s.a;
import rs.s.e;
import rs.s.e.b;
import rs.s.e.d;
import rs.ui.l;

@e(a="GPU Mode (Beta)", b="gpu", c="Enhance the graphics and performance of the game", d={"panel"}, i=true, k=true)
public class c
extends a {
    private static final Logger b = LoggerFactory.getLogger(c.class);
    @Inject
    private rs.ui.e c;
    @Inject
    private d d;
    @Inject
    private Client e;
    private l f;
    private b g;

    @Provides
    d a(i i2) {
        return i2.a(d.class);
    }

    @Override
    protected void a() {
        BufferedImage bufferedImage = j_0.b(this.getClass(), "gpu_icon.png");
        this.g = (b)this.a.getInstance(b.class);
        this.f = l.a().a("GPU Mode").a(bufferedImage).a(1).a(this.g).a();
        this.c.a(this.f);
        rs.f.a.Q = this.d.a();
        rs.k.b.b = this.d.c();
        rs.k.b.i = this.d.d();
        rs.k.b.j = this.d.e();
        rs.k.b.c = this.d.g();
        rs.k.b.e = this.d.h();
        rs.k.b.k = this.d.f().b();
        rs.k.b.f = this.d.b();
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equals("gpu")) {
            rs.h.c.a(() -> {
                boolean bl = rs.f.a.Q;
                boolean bl2 = rs.k.b.i;
                boolean bl3 = rs.k.b.j;
                rs.f.a.Q = this.d.a();
                rs.k.b.b = this.d.c();
                rs.k.b.i = this.d.d();
                rs.k.b.j = this.d.e();
                rs.k.b.c = this.d.g();
                rs.k.b.e = this.d.h();
                rs.k.b.k = this.d.f().b();
                rs.k.b.f = this.d.b();
                rs.k.b.d = this.d.i();
                if (this.e.fc) {
                    if (rs.f.a.Q && !bl) {
                        rs.k.b.b();
                    }
                    if (!rs.f.a.Q && bl) {
                        rs.k.b.c();
                    }
                    if (rs.k.b.i && !Client.ai()) {
                        if (rs.k.b.i != bl2) {
                            if (rs.k.b.i) {
                                SwingUtilities.invokeLater(rs.k.b::f);
                            } else {
                                SwingUtilities.invokeLater(() -> Launcher.n().p().a(765, 503));
                            }
                        }
                        if (rs.k.b.j != bl3) {
                            this.e.ba();
                        }
                    }
                }
            });
            if (configChanged.getKey().equals("vsyncMode")) {
                rs.h.c.a(() -> {
                    rs.k.b.b = this.d.c();
                    this.e.a.e();
                });
            }
        }
    }
}

