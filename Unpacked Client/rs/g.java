/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class g {
    private static final String a = "./tests/";

    public static void a(String string) {
        System.out.println(string);
    }

    public static void a(String string, int n2, int n3, byte[] byArray) {
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 1);
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                bufferedImage.setRGB(i2, i3, byArray[i2 + i3 * n2]);
            }
        }
        File file = new File(a + string + ".png");
        try {
            g.a("Dumped image to: " + file.getAbsolutePath());
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void a(String string, int n2, int n3, int[] nArray) {
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 1);
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                bufferedImage.setRGB(i2, i3, nArray[i2 + i3 * n2]);
            }
        }
        File file = new File(a + string + ".png");
        try {
            g.a("Dumped image to: " + file.getAbsolutePath());
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

