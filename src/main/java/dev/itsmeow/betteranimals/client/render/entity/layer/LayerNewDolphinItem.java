package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import dev.itsmeow.betteranimals.client.model.ModelNewDolphin;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class LayerNewDolphinItem extends LayerRenderer<DolphinEntity, EntityModel<DolphinEntity>> {

    public LayerNewDolphinItem(IEntityRenderer<DolphinEntity, EntityModel<DolphinEntity>> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, DolphinEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        boolean flag = entitylivingbaseIn.getPrimaryHand() == HandSide.RIGHT;
        matrixStackIn.push();
        float f2 = MathHelper.abs(entitylivingbaseIn.rotationPitch) / 60.0F;
        if (entitylivingbaseIn.rotationPitch < 0.0F) {
            matrixStackIn.translate(0.0D, (double) (1.0F - f2 * 0.5F), (double) (-1.0F + f2 * 0.5F));
        } else {
            matrixStackIn.translate(0.0D, (double) (1.0F + f2 * 0.8F), (double) (-1.0F + f2 * 0.2F));
        }

        ItemStack itemstack = flag ? entitylivingbaseIn.getHeldItemMainhand() : entitylivingbaseIn.getHeldItemOffhand();
        Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(entitylivingbaseIn, itemstack, ItemCameraTransforms.TransformType.GROUND, false, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.pop();
    }

}
