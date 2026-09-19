/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.b;

import java.io.File;
import rs.gui.b.b.d;

public class e {
    public static final int a = 5;
    public static final String b = "_ver_";
    private final String c;
    private int d;

    public e(String string) {
        this.c = string;
        this.d = 1;
    }

    public void a() {
        File file = new File(rs.gui.b.b.d.a);
        if (!file.exists()) {
            return;
        }
        for (File file2 : file.listFiles()) {
            Integer n2;
            if (!file2.getName().startsWith(this.c + b) || (n2 = Integer.valueOf(Integer.parseInt(file2.getName().replace(this.c + b, "")))) <= this.d) continue;
            this.d = n2;
        }
    }

    public boolean a(int n2) {
        return this.d >= n2;
    }
}

