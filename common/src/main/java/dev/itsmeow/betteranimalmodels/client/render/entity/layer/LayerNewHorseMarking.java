package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalmodels.client.Replacements;
import net.minecraft.Util;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Markings;

import java.util.Map;

public class LayerNewHorseMarking<T extends Horse> extends RenderLayer<T, EntityModel<T>> {
    private static final Map<Markings, ResourceLocation> MARKINGS_TEXTURES = Util.make(Maps.newEnumMap(Markings.class), (enumMap) -> {
        enumMap.put(Markings.NONE, null);
        enumMap.put(Markings.WHITE, Replacements.t("horse/horse_markings_white"));
        enumMap.put(Markings.WHITE_FIELD, Replacements.t("horse/horse_markings_whitefield"));
        enumMap.put(Markings.WHITE_DOTS, Replacements.t("horse/horse_markings_whitedots"));
        enumMap.put(Markings.BLACK_DOTS, Replacements.t("horse/horse_markings_blackdots"));
    });

    public LayerNewHorseMarking(RenderLayerParent<T, EntityModel<T>> arg) {
        super(arg);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, T entity, float f, float g, float h, float j, float k, float l) {
        ResourceLocation markings = MARKINGS_TEXTURES.get(entity.getMarkings());
        if (markings != null && !entity.isInvisible()) {
            VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(markings));
            this.getParentModel().renderToBuffer(poseStack, vertexConsumer, i, LivingEntityRenderer.getOverlayCoords(entity, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
