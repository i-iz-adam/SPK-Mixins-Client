/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.a.d
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.gui;

import com.google.a.a.d;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.gui.v;
import rs.k.j;

public class u
extends JFrame {
    private static final Logger b = LoggerFactory.getLogger(u.class);
    private static final int c = 40;
    private static boolean d;
    private static boolean e;
    private v f = v.b;
    private a g;
    private boolean h;

    @d
    static boolean a(String string) {
        if (u.a(string, 15, -1, -1)) {
            return true;
        }
        if (u.a(string, 14, -1, -1)) {
            return false;
        }
        if (u.a(string, 13, 0, 4)) {
            return true;
        }
        if (u.a(string, 12, -1, -1)) {
            return false;
        }
        return u.a(string, 11, 0, 8);
    }

    @d
    static boolean b(String string) {
        if (u.a(string, 15, -1, -1)) {
            return true;
        }
        if (u.a(string, 14, -1, -1)) {
            return false;
        }
        if (u.a(string, 13, 0, 7)) {
            return true;
        }
        if (u.a(string, 12, -1, -1)) {
            return false;
        }
        return u.a(string, 11, 0, 9);
    }

    private static boolean a(String string, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        String[] stringArray;
        int n8 = string.indexOf(95);
        if (n8 != -1) {
            string = string.substring(0, n8);
        }
        if ((stringArray = string.split("\\.")).length >= 3) {
            n7 = Integer.parseInt(stringArray[0]);
            n6 = Integer.parseInt(stringArray[1]);
            n5 = Integer.parseInt(stringArray[2]);
        } else {
            n7 = Integer.parseInt(stringArray[0]);
            n6 = -1;
            n5 = -1;
        }
        int n9 = Integer.compare(n7, n2);
        if (n9 != 0) {
            return n9 > 0;
        }
        n9 = Integer.compare(n6, n3);
        if (n9 != 0) {
            return n9 > 0;
        }
        n9 = Integer.compare(n5, n4);
        if (n9 != 0) {
            return n9 > 0;
        }
        return true;
    }

    public void a(a a2) {
        this.g = a2;
        if (this.g == rs.gui.u$a.a) {
            this.setLocation(this.getX(), this.getY());
            this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        }
    }

    @Override
    public void setLocation(int n2, int n3) {
        if (this.g == rs.gui.u$a.a) {
            Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
            n2 = Math.max(n2, (int)rectangle.getX());
            n2 = Math.min(n2, (int)(rectangle.getX() + rectangle.getWidth() - (double)this.getWidth()));
            n3 = Math.max(n3, (int)rectangle.getY());
            n3 = Math.min(n3, (int)(rectangle.getY() + rectangle.getHeight() - (double)this.getHeight()));
        }
        super.setLocation(n2, n3);
    }

    @Override
    public void setBounds(int n2, int n3, int n4, int n5) {
        if (this.g == rs.gui.u$a.a) {
            Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
            n4 = Math.min(n4, n4 - (int)rectangle.getX() + n2);
            n2 = Math.max(n2, (int)rectangle.getX());
            n5 = Math.min(n5, n5 - (int)rectangle.getY() + n3);
            n3 = Math.max(n3, (int)rectangle.getY());
            n4 = Math.min(n4, (int)(rectangle.getX() + rectangle.getWidth()) - n2);
            n5 = Math.min(n5, (int)(rectangle.getY() + rectangle.getHeight()) - n3);
        }
        super.setBounds(n2, n3, n4, n5);
    }

    public void a(int n2) {
        int n3;
        int n4;
        if (this.d()) {
            return;
        }
        int n5 = n2;
        boolean bl = false;
        if (this.f == v.a && (n4 = this.getLayout().minimumLayoutSize((Container)this).width) > (n3 = this.getWidth())) {
            bl = true;
            n5 = n4 - n3;
        }
        if (bl || this.f == v.b) {
            n4 = this.getWidth() + n5;
            n3 = this.getX();
            if (this.g != rs.gui.u$a.c) {
                boolean bl2;
                Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
                boolean bl3 = bl2 = (double)(this.getX() + n4) > rectangle.getX() + rectangle.getWidth();
                if (bl2) {
                    if (!this.f() || this.e()) {
                        n3 = (int)(rectangle.getX() + rectangle.getWidth()) - this.getWidth();
                    }
                    n3 -= n5;
                    this.h = true;
                }
            }
            this.setBounds(n3, this.getY(), n4, this.getHeight());
        }
        this.a();
    }

    public void b(int n2) {
        if (this.d()) {
            return;
        }
        this.a();
        Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
        boolean bl = Math.abs((double)this.getX() - rectangle.getX()) <= 40.0;
        int n3 = this.getX();
        int n4 = this.getWidth() - n2;
        if (this.f() && (this.h || !bl)) {
            n3 += n2;
        }
        if (this.f == v.a && n4 > this.getMinimumSize().width) {
            n4 = this.getWidth();
            n3 = this.getX();
        }
        this.setBounds(n3, this.getY(), n4, this.getHeight());
        this.h = false;
    }

    @Override
    public void setMaximizedBounds(Rectangle rectangle) {
        if (j.a() == j.b) {
            super.setMaximizedBounds(rectangle);
        } else {
            super.setMaximizedBounds(this.c());
        }
    }

    private GraphicsConfiguration b() {
        return Arrays.stream(GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()).map(GraphicsDevice::getDefaultConfiguration).max(Comparator.comparingInt(graphicsConfiguration -> {
            Rectangle rectangle = graphicsConfiguration.getBounds().intersection(this.getBounds());
            return rectangle.width * rectangle.height;
        })).orElseGet(this::getGraphicsConfiguration);
    }

    private Rectangle c() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        b.trace("Current bounds: {}", (Object)this.getBounds());
        for (GraphicsDevice graphicsDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            b.trace("Device: {} bounds {} insets {}", new Object[]{graphicsDevice, graphicsConfiguration.getBounds(), toolkit.getScreenInsets(graphicsConfiguration)});
        }
        GraphicsConfiguration graphicsConfiguration = this.b();
        Rectangle rectangle = graphicsConfiguration.getBounds();
        b.trace("Chosen device: {} bounds {}", (Object)graphicsConfiguration, (Object)rectangle);
        if (!d) {
            rectangle = graphicsConfiguration.getDefaultTransform().createTransformedShape(rectangle).getBounds();
            b.trace("Transformed bounds {}", (Object)rectangle);
        }
        Insets insets = toolkit.getScreenInsets(graphicsConfiguration);
        if (!d) {
            rectangle.y = 0;
            rectangle.x = 0;
            assert (!e) : "scaled insets without scaled bounds";
        } else if (!e) {
            double d2 = graphicsConfiguration.getDefaultTransform().getScaleX();
            double d3 = graphicsConfiguration.getDefaultTransform().getScaleY();
            insets.top = (int)((double)insets.top / d3);
            insets.bottom = (int)((double)insets.bottom / d3);
            insets.left = (int)((double)insets.left / d2);
            insets.right = (int)((double)insets.right / d2);
        }
        rectangle.x += insets.left;
        rectangle.y += insets.top;
        rectangle.height -= insets.bottom + insets.top;
        rectangle.width -= insets.right + insets.left;
        b.trace("Final bounds: {}", (Object)rectangle);
        return rectangle;
    }

    public void a() {
        this.setMinimumSize(this.getLayout().minimumLayoutSize(this));
    }

    private boolean d() {
        return (this.getExtendedState() & 6) == 6;
    }

    private boolean e() {
        Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
        return Math.abs((double)this.getX() - rectangle.getX()) <= 40.0;
    }

    private boolean f() {
        Rectangle rectangle = this.getGraphicsConfiguration().getBounds();
        return Math.abs((double)(this.getX() + this.getWidth()) - (rectangle.getX() + rectangle.getWidth())) <= 40.0;
    }

    static {
        try {
            String string = System.getProperty("java.version");
            d = u.a(string);
            e = u.b(string);
        }
        catch (Exception exception) {
            b.error("error checking java version", (Throwable)exception);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.gui.u$a.a();
        }
    }
}

