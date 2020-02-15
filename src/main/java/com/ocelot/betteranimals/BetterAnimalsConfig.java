package com.ocelot.betteranimals;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ocelot.betteranimals.client.ReplacementHandler;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;

public class BetterAnimalsConfig {

    public static final Logger LOG = LogManager.getLogger();

    public static ForgeConfigSpec CLIENT_CONFIG_SPEC = null;

    public static void setupConfig() {
        final Pair<BetterAnimalsConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(BetterAnimalsConfig::new);
        CLIENT_CONFIG_SPEC = specPair.getRight();
    }
    
    public static OverridesConfiguration replace_config;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideCow;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverridePig;
    public static ForgeConfigSpec.BooleanValue enableQuarkOverrideChicken;

    private BetterAnimalsConfig(ForgeConfigSpec.Builder builder) {
        Map<String, Map<String, ForgeConfigSpec.BooleanValue>> map = new HashMap<String, Map<String, ForgeConfigSpec.BooleanValue>>();
        ReplacementHandler.replaceDefs.values().forEach(m -> m.keySet().forEach(pair -> addConfig(builder, map, pair.getLeft(), pair.getRight())));
        addConfig(builder, map, "minecraft", "cow");
        addConfig(builder, map, "minecraft", "pig");
        addConfig(builder, map, "minecraft", "chicken");
        replace_config = new OverridesConfiguration(map);
        
        if(ModList.get().isLoaded("quark")) {
            builder.push("quark_compat");
            enableQuarkOverrideCow = builder.comment("enable overriding quark's override. Cow must be enabled as well.").define("enablequarkoverridecow", true);
            enableQuarkOverridePig = builder.comment("enable overriding quark's override. Pig must be enabled as well.").define("enablequarkoverridepig", true);
            enableQuarkOverrideChicken = builder.comment("enable overriding quark's override. Chicken must be enabled as well.").define("enablequarkoverridechicken", true);
            builder.pop();
        }
        
        builder.build();
    }
    
    private static void addConfig(ForgeConfigSpec.Builder builder, Map<String, Map<String, ForgeConfigSpec.BooleanValue>> map, String modid, String name) {
        map.putIfAbsent(modid, new HashMap<String, ForgeConfigSpec.BooleanValue>());
        builder.push(modid);
        ForgeConfigSpec.BooleanValue value = builder.define("replace_" + name, true);
        map.get(modid).put(name, value);
        builder.pop();
    }

    public static class OverridesConfiguration {
        public final Map<String, Map<String, ForgeConfigSpec.BooleanValue>> mods;

        public OverridesConfiguration(Map<String, Map<String, ForgeConfigSpec.BooleanValue>> mods) {
            this.mods = mods;
        }
    }

}
