package com.ocelot.betteranimals.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * chicken2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewChicken extends Model {

	public ModelRenderer body;
	public ModelRenderer tail00;
	public ModelRenderer neck00;
	public ModelRenderer lLeg;
	public ModelRenderer rLeg;
	public ModelRenderer lWing;
	public ModelRenderer rWing;
	public ModelRenderer tail01;
	public ModelRenderer neck01;
	public ModelRenderer head;
	public ModelRenderer beak00;
	public ModelRenderer waddle;
	public ModelRenderer beak01;
	public ModelRenderer lFoot;
	public ModelRenderer rFoot;

	public ModelNewChicken() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.tail01 = new ModelRenderer(this, 0, 23);
		this.tail01.setRotationPoint(0.0F, 0.2F, 1.0F);
		this.tail01.addBox(-2.0F, -6.0F, -0.5F, 4, 6, 1, 0.0F);
		this.neck01 = new ModelRenderer(this, 33, 9);
		this.neck01.setRotationPoint(0.0F, 0.0F, -3.5F);
		this.neck01.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(neck01, -0.31869712141416456F, 0.0F, 0.0F);
		this.rLeg = new ModelRenderer(this, 18, 15);
		this.rLeg.mirror = true;
		this.rLeg.setRotationPoint(-2.2F, 2.8F, 1.3F);
		this.rLeg.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
		this.beak01 = new ModelRenderer(this, 58, 0);
		this.beak01.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.beak01.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
		this.lFoot = new ModelRenderer(this, 21, 15);
		this.lFoot.setRotationPoint(0.0F, 4.9F, 0.0F);
		this.lFoot.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
		this.tail00 = new ModelRenderer(this, 0, 15);
		this.tail00.setRotationPoint(0.0F, -1.9F, 3.2F);
		this.tail00.addBox(-2.5F, -4.0F, -1.0F, 5, 4, 2, 0.0F);
		this.setRotateAngle(tail00, -1.0471975511965976F, 0.0F, 0.0F);
		this.head = new ModelRenderer(this, 49, 9);
		this.head.setRotationPoint(0.0F, 0.6F, -1.7F);
		this.head.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3, 0.0F);
		this.setRotateAngle(head, -0.31869712141416456F, 0.0F, 0.0F);
		this.lWing = new ModelRenderer(this, 26, 19);
		this.lWing.setRotationPoint(2.4F, -1.6F, -3.1F);
		this.lWing.addBox(0.0F, -1.0F, 0.0F, 1, 4, 7, 0.0F);
		this.lLeg = new ModelRenderer(this, 18, 15);
		this.lLeg.setRotationPoint(2.2F, 2.8F, 1.3F);
		this.lLeg.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
		this.beak00 = new ModelRenderer(this, 50, 0);
		this.beak00.setRotationPoint(0.0F, 1.5F, -0.8F);
		this.beak00.addBox(-1.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
		this.neck00 = new ModelRenderer(this, 33, 0);
		this.neck00.setRotationPoint(0.0F, -0.5F, -2.2F);
		this.neck00.addBox(-2.0F, -2.2F, -4.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(neck00, -0.9560913642424937F, 0.0F, 0.0F);
		this.rWing = new ModelRenderer(this, 26, 19);
		this.rWing.mirror = true;
		this.rWing.setRotationPoint(-2.4F, -1.6F, -3.1F);
		this.rWing.addBox(-1.0F, -1.0F, 0.0F, 1, 4, 7, 0.0F);
		this.waddle = new ModelRenderer(this, 56, 3);
		this.waddle.setRotationPoint(0.0F, 1.8F, -0.7F);
		this.waddle.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F);
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setRotationPoint(0.0F, 16.3F, 0.0F);
		this.body.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 8, 0.0F);
		this.rFoot = new ModelRenderer(this, 21, 15);
		this.rFoot.mirror = true;
		this.rFoot.setRotationPoint(0.0F, 4.9F, 0.0F);
		this.rFoot.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
		this.tail00.addChild(this.tail01);
		this.neck00.addChild(this.neck01);
		this.body.addChild(this.rLeg);
		this.beak00.addChild(this.beak01);
		this.lLeg.addChild(this.lFoot);
		this.body.addChild(this.tail00);
		this.neck01.addChild(this.head);
		this.body.addChild(this.lWing);
		this.body.addChild(this.lLeg);
		this.head.addChild(this.beak00);
		this.body.addChild(this.neck00);
		this.body.addChild(this.rWing);
		this.head.addChild(this.waddle);
		this.rLeg.addChild(this.rFoot);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 1.5F, 0.0F);
			this.body.render(f5);
			GlStateManager.popMatrix();
		} else {
			this.body.render(f5);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		float swingModifier = 1.5f;
		float partialTicks = Minecraft.getMinecraft().getRenderPartialTicks();
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			limbSwing = limbSwing + this.getSwingProgressPrev(living);
			this.head.rotateAngleX = (float) Math.toRadians(this.getHeadPitch(living));
			this.head.rotateAngleZ = this.getHeadYaw(living) * 0.017453292F * 0.25f;
			this.neck01.rotateAngleZ = this.getHeadYaw(living) * 0.017453292F * 0.5f;
			this.lLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * swingModifier * limbSwingAmount;
			this.rLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * swingModifier * limbSwingAmount;
			this.lWing.rotateAngleZ = -ageInTicks;
			this.rWing.rotateAngleZ = ageInTicks;
		}
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
