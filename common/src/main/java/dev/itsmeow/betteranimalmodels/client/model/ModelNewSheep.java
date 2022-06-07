package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalmodels.mixin.SheepAccessor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.animal.Sheep;

public class ModelNewSheep<T extends Sheep> extends Model<T> {

    public ModelPart body;
    public ModelPart rear;
    public ModelPart lHindLeg01;
    public ModelPart lHindlegWool;
    public ModelPart lHindLeg02;
    public ModelPart lhHoofClaw01a;
    public ModelPart lhHoofClaw01b;
    public ModelPart lhHoofClaw02a;
    public ModelPart Box_r1;
    public ModelPart lhHoofClaw02b;
    public ModelPart rHindLeg01;
    public ModelPart rHindlegWool;
    public ModelPart rHindLeg02;
    public ModelPart rhHoofClaw01a;
    public ModelPart rhHoofClaw01b;
    public ModelPart rhHoofClaw02a;
    public ModelPart Box_r2;
    public ModelPart rhHoofClaw02b;
    public ModelPart tail;
    public ModelPart lForeleg01;
    public ModelPart lForeleg02;
    public ModelPart lfHoofClaw01a;
    public ModelPart lfHoofClaw01b;
    public ModelPart lfHoofClaw02a;
    public ModelPart lfHoofClaw02b;
    public ModelPart lForelegWool01;
    public ModelPart lForelegWool02;
    public ModelPart rForeleg01;
    public ModelPart rForeleg02;
    public ModelPart rfHoofClaw01a;
    public ModelPart rfHoofClaw01b;
    public ModelPart rfHoofClaw02a;
    public ModelPart rfHoofClaw02b;
    public ModelPart rForelegWool01;
    public ModelPart rForelegWool02;
    public ModelPart neck;
    public ModelPart head;
    public ModelPart jawUpper;
    public ModelPart jawLower;
    public ModelPart snout;
    public ModelPart lEar;
    public ModelPart rEar2;
    public ModelPart woolHead;
    public ModelPart woolNeck;
    public ModelPart woolBody;
    public ModelPart woolRear;
    public ModelPart woolFront;

    private boolean sheared;

