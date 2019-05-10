package com.ocelot.betteranimals.config;

import com.ocelot.betteranimals.BetterAnimals;

import net.minecraftforge.common.config.Configuration;

public class BetterAnimalsConfig {


    public static boolean enableQuarkOverrideCow = true;
    public static boolean enableQuarkOverridePig = true;
    public static boolean enableQuarkOverrideChicken = true;

    public static void readConfig(){
        Configuration cfg = BetterAnimals.config;
        try {
            cfg.load();
            initConfig(cfg);
        } catch (Exception e1) {
            BetterAnimals.logger().log(org.apache.logging.log4j.Level.ERROR, "Problem Loading Config!", e1);
        } finally {
            if(cfg.hasChanged()){
                cfg.save();
            }
        }
    }

    public static void initConfig(Configuration cfg) {
        cfg.addCustomCategoryComment("EnableMobs_new", "Disable/Enable Replacement (post 5.1), delete old section safely");

        enableQuarkOverrideCow = cfg.getBoolean("enablequarkoverridecow", "quark_compat", true, "enable overriding quark's override. Cow must be enabled as well.");
        enableQuarkOverridePig = cfg.getBoolean("enablequarkoverridepig", "quark_compat", true, "enable overriding quark's override. Pig must be enabled as well.");
        enableQuarkOverrideChicken = cfg.getBoolean("enablequarkoverridechicken", "quark_compat", true, "enable overriding quark's override. Chicken must be enabled as well.");
    }

}
