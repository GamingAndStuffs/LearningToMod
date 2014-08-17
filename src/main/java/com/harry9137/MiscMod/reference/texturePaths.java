package com.harry9137.MiscMod.reference;

import net.minecraft.util.ResourceLocation;

public class texturePaths {

    public static final String TexturePrefix = Resources.modid + ":textures/model/";

    public static final String blockDestiny = "blockDestiny";
    public static final String blockC4 = "blockC4";

   public static ResourceLocation getModelTexture(String object){
       ResourceLocation resource = new ResourceLocation(TexturePrefix + object + ".png");
       System.out.println(resource.toString());
       return resource;
   }
}
