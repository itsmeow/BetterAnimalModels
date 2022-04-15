package dev.itsmeow.betteranimalmodels;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class BetterAnimalModelsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
            BetterAnimalModels.printServerWarning();
        }
    }

}
