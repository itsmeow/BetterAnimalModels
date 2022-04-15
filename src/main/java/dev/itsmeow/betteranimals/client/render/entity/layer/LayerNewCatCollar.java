package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;

public class LayerNewCatCollar extends RenderLayer<Cat, EntityModel<Cat>> {
    private static final ResourceLocation CAT_COLLAR = new ResourceLocation(BetterAnimals.MODID, "textures/entity/cat/collar.png");

    public LayerNewCatCollar(RenderLayerParent<Cat, EntityModel<Cat>> renderer) {
        super(renderer);
    }

    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Cat entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entitylivingbaseIn.isTame()) {
            float[] afloat = entitylivingbaseIn.getCollarColor().getTextureDiffuseColors();
            renderColoredCutoutModel(this.getParentModel(), CAT_COLLAR, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, afloat[0], afloat[1], afloat[2]);
        }
    }

}