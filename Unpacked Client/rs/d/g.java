/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.d;

import gnu.trove.f.b.cc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import rs.d.k;
import rs.v.a;

public class g {
    private static final String b = rs.v.a.f() + "configs/old_i.dat";
    private static final Logger c = Logger.getLogger(g.class.getName());
    public static final List<String> a = new ArrayList<String>();

    public static void a() {
        if (!rs.f.a.d.booleanValue()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
            String string = bufferedReader.readLine();
            while (string != null) {
                a.add(string);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static cc<k> b() {
        cc cc2 = new cc();
        int n2 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
            String string = bufferedReader.readLine();
            k k2 = null;
            int n3 = 0;
            while (string != null) {
                ++n2;
                if (string.toLowerCase().contains("[item")) {
                    n3 = Integer.valueOf(string.toLowerCase().split("item ")[1].replace("]", ""));
                    cc2.a(n3, (Object)new k(k.a(n3, false, false)));
                    k2 = (k)cc2.b(n3);
                } else if (string.contains("=")) {
                    int n4;
                    String string2;
                    Object object;
                    if (k2 == null) {
                        c.info("Error! Detected mismatch at line: " + n2);
                        throw new IndexOutOfBoundsException();
                    }
                    string = string.replace(" = ", "=");
                    string = string.replace("= ", "=");
                    String string3 = string.toLowerCase().split("=")[0];
                    String string4 = string.split("=")[1];
                    if (string3.toLowerCase().contains("name")) {
                        k2.w = string4;
                    } else if (string3.toLowerCase().contains("modelid") || string3.toLowerCase().contains("groundmodel")) {
                        k2.A = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("clone")) {
                        k2 = new k((k)cc2.b(Integer.valueOf(string4).intValue()));
                        k2.i = n3;
                    } else if (string3.toLowerCase().contains("description")) {
                        k2.E = string4.getBytes();
                    } else if (string3.toLowerCase().contains("zoom")) {
                        k2.G = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("rotation1") || string3.toLowerCase().contains("rotationx")) {
                        k2.M = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("rotation2") || string3.toLowerCase().contains("rotationy")) {
                        k2.Z = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("offset1") || string3.toLowerCase().contains("offsetx")) {
                        k2.v = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("offset2") || string3.toLowerCase().contains("offsety")) {
                        k2.W = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("value")) {
                        k2.f = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint204") || string3.toLowerCase().contains("zan2d")) {
                        k2.ae = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint167")) {
                        k2.t = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint191")) {
                        k2.N = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint192")) {
                        k2.O = Integer.valueOf(string4);
                    } else if (string3.equalsIgnoreCase("texture")) {
                        k2.R = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("textureinvanim")) {
                        k2.U = Boolean.valueOf(string4);
                    } else if (string3.toLowerCase().contains("texturecolors") || string3.toLowerCase().contains("textureids")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i2 = 0; i2 < string2.split(",").length; ++i2) {
                            if (string2.split(",")[i2] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i2]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n4 = 0; n4 < object.size(); ++n4) {
                            nArray[n4] = (Integer)object.get(n4);
                        }
                        if (string3.toLowerCase().contains("textureids")) {
                            k2.T = nArray;
                        } else {
                            k2.S = nArray;
                        }
                    } else if (string3.toLowerCase().contains("anint165") || string3.toLowerCase().contains("male") && !string3.toLowerCase().contains("female")) {
                        if (string3.toLowerCase().contains("maleequip2") || string3.toLowerCase().contains("malemodel2")) {
                            k2.K = Integer.valueOf(string4);
                        } else {
                            k2.r = Integer.valueOf(string4);
                        }
                    } else if (string3.toLowerCase().contains("anint200") || string3.toLowerCase().contains("female")) {
                        if (string3.toLowerCase().contains("femaleequip2") || string3.toLowerCase().contains("femalemodel2")) {
                            k2.q = Integer.valueOf(string4);
                        } else {
                            k2.aa = Integer.valueOf(string4);
                        }
                    } else if ((string3.toLowerCase().contains("actions") || string3.toLowerCase().contains("options")) && !string3.toLowerCase().contains("ground")) {
                        object = new String[5];
                        string2 = string4;
                        for (int i3 = 0; i3 < string2.split(",").length && i3 < ((String[])object).length; ++i3) {
                            if (string2.split(",")[i3] == null || string2.split(",")[i3].equalsIgnoreCase("null")) continue;
                            object[i3] = string2.split(",")[i3];
                        }
                        k2.L = object;
                    } else if (string3.toLowerCase().contains("ground") || string3.toLowerCase().contains("floor")) {
                        object = new String[5];
                        string2 = string4;
                        for (int i4 = 0; i4 < string2.split(",").length && i4 < ((String[])object).length; ++i4) {
                            if (string2.split(",")[i4] == null || string2.split(",")[i4].equalsIgnoreCase("null")) continue;
                            object[i4] = string2.split(",")[i4];
                        }
                        k2.u = object;
                    } else if (string3.toLowerCase().contains("original")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i5 = 0; i5 < string2.split(",").length; ++i5) {
                            if (string2.split(",")[i5] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i5]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n4 = 0; n4 < object.size(); ++n4) {
                            nArray[n4] = (Integer)object.get(n4);
                        }
                        k2.h = nArray;
                    } else if (string3.toLowerCase().contains("modified")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i6 = 0; i6 < string2.split(",").length; ++i6) {
                            if (string2.split(",")[i6] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i6]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n4 = 0; n4 < object.size(); ++n4) {
                            nArray[n4] = (Integer)object.get(n4);
                        }
                        k2.g = nArray;
                    } else if (string3.toLowerCase().contains("stacks") || string3.toLowerCase().contains("stackids")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i7 = 0; i7 < string2.split(",").length; ++i7) {
                            if (string2.split(",")[i7] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i7]));
                        }
                        int[] nArray = new int[10];
                        for (n4 = 0; n4 < object.size(); ++n4) {
                            nArray[n4] = (Integer)object.get(n4);
                        }
                        k2.P = nArray;
                    } else if (string3.toLowerCase().contains("stackamounts")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i8 = 0; i8 < string2.split(",").length; ++i8) {
                            if (string2.split(",")[i8] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i8]));
                        }
                        int[] nArray = new int[10];
                        for (n4 = 0; n4 < object.size(); ++n4) {
                            nArray[n4] = (Integer)object.get(n4);
                        }
                        k2.ab = nArray;
                    } else if (string3.toLowerCase().contains("light")) {
                        k2.X = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("shadow")) {
                        k2.I = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("abyte205") || string3.toLowerCase().contains("mequipoffy")) {
                        k2.ag = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("mequipoffx")) {
                        k2.af = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("fequipoffx")) {
                        k2.ai = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("mequipoffz")) {
                        k2.ah = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("fequipoffz")) {
                        k2.aj = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("abyte154") || string3.toLowerCase().contains("fequipoffy")) {
                        k2.ak = (byte)Integer.valueOf(string4).intValue();
                    } else if ((string3.toLowerCase().contains("certid") || string3.toLowerCase().contains("note")) && !string3.toLowerCase().contains("template")) {
                        k2.F = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("template")) {
                        k2.p = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("stackable")) {
                        k2.C = Boolean.valueOf(string4);
                        k2.D = Boolean.valueOf(string4);
                    }
                }
                string = bufferedReader.readLine();
                cc2.a(n3, k2);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(n2);
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            System.out.println(n2);
            iOException.printStackTrace();
        }
        return cc2;
    }
}

