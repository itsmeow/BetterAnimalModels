package com.ocelot.betteranimals.client.render.entity.abyssal;

import java.lang.reflect.Field;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewChicken;
import com.ocelot.betteranimals.compat.CompatUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewAntiChicken extends RenderLiving<EntityAnimal>{

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");
	private Class base;
	private Field wingRotationF = null;
	private Field destPosF = null;
	private Field oFlapSpeedF = null;
	private Field oFlapF = null;
	private Field wingRotDeltaF = null;

	public RenderNewAntiChicken(ResourceLocation texture, Class base) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewChicken(), 0.4F);
		this.base = base;
		this.texture = texture;
		wingRotationF = CompatUtils.getField("field_70886_e", base);
		destPosF = CompatUtils.getField("destPos", base);
		oFlapSpeedF = CompatUtils.getField("field_70884_g", base);
		oFlapF = CompatUtils.getField("field_70888_h", base);
	}

	@Override
	protected void preRenderCallback(EntityAnimal entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.9D, 0.9D, 0.9D);
		}
	}

	@Override
	protected float handleRotationFloat(EntityAnimal livingBase, float partialTicks) {
		Object chicken = base.cast(livingBase);
		float f = 0;
		float f1 = 0;
		try {
			float wingRotation = wingRotationF.getFloat(chicken);
			float destPos = destPosF.getFloat(chicken);
			float oFlap = oFlapF.getFloat(chicken);
			float oFlapSpeed = oFlapSpeedF.getFloat(chicken);
			f = oFlap + (wingRotation - oFlap) * partialTicks;
			f1 = oFlapSpeed + (destPos - oFlapSpeed) * partialTicks;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAnimal entity) {
		return texture;
	}


}

