/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import java.awt.TrayIcon;

public final class NotificationFired {
    private final String message;
    private final TrayIcon.MessageType type;

    public NotificationFired(String string, TrayIcon.MessageType messageType) {
        this.message = string;
        this.type = messageType;
    }

    public String getMessage() {
        return this.message;
    }

    public TrayIcon.MessageType getType() {
        return this.type;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof NotificationFired)) {
            return false;
        }
        NotificationFired notificationFired = (NotificationFired)object;
        String string = this.getMessage();
        String string2 = notificationFired.getMessage();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        TrayIcon.MessageType messageType = this.getType();
        TrayIcon.MessageType messageType2 = notificationFired.getType();
        return !(messageType == null ? messageType2 != null : !((Object)((Object)messageType)).equals((Object)messageType2));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.getMessage();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        TrayIcon.MessageType messageType = this.getType();
        n3 = n3 * 59 + (messageType == null ? 43 : ((Object)((Object)messageType)).hashCode());
        return n3;
    }

    public String toString() {
        return "NotificationFired(message=" + this.getMessage() + ", type=" + String.valueOf((Object)this.getType()) + ")";
    }
}

