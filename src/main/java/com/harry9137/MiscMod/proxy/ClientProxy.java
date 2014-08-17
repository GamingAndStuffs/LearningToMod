package com.harry9137.MiscMod.proxy;

import com.harry9137.MiscMod.renderer.RenderC4;
import com.harry9137.MiscMod.tileEntity.TileEntityC4;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class ClientProxy extends CommonProxy {
    public void registerRenderer(){
        //C4
        TileEntitySpecialRenderer render = new RenderC4();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityC4.class, render);
    }

    public void registerTileEntityRender(){

    }


}
