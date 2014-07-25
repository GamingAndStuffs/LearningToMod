package com.harry9137.MiscMod.handler;

import com.harry9137.MiscMod.reference.Resources;
import com.harry9137.MiscMod.reference.debugmessages;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static int IngotDestinyID = 666;

    public static void init(File configFile) {
        debugmessages.configDebug();
        Boolean succesful = false;


        if (configuration == null){
            configuration = new Configuration(configFile);

        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Resources.modid)){
            loadConfigurations();
        }
    }

    public void loadConfigurations(){

        IngotDestinyID = configuration.getInt("Ingot of Destiny ID", Configuration.CATEGORY_GENERAL, 666, 1, 9999, "The ID for the item Ingot of Destiny");

        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}
