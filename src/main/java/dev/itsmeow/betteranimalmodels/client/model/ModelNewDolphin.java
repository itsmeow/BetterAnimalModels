package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * dolphin - CyberCat5555
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelNewDolphin<T extends Entity> extends EntityModel<T> {
    public ModelPart body;
    public ModelPart tail01;
    public ModelPart head;
    public ModelPart lFin00;
    public ModelPart rFin00;
    public ModelPart dorsalFin00;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart tail05;
    public ModelPart lFluke00;
    public ModelPart rFluke00;
    public ModelPart lFluke01;
    public ModelPart rFluke01;
    public ModelPart topJaw;
    public ModelPart lowerJaw;
    public ModelPart melon;
    public ModelPart snout;
    public ModelPart teethUpper;
    public ModelPart lowerTeeth;
    public ModelPart lFin01;
    public ModelPart rFin01;
    public ModelPart dorsalFin01;

    public ModelNewDolphin() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.head = new ModelPart(this, 45, 0);
        this.head.setPos(0.0F, -3.4F, -6.2F);
        this.head.addBox(-3.5F, -1.0F, -6.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.03490658503988659F, 0.0F, 0.0F);
        this.tail02 = new ModelPart(this, 0, 39);
        this.tail02.setPos(0.0F, 1.0F, 7.5F);
        this.tail02.addBox(-2.5F, -4.0F, 0.0F, 5.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail02, -0.08726646259971647F, 0.0F, 0.0F);
        this.melon = new ModelPart(this, 47, 14);
        this.melon.setPos(0.0F, -1.0F, -5.9F);
        this.melon.addBox(-3.0F, 0.0F, -5.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(melon, 0.4363323129985824F, 0.0F, 0.0F);
        this.rFin01 = new ModelPart(this, 79, 10);
        this.rFin01.mirror = true;
        this.rFin01.setPos(-0.49F, 4.5F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFin01, 0.3490658503988659F, 0.0F, 0.0F);
        this.lFluke00 = new ModelPart(this, 91, 0);
        this.lFluke00.setPos(1.3F, 0.1F, -0.5F);
        this.lFluke00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFluke00, 0.4886921905584123F, 0.0F, -1.3089969389957472F);
        this.lFluke01 = new ModelPart(this, 90, 9);
        this.lFluke01.setPos(-0.01F, 4.0F, 0.0F);
        this.lFluke01.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFluke01, 0.2617993877991494F, 0.0F, 0.0F);
        this.lFin00 = new ModelPart(this, 79, 0);
        this.lFin00.setPos(3.8F, 4.0F, -5.0F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFin00, 0.5235987755982988F, 0.0F, -0.8726646259971648F);
        this.snout = new ModelPart(this, 52, 25);
        this.snout.setPos(0.0F, -1.6F, -4.1F);
        this.snout.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(snout, 0.6981317007977318F, 0.0F, 0.0F);
        this.dorsalFin00 = new ModelPart(this, 104, 0);
        this.dorsalFin00.setPos(0.0F, -2.5F, 4.0F);
        this.dorsalFin00.addBox(-0.5F, -4.9F, -2.5F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.7853981633974483F, 0.0F, 0.0F);
        this.rFluke01 = new ModelPart(this, 90, 9);
        this.rFluke01.mirror = true;
        this.rFluke01.setPos(0.01F, 4.0F, 0.0F);
        this.rFluke01.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFluke01, 0.2617993877991494F, 0.0F, 0.0F);
        this.tail03 = new ModelPart(this, 0, 54);
        this.tail03.setPos(0.0F, -2.0F, 6.8F);
        this.tail03.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail03, -0.08726646259971647F, 0.0F, 0.0F);
        this.lFin01 = new ModelPart(this, 79, 10);
        this.lFin01.setPos(-0.51F, 4.5F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lFin01, 0.3490658503988659F, 0.0F, 0.0F);
        this.tail04 = new ModelPart(this, 20, 55);
        this.tail04.setPos(0.0F, 0.4F, 4.9F);
        this.tail04.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail04, -0.2275909337942703F, 0.0F, 0.0F);
        this.tail05 = new ModelPart(this, 35, 57);
        this.tail05.setPos(0.0F, 1.0F, 3.7F);
        this.tail05.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 17.5F, 0.0F);
        this.body.addBox(-4.0F, -4.5F, -6.5F, 8.0F, 9.0F, 13.0F, 0.0F, 0.0F, 0.0F);
        this.lowerJaw = new ModelPart(this, 48, 45);
        this.lowerJaw.setPos(0.0F, 5.0F, -5.9F);
        this.lowerJaw.addBox(-1.7F, 0.0F, -9.0F, 3.5F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.rFin00 = new ModelPart(this, 79, 0);
        this.rFin00.mirror = true;
        this.rFin00.setPos(-3.8F, 4.0F, -5.0F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFin00, 0.5235987755982988F, 0.0F, 0.8726646259971648F);
        this.tail01 = new ModelPart(this, 0, 22);
        this.tail01.setPos(0.0F, 0.5F, 5.8F);
        this.tail01.addBox(-3.5F, -4.0F, 0.0F, 7.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail01, -0.08726646259971647F, 0.0F, 0.0F);
        this.topJaw = new ModelPart(this, 45, 32);
        this.topJaw.setPos(0.0F, 3.4F, -5.7F);
        this.topJaw.addBox(-1.5F, 0.0F, -9.0F, 3.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(topJaw, 0.08726646259971647F, 0.0F, 0.0F);
        this.dorsalFin01 = new ModelPart(this, 104, 9);
        this.dorsalFin01.setPos(0.0F, -3.1F, -0.5F);
        this.dorsalFin01.addBox(-0.4F, -4.0F, -2.5F, 0.8F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.3490658503988659F, 0.0F, 0.0F);
        this.rFluke00 = new ModelPart(this, 91, 0);
        this.rFluke00.setPos(-1.3F, 0.1F, -0.5F);
        this.rFluke00.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rFluke00, 0.4886921905584123F, 0.0F, 1.3089969389957472F);
        this.lowerTeeth = new ModelPart(this, 72, 45);
        this.lowerTeeth.setPos(0.0F, -0.7F, -8.6F);
        this.lowerTeeth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerTeeth, -0.04555309164612875F, 0.0F, 0.0F);
        this.teethUpper = new ModelPart(this, 72, 35);
        this.teethUpper.setPos(0.0F, 1.6F, -8.4F);
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
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.body.xRot = headPitch * ((float) Math.PI / 180F);
        this.body.yRot = netHeadYaw * ((float) Math.PI / 180F);
        if (Entity.getHorizontalDistanceSqr(entityIn.getDeltaMovement()) > 1.0E-7D) {
            this.body.xRot += -0.05F + -0.05F * Mth.cos(ageInTicks * 0.3F);
            this.tail01.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail02.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail03.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail04.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail05.xRot = -0.2F * Mth.cos(ageInTicks * 0.3F);
        } else {
            this.tail01.xRot = -0.08726646259971647F;
            this.tail02.xRot = -0.08726646259971647F;
            this.tail03.xRot = -0.08726646259971647F;
            this.tail04.xRot = -0.2275909337942703F;
            this.tail05.xRot = 0F;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
