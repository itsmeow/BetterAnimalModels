package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;

import dev.itsmeow.betteranimals.client.model.ModelNewFox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LayerNewFoxItem extends LayerRenderer<FoxEntity, ModelNewFox<FoxEntity>> {

    public LayerNewFoxItem(IEntityRenderer<FoxEntity, ModelNewFox<FoxEntity>> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack stack, IRenderTypeBuffer bufferIn, int packedLightIn, FoxEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        ItemStack itemstack = entity.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
        if(!itemstack.isEmpty()) {
            boolean sleeping = entity.isSleeping();
            stack.push();
            {
                stack.translate(((this.getEntityModel()).head.rotationPointX + (this.getEntityModel()).neck.rotationPointX + (this.getEntityModel()).body.rotationPointX) / 16.0F, ((this.getEntityModel()).head.rotationPointY + (this.getEntityModel()).neck.rotationPointY + (this.getEntityModel()).body.rotationPointY) / 16.0F, ((this.getEntityModel()).head.rotationPointZ + (this.getEntityModel()).neck.rotationPointZ + (this.getEntityModel()).body.rotationPointZ) / 16.0F);
                stack.rotate(Vector3f.ZP.rotation(this.getEntityModel().head.rotateAngleZ));
                stack.rotate(Vector3f.YP.rotation(this.getEntityModel().head.rotateAngleY));
                stack.rotate(Vector3f.XP.rotation(this.getEntityModel().head.rotateAngleX));
                if(sleeping) {
                    stack.translate(0.6F, 0.1F, -0.3F);
                } else {
                    stack.translate(0F, -0.1F, -0.5F);
                }
                stack.rotate(Vector3f.XP.rotationDegrees(90F));
                if(sleeping) {
                    stack.rotate(Vector3f.ZP.rotationDegrees(90F));
                }

                Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(entity, itemstack, ItemCameraTransforms.TransformType.GROUND, false, stack, bufferIn, packedLightIn);
            }
            stack.pop();
        }
    }

}