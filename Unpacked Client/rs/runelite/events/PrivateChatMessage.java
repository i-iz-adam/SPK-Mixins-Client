/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class PrivateChatMessage {
    private String sender;
    private String message;

    public String getSender() {
        return this.sender;
    }

    public String getMessage() {
        return this.message;
    }

    public void setSender(String string) {
        this.sender = string;
    }

    public void setMessage(String string) {
        this.message = string;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof PrivateChatMessage)) {
            return false;
        }
        PrivateChatMessage privateChatMessage = (PrivateChatMessage)object;
        if (!privateChatMessage.canEqual(this)) {
            return false;
        }
        String string = this.getSender();
        String string2 = privateChatMessage.getSender();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getMessage();
        String string4 = privateChatMessage.getMessage();
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    protected boolean canEqual(Object object) {
        return object instanceof PrivateChatMessage;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.getSender();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.getMessage();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n3;
    }

    public String toString() {
        return "PrivateChatMessage(sender=" + this.getSender() + ", message=" + this.getMessage() + ")";
    }

    public PrivateChatMessage(String string, String string2) {
        this.sender = string;
        this.message = string2;
    }

    public PrivateChatMessage() {
    }
}

