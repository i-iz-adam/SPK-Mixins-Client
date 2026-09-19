/*
 * Decompiled with CFR 0.152.
 */
package rs.s.j;

import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.s.b.m;

@e(a="keyremapping")
public interface a
extends b {
    @l(a="Camera Remapping", b="Settings for remapping the camera", c=0)
    public static final String a = "camera";
    @l(a="F-key remapping", b="Settings for remapping the F-keys.", c=1)
    public static final String b = "fKeys";

    @g(a=1, b="cameraRemap", c="Remap Camera", d="Configures whether the camera movement uses remapped keys", h="camera")
    default public boolean a() {
        return true;
    }

    @g(a=2, b="up", c="Camera Up key", d="The key which will replace up.", h="camera")
    default public m b() {
        return new m(87, 0);
    }

    @g(a=3, b="down", c="Camera Down key", d="The key which will replace down.", h="camera")
    default public m c() {
        return new m(83, 0);
    }

    @g(a=4, b="left", c="Camera Left key", d="The key which will replace left.", h="camera")
    default public m d() {
        return new m(65, 0);
    }

    @g(a=5, b="right", c="Camera Right key", d="The key which will replace right.", h="camera")
    default public m e() {
        return new m(68, 0);
    }

    @g(a=6, b="fkeyRemap", c="Remap F-keys", d="Configures whether f-keys use remapped keys.", h="fKeys")
    default public boolean f() {
        return false;
    }

    @g(a=7, b="f1", c="F1", d="The key which will replace F1.", h="fKeys")
    default public m g() {
        return new m(49, 0);
    }

    @g(a=8, b="f2", c="F2", d="The key which will replace F2.", h="fKeys")
    default public m h() {
        return new m(50, 0);
    }

    @g(a=9, b="f3", c="F3", d="The key which will replace F3.", h="fKeys")
    default public m i() {
        return new m(51, 0);
    }

    @g(a=10, b="f4", c="F4", d="The key which will replace F4.", h="fKeys")
    default public m j() {
        return new m(52, 0);
    }

    @g(a=11, b="f5", c="F5", d="The key which will replace F5.", h="fKeys")
    default public m k() {
        return new m(53, 0);
    }

    @g(a=12, b="f6", c="F6", d="The key which will replace F6.", h="fKeys")
    default public m l() {
        return new m(54, 0);
    }

    @g(a=13, b="f7", c="F7", d="The key which will replace F7.", h="fKeys")
    default public m m() {
        return new m(55, 0);
    }

    @g(a=14, b="f8", c="F8", d="The key which will replace F8.", h="fKeys")
    default public m n() {
        return new m(56, 0);
    }

    @g(a=15, b="f9", c="F9", d="The key which will replace F9.", h="fKeys")
    default public m o() {
        return new m(57, 0);
    }

    @g(a=16, b="f10", c="F10", d="The key which will replace F10.", h="fKeys")
    default public m p() {
        return new m(48, 0);
    }

    @g(a=17, b="f11", c="F11", d="The key which will replace F11.", h="fKeys")
    default public m q() {
        return new m(45, 0);
    }

    @g(a=18, b="f12", c="F12", d="The key which will replace F12.", h="fKeys")
    default public m r() {
        return new m(61, 0);
    }
}

