package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewFox;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewFoxItem;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewFox extends MobRenderer<FoxEntity, ModelNewFox<FoxEntity>> {

    private static final ResourceLocation FOX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/fox/fox.png");
    private static final ResourceLocation SLEEPING_FOX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/fox/fox_sleep.png");
    private static final ResourceLocation SNOW_FOX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/fox/snow_fox.png");
    private static final ResourceLocation SLEEPING_SNOW_FOX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/fox/snow_fox_sleep.png");

    public RenderNewFox(EntityRendererManager m) {
        super(m, new ModelNewFox<FoxEntity>(), 0.4F);
        this.addLayer(new LayerNewFoxItem(this));
    }

    @Override
    protected ResourceLocation getEntityTexture(FoxEntity entity) {
        if(entity.getVariantType() == FoxEntity.Type.RED) {
            return entity.isSleeping() ? SLEEPING_FOX : FOX;
        } else {
            return entity.isSleeping() ? SLEEPING_SNOW_FOX : SNOW_FOX;
        }
    }

    protected void applyRotations(FoxEntity entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        if(entityLiving.func_213480_dY() || entityLiving.isStuck()) {
            GlStateManager.rotatef(-MathHelper.lerp(partialTicks, entityLiving.prevRotationPitch, entityLiving.rotationPitch), 1.0F, 0.0F, 0.0F);
        }
    }

    @Override
    protected void preRenderCallback(FoxEntity entitylivingbaseIn, float partialTickTime) {
        if(this.entityModel.isChild) {
            GlStateManager.scaled(0.5D, 0.5D, 0.5D);
        }
        if(entitylivingbaseIn.isSleeping()) {
            GlStateManager.translatef(0F, 0.5F, 0F);
        }
        if(entitylivingbaseIn.isSitting()) {
            GlStateManager.translatef(0F, 0.2F, 0F);
        }
    }

}
