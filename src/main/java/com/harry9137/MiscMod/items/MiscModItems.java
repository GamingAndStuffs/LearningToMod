package com.harry9137.MiscMod.items;

import com.harry9137.MiscMod.MiscMod;
import com.harry9137.MiscMod.Resources;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class MiscModItems extends Item {
    public MiscModItems(){
        //NOTE: MiscMod Creative Tab Not yet Implimented
        this.setCreativeTab(getCreativeTab().tabMiscMod);
    }

    @SideOnly(Side.CLIENT)
    public void regesterItems(IIconRegister iconRegister){

        this.itemIcon = iconRegister.registerIcon(Resources.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
