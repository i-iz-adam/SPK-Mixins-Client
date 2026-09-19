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
import rs.gui.b.a.c_0;
import rs.gui.b.h;

/*
 * Renamed from rs.gui.b.a.B
 */
public class b_0 {
    public static JButton a(h h2) {
        ImageIcon imageIcon = null;
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/loadout.png"));
        } else {
            try {
                imageIcon = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/loadout.png")));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        JButton jButton = new JButton("Spawn Loadout", imageIcon);
        jButton.setToolTipText("Spawn this loadout in-game");
        jButton.setPreferredSize(new Dimension(165, 30));
        jButton.addActionListener(new c_0(h2));
        return jButton;
    }
}

