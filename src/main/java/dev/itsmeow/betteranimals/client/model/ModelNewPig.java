package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * cow2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewPig<T extends LivingEntity> extends Model<T> {

    public ModelPart body;
    public ModelPart neck;
    public ModelPart lArm01;
    public ModelPart rArm01;
    public ModelPart stomach;
    public ModelPart neck02;
    public ModelPart head;
    public ModelPart snoot01;
    public ModelPart upperJaw;
    public ModelPart lowerJaw;
    public ModelPart lEar01;
    public ModelPart rEar01;
    public ModelPart snoot02;
    public ModelPart snoot;
    public ModelPart lEar02;
    public ModelPart rEar02;
    public ModelPart lArm02;
    public ModelPart lArm03;
    public ModelPart lForeHoof;
    public ModelPart rArm02;
    public ModelPart rArm03;
    public ModelPart rForeHoof;
    public ModelPart ass;
    public ModelPart lLeg01;
    public ModelPart rLeg01;
    public ModelPart tail01a;
    public ModelPart lLeg02;
    public ModelPart lLeg03;
    public ModelPart lHindHoof;
    public ModelPart rLeg02;
    public ModelPart rLeg03;
    public ModelPart rHindHoof;
    public ModelPart tail01b;
    public ModelPart tail01c;
    public ModelPart tail01d;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart tail05;
    public ModelPart tail06;
    public ModelPart tail07;
    public ModelPart tail08;
    public ModelPart tailFur;

    public ModelNewPig() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.lowerJaw = new ModelPart(this, 99, 25);
        this.lowerJaw.setPos(0.0F, 2.1F, -4.1F);
        this.lowerJaw.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.136659280431156F, 0.0F, 0.0F);
        this.rEar02 = new ModelPart(this, 78, 37);
        this.rEar02.mirror = true;
        this.rEar02.setPos(0.0F, 0.0F, 0.7F);
        this.rEar02.addBox(-1.2F, -4.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.22759093446006054F, 0.0F, 0.18203784098300857F);
        this.lLeg03 = new ModelPart(this, 38, 21);
        this.lLeg03.setPos(0.2F, 1.6F, 0.0F);
        this.lLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(lLeg03, -0.22759093446006054F, 0.0F, 0.0F);
        this.lForeHoof = new ModelPart(this, 49, 21);
        this.lForeHoof.setPos(0.1F, 4.6F, -0.3F);
        this.lForeHoof.addBox(-1.0F, 0.0F, -1.8F, 2, 2, 3, 0.0F);
        this.rArm01 = new ModelPart(this, 65, 0);
        this.rArm01.mirror = true;
        this.rArm01.setPos(-2.0F, -1.0F, -2.7F);
        this.rArm01.addBox(-3.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.setRotateAngle(rArm01, 0.091106186954104F, 0.0F, 0.136659280431156F);
        this.neck = new ModelPart(this, 0, 34);
        this.neck.setPos(0.0F, 0.4F, -5.0F);
        this.neck.addBox(-3.0F, -4.0F, -2.7F, 6, 8, 4, 0.0F);
        this.setRotateAngle(neck, -0.091106186954104F, 0.0F, 0.0F);
        this.snoot01 = new ModelPart(this, 84, 16);
        this.snoot01.setPos(0.0F, -1.1F, -4.4F);
        this.snoot01.addBox(-1.7F, -1.5F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(snoot01, 0.40980330836826856F, 0.0F, 0.0F);
        this.neck02 = new ModelPart(this, 0, 48);
        this.neck02.setPos(0.0F, 0.1F, -1.8F);
        this.neck02.addBox(-2.0F, -3.5F, -3.0F, 4, 7, 3, 0.0F);
        this.setRotateAngle(neck02, -0.136659280431156F, 0.0F, 0.0F);
        this.lLeg02 = new ModelPart(this, 41, 13);
        this.lLeg02.setPos(1.7F, 4.2F, -0.1F);
        this.lLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(lLeg02, 0.31869712141416456F, 0.0F, 0.091106186954104F);
        this.tail02 = new ModelPart(this, 30, 53);
        this.tail02.setPos(0.0F, 1.5F, 0.0F);
        this.tail02.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tail02, 0.18203784098300857F, 0.0F, 0.0F);
        this.rArm03 = new ModelPart(this, 65, 21);
        this.rArm03.mirror = true;
        this.rArm03.setPos(-0.2F, 1.5F, 0.0F);
        this.rArm03.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(rArm03, -0.091106186954104F, 0.0F, -0.136659280431156F);
        this.rLeg01 = new ModelPart(this, 38, 0);
        this.rLeg01.mirror = true;
        this.rLeg01.setPos(-1.5F, -1.2F, 4.2F);
        this.rLeg01.addBox(-3.5F, -1.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(rLeg01, -0.091106186954104F, 0.0F, 0.091106186954104F);
        this.rLeg02 = new ModelPart(this, 41, 13);
        this.rLeg02.mirror = true;
        this.rLeg02.setPos(-1.7F, 4.2F, -0.1F);
        this.rLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rLeg02, 0.31869712141416456F, 0.0F, -0.091106186954104F);
        this.tail06 = new ModelPart(this, 30, 53);
        this.tail06.setPos(0.0F, 0.7F, -0.1F);
        this.tail06.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tail06, 0.8196066167365371F, 0.0F, 0.0F);
        this.ass = new ModelPart(this, 0, 18);
        this.ass.setPos(0.0F, -1.0F, 4.9F);
        this.ass.addBox(-4.0F, -3.5F, 0.0F, 8, 8, 6, 0.0F);
        this.setRotateAngle(ass, -0.136659280431156F, 0.0F, 0.0F);
        this.tail07 = new ModelPart(this, 30, 53);
        this.tail07.setPos(0.0F, 0.7F, -0.1F);
        this.tail07.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tail07, 0.8196066167365371F, 0.0F, 0.0F);
        this.snoot = new ModelPart(this, 112, 16);
        this.snoot.setPos(0.0F, -0.4F, -3.7F);
        this.snoot.addBox(-1.5F, -1.5F, -0.8F, 3, 3, 1, 0.0F);
        this.setRotateAngle(snoot, -0.136659280431156F, 0.0F, 0.0F);
        this.lHindHoof = new ModelPart(this, 49, 21);
        this.lHindHoof.setPos(0.1F, 4.6F, -0.3F);
        this.lHindHoof.addBox(-1.0F, 0.0F, -1.8F, 2, 2, 3, 0.0F);
        this.setRotateAngle(lHindHoof, 0.136659280431156F, 0.0F, 0.0F);
        this.tail04 = new ModelPart(this, 30, 53);
        this.tail04.setPos(0.0F, 0.7F, -0.1F);
        this.tail04.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tail04, 0.8196066167365371F, 0.0F, 0.0F);
        this.rEar01 = new ModelPart(this, 69, 37);
        this.rEar01.mirror = true;
        this.rEar01.setPos(-1.1F, -3.0F, -1.7F);
        this.rEar01.addBox(-2.2F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
        this.setRotateAngle(rEar01, 0.4553564018453205F, 0.0F, -0.8196066167365371F);
        this.rArm02 = new ModelPart(this, 65, 13);
        this.rArm02.mirror = true;
        this.rArm02.setPos(-1.2F, 4.4F, 0.0F);
        this.rArm02.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
        this.tailFur = new ModelPart(this, 36, 53);
        this.tailFur.setPos(0.0F, 2.6F, -0.1F);
        this.tailFur.addBox(-1.1F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tailFur, 0.091106186954104F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 84, 0);
        this.head.setPos(0.0F, -0.3F, -1.2F);
        this.head.addBox(-2.5F, -3.5F, -5.0F, 5, 6, 5, 0.0F);
        this.setRotateAngle(head, 0.40980330836826856F, 0.0F, 0.0F);
        this.lArm02 = new ModelPart(this, 65, 13);
        this.lArm02.setPos(1.2F, 4.4F, 0.0F);
        this.lArm02.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
        this.tail01d = new ModelPart(this, 24, 53);
        this.tail01d.setPos(0.0F, 0.0F, 0.0F);
        this.tail01d.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.rLeg03 = new ModelPart(this, 38, 21);
        this.rLeg03.mirror = true;
        this.rLeg03.setPos(-0.2F, 1.6F, 0.0F);
        this.rLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(rLeg03, -0.22759093446006054F, 0.0F, 0.0F);
        this.tail01b = new ModelPart(this, 24, 53);
        this.tail01b.setPos(0.0F, 0.0F, 0.0F);
        this.tail01b.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.stomach = new ModelPart(this, 27, 30);
        this.stomach.setPos(0.0F, 0.5F, 3.1F);
        this.stomach.addBox(-4.5F, -4.6F, -3.0F, 9, 9, 9, 0.0F);
        this.lArm03 = new ModelPart(this, 65, 21);
        this.lArm03.setPos(0.2F, 1.5F, 0.0F);
        this.lArm03.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(lArm03, -0.091106186954104F, 0.0F, 0.136659280431156F);
        this.tail08 = new ModelPart(this, 30, 53);
        this.tail08.setPos(0.0F, 1.7F, -0.1F);
        this.tail08.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail08, 0.5918411493512771F, 0.0F, 0.0F);
        this.rForeHoof = new ModelPart(this, 49, 21);
        this.rForeHoof.mirror = true;
        this.rForeHoof.setPos(-0.1F, 4.6F, -0.3F);
        this.rForeHoof.addBox(-1.0F, 0.0F, -1.8F, 2, 2, 3, 0.0F);
        this.tail05 = new ModelPart(this, 30, 53);
        this.tail05.setPos(0.0F, 0.7F, -0.1F);
        this.tail05.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tail05, 0.8196066167365371F, 0.0F, 0.0F);
        this.lArm01 = new ModelPart(this, 65, 0);
        this.lArm01.setPos(2.0F, -1.0F, -2.7F);
        this.lArm01.addBox(0.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.setRotateAngle(lArm01, 0.091106186954104F, 0.0F, -0.136659280431156F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 13.2F, -3.7F);
        this.body.addBox(-4.0F, -4.0F, -6.0F, 8, 9, 7, 0.0F);
        this.upperJaw = new ModelPart(this, 84, 25);
        this.upperJaw.setPos(0.0F, 0.7F, -4.4F);
        this.upperJaw.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F);
        this.tail03 = new ModelPart(this, 30, 53);
        this.tail03.setPos(0.0F, 1.5F, 0.0F);
        this.tail03.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tail03, 0.8196066167365371F, 0.0F, 0.5462880558742251F);
        this.tail01c = new ModelPart(this, 24, 53);
        this.tail01c.setPos(0.0F, 0.0F, 0.0F);
        this.tail01c.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.lEar02 = new ModelPart(this, 78, 37);
        this.lEar02.setPos(0.0F, 0.0F, 0.7F);
        this.lEar02.addBox(-0.8F, -4.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.22759093446006054F, 0.0F, -0.18203784098300857F);
        this.lEar01 = new ModelPart(this, 69, 37);
        this.lEar01.setPos(1.1F, -3.0F, -1.7F);
        this.lEar01.addBox(-0.8F, -3.0F, -0.5F, 3, 3, 1, 0.0F);
        this.setRotateAngle(lEar01, 0.4553564018453205F, 0.0F, 0.8196066167365371F);
        this.tail01a = new ModelPart(this, 24, 53);
        this.tail01a.setPos(0.0F, -2.9F, 5.4F);
        this.tail01a.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tail01a, 1.4114477660878142F, 0.0F, 0.0F);
        this.rHindHoof = new ModelPart(this, 49, 21);
        this.rHindHoof.mirror = true;
        this.rHindHoof.setPos(-0.1F, 4.6F, -0.3F);
        this.rHindHoof.addBox(-1.0F, 0.0F, -1.8F, 2, 2, 3, 0.0F);
        this.setRotateAngle(rHindHoof, 0.136659280431156F, 0.0F, 0.0F);
        this.snoot02 = new ModelPart(this, 99, 16);
        this.snoot02.setPos(0.0F, 0.0F, 0.0F);
        this.snoot02.addBox(0.7F, -1.5F, -4.0F, 1, 2, 4, 0.0F);
        this.lLeg01 = new ModelPart(this, 38, 0);
        this.lLeg01.setPos(1.5F, -1.2F, 4.2F);
        this.lLeg01.addBox(-0.5F, -1.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(lLeg01, -0.091106186954104F, 0.0F, -0.091106186954104F);
        this.head.addChild(this.lowerJaw);
        this.rEar01.addChild(this.rEar02);
        this.lLeg02.addChild(this.lLeg03);
        this.lArm03.addChild(this.lForeHoof);
        this.body.addChild(this.rArm01);
        this.body.addChild(this.neck);
        this.head.addChild(this.snoot01);
        this.neck.addChild(this.neck02);
        this.lLeg01.addChild(this.lLeg02);
        this.tail01a.addChild(this.tail02);
        this.rArm02.addChild(this.rArm03);
        this.ass.addChild(this.rLeg01);
        this.rLeg01.addChild(this.rLeg02);
        this.tail05.addChild(this.tail06);
        this.stomach.addChild(this.ass);
        this.tail06.addChild(this.tail07);
        this.snoot01.addChild(this.snoot);
        this.lLeg03.addChild(this.lHindHoof);
        this.tail03.addChild(this.tail04);
        this.head.addChild(this.rEar01);
        this.rArm01.addChild(this.rArm02);
        this.tail08.addChild(this.tailFur);
        this.neck02.addChild(this.head);
        this.lArm01.addChild(this.lArm02);
        this.tail01a.addChild(this.tail01d);
        this.rLeg02.addChild(this.rLeg03);
        this.tail01a.addChild(this.tail01b);
        this.body.addChild(this.stomach);
        this.lArm02.addChild(this.lArm03);
        this.tail07.addChild(this.tail08);
        this.rArm03.addChild(this.rForeHoof);
        this.tail04.addChild(this.tail05);
        this.body.addChild(this.lArm01);
        this.head.addChild(this.upperJaw);
        this.tail02.addChild(this.tail03);
        this.tail01a.addChild(this.tail01c);
        this.lEar01.addChild(this.lEar02);
        this.head.addChild(this.lEar01);
        this.ass.addChild(this.tail01a);
        this.rLeg03.addChild(this.rHindHoof);
        this.snoot01.addChild(this.snoot02);
        this.ass.addChild(this.lLeg01);

    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = rad(headPitch);
        this.head.yRot = rad(netHeadYaw);
        lLeg01.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount - 0.091106186954104F;
        lArm01.xRot = Mth.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.091106186954104F;
        rLeg01.xRot = Mth.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount - 0.091106186954104F;
        rArm01.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.091106186954104F;
    }

}
