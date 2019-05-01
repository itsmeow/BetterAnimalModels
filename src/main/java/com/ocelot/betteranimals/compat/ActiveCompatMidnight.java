package com.ocelot.betteranimals.compat;

import com.mushroom.midnight.common.entity.creature.EntityNightStag;
import com.ocelot.betteranimals.client.render.entity.midnight.RenderNewNightStag;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ActiveCompatMidnight implements ModInteropProxy {

    @Override
    public boolean register() {
        if(BetterAnimalsConfig.enableNightstag)
            RenderingRegistry.registerEntityRenderingHandler(EntityNightStag.class, RenderNewNightStag::new);
        return true;
    }

}
