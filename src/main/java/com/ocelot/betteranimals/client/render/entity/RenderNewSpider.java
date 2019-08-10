package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSpider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;

public class RenderNewSpider extends RenderLiving<EntitySpider> implements LayerRenderer<EntitySpider> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/spider.png");
	private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/spider_eyes.png");

	public RenderNewSpider(RenderManager m) {
		super(m, new ModelNewSpider(), 1f);
		this.addLayer(this);
	}

	@Override
	protected void preRenderCallback(EntitySpider entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotatef(-90, 1, 0, 0);
			GlStateManager.translatef(0.0F, 0.75F, -0.5F);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySpider entity) {
		return BASE;
	}

	@Override
    public void render(EntitySpider entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.bindTexture(GLOW);
        GlStateManager.enableBlend();
        GlStateManager.disableAlphaTest();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
        if (entitylivingbaseIn.isInvisible()) {
           GlStateManager.depthMask(false);
        } else {
           GlStateManager.depthMask(true);
        }

        int i = 61680;
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.glMultiTexCoord2f(OpenGlHelper.GL_TEXTURE1, (float)j, (float)k);
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getInstance().gameRenderer.setupFogColor(true);
        this.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        Minecraft.getInstance().gameRenderer.setupFogColor(false);
        i = entitylivingbaseIn.getBrightnessForRender();
        j = i % 65536;
        k = i / 65536;
        OpenGlHelper.glMultiTexCoord2f(OpenGlHelper.GL_TEXTURE1, (float)j, (float)k);
        this.setLightmap(entitylivingbaseIn);
        GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GlStateManager.enableAlphaTest();
    }

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}