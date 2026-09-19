/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.e.f
 *  com.google.a.e.h
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.n;

import com.google.a.e.f;
import com.google.a.e.h;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.Clip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.e.i;
import rs.e.n;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.k.j;
import rs.runelite.events.NotificationFired;

@Singleton
public class c {
    private static final Logger a = LoggerFactory.getLogger(c.class);
    private static final String b = "\"";
    private static final f c = com.google.a.e.h.b().a('\"', "'").a();
    private static final int d = 2000;
    private static final int e = 100;
    private static final long f = -2L;
    private static final long g = -1L;
    private final Client h;
    private rs.s.n.a i;
    private final rs.ui.f j;
    private final i k;
    private final ScheduledExecutorService l;
    private final EventBus m;
    private final String n;
    private final Path o;
    private boolean p;
    private Instant q;
    private long r;
    private long s = -2L;
    private Clip t = null;

    @Inject
    private c(rs.ui.f f2, Client client, i i2, ScheduledExecutorService scheduledExecutorService, EventBus eventBus) {
        this.h = client;
        this.j = f2;
        this.k = i2;
        this.l = scheduledExecutorService;
        this.m = eventBus;
        this.n = rs.f.a.A;
        this.o = new File(rs.v.a.b() + "icon.png").toPath();
        this.i = i2.a(rs.s.n.a.class);
        this.a();
    }

    private void a() {
        if (rs.k.j.a() == rs.k.j.c && !Files.exists(this.o, new LinkOption[0])) {
            try (InputStream inputStream = Launcher.class.getResourceAsStream("/icon.png");){
                Files.copy(inputStream, this.o, new CopyOption[0]);
            }
            catch (IOException iOException) {
                a.warn(null, (Throwable)iOException);
            }
        }
    }

    public void a(String string) {
        this.a(string, TrayIcon.MessageType.NONE);
    }

    public void a(String string, TrayIcon.MessageType messageType) {
        this.m.post(new NotificationFired(string, messageType));
        if (!this.i.j() && this.j.d()) {
            return;
        }
        switch (this.i.f()) {
            case b: {
                this.j.e();
                break;
            }
            case c: {
                this.j.f();
            }
        }
        if (this.i.e()) {
            this.a(this.c(), string, messageType);
        }
        switch (this.i.g()) {
            case a: {
                Toolkit.getDefaultToolkit().beep();
            }
        }
        if (this.i.i() != rs.e.n.a) {
            this.q = Instant.now();
            this.r = this.h.hL;
        }
        a.debug(string);
    }

    public void a(Graphics2D graphics2D) {
        n n2 = this.i.i();
        if (this.q == null || !this.h.fc || n2 == rs.e.n.a) {
            this.q = null;
            return;
        }
        if (Instant.now().minusMillis(2000L).isAfter(this.q)) {
            switch (n2) {
                case b: 
                case c: {
                    this.q = null;
                    return;
                }
                case e: 
                case d: {
                    if (this.h.hL >= 100L && this.h.hL >= 100L) break;
                    this.q = null;
                    return;
                }
            }
        }
        if (Client.ff % 40 >= 20 && (n2 == rs.e.n.b || n2 == rs.e.n.d)) {
            return;
        }
        Color color = graphics2D.getColor();
        graphics2D.setColor(this.i.k());
        graphics2D.fill(new Rectangle(this.j.n().getWidth(), this.j.n().getHeight()));
        graphics2D.setColor(color);
    }

    private void a(String string, String string2, TrayIcon.MessageType messageType) {
        String string3 = c.a(string);
        String string4 = c.a(string2);
        switch (rs.k.j.a()) {
            case c: {
                this.c(string3, string4, messageType);
                break;
            }
            case b: {
                this.a(string3, string4);
                break;
            }
            default: {
                this.b(string, string2, messageType);
            }
        }
    }

    private void b(String string, String string2, TrayIcon.MessageType messageType) {
        if (this.j.l() != null) {
            this.j.l().displayMessage(string, string2, messageType);
        }
    }

    private void c(String string, String string2, TrayIcon.MessageType messageType) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("notify-send");
        arrayList.add(string);
        arrayList.add(string2);
        arrayList.add("-a");
        arrayList.add(c.a(this.n));
        arrayList.add("-i");
        arrayList.add(c.a(this.o.toAbsolutePath().toString()));
        arrayList.add("-u");
        arrayList.add(rs.s.n.c.a(messageType));
        if (this.i.h() > 0) {
            arrayList.add("-t");
            arrayList.add(String.valueOf(this.i.h()));
        }
        this.l.submit(() -> {
            try {
                Process process = rs.s.n.c.a(arrayList);
                boolean bl = process.waitFor(500L, TimeUnit.MILLISECONDS);
                if (bl && process.exitValue() == 0) {
                    return;
                }
            }
            catch (IOException | InterruptedException exception) {
                a.debug("error sending notification", (Throwable)exception);
            }
            this.b(string, string2, messageType);
        });
    }

    private void a(String string, String string2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.p) {
            Collections.addAll(arrayList, "sh", "-lc", "\"$@\"", "--", "terminal-notifier", "-title", string, "-message", string2, "-group", "net.runelite.launcher", "-sender", "net.runelite.launcher");
        } else {
            arrayList.add("osascript");
            arrayList.add("-e");
            String string3 = "display notification \"" + string2 + "\" with title \"" + string + b;
            arrayList.add(string3);
        }
        try {
            rs.s.n.c.a(arrayList);
        }
        catch (IOException iOException) {
            a.warn("error sending notification", (Throwable)iOException);
        }
    }

    private static Process a(List<String> list) {
        return new ProcessBuilder(list).redirectErrorStream(true).start();
    }

    private boolean b() {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"sh", "-lc", "terminal-notifier -help"});
            if (!process.waitFor(2L, TimeUnit.SECONDS)) {
                return false;
            }
            return process.exitValue() == 0;
        }
        catch (IOException | InterruptedException exception) {
            return false;
        }
    }

    private static String a(TrayIcon.MessageType messageType) {
        switch (messageType) {
            case WARNING: 
            case ERROR: {
                return "critical";
            }
        }
        return "normal";
    }

    private String c() {
        return this.n;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("Native");
        public static final /* enum */ a b = new a("Off");
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public String toString() {
            return this.c;
        }

        public String a() {
            return this.c;
        }

        private a(String string2) {
            this.c = string2;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = rs.s.n.c$a.b();
        }
    }
}

