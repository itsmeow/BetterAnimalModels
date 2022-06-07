package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.animal.PolarBear;

public class ModelNewPolarBear<T extends PolarBear> extends Model<T> {

	private final ModelPart hind;
	private final ModelPart chest;
	private final ModelPart hump;
	private final ModelPart lArm01;
	private final ModelPart lArm02;
	private final ModelPart lForepaw;
	private final ModelPart lForeClaw02;
	private final ModelPart lForeClaw01;
	private final ModelPart lForeClaw03;
	private final ModelPart lForeClaw04;
	private final ModelPart lForeClaw05;
	private final ModelPart lArmFur;
	private final ModelPart rArm01;
	private final ModelPart rArm02;
	private final ModelPart rForepaw01;
	private final ModelPart rForeClaw01;
	private final ModelPart rForeClaw02;
	private final ModelPart rForeClaw03;
	private final ModelPart rForeClaw04;
	private final ModelPart rForeClaw05;
	private final ModelPart rArmFur;
	private final ModelPart neck;
	private final ModelPart neckFur01;
	private final ModelPart head;
	private final ModelPart upperJaw;
	private final ModelPart lowerJaw;
	private final ModelPart snout;
	private final ModelPart lEarSmall;
	private final ModelPart rEarSmall;
	private final ModelPart bodyFur;
	private final ModelPart lLeg01;
	private final ModelPart lLeg02;
	private final ModelPart lHindpaw;
	private final ModelPart lHindClaw05;
	private final ModelPart lHindClaw02;
	private final ModelPart lHindClaw01;
	private final ModelPart lHindClaw03;
	private final ModelPart lHindClaw04;
	private final ModelPart rLeg01;
	private final ModelPart rLeg02;
	private final ModelPart rHindpaw;
	private final ModelPart rHindClaw01;
	private final ModelPart rHindClaw02;
	private final ModelPart rHindClaw03;
	private final ModelPart rHindClaw04;
	private final ModelPart rHindClaw05;
	private boolean hindInit = false;
	private float hindYInit = 0F;

