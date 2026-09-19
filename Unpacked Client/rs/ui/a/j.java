/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.V
 */
package rs.ui.a;

import com.google.a.b.V;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import rs.ui.a.c;

public class j
extends c {
    private Instant b;
    private Instant c;
    private Duration d;

    public j(long l2, ChronoUnit chronoUnit, BufferedImage bufferedImage, String string, String string2) {
        super(bufferedImage, string, string2);
        V.a((l2 > 0L ? 1 : 0) != 0, (Object)"negative period!");
        this.b = Instant.now();
        this.d = Duration.of(l2, chronoUnit);
        this.c = this.b.plus(this.d);
    }

    @Override
    public String a() {
        Duration duration = Duration.between(Instant.now(), this.c);
        if (this.r()) {
            return this.d(duration);
        }
        return this.c(duration);
    }

    @Override
    public Color b() {
        Duration duration = Duration.between(Instant.now(), this.c);
        if ((double)duration.getSeconds() < (double)this.d.getSeconds() * 0.1) {
            return Color.RED.brighter();
        }
        return Color.WHITE;
    }

    @Override
    public boolean e() {
        Duration duration = Duration.between(Instant.now(), this.c);
        return !duration.isNegative();
    }

    @Override
    public boolean f() {
        Duration duration = Duration.between(Instant.now(), this.c);
        return duration.isZero() || duration.isNegative();
    }

    private String c(Duration duration) {
        if (duration.toHours() >= 1L) {
            long l2 = duration.getSeconds();
            long l3 = l2 / 3600L;
            long l4 = l2 % 3600L / 60L;
            long l5 = l2 % 60L;
            return String.format("%dh%02dm", l3, l4, l5);
        }
        int n2 = (int)(duration.toMillis() / 1000L);
        int n3 = n2 % 3600 / 60;
        int n4 = n2 % 60;
        return String.format("%d:%02d", n3, n4);
    }

    private String d(Duration duration) {
        if (duration.toHours() >= 1L) {
            long l2 = duration.getSeconds();
            long l3 = l2 / 3600L;
            long l4 = l2 % 3600L / 60L;
            long l5 = l2 % 60L;
            return String.format("%dh", l3, l4, l5);
        }
        if (duration.toMinutes() >= 1L) {
            int n2 = (int)(duration.toMillis() / 1000L);
            int n3 = n2 % 3600 / 60;
            return String.format("%dm", n3);
        }
        return String.format("%d", duration.getSeconds());
    }

    public void a(Duration duration) {
        V.a((!duration.isNegative() ? 1 : 0) != 0, (Object)"negative duration");
        this.d = duration;
        this.c = this.b.plus(duration);
    }

    public void b(Duration duration) {
        V.a((!duration.isNegative() ? 1 : 0) != 0, (Object)"negative duration");
        this.b = Instant.now();
        this.c = Instant.now().plus(duration);
        this.d = Duration.between(this.b, this.c);
    }

    public Instant c() {
        return this.b;
    }

    public Instant d() {
        return this.c;
    }

    public Duration s() {
        return this.d;
    }

    public String toString() {
        return "TimerInfoBox(startTime=" + String.valueOf(this.c()) + ", endTime=" + String.valueOf(this.d()) + ", duration=" + String.valueOf(this.s()) + ")";
    }
}

