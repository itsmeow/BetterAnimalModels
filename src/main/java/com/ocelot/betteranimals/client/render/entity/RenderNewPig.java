package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewPig extends RenderLiving<EntityPig> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");
	private ModelNewPig model;

	public RenderNewPig() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewPig(), 0.4f);
		model = ((ModelNewPig) mainModel);
	}

	@Override
	protected void preRenderCallback(EntityPig entitylivingbaseIn, float partialTickTime) {
		if (!model.isChild) {
			GlStateManager.scale(1.00D, 1.00D, 1.00D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPig entity) {
		return BASE;
	}
}