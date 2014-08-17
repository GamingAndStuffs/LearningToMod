package com.harry9137.MiscMod.init;

import com.harry9137.MiscMod.item.*;
import com.harry9137.MiscMod.reference.Resources;
import cpw.mods.fml.common.registry.GameRegistry;

import static com.harry9137.MiscMod.utillity.GameRegisteryHelper.register;

/**
 * Created by A Username on 7/11/2014.
 */
@GameRegistry.ObjectHolder(Resources.modid)
public class modItems {

    public static final itemsMiscMod ingotDestiny = new itemIngotDestiny();
    public static final itemsMiscMod itemC4Det = new itemC4Det();
    public static final itemsMiscMod itemCopperIngot = new itemIngotCopper();

    public static void init(){
        register(ingotDestiny);
        register(itemC4Det);
        register(itemCopperIngot);
    }
}
