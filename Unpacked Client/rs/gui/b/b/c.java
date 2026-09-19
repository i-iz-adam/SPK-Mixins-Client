/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.b;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;
import rs.gui.b.a;
import rs.gui.b.b.e;
import rs.gui.b.f;

public class c {
    public static void a(DataOutputStream dataOutputStream, a a2) {
        dataOutputStream.writeInt(a2.f().getBytes().length);
        dataOutputStream.write(a2.f().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeInt(a2.j().getRGB());
        if (a2.k() == null) {
            dataOutputStream.writeInt(0);
        } else {
            dataOutputStream.writeInt(a2.k().name().getBytes().length);
            dataOutputStream.write(a2.k().name().getBytes(StandardCharsets.UTF_8));
        }
        dataOutputStream.writeInt(a2.g().c());
        dataOutputStream.writeInt(a2.e());
        for (int i2 = 0; i2 < a2.c().length; ++i2) {
            dataOutputStream.writeInt(a2.c()[i2]);
        }
        for (rs.gui.b.c.c c2 : rs.gui.b.c.c.values()) {
            int n2 = a2.a().get((Object)c2) == null ? -1 : Integer.valueOf(a2.a().get((Object)c2).a());
            dataOutputStream.writeInt(n2);
            if (n2 == -1) {
                dataOutputStream.writeInt(1);
                continue;
            }
            dataOutputStream.writeInt(a2.a().get((Object)c2).b());
        }
        for (int i3 = 0; i3 < a2.d().length; ++i3) {
            int n3 = a2.d()[i3] == null ? -1 : a2.d()[i3].a();
            dataOutputStream.writeInt(n3);
            if (n3 == -1) {
                dataOutputStream.writeInt(1);
                continue;
            }
            dataOutputStream.writeInt(a2.d()[i3].b());
        }
        dataOutputStream.writeInt(a2.i());
        dataOutputStream.writeInt(a2.b());
        dataOutputStream.writeInt(a2.h());
    }

    public static void a(DataInputStream dataInputStream, rs.gui.b.c c2) {
        e e2 = new e(c2.a());
        e2.a();
        String string = "Default";
        do {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6 = dataInputStream.readInt();
            byte[] byArray = new byte[n6];
            dataInputStream.read(byArray);
            string = new String(byArray);
            a a2 = new a(string);
            if (e2.a(3)) {
                n5 = dataInputStream.readInt();
                a2.a(new Color(n5));
                if (e2.a(4)) {
                    n6 = dataInputStream.readInt();
                    if (n6 > 0) {
                        byArray = new byte[n6];
                        dataInputStream.read(byArray);
                        String string2 = new String(byArray);
                        a2.a(rs.gui.b.e.valueOf(string2));
                    }
                } else {
                    dataInputStream.readInt();
                }
            }
            n5 = dataInputStream.readInt();
            a2.a(a.a.a(n5));
            int n7 = dataInputStream.readInt();
            a2.b(n7);
            for (n4 = 0; n4 < a2.c().length; ++n4) {
                a2.c()[n4] = n3 = dataInputStream.readInt();
            }
            rs.gui.b.c.c[] cArray = rs.gui.b.c.c.values();
            n3 = cArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                rs.gui.b.c.c c3 = cArray[n2];
                int n8 = dataInputStream.readInt();
                int n9 = dataInputStream.readInt();
                a2.a(c3, new f(n8, n9));
            }
            for (n4 = 0; n4 < a2.d().length; ++n4) {
                n3 = dataInputStream.readInt();
                n2 = dataInputStream.readInt();
                a2.a(n4, new f(n3, n2));
            }
            if (e2.a(2)) {
                n4 = dataInputStream.readInt();
                a2.d(n4);
            }
            n4 = dataInputStream.readInt();
            a2.a(n4);
            if (e2.a(5)) {
                n3 = dataInputStream.readInt();
                a2.c(n3);
            }
            c2.add(a2);
        } while (string != null);
    }
}