	public ModelNewPolarBear() {
		texWidth = 128;
		texHeight = 64;

		hind = new ModelPart(this);
		hind.setPos(0.0F, 7.0F, 11.0F);
		hind.texOffs(0, 22).addBox(-6.5F, -5.25F, -7.7F, 13.0F, 12.0F, 11.0F, 0.0F, false);

		chest = new ModelPart(this);
		chest.setPos(0.0F, 0.6F, -11.6F);
		hind.addChild(chest);
		chest.texOffs(0, 0).addBox(-5.5F, -5.0F, -7.0F, 11.0F, 10.0F, 11.0F, 0.0F, false);
		chest.texOffs(8, 8).addBox(-5.5F, -5.0F, -10.0F, 11.0F, 10.0F, 3.0F, 0.0F, false);

		hump = new ModelPart(this);
		hump.setPos(0.0F, -3.6F, -6.9F);
		chest.addChild(hump);
		hump.texOffs(65, 46).addBox(-3.0F, -3.0F, -2.3F, 6.0F, 3.0F, 9.0F, 0.0F, false);

		lArm01 = new ModelPart(this);
		lArm01.setPos(2.3F, -0.7F, -5.0F);
		chest.addChild(lArm01);
		lArm01.texOffs(81, 0).addBox(-0.25F, -1.0F, -2.5F, 5.0F, 10.0F, 6.0F, 0.0F, false);

		lArm02 = new ModelPart(this);
		lArm02.setPos(2.0F, 7.4F, 0.7F);
		lArm01.addChild(lArm02);
		setRotationAngle(lArm02, -0.0873F, 0.0F, 0.0F);
		lArm02.texOffs(82, 17).addBox(-2.5F, 0.3F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		lForepaw = new ModelPart(this);
		lForepaw.setPos(0.2F, 8.5F, -2.0F);
		lArm02.addChild(lForepaw);
		setRotationAngle(lForepaw, 0.0911F, 0.0F, 0.0F);
		lForepaw.texOffs(79, 32).addBox(-3.0F, 0.3F, -3.3F, 6.0F, 2.0F, 7.0F, 0.0F, false);

		lForeClaw02 = new ModelPart(this);
		lForeClaw02.setPos(1.1F, 1.0F, -1.7F);
		lForepaw.addChild(lForeClaw02);
		setRotationAngle(lForeClaw02, 0.182F, -0.182F, 0.0F);
		lForeClaw02.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lForeClaw01 = new ModelPart(this);
		lForeClaw01.setPos(2.3F, 1.1F, -1.3F);
		lForepaw.addChild(lForeClaw01);
		setRotationAngle(lForeClaw01, 0.182F, -0.2731F, 0.0F);
		lForeClaw01.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lForeClaw03 = new ModelPart(this);
		lForeClaw03.setPos(-0.3F, 1.0F, -2.0F);
		lForepaw.addChild(lForeClaw03);
		setRotationAngle(lForeClaw03, 0.182F, 0.0F, 0.0F);
		lForeClaw03.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lForeClaw04 = new ModelPart(this);
		lForeClaw04.setPos(-1.7F, 1.0F, -1.8F);
		lForepaw.addChild(lForeClaw04);
		setRotationAngle(lForeClaw04, 0.182F, 0.182F, 0.0F);
		lForeClaw04.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lForeClaw05 = new ModelPart(this);
		lForeClaw05.setPos(-2.7F, 1.3F, 0.7F);
		lForepaw.addChild(lForeClaw05);
		setRotationAngle(lForeClaw05, 0.1367F, 0.2731F, 0.0F);
		lForeClaw05.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lArmFur = new ModelPart(this);
		lArmFur.setPos(0.0F, -2.7F, 2.1F);
		lArm02.addChild(lArmFur);
		setRotationAngle(lArmFur, -0.0911F, 0.0F, 0.0F);
		lArmFur.texOffs(44, 47).addBox(-2.0F, -0.2F, -0.2F, 4.0F, 7.0F, 3.0F, 0.0F, false);

		rArm01 = new ModelPart(this);
		rArm01.setPos(-2.3F, -0.7F, -5.0F);
		chest.addChild(rArm01);
		rArm01.texOffs(81, 0).addBox(-4.75F, -1.0F, -2.5F, 5.0F, 10.0F, 6.0F, 0.0F, true);

		rArm02 = new ModelPart(this);
		rArm02.setPos(-2.0F, 7.4F, 0.7F);
		rArm01.addChild(rArm02);
		setRotationAngle(rArm02, -0.0873F, 0.0F, 0.0F);
		rArm02.texOffs(82, 17).addBox(-2.5F, 0.3F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		rForepaw01 = new ModelPart(this);
		rForepaw01.setPos(-0.2F, 8.5F, -2.0F);
		rArm02.addChild(rForepaw01);
		setRotationAngle(rForepaw01, 0.0911F, 0.0F, 0.0F);
		rForepaw01.texOffs(79, 32).addBox(-3.0F, 0.3F, -3.3F, 6.0F, 2.0F, 7.0F, 0.0F, true);

		rForeClaw01 = new ModelPart(this);
		rForeClaw01.setPos(-1.1F, 1.0F, -1.7F);
		rForepaw01.addChild(rForeClaw01);
		setRotationAngle(rForeClaw01, 0.182F, 0.182F, 0.0F);
		rForeClaw01.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rForeClaw02 = new ModelPart(this);
		rForeClaw02.setPos(-2.3F, 1.1F, -1.3F);
		rForepaw01.addChild(rForeClaw02);
		setRotationAngle(rForeClaw02, 0.182F, 0.2731F, 0.0F);
		rForeClaw02.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rForeClaw03 = new ModelPart(this);
		rForeClaw03.setPos(0.3F, 1.0F, -2.0F);
		rForepaw01.addChild(rForeClaw03);
		setRotationAngle(rForeClaw03, 0.182F, 0.0F, 0.0F);
		rForeClaw03.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rForeClaw04 = new ModelPart(this);
		rForeClaw04.setPos(1.7F, 1.0F, -1.8F);
		rForepaw01.addChild(rForeClaw04);
		setRotationAngle(rForeClaw04, 0.182F, -0.182F, 0.0F);
		rForeClaw04.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rForeClaw05 = new ModelPart(this);
		rForeClaw05.setPos(2.7F, 1.3F, 0.7F);
		rForepaw01.addChild(rForeClaw05);
		setRotationAngle(rForeClaw05, 0.1367F, -0.2731F, 0.0F);
		rForeClaw05.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rArmFur = new ModelPart(this);
		rArmFur.setPos(0.0F, -2.7F, 2.1F);
		rArm02.addChild(rArmFur);
		setRotationAngle(rArmFur, -0.0911F, 0.0F, 0.0F);
		rArmFur.texOffs(44, 47).addBox(-2.0F, -0.2F, -0.2F, 4.0F, 7.0F, 3.0F, 0.0F, true);

		neck = new ModelPart(this);
		neck.setPos(0.0F, 0.2F, -9.2F);
		chest.addChild(neck);
		neck.texOffs(54, 1).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 7.0F, 5.0F, 0.0F, false);

		neckFur01 = new ModelPart(this);
		neckFur01.setPos(0.0F, 2.7F, -2.75F);
		neck.addChild(neckFur01);
		neckFur01.texOffs(50, 27).addBox(-3.5F, -6.0F, -1.8F, 7.0F, 10.0F, 7.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPos(0.0F, -0.05F, -2.7F);
		neck.addChild(head);
		head.texOffs(49, 13).addBox(-3.5F, -3.5F, -7.0F, 7.0F, 7.0F, 6.0F, 0.0F, false);

		upperJaw = new ModelPart(this);
		upperJaw.setPos(0.0F, 1.6F, -6.8F);
		head.addChild(upperJaw);
		upperJaw.texOffs(105, 48).addBox(-2.0F, -1.0F, -4.1F, 4.0F, 2.0F, 4.0F, 0.1F, false);

		lowerJaw = new ModelPart(this);
		lowerJaw.setPos(0.0F, 3.1F, -6.5F);
		head.addChild(lowerJaw);
		lowerJaw.texOffs(104, 56).addBox(-2.0F, -0.5F, -4.1F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		snout = new ModelPart(this);
		snout.setPos(0.0F, 0.1F, -6.8F);
		head.addChild(snout);
		setRotationAngle(snout, 0.182F, 0.0F, 0.0F);
		snout.texOffs(89, 44).addBox(-1.5F, -1.3F, -4.4F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		lEarSmall = new ModelPart(this);
		lEarSmall.setPos(2.25F, -2.55F, -2.2F);
		head.addChild(lEarSmall);
		setRotationAngle(lEarSmall, 0.0456F, 0.0F, 0.4098F);
		lEarSmall.texOffs(0, 0).addBox(-0.8F, -2.45F, -0.7F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		rEarSmall = new ModelPart(this);
		rEarSmall.setPos(-2.25F, -2.3F, -2.2F);
		head.addChild(rEarSmall);
		setRotationAngle(rEarSmall, 0.0456F, 0.0F, -0.4098F);
		rEarSmall.texOffs(0, 0).addBox(-1.2F, -2.7F, -0.7F, 2.0F, 3.0F, 1.0F, 0.0F, true);

		bodyFur = new ModelPart(this);
		bodyFur.setPos(0.0F, 3.15F, -4.1F);
		chest.addChild(bodyFur);
		bodyFur.texOffs(0, 45).addBox(-4.0F, 1.7F, 0.0F, 8.0F, 3.0F, 11.0F, 0.0F, false);

		lLeg01 = new ModelPart(this);
		lLeg01.setPos(3.0F, 7.1F, 9.8F);
		setRotationAngle(lLeg01, 0.0F, 0.0F, -0.0873F);
		lLeg01.texOffs(104, 0).addBox(0.0F, -2.1F, -3.0F, 5.0F, 11.0F, 7.0F, 0.0F, false);

		lLeg02 = new ModelPart(this);
		lLeg02.setPos(2.1F, 7.5F, 0.1F);
		lLeg01.addChild(lLeg02);
		setRotationAngle(lLeg02, 0.1309F, 0.0F, 0.0873F);
		lLeg02.texOffs(108, 19).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		lHindpaw = new ModelPart(this);
		lHindpaw.setPos(0.0F, 7.3F, 0.2F);
		lLeg02.addChild(lHindpaw);
		setRotationAngle(lHindpaw, -0.0911F, 0.0F, 0.0F);
		lHindpaw.texOffs(80, 33).addBox(-3.0F, 0.3F, -4.7F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		lHindClaw05 = new ModelPart(this);
		lHindClaw05.setPos(-2.7F, 1.5F, -2.1F);
		lHindpaw.addChild(lHindClaw05);
		setRotationAngle(lHindClaw05, 0.1367F, 0.2276F, 0.0F);
		lHindClaw05.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lHindClaw02 = new ModelPart(this);
		lHindClaw02.setPos(1.1F, 1.3F, -3.5F);
		lHindpaw.addChild(lHindClaw02);
		setRotationAngle(lHindClaw02, 0.182F, 0.0F, 0.0F);
		lHindClaw02.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lHindClaw01 = new ModelPart(this);
		lHindClaw01.setPos(2.3F, 1.4F, -3.2F);
		lHindpaw.addChild(lHindClaw01);
		setRotationAngle(lHindClaw01, 0.182F, 0.0F, 0.0F);
		lHindClaw01.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lHindClaw03 = new ModelPart(this);
		lHindClaw03.setPos(-0.3F, 1.3F, -3.6F);
		lHindpaw.addChild(lHindClaw03);
		setRotationAngle(lHindClaw03, 0.182F, 0.0F, 0.0F);
		lHindClaw03.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lHindClaw04 = new ModelPart(this);
		lHindClaw04.setPos(-1.7F, 1.3F, -3.3F);
		lHindpaw.addChild(lHindClaw04);
		setRotationAngle(lHindClaw04, 0.182F, 0.0F, 0.0F);
		lHindClaw04.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		rLeg01 = new ModelPart(this);
		rLeg01.setPos(-3.0F, 7.1F, 9.8F);
		setRotationAngle(rLeg01, 0.0F, 0.0F, 0.0873F);
		rLeg01.texOffs(104, 0).addBox(-5.0F, -2.1F, -3.0F, 5.0F, 11.0F, 7.0F, 0.0F, true);

		rLeg02 = new ModelPart(this);
		rLeg02.setPos(-2.1F, 7.5F, 0.1F);
		rLeg01.addChild(rLeg02);
		setRotationAngle(rLeg02, 0.1309F, 0.0F, -0.0873F);
		rLeg02.texOffs(108, 19).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, true);

		rHindpaw = new ModelPart(this);
		rHindpaw.setPos(0.0F, 7.3F, 0.2F);
		rLeg02.addChild(rHindpaw);
		setRotationAngle(rHindpaw, -0.0911F, 0.0F, 0.0F);
		rHindpaw.texOffs(80, 33).addBox(-3.0F, 0.3F, -4.7F, 6.0F, 2.0F, 6.0F, 0.0F, true);

		rHindClaw01 = new ModelPart(this);
		rHindClaw01.setPos(2.7F, 1.5F, -2.1F);
		rHindpaw.addChild(rHindClaw01);
		setRotationAngle(rHindClaw01, 0.1367F, -0.2276F, 0.0F);
		rHindClaw01.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rHindClaw02 = new ModelPart(this);
		rHindClaw02.setPos(-1.1F, 1.3F, -3.5F);
		rHindpaw.addChild(rHindClaw02);
		setRotationAngle(rHindClaw02, 0.182F, 0.0F, 0.0F);
		rHindClaw02.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rHindClaw03 = new ModelPart(this);
		rHindClaw03.setPos(-2.3F, 1.4F, -3.2F);
		rHindpaw.addChild(rHindClaw03);
		setRotationAngle(rHindClaw03, 0.182F, 0.0F, 0.0F);
		rHindClaw03.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rHindClaw04 = new ModelPart(this);
		rHindClaw04.setPos(0.3F, 1.3F, -3.6F);
		rHindpaw.addChild(rHindClaw04);
		setRotationAngle(rHindClaw04, 0.182F, 0.0F, 0.0F);
		rHindClaw04.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

		rHindClaw05 = new ModelPart(this);
		rHindClaw05.setPos(1.7F, 1.3F, -3.3F);
		rHindpaw.addChild(rHindClaw05);
		setRotationAngle(rHindClaw05, 0.182F, 0.0F, 0.0F);
		rHindClaw05.texOffs(116, 34).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
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