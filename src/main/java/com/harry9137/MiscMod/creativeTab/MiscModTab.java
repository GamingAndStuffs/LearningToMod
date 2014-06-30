package com.harry9137.miscmod.creativetab;

import com.harry9137.miscmod.item.ingotDestiny;
import com.harry9137.miscmod.reference.debugmessages;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class MiscModTab {

    private void Debug(){debugmessages.creativeTabDebug();}

    public static final CreativeTabs tabMiscMod = new CreativeTabs("miscmod Items")
    {

        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){

                return ingotDestiny.ingotDestiny;
        }
    };
}
