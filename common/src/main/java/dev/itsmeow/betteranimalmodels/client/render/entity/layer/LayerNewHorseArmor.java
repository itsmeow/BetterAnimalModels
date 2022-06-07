package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.DyeableHorseArmorItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;

import java.util.WeakHashMap;

public class LayerNewHorseArmor<T extends Horse> extends RenderLayer<T, EntityModel<T>> {

    private static final WeakHashMap<HorseArmorItem, ResourceLocation> ARMOR_MAP = new WeakHashMap<>();

    public LayerNewHorseArmor(RenderLayerParent<T, EntityModel<T>> renderLayerParent) {
        super(renderLayerParent);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, T entity, float f, float g, float h, float j, float k, float l) {
        ItemStack stack = entity.getArmor();
        if (stack.getItem() instanceof HorseArmorItem armor) {
            float q;
            float r;
            float s;
            if (armor instanceof DyeableHorseArmorItem d) {
                int m = d.getColor(stack);
                q = (float) (m >> 16 & 255) / 255.0F;
                r = (float) (m >> 8 & 255) / 255.0F;
                s = (float) (m & 255) / 255.0F;
            } else {
                q = 1.0F;
                r = 1.0F;
                s = 1.0F;
            }
            VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(ARMOR_MAP.computeIfAbsent(armor, a -> new ResourceLocation(BetterAnimalModels.MODID, a.getTexture().getPath()))));
            this.getParentModel().renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, q, r, s, 1.0F);
        }
    }
}
