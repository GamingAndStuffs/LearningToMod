package com.harry9137.miscmod.reference;

public class Resources {
    public static final String clientProxyPackage = "com.harry9137.miscmod.proxy.ClientProxy";
    public static final String serverProxyPackage = "com.harry9137.miscmod.proxy.ServerProxy";
    public static final String modid = "miscmod";
    public static final String name = "Misc Mod";
    public static final String version = "1.7.2-1.0";
    public static final String fingerprint = "@FINGERPRINT@";
    public static final Boolean Debug = false;
    public static final String LoggingID = "[" + name + "]";

    public static String getModid(){
        return modid;
    }

    public static String getName(){
        return name;
    }

    public static String getVersion(){
        return version;
    }



}
