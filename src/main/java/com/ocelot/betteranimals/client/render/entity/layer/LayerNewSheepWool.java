package com.ocelot.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;

public class LayerNewSheepWool<T extends SheepEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("betteranimals", "textures/mobs/sheep_fur.png");
    private IEntityRenderer<T, A> renderer;

    public LayerNewSheepWool(IEntityRenderer<T, A> renderer) {
        super(renderer);
        this.renderer = renderer;
    }

    @Override
    public void render(T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(!entity.getSheared() && !entity.isInvisible()) {
            this.renderer.bindTexture(TEXTURE);
            if(entity.hasCustomName() && "jeb_".equals(entity.getName().getUnformattedComponentText())) {
                int i1 = 25;
                int i = entity.ticksExisted / 25 + entity.getEntityId();
                int j = DyeColor.values().length;
                int k = i % j;
                int l = (i + 1) % j;
                float f = ((float) (entity.ticksExisted % 25) + partialTicks) / 25.0F;
                float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
                float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
                GlStateManager.color3f(afloat1[0] * (1.0F - f) + afloat2[0] * f, afloat1[1] * (1.0F - f) + afloat2[1] * f, afloat1[2] * (1.0F - f) + afloat2[2] * f);
            } else {
                float[] afloat = SheepEntity.getDyeRgb(entity.getFleeceColor());
                GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
            }

            renderer.getEntityModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
}