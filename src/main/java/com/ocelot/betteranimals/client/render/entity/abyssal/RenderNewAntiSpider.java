package com.ocelot.betteranimals.client.render.entity.abyssal;

import java.lang.reflect.InvocationTargetException;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSpider;
import com.ocelot.betteranimals.compat.ActiveCompatAbyssalCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;

public class RenderNewAntiSpider extends RenderLiving<EntityMob> implements LayerRenderer<EntityMob> {

	private ModelNewSpider model;
	
	private ResourceLocation base;
	private ResourceLocation eyes;

	public RenderNewAntiSpider(ResourceLocation base, ResourceLocation eyes) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewSpider(), 1f);
		model = ((ModelNewSpider) mainModel);
		this.base = base;
		this.eyes = eyes;
		this.addLayer(this);
	}

	@Override
	protected void preRenderCallback(EntityMob entity, float partialTickTime) {
		Object thisSpider = ActiveCompatAbyssalCraft.antiSpider.asSubclass(EntityMob.class).cast(entity);
		try {
			if ((boolean) ActiveCompatAbyssalCraft.spiderAsideClimbableBlock.invoke(thisSpider)) {
				GlStateManager.rotate(-90, 1, 0, 0);
				GlStateManager.translate(0.0F, 0.75F, -0.5F);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMob entity) {
		return base;
	}

	@Override
	public void doRenderLayer(EntityMob entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
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