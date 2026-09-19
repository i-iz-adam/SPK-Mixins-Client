/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import rs.Client;
import rs.gui.b.a.b;
import rs.gui.b.h;

public class a {
    public static JButton a(h h2) {
        ImageIcon imageIcon = null;
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/clone.png"));
        } else {
            try {
                imageIcon = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/clone.png")));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        JButton jButton = new JButton("Clone", imageIcon);
        jButton.setToolTipText("<html>Take the items you're equipping in game, and<br>set them as the current active loadout.</html>");
        jButton.setPreferredSize(new Dimension(100, 30));
        jButton.addActionListener(new b(h2));
        return jButton;
    }
}

