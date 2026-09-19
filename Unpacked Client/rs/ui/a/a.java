/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.a;

import java.awt.Color;
import java.awt.image.BufferedImage;
import rs.ui.a.c;

public class a
extends c {
    private int b;
    private int c;

    public a(BufferedImage bufferedImage, String string, String string2, int n2, int n3) {
        super(bufferedImage, string, string2);
        this.b = n2;
        this.c = n3;
    }

    @Override
    public String a() {
        if (this.c() > 0) {
            return "+" + this.c();
        }
        return String.valueOf(this.c());
    }

    @Override
    public Color b() {
        if (this.b < 0) {
            return Color.RED;
        }
        return Color.GREEN;
    }

    public String toString() {
        return "BoostInfoBox(offset=" + this.c() + ", skillId=" + this.d() + ")";
    }

    public int c() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public int d() {
        return this.c;
    }

    public void b(int n2) {
        this.c = n2;
    }
}

