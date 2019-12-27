package com.ocelot.betteranimals.client.render.entity.sophisticatedwolves;

import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewWolf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import sophisticated_wolves.SWConfiguration;
import sophisticated_wolves.api.EnumWolfSpecies;
import sophisticated_wolves.entity.EntitySophisticatedWolf;

public class RenderNewSophisticatedWolf extends RenderLiving<EntitySophisticatedWolf> {

    private static final ResourceLocation BROWN_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown.png");
    private static final ResourceLocation BROWN_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown_tame.png");
    private static final ResourceLocation BROWN_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown_angry.png");

    private static final ResourceLocation BLACK_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black.png");
    private static final ResourceLocation BLACK_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black_tame.png");
    private static final ResourceLocation BLACK_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black_angry.png");

    private static final ResourceLocation FOREST_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest.png");
    private static final ResourceLocation FOREST_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest_tame.png");
    private static final ResourceLocation FOREST_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest_angry.png");

    private static final ResourceLocation WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/vanilla/wolf.png");
    private static final ResourceLocation WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/vanilla/wolf_tame.png");
    private static final ResourceLocation WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/vanilla/wolf_angry.png");

    public RenderNewSophisticatedWolf(RenderManager m) {
        super(m, new ModelNewWolf(), 0.4F);
        this.addLayer(new LayerNewSophisticatedWolfCollar(this));
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    @Override
    protected float handleRotationFloat(EntitySophisticatedWolf wolf, float partialTicks) {
        return wolf.getTailRotation();
    }

    @Override
    protected void preRenderCallback(EntitySophisticatedWolf wolf, float partialTickTime) {
        if(getMainModel().isChild) {
            GlStateManager.scale(0.5D, 0.5D, 0.5D);
        } else {
            GlStateManager.scale(1.0D, 1.0D, 1.0D);
        }
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    @Override
    public void doRender(EntitySophisticatedWolf wolf, double x, double y, double z, float entityYaw, float partialTicks) {
        if(wolf.isWolfWet()) {
            float f = wolf.getBrightness() * wolf.getShadingWhileWet(partialTicks);
            GlStateManager.color(f, f, f);
        }

        super.doRender(wolf, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySophisticatedWolf wolf) {
        if(wolf.getSpecies() == EnumWolfSpecies.BROWN) {
            if(wolf.isTamed())
                return BROWN_WOLF_TAME;
            if(wolf.isAngry())
                return BROWN_WOLF_ANGRY;
            else
                return BROWN_WOLF;
        }
        if(wolf.getSpecies() == EnumWolfSpecies.BLACK) {
            if(wolf.isTamed())
                return BLACK_WOLF_TAME;
            if(wolf.isAngry())
                return BLACK_WOLF_ANGRY;
            else
                return BLACK_WOLF;
        }
        if(wolf.getSpecies() == EnumWolfSpecies.FOREST) {
            if(wolf.isTamed())
                return FOREST_WOLF_TAME;
            if(wolf.isAngry())
                return FOREST_WOLF_ANGRY;
            else
                return FOREST_WOLF;
        } else if(wolf.getSpecies() == EnumWolfSpecies.VANILLA) {
            if(wolf.isTamed())
                return WOLF_TAME;
            if(wolf.isAngry())
                return WOLF_ANGRY;
            else
                return WOLF;
        } else {
            return WOLF;
        }
    }

    // Custom Functions below here
    // Function called by RenderLiving for special renders, used to call nametag
    // function
    @Override
    public void renderName(EntitySophisticatedWolf entity, double x, double y, double z) {
        EntitySophisticatedWolf wolf = (EntitySophisticatedWolf) entity;

        if(wolf.isTamed() && Minecraft.isGuiEnabled() && StringUtils.isNotBlank(wolf.getCustomNameTag())) {
            if(wolf.getCustomNameTag().length() > 0) {
                this.renderWolfName(wolf, x, y, z);
            }
        }
    }

    // renders wolf nametag
    public void renderWolfName(EntitySophisticatedWolf wolf, double d, double d1, double d2) {
        float f = 1.6F;
        float f1 = 0.01666667F * f;
        float f2 = wolf.getDistance(this.renderManager.renderViewEntity);
        float f3 = wolf.isSitting() ? 32 : 64;
        if(f2 < f3) {
            String wolfName = wolf.getCustomNameTag();
            FontRenderer fontRenderer = this.getFontRendererFromRenderManager();
            GL11.glPushMatrix();
            GL11.glTranslatef((float) d, (float) d1 + 1.5F, (float) d2);
            GL11.glNormal3f(0, 1, 0);
            GL11.glRotatef(-this.renderManager.playerViewY, 0, 1, 0);
            GL11.glRotatef(this.renderManager.playerViewX, 1, 0, 0);
            GL11.glScalef(-f1, -f1, f1);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glTranslatef(0, 0.25F / f1, 0);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            if(!wolf.isSitting()) {
                fontRenderer.drawString(wolfName, -fontRenderer.getStringWidth(wolfName) / 2, 0, getSitNameColor(wolf));
                GL11.glEnable(GL11.GL_DEPTH_TEST);
                GL11.glDepthMask(true);
                fontRenderer.drawString(wolfName, -fontRenderer.getStringWidth(wolfName) / 2, 0, getWolfNameColor(wolf));
            } else {
                GL11.glDepthMask(true);
                fontRenderer.drawString(wolfName, -fontRenderer.getStringWidth(wolfName) / 2, 0, getSitNameColor(wolf));
            }
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glColor4f(1, 1, 1, 1);
            GL11.glPopMatrix();
        }
    }

    private static int HEALTH_2 = SWConfiguration.wolvesHealthTamed / 4 * 3;
    private static int HEALTH_3 = SWConfiguration.wolvesHealthTamed / 2;
    private static int HEALTH_4 = SWConfiguration.wolvesHealthTamed / 4;

    public int getWolfNameColor(EntitySophisticatedWolf wolf) {
        if(wolf.getHealth() < SWConfiguration.wolvesHealthTamed) {
            if(wolf.getHealth() <= HEALTH_2) {
                if(wolf.getHealth() <= HEALTH_3) {
                    if(wolf.getHealth() <= HEALTH_4) {
                        return 0xffff0202;
                    }
                    return 0xfffe5656;
                }
                return 0xffff9696;
            }
            return 0xfffecccc;
        } else {
            return 0xffffffff;
        }
    }

    // same function but with transparency
    public int getSitNameColor(EntitySophisticatedWolf wolf) {
        if(wolf.getHealth() < SWConfiguration.wolvesHealthTamed) {
            if(wolf.getHealth() <= HEALTH_2) {
                if(wolf.getHealth() <= HEALTH_3) {
                    if(wolf.getHealth() <= HEALTH_4) {
                        return 0x40ff0202;
                    }
                    return 0x40fe5656;
                }
                return 0x40ff9696;
            }
            return 0x40fecccc;
        } else {
            return 0x40ffffff;
        }
    }

    public static class LayerNewSophisticatedWolfCollar implements LayerRenderer<EntitySophisticatedWolf> {

        private static final ResourceLocation COLLAR_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/vanilla/wolf_tame_collar.png");
        private final RenderNewSophisticatedWolf wolfRenderer;

        public LayerNewSophisticatedWolfCollar(RenderNewSophisticatedWolf wolfRendererIn) {
            this.wolfRenderer = wolfRendererIn;
        }

        public void doRenderLayer(EntitySophisticatedWolf entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
            if(entitylivingbaseIn.isTamed() && !entitylivingbaseIn.isInvisible()) {
                this.wolfRenderer.bindTexture(COLLAR_TEXTURE);
                float[] afloat = entitylivingbaseIn.getCollarColor().getColorComponentValues();
                GlStateManager.color(afloat[0], afloat[1], afloat[2]);
                this.wolfRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        }

        public boolean shouldCombineTextures() {
            return false;
        }
    }

}
