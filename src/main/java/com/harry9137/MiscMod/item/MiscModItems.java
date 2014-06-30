package com.harry9137.miscmod.item;

import com.harry9137.miscmod.reference.Resources;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class MiscModItems extends Item {

    public MiscModItems() {
        this.setCreativeTab(this.getCreativeTab());
        //this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Resources.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
