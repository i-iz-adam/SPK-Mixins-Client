/*
 * Decompiled with CFR 0.152.
 */
package rs.x;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import rs.x.a;
import rs.x.e;

public class f {
    public byte[] a;
    public int b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public boolean g;

    public f(byte[] byArray, String string) {
        this.a(byArray);
    }

    public static byte[] a(File file) {
        int n2;
        FileInputStream fileInputStream = new FileInputStream(file);
        long l2 = file.length();
        byte[] byArray = new byte[(int)l2];
        int n3 = 0;
        for (n2 = 0; n2 < byArray.length && (n3 = ((InputStream)fileInputStream).read(byArray, n2, byArray.length - n2)) >= 0; n2 += n3) {
        }
        if (n2 < byArray.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }
        ((InputStream)fileInputStream).close();
        return byArray;
    }

    public void a(byte[] byArray) {
        byte[] byArray2;
        e e2 = new e(byArray);
        int n2 = e2.C();
        int n3 = e2.C();
        if (n3 == 0) {
            byArray2 = new byte[n2];
            byte[] byArray3 = new byte[n2];
            System.arraycopy(byArray, 6, byArray2, 0, byArray.length - 6);
            try {
                DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray2)));
                dataInputStream.readFully(byArray3, 0, byArray3.length);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.a = byArray3;
            e2 = new e(this.a);
            this.g = true;
        } else if (n3 != n2) {
            byArray2 = new byte[n2];
            rs.x.a.a(byArray2, n2, byArray, n3, 6);
            this.a = byArray2;
            e2 = new e(this.a);
            this.g = true;
        } else {
            this.a = byArray;
            this.g = false;
        }
        this.b = e2.A();
        this.c = new int[this.b];
        this.d = new int[this.b];
        this.e = new int[this.b];
        this.f = new int[this.b];
        int n4 = e2.h + this.b * 10;
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.c[i2] = e2.D();
            this.d[i2] = e2.C();
            this.e[i2] = e2.C();
            this.f[i2] = n4;
            n4 += this.e[i2];
        }
    }

    public byte[] a(String string) {
        int n2;
        byte[] byArray = null;
        int n3 = 0;
        string = string.toUpperCase();
        for (n2 = 0; n2 < string.length(); ++n2) {
            n3 = n3 * 61 + string.charAt(n2) - 32;
        }
        for (n2 = 0; n2 < this.b; ++n2) {
            if (this.c[n2] != n3) continue;
            if (byArray == null) {
                byArray = new byte[this.d[n2]];
            }
            if (!this.g) {
                rs.x.a.a(byArray, this.d[n2], this.a, this.e[n2], this.f[n2]);
            } else {
                System.arraycopy(this.a, this.f[n2], byArray, 0, this.d[n2]);
            }
            return byArray;
        }
        return null;
    }
}

