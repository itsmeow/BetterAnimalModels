package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

public class ModelNewSquid<T extends LivingEntity> extends Model<T> {

    public ModelPart head;
    public ModelPart mantle01;
    public ModelPart mantle02;
    public ModelPart mantle03;
    public ModelPart mantle04;
    public ModelPart rFin;
    public ModelPart lFin;
    public ModelPart siphon;
    public ModelPart lEye;
    public ModelPart rEye;
    public ModelPart tentacle01a;
    public ModelPart tentacle01b;
    public ModelPart tentacle01c;
    public ModelPart tentacle02a;
    public ModelPart tentacle02b;
    public ModelPart tentacle02c;
    public ModelPart tentacle03a;
    public ModelPart tentacle03b;
    public ModelPart tentacle03c;
    public ModelPart tentacle04a;
    public ModelPart tentacle04b;
    public ModelPart tentacle04c;
    public ModelPart beak01;
    public ModelPart beak02;
    public ModelPart tentacle05a;
    public ModelPart tentacle05b;
    public ModelPart tentacle05c;
    public ModelPart tentacle06a;
    public ModelPart tentacle06b;
    public ModelPart tentacle06c;
    public ModelPart tentacle07a;
    public ModelPart tentacle07b;
    public ModelPart tentacle07c;
    public ModelPart tentacle08a;
    public ModelPart tentacle08b;
    public ModelPart tentacle08c;
    public ModelPart longTentacle01a;
    public ModelPart longTentacle01b;
    public ModelPart longTentacle01c;
    public ModelPart longTentacle01d;
    public ModelPart longTentacle02a;
    public ModelPart longTentacle02b;
    public ModelPart longTentacle02c;
    public ModelPart longTentacle02d;

    public ModelPart[] squidTentacles;

