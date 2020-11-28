package dev.itsmeow.betteranimals.client.render.entity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewCow;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderNewCow extends RenderLiving<EntityCow> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");

	public RenderNewCow(RenderManager m) {
		super(m, new ModelNewCow(), 0.7F);
	}

	@Override
	protected void preRenderCallback(EntityCow entitylivingbaseIn, float partialTickTime) {
		if (!this.mainModel.isChild) {
			GlStateManager.scale(0.80F, 0.80F, 0.80F);
		} else {
			GlStateManager.translate(0F, 0.15F, 0F);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return BASE;
	}
}