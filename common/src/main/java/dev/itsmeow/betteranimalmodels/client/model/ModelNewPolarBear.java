package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.animal.PolarBear;

public class ModelNewPolarBear<T extends PolarBear> extends Model<T> {

	public ModelPart hind;
	public ModelPart chest;
	public ModelPart hump;
	public ModelPart lArm01;
	public ModelPart lArm02;
	public ModelPart lForepaw;
	public ModelPart lForeClaw02;
	public ModelPart lForeClaw01;
	public ModelPart lForeClaw03;
	public ModelPart lForeClaw04;
	public ModelPart lForeClaw05;
	public ModelPart lArmFur;
	public ModelPart rArm01;
	public ModelPart rArm02;
	public ModelPart rForepaw01;
	public ModelPart rForeClaw01;
	public ModelPart rForeClaw02;
	public ModelPart rForeClaw03;
	public ModelPart rForeClaw04;
	public ModelPart rForeClaw05;
	public ModelPart rArmFur;
	public ModelPart neck;
	public ModelPart neckFur01;
	public ModelPart head;
	public ModelPart upperJaw;
	public ModelPart lowerJaw;
	public ModelPart snout;
	public ModelPart lEarSmall;
	public ModelPart rEarSmall;
	public ModelPart bodyFur;
	public ModelPart lLeg01;
	public ModelPart lLeg02;
	public ModelPart lHindpaw;
	public ModelPart lHindClaw05;
	public ModelPart lHindClaw02;
	public ModelPart lHindClaw01;
	public ModelPart lHindClaw03;
	public ModelPart lHindClaw04;
	public ModelPart rLeg01;
	public ModelPart rLeg02;
	public ModelPart rHindpaw;
	public ModelPart rHindClaw01;
	public ModelPart rHindClaw02;
	public ModelPart rHindClaw03;
	public ModelPart rHindClaw04;
	public ModelPart rHindClaw05;
	private boolean hindInit = false;
	private float hindYInit = 0F;

