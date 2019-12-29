package com.ocelot.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCat;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewOcelot extends MobRenderer<OcelotEntity, ModelNewCat<OcelotEntity>> {
    
    private static final ResourceLocation OCELOT_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/ocelot.png");

    public RenderNewOcelot(EntityRendererManager m) {
        super(m, new ModelNewCat<OcelotEntity>(), 0.5F);
    }

    @Override
    protected void preRenderCallback(OcelotEntity entitylivingbaseIn, float partialTickTime) {
        if(this.entityModel.isChild) {
            GlStateManager.scalef(0.80F, 0.80F, 0.80F);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(OcelotEntity entity) {
        return OCELOT_TEXTURES;
    }
}