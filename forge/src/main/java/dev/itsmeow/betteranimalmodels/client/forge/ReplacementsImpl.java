package dev.itsmeow.betteranimalmodels.client.forge;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.betteranimalmodels.forge.compat.QuarkHooks;
import dev.itsmeow.betteranimalmodels.mixin.forge.ModConfigInvoker;
import dev.itsmeow.betteranimalmodels.mixin.forge.ModContainerAccessor;
import dev.itsmeow.imdlib.util.config.CommonConfigAPI;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLPaths;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BetterAnimalModels.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReplacementsImpl {

    public static void platformInit() {
        CommonConfigAPI.createClientReplaceConfig(builder -> {
            Replacements.H.getConfig(builder, (builder2, modid, map) -> {
                if("minecraft".equals(modid)) {
                    map.put("cow", builder.define("replace_cow", true));
                    map.put("pig", builder.define("replace_pig", true));
                    map.put("chicken", builder.define("replace_chicken", true));
                    map.put("bee", builder.define("replace_bee", true));
                    map.put("dolphin", builder.define("replace_dolphin", true));
                }
            });
            Supplier<Runnable> target = () -> () -> QuarkHooks.initConfig(builder);
            if(ModList.get().isLoaded("quark")) {
                target.get().run();
            }
        }, () -> {});
        ModConfig config = ((ModContainerAccessor) ModLoadingContext.get().getActiveContainer()).getConfigs().get(ModConfig.Type.CLIENT);
        CommentedFileConfig configData = config.getHandler().reader(FMLPaths.CONFIGDIR.get()).apply(config);
        ((ModConfigInvoker) config).invokeSetConfigData(configData);
        config.save();
        Supplier<Runnable> target = () -> () -> QuarkHooks.configLoad();
        if(ModList.get().isLoaded("quark")) {
            target.get().run();
        }
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void clientSetup(FMLClientSetupEvent event) {
        Replacements.H.initComplete();
    }

}
