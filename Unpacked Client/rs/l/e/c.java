/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rs.Client;
import rs.gui.Launcher;
import rs.l.b.a.d;
import rs.l.e.b;

public class c {
    public Client a;
    public boolean b;
    public List<b> c;
    public List<b> d;
    public int e;
    public int f;
    public String g;

    public c(Client client) {
        this.a = client;
        this.b = false;
        this.c = new ArrayList<b>();
        this.d = new ArrayList<b>();
        this.g = "";
        this.f = 0;
    }

    public void a(int n2) {
        Object object;
        if (n2 >= 32 && n2 <= 122 && this.g.length() < 80 && n2 != 96) {
            object = new StringBuilder(this.g);
            ((StringBuilder)object).insert(this.f, (char)n2);
            this.g = ((StringBuilder)object).toString();
            ++this.f;
        }
        if (n2 == 8 && this.g.length() > 0 && this.f > 0) {
            object = new StringBuilder(this.g);
            ((StringBuilder)object).deleteCharAt(this.f - 1);
            this.g = ((StringBuilder)object).toString();
            --this.f;
        }
        if (this.f <= 0) {
            this.f = 0;
        }
        object = (this.g.startsWith("::") ? "" : "::") + this.g;
        if ((n2 == 13 || n2 == 10) && ((String)object).length() > 0) {
            if (!rs.l.b.a.d.g()) {
                this.a.d((String)object);
                Client.fv.a(103);
                Client.fv.b(((String)object).length() - 1);
                Client.fv.a(((String)object).substring(2));
            }
            if (this.c.size() >= 14) {
                this.c.remove(0);
            }
            if (this.d.size() >= 25) {
                this.d.remove(0);
            }
            if (this.g.equalsIgnoreCase("clear")) {
                this.c.clear();
            } else {
                this.a(this.g);
            }
            if (rs.l.b.a.d.g()) {
                try {
                    rs.l.b.a.d.b.a((String)object);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                while (this.c.size() > 14) {
                    this.c.remove(0);
                }
            }
            this.g = "";
            this.f = 0;
        }
    }

    public void b(int n2) {
        if (n2 <= 0) {
            n2 = 0;
        }
        if (n2 >= this.d.size()) {
            this.e = this.d.size();
            this.g = "";
            this.f = 0;
            return;
        }
        if (this.d.get((int)n2).a.equals(this.g)) {
            if (this.e > n2 && n2 > 0) {
                this.b(n2 - 1);
                return;
            }
            if (this.e > n2 && n2 < this.d.size() - 1) {
                this.b(n2 + 1);
                return;
            }
        }
        this.g = this.d.get((int)n2).a;
        this.e = n2;
        this.f = this.g.length();
    }

    public void a() {
        if (this.b) {
            this.b = false;
            this.e = this.d.size();
        } else {
            this.b = true;
        }
    }

    public void a(String string) {
        b b2 = new b(string, System.currentTimeMillis());
        String string2 = new SimpleDateFormat("hh:mm a").format(new Date());
        b2.c = "@yel@[" + string2 + "]:@whi@ " + string;
        this.c.add(b2);
        this.d.add(b2);
        this.e = this.d.size();
    }

    public void b(String string) {
        b b2 = new b("~", System.currentTimeMillis());
        b2.c = string;
        this.c.add(b2);
    }

    public String c(String string) {
        if (!string.contains(" ")) {
            return string;
        }
        if (string.toLowerCase().startsWith("yell ") || string.toLowerCase().startsWith("news ")) {
            return string;
        }
        String[] stringArray = new String[]{"@whi@", "@gre@", "@cya@", "@or1@", "@mag@", "@red@", "@yel@"};
        int n2 = 0;
        Object object = "";
        for (String string2 : string.split(" ")) {
            object = (String)object + stringArray[n2] + string2 + " ";
            if (++n2 != stringArray.length) continue;
            n2 = 0;
        }
        return object;
    }

    public void b() {
        int n2 = 0;
        c c2 = this;
        int n3 = c2.a.ai() ? 0 : 4;
        int n4 = Launcher.n().i().getWidth();
        int n5 = 320;
        int n6 = 100;
        rs.l.c.b(n5, n2, n3, 3093151, n4, n6);
        c c3 = this;
        int n7 = c3.a.ai() ? 0 : 4;
        int n8 = 295;
        rs.l.c.a(n7, n8, n4, 0xFFFFFF);
        int n9 = 5;
        int n10 = 18;
        String string = this.g;
        String string2 = "> ";
        this.a.gm.b(string2, n7 + n9, n8 + n10 + 1, 0xFFFFFF, 0);
        this.a.gm.b(this.c(string), n7 + n9 + this.a.gm.c(string2), n8 + n10, 0xFFFFFF, 0);
        this.a.gm.b(Client.ff % 20 < 10 ? "|" : "", n7 + n9 + this.a.gm.c(string.substring(0, this.f)) + this.a.gm.c(string2), n8 + n10 + 1, 0xFFFFFF, 0);
        c c4 = this;
        int n11 = 5 + (c4.a.ai() ? 0 : 4);
        int n12 = 28;
        int n13 = 0;
        for (b b2 : this.c) {
            if (b2.a.equals("~") && b2.c != null) {
                this.a.gm.b(b2.c, n11, n12, 0xFFFFFF, 0);
            } else {
                String string3 = b2.a();
                String string4 = b2.a;
                Object object = "";
                try {
                    object = string3.split(" ")[0] + string3.split(" ")[1] + " ";
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                this.a.gm.b((String)object + this.c(string4), n11, n12, 0xFFFFFF, 0);
            }
            ++n13;
            n12 += 20;
        }
    }
}

