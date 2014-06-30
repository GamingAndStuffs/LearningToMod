package com.harry9137.miscmod.reference;

public class debugmessages {
    private static Boolean Debug = Resources.Debug;

    public static void ItemInitDebug() {if (Debug) {System.out.println("==========Item Init Begin==========");}}

    public static void ingotDestinyDebug() {if (Debug) {System.out.println("Ingot of Destiny Loaded");}}

    //public static void pickaxeDestinyDebug() {if (Debug) {System.out.println("Pickaxe of Destiny Loaded");}}

    public static void BlockInitDebug() {if (Debug) {System.out.println("==========Block Init Begin==========");}}

    public static void blockDestinyDebug() {if (Debug) {System.out.println("Block of Destiny Loaded");}}

    public static void RecipieInitDebug(){if( Debug){System.out.println("==========Recipie Init Begin==========");}}

    public static void recipieingotDestinyDebug() {if (Debug) {System.out.println("Recipie for Ingot of Destiny Loaded");}}

    public static void recipieblockDestinyDebug() {if (Debug) {System.out.println("Recipie for block of Destiny Loaded");}}

    public static void creativeTabDebug(){if(Debug){System.out.println("Creative Tab Initilized");}}

    //public static void proxyDebug(){if(Debug){System.out.println("Proxy Initilized");}}


}