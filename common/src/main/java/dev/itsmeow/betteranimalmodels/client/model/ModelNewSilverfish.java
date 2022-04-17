package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewSilverfish<T extends LivingEntity> extends Model<T> {

    public ModelPart thorax01;
    public ModelPart head;
    public ModelPart lAntenna;
    public ModelPart rAntenna;
    public ModelPart thorax02;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart tail05;
    public ModelPart lTailWhisker;
    public ModelPart rTailWhisker;
    public ModelPart mTailWhisker;
    public ModelPart lLeg03a;
    public ModelPart lLeg03b;
    public ModelPart rLeg03a;
    public ModelPart rLeg03b;
    public ModelPart lLeg01a;
    public ModelPart lLeg01b;
    public ModelPart lLeg02a;
    public ModelPart lLeg02b;
    public ModelPart rLeg01a;
    public ModelPart rLeg01b;
    public ModelPart rLeg02a;
    public ModelPart rLeg02b;

    public ModelNewSilverfish(ModelPart root) {
        this.thorax01 = root.getChild("thorax01");
        this.head = thorax01.getChild("head");
        this.lAntenna = head.getChild("lAntenna");
        this.rAntenna = head.getChild("rAntenna");
        this.thorax02 = thorax01.getChild("thorax02");
        this.tail01 = thorax02.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.tail04 = tail03.getChild("tail04");
        this.tail05 = tail04.getChild("tail05");
        this.lTailWhisker = tail05.getChild("lTailWhisker");
        this.rTailWhisker = tail05.getChild("rTailWhisker");
        this.mTailWhisker = tail05.getChild("mTailWhisker");
        this.lLeg01a = thorax01.getChild("lLeg01a");
        this.lLeg01b = lLeg01a.getChild("lLeg01b");
        this.lLeg02a = thorax01.getChild("lLeg02a");
        this.lLeg02b = lLeg02a.getChild("lLeg02b");
        this.rLeg01a = thorax01.getChild("rLeg01a");
        this.rLeg01b = rLeg01a.getChild("rLeg01b");
        this.rLeg02a = thorax01.getChild("rLeg01a");
        this.rLeg02b = rLeg02a.getChild("rLeg01b");
        this.lLeg03a = thorax02.getChild("lLeg03a");
        this.lLeg03b = lLeg03a.getChild("lLeg03b");
        this.rLeg03a = thorax02.getChild("rLeg03a");
        this.rLeg03b = rLeg03a.getChild("rLeg03b");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition thorax01 = partdefinition.addOrReplaceChild("thorax01", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.6F, -1.0F));
        PartDefinition head = thorax01.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.5F, -1.7F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.2F));
        PartDefinition lAntenna = head.addOrReplaceChild("lAntenna", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-0.5F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.4F, -1.2F, 0.0F, -0.2276F, 0.0F));
        PartDefinition rAntenna = head.addOrReplaceChild("rAntenna", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.4F, -1.2F, 0.0F, 0.2276F, 0.0F));
        PartDefinition thorax02 = thorax01.addOrReplaceChild("thorax02", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.9F));
        PartDefinition tail01 = thorax02.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(26, 0).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.9F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(26, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(26, 6).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.9F));
        PartDefinition tail04 = tail03.addOrReplaceChild("tail04", CubeListBuilder.create().texOffs(26, 11).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.9F));
        PartDefinition tail05 = tail04.addOrReplaceChild("tail05", CubeListBuilder.create().texOffs(26, 17).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.9F));
        PartDefinition lTailWhisker = tail05.addOrReplaceChild("lTailWhisker", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 1.4F, 0.0F, 0.5236F, 0.0F));
        PartDefinition rTailWhisker = tail05.addOrReplaceChild("rTailWhisker", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, 1.4F, 0.0F, -0.5236F, 0.0F));
        PartDefinition mTailWhisker = tail05.addOrReplaceChild("mTailWhisker", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.1F, 1.4F));
        PartDefinition lLeg03a = thorax02.addOrReplaceChild("lLeg03a", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.5F, 1.0F, 0.0F, -0.3187F, 0.0F));
        PartDefinition lLeg03b = lLeg03a.addOrReplaceChild("lLeg03b", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.6F, -0.2F, 0.0F, 0.0F, 0.0F, -0.5463F));
        PartDefinition rLeg03a = thorax02.addOrReplaceChild("rLeg03a", CubeListBuilder.create().texOffs(41, 15).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.5F, 1.0F, 0.0F, 0.3187F, 0.0F));
        PartDefinition rLeg03b = rLeg03a.addOrReplaceChild("rLeg03b", CubeListBuilder.create().texOffs(43, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.6F, -0.2F, 0.0F, 0.0F, 0.0F, 0.5463F));
        PartDefinition lLeg01a = thorax01.addOrReplaceChild("lLeg01a", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.5F, -1.5F, 0.0F, 0.3187F, 0.0F));
        PartDefinition lLeg01b = lLeg01a.addOrReplaceChild("lLeg01b", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.6F, -0.2F, 0.0F, 0.0F, 0.0F, -0.5463F));
        PartDefinition lLeg02a = thorax01.addOrReplaceChild("lLeg02a", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.2F, 0.5F, 1.0F));
        PartDefinition lLeg02b = lLeg02a.addOrReplaceChild("lLeg02b", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(2.6F, -0.2F, 0.0F, 0.0F, 0.0F, -0.5463F));
        PartDefinition rLeg01a = thorax01.addOrReplaceChild("rLeg01a", CubeListBuilder.create().texOffs(41, 15).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.5F, -1.5F, 0.0F, -0.3187F, 0.0F));
        PartDefinition rLeg01b = rLeg01a.addOrReplaceChild("rLeg01b", CubeListBuilder.create().texOffs(43, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.6F, -0.2F, 0.0F, 0.0F, 0.0F, 0.5463F));
        PartDefinition rLeg02a = thorax01.addOrReplaceChild("rLeg02a", CubeListBuilder.create().texOffs(41, 15).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2F, 0.5F, 1.0F));
        PartDefinition rLeg02b = rLeg02a.addOrReplaceChild("rLeg02b", CubeListBuilder.create().texOffs(43, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.6F, -0.2F, 0.0F, 0.0F, 0.0F, 0.5463F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.thorax01.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.lLeg01a.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg01b.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.lLeg02a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg02b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.lLeg03a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.lLeg03b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.rLeg01a.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.rLeg01b.xRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.rLeg02a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.rLeg02b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.rLeg03a.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;
        this.rLeg03b.xRot = Mth.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount;

        this.tail01.yRot = Mth.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.9F * limbSwingAmount * 0.1F;
        this.tail02.yRot = this.tail01.yRot;
        this.tail03.yRot = this.tail01.yRot;
        this.tail04.yRot = this.tail01.yRot;
        this.tail05.yRot = this.tail01.yRot;
    }
}
