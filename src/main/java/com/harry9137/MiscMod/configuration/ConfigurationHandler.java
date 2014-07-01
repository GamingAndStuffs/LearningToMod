package com.harry9137.miscmod.configuration;

import com.harry9137.miscmod.reference.Resources;
import com.harry9137.miscmod.reference.debugmessages;
import com.harry9137.miscmod.utillity.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        debugmessages.configDebug();
        Boolean succesful = false;


        Configuration configuration = new Configuration(configFile);

        try{

            //Load the congig file
            configuration.load();
            LogHelper.info(Resources.LoggingID + "Attempting to load configuration files");
            succesful = true;

            //Read in Properties from config file
            int ingotDestinyID = configuration.get("Item Ids", "Ingot of Destiny ID", 666 , "This is a value").getInt(666);
        }
        catch(Exception e){
            // Log the exeption
            LogHelper.fatal(Resources.LoggingID + "Encountered a Error When Loading Configurations: " + e );
            succesful = false;

        }
        finally{

            //Save the congig file
            configuration.save();
            if (succesful){
                LogHelper.info(Resources.LoggingID + "Configurations Loaded Sucessfully");
            }
            else{
                LogHelper.fatal(Resources.LoggingID + "Congiguration Loading Failed");
            }

        }
    }
}
