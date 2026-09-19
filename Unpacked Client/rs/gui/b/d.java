/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import rs.gui.Launcher;
import rs.gui.b.c;
import rs.gui.b.c.a;
import rs.gui.b.h;

public class d
extends LinkedHashMap<String, c> {
    private h a;
    private String b;
    private rs.gui.b.a c;

    public d(h h2) {
        this.a = h2;
    }

    public void a(String string, rs.gui.b.a a2) {
        this.b = string;
        this.c = a2;
        this.b();
    }

    public void a(String string, int n2) {
        if (!this.containsKey(string)) {
            this.a((String)null, (rs.gui.b.a)null);
            return;
        }
        if (n2 < 0 || n2 >= ((c)this.get(string)).size()) {
            n2 = 0;
        }
        this.b = string;
        this.c = (rs.gui.b.a)((c)this.get(string)).get(n2);
        this.b();
    }

    public void a(String string) {
        if (!this.c(string)) {
            return;
        }
        c c2 = new c(string);
        c2.add(new rs.gui.b.a("Default"));
        this.put(string, c2);
        this.a.d();
        this.a.b();
        this.a(string, c2);
        this.a.e().b();
        this.a(string, 0);
        this.a.d();
        this.a.b();
    }

    public void a(String string, String string2) {
        if (!this.c(string2)) {
            return;
        }
        d d2 = new d(this.a);
        boolean bl = false;
        for (String string3 : this.keySet()) {
            if (string3.equals(string)) {
                d2.put(string2, (c)this.get(string3));
                bl = true;
                continue;
            }
            d2.put(string3, (c)this.get(string3));
        }
        if (bl) {
            this.clear();
            for (String string3 : d2.keySet()) {
                this.put(string3, (c)d2.get(string3));
            }
            if (this.b.equals(string)) {
                this.a(string2, this.c);
            }
            this.a.e().a(string);
            this.a.e().a(string2, (List)this.get(string2));
        }
        this.a.d();
        this.a.e().b();
    }

    public void b(String string) {
        if (this.size() <= 1) {
            JOptionPane.showMessageDialog(null, "You can't delete your only folder!", "Oops!", 2);
            return;
        }
        this.remove(string);
        this.a.e().a(string);
        String string2 = "";
        this.a((String)this.keySet().toArray()[0], 0);
        this.a.h().setSelectedIndex(0);
        this.a.d();
        this.a.b();
        this.a.e().b();
    }

    public rs.gui.b.a b(String string, String string2) {
        c c2 = (c)this.get(string);
        for (rs.gui.b.a a2 : c2) {
            if (!a2.f().equals(string2)) continue;
            JOptionPane.showMessageDialog(null, "You already have a loadout with this name!", "Oops!", 2);
            return null;
        }
        rs.gui.b.a a3 = new rs.gui.b.a(string2);
        c2.add(a3);
        this.put(string, c2);
        this.a.e().a(string, c2);
        this.a.h().addItem(string2);
        this.c = a3;
        this.a.h().setSelectedItem(string2);
        this.a.a();
        return a3;
    }

    public void a(String string, rs.gui.b.a a2, String string2) {
        Object object2;
        if (string2 == null || string2.equals("") || string2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your loadout name can't be empty!", "Oops!", 2);
            return;
        }
        if (!string2.equalsIgnoreCase(a2.f())) {
            for (Object object2 : (c)this.get(string)) {
                if (!((rs.gui.b.a)object2).f().equalsIgnoreCase(string2)) continue;
                JOptionPane.showMessageDialog(null, "You already have that name in this folder!", "Oops!", 2);
                return;
            }
        }
        String string3 = a2.f();
        a2.a(string2);
        object2 = new c(string2);
        c c2 = (c)this.get(string);
        int n2 = 0;
        int n3 = 0;
        for (rs.gui.b.a a3 : c2) {
            if (a3.f().equals(string2)) {
                n2 = n3;
            }
            ((ArrayList)object2).add(a3);
            ++n3;
        }
        this.put(string, object2);
        this.a.e().a(string, (List<rs.gui.b.a>)object2);
        this.a.a(n2);
        Launcher.n().a(500, true);
    }

    public void a(String string, int n2, int n3) {
        c c2 = (c)this.get(string);
        if (n2 == n3 || n2 < 0 || n2 >= c2.size() || n3 < 0 || n3 >= c2.size()) {
            return;
        }
        if (c2.get(n2) == null || c2.get(n3) == null) {
            return;
        }
        rs.gui.b.a a2 = (rs.gui.b.a)c2.get(n2);
        rs.gui.b.a a3 = (rs.gui.b.a)c2.get(n3);
        c2.set(n2, a3);
        c2.set(n3, a2);
        this.put(string, c2);
        this.a.e().a(string, c2);
        this.a.e().b();
        this.a.a(n3);
        this.a.h().showPopup();
    }

    public void c(String string, String string2) {
        d d2 = new d(this.a);
        for (String string3 : this.keySet()) {
            if (string3.equalsIgnoreCase(string)) {
                d2.put(string2, (c)this.get(string2));
                continue;
            }
            if (string3.equalsIgnoreCase(string2)) {
                d2.put(string, (c)this.get(string));
                continue;
            }
            d2.put(string3, (c)this.get(string3));
        }
        this.clear();
        for (String string3 : d2.keySet()) {
            this.put(string3, (c)d2.get(string3));
        }
        this.a(string, 0);
        this.a.h().setSelectedIndex(0);
        this.a.d();
        this.a.b();
        this.a.e().b();
        JButton jButton = this.a.i();
        this.a.j().show(jButton, 1, 1);
    }

    public void d(String string, String string2) {
        c c2 = (c)this.get(string);
        if (c2.size() == 1) {
            JOptionPane.showMessageDialog(null, "You can't delete the only loadout on your folder!", "Oops!", 2);
            return;
        }
        rs.gui.b.a a2 = null;
        for (rs.gui.b.a a3 : c2) {
            if (!a3.f().equals(string2)) continue;
            a2 = a3;
        }
        if (a2 != null) {
            c2.remove(a2);
            this.a.e().a(string, c2);
        }
        this.a.h().removeItem(string2);
        this.a(this.b, 0);
        this.a.h().setSelectedIndex(0);
        this.a.a();
    }

    public void a(String string, c c2) {
        this.a.e().a(string, c2);
        this.a.e().b();
    }

    public void a() {
        if (this.b == null) {
            return;
        }
        this.a(this.b, (c)this.get(this.b));
    }

    public void b() {
        this.a.g().a(this.c);
    }

    private boolean c(String string) {
        if (string == null || string.equals("") || string.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your folder name can't be empty!", "Oops!", 2);
            return false;
        }
        for (String string2 : this.keySet()) {
            if (!string2.equalsIgnoreCase(string)) continue;
            JOptionPane.showMessageDialog(null, "You already have a folder with this name!", "Oops!", 2);
            return false;
        }
        for (Object object : (Object)string.toLowerCase().toCharArray()) {
            boolean bl = false;
            for (char c2 : rs.gui.b.c.a.c) {
                if (object != c2) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            JOptionPane.showMessageDialog(null, "You can only have letters and numbers in your folder name!", "Oops!", 2);
            return false;
        }
        return true;
    }

    public rs.gui.b.a c() {
        return this.c;
    }

    public c d() {
        return (c)this.get(this.b);
    }

    public String e() {
        return this.b;
    }
}

