package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.ResourceLocation;

public class RenderNewAntiCow extends RenderLiving<EntityAnimal>{

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");
	
	public RenderNewAntiCow(ResourceLocation texture) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewCow(), 0.4F);
		this.texture = texture;
	}
	
	@Override
	protected void preRenderCallback(EntityAnimal entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translate(0, 0.15D, 0);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAnimal entity) {
		return texture;
	}
	
	
}
