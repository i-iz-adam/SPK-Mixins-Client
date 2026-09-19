/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.V
 *  com.google.a.b.as
 *  com.google.a.d.ag
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.apache.commons.text.WordUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.ui.a;

import com.google.a.b.V;
import com.google.a.b.as;
import com.google.a.d.ag;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.a.d_0;
import rs.e.i;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.j.b.d;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.s.h;
import rs.ui.a.b;
import rs.ui.a.c;
import rs.ui.a.e;
import rs.ui.a.g;

@Singleton
public class f {
    private static final Logger c = LoggerFactory.getLogger(f.class);
    public static final String a = "Default Group";
    public static final String b = "InfoBoxOverlay";
    private static final String d = "infoboxgroup";
    private static final String e = "infoboxoverlay";
    private static final String f = "orient_";
    private static final String g = "Detach InfoBox";
    private static final String h = "Flip";
    private static final String i = "Delete";
    private static final rs.l.f.f j = new rs.l.f.f(1504, "Detach InfoBox", "InfoBox");
    private static final rs.l.f.f k = new rs.l.f.f(1504, "Flip", "InfoBox Group");
    private static final rs.l.f.f l = new rs.l.f.f(1504, "Delete", "InfoBox Group");
    private final Map<String, g> m = new ConcurrentHashMap<String, g>();
    private final Client n;
    private final EventBus o;
    private final i p;
    private final rs.l.f.e q;
    private final h r;
    private final d s;
    private final rs.s.h.b t;
    private c u;

    @Inject
    private f(Client client, EventBus eventBus, i i2, rs.l.f.e e2, h h2, d d2) {
        this.n = client;
        this.o = eventBus;
        this.p = i2;
        this.q = e2;
        this.r = h2;
        this.t = i2.a(rs.s.h.b.class);
        this.s = d2;
        eventBus.register(this);
    }

    public c a(String string) {
        return this.m.values().stream().flatMap(g2 -> g2.M().stream()).filter(c2 -> c2.h().equals(string)).findFirst().orElse(null);
    }

    public void b(String string) {
        this.m.values().forEach(g2 -> g2.M().removeIf(c2 -> c2.h().equals(string)));
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.c) {
            this.m.clear();
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        if (this.u != null) {
            this.a(this.u);
        }
        this.u = null;
    }

