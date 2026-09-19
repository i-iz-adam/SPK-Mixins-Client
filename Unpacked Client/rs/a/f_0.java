/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.c.A
 *  com.google.c.C
 *  com.google.c.D
 *  com.google.c.E
 *  com.google.c.u
 *  com.google.c.v
 *  com.google.c.w
 *  com.google.c.z
 */
package rs.a;

import com.google.c.A;
import com.google.c.C;
import com.google.c.D;
import com.google.c.E;
import com.google.c.u;
import com.google.c.v;
import com.google.c.w;
import com.google.c.z;
import java.awt.Color;
import java.lang.reflect.Type;

/*
 * Renamed from rs.A.f
 */
public class f_0
implements E<Color>,
v<Color> {
    public Color b(w w2, Type type, u u2) {
        if (!(w2 instanceof z)) {
            throw new A("The color " + String.valueOf(w2) + " is not an object!");
        }
        if (!w2.t().b("value")) {
            throw new A("The color " + String.valueOf(w2) + " has no value!");
        }
        Color color = new Color(w2.t().c("value").j());
        return color;
    }

    public w a(Color color, Type type, D d2) {
        z z2 = new z();
        z2.a("value", (w)new C((Number)color.getRGB()));
        z2.a("falpha", (w)new C((Number)Float.valueOf(0.0f)));
        return z2;
    }

    public /* synthetic */ Object a(w w2, Type type, u u2) {
        return this.b(w2, type, u2);
    }

    public /* synthetic */ w serialize(Object object, Type type, D d2) {
        return this.a((Color)object, type, d2);
    }
}

