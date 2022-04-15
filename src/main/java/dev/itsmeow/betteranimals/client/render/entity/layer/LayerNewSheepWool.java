package dev.itsmeow.betteranimals.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;

public class LayerNewSheepWool<T extends Sheep, A extends EntityModel<T>> extends RenderLayer<T, A> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/entity/sheep_fur.png");
    public LayerNewSheepWool(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, T sheep, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if(!sheep.isSheared() && !sheep.isInvisible()) {
            float f;
            float f1;
            float f2;
            if(sheep.hasCustomName() && "jeb_".equals(sheep.getName().getContents())) {
                int i = sheep.tickCount / 25 + sheep.getId();
                int j = DyeColor.values().length;
                int k = i % j;
                int l = (i + 1) % j;
                float f3 = ((float) (sheep.tickCount % 25) + partialTicks) / 25.0F;
                float[] afloat1 = Sheep.getColorArray(DyeColor.byId(k));
                float[] afloat2 = Sheep.getColorArray(DyeColor.byId(l));
                f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
                f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
                f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
            } else {
                float[] afloat = Sheep.getColorArray(sheep.getColor());
                f = afloat[0];
                f1 = afloat[1];
                f2 = afloat[2];
            }
            renderColoredCutoutModel(this.getParentModel(), TEXTURE, matrixStackIn, bufferIn, packedLightIn, sheep, f, f1, f2);
        }
    }

}