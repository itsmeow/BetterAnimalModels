package dev.itsmeow.betteranimalmodels.client;

import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.compat.QuarkEventCancel;
import dev.itsmeow.imdlib.util.ClassLoadHacks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterAnimalModels.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {

    public static void construction() {
        Replacements.addReplaces();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, BetterAnimalModelsConfig.getClientConfigSpec());
    }

    @SubscribeEvent
    public static void mre(ModelRegistryEvent event) {
        Replacements.H.mre();
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ClassLoadHacks.runWhenLoaded("quark", () -> () -> {
            QuarkEventCancel.preQuark();
        });
        Replacements.H.clientSetup();
    }

}
