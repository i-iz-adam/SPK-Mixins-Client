/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.gui;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import java.util.function.BiConsumer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.PopupFactory;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.a.j_0;
import rs.gui.d;
import rs.gui.n_0;
import rs.k.j;
import rs.ui.l;

/*
 * Renamed from rs.gui.M
 */
public class m_0 {
    private static final Logger a = LoggerFactory.getLogger(m_0.class);

    public static void a() {
        ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        ToolTipManager.sharedInstance().setInitialDelay(300);
        UIManager.put("TabbedPane.selected", d.c);
        UIManager.put("TabbedPane.highlight", d.c);
        UIManager.put("TabbedPane.contentAreaColor", d.c);
        UIManager.put("TabbedPane.borderHightlightColor", d.c);
        UIManager.put("TabbedPane.darkShadow", d.c);
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("Panel.background", d.d);
        UIManager.put("TextField.selectionBackground", d.b);
        UIManager.put("TextField.selectionForeground", Color.WHITE);
        UIManager.put("FormattedTextField.selectionBackground", d.b);
        UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
        UIManager.put("TextArea.selectionBackground", d.b);
        UIManager.put("TextArea.selectionForeground", Color.WHITE);
        System.setProperty("jgoodies.popupDropShadowEnabled", "false");
        System.setProperty("sun.awt.noerasebackground", "true");
    }

    public static void a(@Nonnull LookAndFeel lookAndFeel) {
        try {
            UIManager.setLookAndFeel(lookAndFeel);
            if (j.a() == j.b) {
                PopupFactory.setSharedInstance(new rs.a.m_0());
            }
        }
        catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
            a.warn("Unable to set look and feel", (Throwable)unsupportedLookAndFeelException);
        }
    }

    public static void a(Font font) {
        FontUIResource fontUIResource = new FontUIResource(font);
        Enumeration enumeration = UIManager.getDefaults().keys();
        while (enumeration.hasMoreElements()) {
            Object k2 = enumeration.nextElement();
            Object object = UIManager.get(k2);
            if (!(object instanceof FontUIResource)) continue;
            UIManager.put(k2, fontUIResource);
        }
    }

    public static void a(AbstractButton abstractButton) {
        abstractButton.setBorderPainted(false);
        abstractButton.setContentAreaFilled(false);
        abstractButton.setFocusPainted(false);
        abstractButton.setMargin(new Insets(0, 0, 0, 0));
        abstractButton.setOpaque(false);
    }

    public static JButton a(@Nonnull l l2, int n2, @Nullable BiConsumer<l, JButton> biConsumer) {
        BufferedImage bufferedImage = n2 > 0 ? j_0.a(l2.b(), n2, n2) : l2.b();
        JButton jButton = new JButton();
        jButton.setSize(bufferedImage.getWidth(), bufferedImage.getHeight());
        jButton.setToolTipText(l2.d());
        jButton.setIcon(new ImageIcon(bufferedImage));
        jButton.putClientProperty("substancelaf.internal.FlatLook", Boolean.TRUE);
        jButton.setFocusable(false);
        jButton.addActionListener(actionEvent -> {
            if (biConsumer != null) {
                biConsumer.accept(l2, jButton);
            }
            if (l2.f() != null) {
                l2.f().run();
            }
        });
        if (l2.j() != null) {
            JPopupMenu jPopupMenu = new JPopupMenu();
            l2.j().forEach((string, runnable) -> {
                JMenuItem jMenuItem = new JMenuItem((String)string);
                jMenuItem.addActionListener(actionEvent -> runnable.run());
                jPopupMenu.add(jMenuItem);
            });
            jButton.setComponentPopupMenu(jPopupMenu);
        }
        l2.b(jButton::doClick);
        return jButton;
    }

    public static void a(AbstractButton abstractButton, String string, String string2) {
        abstractButton.setToolTipText(abstractButton.isSelected() ? string : string2);
        abstractButton.addItemListener(itemEvent -> abstractButton.setToolTipText(abstractButton.isSelected() ? string : string2));
    }

    @Nullable
    public static TrayIcon a(@Nonnull Image image, @Nonnull String string, @Nonnull Frame frame) {
        if (!SystemTray.isSupported()) {
            return null;
        }
        SystemTray systemTray = SystemTray.getSystemTray();
        TrayIcon trayIcon = new TrayIcon(image, string);
        trayIcon.setImageAutoSize(true);
        try {
            systemTray.add(trayIcon);
        }
        catch (AWTException aWTException) {
            a.debug("Unable to add system tray icon", (Throwable)aWTException);
            return trayIcon;
        }
        trayIcon.addMouseListener(new n_0(frame));
        return trayIcon;
    }
}