    public boolean a(c c2) {
        if (!Client.ag) {
            return false;
        }
        if (Client.dj) {
            return false;
        }
        String string = this.e(c2.j());
        g g2 = this.m.get(c2.j());
        boolean bl = c2.j().equals(c2.i());
        if (g2.M().size() > 1) {
            this.s.b(g, () -> {
                if (c2.j().equalsIgnoreCase(c2.i())) {
                    this.a(c2.h() + "_cust_" + System.currentTimeMillis(), c2);
                } else {
                    String string = c2.j();
                    this.a(c2, c2.i());
                    c2.a = c2.i();
                    this.m.get(string).M().remove(c2);
                    g g2 = this.m.computeIfAbsent(c2.i(), this::f);
                    g2.M().add(c2);
                }
            });
        }
        this.s.a("Flip InfoBox Group \"" + string + "\"", () -> {
            rs.ui.components.e e2 = g2.L();
            this.a(g2.K(), e2);
        });
        HashSet<String> hashSet = new HashSet<String>();
        for (c object : g2.M()) {
            if (object.i().equals(c2.j())) continue;
            hashSet.add(object.i());
        }
        if (hashSet.size() > 0) {
            for (String string2 : hashSet) {
                this.s.c("Unmerge InfoBox Group \"" + this.e(string2) + "\"", () -> {
                    ArrayList<c> arrayList = new ArrayList<c>();
                    g g3 = this.m.computeIfAbsent(string2, this::f);
                    for (c c3 : this.m.get(c2.j()).M()) {
                        if (!c3.i().equals(string2)) continue;
                        arrayList.add(c3);
                    }
                    for (c c3 : arrayList) {
                        g2.M().remove(c3);
                        c3.a = string2;
                        this.a(c3, string2);
                        g3.M().add(c3);
                    }
                });
            }
        }
        if (this.f(c2) && !bl) {
            this.s.b("Delete InfoBox Group \"" + string + "\"", () -> {
                if (bl) {
                    return;
                }
                g g3 = this.m.computeIfAbsent(c2.i(), this::f);
                if (g2 != g3) {
                    this.a(g2, g3);
                }
            });
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(c c4) {
        V.a((Object)c4);
        c.debug("Adding InfoBox {}", (Object)c4);
        this.d(c4);
        String string = this.g(c4);
        g g2 = this.m.computeIfAbsent(string, this::f);
        List<rs.l.f.f> list = c4.o();
        c4.a = string;
        if (c4 instanceof b) {
            c4.a(Instant.now());
            c4.c(this.t.h());
        }
        list.add(j);
        list.add(k);
        if (this.f(c4)) {
            list.add(l);
        }
        Object object = this;
        synchronized (object) {
            int n2 = rs.ui.a.f.a(g2.M(), c4, (c2, c3) -> ag.a().a((Comparable)((Object)c2.m()), (Comparable)((Object)c3.m())).a((Comparable)((Object)c2.j()), (Comparable)((Object)c3.j())).b());
            g2.M().add(n2, c4);
        }
        object = c4.k();
        this.d(c4);
        if (object instanceof d_0) {
            d_0 d_02 = (d_0)object;
            d_02.a(() -> this.d(c4));
        }
    }

    private String e(String string) {
        if (string.equals(b)) {
            return a;
        }
        if (string.contains("_cust_")) {
            return "(Custom)";
        }
        return WordUtils.capitalize((String)string);
    }

    private boolean f(c c2) {
        return !c2.j().equals(c2.i()) && !c2.j().equals(b) && c2.j().contains("_cust_");
    }

    public synchronized void c(c c2) {
        if (c2 == null || c2.j() == null) {
            return;
        }
        if (this.m.get(c2.j()).M().remove(c2)) {
            c.debug("Removed InfoBox {}", (Object)c2);
        }
        c2.o().remove(j);
        c2.o().remove(k);
        c2.o().remove(l);
    }

    public synchronized void a(Predicate<c> predicate) {
        for (g g2 : this.m.values()) {
            if (!g2.M().removeIf(predicate)) continue;
            c.debug("Removed InfoBoxes for filter {} from {}", predicate, (Object)g2);
        }
    }

    public List<c> a() {
        return this.m.values().stream().map(g::M).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public synchronized void b() {
        this.m.values().forEach(g2 -> g2.M().removeIf(c::f));
    }

    public void d(c c2) {
        BufferedImage bufferedImage;
        if (c2.k() == null) {
            return;
        }
        BufferedImage bufferedImage2 = bufferedImage = c2.k();
        double d2 = bufferedImage.getWidth(null);
        double d3 = bufferedImage.getHeight(null);
        double d4 = this.a(c2.p() == rs.ui.a.e.b);
        if (d4 < d2 || d4 < d3) {
            double d5 = d4 / d2;
            double d6 = d4 / d3;
            if (d5 == 1.0 && d6 == 1.0) {
                return;
            }
            double d7 = Math.min(d5, d6);
            int n2 = (int)(d2 * d7);
            int n3 = (int)(d3 * d7);
            BufferedImage bufferedImage3 = new BufferedImage(n2, n3, 2);
            Graphics2D graphics2D = bufferedImage3.createGraphics();
            graphics2D.drawImage(bufferedImage, 0, 0, n2, n3, null);
            graphics2D.dispose();
            bufferedImage2 = bufferedImage3;
        }
        c2.b(bufferedImage2);
    }

    public double a(boolean bl) {
        if (!bl) {
            return Math.max(2, Math.max(this.t.q() - 2, 16));
        }
        return Math.max(2, this.t.q());
    }

    private g f(String string) {
        rs.ui.components.e e2 = this.c(string);
        if (e2 == null) {
            if (string.equals(b)) {
                e2 = this.t.p() ? rs.ui.components.e.b : rs.ui.components.e.a;
                this.a(string, e2);
            } else {
                e2 = rs.ui.components.e.a;
            }
        }
        g g2 = new g(this, this.n, this.o, string, this.t, e2);
        this.q.a(g2);
        this.o.register(g2);
        return g2;
    }

    private void a(g g2) {
        this.o.unregister(g2);
        this.q.b(g2);
        this.m.remove(g2.K());
    }

    private synchronized void a(String string, c c2) {
        String string2 = c2.j();
        g g2 = this.m.get(c2.j());
        Collection collection = g2.M().stream().filter(c3 -> c3.h().equals(c2.h())).collect(Collectors.toList());
        g2.M().removeAll(collection);
        if (g2.M().isEmpty()) {
            c.debug("Deleted layer: {}", (Object)g2.K());
            this.d(g2.K());
            this.a(g2);
        }
        g g3 = this.m.computeIfAbsent(string, this::f);
        g3.M().addAll(collection);
        for (c c4 : collection) {
            this.a(c4, string);
            c4.a = string;
            if (c4.o().contains(l)) continue;
            c4.o().add(l);
        }
        c.debug("Moving infobox named {} (layer {}) to layer {}: {} boxes", new Object[]{c2.h(), string2, string, collection.size()});
    }

    public synchronized void a(g g2, g g3) {
        List<c> list = g2.M();
        boolean bl = g3.K().equals(b);
        c.debug("Merging InfoBoxes from {} into {} ({} boxes)", new Object[]{g2.K(), g3.K(), list.size()});
        for (c c2 : list) {
            this.a(c2, g3.K());
            c2.a = g3.K();
            if (!bl) continue;
            c2.o().remove(l);
        }
        g3.M().addAll(list);
        g2.M().clear();
        this.d(g2.K());
        this.a(g2);
        c.debug("Deleted layer: {}", (Object)g2.K());
    }

    private String g(c c2) {
        String string = this.p.a(d, c2.h());
        if (as.c((String)string)) {
            return c2.j();
        }
        return string;
    }

    private void a(c c2, String string) {
        if (string.equals(b) || string.equals(c2.i())) {
            this.p.b(d, c2.h());
        } else {
            this.p.b(d, c2.h(), string);
        }
    }

    rs.ui.components.e c(String string) {
        return (rs.ui.components.e)((Object)this.p.a(e, f + string, (Type)((Object)rs.ui.components.e.class)));
    }

    void a(String string, rs.ui.components.e e2) {
        this.p.a(e, f + string, e2);
    }

    void d(String string) {
        this.p.b(e, f + string);
    }

    private static <T> int a(List<? extends T> list, T t2, Comparator<? super T> comparator) {
        int n2 = Collections.binarySearch(list, t2, comparator);
        if (n2 < 0) {
            return -n2 - 1;
        }
        for (int i2 = n2 + 1; i2 < list.size(); ++i2) {
            T t3 = list.get(i2);
            int n3 = comparator.compare(t3, t2);
            if (n3 <= 0) continue;
            return i2;
        }
        return list.size();
    }

    public Map<String, g> c() {
        return this.m;
    }

    public void e(c c2) {
        this.u = c2;
    }
}

