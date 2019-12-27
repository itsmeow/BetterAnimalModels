package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCat;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.ResourceLocation;

public class RenderNewOcelot extends RenderLiving<EntityOcelot> {

    private static final ResourceLocation BLACK_OCELOT_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/black.png");
    private static final ResourceLocation OCELOT_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/ocelot.png");
    private static final ResourceLocation RED_OCELOT_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/red.png");
    private static final ResourceLocation SIAMESE_OCELOT_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/siamese.png");

    public RenderNewOcelot(RenderManager m) {
        super(m, new ModelNewCat(), 0.5F);
    }

    @Override
    protected void preRenderCallback(EntityOcelot entitylivingbaseIn, float partialTickTime) {
        if(this.mainModel.isChild) {
            GlStateManager.scale(0.80F, 0.80F, 0.80F);
        }
        if(entitylivingbaseIn.isTamed()) {
            GlStateManager.scale(0.8F, 0.8F, 0.8F);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityOcelot entity) {
        switch(entity.getTameSkin()) {
        case 0:
        default:
            return OCELOT_TEXTURES;
        case 1:
            return BLACK_OCELOT_TEXTURES;
        case 2:
            return RED_OCELOT_TEXTURES;
        case 3:
            return SIAMESE_OCELOT_TEXTURES;
        }
    }
}