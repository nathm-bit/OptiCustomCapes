package net.fishwifi.optiCustomCapes.config;

import cc.polyfrost.oneconfig.config.data.InfoType;
import net.fishwifi.optiCustomCapes.OptiCustomCapes;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.*;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

/**
 * The main Config entrypoint that extends the Config type and inits the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class        OptiCustomCapesConfig extends Config {
    @Info(
            text = "Reload your cape in the Skin Customization > OptiFine Cape section in Minecraft settings.",
            type = InfoType.INFO,
            size = 2
    )
    private boolean info = false;


    @Text(
            name = "Cape Server",
            placeholder = "http://",
            description = "If no URL is provided, OptiFine capes will be used."
    )
    public static String capeServer = "";

    public OptiCustomCapesConfig() {
        super(new Mod(OptiCustomCapes.NAME, ModType.UTIL_QOL, "/icon.png"), OptiCustomCapes.MODID + ".json");
        initialize();
    }
}

