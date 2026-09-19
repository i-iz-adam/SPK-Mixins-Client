/*
 * Decompiled with CFR 0.152.
 */
package rs.v;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import rs.k.j;
import rs.secure.b;
import rs.secure.c;

public final class a
implements Runnable {
    public static rs.w.c a = new rs.w.c();
    private final int p = 524288;
    private a q;
    public static final int b = 317;
    public static int c;
    public static int d;
    public static RandomAccessFile e;
    public static final RandomAccessFile[] f;
    public static boolean g;
    public static final Applet h;
    private static boolean r;
    private static int s;
    private static InetAddress t;
    private static int u;
    private static Socket v;
    private static int w;
    private static Runnable x;
    private static String y;
    public static String i;
    private static String z;
    private static DataInputStream A;
    private static int B;
    private static String C;
    private static byte[] D;
    private static boolean E;
    private static int F;
    public static String j;
    public static int k;
    public static int l;
    private static boolean G;
    private static int H;
    public static int m;
    public static boolean n;
    public static String o;

    public static void a(InetAddress inetAddress) {
        s = (int)(Math.random() * 9.9999999E7);
        if (r) {
            try {
                Thread.sleep(500L);
            }
            catch (Exception exception) {
                // empty catch block
            }
            r = false;
        }
        u = 0;
        x = null;
        y = null;
        C = null;
        z = null;
        t = inetAddress;
        Thread thread = new Thread(new a());
        thread.setDaemon(true);
        thread.start();
        while (!r) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
    }

    public static void a() {
        try {
            e = new RandomAccessFile(rs.v.a.f() + "main_file_cache.dat", "rw");
            for (int i2 = 0; i2 < 5; ++i2) {
                rs.v.a.f[i2] = new RandomAccessFile(rs.v.a.f() + "main_file_cache.idx" + i2, "rw");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        r = true;
        String string = rs.v.a.f();
        c = rs.v.a.f(string);
        rs.v.a.a();
        int n2 = s;
        while (s == n2) {
            Object object;
            if (u != 0) {
                try {
                    v = new Socket(t, u);
                }
                catch (Exception exception) {
                    v = null;
                }
                u = 0;
            } else if (x != null) {
                object = new Thread(x);
                ((Thread)object).setDaemon(true);
                ((Thread)object).start();
                ((Thread)object).setPriority(w);
                x = null;
            } else if (y != null) {
                try {
                    i = InetAddress.getByName(y).getHostName();
                }
                catch (Exception exception) {
                    i = "unknown";
                }
                y = null;
            } else if (C != null) {
                if (D != null) {
                    try {
                        object = new FileOutputStream(string + C);
                        ((FileOutputStream)object).write(D, 0, B);
                        ((FileOutputStream)object).close();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (G) {
                    object = string + C;
                    G = false;
                    AudioInputStream audioInputStream = null;
                    try {
                        audioInputStream = AudioSystem.getAudioInputStream(new File((String)object));
                    }
                    catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                        unsupportedAudioFileException.printStackTrace();
                        return;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        return;
                    }
                    AudioFormat audioFormat = audioInputStream.getFormat();
                    SourceDataLine sourceDataLine = null;
                    DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
                    try {
                        sourceDataLine = (SourceDataLine)AudioSystem.getLine(info);
                        sourceDataLine.open(audioFormat);
                    }
                    catch (LineUnavailableException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                        return;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return;
                    }
                    if (sourceDataLine.isControlSupported(FloatControl.Type.PAN)) {
                        FloatControl floatControl = (FloatControl)sourceDataLine.getControl(FloatControl.Type.PAN);
                        if (this.q == rs.v.a$a.b) {
                            floatControl.setValue(1.0f);
                        } else if (this.q == rs.v.a$a.a) {
                            floatControl.setValue(-1.0f);
                        }
                    }
                    sourceDataLine.start();
                    int n3 = 0;
                    byte[] byArray = new byte[524288];
                    try {
                        while (n3 != -1) {
                            n3 = audioInputStream.read(byArray, 0, byArray.length);
                            if (n3 < 0) continue;
                            sourceDataLine.write(byArray, 0, n3);
                        }
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        return;
                    }
                    finally {
                        sourceDataLine.drain();
                        sourceDataLine.close();
                    }
                }
                if (E) {
                    try {
                        a.a(string);
                        a.b(C);
                        a.d();
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    E = false;
                }
                C = null;
            } else if (z != null) {
                try {
                    System.out.println("urlstream");
                    A = new DataInputStream(new URL(h.getCodeBase(), z).openStream());
                }
                catch (Exception exception) {
                    A = null;
                }
                z = null;
            }
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
    }

    public static String b() {
        String string;
        String string2;
        File file = null;
        String string3 = System.getProperty("user.home");
        StringBuilder stringBuilder = new StringBuilder(string3 + (string2 = System.getProperty("file.separator")) + (string = "." + rs.f.a.A.toLowerCase() + (rs.f.a.h != false ? "-test" : "") + "-data") + string2);
        String string4 = stringBuilder.toString();
        file = new File(string4);
        if (file.exists() || file.mkdir()) {
            return string4;
        }
        System.out.println("Couldn't find data directory!");
        return null;
    }

    public static String c() {
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                NetworkInterface networkInterface = enumeration.nextElement();
                byte[] byArray = networkInterface.getHardwareAddress();
                if (byArray == null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                for (int i2 = 0; i2 < byArray.length; ++i2) {
                    stringBuilder.append(String.format("%02X%s", byArray[i2], i2 < byArray.length - 1 ? "-" : ""));
                }
                return stringBuilder.toString();
            }
        }
        catch (SocketException socketException) {
            socketException.printStackTrace();
        }
        return null;
    }

    public static boolean d() {
        return rs.k.j.a() == rs.k.j.a;
    }

    public static String e() {
        String string = rs.secure.c.a();
        if (string == null) {
            string = rs.secure.b.a();
        }
        if (string == null) {
            string = rs.secure.a.a();
        }
        if (rs.v.a.a(string)) {
            string = rs.v.a.c();
        }
        return string;
    }

    public static boolean a(String string) {
        return string == null || string.isEmpty() || string.equalsIgnoreCase("WINDOWS InstallDate  ") || string.contains("CScript Error");
    }

    public static boolean b(String string) {
        return !rs.v.a.a(string);
    }

    public static String f() {
        File file = null;
        String string = System.getProperty("user.home");
        String string2 = System.getProperty("file.separator");
        String string3 = "." + rs.f.a.A.toLowerCase() + (rs.f.a.h != false ? "-test" : "");
        StringBuilder stringBuilder = new StringBuilder(string + string2 + string3 + string2);
        Object object = stringBuilder.toString();
        if (rs.f.a.k) {
            object = "." + File.separator + "cache" + File.separator;
        }
        if ((file = new File((String)object)).exists() || file.mkdir()) {
            return object;
        }
        System.out.println("Couldn't find cache directory!");
        return null;
    }

    public static String g() {
        String[] stringArray = new String[]{"c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache"};
        if (d < 32 || d > 34) {
            d = 32;
        }
        String string = ".file_store_" + d;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            try {
                File file;
                String string2 = stringArray[i2];
                if (string2.length() > 0 && !(file = new File(string2)).exists() || !(file = new File(string2 + string)).exists() && !file.mkdir()) continue;
                return string2 + string + "/";
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    private static int f(String string) {
        Object object;
        try {
            object = new File(string + "uid.dat");
            if (!((File)object).exists() || ((File)object).length() < 4L) {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(string + "uid.dat"));
                dataOutputStream.writeInt((int)(Math.random() * 9.9999999E7));
                dataOutputStream.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            object = new DataInputStream(new FileInputStream(string + "uid.dat"));
            int n2 = ((DataInputStream)object).readInt();
            ((FilterInputStream)object).close();
            return n2 + 1;
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static synchronized Socket a(int n2) {
        u = n2;
        while (u != 0) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
        if (v == null) {
            throw new IOException("could not open socket");
        }
        return v;
    }

    public static synchronized DataInputStream c(String string) {
        z = string;
        while (z != null) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
        if (A == null) {
            throw new IOException("could not open: " + string);
        }
        return A;
    }

    public static synchronized void d(String string) {
        i = string;
        y = string;
    }

    public static synchronized void a(Runnable runnable, int n2) {
        w = n2;
        x = runnable;
    }

    public static synchronized boolean a(byte[] byArray, int n2) {
        if (n2 > 2000000) {
            return false;
        }
        if (C != null) {
            return false;
        }
        H = (H + 1) % 5;
        B = n2;
        D = byArray;
        G = true;
        C = "sound" + H + ".wav";
        return true;
    }

    public static synchronized boolean h() {
        if (C != null) {
            return false;
        }
        D = null;
        G = true;
        C = "sound" + H + ".wav";
        return true;
    }

    public static synchronized void b(byte[] byArray, int n2) {
        if (n2 > 2000000) {
            return;
        }
        if (C != null) {
            return;
        }
        F = (F + 1) % 5;
        B = n2;
        D = byArray;
        E = true;
        C = "jingle" + F + ".mid";
    }

    public static boolean i() {
        String string = System.getProperty("os.arch");
        String string2 = System.getProperty("sun.arch.data.model");
        return string != null && string.contains("64") && string2 != null && string2.equals("32");
    }

    public static void a(double d2) {
        a.a(d2);
    }

    public static void e(String string) {
        System.out.println("Error: " + string);
    }

    private a() {
    }

    static {
        d = 32;
        e = null;
        f = new RandomAccessFile[5];
        h = null;
        v = null;
        w = 1;
        x = null;
        y = null;
        i = null;
        z = null;
        A = null;
        C = null;
        D = null;
        j = null;
        n = true;
        o = "";
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.v.a$a.a();
        }
    }
}

