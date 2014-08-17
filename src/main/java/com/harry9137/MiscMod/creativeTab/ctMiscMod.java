package com.harry9137.MiscMod.creativeTab;

import com.harry9137.MiscMod.init.modItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.harry9137.MiscMod.reference.Resources;

public class ctMiscMod {
    public static final CreativeTabs MiscModTab = new CreativeTabs(Resources.modid.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return modItems.ingotDestiny;
        }

    };
}
