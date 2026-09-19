/*
 * Decompiled with CFR 0.152.
 */
package rs.s;

import java.awt.Color;
import rs.e.a;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.n;
import rs.e.o;
import rs.e.p;
import rs.e.q;
import rs.gui.u;
import rs.gui.v;
import rs.k.j;
import rs.s.b.l;
import rs.s.n.c;
import rs.ui.components.d;

@e(a="runelite")
public interface h
extends b {
    public static final String a = "runelite";
    @rs.e.l(a="Window Settings", b="Settings relating to the client's window and frame", c=0)
    public static final String b = "windowSettings";
    @rs.e.l(a="Notification Settings", b="Settings relating to notifications", c=1)
    public static final String c = "notificationSettings";
    @rs.e.l(a="Overlay Settings", b="Settings relating to fonts", c=2)
    public static final String d = "overlaySettings";

    @g(b="automaticResizeType", c="Resize type", d="Choose how the window should resize when opening and closing panels", a=11, h="windowSettings")
    default public v a() {
        return v.b;
    }

    @g(b="lockWindowSize", c="Lock window size", d="Determines if the window resizing is allowed or not", a=12, h="windowSettings")
    default public boolean b() {
        return false;
    }

    @g(b="containInScreen2", c="Contain in screen", d="Makes the client move itself to stay within the screen when resizing..<br>Note: 'Always' only works on Windows and if custom chrome is enabled.", a=13, h="windowSettings")
    default public u.a c() {
        return u.a.b;
    }

    @g(b="rememberScreenBounds", c="Remember client position", d="Save the position and size of the client after exiting", a=14, h="windowSettings")
    default public boolean d() {
        return true;
    }

    @g(b="uiEnableCustomChrome", c="Enable custom window chrome", d="Use RuneLite's custom window title and borders.", f="Please restart your client after changing this setting", a=15, h="windowSettings")
    default public boolean e() {
        return j.a() == j.a;
    }

    @o(a=10, b=100)
    @g(b="uiWindowOpacity", c="Window opacity", d="Set the windows opacity.", a=16, h="windowSettings")
    default public int f() {
        return 100;
    }

    @g(b="gameAlwaysOnTop", c="Always on top", d="The game will always be on the top of the screen", a=17, h="windowSettings")
    default public boolean g() {
        return false;
    }

    @g(b="usernameInTitle", c="Show display name in title", d="Toggles displaying of local player's display name in client title", a=19, h="windowSettings")
    default public boolean h() {
        return true;
    }

    @g(b="trayIcon", c="Enable tray icon", d="Enables icon in system tray", f="Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.", a=20, h="notificationSettings")
    default public boolean i() {
        return true;
    }

    @g(b="notificationTray", c="Enable tray notifications", d="Enables tray notifications", a=21, h="notificationSettings")
    default public boolean j() {
        return true;
    }

    @g(b="notificationRequestFocus", c="Request focus", d="Configures the window focus request type on notification", a=22, h="notificationSettings")
    default public p k() {
        return p.a;
    }

    @g(b="notificationSound", c="Notification sound", d="Enables the playing of a beep sound when notifications are displayed", a=23, h="notificationSettings")
    default public c.a l() {
        return c.a.a;
    }

    @o(a=0, b=100)
    @g(b="notificationVolume", c="Notification volume", d="Configures the volume of custom notifications (does not control native volume).", a=24, h="notificationSettings")
    @q(a="%")
    default public int m() {
        return 100;
    }

    @g(b="notificationTimeout", c="Notification timeout", d="How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)", a=25, h="notificationSettings")
    @q(a="ms")
    default public int n() {
        return 10000;
    }

    @g(b="notificationGameMessage", c="Game message notifications", d="Adds a notification message to the chatbox", a=26, h="notificationSettings")
    default public boolean o() {
        return false;
    }

    @g(b="flashNotification", c="Flash", d="Flashes the game frame as a notification", a=27, h="notificationSettings")
    default public n p() {
        return n.a;
    }

    @g(b="notificationFocused", c="Send notifications when focused", d="Toggles all notifications for when the client is focused", a=28, h="notificationSettings")
    default public boolean q() {
        return false;
    }

    @a
    @g(b="notificationFlashColor", c="Notification Flash", d="Sets the color of the notification flashes.", a=29, h="notificationSettings")
    default public Color r() {
        return new Color(255, 0, 0, 70);
    }

    @a
    @g(b="overlayBackgroundColor", c="Overlay Color", d="Configures the background color of infoboxes and overlays", a=44, h="overlaySettings")
    default public Color s() {
        return rs.ui.components.d.c;
    }

    @g(b="sidebarToggleKey", c="Sidebar Toggle Key", d="The key that will toggle the sidebar (accepts modifiers)", a=45, h="windowSettings")
    default public l t() {
        return new l(122, 128);
    }

    @g(b="panelToggleKey", c="Plugin Panel Toggle Key", d="The key that will toggle the current or last opened plugin panel (accepts modifiers)", a=46, h="windowSettings")
    default public l u() {
        return new l(123, 128);
    }

    @g(b="blockExtraMouseButtons", c="Block extra mouse buttons", d="Blocks extra mouse buttons (4 and above)", a=50)
    default public boolean v() {
        return true;
    }

    @g(b="useWikiItemPrices", c="Use actively traded price", d="Use actively traded prices, sourced from the RuneScape wiki, for item prices", a=51)
    default public boolean w() {
        return true;
    }

    @g(b="dragHotkey", c="Drag Hotkey", d="Configures the hotkey used to drag UI elements around", a=52)
    default public l x() {
        return l.c;
    }
}

