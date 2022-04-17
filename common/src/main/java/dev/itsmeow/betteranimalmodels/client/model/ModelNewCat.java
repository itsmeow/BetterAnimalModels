package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Ocelot;

public class ModelNewCat<T extends LivingEntity> extends Model<T> {
    public ModelPart chest;
    public ModelPart stomach;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart tail03;
    public ModelPart tail04a;
    public ModelPart tail04b;
    public ModelPart tail05a;
    public ModelPart tail05b;
    public ModelPart lLeg01;
    public ModelPart lLeg02;
    public ModelPart lLeg03;
    public ModelPart lHindPaw;
    public ModelPart rLeg01;
    public ModelPart rLeg02;
    public ModelPart rLeg03;
    public ModelPart rHindPaw;
    public ModelPart neck;
    public ModelPart head;
    public ModelPart lEar01;
    public ModelPart lEar02;
    public ModelPart lEar03;
    public ModelPart rEar01;
    public ModelPart rEar02;
    public ModelPart rEar03;
    public ModelPart nose;
    public ModelPart mouthL;
    public ModelPart mouthR;
    public ModelPart lowerJaw;
    public ModelPart mane01;
    public ModelPart mane02;
    public ModelPart lArm01;
    public ModelPart lArm02;
    public ModelPart lForePaw;
    public ModelPart rArm01;
    public ModelPart rArm02;
    public ModelPart rForePaw;

