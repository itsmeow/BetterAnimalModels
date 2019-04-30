package com.ocelot.betteranimals.compat;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.client.render.entity.RenderNewCow;
import com.ocelot.betteranimals.client.render.entity.RenderNewPig;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.quark.base.module.ModuleLoader;
import vazkii.quark.client.feature.RandomAnimalTextures;
import vazkii.quark.client.feature.RandomAnimalTextures.RandomTextureType;

public class ActiveCompatQuark implements ModInteropProxy {

    private static ListMultimap<RandomTextureType, ResourceLocation> textures;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void register() {
        if(ModuleLoader.isFeatureEnabled(RandomAnimalTextures.class)) {
            textures = Multimaps.newListMultimap(new EnumMap(RandomTextureType.class), () -> new ArrayList<>());

            if(BetterAnimalsConfig.enableQuarkOverrideCow && BetterAnimalsConfig.enableCow)
                registerTextures(RandomTextureType.COW, 10, new ResourceLocation("textures/entity/cow/cow.png"));
            if(BetterAnimalsConfig.enableQuarkOverridePig && BetterAnimalsConfig.enablePig)
                registerTextures(RandomTextureType.PIG, 4, new ResourceLocation("textures/entity/pig/pig.png"));
            if(BetterAnimalsConfig.enableQuarkOverrideChicken && BetterAnimalsConfig.enableChicken) {
                registerTextures(RandomTextureType.CHICKEN, 6, new ResourceLocation("textures/entity/chicken.png"));
                registerTextures(RandomTextureType.CHICK, 3, null);
            }

            if(BetterAnimalsConfig.enableQuarkOverrideCow && BetterAnimalsConfig.enableCow)
                registerOverride(EntityCow.class, RenderNewCow::new, RandomAnimalTextures.enableCow);
            if(BetterAnimalsConfig.enableQuarkOverridePig && BetterAnimalsConfig.enablePig)
                registerOverride(EntityPig.class, RenderNewPig::new, RandomAnimalTextures.enablePig);
            if(BetterAnimalsConfig.enableQuarkOverrideChicken && BetterAnimalsConfig.enableChicken)
                registerOverride(EntityChicken.class, RenderNewChicken::new, RandomAnimalTextures.enableChicken || RandomAnimalTextures.enableChick);
        } else {
            BetterAnimals.logger().info("Quark compat layer was loaded, but the Quark module is disabled. If you wish for Random Animal Textures replacement, enable it in Quark.");
        }
    }

    /*
     * This code is from Quark except the modid which was changed:
     */

    @SideOnly(Side.CLIENT)
    public static ResourceLocation getRandomTexture(Entity e, RandomTextureType type) {
        return getRandomTexture(e, type, true);
    }

    @SideOnly(Side.CLIENT)
    public static ResourceLocation getRandomTexture(Entity e, RandomTextureType type, boolean choose) {
        List<ResourceLocation> styles = textures.get(type);
        if(!choose)
            return styles.get(styles.size() - 1);

        UUID id = e.getUniqueID();
        int choice = Math.abs((int) (id.getMostSignificantBits() % styles.size()));
        return styles.get(choice);
    }

    private static void registerTextures(RandomTextureType type, int count, ResourceLocation vanilla) {
        String name = type.name().toLowerCase();
        for(int i = 1; i < count + 1; i++)
            textures.put(type, new ResourceLocation(BetterAnimals.MODID, String.format("textures/entity/random/%s%d.png", name, i)));

        if(vanilla != null)
            textures.put(type, vanilla);
    }

    private static <T extends Entity>void registerOverride(Class<T> clazz, IRenderFactory<? super T> factory, boolean enabled) {
        if(enabled)
            RenderingRegistry.registerEntityRenderingHandler(clazz, factory);
    }

}
