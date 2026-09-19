/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.bU
 *  gnu.trove.f.b.cc
 *  gnu.trove.i.a.i
 */
package rs.t.a;

import gnu.trove.f.b.bU;
import gnu.trove.f.b.cc;
import gnu.trove.i.a.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.t.a;

public class e
extends a {
    private static final int c = 2000;
    private static final String d = rs.v.a.f() + File.separator + "configs" + File.separator + "maps.yaml";
    private static final String e = rs.v.a.f() + File.separator + "configs" + File.separator + "m.bin";
    protected Map<Integer, Map<String, Object>> a = new HashMap<Integer, Map<String, Object>>();
    protected boolean b = !rs.f.a.c();
    private final cc<String> h = new cc();
    private final bU i = new bU();
    private final i j = new i();
    private final i k = new i();
    private final bU l = new bU();

    public e() {
        super(d, e);
    }

    public boolean a(int n2) {
        return this.h.w_(n2);
    }

    public boolean b(int n2) {
        return this.a(Client.ej, n2);
    }

    public boolean a(int n2, String string) {
        if (!this.a(n2)) {
            return false;
        }
        return ((String)this.h.b(n2)).equals(string);
    }

    public boolean a(int n2, int n3) {
        if (!this.a(n2) && !this.a(n3)) {
            return true;
        }
        if (this.a(n2) != this.a(n3)) {
            return false;
        }
        return ((String)this.h.b(n2)).equals(this.h.b(n3));
    }

    public void a(Map<String, Object> map, int n2, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        boolean bl = false;
        for (String string : map.keySet()) {
            Object object = map.get(string);
            switch (string.toLowerCase()) {
                case "id": {
                    nArray[n2] = (Integer)object;
                    this.i.a(((Integer)object).intValue(), n2);
                    break;
                }
                case "map": {
                    nArray2[n2] = (Integer)object;
                    this.j.b(((Integer)object).intValue());
                    break;
                }
                case "land": {
                    nArray3[n2] = (Integer)object;
                    this.j.b(((Integer)object).intValue());
                    break;
                }
                case "type": {
                    String string2 = (String)object;
                    if (!string2.equalsIgnoreCase("osrs")) break;
                    nArray4[n2] = 1;
                    break;
                }
                case "osid": {
                    int n3 = (Integer)object;
                    if (!map.containsKey("id")) break;
                    this.l.a(((Integer)map.get("id")).intValue(), n3);
                    break;
                }
                case "group": {
                    String string3 = (String)object;
                    if (!map.containsKey("id")) break;
                    this.h.a(((Integer)map.get("id")).intValue(), (Object)string3);
                    break;
                }
                case "forceroof": 
                case "forceroofs": {
                    bl = (Boolean)object;
                }
            }
        }
        if (nArray4[n2] == 1) {
            int n4 = (Integer)map.get("id");
            this.k.b(n4);
        }
        if (bl) {
            int n5 = (Integer)map.get("id");
            Client.c.put(n5, true);
        }
    }

    public void a(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        try {
            this.a = this.a(this.b);
            if (this.a == null || this.a.keySet() == null) {
                this.a = new HashMap<Integer, Map<String, Object>>();
                return;
            }
            for (int n2 : this.a.keySet()) {
                try {
                    this.a(this.a.get(n2), n2, nArray, nArray2, nArray3, nArray4);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public cc<String> a() {
        return this.h;
    }

    public bU e() {
        return this.i;
    }

    public i f() {
        return this.j;
    }

    public i g() {
        return this.k;
    }

    public bU h() {
        return this.l;
    }
}

