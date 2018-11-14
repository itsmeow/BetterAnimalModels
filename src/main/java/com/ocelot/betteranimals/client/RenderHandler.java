package com.ocelot.betteranimals.client;

import org.apache.logging.log4j.Level;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.*;
import com.ocelot.betteranimals.compat.InactiveCompatPrimalCore;
import com.ocelot.betteranimals.compat.ModInteropProxy;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;

public class RenderHandler {

	static ModInteropProxy primalcore;
	static ModInteropProxy sophisticatedwolves;
	static ModInteropProxy abyssalcraft;

	public static void init() {
		if(BetterAnimalsConfig.enableCow)
			RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, new RenderNewCow());
		if(BetterAnimalsConfig.enablePig)
			RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, new RenderNewPig());
		if(BetterAnimalsConfig.enableChicken)
			RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, new RenderNewChicken());
		if(BetterAnimalsConfig.enableSheep)
			RenderingRegistry.registerEntityRenderingHandler(EntitySheep.class, new RenderNewSheep());
		if(BetterAnimalsConfig.enableWolf)
			RenderingRegistry.registerEntityRenderingHandler(EntityWolf.class, new RenderNewWolf());
		if(BetterAnimalsConfig.enableMooshroom)
			RenderingRegistry.registerEntityRenderingHandler(EntityMooshroom.class, new RenderNewMooshroom());

		// Mobs
		if(BetterAnimalsConfig.enableSpider)
			RenderingRegistry.registerEntityRenderingHandler(EntitySpider.class, new RenderNewSpider());
		if(BetterAnimalsConfig.enableCaveSpider)
			RenderingRegistry.registerEntityRenderingHandler(EntityCaveSpider.class, new RenderNewCaveSpider());
		if(BetterAnimalsConfig.enableSilverfish)
			RenderingRegistry.registerEntityRenderingHandler(EntitySilverfish.class, new RenderNewSilverfish());
		if(BetterAnimalsConfig.enablePolarBear)
			RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, new RenderNewPolarBear());

		//Mod Compat

		//Load proxy classes
		primalcore = getInteropProxy("primal", "ActiveCompatPrimalCore", "InactiveCompatPrimalCore");
		sophisticatedwolves = getInteropProxy("sophisticatedwolves", "ActiveCompatSophisticatedWolves", "InactiveCompatSophisticatedWolves");
		abyssalcraft = getInteropProxy("abyssalcraft", "ActiveCompatAbyssalCraft", "InactiveCompatAbyssalCraft");

		//Register renderers for classes
		//Check for non null to prevent NullPointers if exceptions are thrown
		BetterAnimals.logger().log(Level.DEBUG, "Primalcore proxy: " + primalcore);
		BetterAnimals.logger().log(Level.DEBUG, "Abyssalcraft proxy: " + abyssalcraft);
		if(primalcore != null) {
			primalcore.register();
		}
		if(abyssalcraft != null) {
			abyssalcraft.register();
		}
	}

	// This must take place in postinit because sophisticatedwolves has placed it in init
	public static void postinit() {
		BetterAnimals.logger().log(Level.DEBUG, "SophisticatedWolves proxy: " + sophisticatedwolves);
		if(sophisticatedwolves != null && BetterAnimalsConfig.enableSophisticatedWolf) {
			sophisticatedwolves.register();
		}
	}

	private static ModInteropProxy getInteropProxy(String modid, String classNameActive, String classNameInactive) {
		ModInteropProxy proxy = null;
		if (Loader.isModLoaded(modid)) {
			BetterAnimals.logger().log(Level.DEBUG, "Loading compat classes for mod: " + modid);
			// reflection to avoid hard dependency
			try {
				proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameActive).asSubclass(ModInteropProxy.class).newInstance();
				BetterAnimals.logger().log(Level.DEBUG, "Found proxy: " + proxy);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameInactive).asSubclass(ModInteropProxy.class).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return proxy;
	}
}
