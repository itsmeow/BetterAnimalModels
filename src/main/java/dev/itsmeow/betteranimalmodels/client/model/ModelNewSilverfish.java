package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * newsilverfish - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewSilverfish<T extends LivingEntity> extends Model<T> {

    public ModelPart thorax01;
    public ModelPart head;
    public ModelPart thorax02;
    public ModelPart lLeg01a;
    public ModelPart lLeg02a;
    public ModelPart rLeg01a;
    public ModelPart rLeg01a_1;
    public ModelPart lAntenna;
    public ModelPart rAntenna;
    public ModelPart tail01;
    public ModelPart lLeg03a;
    public ModelPart rLeg03a;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart tail05;
    public ModelPart lTailWhisker;
    public ModelPart rTailWhisker;
    public ModelPart mTailWhisker;
    public ModelPart lLeg03b;
    public ModelPart rLeg03b;
    public ModelPart lLeg01b;
    public ModelPart lLeg02b;
    public ModelPart lLeg01b_1;
    public ModelPart rLeg01b;

    public ModelNewSilverfish() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.lAntenna = new ModelPart(this, 37, 0);
        this.lAntenna.setPos(0.7F, -0.4F, -1.2F);
        this.lAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
        this.setRotateAngle(lAntenna, 0.0F, -0.22759093446006054F, 0.0F);
        this.thorax01 = new ModelPart(this, 0, 0);
        this.thorax01.setPos(0.0F, 20.6F, -1.0F);
        this.thorax01.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 6, 0.0F);
        this.tail05 = new ModelPart(this, 26, 17);
        this.tail05.setPos(0.0F, 0.0F, 1.9F);
        this.tail05.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
        this.tail03 = new ModelPart(this, 26, 6);
        this.tail03.setPos(0.0F, 0.0F, 1.9F);
        this.tail03.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.tail01 = new ModelPart(this, 26, 0);
        this.tail01.setPos(0.0F, 0.0F, 2.9F);
        this.tail01.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F);
        this.lLeg03a = new ModelPart(this, 41, 15);
        this.lLeg03a.setPos(1.8F, 0.5F, 1.0F);
        this.lLeg03a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(lLeg03a, 0.0F, -0.31869712141416456F, 0.0F);
        this.lLeg03b = new ModelPart(this, 43, 19);
        this.lLeg03b.setPos(2.6F, -0.2F, 0.0F);
        this.lLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lLeg03b, 0.0F, 0.0F, -0.5462880558742251F);
        this.lLeg02b = new ModelPart(this, 43, 19);
        this.lLeg02b.setPos(2.6F, -0.2F, 0.0F);
        this.lLeg02b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lLeg02b, 0.0F, 0.0F, -0.5462880558742251F);
        this.rLeg01a_1 = new ModelPart(this, 41, 15);
        this.rLeg01a_1.mirror = true;
        this.rLeg01a_1.setPos(-2.2F, 0.5F, 1.0F);
        this.rLeg01a_1.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.tail02 = new ModelPart(this, 26, 6);
        this.tail02.setPos(0.0F, 0.0F, 3.0F);
        this.tail02.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.tail04 = new ModelPart(this, 26, 11);
        this.tail04.setPos(0.0F, 0.0F, 1.9F);
        this.tail04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.rLeg03a = new ModelPart(this, 41, 15);
        this.rLeg03a.mirror = true;
        this.rLeg03a.setPos(-1.8F, 0.5F, 1.0F);
        this.rLeg03a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rLeg03a, 0.0F, 0.31869712141416456F, 0.0F);
        this.lTailWhisker = new ModelPart(this, 41, 0);
        this.lTailWhisker.mirror = true;
        this.lTailWhisker.setPos(0.5F, -0.1F, 1.4F);
        this.lTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.setRotateAngle(lTailWhisker, 0.0F, 0.5235987755982988F, 0.0F);
        this.lLeg02a = new ModelPart(this, 41, 15);
        this.lLeg02a.setPos(2.2F, 0.5F, 1.0F);
        this.lLeg02a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.rLeg01a = new ModelPart(this, 41, 15);
        this.rLeg01a.mirror = true;
        this.rLeg01a.setPos(-2.2F, 0.5F, -1.5F);
        this.rLeg01a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rLeg01a, 0.0F, -0.31869712141416456F, 0.0F);
        this.rLeg03b = new ModelPart(this, 43, 19);
        this.rLeg03b.mirror = true;
        this.rLeg03b.setPos(-2.6F, -0.2F, 0.0F);
        this.rLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rLeg03b, 0.0F, 0.0F, 0.5462880558742251F);
        this.rAntenna = new ModelPart(this, 37, 0);
        this.rAntenna.mirror = true;
        this.rAntenna.setPos(-0.7F, -0.4F, -1.2F);
        this.rAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
        this.setRotateAngle(rAntenna, 0.0F, 0.22759093446006054F, 0.0F);
        this.rLeg01b = new ModelPart(this, 43, 19);
        this.rLeg01b.mirror = true;
        this.rLeg01b.setPos(-2.6F, -0.2F, 0.0F);
        this.rLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rLeg01b, 0.0F, 0.0F, 0.5462880558742251F);
        this.lLeg01b_1 = new ModelPart(this, 43, 19);
        this.lLeg01b_1.setPos(-2.6F, -0.2F, 0.0F);
        this.lLeg01b_1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lLeg01b_1, 0.0F, 0.0F, 0.5462880558742251F);
        this.thorax02 = new ModelPart(this, 0, 12);
        this.thorax02.setPos(0.0F, 0.0F, 2.9F);
        this.thorax02.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 3, 0.0F);
        this.lLeg01b = new ModelPart(this, 43, 19);
        this.lLeg01b.setPos(2.6F, -0.2F, 0.0F);
        this.lLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lLeg01b, 0.0F, 0.0F, -0.5462880558742251F);
        this.head = new ModelPart(this, 0, 21);
        this.head.setPos(0.0F, 0.0F, -3.2F);
        this.head.addBox(-2.0F, -1.5F, -1.7F, 4, 3, 2, 0.0F);
        this.lLeg01a = new ModelPart(this, 41, 15);
        this.lLeg01a.setPos(2.2F, 0.5F, -1.5F);
        this.lLeg01a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(lLeg01a, 0.0F, 0.31869712141416456F, 0.0F);
        this.rTailWhisker = new ModelPart(this, 41, 0);
        this.rTailWhisker.mirror = true;
        this.rTailWhisker.setPos(-0.5F, -0.1F, 1.4F);
        this.rTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.setRotateAngle(rTailWhisker, 0.0F, -0.5235987755982988F, 0.0F);
        this.mTailWhisker = new ModelPart(this, 44, 0);
        this.mTailWhisker.mirror = true;
        this.mTailWhisker.setPos(0.0F, -0.1F, 1.4F);
        this.mTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 12, 0.0F);
        this.head.addChild(this.lAntenna);
        this.tail04.addChild(this.tail05);
        this.tail02.addChild(this.tail03);
        this.thorax02.addChild(this.tail01);
        this.thorax02.addChild(this.lLeg03a);
        this.lLeg03a.addChild(this.lLeg03b);
        this.lLeg02a.addChild(this.lLeg02b);
        this.thorax01.addChild(this.rLeg01a_1);
        this.tail01.addChild(this.tail02);
        this.tail03.addChild(this.tail04);
        this.thorax02.addChild(this.rLeg03a);
        this.tail05.addChild(this.lTailWhisker);
        this.thorax01.addChild(this.lLeg02a);
        this.thorax01.addChild(this.rLeg01a);
        this.rLeg03a.addChild(this.rLeg03b);
        this.head.addChild(this.rAntenna);
        this.rLeg01a_1.addChild(this.rLeg01b);
        this.rLeg01a.addChild(this.lLeg01b_1);
        this.thorax01.addChild(this.thorax02);
        this.lLeg01a.addChild(this.lLeg01b);
        this.thorax01.addChild(this.head);
        this.thorax01.addChild(this.lLeg01a);
        this.tail05.addChild(this.rTailWhisker);
        this.tail05.addChild(this.mTailWhisker);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.thorax01.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.lLeg01a.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg01b.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.lLeg02a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg02b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.lLeg03a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg03b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.rLeg01a.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.rLeg01b.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.rLeg03a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.rLeg03b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.tail01.yRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount * 0.1F;
        this.tail02.yRot = this.tail01.yRot;
        this.tail03.yRot = this.tail01.yRot;
        this.tail04.yRot = this.tail01.yRot;
        this.tail05.yRot = this.tail01.yRot;
    }
}
