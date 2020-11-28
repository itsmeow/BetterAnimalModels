package dev.itsmeow.betteranimals.client.render.entity.primal;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewWolf2;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityCanisCampestris;

public class RenderNewSteppeWolf extends RenderLiving<EntityCanisCampestris> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_wolf_steppe.png");

	public RenderNewSteppeWolf(RenderManager m) {
		super(m, new ModelNewWolf2(), 0.4f);
	}

	@Override
	protected float handleRotationFloat(EntityCanisCampestris livingBase, float partialTicks) {
		return 0.2F;
	}

	@Override
	protected void preRenderCallback(EntityCanisCampestris entitylivingbaseIn, float partialTickTime) {
		if (mainModel.isChild) {
			GlStateManager.scale(0.3D, 0.3D, 0.3D);
		} else {
			GlStateManager.scale(0.8D, 0.8D, 0.8D);
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
