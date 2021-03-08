package dev.itsmeow.betteranimals.client.render.entity.layer;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewSpiderEyes<T extends LivingEntity, A extends EntityModel<T>> extends AbstractEyesLayer<T, A> {

    private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimals.MODID, "textures/entity/spider_eyes.png");
    public static class RenderTypes extends RenderType {

        public RenderTypes() {
            super(null, null, 0, 0, false, false, null, null);
        }

        public static RenderType getEyesEntityCutoutNoCullDepthMaskOff(ResourceLocation locationIn) {
            RenderState.TextureState renderstate$texturestate = new RenderState.TextureState(locationIn, false, false);
            return makeType("eyes_entity_cutout_no_cull_depth_mask_off", DefaultVertexFormats.ENTITY, 7, 256, false, true, RenderType.State.getBuilder().texture(renderstate$texturestate).cull(CULL_DISABLED).transparency(ADDITIVE_TRANSPARENCY).writeMask(COLOR_WRITE).fog(BLACK_FOG).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).lightmap(LIGHTMAP_DISABLED).overlay(OVERLAY_ENABLED).build(false));
        }

    }
    private static final RenderType RENDER_TYPE = RenderTypes.getEyesEntityCutoutNoCullDepthMaskOff(GLOW);

    public LayerNewSpiderEyes(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }

    public RenderType getRenderType() {
        return RENDER_TYPE;
    }

}
