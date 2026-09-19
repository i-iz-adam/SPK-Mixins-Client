/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  javax.inject.Inject
 */
package rs.s.j;

import com.google.a.b.as;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.s.j.a;
import rs.s.j.c;

class b
implements rs.g.a.a {
    @Inject
    private c a;
    @Inject
    private a b;
    @Inject
    private Client c;
    private final Map<Integer, Integer> d = new HashMap<Integer, Integer>();
    private final Set<Character> e = new HashSet<Character>();

    b() {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        char c2 = keyEvent.getKeyChar();
        if (c2 != '\uffff' && this.e.contains(Character.valueOf(c2)) && this.a.h()) {
            keyEvent.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (!this.a.h()) {
            return;
        }
        if (keyEvent.isControlDown()) {
            return;
        }
        if (!this.a.j()) {
            int n2 = 0;
            if (this.b.a()) {
                if (this.b.b().a(keyEvent)) {
                    n2 = 38;
                } else if (this.b.c().a(keyEvent)) {
                    n2 = 40;
                } else if (this.b.d().a(keyEvent)) {
                    n2 = 37;
                } else if (this.b.e().a(keyEvent)) {
                    n2 = 39;
                }
            }
            if (this.b.f() && !this.a.i()) {
                if (this.b.g().a(keyEvent)) {
                    n2 = 112;
                } else if (this.b.h().a(keyEvent)) {
                    n2 = 113;
                } else if (this.b.i().a(keyEvent)) {
                    n2 = 114;
                } else if (this.b.j().a(keyEvent)) {
                    n2 = 115;
                } else if (this.b.k().a(keyEvent)) {
                    n2 = 116;
                } else if (this.b.l().a(keyEvent)) {
                    n2 = 117;
                } else if (this.b.m().a(keyEvent)) {
                    n2 = 118;
                } else if (this.b.n().a(keyEvent)) {
                    n2 = 119;
                } else if (this.b.o().a(keyEvent)) {
                    n2 = 120;
                } else if (this.b.p().a(keyEvent)) {
                    n2 = 121;
                } else if (this.b.q().a(keyEvent)) {
                    n2 = 122;
                } else if (this.b.r().a(keyEvent)) {
                    n2 = 123;
                }
            }
            if (n2 != 0 && n2 != keyEvent.getKeyCode()) {
                char c2 = keyEvent.getKeyChar();
                this.d.put(keyEvent.getKeyCode(), n2);
                keyEvent.setKeyCode(n2);
                keyEvent.setKeyChar('\uffff');
                if (c2 != '\uffff') {
                    this.e.add(Character.valueOf(c2));
                }
            }
            switch (keyEvent.getKeyCode()) {
                case 10: 
                case 47: 
                case 59: 
                case 513: {
                    rs.h.c.a(() -> {
                        this.a.g();
                        if (keyEvent.getKeyCode() == 47) {
                            if (Client.dk.isEmpty()) {
                                this.c.bw = true;
                            }
                            Client.dk = Client.dk + keyEvent.getKeyChar();
                        }
                        if (keyEvent.getKeyCode() == 59) {
                            if (Client.dk.isEmpty()) {
                                this.c.bw = true;
                            }
                            Client.dk = Client.dk + ":";
                        }
                    });
                }
            }
        } else {
            switch (keyEvent.getKeyCode()) {
                case 27: {
                    keyEvent.consume();
                    this.a.a(false);
                    break;
                }
                case 10: {
                    this.a.a(false);
                    rs.h.c.a(() -> this.a.f());
                    break;
                }
                case 8: {
                    rs.h.c.a(() -> {
                        if (as.c((String)Client.dk)) {
                            SwingUtilities.invokeLater(() -> this.a.a(false));
                            this.a.f();
                        }
                    });
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        Integer n2;
        int n3 = keyEvent.getKeyCode();
        char c2 = keyEvent.getKeyChar();
        if (c2 != '\uffff') {
            this.e.remove(Character.valueOf(c2));
        }
        if ((n2 = this.d.remove(n3)) != null) {
            keyEvent.setKeyCode(n2);
            keyEvent.setKeyChar('\uffff');
        }
    }
}

