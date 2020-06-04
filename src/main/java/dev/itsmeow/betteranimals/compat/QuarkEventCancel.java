package dev.itsmeow.betteranimals.compat;

import dev.itsmeow.betteranimals.client.BetterAnimalsConfig;
import vazkii.quark.client.module.VariantAnimalTexturesModule;

public class QuarkEventCancel {

    public static void preQuark() {
        if(BetterAnimalsConfig.enableQuarkOverrideChicken.get())
            VariantAnimalTexturesModule.enableChicken = false;
        if(BetterAnimalsConfig.enableQuarkOverrideCow.get())
            VariantAnimalTexturesModule.enableCow = false;
        if(BetterAnimalsConfig.enableQuarkOverridePig.get())
            VariantAnimalTexturesModule.enablePig = false;
    }

}