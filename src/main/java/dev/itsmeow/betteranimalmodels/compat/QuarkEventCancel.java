package dev.itsmeow.betteranimalmodels.compat;

import dev.itsmeow.betteranimalmodels.client.BetterAnimalModelsConfig;
import vazkii.quark.content.client.module.VariantAnimalTexturesModule;

public class QuarkEventCancel {

    public static void preQuark() {
        if (BetterAnimalModelsConfig.enableQuarkOverrideChicken.get())
            VariantAnimalTexturesModule.enableChicken = false;
        if (BetterAnimalModelsConfig.enableQuarkOverrideCow.get())
            VariantAnimalTexturesModule.enableCow = false;
        if (BetterAnimalModelsConfig.enableQuarkOverridePig.get())
            VariantAnimalTexturesModule.enablePig = false;
        if (BetterAnimalModelsConfig.enableQuarkOverrideBee.get())
            VariantAnimalTexturesModule.enableLGBTBees = false;
    }

}