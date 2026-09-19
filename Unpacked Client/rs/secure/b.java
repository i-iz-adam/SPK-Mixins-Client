/*
 * Decompiled with CFR 0.152.
 */
package rs.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class b {
    private static String a = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final String a() {
        if (a != null) {
            return a;
        }
        OutputStream outputStream = null;
        InputStream inputStream = null;
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String string = null;
        String string2 = "Serial Number";
        try {
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains(string2)) continue;
                a = string.split(":")[1].trim();
                break;
            }
        }
        catch (IOException iOException) {
            String string3 = null;
            return string3;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (a != null) {
            a = "MACOSX " + a;
        }
        return a;
    }
}

