package dev.itsmeow.betteranimalmodels.client.render.entity.layer;

import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class LayerNewSpiderEyes<T extends LivingEntity, A extends EntityModel<T>> extends EyesLayer<T, A> {

    private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/spider_eyes.png");
    private static final RenderType RENDER_TYPE = RenderType.eyes(GLOW);

    public LayerNewSpiderEyes(RenderLayerParent<T, A> renderer) {
        super(renderer);
    }

    public RenderType renderType() {
        return RENDER_TYPE;
    }

}
