package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewSpiderEyes<T extends LivingEntity, A extends EntityModel<T>> extends LayerRenderer<T, A> {
    
    private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/spider_eyes.png");
    
    public LayerNewSpiderEyes(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }
    
    @Override
    public void render(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.bindTexture(GLOW);
        GlStateManager.enableBlend();
        GlStateManager.disableAlphaTest();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
        if (entitylivingbaseIn.isInvisible()) {
           GlStateManager.depthMask(false);
        } else {
           GlStateManager.depthMask(true);
        }

        int i = 61680;
        int j = i % 65536;
        int k = i / 65536;
        GLX.glMultiTexCoord2f(GLX.GL_TEXTURE1, (float)j, (float)k);
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        GameRenderer gamerenderer = Minecraft.getInstance().gameRenderer;
        gamerenderer.setupFogColor(true);
        this.getEntityModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        gamerenderer.setupFogColor(false);
        i = entitylivingbaseIn.getBrightnessForRender();
        j = i % 65536;
        k = i / 65536;
        GLX.glMultiTexCoord2f(GLX.GL_TEXTURE1, (float)j, (float)k);
        this.func_215334_a(entitylivingbaseIn);
        GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GlStateManager.enableAlphaTest();
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

}
