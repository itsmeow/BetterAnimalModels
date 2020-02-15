package com.ocelot.betteranimals.client;

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
import com.mushroom.midnight.common.entity.creature.NightStagEntity;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.BetterAnimalsConfig;
import com.ocelot.betteranimals.client.render.entity.RenderNewCat;
import com.ocelot.betteranimals.client.render.entity.RenderNewCaveSpider;
import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.client.render.entity.RenderNewCow;
import com.ocelot.betteranimals.client.render.entity.RenderNewFox;
import com.ocelot.betteranimals.client.render.entity.RenderNewMooshroom;
import com.ocelot.betteranimals.client.render.entity.RenderNewOcelot;
import com.ocelot.betteranimals.client.render.entity.RenderNewPig;
import com.ocelot.betteranimals.client.render.entity.RenderNewPolarBear;
import com.ocelot.betteranimals.client.render.entity.RenderNewSheep;
import com.ocelot.betteranimals.client.render.entity.RenderNewSilverfish;
import com.ocelot.betteranimals.client.render.entity.RenderNewSpider;
import com.ocelot.betteranimals.client.render.entity.RenderNewSquid;
import com.ocelot.betteranimals.client.render.entity.RenderNewWolf;
import com.ocelot.betteranimals.client.render.entity.midnight.RenderNewNightstag;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkChicken;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkCow;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkPig;
import com.ocelot.betteranimals.compat.QuarkEventCancel;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterAnimals.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReplacementHandler {

    public static final Logger LOG = LogManager.getLogger();

    public static Map<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>> replaceDefs = new HashMap<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>>();
    public static Map<RegistrationTime, Multimap<String, Supplier<Runnable>>> modActions = new HashMap<RegistrationTime, Multimap<String, Supplier<Runnable>>>();

    static {
        addAction(RegistrationTime.CLIENTSETUP, "minecraft", () -> () -> {
            boolean quarkLoaded = ModList.get().isLoaded("quark");
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideCow.get()) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cow", () -> () -> 
                new ReplaceDefinition(CowEntity.class, RenderNewCow::new));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverridePig.get()) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "pig", () -> () -> 
                new ReplaceDefinition(PigEntity.class, RenderNewPig::new));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideChicken.get()) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "chicken", () -> () -> 
                new ReplaceDefinition(ChickenEntity.class, RenderNewChicken::new));
            }
            
        });
        addAction(RegistrationTime.CLIENTSETUP, "quark", () -> () -> {
            if(BetterAnimalsConfig.enableQuarkOverrideCow.get())
                addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "cow", () -> () -> 
                new ReplaceDefinition(CowEntity.class, RenderNewQuarkCow::new));
            if(BetterAnimalsConfig.enableQuarkOverridePig.get())
                addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "pig", () -> () -> 
                new ReplaceDefinition(PigEntity.class, RenderNewQuarkPig::new));
            if(BetterAnimalsConfig.enableQuarkOverrideChicken.get())
                addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "chicken", () -> () -> 
                new ReplaceDefinition(ChickenEntity.class, RenderNewQuarkChicken::new));
        });

        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "sheep", () -> () -> 
        new ReplaceDefinition(SheepEntity.class, RenderNewSheep::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "wolf", () -> () -> 
        new ReplaceDefinition(WolfEntity.class, RenderNewWolf::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "mooshroom", () -> () -> 
        new ReplaceDefinition(MooshroomEntity.class, RenderNewMooshroom::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "squid", () -> () -> 
        new ReplaceDefinition(SquidEntity.class, RenderNewSquid::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "spider", () -> () -> 
        new ReplaceDefinition(SpiderEntity.class, RenderNewSpider::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cavespider", () -> () -> 
        new ReplaceDefinition(CaveSpiderEntity.class, RenderNewCaveSpider::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "silverfish", () -> () -> 
        new ReplaceDefinition(SilverfishEntity.class, RenderNewSilverfish::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "polarbear", () -> () -> 
        new ReplaceDefinition(PolarBearEntity.class, RenderNewPolarBear::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "ocelot", () -> () -> 
        new ReplaceDefinition(OcelotEntity.class, RenderNewOcelot::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cat", () -> () -> 
        new ReplaceDefinition(CatEntity.class, RenderNewCat::new));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "fox", () -> () -> 
        new ReplaceDefinition(FoxEntity.class, RenderNewFox::new));

        addReplace(RegistrationTime.MODELREGISTRY, "midnight", "nightstag", () -> () -> MidnightReplaces.NIGHTSTAG);
    }

    public static class MidnightReplaces {
        public static final ReplaceDefinition NIGHTSTAG = new ReplaceDefinition(NightStagEntity.class, RenderNewNightstag::new);
    }

    public static void construction() {

    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void mre(ModelRegistryEvent event) {
        runActions(RegistrationTime.MODELREGISTRY);
        overwriteRenders(RegistrationTime.MODELREGISTRY);
    }

    public static void clientSetup(FMLClientSetupEvent event) {
        if(ModList.get().isLoaded("quark")) {
            Supplier<Runnable> run = () -> () -> {
                QuarkEventCancel.preQuark();
            };
            run.get().run();
        }
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
        Map<String, ForgeConfigSpec.BooleanValue> overrides = BetterAnimalsConfig.replace_config.mods.get(mod);
        if(overrides == null) return false;
        return overrides.containsKey(override) ? overrides.get(override).get() : false;
    }

    private static void overwriteRenders(RegistrationTime phase) {
        replaceDefs.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        replaceDefs.get(phase).forEach((pair, definitionSupplier) -> {
            boolean doReplace = getEnabledAndLoaded(pair.getLeft(), pair.getRight());
            if(ModList.get().isLoaded(pair.getLeft()) || pair.getLeft().equals("minecraft")) {
                ReplaceDefinition def = definitionSupplier.get().get();
                if(doReplace) {
                    IRenderFactory<LivingEntity> factory = new IRenderFactory<LivingEntity>() {
                        @SuppressWarnings("unchecked")
                        @Override
                        public EntityRenderer<? super LivingEntity> createRenderFor(EntityRendererManager manager) {
                            return (EntityRenderer<? super LivingEntity>) def.factory.apply(manager);
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

        public final Class<? extends LivingEntity> clazz;
        public final Function<EntityRendererManager, EntityRenderer<? extends LivingEntity>> factory;

        public ReplaceDefinition(Class<? extends LivingEntity> clazz, Function<EntityRendererManager, EntityRenderer<? extends LivingEntity>> factory) {
            this.clazz = clazz;
            this.factory = factory;
        }

    }

    public static enum RegistrationTime {
        MODELREGISTRY,
        CLIENTSETUP;
    }

}
