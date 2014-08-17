package com.harry9137.MiscMod;

import com.harry9137.MiscMod.init.Recipies;
import com.harry9137.MiscMod.block.blockC4;
import com.harry9137.MiscMod.handler.ConfigurationHandler;
import com.harry9137.MiscMod.init.modBlocks;
import com.harry9137.MiscMod.init.modItems;
import com.harry9137.MiscMod.proxy.IProxy;
import com.harry9137.MiscMod.reference.Resources;
import com.harry9137.MiscMod.utillity.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Resources.modid, name = Resources.name, version = Resources.version, guiFactory = Resources.GuiFactoryClass)
public class MiscMod
{

    @Mod.Instance(Resources.modid)
    public static MiscMod instance;

    @SidedProxy(clientSide = Resources.clientProxyPackage, serverSide = Resources.serverProxyPackage)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {


        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        modItems.init();
        modBlocks.init();

        proxy.registerRenderer();

        LogHelper.info("PreInit Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new blockC4());


        Recipies.initBlocks();
        Recipies.intiItems();
        Recipies.initSmelting();

        LogHelper.info("PreInit Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PreInit Complete!");
    }
}
