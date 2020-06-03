package dev.itsmeow.betteranimals.client.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewWolf2;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewWolfCollar;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewWolf extends MobRenderer<WolfEntity, ModelNewWolf2<WolfEntity>> {

    private static final ResourceLocation WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf.png");
    private static final ResourceLocation TAMED_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame.png");
    private static final ResourceLocation ANRGY_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_angry.png");

    public RenderNewWolf(EntityRendererManager m) {
        super(m, new ModelNewWolf2<WolfEntity>(), 0.25f);
        this.addLayer(new LayerNewWolfCollar<WolfEntity, ModelNewWolf2<WolfEntity>>(this));
    }

    @Override
    protected float handleRotationFloat(WolfEntity livingBase, float partialTicks) {
        return livingBase.getTailRotation();
    }

    @Override
    protected void preRenderCallback(WolfEntity entitylivingbaseIn, float partialTickTime) {
        if(getEntityModel().isChild) {
            GlStateManager.scaled(0.5D, 0.5D, 0.5D);
        } else {
            GlStateManager.scaled(1.0D, 1.0D, 1.0D);
        }
    }

    @Override
    public void doRender(WolfEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        if(entity.isWolfWet()) {
            float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
            GlStateManager.color3f(f, f, f);
        }

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(WolfEntity entity) {
        if(entity.isTamed()) {
            return TAMED_WOLF_TEXTURES;
        } else {
            return entity.isAngry() ? ANRGY_WOLF_TEXTURES : WOLF_TEXTURES;
        }
    }

}