package dev.itsmeow.betteranimalmodels.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.ModelUtils;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Bee;

public class ModelNewBee<T extends Bee> extends Model<T> {

    public ModelPart thorax;
    public ModelPart thoraxBack;
    public ModelPart abdomen;
    public ModelPart sting;
    public ModelPart head;
    public ModelPart lMandible;
    public ModelPart rMandible;
    public ModelPart lAntenna00;
    public ModelPart lAntenna01;
    public ModelPart rAntenna00;
    public ModelPart rAntenna01;
    public ModelPart lLeg00a;
    public ModelPart lLeg00b;
    public ModelPart lLeg00c;
    public ModelPart lLeg00d;
    public ModelPart rLeg00a;
    public ModelPart rLeg00b;
    public ModelPart rLeg00c;
    public ModelPart rLeg00d;
    public ModelPart lLeg01a;
    public ModelPart lLeg01b;
    public ModelPart lLeg01c;
    public ModelPart lLeg01d;
    public ModelPart rLeg01a;
    public ModelPart rLeg01b;
    public ModelPart rLeg01c;
    public ModelPart rLeg01d;
    public ModelPart lLeg02a;
    public ModelPart lLeg02b;
    public ModelPart lLeg02c;
    public ModelPart lLeg02d;
    public ModelPart lPollenBasket;
    public ModelPart rLeg02a;
    public ModelPart rLeg02b;
    public ModelPart rLeg02c;
    public ModelPart rLeg02d;
    public ModelPart rPollenBasket;
    public ModelPart lWing;
    public ModelPart rWing;
    private float bodyPitch;

