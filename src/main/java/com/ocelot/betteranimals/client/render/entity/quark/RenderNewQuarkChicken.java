package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.compat.ActiveCompatQuark;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import vazkii.quark.client.feature.RandomAnimalTextures.RandomTextureType;

public class RenderNewQuarkChicken extends RenderNewChicken {
    
    public RenderNewQuarkChicken(RenderManager m) {
        super(m);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityChicken entity) {
        if(entity.isChild())
            return ActiveCompatQuark.getRandomTexture(entity, RandomTextureType.CHICK);
        
        return ActiveCompatQuark.getRandomTexture(entity, RandomTextureType.CHICKEN);
    }
    
}
