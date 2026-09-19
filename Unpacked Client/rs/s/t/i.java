/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.t;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import rs.Client;
import rs.a.j_0;
import rs.d.k;
import rs.eventbus.Subscribe;
import rs.h.c;
import rs.l.f_0;
import rs.runelite.events.GameStateChanged;
import rs.s.a;
import rs.s.e;
import rs.s.t.h;
import rs.s.t.j;
import rs.ui.l;

@e(a="Trading post", b="tradepost", c="Enable the Notes panel", d={"panel"}, i=true, k=true)
public class i
extends a {
    private static final ConcurrentHashMap<Integer, Image> d = new ConcurrentHashMap();
    public static final rs.q.a.a.a b = new j();
    public static i c;
    @Inject
    private h e;
    @Inject
    private Client f;
    @Inject
    private rs.ui.e g;
    private l h;

    public i() {
        c = this;
    }

    @Override
    protected void a() {
        this.e = (h)this.a.getInstance(h.class);
        BufferedImage bufferedImage = j_0.b(this.getClass(), "ge_icon.png");
        this.h = l.a().a("Trading Post").a(bufferedImage).a(4).a(this.e).a();
        this.g.a(this.h);
    }

    @Override
    protected void b() {
        this.g.b(this.h);
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        switch (gameStateChanged.getGameState()) {
            case c: {
                this.e.e().a();
                break;
            }
        }
    }

    public Image a(int n2) {
        if (d.get(n2) != null) {
            return d.get(n2);
        }
        rs.h.c.a(() -> this.b(n2));
        return null;
    }

    public Image b(int n2) {
        if (d.size() > 500) {
            d.clear();
        }
        if (d.get(n2) != null) {
            return d.get(n2);
        }
        f_0 f_02 = k.a(n2, Integer.MAX_VALUE, 0, 32);
        if (f_02 == null) {
            return null;
        }
        Image image = f_02.a(32, 32);
        BufferedImage bufferedImage = Client.a(image = f_0.a(image, new Color(0, 0, 0)));
        if (bufferedImage != null) {
            d.put(n2, bufferedImage);
        }
        return bufferedImage;
    }

    public h f() {
        return this.e;
    }
}

