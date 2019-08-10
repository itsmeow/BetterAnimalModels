package com.ocelot.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewCow extends MobRenderer<CowEntity, ModelNewCow<CowEntity>> {

    private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");

    public RenderNewCow(EntityRendererManager m) {
        super(m, new ModelNewCow<CowEntity>(), 0.7F);
    }

    @Override
    protected void preRenderCallback(CowEntity entitylivingbaseIn, float partialTickTime) {
        if(!this.getEntityModel().isChild) {
            GlStateManager.scalef(0.80F, 0.80F, 0.80F);
        } else {
            GlStateManager.translatef(0F, 0.15F, 0F);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(CowEntity entity) {
        return BASE;
    }
}