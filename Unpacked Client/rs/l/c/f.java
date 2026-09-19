/*
 * Decompiled with CFR 0.152.
 */
package rs.l.c;

import rs.Client;
import rs.f.a;
import rs.l.c.d;
import rs.l.c.e;
import rs.l.f_0;
import rs.n.c.ad_0;

public class f
extends d {
    private int c = 0;
    private f_0[] d = new f_0[3];
    private e[] e = new e[]{new e("Blood vengeance I", 245, 242), new e("Blood vengeance II", 245, 170), new e("Treasure hunter I", 363, 200), new e("Treasure hunter II", 430, 200), new e("Blood whip", 365, 125), new e("Blood rune c'bow", 421, 92), new e("Blood dark bow", 305, 92), new e("Diamonds are forever", 365, 52), new e("Bloodthirsty I", 121, 201), new e("Bloodthirsty II", 60, 167), new e("Killjoy I", 121, 124), new e("Killjoy II", 60, 90), new e("Blood pool", 120, 52), new e("Blood staff", 305, 163), new e("Blood ring", 421, 162), new e("Treasure buddy", 430, 245), new e("Emblem snatcher", 181, 90), new e("Augury", 223, 130), new e("Rigour", 269, 130), new e("Bloodlust", 17, 215), new e("Excavator", 180, 171), new e("War diamonds", 14, 126), new e("Unholy smite", 246, 92), new e("Eternal recoil", 202, 50), new e("Eternal blood cape", 289, 50), new e("Vampiric damage", 63, 26), new e("Vampiric defence", 425, 27)};
    private boolean f;

    public f(Client client) {
        super(client);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        Object object;
        int n4;
        if (Client.cH != ad_0.bI) {
            this.c = -1;
            return;
        }
        if (!this.f) {
            this.d[0] = new f_0("fountain/sprite 1");
            this.d[1] = new f_0("fountain/sprite 2");
            this.d[2] = new f_0("fountain/sprite 3");
            this.f = true;
        }
        if (this.c == -1) {
            this.c = 0;
            Client.ap = "::selectperk 0";
        }
        int n5 = rs.f.a.ai == a.c.a ? 0 : Client.ai / 2 - 356;
        int n6 = rs.f.a.ai == a.c.a ? 0 : Client.ah / 2 - 230;
        for (n4 = 0; n4 < this.e.length; ++n4) {
            object = this.d[this.e[n4].d()];
            n3 = Integer.valueOf(this.e[n4].b()) + n5;
            n2 = Integer.valueOf(this.e[n4].c()) + n6;
            if (this.c == n4) {
                object = this.d[2];
            }
            ((f_0)object).c(n3, n2);
        }
        for (n4 = 0; n4 < this.e.length; ++n4) {
            object = this.e[n4].a();
            n3 = this.e[n4].b() + n5;
            n2 = this.e[n4].c() + n6;
            if (Client.hP < n3) continue;
            if (Client.hP > n3 + 32) continue;
            if (Client.hQ < n2) continue;
            if (Client.hQ > n2 + 32) continue;
            this.a.b(Client.hP, Client.hQ - 10, " @gre@" + (String)object + " ");
        }
    }

    @Override
    public boolean b() {
        int n2 = rs.f.a.ai == a.c.a ? 0 : Client.ai / 2 - 356;
        int n3 = rs.f.a.ai == a.c.a ? 0 : Client.ah / 2 - 230;
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            int n4 = this.e[i2].b() + n2;
            int n5 = this.e[i2].c() + n3;
            if (Client.hP < n4) continue;
            if (Client.hP > n4 + 32) continue;
            if (Client.hQ < n5) continue;
            if (Client.hQ > n5 + 32) continue;
            this.c = i2;
            Client.ap = "::selectperk " + i2;
        }
        return false;
    }

    public void a(int n2) {
        this.e[n2].a(1);
    }

    public void b(int n2) {
        this.e[n2].a(0);
    }

    public void c(int n2) {
        this.c = n2;
    }
}

