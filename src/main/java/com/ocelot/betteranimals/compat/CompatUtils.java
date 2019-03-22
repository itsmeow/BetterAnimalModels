package com.ocelot.betteranimals.compat;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class CompatUtils {
	
	public static void reg(Class theClass, RenderLiving renderer) {
		RenderingRegistry.registerEntityRenderingHandler(theClass, renderer);
	}
	
}
