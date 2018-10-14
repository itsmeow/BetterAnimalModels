package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.client.model.ModelNewSpider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.ResourceLocation;

public class RenderNewCaveSpider extends RenderLiving<EntityCaveSpider> implements LayerRenderer<EntityCaveSpider> {

	private static final ResourceLocation BASE = new ResourceLocation("betteranimals", "textures/mobs/cave_spider.png");
	private static final ResourceLocation GLOW = new ResourceLocation("betteranimals", "textures/mobs/spider_eyes.png");
	protected ModelNewSpider model;

	public RenderNewCaveSpider() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewSpider(), 0.4f);
		model = ((ModelNewSpider) mainModel);
		this.addLayer(this);
	}

	@Override
	protected void preRenderCallback(EntityCaveSpider entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotate(-90, 1, 0, 0);
			GlStateManager.translate(0.0F, 0.75F, -0.5F);
		}
		GlStateManager.scale(0.5, 0.5, 0.5);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCaveSpider entity) {
		return BASE;
	}

	@Override
	public void doRenderLayer(EntityCaveSpider entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.bindTexture(GLOW);
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		i = entity.getBrightnessForRender();
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		this.setLightmap(entity);
		GlStateManager.disableBlend();
		GlStateManager.color(1, 1, 1, 1);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}