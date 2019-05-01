package com.ocelot.betteranimals.compat;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkChicken;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkCow;
import com.ocelot.betteranimals.client.render.entity.quark.RenderNewQuarkPig;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.quark.client.feature.RandomAnimalTextures.RandomTextureType;

public class ActiveCompatQuark implements ModInteropProxy {

    private static ListMultimap<RandomTextureType, ResourceLocation> textures;

    @Override
    public boolean register() {
        
        textures = Multimaps.newListMultimap(new EnumMap<>(RandomTextureType.class), ArrayList::new);
        
        if(BetterAnimalsConfig.enableQuarkOverrideCow && BetterAnimalsConfig.enableCow)
            registerTextures(RandomTextureType.COW, 10, new ResourceLocation("betteranimals:textures/mobs/cow.png"));
        if(BetterAnimalsConfig.enableQuarkOverridePig && BetterAnimalsConfig.enablePig)
            registerTextures(RandomTextureType.PIG, 4, new ResourceLocation("betteranimals:textures/mobs/pig.png"));
        if(BetterAnimalsConfig.enableQuarkOverrideChicken && BetterAnimalsConfig.enableChicken) {
            registerTextures(RandomTextureType.CHICKEN, 6, new ResourceLocation("betteranimals:textures/mobs/chicken.png"));
            registerTextures(RandomTextureType.CHICK, 3, null);
        }

        if(BetterAnimalsConfig.enableQuarkOverrideCow && BetterAnimalsConfig.enableCow)
            RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, RenderNewQuarkCow::new);
        if(BetterAnimalsConfig.enableQuarkOverridePig && BetterAnimalsConfig.enablePig)
            RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, RenderNewQuarkPig::new);
        if(BetterAnimalsConfig.enableQuarkOverrideChicken && BetterAnimalsConfig.enableChicken)
            RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, RenderNewQuarkChicken::new);
        return true;
    }

    /*
     * This code is from Quark except the resource dirs which were changed:
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
            textures.put(type, new ResourceLocation(BetterAnimals.MODID, String.format("textures/mobs/quark/%s%d.png", name, i)));

        if(vanilla != null)
            textures.put(type, vanilla);
    }

}
