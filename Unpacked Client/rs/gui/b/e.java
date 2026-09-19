/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import rs.gui.x;

public final class e
extends Enum<e> {
    public static final /* enum */ e a = new e("Melee", "/assets/gui/icons/melee.png");
    public static final /* enum */ e b = new e("Range", "/assets/gui/icons/range.png");
    public static final /* enum */ e c = new e("Magic", "/assets/gui/icons/magic.png");
    public static final /* enum */ e d = new e("Pure", "/assets/gui/icons/pure.png");
    public static final /* enum */ e e = new e("Welfare", "/assets/gui/icons/welfare.png");
    public static final /* enum */ e f = new e("Skull", "/assets/gui/icons/skull.png");
    public static final /* enum */ e g = new e("Red Skull", "/assets/gui/icons/redskull.png");
    public static final /* enum */ e h = new e("Hotspot", "/assets/gui/icons/hotspot.png");
    public static final /* enum */ e i = new e("Slayer", "/assets/gui/icons/slayer.png");
    public static final /* enum */ e j = new e("Blood Slayer", "/assets/gui/icons/slayerblood.png");
    public static final /* enum */ e k = new e("PvM", "/assets/gui/icons/pvm.png");
    public static final /* enum */ e l = new e("Raids", "/assets/gui/icons/raids.png");
    public static final /* enum */ e m = new e("Raids 2", "/assets/gui/icons/raids 2.png");
    public static final /* enum */ e n = new e("Event", "/assets/gui/icons/event.png");
    public static final /* enum */ e o = new e("Cash", "/assets/gui/icons/cash 1.png");
    public static final /* enum */ e p = new e("Cash 2", "/assets/gui/icons/cash 2.png");
    public static final /* enum */ e q = new e("Barrage", "/assets/gui/icons/barrage.png");
    public static final /* enum */ e r = new e("Fun", "/assets/gui/icons/fun.png");
    public static final /* enum */ e s = new e("Box", "/assets/gui/icons/box.png");
    public static final /* enum */ e t = new e("Master Orb", "/assets/gui/icons/orb 3.png");
    public static final /* enum */ e u = new e("Cursed Orb", "/assets/gui/icons/orb 4.png");
    public static final /* enum */ e v = new e("Enchant", "/assets/gui/icons/enchant.png");
    public static final /* enum */ e w = new e("Emoji", "/assets/gui/icons/emoji 1.png");
    public static final /* enum */ e x = new e("Emoji 2", "/assets/gui/icons/emoji 2.png");
    public static final /* enum */ e y = new e("Emoji 3", "/assets/gui/icons/emoji 3.png");
    public static final /* enum */ e z = new e("Emoji 4", "/assets/gui/icons/emoji 4.png");
    public static final /* enum */ e A = new e("Emoji 5", "/assets/gui/icons/emoji 5.png");
    public static final /* enum */ e B = new e("Emoji 6", "/assets/gui/icons/emoji 6.png");
    public static final /* enum */ e C = new e("Emoji 7", "/assets/gui/icons/emoji 7.png");
    private x F;
    private Icon G;
    public String D;
    public String E;
    private static final /* synthetic */ e[] H;

    public static e[] values() {
        return (e[])H.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private e(String string2, String string3) {
        this.D = string2;
        this.E = string3;
    }

    public Icon a() {
        if (this.F == null) {
            this.F = new x(0);
            if (!this.F.a(this.E)) {
                this.F = null;
            }
        }
        if (this.F == null) {
            return null;
        }
        if (this.G == null) {
            this.G = new ImageIcon(this.F.a);
        }
        return this.G;
    }

    private static /* synthetic */ e[] b() {
        return new e[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C};
    }

    static {
        H = rs.gui.b.e.b();
    }
}

