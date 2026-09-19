/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.HashMap;
import java.util.Map;
import rs.q.a.a.a;

public class j
extends a {
    public static Map<Integer, Integer> d = new HashMap<Integer, Integer>();

    @Override
    public void a() {
        int n2 = this.g();
        int n3 = this.e();
        if (n3 == -1) {
            d.remove(n2);
        } else {
            d.put(n2, n3);
        }
    }
}

