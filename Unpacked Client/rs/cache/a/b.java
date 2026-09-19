/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class b {
    private URL d;
    private File e;
    protected int a;
    protected long b;
    protected int c;

    public b(URL uRL, File file) {
        this.d = uRL;
        this.e = file;
    }

    public File b() {
        try {
            if (this.e.exists()) {
                System.out.println("Deleting " + this.e.getAbsolutePath());
                this.e.delete();
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.d.openStream(), 16384);
            FileOutputStream fileOutputStream = new FileOutputStream(this.e);
            byte[] byArray = new byte[16384];
            HttpURLConnection httpURLConnection = (HttpURLConnection)this.d.openConnection();
            this.c = httpURLConnection.getContentLength();
            System.out.println(this.c);
            httpURLConnection.disconnect();
            this.b = System.currentTimeMillis();
            int n2 = 0;
            int n3 = 0;
            while ((n2 = ((InputStream)bufferedInputStream).read(byArray)) > -1) {
                fileOutputStream.write(byArray, 0, n2);
                this.a += n2;
                this.a();
                if ((n3 += n2) <= 0x100000) continue;
                n3 = 0;
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            return this.e;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public abstract void a();
}

