/*
 * Decompiled with CFR 0.152.
 */
package rs.n;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.Client;
import rs.d.d;
import rs.d.h;
import rs.d.k;
import rs.d.m;
import rs.d.r;
import rs.d.x;
import rs.e;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.f.a.i.b;
import rs.l.j;
import rs.n.c.ac;
import rs.o_0;
import rs.x.f;

public class a {
    private static final CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList();
    private static boolean b = false;

    public static void a(Client client, String string, String[] stringArray) {
        switch (string.toLowerCase()) {
            case "checkscreen": {
                System.out.println(Client.aj + "x" + Client.ak);
                break;
            }
            case "repack": {
                Client.ew.a();
                f f2 = Launcher.n().o().a(2, "config", "config", Launcher.n().o().eE[2], 30);
                if (f2 != null) {
                    rs.d.a.a(f2);
                    x.a(f2);
                }
                Launcher.n().o().b(true);
                break;
            }
            case "gfxdata": {
                x x2 = x.c[Integer.parseInt(stringArray[0])];
                System.out.println("GFX " + x2.d + ": model: " + x2.e + ", anim:" + x2.f);
                break;
            }
            case "animdata": {
                rs.d.a a2 = rs.d.a.a[Integer.parseInt(stringArray[0])];
                System.out.println("frames: " + Arrays.toString(a2.e));
                System.out.println("frameDurations: " + Arrays.toString(a2.g));
                break;
            }
            case "macaddress": {
                try {
                    Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
                    while (enumeration.hasMoreElements()) {
                        NetworkInterface networkInterface = enumeration.nextElement();
                        byte[] byArray = networkInterface.getHardwareAddress();
                        if (byArray == null) continue;
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int i2 = 0; i2 < byArray.length; ++i2) {
                            stringBuilder.append(String.format("%02X%s", byArray[i2], i2 < byArray.length - 1 ? "-" : ""));
                        }
                        System.out.println(stringBuilder.toString());
                    }
                    break;
                }
                catch (SocketException socketException) {
                    socketException.printStackTrace();
                    break;
                }
            }
            case "dumpclip": {
                int n2 = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (String string2 : stringArray) {
                    arrayList.add(Integer.parseInt(string2));
                }
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    int n3 = (Integer)iterator.next();
                    long l2 = System.currentTimeMillis();
                    client.c(n3);
                    e.b();
                    e.a();
                    long l3 = System.currentTimeMillis() - l2;
                    System.out.println("Progress: " + ++n2 + "/" + arrayList.size() + " (" + l3 + " ms)");
                }
                break;
            }
            case "tipint": {
                int n4 = Integer.parseInt(stringArray[0]);
                rs.l.f.a.i.e e2 = rs.l.f.a.i.e.valueOf(stringArray[1].toUpperCase());
                int n5 = 0;
                int n6 = 0;
                int n7 = rs.n.e.H[n4].P;
                int n8 = rs.n.e.H[n4].P;
                if (rs.n.e.H[n4].E != null) {
                    n7 = rs.n.e.H[n4].E.n;
                    n8 = rs.n.e.H[n4].E.o;
                }
                switch (e2) {
                    case b: {
                        n5 = -30;
                        n6 = n8 / 2 - 15;
                        break;
                    }
                    case a: {
                        n5 = n7 + 30;
                        n6 = n8 / 2 - 15;
                    }
                }
                rs.l.f.a.i.b.a(n4, e2, n5, n6);
                rs.l.f.a.i.b.k().b(true);
                break;
            }
            case "acc": {
                rs.l.f.e.d().h().a(stringArray[0], stringArray[1], stringArray[2]);
                break;
            }
            case "particle": {
                rs.l.f.e.d().g().b(20, 77, 125, 16764195);
                rs.l.f.e.d().g().b(10, 77, 125, 65315);
                break;
            }
            case "dumpcommands": {
                try {
                    String string3;
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("commands.txt")));
                    int n9 = -1;
                    while ((string3 = bufferedReader.readLine()) != null) {
                        Object object = string3;
                        if (!((String)object).startsWith("::")) {
                            object = "::" + (String)object;
                        }
                        Client.fv.a(103);
                        Client.fv.b(((String)object).length() - 1);
                        Client.fv.a(((String)object).substring(2));
                    }
                    bufferedReader.close();
                    break;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    throw new RuntimeException(fileNotFoundException);
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
            case "test": {
                short[] sArray;
                for (short s2 : sArray = new short[]{-27417, -27423, -32479, -32484, -32725, -32593}) {
                    System.out.print(s2 + 65534 + ",");
                }
                break;
            }
            case "region": {
                int n10 = Integer.parseInt(stringArray[0]);
                System.out.println("Searcing regions..");
                for (int i3 = 0; i3 < Client.ew.n.length; ++i3) {
                    if (Client.ew.n[i3] != n10) continue;
                    System.out.println("--- IDX " + i3 + " ----");
                    System.out.println("region: " + Client.ew.n[i3]);
                    System.out.println("map file id: " + Client.ew.l[i3]);
                    System.out.println("landscape file id: " + Client.ew.i[i3]);
                    System.out.println();
                }
                break;
            }
            case "mapfile": {
                int n11 = Integer.parseInt(stringArray[0]);
                System.out.println("Searcing regions..");
                for (int i4 = 0; i4 < Client.ew.n.length; ++i4) {
                    if (Client.ew.l[i4] != n11 && Client.ew.i[i4] != n11) continue;
                    System.out.println("--- IDX " + i4 + " ----");
                    System.out.println("region: " + Client.ew.n[i4]);
                    System.out.println("map file id: " + Client.ew.l[i4]);
                    System.out.println("landscape file id: " + Client.ew.i[i4]);
                    System.out.println();
                }
                break;
            }
            case "resetnpcdefs": {
                rs.h.f.b = true;
                break;
            }
            case "topbar": {
                ac.c(Boolean.parseBoolean(stringArray[0]));
                break;
            }
            case "botbar": {
                ac.d(Boolean.parseBoolean(stringArray[0]));
                break;
            }
            case "colors": {
                if (k.f(Integer.parseInt(stringArray[0])) == null) {
                    client.a("Can't find item definition!", 0, "");
                    break;
                }
                rs.a.h h2 = new rs.a.h(k.f((int)Integer.parseInt((String)stringArray[0])).A);
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                if (h2 != null && h2.ar != null) {
                    int n12;
                    for (n12 = 0; n12 < h2.ah; ++n12) {
                        if (arrayList.contains(h2.ar[n12])) continue;
                        arrayList.add(h2.ar[n12]);
                    }
                    for (n12 = 0; n12 < arrayList.size(); ++n12) {
                        client.a("[" + n12 + "] = " + String.valueOf(arrayList.get(n12)), 0, "");
                        System.out.print(String.valueOf(arrayList.get(n12)) + ", ");
                    }
                    break;
                }
                client.a("Can't find item model! ", 0, "");
                break;
            }
            case "friends": {
                for (int i5 = 197; i5 < 350; ++i5) {
                    client.a(o_0.a("Buddy " + i5));
                }
                break;
            }
            case "disconnect": {
                System.out.println("breakpoint");
                break;
            }
            case "clearchat": {
                for (int i6 = 0; i6 < 200; ++i6) {
                    client.dz[i6] = 0;
                    client.dA[i6] = 0;
                    client.dB[i6] = null;
                    client.dC[i6] = null;
                    client.dD[i6] = false;
                }
                break;
            }
            case "itemhovers": {
                try {
                    m.a();
                }
                catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                client.a("<img=2> Item hover descriptions reloaded!", 0, "");
                break;
            }
            case "objectdef": {
                r r2 = r.c(Integer.parseInt(stringArray[0]));
                System.out.println("objectDef.anIntArray773 = " + Arrays.toString(r2.an));
                System.out.println("objectDef.originalModelColors = " + Arrays.toString(r2.W));
                System.out.println("objectDef.modifiedModelColors = " + Arrays.toString(r2.ax));
                System.out.println("objectDef.anInt781 = " + r2.au);
                System.out.println("objectDef.sizeX = " + r2.U);
                System.out.println("objectDef.sizeY = " + r2.af);
                break;
            }
            case "noteable": {
                int n13 = 24243;
                int[] nArray = new int[]{3268};
                for (int i7 = 0; i7 < nArray.length; ++i7) {
                    System.out.println("[ITEM " + (n13 + i7) + "]");
                    System.out.println("actions=null,null,null,null,Drop");
                    System.out.println("modelId=2789");
                    System.out.println("template=799");
                    System.out.println("certid=" + nArray[i7]);
                }
                break;
            }
            case "int": {
                int n14;
                int n15;
                int n16;
                if (stringArray.length == 0 || stringArray[0].equalsIgnoreCase("reload")) {
                    client.a();
                    client.a("Interfaces reloaded.", 0, "");
                    break;
                }
                if (stringArray[0].equalsIgnoreCase("edit")) {
                    if (rs.l.e.f.i.f() && stringArray.length == 0) {
                        rs.l.e.f.i.a(false);
                    } else {
                        rs.l.e.f.i.a(true);
                        rs.l.e.f.i.b(stringArray.length == 0 ? 0 : Integer.parseInt(stringArray[1]));
                    }
                }
                if (stringArray[0].equalsIgnoreCase("check")) {
                    n16 = Integer.parseInt(stringArray[1]);
                    n15 = stringArray.length == 3 ? Integer.parseInt(stringArray[2]) : n16;
                    System.out.println("Checking availablility for interface ID(s) " + n16 + " to " + n15 + "...");
                    for (n14 = n16; n14 <= n15; ++n14) {
                        if (rs.n.e.H[n14] != null) {
                            System.out.println("[WARNING] Interface ID " + n14 + " is in use!");
                            continue;
                        }
                        System.out.println("[!!!!] Interface ID " + n14 + " is free for use!");
                    }
                    System.out.println("..Check complete!");
                }
                if (stringArray[0].equalsIgnoreCase("setmedia")) {
                    n16 = Integer.parseInt(stringArray[1]);
                    rs.n.e.H[n16].af = n15 = Integer.parseInt(stringArray[2]);
                }
                if (stringArray[0].equalsIgnoreCase("setmessage")) {
                    String string4;
                    n16 = Integer.parseInt(stringArray[1]);
                    rs.n.e.H[n16].at = string4 = stringArray[2];
                }
                if (stringArray[0].equalsIgnoreCase("print")) {
                    n16 = Integer.parseInt(stringArray[1]);
                    rs.n.e e3 = rs.n.e.H[n16];
                    System.out.println();
                    System.out.print("type = " + e3.aI + ";\n");
                    switch (e3.aI) {
                        case 6: {
                            System.out.print("mediaID = " + e3.af + ";\n");
                            System.out.print("width = " + e3.P + ";\n");
                            System.out.print("height = " + e3.aR + ";\n");
                            System.out.print("modelZoom = " + e3.aT + ";\n");
                            System.out.print("modelRotation1 = " + e3.aU + ";\n");
                            System.out.print("modelRotation2 = " + e3.aV + ";\n");
                            System.out.print("anInt233 = " + e3.ae + ";\n");
                        }
                    }
                    System.out.println();
                    if (e3.az != null) {
                        System.out.println("inv = new int[" + e3.az.length + "];");
                        System.out.println("invStackSizes = new int[" + e3.ax.length + "];");
                        System.out.println("actions = new String[] {" + Arrays.toString(e3.W).replace("[", "").replace("]", "") + "};");
                        System.out.println("width = " + e3.P + ";");
                        System.out.println("height = " + e3.aR + ";");
                        System.out.println("invSpritePadX = " + e3.ac + ";");
                        System.out.println("invSpritePadY = " + e3.ap + ";");
                        System.out.println("invSpriteSize = " + e3.bD + ";");
                    } else if (e3.al != null) {
                        System.out.println("children = new int[] {" + Arrays.toString(e3.al).replace("[", "").replace("]", "") + "};");
                        System.out.println("childX = new int[] {" + Arrays.toString(e3.am).replace("[", "").replace("]", "") + "};");
                        System.out.println("childY = new int[] {" + Arrays.toString(e3.bc).replace("[", "").replace("]", "") + "};");
                    }
                    System.out.println();
                }
                if (stringArray[0].equalsIgnoreCase("showall") || stringArray[0].equalsIgnoreCase("show")) {
                    boolean bl = rs.f.a.an = !rs.f.a.an;
                }
                if (stringArray[0].equalsIgnoreCase("find_model")) {
                    // empty if block
                }
                if (!stringArray[0].equalsIgnoreCase("find_empty")) break;
                n16 = 1;
                if (stringArray.length > 1) {
                    n16 = Integer.parseInt(stringArray[1]);
                }
                for (int i8 = 30000; i8 <= 70000; ++i8) {
                    n14 = 0;
                    if (rs.n.e.H[i8] != null) continue;
                    n14 = 1;
                    for (int i9 = 1; i9 < n16; ++i9) {
                        if (rs.n.e.H[i8 + n16] == null) continue;
                        n14 = 0;
                    }
                    if (n14 == 0) continue;
                    System.out.println("Found a range of " + n16 + " free interface IDS: " + i8 + " -> " + (i8 + n16));
                    i8 += n16;
                }
                client.a();
                client.a("Interfaces reloaded.", 0, "");
                break;
            }
            case "checkthing": {
                System.out.println("modelZoom = " + rs.n.e.H[4883].aT);
                System.out.println("modelRotation1 = " + rs.n.e.H[4883].aU);
                System.out.println("modelRotation2 = " + rs.n.e.H[4883].aV);
                break;
            }
            case "dumpitems": {
                client.a(false);
                break;
            }
            case "resetgraphs": {
                client.b();
                break;
            }
            case "itemdef": {
                if (stringArray[0].equalsIgnoreCase("reset")) {
                    rs.h.f.a = true;
                    break;
                }
                int n17 = Integer.valueOf(stringArray[0]);
                k k2 = k.f(n17);
                System.out.println();
                System.out.println("[ITEM " + n17 + "]");
                System.out.println("modelID=" + k2.A);
                if (k2.r > 0) {
                    System.out.println("maleEquip1=" + k2.r);
                }
                if (k2.K > 0) {
                    System.out.println("maleEquip2=" + k2.K);
                }
                if (k2.aa > 0) {
                    System.out.println("femaleEquip1=" + k2.aa);
                }
                if (k2.q > 0) {
                    System.out.println("femaleEquip2=" + k2.q);
                }
                System.out.println("certID=" + k2.F);
                System.out.println("templateID=" + k2.p);
                System.out.println("rotationX=" + k2.M);
                System.out.println("rotationY=" + k2.Z);
                System.out.println("zoom=" + k2.G);
                System.out.println("offset1=" + k2.v);
                System.out.println("offset2=" + k2.W);
                System.out.println("contrast=" + k2.I);
                System.out.println("ambient=" + k2.X);
                if (k2.o != -1) {
                    System.out.println("anInt162=" + k2.o);
                }
                if (k2.ae != 0) {
                    System.out.println("anInt204=" + k2.ae);
                }
                if (k2.h != null) {
                    System.out.println("modifiedModelColors=" + Arrays.toString(k2.g).replace("[", "").replace("]", "").replace(" ", ""));
                    System.out.println("originalModelColors=" + Arrays.toString(k2.h).replace("[", "").replace("]", "").replace(" ", ""));
                }
                if (k2.P != null) {
                    System.out.println("stackIds=" + Arrays.toString(k2.P).replace("[", "").replace("]", "").replace(" ", ""));
                    System.out.println("stackAmounts=" + Arrays.toString(k2.ab).replace("[", "").replace("]", "").replace(" ", ""));
                }
                Client.M();
                System.out.println();
                break;
            }
            case "entitydef": {
                int n18 = Integer.valueOf(stringArray[0]);
                d d2 = d.c(n18);
                System.out.println("entityDef.standAnim = " + d2.w + ";");
                System.out.println("entityDef.walkAnim = entityDef.anInt55 = entityDef.anInt83 = entityDef.anInt58 = " + d2.q + ";");
                System.out.println("entityDef.anInt86 = " + d2.E + ";");
                System.out.println("entityDef.anInt91 = " + d2.I + ";");
                System.out.println("entityDef.anIntArray94 = new int[] " + Arrays.toString(d2.L).replace("[", "{").replace("]", "}") + ";");
                System.out.println("entityDef.anIntArray70 = new int[] " + Arrays.toString(d2.s).replace("[", "{").replace("]", "}") + ";");
                System.out.println("entityDef.anIntArray76 = new int[] " + Arrays.toString(d2.v).replace("[", "{").replace("]", "}") + ";");
                break;
            }
            case "texture": 
            case "textures": {
                rs.l.e.f.j.r = true;
                rs.l.e.f.j.s = 0;
                break;
            }
            case "gpuinv": {
                rs.k.e cfr_ignored_0 = client.a;
                rs.k.e.a(true);
            }
        }
    }

    public static void b(Client client, String string, String[] stringArray) {
        switch (string.toLowerCase()) {
            case "cmdmode": 
            case "chatcmd": 
            case "chatcmdmode": {
                if (!j.a(Client.cT)) break;
                rs.f.a.O = !rs.f.a.O;
                client.a("<img=2> Chat command mode has been: " + (rs.f.a.O ? "@dgr@<img=24>ENABLED" : "@dre@<img=25>DISABLED"), 0, "");
                if (!rs.f.a.O) break;
                client.a("<img=2> Type @dpu@chatcmd@bla@ to toggle it back off!", 0, "");
                break;
            }
            case "hween": 
            case "snow": 
            case "winter": 
            case "xmas": 
            case "summer": 
            case "darkwinter": 
            case "darkxmas": {
                if (Client.ed == 197) {
                    client.a("@dre@<img=25> You can't enter this command in the wilderness!", 0, "");
                    return;
                }
                a.b b2 = a.b.b;
                String string2 = "winter";
                if (string.toLowerCase().equalsIgnoreCase("hween")) {
                    b2 = a.b.d;
                    string2 = "h'ween";
                }
                if (string.toLowerCase().equalsIgnoreCase("summer")) {
                    b2 = a.b.e;
                    string2 = "summer";
                }
                if (string.toLowerCase().equalsIgnoreCase("darkwinter") || string.toLowerCase().equalsIgnoreCase("darkxmas")) {
                    b2 = a.b.c;
                    string2 = "dark winter";
                }
                rs.f.a.r = rs.f.a.r != b2 ? b2 : a.b.a;
                rs.f.a.p = rs.f.a.r == rs.f.a.o ? null : rs.f.a.r;
                rs.f.a.d();
                f f2 = client.a(2, "config", "config", client.eE[2], 30);
                client.a("<img=6> You've " + (rs.f.a.r == a.b.e ? "enabled" : "disabled") + " " + string2 + " mode! Re-enter the command @blu@::summer@bla@ again to toggle.", 0, null);
                h.a(f2);
                if (client.fr != null && !client.bI) {
                    Client.ee = 1;
                    break;
                }
                client.bI = false;
                break;
            }
            case "renderself": {
                boolean bl = rs.f.a.N = !rs.f.a.N;
                if (rs.f.a.N) {
                    client.a("@dgr@<img=6> Display of your character has been enabled.", 0, "");
                    break;
                }
                client.a("@dre@<img=40> Your character is now hidden (only on your screen, not others!)", 0, "");
                break;
            }
            case "multi": {
                boolean bl = rs.f.a.aX = !rs.f.a.aX;
                if (rs.f.a.aX) {
                    client.a("@dgr@<img=24> Wildy minimap multi lines in the minimap will now show", 0, "");
                } else {
                    client.a("@dre@<img=25> Wild minimap multi lines in the minimap will now be hidden", 0, "");
                }
                client.a("@blu@<img=6> NOTE: Changes will not take effect until your map reloads!", 0, "");
                rs.f.a.d();
            }
        }
    }

    public static void a(Client client, String string, int n2) {
        if (string.isEmpty()) {
            return;
        }
        if (!(string = string.replace("::", "")).contains(" ")) {
            rs.n.a.b(client, string, new String[0]);
            if (j.b(n2)) {
                rs.n.a.a(client, string, new String[0]);
            }
            return;
        }
        String[] stringArray = string.split(" ");
        String[] stringArray2 = new String[]{};
        if (stringArray.length > 1) {
            stringArray2 = new String[stringArray.length - 1];
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                stringArray2[i2 - 1] = stringArray[i2];
            }
        }
        rs.n.a.b(client, stringArray[0], stringArray2);
        if (j.b(n2)) {
            rs.n.a.a(client, stringArray[0], stringArray2);
        }
    }

    public static void a(String string) {
        a.add(string);
    }

    public static void a() {
        if (a.isEmpty()) {
            return;
        }
        for (String string : a) {
            Launcher.n().o();
            Client.fv.a(103);
            Launcher.n().o();
            Client.fv.b(string.length() - 1);
            Launcher.n().o();
            Client.fv.a(string.substring(2));
        }
        a.clear();
    }
}

