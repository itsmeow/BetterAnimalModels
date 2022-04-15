package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Ocelot;

/**
 * catBA - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelNewCat<T extends LivingEntity> extends Model<T> {
    public ModelPart chest;
    public ModelPart stomach;
    public ModelPart neck;
    public ModelPart lArm01;
    public ModelPart rArm01;
    public ModelPart tail01;
    public ModelPart lLeg01;
    public ModelPart rLeg01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04a;
    public ModelPart tail04b;
    public ModelPart tail05a;
    public ModelPart tail05b;
    public ModelPart lLeg02;
    public ModelPart lLeg03;
    public ModelPart lHindPaw;
    public ModelPart rLeg02;
    public ModelPart rLeg03;
    public ModelPart rHindPaw;
    public ModelPart head;
    public ModelPart mane01;
    public ModelPart mane02;
    public ModelPart lEar01;
    public ModelPart rEar01;
    public ModelPart nose;
    public ModelPart mouthL;
    public ModelPart lowerJaw;
    public ModelPart lEar02;
    public ModelPart lEar03;
    public ModelPart rEar02;
    public ModelPart rEar03;
    public ModelPart mouthR;
    public ModelPart lArm02;
    public ModelPart lForePaw;
    public ModelPart rArm02;
    public ModelPart rForePaw;

    public ModelNewCat() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.lArm02 = new ModelPart(this, 25, 39);
        this.lArm02.setPos(0.0F, 5.2F, 0.0F);
        this.lArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.rEar01 = new ModelPart(this, 0, 36);
        this.rEar01.mirror = true;
        this.rEar01.setPos(-1.7F, -2.5F, -1.4F);
        this.rEar01.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
        this.tail02 = new ModelPart(this, 37, 0);
        this.tail02.setPos(0.0F, 0.0F, 2.8F);
        this.tail02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail02, 0.08726646259971647F, 0.0F, 0.0F);
        this.lLeg03 = new ModelPart(this, 38, 47);
        this.lLeg03.setPos(0.7F, -0.5F, 3.0F);
        this.lLeg03.addBox(-1.0F, -0.2F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.stomach = new ModelPart(this, 0, 13);
        this.stomach.setPos(0.0F, 0.0F, 1.7F);
        this.stomach.addBox(-3.0F, -2.39F, -1.4F, 6, 5, 9, 0.0F);
        this.rArm01 = new ModelPart(this, 24, 29);
        this.rArm01.mirror = true;
        this.rArm01.setPos(-2.4F, -0.4F, -3.7F);
        this.rArm01.addBox(-1.3F, -1.5F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(rArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.lLeg01 = new ModelPart(this, 37, 28);
        this.lLeg01.setPos(1.3F, -0.2F, 5.1F);
        this.lLeg01.addBox(-0.3F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, -0.03490658503988659F);
        this.tail05a = new ModelPart(this, 56, 2);
        this.tail05a.setPos(0.0F, 0.0F, 2.8F);
        this.tail05a.addBox(-0.7F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(tail05a, 0.08726646259971647F, 0.0F, 0.0F);
        this.tail04b = new ModelPart(this, 48, 0);
        this.tail04b.setPos(0.0F, 0.0F, 0.0F);
        this.tail04b.addBox(-0.3F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.neck = new ModelPart(this, 0, 28);
        this.neck.setPos(0.0F, -0.5F, -4.5F);
        this.neck.addBox(-2.0F, -1.5F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.mouthL = new ModelPart(this, 0, 55);
        this.mouthL.setPos(0.7F, 0.1F, -3.4F);
        this.mouthL.addBox(-1.2F, -0.6F, -1.9F, 2, 1, 2, 0.0F);
        this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.tail04a = new ModelPart(this, 48, 0);
        this.tail04a.setPos(0.0F, 0.0F, 2.8F);
        this.tail04a.addBox(-0.7F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(tail04a, 0.08726646259971647F, 0.0F, 0.0F);
        this.rEar03 = new ModelPart(this, 8, 36);
        this.rEar03.mirror = true;
        this.rEar03.setPos(0.0F, -1.3F, 0.0F);
        this.rEar03.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.mane01 = new ModelPart(this, 29, 11);
        this.mane01.setPos(0.0F, 2.1F, -2.1F);
        this.mane01.addBox(-1.5F, -0.5F, -0.8F, 3, 3, 1, 0.0F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.tail01 = new ModelPart(this, 26, 0);
        this.tail01.setPos(0.0F, -1.4F, 7.1F);
        this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail01, -0.593411945678072F, 0.0F, 0.0F);
        this.rEar02 = new ModelPart(this, 0, 40);
        this.rEar02.mirror = true;
        this.rEar02.setPos(0.0F, 0.3F, 0.7F);
        this.rEar02.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.tail05b = new ModelPart(this, 56, 2);
        this.tail05b.setPos(0.0F, 0.0F, 0.0F);
        this.tail05b.addBox(-0.3F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.rHindPaw = new ModelPart(this, 22, 46);
        this.rHindPaw.mirror = true;
        this.rHindPaw.setPos(0.0F, 4.0F, 0.0F);
        this.rHindPaw.addBox(-1.01F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.lEar03 = new ModelPart(this, 8, 36);
        this.lEar03.setPos(0.0F, -1.3F, 0.0F);
        this.lEar03.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.rLeg01 = new ModelPart(this, 37, 28);
        this.rLeg01.mirror = true;
        this.rLeg01.setPos(-1.3F, -0.2F, 5.1F);
        this.rLeg01.addBox(-2.7F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(rLeg01, -0.3141592653589793F, 0.0F, 0.03490658503988659F);
        this.tail03 = new ModelPart(this, 37, 0);
        this.tail03.setPos(0.0F, 0.0F, 2.8F);
        this.tail03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail03, 0.08726646259971647F, 0.0F, 0.0F);
        this.lArm01 = new ModelPart(this, 24, 29);
        this.lArm01.setPos(2.4F, -0.4F, -3.7F);
        this.lArm01.addBox(-1.7F, -1.5F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(lArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.lLeg02 = new ModelPart(this, 36, 39);
        this.lLeg02.setPos(0.5F, 3.7F, -1.0F);
        this.lLeg02.addBox(-0.2F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(lLeg02, -0.45378560551852565F, 0.0F, 0.03490658503988659F);
        this.mane02 = new ModelPart(this, 39, 11);
        this.mane02.setPos(0.0F, 2.1F, -1.0F);
        this.mane02.addBox(-2.0F, -0.5F, -0.8F, 4, 4, 1, 0.0F);
        this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
        this.rForePaw = new ModelPart(this, 22, 46);
        this.rForePaw.mirror = true;
        this.rForePaw.setPos(0.0F, 3.9F, 0.0F);
        this.rForePaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.chest = new ModelPart(this, 0, 0);
        this.chest.setPos(0.0F, 14.4F, -2.0F);
        this.chest.addBox(-3.0F, -2.5F, -5.7F, 6, 5, 7, 0.0F);
        this.lHindPaw = new ModelPart(this, 22, 46);
        this.lHindPaw.setPos(0.0F, 4.0F, 0.0F);
        this.lHindPaw.addBox(-0.99F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.mouthR = new ModelPart(this, 0, 55);
        this.mouthR.mirror = true;
        this.mouthR.setPos(-1.4F, 0.0F, 0.0F);
        this.mouthR.addBox(-0.8F, -0.4F, -2.1F, 2, 1, 2, 0.0F);
        this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
        this.lEar01 = new ModelPart(this, 0, 36);
        this.lEar01.setPos(1.7F, -2.5F, -1.4F);
        this.lEar01.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
        this.lowerJaw = new ModelPart(this, 0, 59);
        this.lowerJaw.setPos(0.0F, 0.0F, -3.2F);
        this.lowerJaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.head = new ModelPart(this, 0, 41);
        this.head.setPos(0.0F, 0.9F, -1.8F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.rLeg02 = new ModelPart(this, 36, 39);
        this.rLeg02.mirror = true;
        this.rLeg02.setPos(-0.5F, 3.7F, -1.0F);
        this.rLeg02.addBox(-1.8F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(rLeg02, -0.45378560551852565F, 0.0F, -0.03490658503988659F);
        this.lForePaw = new ModelPart(this, 22, 46);
        this.lForePaw.setPos(0.0F, 3.9F, 0.0F);
        this.lForePaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.rArm02 = new ModelPart(this, 25, 39);
        this.rArm02.mirror = true;
        this.rArm02.setPos(0.0F, 5.2F, 0.0F);
        this.rArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.lEar02 = new ModelPart(this, 0, 40);
        this.lEar02.setPos(0.0F, 0.3F, 0.7F);
        this.lEar02.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.nose = new ModelPart(this, 0, 51);
        this.nose.setPos(0.0F, -0.4F, -3.2F);
        this.nose.addBox(-1.0F, -1.0F, -2.05F, 2, 1, 2, 0.0F);
        this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
        this.rLeg03 = new ModelPart(this, 38, 47);
        this.rLeg03.mirror = true;
        this.rLeg03.setPos(-0.7F, -0.5F, 3.0F);
        this.rLeg03.addBox(-1.0F, -0.2F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.lArm01.addChild(this.lArm02);
        this.head.addChild(this.rEar01);
        this.tail01.addChild(this.tail02);
        this.lLeg02.addChild(this.lLeg03);
        this.chest.addChild(this.stomach);
        this.chest.addChild(this.rArm01);
        this.stomach.addChild(this.lLeg01);
        this.tail04a.addChild(this.tail05a);
        this.tail04a.addChild(this.tail04b);
        this.chest.addChild(this.neck);
        this.head.addChild(this.mouthL);
        this.tail03.addChild(this.tail04a);
        this.rEar01.addChild(this.rEar03);
        this.neck.addChild(this.mane01);
        this.stomach.addChild(this.tail01);
        this.rEar01.addChild(this.rEar02);
        this.tail05a.addChild(this.tail05b);
        this.rLeg03.addChild(this.rHindPaw);
        this.lEar01.addChild(this.lEar03);
        this.stomach.addChild(this.rLeg01);
        this.tail02.addChild(this.tail03);
        this.chest.addChild(this.lArm01);
        this.lLeg01.addChild(this.lLeg02);
        this.neck.addChild(this.mane02);
        this.rArm02.addChild(this.rForePaw);
        this.lLeg03.addChild(this.lHindPaw);
        this.mouthL.addChild(this.mouthR);
        this.head.addChild(this.lEar01);
        this.head.addChild(this.lowerJaw);
        this.neck.addChild(this.head);
        this.rLeg01.addChild(this.rLeg02);
        this.lArm02.addChild(this.lForePaw);
        this.rArm01.addChild(this.rArm02);
        this.lEar01.addChild(this.lEar02);
        this.head.addChild(this.nose);
        this.rLeg02.addChild(this.rLeg03);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
        this.setRotateAngle(tail02, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.setRotateAngle(rArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, -0.03490658503988659F);
        this.setRotateAngle(tail05a, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.setRotateAngle(tail04a, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.setRotateAngle(tail01, -0.593411945678072F, 0.0F, 0.0F);
        this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.setRotateAngle(rHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.setRotateAngle(rLeg01, -0.3141592653589793F, 0.0F, 0.03490658503988659F);
        this.setRotateAngle(tail03, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(lArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg02, -0.45378560551852565F, 0.0F, 0.03490658503988659F);
        this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
        this.setRotateAngle(lHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
        this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(rLeg02, -0.45378560551852565F, 0.0F, -0.03490658503988659F);
        this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
        this.setRotateAngle(rLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0F, 0F, 0F);
        this.setRotateAngle(stomach, 0F, 0F, 0F);
        this.head.xRot = rad(headPitch);
        this.head.yRot = rad(netHeadYaw);
        this.tail01.xRot = 0.47123894F * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
        this.lLeg01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
        this.rLeg01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount - 0.3141592653589793F;
        this.lArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
        this.rArm01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount + 0.12217304763960307F;
        if(entity instanceof Ocelot) {
            Ocelot ocelot = (Ocelot) entity;
            if(ocelot.isShiftKeyDown()) {
                this.lArm01.y = -0.4F - 1F;
                this.rArm01.y = -0.4F - 1F;
                this.lLeg01.y = -0.2F - 1F;
                this.rLeg01.y = -0.2F - 1F;
                this.chest.y = 14.4F + 1F;
            } else {
                this.lArm01.y = -0.4F;
                this.rArm01.y = -0.4F;
                this.lLeg01.y = -0.2F;
                this.rLeg01.y = -0.2F;
                this.chest.y = 14.4F;
                if(ocelot.isSprinting()) {
                    this.lLeg01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.xRot = Mth.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.xRot = ((float) Math.PI / 10F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else {
                    this.tail01.xRot = ((float) Math.PI / 4F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
        if(entity instanceof Cat) {
            Cat cat = (Cat) entity;
            if(cat.isShiftKeyDown()) {
                this.lArm01.y = -0.4F - 1F;
                this.rArm01.y = -0.4F - 1F;
                this.lLeg01.y = -0.2F - 1F;
                this.rLeg01.y = -0.2F - 1F;
                this.chest.y = 14.4F + 1F;
            } else {
                this.lArm01.y = -0.4F;
                this.rArm01.y = -0.4F;
                this.lLeg01.y = -0.2F;
                this.rLeg01.y = -0.2F;
                this.chest.y = 14.4F;
                if(cat.isSprinting()) {
                    this.lLeg01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.xRot = Mth.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.xRot = ((float) Math.PI / 10F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else if(cat.isLying()) { // laying down
                    this.setRotateAngle(head, 0.7853981633974483F, 0.0F, 0.0F);
                    this.setRotateAngle(lArm01, -0.9599310885968813F, -0.20943951023931953F, 0.0F);
                    this.setRotateAngle(lArm02, -0.6457718232379019F, 0.0F, 0.0F);
                    this.setRotateAngle(lForePaw, 1.6231562043547265F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, 0.6981317007977318F);
                    this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, -0.5235987755982988F);
                    this.setRotateAngle(neck, -0.7853981633974483F, 0.0F, 0.0F);
                    this.setRotateAngle(rArm01, -0.9599310885968813F, 0.20943951023931953F, 0.0F);
                    this.setRotateAngle(rArm02, -0.6457718232379019F, 0.0F, 0.0F);
                    this.setRotateAngle(rForePaw, 1.5707963267948966F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg01, -0.6981317007977318F, 0.0F, 0.03490658503988659F);
                    this.setRotateAngle(stomach, 0.0F, 0.0F, -1.5707963267948966F);
                    this.setRotateAngle(tail01, -0.593411945678072F, -0.4886921905584123F, 0.0F);
                    this.setRotateAngle(tail02, -0.08726646259971647F, 0.0F, 0.0F);
                    this.setRotateAngle(tail03, -0.17453292519943295F, 0.22689280275926282F, 0.0F);
                    this.setRotateAngle(tail04a, -0.3490658503988659F, 0.12217304763960307F, 0.3141592653589793F);
                    this.setRotateAngle(tail05a, -0.3490658503988659F, 0.0F, 0.0F);
                } else if(cat.isInSittingPose()) { // not actually sleeping, MCP is on crack. it's sitting
                    this.setRotateAngle(tail02, 0.0F, 0.6981317007977318F, 0.0F);
                    this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
                    this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
                    this.setRotateAngle(tail05a, 0.0F, 0.2617993877991494F, 0.0F);
                    this.setRotateAngle(rLeg03, -0.03490658503988659F, 0.0F, 0.0F);
                    this.setRotateAngle(rHindPaw, 1.3613568165555772F, 0.0F, 0.0F);
                    this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
                    this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
                    this.setRotateAngle(rForePaw, 0.06981317007977318F, 0.0F, 0.0F);
                    this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
                    this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
                    this.setRotateAngle(head, 0.41887902047863906F, 0.0F, 0.0F);
                    this.setRotateAngle(lForePaw, 0.06981317007977318F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg01, -0.5759586531581287F, 0.0F, 0.22689280275926282F);
                    this.setRotateAngle(tail01, 1.0821041362364843F, 0.6981317007977318F, 0.7853981633974483F);
                    this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
                    this.setRotateAngle(neck, 0.17453292519943295F, 0.0F, 0.0F);
                    this.setRotateAngle(lArm01, 0.6283185307179586F, 0.0F, 0.0F);
                    this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
                    this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg02, 0.22689280275926282F, 0.0F, 0.03490658503988659F);
                    this.setRotateAngle(chest, -0.5759586531581287F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg02, 0.22689280275926282F, 0.0F, -0.03490658503988659F);
                    this.setRotateAngle(lLeg01, -0.5759586531581287F, 0.0F, -0.22689280275926282F);
                    this.setRotateAngle(tail04a, -0.045553093477052F, 0.5235987755982988F, 0.0F);
                    this.setRotateAngle(rArm01, 0.6283185307179586F, 0.0F, 0.0F);
                    this.setRotateAngle(lHindPaw, 1.3613568165555772F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg03, -0.03490658503988659F, 0.0F, 0.0F);
                    this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
                    this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
                    this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
                    this.setRotateAngle(stomach, -0.4886921905584123F, 0.0F, 0.0F);
                    this.setRotateAngle(tail03, -0.3490658503988659F, 0.6806784082777886F, 0.0F);
                    this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
                } else {
                    this.tail01.xRot = ((float) Math.PI / 4F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
    }

}
