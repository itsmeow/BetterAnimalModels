package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.ModelUtils;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Bee;

/**
 * bee - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelNewBee<T extends Bee> extends Model<T> {
    public ModelPart thorax;
    public ModelPart thoraxBack;
    public ModelPart head;
    public ModelPart lLeg00a;
    public ModelPart lLeg01a;
    public ModelPart lLeg02a;
    public ModelPart rLeg00a;
    public ModelPart rLeg01a;
    public ModelPart rLeg02a;
    public ModelPart lWing;
    public ModelPart rWing;
    public ModelPart abdomen;
    public ModelPart sting;
    public ModelPart lMandible;
    public ModelPart rMandible;
    public ModelPart lAntenna00;
    public ModelPart rAntenna00;
    public ModelPart lAntenna01;
    public ModelPart rAntenna01;
    public ModelPart lLeg00b;
    public ModelPart lLeg00c;
    public ModelPart lLeg00d;
    public ModelPart lLeg01b;
    public ModelPart lLeg01c;
    public ModelPart lLeg01d;
    public ModelPart lLeg02b;
    public ModelPart lLeg02c;
    public ModelPart lLeg02d;
    public ModelPart lPollenBasket;
    public ModelPart rLeg00b;
    public ModelPart rLeg00c;
    public ModelPart rLeg00d;
    public ModelPart rLeg01b;
    public ModelPart rLeg01c;
    public ModelPart rLeg01d;
    public ModelPart rLeg02b;
    public ModelPart rLeg02c;
    public ModelPart rLeg02d;
    public ModelPart rPollenBasket;
    private float bodyPitch;

    public ModelNewBee() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.rLeg00a = new ModelPart(this, 0, 44);
        this.rLeg00a.mirror = true;
        this.rLeg00a.setPos(-2.8F, 1.0F, -1.0F);
        this.rLeg00a.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rLeg00a, 0.0F, -0.3490658503988659F, -0.7853981633974483F);
        this.rLeg00d = new ModelPart(this, 1, 53);
        this.rLeg00d.mirror = true;
        this.rLeg00d.setPos(-0.5F, 4.8F, 0.0F);
        this.rLeg00d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg00d, 0.0F, 0.0F, -0.2792526803190927F);
        this.lLeg02b = new ModelPart(this, 0, 48);
        this.lLeg02b.setPos(1.6F, 0.2F, 0.0F);
        this.lLeg02b.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lLeg02b, 0.0F, -0.5759586531581287F, 0.6981317007977318F);
        this.lLeg02c = new ModelPart(this, 6, 48);
        this.lLeg02c.setPos(0.6F, -2.0F, -0.1F);
        this.lLeg02c.addBox(-0.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(lLeg02c, -0.40142572795869574F, 0.0F, -1.0471975511965976F);
        this.lAntenna01 = new ModelPart(this, 53, 0);
        this.lAntenna01.setPos(0.0F, 0.0F, -2.3F);
        this.lAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(lAntenna01, 0.0F, 0.0F, -0.3141592653589793F);
        this.lLeg02d = new ModelPart(this, 1, 53);
        this.lLeg02d.setPos(0.5F, 4.8F, 0.0F);
        this.lLeg02d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg02d, 0.0F, 0.0F, 0.2792526803190927F);
        this.lWing = new ModelPart(this, 16, 14);
        this.lWing.setPos(1.9F, -2.8F, 0.0F);
        this.lWing.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(lWing, 0.08726646259971647F, 0.12217304763960307F, 0.12217304763960307F);
        this.lLeg00c = new ModelPart(this, 6, 48);
        this.lLeg00c.setPos(-0.1F, -1.6F, -0.1F);
        this.lLeg00c.addBox(-0.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(lLeg00c, 0.0F, 0.0F, -1.2217304763960306F);
        this.lLeg00d = new ModelPart(this, 1, 53);
        this.lLeg00d.setPos(0.5F, 4.8F, 0.0F);
        this.lLeg00d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg00d, 0.0F, 0.0F, 0.2792526803190927F);
        this.rLeg00c = new ModelPart(this, 6, 48);
        this.rLeg00c.mirror = true;
        this.rLeg00c.setPos(-0.1F, -1.6F, -0.1F);
        this.rLeg00c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg00c, 0.0F, 0.0F, 1.2217304763960306F);
        this.rLeg01a = new ModelPart(this, 0, 44);
        this.rLeg01a.mirror = true;
        this.rLeg01a.setPos(-2.8F, 1.0F, 0.5F);
        this.rLeg01a.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rLeg01a, 0.0F, 0.0F, -0.7853981633974483F);
        this.lMandible = new ModelPart(this, 0, 11);
        this.lMandible.setPos(0.9F, 4.6F, -1.0F);
        this.lMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lMandible, 0.0F, 0.0F, 0.2617993877991494F);
        this.rLeg01b = new ModelPart(this, 0, 48);
        this.rLeg01b.mirror = true;
        this.rLeg01b.setPos(-1.6F, 0.2F, 0.0F);
        this.rLeg01b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg01b, 0.0F, 0.0F, -0.5235987755982988F);
        this.abdomen = new ModelPart(this, 0, 26);
        this.abdomen.setPos(0.0F, 0.0F, 0.7F);
        this.abdomen.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 10, 0.0F);
        this.setRotateAngle(abdomen, -0.08726646259971647F, 0.0F, 0.0F);
        this.rLeg02b = new ModelPart(this, 0, 48);
        this.rLeg02b.mirror = true;
        this.rLeg02b.setPos(-1.6F, 0.2F, 0.0F);
        this.rLeg02b.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rLeg02b, 0.0F, 0.5759586531581287F, -0.6981317007977318F);
        this.rPollenBasket = new ModelPart(this, 21, 49);
        this.rPollenBasket.mirror = true;
        this.rPollenBasket.setPos(0.0F, 1.6F, 0.0F);
        this.rPollenBasket.addBox(-1.8F, -0.8F, -1.2F, 2, 4, 2, 0.0F);
        this.sting = new ModelPart(this, 19, 0);
        this.sting.setPos(0.0F, 0.4F, 9.7F);
        this.sting.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(sting, -0.2792526803190927F, 0.0F, 0.0F);
        this.lLeg00b = new ModelPart(this, 0, 48);
        this.lLeg00b.setPos(0.7F, 0.2F, 0.0F);
        this.lLeg00b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg00b, 0.0F, 0.0F, 0.5235987755982988F);
        this.rLeg01c = new ModelPart(this, 6, 48);
        this.rLeg01c.mirror = true;
        this.rLeg01c.setPos(0.1F, -1.6F, -0.1F);
        this.rLeg01c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg01c, 0.0F, 0.0F, 1.2217304763960306F);
        this.rLeg02d = new ModelPart(this, 1, 53);
        this.rLeg02d.mirror = true;
        this.rLeg02d.setPos(-0.5F, 4.8F, 0.0F);
        this.rLeg02d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg02d, 0.0F, 0.0F, -0.2792526803190927F);
        this.rAntenna00 = new ModelPart(this, 44, 0);
        this.rAntenna00.mirror = true;
        this.rAntenna00.setPos(-0.7F, 2.3F, -2.6F);
        this.rAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
        this.rMandible = new ModelPart(this, 0, 11);
        this.rMandible.mirror = true;
        this.rMandible.setPos(-0.9F, 4.6F, -1.0F);
        this.rMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rMandible, 0.0F, 0.0F, -0.2617993877991494F);
        this.lLeg01b = new ModelPart(this, 0, 48);
        this.lLeg01b.setPos(1.6F, 0.2F, 0.0F);
        this.lLeg01b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg01b, 0.0F, 0.0F, 0.5235987755982988F);
        this.lAntenna00 = new ModelPart(this, 44, 0);
        this.lAntenna00.setPos(0.7F, 2.3F, -2.6F);
        this.lAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
        this.rLeg00b = new ModelPart(this, 0, 48);
        this.rLeg00b.mirror = true;
        this.rLeg00b.setPos(-0.8F, 0.2F, 0.0F);
        this.rLeg00b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg00b, 0.0F, 0.0F, -0.5235987755982988F);
        this.rLeg02a = new ModelPart(this, 0, 44);
        this.rLeg02a.mirror = true;
        this.rLeg02a.setPos(-2.8F, 1.0F, 2.0F);
        this.rLeg02a.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rLeg02a, 0.0F, 0.5235987755982988F, -0.7853981633974483F);
        this.head = new ModelPart(this, 0, 0);
        this.head.setPos(0.0F, -1.1F, -2.9F);
        this.head.addBox(-2.5F, -1.0F, -3.0F, 5, 6, 4, 0.0F);
        this.setRotateAngle(head, -0.5235987755982988F, 0.0F, 0.0F);
        this.lLeg02a = new ModelPart(this, 0, 44);
        this.lLeg02a.setPos(2.8F, 1.0F, 2.0F);
        this.lLeg02a.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lLeg02a, 0.0F, -0.5235987755982988F, 0.7853981633974483F);
        this.thorax = new ModelPart(this, 2, 11);
        this.thorax.setPos(0.0F, 12.0F, -3.6F);
        this.thorax.addBox(-3.0F, -3.0F, -3.5F, 6, 6, 6, 0.0F);
        this.lLeg00a = new ModelPart(this, 0, 44);
        this.lLeg00a.setPos(2.8F, 1.0F, -1.0F);
        this.lLeg00a.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lLeg00a, 0.0F, 0.3490658503988659F, 0.7853981633974483F);
        this.rLeg02c = new ModelPart(this, 6, 48);
        this.rLeg02c.mirror = true;
        this.rLeg02c.setPos(-0.6F, -2.0F, -0.1F);
        this.rLeg02c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg02c, -0.40142572795869574F, 0.0F, 1.0471975511965976F);
        this.thoraxBack = new ModelPart(this, 29, 0);
        this.thoraxBack.setPos(0.0F, 0.4F, 2.1F);
        this.thoraxBack.addBox(-2.5F, -1.5F, 0.0F, 5, 4, 1, 0.0F);
        this.lPollenBasket = new ModelPart(this, 21, 49);
        this.lPollenBasket.setPos(0.0F, 1.6F, 0.0F);
        this.lPollenBasket.addBox(-0.2F, -0.8F, -1.2F, 2, 4, 2, 0.0F);
        this.rLeg01d = new ModelPart(this, 1, 53);
        this.rLeg01d.mirror = true;
        this.rLeg01d.setPos(-0.5F, 4.8F, 0.0F);
        this.rLeg01d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg01d, 0.0F, 0.0F, -0.2792526803190927F);
        this.lLeg01a = new ModelPart(this, 0, 44);
        this.lLeg01a.setPos(2.8F, 1.0F, 0.5F);
        this.lLeg01a.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lLeg01a, 0.0F, 0.0F, 0.7853981633974483F);
        this.rAntenna01 = new ModelPart(this, 53, 0);
        this.rAntenna01.mirror = true;
        this.rAntenna01.setPos(0.0F, 0.0F, -2.3F);
        this.rAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(rAntenna01, 0.0F, 0.0F, 0.3141592653589793F);
        this.lLeg01d = new ModelPart(this, 1, 53);
        this.lLeg01d.setPos(0.5F, 4.8F, 0.0F);
        this.lLeg01d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg01d, 0.0F, 0.0F, 0.2792526803190927F);
        this.rWing = new ModelPart(this, 16, 14);
        this.rWing.mirror = true;
        this.rWing.setPos(-1.9F, -2.8F, 0.0F);
        this.rWing.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(rWing, 0.08726646259971647F, -0.12217304763960307F, -0.12217304763960307F);
        this.lLeg01c = new ModelPart(this, 6, 48);
        this.lLeg01c.setPos(-0.1F, -1.6F, -0.1F);
        this.lLeg01c.addBox(-0.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(lLeg01c, 0.0F, 0.0F, -1.2217304763960306F);
        this.thorax.addChild(this.rLeg00a);
        this.rLeg00c.addChild(this.rLeg00d);
        this.lLeg02a.addChild(this.lLeg02b);
        this.lLeg02b.addChild(this.lLeg02c);
        this.lAntenna00.addChild(this.lAntenna01);
        this.lLeg02c.addChild(this.lLeg02d);
        this.thorax.addChild(this.lWing);
        this.lLeg00b.addChild(this.lLeg00c);
        this.lLeg00c.addChild(this.lLeg00d);
        this.rLeg00b.addChild(this.rLeg00c);
        this.thorax.addChild(this.rLeg01a);
        this.head.addChild(this.lMandible);
        this.rLeg01a.addChild(this.rLeg01b);
        this.thoraxBack.addChild(this.abdomen);
        this.rLeg02a.addChild(this.rLeg02b);
        this.rLeg02c.addChild(this.rPollenBasket);
        this.abdomen.addChild(this.sting);
        this.lLeg00a.addChild(this.lLeg00b);
        this.rLeg01b.addChild(this.rLeg01c);
        this.rLeg02c.addChild(this.rLeg02d);
        this.head.addChild(this.rAntenna00);
        this.head.addChild(this.rMandible);
        this.lLeg01a.addChild(this.lLeg01b);
        this.head.addChild(this.lAntenna00);
        this.rLeg00a.addChild(this.rLeg00b);
        this.thorax.addChild(this.rLeg02a);
        this.thorax.addChild(this.head);
        this.thorax.addChild(this.lLeg02a);
        this.thorax.addChild(this.lLeg00a);
        this.rLeg02b.addChild(this.rLeg02c);
        this.thorax.addChild(this.thoraxBack);
        this.lLeg02c.addChild(this.lPollenBasket);
        this.rLeg01c.addChild(this.rLeg01d);
        this.thorax.addChild(this.lLeg01a);
        this.rAntenna00.addChild(this.rAntenna01);
        this.lLeg01c.addChild(this.lLeg01d);
        this.thorax.addChild(this.rWing);
        this.lLeg01b.addChild(this.lLeg01c);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        matrixStackIn.scale(0.8F, 0.8F, 0.8F);
        this.thorax.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
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
            // what the fuck does func_228283_a_ do, Mojang
            this.thorax.xRot = ModelUtils.rotlerpRad(this.thorax.xRot, 3.0915928F, this.bodyPitch);
        }
    }

    @Override
    public void prepareMobModel(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        this.bodyPitch = entityIn.getRollAmount(partialTick);
        this.sting.visible = !entityIn.hasStung();
    }

}
