package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.horse.AbstractChestedHorse;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;

public class ModelNewHorse<T extends AbstractHorse> extends Model<T> {

	private final ModelPart body;
	private final ModelPart ass;
	private final ModelPart tail01;
	private final ModelPart tail02a;
	private final ModelPart tail03;
	private final ModelPart tail04;
	private final ModelPart lForeleg01;
	private final ModelPart lForeleg02;
	private final ModelPart lForeleg03;
	private final ModelPart lFrontHoof;
	private final ModelPart rForeleg01;
	private final ModelPart rForeleg02;
	private final ModelPart rForeleg03;
	private final ModelPart rFrontHoof;
	private final ModelPart neck01;
	private final ModelPart cube_r1;
	private final ModelPart neck02;
	private final ModelPart head;
	private final ModelPart lEar;
	private final ModelPart lLongEar_r1;
	private final ModelPart rEar;
	private final ModelPart rLongEar_r1;
	private final ModelPart snout;
	private final ModelPart nose_r1;
	private final ModelPart snoutbox;
	private final ModelPart skelesnout_r1;
	private final ModelPart upperJaw;
	private final ModelPart lowerJaw;
	private final ModelPart saddleHarness;
	private final ModelPart rLeash_r1;
	private final ModelPart lLeash_r1;
	private final ModelPart mane01;
	private final ModelPart mane02;
	private final ModelPart cube_r2;
	private final ModelPart mane03;
	private final ModelPart saddle;
	private final ModelPart saddleBase;
	private final ModelPart saddleBack;
	private final ModelPart saddleFront;
	private final ModelPart saddleDetail;
	private final ModelPart lBag;
	private final ModelPart rBag;
	private final ModelPart lHindLeg01;
	private final ModelPart lHindLeg02;
	private final ModelPart lHindHoof;
	private final ModelPart cube_r3;
	private final ModelPart rHindLeg01;
	private final ModelPart rHindLeg02;
	private final ModelPart rHindHoof;
	private final ModelPart cube_r4;

	public ModelNewHorse() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelPart(this);
		body.setPos(-0.5F, 6.5F, 10.0F);
		body.texOffs(0, 0).addBox(-5.0F, -5.0F, -23.0F, 11.0F, 10.0F, 18.0F, 0.0F, false);

		ass = new ModelPart(this);
		ass.setPos(0.0F, -1.25F, -4.0F);
		body.addChild(ass);
		setRotationAngle(ass, -0.1745F, 0.0F, 0.0F);
		ass.texOffs(0, 29).addBox(-6.0F, -4.25F, -2.0F, 13.0F, 10.0F, 9.0F, 0.0F, false);

		tail01 = new ModelPart(this);
		tail01.setPos(1.5F, -2.15F, 5.15F);
		ass.addChild(tail01);
		setRotationAngle(tail01, -0.5934F, 0.0F, 0.0F);
		tail01.texOffs(48, 28).addBox(-3.0F, -2.5F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		tail02a = new ModelPart(this);
		tail02a.setPos(0.0F, -0.1F, 4.6F);
		tail01.addChild(tail02a);
		setRotationAngle(tail02a, -0.3927F, 0.0F, 0.0F);
		tail02a.texOffs(49, 38).addBox(-3.0F, -2.5F, -0.5F, 4.0F, 4.0F, 4.0F, 0.2F, false);

		tail03 = new ModelPart(this);
		tail03.setPos(-1.0F, 0.0F, 2.6F);
		tail02a.addChild(tail03);
		setRotationAngle(tail03, -0.3142F, 0.0F, 0.0F);
		tail03.texOffs(45, 48).addBox(-2.5F, -3.0F, -0.35F, 5.0F, 5.0F, 8.0F, -0.1F, false);

		tail04 = new ModelPart(this);
		tail04.setPos(0.0F, -1.0F, 6.6F);
		tail03.addChild(tail04);
		setRotationAngle(tail04, 0.2094F, 0.0F, 0.0F);
		tail04.texOffs(74, 50).addBox(-2.0F, -1.25F, -0.95F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		lForeleg01 = new ModelPart(this);
		lForeleg01.setPos(6.0F, 1.0F, -20.0F);
		body.addChild(lForeleg01);
		lForeleg01.texOffs(60, 0).addBox(-3.0F, -5.0F, -2.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		lForeleg02 = new ModelPart(this);
		lForeleg02.setPos(-0.5F, 2.5F, 0.5F);
		lForeleg01.addChild(lForeleg02);
		lForeleg02.texOffs(59, 16).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, -0.1F, false);

		lForeleg03 = new ModelPart(this);
		lForeleg03.setPos(0.5F, 6.0F, 0.0F);
		lForeleg02.addChild(lForeleg03);
		lForeleg03.texOffs(75, 16).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 7.0F, 4.0F, -0.2F, false);

		lFrontHoof = new ModelPart(this);
		lFrontHoof.setPos(0.0F, 6.75F, 0.0F);
		lForeleg03.addChild(lFrontHoof);
		lFrontHoof.texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		rForeleg01 = new ModelPart(this);
		rForeleg01.setPos(-5.0F, 1.0F, -20.0F);
		body.addChild(rForeleg01);
		rForeleg01.texOffs(60, 0).addBox(-2.0F, -5.0F, -2.0F, 5.0F, 8.0F, 7.0F, 0.0F, true);

		rForeleg02 = new ModelPart(this);
		rForeleg02.setPos(0.5F, 2.5F, 0.5F);
		rForeleg01.addChild(rForeleg02);
		rForeleg02.texOffs(59, 16).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 5.0F, -0.1F, true);

