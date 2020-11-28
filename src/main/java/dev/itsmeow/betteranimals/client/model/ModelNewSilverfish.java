package dev.itsmeow.betteranimals.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * newsilverfish - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewSilverfish extends Model {

	public ModelRenderer thorax01;
	public ModelRenderer head;
	public ModelRenderer thorax02;
	public ModelRenderer lLeg01a;
	public ModelRenderer lLeg02a;
	public ModelRenderer rLeg01a;
	public ModelRenderer rLeg01a_1;
	public ModelRenderer lAntenna;
	public ModelRenderer rAntenna;
	public ModelRenderer tail01;
	public ModelRenderer lLeg03a;
	public ModelRenderer rLeg03a;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer tail05;
	public ModelRenderer lTailWhisker;
	public ModelRenderer rTailWhisker;
	public ModelRenderer mTailWhisker;
	public ModelRenderer lLeg03b;
	public ModelRenderer rLeg03b;
	public ModelRenderer lLeg01b;
	public ModelRenderer lLeg02b;
	public ModelRenderer lLeg01b_1;
	public ModelRenderer rLeg01b;

	public ModelNewSilverfish() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.lAntenna = new ModelRenderer(this, 37, 0);
		this.lAntenna.setRotationPoint(0.7F, -0.4F, -1.2F);
		this.lAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
		this.setRotateAngle(lAntenna, 0.0F, -0.22759093446006054F, 0.0F);
		this.thorax01 = new ModelRenderer(this, 0, 0);
		this.thorax01.setRotationPoint(0.0F, 20.6F, -1.0F);
		this.thorax01.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 6, 0.0F);
		this.tail05 = new ModelRenderer(this, 26, 17);
		this.tail05.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail05.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
		this.tail03 = new ModelRenderer(this, 26, 6);
		this.tail03.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail03.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
		this.tail01 = new ModelRenderer(this, 26, 0);
		this.tail01.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.tail01.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F);
		this.lLeg03a = new ModelRenderer(this, 41, 15);
		this.lLeg03a.setRotationPoint(1.8F, 0.5F, 1.0F);
		this.lLeg03a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lLeg03a, 0.0F, -0.31869712141416456F, 0.0F);
		this.lLeg03b = new ModelRenderer(this, 43, 19);
		this.lLeg03b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg03b, 0.0F, 0.0F, -0.5462880558742251F);
		this.lLeg02b = new ModelRenderer(this, 43, 19);
		this.lLeg02b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg02b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg02b, 0.0F, 0.0F, -0.5462880558742251F);
		this.rLeg01a_1 = new ModelRenderer(this, 41, 15);
		this.rLeg01a_1.mirror = true;
		this.rLeg01a_1.setRotationPoint(-2.2F, 0.5F, 1.0F);
		this.rLeg01a_1.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.tail02 = new ModelRenderer(this, 26, 6);
		this.tail02.setRotationPoint(0.0F, 0.0F, 3.0F);
		this.tail02.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
		this.tail04 = new ModelRenderer(this, 26, 11);
		this.tail04.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.rLeg03a = new ModelRenderer(this, 41, 15);
		this.rLeg03a.mirror = true;
		this.rLeg03a.setRotationPoint(-1.8F, 0.5F, 1.0F);
		this.rLeg03a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rLeg03a, 0.0F, 0.31869712141416456F, 0.0F);
		this.lTailWhisker = new ModelRenderer(this, 41, 0);
		this.lTailWhisker.mirror = true;
		this.lTailWhisker.setRotationPoint(0.5F, -0.1F, 1.4F);
		this.lTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
		this.setRotateAngle(lTailWhisker, 0.0F, 0.5235987755982988F, 0.0F);
		this.lLeg02a = new ModelRenderer(this, 41, 15);
		this.lLeg02a.setRotationPoint(2.2F, 0.5F, 1.0F);
		this.lLeg02a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.rLeg01a = new ModelRenderer(this, 41, 15);
		this.rLeg01a.mirror = true;
		this.rLeg01a.setRotationPoint(-2.2F, 0.5F, -1.5F);
		this.rLeg01a.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rLeg01a, 0.0F, -0.31869712141416456F, 0.0F);
		this.rLeg03b = new ModelRenderer(this, 43, 19);
		this.rLeg03b.mirror = true;
		this.rLeg03b.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.rLeg03b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rLeg03b, 0.0F, 0.0F, 0.5462880558742251F);
		this.rAntenna = new ModelRenderer(this, 37, 0);
		this.rAntenna.mirror = true;
		this.rAntenna.setRotationPoint(-0.7F, -0.4F, -1.2F);
		this.rAntenna.addBox(-0.5F, 0.0F, -8.0F, 1, 0, 8, 0.0F);
		this.setRotateAngle(rAntenna, 0.0F, 0.22759093446006054F, 0.0F);
		this.rLeg01b = new ModelRenderer(this, 43, 19);
		this.rLeg01b.mirror = true;
		this.rLeg01b.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.rLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rLeg01b, 0.0F, 0.0F, 0.5462880558742251F);
		this.lLeg01b_1 = new ModelRenderer(this, 43, 19);
		this.lLeg01b_1.setRotationPoint(-2.6F, -0.2F, 0.0F);
		this.lLeg01b_1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg01b_1, 0.0F, 0.0F, 0.5462880558742251F);
		this.thorax02 = new ModelRenderer(this, 0, 12);
		this.thorax02.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.thorax02.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 3, 0.0F);
		this.lLeg01b = new ModelRenderer(this, 43, 19);
		this.lLeg01b.setRotationPoint(2.6F, -0.2F, 0.0F);
		this.lLeg01b.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lLeg01b, 0.0F, 0.0F, -0.5462880558742251F);
		this.head = new ModelRenderer(this, 0, 21);
		this.head.setRotationPoint(0.0F, 0.0F, -3.2F);
		this.head.addBox(-2.0F, -1.5F, -1.7F, 4, 3, 2, 0.0F);
		this.lLeg01a = new ModelRenderer(this, 41, 15);
		this.lLeg01a.setRotationPoint(2.2F, 0.5F, -1.5F);
		this.lLeg01a.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lLeg01a, 0.0F, 0.31869712141416456F, 0.0F);
		this.rTailWhisker = new ModelRenderer(this, 41, 0);
		this.rTailWhisker.mirror = true;
		this.rTailWhisker.setRotationPoint(-0.5F, -0.1F, 1.4F);
		this.rTailWhisker.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
		this.setRotateAngle(rTailWhisker, 0.0F, -0.5235987755982988F, 0.0F);
		this.mTailWhisker = new ModelRenderer(this, 44, 0);
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
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
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
