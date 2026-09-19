/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rs.Client;
import rs.cache.b.b;
import rs.cache.b.e;

public abstract class d {
    private static final int e = 4098;
    protected static final int a = -1;
    protected final List<String> b = new ArrayList<String>();
    protected Client c;
    protected final String d;

    public d(String string) {
        this.d = string;
    }

    public abstract boolean a();

    public abstract e b();

    public List<String> c() {
        return this.b;
    }

    protected void a(String string) {
        this.b.add(string);
    }

    protected void a(b b2) {
        this.a(b2.a());
    }

    protected int a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            return this.a(bufferedReader);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return -1;
    }

    protected int b(String string) {
        try {
            URL uRL = new URL(string);
            InputStreamReader inputStreamReader = new InputStreamReader(uRL.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            try {
                return this.a(bufferedReader);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return -1;
    }

    protected boolean a(String string, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipEntry = null;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                Object object;
                File file2 = new File(string + "/" + zipEntry.getName());
                if (file2.exists()) {
                    file2.delete();
                }
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
                int n2 = 0;
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

    public String d() {
        return this.d;
    }

    public void a(Client client) {
        this.c = client;
    }

    public boolean e() {
        return this.b().c() != this.b().b();
    }

    public abstract boolean f();

    private int a(BufferedReader bufferedReader) {
        String string = bufferedReader.readLine();
        bufferedReader.close();
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            return -1;
        }
    }
}

