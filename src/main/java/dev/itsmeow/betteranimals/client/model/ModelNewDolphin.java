package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * dolphin - CyberCat5555
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelNewDolphin<T extends Entity> extends EntityModel<T> {
    public ModelRenderer body;
    public ModelRenderer tail01;
    public ModelRenderer head;
    public ModelRenderer lFin00;
    public ModelRenderer rFin00;
    public ModelRenderer dorsalFin00;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer tail05;
    public ModelRenderer lFluke00;
    public ModelRenderer rFluke00;
    public ModelRenderer lFluke01;
    public ModelRenderer rFluke01;
    public ModelRenderer topJaw;
    public ModelRenderer lowerJaw;
    public ModelRenderer melon;
    public ModelRenderer snout;
    public ModelRenderer teethUpper;
    public ModelRenderer lowerTeeth;
    public ModelRenderer lFin01;
    public ModelRenderer rFin01;
    public ModelRenderer dorsalFin01;

    public ModelNewDolphin() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 45, 0);
        this.head.setRotationPoint(0.0F, -3.4F, -6.2F);
        this.head.addBox(-3.5F, -1.0F, -6.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.03490658503988659F, 0.0F, 0.0F);
        this.tail02 = new ModelRenderer(this, 0, 39);
        this.tail02.setRotationPoint(0.0F, 1.0F, 7.5F);
        this.tail02.addBox(-2.5F, -4.0F, 0.0F, 5.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail02, -0.08726646259971647F, 0.0F, 0.0F);
        this.melon = new ModelRenderer(this, 47, 14);
        this.melon.setRotationPoint(0.0F, -1.0F, -5.9F);
        this.melon.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(melon, 0.4363323129985824F, 0.0F, 0.0F);
        this.rFin01 = new ModelRenderer(this, 79, 10);
        this.rFin01.mirror = true;
        this.rFin01.setRotationPoint(-0.49F, 4.5F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFin01, 0.3490658503988659F, 0.0F, 0.0F);
        this.lFluke00 = new ModelRenderer(this, 91, 0);
        this.lFluke00.setRotationPoint(1.3F, 0.1F, -0.5F);
        this.lFluke00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFluke00, 0.4886921905584123F, 0.0F, -1.3089969389957472F);
        this.lFluke01 = new ModelRenderer(this, 90, 9);
        this.lFluke01.setRotationPoint(-0.01F, 4.0F, 0.0F);
        this.lFluke01.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFluke01, 0.2617993877991494F, 0.0F, 0.0F);
        this.lFin00 = new ModelRenderer(this, 79, 0);
        this.lFin00.setRotationPoint(3.8F, 4.0F, -5.0F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFin00, 0.5235987755982988F, 0.0F, -0.8726646259971648F);
        this.snout = new ModelRenderer(this, 52, 25);
        this.snout.setRotationPoint(0.0F, -1.6F, -4.1F);
        this.snout.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(snout, 0.6981317007977318F, 0.0F, 0.0F);
        this.dorsalFin00 = new ModelRenderer(this, 104, 0);
        this.dorsalFin00.setRotationPoint(0.0F, -2.5F, 4.0F);
        this.dorsalFin00.addBox(-0.5F, -4.9F, -2.5F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.7853981633974483F, 0.0F, 0.0F);
        this.rFluke01 = new ModelRenderer(this, 90, 9);
        this.rFluke01.mirror = true;
        this.rFluke01.setRotationPoint(0.01F, 4.0F, 0.0F);
        this.rFluke01.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFluke01, 0.2617993877991494F, 0.0F, 0.0F);
        this.tail03 = new ModelRenderer(this, 0, 54);
        this.tail03.setRotationPoint(0.0F, -2.0F, 6.8F);
        this.tail03.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail03, -0.08726646259971647F, 0.0F, 0.0F);
        this.lFin01 = new ModelRenderer(this, 79, 10);
        this.lFin01.setRotationPoint(-0.51F, 4.5F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFin01, 0.3490658503988659F, 0.0F, 0.0F);
        this.tail04 = new ModelRenderer(this, 20, 55);
        this.tail04.setRotationPoint(0.0F, 0.4F, 4.9F);
        this.tail04.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail04, -0.2275909337942703F, 0.0F, 0.0F);
        this.tail05 = new ModelRenderer(this, 35, 57);
        this.tail05.setRotationPoint(0.0F, 1.0F, 3.7F);
        this.tail05.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.body.addBox(-4.0F, -4.5F, -6.5F, 8.0F, 9.0F, 13.0F, 0.0F, 0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 48, 45);
        this.lowerJaw.setRotationPoint(0.0F, 5.0F, -5.9F);
        this.lowerJaw.addBox(-1.7F, 0.0F, -9.0F, 3.5F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.rFin00 = new ModelRenderer(this, 79, 0);
        this.rFin00.mirror = true;
        this.rFin00.setRotationPoint(-3.8F, 4.0F, -5.0F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFin00, 0.5235987755982988F, 0.0F, 0.8726646259971648F);
        this.tail01 = new ModelRenderer(this, 0, 22);
        this.tail01.setRotationPoint(0.0F, 0.5F, 5.8F);
        this.tail01.addBox(-3.5F, -4.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail01, -0.08726646259971647F, 0.0F, 0.0F);
        this.topJaw = new ModelRenderer(this, 45, 32);
        this.topJaw.setRotationPoint(0.0F, 3.4F, -5.7F);
        this.topJaw.addBox(-1.5F, 0.0F, -9.0F, 3.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(topJaw, 0.08726646259971647F, 0.0F, 0.0F);
        this.dorsalFin01 = new ModelRenderer(this, 104, 9);
        this.dorsalFin01.setRotationPoint(0.0F, -3.1F, -0.5F);
        this.dorsalFin01.addBox(-0.4F, -4.0F, -2.5F, 0.8F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.3490658503988659F, 0.0F, 0.0F);
        this.rFluke00 = new ModelRenderer(this, 91, 0);
        this.rFluke00.setRotationPoint(-1.3F, 0.1F, -0.5F);
        this.rFluke00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFluke00, 0.4886921905584123F, 0.0F, 1.3089969389957472F);
        this.lowerTeeth = new ModelRenderer(this, 72, 45);
        this.lowerTeeth.setRotationPoint(0.0F, -0.7F, -8.6F);
        this.lowerTeeth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerTeeth, -0.04555309164612875F, 0.0F, 0.0F);
        this.teethUpper = new ModelRenderer(this, 72, 35);
        this.teethUpper.setRotationPoint(0.0F, 1.6F, -8.4F);
        this.teethUpper.addBox(-1.4F, 0.0F, 0.0F, 2.8F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.body.addChild(this.head);
        this.tail01.addChild(this.tail02);
        this.head.addChild(this.melon);
        this.rFin00.addChild(this.rFin01);
        this.tail05.addChild(this.lFluke00);
        this.lFluke00.addChild(this.lFluke01);
        this.body.addChild(this.lFin00);
        this.topJaw.addChild(this.snout);
        this.body.addChild(this.dorsalFin00);
        this.rFluke00.addChild(this.rFluke01);
        this.tail02.addChild(this.tail03);
        this.lFin00.addChild(this.lFin01);
        this.tail03.addChild(this.tail04);
        this.tail04.addChild(this.tail05);
        this.head.addChild(this.lowerJaw);
        this.body.addChild(this.rFin00);
        this.body.addChild(this.tail01);
        this.head.addChild(this.topJaw);
        this.dorsalFin00.addChild(this.dorsalFin01);
        this.tail05.addChild(this.rFluke00);
        this.lowerJaw.addChild(this.lowerTeeth);
        this.topJaw.addChild(this.teethUpper);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.body.rotateAngleX = headPitch * ((float) Math.PI / 180F);
        this.body.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
        if (Entity.horizontalMag(entityIn.getMotion()) > 1.0E-7D) {
            this.body.rotateAngleX += -0.05F + -0.05F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail01.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail02.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail03.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail04.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail05.rotateAngleX = -0.2F * MathHelper.cos(ageInTicks * 0.3F);
        } else {
            this.tail01.rotateAngleX = -0.08726646259971647F;
            this.tail02.rotateAngleX = -0.08726646259971647F;
            this.tail03.rotateAngleX = -0.08726646259971647F;
            this.tail04.rotateAngleX = -0.2275909337942703F;
            this.tail05.rotateAngleX = 0F;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
