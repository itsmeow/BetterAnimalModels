package dev.itsmeow.betteranimals.client.render.entity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewWolf2;
import dev.itsmeow.betteranimals.client.render.layer.LayerNewWolfCollar;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;

public class RenderNewWolf extends RenderLiving<EntityWolf> {

    private static final ResourceLocation WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf.png");
    private static final ResourceLocation TAMED_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame.png");
    private static final ResourceLocation ANRGY_WOLF_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_angry.png");

    public RenderNewWolf(RenderManager m) {
        super(m, new ModelNewWolf2(), 0.25f);
        this.addLayer(new LayerNewWolfCollar(this));
    }

    @Override
    protected float handleRotationFloat(EntityWolf livingBase, float partialTicks) {
        return livingBase.getTailRotation();
    }

    @Override
    protected void preRenderCallback(EntityWolf entitylivingbaseIn, float partialTickTime) {
        if (getMainModel().isChild) {
            GlStateManager.scale(0.3D, 0.3D, 0.3D);
        } else {
            GlStateManager.scale(0.8D, 0.8D, 0.8D);
        }
    }

    @Override
    public void doRender(EntityWolf entity, double x, double y, double z, float entityYaw, float partialTicks) {
        if (entity.isWolfWet()) {
            float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
            GlStateManager.color(f, f, f);
        }

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWolf entity) {
        if (entity.isTamed()) {
            return TAMED_WOLF_TEXTURES;
        } else {
            return entity.isAngry() ? ANRGY_WOLF_TEXTURES : WOLF_TEXTURES;
        }
    }

}