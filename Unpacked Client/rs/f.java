/*
 * Decompiled with CFR 0.152.
 */
package rs;

public final class f {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    public final int[][] a;

    public f() {
        this.b = 0;
        this.c = 0;
        this.d = 104;
        this.e = 104;
        this.a = new int[this.d][this.e];
        this.a();
    }

    public void a() {
        for (int i2 = 0; i2 < this.d; ++i2) {
            for (int i3 = 0; i3 < this.e; ++i3) {
                this.a[i2][i3] = i2 == 0 || i3 == 0 || i2 == this.d - 1 || i3 == this.e - 1 ? 0xFFFFFF : 0x1000000;
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl) {
        n4 -= this.b;
        n2 -= this.c;
        if (n5 == 0) {
            if (n3 == 0) {
                this.a(n4, n2, 128);
                this.a(n4 - 1, n2, 8);
            }
            if (n3 == 1) {
                this.a(n4, n2, 2);
                this.a(n4, n2 + 1, 32);
            }
            if (n3 == 2) {
                this.a(n4, n2, 8);
                this.a(n4 + 1, n2, 128);
            }
            if (n3 == 3) {
                this.a(n4, n2, 32);
                this.a(n4, n2 - 1, 2);
            }
        }
        if (n5 == 1 || n5 == 3) {
            if (n3 == 0) {
                this.a(n4, n2, 1);
                this.a(n4 - 1, n2 + 1, 16);
            }
            if (n3 == 1) {
                this.a(n4, n2, 4);
                this.a(n4 + 1, n2 + 1, 64);
            }
            if (n3 == 2) {
                this.a(n4, n2, 16);
                this.a(n4 + 1, n2 - 1, 1);
            }
            if (n3 == 3) {
                this.a(n4, n2, 64);
                this.a(n4 - 1, n2 - 1, 4);
            }
        }
        if (n5 == 2) {
            if (n3 == 0) {
                this.a(n4, n2, 130);
                this.a(n4 - 1, n2, 8);
                this.a(n4, n2 + 1, 32);
            }
            if (n3 == 1) {
                this.a(n4, n2, 10);
                this.a(n4, n2 + 1, 32);
                this.a(n4 + 1, n2, 128);
            }
            if (n3 == 2) {
                this.a(n4, n2, 40);
                this.a(n4 + 1, n2, 128);
                this.a(n4, n2 - 1, 2);
            }
            if (n3 == 3) {
                this.a(n4, n2, 160);
                this.a(n4, n2 - 1, 2);
                this.a(n4 - 1, n2, 8);
            }
        }
        if (bl) {
            if (n5 == 0) {
                if (n3 == 0) {
                    this.a(n4, n2, 65536);
                    this.a(n4 - 1, n2, 4096);
                }
                if (n3 == 1) {
                    this.a(n4, n2, 1024);
                    this.a(n4, n2 + 1, 16384);
                }
                if (n3 == 2) {
                    this.a(n4, n2, 4096);
                    this.a(n4 + 1, n2, 65536);
                }
                if (n3 == 3) {
                    this.a(n4, n2, 16384);
                    this.a(n4, n2 - 1, 1024);
                }
            }
            if (n5 == 1 || n5 == 3) {
                if (n3 == 0) {
                    this.a(n4, n2, 512);
                    this.a(n4 - 1, n2 + 1, 8192);
                }
                if (n3 == 1) {
                    this.a(n4, n2, 2048);
                    this.a(n4 + 1, n2 + 1, 32768);
                }
                if (n3 == 2) {
                    this.a(n4, n2, 8192);
                    this.a(n4 + 1, n2 - 1, 512);
                }
                if (n3 == 3) {
                    this.a(n4, n2, 32768);
                    this.a(n4 - 1, n2 - 1, 2048);
                }
            }
            if (n5 == 2) {
                if (n3 == 0) {
                    this.a(n4, n2, 66560);
                    this.a(n4 - 1, n2, 4096);
                    this.a(n4, n2 + 1, 16384);
                }
                if (n3 == 1) {
                    this.a(n4, n2, 5120);
                    this.a(n4, n2 + 1, 16384);
                    this.a(n4 + 1, n2, 65536);
                }
                if (n3 == 2) {
                    this.a(n4, n2, 20480);
                    this.a(n4 + 1, n2, 65536);
                    this.a(n4, n2 - 1, 1024);
                }
                if (n3 == 3) {
                    this.a(n4, n2, 81920);
                    this.a(n4, n2 - 1, 1024);
                    this.a(n4 - 1, n2, 4096);
                }
            }
        }
    }

    public void a(boolean bl, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = 256;
        if (bl) {
            n8 += 131072;
        }
        n4 -= this.b;
        n5 -= this.c;
        if (n6 == 1 || n6 == 3) {
            n7 = n2;
            n2 = n3;
            n3 = n7;
        }
        for (n7 = n4; n7 < n4 + n2; ++n7) {
            if (n7 < 0 || n7 >= this.d) continue;
            for (int i2 = n5; i2 < n5 + n3; ++i2) {
                if (i2 < 0 || i2 >= this.e) continue;
                this.a(n7, i2, n8);
            }
        }
    }

    public void a(int n2, int n3) {
        int[] nArray = this.a[n3 -= this.b];
        int n4 = n2 -= this.c;
        nArray[n4] = nArray[n4] | 0x200000;
    }

    private void a(int n2, int n3, int n4) {
        int[] nArray = this.a[n2];
        int n5 = n3;
        nArray[n5] = nArray[n5] | n4;
    }

    public void a(int n2, int n3, boolean bl, int n4, int n5) {
        n4 -= this.b;
        n5 -= this.c;
        if (n3 == 0) {
            if (n2 == 0) {
                this.b(128, n4, n5);
                this.b(8, n4 - 1, n5);
            }
            if (n2 == 1) {
                this.b(2, n4, n5);
                this.b(32, n4, n5 + 1);
            }
            if (n2 == 2) {
                this.b(8, n4, n5);
                this.b(128, n4 + 1, n5);
            }
            if (n2 == 3) {
                this.b(32, n4, n5);
                this.b(2, n4, n5 - 1);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n2 == 0) {
                this.b(1, n4, n5);
                this.b(16, n4 - 1, n5 + 1);
            }
            if (n2 == 1) {
                this.b(4, n4, n5);
                this.b(64, n4 + 1, n5 + 1);
            }
            if (n2 == 2) {
                this.b(16, n4, n5);
                this.b(1, n4 + 1, n5 - 1);
            }
            if (n2 == 3) {
                this.b(64, n4, n5);
                this.b(4, n4 - 1, n5 - 1);
            }
        }
        if (n3 == 2) {
            if (n2 == 0) {
                this.b(130, n4, n5);
                this.b(8, n4 - 1, n5);
                this.b(32, n4, n5 + 1);
            }
            if (n2 == 1) {
                this.b(10, n4, n5);
                this.b(32, n4, n5 + 1);
                this.b(128, n4 + 1, n5);
            }
            if (n2 == 2) {
                this.b(40, n4, n5);
                this.b(128, n4 + 1, n5);
                this.b(2, n4, n5 - 1);
            }
            if (n2 == 3) {
                this.b(160, n4, n5);
                this.b(2, n4, n5 - 1);
                this.b(8, n4 - 1, n5);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n2 == 0) {
                    this.b(65536, n4, n5);
                    this.b(4096, n4 - 1, n5);
                }
                if (n2 == 1) {
                    this.b(1024, n4, n5);
                    this.b(16384, n4, n5 + 1);
                }
                if (n2 == 2) {
                    this.b(4096, n4, n5);
                    this.b(65536, n4 + 1, n5);
                }
                if (n2 == 3) {
                    this.b(16384, n4, n5);
                    this.b(1024, n4, n5 - 1);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n2 == 0) {
                    this.b(512, n4, n5);
                    this.b(8192, n4 - 1, n5 + 1);
                }
                if (n2 == 1) {
                    this.b(2048, n4, n5);
                    this.b(32768, n4 + 1, n5 + 1);
                }
                if (n2 == 2) {
                    this.b(8192, n4, n5);
                    this.b(512, n4 + 1, n5 - 1);
                }
                if (n2 == 3) {
                    this.b(32768, n4, n5);
                    this.b(2048, n4 - 1, n5 - 1);
                }
            }
            if (n3 == 2) {
                if (n2 == 0) {
                    this.b(66560, n4, n5);
                    this.b(4096, n4 - 1, n5);
                    this.b(16384, n4, n5 + 1);
                }
                if (n2 == 1) {
                    this.b(5120, n4, n5);
                    this.b(16384, n4, n5 + 1);
                    this.b(65536, n4 + 1, n5);
                }
                if (n2 == 2) {
                    this.b(20480, n4, n5);
                    this.b(65536, n4 + 1, n5);
                    this.b(1024, n4, n5 - 1);
                }
                if (n2 == 3) {
                    this.b(81920, n4, n5);
                    this.b(1024, n4, n5 - 1);
                    this.b(4096, n4 - 1, n5);
                }
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7;
        int n8 = 256;
        if (bl) {
            n8 += 131072;
        }
        n4 -= this.b;
        n5 -= this.c;
        if (n2 == 1 || n2 == 3) {
            n7 = n3;
            n3 = n6;
            n6 = n7;
        }
        for (n7 = n4; n7 < n4 + n3; ++n7) {
            if (n7 < 0 || n7 >= this.d) continue;
            for (int i2 = n5; i2 < n5 + n6; ++i2) {
                if (i2 < 0 || i2 >= this.e) continue;
                this.b(n8, n7, i2);
            }
        }
    }

    private void b(int n2, int n3, int n4) {
        int[] nArray = this.a[n3];
        int n5 = n4;
        nArray[n5] = nArray[n5] & 0xFFFFFF - n2;
    }

    public void b(int n2, int n3) {
        int[] nArray = this.a[n3 -= this.b];
        int n4 = n2 -= this.c;
        nArray[n4] = nArray[n4] & 0xDFFFFF;
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n3 == n2 && n4 == n7) {
            return true;
        }
        n3 -= this.b;
        n4 -= this.c;
        n2 -= this.b;
        n7 -= this.c;
        if (n6 == 0) {
            if (n5 == 0) {
                if (n3 == n2 - 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1 && (this.a[n3][n4] & 0x1280120) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1 && (this.a[n3][n4] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n5 == 1) {
                if (n3 == n2 && n4 == n7 + 1) {
                    return true;
                }
                if (n3 == n2 - 1 && n4 == n7 && (this.a[n3][n4] & 0x1280108) == 0) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7 && (this.a[n3][n4] & 0x1280180) == 0) {
                    return true;
                }
            } else if (n5 == 2) {
                if (n3 == n2 + 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1 && (this.a[n3][n4] & 0x1280120) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1 && (this.a[n3][n4] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n5 == 3) {
                if (n3 == n2 && n4 == n7 - 1) {
                    return true;
                }
                if (n3 == n2 - 1 && n4 == n7 && (this.a[n3][n4] & 0x1280108) == 0) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7 && (this.a[n3][n4] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (n6 == 2) {
            if (n5 == 0) {
                if (n3 == n2 - 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7 && (this.a[n3][n4] & 0x1280180) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1 && (this.a[n3][n4] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n5 == 1) {
                if (n3 == n2 - 1 && n4 == n7 && (this.a[n3][n4] & 0x1280108) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1 && (this.a[n3][n4] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n5 == 2) {
                if (n3 == n2 - 1 && n4 == n7 && (this.a[n3][n4] & 0x1280108) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1 && (this.a[n3][n4] & 0x1280120) == 0) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1) {
                    return true;
                }
            } else if (n5 == 3) {
                if (n3 == n2 - 1 && n4 == n7) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 + 1 && (this.a[n3][n4] & 0x1280120) == 0) {
                    return true;
                }
                if (n3 == n2 + 1 && n4 == n7 && (this.a[n3][n4] & 0x1280180) == 0) {
                    return true;
                }
                if (n3 == n2 && n4 == n7 - 1) {
                    return true;
                }
            }
        }
        if (n6 == 9) {
            if (n3 == n2 && n4 == n7 + 1 && (this.a[n3][n4] & 0x20) == 0) {
                return true;
            }
            if (n3 == n2 && n4 == n7 - 1 && (this.a[n3][n4] & 2) == 0) {
                return true;
            }
            if (n3 == n2 - 1 && n4 == n7 && (this.a[n3][n4] & 8) == 0) {
                return true;
            }
            if (n3 == n2 + 1 && n4 == n7 && (this.a[n3][n4] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n7 == n2 && n4 == n3) {
            return true;
        }
        n7 -= this.b;
        n4 -= this.c;
        n2 -= this.b;
        n3 -= this.c;
        if (n5 == 6 || n5 == 7) {
            if (n5 == 7) {
                n6 = n6 + 2 & 3;
            }
            if (n6 == 0) {
                if (n7 == n2 + 1 && n4 == n3 && (this.a[n7][n4] & 0x80) == 0) {
                    return true;
                }
                if (n7 == n2 && n4 == n3 - 1 && (this.a[n7][n4] & 2) == 0) {
                    return true;
                }
            } else if (n6 == 1) {
                if (n7 == n2 - 1 && n4 == n3 && (this.a[n7][n4] & 8) == 0) {
                    return true;
                }
                if (n7 == n2 && n4 == n3 - 1 && (this.a[n7][n4] & 2) == 0) {
                    return true;
                }
            } else if (n6 == 2) {
                if (n7 == n2 - 1 && n4 == n3 && (this.a[n7][n4] & 8) == 0) {
                    return true;
                }
                if (n7 == n2 && n4 == n3 + 1 && (this.a[n7][n4] & 0x20) == 0) {
                    return true;
                }
            } else if (n6 == 3) {
                if (n7 == n2 + 1 && n4 == n3 && (this.a[n7][n4] & 0x80) == 0) {
                    return true;
                }
                if (n7 == n2 && n4 == n3 + 1 && (this.a[n7][n4] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (n5 == 8) {
            if (n7 == n2 && n4 == n3 + 1 && (this.a[n7][n4] & 0x20) == 0) {
                return true;
            }
            if (n7 == n2 && n4 == n3 - 1 && (this.a[n7][n4] & 2) == 0) {
                return true;
            }
            if (n7 == n2 - 1 && n4 == n3 && (this.a[n7][n4] & 8) == 0) {
                return true;
            }
            if (n7 == n2 + 1 && n4 == n3 && (this.a[n7][n4] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n3 + n7 - 1;
        int n10 = n2 + n5 - 1;
        if (n4 >= n3 && n4 <= n9 && n8 >= n2 && n8 <= n10) {
            return true;
        }
        return n4 == n3 - 1 && n8 >= n2 && n8 <= n10 && (this.a[n4 - this.b][n8 - this.c] & 8) == 0 && (n6 & 8) == 0 || n4 == n9 + 1 && n8 >= n2 && n8 <= n10 && (this.a[n4 - this.b][n8 - this.c] & 0x80) == 0 && (n6 & 2) == 0 || n8 == n2 - 1 && n4 >= n3 && n4 <= n9 && (this.a[n4 - this.b][n8 - this.c] & 2) == 0 && (n6 & 4) == 0 || n8 == n10 + 1 && n4 >= n3 && n4 <= n9 && (this.a[n4 - this.b][n8 - this.c] & 0x20) == 0 && (n6 & 1) == 0;
    }
}

