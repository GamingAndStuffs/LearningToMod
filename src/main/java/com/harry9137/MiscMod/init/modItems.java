package com.harry9137.MiscMod.init;

import com.harry9137.MiscMod.item.*;
import com.harry9137.MiscMod.reference.Resources;
import com.harry9137.MiscMod.utillity.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by A Username on 7/11/2014.
 */
@GameRegistry.ObjectHolder(Resources.modid)
public class modItems {

    public static final itemsMiscMod ingotDestiny = new itemIngotDestiny();



    public static void init(){
        GameRegistry.registerItem(ingotDestiny, "ingotDestiny");
        LogHelper.debug("GAME REGESTERY");
    }
}
