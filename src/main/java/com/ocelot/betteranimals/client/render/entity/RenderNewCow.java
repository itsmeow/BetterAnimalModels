package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderNewCow extends net.minecraft.client.renderer.entity.MobRenderer<EntityCow> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");

	public RenderNewCow(EntityRendererManager m) {
		super(m, new ModelNewCow(), 0.7F);
	}

	@Override
	protected void preRenderCallback(EntityCow entitylivingbaseIn, float partialTickTime) {
		if (!this.mainModel.isChild) {
			GlStateManager.scalef(0.80F, 0.80F, 0.80F);
		} else {
			GlStateManager.translatef(0F, 0.15F, 0F);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return BASE;
	}
}