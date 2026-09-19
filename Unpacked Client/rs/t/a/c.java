/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.t.a;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.a.b.a;
import rs.a.b.d;
import rs.d.x;

public class c
extends rs.t.c<x> {
    private static final Logger a = LoggerFactory.getLogger(c.class);
    private static final String b = rs.v.a.f() + File.separator + "configs" + File.separator + "graphics.yaml";
    private static final String c = rs.v.a.f() + File.separator + "configs" + File.separator + "g.bin";

    public c() {
        super(b, c);
    }

    public x b(int n2, Map<String, Object> map) {
        x x2 = new x();
        x2.d = n2;
        if (map.containsKey("clone")) {
            int n3 = (Integer)map.get("clone");
            if (this.i.containsKey(n3) && !this.h.w_(n3)) {
                x2 = new x(n2, this.b(n3, (Map)this.i.get(n3)));
            } else if (this.h.w_(n3)) {
                x2 = new x(n2, (x)this.h.b(n3));
            } else if (x.c[n3] != null) {
                x2 = new x(n2, x.c[n3]);
            } else {
                a.warn("Could not find clone ID {} for GFX {}", (Object)n3, (Object)n2);
            }
        }
        block40: for (String string : map.keySet()) {
            Object object = map.get(string);
            switch (string.toLowerCase()) {
                case "model": 
                case "modelid": {
                    x2.e = (Integer)object;
                    break;
                }
                case "anim": 
                case "animation": {
                    x2.f = (Integer)object;
                    x2.g = x2.f == -1 ? null : rs.d.a.a[(Integer)object];
                    break;
                }
                case "resizex": {
                    x2.j = (Integer)object;
                    break;
                }
                case "resizey": {
                    x2.k = (Integer)object;
                    break;
                }
                case "rotation": {
                    x2.l = (Integer)object;
                    break;
                }
                case "ambient": {
                    x2.m = (Integer)object;
                    break;
                }
                case "contrast": {
                    x2.n = (Integer)object;
                    break;
                }
                case "srccolors": {
                    x2.h = this.a(object);
                    break;
                }
                case "destcolors": {
                    x2.i = this.a(object);
                    break;
                }
                case "osrs": {
                    x2.o = (Boolean)object;
                    break;
                }
                case "osid": {
                    x2.o = true;
                    break;
                }
                case "reshade": {
                    if (x2.r == null) {
                        x2.r = new rs.a.b.c();
                    }
                    x2.r.a(new d((Integer)object));
                    break;
                }
                case "recolor": 
                case "recolors": {
                    if (x2.r == null) {
                        x2.r = new rs.a.b.c();
                    }
                    x2.r.a(new a(this.d(object)));
                    break;
                }
                case "retextures": {
                    if (x2.r == null) {
                        x2.r = new rs.a.b.c();
                    }
                    x2.r.a().a(this.d(object));
                    break;
                }
                case "textures": {
                    if (x2.r == null) {
                        x2.r = new rs.a.b.c();
                    }
                    Map map2 = (Map)object;
                    Iterator iterator = map2.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n4 = (Integer)iterator.next();
                        x2.r.a().a(n4, this.a(map2.get(n4)));
                    }
                    continue block40;
                }
                case "ref": 
                case "clone": {
                    break;
                }
                default: {
                    if (!rs.f.a.b()) continue block40;
                    a.info("(ID {}) Unknown config: {}", (Object)n2, (Object)string);
                }
            }
        }
        return x2;
    }

    @Override
    public /* synthetic */ Object a(int n2, Map map) {
        return this.b(n2, map);
    }
}

