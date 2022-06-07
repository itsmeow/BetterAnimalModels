package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.horse.AbstractChestedHorse;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;

public class ModelNewHorse<T extends AbstractHorse> extends Model<T> {

	public ModelPart body;
	public ModelPart ass;
	public ModelPart tail01;
	public ModelPart tail02a;
	public ModelPart tail03;
	public ModelPart tail04;
	public ModelPart lForeleg01;
	public ModelPart lForeleg02;
	public ModelPart lForeleg03;
	public ModelPart lFrontHoof;
	public ModelPart rForeleg01;
	public ModelPart rForeleg02;
	public ModelPart rForeleg03;
	public ModelPart rFrontHoof;
	public ModelPart neck01;
	public ModelPart cube_r1;
	public ModelPart neck02;
	public ModelPart head;
	public ModelPart lEar;
	public ModelPart lLongEar_r1;
	public ModelPart rEar;
	public ModelPart rLongEar_r1;
	public ModelPart snout;
	public ModelPart nose_r1;
	public ModelPart skelesnout_r1;
	public ModelPart upperJaw;
	public ModelPart lowerJaw;
	public ModelPart saddleHarness;
	public ModelPart rLeash_r1;
	public ModelPart lLeash_r1;
	public ModelPart mane01;
	public ModelPart mane02;
	public ModelPart cube_r2;
	public ModelPart mane03;
	public ModelPart saddle;
	public ModelPart saddleBase;
	public ModelPart saddleBack;
	public ModelPart saddleFront;
	public ModelPart saddleDetail;
	public ModelPart lBag;
	public ModelPart rBag;
	public ModelPart lHindLeg01;
	public ModelPart lHindLeg02;
	public ModelPart lHindHoof;
	public ModelPart cube_r3;
	public ModelPart rHindLeg01;
	public ModelPart rHindLeg02;
	public ModelPart rHindHoof;
	public ModelPart cube_r4;

