package com.harry9137.MiscMod.block;

import com.harry9137.MiscMod.creativeTab.ctMiscMod;
import com.harry9137.MiscMod.reference.names;
import com.harry9137.MiscMod.reference.texturePaths;
import net.minecraft.block.material.Material;

public class blockDestiny extends BlockMiscMod {
    public blockDestiny(){
        super(Material.iron);
        this.setBlockName(names.Blocks.blockDestiny);
        this.setBlockTextureName(texturePaths.blockDestiny);
        this.setCreativeTab(ctMiscMod.MiscModTab);
    }
}
