package dev.itsmeow.betteranimals.compat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vazkii.quark.api.module.FeatureEvent;
import vazkii.quark.client.feature.RandomAnimalTextures;

public class QuarkEventCancel {
    
    public static void preQuark() {
        MinecraftForge.EVENT_BUS.register(QuarkEventCancel.class);
    }
    
    @SubscribeEvent
    public static void onFeatureLoad(FeatureEvent.Loaded event) {
        if(event.getFeature() instanceof RandomAnimalTextures) {
            event.setCanceled(true);
        }
    }
    
}
