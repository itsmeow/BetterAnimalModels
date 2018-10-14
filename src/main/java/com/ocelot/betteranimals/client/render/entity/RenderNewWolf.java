package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewWolf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.layers.LayerWolfCollar;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;

public class RenderNewWolf extends RenderLiving<EntityWolf> {

	private static final ResourceLocation WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf.png");
	private static final ResourceLocation TAMED_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame.png");
	private static final ResourceLocation ANRGY_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_angry.png");

	private ModelNewWolf model;

	public RenderNewWolf() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewWolf(), 0.25f);
		model = ((ModelNewWolf) mainModel);
	}

	@Override
	protected float handleRotationFloat(EntityWolf livingBase, float partialTicks) {
		return livingBase.getTailRotation();
	}
	
	@Override
	protected void preRenderCallback(EntityWolf entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	public void doRender(EntityWolf entity, double x, double y, double z, float entityYaw, float partialTicks) {
		if (entity.isWolfWet()) {
			float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
			GlStateManager.color(f, f, f);
		}

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWolf entity) {
		if (entity.isTamed()) {
			return TAMED_WOLF_TEXTURES;
		} else {
			return entity.isAngry() ? ANRGY_WOLF_TEXTURES : WOLF_TEXTURES;
		}
	}
}