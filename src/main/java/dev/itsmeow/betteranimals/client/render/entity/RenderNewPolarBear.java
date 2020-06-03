package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewBear;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewPolarBear extends MobRenderer<PolarBearEntity, ModelNewBear<PolarBearEntity>> {

	private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/polarbear.png");

	public RenderNewPolarBear(EntityRendererManager m)
	{
		super(m, new ModelNewBear<PolarBearEntity>(), 0.7F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(PolarBearEntity entity)
	{
		return POLAR_BEAR_TEXTURE;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	public void doRender(PolarBearEntity entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(PolarBearEntity entitylivingbaseIn, float partialTickTime)
	{
		if(!getEntityModel().isChild) {
			GlStateManager.scalef(1.0F, 1.0F, 1.0F);
		} else {
			GlStateManager.scalef(0.7F, 0.7F, 0.7F);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

}
