/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import rs.gui.b.a;
import rs.gui.b.c;
import rs.gui.b.f;
import rs.gui.b.h;

public class d {
    private h h;
    public static final String a = rs.v.a.b() + "loadouts";
    public static final String b = rs.v.a.b() + "loadout_temp";
    public static final String c = rs.v.a.b() + "loadout_temp_2";
    public static final String d = rs.v.a.b() + "loadout_temp_3";
    public static final String e = rs.v.a.b() + "loadout.conf";
    public static final String f = "order.settings";
    public static final String g = a + File.separator + "order.settings";

    public d(h h2) {
        this.h = h2;
    }

    private String b(String string, boolean bl) {
        if (bl) {
            return e;
        }
        return a + File.separator + string;
    }

    private String a(String string, int n2, boolean bl) {
        if (bl) {
            if (n2 == 1) {
                return b;
            }
            if (n2 == 2) {
                return c;
            }
            if (n2 == 3) {
                return d;
            }
            return b;
        }
        return a + File.separator + string + "_temp_2";
    }

    public void a(String string) {
        File file = new File(this.b(string, false));
        if (file.exists()) {
            file.delete();
        }
        for (int i2 = 1; i2 <= 3; ++i2) {
            file = new File(this.a(string, i2, false));
            if (!file.exists()) continue;
            file.delete();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<String> a() {
        File file;
        ArrayList<String> arrayList = new ArrayList<String>();
        File file2 = new File(a);
        if (!file2.exists()) {
            file2.mkdir();
        }
        if ((file = new File(g)).exists()) {
            Object object;
            Object object2;
            try {
                object2 = new BufferedReader(new FileReader(g));
                try {
                    object = ((BufferedReader)object2).readLine();
                    while (object != null) {
                        if (new File(this.b((String)object, false)).exists()) {
                            arrayList.add((String)object);
                        } else {
                            System.out.println("[WARNING!] [Loadouts] Attempted to load an invalid folder \"" + (String)object + "\" from order.settings!");
                        }
                        object = ((BufferedReader)object2).readLine();
                    }
                }
                finally {
                    ((BufferedReader)object2).close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            object2 = new ArrayList();
            for (File file3 : object = new File(a).listFiles()) {
                if (file3.getName().contains("_") || file3.getName().contains(".") || file3.getName().equalsIgnoreCase(f) || arrayList.contains(file3.getName())) continue;
                System.out.println("[WARNING!] [Loadouts] Folder \"" + file3.getName() + "\" missing from the order config! Adding to list..");
                arrayList.add(file3.getName());
            }
        } else {
            File[] fileArray;
            for (File file4 : fileArray = file2.listFiles()) {
                if (file4.getName().contains("_") || file4.getName().contains(".settings")) continue;
                arrayList.add(file4.getName());
            }
        }
        return arrayList;
    }

    public void b() {
        File file = new File(g);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            rs.gui.b.d d2 = this.h.f();
            for (String string : d2.keySet()) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void a(String string, List<a> list) {
        File file = new File(rs.v.a.b());
        File file2 = new File(this.b(string, false));
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
            for (a object2 : list) {
                rs.gui.b.b.c.a(dataOutputStream, object2);
            }
            dataOutputStream.close();
            String string2 = string + "_ver_5";
            File file3 = new File(a + File.separator + (String)string2);
            if (!file3.exists()) {
                file3.createNewFile();
            }
            for (File file4 : new File(a).listFiles()) {
                if (!file4.getName().startsWith(string + "_temp") && !file4.getName().startsWith(string + "_ver_") || file4.getName().equalsIgnoreCase(string2)) continue;
                file4.delete();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public c a(String string, boolean bl) {
        c c2 = new c(string);
        File file = new File(this.b(string, bl));
        File file2 = new File(this.a(string, 1, bl));
        File file3 = new File(this.a(string, 2, bl));
        File file4 = new File(this.a(string, 3, bl));
        if (!file2.exists() && bl) {
            file.delete();
        }
        try {
            if (file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                if (!bl) {
                    rs.gui.b.b.c.a(dataInputStream, c2);
                } else {
                    String string2 = "Default";
                    do {
                        int n2;
                        int n3;
                        int n4;
                        int n5 = dataInputStream.readInt();
                        byte[] byArray = new byte[n5];
                        dataInputStream.read(byArray);
                        string2 = new String(byArray);
                        a a2 = new a(string2);
                        if (file3.exists()) {
                            n4 = dataInputStream.readInt();
                            a2.a(a.a.a(n4));
                            n3 = dataInputStream.readInt();
                            a2.b(n3);
                            for (n2 = 0; n2 < a2.c().length; ++n2) {
                                int n6;
                                a2.c()[n2] = n6 = dataInputStream.readInt();
                            }
                        }
                        for (rs.gui.b.c.c c3 : rs.gui.b.c.c.values()) {
                            if (!file2.exists()) {
                                a2.a(c3, dataInputStream.readInt());
                                continue;
                            }
                            int n7 = dataInputStream.readInt();
                            int n8 = dataInputStream.readInt();
                            a2.a(c3, new f(n7, n8));
                        }
                        for (n4 = 0; n4 < a2.d().length; ++n4) {
                            if (!file2.exists()) {
                                a2.a(n4, new f(dataInputStream.readInt(), 1));
                                continue;
                            }
                            n3 = dataInputStream.readInt();
                            n2 = dataInputStream.readInt();
                            a2.a(n4, new f(n3, n2));
                        }
                        if (file4.exists()) {
                            n4 = dataInputStream.readInt();
                            a2.a(n4);
                        }
                        c2.add(a2);
                    } while (string2 != null);
                }
                dataInputStream.close();
            }
        }
        catch (EOFException eOFException) {
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return c2;
    }
}