    public ModelNewSquid(ModelPart root) {
        this.head = root.getChild("head");
        this.mantle01 = head.getChild("mantle01");
        this.mantle02 = mantle01.getChild("mantle02");
        this.mantle03 = mantle02.getChild("mantle03");
        this.mantle04 = mantle03.getChild("mantle04");
        this.rFin = mantle03.getChild("rFin");
        this.lFin = mantle03.getChild("lFin");
        this.siphon = mantle01.getChild("siphon");
        this.lEye = head.getChild("lEye");
        this.rEye = head.getChild("rEye");
        this.tentacle01a = head.getChild("tentacle01a");
        this.tentacle01b = tentacle01a.getChild("tentacle01b");
        this.tentacle01c = tentacle01b.getChild("tentacle01c");
        this.tentacle02a = head.getChild("tentacle02a");
        this.tentacle02b = tentacle02a.getChild("tentacle02b");
        this.tentacle02c = tentacle02b.getChild("tentacle02c");
        this.tentacle03a = head.getChild("tentacle03a");
        this.tentacle03b = tentacle03a.getChild("tentacle03b");
        this.tentacle03c = tentacle03b.getChild("tentacle03c");
        this.tentacle04a = head.getChild("tentacle04a");
        this.tentacle04b = tentacle04a.getChild("tentacle04b");
        this.tentacle04c = tentacle04b.getChild("tentacle04c");
        this.beak01 = head.getChild("beak01");
        this.beak02 = head.getChild("beak02");
        this.tentacle05a = head.getChild("tentacle05a");
        this.tentacle05b = tentacle05a.getChild("tentacle05b");
        this.tentacle05c = tentacle05b.getChild("tentacle05c");
        this.tentacle06a = head.getChild("tentacle06a");
        this.tentacle06b = tentacle06a.getChild("tentacle06b");
        this.tentacle06c = tentacle06b.getChild("tentacle06c");
        this.tentacle07a = head.getChild("tentacle07a");
        this.tentacle07b = tentacle07a.getChild("tentacle07b");
        this.tentacle07c = tentacle07b.getChild("tentacle07c");
        this.tentacle08a = head.getChild("tentacle08a");
        this.tentacle08b = tentacle08a.getChild("tentacle08b");
        this.tentacle08c = tentacle08b.getChild("tentacle08c");
        this.longTentacle01a = head.getChild("longTentacle01a");
        this.longTentacle01b = longTentacle01a.getChild("longTentacle01b");
        this.longTentacle01c = longTentacle01b.getChild("longTentacle01c");
        this.longTentacle01d = longTentacle01c.getChild("longTentacle01d");
        this.longTentacle02a = head.getChild("longTentacle02a");
        this.longTentacle02b = longTentacle02a.getChild("longTentacle02b");
        this.longTentacle02c = longTentacle02b.getChild("longTentacle02c");
        this.longTentacle02d = longTentacle02c.getChild("longTentacle02d");
        this.squidTentacles = new ModelPart[] { this.tentacle01a, this.tentacle02a, this.tentacle03a, this.tentacle04a, this.tentacle05a, this.tentacle06a, this.tentacle07a, this.tentacle08a };
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));
        PartDefinition mantle01 = head.addOrReplaceChild("mantle01", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -8.0F, -3.5F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.4F, 0.0F));
        PartDefinition mantle02 = mantle01.addOrReplaceChild("mantle02", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.9F, 0.0F));
        PartDefinition mantle03 = mantle02.addOrReplaceChild("mantle03", CubeListBuilder.create().texOffs(0, 31).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
        PartDefinition mantle04 = mantle03.addOrReplaceChild("mantle04", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.9F, 0.0F));
        PartDefinition rFin = mantle03.addOrReplaceChild("rFin", CubeListBuilder.create().texOffs(31, 16).mirror().addBox(-9.0F, -6.0F, 0.0F, 9.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.8F, 0.0F));
        PartDefinition lFin = mantle03.addOrReplaceChild("lFin", CubeListBuilder.create().texOffs(31, 16).addBox(0.0F, -6.0F, 0.0F, 9.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.8F, 0.0F));
        PartDefinition siphon = mantle01.addOrReplaceChild("siphon", CubeListBuilder.create().texOffs(54, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.4F, 0.3643F, 0.0F, 0.0F));
        PartDefinition lEye = head.addOrReplaceChild("lEye", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.7F, 0.1F, 0.0F));
        PartDefinition rEye = head.addOrReplaceChild("rEye", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.7F, 0.0F, 0.0F));
        PartDefinition tentacle01a = head.addOrReplaceChild("tentacle01a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.8F, -2.0F));
        PartDefinition tentacle01b = tentacle01a.addOrReplaceChild("tentacle01b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle01c = tentacle01b.addOrReplaceChild("tentacle01c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle02a = head.addOrReplaceChild("tentacle02a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.8F, 0.0F, 0.0F, 1.5708F, 0.0F));
        PartDefinition tentacle02b = tentacle02a.addOrReplaceChild("tentacle02b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle02c = tentacle02b.addOrReplaceChild("tentacle02c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle03a = head.addOrReplaceChild("tentacle03a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.8F, 0.0F, 0.0F, -1.5708F, 0.0F));
        PartDefinition tentacle03b = tentacle03a.addOrReplaceChild("tentacle03b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle03c = tentacle03b.addOrReplaceChild("tentacle03c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle04a = head.addOrReplaceChild("tentacle04a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8F, 2.0F, 0.0F, -3.1416F, 0.0F));
        PartDefinition tentacle04b = tentacle04a.addOrReplaceChild("tentacle04b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle04c = tentacle04b.addOrReplaceChild("tentacle04c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition beak01 = head.addOrReplaceChild("beak01", CubeListBuilder.create().texOffs(14, 43).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -1.2F, -0.6374F, 0.0F, 0.0F));
        PartDefinition beak02 = head.addOrReplaceChild("beak02", CubeListBuilder.create().texOffs(14, 49).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.3F, 0.5009F, 0.0F, 0.0F));
        PartDefinition tentacle05a = head.addOrReplaceChild("tentacle05a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 2.8F, -1.7F, 0.0F, 0.7854F, 0.0F));
        PartDefinition tentacle05b = tentacle05a.addOrReplaceChild("tentacle05b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle05c = tentacle05b.addOrReplaceChild("tentacle05c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle06a = head.addOrReplaceChild("tentacle06a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 2.8F, 1.7F, 0.0F, 2.3562F, 0.0F));
        PartDefinition tentacle06b = tentacle06a.addOrReplaceChild("tentacle06b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle06c = tentacle06b.addOrReplaceChild("tentacle06c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle07a = head.addOrReplaceChild("tentacle07a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.8F, -1.7F, 0.0F, -0.7854F, 0.0F));
        PartDefinition tentacle07b = tentacle07a.addOrReplaceChild("tentacle07b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle07c = tentacle07b.addOrReplaceChild("tentacle07c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle08a = head.addOrReplaceChild("tentacle08a", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.8F, 1.7F, 0.0F, -2.3562F, 0.0F));
        PartDefinition tentacle08b = tentacle08a.addOrReplaceChild("tentacle08b", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition tentacle08c = tentacle08b.addOrReplaceChild("tentacle08c", CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.9F, 0.0F));
        PartDefinition longTentacle01a = head.addOrReplaceChild("longTentacle01a", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 3.2F, 0.0F, 0.0F, 1.5708F, 0.0F));
        PartDefinition longTentacle01b = longTentacle01a.addOrReplaceChild("longTentacle01b", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.9F, 0.0F));
        PartDefinition longTentacle01c = longTentacle01b.addOrReplaceChild("longTentacle01c", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.8F, 0.0F));
        PartDefinition longTentacle01d = longTentacle01c.addOrReplaceChild("longTentacle01d", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.8F, 0.0F));
        PartDefinition longTentacle02a = head.addOrReplaceChild("longTentacle02a", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 3.2F, 0.0F, 0.0F, -1.5708F, 0.0F));
        PartDefinition longTentacle02b = longTentacle02a.addOrReplaceChild("longTentacle02b", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.9F, 0.0F));
        PartDefinition longTentacle02c = longTentacle02b.addOrReplaceChild("longTentacle02c", CubeListBuilder.create().texOffs(41, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.8F, 0.0F));
        PartDefinition longTentacle02d = longTentacle02c.addOrReplaceChild("longTentacle02d", CubeListBuilder.create().texOffs(41, 52).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.8F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
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
