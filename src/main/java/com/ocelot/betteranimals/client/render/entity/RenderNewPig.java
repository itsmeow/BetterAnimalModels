package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewPig extends RenderLiving<EntityPig> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");

	public RenderNewPig(RenderManager m) {
		super(m, new ModelNewPig(), 0.7F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPig entity) {
		return BASE;
	}
}