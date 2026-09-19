/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.a;

import com.google.a.b.as;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.k.j;

/*
 * Renamed from rs.A.l
 */
@Singleton
public class l_0 {
    private static final Logger a = LoggerFactory.getLogger(l_0.class);
    private static boolean b = j.a() == j.c;

    public static void a(String string) {
        new Thread(() -> {
            if (as.c((String)string)) {
                a.warn("LinkBrowser.browse() called with invalid input");
                return;
            }
            if (b && l_0.c(string)) {
                a.debug("Opened url through xdg-open to {}", (Object)string);
                return;
            }
            if (l_0.d(string)) {
                a.debug("Opened url through Desktop#browse to {}", (Object)string);
                return;
            }
            a.warn("LinkBrowser.browse() could not open {}", (Object)string);
            l_0.a("Unable to open link. Press 'OK' and the link will be copied to your clipboard.", string);
        }).start();
    }

    public static void b(String string) {
        new Thread(() -> {
            if (as.c((String)string)) {
                a.warn("LinkBrowser.open() called with invalid input");
                return;
            }
            if (b && l_0.c(string)) {
                a.debug("Opened directory through xdg-open to {}", (Object)string);
                return;
            }
            if (l_0.e(string)) {
                a.debug("Opened directory through Desktop#open to {}", (Object)string);
                return;
            }
            a.warn("LinkBrowser.open() could not open {}", (Object)string);
            l_0.a("Unable to open folder. Press 'OK' and the folder directory will be copied to your clipboard.", string);
        }).start();
    }

    private static boolean c(String string) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"xdg-open", string});
            process.waitFor();
            int n2 = process.exitValue();
            if (n2 == 0) {
                return true;
            }
            a.warn("xdg-open {} returned with error code {}", (Object)string, (Object)n2);
            return false;
        }
        catch (IOException iOException) {
            b = false;
            return false;
        }
        catch (InterruptedException interruptedException) {
            a.warn("Interrupted while waiting for xdg-open {} to execute", (Object)string);
            return false;
        }
    }

    private static boolean d(String string) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return false;
        }
        try {
            desktop.browse(new URI(string));
            return true;
        }
        catch (IOException | URISyntaxException exception) {
            a.warn("Failed to open Desktop#browse {}", (Object)string, (Object)exception);
            return false;
        }
    }

    private static boolean e(String string) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.OPEN)) {
            return false;
        }
        try {
            desktop.open(new File(string));
            return true;
        }
        catch (IOException iOException) {
            a.warn("Failed to open Desktop#open {}", (Object)string, (Object)iOException);
            return false;
        }
    }

    private static void a(String string, String string2) {
        SwingUtilities.invokeLater(() -> {
            int n2 = JOptionPane.showConfirmDialog(null, string, "Message", 2);
            if (n2 == 0) {
                StringSelection stringSelection = new StringSelection(string2);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
        });
    }
}

