package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewChicken;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiChicken;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewAntiChicken extends RenderLiving<EntityAntiChicken>{

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");

	public RenderNewAntiChicken(ResourceLocation texture) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewChicken(), 0.4F);
		this.texture = texture;
	}

	@Override
	protected void preRenderCallback(EntityAntiChicken entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.9D, 0.9D, 0.9D);
		}
	}

	@Override
	protected float handleRotationFloat(EntityAntiChicken chicken, float partialTicks) {
		float f = 0;
		float f1 = 0;
		float wingRotation = chicken.field_70886_e;
		float destPos = chicken.destPos;
		float oFlap = chicken.field_70888_h;
		float oFlapSpeed = chicken.field_70884_g;
		f = oFlap + (wingRotation - oFlap) * partialTicks;
		f1 = oFlapSpeed + (destPos - oFlapSpeed) * partialTicks;

		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAntiChicken entity) {
		return texture;
	}


}

