package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.passive.MooshroomEntity;

public class LayerNewMooshroomMushroom<T extends MooshroomEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {

    public LayerNewMooshroomMushroom(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void render(MatrixStack stack, IRenderTypeBuffer bufferIn, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(!entity.isChild() && !entity.isInvisible()) {
            BlockRendererDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
            BlockState blockstate = entity.getMooshroomType().getRenderState();
            int i = LivingRenderer.getPackedOverlay(entity, 0.0F);
            stack.push();
            {
                stack.scale(1.0F, -1.0F, 1.0F);
                stack.translate(-0.6F, 0.65F, -0.6F);
                stack.push();
                {
                    stack.translate(0.2F, 0.0F, 0.5F);
                    stack.rotate(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.pop();
                stack.push();
                {
                    stack.translate(0.1F, 0.0F, -0.6F);
                    stack.rotate(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.pop();
                stack.push();
                {
                    stack.translate(-0.2F, 0.0F, -0.6F);
                    stack.rotate(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.pop();
            }
            stack.pop();

        }
    }

}