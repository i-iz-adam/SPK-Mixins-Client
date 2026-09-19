/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  com.google.c.l
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.f;

import com.google.a.b.as;
import com.google.c.l;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.a.g_0;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.a.p;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.s.f.a;
import rs.s.f.b;
import rs.s.f.c;
import rs.s.f.e;
import rs.s.f.f;
import rs.ui.components.a.q;

@rs.s.e(a="Ground Markers", b="groundmarkers", c="Enable marking of tiles using the Shift key", d={"overlay", "tiles"}, f=false)
public class d
extends rs.s.a {
    private static final Logger b = LoggerFactory.getLogger(d.class);
    private static final String c = "groundMarker";
    private static final String d = "region_";
    private final CopyOnWriteArrayList<a> e = new CopyOnWriteArrayList();
    @Inject
    private b f;
    @Inject
    private rs.j.a.b g;
    @Inject
    private rs.j.b.d h;
    @Inject
    private i i;
    @Inject
    private c j;
    @Inject
    private Client k;
    @Inject
    private l l;
    @Inject
    private rs.ui.components.a.d m;

    @Override
    public void a() {
        rs.l.f.e.d().a(this.j);
        this.f();
    }

    @Override
    public void b() {
        rs.l.f.e.d().b(this.j);
        this.e.clear();
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.g || gameStateChanged.getGameState() == rs.runelite.a.c.f) {
            this.f();
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        if (Client.dj) {
            return;
        }
        if (Client.ag && menuHover.getMenuId() == 516) {
            rs.runelite.a.f f3 = this.k.aG();
            if (f3 == null) {
                return;
            }
            p p2 = p.a(this.k.aG());
            rs.runelite.a.f f4 = this.k.aG();
            int n2 = p2.b();
            Collection<f> collection = this.a(n2);
            Optional<f> optional = collection.stream().filter(f2 -> f2.b() == p2.c() && f2.c() == p2.d() && f2.d() == p2.g()).findFirst();
            if (f4 == null) {
                return;
            }
            if (optional.isPresent()) {
                int[] nArray = this.k.fR;
                f f5 = optional.get();
                this.h.b("<img=288> <img=138> Reset all", () -> this.a(nArray));
                this.h.b("<img=283> Label", () -> this.a(f5));
                int n3 = this.h.b("<img=326> Color", () -> {});
                rs.j.b.a a2 = this.h.b(n3);
                a2.a("Reset color", () -> this.a(f5, this.f.a()));
                a2.a("Pick color", () -> {
                    Color color = f5.e();
                    SwingUtilities.invokeLater(() -> {
                        q q2 = this.m.a(SwingUtilities.windowForComponent(this.k), color, "Tile marker color", false);
                        q2.b((Color color) -> this.a(f5, (Color)color));
                        q2.setLocationRelativeTo(this.k);
                        q2.setVisible(true);
                    });
                });
                List list = this.e.stream().map(a::b).distinct().collect(Collectors.toList());
                for (Color color : list) {
                    if (color.equals(f5.e())) continue;
                    a2.a(g_0.a("Color", color), () -> this.a(f5, color));
                }
                this.h.b("<img=25> Unmark", () -> SwingUtilities.invokeLater(() -> this.a(f4)));
            } else {
                this.h.b("Mark", () -> SwingUtilities.invokeLater(() -> this.a(f4)));
            }
        }
    }

    void a(int n2, Collection<f> collection) {
        if (collection == null || collection.isEmpty()) {
            this.i.b(c, d + n2);
            return;
        }
        String string = this.l.b(collection);
        this.i.b(c, d + n2, string);
    }

    Collection<f> a(int n2) {
        String string = this.i.a(c, d + n2);
        if (as.c((String)string)) {
            return Collections.emptyList();
        }
        return (Collection)this.l.a(string, new e(this).b());
    }

    @Provides
    b a(i i2) {
        return i2.a(b.class);
    }

    void f() {
        this.e.clear();
        int[] nArray = this.k.fR;
        if (nArray == null) {
            return;
        }
        for (int n2 : nArray) {
            b.debug("Loading points for region {}", (Object)n2);
            Collection<f> collection = this.a(n2);
            Collection<a> collection2 = this.a(collection);
            this.e.addAll(collection2);
        }
    }

    private Collection<a> a(Collection<f> collection) {
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        return collection.stream().map(f2 -> new a(p.a(f2.a(), f2.b(), f2.c(), f2.d()), f2.e(), f2.f())).flatMap(a2 -> {
            Collection<p> collection = p.c(a2.a());
            return collection.stream().map(p2 -> new a((p)p2, a2.b(), a2.c()));
        }).collect(Collectors.toList());
    }

    private void a(rs.runelite.a.f f2) {
        if (f2 == null) {
            return;
        }
        p p2 = p.a(f2);
        int n2 = p2.b();
        f f3 = new f(n2, p2.c(), p2.d(), p2.g(), this.f.a(), null);
        b.debug("Updating point: {} - {}", (Object)f3, (Object)p2);
        ArrayList<f> arrayList = new ArrayList<f>(this.a(n2));
        if (arrayList.contains(f3)) {
            arrayList.remove(f3);
        } else {
            arrayList.add(f3);
        }
        this.a(n2, arrayList);
        this.f();
    }

    private void a(f f2, Color color) {
        f f3 = new f(f2.a(), f2.b(), f2.c(), f2.d(), color, f2.f());
        ArrayList<f> arrayList = new ArrayList<f>(this.a(f2.a()));
        arrayList.remove(f3);
        arrayList.add(f3);
        this.a(f2.a(), arrayList);
        this.f();
    }

    private void a(f f2) {
        this.g.a("Tile label").b(Optional.ofNullable(f2.f()).orElse("")).a((String string) -> {
            string = as.b((String)string);
            f f3 = new f(f2.a(), f2.b(), f2.c(), f2.d(), f2.e(), (String)string);
            ArrayList<f> arrayList = new ArrayList<f>(this.a(f2.a()));
            arrayList.remove(f2);
            arrayList.add(f3);
            this.a(f2.a(), arrayList);
            this.f();
        }).a();
    }

    private void a(int[] nArray) {
        if (nArray == null) {
            return;
        }
        long l2 = Arrays.stream(nArray).mapToLong(n2 -> this.a(n2).size()).sum();
        if (l2 == 0L) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
            int n2 = JOptionPane.showConfirmDialog(Launcher.n().i(), "Are you sure you want to reset all markers in this area?", "Warning", 0);
            if (n2 == 0) {
                for (int n3 : nArray) {
                    this.a(n3, null);
                }
                this.f();
            }
        });
    }

    CopyOnWriteArrayList<a> g() {
        return this.e;
    }
}

