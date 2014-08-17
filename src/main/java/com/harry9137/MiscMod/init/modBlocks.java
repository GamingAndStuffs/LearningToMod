package com.harry9137.MiscMod.init;

import com.harry9137.MiscMod.block.*;
import com.harry9137.MiscMod.reference.Resources;
import cpw.mods.fml.common.registry.GameRegistry;

import static com.harry9137.MiscMod.utillity.GameRegisteryHelper.register;


@GameRegistry.ObjectHolder(Resources.modid)
public class modBlocks {


    public static BlockMiscMod blockDestiny = new blockDestiny();
    public static BlockMiscMod blockC4 = new blockC4();
    public static BlockMiscMod blockCopper = new blockCopper();
    public static BlockMiscMod blockCopperOre = new blockCopperOre();

    public static void init(){
        register(blockDestiny);
        register(blockC4);
        register(blockCopper);
        register(blockCopperOre);
    }
}
