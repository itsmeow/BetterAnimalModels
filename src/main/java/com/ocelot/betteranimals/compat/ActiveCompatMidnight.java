package com.ocelot.betteranimals.compat;

import com.mushroom.midnight.common.entity.creature.EntityNightStag;
import com.ocelot.betteranimals.client.render.entity.midnight.RenderNewNightStag;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ActiveCompatMidnight implements ModInteropProxy {

    @Override
    public boolean register() {
        if(BetterAnimalsConfig.enableNightstag) {
            MinecraftForge.EVENT_BUS.register(RenderNewNightStag.class);
            MinecraftForge.EVENT_BUS.register(this);
        }
        return true;
    }
    
    @SubscribeEvent(priority = EventPriority.LOW)
    public void modelReg(ModelRegistryEvent e) {
        RenderingRegistry.registerEntityRenderingHandler(EntityNightStag.class, RenderNewNightStag::new);
    }

}
