/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.f.a;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aH
 */
public class ah_0
extends c {
    private static final int[] c = new int[]{5609, 5610, 5611, 5612, 5613, 5614, 5615, 5616, 5617, 5618, 5619, 5620, 5621, 5622, 5623, 683, 684, 685, 5632, 5633, 5634, 5635, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643, 5644, 686, 5645, 5649, 5647, 5648, 18000, 18001, 18002, 18003, 18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18553, 18554, 18012, 18013, 18014, 18015, 18045, 18046, 18047, 18048, 5651, 687};
    private static final int[] d = new int[]{3, 40, 77, 3, 40, 77, 114, 151, 4, 114, 151, 3, 40, 77, 114, 40, 77, 114, 5, 42, 79, 5, 42, 79, 116, 153, 6, 116, 153, 5, 42, 79, 116, 42, 79, 116, 114, 117, 151, 154, 40, 43, 77, 80, 151, 154, 3, 6, 151, 153, 3, 10, 40, 42, 77, 80, 114, 117, 65, 15};
    private static final int[] e = new int[]{-1, -1, -1, 36, 36, 36, 36, 36, 73, 73, 73, 110, 110, 110, 110, 147, 147, 147, 1, 1, 1, 38, 38, 38, 38, 38, 76, 75, 75, 112, 112, 112, 112, 149, 149, 149, -1, 3, 1, 4, 73, 77, 75, 78, 110, 114, 149, 152, 147, 149, 182, 186, 182, 194, 183, 188, 185, 189, 242, 244};

    public ah_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void h() {
        if (rs.f.a.aI) {
            rs.n.e.H[18091].at = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
            rs.n.e.H[18105].at = "Level 45\nMystic Might\nIncreases your Magic by 15%";
            rs.n.e.H[18103].at = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
            rs.n.e.H[18089].at = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
        } else {
            rs.n.e.H[18091].at = "Level 45\nMystic Might\nIncreases your Magic by 15%";
            rs.n.e.H[18105].at = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
            rs.n.e.H[18103].at = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
            rs.n.e.H[18089].at = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
        }
    }

    public static void i() {
        ah_0.h();
        if (!rs.f.a.aG) {
            rs.n.e.H[43508].at = "Show stat adjustments";
            rs.n.e.H[5608].b(5, 43503, -5000, 207);
            rs.n.e.H[5608].b(6, 43504, -5000, 207);
            rs.n.e.H[5608].b(7, 43505, -5000, 207);
            rs.n.e.H[5608].b(8, 43506, -5000, 207);
            rs.n.e.H[5608].b(9, 43507, -5000, 207);
            rs.n.e.H[5608].b(2, 43502, -5000, 176);
            rs.n.e.H[5608].b(10, 43508, -5000, 225);
            rs.n.e.H[5608].b(1, 43500, -5000, 220);
            rs.n.e.H[5608].b(2, 43502, -5000, 176);
            rs.n.e.H[22500].b(1, 43502, -5000, 176);
            rs.n.e.H[22500].b(2, 43503, -5000, 207);
            rs.n.e.H[22500].b(3, 43504, -5000, 207);
            rs.n.e.H[22500].b(4, 43505, -5000, 207);
            rs.n.e.H[22500].b(5, 43506, -5000, 207);
            rs.n.e.H[22500].b(6, 43507, -5000, 207);
            rs.n.e.H[22500].b(0, 43500, -5000, 220);
            rs.n.e.H[22500].b(1, 43502, -5000, 176);
            rs.n.e.H[22500].b(7, 43508, -5000, 225);
            rs.n.e.H[43501].aR = 250;
            rs.n.e.H[43501].P = 250;
            for (int i2 = 0; i2 < c.length; ++i2) {
                int n2 = d[i2];
                int n3 = e[i2];
                if (rs.f.a.aI) {
                    if (c[i2] == 18047) {
                        n2 = 6;
                        n3 = 150;
                    }
                    if (c[i2] == 18048) {
                        n2 = 9;
                        n3 = 153;
                    }
                    if (c[i2] == 18010) {
                        n2 = 113;
                        n3 = 186;
                    }
                    if (c[i2] == 18011) {
                        n2 = 117;
                        n3 = 190;
                    }
                    if (c[i2] == 18008) {
                        n2 = 78;
                        n3 = 185;
                    }
                    if (c[i2] == 18009) {
                        n2 = 81;
                        n3 = 190;
                    }
                    if (c[i2] == 18045) {
                        n2 = 150;
                        n3 = 112;
                    }
                    if (c[i2] == 18046) {
                        n2 = 153;
                        n3 = 116;
                    }
                }
                n3 += 9;
                if (c[i2] == 687 || c[i2] == 5651) {
                    rs.n.e.H[43501].b(i2, c[i2], n2, -5000);
                    continue;
                }
                rs.n.e.H[43501].b(i2, c[i2], n2, n3);
            }
        } else {
            rs.n.e.H[5608].b(1, 43500, 1, 220);
            rs.n.e.H[5608].b(2, 43502, 1, 176);
            rs.n.e.H[5608].b(10, 43508, 21, 225);
            rs.n.e.H[22500].b(0, 43500, 1, 220);
            rs.n.e.H[22500].b(1, 43502, 1, 176);
            rs.n.e.H[22500].b(7, 43508, 21, 225);
            if (rs.f.a.bj) {
                rs.n.e.H[43508].at = "Hide stat adjustments";
                rs.n.e.H[5608].b(5, 43503, 20, 207);
                rs.n.e.H[5608].b(6, 43504, 57, 207);
                rs.n.e.H[5608].b(7, 43505, 96, 207);
                rs.n.e.H[5608].b(8, 43506, 135, 207);
                rs.n.e.H[5608].b(9, 43507, 173, 207);
                rs.n.e.H[5608].b(2, 43502, 1, 176);
                rs.n.e.H[22500].b(1, 43502, 1, 176);
                rs.n.e.H[22500].b(2, 43503, 20, 207);
                rs.n.e.H[22500].b(3, 43504, 57, 207);
                rs.n.e.H[22500].b(4, 43505, 96, 207);
                rs.n.e.H[22500].b(5, 43506, 135, 207);
                rs.n.e.H[22500].b(6, 43507, 173, 207);
                rs.n.e.H[43501].aR = 176;
                rs.n.e.H[43501].P = 174;
                for (int i3 = 0; i3 < c.length; ++i3) {
                    int n4 = -2;
                    int n5 = d[i3];
                    int n6 = e[i3];
                    if (rs.f.a.aI) {
                        if (c[i3] == 18047) {
                            n5 = 10;
                            n6 = 148;
                        }
                        if (c[i3] == 18048) {
                            n5 = 15;
                            n6 = 151;
                        }
                        if (c[i3] == 18010) {
                            n5 = 113;
                            n6 = 186;
                        }
                        if (c[i3] == 18011) {
                            n5 = 117;
                            n6 = 190;
                        }
                        if (c[i3] == 18008) {
                            n5 = 84;
                            n6 = 185;
                        }
                        if (c[i3] == 18009) {
                            n5 = 89;
                            n6 = 190;
                        }
                        if (c[i3] == 18045) {
                            n5 = 146;
                            n6 = 112;
                        }
                        if (c[i3] == 18046) {
                            n5 = 149;
                            n6 = 116;
                        }
                    }
                    if (d[i3] > 10) {
                        n4 = -4;
                    }
                    if (d[i3] > 50) {
                        n4 -= 2;
                    }
                    if (d[i3] > 100) {
                        n4 -= 2;
                    }
                    if (d[i3] > 150) {
                        n4 -= 2;
                    }
                    n5 += n4;
                    if (c[i3] == 687 || c[i3] == 5651) {
                        rs.n.e.H[43501].b(i3, c[i3], n5, -5000);
                        continue;
                    }
                    rs.n.e.H[43501].b(i3, c[i3], n5, n6);
                }
            } else {
                rs.n.e.H[43508].at = "Show stat adjustments";
                rs.n.e.H[5608].b(5, 43503, -5000, 207);
                rs.n.e.H[5608].b(6, 43504, -5000, 207);
                rs.n.e.H[5608].b(7, 43505, -5000, 207);
                rs.n.e.H[5608].b(8, 43506, -5000, 207);
                rs.n.e.H[5608].b(9, 43507, -5000, 207);
                rs.n.e.H[5608].b(2, 43502, -5000, 176);
                rs.n.e.H[5608].b(10, 43508, 21, 225);
                rs.n.e.H[22500].b(1, 43502, -5000, 176);
                rs.n.e.H[22500].b(2, 43503, -5000, 207);
                rs.n.e.H[22500].b(3, 43504, -5000, 207);
                rs.n.e.H[22500].b(4, 43505, -5000, 207);
                rs.n.e.H[22500].b(5, 43506, -5000, 207);
                rs.n.e.H[22500].b(6, 43507, -5000, 207);
                rs.n.e.H[43501].aR = 250;
                rs.n.e.H[43501].P = 250;
                for (int i4 = 0; i4 < c.length; ++i4) {
                    int n7 = 0;
                    int n8 = d[i4] + n7;
                    int n9 = e[i4];
                    if (rs.f.a.aI) {
                        if (c[i4] == 18047) {
                            n8 = 4;
                            n9 = 148;
                        }
                        if (c[i4] == 18048) {
                            n8 = 9;
                            n9 = 151;
                        }
                        if (c[i4] == 18010) {
                            n8 = 113;
                            n9 = 186;
                        }
                        if (c[i4] == 18011) {
                            n8 = 117;
                            n9 = 190;
                        }
                        if (c[i4] == 18008) {
                            n8 = 78;
                            n9 = 185;
                        }
                        if (c[i4] == 18009) {
                            n8 = 81;
                            n9 = 190;
                        }
                        if (c[i4] == 18045) {
                            n8 = 150;
                            n9 = 112;
                        }
                        if (c[i4] == 18046) {
                            n8 = 153;
                            n9 = 116;
                        }
                    }
                    n8 += n7;
                    if (c[i4] == 687 || c[i4] == 5651) {
                        rs.n.e.H[43501].b(i4, c[i4], n8, -5000);
                        continue;
                    }
                    rs.n.e.H[43501].b(i4, c[i4], n8, n9);
                }
            }
        }
    }

    @Override
    public void a() {
        int n2;
        int n3;
        e e2 = ah_0.j(5608);
        e e3 = H[687];
        ah_0.c(5651, 0, "prayer/PRAYER");
        e3.ad = 16750623;
        e3.aS = true;
        e3.at = "%1/%2";
        int[] nArray = new int[]{18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023, 18024, 18025, 18026, 18027, 18028, 18029, 18030, 18031, 18032, 18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041, 18042, 18043, 18044};
        int[] nArray2 = new int[]{8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116, 152, 8, 44, 80, 116, 150, 6, 44, 80, 116, 150, 6, 42, 78, 114};
        int[] nArray3 = new int[]{6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114, 114, 114, 114, 112, 148, 150, 150, 150, 148, 184, 184, 184, 184};
        int[] nArray4 = new int[]{18050, 18052, 18054, 18056, 18058, 18060, 18062, 18064, 18066, 18068, 18070, 18072, 18074, 18076, 18078, 18080, 18082, 18084, 18086, 18088, 18090, 18092, 18094, 18096, 18555, 18098, 18100, 18102, 18104};
        int[] nArray5 = new int[]{12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5, 5, 5, 5, 5, 18, 28, 28, 50, 1, 1, 6, 10, 10};
        int[] nArray6 = new int[]{42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118, 118, 118, 150, 150, 150, 150, 150, 105, 80, 65, 65, 65, 110, 110, 110, 110};
        String[] stringArray = new String[]{"Level 01\nThick Skin\nIncreases your Defence by 5%", "Level 04\nBurst of Strength\nIncreases your Strength by 5%", "Level 07\nCharity of Thought\nIncreases your Attack by 5%", "Level 08\nSharp Eye\nIncreases your Ranged by 5%", "Level 09\nMystic Will\nIncreases your Magic by 5%", "Level 10\nRock Skin\nIncreases your Defence by 10%", "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%", "Level 16\nImproved Reflexes\nIncreases your Attack by 10%", "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer", "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat", "Level 25\nProtect Item\nKeep one extra item if you die", "Level 26\nHawk Eye\nIncreases your Ranged by 10%", "Level 27\nMystic Lore\nIncreases your Magic by 10%", "Level 28\nSteel Skin\nIncreases your Defence by 15%", "Level 31\nUltimate Strength\nIncreases your Strength by 15%", "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%", "Level 37\nProtect from Magic\nProtection from magical attacks", "Level 40\nProtect from Missiles\nProtection from ranged attacks", "Level 43\nProtect from Melee\nProtection from close attacks", "Level 44\nEagle Eye\nIncreases your Ranged by 15%", "Level 45\nMystic Might\nIncreases your Magic by 15%", "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die", "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%", "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer", "Level 55\nPreserve\nBoosted stats last 50% longer", "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%", "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%", "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%", "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%"};
        String[] stringArray2 = new String[]{"Thick Skin", "Burst of Strength", "Charity of Thought", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Retribution", "Redemption", "Smite"};
        ah_0.b(18000, 0, 601, 7, 0, "Sharp Eye");
        ah_0.b(18002, 0, 602, 8, 1, "Mystic Will");
        ah_0.b(18004, 0, 603, 25, 2, "Hawk Eye");
        ah_0.b(18006, 0, 604, 26, 3, "Mystic Lore");
        ah_0.b(18008, 0, 605, 43, 4, "Eagle Eye");
        ah_0.b(18010, 0, 606, 44, 5, "Mystic Might");
        ah_0.b(18012, 0, 607, 59, 6, "Chivalry");
        ah_0.b(18014, 0, 608, 69, 7, "Piety");
        ah_0.b(18045, 0, 609, 73, 8, "Rigour");
        ah_0.b(18047, 0, 610, 76, 9, "Augury");
        ah_0.b(18553, 0, 611, 54, 10, "Preserve");
        ah_0.h(43500, "prayer/sprite 2");
        ah_0.h(43502, "prayer/sprite 1");
        ah_0.a(43503, "@or2@0%", this.a, 0, 0, true, true);
        ah_0.a(43504, "@or2@0%", this.a, 0, 0, true, true);
        ah_0.a(43505, "@or2@0%", this.a, 0, 0, true, true);
        ah_0.a(43506, "@or2@0%", this.a, 0, 0, true, true);
        ah_0.a(43507, "@or2@0%", this.a, 0, 0, true, true);
        ah_0.a(43508, "Hide stat adjustments", "Hide stat adjustments", this.a, 0, 16750623, true, true, 150);
        e e4 = ah_0.d(43501);
        e4.P = 174;
        e4.aR = 176;
        e4.aH = 225;
        e4.k(116);
        e2.k(11);
        for (n3 = 0; n3 < 18; ++n3) {
            ah_0.c(c[n3], stringArray2[n3]);
        }
        for (n3 = 0; n3 < 29; ++n3) {
            ah_0.a(nArray[n3], nArray4[n3], n3, stringArray[n3]);
        }
        e2.k(11);
        for (n3 = 0; n3 < c.length; ++n3) {
            n2 = -2;
            if (d[n3] > 10) {
                n2 = -4;
            }
            if (d[n3] > 50) {
                n2 -= 2;
            }
            if (d[n3] > 100) {
                n2 -= 2;
            }
            if (d[n3] > 150) {
                n2 -= 2;
            }
            if (c[n3] == 687 || c[n3] == 5651) {
                e4.b(n3, c[n3], d[n3] + n2, -5000);
                continue;
            }
            e4.b(n3, c[n3], d[n3] + n2, e[n3]);
        }
        n3 = 58;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            e4.b(n3, nArray[n2], nArray2[n2], nArray3[n2]);
            ++n3;
        }
        for (n2 = 0; n2 < nArray4.length; ++n2) {
            e4.b(n3, nArray4[n2], nArray5[n2], nArray6[n2]);
            ++n3;
        }
        e2.b(0, 43501, 1, 0);
        e2.b(1, 43500, 1, 220);
        e2.b(2, 43502, 1, 176);
        e2.b(3, 5651, 65, 242);
        e2.b(4, 687, 15, 244);
        e2.b(5, 43503, 20, 207);
        e2.b(6, 43504, 57, 207);
        e2.b(7, 43505, 96, 207);
        e2.b(8, 43506, 135, 207);
        e2.b(9, 43507, 173, 207);
        e2.b(10, 43508, 21, 225);
    }
}

