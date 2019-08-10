package com.ocelot.betteranimals;

import org.apache.logging.log4j.LogManager;

import com.ocelot.betteranimals.client.ReplacementHandler;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(BetterAnimals.MODID)
public class BetterAnimals {

    public static final String MODID = "betteranimals";

    public BetterAnimals() {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            ReplacementHandler.construction();
            FMLJavaModLoadingContext.get().getModEventBus().addListener(ReplacementHandler::clientSetup);
        });
        DistExecutor.runWhenOn(Dist.DEDICATED_SERVER, () -> () -> {
            LogManager.getLogger().warn("Better Animal Models is a clientside mod! It does nothing when installed on dedicated servers, and can be safely removed without any issues.");
        });
    }

}