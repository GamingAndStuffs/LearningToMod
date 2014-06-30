package com.harry9137.miscmod;

import com.harry9137.miscmod.creativetab.MiscModTab;
import com.harry9137.miscmod.init.ItemInit;
import com.harry9137.miscmod.init.RecipiesInit;
import com.harry9137.miscmod.proxy.IProxy;
import com.harry9137.miscmod.reference.Resources;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import com.harry9137.miscmod.reference.debugmessages;

@Mod(
        modid= Resources.modid,
        name=Resources.name,
        version=Resources.version
)
public class MiscMod
{

    @Mod.Instance(Resources.modid)
    public static MiscMod instance;

    @SidedProxy(clientSide = Resources.clientProxyPackage, serverSide = Resources.serverProxyPackage)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ItemInit.itemInit();


       // BlockInit.initBlock();


    }

    public void init(FMLInitializationEvent event)
    {
        RecipiesInit.initRecipies();
        debugmessages.RecipieInitDebug();

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
