package com.harry9137.MiscMod.creativeTab;

import com.harry9137.MiscMod.item.ingotDestiny;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class MiscModTab {
    public static final CreativeTabs tabMiscMod = new CreativeTabs("MiscMod Items")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){

                return ingotDestiny.ingotDestiny;
        }
    };
}
