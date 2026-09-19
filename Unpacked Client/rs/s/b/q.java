/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.d.ch
 *  javax.inject.Inject
 *  javax.inject.Provider
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.b;

import com.google.a.d.ch;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.e.b;
import rs.e.i;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.gui.d;
import rs.runelite.events.PluginChanged;
import rs.s.b.a;
import rs.s.b.h;
import rs.s.b.n;
import rs.s.b.o;
import rs.s.b.r;
import rs.s.b.s;
import rs.s.b.t;
import rs.s.e;
import rs.s.f;
import rs.s.g;
import rs.ui.components.k;
import rs.ui.j;
import rs.ui.m;

@Singleton
public class q
extends m {
    private static final Logger a = LoggerFactory.getLogger(q.class);
    private static final String b = rs.f.a.A;
    private static final String c = "pinnedPlugins";
    private static final ch<String> d = ch.a((Object)"Combat", (Object)"Chat", (Object)"Item", (Object)"Minigame", (Object)"Notification", (Object)"Plugin Hub", (Object)"Skilling", (Object)"XP");
    private final i e;
    private final g f;
    private final Provider<a> g;
    private final List<n> k = new ArrayList<n>();
    private final rs.ui.k l;
    private final k m;
    private final JScrollPane n;
    private final h o;
    private List<o> p;

    @Inject
    public q(i i2, g g2, EventBus eventBus, Provider<a> provider) {
        super(false);
        this.e = i2;
        this.f = g2;
        this.g = provider;
        this.l = new r(this, this, eventBus);
        this.m = new k();
        this.m.a(k.a.a);
        this.m.setPreferredSize(new Dimension(330, 30));
        this.m.setBackground(rs.gui.d.c);
        this.m.a(rs.gui.d.h);
        this.m.b().addDocumentListener(new s(this));
        d.forEach(this.m.c()::addElement);
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setLayout(new BorderLayout(0, 6));
        jPanel.add((Component)this.m, "Center");
        this.add((Component)jPanel, "North");
        this.o = new h();
        this.o.setBorder(new EmptyBorder(8, 10, 10, 10));
        this.o.setLayout(new j(0, 1, 0, 5));
        this.o.setAlignmentX(0.0f);
        h h2 = new h();
        h2.setLayout(new BorderLayout());
        h2.add((Component)this.o, "North");
        this.n = new JScrollPane(h2);
        this.n.setHorizontalScrollBarPolicy(31);
        this.add((Component)this.n, "Center");
        this.a();
    }

    void a() {
        List<String> list = this.g();
        this.p = Stream.concat(this.k.stream(), this.f.c().stream().filter(a2 -> !a2.getClass().getAnnotation(e.class).g()).map(a2 -> {
            e e2 = a2.getClass().getAnnotation(e.class);
            b b2 = this.f.a((rs.s.a)a2);
            rs.e.d d2 = b2 == null ? null : this.e.a(b2);
            List<String> list = this.f.g((rs.s.a)a2).stream().map(rs.s.a::e).collect(Collectors.toList());
            return new n(e2.a(), e2.c(), e2.d(), (rs.s.a)a2, b2, d2, list);
        })).map(n2 -> {
            o o2 = new o(this, (n)n2);
            o2.a(list.contains(n2.d()));
            return o2;
        }).sorted(Comparator.comparing(o2 -> o2.c().d())).collect(Collectors.toList());
        this.o.removeAll();
        this.b();
    }

    void a(n ... nArray) {
        Collections.addAll(this.k, nArray);
    }

    void b() {
        this.p.forEach(o2 -> {
            rs.s.a a2 = o2.c().j();
            if (a2 != null) {
                o2.b(this.f.d(a2));
            }
        });
        int n2 = this.n.getVerticalScrollBar().getValue();
        this.f();
        this.m.requestFocusInWindow();
        this.validate();
        this.n.getVerticalScrollBar().setValue(n2);
    }

    void a(String string) {
        this.m.a(string);
        this.f();
        this.l.c(this);
    }

    private void f() {
        String string = this.m.a();
        this.p.forEach(this.o::remove);
        t.a(this.p.stream().filter(o2 -> !o2.c().j().getClass().getAnnotation(e.class).k()).collect(Collectors.toList()), string).forEach(this.o::add);
        this.revalidate();
    }

    void b(String string) {
        for (o o2 : this.p) {
            if (!o2.c().d().equals(string)) continue;
            this.a(o2.c());
            break;
        }
    }

    public void a(rs.s.a a2) {
        for (o o2 : this.p) {
            if (o2.c().j() != a2) continue;
            this.a(o2.c());
            break;
        }
    }

    public a b(rs.s.a a2) {
        for (o o2 : this.p) {
            if (o2.c().j() != a2) continue;
            a a3 = (a)this.g.get();
            a3.a(o2.c());
            return a3;
        }
        return null;
    }

    void a(n n2) {
        a a2 = (a)this.g.get();
        a2.a(n2);
        this.l.c(this);
        this.l.c(a2);
    }

    void c(rs.s.a a2) {
        this.f.a(a2, true);
        try {
            this.f.b(a2);
        }
        catch (f f2) {
            a.warn("Error when starting plugin {}", (Object)a2.getClass().getSimpleName(), (Object)f2);
        }
    }

    void d(rs.s.a a2) {
        this.f.a(a2, false);
        try {
            this.f.c(a2);
        }
        catch (f f2) {
            a.warn("Error when stopping plugin {}", (Object)a2.getClass().getSimpleName(), (Object)f2);
        }
    }

    private List<String> g() {
        String string = this.e.a(b, c);
        if (string == null) {
            return Collections.emptyList();
        }
        return rs.A.s.a(string);
    }

    void c() {
        String string = this.p.stream().filter(o::b).map(o2 -> o2.c().d()).collect(Collectors.joining(","));
        this.e.b(b, c, string);
    }

    @Subscribe
    public void onPluginChanged(PluginChanged pluginChanged) {
        SwingUtilities.invokeLater(this::b);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(367, super.getPreferredSize().height);
    }

    @Override
    public void J_() {
        super.J_();
        if (this.m.getParent() != null) {
            this.m.requestFocusInWindow();
        }
    }

    public rs.ui.k e() {
        return this.l;
    }

    static /* synthetic */ void a(q q2) {
        q2.f();
    }
}

