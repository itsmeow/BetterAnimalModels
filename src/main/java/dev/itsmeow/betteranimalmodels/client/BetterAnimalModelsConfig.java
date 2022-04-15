package dev.itsmeow.betteranimalmodels.client;

import org.apache.commons.lang3.tuple.Pair;

import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.ReplacementConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;

public class BetterAnimalModelsConfig {

    public static ForgeConfigSpec CLIENT_CONFIG_SPEC = null;

    public static ForgeConfigSpec getClientConfigSpec() {
        if(CLIENT_CONFIG_SPEC == null) {
            final Pair<BetterAnimalModelsConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(BetterAnimalModelsConfig::new);
            CLIENT_CONFIG_SPEC = specPair.getRight();
        }
        return CLIENT_CONFIG_SPEC;
    }

    public static ReplacementConfig replace;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideCow;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverridePig;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideChicken;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideBee;

    private BetterAnimalModelsConfig(ForgeConfigSpec.Builder builder) {
        replace = Replacements.H.getConfig(builder, (builder2, map) -> {
            ReplacementConfig.addConfig(builder2, map, "minecraft", "cow");
            ReplacementConfig.addConfig(builder2, map, "minecraft", "pig");
            ReplacementConfig.addConfig(builder2, map, "minecraft", "chicken");
        });

        if(ModList.get().isLoaded("quark")) {
            builder.push("quark_compat");
            enableQuarkOverrideCow = builder.comment("enable overriding quark's override. Cow must be enabled as well.").define("enablequarkoverridecow", true);
            enableQuarkOverridePig = builder.comment("enable overriding quark's override. Pig must be enabled as well.").define("enablequarkoverridepig", true);
            enableQuarkOverrideChicken = builder.comment("enable overriding quark's override. Chicken must be enabled as well.").define("enablequarkoverridechicken", true);
            enableQuarkOverrideBee = builder.comment("enable overriding quark's override. Bee must be enabled as well. This will not have the LGBT bee textures, as there are too many for us to make right now.").define("enablequarkoverridebee", true);
            builder.pop();
        }

        builder.build();
    }

}
