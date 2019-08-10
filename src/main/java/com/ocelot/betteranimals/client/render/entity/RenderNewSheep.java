package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSheep;
import com.ocelot.betteranimals.client.render.entity.layer.LayerNewSheepWool;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class RenderNewSheep extends net.minecraft.client.renderer.entity.MobRenderer<EntitySheep> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");

	public RenderNewSheep(EntityRendererManager m) {
		super(m, new ModelNewSheep(), 0.4f);
		this.addLayer(new LayerNewSheepWool(this));
	}

	@Override
	protected void preRenderCallback(EntitySheep entitylivingbaseIn, float partialTickTime) {
		if (getMainModel().isChild) {
			GlStateManager.scaled(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scaled(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySheep entity) {
		return BASE;
	}
}