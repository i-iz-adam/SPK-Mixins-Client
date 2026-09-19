/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.t.a;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.a.b.a;
import rs.d.k;
import rs.d.m;
import rs.d.n;
import rs.t.c;

public class d
extends c<k> {
    private static final Logger a = LoggerFactory.getLogger(d.class);
    private static final String b = rs.v.a.f() + File.separator + "configs" + File.separator + "items.yaml";
    private static final String c = rs.v.a.f() + File.separator + "configs" + File.separator + "i.bin";

    public d() {
        super(b, c);
    }

    public k b(int n2, Map<String, Object> map) {
        int n3;
        k k2 = k.e(n2);
        Boolean bl = null;
        if (map.containsKey("clone") || map.containsKey("fullClone")) {
            int n4 = n3 = map.containsKey("fullClone") ? ((Integer)map.get("fullClone")).intValue() : ((Integer)map.get("clone")).intValue();
            k k3 = this.i.containsKey(n3) ? (!this.h.w_(n3) ? this.b(n3, (Map)this.i.get(n3)) : (k)this.h.b(n3)) : k.f(n3);
            k2.a(k3);
            bl = k3.ar;
        }
        if (map.containsKey("hoverClone") || map.containsKey("fullClone")) {
            int n5 = n3 = map.containsKey("fullClone") ? ((Integer)map.get("fullClone")).intValue() : ((Integer)map.get("clone")).intValue();
            if (this.i.containsKey(n3) && !this.h.w_(n3)) {
                this.b(n3, (Map)this.i.get(n3));
            }
            if (m.a.w_(n3)) {
                m.a(n2, (String)m.a.b(n3));
            }
        }
        k2.i = n2;
        n3 = 0;
        block137: for (String string : map.keySet()) {
            if (string.startsWith("param_")) continue;
            Object object = map.get(string);
            switch (string.toLowerCase()) {
                case "beginnergear": {
                    k2.at = 373;
                    k2.au = 20;
                    k2.av = 20;
                    break;
                }
                case "name": {
                    k2.w = (String)object;
                    k2.x = k2.w.replace("@gre@", "");
                    break;
                }
                case "actions": {
                    k2.L = this.e(object);
                    n3 = 1;
                    break;
                }
                case "groundactions": {
                    k2.u = this.e(object);
                    break;
                }
                case "stackable": {
                    k2.C = (Boolean)object;
                    break;
                }
                case "broken": {
                    k2.V = (Boolean)object;
                    k2.L = new String[]{null, null, null, null, "Destroy"};
                    break;
                }
                case "note": {
                    k2.C = true;
                    k2.F = (Integer)object;
                    if (k2.F == -1) {
                        k2.p = -1;
                        break;
                    }
                    if (k2.p == -1) {
                        k2.p = 799;
                    }
                    if (n3 != 0 || k2.F == -1) continue block137;
                    k2.L = new String[]{null, null, null, null, "Drop"};
                    break;
                }
                case "template": {
                    k2.p = (Integer)object;
                    break;
                }
                case "cert": {
                    k2.F = (Integer)object;
                    break;
                }
                case "srccolors": {
                    k2.g = this.a(object);
                    break;
                }
                case "destcolors": {
                    k2.h = this.a(object);
                    break;
                }
                case "modelid": {
                    k2.A = (Integer)object;
                    break;
                }
                case "stackids": {
                    k2.P = this.a(object);
                    break;
                }
                case "stackamounts": {
                    k2.ab = this.a(object);
                    break;
                }
                case "zoom": {
                    k2.G = (Integer)object;
                    break;
                }
                case "rotations": {
                    int[] nArray = this.a(object);
                    k2.M = nArray[0];
                    k2.Z = nArray[1];
                    break;
                }
                case "offsets": {
                    int[] nArray = this.a(object);
                    k2.v = nArray[0];
                    k2.W = nArray[1];
                    break;
                }
                case "zan2d": {
                    k2.ae = (Integer)object;
                    break;
                }
                case "ambient": {
                    k2.X = (Integer)object;
                    break;
                }
                case "contrast": {
                    k2.I = (Integer)object;
                    break;
                }
                case "resize": {
                    int[] nArray = this.a(object);
                    k2.t = nArray[0];
                    k2.O = nArray[1];
                    k2.N = nArray[2];
                    break;
                }
                case "malemodel1": {
                    k2.r = (Integer)object;
                    break;
                }
                case "malemodel": {
                    k2.r = (Integer)object;
                    k2.J = -1;
                    k2.K = -1;
                    break;
                }
                case "femalemodel": {
                    k2.aa = (Integer)object;
                    k2.o = -1;
                    k2.q = -1;
                    break;
                }
                case "femalemodel1": {
                    k2.aa = (Integer)object;
                    break;
                }
                case "malemodels": {
                    int[] nArray = this.a(object);
                    k2.r = nArray[0];
                    k2.K = nArray.length >= 2 ? nArray[1] : -1;
                    k2.J = nArray.length >= 3 ? nArray[2] : -1;
                    break;
                }
                case "femalemodels": {
                    int[] nArray = this.a(object);
                    k2.aa = nArray[0];
                    k2.q = nArray.length >= 2 ? nArray[1] : -1;
                    k2.o = nArray.length >= 2 ? nArray[2] : -1;
                    break;
                }
                case "maleoffsets": {
                    int[] nArray = this.a(object);
                    k2.af = (byte)nArray[0];
                    k2.ag = (byte)nArray[1];
                    k2.ah = (byte)nArray[2];
                    break;
                }
                case "femaleoffsets": {
                    int[] nArray = this.a(object);
                    k2.ai = (byte)nArray[0];
                    k2.ak = (byte)nArray[1];
                    k2.aj = (byte)nArray[2];
                    break;
                }
                case "femaleoffsety": {
                    k2.ak = (byte)((Integer)object).intValue();
                    break;
                }
                case "femaleoffsetx": {
                    k2.ai = (byte)((Integer)object).intValue();
                    break;
                }
                case "maleoffsety": {
                    k2.ag = (byte)((Integer)object).intValue();
                    break;
                }
                case "maleoffsetx": {
                    k2.af = (byte)((Integer)object).intValue();
                    break;
                }
                case "newmaleoffsetx": {
                    k2.al = (byte)((Integer)object).intValue();
                    break;
                }
                case "newmaleoffsety": {
                    k2.am = (byte)((Integer)object).intValue();
                    break;
                }
                case "newmaleoffsetz": {
                    k2.an = (byte)((Integer)object).intValue();
                    break;
                }
                case "newfemaleoffsetx": {
                    k2.ao = (byte)((Integer)object).intValue();
                    break;
                }
                case "newfemaleoffsety": {
                    k2.aq = (byte)((Integer)object).intValue();
                    break;
                }
                case "newfemaleoffsetz": {
                    k2.ap = (byte)((Integer)object).intValue();
                    break;
                }
                case "newmaleoffsets": {
                    int[] nArray = this.a(object);
                    k2.al = (byte)nArray[0];
                    k2.am = (byte)nArray[1];
                    k2.an = (byte)nArray[2];
                    break;
                }
                case "newfemaleoffsets": {
                    int[] nArray = this.a(object);
                    k2.ao = (byte)nArray[0];
                    k2.aq = (byte)nArray[1];
                    k2.ap = (byte)nArray[2];
                    break;
                }
                case "malechatmodels": {
                    int[] nArray = this.a(object);
                    k2.B = nArray[0];
                    k2.s = nArray[1];
                    break;
                }
                case "femalechatmodels": {
                    int[] nArray = this.a(object);
                    k2.Y = nArray[0];
                    k2.z = nArray[1];
                    break;
                }
                case "fulltexture": {
                    k2.R = (Integer)object;
                    break;
                }
                case "textureinvanim": {
                    k2.U = (Boolean)object;
                    break;
                }
                case "opacity": {
                    if (k2.aw == null) {
                        k2.aw = new rs.a.b.c();
                    }
                    k2.aw.a((Integer)object);
                    break;
                }
                case "recolor": 
                case "recolors": {
                    if (k2.aw == null) {
                        k2.aw = new rs.a.b.c();
                    }
                    k2.aw.a(new a(this.d(object)));
                    break;
                }
                case "retexture": 
                case "retextures": {
                    if (k2.aw == null) {
                        k2.aw = new rs.a.b.c();
                    }
                    k2.aw.a().a(this.d(object));
                    break;
                }
                case "reshade": {
                    if (k2.aw == null) {
                        k2.aw = new rs.a.b.c();
                    }
                    k2.aw.a(new rs.a.b.d((Integer)object));
                    break;
                }
                case "textures": {
                    if (k2.aw == null) {
                        k2.aw = new rs.a.b.c();
                    }
                    Map map2 = (Map)object;
                    Object object2 = map2.keySet().iterator();
                    while (object2.hasNext()) {
                        int n6 = (Integer)object2.next();
                        k2.aw.a().a(n6, this.a(map2.get(n6)));
                    }
                    continue block137;
                }
                case "osrs": {
                    k2.ar = (Boolean)object;
                    break;
                }
                case "iconitem": {
                    k2.as = (Integer)object;
                    break;
                }
                case "icon": {
                    k2.at = (Integer)object;
                    break;
                }
                case "iconoffset": 
                case "iconoffsets": {
                    Object object2 = this.a(object);
                    k2.au = object2[0];
                    k2.av = (int)object2[1];
                    break;
                }
                case "iconx": {
                    k2.au = (Integer)object;
                    break;
                }
                case "icony": {
                    k2.av = (Integer)object;
                    break;
                }
                case "hover": {
                    m.a(n2, "\n" + (String)object);
                    break;
                }
                case "disableinvhover": 
                case "disableinventoryhover": {
                    k2.ax = (Boolean)object;
                    break;
                }
                case "fullclone": 
                case "equipclone": 
                case "cloneequip": 
                case "clone": 
                case "tradeable": 
                case "bankable": 
                case "autoloss": 
                case "autolost": 
                case "autobankable": 
                case "autokeep": 
                case "droppable": 
                case "destroy": {
                    break;
                }
                default: {
                    if (!rs.f.a.b()) continue block137;
                    a.info("(ID {} '{}') Unknown config: {}", new Object[]{n2, k2.w, string});
                }
            }
        }
        if (bl != null && !this.a(map, "osrs")) {
            k2.ar = bl;
        }
        if (k2.at != -1) {
            n.a.a(k2.i, (Object)new n(n.a.a, k2.at, k2.au, k2.av));
        } else if (k2.as != -1) {
            n.a.a(k2.i, (Object)new n(n.a.b, k2.as, k2.au, k2.av));
        }
        return k2;
    }

    private boolean a(Map<String, Object> map, String string) {
        for (String string2 : map.keySet()) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ Object a(int n2, Map map) {
        return this.b(n2, map);
    }
}

