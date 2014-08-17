package com.harry9137.MiscMod.utillity;

import cpw.mods.fml.common.registry.GameRegistry;
import com.harry9137.MiscMod.item.itemsMiscMod;
import com.harry9137.MiscMod.block.BlockMiscMod;

public class GameRegisteryHelper {
    public static void register(BlockMiscMod object){
        GameRegistry.registerBlock(object, object.getUnlocalizedName());
    }
    public static void register(itemsMiscMod object){
        GameRegistry.registerItem(object, object.getUnlocalizedName());
    }
}
