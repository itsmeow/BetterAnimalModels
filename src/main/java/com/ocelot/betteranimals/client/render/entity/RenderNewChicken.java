package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewChicken;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewChicken extends RenderLiving<EntityChicken> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");

	public RenderNewChicken(RenderManager m) {
		super(m, new ModelNewChicken(), 0.4F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityChicken entity) {
		return BASE;
	}

	@Override
	protected void preRenderCallback(EntityChicken entitylivingbaseIn, float partialTickTime) {
		if (!this.mainModel.isChild) {
			GlStateManager.scale(0.9D, 0.9D, 0.9D);
		}
	}
	
	@Override
	protected float handleRotationFloat(EntityChicken livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}
}