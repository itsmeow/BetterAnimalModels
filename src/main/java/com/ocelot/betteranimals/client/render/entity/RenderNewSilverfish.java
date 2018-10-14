package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;
import com.ocelot.betteranimals.client.model.ModelNewSilverfish;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewSilverfish extends RenderLiving<EntitySilverfish> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/silverfish.png");
	private ModelNewSilverfish model;

	public RenderNewSilverfish() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewSilverfish(), 0.25f);
		model = ((ModelNewSilverfish) mainModel);
	}
	
	@Override
	protected void preRenderCallback(EntitySilverfish entity, float partialTickTime) {
		GlStateManager.scale(0.5, 0.5, 0.5);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySilverfish entity) {
		return BASE;
	}
}