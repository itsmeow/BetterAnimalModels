package dev.itsmeow.betteranimals.client.render.entity.quark;

import dev.itsmeow.betteranimals.client.render.entity.RenderNewCow;
import dev.itsmeow.betteranimals.compat.QuarkUtil;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderNewQuarkCow extends RenderNewCow {
    
    public RenderNewQuarkCow(RenderManager m) {
        super(m);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCow entity) {
        return QuarkUtil.getRandomTexture(entity, QuarkUtil.RandomTextureType.COW);
    }

}
