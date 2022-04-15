package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class LayerNewWolfCollar<T extends Wolf, A extends EntityModel<T>> extends RenderLayer<T, A> {

    private static final ResourceLocation COLLAR_TEXTURE = new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/wolf/wolf_tame_collar.png");

    public LayerNewWolfCollar(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entitylivingbaseIn.isTame()) {
            float[] afloat = entitylivingbaseIn.getCollarColor().getTextureDiffuseColors();
            renderColoredCutoutModel(this.getParentModel(), COLLAR_TEXTURE, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, afloat[0], afloat[1], afloat[2]);
        }
    }
}