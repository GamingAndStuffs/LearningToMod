package com.harry9137.MiscMod.item;

import com.harry9137.MiscMod.block.blockC4;
import com.harry9137.MiscMod.creativeTab.ctMiscMod;
import com.harry9137.MiscMod.reference.names;
import com.harry9137.MiscMod.tileEntity.TileEntityC4;
import cpw.mods.fml.common.Mod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class itemC4Det extends itemsMiscMod {
    public itemC4Det(){
        super();
        this.setUnlocalizedName(names.Items.itemC4Det);
        this.setMaxStackSize(1);
        this.setCreativeTab(ctMiscMod.MiscModTab);
    }
  //  public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_){
  //
  //      e
  //  }

}
