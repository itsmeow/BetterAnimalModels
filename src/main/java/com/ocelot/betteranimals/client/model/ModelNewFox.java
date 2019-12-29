package com.ocelot.betteranimals.client.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.util.math.MathHelper;

/**
 * fox2 - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelNewFox<T extends LivingEntity> extends Model<T> {
    public RendererModel body;
    public RendererModel rear;
    public RendererModel lArm01;
    public RendererModel rArm01;
    public RendererModel neck;
    public RendererModel lHindLeg01;
    public RendererModel rHindLeg01;
    public RendererModel tail01;
    public RendererModel lHindLeg02;
    public RendererModel lHindLeg03;
    public RendererModel lHindpaw;
    public RendererModel rHindLeg02;
    public RendererModel rHindLeg03;
    public RendererModel rHindpaw;
    public RendererModel tail02a;
    public RendererModel tail02b;
    public RendererModel tail02c;
    public RendererModel tail02d;
    public RendererModel tail03;
    public RendererModel tail04;
    public RendererModel tail05;
    public RendererModel lArm01_1;
    public RendererModel lForepaw;
    public RendererModel rArm01_1;
    public RendererModel rForepaw;
    public RendererModel head;
    public RendererModel fur01;
    public RendererModel fur02;
    public RendererModel snoot;
    public RendererModel lowerJaw;
    public RendererModel upperJawL;
    public RendererModel lEar01;
    public RendererModel rEar01;
    public RendererModel lCheekFur01;
    public RendererModel rCheekFur01;
    public RendererModel upperJawR;
    public RendererModel lEar02;
    public RendererModel lEar03;
    public RendererModel lEar04;
    public RendererModel rEar02;
    public RendererModel rEar03;
    public RendererModel rEar04;
    private float rotation;

    public ModelNewFox() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new RendererModel(this, 0, 2);
        this.body.setRotationPoint(0.0F, 14.1F, -1.7F);
        this.body.addBox(-3.0F, -3.0F, -5.0F, 6, 5, 8, 0.0F);
        this.lHindLeg02 = new RendererModel(this, 32, 12);
        this.lHindLeg02.setRotationPoint(1.4F, 2.6F, -0.6F);
        this.lHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(lHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
        this.rCheekFur01 = new RendererModel(this, 0, 0);
        this.rCheekFur01.mirror = true;
        this.rCheekFur01.setRotationPoint(-1.9F, -0.5F, -1.4F);
        this.rCheekFur01.addBox(-2.9F, -1.0F, 0.0F, 3, 4, 0, 0.0F);
        this.setRotateAngle(rCheekFur01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
        this.tail02b = new RendererModel(this, 0, 45);
        this.tail02b.mirror = true;
        this.tail02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02b.addBox(-1.7F, -1.7F, 0.0F, 2, 2, 3, 0.0F);
        this.fur02 = new RendererModel(this, 46, 27);
        this.fur02.setRotationPoint(0.0F, 0.5F, -0.5F);
        this.fur02.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(fur02, -0.7740535232594852F, 0.0F, 0.0F);
        this.lForepaw = new RendererModel(this, 32, 28);
        this.lForepaw.setRotationPoint(-0.0F, 6.5F, 0.0F);
        this.lForepaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
        this.lowerJaw = new RendererModel(this, 23, 48);
        this.lowerJaw.setRotationPoint(0.0F, 1.5F, -3.7F);
        this.lowerJaw.addBox(-1.0F, -0.6F, -2.6F, 2, 1, 3, 0.0F);
        this.rear = new RendererModel(this, 0, 17);
        this.rear.setRotationPoint(0.0F, -0.4F, 2.8F);
        this.rear.addBox(-2.5F, -2.5F, -0.3F, 5, 4, 6, 0.0F);
        this.setRotateAngle(rear, -0.08726646259971647F, 0.0F, 0.0F);
        this.neck = new RendererModel(this, 0, 30);
        this.neck.setRotationPoint(0.0F, -0.9F, -4.0F);
        this.neck.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.lHindpaw = new RendererModel(this, 32, 28);
        this.lHindpaw.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.lHindpaw.addBox(-1.5F, -0.5F, -2.3F, 3, 2, 3, 0.0F);
        this.tail02a = new RendererModel(this, 0, 45);
        this.tail02a.setRotationPoint(0.0F, -0.1F, 1.6F);
        this.tail02a.addBox(-0.3F, -1.7F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail02a, -0.17453292519943295F, 0.0F, 0.0F);
        this.rEar01 = new RendererModel(this, 21, 0);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-1.6F, -1.4F, -1.5F);
        this.rEar01.addBox(-1.0F, -1.9F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
        this.fur01 = new RendererModel(this, 47, 20);
        this.fur01.setRotationPoint(0.0F, 0.7F, -1.5F);
        this.fur01.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(fur01, -0.8651597102135892F, 0.0F, 0.0F);
        this.snoot = new RendererModel(this, 23, 43);
        this.snoot.setRotationPoint(0.0F, 0.7F, -4.0F);
        this.snoot.addBox(-1.0F, -1.0F, -2.4F, 2, 1, 3, 0.0F);
        this.setRotateAngle(snoot, 0.22759093446006054F, 0.0F, 0.0F);
        this.lHindLeg01 = new RendererModel(this, 31, 1);
        this.lHindLeg01.setRotationPoint(1.0F, 0.2F, 3.4F);
        this.lHindLeg01.addBox(0.0F, -2.1F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(lHindLeg01, -0.17453292519943295F, 0.0F, 0.0F);
        this.rForepaw = new RendererModel(this, 32, 28);
        this.rForepaw.mirror = true;
        this.rForepaw.setRotationPoint(-0.0F, 6.5F, 0.0F);
        this.rForepaw.addBox(-1.5F, -0.9F, -2.3F, 3, 2, 3, 0.0F);
        this.lEar01 = new RendererModel(this, 21, 0);
        this.lEar01.setRotationPoint(1.6F, -1.4F, -1.5F);
        this.lEar01.addBox(-1.0F, -1.9F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
        this.tail02d = new RendererModel(this, 0, 45);
        this.tail02d.mirror = true;
        this.tail02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02d.addBox(-1.69F, -0.3F, 0.0F, 2, 2, 3, 0.0F);
        this.tail05 = new RendererModel(this, 36, 53);
        this.tail05.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail05.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail05, 0.03490658503988659F, 0.0F, 0.0F);
        this.lArm01 = new RendererModel(this, 48, 0);
        this.lArm01.setRotationPoint(1.9F, 0.1F, -2.5F);
        this.lArm01.addBox(-1.0F, -2.4F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(lArm01, 0.22689280275926282F, 0.0F, -0.08726646259971647F);
        this.lHindLeg03 = new RendererModel(this, 34, 19);
        this.lHindLeg03.setRotationPoint(0.1F, 2.4F, 0.2F);
        this.lHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(lHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
        this.rHindpaw = new RendererModel(this, 32, 28);
        this.rHindpaw.mirror = true;
        this.rHindpaw.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.rHindpaw.addBox(-1.5F, -0.5F, -2.3F, 3, 2, 3, 0.0F);
        this.upperJawL = new RendererModel(this, 34, 43);
        this.upperJawL.setRotationPoint(0.4F, 0.9F, -3.9F);
        this.upperJawL.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(upperJawL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.rArm01_1 = new RendererModel(this, 51, 10);
        this.rArm01_1.mirror = true;
        this.rArm01_1.setRotationPoint(-0.8F, 3.1F, 0.1F);
        this.rArm01_1.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rArm01_1, -0.22689280275926282F, 0.0F, -0.08726646259971647F);
        this.lEar02 = new RendererModel(this, 21, 5);
        this.lEar02.setRotationPoint(0.5F, -1.7F, 0.0F);
        this.lEar02.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.0F, 0.0F, -0.40980330836826856F);
        this.lEar04 = new RendererModel(this, 21, 5);
        this.lEar04.mirror = true;
        this.lEar04.setRotationPoint(-0.5F, -1.7F, 0.0F);
        this.lEar04.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lEar04, 0.0F, 0.0F, 0.40980330836826856F);
        this.rHindLeg02 = new RendererModel(this, 32, 12);
        this.rHindLeg02.mirror = true;
        this.rHindLeg02.setRotationPoint(-1.4F, 2.6F, -0.7F);
        this.rHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(rHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
        this.tail04 = new RendererModel(this, 21, 53);
        this.tail04.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.tail04.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(tail04, 0.12217304763960307F, 0.0F, 0.0F);
        this.rArm01 = new RendererModel(this, 48, 0);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-1.9F, 0.1F, -2.5F);
        this.rArm01.addBox(-2.0F, -2.4F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(rArm01, 0.22689280275926282F, 0.0F, 0.08726646259971647F);
        this.lCheekFur01 = new RendererModel(this, 0, 0);
        this.lCheekFur01.setRotationPoint(1.9F, -0.5F, -1.4F);
        this.lCheekFur01.addBox(-0.1F, -1.0F, -0.0F, 3, 4, 0, 0.0F);
        this.setRotateAngle(lCheekFur01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
        this.lEar03 = new RendererModel(this, 29, 0);
        this.lEar03.setRotationPoint(0.0F, 0.5F, 0.8F);
        this.lEar03.addBox(-0.5F, -3.7F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lEar03, 0.22689280275926282F, 0.0F, 0.0F);
        this.rHindLeg01 = new RendererModel(this, 31, 1);
        this.rHindLeg01.mirror = true;
        this.rHindLeg01.setRotationPoint(-1.0F, 0.2F, 3.4F);
        this.rHindLeg01.addBox(-3.0F, -2.1F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(rHindLeg01, -0.17453292519943295F, 0.0F, 0.0F);
        this.rEar03 = new RendererModel(this, 29, 0);
        this.rEar03.mirror = true;
        this.rEar03.setRotationPoint(0.0F, 0.5F, 0.8F);
        this.rEar03.addBox(-0.5F, -3.7F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rEar03, 0.22689280275926282F, 0.0F, 0.0F);
        this.tail02c = new RendererModel(this, 0, 45);
        this.tail02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02c.addBox(-0.31F, -0.3F, 0.0F, 2, 2, 3, 0.0F);
        this.head = new RendererModel(this, 17, 34);
        this.head.setRotationPoint(0.0F, -0.5F, -1.9F);
        this.head.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.rEar02 = new RendererModel(this, 21, 5);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(-0.5F, -1.7F, 0.0F);
        this.rEar02.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.0F, 0.0F, 0.40980330836826856F);
        this.lArm01_1 = new RendererModel(this, 51, 10);
        this.lArm01_1.setRotationPoint(0.8F, 3.1F, 0.1F);
        this.lArm01_1.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(lArm01_1, -0.22689280275926282F, 0.0F, 0.08726646259971647F);
        this.tail03 = new RendererModel(this, 0, 51);
        this.tail03.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.tail03.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(tail03, 0.12217304763960307F, 0.0F, 0.0F);
        this.upperJawR = new RendererModel(this, 34, 43);
        this.upperJawR.mirror = true;
        this.upperJawR.setRotationPoint(-0.4F, 0.9F, -3.9F);
        this.upperJawR.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(upperJawR, 0.0F, -0.13962634015954636F, -0.08726646259971647F);
        this.tail01 = new RendererModel(this, 0, 39);
        this.tail01.setRotationPoint(0.0F, -1.1F, 4.8F);
        this.tail01.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(tail01, -0.6806784082777886F, 0.0F, 0.0F);
        this.rHindLeg03 = new RendererModel(this, 34, 19);
        this.rHindLeg03.mirror = true;
        this.rHindLeg03.setRotationPoint(-0.1F, 2.4F, 0.2F);
        this.rHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
        this.rEar04 = new RendererModel(this, 21, 5);
        this.rEar04.setRotationPoint(0.5F, -1.7F, 0.0F);
        this.rEar04.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rEar04, 0.0F, 0.0F, -0.40980330836826856F);
        this.lHindLeg01.addChild(this.lHindLeg02);
        this.head.addChild(this.rCheekFur01);
        this.tail02a.addChild(this.tail02b);
        this.neck.addChild(this.fur02);
        this.lArm01_1.addChild(this.lForepaw);
        this.head.addChild(this.lowerJaw);
        this.body.addChild(this.rear);
        this.body.addChild(this.neck);
        this.lHindLeg03.addChild(this.lHindpaw);
        this.tail01.addChild(this.tail02a);
        this.head.addChild(this.rEar01);
        this.neck.addChild(this.fur01);
        this.head.addChild(this.snoot);
        this.rear.addChild(this.lHindLeg01);
        this.rArm01_1.addChild(this.rForepaw);
        this.head.addChild(this.lEar01);
        this.tail02a.addChild(this.tail02d);
        this.tail04.addChild(this.tail05);
        this.body.addChild(this.lArm01);
        this.lHindLeg02.addChild(this.lHindLeg03);
        this.rHindLeg03.addChild(this.rHindpaw);
        this.head.addChild(this.upperJawL);
        this.rArm01.addChild(this.rArm01_1);
        this.lEar01.addChild(this.lEar02);
        this.lEar01.addChild(this.lEar04);
        this.rHindLeg01.addChild(this.rHindLeg02);
        this.tail03.addChild(this.tail04);
        this.body.addChild(this.rArm01);
        this.head.addChild(this.lCheekFur01);
        this.lEar01.addChild(this.lEar03);
        this.rear.addChild(this.rHindLeg01);
        this.rEar01.addChild(this.rEar03);
        this.tail02a.addChild(this.tail02c);
        this.neck.addChild(this.head);
        this.rEar01.addChild(this.rEar02);
        this.lArm01.addChild(this.lArm01_1);
        this.tail02a.addChild(this.tail03);
        this.head.addChild(this.upperJawR);
        this.rear.addChild(this.tail01);
        this.rHindLeg02.addChild(this.rHindLeg03);
        this.rEar01.addChild(this.rEar04);
    }

    @Override
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        this.setRotateAngle(lHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
        this.setRotateAngle(rCheekFur01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
        this.setRotateAngle(fur02, -0.7740535232594852F, 0.0F, 0.0F);
        this.setRotateAngle(rear, -0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(tail02a, -0.17453292519943295F, 0.0F, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
        this.setRotateAngle(fur01, -0.8651597102135892F, 0.0F, 0.0F);
        this.setRotateAngle(snoot, 0.22759093446006054F, 0.0F, 0.0F);
        this.setRotateAngle(lHindLeg01, -0.17453292519943295F, 0.0F, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
        this.setRotateAngle(tail05, 0.03490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(lArm01, 0.22689280275926282F, 0.0F, -0.08726646259971647F);
        this.setRotateAngle(lHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.setRotateAngle(rArm01_1, -0.22689280275926282F, 0.0F, -0.08726646259971647F);
        this.setRotateAngle(lEar02, 0.0F, 0.0F, -0.40980330836826856F);
        this.setRotateAngle(lEar04, 0.0F, 0.0F, 0.40980330836826856F);
        this.setRotateAngle(rHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
        this.setRotateAngle(tail04, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(rArm01, 0.22689280275926282F, 0.0F, 0.08726646259971647F);
        this.setRotateAngle(lCheekFur01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
        this.setRotateAngle(lEar03, 0.22689280275926282F, 0.0F, 0.0F);
        this.setRotateAngle(rHindLeg01, -0.17453292519943295F, 0.0F, 0.0F);
        this.setRotateAngle(rEar03, 0.22689280275926282F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(rEar02, 0.0F, 0.0F, 0.40980330836826856F);
        this.setRotateAngle(lArm01_1, -0.22689280275926282F, 0.0F, 0.08726646259971647F);
        this.setRotateAngle(tail03, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(upperJawR, 0.0F, -0.13962634015954636F, -0.08726646259971647F);
        this.setRotateAngle(tail01, -0.6806784082777886F, 0.0F, 0.0F);
        this.setRotateAngle(rHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
        this.setRotateAngle(rEar04, 0.0F, 0.0F, -0.40980330836826856F);
        this.lHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.17453292519943295F;
        this.lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount + 0.22689280275926282F;
        this.rHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount - 0.17453292519943295F;
        this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.22689280275926282F;
        this.body.rotateAngleX = 0;
        if(entity instanceof FoxEntity) {
            FoxEntity fox = (FoxEntity) entity;
            if(!fox.isSleeping() && !fox.isStuck() && !fox.isCrouching()) {
                this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
                this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
            }

            if(fox.isSleeping()) {
                this.setRotateAngle(lHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
                this.setRotateAngle(lEar04, 0.0F, 0.0F, 0.40980330836826856F);
                this.setRotateAngle(rHindLeg02, 0.8028514559173915F, 0.0F, 0.0F);
                this.setRotateAngle(upperJawR, 0.0F, -0.13962634015954636F, -0.08726646259971647F);
                this.setRotateAngle(lCheekFur01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
                this.setRotateAngle(rHindpaw, 1.3962634015954636F, 0.0F, 0.0F);
                this.setRotateAngle(rArm01_1, -2.705260340591211F, 0.0F, -0.08726646259971647F);
                this.setRotateAngle(rHindLeg01, -1.5707963267948966F, 0.0F, 0.0F);
                this.setRotateAngle(lForepaw, 1.5707963267948966F, 0.0F, 0.0F);
                this.setRotateAngle(tail01, -0.12217304763960307F, 0.6981317007977318F, 0.0F);
                this.setRotateAngle(lHindLeg01, -1.5707963267948966F, -0.3490658503988659F, 0.0F);
                this.setRotateAngle(lEar02, 0.0F, 0.0F, -0.40980330836826856F);
                this.setRotateAngle(rEar02, 0.0F, 0.0F, 0.40980330836826856F);
                this.setRotateAngle(lEar01, 0.0F, -0.40142572795869574F, 0.2617993877991494F);
                this.setRotateAngle(rCheekFur01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
                this.setRotateAngle(rHindLeg03, -0.5410520681182421F, 0.0F, 0.0F);
                this.setRotateAngle(tail04, 0.0F, 0.6283185307179586F, 0.0F);
                this.setRotateAngle(tail02a, -0.17453292519943295F, 0.6981317007977318F, 0.0F);
                this.setRotateAngle(upperJawL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
                this.setRotateAngle(lHindpaw, 1.3962634015954636F, 0.0F, 0.0F);
                this.setRotateAngle(rArm01, 1.1344640137963142F, 0.0F, 0.08726646259971647F);
                this.setRotateAngle(rEar04, 0.0F, 0.0F, -0.40980330836826856F);
                this.setRotateAngle(lEar03, 0.22689280275926282F, 0.0F, 0.0F);
                this.setRotateAngle(neck, 0.0F, -0.7853981633974483F, 0.0F);
                this.setRotateAngle(fur02, -0.7740535232594852F, 0.0F, 0.0F);
                this.setRotateAngle(rEar01, 0.0F, 0.40142572795869574F, -0.2617993877991494F);
                this.setRotateAngle(tail03, 0.0F, 0.6981317007977318F, 0.0F);
                this.setRotateAngle(rEar03, 0.22689280275926282F, 0.0F, 0.0F);
                this.setRotateAngle(fur01, -0.8651597102135892F, 0.0F, 0.0F);
                this.setRotateAngle(tail05, 0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(rForepaw, 1.5707963267948966F, 0.0F, 0.0F);
                this.setRotateAngle(lArm01, 1.1344640137963142F, 0.0F, -0.08726646259971647F);
                this.setRotateAngle(lArm01_1, -2.705260340591211F, 0.0F, 0.08726646259971647F);
                this.setRotateAngle(head, 0.0F, -0.6981317007977318F, 0.0F);
                this.setRotateAngle(snoot, 0.22759093446006054F, 0.0F, 0.0F);
                this.setRotateAngle(rear, -0.08726646259971647F, 0.6283185307179586F, 0.0F);
                this.head.rotateAngleX = 0.0F;
                this.head.rotateAngleZ = MathHelper.cos(ageInTicks * 0.027F) / 22.0F;
            }
            
            if (fox.isSitting()) {
                this.setRotateAngle360(this.neck, 50, 0, 0);
                this.setRotateAngle360(this.body, -50, 0, 0);
                this.setRotateAngle360(this.rear, -40, 0, 0);
                this.setRotateAngle360(this.tail01, 90, 0, 0);
                this.setRotateAngle360(this.lArm01, 36, 0, -5);
                this.setRotateAngle360(this.lArm01_1, -26, 0, 5);
                this.setRotateAngle360(this.lForepaw, 28, 0, 0);
                this.setRotateAngle360(this.rArm01, 36, 0, 5);
                this.setRotateAngle360(this.rArm01_1, -26, 0, -5);
                this.setRotateAngle360(this.rForepaw, 28, 0, 0);
                this.setRotateAngle360(this.lHindLeg01, -13, 0, -16);
                this.setRotateAngle(this.lHindLeg02, 0.8996066167365371F, 0.0F, 0.0F);
                this.setRotateAngle360(this.lHindpaw, 90, 0, 0);
                this.setRotateAngle360(this.rHindLeg01, -13, 0, 16);
                this.setRotateAngle(this.rHindLeg02, 0.8996066167365371F, 0.0F, 0.0F);
                this.setRotateAngle360(this.rHindpaw, 90, 0, 0);
                this.head.rotateAngleX -= Math.toRadians(20);
            }

            if(fox.isCrouching()) {
                this.lArm01.offsetY = -0.1F;
                this.rArm01.offsetY = -0.1F;
                this.lHindLeg01.offsetY = -0.1F;
                this.rHindLeg01.offsetY = -0.1F;
                this.body.offsetY = 0.1F;
            } else {
                this.lArm01.offsetY = 0F;
                this.rArm01.offsetY = 0F;
                this.lHindLeg01.offsetY = 0F;
                this.rHindLeg01.offsetY = 0F;
                this.body.offsetY = 0F;
            }

            if(fox.isStuck()) {
                this.rotation += 0.67F;
                this.body.rotateAngleX = MathHelper.cos(this.rotation * 0.4662F) * 0.1F;
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
    
    public void setRotateAngle360(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = (float) Math.toRadians(x);
        RendererModel.rotateAngleY = (float) Math.toRadians(y);
        RendererModel.rotateAngleZ = (float) Math.toRadians(z);
    }
}
