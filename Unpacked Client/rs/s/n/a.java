/*
 * Decompiled with CFR 0.152.
 */
package rs.s.n;

import java.awt.Color;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.e.n;
import rs.e.p;
import rs.e.q;
import rs.s.n.c;

@e(a="notifications")
public interface a
extends b {
    public static final String a = "notifications";
    @l(a="Alerts", b="Configure things that alert notifications", c=0)
    public static final String b = "alertSection";
    @l(a="Settings", b="The general settings for all notification alerts", c=1)
    public static final String c = "notifSection";

    @g(a=0, b="alertAggroTimer", c="De-aggro timer", d="Notify / alert the client when you reach the de-aggro timer", h="alertSection")
    default public boolean a() {
        return true;
    }

    @g(a=1, b="alertSuperior", c="Superior slayer / bosses", d="Alert the client when a superior boss or slayer mosnter appears for you", h="alertSection")
    default public boolean b() {
        return true;
    }

    @g(a=2, b="alertPrivateMessages", c="Private messages", d="Alert the client when someone sends a private message", h="alertSection")
    default public boolean c() {
        return false;
    }

    @g(b="trayIcon", c="Enable tray icon", d="Enables icon in system tray", f="Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.", a=20, h="notifSection")
    default public boolean d() {
        return true;
    }

    @g(b="notificationTray", c="Enable tray notifications", d="Enables tray notifications", a=21, h="notifSection")
    default public boolean e() {
        return true;
    }

    @g(b="notificationRequestFocus", c="Request focus", d="Configures the window focus request type on notification", a=22, h="notifSection")
    default public p f() {
        return p.a;
    }

    @g(b="notificationSound", c="Notification sound", d="Enables the playing of a beep sound when notifications are displayed", a=23, h="notifSection")
    default public c.a g() {
        return c.a.a;
    }

    @g(b="notificationTimeout", c="Notification timeout", d="How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)", a=24, h="notifSection")
    @q(a="ms")
    default public int h() {
        return 10000;
    }

    @g(b="flashNotification", c="Flash", d="Flashes the game frame as a notification", a=26, h="notifSection")
    default public n i() {
        return n.a;
    }

    @g(b="notificationFocused", c="Send notifications when focused", d="Toggles all notifications for when the client is focused", a=27, h="notifSection")
    default public boolean j() {
        return false;
    }

    @rs.e.a
    @g(b="notificationFlashColor", c="Notification Flash", d="Sets the color of the notification flashes.", a=28, h="notifSection")
    default public Color k() {
        return new Color(255, 0, 0, 70);
    }
}

