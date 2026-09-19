/*
 * Decompiled with CFR 0.152.
 */
package rs.cache;

import java.io.IOException;
import java.io.RandomAccessFile;

public final class a {
    private final byte[] a = new byte[520];
    private final RandomAccessFile b;
    private final RandomAccessFile c;
    private final int d;

    public a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, int n2) {
        this.b = randomAccessFile;
        this.c = randomAccessFile2;
        this.d = n2;
    }

    public synchronized byte[] a(int n2) {
        try {
            int n3;
            int n4;
            this.a(this.c, n2 * 6);
            for (n3 = 0; n3 < 6; n3 += n4) {
                n4 = this.c.read(this.a, n3, 6 - n3);
                if (n4 != -1) continue;
                return null;
            }
            n4 = ((this.a[0] & 0xFF) << 16) + ((this.a[1] & 0xFF) << 8) + (this.a[2] & 0xFF);
            n3 = ((this.a[3] & 0xFF) << 16) + ((this.a[4] & 0xFF) << 8) + (this.a[5] & 0xFF);
            if (n3 <= 0 || (long)n3 > this.b.length() / 520L) {
                return null;
            }
            byte[] byArray = new byte[n4];
            int n5 = 0;
            int n6 = 0;
            while (n5 < n4) {
                int n7;
                int n8;
                if (n3 == 0) {
                    return null;
                }
                this.a(this.b, n3 * 520);
                int n9 = n4 - n5;
                if (n9 > 512) {
                    n9 = 512;
                }
                for (n7 = 0; n7 < n9 + 8; n7 += n8) {
                    n8 = this.b.read(this.a, n7, n9 + 8 - n7);
                    if (n8 != -1) continue;
                    return null;
                }
                n8 = ((this.a[0] & 0xFF) << 8) + (this.a[1] & 0xFF);
                n7 = ((this.a[2] & 0xFF) << 8) + (this.a[3] & 0xFF);
                int n10 = ((this.a[4] & 0xFF) << 16) + ((this.a[5] & 0xFF) << 8) + (this.a[6] & 0xFF);
                int n11 = this.a[7] & 0xFF;
                if (n8 != n2 || n7 != n6 || n11 != this.d) {
                    return null;
                }
                if (n10 < 0 || (long)n10 > this.b.length() / 520L) {
                    return null;
                }
                for (int i2 = 0; i2 < n9; ++i2) {
                    byArray[n5++] = this.a[i2 + 8];
                }
                n3 = n10;
                ++n6;
            }
            return byArray;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public synchronized boolean a(int n2, byte[] byArray, int n3) {
        boolean bl = this.a(true, n3, n2, byArray);
        if (!bl) {
            bl = this.a(false, n3, n2, byArray);
        }
        return bl;
    }

    private synchronized boolean a(boolean bl, int n2, int n3, byte[] byArray) {
        try {
            int n4;
            int n5;
            int n6;
            if (bl) {
                this.a(this.c, n2 * 6);
                for (n5 = 0; n5 < 6; n5 += n6) {
                    n6 = this.c.read(this.a, n5, 6 - n5);
                    if (n6 != -1) continue;
                    return false;
                }
                n4 = ((this.a[3] & 0xFF) << 16) + ((this.a[4] & 0xFF) << 8) + (this.a[5] & 0xFF);
                if (n4 <= 0 || (long)n4 > this.b.length() / 520L) {
                    return false;
                }
            } else {
                n4 = (int)((this.b.length() + 519L) / 520L);
                if (n4 == 0) {
                    n4 = 1;
                }
            }
            this.a[0] = (byte)(n3 >> 16);
            this.a[1] = (byte)(n3 >> 8);
            this.a[2] = (byte)n3;
            this.a[3] = (byte)(n4 >> 16);
            this.a[4] = (byte)(n4 >> 8);
            this.a[5] = (byte)n4;
            this.a(this.c, n2 * 6);
            this.c.write(this.a, 0, 6);
            n6 = 0;
            n5 = 0;
            while (n6 < n3) {
                int n7;
                int n8 = 0;
                if (bl) {
                    int n9;
                    this.a(this.b, n4 * 520);
                    for (n7 = 0; n7 < 8 && (n9 = this.b.read(this.a, n7, 8 - n7)) != -1; n7 += n9) {
                    }
                    if (n7 == 8) {
                        int n10 = ((this.a[0] & 0xFF) << 8) + (this.a[1] & 0xFF);
                        int n11 = ((this.a[2] & 0xFF) << 8) + (this.a[3] & 0xFF);
                        n8 = ((this.a[4] & 0xFF) << 16) + ((this.a[5] & 0xFF) << 8) + (this.a[6] & 0xFF);
                        int n12 = this.a[7] & 0xFF;
                        if (n10 != n2 || n11 != n5 || n12 != this.d) {
                            return false;
                        }
                        if (n8 < 0 || (long)n8 > this.b.length() / 520L) {
                            return false;
                        }
                    }
                }
                if (n8 == 0) {
                    bl = false;
                    n8 = (int)((this.b.length() + 519L) / 520L);
                    if (n8 == 0) {
                        ++n8;
                    }
                    if (n8 == n4) {
                        ++n8;
                    }
                }
                if (n3 - n6 <= 512) {
                    n8 = 0;
                }
                this.a[0] = (byte)(n2 >> 8);
                this.a[1] = (byte)n2;
                this.a[2] = (byte)(n5 >> 8);
                this.a[3] = (byte)n5;
                this.a[4] = (byte)(n8 >> 16);
                this.a[5] = (byte)(n8 >> 8);
                this.a[6] = (byte)n8;
                this.a[7] = (byte)this.d;
                this.a(this.b, n4 * 520);
                this.b.write(this.a, 0, 8);
                n7 = n3 - n6;
                if (n7 > 512) {
                    n7 = 512;
                }
                this.b.write(byArray, n6, n7);
                n6 += n7;
                n4 = n8;
                ++n5;
            }
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private synchronized void a(RandomAccessFile randomAccessFile, int n2) {
        randomAccessFile.seek(n2);
    }
}

