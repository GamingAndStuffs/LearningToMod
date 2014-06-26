package com.harry9137.MiscMod.blocks;


import com.harry9137.MiscMod.creativeTab.MiscModTab;
import com.harry9137.MiscMod.item.ingotDestiny;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import com.harry9137.MiscMod.blocks.MiscModBlockStem;

public class blockDestinyBlock{
public static Block blockDestiny;

    public static void add(){
        blockDestiny = new MiscModBlockStem(blockDestiny).setBlockName("blockDestiny").setCreativeTab(MiscModTab.tabMiscMod);
        GameRegistry.registerBlock(blockDestiny, "blockDestiny");

    }
    public static void addRecipie(){
        GameRegistry.addRecipe(new ItemStack(blockDestiny),new Object[]{
                "DDD",
                "DDD",
                "DDD",
                "D", ingotDestiny.ingotDestiny
        });
    }
}
