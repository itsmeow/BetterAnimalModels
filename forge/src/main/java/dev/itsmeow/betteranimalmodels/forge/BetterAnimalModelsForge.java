package dev.itsmeow.betteranimalmodels.forge;

import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.imdlib.util.SafePlatform;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

@Mod(BetterAnimalModels.MODID)
public class BetterAnimalModelsForge {

    public BetterAnimalModelsForge() {
        Supplier<Runnable> target = () -> () -> Replacements.init();
        if (SafePlatform.isClientEnv()) {
            target.get().run();
        } else {
            BetterAnimalModels.printServerWarning();
        }
    }

}
