/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class MenuHover {
    public static MenuHover SINGLETON = new MenuHover();
    private String tooltip;
    private int row;
    private int menuId;
    private int menuCmd1;
    private int menuCmd2;
    private int menuCmd3;
    private int menuCmd4;

    public int getCmd(int n2) {
        switch (n2) {
            case 1: {
                return this.menuCmd1;
            }
            case 2: {
                return this.menuCmd2;
            }
            case 3: {
                return this.menuCmd3;
            }
            case 4: {
                return this.menuCmd4;
            }
        }
        return 0;
    }

    public static MenuHover get() {
        return SINGLETON;
    }

    public String getTooltip() {
        return this.tooltip;
    }

    public int getRow() {
        return this.row;
    }

    public int getMenuId() {
        return this.menuId;
    }

    public int getMenuCmd1() {
        return this.menuCmd1;
    }

    public int getMenuCmd2() {
        return this.menuCmd2;
    }

    public int getMenuCmd3() {
        return this.menuCmd3;
    }

    public int getMenuCmd4() {
        return this.menuCmd4;
    }

    public void setTooltip(String string) {
        this.tooltip = string;
    }

    public void setRow(int n2) {
        this.row = n2;
    }

    public void setMenuId(int n2) {
        this.menuId = n2;
    }

    public void setMenuCmd1(int n2) {
        this.menuCmd1 = n2;
    }

    public void setMenuCmd2(int n2) {
        this.menuCmd2 = n2;
    }

    public void setMenuCmd3(int n2) {
        this.menuCmd3 = n2;
    }

    public void setMenuCmd4(int n2) {
        this.menuCmd4 = n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof MenuHover)) {
            return false;
        }
        MenuHover menuHover = (MenuHover)object;
        if (!menuHover.canEqual(this)) {
            return false;
        }
        if (this.getRow() != menuHover.getRow()) {
            return false;
        }
        if (this.getMenuId() != menuHover.getMenuId()) {
            return false;
        }
        if (this.getMenuCmd1() != menuHover.getMenuCmd1()) {
            return false;
        }
        if (this.getMenuCmd2() != menuHover.getMenuCmd2()) {
            return false;
        }
        if (this.getMenuCmd3() != menuHover.getMenuCmd3()) {
            return false;
        }
        if (this.getMenuCmd4() != menuHover.getMenuCmd4()) {
            return false;
        }
        String string = this.getTooltip();
        String string2 = menuHover.getTooltip();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    protected boolean canEqual(Object object) {
        return object instanceof MenuHover;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.getRow();
        n3 = n3 * 59 + this.getMenuId();
        n3 = n3 * 59 + this.getMenuCmd1();
        n3 = n3 * 59 + this.getMenuCmd2();
        n3 = n3 * 59 + this.getMenuCmd3();
        n3 = n3 * 59 + this.getMenuCmd4();
        String string = this.getTooltip();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        return n3;
    }

    public String toString() {
        return "MenuHover(tooltip=" + this.getTooltip() + ", row=" + this.getRow() + ", menuId=" + this.getMenuId() + ", menuCmd1=" + this.getMenuCmd1() + ", menuCmd2=" + this.getMenuCmd2() + ", menuCmd3=" + this.getMenuCmd3() + ", menuCmd4=" + this.getMenuCmd4() + ")";
    }
}

