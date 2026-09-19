/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.c.d
 *  com.google.a.c.j
 *  com.google.a.c.p
 */
package rs.a;

import com.google.a.c.d;
import com.google.a.c.j;
import com.google.a.c.p;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import rs.a.b_0;
import rs.a.c_0;
import rs.a.d_0;
import rs.d.k;
import rs.gui.Launcher;
import rs.l.f_0;

/*
 * Renamed from rs.A.a
 */
public class a_0 {
    private final p<a, d_0> a = d.a().a(128L).b(1L, TimeUnit.HOURS).a((j)new b_0(this));
    private final p<b, d_0> b = d.a().a(128L).b(1L, TimeUnit.HOURS).a((j)new c_0(this));

    public void a() {
        this.a.a();
        this.a.c();
        this.b.a();
        this.b.c();
    }

    public d_0 a(int n2) {
        return this.a(n2, 1, 32);
    }

    public d_0 a(int n2, int n3, int n4) {
        try {
            return (d_0)this.a.e((Object)new a(n2, n3, n4));
        }
        catch (ExecutionException executionException) {
            return null;
        }
    }

    public d_0 a(String string, int n2) {
        try {
            return (d_0)this.b.e((Object)new b(string, n2));
        }
        catch (ExecutionException executionException) {
            return null;
        }
    }

    public d_0 a(String string) {
        return this.a(string, -1);
    }

    private d_0 b(int n2) {
        return this.b(n2, Integer.MAX_VALUE, 32);
    }

    private d_0 b(int n2, int n3, int n4) {
        d_0 d_02 = new d_0(36, 32, 2);
        rs.h.a.a("Ico_" + n2 + "_" + n4, () -> {
            if (!Launcher.n().o().fc) {
                return true;
            }
            f_0 f_02 = k.a(n2, n3, 0, n4);
            if (f_02 == null) {
                return true;
            }
            Image image = f_02.a(32, 32);
            image = f_0.a(image, new Color(0, 0, 0));
            Graphics2D graphics2D = d_02.createGraphics();
            graphics2D.drawImage(image, 0, 0, null);
            graphics2D.dispose();
            d_02.a();
            return false;
        });
        return d_02;
    }

    private d_0 b(String string, int n2) {
        Object object;
        int n3 = n2;
        int n4 = n2;
        if (n2 == -1) {
            object = new f_0(string);
            ((f_0)object).a(string);
            n3 = ((f_0)object).n;
            n4 = ((f_0)object).o;
        }
        object = f_0.b(string);
        d_0 d_02 = new d_0(n3, n4, 2);
        rs.h.a.a("Ico_" + string + "_" + n2, () -> a_0.a((Image)object, d_02));
        return d_02;
    }

    private static /* synthetic */ boolean a(Image image, d_0 d_02) {
        try {
            if (image == null || image.getWidth(null) <= 0 || image.getHeight(null) <= 0) {
                return true;
            }
            Graphics2D graphics2D = d_02.createGraphics();
            graphics2D.drawImage(image, 0, 0, null);
            graphics2D.dispose();
            d_02.a();
            return false;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }
    }

    static /* synthetic */ d_0 a(a_0 a_02, int n2, int n3, int n4) {
        return a_02.b(n2, n3, n4);
    }

    static /* synthetic */ d_0 a(a_0 a_02, String string, int n2) {
        return a_02.b(string, n2);
    }

    private static final class a {
        private final int a;
        private final int b;
        private final int c;

        public a(int n2, int n3, int n4) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            if (this.a() != a2.a()) {
                return false;
            }
            if (this.b() != a2.b()) {
                return false;
            }
            return this.c() == a2.c();
        }

        public int hashCode() {
            int n2 = 59;
            int n3 = 1;
            n3 = n3 * 59 + this.a();
            n3 = n3 * 59 + this.b();
            n3 = n3 * 59 + this.c();
            return n3;
        }

        public String toString() {
            return "AssetIconManager.ItemKey(itemId=" + this.a() + ", itemQuantity=" + this.b() + ", size=" + this.c() + ")";
        }

        static /* synthetic */ int a(a a2) {
            return a2.a;
        }

        static /* synthetic */ int b(a a2) {
            return a2.b;
        }

        static /* synthetic */ int c(a a2) {
            return a2.c;
        }
    }

    private static final class b {
        private final String a;
        private final int b;

        public b(String string, int n2) {
            this.a = string;
            this.b = n2;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            b b2 = (b)object;
            if (this.b() != b2.b()) {
                return false;
            }
            String string = this.a();
            String string2 = b2.a();
            return !(string == null ? string2 != null : !string.equals(string2));
        }

        public int hashCode() {
            int n2 = 59;
            int n3 = 1;
            n3 = n3 * 59 + this.b();
            String string = this.a();
            n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
            return n3;
        }

        public String toString() {
            return "AssetIconManager.SpriteKey(directory=" + this.a() + ", size=" + this.b() + ")";
        }

        static /* synthetic */ String a(b b2) {
            return b2.a;
        }

        static /* synthetic */ int b(b b2) {
            return b2.b;
        }
    }
}

