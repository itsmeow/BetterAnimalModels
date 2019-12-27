package com.ocelot.betteranimals;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ocelot.betteranimals.client.ReplacementHandler;

import net.minecraftforge.common.ForgeConfigSpec;

public class BetterAnimalsConfig {

    public static final Logger LOG = LogManager.getLogger();

    public static ForgeConfigSpec CLIENT_CONFIG_SPEC = null;

    public static void setupConfig() {
        final Pair<BetterAnimalsConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(BetterAnimalsConfig::new);
        CLIENT_CONFIG_SPEC = specPair.getRight();
    }
    
    public static OverridesConfiguration replace_config;

    private BetterAnimalsConfig(ForgeConfigSpec.Builder builder) {
        Map<String, Map<String, ForgeConfigSpec.BooleanValue>> map = new HashMap<String, Map<String, ForgeConfigSpec.BooleanValue>>();
        ReplacementHandler.replaceDefs.values().forEach(m -> m.keySet().forEach(pair -> {
            map.putIfAbsent(pair.getLeft(), new HashMap<String, ForgeConfigSpec.BooleanValue>());
            builder.push(pair.getLeft());
            ForgeConfigSpec.BooleanValue value = builder.define("replace_" + pair.getRight(), true);
            map.get(pair.getLeft()).put(pair.getRight(), value);
            builder.pop();
        }));
        replace_config = new OverridesConfiguration(map);
        builder.build();
    }

    public static class OverridesConfiguration {
        public final Map<String, Map<String, ForgeConfigSpec.BooleanValue>> mods;

        public OverridesConfiguration(Map<String, Map<String, ForgeConfigSpec.BooleanValue>> mods) {
            this.mods = mods;
        }
    }

}
