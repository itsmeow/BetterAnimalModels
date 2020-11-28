package dev.itsmeow.betteranimals.client.render.entity.quark;

import dev.itsmeow.betteranimals.client.render.entity.RenderNewPig;
import dev.itsmeow.betteranimals.compat.QuarkUtil;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkPig extends RenderNewPig {
    
    public RenderNewQuarkPig(RenderManager m) {
        super(m);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPig entity) {
        return QuarkUtil.getRandomTexture(entity, QuarkUtil.RandomTextureType.PIG);
    }

}
