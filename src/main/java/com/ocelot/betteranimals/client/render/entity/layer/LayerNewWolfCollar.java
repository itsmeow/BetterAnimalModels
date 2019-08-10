package com.ocelot.betteranimals.client.render.entity.layer;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.RenderNewWolf;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;

public class LayerNewWolfCollar implements LayerRenderer<EntityWolf> {

    private static final ResourceLocation COLLAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame_collar.png");
    private final RenderNewWolf wolfRenderer;

    public LayerNewWolfCollar(RenderNewWolf wolfRendererIn) {
        this.wolfRenderer = wolfRendererIn;
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void render(EntityWolf entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entitylivingbaseIn.isTamed() && !entitylivingbaseIn.isInvisible()) {
            this.wolfRenderer.bindTexture(COLLAR_TEXTURE);
            float[] afloat = entitylivingbaseIn.getCollarColor().getColorComponentValues();
            GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
            this.wolfRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }
}