package com.ocelot.betteranimals;

import org.apache.logging.log4j.Logger;

import com.ocelot.betteranimals.client.RenderHandler;
import com.ocelot.betteranimals.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BetterAnimals.MODID, acceptedMinecraftVersions = "[1.12,1.12.2]", version = BetterAnimals.VERSION, clientSideOnly = true, dependencies = "after:sophisticatedwolves|primal")
public class BetterAnimals {

	public static final String MODID = "betteranimals";
	public static final String VERSION = "3.0";

	@Instance(MODID)
	public static BetterAnimals instance;

	private static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		RenderHandler.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RenderHandler.postinit();
	}

	public static Logger logger() {
		return logger;
	}
}