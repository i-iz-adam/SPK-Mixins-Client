/*
 * Decompiled with CFR 0.152.
 */
package rs.secure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import rs.v.a;

public class c {
    private static final int c = 7;
    private static final int d = 10;
    public static String a = null;
    public static boolean b = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a() {
        if (b) {
            return a;
        }
        String string = null;
        Process process = null;
        try {
            process = rs.secure.c.a("cmd /c systeminfo", 7);
            string = rs.secure.c.a(process);
        }
        catch (Exception exception) {
            if (rs.f.a.d.booleanValue()) {
                exception.printStackTrace();
            }
        }
        finally {
            if (process != null) {
                process.destroy();
            }
        }
        if (rs.v.a.a(string)) {
            try {
                String string2 = "powershell.exe -Command \"(Get-CimInstance Win32_OperatingSystem).InstallDate.ToString('yyyyMMddHHmmss.ffffff')\"";
                process = rs.secure.c.a(string2, 10);
                string = rs.secure.c.b(process);
            }
            catch (Exception exception) {
                if (rs.f.a.d.booleanValue()) {
                    exception.printStackTrace();
                }
            }
            finally {
                if (process != null) {
                    process.destroy();
                }
            }
        }
        a = string;
        b = true;
        return null;
    }

    private static Process a(String string, int n2) {
        Process process = Runtime.getRuntime().exec(string);
        if (n2 > 0 && !process.waitFor(n2, TimeUnit.SECONDS)) {
            process.destroy();
            System.out.println("System Info command timed out.");
            return null;
        }
        return process;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String a(Process process) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));){
            String string;
            String string2 = null;
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains("Original Install Date")) continue;
                string2 = string.substring(string.indexOf(":") + 1).trim();
                break;
            }
            if (string2 != null) {
                Date date = rs.secure.c.a(string2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH);
                String string3 = simpleDateFormat.format(date);
                int n2 = TimeZone.getDefault().getOffset(date.getTime());
                int n3 = n2 / 60000;
                String string4 = String.format("%+04d", n3);
                String string5 = "WINDOWS " + string3 + string4;
                return string5;
            }
            System.out.println("Install date not found.");
        }
        finally {
            process.destroy();
        }
        return null;
    }

    private static String b(Process process) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).isEmpty()) continue;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date date = simpleDateFormat.parse(string);
                int n2 = TimeZone.getDefault().getOffset(date.getTime());
                int n3 = n2 / 60000;
                String string2 = String.format("%+d", n3);
                String string3 = "WINDOWS " + string + string2;
                return string3;
            }
        }
        return null;
    }

    public static Date a(String string) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(3, 2, Locale.getDefault());
        try {
            return dateFormat.parse(string);
        }
        catch (ParseException parseException) {
            DateFormat[] dateFormatArray;
            for (DateFormat dateFormat2 : dateFormatArray = new DateFormat[]{new SimpleDateFormat("MM/dd/yyyy, hh:mm:ss a", Locale.US), new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.UK), new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss", Locale.CHINA)}) {
                try {
                    return dateFormat2.parse(string);
                }
                catch (ParseException parseException2) {
                }
            }
            throw parseException;
        }
    }
}

