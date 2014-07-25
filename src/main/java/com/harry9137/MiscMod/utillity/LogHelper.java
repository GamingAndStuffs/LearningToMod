package com.harry9137.MiscMod.utillity;

import com.harry9137.MiscMod.reference.Resources;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Resources.name, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, Resources.LoggingID + object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, Resources.LoggingID + object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, Resources.LoggingID + object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, Resources.LoggingID + object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, Resources.LoggingID + object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, Resources.LoggingID + object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, Resources.LoggingID + object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, Resources.LoggingID + object);
    }
}
