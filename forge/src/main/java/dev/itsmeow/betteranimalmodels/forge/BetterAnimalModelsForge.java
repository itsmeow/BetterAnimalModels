package dev.itsmeow.betteranimalmodels.forge;

import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.betteranimalmodels.forge.compat.QuarkHooks;
import dev.itsmeow.imdlib.util.SafePlatform;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Supplier;

@Mod(BetterAnimalModels.MODID)
public class BetterAnimalModelsForge {

    public BetterAnimalModelsForge() {
        Supplier<Runnable> target = () -> () -> {
            Replacements.init();
            Supplier<Runnable> targetQ = () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener((FMLClientSetupEvent event) -> QuarkHooks.preQuark());
            if(SafePlatform.isModLoaded("quark")) {
                targetQ.get().run();
            }
        };
        if (SafePlatform.isClientEnv()) {
            target.get().run();
        } else {
            BetterAnimalModels.printServerWarning();
        }
    }

}