    public ModelNewBee(ModelPart root) {
        this.thorax = root.getChild("thorax");
        this.thoraxBack = thorax.getChild("thoraxBack");
        this.abdomen = thoraxBack.getChild("abdomen");
        this.sting = abdomen.getChild("sting");
        this.head = thorax.getChild("head");
        this.lMandible = head.getChild("lMandible");
        this.rMandible = head.getChild("rMandible");
        this.lAntenna00 = head.getChild("lAntenna00");
        this.lAntenna01 = lAntenna00.getChild("lAntenna01");
        this.rAntenna00 = head.getChild("rAntenna00");
        this.rAntenna01 = rAntenna00.getChild("rAntenna01");
        this.lLeg00a = thorax.getChild("lLeg00a");
        this.lLeg00b = lLeg00a.getChild("lLeg00b");
        this.lLeg00c = lLeg00b.getChild("lLeg00c");
        this.lLeg00d = lLeg00c.getChild("lLeg00d");
        this.rLeg00a = thorax.getChild("rLeg00a");
        this.rLeg00b = rLeg00a.getChild("rLeg00b");
        this.rLeg00c = rLeg00b.getChild("rLeg00c");
        this.rLeg00d = rLeg00c.getChild("rLeg00d");
        this.lLeg01a = thorax.getChild("lLeg01a");
        this.lLeg01b = lLeg01a.getChild("lLeg01b");
        this.lLeg01c = lLeg01b.getChild("lLeg01c");
        this.lLeg01d = lLeg01c.getChild("lLeg01d");
        this.rLeg01a = thorax.getChild("rLeg01a");
        this.rLeg01b = rLeg01a.getChild("rLeg01b");
        this.rLeg01c = rLeg01b.getChild("rLeg01c");
        this.rLeg01d = rLeg01c.getChild("rLeg01d");
        this.lLeg02a = thorax.getChild("lLeg02a");
        this.lLeg02b = lLeg02a.getChild("lLeg02b");
        this.lLeg02c = lLeg02b.getChild("lLeg02c");
        this.lLeg02d = lLeg02c.getChild("lLeg02d");
        this.lPollenBasket = lLeg02c.getChild("lPollenBasket");
        this.rLeg02a = thorax.getChild("rLeg02a");
        this.rLeg02b = rLeg02a.getChild("rLeg02b");
        this.rLeg02c = rLeg02b.getChild("rLeg02c");
        this.rLeg02d = rLeg02c.getChild("rLeg02d");
        this.rPollenBasket = rLeg02c.getChild("rPollenBasket");
        this.lWing = thorax.getChild("lWing");
        this.rWing = thorax.getChild("rWing");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition thorax = partdefinition.addOrReplaceChild("thorax", CubeListBuilder.create().texOffs(2, 11).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, -3.6F));
        PartDefinition thoraxBack = thorax.addOrReplaceChild("thoraxBack", CubeListBuilder.create().texOffs(29, 0).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 2.1F));
        PartDefinition abdomen = thoraxBack.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 26).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, -0.0873F, 0.0F, 0.0F));
        PartDefinition sting = abdomen.addOrReplaceChild("sting", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 9.7F, -0.2793F, 0.0F, 0.0F));
        PartDefinition head = thorax.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.9F, -0.5236F, 0.0F, 0.0F));
        PartDefinition lMandible = head.addOrReplaceChild("lMandible", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 4.6F, -1.0F, 0.0F, 0.0F, 0.2618F));
        PartDefinition rMandible = head.addOrReplaceChild("rMandible", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.6F, -1.0F, 0.0F, 0.0F, -0.2618F));
        PartDefinition lAntenna00 = head.addOrReplaceChild("lAntenna00", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 2.3F, -2.6F, 0.1745F, -0.3491F, 0.0F));
        PartDefinition lAntenna01 = lAntenna00.addOrReplaceChild("lAntenna01", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -0.5F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.3F, 0.0F, 0.0F, -0.3142F));
        PartDefinition rAntenna00 = head.addOrReplaceChild("rAntenna00", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.3F, -2.6F, 0.1745F, 0.3491F, 0.0F));
        PartDefinition rAntenna01 = rAntenna00.addOrReplaceChild("rAntenna01", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(0.0F, -0.5F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.3F, 0.0F, 0.0F, 0.3142F));
        PartDefinition lLeg00a = thorax.addOrReplaceChild("lLeg00a", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 1.0F, -1.0F, 0.0F, 0.3491F, 0.7854F));
        PartDefinition lLeg00b = lLeg00a.addOrReplaceChild("lLeg00b", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -2.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2F, 0.0F, 0.0F, 0.0F, 0.5236F));
        PartDefinition lLeg00c = lLeg00b.addOrReplaceChild("lLeg00c", CubeListBuilder.create().texOffs(6, 48).addBox(-0.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.6F, -0.1F, 0.0F, 0.0F, -1.2217F));
        PartDefinition lLeg00d = lLeg00c.addOrReplaceChild("lLeg00d", CubeListBuilder.create().texOffs(1, 53).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8F, 0.0F, 0.0F, 0.0F, 0.2793F));
        PartDefinition rLeg00a = thorax.addOrReplaceChild("rLeg00a", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.0F, -1.0F, 0.0F, -0.3491F, -0.7854F));
        PartDefinition rLeg00b = rLeg00a.addOrReplaceChild("rLeg00b", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -2.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2F, 0.0F, 0.0F, 0.0F, -0.5236F));
        PartDefinition rLeg00c = rLeg00b.addOrReplaceChild("rLeg00c", CubeListBuilder.create().texOffs(6, 48).mirror().addBox(-1.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.6F, -0.1F, 0.0F, 0.0F, 1.2217F));
        PartDefinition rLeg00d = rLeg00c.addOrReplaceChild("rLeg00d", CubeListBuilder.create().texOffs(1, 53).mirror().addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.8F, 0.0F, 0.0F, 0.0F, -0.2793F));
        PartDefinition lLeg01a = thorax.addOrReplaceChild("lLeg01a", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8F, 1.0F, 0.5F, 0.0F, 0.0F, 0.7854F));
        PartDefinition lLeg01b = lLeg01a.addOrReplaceChild("lLeg01b", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -2.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, 0.2F, 0.0F, 0.0F, 0.0F, 0.5236F));
        PartDefinition lLeg01c = lLeg01b.addOrReplaceChild("lLeg01c", CubeListBuilder.create().texOffs(6, 48).mirror().addBox(-0.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6F, -0.1F, 0.0F, 0.0F, -1.2217F));
        PartDefinition lLeg01d = lLeg01c.addOrReplaceChild("lLeg01d", CubeListBuilder.create().texOffs(1, 53).mirror().addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8F, 0.0F, 0.0F, 0.0F, 0.2793F));
        PartDefinition rLeg01a = thorax.addOrReplaceChild("rLeg01a", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 1.0F, 0.5F, 0.0F, 0.0F, -0.7854F));
        PartDefinition rLeg01b = rLeg01a.addOrReplaceChild("rLeg01b", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -2.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.2F, 0.0F, 0.0F, 0.0F, -0.5236F));
        PartDefinition rLeg01c = rLeg01b.addOrReplaceChild("rLeg01c", CubeListBuilder.create().texOffs(6, 48).addBox(-1.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.6F, -0.1F, 0.0F, 0.0F, 1.2217F));
        PartDefinition rLeg01d = rLeg01c.addOrReplaceChild("rLeg01d", CubeListBuilder.create().texOffs(1, 53).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8F, 0.0F, 0.0F, 0.0F, -0.2793F));
        PartDefinition lLeg02a = thorax.addOrReplaceChild("lLeg02a", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8F, 1.0F, 2.0F, 0.0F, -0.5236F, 0.7854F));
        PartDefinition lLeg02b = lLeg02a.addOrReplaceChild("lLeg02b", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, 0.2F, 0.0F, 0.0F, -0.576F, 0.6981F));
        PartDefinition lLeg02c = lLeg02b.addOrReplaceChild("lLeg02c", CubeListBuilder.create().texOffs(6, 48).mirror().addBox(-0.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -2.0F, -0.1F, -0.4014F, 0.0F, -1.0472F));
        PartDefinition lLeg02d = lLeg02c.addOrReplaceChild("lLeg02d", CubeListBuilder.create().texOffs(1, 53).mirror().addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8F, 0.0F, 0.0F, 0.0F, 0.2793F));
        PartDefinition lPollenBasket = lLeg02c.addOrReplaceChild("lPollenBasket", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.2F, -0.8F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 1.6F, 0.0F));
        PartDefinition rLeg02a = thorax.addOrReplaceChild("rLeg02a", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 1.0F, 2.0F, 0.0F, 0.5236F, -0.7854F));
        PartDefinition rLeg02b = rLeg02a.addOrReplaceChild("rLeg02b", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.2F, 0.0F, 0.0F, 0.576F, -0.6981F));
        PartDefinition rLeg02c = rLeg02b.addOrReplaceChild("rLeg02c", CubeListBuilder.create().texOffs(6, 48).addBox(-1.5F, -0.9F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -2.0F, -0.1F, -0.4014F, 0.0F, 1.0472F));
        PartDefinition rLeg02d = rLeg02c.addOrReplaceChild("rLeg02d", CubeListBuilder.create().texOffs(1, 53).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8F, 0.0F, 0.0F, 0.0F, -0.2793F));
        PartDefinition rPollenBasket = rLeg02c.addOrReplaceChild("rPollenBasket", CubeListBuilder.create().texOffs(21, 49).addBox(-1.8F, -0.8F, -1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.6F, 0.0F));
        PartDefinition lWing = thorax.addOrReplaceChild("lWing", CubeListBuilder.create().texOffs(16, 14).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -2.8F, 0.0F, 0.0873F, 0.1222F, -0.1222F));
        PartDefinition rWing = thorax.addOrReplaceChild("rWing", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -2.8F, 0.0F, 0.0873F, -0.1222F, 0.1222F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.scale(0.8F, 0.8F, 0.8F);
        this.thorax.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.rWing.xRot = 0.08726646259971647F;
        this.lWing.xRot = 0.08726646259971647F;
        this.thorax.xRot = 0.0F;
        this.thorax.y = 12.0F;
        boolean landed = entityIn.isOnGround() && entityIn.getDeltaMovement().lengthSqr() < 1.0E-7D;
        if(landed) {
            // not move
            this.rWing.xRot = 0.08726646259971647F;
            this.lWing.xRot = 0.08726646259971647F;
            this.rWing.yRot = -0.12217304763960307F;
            this.lWing.yRot = 0.12217304763960307F;
        } else {
            // move
            this.rWing.yRot = -0.12217304763960307F - rad(15F);
            this.lWing.yRot = 0.12217304763960307F + rad(15F);
            this.rWing.xRot = Mth.cos(ageInTicks * 2.1F) * (float) Math.PI * 0.15F + 0.08726646259971647F;
            this.lWing.xRot = Mth.cos(ageInTicks * 2.1F) * (float) Math.PI * 0.15F + 0.08726646259971647F;
            this.thorax.xRot = 0.0F;
            this.thorax.yRot = 0.0F;
            this.thorax.zRot = 0.0F;
        }

        if(!entityIn.isAngry()) {
            // angy bee
            this.thorax.xRot = 0.0F;
            this.thorax.yRot = 0.0F;
            this.thorax.zRot = 0.0F;
            if(!landed) {
                // not moving angy bee
                float f1 = Mth.cos(ageInTicks * 0.18F);
                this.thorax.xRot = 0.1F + f1 * (float) Math.PI * 0.025F;
                this.thorax.y = 19.0F - Mth.cos(ageInTicks * 0.18F) * 0.9F;
            }
        }

        if(this.bodyPitch > 0.0F) {
            this.thorax.xRot = ModelUtils.rotlerpRad(this.thorax.xRot, 3.0915928F, this.bodyPitch);
        }
    }

    @Override
    public void prepareMobModel(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        this.bodyPitch = entityIn.getRollAmount(partialTick);
        this.sting.visible = !entityIn.hasStung();
    }

}
