/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import rs.runelite.a.i;
import rs.runelite.a.n;

public class m
implements Shape {
    private static final int a = 16;
    protected int[] d;
    protected int[] e;
    protected int f;
    protected int g;

    public m() {
        this(new int[32], new int[32], 16, 15);
    }

    public m(int[] nArray, int[] nArray2, int n2) {
        this(nArray, nArray2, 0, n2 - 1);
    }

    public void a(int n2, int n3) {
        --this.f;
        if (this.f < 0) {
            this.a(16);
        }
        this.d[this.f] = n2;
        this.e[this.f] = n3;
    }

    public void b() {
        ++this.f;
    }

    protected void a(int n2) {
        int[] nArray = new int[this.d.length + n2];
        System.arraycopy(this.d, 0, nArray, n2, this.d.length);
        this.d = nArray;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(this.e, 0, nArray2, n2, this.e.length);
        this.e = nArray2;
        this.f += n2;
        this.g += n2;
    }

    public void b(int n2, int n3) {
        ++this.g;
        if (this.g >= this.d.length) {
            this.b(16);
        }
        this.d[this.g] = n2;
        this.e[this.g] = n3;
    }

    public void c() {
        --this.g;
    }

    protected void b(int n2) {
        int[] nArray = new int[this.d.length + n2];
        System.arraycopy(this.d, 0, nArray, 0, this.d.length);
        this.d = nArray;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(this.e, 0, nArray2, 0, this.e.length);
        this.e = nArray2;
    }

    public int c(int n2) {
        return this.d[this.f + n2];
    }

    public int d(int n2) {
        return this.e[this.f + n2];
    }

    public int d() {
        return this.g - this.f + 1;
    }

    public List<i> e() {
        ArrayList<i> arrayList = new ArrayList<i>(this.d());
        for (int i2 = this.f; i2 <= this.g; ++i2) {
            arrayList.add(new i(this.d[i2], this.e[i2]));
        }
        return arrayList;
    }

    public void a(int[] nArray, int[] nArray2, int n2) {
        System.arraycopy(this.d, this.f, nArray, n2, this.d());
        System.arraycopy(this.e, this.f, nArray2, n2, this.d());
    }

    public void a(m m2) {
        int n2 = this.d();
        if (n2 <= 0) {
            return;
        }
        m2.b(n2);
        this.a(m2.d, m2.e, m2.g + 1);
        m2.g += n2;
    }

    public void a() {
        int n2 = this.d() / 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.f + i2;
            int n4 = this.g - i2;
            int n5 = this.d[n3];
            int n6 = this.e[n3];
            this.d[n3] = this.d[n4];
            this.e[n3] = this.e[n4];
            this.d[n4] = n5;
            this.e[n4] = n6;
        }
    }

    public void b(m m2) {
        int[] nArray = new int[this.d()];
        int[] nArray2 = new int[nArray.length];
        int n2 = m2.d[m2.g];
        int n3 = m2.e[m2.g];
        for (int i2 = m2.f; i2 <= m2.g; ++i2) {
            if (this.d() < 3) {
                return;
            }
            int n4 = this.g;
            int n5 = this.f;
            int[] nArray3 = this.d;
            int[] nArray4 = this.e;
            this.d = nArray;
            this.e = nArray2;
            this.f = 0;
            this.g = -1;
            nArray = nArray3;
            nArray2 = nArray4;
            int n6 = m2.d[i2];
            int n7 = m2.e[i2];
            int n8 = nArray[n4];
            int n9 = nArray2[n4];
            for (int i3 = n5; i3 <= n4; ++i3) {
                int n10 = nArray[i3];
                int n11 = nArray2[i3];
                int n12 = (n6 - n2) * (n9 - n3) - (n7 - n3) * (n8 - n2);
                int n13 = (n6 - n2) * (n11 - n3) - (n7 - n3) * (n10 - n2);
                if (n12 < 0 && n13 < 0) {
                    this.b(n10, n11);
                } else if (n12 >= 0 != n13 >= 0) {
                    long l2 = n2 * n7 - n3 * n6;
                    long l3 = n8 * n11 - n9 * n10;
                    long l4 = (n2 - n6) * (n9 - n11) - (n3 - n7) * (n8 - n10);
                    this.b((int)((l2 * (long)(n8 - n10) - (long)(n2 - n6) * l3) / l4), (int)((l2 * (long)(n9 - n11) - (long)(n3 - n7) * l3) / l4));
                    if (n12 >= 0) {
                        this.b(n10, n11);
                    }
                }
                n8 = n10;
                n9 = n11;
            }
            n2 = n6;
            n3 = n7;
        }
    }

    @Override
    public Rectangle getBounds() {
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MIN_VALUE;
        for (int i2 = this.f; i2 <= this.g; ++i2) {
            int n6 = this.d[i2];
            int n7 = this.e[i2];
            if (n6 < n2) {
                n2 = n6;
            }
            if (n6 > n4) {
                n4 = n6;
            }
            if (n7 < n3) {
                n3 = n7;
            }
            if (n7 <= n5) continue;
            n5 = n7;
        }
        return new Rectangle(n2, n3, n4 - n2, n5 - n3);
    }

    @Override
    public Rectangle2D getBounds2D() {
        Rectangle rectangle = this.getBounds();
        return new Rectangle2D.Float(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    @Override
    public boolean contains(double d2, double d3) {
        if (this.d() < 3) {
            return false;
        }
        return (this.a(d2, d3, false) & 1) != 0;
    }

    private int a(double d2, double d3, boolean bl) {
        int n2 = 0;
        int[] nArray = this.d;
        int[] nArray2 = this.e;
        if (bl) {
            nArray2 = this.d;
            nArray = this.e;
        }
        int n3 = nArray[this.g];
        int n4 = nArray2[this.g];
        for (int i2 = this.f; i2 <= this.g; ++i2) {
            int n5 = nArray[i2];
            int n6 = nArray2[i2];
            if (n4 != n6) {
                double d4;
                double d5 = n4;
                if (d3 <= d5 != d3 <= (d4 = (double)n6)) {
                    double d6;
                    double d7 = n3;
                    boolean bl2 = d2 < d7;
                    if (bl2 == d2 < (d6 = (double)n5)) {
                        if (!bl2) {
                            ++n2;
                        }
                    } else if ((d6 - d7) * (d3 - d5) - (d2 - d7) * (d4 - d5) > 0.0 == d5 > d4) {
                        ++n2;
                    }
                }
            }
            n3 = n5;
            n4 = n6;
        }
        return n2;
    }

    @Override
    public boolean contains(Point2D point2D) {
        return this.contains(point2D.getX(), point2D.getY());
    }

    @Override
    public boolean intersects(double d2, double d3, double d4, double d5) {
        double d6 = d2 + d4;
        double d7 = d3 + d5;
        return this.a(d2, d3, false) != this.a(d6, d3, false) || this.a(d2, d7, false) != this.a(d6, d7, false) || this.a(d2, d3, true) != this.a(d2, d7, true) || this.a(d6, d3, true) != this.a(d6, d7, true);
    }

    @Override
    public boolean intersects(Rectangle2D rectangle2D) {
        return this.intersects(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    @Override
    public boolean contains(double d2, double d3, double d4, double d5) {
        if (!this.getBounds().contains(d2, d3, d4, d5)) {
            return false;
        }
        return !this.intersects(d2, d3, d4, d5);
    }

    @Override
    public boolean contains(Rectangle2D rectangle2D) {
        return this.contains(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform) {
        if (affineTransform == null) {
            return new a(null);
        }
        return new b(affineTransform);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform, double d2) {
        return this.getPathIterator(affineTransform);
    }

    public m(int[] nArray, int[] nArray2, int n2, int n3) {
        this.d = nArray;
        this.e = nArray2;
        this.f = n2;
        this.g = n3;
    }

    public int[] f() {
        return this.d;
    }

    public int[] g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public void a(int[] nArray) {
        this.d = nArray;
    }

    public void b(int[] nArray) {
        this.e = nArray;
    }

    public void e(int n2) {
        this.f = n2;
    }

    public void f(int n2) {
        this.g = n2;
    }

    private class a
    implements PathIterator {
        private int b = -1;

        private a() {
        }

        @Override
        public int getWindingRule() {
            return 0;
        }

        @Override
        public boolean isDone() {
            return m.this.d() == 0 || this.b > m.this.g;
        }

        @Override
        public void next() {
            this.b = this.b == -1 ? m.this.f : ++this.b;
        }

        @Override
        public int currentSegment(float[] fArray) {
            if (this.b == -1) {
                fArray[0] = m.this.d[m.this.g];
                fArray[1] = m.this.e[m.this.g];
                return 0;
            }
            fArray[0] = m.this.d[this.b];
            fArray[1] = m.this.e[this.b];
            return 1;
        }

        @Override
        public int currentSegment(double[] dArray) {
            if (this.b == -1) {
                dArray[0] = m.this.d[m.this.g];
                dArray[1] = m.this.e[m.this.g];
                return 0;
            }
            dArray[0] = m.this.d[this.b];
            dArray[1] = m.this.e[this.b];
            return 1;
        }

        /* synthetic */ a(n n2) {
            this();
        }
    }

    private class b
    extends a {
        private final AffineTransform c;

        b(AffineTransform affineTransform) {
            super(null);
            this.c = affineTransform;
        }

        @Override
        public int currentSegment(float[] fArray) {
            int n2 = super.currentSegment(fArray);
            this.c.transform(fArray, 0, fArray, 0, 2);
            return n2;
        }

        @Override
        public int currentSegment(double[] dArray) {
            int n2 = super.currentSegment(dArray);
            this.c.transform(dArray, 0, dArray, 0, 2);
            return n2;
        }
    }
}

