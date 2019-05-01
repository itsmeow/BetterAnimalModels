package com.ocelot.betteranimals.compat;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vazkii.quark.api.module.FeatureEvent;
import vazkii.quark.client.feature.RandomAnimalTextures;

@EventBusSubscriber
public class QuarkSpecialHandlerActive implements QuarkSpecialHandler {
    
    public static boolean featureEnabled = false;
    
    @Override
    public void preQuark() {
        
        
    }
    
    @SubscribeEvent
    public static void onFeatureLoad(FeatureEvent.Loaded event) {
        if(event.getFeature() instanceof RandomAnimalTextures) {
            featureEnabled = event.getFeature().isEnabled();
            event.setCanceled(true);
        }
    }
    
}
