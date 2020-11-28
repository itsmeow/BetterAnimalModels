package dev.itsmeow.betteranimals.client.render.entity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewSheep;
import dev.itsmeow.betteranimals.client.render.layer.LayerNewSheepWool;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class RenderNewSheep extends RenderLiving<EntitySheep> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");

	public RenderNewSheep(RenderManager m) {
		super(m, new ModelNewSheep(), 0.4f);
		this.addLayer(new LayerNewSheepWool(this));
	}

	@Override
	protected void preRenderCallback(EntitySheep entitylivingbaseIn, float partialTickTime) {
		if (getMainModel().isChild) {
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