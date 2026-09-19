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
import rs.t.c;

public class a
extends c<rs.d.a> {
    private static final Logger a = LoggerFactory.getLogger(a.class);
    private static final String b = rs.v.a.f() + File.separator + "configs" + File.separator + "anims.yaml";
    private static final String c = rs.v.a.f() + File.separator + "configs" + File.separator + "a.bin";

    public a() {
        super(b, c);
    }

    public rs.d.a b(int n2, Map<String, Object> map) {
        rs.d.a a2 = new rs.d.a();
        a2.r = n2;
        if (map.containsKey("clone")) {
            int n3 = (Integer)map.get("clone");
            if (this.i.containsKey(n3) && !this.h.w_(n3)) {
                a2 = new rs.d.a(n2, this.b(n3, (Map)this.i.get(n3)));
            } else if (this.h.w_(n3)) {
                a2 = new rs.d.a(n2, (rs.d.a)this.h.b(n3));
            } else if (rs.d.a.a[n3] != null) {
                a2 = new rs.d.a(n2, rs.d.a.a[n3]);
            } else {
                a.warn("Could not find clone ID {} for Anim {}", (Object)n3, (Object)n2);
            }
        }
        block45: for (String string : map.keySet()) {
            Object object = map.get(string);
            switch (string.toLowerCase()) {
                case "frames": {
                    a2.d = (Integer)object;
                    continue block45;
                }
                case "frameids": {
                    a2.e = this.a(object);
                    continue block45;
                }
                case "durations": {
                    a2.g = this.a(object);
                    continue block45;
                }
                case "secondary": {
                    a2.f = this.a(object);
                    continue block45;
                }
                case "framestep": {
                    a2.h = (Integer)object;
                    continue block45;
                }
                case "priority": {
                    a2.k = (Integer)object;
                    continue block45;
                }
                case "playeroffhand": {
                    a2.l = (Integer)object == -1 ? -1 : (Integer)object + 512;
                    continue block45;
                }
                case "playermainhand": {
                    a2.m = (Integer)object == -1 ? -1 : (Integer)object + 512;
                    continue block45;
                }
                case "maxloops": {
                    a2.n = (Integer)object;
                    continue block45;
                }
                case "precedence": {
                    a2.o = (Integer)object;
                    continue block45;
                }
                case "walkprecedence": {
                    a2.p = (Integer)object;
                    continue block45;
                }
                case "replaymode": {
                    a2.q = (Integer)object;
                    continue block45;
                }
                case "osid": {
                    a2.w = true;
                    continue block45;
                }
                case "stretches": {
                    a2.j = (Boolean)object;
                    continue block45;
                }
                case "walkable": {
                    boolean bl = (Boolean)object;
                    if (bl) {
                        a2.k = 6;
                        a2.n = 1;
                        a2.o = 2;
                        a2.p = 2;
                        a2.f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                        a2.i = new int[]{9, 11, 13, 15, 17, 19, 165, 167, 169, 171, 173, 175, 177, 179, 9999999};
                        continue block45;
                    }
                    a2.o = 0;
                    a2.p = 0;
                    continue block45;
                }
                case "interleave": {
                    a2.i = this.a(object);
                    continue block45;
                }
                case "animmayaid": {
                    a2.B = (Integer)object;
                    continue block45;
                }
                case "animmayastart": {
                    a2.z = (Integer)object;
                    continue block45;
                }
                case "animmayaend": {
                    a2.A = (Integer)object;
                    continue block45;
                }
                case "ref": 
                case "clone": {
                    continue block45;
                }
            }
            if (!rs.f.a.b()) continue;
            a.info("(ID {}) Unknown config: {}", (Object)n2, (Object)string);
        }
        return a2;
    }

    @Override
    public /* synthetic */ Object a(int n2, Map map) {
        return this.b(n2, map);
    }
}

