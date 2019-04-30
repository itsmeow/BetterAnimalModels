package com.ocelot.betteranimals.compat;

import vazkii.quark.base.module.ModuleLoader;
import vazkii.quark.client.QuarkClient;
import vazkii.quark.client.feature.RandomAnimalTextures;

public class QuarkSpecialHandlerActive implements QuarkSpecialHandler {
    
    public static boolean enableCow, enablePig, enableChicken, enableChick = true;
    
    @Override
    public void preQuark() {
        QuarkClient client = (QuarkClient) ModuleLoader.moduleInstances.get(QuarkClient.class);
        RandomAnimalTextures feature = (RandomAnimalTextures) client.features.get("RANDOMANIMALTEXTURES");
        feature.setupConfig();
        feature.enabled = false;
    }
    
}
