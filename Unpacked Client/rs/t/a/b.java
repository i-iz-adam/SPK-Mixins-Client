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
import rs.a.b.d;
import rs.t.c;

public class b
extends c<rs.d.d> {
    private static final Logger a = LoggerFactory.getLogger(b.class);
    private static final String b = rs.v.a.f() + File.separator + "configs" + File.separator + "npcs.yaml";
    private static final String c = rs.v.a.f() + File.separator + "configs" + File.separator + "e.bin";

    public b() {
        super(b, c);
    }

    public rs.d.d b(int n2, Map<String, Object> map) {
        boolean bl;
        rs.d.d d2 = rs.d.d.b(n2);
        if (d2.n == -1) {
            d2.n = 0;
        }
        if (map.containsKey("reset")) {
            d2 = new rs.d.d();
            d2.x = n2;
        } else {
            d2.B = -1;
            d2.j = -1;
            d2.l = -1;
        }
        if (map.containsKey("clone")) {
            int n3 = (Integer)map.get("clone");
            if (this.i.containsKey(n3)) {
                if (!this.h.w_(n3)) {
                    d2.a(this.b(n3, (Map)this.i.get(n3)));
                } else {
                    d2.a((rs.d.d)this.h.b(n3));
                }
            } else {
                d2.a(rs.d.d.c(n3));
            }
        }
        d2.x = n2;
        block102: for (String stringArray : map.keySet()) {
            Object object = map.get(stringArray);
            switch (stringArray.toLowerCase()) {
                case "opacity": {
                    if (d2.i == null) {
                        d2.i = new rs.a.b.c();
                    }
                    d2.i.a((Integer)object);
                    break;
                }
                case "name": {
                    d2.o = (String)object;
                    break;
                }
                case "combatlevel": {
                    d2.n = (Integer)object;
                    break;
                }
                case "actions": {
                    d2.p = this.e(object);
                    break;
                }
                case "models": {
                    d2.L = this.a(object);
                    break;
                }
                case "scaling": {
                    int[] nArray = this.a(object);
                    d2.I = nArray[0];
                    d2.E = nArray[1];
                    break;
                }
                case "scalewidth": {
                    d2.I = (Integer)object;
                    break;
                }
                case "scaleheight": {
                    d2.E = (Integer)object;
                    break;
                }
                case "recolor": 
                case "recolors": {
                    if (d2.i == null) {
                        d2.i = new rs.a.b.c();
                    }
                    d2.i.a(new a(this.d(object)));
                    break;
                }
                case "retexture": 
                case "retextures": {
                    if (d2.i == null) {
                        d2.i = new rs.a.b.c();
                    }
                    d2.i.a().a(this.d(object));
                    break;
                }
                case "reshade": {
                    if (d2.i == null) {
                        d2.i = new rs.a.b.c();
                    }
                    d2.i.a(new d((Integer)object));
                    break;
                }
                case "textures": {
                    if (d2.i == null) {
                        d2.i = new rs.a.b.c();
                    }
                    Map map2 = (Map)object;
                    Object object2 = map2.keySet().iterator();
                    while (object2.hasNext()) {
                        int n3 = (Integer)object2.next();
                        d2.i.a().a(n3, this.a(map2.get(n3)));
                    }
                    continue block102;
                }
                case "srccolors": {
                    d2.v = this.a(object);
                    break;
                }
                case "destcolors": {
                    d2.s = this.a(object);
                    break;
                }
                case "chatheadmodels": {
                    d2.t = this.a(object);
                    break;
                }
                case "size": {
                    d2.r = this.b(object);
                    break;
                }
                case "standanim": {
                    d2.w = (Integer)object;
                    break;
                }
                case "walkanim": {
                    d2.q = (Integer)object;
                    break;
                }
                case "rotateanim": {
                    d2.j = d2.B = ((Integer)object).intValue();
                    d2.l = d2.B;
                    break;
                }
                case "rotateanim180": {
                    d2.l = (Integer)object;
                    break;
                }
                case "rotateanim90cw": {
                    d2.B = (Integer)object;
                    break;
                }
                case "rotateanim90ccw": {
                    d2.j = (Integer)object;
                    break;
                }
                case "minimap": {
                    d2.F = (Boolean)object;
                    break;
                }
                case "priorityrender": 
                case "priority": {
                    d2.K = (Boolean)object;
                    break;
                }
                case "renderidle": {
                    d2.g = (Boolean)object;
                    break;
                }
                case "clickable": {
                    d2.C = (Boolean)object;
                    break;
                }
                case "pet": {
                    d2.h = (Boolean)object;
                    d2.F = false;
                    d2.K = false;
                    break;
                }
                case "anint59": {
                    d2.m = (Integer)object;
                    break;
                }
                case "anint57": {
                    d2.k = (Integer)object;
                    break;
                }
                case "contrast": {
                    d2.J = (Integer)object;
                    break;
                }
                case "ambient": {
                    d2.D = (Integer)object;
                    break;
                }
                case "rotationspeed": {
                    d2.y = (Integer)object;
                    break;
                }
                case "headicon": {
                    d2.u = (Integer)object;
                    break;
                }
                case "osrs": {
                    d2.af = (Boolean)object;
                    break;
                }
                case "icon": {
                    d2.T = (Integer)object;
                    break;
                }
                case "iconx": {
                    d2.U = (Integer)object;
                    break;
                }
                case "icony": {
                    d2.V = (Integer)object;
                    break;
                }
                case "iconz": {
                    d2.W = (Integer)object;
                    break;
                }
                case "mapicon": {
                    d2.S = (Integer)object;
                    break;
                }
                case "healthbar": {
                    d2.O = (Boolean)object;
                    break;
                }
                case "healthbarcolor": 
                case "healthbartype": {
                    if (object instanceof String && ((String)object).equalsIgnoreCase("blue")) {
                        d2.P = 1;
                        break;
                    }
                    if (object instanceof String && ((String)object).equalsIgnoreCase("yellow")) {
                        d2.P = (byte)2;
                        break;
                    }
                    d2.P = (Byte)object;
                    break;
                }
                case "hover": {
                    d2.X = (String)object;
                    if (!d2.X.contains("\n")) continue block102;
                    d2.Z = true;
                    d2.X = " " + d2.X;
                    break;
                }
                case "forcehover": 
                case "hoverforced": {
                    d2.Y = (Boolean)object;
                    break;
                }
                case "glow": {
                    Object object2 = this.a(object);
                    d2.aa = object2[0];
                    d2.ac = (int)object2[1];
                    d2.ad = (int)object2[2];
                    d2.ab = 1;
                    break;
                }
                case "tags": {
                    break;
                }
                case "clone": 
                case "reset": {
                    break;
                }
                default: {
                    if (!rs.f.a.b()) continue block102;
                    a.info("(ID {} '{}') Unknown config: {}", new Object[]{n2, d2.o, stringArray});
                }
            }
        }
        boolean bl2 = bl = d2.x != 3118L && d2.o != null && d2.o.toLowerCase().contains("pet") && !d2.o.toLowerCase().contains(" shop") && !d2.o.toLowerCase().contains("-keeper") && !d2.o.toLowerCase().contains("pete");
        if (!bl && d2.p != null) {
            for (String string : d2.p) {
                if (string == null || !string.equalsIgnoreCase("pick-up")) continue;
                bl = true;
                break;
            }
        }
        if (bl) {
            d2.h = true;
        }
        if (d2.h) {
            d2.r = 1;
            d2.K = false;
            d2.y = 32;
        }
        if (d2.p == null) {
            d2.p = new String[]{null, null, null, null, null};
        }
        return d2;
    }

    @Override
    public /* synthetic */ Object a(int n2, Map map) {
        return this.b(n2, map);
    }
}

