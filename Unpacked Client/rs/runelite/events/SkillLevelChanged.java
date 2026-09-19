/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class SkillLevelChanged {
    int skillId;
    double experience;
    int currentLevel;
    int maximumLevel;

    public int getSkillId() {
        return this.skillId;
    }

    public double getExperience() {
        return this.experience;
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public int getMaximumLevel() {
        return this.maximumLevel;
    }

    public void setSkillId(int n2) {
        this.skillId = n2;
    }

    public void setExperience(double d2) {
        this.experience = d2;
    }

    public void setCurrentLevel(int n2) {
        this.currentLevel = n2;
    }

    public void setMaximumLevel(int n2) {
        this.maximumLevel = n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof SkillLevelChanged)) {
            return false;
        }
        SkillLevelChanged skillLevelChanged = (SkillLevelChanged)object;
        if (!skillLevelChanged.canEqual(this)) {
            return false;
        }
        if (this.getSkillId() != skillLevelChanged.getSkillId()) {
            return false;
        }
        if (Double.compare(this.getExperience(), skillLevelChanged.getExperience()) != 0) {
            return false;
        }
        if (this.getCurrentLevel() != skillLevelChanged.getCurrentLevel()) {
            return false;
        }
        return this.getMaximumLevel() == skillLevelChanged.getMaximumLevel();
    }

    protected boolean canEqual(Object object) {
        return object instanceof SkillLevelChanged;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.getSkillId();
        long l2 = Double.doubleToLongBits(this.getExperience());
        n3 = n3 * 59 + (int)(l2 >>> 32 ^ l2);
        n3 = n3 * 59 + this.getCurrentLevel();
        n3 = n3 * 59 + this.getMaximumLevel();
        return n3;
    }

    public String toString() {
        return "SkillLevelChanged(skillId=" + this.getSkillId() + ", experience=" + this.getExperience() + ", currentLevel=" + this.getCurrentLevel() + ", maximumLevel=" + this.getMaximumLevel() + ")";
    }

    public SkillLevelChanged(int n2, double d2, int n3, int n4) {
        this.skillId = n2;
        this.experience = d2;
        this.currentLevel = n3;
        this.maximumLevel = n4;
    }
}

