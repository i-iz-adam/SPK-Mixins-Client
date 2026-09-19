/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.c.l
 *  com.google.c.r
 *  com.google.inject.AbstractModule
 *  com.google.inject.Provides
 *  com.google.inject.Singleton
 *  com.google.inject.name.Names
 */
package rs.p;

import com.google.c.l;
import com.google.c.r;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import java.awt.Color;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import rs.Client;
import rs.a.a_0;
import rs.a.f_0;
import rs.a.h_0;
import rs.e.i;
import rs.eventbus.DeferredEventBus;
import rs.eventbus.EventBus;
import rs.f.a;
import rs.s.g;
import rs.s.h;
import rs.y.c;

public class b
extends AbstractModule {
    private static final l a = new r().a(Color.class, (Object)new f_0()).j();
    private final boolean b = rs.f.a.d;
    private final boolean c = false;

    protected void configure() {
        this.bindConstant().annotatedWith((Annotation)Names.named((String)"developerMode")).to(this.b);
        this.bindConstant().annotatedWith((Annotation)Names.named((String)"safeMode")).to(false);
        this.bind(a_0.class).toInstance((Object)new a_0());
        this.bind(Client.class).toInstance((Object)new Client());
        this.bind(ScheduledExecutorService.class).toInstance((Object)new h_0(Executors.newSingleThreadScheduledExecutor()));
        this.bind(c.class);
        this.bind(g.class);
        this.bind(i.class);
        this.bind(l.class).toInstance((Object)a);
        this.bind(l.class).toInstance((Object)a);
        this.bind(EventBus.class).toInstance((Object)new EventBus());
        this.bind(EventBus.class).annotatedWith((Annotation)Names.named((String)"Deferred EventBus")).to(DeferredEventBus.class);
    }

    @Provides
    @Singleton
    h a(i i2) {
        return i2.a(h.class);
    }
}

