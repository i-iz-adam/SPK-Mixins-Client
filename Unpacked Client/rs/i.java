/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class i {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;

    public static final byte[] a(String string) {
        try {
            File file = new File(string);
            int n2 = (int)file.length();
            byte[] byArray = new byte[n2];
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(string)));
            dataInputStream.readFully(byArray, 0, n2);
            dataInputStream.close();
            ++a;
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static final byte[] a(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[16384];
        while ((n2 = inputStream.read(byArray, 0, byArray.length)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n2);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static final void a(String string, byte[] byArray) {
        try {
            new File(new File(string).getParent()).mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            fileOutputStream.write(byArray, 0, byArray.length);
            fileOutputStream.close();
            ++b;
            ++c;
        }
        catch (Throwable throwable) {
            System.out.println("Write Error: " + string);
        }
    }

    public static boolean b(String string) {
        File file = new File(string);
        return file.exists();
    }
}

