/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import rs.cache.b.f;
import rs.v.a;

public class e {
    public static final double a = -1.0;
    public static final String b = rs.f.a.m + "versions.txt";
    public static final String c = rs.v.a.f() + "versions.dat";
    private String d;
    private String e;

    public e(String string) {
        this.e = c;
        this.d = string;
    }

    public e(String string, String string2) {
        this.e = string;
        this.d = string2;
    }

    public boolean a() {
        try {
            Closeable closeable;
            File file = new File(this.e);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (file.exists()) {
                closeable = new BufferedReader(new FileReader(file));
                Object object = null;
                while ((object = ((BufferedReader)closeable).readLine()) != null) {
                    if (this.a((String)object)) continue;
                    arrayList.add(object);
                }
                ((BufferedReader)closeable).close();
            } else {
                file.createNewFile();
            }
            closeable = new BufferedWriter(new FileWriter(file));
            for (String string : arrayList) {
                ((Writer)closeable).write(string);
                ((BufferedWriter)closeable).newLine();
            }
            ((Writer)closeable).write(this.d + " = " + this.b());
            ((BufferedWriter)closeable).close();
            return true;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    public double b() {
        try {
            URL uRL = new URL(b);
            InputStream inputStream = uRL.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            Double d2 = this.a(bufferedReader);
            bufferedReader.close();
            return d2;
        }
        catch (IOException iOException) {
            JLabel jLabel = new JLabel();
            Font font = jLabel.getFont();
            StringBuffer stringBuffer = new StringBuffer("font-family:" + font.getFamily() + ";");
            stringBuffer.append("font-weight:" + (font.isBold() ? "bold" : "normal") + ";");
            stringBuffer.append("font-size:" + font.getSize() + "pt;");
            String string = "There was an issue connecting to the server!<br>Here are some possible issues and solutions: <br><br>1. (MOST LIKELY) You may not be connected to the internet! Be sure to verify that you are in fact<br>connected to the internet, and that you're not having any network issues.<br><br>2. SpawnPK may be offline or having issues, for more information you can go <a href=\"http://spawnpk.net/forums/\">here</a>.";
            JEditorPane jEditorPane = new JEditorPane("text/html", "<html><body style=\"" + stringBuffer + "\">" + string + "</body></html>");
            jEditorPane.addHyperlinkListener(new f(this));
            jEditorPane.setEditable(false);
            jEditorPane.setBackground(jLabel.getBackground());
            JOptionPane.showMessageDialog(null, jEditorPane);
            iOException.printStackTrace();
            return -1.0;
        }
    }

    public double c() {
        try {
            File file = new File(this.e);
            if (!file.exists()) {
                return -1.0;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            double d2 = this.a(bufferedReader);
            bufferedReader.close();
            return d2;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return -1.0;
        }
    }

    public String d() {
        return this.d;
    }

    private double a(BufferedReader bufferedReader) {
        try {
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replace("= ", "=").replace(" =", "=");
                String[] stringArray = string.split("=");
                try {
                    if (!stringArray[0].equalsIgnoreCase(this.d)) continue;
                    try {
                        return Double.parseDouble(stringArray[1]);
                    }
                    catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return -1.0;
    }

    private boolean a(String string) {
        string = string.replace("= ", "=").replace(" =", "=");
        String[] stringArray = string.split("=");
        try {
            return stringArray[0].equalsIgnoreCase(this.d);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}

