package dev.itsmeow.betteranimals.client.render.entity.primal;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewBear;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityBrownBear;

public class RenderNewBrownBear extends RenderLiving<EntityBrownBear> {
	
	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_brown_bear.png");

	public RenderNewBrownBear(RenderManager m)
	{
		super(m, new ModelNewBear(), 0.7F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityBrownBear entity)
	{
		return BASE;
	}

	public void doRender(EntityBrownBear entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(EntityBrownBear entitylivingbaseIn, float partialTickTime)
	{
		if(!getMainModel().isChild) {
			GlStateManager.scale(1.1F, 1.1F, 1.1F);
		} else {
			GlStateManager.scale(0.7F, 0.7F, 0.7F);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
	
}
