package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewCow;
import com.ocelot.betteranimals.compat.QuarkUtil;
import com.ocelot.betteranimals.compat.QuarkUtil.VariantTextureType;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkCow extends RenderNewCow {
    
    public RenderNewQuarkCow(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(CowEntity entity) {
        return QuarkUtil.getTextureOrShiny(entity, VariantTextureType.COW);
    }

}
