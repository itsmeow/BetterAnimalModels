package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Wolf;

/**
 * wolf_v2 - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelNewWolf<T extends LivingEntity> extends Model<T> {
    public ModelPart chest;
    public ModelPart torso;
    public ModelPart neck;
    public ModelPart lForeleg01;
    public ModelPart rForeleg01;
    public ModelPart hackles01;
    public ModelPart hackles02;
    public ModelPart tail01;
    public ModelPart lHindLeg01;
    public ModelPart rHindLeg01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart lHindLeg02;
    public ModelPart lHindLeg03;
    public ModelPart lHindPaw;
    public ModelPart rHindLeg02;
    public ModelPart rHindLeg03;
    public ModelPart rHindPaw;
    public ModelPart head;
    public ModelPart mane01;
    public ModelPart mane02;
    public ModelPart mane03;
    public ModelPart mane04;
    public ModelPart jawUpper01;
    public ModelPart jawLower;
    public ModelPart lEar01;
    public ModelPart rEar01;
    public ModelPart lCheekFur;
    public ModelPart rCheekFur;
    public ModelPart snout;
    public ModelPart jawUpper02;
    public ModelPart upperTeeth01;
    public ModelPart upperTeeth03;
    public ModelPart upperTeeth02;
    public ModelPart lowerTeeth01;
    public ModelPart lowerTeeth02;
    public ModelPart lEar02;
    public ModelPart rEar02;
    public ModelPart lForeleg02;
    public ModelPart lForePaw;
    public ModelPart rForeleg02;
    public ModelPart rForePaw;

    private float redTint = 1.0F;
    private float greenTint = 1.0F;
    private float blueTint = 1.0F;

    private float nextTint = 1F;
    private boolean isWet = false;

    public ModelNewWolf() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.mane03 = new ModelPart(this, 61, 50);
        this.mane03.setPos(0.0F, 3.1F, -2.0F);
        this.mane03.addBox(-2.5F, 0.0F, -0.5F, 5, 6, 1, 0.0F);
        this.setRotateAngle(mane03, 0.6632251157578453F, 0.0F, 0.0F);
        this.neck = new ModelPart(this, 38, 27);
        this.neck.setPos(0.0F, -1.7F, -3.3F);
        this.neck.addBox(-3.0F, -2.5F, -5.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(neck, -0.5235987755982988F, 0.0F, 0.0F);
        this.lowerTeeth01 = new ModelPart(this, 57, 22);
        this.lowerTeeth01.setPos(0.0F, -3.7F, 0.1F);
        this.lowerTeeth01.addBox(0.6F, -0.7F, 0.4F, 1, 3, 1, 0.0F);
        this.lHindLeg03 = new ModelPart(this, 94, 30);
        this.lHindLeg03.setPos(0.1F, 0.0F, 5.8F);
        this.lHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(lHindLeg03, 0.5235987755982988F, 0.0F, 0.05235987755982988F);
        this.jawUpper02 = new ModelPart(this, 51, 12);
        this.jawUpper02.mirror = true;
        this.jawUpper02.setPos(0.0F, 0.35F, 0.0F);
        this.jawUpper02.addBox(-3.5F, -4.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(jawUpper02, 0.0F, 0.0F, 0.2792526803190927F);
        this.jawLower = new ModelPart(this, 39, 20);
        this.jawLower.setPos(0.0F, -4.6F, -2.51F);
        this.jawLower.addBox(-1.5F, -4.5F, -0.5F, 3, 5, 1, 0.0F);
        this.lHindPaw = new ModelPart(this, 66, 27);
        this.lHindPaw.setPos(0.0F, 6.4F, -0.3F);
        this.lHindPaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(lHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
        this.chest = new ModelPart(this, 3, 0);
        this.chest.setPos(0.0F, 7.8F, -5.0F);
        this.chest.addBox(-4.0F, -4.0F, -5.0F, 8, 9, 10, 0.0F);
        this.setRotateAngle(chest, -0.06981317007977318F, 0.0F, 0.0F);
        this.tail04 = new ModelPart(this, 18, 49);
        this.tail04.setPos(0.0F, 0.0F, 0.4F);
        this.tail04.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tail04, 0.06981317007977318F, 0.0F, 0.0F);
        this.lHindLeg02 = new ModelPart(this, 90, 18);
        this.lHindLeg02.setPos(1.9F, 5.6F, -1.1F);
        this.lHindLeg02.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(lHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
        this.jawUpper01 = new ModelPart(this, 51, 12);
        this.jawUpper01.setPos(1.2F, -5.2F, -1.1F);
        this.jawUpper01.addBox(-0.9F, -4.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(jawUpper01, 0.0F, 0.0F, -0.13962634015954636F);
        this.lForePaw = new ModelPart(this, 66, 27);
        this.lForePaw.setPos(0.0F, 7.8F, -0.5F);
        this.lForePaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(lForePaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.mane02 = new ModelPart(this, 49, 50);
        this.mane02.setPos(0.0F, 3.1F, -3.2F);
        this.mane02.addBox(-2.0F, 0.0F, -0.5F, 4, 5, 1, 0.0F);
        this.setRotateAngle(mane02, 0.6283185307179586F, 0.0F, 0.0F);
        this.upperTeeth02 = new ModelPart(this, 50, 20);
        this.upperTeeth02.mirror = true;
        this.upperTeeth02.setPos(-2.4F, -2.8F, -1.0F);
        this.upperTeeth02.addBox(-0.5F, -1.0F, -0.89F, 1, 4, 2, 0.0F);
        this.rHindLeg01 = new ModelPart(this, 90, 0);
        this.rHindLeg01.mirror = true;
        this.rHindLeg01.setPos(-1.3F, -0.9F, 7.8F);
        this.rHindLeg01.addBox(-4.0F, -1.0F, -3.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(rHindLeg01, -0.3839724354387525F, 0.0F, 0.05235987755982988F);
        this.mane01 = new ModelPart(this, 36, 50);
        this.mane01.setPos(0.0F, 3.1F, -3.9F);
        this.mane01.addBox(-2.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.rForeleg01 = new ModelPart(this, 69, 0);
        this.rForeleg01.mirror = true;
        this.rForeleg01.setPos(-3.0F, -0.2F, -1.2F);
        this.rForeleg01.addBox(-3.0F, -1.1F, -3.4F, 4, 8, 5, 0.0F);
        this.setRotateAngle(rForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
        this.upperTeeth01 = new ModelPart(this, 50, 20);
        this.upperTeeth01.setPos(0.0F, -2.8F, -1.0F);
        this.upperTeeth01.addBox(-0.5F, -1.0F, -0.89F, 1, 4, 2, 0.0F);
        this.lEar02 = new ModelPart(this, 0, 4);
        this.lEar02.setPos(0.0F, 1.2F, 0.2F);
        this.lEar02.addBox(-1.0F, -0.7F, 0.2F, 2, 1, 4, 0.0F);
        this.setRotateAngle(lEar02, 0.3141592653589793F, 0.0F, 0.0F);
        this.hackles01 = new ModelPart(this, 59, 37);
        this.hackles01.setPos(0.0F, -3.9F, -4.5F);
        this.hackles01.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(hackles01, 0.13962634015954636F, 0.0F, 0.0F);
        this.tail02 = new ModelPart(this, 0, 47);
        this.tail02.setPos(0.0F, 3.5F, 0.0F);
        this.tail02.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(tail02, -0.3141592653589793F, 0.0F, 0.0F);
        this.torso = new ModelPart(this, 0, 19);
        this.torso.setPos(0.0F, 0.4F, 4.0F);
        this.torso.addBox(-3.5F, -4.0F, 0.0F, 7, 8, 11, 0.0F);
        this.setRotateAngle(torso, 0.06981317007977318F, 0.0F, 0.0F);
        this.lCheekFur = new ModelPart(this, 30, -6);
        this.lCheekFur.mirror = true;
        this.lCheekFur.setPos(3.5F, -2.5F, -0.6F);
        this.lCheekFur.addBox(0.0F, -0.9F, -3.8F, 0, 5, 6, 0.0F);
        this.setRotateAngle(lCheekFur, -0.3490658503988659F, -0.08726646259971647F, -0.6981317007977318F);
        this.lowerTeeth02 = new ModelPart(this, 57, 22);
        this.lowerTeeth02.mirror = true;
        this.lowerTeeth02.setPos(0.0F, 0.0F, 0.0F);
        this.lowerTeeth02.addBox(-1.6F, -0.7F, 0.3F, 1, 3, 1, 0.0F);
        this.lForeleg01 = new ModelPart(this, 69, 0);
        this.lForeleg01.setPos(3.0F, -0.2F, -1.2F);
        this.lForeleg01.addBox(-1.0F, -1.1F, -3.4F, 4, 8, 5, 0.0F);
        this.setRotateAngle(lForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
        this.hackles02 = new ModelPart(this, 94, 42);
        this.hackles02.setPos(0.0F, -3.2F, -3.0F);
        this.hackles02.addBox(-3.5F, -1.0F, 0.0F, 7, 2, 9, 0.0F);
        this.setRotateAngle(hackles02, 0.10471975511965977F, 0.0F, 0.0F);
        this.lHindLeg01 = new ModelPart(this, 90, 0);
        this.lHindLeg01.setPos(1.3F, -0.9F, 7.8F);
        this.lHindLeg01.addBox(0.0F, -1.0F, -3.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(lHindLeg01, -0.3839724354387525F, 0.0F, -0.05235987755982988F);
        this.tail03 = new ModelPart(this, 13, 39);
        this.tail03.setPos(0.0F, 6.5F, 0.1F);
        this.tail03.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tail03, 0.13962634015954636F, 0.0F, 0.0F);
        this.rHindLeg02 = new ModelPart(this, 90, 18);
        this.rHindLeg02.mirror = true;
        this.rHindLeg02.setPos(-1.9F, 5.6F, -1.1F);
        this.rHindLeg02.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(rHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
        this.tail01 = new ModelPart(this, 0, 39);
        this.tail01.setPos(0.0F, -2.9F, 10.0F);
        this.tail01.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tail01, 0.6981317007977318F, 0.0F, 0.0F);
        this.rEar02 = new ModelPart(this, 0, 4);
        this.rEar02.mirror = true;
        this.rEar02.setPos(0.0F, 1.2F, 0.2F);
        this.rEar02.addBox(-1.0F, -0.7F, 0.2F, 2, 1, 4, 0.0F);
        this.setRotateAngle(rEar02, 0.3141592653589793F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 40, 0);
        this.head.setPos(0.0F, -0.5F, -3.6F);
        this.head.addBox(-3.5F, -5.0F, -3.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(head, 2.1816615649929116F, 0.0F, 0.0F);
        this.mane04 = new ModelPart(this, 75, 50);
        this.mane04.setPos(0.0F, 3.1F, -0.8F);
        this.mane04.addBox(-3.0F, 0.0F, -0.5F, 6, 7, 2, 0.0F);
        this.setRotateAngle(mane04, 0.6981317007977318F, 0.0F, 0.0F);
        this.rCheekFur = new ModelPart(this, 30, -6);
        this.rCheekFur.mirror = true;
        this.rCheekFur.setPos(-3.5F, -2.5F, -0.6F);
        this.rCheekFur.addBox(0.0F, -0.8F, -3.6F, 0, 5, 6, 0.0F);
        this.setRotateAngle(rCheekFur, -0.3490658503988659F, 0.08726646259971647F, 0.6981317007977318F);
        this.snout = new ModelPart(this, 40, 12);
        this.snout.setPos(0.0F, -4.9F, 0.1F);
        this.snout.addBox(-1.5F, -4.45F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.rForeleg02 = new ModelPart(this, 69, 14);
        this.rForeleg02.mirror = true;
        this.rForeleg02.setPos(-1.5F, 6.7F, -0.5F);
        this.rForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(rForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
        this.rHindLeg03 = new ModelPart(this, 94, 30);
        this.rHindLeg03.mirror = true;
        this.rHindLeg03.setPos(-0.1F, 0.0F, 5.8F);
        this.rHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(rHindLeg03, 0.5235987755982988F, 0.0F, -0.05235987755982988F);
        this.rForePaw = new ModelPart(this, 66, 27);
        this.rForePaw.mirror = true;
        this.rForePaw.setPos(0.0F, 7.8F, -0.5F);
        this.rForePaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rForePaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.rEar01 = new ModelPart(this, 0, 0);
        this.rEar01.mirror = true;
        this.rEar01.setPos(-2.1F, -2.2F, 1.9F);
        this.rEar01.addBox(-1.5F, -0.5F, 0.3F, 3, 1, 3, 0.0F);
        this.setRotateAngle(rEar01, 0.08726646259971647F, -0.22689280275926282F, -0.3665191429188092F);
        this.upperTeeth03 = new ModelPart(this, 55, 28);
        this.upperTeeth03.setPos(0.0F, -3.2F, -1.0F);
        this.upperTeeth03.addBox(-2.27F, -0.7F, -0.4F, 3, 0, 1, 0.0F);
        this.setRotateAngle(upperTeeth03, 0.0F, 0.0F, 0.136659280431156F);
        this.lForeleg02 = new ModelPart(this, 69, 14);
        this.lForeleg02.setPos(1.5F, 6.7F, -0.5F);
        this.lForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(lForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
        this.rHindPaw = new ModelPart(this, 66, 27);
        this.rHindPaw.mirror = true;
        this.rHindPaw.setPos(0.0F, 6.4F, -0.3F);
        this.rHindPaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
        this.lEar01 = new ModelPart(this, 0, 0);
        this.lEar01.setPos(2.1F, -2.2F, 1.9F);
        this.lEar01.addBox(-1.5F, -0.5F, 0.3F, 3, 1, 3, 0.0F);
        this.setRotateAngle(lEar01, 0.08726646259971647F, 0.22689280275926282F, 0.3665191429188092F);
        this.neck.addChild(this.mane03);
        this.chest.addChild(this.neck);
        this.jawLower.addChild(this.lowerTeeth01);
        this.lHindLeg02.addChild(this.lHindLeg03);
        this.jawUpper01.addChild(this.jawUpper02);
        this.head.addChild(this.jawLower);
        this.lHindLeg03.addChild(this.lHindPaw);
        this.tail03.addChild(this.tail04);
        this.lHindLeg01.addChild(this.lHindLeg02);
        this.head.addChild(this.jawUpper01);
        this.lForeleg02.addChild(this.lForePaw);
        this.neck.addChild(this.mane02);
        this.jawUpper02.addChild(this.upperTeeth02);
        this.torso.addChild(this.rHindLeg01);
        this.neck.addChild(this.mane01);
        this.chest.addChild(this.rForeleg01);
        this.jawUpper01.addChild(this.upperTeeth01);
        this.lEar01.addChild(this.lEar02);
        this.chest.addChild(this.hackles01);
        this.tail01.addChild(this.tail02);
        this.chest.addChild(this.torso);
        this.head.addChild(this.lCheekFur);
        this.lowerTeeth01.addChild(this.lowerTeeth02);
        this.chest.addChild(this.lForeleg01);
        this.chest.addChild(this.hackles02);
        this.torso.addChild(this.lHindLeg01);
        this.tail02.addChild(this.tail03);
        this.rHindLeg01.addChild(this.rHindLeg02);
        this.torso.addChild(this.tail01);
        this.rEar01.addChild(this.rEar02);
        this.neck.addChild(this.head);
        this.neck.addChild(this.mane04);
        this.head.addChild(this.rCheekFur);
        this.head.addChild(this.snout);
        this.rForeleg01.addChild(this.rForeleg02);
        this.rHindLeg02.addChild(this.rHindLeg03);
        this.rForeleg02.addChild(this.rForePaw);
        this.head.addChild(this.rEar01);
        this.jawUpper01.addChild(this.upperTeeth03);
        this.lForeleg01.addChild(this.lForeleg02);
        this.rHindLeg03.addChild(this.rHindPaw);
        this.head.addChild(this.lEar01);
    }

    public void setTint(float r, float g, float b) {
       this.redTint = r;
       this.greenTint = g;
       this.blueTint = b;
    }
    
    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if(isWet) {
            float f = nextTint;
            this.setTint(f, f, f);
        }
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, redTint * red, greenTint * green, blueTint * blue, alpha);
        if(isWet) {
            this.setTint(1F, 1F, 1F);
        }
    }

    @Override
    public void prepareMobModel(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        if(entitylivingbaseIn instanceof Wolf) {
            Wolf wolf = (Wolf) entitylivingbaseIn;

            if(!wolf.isTame()) {
                this.tail01.yRot = 0.0F;
            } else {
                this.tail01.yRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            }

            this.head.zRot = wolf.getHeadRollAngle(partialTickTime) + wolf.getBodyRollAngle(partialTickTime, 0.0F);
            this.neck.zRot = wolf.getBodyRollAngle(partialTickTime, -0.08F);
            this.torso.zRot = wolf.getBodyRollAngle(partialTickTime, -0.16F);
            this.tail01.zRot = wolf.getBodyRollAngle(partialTickTime, -0.2F);
        }
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float tailRotation, float netHeadYaw, float headPitch) {
        float swingModifier = 0.9f;
        this.head.yRot = rad(netHeadYaw);
        this.head.xRot = rad(headPitch) + 2.1816615649929116F;
        tail01.xRot = 0.6981317007977318F + tailRotation;
        this.neck.xRot = -0.6F;
        lHindLeg01.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount - 0.22759093446006054F;
        rHindLeg01.xRot = Mth.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount - 0.22759093446006054F;
        lForeleg01.xRot = Mth.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount + 0.22759093446006054F;
        rForeleg01.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount + 0.22759093446006054F;
        if(entity instanceof Wolf) {
            Wolf wolf = (Wolf) entity;
            this.isWet = wolf.isWet();
            this.nextTint = wolf.getBrightness() * wolf.getWetShade(Minecraft.getInstance().getFrameTime());
            tail01.xRot = 0.6981317007977318F + tailRotation - ((wolf.isTame()) ? 0.4F : 0F);
            if(wolf.isInSittingPose()) { // it's not actually sleeping, MCP is just on crack, it's sitting
                this.setRotateAngle(rHindPaw, 1.3089969389957472F, 0.20943951023931953F, 0.0F);
                this.setRotateAngle(lForePaw, 0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(rForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
                this.setRotateAngle(lForeleg01, 0.8726646259971648F, 0.0F, 0.0F);
                this.setRotateAngle(tail02, 0.5235987755982988F, 0.0F, 0.0F);
                this.setRotateAngle(tail04, 0.06981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(rHindLeg01, -0.20943951023931953F, 0.0F, 0.5235987755982988F);
                this.setRotateAngle(lHindPaw, 1.3089969389957472F, -0.20943951023931953F, 0.0F);
                this.setRotateAngle(lForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
                this.setRotateAngle(tail03, -0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(torso, -0.17453292519943295F, 0.0F, 0.0F);
                this.setRotateAngle(rForeleg01, 0.8726646259971648F, 0.0F, 0.0F);
                this.setRotateAngle(rForePaw, 0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(neck, 0.22689280275926282F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg03, -0.6981317007977318F, 0.0F, 0.05235987755982988F);
                this.setRotateAngle(rHindLeg02, 0.6981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg02, 0.6981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(rHindLeg03, -0.6981317007977318F, 0.0F, -0.05235987755982988F);
                this.setRotateAngle(lHindLeg01, -0.20943951023931953F, 0.0F, -0.5235987755982988F);
                this.setRotateAngle(chest, -0.8028514559173915F, 0.0F, 0.0F);
            } else {
                this.setRotateAngle(neck, -0.5235987755982988F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg03, 0.5235987755982988F, 0.0F, 0.05235987755982988F);
                this.setRotateAngle(lHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
                this.setRotateAngle(chest, -0.06981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(tail04, 0.06981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
                this.setRotateAngle(lForePaw, 0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(rHindLeg01, -0.3839724354387525F, 0.0F, 0.05235987755982988F);
                this.setRotateAngle(rForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
                this.setRotateAngle(tail02, -0.3141592653589793F, 0.0F, 0.0F);
                this.setRotateAngle(torso, 0.06981317007977318F, 0.0F, 0.0F);
                this.setRotateAngle(lForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
                this.setRotateAngle(lHindLeg01, -0.3839724354387525F, 0.0F, -0.05235987755982988F);
                this.setRotateAngle(tail03, 0.13962634015954636F, 0.0F, 0.0F);
                this.setRotateAngle(rHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
                this.setRotateAngle(rForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
                this.setRotateAngle(rHindLeg03, 0.5235987755982988F, 0.0F, -0.05235987755982988F);
                this.setRotateAngle(rForePaw, 0.03490658503988659F, 0.0F, 0.0F);
                this.setRotateAngle(lForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
                this.setRotateAngle(rHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
                lHindLeg01.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount - 0.22759093446006054F;
                rHindLeg01.xRot = Mth.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount - 0.22759093446006054F;
                lForeleg01.xRot = Mth.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount + 0.22759093446006054F;
                rForeleg01.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount + 0.22759093446006054F;
            }
        }

    }

}