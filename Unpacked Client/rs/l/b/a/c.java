/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a;

import rs.l.b.a.a.d;

public class c {
    public static void a(String string, String[] stringArray, d d2) {
        switch (string.toLowerCase()) {
            case "reset": {
                d2.p();
                break;
            }
            case "male": {
                d2.q();
                rs.l.b.a.d.b("@whi@<img=24> Entity transformed to male!");
                break;
            }
            case "female": {
                d2.r();
                rs.l.b.a.d.b("@whi@<img=24> Entity transformed to female!");
                break;
            }
            case "weapon": 
            case "wep": {
                d2.g(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player weapon!");
                break;
            }
            case "body": 
            case "chest": 
            case "top": {
                d2.h(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set chest piece!");
                break;
            }
            case "cape": 
            case "back": {
                d2.l(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player cape!");
                break;
            }
            case "neck": 
            case "ammy": {
                d2.m(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player amulet!");
                break;
            }
            case "legs": 
            case "leg": {
                d2.i(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player legs!");
                break;
            }
            case "hand": 
            case "hands": 
            case "glove": 
            case "gloves": {
                d2.n(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player gloves!");
                break;
            }
            case "feet": 
            case "boot": 
            case "boots": {
                d2.k(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player boots!");
                break;
            }
            case "shield": 
            case "off": {
                d2.o(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player shield!");
                break;
            }
            case "hat": 
            case "head": 
            case "helm": 
            case "helmet": {
                d2.j(Integer.parseInt(stringArray[0]));
                rs.l.b.a.d.b("@whi@<img=24> Set player helmet!");
                break;
            }
            case "full_helm": 
            case "fullhelm": {
                boolean bl = !d2.t();
                d2.d(bl);
                d2.c(bl);
                rs.l.b.a.d.b("@whi@<img=24> Toggled full helm flag: " + (bl ? "@gre@ON" : "@red@OFF"));
                break;
            }
            case "full_mask": 
            case "fullmask": {
                boolean bl = !d2.t();
                d2.c(bl);
                rs.l.b.a.d.b("@whi@<img=24> Toggled full mask flag: " + (bl ? "@gre@ON" : "@red@OFF"));
                break;
            }
            case "full_hat": 
            case "fullhat": {
                boolean bl = !d2.u();
                d2.d(bl);
                rs.l.b.a.d.b("@whi@<img=24> Toggled full hat flag: " + (bl ? "@gre@ON" : "@red@OFF"));
                break;
            }
            case "full_body": 
            case "full_chest": 
            case "fullbody": 
            case "fullchest": {
                boolean bl = !d2.s();
                d2.b(bl);
                rs.l.b.a.d.b("@whi@<img=24> Toggled full body flag: " + (bl ? "@gre@ON" : "@red@OFF"));
            }
        }
    }
}

