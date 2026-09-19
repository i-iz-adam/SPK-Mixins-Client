/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.runelite.events;

import javax.annotation.Nullable;

public class ConfigChanged {
    private String group;
    @Nullable
    private String profile;
    private String key;
    private String oldValue;
    private String newValue;

    public String getGroup() {
        return this.group;
    }

    @Nullable
    public String getProfile() {
        return this.profile;
    }

    public String getKey() {
        return this.key;
    }

    public String getOldValue() {
        return this.oldValue;
    }

    public String getNewValue() {
        return this.newValue;
    }

    public void setGroup(String string) {
        this.group = string;
    }

    public void setProfile(@Nullable String string) {
        this.profile = string;
    }

    public void setKey(String string) {
        this.key = string;
    }

    public void setOldValue(String string) {
        this.oldValue = string;
    }

    public void setNewValue(String string) {
        this.newValue = string;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ConfigChanged)) {
            return false;
        }
        ConfigChanged configChanged = (ConfigChanged)object;
        if (!configChanged.canEqual(this)) {
            return false;
        }
        String string = this.getGroup();
        String string2 = configChanged.getGroup();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getProfile();
        String string4 = configChanged.getProfile();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.getKey();
        String string6 = configChanged.getKey();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return false;
        }
        String string7 = this.getOldValue();
        String string8 = configChanged.getOldValue();
        if (string7 == null ? string8 != null : !string7.equals(string8)) {
            return false;
        }
        String string9 = this.getNewValue();
        String string10 = configChanged.getNewValue();
        return !(string9 == null ? string10 != null : !string9.equals(string10));
    }

    protected boolean canEqual(Object object) {
        return object instanceof ConfigChanged;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.getGroup();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.getProfile();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        String string3 = this.getKey();
        n3 = n3 * 59 + (string3 == null ? 43 : string3.hashCode());
        String string4 = this.getOldValue();
        n3 = n3 * 59 + (string4 == null ? 43 : string4.hashCode());
        String string5 = this.getNewValue();
        n3 = n3 * 59 + (string5 == null ? 43 : string5.hashCode());
        return n3;
    }

    public String toString() {
        return "ConfigChanged(group=" + this.getGroup() + ", profile=" + this.getProfile() + ", key=" + this.getKey() + ", oldValue=" + this.getOldValue() + ", newValue=" + this.getNewValue() + ")";
    }
}

