package dev.itsmeow.betteranimalmodels.mixin;

import net.minecraft.world.entity.animal.Sheep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Sheep.class)
public interface SheepAccessor {

    @Accessor
    int getEatAnimationTick();

}
