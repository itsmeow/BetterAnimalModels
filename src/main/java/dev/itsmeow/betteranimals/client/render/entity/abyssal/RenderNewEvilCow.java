package dev.itsmeow.betteranimals.client.render.entity.abyssal;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class RenderNewEvilCow extends RenderLiving<EntityMob>{

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");
	
	public RenderNewEvilCow(RenderManager m, ResourceLocation texture) {
		super(m, new ModelNewCow(), 0.4F);
		this.texture = texture;
	}
	
	@Override
	protected void preRenderCallback(EntityMob entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translate(0, 0.15D, 0);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMob entity) {
		return texture;
	}
	
	
}
