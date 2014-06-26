package com.harry9137.MiscMod;

import com.harry9137.MiscMod.init.BlockInit;
import com.harry9137.MiscMod.init.ItemInit;
import com.harry9137.MiscMod.init.RecipiesInit;
import com.harry9137.MiscMod.resources.Resources;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import net.minecraft.item.Item;

@Mod(
        modid= Resources.modid,
        name=Resources.name,
        version=Resources.version
)
public class MiscMod
{
    @Mod.Instance("MiscMod")
    public static MiscMod instance;

    public static Item itemDestinyIngot;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ItemInit.itemInit();

        BlockInit.initBlock();

    }

    public void init(FMLInitializationEvent event)
    {
        RecipiesInit.initRecipies();

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
