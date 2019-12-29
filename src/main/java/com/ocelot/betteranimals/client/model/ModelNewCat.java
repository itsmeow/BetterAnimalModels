package com.ocelot.betteranimals.client.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.util.math.MathHelper;

/**
 * catBA - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelNewCat<T extends LivingEntity> extends Model<T> {
    public RendererModel chest;
    public RendererModel stomach;
    public RendererModel neck;
    public RendererModel lArm01;
    public RendererModel rArm01;
    public RendererModel tail01;
    public RendererModel lLeg01;
    public RendererModel rLeg01;
    public RendererModel tail02;
    public RendererModel tail03;
    public RendererModel tail04a;
    public RendererModel tail04b;
    public RendererModel tail05a;
    public RendererModel tail05b;
    public RendererModel lLeg02;
    public RendererModel lLeg03;
    public RendererModel lHindPaw;
    public RendererModel rLeg02;
    public RendererModel rLeg03;
    public RendererModel rHindPaw;
    public RendererModel head;
    public RendererModel mane01;
    public RendererModel mane02;
    public RendererModel lEar01;
    public RendererModel rEar01;
    public RendererModel nose;
    public RendererModel mouthL;
    public RendererModel lowerJaw;
    public RendererModel lEar02;
    public RendererModel lEar03;
    public RendererModel rEar02;
    public RendererModel rEar03;
    public RendererModel mouthR;
    public RendererModel lArm02;
    public RendererModel lForePaw;
    public RendererModel rArm02;
    public RendererModel rForePaw;

    public ModelNewCat() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lArm02 = new RendererModel(this, 25, 39);
        this.lArm02.setRotationPoint(0.0F, 5.2F, 0.0F);
        this.lArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.rEar01 = new RendererModel(this, 0, 36);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-1.7F, -2.5F, -1.4F);
        this.rEar01.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
        this.tail02 = new RendererModel(this, 37, 0);
        this.tail02.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail02, 0.08726646259971647F, 0.0F, 0.0F);
        this.lLeg03 = new RendererModel(this, 38, 47);
        this.lLeg03.setRotationPoint(0.7F, -0.5F, 3.0F);
        this.lLeg03.addBox(-1.0F, -0.2F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.stomach = new RendererModel(this, 0, 13);
        this.stomach.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.stomach.addBox(-3.0F, -2.39F, -1.4F, 6, 5, 9, 0.0F);
        this.rArm01 = new RendererModel(this, 24, 29);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-2.4F, -0.4F, -3.7F);
        this.rArm01.addBox(-1.3F, -1.5F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(rArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.lLeg01 = new RendererModel(this, 37, 28);
        this.lLeg01.setRotationPoint(1.3F, -0.2F, 5.1F);
        this.lLeg01.addBox(-0.3F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, -0.03490658503988659F);
        this.tail05a = new RendererModel(this, 56, 2);
        this.tail05a.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail05a.addBox(-0.7F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(tail05a, 0.08726646259971647F, 0.0F, 0.0F);
        this.tail04b = new RendererModel(this, 48, 0);
        this.tail04b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail04b.addBox(-0.3F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.neck = new RendererModel(this, 0, 28);
        this.neck.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.neck.addBox(-2.0F, -1.5F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.mouthL = new RendererModel(this, 0, 55);
        this.mouthL.setRotationPoint(0.7F, 0.1F, -3.4F);
        this.mouthL.addBox(-1.2F, -0.6F, -1.9F, 2, 1, 2, 0.0F);
        this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.tail04a = new RendererModel(this, 48, 0);
        this.tail04a.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail04a.addBox(-0.7F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(tail04a, 0.08726646259971647F, 0.0F, 0.0F);
        this.rEar03 = new RendererModel(this, 8, 36);
        this.rEar03.mirror = true;
        this.rEar03.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.rEar03.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.mane01 = new RendererModel(this, 29, 11);
        this.mane01.setRotationPoint(0.0F, 2.1F, -2.1F);
        this.mane01.addBox(-1.5F, -0.5F, -0.8F, 3, 3, 1, 0.0F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.tail01 = new RendererModel(this, 26, 0);
        this.tail01.setRotationPoint(0.0F, -1.4F, 7.1F);
        this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail01, -0.593411945678072F, 0.0F, 0.0F);
        this.rEar02 = new RendererModel(this, 0, 40);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(0.0F, 0.3F, 0.7F);
        this.rEar02.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.tail05b = new RendererModel(this, 56, 2);
        this.tail05b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail05b.addBox(-0.3F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.rHindPaw = new RendererModel(this, 22, 46);
        this.rHindPaw.mirror = true;
        this.rHindPaw.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rHindPaw.addBox(-1.01F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.lEar03 = new RendererModel(this, 8, 36);
        this.lEar03.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.lEar03.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.rLeg01 = new RendererModel(this, 37, 28);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-1.3F, -0.2F, 5.1F);
        this.rLeg01.addBox(-2.7F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(rLeg01, -0.3141592653589793F, 0.0F, 0.03490658503988659F);
        this.tail03 = new RendererModel(this, 37, 0);
        this.tail03.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail03, 0.08726646259971647F, 0.0F, 0.0F);
        this.lArm01 = new RendererModel(this, 24, 29);
        this.lArm01.setRotationPoint(2.4F, -0.4F, -3.7F);
        this.lArm01.addBox(-1.7F, -1.5F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(lArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.lLeg02 = new RendererModel(this, 36, 39);
        this.lLeg02.setRotationPoint(0.5F, 3.7F, -1.0F);
        this.lLeg02.addBox(-0.2F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(lLeg02, -0.45378560551852565F, 0.0F, 0.03490658503988659F);
        this.mane02 = new RendererModel(this, 39, 11);
        this.mane02.setRotationPoint(0.0F, 2.1F, -1.0F);
        this.mane02.addBox(-2.0F, -0.5F, -0.8F, 4, 4, 1, 0.0F);
        this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
        this.rForePaw = new RendererModel(this, 22, 46);
        this.rForePaw.mirror = true;
        this.rForePaw.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.rForePaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.chest = new RendererModel(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 14.4F, -2.0F);
        this.chest.addBox(-3.0F, -2.5F, -5.7F, 6, 5, 7, 0.0F);
        this.lHindPaw = new RendererModel(this, 22, 46);
        this.lHindPaw.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.lHindPaw.addBox(-0.99F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.mouthR = new RendererModel(this, 0, 55);
        this.mouthR.mirror = true;
        this.mouthR.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.mouthR.addBox(-0.8F, -0.4F, -2.1F, 2, 1, 2, 0.0F);
        this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
        this.lEar01 = new RendererModel(this, 0, 36);
        this.lEar01.setRotationPoint(1.7F, -2.5F, -1.4F);
        this.lEar01.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
        this.lowerJaw = new RendererModel(this, 0, 59);
        this.lowerJaw.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.lowerJaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.head = new RendererModel(this, 0, 41);
        this.head.setRotationPoint(0.0F, 0.9F, -1.8F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.rLeg02 = new RendererModel(this, 36, 39);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-0.5F, 3.7F, -1.0F);
        this.rLeg02.addBox(-1.8F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(rLeg02, -0.45378560551852565F, 0.0F, -0.03490658503988659F);
        this.lForePaw = new RendererModel(this, 22, 46);
        this.lForePaw.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.lForePaw.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F);
        this.rArm02 = new RendererModel(this, 25, 39);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(0.0F, 5.2F, 0.0F);
        this.rArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.lEar02 = new RendererModel(this, 0, 40);
        this.lEar02.setRotationPoint(0.0F, 0.3F, 0.7F);
        this.lEar02.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.nose = new RendererModel(this, 0, 51);
        this.nose.setRotationPoint(0.0F, -0.4F, -3.2F);
        this.nose.addBox(-1.0F, -1.0F, -2.05F, 2, 1, 2, 0.0F);
        this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
        this.rLeg03 = new RendererModel(this, 38, 47);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(-0.7F, -0.5F, 3.0F);
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
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chest.render(f5);
    }

    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
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
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.tail01.rotateAngleX = 0.47123894F * MathHelper.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
        this.lLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
        this.rLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount - 0.3141592653589793F;
        this.lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
        this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount + 0.12217304763960307F;
        if(entity instanceof OcelotEntity) {
            OcelotEntity ocelot = (OcelotEntity) entity;
            if(ocelot.isSneaking()) {
                this.lArm01.offsetY = -0.1F;
                this.rArm01.offsetY = -0.1F;
                this.lLeg01.offsetY = -0.1F;
                this.rLeg01.offsetY = -0.1F;
                this.chest.offsetY = 0.1F;
            } else {
                this.lArm01.offsetY = 0F;
                this.rArm01.offsetY = 0F;
                this.lLeg01.offsetY = 0F;
                this.rLeg01.offsetY = 0F;
                this.chest.offsetY = 0F;
                if(ocelot.isSprinting()) {
                    this.lLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.rotateAngleX = ((float) Math.PI / 10F) * MathHelper.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else {
                    this.tail01.rotateAngleX = ((float) Math.PI / 4F) * MathHelper.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
        if(entity instanceof CatEntity) {
            CatEntity cat = (CatEntity) entity;
            if(cat.isSneaking()) {
                this.lArm01.offsetY = -0.1F;
                this.rArm01.offsetY = -0.1F;
                this.lLeg01.offsetY = -0.1F;
                this.rLeg01.offsetY = -0.1F;
                this.chest.offsetY = 0.1F;
            } else {
                this.lArm01.offsetY = 0F;
                this.rArm01.offsetY = 0F;
                this.lLeg01.offsetY = 0F;
                this.rLeg01.offsetY = 0F;
                this.chest.offsetY = 0F;
                if(cat.isSprinting()) {
                    this.lLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.rotateAngleX = ((float) Math.PI / 10F) * MathHelper.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else if(cat.isSitting()) {
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
                    this.tail01.rotateAngleX = ((float) Math.PI / 4F) * MathHelper.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}
