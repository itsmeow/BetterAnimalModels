package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewPig extends net.minecraft.client.renderer.entity.MobRenderer<EntityPig> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");

	public RenderNewPig(EntityRendererManager m) {
		super(m, new ModelNewPig(), 0.7F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPig entity) {
		return BASE;
	}
}