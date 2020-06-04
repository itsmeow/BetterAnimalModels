package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewPigSaddle<T extends PigEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {

    private static final ResourceLocation SADDLE = new ResourceLocation(BetterAnimals.MODID, "textures/entity/pig_saddle.png");

    public LayerNewPigSaddle(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack stack, IRenderTypeBuffer bufferIn, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entity.getSaddled()) {
            stack.push();
            {
                stack.scale(1.05F, 1.05F, 1.05F);
                stack.translate(0F, -0.05F, 0F);
                IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(SADDLE));
                this.getEntityModel().render(stack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            stack.pop();
        }
    }

}
