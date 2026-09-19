/*
 * Decompiled with CFR 0.152.
 */
package rs;

final class c {
    c() {
    }

    public static int a(int n2, int n3, int n4) {
        if ((n2 &= 3) == 0) {
            return n4;
        }
        if (n2 == 1) {
            return n3;
        }
        if (n2 == 2) {
            return 7 - n4;
        }
        return 7 - n3;
    }

    public static int b(int n2, int n3, int n4) {
        if ((n3 &= 3) == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n4;
        }
        if (n3 == 2) {
            return 7 - n2;
        }
        return n4;
    }

    public static int a(int n2, int n3, int n4, int n5, int n6) {
        if ((n2 &= 3) == 0) {
            return n4;
        }
        if (n2 == 1) {
            return n5;
        }
        if (n2 == 2) {
            return 7 - n4 - (n6 - 1);
        }
        return 7 - n5 - (n3 - 1);
    }

    public static int b(int n2, int n3, int n4, int n5, int n6) {
        if ((n4 &= 3) == 0) {
            return n2;
        }
        if (n4 == 1) {
            return 7 - n6 - (n5 - 1);
        }
        if (n4 == 2) {
            return 7 - n2 - (n3 - 1);
        }
        return n6;
    }
}

