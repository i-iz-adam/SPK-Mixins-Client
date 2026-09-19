/*
 * Decompiled with CFR 0.152.
 */
package rs.k.b;

import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import rs.k.b.a;

public class d
extends LinkedHashMap<Integer, IntBuffer> {
    private final a a;

    public d(a a2) {
        super(512, 0.7f, true);
        this.a = a2;
    }

    public boolean a() {
        Iterator iterator = super.values().iterator();
        if (iterator.hasNext()) {
            this.a.a((IntBuffer)iterator.next());
            iterator.remove();
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Iterator iterator = super.values().iterator();
        while (iterator.hasNext()) {
            this.a.a((IntBuffer)iterator.next());
            iterator.remove();
        }
    }
}

