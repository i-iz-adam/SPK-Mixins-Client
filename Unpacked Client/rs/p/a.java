/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Guice
 *  com.google.inject.Inject
 *  com.google.inject.Injector
 *  com.google.inject.Module
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.p;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.io.File;
import java.util.Collection;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.q;
import rs.Client;
import rs.e.i;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.p.b;
import rs.s.g;
import rs.ui.f;
import rs.y.c;

@Singleton
public class a {
    private static final Logger d = LoggerFactory.getLogger(a.class);
    public static final File a = new File(System.getProperty("user.home"), ".spawnpk-data");
    public static final File b = new File(a, "plugins");
    public static final File c = new File(a, "screenshots");
    private static Injector e;
    @Inject
    private g f;
    @Inject
    private EventBus g;
    @Inject
    private c h;
    @Inject
    private f i;
    @Inject
    private i j;
    @Inject
    private Client k;

    public static void a() {
        e = Guice.createInjector((Module[])new Module[]{new b()});
        Launcher.a((Launcher)e.getInstance(Launcher.class));
        try {
            ((a)e.getInstance(a.class)).b();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void b() {
        this.j.a();
        this.f.b();
        this.f.b((Collection<rs.s.a>)null);
        this.i.a();
        this.g.register(this.i);
        this.g.register(this.f);
        this.g.register(this.j);
        this.f.a();
        this.i.b();
        q.a(e);
        q.a();
    }

    public static Injector c() {
        return e;
    }

    public Client d() {
        return this.k;
    }
}