		rForeleg03 = new ModelPart(this);
		rForeleg03.setPos(-0.5F, 6.0F, 0.0F);
		rForeleg02.addChild(rForeleg03);
		rForeleg03.texOffs(75, 16).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 7.0F, 4.0F, -0.2F, true);

		rFrontHoof = new ModelPart(this);
		rFrontHoof.setPos(0.0F, 6.75F, 0.0F);
		rForeleg03.addChild(rFrontHoof);
		rFrontHoof.texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);

		neck01 = new ModelPart(this);
		neck01.setPos(0.0F, -2.0F, -21.0F);
		body.addChild(neck01);
		setRotationAngle(neck01, 0.1309F, 0.0F, 0.0F);


		cube_r1 = new ModelPart(this);
		cube_r1.setPos(0.0F, 0.0F, -2.0F);
		neck01.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 52).addBox(-3.5F, -2.0F, -3.0F, 8.0F, 7.0F, 10.0F, 0.0F, false);

		neck02 = new ModelPart(this);
		neck02.setPos(0.0F, -2.0F, -1.0F);
		neck01.addChild(neck02);
		setRotationAngle(neck02, 0.3927F, 0.0F, 0.0F);
		neck02.texOffs(0, 70).addBox(-2.5F, -6.0F, -4.0F, 6.0F, 8.0F, 8.0F, -0.01F, false);
		neck02.texOffs(10, 76).addBox(-2.5F, -11.75F, 1.0F, 6.0F, 6.0F, 3.0F, -0.1F, false);

		head = new ModelPart(this);
		head.setPos(0.5F, -8.75F, 0.25F);
		neck02.addChild(head);
		setRotationAngle(head, -0.4363F, 0.0F, 0.0F);
		head.texOffs(26, 92).addBox(-3.5F, -0.2F, -3.0F, 7.0F, 5.0F, 5.0F, -0.2F, false);
		head.texOffs(30, 82).addBox(-3.0F, -4.0F, -2.1F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		head.texOffs(39, 119).addBox(-2.0F, 3.25F, -6.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		lEar = new ModelPart(this);
		lEar.setPos(2.0F, -4.25F, 0.0F);
		head.addChild(lEar);
		lEar.texOffs(30, 70).addBox(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		lLongEar_r1 = new ModelPart(this);
		lLongEar_r1.setPos(0.0F, 0.0F, 0.0F);
		lEar.addChild(lLongEar_r1);
		setRotationAngle(lLongEar_r1, 0.0F, 0.0F, 0.1309F);
		lLongEar_r1.texOffs(40, 70).addBox(-1.25F, -5.5F, 0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		rEar = new ModelPart(this);
		rEar.setPos(-2.0F, -4.25F, 0.0F);
		head.addChild(rEar);
		rEar.texOffs(30, 70).addBox(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		rLongEar_r1 = new ModelPart(this);
		rLongEar_r1.setPos(0.0F, 0.0F, 0.0F);
		rEar.addChild(rLongEar_r1);
		setRotationAngle(rLongEar_r1, 0.0F, 0.0F, -0.1309F);
		rLongEar_r1.texOffs(40, 70).addBox(-0.75F, -5.5F, 0.5F, 2.0F, 6.0F, 1.0F, 0.0F, true);

		snout = new ModelPart(this);
		snout.setPos(0.0F, -1.75F, -2.0F);
		head.addChild(snout);
		setRotationAngle(snout, -0.1309F, 0.0F, 0.0F);


		nose_r1 = new ModelPart(this);
		nose_r1.setPos(0.0F, 2.0F, -8.0F);
		snout.addChild(nose_r1);
		setRotationAngle(nose_r1, 0.8727F, 0.0F, 0.0F);
		nose_r1.texOffs(0, 117).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 3.0F, 3.0F, 0.1F, false);

		snoutbox = new ModelPart(this);
		snoutbox.setPos(0.0F, 0.0F, 0.0F);
		snout.addChild(snoutbox);
		setRotationAngle(snoutbox,0.5236F, 0.0F, 0.0F);
		snoutbox.texOffs(0, 102).addBox(-2.0F, -2.0F, -6.75F, 4.0F, 5.0F, 8.0F, -0.1F, false);

		skelesnout_r1 = new ModelPart(this);
		skelesnout_r1.setPos(0.0F, 0.0F, 0.0F);
		snout.addChild(skelesnout_r1);
		setRotationAngle(skelesnout_r1, 0.5236F, 0.0F, 0.0F);
		skelesnout_r1.texOffs(114, 120).addBox(-2.0F, -2.0F, -9.5F, 4.0F, 5.0F, 3.0F, -0.1F, false);


		upperJaw = new ModelPart(this);
		upperJaw.setPos(0.0F, 4.25F, -3.0F);
		head.addChild(upperJaw);
		upperJaw.texOffs(27, 106).addBox(-2.0F, -3.0F, -7.5F, 4.0F, 2.0F, 8.0F, 0.0F, false);

		lowerJaw = new ModelPart(this);
		lowerJaw.setPos(0.0F, 3.25F, -6.5F);
		head.addChild(lowerJaw);
		lowerJaw.texOffs(21, 120).addBox(-2.0F, -0.01F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		saddleHarness = new ModelPart(this);
		saddleHarness.setPos(0.0F, 3.0F, -5.0F);
		head.addChild(saddleHarness);
		saddleHarness.texOffs(68, 29).addBox(-3.0F, -1.25F, -0.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		saddleHarness.texOffs(68, 34).addBox(-3.5F, -7.06F, 1.5F, 7.0F, 8.0F, 5.0F, 0.2F, false);
		saddleHarness.texOffs(94, 38).addBox(-2.0F, -5.5F, 0.0F, 4.0F, 5.0F, 1.0F, 0.2F, false);

		rLeash_r1 = new ModelPart(this);
		rLeash_r1.setPos(-3.0F, -1.0F, 1.0F);
		saddleHarness.addChild(rLeash_r1);
		setRotationAngle(rLeash_r1, 0.0873F, -0.1309F, 0.0F);
		rLeash_r1.texOffs(93, 45).addBox(0.2F, 0.0F, -1.0F, 0.0F, 3.0F, 17.0F, 0.0F, true);

		lLeash_r1 = new ModelPart(this);
		lLeash_r1.setPos(3.0F, -1.0F, 1.0F);
		saddleHarness.addChild(lLeash_r1);
		setRotationAngle(lLeash_r1, 0.0873F, 0.1309F, 0.0F);
		lLeash_r1.texOffs(93, 45).addBox(-0.2F, 0.0F, -1.0F, 0.0F, 3.0F, 17.0F, 0.0F, false);

		mane01 = new ModelPart(this);
		mane01.setPos(0.0F, -4.0F, 4.0F);
		neck02.addChild(mane01);
		setRotationAngle(mane01, 0.0436F, 0.0F, 0.0F);
		mane01.texOffs(116, 2).addBox(-1.0F, -8.75F, -1.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);

		mane02 = new ModelPart(this);
		mane02.setPos(0.5F, 0.0F, 0.0F);
		mane01.addChild(mane02);


		cube_r2 = new ModelPart(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		mane02.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
		cube_r2.texOffs(105, 23).addBox(-3.2F, -7.75F, 0.4F, 3.0F, 16.0F, 2.0F, 0.0F, false);

		mane03 = new ModelPart(this);
		mane03.setPos(-4.0F, 1.0F, -0.75F);
		mane02.addChild(mane03);
		setRotationAngle(mane03, -0.0436F, 0.1309F, 0.0F);
		mane03.texOffs(116, 22).addBox(0.0F, -7.75F, -4.0F, 1.0F, 15.0F, 5.0F, 0.0F, false);

		saddle = new ModelPart(this);
		saddle.setPos(1.5F, 14.75F, -9.0F);
		body.addChild(saddle);


		saddleBase = new ModelPart(this);
		saddleBase.setPos(0.0F, -27.65F, 1.0F);
		saddle.addChild(saddleBase);
		saddleBase.texOffs(53, 87).addBox(-6.0F, 7.0F, -7.5F, 10.0F, 2.0F, 11.0F, 0.0F, false);

		saddleBack = new ModelPart(this);
		saddleBack.setPos(0.0F, 7.0F, 2.0F);
		saddleBase.addChild(saddleBack);
		saddleBack.texOffs(71, 102).addBox(-5.0F, -2.0F, -1.5F, 8.0F, 2.0F, 3.0F, 0.0F, false);

		saddleFront = new ModelPart(this);
		saddleFront.setPos(0.0F, -2.0F, -6.0F);
		saddleBase.addChild(saddleFront);
		saddleFront.texOffs(53, 102).addBox(-3.5F, 8.0F, -1.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		saddleDetail = new ModelPart(this);
		saddleDetail.setPos(0.5F, -28.25F, 0.0F);
		saddle.addChild(saddleDetail);
		saddleDetail.texOffs(53, 65).addBox(-7.0F, 8.5F, -6.5F, 11.0F, 10.0F, 10.0F, 0.2F, false);

		lBag = new ModelPart(this);
		lBag.setPos(5.5F, -3.5F, -1.0F);
		body.addChild(lBag);
		setRotationAngle(lBag, 0.0F, 1.5708F, 0.0F);
		lBag.texOffs(99, 46).addBox(1.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, true);

		rBag = new ModelPart(this);
		rBag.setPos(-4.5F, -3.5F, -1.0F);
		body.addChild(rBag);
		setRotationAngle(rBag, 0.0F, -1.5708F, 0.0F);
		rBag.texOffs(99, 46).addBox(-9.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, false);

		lHindLeg01 = new ModelPart(this);
		lHindLeg01.setPos(5.5F, 7.25F, 9.0F);
		lHindLeg01.texOffs(90, 0).addBox(-3.0F, -5.0F, -3.0F, 5.0F, 12.0F, 7.0F, 0.0F, false);

		lHindLeg02 = new ModelPart(this);
		lHindLeg02.setPos(-0.25F, 4.0F, 2.0F);
		lHindLeg01.addChild(lHindLeg02);
		setRotationAngle(lHindLeg02, -0.2182F, 0.0F, 0.0F);
		lHindLeg02.texOffs(90, 20).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		lHindHoof = new ModelPart(this);
		lHindHoof.setPos(0.0F, 11.0F, 1.0F);
		lHindLeg02.addChild(lHindHoof);
		setRotationAngle(lHindHoof, -0.0873F, 0.0F, 0.0F);


		cube_r3 = new ModelPart(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		lHindHoof.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
		cube_r3.texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		rHindLeg01 = new ModelPart(this);
		rHindLeg01.setPos(-5.5F, 7.25F, 9.0F);
		rHindLeg01.texOffs(90, 0).addBox(-2.0F, -5.0F, -3.0F, 5.0F, 12.0F, 7.0F, 0.0F, true);

		rHindLeg02 = new ModelPart(this);
		rHindLeg02.setPos(0.25F, 4.0F, 2.0F);
		rHindLeg01.addChild(rHindLeg02);
		setRotationAngle(rHindLeg02, -0.2182F, 0.0F, 0.0F);
		rHindLeg02.texOffs(90, 20).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 13.0F, 3.0F, 0.0F, true);

		rHindHoof = new ModelPart(this);
		rHindHoof.setPos(0.0F, 11.0F, 1.0F);
		rHindLeg02.addChild(rHindHoof);
		setRotationAngle(rHindHoof, -0.0873F, 0.0F, 0.0F);


		cube_r4 = new ModelPart(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		rHindHoof.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
		cube_r4.texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
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
		float headPitch = entity.xRotO + (entity.xRot - entity.xRotO) * partialTickTime;
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