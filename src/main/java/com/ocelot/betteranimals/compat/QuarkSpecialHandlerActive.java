package com.ocelot.betteranimals.compat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vazkii.quark.api.module.FeatureEvent;
import vazkii.quark.client.feature.RandomAnimalTextures;

public class QuarkSpecialHandlerActive implements QuarkSpecialHandler {
    
    @Override
    public void preQuark() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void onFeatureLoad(FeatureEvent.Loaded event) {
        if(event.getFeature() instanceof RandomAnimalTextures) {
            event.setCanceled(true);
        }
    }
    
}
