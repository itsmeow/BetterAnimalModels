package com.ocelot.betteranimals.client.render.layer;

import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilSheep;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class LayerNewEvilSheepWool implements LayerRenderer<EntityMob> {

	private ResourceLocation TEXTURE = new ResourceLocation("betteranimals", "textures/mobs/sheep_fur.png");
	private final RenderNewEvilSheep evilRenderer;

	public LayerNewEvilSheepWool(RenderNewEvilSheep evilRenderer, ResourceLocation furTexture) {
		this.evilRenderer = evilRenderer;
		this.TEXTURE = furTexture;
	}

	@Override
	public void doRenderLayer(EntityMob entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		evilRenderer.bindTexture(TEXTURE);

		if (entity.isInvisible())
			GlStateManager.depthMask(false);
		else
			GlStateManager.depthMask(true);
		
		
		evilRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		
	}

	public boolean shouldCombineTextures() {
		return true;
	}

}
