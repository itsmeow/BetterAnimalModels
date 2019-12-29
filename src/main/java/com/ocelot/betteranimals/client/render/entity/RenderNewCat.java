package com.ocelot.betteranimals.client.render.entity;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCat;
import com.ocelot.betteranimals.client.render.entity.layer.LayerNewCatCollar;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

public class RenderNewCat extends MobRenderer<CatEntity, ModelNewCat<CatEntity>> {
    
    public static final Map<Integer, ResourceLocation> TEXTURE_MAP = Util.make(Maps.newHashMap(), (map) -> {
        map.put(0, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/tabby.png"));
        map.put(1, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/black.png"));
        map.put(2, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/red.png"));
        map.put(3, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/siamese.png"));
        map.put(4, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/british_shorthair.png"));
        map.put(5, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/calico.png"));
        map.put(6, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/persian.png"));
        map.put(7, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/ragdoll.png"));
        map.put(8, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/white.png"));
        map.put(9, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/jellie.png"));
        map.put(10, new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/all_black.png"));
     });

    public RenderNewCat(EntityRendererManager m) {
        super(m, new ModelNewCat<CatEntity>(), 0.5F);
        this.addLayer(new LayerNewCatCollar(this));
    }

    @Override
    protected void preRenderCallback(CatEntity entitylivingbaseIn, float partialTickTime) {
        if(this.entityModel.isChild) {
            GlStateManager.scalef(0.80F, 0.80F, 0.80F);
        }
        if(entitylivingbaseIn.isTamed()) {
            GlStateManager.scalef(0.80F, 0.80F, 0.80F);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(CatEntity entity) {
        return TEXTURE_MAP.get(entity.getCatType());
    }
}