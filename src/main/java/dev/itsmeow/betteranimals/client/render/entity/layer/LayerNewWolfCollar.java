package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewWolfCollar<T extends WolfEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {

    private static final ResourceLocation COLLAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/entity/wolf/wolf_tame_collar.png");

    public LayerNewWolfCollar(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entitylivingbaseIn.isTamed()) {
            float[] afloat = entitylivingbaseIn.getCollarColor().getColorComponentValues();
            renderCutoutModel(this.getEntityModel(), COLLAR_TEXTURE, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, afloat[0], afloat[1], afloat[2]);
        }
    }
}