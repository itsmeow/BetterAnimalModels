package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSheep;
import com.ocelot.betteranimals.client.render.layer.LayerNewEvilSheepWool;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class RenderNewEvilSheep extends RenderLiving<EntityMob> {

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");

	public RenderNewEvilSheep(RenderManager m, ResourceLocation texture, ResourceLocation furTexture) {
		super(m, new ModelNewSheep(), 0.4f);
		this.texture = texture;
		this.addLayer(new LayerNewEvilSheepWool(this, furTexture));
	}

	@Override
	protected void preRenderCallback(EntityMob entitylivingbaseIn, float partialTickTime) {
		if (mainModel.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMob entity) {
		return texture;
	}
}