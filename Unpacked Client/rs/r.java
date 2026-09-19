/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.Client;
import rs.f.a;
import rs.gui.Launcher;

public class r {
    public static boolean a(String object) {
        int[] nArray = null;
        if (((String)object).contains("Donator mystery box")) {
            object = (String)object + "\nHas a chance to give some of the \nmost valuable items in the game!";
            nArray = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (((String)object).contains("Boost pack (5)")) {
            object = (String)object + "\nGives 5 random boosts!";
            nArray = new int[]{23620, 23621, 23622, 21163, 22091, 24172, 24182, 23461, 21736};
        } else if (((String)object).contains("Exotic mystery box")) {
            object = (String)object + "\nGives exotic & unique rewards.";
            nArray = new int[]{27479, 27486, 27480, 27481, 27484, 27485, 27482, 27184};
        } else if (((String)object).contains("Prize ticket (u)")) {
            object = (String)object + "\nGives 2 random prizes!";
            nArray = new int[]{22876, 22099, 6200, 14523, 10524, 7678, 13999};
        } else if (((String)object).contains("Blood key")) {
            object = (String)object + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@very rare@whi@ rewards.";
            nArray = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
        } else if (((String)object).contains("Grand blood key")) {
            object = (String)object + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a guaranteed\n@mag@very rare@whi@ reward.";
            nArray = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
        } else if (((String)object).contains("PvP mystery box")) {
            object = (String)object + "\nGives a random morrigan, zuriel,\nstatius or vesta armor or weapon piece.";
            object = (String)object + "\nHas a @or1@rare chance@whi@ to give @cya@strongest@whi@ pvp\nweapons in the game!";
            nArray = new int[]{22887, 22889, 22888, 21073};
        } else if (((String)object).contains("Rare event box")) {
            object = (String)object + "\nGuarantees one of the most valuable rares";
            object = (String)object + "\nfrom previous SpawnPK events!";
            nArray = new int[]{20797, 22850, 22851, 22883, 23228, 21818};
        } else if (((String)object).contains("Bond casket key")) {
            object = (String)object + "\nUse on a @yel@Bond casket@whi@ to receive\na random bond between $30 and $100.";
            nArray = new int[]{16003, 16004, 16005, 16006};
        } else if (((String)object).contains("Bond casket")) {
            object = (String)object + "\nGives a random bond between\n$5 and $30 bonds.";
            nArray = new int[]{16000, 16001, 16002, 16003};
        } else if (((String)object).contains("Mystery crate")) {
            object = (String)object + "\nGives a random Bounty shop item.";
            object = (String)object + "\nHas a @or1@rare chance@whi@ to give @cya@imbued Abyssal dagger@whi@!";
            nArray = new int[]{12912, 19335, 20554, 20555, 20556, 22227, 22216, 21106, 21013, 23161, 23180};
        } else if (((String)object).contains("3rd age mystery box")) {
            object = (String)object + "\nGives a random original 3rd age item,\nnot including the bow and sword.";
            nArray = new int[]{10330, 10332, 10338, 10340, 10346, 10348, 10350, 10352, 12422};
        } else if (((String)object).contains("H'ween mystery box")) {
            object = (String)object + "\n@or1@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso gives 25-300 h'ween event tokens!\n";
            nArray = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (((String)object).contains("Easter mystery box")) {
            object = (String)object + "\n@cya@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso may include an extra easter item!";
            nArray = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (((String)object).contains("Summer mystery box")) {
            object = (String)object + " @whi@- @yel@Seasonal!\nHas a chance to give some of the \nmost valuable items in the game!\nAlso has a chance for 2X rewards!";
            nArray = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (((String)object).contains("Holiday mystery box")) {
            object = (String)object + " @whi@- @yel@Seasonal!\nGives 50-100 winter shards upon opening";
            nArray = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (((String)object).contains("Ultimate mystery chest")) {
            object = (String)object + "\nOpens 5 donor mystery boxes at once.\nEach item is a guaranteed rare!\n@or1@Not useable with prize keys!";
            nArray = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (((String)object).contains("Mystery chest")) {
            object = (String)object + "\nOpens 5 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
            nArray = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (((String)object).contains("H'ween mystery chest")) {
            object = (String)object + "\n@or1@Seasonal\nOpens 5 donor mystery boxes at once.\nRare chance for blood diamond items! \nGives 250-1500 h'ween event tokens.";
            nArray = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (((String)object).contains("Easter mystery chest")) {
            object = (String)object + "\nMystery chest with a rare chance for\nan easter partyhat, flippers, or\npet accessory! Additionally gives\nstacks of choccy tokens alongside loot.";
            nArray = new int[]{21063, 21068, 21062, 20539, 20540, 25103, 20485, 25101, 20468};
        } else if (((String)object).contains("Blood chest")) {
            object = (String)object + "\nOpens 5 donor mystery boxes at once.\nGuarentees at least one blood diamond item.";
            nArray = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (((String)object).contains("Mystery bag")) {
            object = (String)object + "\nOpens 3 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
            nArray = new int[]{25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (((String)object).contains("Cursed mystery crate")) {
            object = (String)object + "\nChance to give bounty shop\nrewards as well as other unique\nrewards that can only be\nobtained from this crate!";
            nArray = new int[]{22084, 21870, 21823, 21824, 21833, 21866, 21845, 21846, 21847, 21848, 21849, 16000};
        } else if (((String)object).contains("Epic pet mystery chest")) {
            object = " @gre@Epic pet chest\nOpens for five commonly high valued pets.\nRare chance for fusion pets!";
            nArray = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
        } else if (((String)object).contains("Epic pet mystery box")) {
            object = " @gre@Epic pet box\nCommonly gives high valued pets.\nRare chance for fusion pets!";
            nArray = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
        } else if (((String)object).contains("Pet fuse box")) {
            object = (String)object + "\nGives a random epic fusion pet.";
            nArray = new int[]{25104, 12113, 19382, 19240, 20692, 15004};
        } else if (((String)object).contains("Pet fuse chest")) {
            object = (String)object + "\nGives five random epic fusion pets.";
            nArray = new int[]{25104, 12113, 19382, 19240, 20692, 15004};
        } else if (((String)object).contains("Christmas cracker")) {
            object = (String)object + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance for \nan @cya@enchanted partyhat or h'ween mask!";
            nArray = new int[]{19042, 11864, 11862, 1042, 1038, 1040, 1044, 1046, 1048, 1050, 19043, 1053, 1055, 1057, 4274};
        } else if (((String)object).contains("Easter cracker")) {
            object = (String)object + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance \nfor an @cya@Easter partyhat!";
            nArray = new int[]{21063, 19042, 11864, 11862, 1042, 1038, 1040, 1044, 1046, 1048, 1050, 19043, 1053, 1055, 1057, 4274};
        } else if (((String)object).contains("Summer package")) {
            object = (String)object + "\n@cya@Limited seasonal item!\nOpens for the following:\n- Past promotional item (rare \nchance for a pet fuse box)\n- 25,000 summer gems\n- Complimentary bond ($20-30)\n- Summer mystery box";
            nArray = new int[]{21132, 20577, 20701, 20731, 20771, 16002, 16003};
        } else if (((String)object).contains("$75.00 bond")) {
            object = (String)object + "\nOpens for @yel@7,500 donator tickets.\nAlso opens for @yel@1 FREE mystery box\nYou'll also receive +$75 total\ndonated upon opening the bond.";
            nArray = new int[]{4067, 6200, 4067, 6200, 4067, 6200, 4067, 6200};
        } else if (((String)object).contains("$100.00 bond")) {
            object = (String)object + "\nOpens for @yel@10,000 donator tickets.\nAlso opens for @yel@3 FREE mystery boxes\nYou'll also receive +$100 total\ndonated upon opening the bond.";
            nArray = new int[]{4067, 6200, 6200, 6200};
        } else if (((String)object).contains("$500.00 bond")) {
            object = (String)object + "\nOpens for @yel@50,000 donator tickets.\nAlso opens for @yel@3 FREE mystery chests\nYou'll also receive +$500 total\ndonated upon opening the bond.";
            nArray = new int[]{4067, 14523, 14523, 14523};
        } else if (((String)object).contains("H'ween package")) {
            object = (String)object + "\n@cya@Limited time season item!\nOpens for the following:\n- 5,000 h'ween tokens\n- H'ween mystery chest\n- Prize key\n- Chance for a promo item";
            nArray = new int[]{21689, 21690, 7678, 20731, 20771};
        } else if (((String)object).contains("Ultimate h'ween package")) {
            object = (String)object + "\n@cya@Limited time season item!\nOpens for the following:\n- 10,000 h'ween tokens\n- H'ween mystery chest\n- Grand prize key\n- Guarenteed promo item";
            nArray = new int[]{21689, 21690, 7678, 20731, 20771};
        } else if (((String)object).contains("H'ween 2019 casket")) {
            object = (String)object + "\n@cya@Grants a random rare from the following:\n- Blood reaper scythe hilt\n- Blood reaper pet\n- Reaper bludgeon\n- 3x h'ween dyes";
            nArray = new int[]{23202, 23204, 23217, 23224};
        } else if (((String)object).contains("Winter 2019 casket")) {
            object = (String)object + "\n@cya@Grants a random rare from the following:\n- Frosty twisted branch\n- Winter demon pet\n- Promo package III\n- 3x Grand crests";
            nArray = new int[]{21819, 21805, 21605, 20771};
        } else if (((String)object).contains("Easter 2020 casket")) {
            object = (String)object + "\n@cya@Grants a random rare from the following:\n- Easter elemental c'bow\n- Easter dragon pet\n- 3x Easter dyes\n- 3x Grand crests\n- Grand promo package @yel@(rare)";
            nArray = new int[]{21945, 21915, 20771, 21880, 21665};
        } else if (((String)object).contains("Summer 2020 casket")) {
            object = (String)object + "\n@cya@Grants a random rare from the following:\n- Lunar saradomin sword\n- Lunar hide body / chaps\n- Solar dark bow\n- Solar / Lunar demon pet\n- Solar / Lunar icon\n- Grand promo package @yel@(rare)";
            nArray = new int[]{22017, 22016, 22002, 22001, 22030, 22029, 21665};
        }
        if (nArray != null) {
            int n2 = Client.hQ - 10;
            int n3 = Client.hP - 10;
            if (Client.cH == 60600 || Client.cH == 52000 && a.ai == a.c.a) {
                n2 = Client.hQ + 110;
            }
            Launcher.n().o().a(n3, n2, "@lre@" + (String)object, nArray);
            return true;
        }
        return false;
    }
}

