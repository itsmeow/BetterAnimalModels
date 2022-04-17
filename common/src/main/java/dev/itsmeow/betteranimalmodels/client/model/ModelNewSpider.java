package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewSpider<T extends LivingEntity> extends Model<T> {

    public ModelPart bodyBase;
    public ModelPart abdomen;
    public ModelPart thorax;
    public ModelPart head;
    public ModelPart lMandible;
    public ModelPart lFang01;
    public ModelPart lFang02;
    public ModelPart rMandible;
    public ModelPart rFang01;
    public ModelPart rFang02;
    public ModelPart lLeg01a;
    public ModelPart lLeg01b;
    public ModelPart lLeg01c;
    public ModelPart lLeg02a;
    public ModelPart lLeg02b;
    public ModelPart lLeg02c;
    public ModelPart lLeg03a;
    public ModelPart lLeg03b;
    public ModelPart lLeg03c;
    public ModelPart lLeg04a;
    public ModelPart lLeg04b;
    public ModelPart lLeg04c;
    public ModelPart rLeg01a;
    public ModelPart rLeg01b;
    public ModelPart rLeg01c;
    public ModelPart rLeg02a;
    public ModelPart rLeg02b;
    public ModelPart rLeg02c;
    public ModelPart rLeg03a;
    public ModelPart rLeg03b;
    public ModelPart rLeg03c;
    public ModelPart rLeg04a;
    public ModelPart rLeg04b;
    public ModelPart rLeg04c;
    public ModelPart lPedipalp01;
    public ModelPart lPedipalp02;
    public ModelPart rPedipalp01;
    public ModelPart rPedipalp02;

    public ModelNewSpider(ModelPart root) {
        this.bodyBase = root.getChild("bodyBase");
        this.abdomen = bodyBase.getChild("abdomen");
        this.thorax = bodyBase.getChild("thorax");
        this.head = thorax.getChild("head");
        this.lMandible = head.getChild("lMandible");
        this.lFang01 = lMandible.getChild("lFang01");
        this.lFang02 = lFang01.getChild("lFang02");
        this.rMandible = head.getChild("rMandible");
        this.rFang01 = rMandible.getChild("rFang01");
        this.rFang02 = rFang01.getChild("rFang02");
        this.lLeg01a = thorax.getChild("lLeg01a");
        this.lLeg01b = lLeg01a.getChild("lLeg01b");
        this.lLeg01c = lLeg01b.getChild("lLeg01c");
        this.lLeg02a = thorax.getChild("lLeg02a");
        this.lLeg02b = lLeg02a.getChild("lLeg02b");
        this.lLeg02c = lLeg02b.getChild("lLeg02c");
        this.lLeg03a = thorax.getChild("lLeg03a");
        this.lLeg03b = lLeg03a.getChild("lLeg03b");
        this.lLeg03c = lLeg03b.getChild("lLeg03c");
        this.lLeg04a = thorax.getChild("lLeg04a");
        this.lLeg04b = lLeg04a.getChild("lLeg04b");
        this.lLeg04c = lLeg04b.getChild("lLeg04c");
        this.rLeg01a = thorax.getChild("rLeg01a");
        this.rLeg01b = rLeg01a.getChild("rLeg01b");
        this.rLeg01c = rLeg01b.getChild("rLeg01c");
        this.rLeg02a = thorax.getChild("rLeg02a");
        this.rLeg02b = rLeg02a.getChild("rLeg02b");
        this.rLeg02c = rLeg02b.getChild("rLeg02c");
        this.rLeg03a = thorax.getChild("rLeg03a");
        this.rLeg03b = rLeg03a.getChild("rLeg03b");
        this.rLeg03c = rLeg03b.getChild("rLeg03c");
        this.rLeg04a = thorax.getChild("rLeg04a");
        this.rLeg04b = rLeg04a.getChild("rLeg04b");
        this.rLeg04c = rLeg04b.getChild("rLeg04c");
        this.lPedipalp01 = thorax.getChild("lPedipalp01");
        this.lPedipalp02 = lPedipalp01.getChild("lPedipalp02");
        this.rPedipalp01 = thorax.getChild("rPedipalp01");
        this.rPedipalp02 = rPedipalp01.getChild("rPedipalp02");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition bodyBase = partdefinition.addOrReplaceChild("bodyBase", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.7F, 4.0F));
        PartDefinition abdomen = bodyBase.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 15).addBox(-4.5F, -3.0F, 0.0F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.6F, -0.182F, 0.0F, 0.0F));
        PartDefinition thorax = bodyBase.addOrReplaceChild("thorax", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 0.0F));
        PartDefinition head = thorax.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 0).addBox(-3.5F, -3.0F, -3.0F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, -7.2F));
        PartDefinition lMandible = head.addOrReplaceChild("lMandible", CubeListBuilder.create().texOffs(50, 12).mirror().addBox(-1.5F, -1.5F, -1.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, 1.8F, -2.6F, 0.2731F, 0.0F, 0.0F));
        PartDefinition lFang01 = lMandible.addOrReplaceChild("lFang01", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1F, -1.2F, -0.2731F, 0.0F, 0.0F));
        PartDefinition lFang02 = lFang01.addOrReplaceChild("lFang02", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 2.4F, 0.3187F, -0.3187F, 0.7741F));
        PartDefinition rMandible = head.addOrReplaceChild("rMandible", CubeListBuilder.create().texOffs(50, 12).addBox(-1.5F, -1.5F, -1.9F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.8F, -2.6F, 0.2731F, 0.0F, 0.0F));
        PartDefinition rFang01 = rMandible.addOrReplaceChild("rFang01", CubeListBuilder.create().texOffs(48, 19).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -1.2F, -0.2731F, 0.0F, 0.0F));
        PartDefinition rFang02 = rFang01.addOrReplaceChild("rFang02", CubeListBuilder.create().texOffs(57, 20).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.4F, 0.3187F, 0.3187F, -0.7741F));
        PartDefinition lLeg01a = thorax.addOrReplaceChild("lLeg01a", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 1.0F, -6.3F, 0.4098F, 0.0F, 0.7285F));
        PartDefinition lLeg01b = lLeg01a.addOrReplaceChild("lLeg01b", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.6F, 0.0F, -0.0911F, 0.4098F, -0.0911F));
        PartDefinition lLeg01c = lLeg01b.addOrReplaceChild("lLeg01c", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(0.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.3F, -0.1F, 0.0F, 0.0F, 0.0F, 0.5918F));
        PartDefinition lLeg02a = thorax.addOrReplaceChild("lLeg02a", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.0F, -4.6F, 0.2276F, 0.0F, 0.7285F));
        PartDefinition lLeg02b = lLeg02a.addOrReplaceChild("lLeg02b", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.6F, 0.0F, 0.1367F, 0.2276F, -0.0911F));
        PartDefinition lLeg02c = lLeg02b.addOrReplaceChild("lLeg02c", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(0.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.3F, -0.1F, 0.0F, -0.0911F, 0.0911F, 0.5918F));
        PartDefinition lLeg03a = thorax.addOrReplaceChild("lLeg03a", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.0F, -3.3F, -0.2276F, 0.0F, 0.7285F));
        PartDefinition lLeg03b = lLeg03a.addOrReplaceChild("lLeg03b", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.6F, 0.0F, -0.1367F, -0.2276F, -0.0911F));
        PartDefinition lLeg03c = lLeg03b.addOrReplaceChild("lLeg03c", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(0.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.3F, -0.1F, 0.0F, 0.0911F, -0.0911F, 0.5918F));
        PartDefinition lLeg04a = thorax.addOrReplaceChild("lLeg04a", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 1.0F, -1.5F, -0.4098F, 0.0F, 0.7285F));
        PartDefinition lLeg04b = lLeg04a.addOrReplaceChild("lLeg04b", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.6F, 0.0F, 0.0911F, -0.2731F, -0.0911F));
        PartDefinition lLeg04c = lLeg04b.addOrReplaceChild("lLeg04c", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(0.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.3F, -0.1F, 0.0F, 0.0F, -0.0911F, 0.5918F));
        PartDefinition rLeg01a = thorax.addOrReplaceChild("rLeg01a", CubeListBuilder.create().texOffs(39, 17).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.0F, -6.3F, 0.4098F, 0.0F, -0.7285F));
        PartDefinition rLeg01b = rLeg01a.addOrReplaceChild("rLeg01b", CubeListBuilder.create().texOffs(44, 26).addBox(-7.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.6F, 0.0F, -0.0911F, -0.4098F, 0.0911F));
        PartDefinition rLeg01c = rLeg01b.addOrReplaceChild("rLeg01c", CubeListBuilder.create().texOffs(44, 26).addBox(-8.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, -0.1F, 0.0F, 0.0F, 0.0F, -0.5918F));
        PartDefinition rLeg02a = thorax.addOrReplaceChild("rLeg02a", CubeListBuilder.create().texOffs(39, 17).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -4.6F, 0.2276F, 0.0F, -0.7285F));
        PartDefinition rLeg02b = rLeg02a.addOrReplaceChild("rLeg02b", CubeListBuilder.create().texOffs(44, 26).addBox(-7.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.6F, 0.0F, 0.1367F, -0.2276F, 0.0911F));
        PartDefinition rLeg02c = rLeg02b.addOrReplaceChild("rLeg02c", CubeListBuilder.create().texOffs(44, 26).addBox(-8.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, -0.1F, 0.0F, 0.0F, 0.0F, -0.5918F));
        PartDefinition rLeg03a = thorax.addOrReplaceChild("rLeg03a", CubeListBuilder.create().texOffs(39, 17).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -3.3F, -0.2276F, 0.0F, -0.7285F));
        PartDefinition rLeg03b = rLeg03a.addOrReplaceChild("rLeg03b", CubeListBuilder.create().texOffs(44, 26).addBox(-7.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.6F, 0.0F, 0.1367F, 0.2276F, 0.0911F));
        PartDefinition rLeg03c = rLeg03b.addOrReplaceChild("rLeg03c", CubeListBuilder.create().texOffs(44, 26).addBox(-8.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, -0.1F, 0.0F, 0.0F, 0.0F, -0.5918F));
        PartDefinition rLeg04a = thorax.addOrReplaceChild("rLeg04a", CubeListBuilder.create().texOffs(39, 17).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.0F, -1.5F, -0.4098F, 0.0F, -0.7285F));
        PartDefinition rLeg04b = rLeg04a.addOrReplaceChild("rLeg04b", CubeListBuilder.create().texOffs(44, 26).addBox(-7.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.6F, 0.0F, 0.1367F, 0.2731F, 0.0911F));
        PartDefinition rLeg04c = rLeg04b.addOrReplaceChild("rLeg04c", CubeListBuilder.create().texOffs(44, 26).addBox(-8.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3F, -0.1F, 0.0F, 0.0F, 0.0911F, -0.5918F));
        PartDefinition lPedipalp01 = thorax.addOrReplaceChild("lPedipalp01", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8F, 1.3F, -7.6F, -0.1367F, -0.3187F, 0.0F));
        PartDefinition lPedipalp02 = lPedipalp01.addOrReplaceChild("lPedipalp02", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-0.49F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -3.6F, 1.0016F, 0.0F, 0.0F));
        PartDefinition rPedipalp01 = thorax.addOrReplaceChild("rPedipalp01", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 1.3F, -7.6F, -0.1367F, 0.3187F, 0.0F));
        PartDefinition rPedipalp02 = rPedipalp01.addOrReplaceChild("rPedipalp02", CubeListBuilder.create().texOffs(30, 12).addBox(-0.51F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.6F, 1.0016F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.bodyBase.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = rad(netHeadYaw);
        this.head.xRot = rad(headPitch);

        this.rLeg01a.zRot = -((float) Math.PI / 4F);
        this.lLeg01a.zRot = ((float) Math.PI / 4F);

        this.rLeg02a.zRot = -0.78119464F;
        this.lLeg02a.zRot = 0.78119464F;

        this.rLeg03a.zRot = -0.78119464F;
        this.lLeg03a.zRot = 0.78119464F;

        this.rLeg04a.zRot = -((float) Math.PI / 4F) - 0.3F;
        this.rLeg04a.xRot = -((float) Math.PI / 4F) + 0.3F;

        this.lLeg04a.zRot = ((float) Math.PI / 4F) + 0.3F;
        this.lLeg04a.xRot = ((float) Math.PI / 4F) - 1.3F;

        this.rLeg01a.yRot = ((float) Math.PI / 16F);
        this.lLeg01a.yRot = -((float) Math.PI / 16F);

        this.rLeg02a.yRot = 0.1926991F;
        this.lLeg02a.yRot = -0.1926991F;

        this.rLeg03a.yRot = 0.1926991F;
        this.lLeg03a.yRot = -0.1926991F;

        this.rLeg04a.yRot = -((float) Math.PI / 12F) + 0.4F;
        this.lLeg04a.yRot = ((float) Math.PI / 12F) - 0.4F;

        float f3 = -(Mth.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
        float f4 = -(Mth.cos(limbSwing * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * limbSwingAmount;
        float f5 = -(Mth.cos(limbSwing * 0.6662F * 2.0F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f6 = -(Mth.cos(limbSwing * 0.6662F * 2.0F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        float f7 = Math.abs(Mth.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
        float f8 = Math.abs(Mth.sin(limbSwing * 0.6662F + (float) Math.PI) * 0.4F) * limbSwingAmount;
        float f9 = Math.abs(Mth.sin(limbSwing * 0.6662F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f10 = Math.abs(Mth.sin(limbSwing * 0.6662F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;

        this.rLeg01a.yRot += f3;
        this.lLeg01a.yRot += -f3;
        this.rLeg02a.yRot += f4;
        this.lLeg02a.yRot += -f4;
        this.rLeg03a.yRot += f5;
        this.lLeg03a.yRot += -f5;
        this.rLeg04a.yRot += f6;
        this.lLeg04a.yRot += -f6;
        this.rLeg01a.zRot += f7;
        this.lLeg01a.zRot += -f7;
        this.rLeg02a.zRot += f8;
        this.lLeg02a.zRot += -f8;
        this.rLeg03a.zRot += f9;
        this.lLeg03a.zRot += -f9;
        this.rLeg04a.zRot += f10;
        this.lLeg04a.zRot += -f10;
        this.rLeg04a.zRot += f10;
        this.lLeg04a.zRot += -f10;
    }
}
