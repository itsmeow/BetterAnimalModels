package com.ocelot.betteranimals.client.render.entity.abyssal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewChicken;
import com.shinoow.abyssalcraft.client.render.entity.RenderAntiChicken;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderNewAntiChicken extends RenderAntiChicken {

	private ResourceLocation texture = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");

	@SuppressWarnings("unchecked")
    public RenderNewAntiChicken(RenderManager m, ResourceLocation texture) {
		super(m);
		this.mainModel = new ModelNewChicken();
		this.texture = texture;
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.9D, 0.9D, 0.9D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}


}

