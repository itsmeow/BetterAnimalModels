package com.ocelot.betteranimals.client.render;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.util.ResourceLocation;

public class RenderNewMooshroom extends RenderLiving<EntityMooshroom> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom.png");
	protected ModelNewCow model;

	public RenderNewMooshroom() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewCow(), 0.4f);
		model = ((ModelNewCow) mainModel);
	}

	@Override
	protected void preRenderCallback(EntityMooshroom entitylivingbaseIn, float partialTickTime) {
		if (!model.isChild) {
			GlStateManager.scale(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translate(0, 0.15D, 0);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMooshroom entity) {
		return BASE;
	}
}