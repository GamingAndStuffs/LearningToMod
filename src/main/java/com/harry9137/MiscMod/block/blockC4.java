package com.harry9137.MiscMod.block;

import com.harry9137.MiscMod.block.BlockMiscMod;
import com.harry9137.MiscMod.creativeTab.ctMiscMod;
import com.harry9137.MiscMod.reference.names;
import com.harry9137.MiscMod.tileEntity.TileEntityC4;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.awt.event.ItemEvent;

public class blockC4 extends BlockMiscMod {
    private EntityTNTPrimed entitytntprimed;
    private Double[] cords = {this.getBlockBoundsMaxX(), this.getBlockBoundsMaxY(), this.getBlockBoundsMaxZ()};
    public blockC4(){
        super(Material.tnt);
        this.setBlockName(names.Blocks.blockC4);
        this.setCreativeTab(ctMiscMod.MiscModTab);
    }
    public boolean det(){
        World p_150114_1_ = MinecraftServer.getServer().getEntityWorld();
        entitytntprimed = new EntityTNTPrimed(p_150114_1_, cords[0], cords[1], cords[2], null);
        p_150114_1_.spawnEntityInWorld(entitytntprimed);
        p_150114_1_.playSoundAtEntity(entitytntprimed, "game.tnt.primed", 1.0F, 1.0F);
        return true;
    }
    @SubscribeEvent
    public void onRightClickDet(PlayerInteractEvent event){
        det();

    }
   // public int getRenderType(){
   //     return -1;
   // }
   // public boolean isOpaqueCube(){
   //     return false;
   // }
   // public boolean renderAsNormalBlock(){
   //     return false;
   // }
    //public TileEntityC4 createNewTileEntity(World var1, int var2){
    //    return new TileEntityC4();
    //}
}
