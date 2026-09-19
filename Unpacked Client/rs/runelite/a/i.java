/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

public class i {
    private final int a;
    private final int b;

    public i(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public String toString() {
        return "Point{x=" + this.a + ", y=" + this.b + "}";
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int a(i i2) {
        return (int)Math.hypot(this.a() - i2.a(), this.b() - i2.b());
    }

    public int hashCode() {
        int n2 = 3;
        n2 = 23 * n2 + this.a;
        n2 = 23 * n2 + this.b;
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        i i2 = (i)object;
        if (this.a != i2.a) {
            return false;
        }
        return this.b == i2.b;
    }
}

