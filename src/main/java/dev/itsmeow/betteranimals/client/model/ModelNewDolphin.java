package dev.itsmeow.betteranimals.client.model;

import com.google.common.collect.ImmutableList;
import com.mushroom.midnight.common.util.MatrixStack;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * dolphin - CyberCat5555
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelNewDolphin<T extends Entity> extends EntityModel<T> {
    public RendererModel body;
    public RendererModel tail01;
    public RendererModel head;
    public RendererModel lFin00;
    public RendererModel rFin00;
    public RendererModel dorsalFin00;
    public RendererModel tail02;
    public RendererModel tail03;
    public RendererModel tail04;
    public RendererModel tail05;
    public RendererModel lFluke00;
    public RendererModel rFluke00;
    public RendererModel lFluke01;
    public RendererModel rFluke01;
    public RendererModel topJaw;
    public RendererModel lowerJaw;
    public RendererModel melon;
    public RendererModel snout;
    public RendererModel teethUpper;
    public RendererModel lowerTeeth;
    public RendererModel lFin01;
    public RendererModel rFin01;
    public RendererModel dorsalFin01;

    public ModelNewDolphin() {
        this.textureWidth = 128;
        this.textureHeight = 64;

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 17.5F, 0.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -4.5F, -6.5F, 8, 9, 13, 0.0F, false));

        tail01 = new RendererModel(this);
        tail01.setRotationPoint(0.0F, 0.5F, 5.8F);
        body.addChild(tail01);
        this.setRotateAngle(tail01, -0.0873F, 0.0F, 0.0F);
        tail01.cubeList.add(new ModelBox(tail01, 0, 22, -3.5F, -4.0F, 0.0F, 7, 8, 8, 0.0F, false));

        tail02 = new RendererModel(this);
        tail02.setRotationPoint(0.0F, 1.0F, 7.5F);
        tail01.addChild(tail02);
        this.setRotateAngle(tail02, -0.0873F, 0.0F, 0.0F);
        tail02.cubeList.add(new ModelBox(tail02, 0, 39, -2.5F, -4.0F, 0.0F, 5, 7, 7, 0.0F, false));

        tail03 = new RendererModel(this);
        tail03.setRotationPoint(0.0F, -2.0F, 6.8F);
        tail02.addChild(tail03);
        this.setRotateAngle(tail03, -0.0873F, 0.0F, 0.0F);
        tail03.cubeList.add(new ModelBox(tail03, 0, 54, -2.0F, -1.0F, 0.0F, 4, 5, 5, 0.0F, false));

        tail04 = new RendererModel(this);
        tail04.setRotationPoint(0.0F, 0.4F, 4.9F);
        tail03.addChild(tail04);
        this.setRotateAngle(tail04, -0.2276F, 0.0F, 0.0F);
        tail04.cubeList.add(new ModelBox(tail04, 20, 55, -1.5F, -0.5F, 0.0F, 3, 4, 4, 0.0F, false));

        tail05 = new RendererModel(this);
        tail05.setRotationPoint(0.0F, 1.0F, 3.7F);
        tail04.addChild(tail05);
        tail05.cubeList.add(new ModelBox(tail05, 35, 57, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        lFluke00 = new RendererModel(this);
        lFluke00.setRotationPoint(-1.3F, 0.1F, -0.5F);
        tail05.addChild(lFluke00);
        this.setRotateAngle(lFluke00, 0.4887F, 0.0F, 1.309F);
        lFluke00.cubeList.add(new ModelBox(lFluke00, 91, 0, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, false));

        lFluke01 = new RendererModel(this);
        lFluke01.setRotationPoint(0.01F, 4.0F, 0.0F);
        lFluke00.addChild(lFluke01);
        this.setRotateAngle(lFluke01, 0.2618F, 0.0F, 0.0F);
        lFluke01.cubeList.add(new ModelBox(lFluke01, 90, 9, -0.5F, 0.0F, 0.0F, 1, 6, 3, 0.0F, false));

        rFluke00 = new RendererModel(this);
        rFluke00.setRotationPoint(1.3F, 0.1F, -0.5F);
        tail05.addChild(rFluke00);
        this.setRotateAngle(rFluke00, 0.4887F, 0.0F, -1.309F);
        rFluke00.cubeList.add(new ModelBox(rFluke00, 91, 0, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, false));

        rFluke01 = new RendererModel(this);
        rFluke01.setRotationPoint(-0.01F, 4.0F, 0.0F);
        rFluke00.addChild(rFluke01);
        this.setRotateAngle(rFluke01, 0.2618F, 0.0F, 0.0F);
        rFluke01.cubeList.add(new ModelBox(rFluke01, 90, 9, -0.5F, 0.0F, 0.0F, 1, 6, 3, 0.0F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, -3.4F, -6.2F);
        body.addChild(head);
        this.setRotateAngle(head, 0.0349F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 45, 0, -3.5F, -1.0F, -6.0F, 7, 8, 6, 0.0F, false));

        topJaw = new RendererModel(this);
        topJaw.setRotationPoint(0.0F, 3.4F, -5.7F);
        head.addChild(topJaw);
        this.setRotateAngle(topJaw, 0.0873F, 0.0F, 0.0F);
        topJaw.cubeList.add(new ModelBox(topJaw, 45, 32, -1.5F, 0.0F, -9.0F, 3, 2, 9, 0.0F, false));

        snout = new RendererModel(this);
        snout.setRotationPoint(0.0F, -1.6F, -4.1F);
        topJaw.addChild(snout);
        this.setRotateAngle(snout, 0.6981F, 0.0F, 0.0F);
        snout.cubeList.add(new ModelBox(snout, 52, 25, -2.0F, -0.5F, -3.0F, 4, 2, 3, 0.0F, false));

        teethUpper = new RendererModel(this);
        teethUpper.setRotationPoint(0.0F, 1.6F, -8.4F);
        topJaw.addChild(teethUpper);
        teethUpper.cubeList.add(new ModelBox(teethUpper, 72, 35, -1.4F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        lowerJaw = new RendererModel(this);
        lowerJaw.setRotationPoint(0.0F, 5.0F, -5.9F);
        head.addChild(lowerJaw);
        lowerJaw.cubeList.add(new ModelBox(lowerJaw, 48, 45, -1.8F, 0.0F, -9.0F, 3, 2, 9, 0.0F, false));

        lowerTeeth = new RendererModel(this);
        lowerTeeth.setRotationPoint(0.0F, -0.7F, -8.6F);
        lowerJaw.addChild(lowerTeeth);
        this.setRotateAngle(lowerTeeth, -0.0456F, 0.0F, 0.0F);
        lowerTeeth.cubeList.add(new ModelBox(lowerTeeth, 72, 45, -1.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        melon = new RendererModel(this);
        melon.setRotationPoint(0.0F, -1.0F, -5.9F);
        head.addChild(melon);
        this.setRotateAngle(melon, 0.4363F, 0.0F, 0.0F);
        melon.cubeList.add(new ModelBox(melon, 47, 14, -3.0F, 0.0F, -5.0F, 6, 6, 5, 0.0F, false));

        lFin00 = new RendererModel(this);
        lFin00.setRotationPoint(-3.8F, 4.0F, -5.0F);
        body.addChild(lFin00);
        this.setRotateAngle(lFin00, 0.5236F, 0.0F, 0.8727F);
        lFin00.cubeList.add(new ModelBox(lFin00, 79, 0, -0.5F, 0.0F, 0.0F, 1, 5, 4, 0.0F, false));

        lFin01 = new RendererModel(this);
        lFin01.setRotationPoint(0.51F, 4.5F, 0.0F);
        lFin00.addChild(lFin01);
        this.setRotateAngle(lFin01, 0.3491F, 0.0F, 0.0F);
        lFin01.cubeList.add(new ModelBox(lFin01, 79, 10, -1.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

        rFin00 = new RendererModel(this);
        rFin00.setRotationPoint(3.8F, 4.0F, -5.0F);
        body.addChild(rFin00);
        this.setRotateAngle(rFin00, 0.5236F, 0.0F, -0.8727F);
        rFin00.cubeList.add(new ModelBox(rFin00, 79, 0, -0.5F, 0.0F, 0.0F, 1, 5, 4, 0.0F, false));

        rFin01 = new RendererModel(this);
        rFin01.setRotationPoint(0.49F, 4.5F, 0.0F);
        rFin00.addChild(rFin01);
        this.setRotateAngle(rFin01, 0.3491F, 0.0F, 0.0F);
        rFin01.cubeList.add(new ModelBox(rFin01, 79, 10, -1.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

        dorsalFin00 = new RendererModel(this);
        dorsalFin00.setRotationPoint(0.0F, -2.5F, 4.0F);
        body.addChild(dorsalFin00);
        this.setRotateAngle(dorsalFin00, -0.7854F, 0.0F, 0.0F);
        dorsalFin00.cubeList.add(new ModelBox(dorsalFin00, 104, 0, -0.5F, -4.9F, -2.5F, 1, 5, 4, 0.0F, false));

        dorsalFin01 = new RendererModel(this);
        dorsalFin01.setRotationPoint(0.0F, -3.1F, -0.5F);
        dorsalFin00.addChild(dorsalFin01);
        this.setRotateAngle(dorsalFin01, -0.3491F, 0.0F, 0.0F);
        dorsalFin01.cubeList.add(new ModelBox(dorsalFin01, 104, 9, -0.4F, -4.0F, -2.5F, 0, 3, 3, 0.0F, false));
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.body.render(scale);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        this.body.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.body.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        if (Entity.horizontalMag(entityIn.getMotion()) > 1.0E-7D) {
            this.body.rotateAngleX += -0.05F + -0.05F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail01.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail02.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail03.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail04.rotateAngleX = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
            this.tail05.rotateAngleX = -0.2F * MathHelper.cos(ageInTicks * 0.3F);
        } else {
            this.tail01.rotateAngleX = -0.0873F;
            this.tail02.rotateAngleX = -0.0873F;
            this.tail03.rotateAngleX = -0.0873F;
            this.tail04.rotateAngleX = -0.2276F;
            this.tail05.rotateAngleX = 0F;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
