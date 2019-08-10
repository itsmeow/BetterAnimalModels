package com.ocelot.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSpider;
import com.ocelot.betteranimals.client.render.entity.layer.LayerNewSpiderEyes;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewCaveSpider extends MobRenderer<CaveSpiderEntity, ModelNewSpider<CaveSpiderEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cave_spider.png");

	public RenderNewCaveSpider(EntityRendererManager m) {
		super(m, new ModelNewSpider<CaveSpiderEntity>(), 0.4f);
		this.addLayer(new LayerNewSpiderEyes<CaveSpiderEntity, ModelNewSpider<CaveSpiderEntity>>(this));
	}

	@Override
	protected void preRenderCallback(CaveSpiderEntity entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotatef(-90, 1, 0, 0);
			GlStateManager.translatef(0.0F, 0.75F, -0.5F);
		}
		GlStateManager.scalef(0.5F, 0.5F, 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(CaveSpiderEntity entity) {
		return BASE;
	}


}