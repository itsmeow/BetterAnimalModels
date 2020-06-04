package dev.itsmeow.betteranimals.client;

import java.util.function.Supplier;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.compat.QuarkEventCancel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterAnimals.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {

    public static void construction() {
        Replacements.addReplaces();
        BetterAnimalsConfig.setupConfig();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, BetterAnimalsConfig.CLIENT_CONFIG_SPEC);
    }

    @SubscribeEvent
    public static void mre(ModelRegistryEvent event) {
        Replacements.H.mre();
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        if(ModList.get().isLoaded("quark")) {
            Supplier<Runnable> run = () -> () -> {
                QuarkEventCancel.preQuark();
            };
            run.get().run();
        }
        Replacements.H.clientSetup();
    }

}
