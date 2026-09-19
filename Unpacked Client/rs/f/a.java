/*
 * Decompiled with CFR 0.152.
 */
package rs.f;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import rs.Client;
import rs.l.e_0;
import rs.n.c.ap;
import rs.v_0;

public final class a {
    public static final a a = rs.f.a$a.a;
    public static final Integer b = 43594;
    public static final Integer c = 307;
    public static final Boolean d = false;
    public static final boolean e = d == false;
    public static final Boolean f = d;
    public static final boolean g = true;
    public static final Boolean h = d == false && c == 1;
    public static final Integer i = d != false ? 1 : 51;
    public static final String j = d != false ? "127.0.0.1" : (h != false ? "149.56.28.70" : "www.spawnpk.org");
    public static final boolean k = c == 1 && h == false;
    public static final Boolean l = d == false;
    public static final String m = "https://d2n1q79xme98rn.cloudfront.net/" + (a == rs.f.a$a.a ? "spk" : "rx") + (h != false ? "_test" : "_live") + "/";
    public static d n = rs.f.a$d.a;
    public static b o = rs.f.a$b.a;
    public static b p = null;
    public static final boolean q = true;
    public static b r = o;
    public static int s = 3;
    public static boolean t = true;
    public static final boolean u = false;
    public static boolean v = a == rs.f.a$a.a;
    public static final boolean w = false;
    public static final boolean x = false;
    public static final boolean y = false;
    public static final String z = rs.f.a$a.a(a);
    public static final String A = rs.f.a$a.b(a);
    public static final boolean B = true;
    public static final boolean C = true;
    public static final boolean D = true;
    public static final int E = 9;
    public static final boolean F = true;
    public static final int[] G = new int[10];
    public static boolean H = true;
    public static boolean I = true;
    public static boolean J = true;
    public static boolean K = true;
    public static boolean L = true;
    public static boolean M = true;
    public static boolean N = true;
    public static boolean O = false;
    public static final boolean P = false;
    public static boolean Q = false;
    public static final boolean R = true;
    public static final boolean S = true;
    public static final boolean T = true;
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final boolean X = false;
    public static final boolean Y = true;
    public static final boolean Z = true;
    public static boolean aa = true;
    public static final boolean ab = true;
    public static final boolean ac = false;
    public static final String ad = rs.v.a.b() + "settings.properties";
    public static boolean ae = true;
    public static String af = "RIMMINGTON";
    public static boolean ag = false;
    public static boolean ah = false;
    public static c ai = rs.f.a$c.a;
    public static boolean aj = true;
    public static boolean ak = false;
    public static boolean al = false;
    public static boolean am = false;
    public static boolean an = false;
    public static boolean ao = false;
    public static boolean ap = false;
    public static boolean aq = true;
    public static boolean ar = false;
    public static boolean as = false;
    public static boolean at = false;
    public static boolean au = false;
    public static boolean av = !ah;
    public static boolean aw = false;
    public static boolean ax = false;
    public static boolean ay = false;
    public static boolean az = true;
    public static boolean aA = true;
    public static boolean aB = true;
    public static boolean aC = false;
    public static boolean aD = true;
    public static boolean aE = false;
    public static boolean aF = true;
    public static boolean aG = true;
    public static boolean aH = true;
    public static boolean aI = false;
    public static boolean aJ = false;
    public static boolean aK = false;
    public static boolean aL = false;
    public static boolean aM = true;
    public static boolean aN = true;
    public static boolean aO = true;
    public static boolean aP = false;
    public static boolean aQ = true;
    public static boolean aR = false;
    public static boolean aS = true;
    public static boolean aT = false;
    public static boolean aU = false;
    public static boolean aV = false;
    public static boolean aW = false;
    public static boolean aX = true;
    public static boolean aY = true;
    public static boolean aZ = false;
    public static boolean ba = false;
    public static boolean bb = true;
    public static boolean bc = false;
    public static int bd = 10;
    public static boolean be = false;
    public static int bf = 0;
    public static String bg = "";
    public static int bh = 0;
    public static int bi = 0;
    public static boolean bj = false;
    public static boolean bk = false;
    public static boolean bl = true;
    public static boolean bm = false;
    public static boolean bn = false;
    public static boolean bo = true;
    public static boolean bp = true;
    public static boolean bq = false;
    public static boolean br = true;
    public static boolean bs = false;
    public static final Integer bt = 35000;
    public static int bu = 1;

    public static boolean a() {
        return h != false || c == 1;
    }

    public static boolean b() {
        return k;
    }

    public static boolean c() {
        return rs.f.a.b();
    }

    public static void a(boolean bl) {
        if (bl) {
            ah = true;
            av = false;
            az = false;
            e_0.i = false;
        } else {
            ah = false;
            av = true;
            az = true;
            e_0.i = true;
        }
    }

