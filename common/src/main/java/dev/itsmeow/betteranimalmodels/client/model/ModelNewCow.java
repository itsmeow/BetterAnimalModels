package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewCow<T extends LivingEntity> extends Model<T> {

    public ModelPart chest;
    public ModelPart stomach;
    public ModelPart ass;
    public ModelPart lLeg01;
    public ModelPart lLeg02;
    public ModelPart lLeg03;
    public ModelPart lHindHoof;
    public ModelPart rLeg01;
    public ModelPart rLeg02;
    public ModelPart rLeg03;
    public ModelPart rHindHoof;
    public ModelPart udder;
    public ModelPart udderTeat1;
    public ModelPart udderTeat2;
    public ModelPart udderTeat3;
    public ModelPart udderTeat4;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart neck;
    public ModelPart neck02;
    public ModelPart head;
    public ModelPart upperJaw;
    public ModelPart snoot;
    public ModelPart lowerJaw;
    public ModelPart lEar01;
    public ModelPart lEar02;
    public ModelPart rEar01;
    public ModelPart rEar02;
    public ModelPart lHorn01;
    public ModelPart lHorn02;
    public ModelPart rHorn01a;
    public ModelPart rHorn02;
    public ModelPart lArm01;
    public ModelPart lArm02;
    public ModelPart lArm03;
    public ModelPart lForeHoof;
    public ModelPart rArm01;
    public ModelPart rArm02;
    public ModelPart rArm03;
    public ModelPart rForeHoof;

    public ModelNewCow(ModelPart root) {
        this.chest = root.getChild("chest");
        this.stomach = chest.getChild("stomach");
        this.ass = stomach.getChild("ass");
        this.lLeg01 = ass.getChild("lLeg01");
        this.lLeg02 = lLeg01.getChild("lLeg02");
        this.lLeg03 = lLeg02.getChild("lLeg03");
        this.lHindHoof = lLeg03.getChild("lHindHoof");
        this.rLeg01 = ass.getChild("rLeg01");
        this.rLeg02 = rLeg01.getChild("rLeg02");
        this.rLeg03 = rLeg02.getChild("rLeg03");
        this.rHindHoof = rLeg03.getChild("rHindHoof");
        this.udder = ass.getChild("udder");
        this.udderTeat1 = udder.getChild("udderTeat1");
        this.udderTeat2 = udder.getChild("udderTeat2");
        this.udderTeat3 = udder.getChild("udderTeat3");
        this.udderTeat4 = udder.getChild("udderTeat4");
        this.tail01 = ass.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.neck = chest.getChild("neck");
        this.neck02 = neck.getChild("neck02");
        this.head = neck02.getChild("head");
        this.upperJaw = head.getChild("upperJaw");
        this.snoot = head.getChild("snoot");
        this.lowerJaw = head.getChild("lowerJaw");
        this.lEar01 = head.getChild("lEar01");
        this.lEar02 = lEar01.getChild("lEar02");
        this.rEar01 = head.getChild("rEar01");
        this.rEar02 = rEar01.getChild("rEar02");
        this.lHorn01 = head.getChild("lHorn01");
        this.lHorn02 = lHorn01.getChild("lHorn02");
        this.rHorn01a = head.getChild("rHorn01a");
        this.rHorn02 = rHorn01a.getChild("rHorn02");
        this.lArm01 = chest.getChild("lArm01");
        this.lArm02 = lArm01.getChild("lArm02");
        this.lArm03 = lArm02.getChild("lArm03");
        this.lForeHoof = lArm03.getChild("lForeHoof");
        this.rArm01 = chest.getChild("rArm01");
        this.rArm02 = rArm01.getChild("rArm02");
        this.rArm03 = rArm02.getChild("rArm03");
        this.rForeHoof = rArm03.getChild("rForeHoof");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -4.5F, -7.5F, 11.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.5F, -0.0456F, 0.0F, 0.0F));
        PartDefinition stomach = chest.addOrReplaceChild("stomach", CubeListBuilder.create().texOffs(0, 25).addBox(-7.0F, -8.0F, 0.0F, 14.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7F, 1.2F, 0.0456F, 0.0F, 0.0F));
        PartDefinition ass = stomach.addOrReplaceChild("ass", CubeListBuilder.create().texOffs(0, 58).addBox(-5.5F, -7.0F, 0.0F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 13.9F, -0.1367F, 0.0F, 0.0F));
        PartDefinition lLeg01 = ass.addOrReplaceChild("lLeg01", CubeListBuilder.create().texOffs(103, 0).addBox(-0.7F, -1.5F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.4F, 4.4F, 0.0F, 0.0F, -0.1367F));
        PartDefinition lLeg02 = lLeg01.addOrReplaceChild("lLeg02", CubeListBuilder.create().texOffs(103, 21).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 9.4F, 0.1F, 0.3187F, 0.0F, 0.0911F));
        PartDefinition lLeg03 = lLeg02.addOrReplaceChild("lLeg03", CubeListBuilder.create().texOffs(106, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -0.2F, -0.182F, 0.0F, 0.0456F));
        PartDefinition lHindHoof = lLeg03.addOrReplaceChild("lHindHoof", CubeListBuilder.create().texOffs(89, 41).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.1F, -0.4F));
        PartDefinition rLeg01 = ass.addOrReplaceChild("rLeg01", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-3.7F, -1.5F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -4.4F, 4.4F, 0.0F, 0.0F, 0.1367F));
        PartDefinition rLeg02 = rLeg01.addOrReplaceChild("rLeg02", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 9.4F, 0.1F, 0.3187F, 0.0F, -0.0911F));
        PartDefinition rLeg03 = rLeg02.addOrReplaceChild("rLeg03", CubeListBuilder.create().texOffs(106, 34).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6F, -0.2F, -0.182F, 0.0F, -0.0456F));
        PartDefinition rHindHoof = rLeg03.addOrReplaceChild("rHindHoof", CubeListBuilder.create().texOffs(89, 41).mirror().addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 7.1F, -0.4F));
        PartDefinition udder = ass.addOrReplaceChild("udder", CubeListBuilder.create().texOffs(0, 81).addBox(-3.5F, -0.5F, -4.2F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 6.3F, 0.1367F, 0.0F, 0.0F));
        PartDefinition udderTeat1 = udder.addOrReplaceChild("udderTeat1", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 3.7F, -1.7F));
        PartDefinition udderTeat2 = udder.addOrReplaceChild("udderTeat2", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 3.7F, -1.7F));
        PartDefinition udderTeat3 = udder.addOrReplaceChild("udderTeat3", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 3.7F, 1.4F));
        PartDefinition udderTeat4 = udder.addOrReplaceChild("udderTeat4", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 3.7F, 1.4F));
        PartDefinition tail01 = ass.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4F, 9.1F, 0.4554F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(10, 96).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7F, 0.2F, -0.2731F, 0.0F, 0.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(15, 96).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8F, 0.0F, -0.0456F, 0.0F, 0.0F));
        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(45, 14).addBox(-4.0F, -4.5F, -4.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.7F, -0.2731F, 0.0F, 0.0F));
        PartDefinition neck02 = neck.addOrReplaceChild("neck02", CubeListBuilder.create().texOffs(45, 0).addBox(-3.5F, -4.0F, -4.6F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, -0.1367F, 0.0F, 0.0F));
        PartDefinition head = neck02.addOrReplaceChild("head", CubeListBuilder.create().texOffs(66, 46).addBox(-4.0F, -3.5F, -4.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.1F, -0.5009F, 0.0F, 0.0F));
        PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(82, 63).addBox(-3.0F, -1.3F, -1.5F, 6.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.3F, -0.1F));
        PartDefinition snoot = head.addOrReplaceChild("snoot", CubeListBuilder.create().texOffs(65, 63).addBox(-2.5F, -2.5F, -0.7F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -2.5F, 0.3643F, 0.0F, 0.0F));
        PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(74, 73).addBox(-2.5F, -0.1F, -0.6F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, 1.8F, -0.0911F, 0.0F, 0.0F));
        PartDefinition lEar01 = head.addOrReplaceChild("lEar01", CubeListBuilder.create().texOffs(46, 34).mirror().addBox(0.0F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4F, -1.1F, -1.9F, 0.4554F, -0.0911F, 0.0911F));
        PartDefinition lEar02 = lEar01.addOrReplaceChild("lEar02", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(0.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.2276F));
        PartDefinition rEar01 = head.addOrReplaceChild("rEar01", CubeListBuilder.create().texOffs(46, 34).addBox(-5.0F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, -1.1F, -1.9F, 0.4554F, 0.0911F, -0.0911F));
        PartDefinition rEar02 = rEar01.addOrReplaceChild("rEar02", CubeListBuilder.create().texOffs(59, 40).addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, 0.0F, 0.0F, -0.2276F));
        PartDefinition lHorn01 = head.addOrReplaceChild("lHorn01", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.0F, -0.3F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(3.1F, -2.6F, -3.2F, 0.0F, 0.7285F, -0.5009F));
        PartDefinition lHorn02 = lHorn01.addOrReplaceChild("lHorn02", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.1F, 0.0F, 0.0F, 0.182F, 0.0F));
        PartDefinition rHorn01a = head.addOrReplaceChild("rHorn01a", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -0.3F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.1F, -2.6F, -3.2F, 0.0F, -0.7285F, 0.5009F));
        PartDefinition rHorn02 = rHorn01a.addOrReplaceChild("rHorn02", CubeListBuilder.create().texOffs(0, 62).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.1F, 0.0F, 0.0F, -0.182F, 0.0F));
        PartDefinition lArm01 = chest.addOrReplaceChild("lArm01", CubeListBuilder.create().texOffs(77, 0).addBox(-0.7F, -1.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -1.0F, -3.2F, 0.0911F, 0.0F, -0.0911F));
        PartDefinition lArm02 = lArm01.addOrReplaceChild("lArm02", CubeListBuilder.create().texOffs(77, 20).addBox(-2.1F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.3F, 10.3F, 0.4F));
        PartDefinition lArm03 = lArm02.addOrReplaceChild("lArm03", CubeListBuilder.create().texOffs(77, 30).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, 0.0F, -0.0456F, 0.0F, 0.0911F));
        PartDefinition lForeHoof = lArm03.addOrReplaceChild("lForeHoof", CubeListBuilder.create().texOffs(89, 41).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -0.4F));
        PartDefinition rArm01 = chest.addOrReplaceChild("rArm01", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-3.3F, -1.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -1.0F, -3.2F, 0.0911F, 0.0F, 0.0911F));
        PartDefinition rArm02 = rArm01.addOrReplaceChild("rArm02", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-1.9F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.3F, 10.3F, 0.4F));
        PartDefinition rArm03 = rArm02.addOrReplaceChild("rArm03", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4F, 0.0F, -0.0456F, 0.0F, -0.0911F));
        PartDefinition rForeHoof = rArm03.addOrReplaceChild("rForeHoof", CubeListBuilder.create().texOffs(89, 41).mirror().addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 8.0F, -0.4F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.neck.xRot = rad(headPitch) - 0.27314402793711257F;
        this.neck.yRot = rad(netHeadYaw);
        lLeg01.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.7F * limbSwingAmount;
        lArm01.xRot = Mth.cos(limbSwing * 0.8665F) * 0.7F * limbSwingAmount + 0.091106186954104F;
        rLeg01.xRot = Mth.sin(limbSwing * 0.8665F) * 0.7F * limbSwingAmount;
        rArm01.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.7F * limbSwingAmount + 0.091106186954104F;
    }

}
