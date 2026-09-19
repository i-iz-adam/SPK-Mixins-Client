/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.a;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import rs.l.f.f;
import rs.ui.a.e;
import rs.ui.a.h;

public abstract class c {
    private final String b;
    private final String c;
    String a;
    private BufferedImage d;
    private BufferedImage e;
    private h f;
    private String g;
    private List<f> h = new ArrayList<f>();
    private e i = rs.ui.a.e.b;
    private int j = 0;
    private Instant k;
    private boolean l = false;

    public c(BufferedImage bufferedImage, String string, String string2) {
        this.c = string;
        this.a = string;
        this.b = string2;
        this.a(bufferedImage);
        this.a(rs.ui.a.h.c);
    }

    public abstract String a();

    public abstract Color b();

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        Duration duration;
        if (this.j == 0) {
            return false;
        }
        if (this.k == null) {
            return true;
        }
        Duration duration2 = Duration.between(this.k, Instant.now());
        return duration2.compareTo(duration = Duration.ofMinutes(this.j)) > 0;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public String j() {
        return this.a;
    }

    public BufferedImage k() {
        return this.d;
    }

    public void a(BufferedImage bufferedImage) {
        this.d = bufferedImage;
    }

    public BufferedImage l() {
        return this.e;
    }

    public void b(BufferedImage bufferedImage) {
        this.e = bufferedImage;
    }

    public h m() {
        return this.f;
    }

    public void a(h h2) {
        this.f = h2;
    }

    public String n() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
    }

    public List<f> o() {
        return this.h;
    }

    public void a(List<f> list) {
        this.h = list;
    }

    public e p() {
        return this.i;
    }

    public void a(e e2) {
        this.i = e2;
    }

    public int q() {
        return this.j;
    }

    public void c(int n2) {
        this.j = n2;
    }

    public void a(Instant instant) {
        this.k = instant;
    }

    public boolean r() {
        return this.l;
    }

    public void a(boolean bl) {
        this.l = bl;
    }
}

