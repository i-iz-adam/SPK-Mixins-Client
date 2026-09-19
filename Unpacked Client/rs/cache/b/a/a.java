/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rs.cache.b.b;
import rs.cache.b.d;
import rs.cache.b.e;

public class a
extends d {
    private static final String e = rs.f.a.m + "cache.zip";
    private static final String f = rs.v.a.f();
    private static final String g = "cache.zip";
    private e h = new e("cache_version");

    public a() {
        super("Cache");
    }

    @Override
    public boolean a() {
        try {
            rs.cache.b.a.a.b(new File(f));
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < f.length(); ++i2) {
                if (i2 == f.length() - 1) continue;
                stringBuilder.append(f.charAt(i2));
            }
            String string = stringBuilder.toString();
            URL uRL = new URL(e);
            File file = new File(string);
            file.mkdirs();
            rs.cache.a.a a2 = new rs.cache.a.a(this.c, "Downloading main game assets..", uRL, new File(file.getAbsolutePath() + File.separator + g));
            File file2 = a2.b();
            if (file2 != null) {
                if (!this.b(file.getAbsolutePath(), file2)) {
                    this.a(rs.cache.b.b.b);
                    return false;
                }
                File file3 = new File(rs.cache.b.e.c);
                if (file3.exists()) {
                    file3.delete();
                }
                file2.delete();
                return true;
            }
            this.a(rs.cache.b.b.b);
            return false;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public e b() {
        return this.h;
    }

    private boolean b(String string, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipEntry = null;
            String[] stringArray = new String[]{"sprites", "configs"};
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                int n2;
                File file2 = new File(string + "/" + zipEntry.getName());
                if (file2.exists()) {
                    file2.delete();
                }
                boolean bl = false;
                Object object = stringArray;
                int n3 = ((String[])object).length;
                for (n2 = 0; n2 < n3; ++n2) {
                    String string2 = object[n2];
                    if (!zipEntry.getName().equalsIgnoreCase(string2) && (file2.getParentFile() == null || !file2.getName().equalsIgnoreCase(string2))) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
                if (zipEntry.isDirectory()) {
                    System.out.println("Making directory: " + file2.getName() + " (" + zipEntry.getName() + ")");
                    file2.mkdirs();
                    continue;
                }
                if (file2.getParentFile() != null && !((File)(object = file2.getParentFile())).exists()) {
                    System.out.println("Making parent directory: " + ((File)object).getAbsolutePath());
                    ((File)object).mkdirs();
                }
                object = new FileOutputStream(file2);
                byte[] byArray = new byte[4098];
                n2 = 0;
                while ((n2 = zipInputStream.read(byArray)) > 0) {
                    ((FileOutputStream)object).write(byArray, 0, n2);
                }
                ((FileOutputStream)object).close();
            }
            zipInputStream.close();
            return true;
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return false;
    }

    public static boolean b(File file) {
        File[] fileArray;
        if (file.exists() && null != (fileArray = file.listFiles())) {
            for (int i2 = 0; i2 < fileArray.length; ++i2) {
                if (fileArray[i2].isDirectory()) {
                    rs.cache.b.a.a.b(fileArray[i2]);
                    continue;
                }
                fileArray[i2].delete();
            }
        }
        return file.delete();
    }

    @Override
    public boolean f() {
        return true;
    }
}

