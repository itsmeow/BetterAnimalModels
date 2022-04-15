package dev.itsmeow.betteranimalmodels.client.fabric;

import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.imdlib.util.config.CommonConfigAPI;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.Minecraft;

public class ReplacementsImpl {

    public static void platformInit() {
        CommonConfigAPI.createClientReplaceConfig(Replacements.H::getConfig, () -> {});
        if(Minecraft.getInstance() == null || Minecraft.getInstance().getEntityRenderDispatcher() == null) {
            ClientLifecycleEvents.CLIENT_STARTED.register(event -> {
                Replacements.H.initComplete();
            });
        } else {
            Replacements.H.initComplete();
        }

    }

}