	public ModelNewHorse(ModelPart root) {
		this.body = root.getChild("body");
		this.ass = body.getChild("ass");
		this.tail01 = ass.getChild("tail01");
		this.tail02a = tail01.getChild("tail02a");
		this.tail03 = tail02a.getChild("tail03");
		this.tail04 = tail03.getChild("tail04");
		this.lForeleg01 = body.getChild("lForeleg01");
		this.lForeleg02 = lForeleg01.getChild("lForeleg02");
		this.lForeleg03 = lForeleg02.getChild("lForeleg03");
		this.lFrontHoof = lForeleg03.getChild("lFrontHoof");
		this.rForeleg01 = body.getChild("rForeleg01");
		this.rForeleg02 = rForeleg01.getChild("rForeleg02");
		this.rForeleg03 = rForeleg02.getChild("rForeleg03");
		this.rFrontHoof = rForeleg03.getChild("rFrontHoof");
		this.neck01 = body.getChild("neck01");
		this.cube_r1 = neck01.getChild("cube_r1");
		this.neck02 = neck01.getChild("neck02");
		this.head = neck02.getChild("head");
		this.lEar = head.getChild("lEar");
		this.lLongEar_r1 = lEar.getChild("lLongEar_r1");
		this.rEar = head.getChild("rEar");
		this.rLongEar_r1 = rEar.getChild("rLongEar_r1");
		this.snout = head.getChild("snout");
		this.nose_r1 = snout.getChild("nose_r1");
		this.skelesnout_r1 = snout.getChild("skelesnout_r1");
		this.upperJaw = head.getChild("upperJaw");
		this.lowerJaw = head.getChild("lowerJaw");
		this.saddleHarness = head.getChild("saddleHarness");
		this.rLeash_r1 = saddleHarness.getChild("rLeash_r1");
		this.lLeash_r1 = saddleHarness.getChild("lLeash_r1");
		this.mane01 = neck02.getChild("mane01");
		this.mane02 = mane01.getChild("mane02");
		this.cube_r2 = mane02.getChild("cube_r2");
		this.mane03 = mane02.getChild("mane03");
		this.saddle = body.getChild("saddle");
		this.saddleBase = saddle.getChild("saddleBase");
		this.saddleBack = saddleBase.getChild("saddleBack");
		this.saddleFront = saddleBase.getChild("saddleFront");
		this.saddleDetail = saddle.getChild("saddleDetail");
		this.lBag = body.getChild("lBag");
		this.rBag = body.getChild("rBag");
		this.lHindLeg01 = root.getChild("lHindLeg01");
		this.lHindLeg02 = lHindLeg01.getChild("lHindLeg02");
		this.lHindHoof = lHindLeg02.getChild("lHindHoof");
		this.cube_r3 = lHindHoof.getChild("cube_r3");
		this.rHindLeg01 = root.getChild("rHindLeg01");
		this.rHindLeg02 = rHindLeg01.getChild("rHindLeg02");
		this.rHindHoof = rHindLeg02.getChild("rHindHoof");
		this.cube_r4 = rHindHoof.getChild("cube_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -23.0F, 11.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 6.5F, 10.0F));
		PartDefinition ass = body.addOrReplaceChild("ass", CubeListBuilder.create().texOffs(0, 29).addBox(-6.0F, -4.25F, -2.0F, 13.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, -4.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition tail01 = ass.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(48, 28).addBox(-3.0F, -2.5F, 0.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.15F, 5.15F, -0.5934F, 0.0F, 0.0F));
		PartDefinition tail02a = tail01.addOrReplaceChild("tail02a", CubeListBuilder.create().texOffs(49, 38).addBox(-3.0F, -2.5F, -0.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -0.1F, 4.6F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tail03 = tail02a.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(45, 48).addBox(-2.5F, -3.0F, -0.35F, 5.0F, 5.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.6F, -0.3142F, 0.0F, 0.0F));
		PartDefinition tail04 = tail03.addOrReplaceChild("tail04", CubeListBuilder.create().texOffs(74, 50).addBox(-2.0F, -1.25F, -0.95F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 6.6F, 0.2094F, 0.0F, 0.0F));
		PartDefinition lForeleg01 = body.addOrReplaceChild("lForeleg01", CubeListBuilder.create().texOffs(60, 0).addBox(-3.0F, -5.0F, -2.0F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 1.0F, -20.0F));
		PartDefinition lForeleg02 = lForeleg01.addOrReplaceChild("lForeleg02", CubeListBuilder.create().texOffs(59, 16).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(-0.5F, 2.5F, 0.5F));
		PartDefinition lForeleg03 = lForeleg02.addOrReplaceChild("lForeleg03", CubeListBuilder.create().texOffs(75, 16).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 7.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.5F, 6.0F, 0.0F));
		PartDefinition lFrontHoof = lForeleg03.addOrReplaceChild("lFrontHoof", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.75F, 0.0F));
		PartDefinition rForeleg01 = body.addOrReplaceChild("rForeleg01", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-2.0F, -5.0F, -2.0F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 1.0F, -20.0F));
		PartDefinition rForeleg02 = rForeleg01.addOrReplaceChild("rForeleg02", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.5F, 2.5F, 0.5F));
		PartDefinition rForeleg03 = rForeleg02.addOrReplaceChild("rForeleg03", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-1.5F, -1.0F, -1.5F, 3.0F, 7.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-0.5F, 6.0F, 0.0F));
		PartDefinition rFrontHoof = rForeleg03.addOrReplaceChild("rFrontHoof", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 6.75F, 0.0F));
		PartDefinition neck01 = body.addOrReplaceChild("neck01", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -21.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r1 = neck01.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-3.5F, -2.0F, -3.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition neck02 = neck01.addOrReplaceChild("neck02", CubeListBuilder.create().texOffs(0, 70).addBox(-2.5F, -6.0F, -4.0F, 6.0F, 8.0F, 8.0F, new CubeDeformation(-0.01F))
				.texOffs(10, 76).addBox(-2.5F, -11.75F, 1.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head = neck02.addOrReplaceChild("head", CubeListBuilder.create().texOffs(26, 92).addBox(-3.5F, -0.2F, -3.0F, 7.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 82).addBox(-3.0F, -4.0F, -2.1F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(39, 119).addBox(-2.0F, 3.25F, -6.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.75F, 0.25F, -0.4363F, 0.0F, 0.0F));
		PartDefinition lEar = head.addOrReplaceChild("lEar", CubeListBuilder.create().texOffs(30, 70).addBox(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -4.25F, 0.0F));
		PartDefinition lLongEar_r1 = lEar.addOrReplaceChild("lLongEar_r1", CubeListBuilder.create().texOffs(40, 70).addBox(-1.25F, -5.5F, 0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition rEar = head.addOrReplaceChild("rEar", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -4.25F, 0.0F));
		PartDefinition rLongEar_r1 = rEar.addOrReplaceChild("rLongEar_r1", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-0.75F, -5.5F, 0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.75F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition nose_r1 = snout.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(0, 117).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 2.0F, -8.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition skelesnout_r1 = snout.addOrReplaceChild("skelesnout_r1", CubeListBuilder.create().texOffs(114, 120).addBox(-2.0F, -2.0F, -9.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition nose_cube = snout.addOrReplaceChild("nose_cube", CubeListBuilder.create().texOffs(0, 102).addBox(-2.0F, -2.0F, -6.75F, 4.0F, 5.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(27, 106).addBox(-2.0F, -3.0F, -7.5F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.25F, -3.0F));
		PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(21, 120).addBox(-2.0F, -0.01F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.25F, -6.5F));
		PartDefinition saddleHarness = head.addOrReplaceChild("saddleHarness", CubeListBuilder.create().texOffs(68, 29).addBox(-3.0F, -1.25F, -0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 34).addBox(-3.5F, -7.06F, 1.5F, 7.0F, 8.0F, 5.0F, new CubeDeformation(0.2F))
				.texOffs(94, 38).addBox(-2.0F, -5.5F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.0F, -5.0F));
		PartDefinition rLeash_r1 = saddleHarness.addOrReplaceChild("rLeash_r1", CubeListBuilder.create().texOffs(93, 45).mirror().addBox(0.2F, 0.0F, -1.0F, 0.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.0F, 1.0F, 0.0873F, -0.1309F, 0.0F));
		PartDefinition lLeash_r1 = saddleHarness.addOrReplaceChild("lLeash_r1", CubeListBuilder.create().texOffs(93, 45).addBox(-0.2F, 0.0F, -1.0F, 0.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 1.0F, 0.0873F, 0.1309F, 0.0F));
		PartDefinition mane01 = neck02.addOrReplaceChild("mane01", CubeListBuilder.create().texOffs(116, 2).addBox(-1.0F, -8.75F, -1.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition mane02 = mane01.addOrReplaceChild("mane02", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, 0.0F));
		PartDefinition cube_r2 = mane02.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(105, 23).addBox(-3.2F, -7.75F, 0.4F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition mane03 = mane02.addOrReplaceChild("mane03", CubeListBuilder.create().texOffs(116, 22).addBox(0.0F, -7.75F, -4.0F, 1.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, -0.75F, -0.0436F, 0.1309F, 0.0F));
		PartDefinition saddle = body.addOrReplaceChild("saddle", CubeListBuilder.create(), PartPose.offset(1.5F, 14.75F, -9.0F));
		PartDefinition saddleBase = saddle.addOrReplaceChild("saddleBase", CubeListBuilder.create().texOffs(53, 87).addBox(-6.0F, 7.0F, -7.5F, 10.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -27.65F, 1.0F));
		PartDefinition saddleBack = saddleBase.addOrReplaceChild("saddleBack", CubeListBuilder.create().texOffs(71, 102).addBox(-5.0F, -2.0F, -1.5F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 2.0F));
		PartDefinition saddleFront = saddleBase.addOrReplaceChild("saddleFront", CubeListBuilder.create().texOffs(53, 102).addBox(-3.5F, 8.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -6.0F));
		PartDefinition saddleDetail = saddle.addOrReplaceChild("saddleDetail", CubeListBuilder.create().texOffs(53, 65).addBox(-7.0F, 8.5F, -6.5F, 11.0F, 10.0F, 10.0F, new CubeDeformation(0.2F)), PartPose.offset(0.5F, -28.25F, 0.0F));
		PartDefinition lBag = body.addOrReplaceChild("lBag", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(1.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5F, -3.5F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition rBag = body.addOrReplaceChild("rBag", CubeListBuilder.create().texOffs(99, 46).addBox(-9.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -3.5F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition lHindLeg01 = partdefinition.addOrReplaceChild("lHindLeg01", CubeListBuilder.create().texOffs(90, 0).addBox(-3.0F, -5.0F, -3.0F, 5.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 7.25F, 9.0F));
		PartDefinition lHindLeg02 = lHindLeg01.addOrReplaceChild("lHindLeg02", CubeListBuilder.create().texOffs(90, 20).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 4.0F, 2.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition lHindHoof = lHindLeg02.addOrReplaceChild("lHindHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = lHindHoof.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition rHindLeg01 = partdefinition.addOrReplaceChild("rHindLeg01", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-2.0F, -5.0F, -3.0F, 5.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.5F, 7.25F, 9.0F));
		PartDefinition rHindLeg02 = rHindLeg01.addOrReplaceChild("rHindLeg02", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-1.5F, -2.0F, 0.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.25F, 4.0F, 2.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition rHindHoof = rHindLeg02.addOrReplaceChild("rHindHoof", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = rHindHoof.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.skelesnout_r1.visible = entityIn instanceof SkeletonHorse;
		this.saddle.visible = entityIn.isSaddled();
		this.lBag.visible = this.rBag.visible = entityIn instanceof AbstractChestedHorse && ((AbstractChestedHorse) entityIn).hasChest();
		this.saddleHarness.visible = this.saddle.visible && entityIn.isVehicle();
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lHindLeg01.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rHindLeg01.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	private static float wrapDeg(float rotO, float rotNew, float partialTicks) {
		float f;
		for(f = rotNew - rotO; f < -180.0F; f += 360.0F) {}
		while(f >= 180.0F) {
			f -= 360.0F;
		}
		return rotO + partialTicks * f;
	}

	@Override
	public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTickTime) {
		float bodyYaw = ModelNewHorse.wrapDeg(entity.yBodyRotO, entity.yBodyRot, partialTickTime);
		float headYaw = ModelNewHorse.wrapDeg(entity.yHeadRotO, entity.yHeadRot, partialTickTime);
		float headPitch = entity.xRotO + (entity.getXRot() - entity.xRotO) * partialTickTime;
		float yawDiff = Mth.clamp(headYaw - bodyYaw, -20F, 20F);
		float headPitchRad = rad(headPitch);
		if(limbSwingAmount > 0.2F) {
			headPitchRad += Mth.cos(limbSwing * 0.4F) * 0.15F * limbSwingAmount;
		}
		float grass = entity.getEatAnim(partialTickTime);
		float rear = entity.getStandAnim(partialTickTime);
		float rearInv = 1.0F - rear;
		float mouthOpen = entity.getMouthAnim(partialTickTime);
		this.body.xRot = 0.0F;
		float neckMultiplier = yawDiff * 0.017453292F;
		this.body.xRot = (rear * -((float) Math.PI / 4F) + rearInv * this.body.xRot) * 0.65F;
		float neck = rear * (0.2617994F + headPitchRad) + grass * 2.1816616F + (1.0F - Math.max(rear, grass)) * (0.5235988F + headPitchRad);
		this.neck01.xRot = neck * 0.25F;
		this.neck02.xRot = neck * 0.15F + 0.3927F;
		this.snout.xRot = -0.09424778F * mouthOpen - 0.1309F;
		this.lowerJaw.xRot = 0.15707964F * mouthOpen;
		this.neck01.yRot = rear * yawDiff * 0.017453292F + (1.0F - Math.max(rear, grass)) * neckMultiplier;
		float f9 = entity.tickCount + partialTickTime;
		float f10 = Mth.cos(limbSwing * 0.33F + (float) Math.PI);
		float f11 = f10 * limbSwingAmount * 0.8F;
		float f12 = 0.2617994F * rear;
		float f13 = Mth.cos(f9 * 0.33F + (float) Math.PI);
		float f14 = ((-1.0471976F + f13) * rear + f11 * rearInv);
		float f15 = ((-1.0471976F - f13) * rear + -f11 * rearInv);
		this.lHindLeg01.xRot = f12 + -f10 * 0.5F * limbSwingAmount * rearInv;
		this.rHindLeg01.xRot = f12 + f10 * 0.5F * limbSwingAmount * rearInv;
		this.lForeleg01.xRot = f14;
		this.rForeleg01.xRot = f15;
	}
}