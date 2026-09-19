/*
 * Decompiled with CFR 0.152.
 */
package rs.t.a;

import java.io.File;
import java.util.Map;
import rs.d.r;
import rs.t.c;
import rs.v.a;

public class f
extends c<r> {
    private static final String a = rs.v.a.f() + File.separator + "configs" + File.separator + "objects.yaml";
    private static final String b = rs.v.a.f() + File.separator + "configs" + File.separator + "o.bin";

    public f() {
        super(a, b);
    }

    public r b(int n2, Map<String, Object> map) {
        if (map.containsKey("osrs")) {
            if (r.E != r.a.d) {
                r.a(r.a.d);
            }
        } else if (r.E != r.a.a) {
            r.a(r.a.a);
        }
        r r2 = r.b(n2);
        r2.aa = n2;
        for (String string : map.keySet()) {
            Object object = map.get(string);
            switch (string.toLowerCase()) {
                case "randomanimstart": {
                    r2.at = (Boolean)object;
                    break;
                }
                case "name": {
                    r2.R = (String)object;
                    break;
                }
                case "actions": {
                    r2.ay = this.e(object);
                    break;
                }
                case "models": {
                    r2.an = this.a(object);
                    break;
                }
                case "ambient": {
                    r2.Q = (byte)((Integer)object).intValue();
                    break;
                }
                case "contrast": {
                    r2.T = (byte)((Integer)object).intValue();
                    break;
                }
                case "mergenormals": {
                    r2.al = (Boolean)object;
                    break;
                }
                case "anim": 
                case "animid": 
                case "animation": {
                    r2.au = (Integer)object;
                    break;
                }
                case "osrs": {
                    if (((Boolean)object).booleanValue()) {
                        r2.av = 1;
                        break;
                    }
                    r2.av = 0;
                    break;
                }
                case "tilex": {
                    r2.U = (Integer)object;
                    break;
                }
                case "tiley": {
                    r2.af = (Integer)object;
                    break;
                }
                case "resize": {
                    int[] nArray = this.a(object);
                    r2.X = nArray[0];
                    r2.am = nArray[1];
                    r2.S = nArray[2];
                    break;
                }
                case "contouredground": {
                    r2.ag = (Boolean)object;
                    break;
                }
                case "interacttype": {
                    r2.aj = (Boolean)object;
                    break;
                }
                case "hasactions": {
                    r2.ar = (Boolean)object;
                    break;
                }
                case "srccolors": 
                case "srccolor": {
                    r2.ax = this.a(object);
                    break;
                }
                case "destcolors": 
                case "destcolor": {
                    r2.W = this.a(object);
                    break;
                }
                case "forceallrevisions": {
                    r2.aw = true;
                }
            }
        }
        return r2;
    }

    @Override
    public /* synthetic */ Object a(int n2, Map map) {
        return this.b(n2, map);
    }
}

