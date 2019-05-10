package com.ocelot.betteranimals.client;

import java.util.ArrayList;
import java.util.EnumMap;
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
import com.google.common.collect.Multimaps;
import com.mushroom.midnight.common.entity.creature.EntityNightStag;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.ReplacementHandler.ReplaceDefinition.RenderType;
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
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiSpider;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewDemonChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilSheep;
import com.ocelot.betteranimals.client.render.entity.brownmooshrooms.RenderNewBrownMooshroom;
import com.ocelot.betteranimals.client.render.entity.midnight.RenderNewNightStag;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBlackBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBrownBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewSteppeWolf;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkChicken;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkCow;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkPig;
import com.ocelot.betteranimals.client.render.entity.sophisticatedwolves.RenderNewSophisticatedWolf;
import com.ocelot.betteranimals.compat.QuarkEventCancel;
import com.ocelot.betteranimals.compat.QuarkUtil;
import com.ocelot.betteranimals.compat.QuarkUtil.RandomTextureType;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;
import com.shinoow.abyssalcraft.common.entity.EntityCoraliumSquid;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiChicken;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiCow;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiPig;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSpider;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonChicken;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonCow;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonPig;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonSheep;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilChicken;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilCow;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilSheep;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilpig;

import net.minecraft.client.Minecraft;
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
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nmd.primal.core.common.entities.living.EntityBlackBear;
import nmd.primal.core.common.entities.living.EntityBrownBear;
import nmd.primal.core.common.entities.living.EntityCanisCampestris;
import nmd.primal.core.common.entities.living.EntityOvisAtre;
import quaternary.brownmooshrooms.EntityBrownMooshroom;
import sophisticated_wolves.entity.EntitySophisticatedWolf;

@SuppressWarnings("unchecked")
@Mod.EventBusSubscriber
public class ReplacementHandler {
    
    public static final Logger LOG = LogManager.getLogger();
    
    public static Map<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>> replaceDefs = new HashMap<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition>>>>();
    public static Map<RegistrationTime, Multimap<String, Supplier<Runnable>>> modActions = new HashMap<RegistrationTime, Multimap<String, Supplier<Runnable>>>();
    public static Map<String, Boolean> config = new HashMap<String, Boolean>();

