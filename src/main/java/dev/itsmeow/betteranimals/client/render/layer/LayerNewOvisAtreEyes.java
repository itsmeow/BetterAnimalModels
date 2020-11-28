package dev.itsmeow.betteranimals.client.render.layer;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.render.entity.primal.RenderNewOvisAtre;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityOvisAtre;

public class LayerNewOvisAtreEyes implements LayerRenderer<EntityOvisAtre> {

	private static final ResourceLocation EYES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_ovis_atre_eyes.png");
	private final RenderNewOvisAtre entityRenderer;

	public LayerNewOvisAtreEyes(RenderNewOvisAtre entityRenderer)
	{
		this.entityRenderer = entityRenderer;
	}

	@Override
	public void doRenderLayer(EntityOvisAtre entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.entityRenderer.bindTexture(EYES);

		GlStateManager.enableBlend();
		GlStateManager.disableAlpha();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible())
		{
			GlStateManager.depthMask(false);
		}
		else
		{
			GlStateManager.depthMask(true);
		}

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
		this.entityRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
		i = entitylivingbaseIn.getBrightnessForRender();
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
		this.entityRenderer.setLightmap(entitylivingbaseIn);
		GlStateManager.disableBlend();
		GlStateManager.enableAlpha();
	}
	
	@Override
	public boolean shouldCombineTextures()
	{
		return true;
	}
}
