package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewPig;
import com.ocelot.betteranimals.compat.QuarkUtil;
import com.ocelot.betteranimals.compat.QuarkUtil.RandomTextureType;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkPig extends RenderNewPig {
    
    public RenderNewQuarkPig(RenderManager m) {
        super(m);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPig entity) {
        return QuarkUtil.getRandomTexture(entity, RandomTextureType.PIG);
    }

}
