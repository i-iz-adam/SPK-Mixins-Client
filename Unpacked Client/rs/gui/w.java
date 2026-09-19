/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.text.StyleContext;

public class w {
    private static final Font a;
    private static final Font b;
    private static final Font c;
    private static final Font d;
    private static final Font e;

    public static Font a() {
        return a;
    }

    public static Font b() {
        return b;
    }

    public static Font c() {
        return c;
    }

    public static Font d() {
        return d;
    }

    public static Font e() {
        return e;
    }

    static {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            Font font = Font.createFont(0, w.class.getResourceAsStream("runescape.ttf")).deriveFont(0, 16.0f);
            graphicsEnvironment.registerFont(font);
            a = StyleContext.getDefaultStyleContext().getFont(font.getName(), 0, 16);
            graphicsEnvironment.registerFont(a);
            Font font2 = Font.createFont(0, w.class.getResourceAsStream("runescape_small.ttf")).deriveFont(0, 16.0f);
            graphicsEnvironment.registerFont(font2);
            b = StyleContext.getDefaultStyleContext().getFont(font2.getName(), 0, 16);
            graphicsEnvironment.registerFont(b);
            Font font3 = Font.createFont(0, w.class.getResourceAsStream("runescape_bold.ttf")).deriveFont(0, 16.0f);
            graphicsEnvironment.registerFont(font3);
            c = StyleContext.getDefaultStyleContext().getFont(font3.getName(), 0, 16);
            graphicsEnvironment.registerFont(c);
            d = new Font("Dialog", 0, 16);
            e = new Font("Dialog", 1, 16);
        }
        catch (FontFormatException fontFormatException) {
            throw new RuntimeException("Font loaded, but format incorrect.", fontFormatException);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Font file not found.", iOException);
        }
    }
}

