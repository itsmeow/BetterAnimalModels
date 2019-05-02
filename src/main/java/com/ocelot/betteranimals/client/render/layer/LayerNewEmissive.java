package com.ocelot.betteranimals.client.render.layer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class LayerNewEmissive<T extends EntityLivingBase> implements LayerRenderer<T> {

    private static final Minecraft CLIENT = Minecraft.getMinecraft();

    private final ModelBase model;
    private final ResourceLocation texture;
    private final BrightnessFunction<T> brightnessFunction;
    private final ColorFunction<T> colorFunction;

    public LayerNewEmissive(ModelBase model, ResourceLocation texture, BrightnessFunction<T> brightnessFunction, ColorFunction<T> colorFunction) {
        this.model = model;
        this.texture = texture;
        this.brightnessFunction = brightnessFunction;
        this.colorFunction = colorFunction;
    }

    public LayerNewEmissive(ModelBase model, ResourceLocation texture, BrightnessFunction<T> brightnessFunction) {
        this(model, texture, brightnessFunction, (entity, partialTicks) -> 0xffffff);
    }

    public LayerNewEmissive(ModelBase model, ResourceLocation texture) {
        this(model, texture, (entity, partialTicks) -> 240);
    }

    @Override
    public void doRenderLayer(T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (entity.isInvisible()) {
            return;
        }
        GlStateManager.pushMatrix();
        CLIENT.getTextureManager().bindTexture(this.texture);
        GlStateManager.depthMask(true);
        GlStateManager.enableBlend();

        int brightness = this.brightnessFunction.apply(entity, partialTicks);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, brightness, brightness);
        float[] rgbF = getRGBColorF(colorFunction.getColor(entity, partialTicks));
        GlStateManager.color(rgbF[0], rgbF[1], rgbF[2], 1f);
        GlStateManager.disableLighting();
        this.model.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        this.model.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

        GlStateManager.enableLighting();
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, OpenGlHelper.lastBrightnessX, OpenGlHelper.lastBrightnessY);
        GlStateManager.popMatrix();
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    public interface BrightnessFunction<T extends EntityLivingBase> {
        int apply(T entity, float partialTicks);
    }

    public interface ColorFunction<T extends EntityLivingBase> {
        int getColor(T entity, float partialTicks);
    }
    
    public static float[] getRGBColorF(int color) {
        float[] rgb = new float[3];
        rgb[0] = ((color >> 16) & 255) / 255f;
        rgb[1] = ((color >> 8) & 255) / 255f;
        rgb[2] = (color & 255) / 255f;
        return rgb;
    }

}
