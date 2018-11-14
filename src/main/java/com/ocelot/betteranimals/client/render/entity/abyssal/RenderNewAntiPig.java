package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.ResourceLocation;

public class RenderNewAntiPig extends RenderLiving<EntityAnimal>{

	private ResourceLocation texture = null;
	
	public RenderNewAntiPig(ResourceLocation texture) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewPig(), 0.4F);
		this.texture = texture;
	}
	
	@Override
	protected void preRenderCallback(EntityAnimal entitylivingbaseIn, float partialTickTime) {
		if (getMainModel().isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAnimal entity) {
		return texture;
	}
	
	
}
