/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.a;

import java.awt.Color;
import java.awt.image.BufferedImage;
import rs.ui.a.c;

public class b
extends c {
    private static final String b = "";
    private int c;

    public b(BufferedImage bufferedImage, String string, String string2, int n2) {
        super(bufferedImage, string, string2);
        this.c = n2;
    }

    @Override
    public String a() {
        return this.c() == -1 ? b : Integer.toString(this.c());
    }

    @Override
    public Color b() {
        return Color.WHITE;
    }

    public String toString() {
        return "CounterInfoBox(count=" + this.c() + ")";
    }

    public int c() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }
}

