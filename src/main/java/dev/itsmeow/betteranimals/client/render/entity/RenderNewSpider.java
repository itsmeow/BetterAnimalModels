package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewSpider;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewSpiderEyes;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewSpider extends MobRenderer<SpiderEntity, ModelNewSpider<SpiderEntity>> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/spider.png");

	public RenderNewSpider(EntityRendererManager m) {
		super(m, new ModelNewSpider<SpiderEntity>(), 1f);
		this.addLayer(new LayerNewSpiderEyes<SpiderEntity, ModelNewSpider<SpiderEntity>>(this));
	}

	@Override
	protected void preRenderCallback(SpiderEntity entity, float partialTickTime) {
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotatef(-90, 1, 0, 0);
			GlStateManager.translatef(0.0F, 0.75F, -0.5F);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(SpiderEntity entity) {
		return BASE;
	}


}