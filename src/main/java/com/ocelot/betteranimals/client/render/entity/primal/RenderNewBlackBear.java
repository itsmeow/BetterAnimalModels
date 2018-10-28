package com.ocelot.betteranimals.client.render.entity.primal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewBear;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderNewBlackBear extends RenderLiving {
	
	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_black_bear.png");

	public RenderNewBlackBear()
	{
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewBear(), 0.7F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return BASE;
	}

	public void doRender(EntityLiving entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime)
	{
		if(!getMainModel().isChild) {
			GlStateManager.scale(1.0F, 1.0F, 1.0F);
		} else {
			GlStateManager.scale(0.7F, 0.7F, 0.7F);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}
	
}
