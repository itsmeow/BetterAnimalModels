package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewCow;
import com.ocelot.betteranimals.compat.ActiveCompatQuark;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import vazkii.quark.client.feature.RandomAnimalTextures.RandomTextureType;

public class RenderNewQuarkCow extends RenderNewCow {
    
    public RenderNewQuarkCow(RenderManager m) {
        super(m);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCow entity) {
        return ActiveCompatQuark.getRandomTexture(entity, RandomTextureType.COW);
    }

}
