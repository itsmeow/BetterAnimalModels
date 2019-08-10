package com.ocelot.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewChicken;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewChicken extends MobRenderer<ChickenEntity, ModelNewChicken<ChickenEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");

	public RenderNewChicken(EntityRendererManager m) {
		super(m, new ModelNewChicken<ChickenEntity>(), 0.4F);
	}

	@Override
	protected ResourceLocation getEntityTexture(ChickenEntity entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(ChickenEntity entitylivingbaseIn, float partialTickTime) {
		if (!this.getEntityModel().isChild) {
			GlStateManager.scaled(0.9D, 0.9D, 0.9D);
		}
	}
	
	@Override
	protected float handleRotationFloat(ChickenEntity livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}
}