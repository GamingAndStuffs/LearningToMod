package com.harry9137.miscmod.item;

import com.harry9137.miscmod.creativetab.MiscModTab;
import com.harry9137.miscmod.reference.debugmessages;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraft.init.Items;

public class ingotDestiny extends Item{
    public static Item ingotDestiny;
    public static void add() {
        debugmessages.ingotDestinyDebug();
        ingotDestiny = new MiscModItems()
                .setUnlocalizedName("ingotDestiny").
                        setTextureName("ingotDestiny").
                        setCreativeTab(MiscModTab.tabMiscMod);

        GameRegistry.registerItem(ingotDestiny, "Ingot of Destiny");
    }
    public static void addRecipie() {
        debugmessages.recipieingotDestinyDebug();
        GameRegistry.addShapedRecipe(new ItemStack(ingotDestiny),
                new Object[]{
                        "DDD",
                        "DGD",
                        "DDD",
                        "D", Items.diamond,
                        "G", Items.gold_ingot

                }
        );
    }




    }

