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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class l<T extends Shape>
implements Shape {
    private final List<T> a;

    public l(T ... TArray) {
        this(Arrays.asList(TArray));
    }

    @Override
    public Rectangle getBounds() {
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        int n5 = Integer.MIN_VALUE;
        for (Shape shape : this.a) {
            Rectangle rectangle = shape.getBounds();
            n2 = Math.min(rectangle.x, n2);
            n3 = Math.min(rectangle.y, n3);
            n4 = Math.max(rectangle.x + rectangle.width, n4);
            n5 = Math.max(rectangle.y + rectangle.height, n5);
        }
        return new Rectangle(n2, n3, n4 - n2, n5 - n3);
    }

    @Override
    public Rectangle2D getBounds2D() {
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MIN_VALUE;
        double d5 = Double.MIN_VALUE;
        for (Shape shape : this.a) {
            Rectangle2D rectangle2D = shape.getBounds2D();
            d2 = Math.min(rectangle2D.getX(), d2);
            d3 = Math.min(rectangle2D.getY(), d3);
            d4 = Math.max(rectangle2D.getMaxX(), d4);
            d5 = Math.max(rectangle2D.getMaxY(), d5);
        }
        return new Rectangle2D.Double(d2, d3, d4 - d2, d5 - d3);
    }

    @Override
    public boolean contains(double d2, double d3) {
        return this.a.stream().anyMatch(shape -> shape.contains(d2, d3));
    }

    @Override
    public boolean contains(Point2D point2D) {
        return this.a.stream().anyMatch(shape -> shape.contains(point2D));
    }

    @Override
    public boolean intersects(double d2, double d3, double d4, double d5) {
        return this.a.stream().anyMatch(shape -> shape.intersects(d2, d3, d4, d5));
    }

    @Override
    public boolean intersects(Rectangle2D rectangle2D) {
        return this.a.stream().anyMatch(shape -> shape.intersects(rectangle2D));
    }

    @Override
    public boolean contains(double d2, double d3, double d4, double d5) {
        return this.a.stream().anyMatch(shape -> shape.contains(d2, d3, d4, d5));
    }

    @Override
    public boolean contains(Rectangle2D rectangle2D) {
        return this.a.stream().anyMatch(shape -> shape.contains(rectangle2D));
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform) {
        return new a(this.a.stream().map(shape -> shape.getPathIterator(affineTransform)).iterator());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform, double d2) {
        return new a(this.a.stream().map(shape -> shape.getPathIterator(affineTransform, d2)).iterator());
    }

    public l(List<T> list) {
        this.a = list;
    }

    public List<T> a() {
        return this.a;
    }

    private static class a
    implements PathIterator {
        private final Iterator<PathIterator> b;
        private PathIterator c = null;
        private final int d;

        a(Iterator<PathIterator> iterator) {
            this.b = iterator;
            if (iterator.hasNext()) {
                this.c = iterator.next();
                this.d = this.c.getWindingRule();
                this.a();
            } else {
                this.d = 0;
            }
        }

        @Override
        public int getWindingRule() {
            return this.d;
        }

        @Override
        public boolean isDone() {
            return this.c == null;
        }

        @Override
        public void next() {
            this.c.next();
            this.a();
        }

        private void a() {
            while (this.c != null && this.c.isDone()) {
                if (this.b.hasNext()) {
                    this.c = this.b.next();
                    assert (this.d == this.c.getWindingRule());
                    continue;
                }
                this.c = null;
            }
        }

        @Override
        public int currentSegment(float[] fArray) {
            return this.c.currentSegment(fArray);
        }

        @Override
        public int currentSegment(double[] dArray) {
            return this.c.currentSegment(dArray);
        }
    }
}

