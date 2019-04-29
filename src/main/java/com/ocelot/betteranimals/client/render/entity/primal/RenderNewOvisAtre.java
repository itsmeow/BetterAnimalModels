package com.ocelot.betteranimals.client.render.entity.primal;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewOvisAtre;
import com.ocelot.betteranimals.client.render.layer.LayerNewOvisAtreEyes;
import com.ocelot.betteranimals.client.render.layer.LayerNewOvisAtreWool;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import nmd.primal.core.common.entities.living.EntityOvisAtre;

public class RenderNewOvisAtre extends RenderLiving<EntityOvisAtre> {
	
	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/primal/primal_ovis_atre.png");
	protected ModelNewOvisAtre model;
	
	public RenderNewOvisAtre() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewOvisAtre(), 0.4F);
		model = ((ModelNewOvisAtre) mainModel);
		this.addLayer(new LayerNewOvisAtreWool(this));
		this.addLayer(new LayerNewOvisAtreEyes(this));
	}
	
	@Override
	protected void preRenderCallback(EntityOvisAtre entitylivingbaseIn, float partialTickTime) {
		if (model.isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityOvisAtre entity) {
		return BASE;
	}

}