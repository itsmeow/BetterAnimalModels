package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.LivingEntity;

/**
 * newsquid - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewSquid<T extends LivingEntity> extends Model<T> {
    public ModelPart head;
    public ModelPart mantle01;
    public ModelPart lEye;
    public ModelPart rEye;
    public ModelPart tentacle01a;
    public ModelPart tentacle02a;
    public ModelPart tentacle03a;
    public ModelPart tentacle04a;
    public ModelPart beak01;
    public ModelPart beak02;
    public ModelPart tentacle05a;
    public ModelPart tentacle06a;
    public ModelPart tentacle07a;
    public ModelPart tentacle08a;
    public ModelPart longTentacle01a;
    public ModelPart longTentacle02a;
    public ModelPart mantle02;
    public ModelPart siphon;
    public ModelPart mantle03;
    public ModelPart mantle04;
    public ModelPart rFin;
    public ModelPart lFin;
    public ModelPart tentacle01b;
    public ModelPart tentacle01c;
    public ModelPart tentacle02b;
    public ModelPart tentacle02c;
    public ModelPart tentacle03b;
    public ModelPart tentacle03c;
    public ModelPart tentacle04b;
    public ModelPart tentacle04c;
    public ModelPart tentacle05b;
    public ModelPart tentacle05c;
    public ModelPart tentacle06b;
    public ModelPart tentacle06c;
    public ModelPart tentacle07b;
    public ModelPart tentacle07c;
    public ModelPart tentacle08b;
    public ModelPart tentacle08c;
    public ModelPart longTentacle01b;
    public ModelPart longTentacle01c;
    public ModelPart longTentacle01d;
    public ModelPart longTentacle02b;
    public ModelPart longTentacle02c;
    public ModelPart longTentacle02d;

    public ModelPart[] squidTentacles;

    public ModelNewSquid() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.lFin = new ModelPart(this, 31, 16);
        this.lFin.setPos(0.0F, -1.8F, 0.0F);
        this.lFin.addBox(0.0F, -6.0F, 0.0F, 9, 12, 0, 0.0F);
        this.mantle03 = new ModelPart(this, 0, 31);
        this.mantle03.setPos(0.0F, -7.0F, 0.0F);
        this.mantle03.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
        this.tentacle04b = new ModelPart(this, 31, 41);
        this.tentacle04b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle04b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01b = new ModelPart(this, 41, 41);
        this.longTentacle01b.setPos(0.0F, 7.9F, 0.0F);
        this.longTentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.rFin = new ModelPart(this, 31, 16);
        this.rFin.mirror = true;
        this.rFin.setPos(0.0F, -1.8F, 0.0F);
        this.rFin.addBox(-9.0F, -6.0F, 0.0F, 9, 12, 0, 0.0F);
        this.tentacle04c = new ModelPart(this, 31, 41);
        this.tentacle04c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle04c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01d = new ModelPart(this, 41, 52);
        this.longTentacle01d.setPos(0.0F, 7.8F, 0.0F);
        this.longTentacle01d.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.longTentacle02b = new ModelPart(this, 41, 41);
        this.longTentacle02b.setPos(0.0F, 7.9F, 0.0F);
        this.longTentacle02b.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.longTentacle02c = new ModelPart(this, 41, 41);
        this.longTentacle02c.setPos(0.0F, 7.8F, 0.0F);
        this.longTentacle02c.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tentacle02a = new ModelPart(this, 31, 41);
        this.tentacle02a.setPos(2.0F, 2.8F, 0.0F);
        this.tentacle02a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle02a, 0.0F, -1.5707963267948966F, 0.0F);
        this.beak02 = new ModelPart(this, 14, 49);
        this.beak02.setPos(0.0F, 1.5F, 0.3F);
        this.beak02.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(beak02, 0.5009094953223726F, 0.0F, 0.0F);
        this.tentacle05a = new ModelPart(this, 31, 41);
        this.tentacle05a.setPos(1.7F, 2.8F, -1.7F);
        this.tentacle05a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle05a, 0.0F, -0.7853981633974483F, 0.0F);
        this.longTentacle02d = new ModelPart(this, 41, 52);
        this.longTentacle02d.setPos(0.0F, 7.8F, 0.0F);
        this.longTentacle02d.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.tentacle04a = new ModelPart(this, 31, 41);
        this.tentacle04a.setPos(0.0F, 2.8F, 2.0F);
        this.tentacle04a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle04a, 0.0F, 3.141592653589793F, 0.0F);
        this.tentacle07a = new ModelPart(this, 31, 41);
        this.tentacle07a.setPos(-1.7F, 2.8F, -1.7F);
        this.tentacle07a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle07a, 0.0F, 0.7853981633974483F, 0.0F);
        this.tentacle01b = new ModelPart(this, 31, 41);
        this.tentacle01b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle01a = new ModelPart(this, 31, 41);
        this.tentacle01a.setPos(0.0F, 2.8F, -2.0F);
        this.tentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle08b = new ModelPart(this, 31, 41);
        this.tentacle08b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle08b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.head = new ModelPart(this, 40, 0);
        this.head.setPos(0.0F, 12.0F, 0.0F);
        this.head.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.lEye = new ModelPart(this, 29, 0);
        this.lEye.setPos(2.7F, 0.1F, 0.0F);
        this.lEye.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle07c = new ModelPart(this, 31, 41);
        this.tentacle07c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle07c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06b = new ModelPart(this, 31, 41);
        this.tentacle06b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle06b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06a = new ModelPart(this, 31, 41);
        this.tentacle06a.setPos(1.7F, 2.8F, 1.7F);
        this.tentacle06a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle06a, 0.0F, -2.356194490192345F, 0.0F);
        this.beak01 = new ModelPart(this, 14, 43);
        this.beak01.setPos(0.0F, 1.5F, -1.2F);
        this.beak01.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(beak01, -0.6373942428283291F, 0.0F, 0.0F);
        this.tentacle02b = new ModelPart(this, 31, 41);
        this.tentacle02b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle02b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle02c = new ModelPart(this, 31, 41);
        this.tentacle02c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle02c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle02a = new ModelPart(this, 41, 41);
        this.longTentacle02a.setPos(-1.6F, 3.2F, 0.0F);
        this.longTentacle02a.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(longTentacle02a, 0.0F, 1.5707963267948966F, 0.0F);
        this.tentacle08c = new ModelPart(this, 31, 41);
        this.tentacle08c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle08c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle03a = new ModelPart(this, 31, 41);
        this.tentacle03a.setPos(-2.0F, 2.8F, 0.0F);
        this.tentacle03a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle03a, 0.0F, 1.5707963267948966F, 0.0F);
        this.siphon = new ModelPart(this, 54, 16);
        this.siphon.setPos(0.0F, -0.6F, 2.4F);
        this.siphon.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(siphon, 0.36425021489121656F, 0.0F, 0.0F);
        this.tentacle07b = new ModelPart(this, 31, 41);
        this.tentacle07b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle07b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.rEye = new ModelPart(this, 29, 0);
        this.rEye.mirror = true;
        this.rEye.setPos(-2.7F, 0.0F, 0.0F);
        this.rEye.addBox(-1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle08a = new ModelPart(this, 31, 41);
        this.tentacle08a.setPos(-1.7F, 2.8F, 1.7F);
        this.tentacle08a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle08a, 0.0F, 2.356194490192345F, 0.0F);
        this.tentacle05b = new ModelPart(this, 31, 41);
        this.tentacle05b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle05b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle01c = new ModelPart(this, 31, 41);
        this.tentacle01c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle01c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle03b = new ModelPart(this, 31, 41);
        this.tentacle03b.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle03b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01a = new ModelPart(this, 41, 41);
        this.longTentacle01a.setPos(1.6F, 3.2F, 0.0F);
        this.longTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(longTentacle01a, 0.0F, -1.5707963267948966F, 0.0F);
        this.tentacle03c = new ModelPart(this, 31, 41);
        this.tentacle03c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle03c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.mantle01 = new ModelPart(this, 0, 0);
        this.mantle01.setPos(0.0F, -2.4F, 0.0F);
        this.mantle01.addBox(-3.5F, -8.0F, -3.5F, 7, 8, 7, 0.0F);
        this.mantle02 = new ModelPart(this, 0, 16);
        this.mantle02.setPos(0.0F, -7.9F, 0.0F);
        this.mantle02.addBox(-3.0F, -7.0F, -3.0F, 6, 7, 6, 0.0F);
        this.longTentacle01c = new ModelPart(this, 41, 41);
        this.longTentacle01c.setPos(0.0F, 7.8F, 0.0F);
        this.longTentacle01c.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tentacle05c = new ModelPart(this, 31, 41);
        this.tentacle05c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle05c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06c = new ModelPart(this, 31, 41);
        this.tentacle06c.setPos(0.0F, 4.9F, 0.0F);
        this.tentacle06c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.mantle04 = new ModelPart(this, 0, 45);
        this.mantle04.setPos(0.0F, -4.9F, 0.0F);
        this.mantle04.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.mantle03.addChild(this.lFin);
        this.mantle02.addChild(this.mantle03);
        this.tentacle04a.addChild(this.tentacle04b);
        this.longTentacle01a.addChild(this.longTentacle01b);
        this.mantle03.addChild(this.rFin);
        this.tentacle04b.addChild(this.tentacle04c);
        this.longTentacle01c.addChild(this.longTentacle01d);
        this.longTentacle02a.addChild(this.longTentacle02b);
        this.longTentacle02b.addChild(this.longTentacle02c);
        this.head.addChild(this.tentacle02a);
        this.head.addChild(this.beak02);
        this.head.addChild(this.tentacle05a);
        this.longTentacle02c.addChild(this.longTentacle02d);
        this.head.addChild(this.tentacle04a);
        this.head.addChild(this.tentacle07a);
        this.tentacle01a.addChild(this.tentacle01b);
        this.head.addChild(this.tentacle01a);
        this.tentacle08a.addChild(this.tentacle08b);
        this.head.addChild(this.lEye);
        this.tentacle07b.addChild(this.tentacle07c);
        this.tentacle06a.addChild(this.tentacle06b);
        this.head.addChild(this.tentacle06a);
        this.head.addChild(this.beak01);
        this.tentacle02a.addChild(this.tentacle02b);
        this.tentacle02b.addChild(this.tentacle02c);
        this.head.addChild(this.longTentacle02a);
        this.tentacle08b.addChild(this.tentacle08c);
        this.head.addChild(this.tentacle03a);
        this.mantle01.addChild(this.siphon);
        this.tentacle07a.addChild(this.tentacle07b);
        this.head.addChild(this.rEye);
        this.head.addChild(this.tentacle08a);
        this.tentacle05a.addChild(this.tentacle05b);
        this.tentacle01b.addChild(this.tentacle01c);
        this.tentacle03a.addChild(this.tentacle03b);
        this.head.addChild(this.longTentacle01a);
        this.tentacle03b.addChild(this.tentacle03c);
        this.head.addChild(this.mantle01);
        this.mantle01.addChild(this.mantle02);
        this.longTentacle01b.addChild(this.longTentacle01c);
        this.tentacle05b.addChild(this.tentacle05c);
        this.tentacle06b.addChild(this.tentacle06c);
        this.mantle03.addChild(this.mantle04);

        this.squidTentacles = new ModelPart[] { this.tentacle01a, this.tentacle02a, this.tentacle03a, this.tentacle04a, this.tentacle05a, this.tentacle06a, this.tentacle07a, this.tentacle08a };
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        for(ModelPart modelrenderer : this.squidTentacles) {
            modelrenderer.xRot = ageInTicks;
        }
    }
}
