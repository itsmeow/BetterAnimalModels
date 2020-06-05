package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.ModelUtils;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.math.MathHelper;

/**
 * bee - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelNewBee<T extends BeeEntity> extends Model<T> {
    public ModelRenderer thorax;
    public ModelRenderer thoraxBack;
    public ModelRenderer head;
    public ModelRenderer lLeg00a;
    public ModelRenderer lLeg01a;
    public ModelRenderer lLeg02a;
    public ModelRenderer rLeg00a;
    public ModelRenderer rLeg01a;
    public ModelRenderer rLeg02a;
    public ModelRenderer lWing;
    public ModelRenderer rWing;
    public ModelRenderer abdomen;
    public ModelRenderer sting;
    public ModelRenderer lMandible;
    public ModelRenderer rMandible;
    public ModelRenderer lAntenna00;
    public ModelRenderer rAntenna00;
    public ModelRenderer lAntenna01;
    public ModelRenderer rAntenna01;
    public ModelRenderer lLeg00b;
    public ModelRenderer lLeg00c;
    public ModelRenderer lLeg00d;
    public ModelRenderer lLeg01b;
    public ModelRenderer lLeg01c;
    public ModelRenderer lLeg01d;
    public ModelRenderer lLeg02b;
    public ModelRenderer lLeg02c;
    public ModelRenderer lLeg02d;
    public ModelRenderer lPollenBasket;
    public ModelRenderer rLeg00b;
    public ModelRenderer rLeg00c;
    public ModelRenderer rLeg00d;
    public ModelRenderer rLeg01b;
    public ModelRenderer rLeg01c;
    public ModelRenderer rLeg01d;
    public ModelRenderer rLeg02b;
    public ModelRenderer rLeg02c;
    public ModelRenderer rLeg02d;
    public ModelRenderer rPollenBasket;
    private float bodyPitch;

    public ModelNewBee() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rLeg00a = new ModelRenderer(this, 0, 44);
        this.rLeg00a.mirror = true;
        this.rLeg00a.setRotationPoint(-2.8F, 1.0F, -1.0F);
        this.rLeg00a.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rLeg00a, 0.0F, -0.3490658503988659F, -0.7853981633974483F);
        this.rLeg00d = new ModelRenderer(this, 1, 53);
        this.rLeg00d.mirror = true;
        this.rLeg00d.setRotationPoint(-0.5F, 4.8F, 0.0F);
        this.rLeg00d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg00d, 0.0F, 0.0F, -0.2792526803190927F);
        this.lLeg02b = new ModelRenderer(this, 0, 48);
        this.lLeg02b.setRotationPoint(1.6F, 0.2F, 0.0F);
        this.lLeg02b.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lLeg02b, 0.0F, -0.5759586531581287F, 0.6981317007977318F);
        this.lLeg02c = new ModelRenderer(this, 6, 48);
        this.lLeg02c.setRotationPoint(0.6F, -2.0F, -0.1F);
        this.lLeg02c.addBox(-0.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(lLeg02c, -0.40142572795869574F, 0.0F, -1.0471975511965976F);
        this.lAntenna01 = new ModelRenderer(this, 53, 0);
        this.lAntenna01.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.lAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(lAntenna01, 0.0F, 0.0F, -0.3141592653589793F);
        this.lLeg02d = new ModelRenderer(this, 1, 53);
        this.lLeg02d.setRotationPoint(0.5F, 4.8F, 0.0F);
        this.lLeg02d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg02d, 0.0F, 0.0F, 0.2792526803190927F);
        this.lWing = new ModelRenderer(this, 16, 14);
        this.lWing.setRotationPoint(1.9F, -2.8F, 0.0F);
        this.lWing.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(lWing, 0.08726646259971647F, 0.12217304763960307F, 0.12217304763960307F);
        this.lLeg00c = new ModelRenderer(this, 6, 48);
        this.lLeg00c.setRotationPoint(-0.1F, -1.6F, -0.1F);
        this.lLeg00c.addBox(-0.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(lLeg00c, 0.0F, 0.0F, -1.2217304763960306F);
        this.lLeg00d = new ModelRenderer(this, 1, 53);
        this.lLeg00d.setRotationPoint(0.5F, 4.8F, 0.0F);
        this.lLeg00d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg00d, 0.0F, 0.0F, 0.2792526803190927F);
        this.rLeg00c = new ModelRenderer(this, 6, 48);
        this.rLeg00c.mirror = true;
        this.rLeg00c.setRotationPoint(-0.1F, -1.6F, -0.1F);
        this.rLeg00c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg00c, 0.0F, 0.0F, 1.2217304763960306F);
        this.rLeg01a = new ModelRenderer(this, 0, 44);
        this.rLeg01a.mirror = true;
        this.rLeg01a.setRotationPoint(-2.8F, 1.0F, 0.5F);
        this.rLeg01a.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rLeg01a, 0.0F, 0.0F, -0.7853981633974483F);
        this.lMandible = new ModelRenderer(this, 0, 11);
        this.lMandible.setRotationPoint(0.9F, 4.6F, -1.0F);
        this.lMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lMandible, 0.0F, 0.0F, 0.2617993877991494F);
        this.rLeg01b = new ModelRenderer(this, 0, 48);
        this.rLeg01b.mirror = true;
        this.rLeg01b.setRotationPoint(-1.6F, 0.2F, 0.0F);
        this.rLeg01b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg01b, 0.0F, 0.0F, -0.5235987755982988F);
        this.abdomen = new ModelRenderer(this, 0, 26);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.abdomen.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 10, 0.0F);
        this.setRotateAngle(abdomen, -0.08726646259971647F, 0.0F, 0.0F);
        this.rLeg02b = new ModelRenderer(this, 0, 48);
        this.rLeg02b.mirror = true;
        this.rLeg02b.setRotationPoint(-1.6F, 0.2F, 0.0F);
        this.rLeg02b.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rLeg02b, 0.0F, 0.5759586531581287F, -0.6981317007977318F);
        this.rPollenBasket = new ModelRenderer(this, 21, 49);
        this.rPollenBasket.mirror = true;
        this.rPollenBasket.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.rPollenBasket.addBox(-1.8F, -0.8F, -1.2F, 2, 4, 2, 0.0F);
        this.sting = new ModelRenderer(this, 19, 0);
        this.sting.setRotationPoint(0.0F, 0.4F, 9.7F);
        this.sting.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(sting, -0.2792526803190927F, 0.0F, 0.0F);
        this.lLeg00b = new ModelRenderer(this, 0, 48);
        this.lLeg00b.setRotationPoint(0.7F, 0.2F, 0.0F);
        this.lLeg00b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg00b, 0.0F, 0.0F, 0.5235987755982988F);
        this.rLeg01c = new ModelRenderer(this, 6, 48);
        this.rLeg01c.mirror = true;
        this.rLeg01c.setRotationPoint(0.1F, -1.6F, -0.1F);
        this.rLeg01c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg01c, 0.0F, 0.0F, 1.2217304763960306F);
        this.rLeg02d = new ModelRenderer(this, 1, 53);
        this.rLeg02d.mirror = true;
        this.rLeg02d.setRotationPoint(-0.5F, 4.8F, 0.0F);
        this.rLeg02d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg02d, 0.0F, 0.0F, -0.2792526803190927F);
        this.rAntenna00 = new ModelRenderer(this, 44, 0);
        this.rAntenna00.mirror = true;
        this.rAntenna00.setRotationPoint(-0.7F, 2.3F, -2.6F);
        this.rAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
        this.rMandible = new ModelRenderer(this, 0, 11);
        this.rMandible.mirror = true;
        this.rMandible.setRotationPoint(-0.9F, 4.6F, -1.0F);
        this.rMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rMandible, 0.0F, 0.0F, -0.2617993877991494F);
        this.lLeg01b = new ModelRenderer(this, 0, 48);
        this.lLeg01b.setRotationPoint(1.6F, 0.2F, 0.0F);
        this.lLeg01b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg01b, 0.0F, 0.0F, 0.5235987755982988F);
        this.lAntenna00 = new ModelRenderer(this, 44, 0);
        this.lAntenna00.setRotationPoint(0.7F, 2.3F, -2.6F);
        this.lAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
        this.rLeg00b = new ModelRenderer(this, 0, 48);
        this.rLeg00b.mirror = true;
        this.rLeg00b.setRotationPoint(-0.8F, 0.2F, 0.0F);
        this.rLeg00b.addBox(-0.5F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg00b, 0.0F, 0.0F, -0.5235987755982988F);
        this.rLeg02a = new ModelRenderer(this, 0, 44);
        this.rLeg02a.mirror = true;
        this.rLeg02a.setRotationPoint(-2.8F, 1.0F, 2.0F);
        this.rLeg02a.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rLeg02a, 0.0F, 0.5235987755982988F, -0.7853981633974483F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -1.1F, -2.9F);
        this.head.addBox(-2.5F, -1.0F, -3.0F, 5, 6, 4, 0.0F);
        this.setRotateAngle(head, -0.5235987755982988F, 0.0F, 0.0F);
        this.lLeg02a = new ModelRenderer(this, 0, 44);
        this.lLeg02a.setRotationPoint(2.8F, 1.0F, 2.0F);
        this.lLeg02a.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lLeg02a, 0.0F, -0.5235987755982988F, 0.7853981633974483F);
        this.thorax = new ModelRenderer(this, 2, 11);
        this.thorax.setRotationPoint(0.0F, 12.0F, -3.6F);
        this.thorax.addBox(-3.0F, -3.0F, -3.5F, 6, 6, 6, 0.0F);
        this.lLeg00a = new ModelRenderer(this, 0, 44);
        this.lLeg00a.setRotationPoint(2.8F, 1.0F, -1.0F);
        this.lLeg00a.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lLeg00a, 0.0F, 0.3490658503988659F, 0.7853981633974483F);
        this.rLeg02c = new ModelRenderer(this, 6, 48);
        this.rLeg02c.mirror = true;
        this.rLeg02c.setRotationPoint(-0.6F, -2.0F, -0.1F);
        this.rLeg02c.addBox(-1.5F, -0.9F, -0.5F, 2, 6, 1, 0.0F);
        this.setRotateAngle(rLeg02c, -0.40142572795869574F, 0.0F, 1.0471975511965976F);
        this.thoraxBack = new ModelRenderer(this, 29, 0);
        this.thoraxBack.setRotationPoint(0.0F, 0.4F, 2.1F);
        this.thoraxBack.addBox(-2.5F, -1.5F, 0.0F, 5, 4, 1, 0.0F);
        this.lPollenBasket = new ModelRenderer(this, 21, 49);
        this.lPollenBasket.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.lPollenBasket.addBox(-0.2F, -0.8F, -1.2F, 2, 4, 2, 0.0F);
        this.rLeg01d = new ModelRenderer(this, 1, 53);
        this.rLeg01d.mirror = true;
        this.rLeg01d.setRotationPoint(-0.5F, 4.8F, 0.0F);
        this.rLeg01d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rLeg01d, 0.0F, 0.0F, -0.2792526803190927F);
        this.lLeg01a = new ModelRenderer(this, 0, 44);
        this.lLeg01a.setRotationPoint(2.8F, 1.0F, 0.5F);
        this.lLeg01a.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lLeg01a, 0.0F, 0.0F, 0.7853981633974483F);
        this.rAntenna01 = new ModelRenderer(this, 53, 0);
        this.rAntenna01.mirror = true;
        this.rAntenna01.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.rAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(rAntenna01, 0.0F, 0.0F, 0.3141592653589793F);
        this.lLeg01d = new ModelRenderer(this, 1, 53);
        this.lLeg01d.setRotationPoint(0.5F, 4.8F, 0.0F);
        this.lLeg01d.addBox(-0.5F, 0.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lLeg01d, 0.0F, 0.0F, 0.2792526803190927F);
        this.rWing = new ModelRenderer(this, 16, 14);
        this.rWing.mirror = true;
        this.rWing.setRotationPoint(-1.9F, -2.8F, 0.0F);
        this.rWing.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(rWing, 0.08726646259971647F, -0.12217304763960307F, -0.12217304763960307F);
        this.lLeg01c = new ModelRenderer(this, 6, 48);
        this.lLeg01c.setRotationPoint(-0.1F, -1.6F, -0.1F);
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
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        matrixStackIn.scale(0.8F, 0.8F, 0.8F);
        this.thorax.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.rWing.rotateAngleX = 0.08726646259971647F;
        this.lWing.rotateAngleX = 0.08726646259971647F;
        this.thorax.rotateAngleX = 0.0F;
        this.thorax.rotationPointY = 12.0F;
        boolean landed = entityIn.onGround && entityIn.getMotion().lengthSquared() < 1.0E-7D;
        if(landed) {
            // not move
            this.rWing.rotateAngleX = 0.08726646259971647F;
            this.lWing.rotateAngleX = 0.08726646259971647F;
            this.rWing.rotateAngleY = -0.12217304763960307F;
            this.lWing.rotateAngleY = 0.12217304763960307F;
        } else {
            // move
            this.rWing.rotateAngleY = -0.12217304763960307F - rad(15F);
            this.lWing.rotateAngleY = 0.12217304763960307F + rad(15F);
            this.rWing.rotateAngleX = MathHelper.cos(ageInTicks * 2.1F) * (float) Math.PI * 0.15F + 0.08726646259971647F;
            this.lWing.rotateAngleX = MathHelper.cos(ageInTicks * 2.1F) * (float) Math.PI * 0.15F + 0.08726646259971647F;
            this.thorax.rotateAngleX = 0.0F;
            this.thorax.rotateAngleY = 0.0F;
            this.thorax.rotateAngleZ = 0.0F;
        }

        if(!entityIn.isAngry()) {
            // angy bee
            this.thorax.rotateAngleX = 0.0F;
            this.thorax.rotateAngleY = 0.0F;
            this.thorax.rotateAngleZ = 0.0F;
            if(!landed) {
                // not moving angy bee
                float f1 = MathHelper.cos(ageInTicks * 0.18F);
                this.thorax.rotateAngleX = 0.1F + f1 * (float) Math.PI * 0.025F;
                this.thorax.rotationPointY = 19.0F - MathHelper.cos(ageInTicks * 0.18F) * 0.9F;
            }
        }

        if(this.bodyPitch > 0.0F) {
            // what the fuck does func_228283_a_ do, Mojang
            this.thorax.rotateAngleX = ModelUtils.func_228283_a_(this.thorax.rotateAngleX, 3.0915928F, this.bodyPitch);
        }
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        this.bodyPitch = entityIn.getBodyPitch(partialTick);
        this.sting.showModel = !entityIn.hasStung();
    }

}