    static {
        // Pre
        addAction(RegistrationTime.PREINIT, "quark", () -> () -> QuarkEventCancel.preQuark());
        addAction(RegistrationTime.PREINIT, "quark", () -> () -> {
            QuarkUtil.textures = Multimaps.newListMultimap(new EnumMap<>(RandomTextureType.class), ArrayList::new);
            
            if(BetterAnimalsConfig.enableQuarkOverrideCow && getEnabledAndLoaded("cow"))
                QuarkUtil.registerTextures(RandomTextureType.COW, 10, new ResourceLocation("betteranimals:textures/mobs/cow.png"));
            if(BetterAnimalsConfig.enableQuarkOverridePig && getEnabledAndLoaded("pig"))
                QuarkUtil.registerTextures(RandomTextureType.PIG, 4, new ResourceLocation("betteranimals:textures/mobs/pig.png"));
            if(BetterAnimalsConfig.enableQuarkOverrideChicken && getEnabledAndLoaded("chicken")) {
                QuarkUtil.registerTextures(RandomTextureType.CHICKEN, 6, new ResourceLocation("betteranimals:textures/mobs/chicken.png"));
                QuarkUtil.registerTextures(RandomTextureType.CHICK, 3, null);
            }

            if(BetterAnimalsConfig.enableQuarkOverrideCow && getEnabledAndLoaded("cow"))
                RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, RenderNewQuarkCow::new);
            if(BetterAnimalsConfig.enableQuarkOverridePig && getEnabledAndLoaded("pig"))
                RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, RenderNewQuarkPig::new);
            if(BetterAnimalsConfig.enableQuarkOverrideChicken && getEnabledAndLoaded("chicken"))
                RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, RenderNewQuarkChicken::new);
        });
        
        
        // MRE
        
        addAction(RegistrationTime.PREINIT, "minecraft", () -> () -> {
            boolean quarkLoaded = Loader.isModLoaded("quark");
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideCow) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cow", () -> () -> 
                new ReplaceDefinition(EntityCow.class, RenderNewCow::new, RenderType.NEW));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverridePig) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "pig", () -> () -> 
                new ReplaceDefinition(EntityPig.class, RenderNewPig::new, RenderType.NEW));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideChicken) {
                addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "chicken", () -> () -> 
                new ReplaceDefinition(EntityChicken.class, RenderNewChicken::new, RenderType.NEW));
            }
            
        });
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "sheep", () -> () -> 
        new ReplaceDefinition(EntitySheep.class, RenderNewSheep::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "wolf", () -> () -> 
        new ReplaceDefinition(EntityWolf.class, RenderNewWolf::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "mooshroom", () -> () -> 
        new ReplaceDefinition(EntityMooshroom.class, RenderNewMooshroom::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "squid", () -> () -> 
        new ReplaceDefinition(EntitySquid.class, RenderNewSquid::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "spider", () -> () -> 
        new ReplaceDefinition(EntitySpider.class, RenderNewSpider::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cavespider", () -> () -> 
        new ReplaceDefinition(EntityCaveSpider.class, RenderNewCaveSpider::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "silverfish", () -> () -> 
        new ReplaceDefinition(EntitySilverfish.class, RenderNewSilverfish::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "polarbear", () -> () -> 
        new ReplaceDefinition(EntityPolarBear.class, RenderNewPolarBear::new, RenderType.NEW));
        
        addReplace(RegistrationTime.MODELREGISTRY, "primal", "ovisatre", () -> () -> 
        new ReplaceDefinition(EntityOvisAtre.class, RenderNewOvisAtre::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "primal", "steppewolf", () -> () -> 
        new ReplaceDefinition(EntityCanisCampestris.class, RenderNewSteppeWolf::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "primal", "brownbear_primal", () -> () -> 
        new ReplaceDefinition(EntityBrownBear.class, RenderNewBrownBear::new, RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "primal", "blackbear_primal", () -> () -> 
        new ReplaceDefinition(EntityBlackBear.class, RenderNewBlackBear::new, RenderType.NEW));
        
        addReplace(RegistrationTime.MODELREGISTRY, "midnight", "nightstag", () -> () -> 
        new ReplaceDefinition(EntityNightStag.class, RenderNewNightStag::new, RenderType.NEW));
        
        addReplace(RegistrationTime.MODELREGISTRY, "brownmooshrooms", "brownmooshroom", () -> () -> 
        new ReplaceDefinition(EntityBrownMooshroom.class, RenderNewBrownMooshroom::new, RenderType.NEW));
        
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "evilpig", () -> () -> 
        new ReplaceDefinition(EntityEvilpig.class, m -> new RenderNewEvilPig(m, TextureContainer.PIG_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "evilcow", () -> () -> 
        new ReplaceDefinition(EntityEvilCow.class, m -> new RenderNewEvilCow(m, TextureContainer.COW_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "evilsheep", () -> () -> 
        new ReplaceDefinition(EntityEvilSheep.class, m -> new RenderNewEvilSheep(m, TextureContainer.SHEEP_TEX, TextureContainer.SHEEP_LAYER_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "evilchicken", () -> () -> 
        new ReplaceDefinition(EntityEvilChicken.class, m -> new RenderNewEvilChicken(m, TextureContainer.CHICKEN_TEX), RenderType.NEW));

        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "demonpig", () -> () -> 
        new ReplaceDefinition(EntityDemonPig.class, m -> new RenderNewEvilPig(m, TextureContainer.DEMON_PIG_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "demoncow", () -> () -> 
        new ReplaceDefinition(EntityDemonCow.class, m -> new RenderNewEvilCow(m, TextureContainer.DEMON_COW_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "demonsheep", () -> () -> 
        new ReplaceDefinition(EntityDemonSheep.class, m -> new RenderNewEvilSheep(m, TextureContainer.DEMON_SHEEP_TEX, TextureContainer.DEMON_SHEEP_LAYER_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "demonchicken", () -> () -> 
        new ReplaceDefinition(EntityDemonChicken.class, m -> new RenderNewDemonChicken(m, TextureContainer.DEMON_CHICKEN_TEX), RenderType.NEW));

        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "antipig", () -> () -> 
        new ReplaceDefinition(EntityAntiPig.class, m -> new RenderNewAntiPig(m, TextureContainer.ANTI_PIG_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "anticow", () -> () -> 
        new ReplaceDefinition(EntityAntiCow.class, m -> new RenderNewAntiCow(m, TextureContainer.ANTI_COW_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "antichicken", () -> () -> 
        new ReplaceDefinition(EntityAntiChicken.class, m -> new RenderNewAntiChicken(m, TextureContainer.ANTI_CHICKEN_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "antispider", () -> () -> 
        new ReplaceDefinition(EntityAntiSpider.class, m -> new RenderNewAntiSpider(m, TextureContainer.ANTI_SPIDER_TEX, TextureContainer.ANTI_SPIDER_LAYER_TEX), RenderType.NEW));
        addReplace(RegistrationTime.MODELREGISTRY, "abyssalcraft", "coraliumsquid", () -> () -> 
        new ReplaceDefinition(EntityCoraliumSquid.class, m -> new RenderNewSquid(m, TextureContainer.CORALIUM_SQUID_TEX), RenderType.NEW));
        
        // Init
        
        // Post
        addReplace(RegistrationTime.POSTINIT, "sophisticatedwolves", "sophisticatedwolf", () -> () -> 
        new ReplaceDefinition(EntitySophisticatedWolf.class, RenderNewSophisticatedWolf::new, RenderType.OLD));
    }

    public static void preinit() {
        // Load all configs before doing anything
        replaceDefs.values().forEach(m -> m.keySet().forEach(pair -> {
            boolean val = BetterAnimals.config.getBoolean("override_" + pair.getRight(), "EnableMobs_new." + pair.getLeft(), true, "from " + pair.getLeft());
            config.put(pair.getRight(), val);
            LOG.debug("Loaded config override_" + pair.getRight() + " from " + pair.getLeft() + " as " + val);
        }));
        
        // Manually do these because Quark
        ArrayList<Pair<String, String>> pairs = new ArrayList<Pair<String, String>>();
        pairs.add(Pair.of("minecraft", "cow"));
        pairs.add(Pair.of("minecraft", "pig")); 
        pairs.add(Pair.of("minecraft", "chicken"));
        for(Pair<String, String> pair : pairs) {
            boolean val = BetterAnimals.config.getBoolean("override_" + pair.getRight(), "EnableMobs_new." + pair.getLeft(), true, "from " + pair.getLeft());
            config.put(pair.getRight(), val);
            LOG.debug("Loaded config override_" + pair.getRight() + " from " + pair.getLeft() + " as " + val);
        }
        runActions(RegistrationTime.PREINIT);
        overwriteRenders(RegistrationTime.PREINIT);
    }

    public static void init() {
        runActions(RegistrationTime.INIT);
        overwriteRenders(RegistrationTime.INIT);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void mre(ModelRegistryEvent e) {
        runActions(RegistrationTime.MODELREGISTRY);
        overwriteRenders(RegistrationTime.MODELREGISTRY);
    }

    public static void postinit() {
        runActions(RegistrationTime.POSTINIT);
        overwriteRenders(RegistrationTime.POSTINIT);
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
    
    public static boolean getEnabledAndLoaded(String id) {
        return config.containsKey(id) ? config.get(id) : false;
    }

    @SuppressWarnings("deprecation")
    private static void overwriteRenders(RegistrationTime phase) {
        replaceDefs.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        replaceDefs.get(phase).forEach((pair, definitionSupplier) -> {
            boolean doReplace = config.get(pair.getRight());
            if(Loader.isModLoaded(pair.getLeft()) || pair.getLeft().equals("minecraft")) {
                ReplaceDefinition def = definitionSupplier.get().get();
                if(doReplace) {
                    if(def.type == RenderType.NEW) {
                        IRenderFactory<EntityLivingBase> factory = new IRenderFactory<EntityLivingBase>() {
                            @Override
                            public Render<? super EntityLivingBase> createRenderFor(RenderManager manager) {
                                return (Render<? super EntityLivingBase>) def.factory.apply(manager);
                            }};
                            RenderingRegistry.registerEntityRenderingHandler(def.clazz, factory);
                    } else {
                        RenderingRegistry.registerEntityRenderingHandler(def.clazz, def.factory.apply(Minecraft.getMinecraft().getRenderManager()));
                    }
                    LOG.debug(String.format("Overriding %s / %s in %s with render type %s", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft(), def.type.name()));
                } else {
                    LOG.debug(String.format("Was going to override %s / %s in %s with render type %s, but it is disabled!", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft(), def.type.name()));
                }
            } else {
                Log.debug(String.format("%s was not replaced, because %s is not loaded! Config %s", pair.getRight(), pair.getLeft(), doReplace));
            }
        });
    }

    private static void runActions(RegistrationTime phase) {
        modActions.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        modActions.get(phase).forEach((modid, action) -> {
            if(Loader.isModLoaded(modid) || modid.equals("minecraft")) {
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
        public final RenderType type;

        public ReplaceDefinition(Class<? extends EntityLivingBase> clazz, Function<RenderManager, Render<? extends EntityLivingBase>> factory, RenderType type) {
            this.clazz = clazz;
            this.factory = factory;
            this.type = type;
        }

        public static enum RenderType {
            OLD,
            NEW;
        }

    }

    public static enum RegistrationTime {
        MODELREGISTRY,
        PREINIT,
        INIT,
        POSTINIT;
    }

}
