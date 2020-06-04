package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewCatCollar extends LayerRenderer<CatEntity, EntityModel<CatEntity>> {
    private static final ResourceLocation CAT_COLLAR = new ResourceLocation(BetterAnimals.MODID, "textures/entity/cat/collar.png");

    public LayerNewCatCollar(IEntityRenderer<CatEntity, EntityModel<CatEntity>> renderer) {
        super(renderer);
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, CatEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entitylivingbaseIn.isTamed()) {
            float[] afloat = entitylivingbaseIn.getCollarColor().getColorComponentValues();
            renderCutoutModel(this.getEntityModel(), CAT_COLLAR, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, afloat[0], afloat[1], afloat[2]);
        }
    }

}