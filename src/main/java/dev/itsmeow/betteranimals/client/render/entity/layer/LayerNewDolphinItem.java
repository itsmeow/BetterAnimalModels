package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class LayerNewDolphinItem extends LayerRenderer<DolphinEntity, EntityModel<DolphinEntity>> {
    private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

    public LayerNewDolphinItem(IEntityRenderer<DolphinEntity, EntityModel<DolphinEntity>> renderer) {
        super(renderer);
    }

    @Override
    public void render(DolphinEntity entityIn, float p_212842_2_, float p_212842_3_, float p_212842_4_, float p_212842_5_, float p_212842_6_, float p_212842_7_, float p_212842_8_) {
        boolean flag = entityIn.getPrimaryHand() == HandSide.RIGHT;
        ItemStack itemstack = flag ? entityIn.getHeldItemOffhand() : entityIn.getHeldItemMainhand();
        ItemStack itemstack1 = flag ? entityIn.getHeldItemMainhand() : entityIn.getHeldItemOffhand();
        if (!itemstack.isEmpty() || !itemstack1.isEmpty()) {
            this.renderStack(entityIn, itemstack1);
        }
    }

    private void renderStack(LivingEntity entityIn, ItemStack stack) {
        if (!stack.isEmpty()) {
            Item item = stack.getItem();
            Block block = Block.getBlockFromItem(item);
            GlStateManager.pushMatrix();
            boolean flag = this.itemRenderer.shouldRenderItemIn3D(stack) && block.getRenderLayer() == BlockRenderLayer.TRANSLUCENT;
            if (flag) {
                GlStateManager.depthMask(false);
            }

            float f = 1.0F;
            float f1 = -1.0F;
            float f2 = MathHelper.abs(entityIn.rotationPitch) / 60.0F;
            if (entityIn.rotationPitch < 0.0F) {
                GlStateManager.translatef(0.0F, 1.0F - f2 * 0.5F, -1.0F + f2 * 0.5F);
            } else {
                GlStateManager.translatef(0.0F, 1.0F + f2 * 0.8F, -1.0F + f2 * 0.2F);
            }

            this.itemRenderer.renderItem(stack, entityIn, ItemCameraTransforms.TransformType.GROUND, false);
            if (flag) {
                GlStateManager.depthMask(true);
            }

            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
