/*
 * Decompiled with CFR 0.152.
 */
package rs.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class a {
    private static String a = null;

    public static final String a() {
        if (a == null) {
            rs.secure.a.b();
        }
        if (a == null) {
            rs.secure.a.c();
        }
        return a;
    }

    private static BufferedReader a(String string) {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec(string.split(" "));
        }
        catch (IOException iOException) {
            return null;
        }
        outputStream = process.getOutputStream();
        inputStream = process.getInputStream();
        try {
            outputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b() {
        String string = null;
        String string2 = "Serial Number:";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = rs.secure.a.a("dmidecode -t system");
            if (bufferedReader != null) {
                while ((string = bufferedReader.readLine()) != null) {
                    if (string.indexOf(string2) == -1) continue;
                    a = string.split(string2)[1].trim();
                    break;
                }
            }
            if (bufferedReader == null) return;
        }
        catch (IOException iOException) {
            if (bufferedReader == null) return;
            try {
                bufferedReader.close();
                return;
            }
            catch (IOException iOException2) {
                // empty catch block
            }
            return;
        }
        catch (Throwable throwable) {
            if (bufferedReader == null) throw throwable;
            try {
                bufferedReader.close();
                throw throwable;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            throw throwable;
        }
        try {
            bufferedReader.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void c() {
        block12: {
            String string = null;
            String string2 = "system.hardware.serial =";
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = rs.secure.a.a("lshal");
                if (bufferedReader == null) break block12;
                while ((string = bufferedReader.readLine()) != null) {
                    if (string.indexOf(string2) == -1) continue;
                    a = string.split(string2)[1].replaceAll("\\(string\\)|(\\')", "").trim();
                    break;
                }
            }
            catch (IOException iOException) {
            }
            finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }
}

