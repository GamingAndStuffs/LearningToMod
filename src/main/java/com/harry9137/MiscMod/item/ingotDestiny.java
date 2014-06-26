package com.harry9137.MiscMod.item;

import com.harry9137.MiscMod.creativeTab.MiscModTab;
import com.harry9137.MiscMod.item.MiscModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;

public class ingotDestiny extends Item{
    public static Item ingotDestiny;
    public static void add() {
        ingotDestiny = new MiscModItems()
                .setUnlocalizedName("ingotDestiny").
                setTextureName("ingotDestiny").
                setCreativeTab(MiscModTab.tabMiscMod);

        GameRegistry.registerItem(ingotDestiny, "Ingot of Destiny");
       // GameRegistry.addRecipe(new ItemStack(ingotDestiny),
       //         new Object[]{
       //                 "DDD",
        //                 "DGD",
       //                 "DDD",
       //                 "D", ItemitemDiamond

       //         }




    }
}
