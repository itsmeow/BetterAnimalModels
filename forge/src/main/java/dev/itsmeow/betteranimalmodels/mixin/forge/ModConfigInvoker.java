package dev.itsmeow.betteranimalmodels.mixin.forge;

import com.electronwill.nightconfig.core.CommentedConfig;
import net.minecraftforge.fml.config.ModConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ModConfig.class)
public interface ModConfigInvoker {

    @Invoker
    void invokeSetConfigData(CommentedConfig data);

}
