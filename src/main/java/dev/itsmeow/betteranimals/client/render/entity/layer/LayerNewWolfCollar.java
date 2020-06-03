package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewWolfCollar<T extends WolfEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {

    private static final ResourceLocation COLLAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame_collar.png");
    private IEntityRenderer<T, A> renderer;
    
    public LayerNewWolfCollar(IEntityRenderer<T, A> renderer) {
        super(renderer);
        this.renderer = renderer;
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void render(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entitylivingbaseIn.isTamed() && !entitylivingbaseIn.isInvisible()) {
            this.renderer.bindTexture(COLLAR_TEXTURE);
            float[] afloat = entitylivingbaseIn.getCollarColor().getColorComponentValues();
            GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
            this.renderer.getEntityModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }
}