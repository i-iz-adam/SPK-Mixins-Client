/*
 * Decompiled with CFR 0.152.
 */
package rs.s.e;

import rs.e.g;
import rs.e.o;
import rs.k.a.b;
import rs.k.a.c;
import rs.s.e.e;

@rs.e.e(a="gpu")
public interface d
extends rs.e.b {
    public static final String a = "gpu";

    @g(b="enabled", c="Enabled", d="Whether GPU is enabled or disabled", a=1)
    default public boolean a() {
        return false;
    }

    @g(b="smoothBanding", c="Smooth banding", d="Smooths out the color banding that is present in the CPU renderer", a=2)
    default public boolean b() {
        return false;
    }

    @g(b="antiAliasingMode", c="Anti Aliasing", d="Configures the anti-aliasing mode", a=3)
    default public rs.k.a.a c() {
        return rs.k.a.a.a;
    }

    @g(b="stretchedMode", c="Stretched Mode", d="Allows you to stretch the game screen in fixed mode", a=4)
    default public boolean d() {
        return false;
    }

    @g(b="maintainAspectRatio", c="Maintain aspect ratio", d="Whether or not to maintain aspect ratio in stretched mode", a=5)
    default public boolean e() {
        return false;
    }

    @g(b="uiScalingMode", c="UI scaling mode", d="Sampling function to use for the UI in stretched mode", a=6)
    default public e f() {
        return e.d;
    }

    @o(a=0, b=16)
    @g(b="anisotropicFilteringLevel", c="Anisotropic Filtering", d="Configures the anisotropic filtering level.", a=7)
    default public int g() {
        return 0;
    }

    @g(b="colorBlindMode", c="Colorblindness Correction", d="Adjusts colors to account for colorblindness", a=8)
    default public b h() {
        return b.a;
    }

    @g(b="vsyncMode", c="Vsync Mode", d="Method to synchronize frame rate with refresh rate", a=11)
    default public c i() {
        return c.c;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.s.e.d$a.a();
        }
    }
}

