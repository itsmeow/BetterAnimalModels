package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.math.MathHelper;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep<T extends SheepEntity> extends Model<T> {

    private final ModelRenderer body;
    private final ModelRenderer rear;
    private final ModelRenderer lHindLeg01;
    private final ModelRenderer lHindlegWool;
    private final ModelRenderer lHindLeg02;
    private final ModelRenderer lhHoofClaw01a;
    private final ModelRenderer lhHoofClaw01b;
    private final ModelRenderer lhHoofClaw02a;
    private final ModelRenderer Box_r1;
    private final ModelRenderer lhHoofClaw02b;
    private final ModelRenderer rHindLeg01;
    private final ModelRenderer rHindlegWool;
    private final ModelRenderer rHindLeg02;
    private final ModelRenderer rhHoofClaw01a;
    private final ModelRenderer rhHoofClaw01b;
    private final ModelRenderer rhHoofClaw02a;
    private final ModelRenderer Box_r2;
    private final ModelRenderer rhHoofClaw02b;
    private final ModelRenderer tail;
    private final ModelRenderer lForeleg01;
    private final ModelRenderer lForeleg02;
    private final ModelRenderer lfHoofClaw01a;
    private final ModelRenderer lfHoofClaw01b;
    private final ModelRenderer lfHoofClaw02a;
    private final ModelRenderer lfHoofClaw02b;
    private final ModelRenderer lForelegWool01;
    private final ModelRenderer lForelegWool02;
    private final ModelRenderer rForeleg01;
    private final ModelRenderer rForeleg02;
    private final ModelRenderer rfHoofClaw01a;
    private final ModelRenderer rfHoofClaw01b;
    private final ModelRenderer rfHoofClaw02a;
    private final ModelRenderer rfHoofClaw02b;
    private final ModelRenderer lForelegWool2;
    private final ModelRenderer lForelegWool3;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jawUpper;
    private final ModelRenderer jawLower;
    private final ModelRenderer snout;
    private final ModelRenderer lEar;
    private final ModelRenderer rEar2;
    private final ModelRenderer woolHead01;
    private final ModelRenderer woolNeck;
    private final ModelRenderer woolBody;
    private final ModelRenderer woolRear;
    private final ModelRenderer woolFront;

    private boolean sheared;

    public ModelNewSheep() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 9.0F, -1.0F);
        body.setTextureOffset(2, 1).addBox(-4.0F, -3.0F, -6.9F, 8.0F, 7.0F, 14.0F, 0.0F, false);

        rear = new ModelRenderer(this);
        rear.setRotationPoint(0.0F, 0.0F, 6.9F);
        body.addChild(rear);
        setRotationAngle(rear, -0.384F, 0.0F, 0.0F);
        rear.setTextureOffset(0, 22).addBox(-3.5F, -3.0F, -1.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);

        lHindLeg01 = new ModelRenderer(this);
        lHindLeg01.setRotationPoint(1.6F, -0.4F, 1.9F);
        rear.addChild(lHindLeg01);
        setRotationAngle(lHindLeg01, 0.2618F, 0.0F, 0.0698F);
        lHindLeg01.setTextureOffset(0, 0).addBox(-0.1F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

        lHindlegWool = new ModelRenderer(this);
        lHindlegWool.setRotationPoint(1.8F, -0.2F, 0.0F);
        lHindLeg01.addChild(lHindlegWool);
        lHindlegWool.setTextureOffset(13, 49).addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        lHindLeg02 = new ModelRenderer(this);
        lHindLeg02.setRotationPoint(2.4F, 7.4F, 1.7F);
        lHindLeg01.addChild(lHindLeg02);
        setRotationAngle(lHindLeg02, -0.1309F, 0.0F, -0.0873F);
        lHindLeg02.setTextureOffset(0, 44).addBox(-1.3F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, 0.0F, false);

        lhHoofClaw01a = new ModelRenderer(this);
        lhHoofClaw01a.setRotationPoint(-1.0F, 7.0F, -0.5F);
        lHindLeg02.addChild(lhHoofClaw01a);
        setRotationAngle(lhHoofClaw01a, 0.3054F, 0.192F, 0.0349F);
        lhHoofClaw01a.setTextureOffset(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw01b = new ModelRenderer(this);
        lhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        lhHoofClaw01a.addChild(lhHoofClaw01b);
        setRotationAngle(lhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw01b.setTextureOffset(9, 48).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw02a = new ModelRenderer(this);
        lhHoofClaw02a.setRotationPoint(-0.0005F, 7.0147F, -0.4714F);
        lHindLeg02.addChild(lhHoofClaw02a);
        setRotationAngle(lhHoofClaw02a, 0.3054F, 0.0175F, 0.0349F);


        Box_r1 = new ModelRenderer(this);
        Box_r1.setRotationPoint(0.0005F, -0.0147F, -0.0286F);
        lhHoofClaw02a.addChild(Box_r1);
        setRotationAngle(Box_r1, 0.0F, -0.0873F, 0.0F);
        Box_r1.setTextureOffset(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lhHoofClaw02b = new ModelRenderer(this);
        lhHoofClaw02b.setRotationPoint(0.0005F, -0.0147F, -1.0286F);
        lhHoofClaw02a.addChild(lhHoofClaw02b);
        setRotationAngle(lhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw02b.setTextureOffset(9, 48).addBox(-0.3F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rHindLeg01 = new ModelRenderer(this);
        rHindLeg01.setRotationPoint(-1.6F, -0.4F, 1.9F);
        rear.addChild(rHindLeg01);
        setRotationAngle(rHindLeg01, 0.2618F, 0.0F, -0.0698F);
        rHindLeg01.setTextureOffset(0, 0).addBox(-3.9F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);

        rHindlegWool = new ModelRenderer(this);
        rHindlegWool.setRotationPoint(-1.8F, -0.2F, 0.0F);
        rHindLeg01.addChild(rHindlegWool);
        rHindlegWool.setTextureOffset(13, 49).addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        rHindLeg02 = new ModelRenderer(this);
        rHindLeg02.setRotationPoint(-2.4F, 7.4F, 1.7F);
        rHindLeg01.addChild(rHindLeg02);
        setRotationAngle(rHindLeg02, -0.1309F, 0.0F, 0.0873F);
        rHindLeg02.setTextureOffset(0, 44).addBox(-0.7F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, 0.0F, true);

        rhHoofClaw01a = new ModelRenderer(this);
        rhHoofClaw01a.setRotationPoint(1.0F, 7.0F, -0.5F);
        rHindLeg02.addChild(rhHoofClaw01a);
        setRotationAngle(rhHoofClaw01a, 0.3054F, -0.192F, -0.0349F);
        rhHoofClaw01a.setTextureOffset(9, 44).addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw01b = new ModelRenderer(this);
        rhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        rhHoofClaw01a.addChild(rhHoofClaw01b);
        setRotationAngle(rhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw01b.setTextureOffset(9, 48).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw02a = new ModelRenderer(this);
        rhHoofClaw02a.setRotationPoint(0.0005F, 7.0147F, -0.4714F);
        rHindLeg02.addChild(rhHoofClaw02a);
        setRotationAngle(rhHoofClaw02a, 0.3054F, -0.0175F, -0.0349F);


        Box_r2 = new ModelRenderer(this);
        Box_r2.setRotationPoint(-0.0005F, -0.0147F, -0.0286F);
        rhHoofClaw02a.addChild(Box_r2);
        setRotationAngle(Box_r2, 0.0F, 0.0873F, 0.0F);
        Box_r2.setTextureOffset(9, 44).addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        rhHoofClaw02b = new ModelRenderer(this);
        rhHoofClaw02b.setRotationPoint(-0.0005F, -0.0147F, -1.0286F);
        rhHoofClaw02a.addChild(rhHoofClaw02b);
        setRotationAngle(rhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw02b.setTextureOffset(9, 48).addBox(-0.7F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, -1.1F, 2.8F);
        rear.addChild(tail);
        setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.setTextureOffset(48, 11).addBox(-1.5F, -0.6F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        lForeleg01 = new ModelRenderer(this);
        lForeleg01.setRotationPoint(2.5F, 0.5F, -4.0F);
        body.addChild(lForeleg01);
        setRotationAngle(lForeleg01, 0.0873F, 0.0F, 0.0698F);
        lForeleg01.setTextureOffset(0, 33).addBox(0.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        lForeleg02 = new ModelRenderer(this);
        lForeleg02.setRotationPoint(1.5F, 6.5F, 0.1F);
        lForeleg01.addChild(lForeleg02);
        setRotationAngle(lForeleg02, -0.0873F, 0.0F, -0.0698F);
        lForeleg02.setTextureOffset(0, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        lfHoofClaw01a = new ModelRenderer(this);
        lfHoofClaw01a.setRotationPoint(0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw01a);
        setRotationAngle(lfHoofClaw01a, 0.0F, -0.1047F, -0.0349F);
        lfHoofClaw01a.setTextureOffset(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw01b = new ModelRenderer(this);
        lfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw01a.addChild(lfHoofClaw01b);
        setRotationAngle(lfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw01b.setTextureOffset(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw02a = new ModelRenderer(this);
        lfHoofClaw02a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw02a);
        setRotationAngle(lfHoofClaw02a, 0.0F, 0.0698F, -0.0349F);
        lfHoofClaw02a.setTextureOffset(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lfHoofClaw02b = new ModelRenderer(this);
        lfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw02a.addChild(lfHoofClaw02b);
        setRotationAngle(lfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw02b.setTextureOffset(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        lForelegWool01 = new ModelRenderer(this);
        lForelegWool01.setRotationPoint(0.0F, 0.0F, 0.0F);
        lForeleg01.addChild(lForelegWool01);
        lForelegWool01.setTextureOffset(16, 51).addBox(-0.6F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, 0.0F, false);

        lForelegWool02 = new ModelRenderer(this);
        lForelegWool02.setRotationPoint(1.9F, 6.8F, 0.6F);
        lForelegWool01.addChild(lForelegWool02);
        setRotationAngle(lForelegWool02, -0.0873F, 0.0F, -0.0698F);
        lForelegWool02.setTextureOffset(16, 58).addBox(-2.01F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rForeleg01 = new ModelRenderer(this);
        rForeleg01.setRotationPoint(-2.5F, 0.5F, -4.0F);
        body.addChild(rForeleg01);
        setRotationAngle(rForeleg01, 0.0873F, 0.0F, -0.0698F);
        rForeleg01.setTextureOffset(0, 33).addBox(-3.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, true);

        rForeleg02 = new ModelRenderer(this);
        rForeleg02.setRotationPoint(-1.5F, 6.5F, 0.1F);
        rForeleg01.addChild(rForeleg02);
        setRotationAngle(rForeleg02, -0.0873F, 0.0F, 0.0698F);
        rForeleg02.setTextureOffset(0, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        rfHoofClaw01a = new ModelRenderer(this);
        rfHoofClaw01a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw01a);
        setRotationAngle(rfHoofClaw01a, 0.0F, 0.1047F, 0.0349F);
        rfHoofClaw01a.setTextureOffset(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw01b = new ModelRenderer(this);
        rfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw01a.addChild(rfHoofClaw01b);
        setRotationAngle(rfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw01b.setTextureOffset(9, 48).addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw02a = new ModelRenderer(this);
        rfHoofClaw02a.setRotationPoint(0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw02a);
        setRotationAngle(rfHoofClaw02a, 0.0F, -0.0698F, 0.0349F);
        rfHoofClaw02a.setTextureOffset(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        rfHoofClaw02b = new ModelRenderer(this);
        rfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw02a.addChild(rfHoofClaw02b);
        setRotationAngle(rfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw02b.setTextureOffset(9, 48).addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        lForelegWool2 = new ModelRenderer(this);
        lForelegWool2.setRotationPoint(0.0F, 0.0F, 0.0F);
        rForeleg01.addChild(lForelegWool2);
        lForelegWool2.setTextureOffset(16, 51).addBox(-3.4F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, 0.0F, true);

        lForelegWool3 = new ModelRenderer(this);
        lForelegWool3.setRotationPoint(-1.9F, 6.8F, 0.6F);
        lForelegWool2.addChild(lForelegWool3);
        setRotationAngle(lForelegWool3, -0.0873F, 0.0F, 0.0698F);
        lForelegWool3.setTextureOffset(16, 58).addBox(-0.99F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, 0.0F, true);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -0.3F, -5.6F);
        body.addChild(neck);
        setRotationAngle(neck, -0.9599F, 0.0F, 0.0F);
        neck.setTextureOffset(24, 22).addBox(-2.5F, -2.5F, -4.6F, 5.0F, 5.0F, 5.0F, -0.15F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -0.5F, -4.6F);
        neck.addChild(head);
        setRotationAngle(head, 0.9599F, 0.0F, 0.0F);
        head.setTextureOffset(44, 22).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, -0.1F, false);

        jawUpper = new ModelRenderer(this);
        jawUpper.setRotationPoint(0.0F, 0.0F, -2.7F);
        head.addChild(jawUpper);
        jawUpper.setTextureOffset(48, 0).addBox(-2.0F, 0.1F, -2.7F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        jawLower = new ModelRenderer(this);
        jawLower.setRotationPoint(0.0F, 1.5F, -2.6F);
        head.addChild(jawLower);
        jawLower.setTextureOffset(46, 5).addBox(-2.0F, -0.6F, -2.8F, 4.0F, 1.0F, 3.0F, -0.1F, false);

        snout = new ModelRenderer(this);
        snout.setRotationPoint(0.0F, -1.1F, -2.0F);
        head.addChild(snout);
        setRotationAngle(snout, 0.6109F, 0.0F, 0.0F);
        snout.setTextureOffset(32, 0).addBox(-2.0F, -2.1F, -3.6F, 4.0F, 3.0F, 4.0F, -0.2F, false);

        lEar = new ModelRenderer(this);
        lEar.setRotationPoint(2.0F, -2.1F, 0.7F);
        head.addChild(lEar);
        setRotationAngle(lEar, -0.5236F, 0.0F, 0.4363F);
        lEar.setTextureOffset(32, 8).addBox(-0.3F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

        rEar2 = new ModelRenderer(this);
        rEar2.setRotationPoint(-2.0F, -2.1F, 0.7F);
        head.addChild(rEar2);
        setRotationAngle(rEar2, -0.5236F, 0.0F, -0.4363F);
        rEar2.setTextureOffset(32, 8).addBox(-2.7F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        woolHead01 = new ModelRenderer(this);
        woolHead01.setRotationPoint(0.0F, -0.3F, -0.1F);
        head.addChild(woolHead01);
        woolHead01.setTextureOffset(14, 52).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 6.0F, 4.0F, 0.0F, false);

        woolNeck = new ModelRenderer(this);
        woolNeck.setRotationPoint(0.0F, 0.5F, -1.9F);
        neck.addChild(woolNeck);
        woolNeck.setTextureOffset(13, 50).addBox(-2.4F, -3.5F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);

        woolBody = new ModelRenderer(this);
        woolBody.setRotationPoint(0.0F, 0.9F, 3.5F);
        body.addChild(woolBody);
        woolBody.setTextureOffset(1, 41).addBox(-4.5F, -4.5F, -9.1F, 9.0F, 9.0F, 14.0F, 0.0F, false);

        woolRear = new ModelRenderer(this);
        woolRear.setRotationPoint(0.0F, 0.3F, 2.3F);
        woolBody.addChild(woolRear);
        setRotationAngle(woolRear, -0.384F, 0.0F, 0.0F);
        woolRear.setTextureOffset(34, 41).addBox(-4.0F, -5.3F, 0.4F, 8.0F, 8.0F, 5.0F, 0.0F, false);

        woolFront = new ModelRenderer(this);
        woolFront.setRotationPoint(0.0F, -0.4F, -10.9F);
        woolBody.addChild(woolFront);
        woolFront.setTextureOffset(11, 52).addBox(-4.45F, -3.9F, -0.3F, 9.0F, 8.0F, 4.0F, -0.3F, false);
    }

        @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.tail.showModel = !sheared && !isChild;
        this.woolHead01.showModel = !sheared;
        this.woolBody.showModel = !sheared;
        this.woolNeck.showModel = !sheared;
        this.lHindlegWool.showModel = !sheared;
        this.rHindlegWool.showModel = !sheared;
        this.lForelegWool01.showModel = !sheared;
        this.lForelegWool2.showModel = !sheared;
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleY = rad(netHeadYaw) * 0.01F;
        this.head.rotateAngleX = rad(headPitch) * 0.01F + 0.9599F;
        this.lHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.2618F;
        this.rHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.2618F;
        this.lForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.0873F;
        this.rForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.0873F;
        this.sheared = entity.getSheared();
        if(!Minecraft.getInstance().isGamePaused()) {
            this.neck.rotateAngleX = entity.getHeadRotationAngleX(Minecraft.getInstance().getRenderPartialTicks()) - 0.9599F;
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
