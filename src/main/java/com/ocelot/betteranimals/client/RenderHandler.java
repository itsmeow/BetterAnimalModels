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
import com.ocelot.betteranimals.client.render.entity.RenderNewSquid;
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
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;

public class RenderHandler {

    public static ModInteropProxy primalcore;
    public static ModInteropProxy sophisticatedwolves;
    public static ModInteropProxy abyssalcraft;
    public static ModInteropProxy brownmooshrooms;
    public static ModInteropProxy quark;

    public static void init() {
        if(BetterAnimalsConfig.enableCow)
            RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, RenderNewCow::new);
        if(BetterAnimalsConfig.enablePig)
            RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, RenderNewPig::new);
        if(BetterAnimalsConfig.enableChicken)
            RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, RenderNewChicken::new);
        if(BetterAnimalsConfig.enableSheep)
            RenderingRegistry.registerEntityRenderingHandler(EntitySheep.class, RenderNewSheep::new);
        if(BetterAnimalsConfig.enableWolf)
            RenderingRegistry.registerEntityRenderingHandler(EntityWolf.class, RenderNewWolf::new);
        if(BetterAnimalsConfig.enableMooshroom)
            RenderingRegistry.registerEntityRenderingHandler(EntityMooshroom.class, RenderNewMooshroom::new);
        if(BetterAnimalsConfig.enableSquid)
            RenderingRegistry.registerEntityRenderingHandler(EntitySquid.class, m -> new RenderNewSquid(m, null));

        // Mobs
        if(BetterAnimalsConfig.enableSpider)
            RenderingRegistry.registerEntityRenderingHandler(EntitySpider.class, RenderNewSpider::new);
        if(BetterAnimalsConfig.enableCaveSpider)
            RenderingRegistry.registerEntityRenderingHandler(EntityCaveSpider.class, RenderNewCaveSpider::new);
        if(BetterAnimalsConfig.enableSilverfish)
            RenderingRegistry.registerEntityRenderingHandler(EntitySilverfish.class, RenderNewSilverfish::new);
        if(BetterAnimalsConfig.enablePolarBear)
            RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, RenderNewPolarBear::new);

        //Mod Compat

        //Load proxy classes
        primalcore = getInteropProxy("primal", "ActiveCompatPrimalCore", "InactiveCompatPrimalCore");
        sophisticatedwolves = getInteropProxy("sophisticatedwolves", "ActiveCompatSophisticatedWolves", "InactiveCompatSophisticatedWolves");
        abyssalcraft = getInteropProxy("abyssalcraft", "ActiveCompatAbyssalCraft", "InactiveCompatAbyssalCraft");
        brownmooshrooms = getInteropProxy("brownmooshrooms", "ActiveCompatBrownMooshrooms", "InactiveCompatBrownMooshrooms");
        quark = getInteropProxy("quark", "ActiveCompatQuark", "InactiveCompatQuark");

        //Register renderers for classes
        //Check for non null to prevent NullPointers if exceptions are thrown
        BetterAnimals.logger().log(Level.DEBUG, "PrimalCore proxy: " + primalcore);
        BetterAnimals.logger().log(Level.DEBUG, "AbyssalCraft proxy: " + abyssalcraft);
        BetterAnimals.logger().log(Level.DEBUG, "BrownMooshrooms proxy: " + brownmooshrooms);
        BetterAnimals.logger().log(Level.DEBUG, "Quark proxy: " + quark);
        if(primalcore != null) {
            primalcore.register();
        }
        if(abyssalcraft != null) {
            abyssalcraft.register();
        }
        if(brownmooshrooms != null) {
            brownmooshrooms.register();
        }
        if(quark != null) {
            quark.register();
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
     * @param classNameActive - The class name to return if the mod is active in com.ocelot.betteranimals.compat
     * @param classNameInactive - The class name to return if the mod is not present located in com.ocelot.betteranimals.compat
     * @return The proper proxy class for whether the mod is loaded or not **/
    private static ModInteropProxy getInteropProxy(String modid, String classNameActive, String classNameInactive) {
        ModInteropProxy proxy = null;
        try {
            if (Loader.isModLoaded(modid)) {
                BetterAnimals.logger().log(Level.DEBUG, "Loading compat classes for mod: " + modid);
                // reflection to avoid hard dependency
                proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameActive).asSubclass(ModInteropProxy.class).newInstance();
                BetterAnimals.logger().log(Level.DEBUG, "Found proxy: " + proxy);
            } else {
                proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameInactive).asSubclass(ModInteropProxy.class).newInstance();
            }
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            BetterAnimals.logger().error("Error retrieving compatibility class for mod " + modid + " in BetterAnimals. This is a bug. Report this on our issues page (see Curse).");
            BetterAnimals.logger().error("BetterAnimals load status on " + modid + " is " + Loader.isModLoaded(modid));
        }
        return proxy;
    }
}
