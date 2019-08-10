package com.ocelot.betteranimals.client;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jline.utils.Log;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.BetterAnimalsConfig;
import com.ocelot.betteranimals.BetterAnimalsConfig.OverridesConfiguration;
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

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLPaths;

@SuppressWarnings("unchecked")
public class ReplacementHandler {

    public static final Logger LOG = LogManager.getLogger();

    public static Map<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>> replaceDefs = new HashMap<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>>();
    public static Map<RegistrationTime, Multimap<String, Supplier<Runnable>>> modActions = new HashMap<RegistrationTime, Multimap<String, Supplier<Runnable>>>();
    public static OverridesConfiguration config;
    public static int CONFIG_VERSION = 1;
    public static String CONFIG_DIR = FMLPaths.CONFIGDIR.get() + "/" + BetterAnimals.MODID + "/";
    public static File CONFIG_LOCATION = new File(CONFIG_DIR + BetterAnimals.MODID + "-cfver" + CONFIG_VERSION + ".json");

    static {
        // MRE
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cow", () -> () -> 
        new ReplaceDefinition(EntityCow.class, RenderNewCow::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "pig", () -> () -> 
        new ReplaceDefinition(EntityPig.class, RenderNewPig::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "chicken", () -> () -> 
        new ReplaceDefinition(EntityChicken.class, RenderNewChicken::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "sheep", () -> () -> 
        new ReplaceDefinition(EntitySheep.class, RenderNewSheep::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "wolf", () -> () -> 
        new ReplaceDefinition(EntityWolf.class, RenderNewWolf::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "mooshroom", () -> () -> 
        new ReplaceDefinition(EntityMooshroom.class, RenderNewMooshroom::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "squid", () -> () -> 
        new ReplaceDefinition(EntitySquid.class, RenderNewSquid::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "spider", () -> () -> 
        new ReplaceDefinition(EntitySpider.class, RenderNewSpider::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cavespider", () -> () -> 
        new ReplaceDefinition(EntityCaveSpider.class, RenderNewCaveSpider::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "silverfish", () -> () -> 
        new ReplaceDefinition(EntitySilverfish.class, RenderNewSilverfish::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "polarbear", () -> () -> 
        new ReplaceDefinition(EntityPolarBear.class, RenderNewPolarBear::new));
    }
    
    public static void construction() {
        File configdir = new File(CONFIG_DIR);
        configdir.mkdirs();
        for(File file : configdir.listFiles()) {
            // Rename invalid files
            if(file.getName().startsWith(BetterAnimals.MODID + "-cfver") && !file.getName().contains("-cfver" + CONFIG_VERSION) && !file.getName().endsWith(".obsolete")) {
                file.renameTo(new File(file.getAbsolutePath() + ".obsolete"));
                LOG.info("Obsolete configs found. Renaming them. Reconfiguration required if configs have been modified from defaults.");
            }
        }
        if(!CONFIG_LOCATION.exists()) {
            try {
                CONFIG_LOCATION.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
            BetterAnimalsConfig.genDefault(CONFIG_LOCATION);
        }
        config = BetterAnimalsConfig.load(CONFIG_LOCATION);
    }

    public static void mre() {
        runActions(RegistrationTime.MODELREGISTRY);
        overwriteRenders(RegistrationTime.MODELREGISTRY);
    }

    public static void clientSetup(FMLClientSetupEvent event) {
        runActions(RegistrationTime.CLIENTSETUP);
        overwriteRenders(RegistrationTime.CLIENTSETUP);
    }

    public static void addReplace(RegistrationTime time, String modid, String name, Supplier<Supplier<ReplaceDefinition>> definition) {
        replaceDefs.putIfAbsent(time, MultimapBuilder.hashKeys().linkedHashSetValues().build());
        replaceDefs.get(time).put(Pair.of(modid, name), definition);
        LOG.debug(String.format("Registering replace for %s from %s at %s", name, modid, time.name()));
    }

    public static void addAction(RegistrationTime time, String modid, Supplier<Runnable> action) {
        modActions.putIfAbsent(time, MultimapBuilder.hashKeys().linkedHashSetValues().build());
        modActions.get(time).put(modid, action);
        LOG.debug(String.format("Registering action for %s at %s", modid, time.name()));
    }

    private static boolean getEnabledAndLoaded(String mod, String override) {
        Map<String, Boolean> overrides = config.mods.get(mod);
        if(overrides == null) return false;
        return overrides.getOrDefault(override, false);
    }

    private static void overwriteRenders(RegistrationTime phase) {
        replaceDefs.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        replaceDefs.get(phase).forEach((pair, definitionSupplier) -> {
            boolean doReplace = getEnabledAndLoaded(pair.getLeft(), pair.getRight());
            if(ModList.get().isLoaded(pair.getLeft()) || pair.getLeft().equals("minecraft")) {
                ReplaceDefinition def = definitionSupplier.get().get();
                if(doReplace) {
                    IRenderFactory<EntityLivingBase> factory = new IRenderFactory<EntityLivingBase>() {
                        @Override
                        public Render<? super EntityLivingBase> createRenderFor(RenderManager manager) {
                            return (Render<? super EntityLivingBase>) def.factory.apply(manager);
                        }};
                        RenderingRegistry.registerEntityRenderingHandler(def.clazz, factory);
                        LOG.debug(String.format("Overriding %s / %s in %s", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft()));
                } else {
                    LOG.debug(String.format("Was going to override %s / %s in %s, but it is disabled!", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft()));
                }
            } else {
                Log.debug(String.format("%s was not replaced, because %s is not loaded! Config %s", pair.getRight(), pair.getLeft(), doReplace));
            }
        });
    }

    private static void runActions(RegistrationTime phase) {
        modActions.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        modActions.get(phase).forEach((modid, action) -> {
            if(ModList.get().isLoaded(modid) || modid.equals("minecraft")) {
                action.get().run();
                LOG.debug("Running action for " + modid);
            } else {
                LOG.debug("No action executed for " + modid + ", as it is not loaded.");
            }
        });
    }

    public static class ReplaceDefinition {

        public final Class<? extends EntityLivingBase> clazz;
        public final Function<RenderManager, Render<? extends EntityLivingBase>> factory;

        public ReplaceDefinition(Class<? extends EntityLivingBase> clazz, Function<RenderManager, Render<? extends EntityLivingBase>> factory) {
            this.clazz = clazz;
            this.factory = factory;
        }

    }

    public static enum RegistrationTime {
        MODELREGISTRY,
        CLIENTSETUP;
    }

}
