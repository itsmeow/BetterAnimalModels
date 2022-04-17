package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewDolphin<T extends LivingEntity> extends Model<T> {

    public ModelPart body;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart tail05;
    public ModelPart lFluke00;
    public ModelPart lFluke01;
    public ModelPart rFluke00;
    public ModelPart rFluke01;
    public ModelPart head;
    public ModelPart topJaw;
    public ModelPart snout;
    public ModelPart teethUpper;
    public ModelPart lowerJaw;
    public ModelPart lowerTeeth;
    public ModelPart melon;
    public ModelPart lFin00;
    public ModelPart lFin01;
    public ModelPart rFin00;
    public ModelPart rFin01;
    public ModelPart dorsalFin00;
    public ModelPart dorsalFin01;

    public ModelNewDolphin(ModelPart root) {
        this.body = root.getChild("body");
        this.tail01 = body.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.tail04 = tail03.getChild("tail04");
        this.tail05 = tail04.getChild("tail05");
        this.lFluke00 = tail05.getChild("lFluke00");
        this.lFluke01 = lFluke00.getChild("lFluke01");
        this.rFluke00 = tail05.getChild("rFluke00");
        this.rFluke01 = rFluke00.getChild("rFluke01");
        this.head = body.getChild("head");
        this.topJaw = head.getChild("topJaw");
        this.snout = topJaw.getChild("snout");
        this.teethUpper = topJaw.getChild("teethUpper");
        this.lowerJaw = head.getChild("lowerJaw");
        this.lowerTeeth = lowerJaw.getChild("lowerTeeth");
        this.melon = head.getChild("melon");
        this.lFin00 = body.getChild("lFin00");
        this.lFin01 = lFin00.getChild("lFin01");
        this.rFin00 = body.getChild("rFin00");
        this.rFin01 = rFin00.getChild("rFin01");
        this.dorsalFin00 = body.getChild("dorsalFin00");
        this.dorsalFin01 = dorsalFin00.getChild("dorsalFin01");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.5F, -6.5F, 8.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.5F, 0.0F));
        PartDefinition tail01 = body.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -4.0F, 0.0F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 5.8F, -0.0873F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(0, 39).addBox(-2.5F, -4.0F, 0.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 7.5F, -0.0873F, 0.0F, 0.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 6.8F, -0.0873F, 0.0F, 0.0F));
        PartDefinition tail04 = tail03.addOrReplaceChild("tail04", CubeListBuilder.create().texOffs(20, 55).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 4.9F, -0.2276F, 0.0F, 0.0F));
        PartDefinition tail05 = tail04.addOrReplaceChild("tail05", CubeListBuilder.create().texOffs(35, 57).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 3.7F));
        PartDefinition lFluke00 = tail05.addOrReplaceChild("lFluke00", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.1F, -0.5F, 0.4887F, 0.0F, -1.309F));
        PartDefinition lFluke01 = lFluke00.addOrReplaceChild("lFluke01", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.01F, 4.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
        PartDefinition rFluke00 = tail05.addOrReplaceChild("rFluke00", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1F, -0.5F, 0.4887F, 0.0F, 1.309F));
        PartDefinition rFluke01 = rFluke00.addOrReplaceChild("rFluke01", CubeListBuilder.create().texOffs(90, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 4.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(45, 0).addBox(-3.5F, -1.0F, -6.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -6.2F, 0.0349F, 0.0F, 0.0F));
        PartDefinition topJaw = head.addOrReplaceChild("topJaw", CubeListBuilder.create().texOffs(45, 32).addBox(-1.5F, 0.0F, -9.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4F, -5.7F, 0.0873F, 0.0F, 0.0F));
        PartDefinition snout = topJaw.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(52, 25).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -4.1F, 0.6981F, 0.0F, 0.0F));
        PartDefinition teethUpper = topJaw.addOrReplaceChild("teethUpper", CubeListBuilder.create().texOffs(72, 35).addBox(-1.4F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.6F, -8.4F));
        PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(48, 45).addBox(-1.8F, 0.0F, -9.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -5.9F));
        PartDefinition lowerTeeth = lowerJaw.addOrReplaceChild("lowerTeeth", CubeListBuilder.create().texOffs(72, 45).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.6F, -0.0456F, 0.0F, 0.0F));
        PartDefinition melon = head.addOrReplaceChild("melon", CubeListBuilder.create().texOffs(47, 14).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -5.9F, 0.4363F, 0.0F, 0.0F));
        PartDefinition lFin00 = body.addOrReplaceChild("lFin00", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8F, 4.0F, -5.0F, 0.5236F, 0.0F, -0.8727F));
        PartDefinition lFin01 = lFin00.addOrReplaceChild("lFin01", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, 4.5F, 0.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition rFin00 = body.addOrReplaceChild("rFin00", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 4.0F, -5.0F, 0.5236F, 0.0F, 0.8727F));
        PartDefinition rFin01 = rFin00.addOrReplaceChild("rFin01", CubeListBuilder.create().texOffs(79, 10).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.49F, 4.5F, 0.0F, 0.3491F, 0.0F, 0.0F));
        PartDefinition dorsalFin00 = body.addOrReplaceChild("dorsalFin00", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5F, -4.9F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 4.0F, -0.7854F, 0.0F, 0.0F));
        PartDefinition dorsalFin01 = dorsalFin00.addOrReplaceChild("dorsalFin01", CubeListBuilder.create().texOffs(104, 9).addBox(-0.4F, -4.0F, -2.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -0.5F, -0.3491F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.body.xRot = headPitch * ((float) Math.PI / 180F);
        this.body.yRot = netHeadYaw * ((float) Math.PI / 180F);
        if (entityIn.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
            this.body.xRot += -0.05F + -0.05F * Mth.cos(ageInTicks * 0.3F);
            this.tail01.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail02.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail03.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail04.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
            this.tail05.xRot = -0.2F * Mth.cos(ageInTicks * 0.3F);
        } else {
            this.tail01.xRot = -0.08726646259971647F;
            this.tail02.xRot = -0.08726646259971647F;
            this.tail03.xRot = -0.08726646259971647F;
            this.tail04.xRot = -0.2275909337942703F;
            this.tail05.xRot = 0F;
        }
    }

}
