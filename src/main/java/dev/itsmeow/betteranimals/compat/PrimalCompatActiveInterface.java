package dev.itsmeow.betteranimals.compat;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPolarBear;
import nmd.primal.core.common.entities.living.EntityBlackBear;
import nmd.primal.core.common.entities.living.EntityBrownBear;

public class PrimalCompatActiveInterface implements PrimalCompatInterface {

    @Override
    public float getAnimationScale(Entity entity, float ticks) {
        if(entity instanceof EntityBlackBear) {
            return ((EntityBlackBear) entity).getStandingAnimationScale(ticks);
        } else if(entity instanceof EntityBrownBear) {
            return ((EntityBrownBear) entity).getStandingAnimationScale(ticks);
        } else if(entity instanceof EntityPolarBear) {
            return ((EntityPolarBear) entity).getStandingAnimationScale(ticks);
        }
        return 0;
    }

}
