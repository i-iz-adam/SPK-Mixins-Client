/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.a;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.GrayFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from rs.A.j
 */
public class j_0 {
    private static final Logger a = LoggerFactory.getLogger(j_0.class);

    @Deprecated
    public static BufferedImage a(Class<?> clazz, String string) {
        return j_0.b(clazz, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static BufferedImage b(Class<?> clazz, String string) {
        try (InputStream inputStream = clazz.getResourceAsStream(string);){
            Class<ImageIO> clazz2 = ImageIO.class;
            synchronized (ImageIO.class) {
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                // ** MonitorExit[var3_5] (shouldn't be in output)
                return bufferedImage;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Object object = string.startsWith("/") ? string : clazz.getPackage().getName().replace('.', '/') + "/" + string;
            a.warn("Failed to load image from class: {}, path: {}", (Object)clazz.getName(), object);
            throw new IllegalArgumentException(string, illegalArgumentException);
        }
        catch (IOException iOException) {
            throw new RuntimeException(string, iOException);
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage, boolean bl, boolean bl2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = new BufferedImage(n4, n5, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        if (bl) {
            n2 = n4;
            n4 *= -1;
        }
        if (bl2) {
            n3 = n5;
            n5 *= -1;
        }
        graphics2D.drawImage(bufferedImage, n2, n3, n4, n5, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n2, int n3) {
        return j_0.a(bufferedImage, n2, n3, false);
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n2, int n3, boolean bl) {
        Image image = bl ? (bufferedImage.getWidth() > bufferedImage.getHeight() ? bufferedImage.getScaledInstance(n2, -1, 4) : bufferedImage.getScaledInstance(-1, n3, 4)) : bufferedImage.getScaledInstance(n2, n3, 4);
        return j_0.a(image);
    }

    public static BufferedImage a(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage)image;
        }
        return j_0.b(image);
    }

    public static BufferedImage b(Image image) {
        if (image instanceof BufferedImage && ((BufferedImage)image).getType() == 2) {
            return (BufferedImage)image;
        }
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static BufferedImage a(Image image, int n2) {
        BufferedImage bufferedImage = j_0.b(image);
        float f2 = n2;
        int n3 = bufferedImage.getColorModel().getNumComponents();
        float[] fArray = new float[n3];
        float[] fArray2 = new float[n3];
        Arrays.fill(fArray, 1.0f);
        Arrays.fill(fArray2, 0.0f);
        fArray2[n3 - 1] = f2;
        return j_0.a(bufferedImage, fArray, fArray2);
    }

    public static BufferedImage a(Image image, float f2) {
        BufferedImage bufferedImage = j_0.b(image);
        int n2 = bufferedImage.getColorModel().getNumComponents();
        float[] fArray = new float[n2];
        float[] fArray2 = new float[n2];
        Arrays.fill(fArray, 1.0f);
        Arrays.fill(fArray2, 0.0f);
        fArray[n2 - 1] = f2;
        return j_0.a(bufferedImage, fArray, fArray2);
    }

    public static BufferedImage a(BufferedImage bufferedImage) {
        Image image = GrayFilter.createDisabledImage(bufferedImage);
        return j_0.a(image);
    }

    public static BufferedImage b(Image image, int n2) {
        BufferedImage bufferedImage = j_0.b(image);
        float f2 = n2;
        int n3 = bufferedImage.getColorModel().getNumComponents();
        float[] fArray = new float[n3];
        float[] fArray2 = new float[n3];
        Arrays.fill(fArray, 1.0f);
        for (int i2 = 0; i2 < n3; ++i2) {
            fArray2[i2] = f2;
        }
        fArray2[n3 - 1] = 0.0f;
        return j_0.a(bufferedImage, fArray, fArray2);
    }

    public static BufferedImage b(Image image, float f2) {
        BufferedImage bufferedImage = j_0.b(image);
        int n2 = bufferedImage.getColorModel().getNumComponents();
        float[] fArray = new float[n2];
        float[] fArray2 = new float[n2];
        Arrays.fill(fArray2, 0.0f);
        for (int i2 = 0; i2 < n2; ++i2) {
            fArray[i2] = f2;
        }
        fArray[n2 - 1] = 1.0f;
        return j_0.a(bufferedImage, fArray, fArray2);
    }

    private static BufferedImage a(BufferedImage bufferedImage, float[] fArray, float[] fArray2) {
        return new RescaleOp(fArray, fArray2, null).filter(bufferedImage, null);
    }

    public static BufferedImage a(BufferedImage bufferedImage, double d2) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.rotate(d2, (double)bufferedImage.getWidth() / 2.0, (double)bufferedImage.getHeight() / 2.0);
        AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, 2);
        return affineTransformOp.filter(bufferedImage, null);
    }

    static {
        ImageIO.setUseCache(false);
    }
}

