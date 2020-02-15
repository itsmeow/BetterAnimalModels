package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.compat.QuarkUtil;
import com.ocelot.betteranimals.compat.QuarkUtil.VariantTextureType;

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
