package com.harry9137.MiscMod.init;

import com.harry9137.MiscMod.init.modBlocks;
import com.harry9137.MiscMod.init.modItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipies {

    public static Object[] blockDestinyRecipie = {"ddd","ddd","ddd",'d', new ItemStack(modItems.ingotDestiny)};
    public static ItemStack blockDestinyStack = new ItemStack(modBlocks.blockDestiny);

    public static Object[] blockCopperRecipie = {"ccc", "ccc", "ccc", 'c', new ItemStack(modItems.itemCopperIngot)};
    public static ItemStack blockCopperStack = new ItemStack(modBlocks.blockCopper);

    public static ItemStack itemNineCopperIngotsStack = new ItemStack(modItems.itemCopperIngot, 9);

    public static ItemStack itemCopperIngotStack = new ItemStack(modItems.itemCopperIngot);
    public static ItemStack blockCopperOreStack = new ItemStack(modBlocks.blockCopperOre);


    public static void initBlocks(){

        GameRegistry.addRecipe(blockDestinyStack, blockDestinyRecipie);
        GameRegistry.addShapedRecipe(blockCopperStack, blockCopperRecipie);

    }
    public static void intiItems(){
        GameRegistry.addShapelessRecipe(itemNineCopperIngotsStack, blockCopperStack);

    }
    public static void initSmelting(){
        GameRegistry.addSmelting(blockCopperOreStack, itemCopperIngotStack, 15.0F);
    }
}
