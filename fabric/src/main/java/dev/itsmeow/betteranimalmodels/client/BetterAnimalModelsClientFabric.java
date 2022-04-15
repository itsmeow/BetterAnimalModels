package dev.itsmeow.betteranimalmodels.client;

import net.fabricmc.api.ClientModInitializer;

public class BetterAnimalModelsClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Replacements.init();
    }

}
