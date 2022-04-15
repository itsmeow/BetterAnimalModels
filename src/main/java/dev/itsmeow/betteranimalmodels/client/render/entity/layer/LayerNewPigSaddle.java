package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Pig;

public class LayerNewPigSaddle<T extends Pig, A extends EntityModel<T>> extends RenderLayer<T, A> {

    private static final ResourceLocation SADDLE = new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/pig_saddle.png");

    public LayerNewPigSaddle(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack stack, MultiBufferSource bufferIn, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entity.isSaddled()) {
            stack.pushPose();
            {
                stack.scale(1.05F, 1.05F, 1.05F);
                stack.translate(0F, -0.05F, 0F);
                VertexConsumer ivertexbuilder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(SADDLE));
                this.getParentModel().renderToBuffer(stack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            stack.popPose();
        }
    }

}
