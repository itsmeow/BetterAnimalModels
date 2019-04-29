package com.ocelot.betteranimals.client.render.entity.primal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewWolf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityCanisCampestris;

public class RenderNewSteppeWolf extends RenderLiving<EntityCanisCampestris> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_wolf_steppe.png");
	protected ModelNewWolf model;

	public RenderNewSteppeWolf() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewWolf(), 0.4f);
		model = ((ModelNewWolf) mainModel);
	}

	@Override
	protected float handleRotationFloat(EntityCanisCampestris livingBase, float partialTicks) {
		return 0.2F;
	}

	@Override
	protected void preRenderCallback(EntityCanisCampestris entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	public void doRender(EntityCanisCampestris entity, double x, double y, double z, float entityYaw, float partialTicks) {
		if (entity.isWolfWet()) {
			float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
			GlStateManager.color(f, f, f);
		}

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCanisCampestris entity) {
		return BASE;
	}

}
