package com.ocelot.betteranimals.client;

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
import com.ocelot.betteranimals.compat.QuarkSpecialHandler;
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
    public static QuarkSpecialHandler quarkSpecial;
    public static ModInteropProxy midnight;
    
    private static boolean quarkLoaded = false;

    public static void preinit() {
        quark = getInteropProxy(ModInteropProxy.class, "quark", "ActiveCompatQuark", "InactiveCompatQuark");
        quarkSpecial = getInteropProxy(QuarkSpecialHandler.class, "quark", "QuarkSpecialHandlerActive", "QuarkSpecialHandlerInactive");
        midnight = getInteropProxy(ModInteropProxy.class, "midnight", "ActiveCompatMidnight", "InactiveCompatMidnight");
        BetterAnimals.logger().debug("Quark proxy: " + quark);
        BetterAnimals.logger().debug("Midnight proxy: " + midnight);
        if(quarkSpecial != null) {
            quarkSpecial.preQuark();
        }
        if(quark != null) {
            quarkLoaded = quark.register();
        }
        if(midnight != null) {
            midnight.register();
        }
    }

    public static void init() {
        if(BetterAnimalsConfig.enableCow && (!BetterAnimalsConfig.enableQuarkOverrideCow || quark == null || !quarkLoaded))
            RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, RenderNewCow::new);
        if(BetterAnimalsConfig.enablePig && (!BetterAnimalsConfig.enableQuarkOverridePig || quark == null || !quarkLoaded))
            RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, RenderNewPig::new);
        if(BetterAnimalsConfig.enableChicken && (!BetterAnimalsConfig.enableQuarkOverrideChicken || quark == null || !quarkLoaded))
            RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, RenderNewChicken::new);
        if(BetterAnimalsConfig.enableSheep)
            RenderingRegistry.registerEntityRenderingHandler(EntitySheep.class, RenderNewSheep::new);
        if(BetterAnimalsConfig.enableWolf)
            RenderingRegistry.registerEntityRenderingHandler(EntityWolf.class, RenderNewWolf::new);
        if(BetterAnimalsConfig.enableMooshroom)
            RenderingRegistry.registerEntityRenderingHandler(EntityMooshroom.class, RenderNewMooshroom::new);
        if(BetterAnimalsConfig.enableSquid)
            RenderingRegistry.registerEntityRenderingHandler(EntitySquid.class, RenderNewSquid::new);

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
        primalcore = getInteropProxy(ModInteropProxy.class, "primal", "ActiveCompatPrimalCore", "InactiveCompatPrimalCore");
        sophisticatedwolves = getInteropProxy(ModInteropProxy.class, "sophisticatedwolves", "ActiveCompatSophisticatedWolves", "InactiveCompatSophisticatedWolves");
        abyssalcraft = getInteropProxy(ModInteropProxy.class, "abyssalcraft", "ActiveCompatAbyssalCraft", "InactiveCompatAbyssalCraft");
        brownmooshrooms = getInteropProxy(ModInteropProxy.class, "brownmooshrooms", "ActiveCompatBrownMooshrooms", "InactiveCompatBrownMooshrooms");
        
        //Register renderers for classes
        //Check for non null to prevent NullPointers if exceptions are thrown
        BetterAnimals.logger().debug("PrimalCore proxy: " + primalcore);
        BetterAnimals.logger().debug("AbyssalCraft proxy: " + abyssalcraft);
        BetterAnimals.logger().debug("BrownMooshrooms proxy: " + brownmooshrooms);
        if(primalcore != null) {
            primalcore.register();
        }
        if(abyssalcraft != null) {
            abyssalcraft.register();
        }
        if(brownmooshrooms != null) {
            brownmooshrooms.register();
        }
    }

    // This must take place in postinit because sophisticatedwolves has placed it in init (fixed in later versions)
    public static void postinit() {
        BetterAnimals.logger().debug("SophisticatedWolves proxy: " + sophisticatedwolves);
        if(sophisticatedwolves != null && BetterAnimalsConfig.enableSophisticatedWolf) {
            sophisticatedwolves.register();
        }
    }

    /** Get the compatability proxy for a given modid, uses reflection.
     * @param modid - Modid to check if loaded
     * @param classNameActive - The class name to return if the mod is active in com.ocelot.betteranimals.compat
     * @param classNameInactive - The class name to return if the mod is not present located in com.ocelot.betteranimals.compat
     * @return The proper proxy class for whether the mod is loaded or not **/
    private static <T>T getInteropProxy(Class<T> type, String modid, String classNameActive, String classNameInactive) {
        T proxy = null;
        try {
            if (Loader.isModLoaded(modid)) {
                BetterAnimals.logger().debug("Loading compat classes for mod " + modid + " with type " + type.getSimpleName());
                // reflection to avoid hard dependency
                proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameActive).asSubclass(type).newInstance();
                BetterAnimals.logger().debug("Found proxy: " + proxy);
            } else {
                proxy = Class.forName("com.ocelot.betteranimals.compat." + classNameInactive).asSubclass(type).newInstance();
            }
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            BetterAnimals.logger().error("Error retrieving compatibility class for mod " + modid + " in BetterAnimals. This is a bug. Report this on our issues page (see Curse).");
            BetterAnimals.logger().info("BetterAnimals load status on " + modid + " is " + Loader.isModLoaded(modid));
        }
        return proxy;
    }

}
