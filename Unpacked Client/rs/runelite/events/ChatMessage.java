/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class ChatMessage {
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String string) {
        this.message = string;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage)object;
        if (!chatMessage.canEqual(this)) {
            return false;
        }
        String string = this.getMessage();
        String string2 = chatMessage.getMessage();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    protected boolean canEqual(Object object) {
        return object instanceof ChatMessage;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.getMessage();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        return n3;
    }

    public String toString() {
        return "ChatMessage(message=" + this.getMessage() + ")";
    }

    public ChatMessage(String string) {
        this.message = string;
    }

    public ChatMessage() {
    }
}

