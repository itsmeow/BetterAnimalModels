package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.level.block.state.BlockState;

public class LayerNewMooshroomMushroom<T extends MushroomCow, A extends EntityModel<T>> extends RenderLayer<T, A> {

    public LayerNewMooshroomMushroom(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void render(PoseStack stack, MultiBufferSource bufferIn, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(!entity.isBaby() && !entity.isInvisible()) {
            BlockRenderDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRenderer();
            BlockState blockstate = entity.getMushroomType().getBlockState();
            int i = LivingEntityRenderer.getOverlayCoords(entity, 0.0F);
            stack.pushPose();
            {
                stack.scale(1.0F, -1.0F, 1.0F);
                stack.translate(-0.6F, 0.65F, -0.6F);
                stack.pushPose();
                {
                    stack.translate(0.2F, 0.0F, 0.5F);
                    stack.mulPose(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderSingleBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.popPose();
                stack.pushPose();
                {
                    stack.translate(0.1F, 0.0F, -0.6F);
                    stack.mulPose(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderSingleBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.popPose();
                stack.pushPose();
                {
                    stack.translate(-0.2F, 0.0F, -0.6F);
                    stack.mulPose(Vector3f.YP.rotationDegrees(42F));
                    stack.translate(-0.5F, -0.5F, 0.5F);
                    blockrendererdispatcher.renderSingleBlock(blockstate, stack, bufferIn, packedLightIn, i);
                }
                stack.popPose();
            }
            stack.popPose();

        }
    }

}