    public ModelNewCat(ModelPart root) {
        this.chest = root.getChild("chest");
        this.stomach = chest.getChild("stomach");
        this.tail01 = stomach.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.tail04a = tail03.getChild("tail04a");
        this.tail04b = tail04a.getChild("tail04b");
        this.tail05a = tail04a.getChild("tail05a");
        this.tail05b = tail05a.getChild("tail05b");
        this.lLeg01 = stomach.getChild("lLeg01");
        this.lLeg02 = lLeg01.getChild("lLeg02");
        this.lLeg03 = lLeg02.getChild("lLeg03");
        this.lHindPaw = lLeg03.getChild("lHindPaw");
        this.rLeg01 = stomach.getChild("rLeg01");
        this.rLeg02 = rLeg01.getChild("rLeg02");
        this.rLeg03 = rLeg02.getChild("rLeg03");
        this.rHindPaw = rLeg03.getChild("rHindPaw");
        this.neck = chest.getChild("neck");
        this.head = neck.getChild("head");
        this.lEar01 = head.getChild("lEar01");
        this.lEar02 = lEar01.getChild("lEar02");
        this.lEar03 = lEar01.getChild("lEar03");
        this.rEar01 = head.getChild("rEar01");
        this.rEar02 = rEar01.getChild("rEar02");
        this.rEar03 = rEar01.getChild("rEar03");
        this.nose = head.getChild("nose");
        this.mouthL = head.getChild("mouthL");
        this.mouthR = head.getChild("mouthR");
        this.lowerJaw = head.getChild("lowerJaw");
        this.mane01 = neck.getChild("mane01");
        this.mane02 = neck.getChild("mane02");
        this.lArm01 = chest.getChild("lArm01");
        this.lArm02 = lArm01.getChild("lArm02");
        this.lForePaw = lArm02.getChild("lForePaw");
        this.rArm01 = chest.getChild("rArm01");
        this.rArm02 = rArm01.getChild("rArm02");
        this.rForePaw = rArm02.getChild("rForePaw");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -5.7F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.4F, -2.0F));
        PartDefinition stomach = chest.addOrReplaceChild("stomach", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -2.39F, -1.4F, 6.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.7F));
        PartDefinition tail01 = stomach.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 7.1F, -0.5934F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0873F, 0.0F, 0.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0873F, 0.0F, 0.0F));
        PartDefinition tail04a = tail03.addOrReplaceChild("tail04a", CubeListBuilder.create().texOffs(48, 0).addBox(-0.3F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0873F, 0.0F, 0.0F));
        PartDefinition tail04b = tail04a.addOrReplaceChild("tail04b", CubeListBuilder.create().texOffs(48, 0).addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition tail05a = tail04a.addOrReplaceChild("tail05a", CubeListBuilder.create().texOffs(56, 2).addBox(-0.3F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0873F, 0.0F, 0.0F));
        PartDefinition tail05b = tail05a.addOrReplaceChild("tail05b", CubeListBuilder.create().texOffs(56, 2).addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition lLeg01 = stomach.addOrReplaceChild("lLeg01", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(-0.3F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -0.2F, 5.1F, -0.3142F, 0.0F, 0.0349F));
        PartDefinition lLeg02 = lLeg01.addOrReplaceChild("lLeg02", CubeListBuilder.create().texOffs(36, 39).mirror().addBox(-0.2F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.7F, -1.0F, -0.4538F, 0.0F, -0.0349F));
        PartDefinition lLeg03 = lLeg02.addOrReplaceChild("lLeg03", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-1.0F, -0.2F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.5F, 3.0F, 0.6283F, 0.0F, 0.0F));
        PartDefinition lHindPaw = lLeg03.addOrReplaceChild("lHindPaw", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-0.99F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.1396F, 0.0F, 0.0F));
        PartDefinition rLeg01 = stomach.addOrReplaceChild("rLeg01", CubeListBuilder.create().texOffs(37, 28).addBox(-2.7F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.2F, 5.1F, -0.3142F, 0.0F, -0.0349F));
        PartDefinition rLeg02 = rLeg01.addOrReplaceChild("rLeg02", CubeListBuilder.create().texOffs(36, 39).addBox(-1.8F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.7F, -1.0F, -0.4538F, 0.0F, 0.0349F));
        PartDefinition rLeg03 = rLeg02.addOrReplaceChild("rLeg03", CubeListBuilder.create().texOffs(38, 47).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.5F, 3.0F, 0.6283F, 0.0F, 0.0F));
        PartDefinition rHindPaw = rLeg03.addOrReplaceChild("rHindPaw", CubeListBuilder.create().texOffs(22, 46).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.1396F, 0.0F, 0.0F));
        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, -0.3491F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, -3.0F, -4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.8F, 0.3491F, 0.0F, 0.0F));
        PartDefinition lEar01 = head.addOrReplaceChild("lEar01", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -2.5F, -1.4F, 0.0F, -0.6109F, 0.3491F));
        PartDefinition lEar02 = lEar01.addOrReplaceChild("lEar02", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.7F, 0.2793F, 0.0F, 0.0F));
        PartDefinition lEar03 = lEar01.addOrReplaceChild("lEar03", CubeListBuilder.create().texOffs(8, 36).mirror().addBox(-1.0F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.7854F));
        PartDefinition rEar01 = head.addOrReplaceChild("rEar01", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -2.5F, -1.4F, 0.0F, 0.6109F, -0.3491F));
        PartDefinition rEar02 = rEar01.addOrReplaceChild("rEar02", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.7F, 0.2793F, 0.0F, 0.0F));
        PartDefinition rEar03 = rEar01.addOrReplaceChild("rEar03", CubeListBuilder.create().texOffs(8, 36).addBox(0.0F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, 0.0F, 0.0F, -0.7854F));
        PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -2.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.2F, 0.2094F, 0.0F, 0.0F));
        PartDefinition mouthL = head.addOrReplaceChild("mouthL", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(0.2F, -0.6F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1F, -3.15F, 0.0F, 0.1396F, -0.0873F));
        PartDefinition mouthR = head.addOrReplaceChild("mouthR", CubeListBuilder.create().texOffs(0, 55).addBox(-2.2F, -0.6F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1F, -3.15F, 0.0F, -0.1396F, 0.0873F));
        PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.2F));
        PartDefinition mane01 = neck.addOrReplaceChild("mane01", CubeListBuilder.create().texOffs(29, 11).addBox(-1.5F, -0.5F, -0.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -2.1F, 0.5236F, 0.0F, 0.0F));
        PartDefinition mane02 = neck.addOrReplaceChild("mane02", CubeListBuilder.create().texOffs(39, 11).addBox(-2.0F, -0.5F, -0.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1F, -1.0F, 0.6109F, 0.0F, 0.0F));
        PartDefinition lArm01 = chest.addOrReplaceChild("lArm01", CubeListBuilder.create().texOffs(24, 29).mirror().addBox(-1.7F, -1.5F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.4F, -3.7F, 0.1222F, 0.0F, 0.0F));
        PartDefinition lArm02 = lArm01.addOrReplaceChild("lArm02", CubeListBuilder.create().texOffs(25, 39).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2F, 0.0F, -0.1222F, 0.0F, 0.0F));
        PartDefinition lForePaw = lArm02.addOrReplaceChild("lForePaw", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 3.9F, 0.0F));
        PartDefinition rArm01 = chest.addOrReplaceChild("rArm01", CubeListBuilder.create().texOffs(24, 29).addBox(-1.3F, -1.5F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.4F, -3.7F, 0.1222F, 0.0F, 0.0F));
        PartDefinition rArm02 = rArm01.addOrReplaceChild("rArm02", CubeListBuilder.create().texOffs(25, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, 0.0F, -0.1222F, 0.0F, 0.0F));
        PartDefinition rForePaw = rArm02.addOrReplaceChild("rForePaw", CubeListBuilder.create().texOffs(22, 46).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.9F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
        this.setRotateAngle(tail02, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.setRotateAngle(rArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, -0.03490658503988659F);
        this.setRotateAngle(tail05a, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
        this.setRotateAngle(tail04a, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.setRotateAngle(tail01, -0.593411945678072F, 0.0F, 0.0F);
        this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.setRotateAngle(rHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
        this.setRotateAngle(rLeg01, -0.3141592653589793F, 0.0F, 0.03490658503988659F);
        this.setRotateAngle(tail03, 0.08726646259971647F, 0.0F, 0.0F);
        this.setRotateAngle(lArm01, 0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lLeg02, -0.45378560551852565F, 0.0F, 0.03490658503988659F);
        this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
        this.setRotateAngle(lHindPaw, 0.13962634015954636F, 0.0F, 0.0F);
        this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
        this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
        this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
        this.setRotateAngle(rLeg02, -0.45378560551852565F, 0.0F, -0.03490658503988659F);
        this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
        this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
        this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
        this.setRotateAngle(rLeg03, 0.6283185307179586F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0F, 0F, 0F);
        this.setRotateAngle(stomach, 0F, 0F, 0F);
        this.headPitch(head, headPitch);
        this.headYaw(head, netHeadYaw);
        this.tail01.xRot = 0.47123894F * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
        this.quadriped(lLeg01, lArm01, rLeg01, rArm01, limbSwing * 0.6662F, limbSwingAmount);
        if(entity instanceof Ocelot ocelot) {
            if(ocelot.isShiftKeyDown()) {
                this.lArm01.y = -0.4F - 1F;
                this.rArm01.y = -0.4F - 1F;
                this.lLeg01.y = -0.2F - 1F;
                this.rLeg01.y = -0.2F - 1F;
                this.chest.y = 14.4F + 1F;
            } else {
                this.lArm01.y = -0.4F;
                this.rArm01.y = -0.4F;
                this.lLeg01.y = -0.2F;
                this.rLeg01.y = -0.2F;
                this.chest.y = 14.4F;
                if(ocelot.isSprinting()) {
                    this.lLeg01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.xRot = Mth.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.xRot = ((float) Math.PI / 10F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else {
                    this.tail01.xRot = ((float) Math.PI / 4F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
        if(entity instanceof Cat cat) {
            if(cat.isShiftKeyDown()) {
                this.lArm01.y = -0.4F - 1F;
                this.rArm01.y = -0.4F - 1F;
                this.lLeg01.y = -0.2F - 1F;
                this.rLeg01.y = -0.2F - 1F;
                this.chest.y = 14.4F + 1F;
            } else {
                this.lArm01.y = -0.4F;
                this.rArm01.y = -0.4F;
                this.lLeg01.y = -0.2F;
                this.rLeg01.y = -0.2F;
                this.chest.y = 14.4F;
                if(cat.isSprinting()) {
                    this.lLeg01.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount - 0.3141592653589793F;
                    this.rLeg01.xRot = Mth.cos(limbSwing * 0.6662F + 0.3F) * limbSwingAmount - 0.3141592653589793F;
                    this.lArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI + 0.3F) * limbSwingAmount + 0.12217304763960307F;
                    this.rArm01.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount + 0.12217304763960307F;
                    this.tail01.xRot = ((float) Math.PI / 10F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                } else if(cat.isLying()) { // laying down
                    this.setRotateAngle(head, 0.7853981633974483F, 0.0F, 0.0F);
                    this.setRotateAngle(lArm01, -0.9599310885968813F, -0.20943951023931953F, 0.0F);
                    this.setRotateAngle(lArm02, -0.6457718232379019F, 0.0F, 0.0F);
                    this.setRotateAngle(lForePaw, 1.6231562043547265F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg01, -0.3141592653589793F, 0.0F, 0.6981317007977318F);
                    this.setRotateAngle(lLeg03, 0.6283185307179586F, 0.0F, -0.5235987755982988F);
                    this.setRotateAngle(neck, -0.7853981633974483F, 0.0F, 0.0F);
                    this.setRotateAngle(rArm01, -0.9599310885968813F, 0.20943951023931953F, 0.0F);
                    this.setRotateAngle(rArm02, -0.6457718232379019F, 0.0F, 0.0F);
                    this.setRotateAngle(rForePaw, 1.5707963267948966F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg01, -0.6981317007977318F, 0.0F, 0.03490658503988659F);
                    this.setRotateAngle(stomach, 0.0F, 0.0F, -1.5707963267948966F);
                    this.setRotateAngle(tail01, -0.593411945678072F, -0.4886921905584123F, 0.0F);
                    this.setRotateAngle(tail02, -0.08726646259971647F, 0.0F, 0.0F);
                    this.setRotateAngle(tail03, -0.17453292519943295F, 0.22689280275926282F, 0.0F);
                    this.setRotateAngle(tail04a, -0.3490658503988659F, 0.12217304763960307F, 0.3141592653589793F);
                    this.setRotateAngle(tail05a, -0.3490658503988659F, 0.0F, 0.0F);
                } else if(cat.isInSittingPose()) {
                    this.setRotateAngle(tail02, 0.0F, 0.6981317007977318F, 0.0F);
                    this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
                    this.setRotateAngle(lEar01, 0.0F, -0.6108652381980153F, 0.3490658503988659F);
                    this.setRotateAngle(tail05a, 0.0F, 0.2617993877991494F, 0.0F);
                    this.setRotateAngle(rLeg03, -0.03490658503988659F, 0.0F, 0.0F);
                    this.setRotateAngle(rHindPaw, 1.3613568165555772F, 0.0F, 0.0F);
                    this.setRotateAngle(rEar03, 0.0F, 0.0F, 0.7853981633974483F);
                    this.setRotateAngle(mouthL, 0.0F, 0.13962634015954636F, 0.08726646259971647F);
                    this.setRotateAngle(rForePaw, 0.06981317007977318F, 0.0F, 0.0F);
                    this.setRotateAngle(mane02, 0.6108652381980153F, 0.0F, 0.0F);
                    this.setRotateAngle(rArm02, -0.12217304763960307F, 0.0F, 0.0F);
                    this.setRotateAngle(head, 0.41887902047863906F, 0.0F, 0.0F);
                    this.setRotateAngle(lForePaw, 0.06981317007977318F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg01, -0.5759586531581287F, 0.0F, 0.22689280275926282F);
                    this.setRotateAngle(tail01, 1.0821041362364843F, 0.6981317007977318F, 0.7853981633974483F);
                    this.setRotateAngle(rEar02, 0.2792526803190927F, 0.0F, 0.0F);
                    this.setRotateAngle(neck, 0.17453292519943295F, 0.0F, 0.0F);
                    this.setRotateAngle(lArm01, 0.6283185307179586F, 0.0F, 0.0F);
                    this.setRotateAngle(lEar03, 0.0F, 0.0F, 0.7853981633974483F);
                    this.setRotateAngle(lEar02, 0.2792526803190927F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg02, 0.22689280275926282F, 0.0F, 0.03490658503988659F);
                    this.setRotateAngle(chest, -0.5759586531581287F, 0.0F, 0.0F);
                    this.setRotateAngle(rLeg02, 0.22689280275926282F, 0.0F, -0.03490658503988659F);
                    this.setRotateAngle(lLeg01, -0.5759586531581287F, 0.0F, -0.22689280275926282F);
                    this.setRotateAngle(tail04a, -0.045553093477052F, 0.5235987755982988F, 0.0F);
                    this.setRotateAngle(rArm01, 0.6283185307179586F, 0.0F, 0.0F);
                    this.setRotateAngle(lHindPaw, 1.3613568165555772F, 0.0F, 0.0F);
                    this.setRotateAngle(lLeg03, -0.03490658503988659F, 0.0F, 0.0F);
                    this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
                    this.setRotateAngle(mouthR, 0.0F, -0.2792526803190927F, -0.17453292519943295F);
                    this.setRotateAngle(lArm02, -0.12217304763960307F, 0.0F, 0.0F);
                    this.setRotateAngle(stomach, -0.4886921905584123F, 0.0F, 0.0F);
                    this.setRotateAngle(tail03, -0.3490658503988659F, 0.6806784082777886F, 0.0F);
                    this.setRotateAngle(rEar01, 0.0F, 0.6108652381980153F, -0.3490658503988659F);
                } else {
                    this.tail01.xRot = ((float) Math.PI / 4F) * Mth.cos(limbSwing) * limbSwingAmount - 0.593411945678072F;
                }
            }
        }
    }

}
