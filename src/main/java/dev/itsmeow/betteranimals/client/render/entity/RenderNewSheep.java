package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewSheep;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewSheepWool;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewSheep extends MobRenderer<SheepEntity, ModelNewSheep<SheepEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");

	public RenderNewSheep(EntityRendererManager m) {
		super(m, new ModelNewSheep<SheepEntity>(), 0.4f);
		this.addLayer(new LayerNewSheepWool<SheepEntity, ModelNewSheep<SheepEntity>>(this));
	}

	@Override
	protected void preRenderCallback(SheepEntity entitylivingbaseIn, float partialTickTime) {
		if (getEntityModel().isChild) {
			GlStateManager.scaled(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scaled(1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(SheepEntity entity) {
		return BASE;
	}
}