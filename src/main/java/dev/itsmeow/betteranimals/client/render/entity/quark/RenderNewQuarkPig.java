package dev.itsmeow.betteranimals.client.render.entity.quark;

import dev.itsmeow.betteranimals.client.render.entity.RenderNewPig;
import dev.itsmeow.betteranimals.compat.QuarkUtil;
import dev.itsmeow.betteranimals.compat.QuarkUtil.VariantTextureType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkPig extends RenderNewPig {
    
    public RenderNewQuarkPig(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(PigEntity entity) {
        return QuarkUtil.getTextureOrShiny(entity, VariantTextureType.PIG);
    }

}