    public static void d() {
        rs.h.c.a("SaveSettings", a::g);
    }

    private static void g() {
        try {
            File file = new File(ad + ".temp");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("oldschool_graphics=" + aj);
            bufferedWriter.newLine();
            bufferedWriter.write("split_private_chat=" + bu);
            bufferedWriter.newLine();
            bufferedWriter.write("screen_mode=" + ai.name());
            bufferedWriter.newLine();
            bufferedWriter.write("show_bh_streaks=" + au);
            bufferedWriter.newLine();
            bufferedWriter.write("show_roofs=" + ax);
            bufferedWriter.newLine();
            bufferedWriter.write("show_fog=" + aw);
            bufferedWriter.newLine();
            bufferedWriter.write("left_click_attack=" + ay);
            bufferedWriter.newLine();
            bufferedWriter.write("particle_system_1=" + az);
            bufferedWriter.newLine();
            bufferedWriter.write("show_broadcasts_1=" + aA);
            bufferedWriter.newLine();
            bufferedWriter.write("shift_drop=" + aC);
            bufferedWriter.newLine();
            bufferedWriter.write("timer_overlay=" + aD);
            bufferedWriter.newLine();
            bufferedWriter.write("oldschool_ticks=" + aE);
            bufferedWriter.newLine();
            bufferedWriter.write("instant_switching=" + aF);
            bufferedWriter.newLine();
            bufferedWriter.write("prayer_adjustments=" + aG);
            bufferedWriter.newLine();
            bufferedWriter.write("side_panel_toggled=" + aH);
            bufferedWriter.newLine();
            bufferedWriter.write("rigour_augury_swapped=" + aI);
            bufferedWriter.newLine();
            bufferedWriter.write("left_click_target_only=" + aJ);
            bufferedWriter.newLine();
            bufferedWriter.write("developer_console=" + aM);
            bufferedWriter.newLine();
            for (int i2 = 0; i2 < G.length; ++i2) {
                bufferedWriter.write("key_binding_" + i2 + "=" + G[i2]);
                if (i2 == G.length + 1) continue;
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.write("item_drag=" + bd);
            bufferedWriter.newLine();
            bufferedWriter.write("queued_item_clicks_v2=" + be);
            bufferedWriter.newLine();
            bufferedWriter.write("lite_version=" + ah);
            bufferedWriter.newLine();
            bufferedWriter.write("sound_effects=" + s);
            bufferedWriter.newLine();
            bufferedWriter.write("extended_zoom=" + aO);
            bufferedWriter.newLine();
            bufferedWriter.write("desktop_notifications=" + aP);
            bufferedWriter.newLine();
            bufferedWriter.write("player_lighting=" + aQ);
            bufferedWriter.newLine();
            if (h.booleanValue()) {
                bufferedWriter.write("default_invitation_code=" + Client.fn);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("always_right_click_npc_attack=" + aR);
            bufferedWriter.newLine();
            bufferedWriter.write("spellbook_filter=" + rs.n.c.ap.d);
            bufferedWriter.newLine();
            if (rs.n.c.ap.f.contains((Object)ap.a.a)) {
                bufferedWriter.write("spellbook_filter_combat=true");
                bufferedWriter.newLine();
            }
            if (rs.n.c.ap.f.contains((Object)ap.a.b)) {
                bufferedWriter.write("spellbook_filter_teleport=true");
                bufferedWriter.newLine();
            }
            if (rs.n.c.ap.f.contains((Object)ap.a.c)) {
                bufferedWriter.write("spellbook_filter_utility=true");
                bufferedWriter.newLine();
            }
            bufferedWriter.write("spellbook_filter_level=" + rs.n.c.ap.e);
            bufferedWriter.newLine();
            bufferedWriter.write("npc_attack_option=" + bi);
            bufferedWriter.newLine();
            bufferedWriter.write("player_attack_option=" + bh);
            bufferedWriter.newLine();
            bufferedWriter.write("right_click_clan=" + aS);
            bufferedWriter.newLine();
            bufferedWriter.write("hide_non_wild_pets=" + aT);
            bufferedWriter.newLine();
            bufferedWriter.write("hide_gs_decor=" + aV);
            bufferedWriter.newLine();
            bufferedWriter.write("last_update_visit=" + bg);
            bufferedWriter.newLine();
            bufferedWriter.write("wild_multi=" + aX);
            bufferedWriter.newLine();
            if (p != null) {
                bufferedWriter.write("ground_mode=" + p.name() + "." + n.name());
                bufferedWriter.newLine();
            }
            bufferedWriter.write("bank_all_pet=" + aZ);
            bufferedWriter.newLine();
            bufferedWriter.write("bhtele_lock=" + ba);
            bufferedWriter.newLine();
            bufferedWriter.write("show_icon_equip=" + bb);
            bufferedWriter.newLine();
            bufferedWriter.write("accomplishments=" + bl);
            bufferedWriter.newLine();
            bufferedWriter.write("click_tele=" + t);
            bufferedWriter.newLine();
            bufferedWriter.write("chat_hidden=" + bc);
            bufferedWriter.newLine();
            bufferedWriter.write("lock_spawnable_drop=" + aL);
            bufferedWriter.newLine();
            bufferedWriter.close();
            Path path = Paths.get(ad + ".temp", new String[0]);
            Files.copy(path, Paths.get(ad, new String[0]), StandardCopyOption.REPLACE_EXISTING);
            Files.delete(path);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void e() {
        rs.f.a.G[0] = 116;
        rs.f.a.G[1] = 122;
        rs.f.a.G[2] = 123;
        rs.f.a.G[3] = 112;
        rs.f.a.G[4] = 113;
        rs.f.a.G[5] = 114;
        rs.f.a.G[6] = 115;
        rs.f.a.G[7] = 119;
        rs.f.a.G[8] = 120;
        rs.f.a.G[9] = 121;
    }

    public static void f() {
        block107: {
            rs.f.a.e();
            try {
                Properties properties;
                block106: {
                    File file = new File(ad);
                    if (!file.exists()) {
                        return;
                    }
                    properties = new Properties();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    be = Boolean.parseBoolean(properties.getProperty("queued_item_clicks_v2", "false"));
                    aj = Boolean.valueOf(properties.getProperty("oldschool_graphics"));
                    bu = Integer.valueOf(properties.getProperty("split_private_chat"));
                    au = Boolean.valueOf(properties.getProperty("show_bh_streaks"));
                    try {
                        ai = rs.f.a$c.a(properties.getProperty("screen_mode"));
                        ax = Boolean.valueOf(properties.getProperty("show_roofs"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aw = Boolean.valueOf(properties.getProperty("show_fog"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        ay = Boolean.valueOf(properties.getProperty("left_click_attack"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        az = properties.getProperty("particle_system_1") == null ? true : Boolean.valueOf(properties.getProperty("particle_system_1"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aA = properties.getProperty("show_broadcasts_1") == null ? true : Boolean.valueOf(properties.getProperty("show_broadcasts_1"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aC = properties.getProperty("shift_drop") == null ? true : Boolean.valueOf(properties.getProperty("shift_drop"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aD = properties.getProperty("timer_overlay") == null ? true : Boolean.valueOf(properties.getProperty("timer_overlay"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        for (int i2 = 0; i2 < G.length; ++i2) {
                            if (properties.getProperty("key_binding_" + i2) == null) continue;
                            rs.f.a.G[i2] = Integer.valueOf(properties.getProperty("key_binding_" + i2));
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        bd = properties.getProperty("item_drag") == null ? 10 : Integer.valueOf(properties.getProperty("item_drag"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aE = properties.getProperty("oldschool_ticks") == null ? false : Boolean.valueOf(properties.getProperty("oldschool_ticks"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aF = properties.getProperty("instant_switching") == null ? true : Boolean.valueOf(properties.getProperty("instant_switching"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aG = properties.getProperty("prayer_adjustments") == null ? true : Boolean.valueOf(properties.getProperty("prayer_adjustments"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aH = properties.getProperty("side_panel_toggled") == null ? true : Boolean.valueOf(properties.getProperty("side_panel_toggled"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aI = properties.getProperty("rigour_augury_swapped") == null ? false : Boolean.valueOf(properties.getProperty("rigour_augury_swapped"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aJ = properties.getProperty("left_click_target_only") == null ? false : Boolean.valueOf(properties.getProperty("left_click_target_only"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aK = properties.getProperty("left_click_magic_only") == null ? false : Boolean.valueOf(properties.getProperty("left_click_magic_only"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aM = properties.getProperty("developer_console") == null ? false : Boolean.valueOf(properties.getProperty("developer_console"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("lite_version") == null) {
                            ah = false;
                        } else {
                            boolean bl = Boolean.valueOf(properties.getProperty("lite_version"));
                            rs.f.a.a(bl);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("sound_effects") != null) {
                            s = Integer.valueOf(properties.getProperty("sound_effects"));
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("extended_zoom") == null) {
                            v_0.a(false);
                            aO = false;
                        } else {
                            boolean bl = Boolean.valueOf(properties.getProperty("extended_zoom"));
                            v_0.a(bl);
                            aO = bl;
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aP = properties.getProperty("desktop_notifications") == null ? false : Boolean.valueOf(properties.getProperty("desktop_notifications"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aQ = properties.getProperty("player_lighting") == null ? true : Boolean.valueOf(properties.getProperty("player_lighting"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aR = properties.getProperty("always_right_click_npc_attack") == null ? false : Boolean.valueOf(properties.getProperty("always_right_click_npc_attack"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("spellbook_filter") == null) {
                            rs.n.c.ap.d = true;
                            rs.n.c.ap.f.add(ap.a.a);
                            rs.n.c.ap.f.add(ap.a.b);
                            rs.n.c.ap.e = false;
                        } else {
                            rs.n.c.ap.d = Boolean.valueOf(properties.getProperty("spellbook_filter"));
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("spellbook_filter_combat") != null) {
                            rs.n.c.ap.f.add(ap.a.a);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("spellbook_filter_teleport") != null) {
                            rs.n.c.ap.f.add(ap.a.b);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (properties.getProperty("spellbook_filter_utility") != null) {
                            rs.n.c.ap.f.add(ap.a.c);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        rs.n.c.ap.e = properties.getProperty("spellbook_filter_level") == null ? false : Boolean.valueOf(properties.getProperty("spellbook_filter_level"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        bi = properties.getProperty("npc_attack_option") == null ? 0 : Integer.valueOf(properties.getProperty("npc_attack_option"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        bh = properties.getProperty("player_attack_option") == null ? 0 : Integer.valueOf(properties.getProperty("player_attack_option"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aS = properties.getProperty("right_click_clan") == null ? false : Boolean.valueOf(properties.getProperty("right_click_clan"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aT = properties.getProperty("hide_non_wild_pets") == null ? false : Boolean.valueOf(properties.getProperty("hide_non_wild_pets"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aV = properties.getProperty("hide_gs_decor") == null ? false : Boolean.valueOf(properties.getProperty("hide_gs_decor"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        bg = properties.getProperty("last_update_visit") == null ? "" : properties.getProperty("last_update_visit");
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aX = properties.getProperty("wild_multi") == null ? true : Boolean.valueOf(properties.getProperty("wild_multi"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        aZ = properties.getProperty("bank_all_pet") == null ? true : Boolean.valueOf(properties.getProperty("bank_all_pet"));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        String string;
                        p = null;
                        if (properties.getProperty("ground_mode") != null && (string = properties.getProperty("ground_mode")).contains(".")) {
                            String string2 = string.split("\\.")[0];
                            String string3 = string.split("\\.")[1];
                            if (string3.equalsIgnoreCase(n.name())) {
                                p = r = rs.f.a$b.valueOf(string2);
                            }
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    try {
                        if (!h.booleanValue()) break block106;
                        try {
                            if (properties.getProperty("default_invitation_code") == null) {
                                Client.fn = "";
                                break block106;
                            }
                            Client.fn = properties.getProperty("default_invitation_code");
                        }
                        catch (Exception exception) {}
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                try {
                    bb = properties.getProperty("show_icon_equip") == null ? true : Boolean.valueOf(properties.getProperty("show_icon_equip"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                try {
                    bl = properties.getProperty("accomplishments") == null ? true : Boolean.valueOf(properties.getProperty("accomplishments"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                try {
                    t = properties.getProperty("click_tele") == null ? true : Boolean.valueOf(properties.getProperty("click_tele"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                try {
                    bc = properties.getProperty("chat_hidden") == null ? false : Boolean.valueOf(properties.getProperty("chat_hidden"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                try {
                    if (properties.getProperty("lock_spawnable_drop") == null) {
                        aL = false;
                        break block107;
                    }
                    aL = Boolean.valueOf(properties.getProperty("lock_spawnable_drop"));
                }
                catch (Exception exception) {}
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c a(String string) {
            for (c c2 : rs.f.a$c.values()) {
                if (!c2.name().equalsIgnoreCase(string)) continue;
                return c2;
            }
            return a;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = rs.f.a$c.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(0);
        public static final /* enum */ b b = new b(0xFFFFFF);
        public static final /* enum */ b c = new b(0xD6D6D6);
        public static final /* enum */ b d = new b(0x222922);
        public static final /* enum */ b e = new b(13417604);
        public int f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        private b(int n3) {
            this.f = n3;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            g = rs.f.a$b.a();
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d();
        public static final /* enum */ d b = new d();
        public static final /* enum */ d c = new d();
        public static final /* enum */ d d = new d();
        public static final /* enum */ d e = new d();
        public static final /* enum */ d f = new d();
        private static final /* synthetic */ d[] g;

        public static d[] values() {
            return (d[])g.clone();
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e, f};
        }

        static {
            g = rs.f.a$d.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("SpawnPK", "http://spawnpk.net");
        public static final /* enum */ a b = new a("Runex", "http://spawnpk.net");
        private String c;
        private String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(String string2, String string3) {
            this.c = string2;
            this.d = string3;
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.d;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b};
        }

        static /* synthetic */ String a(a a2) {
            return a2.d;
        }

        static /* synthetic */ String b(a a2) {
            return a2.c;
        }

        static {
            e = rs.f.a$a.c();
        }
    }
}

