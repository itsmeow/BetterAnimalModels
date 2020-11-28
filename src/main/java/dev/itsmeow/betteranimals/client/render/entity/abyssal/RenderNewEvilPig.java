package dev.itsmeow.betteranimals.client.render.entity.abyssal;

import dev.itsmeow.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class RenderNewEvilPig extends RenderLiving<EntityMob>{

	private ResourceLocation texture = null;
	
	public RenderNewEvilPig(RenderManager m, ResourceLocation texture) {
		super(m, new ModelNewPig(), 0.4F);
		this.texture = texture;
	}
	
	@Override
	protected void preRenderCallback(EntityMob entitylivingbaseIn, float partialTickTime) {
		if (getMainModel().isChild) {
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
