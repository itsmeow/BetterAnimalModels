package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewOvisAtre;
import com.ocelot.betteranimals.client.render.layer.LayerNewOvisAtreEyes;
import com.ocelot.betteranimals.client.render.layer.LayerNewOvisAtreWool;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

public class RenderNewOvisAtre extends RenderLiving {
	
	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_ovis_atre.png");
	protected ModelNewOvisAtre model;
	
	public RenderNewOvisAtre() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewOvisAtre(), 0.4F);
		model = ((ModelNewOvisAtre) mainModel);
		this.addLayer(new LayerNewOvisAtreWool(this));
		this.addLayer(new LayerNewOvisAtreEyes(this));
	}
	
	@Override
	protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return BASE;
	}

}
