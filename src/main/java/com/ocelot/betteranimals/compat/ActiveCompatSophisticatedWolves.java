package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.sophisticatedwolves.RenderNewSophisticatedWolf;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import sophisticated_wolves.entity.EntitySophisticatedWolf;

public class ActiveCompatSophisticatedWolves implements ModInteropProxy {

	@SuppressWarnings("deprecation")
    @Override
	public boolean register() {
	    // Have to use deprecated version because SW does it
	    RenderingRegistry.registerEntityRenderingHandler(EntitySophisticatedWolf.class, new RenderNewSophisticatedWolf(Minecraft.getMinecraft().getRenderManager()));
		return true;
	}

}
