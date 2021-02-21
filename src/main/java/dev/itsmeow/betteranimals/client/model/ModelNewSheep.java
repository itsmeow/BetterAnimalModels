package dev.itsmeow.betteranimals.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.math.MathHelper;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep extends Model {

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

    public ModelNewSheep() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 9.0F, -1.0F);
        body.cubeList.add(new ModelBox(body, 2, 1, -4.0F, -3.0F, -6.9F, 8, 7, 14, 0.0F, false));

        rear = new ModelRenderer(this);
        rear.setRotationPoint(0.0F, 0.0F, 6.9F);
        body.addChild(rear);
        setRotationAngle(rear, -0.384F, 0.0F, 0.0F);
        rear.cubeList.add(new ModelBox(rear, 0, 22, -3.5F, -3.0F, -1.0F, 7, 6, 5, 0.0F, false));

        lHindLeg01 = new ModelRenderer(this);
        lHindLeg01.setRotationPoint(1.6F, -0.4F, 1.9F);
        rear.addChild(lHindLeg01);
        setRotationAngle(lHindLeg01, 0.2618F, 0.0F, 0.0698F);
        lHindLeg01.cubeList.add(new ModelBox(lHindLeg01, 0, 0, -0.1F, -0.4F, -2.0F, 4, 9, 4, 0.0F, false));

        lHindlegWool = new ModelRenderer(this);
        lHindlegWool.setRotationPoint(1.8F, -0.2F, 0.0F);
        lHindLeg01.addChild(lHindlegWool);
        lHindlegWool.cubeList.add(new ModelBox(lHindlegWool, 13, 49, -2.5F, -1.0F, -2.8F, 5, 10, 5, 0.0F, false));

        lHindLeg02 = new ModelRenderer(this);
        lHindLeg02.setRotationPoint(2.4F, 7.4F, 1.7F);
        lHindLeg01.addChild(lHindLeg02);
        setRotationAngle(lHindLeg02, -0.1309F, 0.0F, -0.0873F);
        lHindLeg02.cubeList.add(new ModelBox(lHindLeg02, 0, 44, -1.3F, -1.5F, -0.8F, 2, 9, 2, 0.0F, false));

        lhHoofClaw01a = new ModelRenderer(this);
        lhHoofClaw01a.setRotationPoint(-1.0F, 7.0F, -0.5F);
        lHindLeg02.addChild(lhHoofClaw01a);
        setRotationAngle(lhHoofClaw01a, 0.3054F, 0.192F, 0.0349F);
        lhHoofClaw01a.cubeList.add(new ModelBox(lhHoofClaw01a, 9, 44, -0.4F, -0.3F, -1.3F, 1, 1, 2, 0.0F, true));

        lhHoofClaw01b = new ModelRenderer(this);
        lhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        lhHoofClaw01a.addChild(lhHoofClaw01b);
        setRotationAngle(lhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw01b.cubeList.add(new ModelBox(lhHoofClaw01b, 9, 48, -0.5F, -0.7F, -0.4F, 1, 1, 2, 0.0F, true));

        lhHoofClaw02a = new ModelRenderer(this);
        lhHoofClaw02a.setRotationPoint(-0.0005F, 7.0147F, -0.4714F);
        lHindLeg02.addChild(lhHoofClaw02a);
        setRotationAngle(lhHoofClaw02a, 0.3054F, 0.0175F, 0.0349F);
        

        Box_r1 = new ModelRenderer(this);
        Box_r1.setRotationPoint(0.0005F, -0.0147F, -0.0286F);
        lhHoofClaw02a.addChild(Box_r1);
        setRotationAngle(Box_r1, 0.0F, -0.0873F, 0.0F);
        Box_r1.cubeList.add(new ModelBox(Box_r1, 9, 44, -0.4F, -0.3F, -1.3F, 1, 1, 2, 0.0F, true));

        lhHoofClaw02b = new ModelRenderer(this);
        lhHoofClaw02b.setRotationPoint(0.0005F, -0.0147F, -1.0286F);
        lhHoofClaw02a.addChild(lhHoofClaw02b);
        setRotationAngle(lhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw02b.cubeList.add(new ModelBox(lhHoofClaw02b, 9, 48, -0.3F, -0.7F, -0.4F, 1, 1, 2, 0.0F, true));

        rHindLeg01 = new ModelRenderer(this);
        rHindLeg01.setRotationPoint(-1.6F, -0.4F, 1.9F);
        rear.addChild(rHindLeg01);
        setRotationAngle(rHindLeg01, 0.2618F, 0.0F, -0.0698F);
        rHindLeg01.cubeList.add(new ModelBox(rHindLeg01, 0, 0, -3.9F, -0.4F, -2.0F, 4, 9, 4, 0.0F, true));

        rHindlegWool = new ModelRenderer(this);
        rHindlegWool.setRotationPoint(-1.8F, -0.2F, 0.0F);
        rHindLeg01.addChild(rHindlegWool);
        rHindlegWool.cubeList.add(new ModelBox(rHindlegWool, 13, 49, -2.5F, -1.0F, -2.8F, 5, 10, 5, 0.0F, true));

        rHindLeg02 = new ModelRenderer(this);
        rHindLeg02.setRotationPoint(-2.4F, 7.4F, 1.7F);
        rHindLeg01.addChild(rHindLeg02);
        setRotationAngle(rHindLeg02, -0.1309F, 0.0F, 0.0873F);
        rHindLeg02.cubeList.add(new ModelBox(rHindLeg02, 0, 44, -0.7F, -1.5F, -0.8F, 2, 9, 2, 0.0F, true));

        rhHoofClaw01a = new ModelRenderer(this);
        rhHoofClaw01a.setRotationPoint(1.0F, 7.0F, -0.5F);
        rHindLeg02.addChild(rhHoofClaw01a);
        setRotationAngle(rhHoofClaw01a, 0.3054F, -0.192F, -0.0349F);
        rhHoofClaw01a.cubeList.add(new ModelBox(rhHoofClaw01a, 9, 44, -0.6F, -0.3F, -1.3F, 1, 1, 2, 0.0F, false));

        rhHoofClaw01b = new ModelRenderer(this);
        rhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        rhHoofClaw01a.addChild(rhHoofClaw01b);
        setRotationAngle(rhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw01b.cubeList.add(new ModelBox(rhHoofClaw01b, 9, 48, -0.5F, -0.7F, -0.4F, 1, 1, 2, 0.0F, false));

        rhHoofClaw02a = new ModelRenderer(this);
        rhHoofClaw02a.setRotationPoint(0.0005F, 7.0147F, -0.4714F);
        rHindLeg02.addChild(rhHoofClaw02a);
        setRotationAngle(rhHoofClaw02a, 0.3054F, -0.0175F, -0.0349F);
        

        Box_r2 = new ModelRenderer(this);
        Box_r2.setRotationPoint(-0.0005F, -0.0147F, -0.0286F);
        rhHoofClaw02a.addChild(Box_r2);
        setRotationAngle(Box_r2, 0.0F, 0.0873F, 0.0F);
        Box_r2.cubeList.add(new ModelBox(Box_r2, 9, 44, -0.6F, -0.3F, -1.3F, 1, 1, 2, 0.0F, false));

        rhHoofClaw02b = new ModelRenderer(this);
        rhHoofClaw02b.setRotationPoint(-0.0005F, -0.0147F, -1.0286F);
        rhHoofClaw02a.addChild(rhHoofClaw02b);
        setRotationAngle(rhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw02b.cubeList.add(new ModelBox(rhHoofClaw02b, 9, 48, -0.7F, -0.7F, -0.4F, 1, 1, 2, 0.0F, false));

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, -1.1F, 2.8F);
        rear.addChild(tail);
        setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.cubeList.add(new ModelBox(tail, 48, 11, -1.5F, -0.6F, 0.0F, 3, 4, 2, 0.0F, false));

        lForeleg01 = new ModelRenderer(this);
        lForeleg01.setRotationPoint(2.5F, 0.5F, -4.0F);
        body.addChild(lForeleg01);
        setRotationAngle(lForeleg01, 0.0873F, 0.0F, 0.0698F);
        lForeleg01.cubeList.add(new ModelBox(lForeleg01, 0, 33, 0.0F, -1.4F, -1.5F, 3, 8, 3, 0.0F, false));

        lForeleg02 = new ModelRenderer(this);
        lForeleg02.setRotationPoint(1.5F, 6.5F, 0.1F);
        lForeleg01.addChild(lForeleg02);
        setRotationAngle(lForeleg02, -0.0873F, 0.0F, -0.0698F);
        lForeleg02.cubeList.add(new ModelBox(lForeleg02, 0, 44, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

        lfHoofClaw01a = new ModelRenderer(this);
        lfHoofClaw01a.setRotationPoint(0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw01a);
        setRotationAngle(lfHoofClaw01a, 0.0F, -0.1047F, -0.0349F);
        lfHoofClaw01a.cubeList.add(new ModelBox(lfHoofClaw01a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        lfHoofClaw01b = new ModelRenderer(this);
        lfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw01a.addChild(lfHoofClaw01b);
        setRotationAngle(lfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw01b.cubeList.add(new ModelBox(lfHoofClaw01b, 9, 48, -0.49F, -1.1F, -0.3F, 1, 1, 2, 0.0F, false));

        lfHoofClaw02a = new ModelRenderer(this);
        lfHoofClaw02a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw02a);
        setRotationAngle(lfHoofClaw02a, 0.0F, 0.0698F, -0.0349F);
        lfHoofClaw02a.cubeList.add(new ModelBox(lfHoofClaw02a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        lfHoofClaw02b = new ModelRenderer(this);
        lfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw02a.addChild(lfHoofClaw02b);
        setRotationAngle(lfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw02b.cubeList.add(new ModelBox(lfHoofClaw02b, 9, 48, -0.49F, -1.1F, -0.3F, 1, 1, 2, 0.0F, false));

        lForelegWool01 = new ModelRenderer(this);
        lForelegWool01.setRotationPoint(0.0F, 0.0F, 0.0F);
        lForeleg01.addChild(lForelegWool01);
        lForelegWool01.cubeList.add(new ModelBox(lForelegWool01, 16, 51, -0.6F, -2.3F, -2.1F, 4, 9, 4, 0.0F, false));

        lForelegWool02 = new ModelRenderer(this);
        lForelegWool02.setRotationPoint(1.9F, 6.8F, 0.6F);
        lForelegWool01.addChild(lForelegWool02);
        setRotationAngle(lForelegWool02, -0.0873F, 0.0F, -0.0698F);
        lForelegWool02.cubeList.add(new ModelBox(lForelegWool02, 16, 58, -2.01F, -0.1F, -2.1F, 3, 2, 3, 0.0F, false));

        rForeleg01 = new ModelRenderer(this);
        rForeleg01.setRotationPoint(-2.5F, 0.5F, -4.0F);
        body.addChild(rForeleg01);
        setRotationAngle(rForeleg01, 0.0873F, 0.0F, -0.0698F);
        rForeleg01.cubeList.add(new ModelBox(rForeleg01, 0, 33, -3.0F, -1.4F, -1.5F, 3, 8, 3, 0.0F, true));

        rForeleg02 = new ModelRenderer(this);
        rForeleg02.setRotationPoint(-1.5F, 6.5F, 0.1F);
        rForeleg01.addChild(rForeleg02);
        setRotationAngle(rForeleg02, -0.0873F, 0.0F, 0.0698F);
        rForeleg02.cubeList.add(new ModelBox(rForeleg02, 0, 44, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));

        rfHoofClaw01a = new ModelRenderer(this);
        rfHoofClaw01a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw01a);
        setRotationAngle(rfHoofClaw01a, 0.0F, 0.1047F, 0.0349F);
        rfHoofClaw01a.cubeList.add(new ModelBox(rfHoofClaw01a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));

        rfHoofClaw01b = new ModelRenderer(this);
        rfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw01a.addChild(rfHoofClaw01b);
        setRotationAngle(rfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw01b.cubeList.add(new ModelBox(rfHoofClaw01b, 9, 48, -0.51F, -1.1F, -0.3F, 1, 1, 2, 0.0F, true));

        rfHoofClaw02a = new ModelRenderer(this);
        rfHoofClaw02a.setRotationPoint(0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw02a);
        setRotationAngle(rfHoofClaw02a, 0.0F, -0.0698F, 0.0349F);
        rfHoofClaw02a.cubeList.add(new ModelBox(rfHoofClaw02a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));

        rfHoofClaw02b = new ModelRenderer(this);
        rfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw02a.addChild(rfHoofClaw02b);
        setRotationAngle(rfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw02b.cubeList.add(new ModelBox(rfHoofClaw02b, 9, 48, -0.51F, -1.1F, -0.3F, 1, 1, 2, 0.0F, true));

        lForelegWool2 = new ModelRenderer(this);
        lForelegWool2.setRotationPoint(0.0F, 0.0F, 0.0F);
        rForeleg01.addChild(lForelegWool2);
        lForelegWool2.cubeList.add(new ModelBox(lForelegWool2, 16, 51, -3.4F, -2.3F, -2.1F, 4, 9, 4, 0.0F, true));

        lForelegWool3 = new ModelRenderer(this);
        lForelegWool3.setRotationPoint(-1.9F, 6.8F, 0.6F);
        lForelegWool2.addChild(lForelegWool3);
        setRotationAngle(lForelegWool3, -0.0873F, 0.0F, 0.0698F);
        lForelegWool3.cubeList.add(new ModelBox(lForelegWool3, 16, 58, -0.99F, -0.1F, -2.1F, 3, 2, 3, 0.0F, true));

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -0.3F, -5.6F);
        body.addChild(neck);
        setRotationAngle(neck, -0.9599F, 0.0F, 0.0F);
        neck.cubeList.add(new ModelBox(neck, 24, 22, -2.5F, -2.5F, -4.6F, 5, 5, 5, -0.15F, false));

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -0.5F, -4.6F);
        neck.addChild(head);
        setRotationAngle(head, 0.9599F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 44, 22, -2.5F, -3.0F, -3.0F, 5, 5, 5, -0.1F, false));

        jawUpper = new ModelRenderer(this);
        jawUpper.setRotationPoint(0.0F, 0.0F, -2.7F);
        head.addChild(jawUpper);
        jawUpper.cubeList.add(new ModelBox(jawUpper, 48, 0, -2.0F, 0.1F, -2.7F, 4, 1, 3, 0.0F, false));

        jawLower = new ModelRenderer(this);
        jawLower.setRotationPoint(0.0F, 1.5F, -2.6F);
        head.addChild(jawLower);
        jawLower.cubeList.add(new ModelBox(jawLower, 46, 5, -2.0F, -0.6F, -2.8F, 4, 1, 3, -0.1F, false));

        snout = new ModelRenderer(this);
        snout.setRotationPoint(0.0F, -1.1F, -2.0F);
        head.addChild(snout);
        setRotationAngle(snout, 0.6109F, 0.0F, 0.0F);
        snout.cubeList.add(new ModelBox(snout, 32, 0, -2.0F, -2.1F, -3.6F, 4, 3, 4, -0.2F, false));

        lEar = new ModelRenderer(this);
        lEar.setRotationPoint(2.0F, -2.1F, 0.7F);
        head.addChild(lEar);
        setRotationAngle(lEar, -0.5236F, 0.0F, 0.4363F);
        lEar.cubeList.add(new ModelBox(lEar, 32, 8, -0.3F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        rEar2 = new ModelRenderer(this);
        rEar2.setRotationPoint(-2.0F, -2.1F, 0.7F);
        head.addChild(rEar2);
        setRotationAngle(rEar2, -0.5236F, 0.0F, -0.4363F);
        rEar2.cubeList.add(new ModelBox(rEar2, 32, 8, -2.7F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        woolHead01 = new ModelRenderer(this);
        woolHead01.setRotationPoint(0.0F, -0.3F, -0.1F);
        head.addChild(woolHead01);
        woolHead01.cubeList.add(new ModelBox(woolHead01, 14, 52, -3.0F, -3.0F, -1.5F, 6, 6, 4, 0.0F, false));

        woolNeck = new ModelRenderer(this);
        woolNeck.setRotationPoint(0.0F, 0.5F, -1.9F);
        neck.addChild(woolNeck);
        woolNeck.cubeList.add(new ModelBox(woolNeck, 13, 50, -2.4F, -3.5F, -3.0F, 5, 6, 6, 0.0F, false));

        woolBody = new ModelRenderer(this);
        woolBody.setRotationPoint(0.0F, 0.9F, 3.5F);
        body.addChild(woolBody);
        woolBody.cubeList.add(new ModelBox(woolBody, 1, 41, -4.5F, -4.5F, -9.1F, 9, 9, 14, 0.0F, false));

        woolRear = new ModelRenderer(this);
        woolRear.setRotationPoint(0.0F, 0.3F, 2.3F);
        woolBody.addChild(woolRear);
        setRotationAngle(woolRear, -0.384F, 0.0F, 0.0F);
        woolRear.cubeList.add(new ModelBox(woolRear, 34, 41, -4.0F, -5.3F, 0.4F, 8, 8, 5, 0.0F, false));

        woolFront = new ModelRenderer(this);
        woolFront.setRotationPoint(0.0F, -0.4F, -10.9F);
        woolBody.addChild(woolFront);
        woolFront.cubeList.add(new ModelBox(woolFront, 11, 52, -4.45F, -3.9F, -0.3F, 9, 8, 4, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        boolean sheared = entity instanceof EntitySheep && (((EntitySheep) entity).getSheared());
        this.tail.showModel = !sheared && !((entity instanceof EntityAgeable) && ((EntityAgeable)entity).isChild());
        this.woolHead01.showModel = !sheared;
        this.woolBody.showModel = !sheared;
        this.woolNeck.showModel = !sheared;
        this.lHindlegWool.showModel = !sheared;
        this.rHindlegWool.showModel = !sheared;
        this.lForelegWool01.showModel = !sheared;
        this.lForelegWool2.showModel = !sheared;
        this.body.render(f5);
    }

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {		
	    this.head.rotateAngleY = (float) Math.toRadians(netHeadYaw) * 0.01F;
        this.head.rotateAngleX = (float) Math.toRadians(headPitch) * 0.01F + 0.9599F;
        this.lHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.2618F;
        this.rHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.2618F;
        this.lForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.0873F;
        this.rForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.0873F;
        if(entity instanceof EntitySheep && !Minecraft.getMinecraft().isGamePaused()) {
            this.neck.rotateAngleX = ((EntitySheep) entity).getHeadRotationAngleX(Minecraft.getMinecraft().getRenderPartialTicks()) - 0.9599F;
        } else {
            this.neck.rotateAngleX = -0.9599F;
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
