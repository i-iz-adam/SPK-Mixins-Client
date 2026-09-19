/*
 * Decompiled with CFR 0.152.
 */
package rs.g;

public class e {
    public static void a(long l2) {
        if (l2 > 0L) {
            if (0L == l2 % 10L) {
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(l2);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }
    }
}

