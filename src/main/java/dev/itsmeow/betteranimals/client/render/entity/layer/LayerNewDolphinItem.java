package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.itsmeow.betteranimals.client.model.ModelNewDolphin;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.item.ItemStack;

public class LayerNewDolphinItem extends RenderLayer<Dolphin, EntityModel<Dolphin>> {

    public LayerNewDolphinItem(RenderLayerParent<Dolphin, EntityModel<Dolphin>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Dolphin entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        boolean flag = entitylivingbaseIn.getMainArm() == HumanoidArm.RIGHT;
        matrixStackIn.pushPose();
        float f2 = Mth.abs(entitylivingbaseIn.xRot) / 60.0F;
        if (entitylivingbaseIn.xRot < 0.0F) {
            matrixStackIn.translate(0.0D, (double) (1.0F - f2 * 0.5F), (double) (-1.0F + f2 * 0.5F));
        } else {
            matrixStackIn.translate(0.0D, (double) (1.0F + f2 * 0.8F), (double) (-1.0F + f2 * 0.2F));
        }

        ItemStack itemstack = flag ? entitylivingbaseIn.getMainHandItem() : entitylivingbaseIn.getOffhandItem();
        Minecraft.getInstance().getItemInHandRenderer().renderItem(entitylivingbaseIn, itemstack, ItemTransforms.TransformType.GROUND, false, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.popPose();
    }

}
