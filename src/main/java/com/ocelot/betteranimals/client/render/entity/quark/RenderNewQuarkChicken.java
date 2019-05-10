package com.ocelot.betteranimals.client.render.entity.quark;

import com.ocelot.betteranimals.client.render.entity.RenderNewChicken;
import com.ocelot.betteranimals.compat.QuarkUtil;
import com.ocelot.betteranimals.compat.QuarkUtil.RandomTextureType;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkChicken extends RenderNewChicken {
    
    public RenderNewQuarkChicken(RenderManager m) {
        super(m);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityChicken entity) {
        if(entity.isChild())
            return QuarkUtil.getRandomTexture(entity, RandomTextureType.CHICK);
        
        return QuarkUtil.getRandomTexture(entity, RandomTextureType.CHICKEN);
    }
    
}
