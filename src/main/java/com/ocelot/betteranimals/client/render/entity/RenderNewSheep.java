package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSheep;
import com.ocelot.betteranimals.client.render.layer.LayerNewSheepWool;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class RenderNewSheep extends RenderLiving<EntitySheep> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");
	protected ModelNewSheep model;

	public RenderNewSheep() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewSheep(), 0.4f);
		model = ((ModelNewSheep) mainModel);
		this.addLayer(new LayerNewSheepWool(this));
	}

	@Override
	protected void preRenderCallback(EntitySheep entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySheep entity) {
		return BASE;
	}
}