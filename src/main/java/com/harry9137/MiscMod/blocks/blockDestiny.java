package com.harry9137.miscmod.blocks;


import com.harry9137.miscmod.creativetab.MiscModTab;
import com.harry9137.miscmod.item.ingotDestiny;
import com.harry9137.miscmod.reference.debugmessages;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class blockDestiny extends Block{
    private static final String __OBFID = "CL_00000197";
    public static final Block blockDestiny = (Block)Block.blockRegistry.getObject("blockDestiny");

    public blockDestiny(){
        super(Material.iron);
        this.setHardness(4.0F);
        this.setCreativeTab(MiscModTab.tabMiscMod);
    }

    public static void add(){
        debugmessages.blockDestinyDebug();

        GameRegistry.registerBlock(blockDestiny, "blockDestiny");

    }
    public static void addRecipie(){
        debugmessages.recipieblockDestinyDebug();
        GameRegistry.addRecipe(new ItemStack(blockDestiny),new Object[]{
                "DDD",
                "DDD",
                "DDD",
                "D", ingotDestiny.ingotDestiny
        });
    }
}
