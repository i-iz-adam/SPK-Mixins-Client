/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.c;

import rs.gui.x;

public final class c
extends Enum<c> {
    public static final /* enum */ c a = new c(0, 935, 100, "/assets/gui/slot_helm.png");
    public static final /* enum */ c b = new c(2, 935, 138, "/assets/gui/slot_ammy.png");
    public static final /* enum */ c c = new c(4, 935, 177, "/assets/gui/slot_chest.png");
    public static final /* enum */ c d = new c(7, 935, 217, "/assets/gui/slot_legs.png");
    public static final /* enum */ c e = new c(10, 935, 256, "/assets/gui/slot_boots.png");
    public static final /* enum */ c f = new c(1, 894, 138, "/assets/gui/slot_cape.png");
    public static final /* enum */ c g = new c(13, 976, 138, "/assets/gui/slot_arrows.png");
    public static final /* enum */ c h = new c(5, 990, 177, "/assets/gui/slot_shield.png");
    public static final /* enum */ c i = new c(3, 880, 177, "/assets/gui/slot_wep.png");
    public static final /* enum */ c j = new c(9, 880, 256, "/assets/gui/slot_gloves.png");
    public static final /* enum */ c k = new c(12, 990, 256, "/assets/gui/slot_ring.png");
    private String l;
    private x m;
    private int n;
    private int o;
    private int p;
    private static final /* synthetic */ c[] q;

    public static c[] values() {
        return (c[])q.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n3, int n4, int n5, String string2) {
        this.n = n3;
        this.o = n4;
        this.p = n5;
        this.l = string2;
    }

    public x a() {
        x x2;
        if (this.m == null && (x2 = new x(0)).a(this.l)) {
            this.m = x2;
        }
        return this.m;
    }

    public int b() {
        return this.n;
    }

    public int c() {
        return this.o - 765;
    }

    public int d() {
        return this.p - 100;
    }

    public static c a(int n2) {
        for (c c2 : rs.gui.b.c.c.values()) {
            if (c2.b() != n2) continue;
            return c2;
        }
        return null;
    }

    private static /* synthetic */ c[] e() {
        return new c[]{a, b, c, d, e, f, g, h, i, j, k};
    }

    static {
        q = rs.gui.b.c.c.e();
    }
}

