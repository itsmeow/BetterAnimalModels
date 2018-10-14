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
	protected ResourceLocation getEntityTexture(Entity entity) {
		return BASE;
	}

}
