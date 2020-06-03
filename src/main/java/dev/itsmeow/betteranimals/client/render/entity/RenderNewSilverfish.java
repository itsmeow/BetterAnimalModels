package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewSilverfish;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewSilverfish extends MobRenderer<SilverfishEntity, ModelNewSilverfish<SilverfishEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/silverfish.png");

	public RenderNewSilverfish(EntityRendererManager m) {
		super(m, new ModelNewSilverfish<SilverfishEntity>(), 0.25f);
	}
	
	@Override
	protected void preRenderCallback(SilverfishEntity entity, float partialTickTime) {
		GlStateManager.scaled(0.5, 0.5, 0.5);
	}

	@Override
	protected ResourceLocation getEntityTexture(SilverfishEntity entity) {
		return BASE;
	}
}