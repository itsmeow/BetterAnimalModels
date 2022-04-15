package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Sheep;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep<T extends Sheep> extends Model<T> {

    private final ModelPart body;
    private final ModelPart rear;
    private final ModelPart lHindLeg01;
    private final ModelPart lHindlegWool;
    private final ModelPart lHindLeg02;
    private final ModelPart lhHoofClaw01a;
    private final ModelPart lhHoofClaw01b;
    private final ModelPart lhHoofClaw02a;
    private final ModelPart Box_r1;
    private final ModelPart lhHoofClaw02b;
    private final ModelPart rHindLeg01;
    private final ModelPart rHindlegWool;
    private final ModelPart rHindLeg02;
    private final ModelPart rhHoofClaw01a;
    private final ModelPart rhHoofClaw01b;
    private final ModelPart rhHoofClaw02a;
    private final ModelPart Box_r2;
    private final ModelPart rhHoofClaw02b;
    private final ModelPart tail;
    private final ModelPart lForeleg01;
    private final ModelPart lForeleg02;
    private final ModelPart lfHoofClaw01a;
    private final ModelPart lfHoofClaw01b;
    private final ModelPart lfHoofClaw02a;
    private final ModelPart lfHoofClaw02b;
    private final ModelPart lForelegWool01;
    private final ModelPart lForelegWool02;
    private final ModelPart rForeleg01;
    private final ModelPart rForeleg02;
    private final ModelPart rfHoofClaw01a;
    private final ModelPart rfHoofClaw01b;
    private final ModelPart rfHoofClaw02a;
    private final ModelPart rfHoofClaw02b;
    private final ModelPart lForelegWool2;
    private final ModelPart lForelegWool3;
    private final ModelPart neck;
    private final ModelPart head;
    private final ModelPart jawUpper;
    private final ModelPart jawLower;
    private final ModelPart snout;
    private final ModelPart lEar;
    private final ModelPart rEar2;
    private final ModelPart woolHead01;
    private final ModelPart woolNeck;
    private final ModelPart woolBody;
    private final ModelPart woolRear;
    private final ModelPart woolFront;

    private boolean sheared;

    public ModelNewSheep() {
        texWidth = 64;
        texHeight = 64;

        body = new ModelPart(this);
        body.setPos(0.0F, 9.0F, -1.0F);
        body.texOffs(2, 1).addBox(-4.0F, -3.0F, -6.9F, 8.0F, 7.0F, 14.0F, 0.0F, false);

        rear = new ModelPart(this);
        rear.setPos(0.0F, 0.0F, 6.9F);
        body.addChild(rear);
        setRotationAngle(rear, -0.384F, 0.0F, 0.0F);
        rear.texOffs(0, 22).addBox(-3.5F, -3.0F, -1.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);

        lHindLeg01 = new ModelPart(this);
        lHindLeg01.setPos(1.6F, -0.4F, 1.9F);
        rear.addChild(lHindLeg01);
        setRotationAngle(lHindLeg01, 0.2618F, 0.0F, 0.0698F);
        lHindLeg01.texOffs(0, 0).addBox(-0.1F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

        lHindlegWool = new ModelPart(this);
        lHindlegWool.setPos(1.8F, -0.2F, 0.0F);
        lHindLeg01.addChild(lHindlegWool);
        lHindlegWool.texOffs(13, 49).addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        lHindLeg02 = new ModelPart(this);
        lHindLeg02.setPos(2.4F, 7.4F, 1.7F);
        lHindLeg01.addChild(lHindLeg02);
        setRotationAngle(lHindLeg02, -0.1309F, 0.0F, -0.0873F);
        lHindLeg02.texOffs(0, 44).addBox(-1.3F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, 0.0F, false);

        lhHoofClaw01a = new ModelPart(this);
        lhHoofClaw01a.setPos(-1.0F, 7.0F, -0.5F);
        lHindLeg02.addChild(lhHoofClaw01a);
        setRotationAngle(lhHoofClaw01a, 0.3054F, 0.192F, 0.0349F);
        lhHoofClaw01a.texOffs(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw01b = new ModelPart(this);
        lhHoofClaw01b.setPos(0.0F, 0.0F, -1.0F);
        lhHoofClaw01a.addChild(lhHoofClaw01b);
        setRotationAngle(lhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw01b.texOffs(9, 48).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw02a = new ModelPart(this);
        lhHoofClaw02a.setPos(-0.0005F, 7.0147F, -0.4714F);
        lHindLeg02.addChild(lhHoofClaw02a);
        setRotationAngle(lhHoofClaw02a, 0.3054F, 0.0175F, 0.0349F);


        Box_r1 = new ModelPart(this);
        Box_r1.setPos(0.0005F, -0.0147F, -0.0286F);
        lhHoofClaw02a.addChild(Box_r1);
        setRotationAngle(Box_r1, 0.0F, -0.0873F, 0.0F);
        Box_r1.texOffs(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw02b = new ModelPart(this);
        lhHoofClaw02b.setPos(0.0005F, -0.0147F, -1.0286F);
        lhHoofClaw02a.addChild(lhHoofClaw02b);
        setRotationAngle(lhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw02b.texOffs(9, 48).addBox(-0.3F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rHindLeg01 = new ModelPart(this);
        rHindLeg01.setPos(-1.6F, -0.4F, 1.9F);
        rear.addChild(rHindLeg01);
        setRotationAngle(rHindLeg01, 0.2618F, 0.0F, -0.0698F);
        rHindLeg01.texOffs(0, 0).addBox(-3.9F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);

        rHindlegWool = new ModelPart(this);
        rHindlegWool.setPos(-1.8F, -0.2F, 0.0F);
        rHindLeg01.addChild(rHindlegWool);
        rHindlegWool.texOffs(13, 49).addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        rHindLeg02 = new ModelPart(this);
        rHindLeg02.setPos(-2.4F, 7.4F, 1.7F);
        rHindLeg01.addChild(rHindLeg02);
        setRotationAngle(rHindLeg02, -0.1309F, 0.0F, 0.0873F);
        rHindLeg02.texOffs(0, 44).addBox(-0.7F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, 0.0F, true);

        rhHoofClaw01a = new ModelPart(this);
        rhHoofClaw01a.setPos(1.0F, 7.0F, -0.5F);
        rHindLeg02.addChild(rhHoofClaw01a);
        setRotationAngle(rhHoofClaw01a, 0.3054F, -0.192F, -0.0349F);
        rhHoofClaw01a.texOffs(9, 44).addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw01b = new ModelPart(this);
        rhHoofClaw01b.setPos(0.0F, 0.0F, -1.0F);
        rhHoofClaw01a.addChild(rhHoofClaw01b);
        setRotationAngle(rhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw01b.texOffs(9, 48).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw02a = new ModelPart(this);
        rhHoofClaw02a.setPos(0.0005F, 7.0147F, -0.4714F);
        rHindLeg02.addChild(rhHoofClaw02a);
        setRotationAngle(rhHoofClaw02a, 0.3054F, -0.0175F, -0.0349F);


        Box_r2 = new ModelPart(this);
        Box_r2.setPos(-0.0005F, -0.0147F, -0.0286F);
        rhHoofClaw02a.addChild(Box_r2);
        setRotationAngle(Box_r2, 0.0F, 0.0873F, 0.0F);
        Box_r2.texOffs(9, 44).addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw02b = new ModelPart(this);
        rhHoofClaw02b.setPos(-0.0005F, -0.0147F, -1.0286F);
        rhHoofClaw02a.addChild(rhHoofClaw02b);
        setRotationAngle(rhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw02b.texOffs(9, 48).addBox(-0.7F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        tail = new ModelPart(this);
        tail.setPos(0.0F, -1.1F, 2.8F);
        rear.addChild(tail);
        setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.texOffs(48, 11).addBox(-1.5F, -0.6F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        lForeleg01 = new ModelPart(this);
        lForeleg01.setPos(2.5F, 0.5F, -4.0F);
        body.addChild(lForeleg01);
        setRotationAngle(lForeleg01, 0.0873F, 0.0F, 0.0698F);
        lForeleg01.texOffs(0, 33).addBox(0.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        lForeleg02 = new ModelPart(this);
        lForeleg02.setPos(1.5F, 6.5F, 0.1F);
        lForeleg01.addChild(lForeleg02);
        setRotationAngle(lForeleg02, -0.0873F, 0.0F, -0.0698F);
        lForeleg02.texOffs(0, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        lfHoofClaw01a = new ModelPart(this);
        lfHoofClaw01a.setPos(0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw01a);
        setRotationAngle(lfHoofClaw01a, 0.0F, -0.1047F, -0.0349F);
        lfHoofClaw01a.texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw01b = new ModelPart(this);
        lfHoofClaw01b.setPos(0.0F, 0.5F, -1.0F);
        lfHoofClaw01a.addChild(lfHoofClaw01b);
        setRotationAngle(lfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw01b.texOffs(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw02a = new ModelPart(this);
        lfHoofClaw02a.setPos(-0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw02a);
        setRotationAngle(lfHoofClaw02a, 0.0F, 0.0698F, -0.0349F);
        lfHoofClaw02a.texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw02b = new ModelPart(this);
        lfHoofClaw02b.setPos(0.0F, 0.5F, -1.0F);
        lfHoofClaw02a.addChild(lfHoofClaw02b);
        setRotationAngle(lfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw02b.texOffs(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lForelegWool01 = new ModelPart(this);
        lForelegWool01.setPos(0.0F, 0.0F, 0.0F);
        lForeleg01.addChild(lForelegWool01);
        lForelegWool01.texOffs(16, 51).addBox(-0.6F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, 0.0F, false);

        lForelegWool02 = new ModelPart(this);
        lForelegWool02.setPos(1.9F, 6.8F, 0.6F);
        lForelegWool01.addChild(lForelegWool02);
        setRotationAngle(lForelegWool02, -0.0873F, 0.0F, -0.0698F);
        lForelegWool02.texOffs(16, 58).addBox(-2.01F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rForeleg01 = new ModelPart(this);
        rForeleg01.setPos(-2.5F, 0.5F, -4.0F);
        body.addChild(rForeleg01);
        setRotationAngle(rForeleg01, 0.0873F, 0.0F, -0.0698F);
        rForeleg01.texOffs(0, 33).addBox(-3.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, true);

        rForeleg02 = new ModelPart(this);
        rForeleg02.setPos(-1.5F, 6.5F, 0.1F);
        rForeleg01.addChild(rForeleg02);
        setRotationAngle(rForeleg02, -0.0873F, 0.0F, 0.0698F);
        rForeleg02.texOffs(0, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        rfHoofClaw01a = new ModelPart(this);
        rfHoofClaw01a.setPos(-0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw01a);
        setRotationAngle(rfHoofClaw01a, 0.0F, 0.1047F, 0.0349F);
        rfHoofClaw01a.texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw01b = new ModelPart(this);
        rfHoofClaw01b.setPos(0.0F, 0.5F, -1.0F);
        rfHoofClaw01a.addChild(rfHoofClaw01b);
        setRotationAngle(rfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw01b.texOffs(9, 48).addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw02a = new ModelPart(this);
        rfHoofClaw02a.setPos(0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw02a);
        setRotationAngle(rfHoofClaw02a, 0.0F, -0.0698F, 0.0349F);
        rfHoofClaw02a.texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw02b = new ModelPart(this);
        rfHoofClaw02b.setPos(0.0F, 0.5F, -1.0F);
        rfHoofClaw02a.addChild(rfHoofClaw02b);
        setRotationAngle(rfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw02b.texOffs(9, 48).addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lForelegWool2 = new ModelPart(this);
        lForelegWool2.setPos(0.0F, 0.0F, 0.0F);
        rForeleg01.addChild(lForelegWool2);
        lForelegWool2.texOffs(16, 51).addBox(-3.4F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, 0.0F, true);

        lForelegWool3 = new ModelPart(this);
        lForelegWool3.setPos(-1.9F, 6.8F, 0.6F);
        lForelegWool2.addChild(lForelegWool3);
        setRotationAngle(lForelegWool3, -0.0873F, 0.0F, 0.0698F);
        lForelegWool3.texOffs(16, 58).addBox(-0.99F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, 0.0F, true);

        neck = new ModelPart(this);
        neck.setPos(0.0F, -0.3F, -5.6F);
        body.addChild(neck);
        setRotationAngle(neck, -0.9599F, 0.0F, 0.0F);
        neck.texOffs(24, 22).addBox(-2.5F, -2.5F, -4.6F, 5.0F, 5.0F, 5.0F, -0.15F, false);

        head = new ModelPart(this);
        head.setPos(0.0F, -0.5F, -4.6F);
        neck.addChild(head);
        setRotationAngle(head, 0.9599F, 0.0F, 0.0F);
        head.texOffs(44, 22).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, -0.1F, false);

        jawUpper = new ModelPart(this);
        jawUpper.setPos(0.0F, 0.0F, -2.7F);
        head.addChild(jawUpper);
        jawUpper.texOffs(48, 0).addBox(-2.0F, 0.1F, -2.7F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        jawLower = new ModelPart(this);
        jawLower.setPos(0.0F, 1.5F, -2.6F);
        head.addChild(jawLower);
        jawLower.texOffs(46, 5).addBox(-2.0F, -0.6F, -2.8F, 4.0F, 1.0F, 3.0F, -0.1F, false);

        snout = new ModelPart(this);
        snout.setPos(0.0F, -1.1F, -2.0F);
        head.addChild(snout);
        setRotationAngle(snout, 0.6109F, 0.0F, 0.0F);
        snout.texOffs(32, 0).addBox(-2.0F, -2.1F, -3.6F, 4.0F, 3.0F, 4.0F, -0.2F, false);

        lEar = new ModelPart(this);
        lEar.setPos(2.0F, -2.1F, 0.7F);
        head.addChild(lEar);
        setRotationAngle(lEar, -0.5236F, 0.0F, 0.4363F);
        lEar.texOffs(32, 8).addBox(-0.3F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

        rEar2 = new ModelPart(this);
        rEar2.setPos(-2.0F, -2.1F, 0.7F);
        head.addChild(rEar2);
        setRotationAngle(rEar2, -0.5236F, 0.0F, -0.4363F);
        rEar2.texOffs(32, 8).addBox(-2.7F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        woolHead01 = new ModelPart(this);
        woolHead01.setPos(0.0F, -0.3F, -0.1F);
        head.addChild(woolHead01);
        woolHead01.texOffs(14, 52).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 6.0F, 4.0F, 0.0F, false);

        woolNeck = new ModelPart(this);
        woolNeck.setPos(0.0F, 0.5F, -1.9F);
        neck.addChild(woolNeck);
        woolNeck.texOffs(13, 50).addBox(-2.4F, -3.5F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);

        woolBody = new ModelPart(this);
        woolBody.setPos(0.0F, 0.9F, 3.5F);
        body.addChild(woolBody);
        woolBody.texOffs(1, 41).addBox(-4.5F, -4.5F, -9.1F, 9.0F, 9.0F, 14.0F, 0.0F, false);

        woolRear = new ModelPart(this);
        woolRear.setPos(0.0F, 0.3F, 2.3F);
        woolBody.addChild(woolRear);
        setRotationAngle(woolRear, -0.384F, 0.0F, 0.0F);
        woolRear.texOffs(34, 41).addBox(-4.0F, -5.3F, 0.4F, 8.0F, 8.0F, 5.0F, 0.0F, false);

        woolFront = new ModelPart(this);
        woolFront.setPos(0.0F, -0.4F, -10.9F);
        woolBody.addChild(woolFront);
        woolFront.texOffs(11, 52).addBox(-4.45F, -3.9F, -0.3F, 9.0F, 8.0F, 4.0F, -0.3F, false);
    }

        @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.tail.visible = !sheared && !young;
        this.woolHead01.visible = !sheared;
        this.woolBody.visible = !sheared;
        this.woolNeck.visible = !sheared;
        this.lHindlegWool.visible = !sheared;
        this.rHindlegWool.visible = !sheared;
        this.lForelegWool01.visible = !sheared;
        this.lForelegWool2.visible = !sheared;
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = rad(netHeadYaw) * 0.01F;
        this.head.xRot = rad(headPitch) * 0.01F + 0.9599F;
        this.lHindLeg01.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.2618F;
        this.rHindLeg01.xRot = Mth.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.2618F;
        this.lForeleg01.xRot = Mth.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.0873F;
        this.rForeleg01.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.0873F;
        this.sheared = entity.isSheared();
        if(!Minecraft.getInstance().isPaused()) {
            this.neck.xRot = entity.getHeadEatAngleScale(Minecraft.getInstance().getFrameTime()) - 0.9599F;
        }
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
