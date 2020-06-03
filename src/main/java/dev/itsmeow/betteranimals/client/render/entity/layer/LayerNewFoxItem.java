package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.client.model.ModelNewFox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@SuppressWarnings("deprecation")
@OnlyIn(Dist.CLIENT)
public class LayerNewFoxItem extends LayerRenderer<FoxEntity, ModelNewFox<FoxEntity>> {

    public LayerNewFoxItem(IEntityRenderer<FoxEntity, ModelNewFox<FoxEntity>> renderer) {
        super(renderer);
    }

    public void render(FoxEntity entity, float p_212842_2_, float p_212842_3_, float p_212842_4_, float p_212842_5_, float p_212842_6_, float p_212842_7_, float p_212842_8_) {
        ItemStack itemstack = entity.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
        if(!itemstack.isEmpty()) {
            boolean sleeping = entity.isSleeping();
            GlStateManager.pushMatrix();
            {
                GlStateManager.translatef(((this.getEntityModel()).head.rotationPointX + (this.getEntityModel()).neck.rotationPointX + (this.getEntityModel()).body.rotationPointX) / 16.0F, ((this.getEntityModel()).head.rotationPointY + (this.getEntityModel()).neck.rotationPointY + (this.getEntityModel()).body.rotationPointY) / 16.0F, ((this.getEntityModel()).head.rotationPointZ + (this.getEntityModel()).neck.rotationPointZ + (this.getEntityModel()).body.rotationPointZ) / 16.0F);
                GlStateManager.rotatef(entity.func_213475_v(p_212842_4_) * (180F / (float) Math.PI), 0.0F, 0.0F, 2.0F);
                GlStateManager.rotatef((float) Math.toDegrees(this.getEntityModel().head.rotateAngleY), 0.0F, 1.0F, 0.0F);
                GlStateManager.rotatef((float) Math.toDegrees(this.getEntityModel().head.rotateAngleX), 1.0F, 0.0F, 0.0F);
                if(sleeping) {
                    GlStateManager.translatef(0.6F, 0.1F, -0.3F);
                } else {
                    GlStateManager.translatef(0F, -0.1F, -0.5F);
                }
                GlStateManager.rotatef(90.0F, 1.0F, 0.0F, 0.0F);
                if(sleeping) {
                    GlStateManager.rotatef(90.0F, 0.0F, 0.0F, 1.0F);
                }

                Minecraft.getInstance().getItemRenderer().renderItem(itemstack, entity, ItemCameraTransforms.TransformType.GROUND, false);
            }
            GlStateManager.popMatrix();
        }
    }

    public boolean shouldCombineTextures() {
        return false;
    }
}