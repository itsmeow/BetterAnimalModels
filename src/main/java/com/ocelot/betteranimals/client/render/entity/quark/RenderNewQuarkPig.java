package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewPig;
import com.ocelot.betteranimals.compat.ActiveCompatQuark;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import vazkii.quark.client.feature.RandomAnimalTextures.RandomTextureType;

public class RenderNewQuarkPig extends RenderNewPig {
    
    public RenderNewQuarkPig(RenderManager m) {
        super(m);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPig entity) {
        return ActiveCompatQuark.getRandomTexture(entity, RandomTextureType.PIG);
    }

}
