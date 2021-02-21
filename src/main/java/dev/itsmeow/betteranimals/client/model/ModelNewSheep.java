package dev.itsmeow.betteranimals.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.math.MathHelper;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep<T extends SheepEntity> extends Model<T> {

    private final RendererModel body;
    private final RendererModel rear;
    private final RendererModel lHindLeg01;
    private final RendererModel lHindlegWool;
    private final RendererModel lHindLeg02;
    private final RendererModel lhHoofClaw01a;
    private final RendererModel lhHoofClaw01b;
    private final RendererModel lhHoofClaw02a;
    private final RendererModel Box_r1;
    private final RendererModel lhHoofClaw02b;
    private final RendererModel rHindLeg01;
    private final RendererModel rHindlegWool;
    private final RendererModel rHindLeg02;
    private final RendererModel rhHoofClaw01a;
    private final RendererModel rhHoofClaw01b;
    private final RendererModel rhHoofClaw02a;
    private final RendererModel Box_r2;
    private final RendererModel rhHoofClaw02b;
    private final RendererModel tail;
    private final RendererModel lForeleg01;
    private final RendererModel lForeleg02;
    private final RendererModel lfHoofClaw01a;
    private final RendererModel lfHoofClaw01b;
    private final RendererModel lfHoofClaw02a;
    private final RendererModel lfHoofClaw02b;
    private final RendererModel lForelegWool01;
    private final RendererModel lForelegWool02;
    private final RendererModel rForeleg01;
    private final RendererModel rForeleg02;
    private final RendererModel rfHoofClaw01a;
    private final RendererModel rfHoofClaw01b;
    private final RendererModel rfHoofClaw02a;
    private final RendererModel rfHoofClaw02b;
    private final RendererModel lForelegWool2;
    private final RendererModel lForelegWool3;
    private final RendererModel neck;
    private final RendererModel head;
    private final RendererModel jawUpper;
    private final RendererModel jawLower;
    private final RendererModel snout;
    private final RendererModel lEar;
    private final RendererModel rEar2;
    private final RendererModel woolHead01;
    private final RendererModel woolNeck;
    private final RendererModel woolBody;
    private final RendererModel woolRear;
    private final RendererModel woolFront;

    public ModelNewSheep() {
        textureWidth = 64;
        textureHeight = 64;

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 9.0F, -1.0F);
        body.cubeList.add(new ModelBox(body, 2, 1, -4.0F, -3.0F, -6.9F, 8, 7, 14, 0.0F, false));

        rear = new RendererModel(this);
        rear.setRotationPoint(0.0F, 0.0F, 6.9F);
        body.addChild(rear);
        setRotationAngle(rear, -0.384F, 0.0F, 0.0F);
        rear.cubeList.add(new ModelBox(rear, 0, 22, -3.5F, -3.0F, -1.0F, 7, 6, 5, 0.0F, false));

        lHindLeg01 = new RendererModel(this);
        lHindLeg01.setRotationPoint(1.6F, -0.4F, 1.9F);
        rear.addChild(lHindLeg01);
        setRotationAngle(lHindLeg01, 0.2618F, 0.0F, 0.0698F);
        lHindLeg01.cubeList.add(new ModelBox(lHindLeg01, 0, 0, -0.1F, -0.4F, -2.0F, 4, 9, 4, 0.0F, false));

        lHindlegWool = new RendererModel(this);
        lHindlegWool.setRotationPoint(1.8F, -0.2F, 0.0F);
        lHindLeg01.addChild(lHindlegWool);
        lHindlegWool.cubeList.add(new ModelBox(lHindlegWool, 13, 49, -2.5F, -1.0F, -2.8F, 5, 10, 5, 0.0F, false));

        lHindLeg02 = new RendererModel(this);
        lHindLeg02.setRotationPoint(2.4F, 7.4F, 1.7F);
        lHindLeg01.addChild(lHindLeg02);
        setRotationAngle(lHindLeg02, -0.1309F, 0.0F, -0.0873F);
        lHindLeg02.cubeList.add(new ModelBox(lHindLeg02, 0, 44, -1.3F, -1.5F, -0.8F, 2, 9, 2, 0.0F, false));

        lhHoofClaw01a = new RendererModel(this);
        lhHoofClaw01a.setRotationPoint(-1.0F, 7.0F, -0.5F);
        lHindLeg02.addChild(lhHoofClaw01a);
        setRotationAngle(lhHoofClaw01a, 0.3054F, 0.192F, 0.0349F);
        lhHoofClaw01a.cubeList.add(new ModelBox(lhHoofClaw01a, 9, 44, -0.4F, -0.3F, -1.3F, 1, 1, 2, 0.0F, true));

        lhHoofClaw01b = new RendererModel(this);
        lhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        lhHoofClaw01a.addChild(lhHoofClaw01b);
        setRotationAngle(lhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw01b.cubeList.add(new ModelBox(lhHoofClaw01b, 9, 48, -0.5F, -0.7F, -0.4F, 1, 1, 2, 0.0F, true));

        lhHoofClaw02a = new RendererModel(this);
        lhHoofClaw02a.setRotationPoint(-0.0005F, 7.0147F, -0.4714F);
        lHindLeg02.addChild(lhHoofClaw02a);
        setRotationAngle(lhHoofClaw02a, 0.3054F, 0.0175F, 0.0349F);


        Box_r1 = new RendererModel(this);
        Box_r1.setRotationPoint(0.0005F, -0.0147F, -0.0286F);
        lhHoofClaw02a.addChild(Box_r1);
        setRotationAngle(Box_r1, 0.0F, -0.0873F, 0.0F);
        Box_r1.cubeList.add(new ModelBox(Box_r1, 9, 44, -0.4F, -0.3F, -1.3F, 1, 1, 2, 0.0F, true));

        lhHoofClaw02b = new RendererModel(this);
        lhHoofClaw02b.setRotationPoint(0.0005F, -0.0147F, -1.0286F);
        lhHoofClaw02a.addChild(lhHoofClaw02b);
        setRotationAngle(lhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lhHoofClaw02b.cubeList.add(new ModelBox(lhHoofClaw02b, 9, 48, -0.3F, -0.7F, -0.4F, 1, 1, 2, 0.0F, true));

        rHindLeg01 = new RendererModel(this);
        rHindLeg01.setRotationPoint(-1.6F, -0.4F, 1.9F);
        rear.addChild(rHindLeg01);
        setRotationAngle(rHindLeg01, 0.2618F, 0.0F, -0.0698F);
        rHindLeg01.cubeList.add(new ModelBox(rHindLeg01, 0, 0, -3.9F, -0.4F, -2.0F, 4, 9, 4, 0.0F, true));

        rHindlegWool = new RendererModel(this);
        rHindlegWool.setRotationPoint(-1.8F, -0.2F, 0.0F);
        rHindLeg01.addChild(rHindlegWool);
        rHindlegWool.cubeList.add(new ModelBox(rHindlegWool, 13, 49, -2.5F, -1.0F, -2.8F, 5, 10, 5, 0.0F, true));

        rHindLeg02 = new RendererModel(this);
        rHindLeg02.setRotationPoint(-2.4F, 7.4F, 1.7F);
        rHindLeg01.addChild(rHindLeg02);
        setRotationAngle(rHindLeg02, -0.1309F, 0.0F, 0.0873F);
        rHindLeg02.cubeList.add(new ModelBox(rHindLeg02, 0, 44, -0.7F, -1.5F, -0.8F, 2, 9, 2, 0.0F, true));

        rhHoofClaw01a = new RendererModel(this);
        rhHoofClaw01a.setRotationPoint(1.0F, 7.0F, -0.5F);
        rHindLeg02.addChild(rhHoofClaw01a);
        setRotationAngle(rhHoofClaw01a, 0.3054F, -0.192F, -0.0349F);
        rhHoofClaw01a.cubeList.add(new ModelBox(rhHoofClaw01a, 9, 44, -0.6F, -0.3F, -1.3F, 1, 1, 2, 0.0F, false));

        rhHoofClaw01b = new RendererModel(this);
        rhHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        rhHoofClaw01a.addChild(rhHoofClaw01b);
        setRotationAngle(rhHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw01b.cubeList.add(new ModelBox(rhHoofClaw01b, 9, 48, -0.5F, -0.7F, -0.4F, 1, 1, 2, 0.0F, false));

        rhHoofClaw02a = new RendererModel(this);
        rhHoofClaw02a.setRotationPoint(0.0005F, 7.0147F, -0.4714F);
        rHindLeg02.addChild(rhHoofClaw02a);
        setRotationAngle(rhHoofClaw02a, 0.3054F, -0.0175F, -0.0349F);


        Box_r2 = new RendererModel(this);
        Box_r2.setRotationPoint(-0.0005F, -0.0147F, -0.0286F);
        rhHoofClaw02a.addChild(Box_r2);
        setRotationAngle(Box_r2, 0.0F, 0.0873F, 0.0F);
        Box_r2.cubeList.add(new ModelBox(Box_r2, 9, 44, -0.6F, -0.3F, -1.3F, 1, 1, 2, 0.0F, false));

        rhHoofClaw02b = new RendererModel(this);
        rhHoofClaw02b.setRotationPoint(-0.0005F, -0.0147F, -1.0286F);
        rhHoofClaw02a.addChild(rhHoofClaw02b);
        setRotationAngle(rhHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rhHoofClaw02b.cubeList.add(new ModelBox(rhHoofClaw02b, 9, 48, -0.7F, -0.7F, -0.4F, 1, 1, 2, 0.0F, false));

        tail = new RendererModel(this);
        tail.setRotationPoint(0.0F, -1.1F, 2.8F);
        rear.addChild(tail);
        setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.cubeList.add(new ModelBox(tail, 48, 11, -1.5F, -0.6F, 0.0F, 3, 4, 2, 0.0F, false));

        lForeleg01 = new RendererModel(this);
        lForeleg01.setRotationPoint(2.5F, 0.5F, -4.0F);
        body.addChild(lForeleg01);
        setRotationAngle(lForeleg01, 0.0873F, 0.0F, 0.0698F);
        lForeleg01.cubeList.add(new ModelBox(lForeleg01, 0, 33, 0.0F, -1.4F, -1.5F, 3, 8, 3, 0.0F, false));

        lForeleg02 = new RendererModel(this);
        lForeleg02.setRotationPoint(1.5F, 6.5F, 0.1F);
        lForeleg01.addChild(lForeleg02);
        setRotationAngle(lForeleg02, -0.0873F, 0.0F, -0.0698F);
        lForeleg02.cubeList.add(new ModelBox(lForeleg02, 0, 44, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

        lfHoofClaw01a = new RendererModel(this);
        lfHoofClaw01a.setRotationPoint(0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw01a);
        setRotationAngle(lfHoofClaw01a, 0.0F, -0.1047F, -0.0349F);
        lfHoofClaw01a.cubeList.add(new ModelBox(lfHoofClaw01a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        lfHoofClaw01b = new RendererModel(this);
        lfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw01a.addChild(lfHoofClaw01b);
        setRotationAngle(lfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw01b.cubeList.add(new ModelBox(lfHoofClaw01b, 9, 48, -0.49F, -1.1F, -0.3F, 1, 1, 2, 0.0F, false));

        lfHoofClaw02a = new RendererModel(this);
        lfHoofClaw02a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        lForeleg02.addChild(lfHoofClaw02a);
        setRotationAngle(lfHoofClaw02a, 0.0F, 0.0698F, -0.0349F);
        lfHoofClaw02a.cubeList.add(new ModelBox(lfHoofClaw02a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));

        lfHoofClaw02b = new RendererModel(this);
        lfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        lfHoofClaw02a.addChild(lfHoofClaw02b);
        setRotationAngle(lfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        lfHoofClaw02b.cubeList.add(new ModelBox(lfHoofClaw02b, 9, 48, -0.49F, -1.1F, -0.3F, 1, 1, 2, 0.0F, false));

        lForelegWool01 = new RendererModel(this);
        lForelegWool01.setRotationPoint(0.0F, 0.0F, 0.0F);
        lForeleg01.addChild(lForelegWool01);
        lForelegWool01.cubeList.add(new ModelBox(lForelegWool01, 16, 51, -0.6F, -2.3F, -2.1F, 4, 9, 4, 0.0F, false));

        lForelegWool02 = new RendererModel(this);
        lForelegWool02.setRotationPoint(1.9F, 6.8F, 0.6F);
        lForelegWool01.addChild(lForelegWool02);
        setRotationAngle(lForelegWool02, -0.0873F, 0.0F, -0.0698F);
        lForelegWool02.cubeList.add(new ModelBox(lForelegWool02, 16, 58, -2.01F, -0.1F, -2.1F, 3, 2, 3, 0.0F, false));

        rForeleg01 = new RendererModel(this);
        rForeleg01.setRotationPoint(-2.5F, 0.5F, -4.0F);
        body.addChild(rForeleg01);
        setRotationAngle(rForeleg01, 0.0873F, 0.0F, -0.0698F);
        rForeleg01.cubeList.add(new ModelBox(rForeleg01, 0, 33, -3.0F, -1.4F, -1.5F, 3, 8, 3, 0.0F, true));

        rForeleg02 = new RendererModel(this);
        rForeleg02.setRotationPoint(-1.5F, 6.5F, 0.1F);
        rForeleg01.addChild(rForeleg02);
        setRotationAngle(rForeleg02, -0.0873F, 0.0F, 0.0698F);
        rForeleg02.cubeList.add(new ModelBox(rForeleg02, 0, 44, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));

        rfHoofClaw01a = new RendererModel(this);
        rfHoofClaw01a.setRotationPoint(-0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw01a);
        setRotationAngle(rfHoofClaw01a, 0.0F, 0.1047F, 0.0349F);
        rfHoofClaw01a.cubeList.add(new ModelBox(rfHoofClaw01a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));

        rfHoofClaw01b = new RendererModel(this);
        rfHoofClaw01b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw01a.addChild(rfHoofClaw01b);
        setRotationAngle(rfHoofClaw01b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw01b.cubeList.add(new ModelBox(rfHoofClaw01b, 9, 48, -0.51F, -1.1F, -0.3F, 1, 1, 2, 0.0F, true));

        rfHoofClaw02a = new RendererModel(this);
        rfHoofClaw02a.setRotationPoint(0.5F, 7.5F, -0.3F);
        rForeleg02.addChild(rfHoofClaw02a);
        setRotationAngle(rfHoofClaw02a, 0.0F, -0.0698F, 0.0349F);
        rfHoofClaw02a.cubeList.add(new ModelBox(rfHoofClaw02a, 9, 44, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));

        rfHoofClaw02b = new RendererModel(this);
        rfHoofClaw02b.setRotationPoint(0.0F, 0.5F, -1.0F);
        rfHoofClaw02a.addChild(rfHoofClaw02b);
        setRotationAngle(rfHoofClaw02b, 0.3491F, 0.0F, 0.0F);
        rfHoofClaw02b.cubeList.add(new ModelBox(rfHoofClaw02b, 9, 48, -0.51F, -1.1F, -0.3F, 1, 1, 2, 0.0F, true));

        lForelegWool2 = new RendererModel(this);
        lForelegWool2.setRotationPoint(0.0F, 0.0F, 0.0F);
        rForeleg01.addChild(lForelegWool2);
        lForelegWool2.cubeList.add(new ModelBox(lForelegWool2, 16, 51, -3.4F, -2.3F, -2.1F, 4, 9, 4, 0.0F, true));

        lForelegWool3 = new RendererModel(this);
        lForelegWool3.setRotationPoint(-1.9F, 6.8F, 0.6F);
        lForelegWool2.addChild(lForelegWool3);
        setRotationAngle(lForelegWool3, -0.0873F, 0.0F, 0.0698F);
        lForelegWool3.cubeList.add(new ModelBox(lForelegWool3, 16, 58, -0.99F, -0.1F, -2.1F, 3, 2, 3, 0.0F, true));

        neck = new RendererModel(this);
        neck.setRotationPoint(0.0F, -0.3F, -5.6F);
        body.addChild(neck);
        setRotationAngle(neck, -0.9599F, 0.0F, 0.0F);
        neck.cubeList.add(new ModelBox(neck, 24, 22, -2.5F, -2.5F, -4.6F, 5, 5, 5, -0.15F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, -0.5F, -4.6F);
        neck.addChild(head);
        setRotationAngle(head, 0.9599F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 44, 22, -2.5F, -3.0F, -3.0F, 5, 5, 5, -0.1F, false));

        jawUpper = new RendererModel(this);
        jawUpper.setRotationPoint(0.0F, 0.0F, -2.7F);
        head.addChild(jawUpper);
        jawUpper.cubeList.add(new ModelBox(jawUpper, 48, 0, -2.0F, 0.1F, -2.7F, 4, 1, 3, 0.0F, false));

        jawLower = new RendererModel(this);
        jawLower.setRotationPoint(0.0F, 1.5F, -2.6F);
        head.addChild(jawLower);
        jawLower.cubeList.add(new ModelBox(jawLower, 46, 5, -2.0F, -0.6F, -2.8F, 4, 1, 3, -0.1F, false));

        snout = new RendererModel(this);
        snout.setRotationPoint(0.0F, -1.1F, -2.0F);
        head.addChild(snout);
        setRotationAngle(snout, 0.6109F, 0.0F, 0.0F);
        snout.cubeList.add(new ModelBox(snout, 32, 0, -2.0F, -2.1F, -3.6F, 4, 3, 4, -0.2F, false));

        lEar = new RendererModel(this);
        lEar.setRotationPoint(2.0F, -2.1F, 0.7F);
        head.addChild(lEar);
        setRotationAngle(lEar, -0.5236F, 0.0F, 0.4363F);
        lEar.cubeList.add(new ModelBox(lEar, 32, 8, -0.3F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        rEar2 = new RendererModel(this);
        rEar2.setRotationPoint(-2.0F, -2.1F, 0.7F);
        head.addChild(rEar2);
        setRotationAngle(rEar2, -0.5236F, 0.0F, -0.4363F);
        rEar2.cubeList.add(new ModelBox(rEar2, 32, 8, -2.7F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        woolHead01 = new RendererModel(this);
        woolHead01.setRotationPoint(0.0F, -0.3F, -0.1F);
        head.addChild(woolHead01);
        woolHead01.cubeList.add(new ModelBox(woolHead01, 14, 52, -3.0F, -3.0F, -1.5F, 6, 6, 4, 0.0F, false));

        woolNeck = new RendererModel(this);
        woolNeck.setRotationPoint(0.0F, 0.5F, -1.9F);
        neck.addChild(woolNeck);
        woolNeck.cubeList.add(new ModelBox(woolNeck, 13, 50, -2.4F, -3.5F, -3.0F, 5, 6, 6, 0.0F, false));

        woolBody = new RendererModel(this);
        woolBody.setRotationPoint(0.0F, 0.9F, 3.5F);
        body.addChild(woolBody);
        woolBody.cubeList.add(new ModelBox(woolBody, 1, 41, -4.5F, -4.5F, -9.1F, 9, 9, 14, 0.0F, false));

        woolRear = new RendererModel(this);
        woolRear.setRotationPoint(0.0F, 0.3F, 2.3F);
        woolBody.addChild(woolRear);
        setRotationAngle(woolRear, -0.384F, 0.0F, 0.0F);
        woolRear.cubeList.add(new ModelBox(woolRear, 34, 41, -4.0F, -5.3F, 0.4F, 8, 8, 5, 0.0F, false));

        woolFront = new RendererModel(this);
        woolFront.setRotationPoint(0.0F, -0.4F, -10.9F);
        woolBody.addChild(woolFront);
        woolFront.cubeList.add(new ModelBox(woolFront, 11, 52, -4.45F, -3.9F, -0.3F, 9, 8, 4, -0.3F, false));
    }

    @Override
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
        boolean sheared = entity.getSheared();
        this.tail.showModel = !sheared && !isChild;
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
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        this.head.rotateAngleY = rad(netHeadYaw) * 0.01F;
        this.head.rotateAngleX = rad(headPitch) * 0.01F + 0.9599F;
        this.lHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.2618F;
        this.rHindLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.2618F;
        this.lForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.0873F;
        this.rForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount + 0.0873F;
        if(!Minecraft.getInstance().isGamePaused()) {
            this.neck.rotateAngleX = entity.getHeadRotationAngleX(Minecraft.getInstance().getRenderPartialTicks()) - 0.9599F;
        }
    }

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
