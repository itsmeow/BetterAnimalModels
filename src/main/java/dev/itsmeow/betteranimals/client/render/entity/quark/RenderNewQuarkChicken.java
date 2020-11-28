package dev.itsmeow.betteranimals.client.render.entity.quark;

import dev.itsmeow.betteranimals.client.render.entity.RenderNewChicken;
import dev.itsmeow.betteranimals.compat.QuarkUtil;

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
            return QuarkUtil.getRandomTexture(entity, QuarkUtil.RandomTextureType.CHICK);
        
        return QuarkUtil.getRandomTexture(entity, QuarkUtil.RandomTextureType.CHICKEN);
    }
    
}
