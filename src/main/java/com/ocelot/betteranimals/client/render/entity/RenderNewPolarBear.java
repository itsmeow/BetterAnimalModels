package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewBear;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelPolarBear;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.util.ResourceLocation;

public class RenderNewPolarBear extends RenderLiving<EntityPolarBear> {

	private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/polarbear.png");

	public RenderNewPolarBear()
	{
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewBear(), 0.7F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityPolarBear entity)
	{
		return POLAR_BEAR_TEXTURE;
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	public void doRender(EntityPolarBear entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	/**
	 * Allows the render to do state modifications necessary before the model is rendered.
	 */
	protected void preRenderCallback(EntityPolarBear entitylivingbaseIn, float partialTickTime)
	{
		if(!getMainModel().isChild) {
			GlStateManager.scale(1.0F, 1.0F, 1.0F);
		} else {
			GlStateManager.scale(0.7F, 0.7F, 0.7F);
		}
		super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

}
