/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL43C
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.k;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.l.a;
import rs.l.e_0;

class q {
    private static final Logger b = LoggerFactory.getLogger(q.class);
    public static final int a = 128;

    q() {
    }

    int a() {
        if (!this.c()) {
            return -1;
        }
        a[] aArray = e_0.y;
        int n2 = GL43C.glGenTextures();
        GL43C.glBindTexture((int)35866, (int)n2);
        if (GL.getCapabilities().glTexStorage3D != 0L) {
            GL43C.glTexStorage3D((int)35866, (int)8, (int)32856, (int)128, (int)128, (int)aArray.length);
        } else {
            int n3 = 128;
            for (int i2 = 0; i2 < 8; ++i2) {
                GL43C.glTexImage3D((int)35866, (int)i2, (int)32856, (int)n3, (int)n3, (int)aArray.length, (int)0, (int)6408, (int)5121, (long)0L);
                n3 /= 2;
            }
        }
        GL43C.glTexParameteri((int)35866, (int)10241, (int)9728);
        GL43C.glTexParameteri((int)35866, (int)10240, (int)9728);
        GL43C.glTexParameteri((int)35866, (int)10242, (int)33071);
        double d2 = e_0.c();
        e_0.b(1.0);
        this.b(n2);
        e_0.b(d2);
        GL43C.glActiveTexture((int)33985);
        GL43C.glBindTexture((int)35866, (int)n2);
        GL43C.glGenerateMipmap((int)35866);
        GL43C.glActiveTexture((int)33984);
        return n2;
    }

    void a(int n2, int n3) {
        GL43C.glBindTexture((int)35866, (int)n2);
        if (n3 == 0) {
            GL43C.glTexParameteri((int)35866, (int)10241, (int)9728);
        } else {
            GL43C.glTexParameteri((int)35866, (int)10241, (int)9986);
        }
        if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            float f2 = GL43C.glGetFloat((int)34047);
            float f3 = Math.max(1.0f, Math.min(f2, (float)n3));
            GL43C.glTexParameterf((int)35866, (int)34046, (float)f3);
        }
    }

    void a(int n2) {
        GL43C.glDeleteTextures((int)n2);
    }

    private boolean c() {
        a[] aArray = e_0.y;
        if (aArray == null || aArray.length == 0) {
            return false;
        }
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            try {
                int[] nArray;
                a a2 = aArray[i2];
                if (a2 == null || (nArray = e_0.d(i2)) != null) continue;
                return false;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private void b(int n2) {
        a[] aArray = e_0.y;
        GL43C.glBindTexture((int)35866, (int)n2);
        int n3 = 0;
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            a a2 = aArray[i2];
            if (a2 == null) continue;
            int[] nArray = e_0.d(i2);
            if (nArray == null) {
                System.out.println("No pixels for texture " + i2 + "!");
                continue;
            }
            ++n3;
            byte[] byArray = q.a(nArray, 128, 128, 128, 128);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.flip();
            GL43C.glTexSubImage3D((int)35866, (int)0, (int)0, (int)0, (int)i2, (int)128, (int)128, (int)1, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        }
        b.debug("Uploaded textures {}", (Object)n3);
    }

    private static byte[] a(int[] nArray, int n2, int n3, int n4, int n5) {
        byte[] byArray = new byte[n4 * n5 * 4];
        int n6 = 0;
        int n7 = 0;
        int n8 = (n4 - n2) * 4;
        for (int i2 = 0; i2 < n3; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                int n9;
                if ((n9 = nArray[n7++]) != 0) {
                    byArray[n6++] = (byte)(n9 >> 16);
                    byArray[n6++] = (byte)(n9 >> 8);
                    byArray[n6++] = (byte)n9;
                    byArray[n6++] = -1;
                    continue;
                }
                n6 += 4;
            }
            n6 += n8;
        }
        return byArray;
    }

    float[] b() {
        a[] aArray = e_0.y;
        float[] fArray = new float[aArray.length * 2];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            a a2 = aArray[i2];
            if (a2 == null) continue;
            int n2 = 0;
            for (int n3 : Client.bJ) {
                if (i2 != n3) continue;
                n2 = a2.j();
                break;
            }
            for (int n3 : Client.bK) {
                if (i2 != n3) continue;
                n2 = a2.j();
                break;
            }
            float f2 = 0.0f;
            float f3 = 0.0f;
            switch (n2) {
                case 1: {
                    f3 = -1.0f;
                    break;
                }
                case 3: {
                    f3 = 1.0f;
                    break;
                }
                case 2: {
                    f2 = -1.0f;
                    break;
                }
                case 4: {
                    f2 = 1.0f;
                }
            }
            int n4 = a2.i();
            fArray[i2 * 2] = f2 *= (float)n4;
            fArray[i2 * 2 + 1] = f3 *= (float)n4;
        }
        return fArray;
    }
}

