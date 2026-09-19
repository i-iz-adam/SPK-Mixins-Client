/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;
import rs.Client;
import rs.gui.Launcher;
import rs.k.a.a;
import rs.k.a.c;
import rs.k.e;
import rs.k.p;
import rs.s.e.d;

public class b {
    public static boolean a = false;
    public static a b = rs.k.a.a.a;
    public static int c = 0;
    public static c d = rs.k.a.c.c;
    public static rs.k.a.b e = rs.k.a.b.a;
    public static boolean f = true;
    public static int g = 0;
    public static int h = 0;
    public static boolean i = false;
    public static boolean j = false;
    public static int k = 2;
    public static boolean l = false;
    private static final String m = rs.v.a.b() + "gpu.properties";
    private static boolean n = false;

    public static void a() {
        if (rs.k.e.a()) {
            rs.k.b.c();
        } else {
            rs.k.b.b();
        }
    }

    public static void b() {
        Client client = Launcher.n().o();
        if (rs.k.e.a()) {
            return;
        }
        client.gZ.a();
        client.a(1, "Initializing GPU - please wait.", null);
        client.gZ.a(0, client.hG, 0);
        client.at = "::gpuflagon";
        if (rs.k.e.a()) {
            client.a.b(false);
        }
        if (client.a == null) {
            try {
                client.a = new e();
                client.b = new p();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        } else {
            client.a.c();
        }
        if (client.ai() && rs.k.e.a()) {
            e cfr_ignored_0 = client.a;
            rs.k.e.a(true);
        }
    }

    public static void c() {
        Client client = Launcher.n().o();
        if (!rs.k.e.a()) {
            return;
        }
        Client.ao = "::gpuflagoff";
        client.gZ.a();
        client.a(1, "Disabling GPU - please wait.", null);
        client.gZ.a(0, client.hG, 0);
        if (rs.k.e.a()) {
            client.a.b(false);
        }
        client.a.d();
        rs.f.a.Q = false;
    }

    public static void d() {
        rs.h.c.a("SaveGpuSettings", b::h);
    }

    private static void h() {
        try {
            File file = new File(m);
            if (!file.exists()) {
                file.createNewFile();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));){
                bufferedWriter.write("stretch_width=" + g);
                bufferedWriter.newLine();
                bufferedWriter.write("stretch_height=" + h);
                bufferedWriter.newLine();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void e() {
        if (n) {
            return;
        }
        File file = new File(m);
        if (!file.exists()) {
            return;
        }
        n = true;
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            fileInputStream.close();
            g = Integer.parseInt(properties.getProperty("stretch_width"));
            h = Integer.parseInt(properties.getProperty("stretch_height"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            try {
                file.delete();
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }

    public static void f() {
        int n2 = g;
        int n3 = h;
        d d2 = Launcher.n().q().a(d.class);
        Launcher.n().p().a(n2, n3);
    }

    public static boolean g() {
        return n;
    }

    static {
        rs.k.b.e();
    }
}

