package dev.itsmeow.betteranimals.client.render.entity.layer;

import dev.itsmeow.betteranimals.BetterAnimals;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class LayerNewSpiderEyes<T extends LivingEntity, A extends EntityModel<T>> extends AbstractEyesLayer<T, A> {

    private static final ResourceLocation GLOW = new ResourceLocation(BetterAnimals.MODID, "textures/entity/spider_eyes.png");
    private static final RenderType RENDER_TYPE = RenderType.getEyes(GLOW);

    public LayerNewSpiderEyes(IEntityRenderer<T, A> renderer) {
        super(renderer);
    }

    public RenderType getRenderType() {
        return RENDER_TYPE;
    }

}
