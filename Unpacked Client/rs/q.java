/*
 * Decompiled with CFR 0.152.
 */
package rs;

public class q {
    public static String a(String object) {
        if (object == null) {
            return null;
        }
        if (((String)object).toLowerCase().contains("killer's dagger")) {
            object = (String)object + "\nThis oddly resembles\na dragon dagger..";
        } else if (((String)object).contains("Adventurer's whip")) {
            object = (String)object + "\nDeals +25% damage in PvM\nBut max hit is @or1@capped at 60!";
        } else if (((String)object).contains("Blood key")) {
            object = (String)object + "\nUse on @yel@wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@rare@whi@ ornament kits.";
        } else if (((String)object).contains("Summer elixir")) {
            object = (String)object + "\nGrants @yel@25%@whi@ more @yel@summer\n@yel@gems@whi@ for one hour.";
        } else if (((String)object).toLowerCase().contains("easter dharok")) {
            object = (String)object + "\nUnique dharoks that gives\nextra @gre@+5@whi@ slash bonus on each\npiece. Also has @or1@1/4 chance\nto deal @gre@2x@whi@ damage in PvM.";
        } else if (((String)object).contains("Superior blood rev scroll")) {
            object = (String)object + "\n100% chance to spawn @or1@Superior\n@or1@blood rev@whi@ when killing blood revs.\nConsumes scroll on summon.";
        } else if (((String)object).contains("Spooky hween scroll")) {
            object = (String)object + "\nGrants @yel@25%@whi@ more @yel@hween\n@yel@tokens@whi@ for one hour.";
        } else if (((String)object).contains("Seasonal drop boost scroll")) {
            object = (String)object + "\nGrants @yel@+15%@whi@ drop rate\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (((String)object).contains("Seasonal drop doubler scroll")) {
            object = (String)object + "\nGrants @yel@5%@whi@ chance for 2x drops\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (((String)object).contains("Seasonal hotspot scroll")) {
            object = (String)object + "\nGrants @yel@+25%@whi@ chance for hotspot\ncaskets only during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (((String)object).contains("Seasonal blood rev scroll")) {
            object = (String)object + "\nGrants @yel@+25%@whi@ chance for superior\nrev spawns only during @yel@Seasonal evente@whi@\nand lasts for one hour.";
        } else if (((String)object).contains("Repair scroll")) {
            object = (String)object + "\nRepairs any piece of broken\narmor, free of charge!";
        } else if (((String)object).toLowerCase().contains("machete")) {
            object = (String)object + "\nThis might be useful for\nchopping jungle trees.";
        } else if (((String)object).toLowerCase().contains("scrapey tree logs")) {
            object = (String)object + "\nThese can be fletched\ninto trading sticks.";
        } else if (((String)object).toLowerCase().contains("crest piece")) {
            object = (String)object + "\nCombine all three pieces\nfor ancient treasures.";
        } else if (((String)object).toLowerCase().contains("holy shard") || ((String)object).toLowerCase().contains("shard of balance")) {
            object = (String)object + "\nI should take these to \nKolodion in the Mage arena.";
        } else if (((String)object).toLowerCase().contains("mystic coins")) {
            object = (String)object + "\nObtained from a limited\ntime Mage Arena event.";
        } else if (((String)object).toLowerCase().contains("summer totem")) {
            object = (String)object + "\nCollect 5 to teleport\nto an instanced event boss!\n(Lunar and Solar demon)";
        } else if (((String)object).toLowerCase().contains("bloodlust scroll")) {
            object = ((String)object).toLowerCase().contains("refer") ? (String)object + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 30 minutes." : (String)object + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 15 minutes.";
        } else if (((String)object).toLowerCase().contains("thief's scroll")) {
            object = (String)object + "\nEarn @gre@2x@whi@ loot from\nthieving for 15 minutes.\n<img=6> Best used at rogue's chest";
        } else if (((String)object).toLowerCase().contains("larran's loot scroll")) {
            object = (String)object + "\nEarn @gre@2x@whi@ larran's keys from\nblood slayer for 20 minutes.";
        } else if (((String)object).toLowerCase().contains("(st.)")) {
            object = (String)object + "\nThis item can be taken\nto Mandrith to exchange for coins.";
        } else if (((String)object).toLowerCase().contains("choccy tokens")) {
            object = (String)object + "\nFrom the limited time\neaster holiday event.";
        } else if (((String)object).toLowerCase().contains("bloodwyrm scroll")) {
            object = (String)object + "\nWhen activated, bloodwyrm will\nbe guarenteed to spawn after\nthe next wildywyrm death.";
        } else if (((String)object).toLowerCase().contains("crumbled summer gem")) {
            object = (String)object + "\nExpired summer gems from\nthe Summer event of 2017-2019";
        } else if (((String)object).toLowerCase().contains("lava key")) {
            object = (String)object + "\nUsed to open the lava chest\nat the center of the lava maze.";
        } else if (((String)object).toLowerCase().contains("heraldic salvage")) {
            object = (String)object + "\nSalvages are used in\nthe enchantment chest\nfor enchanted heraldics.";
        } else if (((String)object).contains("Dragon upgrade scroll")) {
            object = (String)object + "\nBoosts accuracy of all\ndragon weapon special\nattacks by +15%";
        } else if (((String)object).contains("Egg weapon charge")) {
            object = (String)object + "\nBinding this to an\neaster weapon will\nprogress it further\ninto its imbued form!";
        } else if (((String)object).contains("Holiday cake")) {
            object = (String)object + "\nGrants @yel@25%@whi@ more @yel@winter\n@yel@shards@whi@ for one hour.";
        } else if (((String)object).contains("Vintage dungeon tele")) {
            object = (String)object + "\nTeleports you to a Singles+ wildy\ndungeon where most customs\nare restricted!";
        } else if (((String)object).toLowerCase().contains("beginner ags") || ((String)object).toLowerCase().contains("beginner dragon claws")) {
            object = (String)object + "\nCrumbles to dust after you\napply 75 hits in PvP combat.";
        } else {
            return null;
        }
        return object;
    }
}

