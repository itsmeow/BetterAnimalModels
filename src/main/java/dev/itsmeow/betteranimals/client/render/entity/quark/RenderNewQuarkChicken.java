package dev.itsmeow.betteranimals.client.render.entity.quark;

import dev.itsmeow.betteranimals.client.render.entity.RenderNewChicken;
import dev.itsmeow.betteranimals.compat.QuarkUtil;
import dev.itsmeow.betteranimals.compat.QuarkUtil.VariantTextureType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
public class RenderNewQuarkChicken extends RenderNewChicken {
    
    public RenderNewQuarkChicken(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(ChickenEntity entity) {
        return QuarkUtil.getTextureOrShiny(entity, VariantTextureType.CHICKEN);
    }

}
