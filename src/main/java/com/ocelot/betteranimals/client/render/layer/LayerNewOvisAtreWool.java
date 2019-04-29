package com.ocelot.betteranimals.client.render.layer;

import com.ocelot.betteranimals.client.render.entity.primal.RenderNewOvisAtre;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityOvisAtre;

public class LayerNewOvisAtreWool implements LayerRenderer<EntityOvisAtre> {

	private static final ResourceLocation TEXTURE = new ResourceLocation("betteranimals", "textures/mobs/primal/primal_ovis_atre_wool.png");
	private final RenderNewOvisAtre ovisAtreRenderer;

	public LayerNewOvisAtreWool(RenderNewOvisAtre ovisAtreRenderer) {
		this.ovisAtreRenderer = ovisAtreRenderer;
	}

	public void doRenderLayer(EntityOvisAtre entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ovisAtreRenderer.bindTexture(TEXTURE);

		if (entity.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}
		ovisAtreRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	public boolean shouldCombineTextures() {
		return false;
	}

}
