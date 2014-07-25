package com.harry9137.MiscMod.init;

import com.harry9137.MiscMod.block.BlockMiscMod;
import com.harry9137.MiscMod.block.blockDestiny;
import com.harry9137.MiscMod.reference.Resources;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Resources.modid)
public class modBlocks {
    public static BlockMiscMod blockDestiny = new blockDestiny();
    public static void init(){
        GameRegistry.registerBlock(blockDestiny, "blockDestiny");
    }
}
