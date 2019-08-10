package com.ocelot.betteranimals.client.model;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

/**
 * newsilverfish - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewSilverfish extends Model {

	public RendererModel thorax01;
	public RendererModel head;
	public RendererModel thorax02;
	public RendererModel lLeg01a;
	public RendererModel lLeg02a;
	public RendererModel rLeg01a;
	public RendererModel rLeg01a_1;
	public RendererModel lAntenna;
	public RendererModel rAntenna;
	public RendererModel tail01;
	public RendererModel lLeg03a;
	public RendererModel rLeg03a;
	public RendererModel tail02;
	public RendererModel tail03;
	public RendererModel tail04;
	public RendererModel tail05;
	public RendererModel lTailWhisker;
	public RendererModel rTailWhisker;
	public RendererModel mTailWhisker;
	public RendererModel lLeg03b;
	public RendererModel rLeg03b;
	public RendererModel lLeg01b;
	public RendererModel lLeg02b;
	public RendererModel lLeg01b_1;
	public RendererModel rLeg01b;

	public ModelNewSilverfish() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.lAntenna = new RendererModel(this, 37, 0);
		this.lAntenna.setRotationPoint(0.7F, -0.4F, -1.2F);
		this.lAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
		this.setRotateAngle(lAntenna, 0.0F, -0.22759093446006054F, 0.0F);
		this.thorax01 = new RendererModel(this, 0, 0);
		this.thorax01.setRotationPoint(0.0F, 20.6F, -1.0F);
		this.thorax01.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 6, 0.0F);
		this.tail05 = new RendererModel(this, 26, 17);
		this.tail05.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail05.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
		this.tail03 = new RendererModel(this, 26, 6);
		this.tail03.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail03.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
		this.tail01 = new RendererModel(this, 26, 0);
		this.tail01.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.tail01.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F);
		this.lLeg03a = new RendererModel(this, 41, 15);
		this.lLeg03a.setRotationPoint(1.8F, 0.5F, 1.0F);
		this.lLeg03a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lLeg03a, 0.0F, -0.31869712141416456F, 0.0F);
		this.lLeg03b = new RendererModel(this, 43, 19);
		this.lLeg03b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg03b, 0.0F, 0.0F, -0.5462880558742251F);
		this.lLeg02b = new RendererModel(this, 43, 19);
		this.lLeg02b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg02b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg02b, 0.0F, 0.0F, -0.5462880558742251F);
		this.rLeg01a_1 = new RendererModel(this, 41, 15);
		this.rLeg01a_1.mirror = true;
		this.rLeg01a_1.setRotationPoint(-2.2F, 0.5F, 1.0F);
		this.rLeg01a_1.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.tail02 = new RendererModel(this, 26, 6);
		this.tail02.setRotationPoint(0.0F, 0.0F, 3.0F);
		this.tail02.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
		this.tail04 = new RendererModel(this, 26, 11);
		this.tail04.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.rLeg03a = new RendererModel(this, 41, 15);
		this.rLeg03a.mirror = true;
		this.rLeg03a.setRotationPoint(-1.8F, 0.5F, 1.0F);
		this.rLeg03a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rLeg03a, 0.0F, 0.31869712141416456F, 0.0F);
		this.lTailWhisker = new RendererModel(this, 41, 0);
		this.lTailWhisker.mirror = true;
		this.lTailWhisker.setRotationPoint(0.5F, -0.1F, 1.4F);
		this.lTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
		this.setRotateAngle(lTailWhisker, 0.0F, 0.5235987755982988F, 0.0F);
		this.lLeg02a = new RendererModel(this, 41, 15);
		this.lLeg02a.setRotationPoint(2.2F, 0.5F, 1.0F);
		this.lLeg02a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.rLeg01a = new RendererModel(this, 41, 15);
		this.rLeg01a.mirror = true;
		this.rLeg01a.setRotationPoint(-2.2F, 0.5F, -1.5F);
		this.rLeg01a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rLeg01a, 0.0F, -0.31869712141416456F, 0.0F);
		this.rLeg03b = new RendererModel(this, 43, 19);
		this.rLeg03b.mirror = true;
		this.rLeg03b.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.rLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rLeg03b, 0.0F, 0.0F, 0.5462880558742251F);
		this.rAntenna = new RendererModel(this, 37, 0);
		this.rAntenna.mirror = true;
		this.rAntenna.setRotationPoint(-0.7F, -0.4F, -1.2F);
		this.rAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
		this.setRotateAngle(rAntenna, 0.0F, 0.22759093446006054F, 0.0F);
		this.rLeg01b = new RendererModel(this, 43, 19);
		this.rLeg01b.mirror = true;
		this.rLeg01b.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.rLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rLeg01b, 0.0F, 0.0F, 0.5462880558742251F);
		this.lLeg01b_1 = new RendererModel(this, 43, 19);
		this.lLeg01b_1.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.lLeg01b_1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg01b_1, 0.0F, 0.0F, 0.5462880558742251F);
		this.thorax02 = new RendererModel(this, 0, 12);
		this.thorax02.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.thorax02.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 3, 0.0F);
		this.lLeg01b = new RendererModel(this, 43, 19);
		this.lLeg01b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg01b, 0.0F, 0.0F, -0.5462880558742251F);
		this.head = new RendererModel(this, 0, 21);
		this.head.setRotationPoint(0.0F, 0.0F, -3.2F);
		this.head.addBox(-2.0F, -1.5F, -1.7F, 4, 3, 2, 0.0F);
		this.lLeg01a = new RendererModel(this, 41, 15);
		this.lLeg01a.setRotationPoint(2.2F, 0.5F, -1.5F);
		this.lLeg01a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lLeg01a, 0.0F, 0.31869712141416456F, 0.0F);
		this.rTailWhisker = new RendererModel(this, 41, 0);
		this.rTailWhisker.mirror = true;
		this.rTailWhisker.setRotationPoint(-0.5F, -0.1F, 1.4F);
		this.rTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
		this.setRotateAngle(rTailWhisker, 0.0F, -0.5235987755982988F, 0.0F);
		this.mTailWhisker = new RendererModel(this, 44, 0);
		this.mTailWhisker.mirror = true;
		this.mTailWhisker.setRotationPoint(0.0F, -0.1F, 1.4F);
		this.mTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 12, 0.0F);
		this.head.addChild(this.lAntenna);
		this.tail04.addChild(this.tail05);
		this.tail02.addChild(this.tail03);
		this.thorax02.addChild(this.tail01);
		this.thorax02.addChild(this.lLeg03a);
		this.lLeg03a.addChild(this.lLeg03b);
		this.lLeg02a.addChild(this.lLeg02b);
		this.thorax01.addChild(this.rLeg01a_1);
		this.tail01.addChild(this.tail02);
		this.tail03.addChild(this.tail04);
		this.thorax02.addChild(this.rLeg03a);
		this.tail05.addChild(this.lTailWhisker);
		this.thorax01.addChild(this.lLeg02a);
		this.thorax01.addChild(this.rLeg01a);
		this.rLeg03a.addChild(this.rLeg03b);
		this.head.addChild(this.rAntenna);
		this.rLeg01a_1.addChild(this.rLeg01b);
		this.rLeg01a.addChild(this.lLeg01b_1);
		this.thorax01.addChild(this.thorax02);
		this.lLeg01a.addChild(this.lLeg01b);
		this.thorax01.addChild(this.head);
		this.thorax01.addChild(this.lLeg01a);
		this.tail05.addChild(this.rTailWhisker);
		this.tail05.addChild(this.mTailWhisker);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.thorax01.render(f5);
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
		float swingModifier = 0.9f;
		if (entity instanceof LivingEntity) {
			LivingEntity living = (LivingEntity) entity;
			limbSwing = limbSwing + Model.getSwingProgressPrev(living);
			this.lLeg01a.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.lLeg01b.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			
			this.lLeg02a.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.lLeg02b.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
		
			this.lLeg03a.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.lLeg03b.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			
			this.rLeg01a.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.rLeg01b.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;

			this.rLeg03a.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.rLeg03b.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
		
			this.tail01.rotateAngleY = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount * 0.1f;
			this.tail02.rotateAngleY = this.tail01.rotateAngleY;
			this.tail03.rotateAngleY = this.tail01.rotateAngleY;
			this.tail04.rotateAngleY = this.tail01.rotateAngleY;
			this.tail05.rotateAngleY = this.tail01.rotateAngleY;
		}
	}
}
