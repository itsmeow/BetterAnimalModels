package com.ocelot.betteranimals.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.math.MathHelper;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep extends Model {

	public ModelRenderer body;
	public ModelRenderer tail;
	public ModelRenderer neck;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer woolBody;
	public ModelRenderer woolNeck01;
	public ModelRenderer head;
	public ModelRenderer mouth01;
	public ModelRenderer mouth02;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer woolHead;
	public ModelRenderer lArm02;
	public ModelRenderer woolLArm;
	public ModelRenderer woolLArm2;
	public ModelRenderer lForeHoof;
	public ModelRenderer rArm02;
	public ModelRenderer woolRArm;
	public ModelRenderer woolRArm2;
	public ModelRenderer rForeHoof;
	public ModelRenderer lLeg02;
	public ModelRenderer woolLLeg;
	public ModelRenderer woolLLeg2;
	public ModelRenderer lHindHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer woolRLeg;
	public ModelRenderer woolRLeg2;
	public ModelRenderer rHindHoof;
	public ModelRenderer wooltail;

	public ModelNewSheep() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.wooltail = new ModelRenderer(this, 0, 0);
		this.wooltail.setRotationPoint(0.0F, -1.2F, 4.6F);
		this.wooltail.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(wooltail, 0.6373942428283291F, 0.0F, 0.0F);
		this.mouth02 = new ModelRenderer(this, 53, 22);
		this.mouth02.setRotationPoint(0.0F, 3.2F, 0.3F);
		this.mouth02.addBox(-1.4F, 0.3F, -0.4F, 3, 2, 1, 0.0F);
		this.woolHead = new ModelRenderer(this, 11, 9);
		this.woolHead.setRotationPoint(0.0F, 1.2F, 0.7F);
		this.woolHead.addBox(-1.5F, -2.5F, -2.5F, 3, 2, 4, 0.0F);
		this.setRotateAngle(woolHead, 1.4114477660878142F, 0.0F, 0.0F);
		this.woolRArm = new ModelRenderer(this, 48, 5);
		this.woolRArm.mirror = true;
		this.woolRArm.setRotationPoint(0.0F, -0.5F, 0.0F);
		this.woolRArm.addBox(-2.0F, -0.3F, -2.0F, 4, 7, 4, 0.0F);
		this.woolBody = new ModelRenderer(this, 2, 0);
		this.woolBody.setRotationPoint(0.0F, -0.5F, 2.5F);
		this.woolBody.addBox(-3.5F, -3.0F, -4.7F, 7, 6, 11, 0.0F);
		this.woolLArm = new ModelRenderer(this, 48, 5);
		this.woolLArm.setRotationPoint(0.0F, -0.5F, 0.0F);
		this.woolLArm.addBox(-2.0F, -0.3F, -2.0F, 4, 7, 4, 0.0F);
		this.woolRLeg = new ModelRenderer(this, 48, 5);
		this.woolRLeg.mirror = true;
		this.woolRLeg.setRotationPoint(0.0F, -0.5F, 0.0F);
		this.woolRLeg.addBox(-2.0F, -0.3F, -2.0F, 4, 7, 4, 0.0F);
		this.lHindHoof = new ModelRenderer(this, 50, 0);
		this.lHindHoof.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.lHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
		this.rLeg01 = new ModelRenderer(this, 28, 0);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-2.1F, 0.3F, 6.4F);
		this.rLeg01.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
		this.body = new ModelRenderer(this, 28, 17);
		this.body.setRotationPoint(0.0F, 13.7F, -3.8F);
		this.body.addBox(-3.0F, -3.0F, -2.0F, 6, 5, 10, 0.0F);
		this.lLeg01 = new ModelRenderer(this, 28, 0);
		this.lLeg01.setRotationPoint(2.1F, 0.3F, 6.4F);
		this.lLeg01.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
		this.woolNeck01 = new ModelRenderer(this, 10, 8);
		this.woolNeck01.setRotationPoint(0.0F, 0.0F, -3.0F);
		this.woolNeck01.addBox(-1.5F, -2.5F, -1.4F, 3, 5, 4, 0.0F);
		this.lForeHoof = new ModelRenderer(this, 50, 0);
		this.lForeHoof.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.lForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 41, 0);
		this.lLeg02.setRotationPoint(0.0F, 5.3F, 0.0F);
		this.lLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 41, 0);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 5.3F, 0.0F);
		this.rLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.tail = new ModelRenderer(this, 39, 8);
		this.tail.setRotationPoint(0.0F, -1.7F, 6.2F);
		this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(tail, 0.6373942428283291F, 0.0F, 0.0F);
		this.woolRArm2 = new ModelRenderer(this, 51, 6);
		this.woolRArm2.mirror = true;
		this.woolRArm2.setRotationPoint(0.0F, 5.4F, 0.0F);
		this.woolRArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.woolRLeg2 = new ModelRenderer(this, 51, 6);
		this.woolRLeg2.mirror = true;
		this.woolRLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);
		this.woolRLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.rArm01 = new ModelRenderer(this, 28, 0);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-2.1F, 0.2F, 0.0F);
		this.rArm01.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
		this.rHindHoof = new ModelRenderer(this, 50, 0);
		this.rHindHoof.mirror = true;
		this.rHindHoof.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.rHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
		this.rEar = new ModelRenderer(this, 0, 19);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-1.3F, 0.6F, -0.9F);
		this.rEar.addBox(-2.0F, -0.5F, -1.1F, 2, 1, 2, 0.0F);
		this.lArm01 = new ModelRenderer(this, 28, 0);
		this.lArm01.setRotationPoint(2.1F, 0.2F, 0.0F);
		this.lArm01.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
		this.woolLLeg = new ModelRenderer(this, 48, 5);
		this.woolLLeg.setRotationPoint(0.0F, -0.5F, 0.0F);
		this.woolLLeg.addBox(-2.0F, -0.3F, -2.0F, 4, 7, 4, 0.0F);
		this.mouth01 = new ModelRenderer(this, 53, 17);
		this.mouth01.setRotationPoint(0.0F, 3.3F, -0.6F);
		this.mouth01.addBox(-1.4F, 0.3F, -0.5F, 3, 2, 1, 0.0F);
		this.rForeHoof = new ModelRenderer(this, 50, 0);
		this.rForeHoof.mirror = true;
		this.rForeHoof.setRotationPoint(0.0F, 3.8F, 0.0F);
		this.rForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
		this.lEar = new ModelRenderer(this, 0, 19);
		this.lEar.setRotationPoint(1.3F, 0.6F, -0.9F);
		this.lEar.addBox(0.0F, -0.5F, -1.1F, 2, 1, 2, 0.0F);
		this.head = new ModelRenderer(this, 19, 19);
		this.head.setRotationPoint(0.0F, -1.5F, -3.9F);
		this.head.addBox(-2.0F, 0.0F, -1.5F, 4, 4, 3, 0.0F);
		this.setRotateAngle(head, -0.5462880558742251F, 0.0F, 0.0F);
		this.rArm02 = new ModelRenderer(this, 41, 0);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(0.0F, 5.3F, 0.0F);
		this.rArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.neck = new ModelRenderer(this, 4, 21);
		this.neck.setRotationPoint(0.0F, -0.8F, -0.4F);
		this.neck.addBox(-1.0F, -2.0F, -5.0F, 2, 4, 5, 0.0F);
		this.setRotateAngle(neck, -0.5918411493512771F, 0.0F, 0.0F);
		this.lArm02 = new ModelRenderer(this, 41, 0);
		this.lArm02.setRotationPoint(0.0F, 5.3F, 0.0F);
		this.lArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.woolLArm2 = new ModelRenderer(this, 51, 6);
		this.woolLArm2.setRotationPoint(0.0F, 5.5F, 0.0F);
		this.woolLArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.woolLLeg2 = new ModelRenderer(this, 51, 6);
		this.woolLLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);
		this.woolLLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.woolBody.addChild(this.wooltail);
		this.head.addChild(this.mouth02);
		this.head.addChild(this.woolHead);
		this.rArm01.addChild(this.woolRArm);
		this.body.addChild(this.woolBody);
		this.lArm01.addChild(this.woolLArm);
		this.rLeg01.addChild(this.woolRLeg);
		this.lLeg02.addChild(this.lHindHoof);
		this.body.addChild(this.rLeg01);
		this.body.addChild(this.lLeg01);
		this.neck.addChild(this.woolNeck01);
		this.lArm02.addChild(this.lForeHoof);
		this.lLeg01.addChild(this.lLeg02);
		this.rLeg01.addChild(this.rLeg02);
		this.body.addChild(this.tail);
		this.rArm01.addChild(this.woolRArm2);
		this.rLeg01.addChild(this.woolRLeg2);
		this.body.addChild(this.rArm01);
		this.rLeg02.addChild(this.rHindHoof);
		this.head.addChild(this.rEar);
		this.body.addChild(this.lArm01);
		this.lLeg01.addChild(this.woolLLeg);
		this.head.addChild(this.mouth01);
		this.rArm02.addChild(this.rForeHoof);
		this.head.addChild(this.lEar);
		this.neck.addChild(this.head);
		this.rArm01.addChild(this.rArm02);
		this.body.addChild(this.neck);
		this.lArm01.addChild(this.lArm02);
		this.lArm01.addChild(this.woolLArm2);
		this.lLeg01.addChild(this.woolLLeg2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.body.render(f5);

		if (entity instanceof EntitySheep) {
			if (((EntitySheep) entity).getSheared()) {
				this.woolBody.isHidden = true;
				this.woolHead.isHidden = true;
				this.woolLArm.isHidden = true;
				this.woolLArm2.isHidden = true;
				this.woolLLeg.isHidden = true;
				this.woolLLeg2.isHidden = true;
				this.woolNeck01.isHidden = true;
				this.woolRArm.isHidden = true;
				this.woolRArm2.isHidden = true;
				this.woolRLeg.isHidden = true;
				this.woolRLeg2.isHidden = true;
				this.wooltail.isHidden = true;
			} else {
				this.woolBody.isHidden = false;
				this.woolHead.isHidden = false;
				this.woolLArm.isHidden = false;
				this.woolLArm2.isHidden = false;
				this.woolLLeg.isHidden = false;
				this.woolLLeg2.isHidden = false;
				this.woolNeck01.isHidden = false;
				this.woolRArm.isHidden = false;
				this.woolRArm2.isHidden = false;
				this.woolRLeg.isHidden = false;
				this.woolRLeg2.isHidden = false;
				this.wooltail.isHidden = false;
			}
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {		
		float swingModifier = 0.9f;
		float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			limbSwing = limbSwing + this.getSwingProgressPrev(living);
			this.head.rotateAngleY = this.getHeadYaw(living) * 0.01f;
			this.head.rotateAngleZ = this.head.rotateAngleY;
			this.head.rotateAngleX = (float) Math.toRadians(this.getHeadPitch(living));
			lLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			rLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.neck.rotateAngleX = -0.6F;
			this.head.rotateAngleX = -0.6F;
		}
	}
}
