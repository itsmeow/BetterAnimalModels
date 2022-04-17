package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewChicken<T extends LivingEntity> extends Model<T> {

    public ModelPart body;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart buttFeathers01;
    public ModelPart buttFeathers02;
    public ModelPart lLeg;
    public ModelPart lLeg01Feathers;
    public ModelPart lLeg02;
    public ModelPart lToe01;
    public ModelPart lToe02;
    public ModelPart lToe03;
    public ModelPart lToe04;
    public ModelPart rLeg;
    public ModelPart rLeg01Feathers;
    public ModelPart rLeg02;
    public ModelPart rToes01;
    public ModelPart rToe02;
    public ModelPart rToe03;
    public ModelPart rToe04;
    public ModelPart neck01;
    public ModelPart neck02;
    public ModelPart head;
    public ModelPart beak;
    public ModelPart beakLower;
    public ModelPart crest;
    public ModelPart lWaddle;
    public ModelPart rWaddle;
    public ModelPart neckRuff02;
    public ModelPart neckRuff01;
    public ModelPart lWing;
    public ModelPart lWing01b;
    public ModelPart lWing02;
    public ModelPart lWing02b;
    public ModelPart rWing;
    public ModelPart rWing01b;
    public ModelPart rWing02;
    public ModelPart rWing02b;

    public ModelNewChicken(ModelPart root) {
        this.body = root.getChild("body");
        this.tail01 = body.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail01.getChild("tail03");
        this.buttFeathers01 = body.getChild("buttFeathers01");
        this.buttFeathers02 = body.getChild("buttFeathers02");
        this.lLeg = body.getChild("lLeg");
        this.lLeg01Feathers = lLeg.getChild("lLeg01Feathers");
        this.lLeg02 = lLeg.getChild("lLeg02");
        this.lToe01 = lLeg02.getChild("lToe01");
        this.lToe02 = lLeg02.getChild("lToe02");
        this.lToe03 = lLeg02.getChild("lToe03");
        this.lToe04 = lLeg02.getChild("lToe04");
        this.rLeg = body.getChild("rLeg");
        this.rLeg01Feathers = rLeg.getChild("rLeg01Feathers");
        this.rLeg02 = rLeg.getChild("rLeg02");
        this.rToes01 = rLeg02.getChild("rToes01");
        this.rToe02 = rLeg02.getChild("rToe02");
        this.rToe03 = rLeg02.getChild("rToe03");
        this.rToe04 = rLeg02.getChild("rToe04");
        this.neck01 = body.getChild("neck01");
        this.neck02 = neck01.getChild("neck02");
        this.head = neck02.getChild("head");
        this.beak = head.getChild("beak");
        this.beakLower = head.getChild("beakLower");
        this.crest = head.getChild("crest");
        this.lWaddle = head.getChild("lWaddle");
        this.rWaddle = head.getChild("rWaddle");
        this.neckRuff02 = neck02.getChild("neckRuff02");
        this.neckRuff01 = neck01.getChild("neckRuff01");
        this.lWing = body.getChild("lWing");
        this.lWing01b = lWing.getChild("lWing01b");
        this.lWing02 = lWing.getChild("lWing02");
        this.lWing02b = lWing02.getChild("lWing02b");
        this.rWing = body.getChild("rWing");
        this.rWing01b = rWing.getChild("rWing01b");
        this.rWing02 = rWing.getChild("rWing02");
        this.rWing02b = rWing02.getChild("rWing02b");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 15.7F, 0.0F, -0.0349F, 0.0F, 0.0F));
        PartDefinition tail01 = body.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -1.5F, -0.7F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 3.7F, 0.6283F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(32, 0).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.5F, 0.3142F, 0.0F, 0.0F));
        PartDefinition tail03 = tail01.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(30, 12).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, 0.2094F, 0.0F, 0.0F));
        PartDefinition buttFeathers01 = body.addOrReplaceChild("buttFeathers01", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.2F, 3.6F, 0.1396F, 0.0F, 0.0F));
        PartDefinition buttFeathers02 = body.addOrReplaceChild("buttFeathers02", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 3.4F, 0.2793F, 0.0F, 0.0F));
        PartDefinition lLeg = body.addOrReplaceChild("lLeg", CubeListBuilder.create().texOffs(24, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4F, 2.5F, 2.1F));
        PartDefinition lLeg01Feathers = lLeg.addOrReplaceChild("lLeg01Feathers", CubeListBuilder.create().texOffs(34, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
        PartDefinition lLeg02 = lLeg.addOrReplaceChild("lLeg02", CubeListBuilder.create().texOffs(44, 28).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, -0.1396F, 0.0F, 0.0F));
        PartDefinition lToe01 = lLeg02.addOrReplaceChild("lToe01", CubeListBuilder.create().texOffs(52, 28).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, 0.0F, 0.0F));
        PartDefinition lToe02 = lLeg02.addOrReplaceChild("lToe02", CubeListBuilder.create().texOffs(52, 28).addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, -0.6981F, 0.0F));
        PartDefinition lToe03 = lLeg02.addOrReplaceChild("lToe03", CubeListBuilder.create().texOffs(52, 28).addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, 0.6981F, 0.0F));
        PartDefinition lToe04 = lLeg02.addOrReplaceChild("lToe04", CubeListBuilder.create().texOffs(52, 34).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, -0.0698F, 0.0F, 0.0F));
        PartDefinition rLeg = body.addOrReplaceChild("rLeg", CubeListBuilder.create().texOffs(24, 28).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.4F, 2.5F, 2.1F));
        PartDefinition rLeg01Feathers = rLeg.addOrReplaceChild("rLeg01Feathers", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 2.0F, 0.0F));
        PartDefinition rLeg02 = rLeg.addOrReplaceChild("rLeg02", CubeListBuilder.create().texOffs(44, 28).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, -0.1396F, 0.0F, 0.0F));
        PartDefinition rToes01 = rLeg02.addOrReplaceChild("rToes01", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, 0.0F, 0.0F));
        PartDefinition rToe02 = rLeg02.addOrReplaceChild("rToe02", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, 0.6981F, 0.0F));
        PartDefinition rToe03 = rLeg02.addOrReplaceChild("rToe03", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, 0.3665F, -0.6981F, 0.0F));
        PartDefinition rToe04 = rLeg02.addOrReplaceChild("rToe04", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8F, 0.0F, -0.0698F, 0.0F, 0.0F));
        PartDefinition neck01 = body.addOrReplaceChild("neck01", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.1F, -0.6981F, 0.0F, 0.0F));
        PartDefinition neck02 = neck01.addOrReplaceChild("neck02", CubeListBuilder.create().texOffs(17, 41).addBox(-1.5F, -1.5F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, -0.5236F, 0.0F, 0.0F));
        PartDefinition head = neck02.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 42).addBox(-1.5F, -1.5F, -3.3F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.3F, -0.2793F, 0.0F, 0.0F));
        PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -1.8F, 0.2443F, 0.0F, 0.0F));
        PartDefinition beakLower = head.addOrReplaceChild("beakLower", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.2F, -1.4F));
        PartDefinition crest = head.addOrReplaceChild("crest", CubeListBuilder.create().texOffs(31, 34).addBox(0.0F, -1.8F, -1.2F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.3F, 0.2094F, 0.0F, 0.0F));
        PartDefinition lWaddle = head.addOrReplaceChild("lWaddle", CubeListBuilder.create().texOffs(36, 34).addBox(0.0F, -0.8F, -0.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4F, 1.2F, -1.3F));
        PartDefinition rWaddle = head.addOrReplaceChild("rWaddle", CubeListBuilder.create().texOffs(36, 34).mirror().addBox(0.0F, -0.8F, -0.3F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.4F, 1.2F, -1.3F));
        PartDefinition neckRuff02 = neck02.addOrReplaceChild("neckRuff02", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.6F, -0.1571F, 0.0F, 0.0F));
        PartDefinition neckRuff01 = neck01.addOrReplaceChild("neckRuff01", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.2F, -2.6F, -0.5236F, 0.0F, 0.0F));
        PartDefinition lWing = body.addOrReplaceChild("lWing", CubeListBuilder.create().texOffs(20, 52).addBox(0.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.3F, -2.8F, 0.0F, -1.0472F, 0.5236F));
        PartDefinition lWing01b = lWing.addOrReplaceChild("lWing01b", CubeListBuilder.create().texOffs(32, 51).addBox(0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition lWing02 = lWing.addOrReplaceChild("lWing02", CubeListBuilder.create().texOffs(20, 57).addBox(-0.6F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.9F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition lWing02b = lWing02.addOrReplaceChild("lWing02b", CubeListBuilder.create().texOffs(31, 57).addBox(0.0F, -0.1F, -1.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rWing = body.addOrReplaceChild("rWing", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.3F, -2.8F, 0.0F, 1.0472F, -0.5236F));
        PartDefinition rWing01b = rWing.addOrReplaceChild("rWing01b", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(-5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rWing02 = rWing.addOrReplaceChild("rWing02", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-2.4F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
        PartDefinition rWing02b = rWing02.addOrReplaceChild("rWing02b", CubeListBuilder.create().texOffs(31, 57).mirror().addBox(-7.0F, -0.1F, -1.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
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
        this.biped(lLeg, rLeg, limbSwing * 0.6662F, limbSwingAmount * 1.5F);
        this.lWing.zRot = -ageInTicks;
        this.rWing.zRot = ageInTicks;
    }

}
