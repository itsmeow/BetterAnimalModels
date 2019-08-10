package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.client.model.ModelNewSpider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.ResourceLocation;

public class RenderNewCaveSpider extends RenderLiving<EntityCaveSpider> implements LayerRenderer<EntityCaveSpider> {

	private static final ResourceLocation BASE = new ResourceLocation("betteranimals", "textures/mobs/cave_spider.png");
	private static final ResourceLocation GLOW = new ResourceLocation("betteranimals", "textures/mobs/spider_eyes.png");

	public RenderNewCaveSpider(RenderManager m) {
		super(m, new ModelNewSpider(), 0.4f);
		this.addLayer(this);
	}

	@Override
	protected void preRenderCallback(EntityCaveSpider entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotated(-90, 1, 0, 0);
			GlStateManager.translatef(0.0F, 0.75F, -0.5F);
		}
		GlStateManager.scaled(0.5, 0.5, 0.5);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCaveSpider entity) {
		return BASE;
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}

    @Override
    public void render(EntityCaveSpider entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
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
}