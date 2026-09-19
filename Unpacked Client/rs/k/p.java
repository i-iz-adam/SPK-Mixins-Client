/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import rs.Client;
import rs.a.k;
import rs.gui.Launcher;
import rs.k.o;

public class p {
    private o a;

    public p() {
        String string = "skybox.txt";
        this.a = new o(this.getClass().getResourceAsStream("skybox.txt"), "skybox.txt");
    }

    private int a(int n2, int n3, int n4) {
        int[][] nArray = Launcher.n().o().eS[n4];
        if ((n2 -= Launcher.n().o().aR() / 8) < 0 || n2 >= nArray.length || (n3 -= Launcher.n().o().aS() / 8) < 0 || n3 >= nArray[n2].length) {
            return -1;
        }
        return nArray[n2][n3];
    }

    public void a() {
        if (this.a == null || !Launcher.n().o().fc) {
            return;
        }
        Launcher.n().o();
        k k2 = Client.eR;
        if (k2 == null) {
            return;
        }
        int n2 = k2.ac;
        int n3 = k2.ad;
    }
}