    public ModelNewSheep(ModelPart root) {
        this.body = root.getChild("body");
        this.rear = body.getChild("rear");
        this.lHindLeg01 = rear.getChild("lHindLeg01");
        this.lHindlegWool = lHindLeg01.getChild("lHindlegWool");
        this.lHindLeg02 = lHindLeg01.getChild("lHindLeg02");
        this.lhHoofClaw01a = lHindLeg02.getChild("lhHoofClaw01a");
        this.lhHoofClaw01b = lhHoofClaw01a.getChild("lhHoofClaw01b");
        this.lhHoofClaw02a = lHindLeg02.getChild("lhHoofClaw02a");
        this.Box_r1 = lhHoofClaw02a.getChild("Box_r1");
        this.lhHoofClaw02b = lhHoofClaw02a.getChild("lhHoofClaw02b");
        this.rHindLeg01 = rear.getChild("rHindLeg01");
        this.rHindlegWool = rHindLeg01.getChild("rHindlegWool");
        this.rHindLeg02 = rHindLeg01.getChild("rHindLeg02");
        this.rhHoofClaw01a = rHindLeg02.getChild("rhHoofClaw01a");
        this.rhHoofClaw01b = rhHoofClaw01a.getChild("rhHoofClaw01b");
        this.rhHoofClaw02a = rHindLeg02.getChild("rhHoofClaw02a");
        this.Box_r2 = rhHoofClaw02a.getChild("Box_r2");
        this.rhHoofClaw02b = rhHoofClaw02a.getChild("rhHoofClaw02b");
        this.tail = rear.getChild("tail");
        this.lForeleg01 = body.getChild("lForeleg01");
        this.lForeleg02 = lForeleg01.getChild("lForeleg02");
        this.lfHoofClaw01a = lForeleg02.getChild("lfHoofClaw01a");
        this.lfHoofClaw01b = lfHoofClaw01a.getChild("lfHoofClaw01b");
        this.lfHoofClaw02a = lForeleg02.getChild("lfHoofClaw02a");
        this.lfHoofClaw02b = lfHoofClaw02a.getChild("lfHoofClaw02b");
        this.lForelegWool01 = lForeleg01.getChild("lForelegWool01");
        this.lForelegWool02 = lForelegWool01.getChild("lForelegWool02");
        this.rForeleg01 = body.getChild("rForeleg01");
        this.rForeleg02 = rForeleg01.getChild("rForeleg02");
        this.rfHoofClaw01a = rForeleg02.getChild("rfHoofClaw01a");
        this.rfHoofClaw01b = rfHoofClaw01a.getChild("rfHoofClaw01b");
        this.rfHoofClaw02a = rForeleg02.getChild("rfHoofClaw02a");
        this.rfHoofClaw02b = rfHoofClaw02a.getChild("rfHoofClaw02b");
        this.rForelegWool01 = rForeleg01.getChild("rForelegWool01");
        this.rForelegWool02 = rForelegWool01.getChild("rForelegWool02");
        this.neck = body.getChild("neck");
        this.head = neck.getChild("head");
        this.jawUpper = head.getChild("jawUpper");
        this.jawLower = head.getChild("jawLower");
        this.snout = head.getChild("snout");
        this.lEar = head.getChild("lEar");
        this.rEar2 = head.getChild("rEar2");
        this.woolHead = head.getChild("woolHead");
        this.woolNeck = neck.getChild("woolNeck");
        this.woolBody = body.getChild("woolBody");
        this.woolRear = woolBody.getChild("woolRear");
        this.woolFront = woolBody.getChild("woolFront");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(2, 1).addBox(-4.0F, -3.0F, -6.9F, 8.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, -1.0F));
        PartDefinition rear = body.addOrReplaceChild("rear", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -3.0F, -1.0F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.384F, 0.0F, 0.0F));
        PartDefinition lHindLeg01 = rear.addOrReplaceChild("lHindLeg01", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, -0.4F, 1.9F, 0.2618F, 0.0F, -0.0524F));
        PartDefinition lHindlegWool = lHindLeg01.addOrReplaceChild("lHindlegWool", CubeListBuilder.create().texOffs(13, 49).mirror().addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.8F, -0.2F, 0.0F));
        PartDefinition lHindLeg02 = lHindLeg01.addOrReplaceChild("lHindLeg02", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.3F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, 7.4F, 1.7F, -0.1309F, 0.0F, 0.0436F));
        PartDefinition lhHoofClaw01a = lHindLeg02.addOrReplaceChild("lhHoofClaw01a", CubeListBuilder.create().texOffs(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.0F, -0.5F, 0.3054F, 0.192F, 0.0349F));
        PartDefinition lhHoofClaw01b = lhHoofClaw01a.addOrReplaceChild("lhHoofClaw01b", CubeListBuilder.create().texOffs(9, 48).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition lhHoofClaw02a = lHindLeg02.addOrReplaceChild("lhHoofClaw02a", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0005F, 7.0147F, -0.4714F, 0.3054F, 0.0175F, 0.0349F));
        PartDefinition Box_r1 = lhHoofClaw02a.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(9, 44).addBox(-0.4F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, -0.0147F, -0.0286F, 0.0F, -0.0873F, 0.0F));
        PartDefinition lhHoofClaw02b = lhHoofClaw02a.addOrReplaceChild("lhHoofClaw02b", CubeListBuilder.create().texOffs(9, 48).addBox(-0.3F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, -0.0147F, -1.0286F, 0.3491F, 0.0F, 0.0F));
        PartDefinition rHindLeg01 = rear.addOrReplaceChild("rHindLeg01", CubeListBuilder.create().texOffs(0, 0).addBox(-3.9F, -0.4F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.4F, 1.9F, 0.2618F, 0.0F, 0.0524F));
        PartDefinition rHindlegWool = rHindLeg01.addOrReplaceChild("rHindlegWool", CubeListBuilder.create().texOffs(13, 49).addBox(-2.5F, -1.0F, -2.8F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8F, -0.2F, 0.0F));
        PartDefinition rHindLeg02 = rHindLeg01.addOrReplaceChild("rHindLeg02", CubeListBuilder.create().texOffs(0, 44).addBox(-0.7F, -1.5F, -0.8F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, 7.4F, 1.7F, -0.1309F, 0.0F, -0.0436F));
        PartDefinition rhHoofClaw01a = rHindLeg02.addOrReplaceChild("rhHoofClaw01a", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.0F, -0.5F, 0.3054F, -0.192F, -0.0349F));
        PartDefinition rhHoofClaw01b = rhHoofClaw01a.addOrReplaceChild("rhHoofClaw01b", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition rhHoofClaw02a = rHindLeg02.addOrReplaceChild("rhHoofClaw02a", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0005F, 7.0147F, -0.4714F, 0.3054F, -0.0175F, -0.0349F));
        PartDefinition Box_r2 = rhHoofClaw02a.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.6F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0005F, -0.0147F, -0.0286F, 0.0F, 0.0873F, 0.0F));
        PartDefinition rhHoofClaw02b = rhHoofClaw02a.addOrReplaceChild("rhHoofClaw02b", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.7F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0005F, -0.0147F, -1.0286F, 0.3491F, 0.0F, 0.0F));
        PartDefinition tail = rear.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(48, 11).addBox(-1.5F, -0.6F, 0.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 2.8F, 0.5236F, 0.0F, 0.0F));
        PartDefinition lForeleg01 = body.addOrReplaceChild("lForeleg01", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.5F, -4.0F, 0.0873F, 0.0F, 0.0698F));
        PartDefinition lForeleg02 = lForeleg01.addOrReplaceChild("lForeleg02", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 6.5F, 0.1F, -0.0873F, 0.0F, -0.0698F));
        PartDefinition lfHoofClaw01a = lForeleg02.addOrReplaceChild("lfHoofClaw01a", CubeListBuilder.create().texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.5F, -0.3F, 0.0F, -0.1047F, -0.0349F));
        PartDefinition lfHoofClaw01b = lfHoofClaw01a.addOrReplaceChild("lfHoofClaw01b", CubeListBuilder.create().texOffs(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition lfHoofClaw02a = lForeleg02.addOrReplaceChild("lfHoofClaw02a", CubeListBuilder.create().texOffs(9, 44).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.5F, -0.3F, 0.0F, 0.0698F, -0.0349F));
        PartDefinition lfHoofClaw02b = lfHoofClaw02a.addOrReplaceChild("lfHoofClaw02b", CubeListBuilder.create().texOffs(9, 48).addBox(-0.49F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition lForelegWool01 = lForeleg01.addOrReplaceChild("lForelegWool01", CubeListBuilder.create().texOffs(16, 51).addBox(-0.6F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition lForelegWool02 = lForelegWool01.addOrReplaceChild("lForelegWool02", CubeListBuilder.create().texOffs(16, 58).addBox(-2.01F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 6.8F, 0.6F, -0.0873F, 0.0F, -0.0698F));
        PartDefinition rForeleg01 = body.addOrReplaceChild("rForeleg01", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-3.0F, -1.4F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5F, -4.0F, 0.0873F, 0.0F, -0.0698F));
        PartDefinition rForeleg02 = rForeleg01.addOrReplaceChild("rForeleg02", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.5F, 0.1F, -0.0873F, 0.0F, 0.0698F));
        PartDefinition rfHoofClaw01a = rForeleg02.addOrReplaceChild("rfHoofClaw01a", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.5F, -0.3F, 0.0F, 0.1047F, 0.0349F));
        PartDefinition rfHoofClaw01b = rfHoofClaw01a.addOrReplaceChild("rfHoofClaw01b", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition rfHoofClaw02a = rForeleg02.addOrReplaceChild("rfHoofClaw02a", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.5F, -0.3F, 0.0F, -0.0698F, 0.0349F));
        PartDefinition rfHoofClaw02b = rfHoofClaw02a.addOrReplaceChild("rfHoofClaw02b", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.51F, -1.1F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition rForelegWool01 = rForeleg01.addOrReplaceChild("rForelegWool01", CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-3.4F, -2.3F, -2.1F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rForelegWool02 = rForelegWool01.addOrReplaceChild("rForelegWool02", CubeListBuilder.create().texOffs(16, 58).mirror().addBox(-0.99F, -0.1F, -2.1F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 6.8F, 0.6F, -0.0873F, 0.0F, 0.0698F));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(24, 22).addBox(-2.5F, -2.5F, -4.6F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.6F, -0.9599F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 22).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.6F, 0.9599F, 0.0F, 0.0F));
        PartDefinition jawUpper = head.addOrReplaceChild("jawUpper", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, 0.1F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, -2.7F));
        PartDefinition jawLower = head.addOrReplaceChild("jawLower", CubeListBuilder.create().texOffs(46, 5).addBox(-2.0F, -0.6F, -2.8F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, -2.6F));
        PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -2.1F, -3.6F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.0F, 0.6109F, 0.0F, 0.0F));
        PartDefinition lEar = head.addOrReplaceChild("lEar", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-2.7F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.1F, 0.7F, -0.5236F, 0.0F, -0.4363F));
        PartDefinition rEar2 = head.addOrReplaceChild("rEar2", CubeListBuilder.create().texOffs(32, 8).addBox(-0.3F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.1F, 0.7F, -0.5236F, 0.0F, 0.4363F));
        PartDefinition woolHead = head.addOrReplaceChild("woolHead", CubeListBuilder.create().texOffs(14, 52).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.3F, -0.1F));
        PartDefinition woolNeck = neck.addOrReplaceChild("woolNeck", CubeListBuilder.create().texOffs(13, 50).addBox(-2.6F, -3.5F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -1.9F));
        PartDefinition woolBody = body.addOrReplaceChild("woolBody", CubeListBuilder.create().texOffs(1, 41).addBox(-4.5F, -4.5F, -9.1F, 9.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.9F, 3.5F));
        PartDefinition woolRear = woolBody.addOrReplaceChild("woolRear", CubeListBuilder.create().texOffs(34, 41).addBox(-4.0F, -5.3F, 0.4F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.3F, -0.384F, 0.0F, 0.0F));
        PartDefinition woolFront = woolBody.addOrReplaceChild("woolFront", CubeListBuilder.create().texOffs(11, 52).addBox(-4.55F, -3.9F, -0.3F, 9.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, -10.9F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.tail.visible = !sheared && !young;
        this.woolHead.visible = !sheared;
        this.woolBody.visible = !sheared;
        this.woolNeck.visible = !sheared;
        this.woolRear.visible = !sheared;
        this.woolFront.visible = !sheared;
        this.lHindlegWool.visible = !sheared;
        this.rHindlegWool.visible = !sheared;
        this.lForelegWool01.visible = !sheared;
        this.lForelegWool02.visible = !sheared;
        this.rForelegWool01.visible = !sheared;
        this.rForelegWool02.visible = !sheared;
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.headYaw(neck, netHeadYaw);
        this.quadriped(lHindLeg01, lForeleg01, rHindLeg01, rForeleg01, limbSwing * 0.8665F, limbSwingAmount * 0.9F);
        this.sheared = entity.isSheared();

        float eatTime = ((SheepAccessor) entity).getEatAnimationTick();
        if (eatTime > 0) {
            this.neck.xRot = rad(40F);
            this.head.xRot = rad(-65F) + 0.9599F;
            this.jawLower.xRot = rad(eatTime % 20F) + 0.1F;
        } else {
            this.neck.xRot = -0.9599F;
            this.head.xRot = 0.9599F;
            this.jawLower.xRot = 0F;
            this.headPitch(head, headPitch, 1F, 0F);
        }
    }

}
