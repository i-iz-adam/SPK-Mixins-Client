/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import rs.Client;
import rs.gui.Launcher;

public class x {
    public Image a;
    private int b;
    private int c;
    private int d;

    public x(int n2) {
        this.d = n2;
    }

    public boolean a(String object) {
        try {
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                object = "." + (String)object;
                this.a = Toolkit.getDefaultToolkit().getImage((String)object);
            } else {
                this.a = ImageIO.read(this.getClass().getResource((String)object));
            }
            return this.a != null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void a(Image image) {
        this.a = image;
    }

    public void a(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public void a(Graphics graphics) {
        if (Launcher.n() == null) {
            return;
        }
        int n2 = this.b;
        int n3 = this.c;
        Graphics2D graphics2D = (Graphics2D)graphics.create();
        graphics2D.drawImage(this.a, n2, n3, null);
    }
}

