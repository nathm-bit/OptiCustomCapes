
package net.fishwifi.optiCustomCapes.mixin;

import net.fishwifi.optiCustomCapes.config.OptiCustomCapesConfig;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;


@Pseudo
@Mixin(targets = "net.optifine.player.CapeUtils", remap = false)
public abstract class CapeUtilsMixin {
    @Dynamic
    @ModifyConstant(method = "downloadCape", constant = @Constant(stringValue = "http://s.optifine.net/capes/", ordinal = 0))
    private static String modifyCapeUrl(String originalUrl) {
        String link = OptiCustomCapesConfig.capeServer;
        if (link == null || link.isEmpty()) {
            link = "http://s.optifine.net/capes/";
        } else if (!link.endsWith("/")) {
            link += "/";
        }

        String modifiedUrl = link + originalUrl.substring(originalUrl.lastIndexOf('/') + 1);
        return modifiedUrl;
    }
}
