package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderNewCow extends RenderLiving<EntityCow> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");
	protected ModelNewCow model;

	public RenderNewCow() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewCow(), 0.4f);
		model = ((ModelNewCow) mainModel);
	}

	@Override
	protected void preRenderCallback(EntityCow entitylivingbaseIn, float partialTickTime) {
		if (!model.isChild) {
			GlStateManager.scale(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translate(0, 0.15D, 0);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return BASE;
	}
}