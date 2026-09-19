/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.a.d
 *  org.lwjgl.opengl.GL43C
 */
package rs.k;

import com.google.a.a.d;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL43C;
import rs.k.n;

public class m {
    @d
    final List<a> a = new ArrayList<a>();

    public m a(int n2, String string) {
        this.a.add(new a(n2, string));
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(rs.k.d.a a2) {
        int n2 = GL43C.glCreateProgram();
        int[] nArray = new int[this.a.size()];
        int n3 = 0;
        boolean bl = false;
        try {
            Object object;
            while (n3 < nArray.length) {
                object = this.a.get(n3);
                int n4 = GL43C.glCreateShader((int)((a)object).a);
                if (n4 == 0) {
                    throw new n("Unable to create shader of type " + ((a)object).a);
                }
                String string = a2.b(((a)object).b);
                GL43C.glShaderSource((int)n4, (CharSequence)string);
                GL43C.glCompileShader((int)n4);
                if (GL43C.glGetShaderi((int)n4, (int)35713) != 1) {
                    String string2 = GL43C.glGetShaderInfoLog((int)n4);
                    GL43C.glDeleteShader((int)n4);
                    throw new n(string2);
                }
                GL43C.glAttachShader((int)n2, (int)n4);
                nArray[n3++] = n4;
            }
            GL43C.glLinkProgram((int)n2);
            if (GL43C.glGetProgrami((int)n2, (int)35714) == 0) {
                object = GL43C.glGetProgramInfoLog((int)n2);
                throw new n((String)object);
            }
            GL43C.glValidateProgram((int)n2);
            if (GL43C.glGetProgrami((int)n2, (int)35715) == 0) {
                object = GL43C.glGetProgramInfoLog((int)n2);
                throw new n((String)object);
            }
            bl = true;
        }
        finally {
            while (n3 > 0) {
                int n5 = nArray[--n3];
                GL43C.glDetachShader((int)n2, (int)n5);
                GL43C.glDeleteShader((int)n5);
            }
            if (!bl) {
                GL43C.glDeleteProgram((int)n2);
            }
        }
        return n2;
    }

    @d
    static class a {
        private final int a;
        private final String b;

        public a(int n2, String string) {
            this.a = n2;
            this.b = string;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }
}