	public ModelNewPolarBear(ModelPart root) {
		this.hind = root.getChild("hind");
		this.chest = hind.getChild("chest");
		this.hump = chest.getChild("hump");
		this.lArm01 = chest.getChild("lArm01");
		this.lArm02 = lArm01.getChild("lArm02");
		this.lForepaw = lArm02.getChild("lForepaw");
		this.lForeClaw02 = lForepaw.getChild("lForeClaw02");
		this.lForeClaw01 = lForepaw.getChild("lForeClaw01");
		this.lForeClaw03 = lForepaw.getChild("lForeClaw03");
		this.lForeClaw04 = lForepaw.getChild("lForeClaw04");
		this.lForeClaw05 = lForepaw.getChild("lForeClaw05");
		this.lArmFur = lArm02.getChild("lArmFur");
		this.rArm01 = chest.getChild("rArm01");
		this.rArm02 = rArm01.getChild("rArm02");
		this.rForepaw01 = rArm02.getChild("rForepaw01");
		this.rForeClaw01 = rForepaw01.getChild("rForeClaw01");
		this.rForeClaw02 = rForepaw01.getChild("rForeClaw02");
		this.rForeClaw03 = rForepaw01.getChild("rForeClaw03");
		this.rForeClaw04 = rForepaw01.getChild("rForeClaw04");
		this.rForeClaw05 = rForepaw01.getChild("rForeClaw05");
		this.rArmFur = rArm02.getChild("rArmFur");
		this.neck = chest.getChild("neck");
		this.neckFur01 = neck.getChild("neckFur01");
		this.head = neck.getChild("head");
		this.upperJaw = head.getChild("upperJaw");
		this.lowerJaw = head.getChild("lowerJaw");
		this.snout = head.getChild("snout");
		this.lEarSmall = head.getChild("lEarSmall");
		this.rEarSmall = head.getChild("rEarSmall");
		this.bodyFur = chest.getChild("bodyFur");
		this.lLeg01 = root.getChild("lLeg01");
		this.lLeg02 = lLeg01.getChild("lLeg02");
		this.lHindpaw = lLeg02.getChild("lHindpaw");
		this.lHindClaw05 = lHindpaw.getChild("lHindClaw05");
		this.lHindClaw02 = lHindpaw.getChild("lHindClaw02");
		this.lHindClaw01 = lHindpaw.getChild("lHindClaw01");
		this.lHindClaw03 = lHindpaw.getChild("lHindClaw03");
		this.lHindClaw04 = lHindpaw.getChild("lHindClaw04");
		this.rLeg01 = root.getChild("rLeg01");
		this.rLeg02 = rLeg01.getChild("rLeg02");
		this.rHindpaw = rLeg02.getChild("rHindpaw");
		this.rHindClaw01 = rHindpaw.getChild("rHindClaw01");
		this.rHindClaw02 = rHindpaw.getChild("rHindClaw02");
		this.rHindClaw03 = rHindpaw.getChild("rHindClaw03");
		this.rHindClaw04 = rHindpaw.getChild("rHindClaw04");
		this.rHindClaw05 = rHindpaw.getChild("rHindClaw05");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hind = partdefinition.addOrReplaceChild("hind", CubeListBuilder.create().texOffs(0, 22).addBox(-6.5F, -5.25F, -7.7F, 13.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 11.0F));
		PartDefinition chest = hind.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -5.0F, -7.0F, 11.0F, 10.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(8, 8).addBox(-5.5F, -5.0F, -10.0F, 11.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6F, -11.6F));
		PartDefinition hump = chest.addOrReplaceChild("hump", CubeListBuilder.create().texOffs(65, 46).addBox(-3.0F, -3.0F, -2.3F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.6F, -6.9F));
		PartDefinition lArm01 = chest.addOrReplaceChild("lArm01", CubeListBuilder.create().texOffs(81, 0).addBox(-0.25F, -1.0F, -2.5F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.3F, -0.7F, -5.0F));
		PartDefinition lArm02 = lArm01.addOrReplaceChild("lArm02", CubeListBuilder.create().texOffs(82, 17).addBox(-2.5F, 0.3F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.4F, 0.7F, -0.0873F, 0.0F, 0.0F));
		PartDefinition lForepaw = lArm02.addOrReplaceChild("lForepaw", CubeListBuilder.create().texOffs(79, 32).addBox(-3.0F, 0.3F, -3.3F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 8.5F, -2.0F, 0.0911F, 0.0F, 0.0F));
		PartDefinition lForeClaw02 = lForepaw.addOrReplaceChild("lForeClaw02", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0F, -1.7F, 0.182F, -0.182F, 0.0F));
		PartDefinition lForeClaw01 = lForepaw.addOrReplaceChild("lForeClaw01", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 1.1F, -1.3F, 0.182F, -0.2731F, 0.0F));
		PartDefinition lForeClaw03 = lForepaw.addOrReplaceChild("lForeClaw03", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.0F, -2.0F, 0.182F, 0.0F, 0.0F));
		PartDefinition lForeClaw04 = lForepaw.addOrReplaceChild("lForeClaw04", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 1.0F, -1.8F, 0.182F, 0.182F, 0.0F));
		PartDefinition lForeClaw05 = lForepaw.addOrReplaceChild("lForeClaw05", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 1.3F, 0.7F, 0.1367F, 0.2731F, 0.0F));
		PartDefinition lArmFur = lArm02.addOrReplaceChild("lArmFur", CubeListBuilder.create().texOffs(44, 47).addBox(-2.0F, -0.2F, -0.2F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, 2.1F, -0.0911F, 0.0F, 0.0F));
		PartDefinition rArm01 = chest.addOrReplaceChild("rArm01", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-4.75F, -1.0F, -2.5F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.3F, -0.7F, -5.0F));
		PartDefinition rArm02 = rArm01.addOrReplaceChild("rArm02", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-2.5F, 0.3F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.4F, 0.7F, -0.0873F, 0.0F, 0.0F));
		PartDefinition rForepaw01 = rArm02.addOrReplaceChild("rForepaw01", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-3.0F, 0.3F, -3.3F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 8.5F, -2.0F, 0.0911F, 0.0F, 0.0F));
		PartDefinition rForeClaw01 = rForepaw01.addOrReplaceChild("rForeClaw01", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0F, -1.7F, 0.182F, 0.182F, 0.0F));
		PartDefinition rForeClaw02 = rForepaw01.addOrReplaceChild("rForeClaw02", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.1F, -1.3F, 0.182F, 0.2731F, 0.0F));
		PartDefinition rForeClaw03 = rForepaw01.addOrReplaceChild("rForeClaw03", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.0F, -2.0F, 0.182F, 0.0F, 0.0F));
		PartDefinition rForeClaw04 = rForepaw01.addOrReplaceChild("rForeClaw04", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 1.0F, -1.8F, 0.182F, -0.182F, 0.0F));
		PartDefinition rForeClaw05 = rForepaw01.addOrReplaceChild("rForeClaw05", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7F, 1.3F, 0.7F, 0.1367F, -0.2731F, 0.0F));
		PartDefinition rArmFur = rArm02.addOrReplaceChild("rArmFur", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-2.0F, -0.2F, -0.2F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7F, 2.1F, -0.0911F, 0.0F, 0.0F));
		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(54, 1).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.2F, -9.2F));
		PartDefinition neckFur01 = neck.addOrReplaceChild("neckFur01", CubeListBuilder.create().texOffs(50, 27).addBox(-3.5F, -6.0F, -1.8F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.7F, -2.75F));
		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 13).addBox(-3.5F, -3.5F, -7.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.05F, -2.7F));
		PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(105, 48).addBox(-2.0F, -1.0F, -4.1F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 1.6F, -6.8F));
		PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(104, 56).addBox(-2.0F, -0.5F, -4.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.1F, -6.5F));
		PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(89, 44).addBox(-1.5F, -1.3F, -4.4F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -6.8F, 0.182F, 0.0F, 0.0F));
		PartDefinition lEarSmall = head.addOrReplaceChild("lEarSmall", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, -2.45F, -0.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -2.55F, -2.2F, 0.0456F, 0.0F, 0.4098F));
		PartDefinition rEarSmall = head.addOrReplaceChild("rEarSmall", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.2F, -2.7F, -0.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -2.3F, -2.2F, 0.0456F, 0.0F, -0.4098F));
		PartDefinition bodyFur = chest.addOrReplaceChild("bodyFur", CubeListBuilder.create().texOffs(0, 45).addBox(-4.0F, 1.7F, 0.0F, 8.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.15F, -4.1F));
		PartDefinition lLeg01 = partdefinition.addOrReplaceChild("lLeg01", CubeListBuilder.create().texOffs(104, 0).addBox(0.0F, -2.1F, -3.0F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 7.1F, 9.8F, 0.0F, 0.0F, -0.0873F));
		PartDefinition lLeg02 = lLeg01.addOrReplaceChild("lLeg02", CubeListBuilder.create().texOffs(108, 19).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 7.5F, 0.1F, 0.1309F, 0.0F, 0.0873F));
		PartDefinition lHindpaw = lLeg02.addOrReplaceChild("lHindpaw", CubeListBuilder.create().texOffs(80, 33).addBox(-3.0F, 0.3F, -4.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3F, 0.2F, -0.0911F, 0.0F, 0.0F));
		PartDefinition lHindClaw05 = lHindpaw.addOrReplaceChild("lHindClaw05", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 1.5F, -2.1F, 0.1367F, 0.2276F, 0.0F));
		PartDefinition lHindClaw02 = lHindpaw.addOrReplaceChild("lHindClaw02", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3F, -3.5F, 0.182F, 0.0F, 0.0F));
		PartDefinition lHindClaw01 = lHindpaw.addOrReplaceChild("lHindClaw01", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 1.4F, -3.2F, 0.182F, 0.0F, 0.0F));
		PartDefinition lHindClaw03 = lHindpaw.addOrReplaceChild("lHindClaw03", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.3F, -3.6F, 0.182F, 0.0F, 0.0F));
		PartDefinition lHindClaw04 = lHindpaw.addOrReplaceChild("lHindClaw04", CubeListBuilder.create().texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 1.3F, -3.3F, 0.182F, 0.0F, 0.0F));
		PartDefinition rLeg01 = partdefinition.addOrReplaceChild("rLeg01", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-5.0F, -2.1F, -3.0F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 7.1F, 9.8F, 0.0F, 0.0F, 0.0873F));
		PartDefinition rLeg02 = rLeg01.addOrReplaceChild("rLeg02", CubeListBuilder.create().texOffs(108, 19).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 7.5F, 0.1F, 0.1309F, 0.0F, -0.0873F));
		PartDefinition rHindpaw = rLeg02.addOrReplaceChild("rHindpaw", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-3.0F, 0.3F, -4.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3F, 0.2F, -0.0911F, 0.0F, 0.0F));
		PartDefinition rHindClaw01 = rHindpaw.addOrReplaceChild("rHindClaw01", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7F, 1.5F, -2.1F, 0.1367F, -0.2276F, 0.0F));
		PartDefinition rHindClaw02 = rHindpaw.addOrReplaceChild("rHindClaw02", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -3.5F, 0.182F, 0.0F, 0.0F));
		PartDefinition rHindClaw03 = rHindpaw.addOrReplaceChild("rHindClaw03", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.4F, -3.2F, 0.182F, 0.0F, 0.0F));
		PartDefinition rHindClaw04 = rHindpaw.addOrReplaceChild("rHindClaw04", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.3F, -3.6F, 0.182F, 0.0F, 0.0F));
		PartDefinition rHindClaw05 = rHindpaw.addOrReplaceChild("rHindClaw05", CubeListBuilder.create().texOffs(116, 34).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 1.3F, -3.3F, 0.182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if(!hindInit) {
			hindInit = true;
			hindYInit = hind.y;
		}
		this.quadriped(lLeg01, lArm01, rLeg01, rArm01, limbSwing * 0.666F, limbSwingAmount);
		this.headPitch(neck, headPitch);
		this.headYaw(neck, netHeadYaw);

		if (entity.getStandingAnimationScale(ageInTicks - (float) entity.tickCount) != 0) {
			standingAnim(ageInTicks);
		} else {
			resetStandingAnim();
		}
	}

	public void standingAnim(float ageInTicks) {
		final float off = pi() * 0.333F;
		this.hind.xRot = -off;
		this.hind.y = hindYInit - 2F;
		this.lLeg01.xRot = 0F;
		this.rLeg01.xRot = 0F;
		this.flap(lArm01, rArm01, ageInTicks * 0.5F, 0.9F, true);
		this.neck.xRot += off;
		this.lowerJaw.xRot = rad(45F);
	}

	public void resetStandingAnim() {
		this.hind.xRot = 0F;
		this.hind.y = hindYInit;
		this.lowerJaw.xRot = 0F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hind.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lLeg01.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rLeg01.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}