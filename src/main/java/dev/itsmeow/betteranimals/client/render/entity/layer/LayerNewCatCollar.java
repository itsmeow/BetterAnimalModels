package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.platform.GlStateManager;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewCat;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewCatCollar extends LayerRenderer<CatEntity, ModelNewCat<CatEntity>> {
    private static final ResourceLocation CAT_COLLAR = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cat/collar.png");

    public LayerNewCatCollar(IEntityRenderer<CatEntity, ModelNewCat<CatEntity>> renderer) {
        super(renderer);
    }

    public void render(CatEntity entity, float p_212842_2_, float p_212842_3_, float p_212842_4_, float p_212842_5_, float p_212842_6_, float p_212842_7_, float p_212842_8_) {
        if (entity.isTamed() && !entity.isInvisible()) {
            this.bindTexture(CAT_COLLAR);
            float[] afloat = entity.getCollarColor().getColorComponentValues();
            GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
            this.getEntityModel().render(entity, p_212842_2_, p_212842_3_, p_212842_5_, p_212842_6_, p_212842_7_, p_212842_8_);
        }
    }

    public boolean shouldCombineTextures() {
        return false;
    }
}