package dev.itsmeow.betteranimals.client.render.entity.abyssal;

import dev.itsmeow.betteranimals.client.model.ModelNewSpider;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSpider;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderNewAntiSpider extends RenderLiving<EntityAntiSpider> implements LayerRenderer<EntityAntiSpider> {

	private ResourceLocation base;
	private ResourceLocation eyes;

	public RenderNewAntiSpider(RenderManager m, ResourceLocation base, ResourceLocation eyes) {
		super(m, new ModelNewSpider(), 1f);
		this.base = base;
		this.eyes = eyes;
		this.addLayer(this);
	}

	@Override
	protected void preRenderCallback(EntityAntiSpider entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotate(-90, 1, 0, 0);
			GlStateManager.translate(0.0F, 0.75F, -0.5F);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAntiSpider entity) {
		return base;
	}

	@Override
	public void doRenderLayer(EntityAntiSpider entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.bindTexture(eyes);
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		i = entity.getBrightnessForRender();
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		this.setLightmap(entity);
		GlStateManager.disableBlend();
		GlStateManager.color(1, 1, 1, 1);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}