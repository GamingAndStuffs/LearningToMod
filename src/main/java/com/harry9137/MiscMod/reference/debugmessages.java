package com.harry9137.MiscMod.reference;

import com.harry9137.MiscMod.utillity.LogHelper;

public class debugmessages {
    private static Boolean Debug = Resources.Debug;

    public static void ItemInitDebug() {if (Debug) {LogHelper.debug("==========Item Init Begin==========");}}

    public static void ingotDestinyDebug() {if (Debug) {LogHelper.debug("Ingot of Destiny Loaded");}}

    //public static void pickaxeDestinyDebug() {if (Debug) {LogHelper.debug("Pickaxe of Destiny Loaded");}}

    public static void BlockInitDebug() {if (Debug) {LogHelper.debug("==========Block Init Begin==========");}}

    public static void blockDestinyDebug() {if (Debug) {LogHelper.debug("Block of Destiny Loaded");}}

    public static void RecipieInitDebug(){if( Debug){LogHelper.debug("==========Recipie Init Begin==========");}}

    public static void recipieingotDestinyDebug() {if (Debug) {LogHelper.debug("Recipie for Ingot of Destiny Loaded");}}

    public static void recipieblockDestinyDebug() {if (Debug) {LogHelper.debug("Recipie for block of Destiny Loaded");}}

    public static void creativeTabDebug(){if(Debug){LogHelper.debug("Creative Tab Initilized");}}

    //public static void proxyDebug(){if(Debug){LogHelper.debug("Proxy Initilized");}}

    public static void configDebug(){if(Debug){LogHelper.debug("Configurations Loaded Initilized");}}


}