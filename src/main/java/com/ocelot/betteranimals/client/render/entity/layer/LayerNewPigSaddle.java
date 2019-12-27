package com.ocelot.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewPigSaddle<T extends PigEntity, A extends EntityModel<T>> extends LayerRenderer<T, A>  {

    private static final ResourceLocation SADDLE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig_saddle.png");
    private IEntityRenderer<T, A> renderer;

    public LayerNewPigSaddle(IEntityRenderer<T, A> renderer) {
        super(renderer);
        this.renderer = renderer;
    }

    @Override
    public void render(T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entity.getSaddled()) {
            this.bindTexture(SADDLE);
            GlStateManager.pushMatrix();
            {
                GlStateManager.scalef(1.05F, 1.05F, 1.05F);
                GlStateManager.translatef(0F, -0.05F, 0F);
                this.renderer.getEntityModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

}
