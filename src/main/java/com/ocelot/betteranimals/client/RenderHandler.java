package com.ocelot.betteranimals.client;

import org.apache.logging.log4j.Level;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.RenderNewCaveSpider;
import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.client.render.entity.RenderNewCow;
import com.ocelot.betteranimals.client.render.entity.RenderNewMooshroom;
import com.ocelot.betteranimals.client.render.entity.RenderNewPig;
import com.ocelot.betteranimals.client.render.entity.RenderNewPolarBear;
import com.ocelot.betteranimals.client.render.entity.RenderNewSheep;
import com.ocelot.betteranimals.client.render.entity.RenderNewSilverfish;
import com.ocelot.betteranimals.client.render.entity.RenderNewSpider;
import com.ocelot.betteranimals.client.render.entity.RenderNewWolf;
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
		BetterAnimals.logger().log(Level.DEBUG, "PrimalCore proxy: " + primalcore);
		BetterAnimals.logger().log(Level.DEBUG, "AbyssalCraft proxy: " + abyssalcraft);
		if(primalcore != null) {
			primalcore.register();
		}
		if(abyssalcraft != null) {
			abyssalcraft.register();
		}
	}

	// This must take place in postinit because sophisticatedwolves has placed it in init (fixed in later versions)
	public static void postinit() {
		BetterAnimals.logger().log(Level.DEBUG, "SophisticatedWolves proxy: " + sophisticatedwolves);
		if(sophisticatedwolves != null && BetterAnimalsConfig.enableSophisticatedWolf) {
			sophisticatedwolves.register();
		}
	}
	
	/** Get the compatability proxy for a given modid, uses reflection.
	 * @param modid - Modid to check if loaded
	 * @param classNameActive - The class name to return if the mod is active
	 * @param classNameInactive - The class name to return if the mod is not present
	 * @return The proper proxy class for whether the mod is loaded or not **/
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
