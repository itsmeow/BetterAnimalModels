package com.ocelot.betteranimals;

import java.io.File;

import org.apache.logging.log4j.Logger;

import com.ocelot.betteranimals.client.RenderHandler;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = BetterAnimals.MODID, acceptedMinecraftVersions = "[1.12,1.12.2]", version = BetterAnimals.VERSION, clientSideOnly = true, dependencies = "after:sophisticatedwolves|primal|abyssalcraft|brownmushrooms|quark")
public class BetterAnimals {

	public static final String MODID = "betteranimals";
	public static final String VERSION = "4.0";

	@Instance(MODID)
	public static BetterAnimals instance;

	private static Logger logger;

	public static Configuration config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if(event.getSide() == Side.SERVER) {
			throw new RuntimeException("This is quite literally impossible. I'm afraid of what you've done. This mod does not load on the server, and should not load on the server. What are you doing. Stop. I don't deserve this. -its_meow. Also, report this to me ASAP.");
		}
		logger = event.getModLog();
		File directory = event.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "betteranimals.cfg")); 
		BetterAnimalsConfig.readConfig();
		BetterAnimalsConfig.initConfig(config);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		RenderHandler.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RenderHandler.postinit();
		if(config.hasChanged()){
			config.save();
		}
	}

	public static Logger logger() {
		return logger;
	}
}