package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * chicken2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewChicken<T extends LivingEntity> extends Model<T> {

    public ModelPart body;
    public ModelPart tail01;
    public ModelPart buttFeathers01;
    public ModelPart buttFeathers02;
    public ModelPart lLeg;
    public ModelPart rLeg;
    public ModelPart neck01;
    public ModelPart lWing;
    public ModelPart rWing;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart lLeg01Feathers;
    public ModelPart lLeg02;
    public ModelPart lToe01;
    public ModelPart lToe02;
    public ModelPart lToe03;
    public ModelPart lToe04;
    public ModelPart rLeg01Feathers;
    public ModelPart rLeg02;
    public ModelPart rToes01;
    public ModelPart rToe02;
    public ModelPart rToe03;
    public ModelPart rToe04;
    public ModelPart neck02;
    public ModelPart neckRuff01;
    public ModelPart head;
    public ModelPart neckRuff02;
    public ModelPart beak;
    public ModelPart beakLower;
    public ModelPart crest;
    public ModelPart lWaddle;
    public ModelPart rWaddle;
    public ModelPart lWing01b;
    public ModelPart lWing02;
    public ModelPart lWing02b;
    public ModelPart rWing01b;
    public ModelPart rWing02;
    public ModelPart rWing02b;

    public ModelNewChicken() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.crest = new ModelPart(this, 31, 34);
        this.crest.setPos(0.0F, 0.0F, -3.3F);
        this.crest.addBox(0.0F, -1.8F, -1.2F, 0, 4, 2, 0.0F);
        this.setRotateAngle(crest, 0.20943951023931953F, 0.0F, 0.0F);
        this.rLeg = new ModelPart(this, 24, 28);
        this.rLeg.mirror = true;
        this.rLeg.setPos(-2.4F, 2.5F, 2.1F);
        this.rLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.neckRuff02 = new ModelPart(this, 0, 57);
        this.neckRuff02.setPos(0.0F, 0.5F, -2.6F);
        this.neckRuff02.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(neckRuff02, -0.15707963267948966F, 0.0F, 0.0F);
        this.rWing02 = new ModelPart(this, 20, 57);
        this.rWing02.mirror = true;
        this.rWing02.setPos(-3.9F, 0.0F, 0.0F);
        this.rWing02.addBox(-2.4F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rWing02, 0.0F, 0.7853981633974483F, 0.0F);
        this.beakLower = new ModelPart(this, 0, 0);
        this.beakLower.setPos(0.0F, 1.2F, -1.4F);
        this.beakLower.addBox(-0.5F, -0.3F, -0.5F, 1, 2, 1, 0.0F);
        this.rWing02b = new ModelPart(this, 31, 57);
        this.rWing02b.mirror = true;
        this.rWing02b.setPos(0.0F, 0.0F, 0.0F);
        this.rWing02b.addBox(-7.0F, -0.1F, -1.0F, 7, 0, 6, 0.0F);
        this.lLeg = new ModelPart(this, 24, 28);
        this.lLeg.setPos(2.4F, 2.5F, 2.1F);
        this.lLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.lToe01 = new ModelPart(this, 52, 28);
        this.lToe01.setPos(0.0F, 3.8F, 0.0F);
        this.lToe01.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lToe01, 0.3665191429188092F, 0.0F, 0.0F);
        this.buttFeathers01 = new ModelPart(this, 0, 24);
        this.buttFeathers01.setPos(0.0F, 1.2F, 3.6F);
        this.buttFeathers01.addBox(-3.0F, -2.5F, 0.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(buttFeathers01, 0.13962634015954636F, 0.0F, 0.0F);
        this.lWing = new ModelPart(this, 20, 52);
        this.lWing.setPos(2.0F, -1.3F, -2.8F);
        this.lWing.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lWing, 0.0F, -1.0471975511965976F, 0.5235987755982988F);
        this.rLeg01Feathers = new ModelPart(this, 34, 28);
        this.rLeg01Feathers.mirror = true;
        this.rLeg01Feathers.setPos(0.0F, 2.0F, 0.0F);
        this.rLeg01Feathers.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 15.7F, 0.0F);
        this.body.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 8, 0.1F);
        this.setRotateAngle(body, -0.03490658503988659F, 0.0F, 0.0F);
        this.rLeg02 = new ModelPart(this, 44, 28);
        this.rLeg02.mirror = true;
        this.rLeg02.setPos(0.0F, 1.6F, 0.0F);
        this.rLeg02.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rLeg02, -0.13962634015954636F, 0.0F, 0.0F);
        this.neck01 = new ModelPart(this, 0, 41);
        this.neck01.setPos(0.0F, -0.3F, -2.1F);
        this.neck01.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(neck01, -0.6981317007977318F, 0.0F, 0.0F);
        this.lToe03 = new ModelPart(this, 52, 28);
        this.lToe03.mirror = true;
        this.lToe03.setPos(0.0F, 3.8F, 0.0F);
        this.lToe03.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lToe03, 0.3665191429188092F, 0.6981317007977318F, 0.0F);
        this.rToe02 = new ModelPart(this, 52, 28);
        this.rToe02.mirror = true;
        this.rToe02.setPos(0.0F, 3.8F, 0.0F);
        this.rToe02.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rToe02, 0.3665191429188092F, 0.6981317007977318F, 0.0F);
        this.lWaddle = new ModelPart(this, 36, 34);
        this.lWaddle.setPos(0.4F, 1.2F, -1.3F);
        this.lWaddle.addBox(0.0F, -0.8F, -0.3F, 0, 2, 2, 0.0F);
        this.lLeg02 = new ModelPart(this, 44, 28);
        this.lLeg02.setPos(0.0F, 1.6F, 0.0F);
        this.lLeg02.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lLeg02, -0.13962634015954636F, 0.0F, 0.0F);
        this.rWing = new ModelPart(this, 20, 52);
        this.rWing.mirror = true;
        this.rWing.setPos(-2.0F, -1.3F, -2.8F);
        this.rWing.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(rWing, 0.0F, 1.0471975511965976F, -0.5235987755982988F);
        this.tail03 = new ModelPart(this, 30, 12);
        this.tail03.setPos(0.0F, 1.5F, -3.0F);
        this.tail03.addBox(-2.5F, -1.0F, 0.0F, 5, 4, 11, 0.0F);
        this.setRotateAngle(tail03, 0.20943951023931953F, 0.0F, 0.0F);
        this.rToes01 = new ModelPart(this, 52, 28);
        this.rToes01.mirror = true;
        this.rToes01.setPos(0.0F, 3.8F, 0.0F);
        this.rToes01.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rToes01, 0.3665191429188092F, 0.0F, 0.0F);
        this.lToe04 = new ModelPart(this, 52, 34);
        this.lToe04.setPos(0.0F, 3.8F, 0.0F);
        this.lToe04.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lToe04, -0.06981317007977318F, 0.0F, 0.0F);
        this.lWing01b = new ModelPart(this, 32, 51);
        this.lWing01b.setPos(0.0F, 0.0F, 0.0F);
        this.lWing01b.addBox(0.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F);
        this.lWing02 = new ModelPart(this, 20, 57);
        this.lWing02.setPos(3.9F, 0.0F, 0.0F);
        this.lWing02.addBox(-0.6F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(lWing02, 0.0F, -0.7853981633974483F, 0.0F);
        this.neck02 = new ModelPart(this, 17, 41);
        this.neck02.setPos(0.0F, 0.5F, -2.9F);
        this.neck02.addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(neck02, -0.5235987755982988F, 0.0F, 0.0F);
        this.lToe02 = new ModelPart(this, 52, 28);
        this.lToe02.setPos(0.0F, 3.8F, 0.0F);
        this.lToe02.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lToe02, 0.3665191429188092F, -0.6981317007977318F, 0.0F);
        this.head = new ModelPart(this, 32, 42);
        this.head.setPos(0.0F, 0.3F, -3.3F);
        this.head.addBox(-1.5F, -1.5F, -3.3F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -0.2792526803190927F, 0.0F, 0.0F);
        this.lLeg01Feathers = new ModelPart(this, 34, 28);
        this.lLeg01Feathers.setPos(0.0F, 2.0F, 0.0F);
        this.lLeg01Feathers.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.rToe03 = new ModelPart(this, 52, 28);
        this.rToe03.setPos(0.0F, 3.8F, 0.0F);
        this.rToe03.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rToe03, 0.3665191429188092F, -0.6981317007977318F, 0.0F);
        this.rWaddle = new ModelPart(this, 36, 34);
        this.rWaddle.mirror = true;
        this.rWaddle.setPos(-0.4F, 1.2F, -1.3F);
        this.rWaddle.addBox(0.0F, -0.8F, -0.3F, 0, 2, 2, 0.0F);
        this.lWing02b = new ModelPart(this, 31, 57);
        this.lWing02b.setPos(0.0F, 0.0F, 0.0F);
        this.lWing02b.addBox(0.0F, -0.1F, -1.0F, 7, 0, 6, 0.0F);
        this.rToe04 = new ModelPart(this, 52, 34);
        this.rToe04.mirror = true;
        this.rToe04.setPos(0.0F, 3.8F, 0.0F);
        this.rToe04.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rToe04, -0.06981317007977318F, 0.0F, 0.0F);
        this.rWing01b = new ModelPart(this, 32, 51);
        this.rWing01b.mirror = true;
        this.rWing01b.setPos(0.0F, 0.0F, 0.0F);
        this.rWing01b.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F);
        this.buttFeathers02 = new ModelPart(this, 0, 32);
        this.buttFeathers02.setPos(0.0F, 0.8F, 3.4F);
        this.buttFeathers02.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(buttFeathers02, 0.2792526803190927F, 0.0F, 0.0F);
        this.tail02 = new ModelPart(this, 32, 0);
        this.tail02.setPos(0.0F, 0.6F, 0.5F);
        this.tail02.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(tail02, 0.3141592653589793F, 0.0F, 0.0F);
        this.neckRuff01 = new ModelPart(this, 0, 49);
        this.neckRuff01.setPos(0.0F, 1.2F, -2.6F);
        this.neckRuff01.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(neckRuff01, -0.5235987755982988F, 0.0F, 0.0F);
        this.tail01 = new ModelPart(this, 0, 15);
        this.tail01.setPos(0.0F, -1.6F, 3.7F);
        this.tail01.addBox(-3.0F, -1.5F, -0.7F, 6, 3, 4, 0.0F);
        this.setRotateAngle(tail01, 0.6283185307179586F, 0.0F, 0.0F);
        this.beak = new ModelPart(this, 0, 0);
        this.beak.setPos(0.0F, 1.2F, -1.8F);
        this.beak.addBox(-0.5F, -0.2F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak, 0.24434609527920614F, 0.0F, 0.0F);
        this.head.addChild(this.crest);
        this.body.addChild(this.rLeg);
        this.neck02.addChild(this.neckRuff02);
        this.rWing.addChild(this.rWing02);
        this.head.addChild(this.beakLower);
        this.rWing02.addChild(this.rWing02b);
        this.body.addChild(this.lLeg);
        this.lLeg02.addChild(this.lToe01);
        this.body.addChild(this.buttFeathers01);
        this.body.addChild(this.lWing);
        this.rLeg.addChild(this.rLeg01Feathers);
        this.rLeg.addChild(this.rLeg02);
        this.body.addChild(this.neck01);
        this.lLeg02.addChild(this.lToe03);
        this.rLeg02.addChild(this.rToe02);
        this.head.addChild(this.lWaddle);
        this.lLeg.addChild(this.lLeg02);
        this.body.addChild(this.rWing);
        this.tail01.addChild(this.tail03);
        this.rLeg02.addChild(this.rToes01);
        this.lLeg02.addChild(this.lToe04);
        this.lWing.addChild(this.lWing01b);
        this.lWing.addChild(this.lWing02);
        this.neck01.addChild(this.neck02);
        this.lLeg02.addChild(this.lToe02);
        this.neck02.addChild(this.head);
        this.lLeg.addChild(this.lLeg01Feathers);
        this.rLeg02.addChild(this.rToe03);
        this.head.addChild(this.rWaddle);
        this.lWing02.addChild(this.lWing02b);
        this.rLeg02.addChild(this.rToe04);
        this.rWing.addChild(this.rWing01b);
        this.body.addChild(this.buttFeathers02);
        this.tail01.addChild(this.tail02);
        this.neck01.addChild(this.neckRuff01);
        this.body.addChild(this.tail01);
        this.head.addChild(this.beak);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = rad(headPitch);
        this.head.zRot = rad(netHeadYaw) * 0.25F;
        this.neck01.zRot = rad(netHeadYaw) * 0.5F;
        this.lLeg.xRot = Mth.sin(limbSwing * 0.6662F) * 1.5F * limbSwingAmount;
        this.rLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.5F * limbSwingAmount;
        this.lWing.zRot = -ageInTicks;
        this.rWing.zRot = ageInTicks;
    }

}
