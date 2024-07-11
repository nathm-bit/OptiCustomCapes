package net.fishwifi.optiCustomCapes;

import net.fishwifi.optiCustomCapes.config.OptiCustomCapesConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = OptiCustomCapes.MODID, name = OptiCustomCapes.NAME, version = OptiCustomCapes.VERSION)
public class OptiCustomCapes {

    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static OptiCustomCapes INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static OptiCustomCapesConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new OptiCustomCapesConfig();
    }
}
