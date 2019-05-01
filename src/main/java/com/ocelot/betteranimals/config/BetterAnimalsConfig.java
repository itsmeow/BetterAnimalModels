package com.ocelot.betteranimals.config;

import com.ocelot.betteranimals.BetterAnimals;

import net.minecraftforge.common.config.Configuration;

public class BetterAnimalsConfig {

	private static final String cDS = "EnableMobs";

	public static boolean enableCow = true;
	public static boolean enablePig = true;
	public static boolean enableSheep = true;
	public static boolean enableWolf = true;
	public static boolean enableChicken = true;
	public static boolean enableSpider = true;
	public static boolean enableSilverfish = true;
	public static boolean enablePolarBear = true;
	public static boolean enableMooshroom = true;
	public static boolean enableCaveSpider = true;
	public static boolean enableSophisticatedWolf = true;
	public static boolean enableSteppeWolf_primalcore = true;
	public static boolean enableOvisAtre_primalcore = true;
	public static boolean enableBlackBear_primalcore = true;
	public static boolean enableBrownBear_primalcore = true;
	public static boolean enableEvilPig = true;
	public static boolean enableEvilCow = true;
	public static boolean enableEvilChicken = true;
	public static boolean enableEvilSheep = true;
	public static boolean enableDemonPig = true;
	public static boolean enableDemonCow = true;
	public static boolean enableDemonChicken = true;
	public static boolean enableDemonSheep = true;
	public static boolean enableAntiPig = true;
	public static boolean enableAntiCow = true;
	public static boolean enableAntiChicken = true;
	public static boolean enableAntiSpider = true;
	public static boolean enableBrownMushroom = true;
	public static boolean enableSquid = true;
	public static boolean enableCoraliumSquid = true;
	public static boolean enableQuarkOverrideCow = true;
	public static boolean enableQuarkOverridePig = true;
	public static boolean enableQuarkOverrideChicken = true;
    public static boolean enableNightstag = true;

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
		cfg.addCustomCategoryComment(cDS, "Disable/Enable Replacement");

		enableCow = cfg.getBoolean("enablecow", cDS, true, "");
		enablePig = cfg.getBoolean("enablepig", cDS, true, "");
		enableSheep = cfg.getBoolean("enablesheep", cDS, true, "");
		enableWolf = cfg.getBoolean("enablewolf", cDS, true, "");
		enableChicken = cfg.getBoolean("enablechicken", cDS, true, "");
		enableSpider = cfg.getBoolean("enablespider", cDS, true, "");
		enableSilverfish = cfg.getBoolean("enablesilverfish", cDS, true, "");
		enablePolarBear = cfg.getBoolean("enablepolarbear", cDS, true, "");
		enableMooshroom = cfg.getBoolean("enablemooshroom", cDS, true, "");
		enableCaveSpider = cfg.getBoolean("enablecavespider", cDS, true, "");
		enableSquid = cfg.getBoolean("enablesquid", cDS, true, "");
		enableSophisticatedWolf = cfg.getBoolean("enablesophisticatedwolf", cDS, true, "from Sophisticated Wolves");
		enableSteppeWolf_primalcore = cfg.getBoolean("enablesteppewolf_primalcore", cDS, true, "from PrimalCore");
		enableOvisAtre_primalcore = cfg.getBoolean("enableovisatre_primalcore", cDS, true, "from PrimalCore");
		enableBlackBear_primalcore = cfg.getBoolean("enableblackbear_primalcore", cDS, true, "from PrimalCore");
		enableBrownBear_primalcore = cfg.getBoolean("enablebrownbear_primalcore", cDS, true, "from PrimalCore");
		enableEvilPig = cfg.getBoolean("enableevilpig", cDS, true, "from Abyssalcraft");
		enableEvilCow = cfg.getBoolean("enableevilcow", cDS, true, "from Abyssalcraft");
		enableEvilChicken = cfg.getBoolean("enableevilchicken", cDS, true, "from Abyssalcraft");
		enableEvilSheep = cfg.getBoolean("enableevilsheep", cDS, true, "from Abyssalcraft");
		enableDemonPig = cfg.getBoolean("enabledemonpig", cDS, true, "from Abyssalcraft");
		enableDemonCow = cfg.getBoolean("enabledemoncow", cDS, true, "from Abyssalcraft");
		enableDemonChicken = cfg.getBoolean("enabledemonchicken", cDS, true, "from Abyssalcraft");
		enableDemonSheep = cfg.getBoolean("enabledemonsheep", cDS, true, "from Abyssalcraft");
		enableAntiPig = cfg.getBoolean("enableantipig", cDS, true, "from Abyssalcraft");
		enableAntiCow = cfg.getBoolean("enableanticow", cDS, true, "from Abyssalcraft");
		enableAntiChicken = cfg.getBoolean("enableantichicken", cDS, true, "from Abyssalcraft");
		enableAntiSpider = cfg.getBoolean("enableantispider", cDS, true, "from Abyssalcraft");
		enableCoraliumSquid = cfg.getBoolean("enablecoraliumsquid", cDS, true, "from Abyssalcraft");
		enableBrownMushroom = cfg.getBoolean("enablebrownmushroom", cDS, true, "from Brown Mushrooms mod");
		enableQuarkOverrideCow = cfg.getBoolean("enablequarkoverridecow", cDS, true, "enable overriding quark's override. Cow must be enabled as well.");
		enableQuarkOverridePig = cfg.getBoolean("enablequarkoverridepig", cDS, true, "enable overriding quark's override. Pig must be enabled as well.");
		enableQuarkOverrideChicken = cfg.getBoolean("enablequarkoverridechicken", cDS, true, "enable overriding quark's override. Chicken must be enabled as well.");
		enableNightstag = cfg.getBoolean("enablenightstag", cDS, true, "from The Midnight");
	}

}
