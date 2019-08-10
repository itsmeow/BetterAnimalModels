package com.ocelot.betteranimals.client.render.entity.layer;

import com.ocelot.betteranimals.client.render.entity.RenderNewSheep;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;

public class LayerNewSheepWool implements LayerRenderer<EntitySheep> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("betteranimals", "textures/mobs/sheep_fur.png");
    private final RenderNewSheep sheepRenderer;

    public LayerNewSheepWool(RenderNewSheep sheepRenderer) {
        this.sheepRenderer = sheepRenderer;
    }

    @Override
    public void render(EntitySheep entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (!entity.getSheared() && !entity.isInvisible()) {
            this.sheepRenderer.bindTexture(TEXTURE);
            if (entity.hasCustomName() && "jeb_".equals(entity.getName().getUnformattedComponentText())) {
                int i = entity.ticksExisted / 25 + entity.getEntityId();
                int j = EnumDyeColor.values().length;
                int k = i % j;
                int l = (i + 1) % j;
                float f = ((float)(entity.ticksExisted % 25) + partialTicks) / 25.0F;
                float[] afloat1 = EntitySheep.getDyeRgb(EnumDyeColor.byId(k));
                float[] afloat2 = EntitySheep.getDyeRgb(EnumDyeColor.byId(l));
                GlStateManager.color3f(afloat1[0] * (1.0F - f) + afloat2[0] * f, afloat1[1] * (1.0F - f) + afloat2[1] * f, afloat1[2] * (1.0F - f) + afloat2[2] * f);
            } else {
                float[] afloat = EntitySheep.getDyeRgb(entity.getFleeceColor());
                GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
            }

            sheepRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
}