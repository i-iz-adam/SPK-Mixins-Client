/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.e;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.s.b.a;
import rs.s.b.q;
import rs.s.e.c;
import rs.ui.m;

public class b
extends m {
    private static final Logger a = LoggerFactory.getLogger(b.class);
    private final c b;
    private final q c;

    @Inject
    public b(c c2, q q2) {
        super(false);
        this.b = c2;
        this.c = q2;
    }

    @Override
    public void J_() {
        this.removeAll();
        a a2 = this.c.b(this.b);
        this.add(a2);
    }
}

