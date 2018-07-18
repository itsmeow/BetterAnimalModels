package com.ocelot.betteranimals.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * cow2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewPig extends Model {
	
	public ModelRenderer body;
	public ModelRenderer lArm01;
	public ModelRenderer neck;
	public ModelRenderer rArm01;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer tail;
	public ModelRenderer lArm02;
	public ModelRenderer lForeHoof;
	public ModelRenderer head;
	public ModelRenderer snout;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer mouth;
	public ModelRenderer rArm02;
	public ModelRenderer rForeHoof;
	public ModelRenderer lLeg02;
	public ModelRenderer lHindHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rHindHoof;

	public ModelNewPig() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.rLeg01 = new ModelRenderer(this, 46, 0);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-2.4F, -0.8F, 4.0F);
		this.rLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rLeg01, 0.06981317007977318F, 0.0F, 0.0F);
		this.tail = new ModelRenderer(this, 45, 25);
		this.tail.setRotationPoint(0.0F, -3.0F, 5.9F);
		this.tail.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 0, 0.0F);
		this.setRotateAngle(tail, 0.18203784098300857F, 0.0F, 0.0F);
		this.lHindHoof = new ModelRenderer(this, 38, 16);
		this.lHindHoof.setRotationPoint(0.1F, 4.4F, 0.8F);
		this.lHindHoof.addBox(-1.0F, 0.0F, -2.4F, 2, 1, 4, 0.0F);
		this.rHindHoof = new ModelRenderer(this, 38, 16);
		this.rHindHoof.mirror = true;
		this.rHindHoof.setRotationPoint(-0.1F, 4.4F, 0.8F);
		this.rHindHoof.addBox(-1.0F, 0.0F, -2.4F, 2, 1, 4, 0.0F);
		this.neck = new ModelRenderer(this, 0, 20);
		this.neck.setRotationPoint(0.0F, -1.1F, -4.4F);
		this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 5, 4, 0.0F);
		this.setRotateAngle(neck, -0.27314402793711257F, 0.0F, 0.0F);
		this.snout = new ModelRenderer(this, 28, 0);
		this.snout.setRotationPoint(0.0F, 0.4F, -3.4F);
		this.snout.addBox(-1.5F, -1.5F, -2.4F, 3, 2, 2, 0.0F);
		this.setRotateAngle(snout, 0.136659280431156F, 0.0F, 0.0F);
		this.rArm02 = new ModelRenderer(this, 49, 11);
		this.rArm02.setRotationPoint(-0.1F, 4.4F, 0.0F);
		this.rArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 3, 0.0F);
		this.lEar = new ModelRenderer(this, 0, 6);
		this.lEar.setRotationPoint(2.2F, -2.0F, -1.1F);
		this.lEar.addBox(-1.0F, -2.2F, -0.5F, 2, 3, 1, 0.0F);
		this.setRotateAngle(lEar, 0.31869712141416456F, 0.0F, 0.6373942428283291F);
		this.lArm02 = new ModelRenderer(this, 49, 11);
		this.lArm02.setRotationPoint(0.2F, 4.4F, 0.0F);
		this.lArm02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 3, 0.0F);
		this.rArm01 = new ModelRenderer(this, 46, 0);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-2.6F, 0.9F, -3.7F);
		this.rArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 49, 11);
		this.lLeg02.setRotationPoint(0.2F, 5.5F, 0.0F);
		this.lLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
		this.lArm01 = new ModelRenderer(this, 46, 0);
		this.lArm01.setRotationPoint(2.6F, 0.9F, -3.7F);
		this.lArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
		this.lForeHoof = new ModelRenderer(this, 38, 16);
		this.lForeHoof.setRotationPoint(0.1F, 3.8F, 0.8F);
		this.lForeHoof.addBox(-1.0F, 0.0F, -2.4F, 2, 1, 4, 0.0F);
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setRotationPoint(0.0F, 13.9F, 0.0F);
		this.body.addBox(-3.5F, -3.5F, -6.0F, 7, 7, 12, 0.0F);
		this.lLeg01 = new ModelRenderer(this, 46, 0);
		this.lLeg01.setRotationPoint(2.4F, -0.8F, 4.0F);
		this.lLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 4, 0.0F);
		this.head = new ModelRenderer(this, 19, 21);
		this.head.setRotationPoint(0.0F, -0.4F, -2.8F);
		this.head.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 4, 0.0F);
		this.setRotateAngle(head, 0.5462880558742251F, 0.0F, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 49, 11);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.2F, 5.5F, 0.0F);
		this.rLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F);
		this.rForeHoof = new ModelRenderer(this, 38, 16);
		this.rForeHoof.mirror = true;
		this.rForeHoof.setRotationPoint(-0.1F, 3.8F, 0.8F);
		this.rForeHoof.addBox(-1.0F, 0.0F, -2.4F, 2, 1, 4, 0.0F);
		this.mouth = new ModelRenderer(this, 28, 6);
		this.mouth.setRotationPoint(0.0F, 1.1F, -3.7F);
		this.mouth.addBox(-1.5F, -0.2F, -1.9F, 3, 1, 2, 0.0F);
		this.setRotateAngle(mouth, 0.136659280431156F, 0.0F, 0.0F);
		this.rEar = new ModelRenderer(this, 0, 6);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.2F, -2.0F, -1.1F);
		this.rEar.addBox(-1.0F, -2.2F, -0.5F, 2, 3, 1, 0.0F);
		this.setRotateAngle(rEar, 0.31869712141416456F, 0.0F, -0.6373942428283291F);
		this.body.addChild(this.rLeg01);
		this.body.addChild(this.tail);
		this.lLeg02.addChild(this.lHindHoof);
		this.rLeg02.addChild(this.rHindHoof);
		this.body.addChild(this.neck);
		this.head.addChild(this.snout);
		this.rArm01.addChild(this.rArm02);
		this.head.addChild(this.lEar);
		this.lArm01.addChild(this.lArm02);
		this.body.addChild(this.rArm01);
		this.lLeg01.addChild(this.lLeg02);
		this.body.addChild(this.lArm01);
		this.lArm02.addChild(this.lForeHoof);
		this.body.addChild(this.lLeg01);
		this.neck.addChild(this.head);
		this.rLeg01.addChild(this.rLeg02);
		this.rArm02.addChild(this.rForeHoof);
		this.head.addChild(this.mouth);
		this.head.addChild(this.rEar);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 1.5F, 0.0F);
			this.body.render(f5);
            GlStateManager.popMatrix();
		}else {
			this.body.render(f5);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.head.rotateAngleX = headPitch * 0.017453292F;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		float swingModifier = 0.9f;
		lLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
		lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
		rLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
		rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
	}
}
