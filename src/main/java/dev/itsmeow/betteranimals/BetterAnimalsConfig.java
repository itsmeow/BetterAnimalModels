package dev.itsmeow.betteranimals;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.itsmeow.betteranimals.client.Replacements;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.ReplacementConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;

public class BetterAnimalsConfig {

    public static final Logger LOG = LogManager.getLogger();

    public static ForgeConfigSpec CLIENT_CONFIG_SPEC = null;

    public static void setupConfig() {
        final Pair<BetterAnimalsConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(BetterAnimalsConfig::new);
        CLIENT_CONFIG_SPEC = specPair.getRight();
    }

    public static ReplacementConfig replace;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideCow;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverridePig;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideChicken;

    private BetterAnimalsConfig(ForgeConfigSpec.Builder builder) {
        replace = Replacements.HANDLER.getConfig(builder, (builder2, map) -> {
            ReplacementConfig.addConfig(builder2, map, "minecraft", "cow");
            ReplacementConfig.addConfig(builder2, map, "minecraft", "pig");
            ReplacementConfig.addConfig(builder2, map, "minecraft", "chicken");
        });

        if(ModList.get().isLoaded("quark")) {
            builder.push("quark_compat");
            enableQuarkOverrideCow = builder.comment("enable overriding quark's override. Cow must be enabled as well.").define("enablequarkoverridecow", true);
            enableQuarkOverridePig = builder.comment("enable overriding quark's override. Pig must be enabled as well.").define("enablequarkoverridepig", true);
            enableQuarkOverrideChicken = builder.comment("enable overriding quark's override. Chicken must be enabled as well.").define("enablequarkoverridechicken", true);
            builder.pop();
        }

        builder.build();
    }

}
