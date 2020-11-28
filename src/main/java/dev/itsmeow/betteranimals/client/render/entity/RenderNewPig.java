package dev.itsmeow.betteranimals.client.render.entity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewPig extends RenderLiving<EntityPig> implements LayerRenderer<EntityPig> {

    private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");
    private static final ResourceLocation SADDLE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig_saddle.png");

    public RenderNewPig(RenderManager m) {
        super(m, new ModelNewPig(), 0.7F);
        this.addLayer(this);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPig entity) {
        return BASE;
    }

    public void doRenderLayer(EntityPig entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entity.getSaddled()) {
            this.bindTexture(SADDLE);
            GlStateManager.pushMatrix();
            {
                GlStateManager.scale(1.05F, 1.05F, 1.05F);
                GlStateManager.translate(0F, -0.05F, 0F);
                this.mainModel.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
            GlStateManager.popMatrix();
        }
    }

    public boolean shouldCombineTextures() {
        return false;
    }
}