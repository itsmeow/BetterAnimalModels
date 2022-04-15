package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class LayerNewSpiderEyes<T extends LivingEntity, A extends EntityModel<T>> extends EyesLayer<T, A> {

    private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/spider_eyes.png");
    public static class RenderTypes extends RenderType {

        public RenderTypes() {
            super(null, null, 0, 0, false, false, null, null);
        }

        public static RenderType getEyesEntityCutoutNoCullDepthMaskOff(ResourceLocation locationIn) {
            RenderStateShard.TextureStateShard renderstate$texturestate = new RenderStateShard.TextureStateShard(locationIn, false, false);
            return create("eyes_entity_cutout_no_cull_depth_mask_off", DefaultVertexFormat.NEW_ENTITY, 7, 256, false, true, RenderType.CompositeState.builder().setTextureState(renderstate$texturestate).setCullState(NO_CULL).setTransparencyState(ADDITIVE_TRANSPARENCY).setWriteMaskState(COLOR_WRITE).setFogState(BLACK_FOG).setDiffuseLightingState(DIFFUSE_LIGHTING).setAlphaState(DEFAULT_ALPHA).setLightmapState(NO_LIGHTMAP).setOverlayState(OVERLAY).createCompositeState(false));
        }

    }
    private static final RenderType RENDER_TYPE = RenderTypes.getEyesEntityCutoutNoCullDepthMaskOff(GLOW);

    public LayerNewSpiderEyes(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    public RenderType renderType() {
        return RENDER_TYPE;
    }

}
