package com.ocelot.betteranimals.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * cow2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewCow extends Model {
	
	public ModelRenderer body;
	public ModelRenderer udder;
	public ModelRenderer neck;
	public ModelRenderer tail00;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer head;
	public ModelRenderer muzzle;
	public ModelRenderer mouth;
	public ModelRenderer lHorn;
	public ModelRenderer rHorn;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer tail01;
	public ModelRenderer lArm02;
	public ModelRenderer lForeHoof;
	public ModelRenderer rArm02;
	public ModelRenderer rForeHoof;
	public ModelRenderer lLeg02;
	public ModelRenderer lHindHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rHindHoof;

	public ModelNewCow() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.neck = new ModelRenderer(this, 32, 0);
		this.neck.setRotationPoint(0.0F, -0.4F, -5.1F);
		this.neck.addBox(-2.0F, -2.5F, -5.0F, 4, 5, 5, 0.0F);
		this.setRotateAngle(neck, -0.4553564018453205F, 0.0F, 0.0F);
		this.rForeHoof = new ModelRenderer(this, 21, 25);
		this.rForeHoof.mirror = true;
		this.rForeHoof.setRotationPoint(0.0F, 5.9F, 0.2F);
		this.rForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.tail00 = new ModelRenderer(this, 58, 24);
		this.tail00.setRotationPoint(0.0F, -2.6F, 6.6F);
		this.tail00.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.setRotateAngle(tail00, 0.27314402793711257F, 0.0F, 0.0F);
		this.rEar = new ModelRenderer(this, 41, 11);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-1.8F, -1.5F, -3.1F);
		this.rEar.addBox(-3.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F);
		this.setRotateAngle(rEar, 1.5707963267948966F, 0.0F, 0.0F);
		this.lArm02 = new ModelRenderer(this, 55, 0);
		this.lArm02.setRotationPoint(0.0F, 6.3F, -0.1F);
		this.lArm02.addBox(-1.0F, 0.0F, -0.8F, 2, 6, 2, 0.0F);
		this.rLeg01 = new ModelRenderer(this, 0, 0);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-3.5F, -0.4F, 4.1F);
		this.rLeg01.addBox(-1.5F, -0.1F, -1.5F, 3, 9, 4, 0.0F);
		this.lHorn = new ModelRenderer(this, 51, 9);
		this.lHorn.setRotationPoint(1.5F, -1.5F, -3.2F);
		this.lHorn.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lHorn, -0.7285004297824331F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 46, 14);
		this.head.setRotationPoint(0.0F, 0.9F, -4.0F);
		this.head.addBox(-2.5F, -2.6F, -4.0F, 5, 5, 4, 0.0F);
		this.setRotateAngle(head, -0.4553564018453205F, 0.0F, 0.0F);
		this.lArm01 = new ModelRenderer(this, 1, 1);
		this.lArm01.setRotationPoint(3.0F, 0.1F, -4.0F);
		this.lArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.body = new ModelRenderer(this, 1, 0);
		this.body.setRotationPoint(0.0F, 9.7F, 0.0F);
		this.body.addBox(-4.0F, -3.5F, -7.0F, 8, 9, 14, 0.0F);
		this.lEar = new ModelRenderer(this, 41, 11);
		this.lEar.setRotationPoint(1.8F, -1.5F, -3.1F);
		this.lEar.addBox(0.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F);
		this.setRotateAngle(lEar, 1.5707963267948966F, 0.0F, 0.0F);
		this.rArm02 = new ModelRenderer(this, 55, 0);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(0.0F, 6.3F, -0.1F);
		this.rArm02.addBox(-1.0F, 0.0F, -0.8F, 2, 6, 2, 0.0F);
		this.rArm01 = new ModelRenderer(this, 1, 1);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-3.0F, 0.1F, -4.0F);
		this.rArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
		this.rHindHoof = new ModelRenderer(this, 21, 25);
		this.rHindHoof.mirror = true;
		this.rHindHoof.setRotationPoint(0.0F, 5.9F, 0.2F);
		this.rHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.lForeHoof = new ModelRenderer(this, 21, 25);
		this.lForeHoof.setRotationPoint(0.0F, 5.9F, 0.2F);
		this.lForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.udder = new ModelRenderer(this, 0, 24);
		this.udder.setRotationPoint(0.0F, 5.4F, 4.2F);
		this.udder.addBox(-2.0F, 0.0F, -2.5F, 4, 2, 5, 0.0F);
		this.lLeg01 = new ModelRenderer(this, 0, 0);
		this.lLeg01.setRotationPoint(3.5F, -0.4F, 4.1F);
		this.lLeg01.addBox(-1.5F, -0.1F, -1.5F, 3, 9, 4, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 55, 0);
		this.lLeg02.setRotationPoint(0.0F, 7.1F, -0.1F);
		this.lLeg02.addBox(-1.0F, 0.0F, -0.8F, 2, 6, 2, 0.0F);
		this.tail01 = new ModelRenderer(this, 58, 24);
		this.tail01.setRotationPoint(0.0F, 5.8F, 0.0F);
		this.tail01.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.setRotateAngle(tail01, -0.22759093446006054F, 0.0F, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 55, 0);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 7.1F, 0.5F);
		this.rLeg02.addBox(-1.0F, 0.0F, -0.8F, 2, 6, 2, 0.0F);
		this.rHorn = new ModelRenderer(this, 51, 9);
		this.rHorn.setRotationPoint(-1.5F, -1.5F, -3.2F);
		this.rHorn.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rHorn, -0.7285004297824331F, 0.0F, 0.0F);
		this.lHindHoof = new ModelRenderer(this, 21, 25);
		this.lHindHoof.setRotationPoint(0.0F, 5.9F, 0.2F);
		this.lHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.mouth = new ModelRenderer(this, 34, 25);
		this.mouth.setRotationPoint(0.0F, 2.2F, -1.5F);
		this.mouth.addBox(-2.0F, -0.1F, -0.3F, 4, 3, 1, 0.0F);
		this.muzzle = new ModelRenderer(this, 45, 24);
		this.muzzle.setRotationPoint(0.0F, 2.2F, -1.7F);
		this.muzzle.addBox(-2.0F, -0.1F, -2.0F, 4, 3, 2, 0.0F);
		this.body.addChild(this.neck);
		this.rArm02.addChild(this.rForeHoof);
		this.body.addChild(this.tail00);
		this.head.addChild(this.rEar);
		this.lArm01.addChild(this.lArm02);
		this.body.addChild(this.rLeg01);
		this.head.addChild(this.lHorn);
		this.neck.addChild(this.head);
		this.body.addChild(this.lArm01);
		this.head.addChild(this.lEar);
		this.rArm01.addChild(this.rArm02);
		this.body.addChild(this.rArm01);
		this.rLeg02.addChild(this.rHindHoof);
		this.lArm02.addChild(this.lForeHoof);
		this.body.addChild(this.udder);
		this.body.addChild(this.lLeg01);
		this.lLeg01.addChild(this.lLeg02);
		this.tail00.addChild(this.tail01);
		this.rLeg01.addChild(this.rLeg02);
		this.head.addChild(this.rHorn);
		this.lLeg02.addChild(this.lHindHoof);
		this.head.addChild(this.mouth);
		this.head.addChild(this.muzzle);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.45F, 0.45F, 0.45F);
			GlStateManager.translate(0.0F, 1.5F, 0.0F);
			this.body.render(f5);
			GlStateManager.popMatrix();
		} else {
			this.body.render(f5);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		float swingModifier = 0.9f;
		float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			limbSwing = limbSwing + this.getSwingProgressPrev(living);
			this.neck.rotateAngleX = this.getHeadPitch(living) * 0.017453292F;
			this.neck.rotateAngleY = this.getHeadYaw(living) * 0.017453292F;
			lLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
			lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			rLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
			rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
		}
		this.neck.rotateAngleX = -0.6F;
		this.head.rotateAngleX = -0.6F;
	}
}
