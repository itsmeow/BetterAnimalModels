package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSheep;
import com.ocelot.betteranimals.client.render.layer.LayerNewEvilSheepWool;
import com.ocelot.betteranimals.client.render.layer.LayerNewSheepWool;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class RenderNewEvilSheep extends RenderLiving<EntityMob> {

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");
	protected ModelNewSheep model;

	public RenderNewEvilSheep(ResourceLocation texture, ResourceLocation furTexture) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewSheep(), 0.4f);
		model = ((ModelNewSheep) mainModel);
		this.texture = texture;
		this.addLayer(new LayerNewEvilSheepWool(this, furTexture));
	}

	@Override
	protected void preRenderCallback(EntityMob entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
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