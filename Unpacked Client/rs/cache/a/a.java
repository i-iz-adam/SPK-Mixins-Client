/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.a;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import rs.Client;
import rs.cache.a.b;

public class a
extends b {
    private Client d;
    private String e;
    private long f;

    public a(Client client, String string, URL uRL, File file) {
        super(uRL, file);
        this.d = client;
        this.e = string;
    }

    @Override
    public void a() {
        if (this.d != null) {
            double d2 = (double)this.a / (double)this.c;
            int n2 = (int)(d2 * 100.0);
            if (System.currentTimeMillis() - this.f >= 500L) {
                this.f = System.currentTimeMillis();
            }
            String string = "@yel@Current progress - " + n2 + "%";
            if (System.currentTimeMillis() - this.b > 1000L) {
                double d3 = (double)this.a / (double)((System.currentTimeMillis() - this.b) / 1000L);
                String string2 = "kb/s";
                double d4 = (int)(d3 / 1000.0);
                if (d4 > 1000.0) {
                    d4 /= 1000.0;
                    string2 = "mb/s";
                }
                string = string + " @or2@(" + new DecimalFormat("#.##").format(d4) + " " + string2 + ")";
            }
            this.d.b(n2, this.e, string);
        }
    }
}

