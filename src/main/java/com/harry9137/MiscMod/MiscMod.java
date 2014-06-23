package com.harry9137.MiscMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import net.minecraft.item.Item;
import com.harry9137.MiscMod.Resources;
import com.harry9137.MiscMod.items.MiscModItems;

@Mod(
        modid=Resources.modid,
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

        itemDestinyIngot = new MiscModItems().setUnlocalizedName("IngotofDestiny");

    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
