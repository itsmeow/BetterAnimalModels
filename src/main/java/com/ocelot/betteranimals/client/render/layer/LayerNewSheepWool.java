package com.ocelot.betteranimals.client.render.layer;

import com.ocelot.betteranimals.client.render.entity.RenderNewSheep;
import com.ocelot.betteranimals.enums.EnumNewSheepWoolColors;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerNewSheepWool implements LayerRenderer<EntitySheep> {

	private static final ResourceLocation TEXTURE = new ResourceLocation("betteranimals", "textures/mobs/sheep_fur.png");
	private final RenderNewSheep sheepRenderer;

	public LayerNewSheepWool(RenderNewSheep sheepRenderer) {
		this.sheepRenderer = sheepRenderer;
	}

	public void doRenderLayer(EntitySheep entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		sheepRenderer.bindTexture(TEXTURE);

		if (entity.isInvisible())
			GlStateManager.depthMask(false);
		else
			GlStateManager.depthMask(true);
		GlStateManager.color(EnumNewSheepWoolColors.getEnumByID(15 - entity.getFleeceColor().getDyeDamage()).getR() / 255.0F, EnumNewSheepWoolColors.getEnumByID(15 - entity.getFleeceColor().getDyeDamage()).getG() / 255.0F, EnumNewSheepWoolColors.getEnumByID(15 - entity.getFleeceColor().getDyeDamage()).getB() / 255.0F);
		sheepRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public boolean shouldCombineTextures() {
		return true;
	}
}