package com.ocelot.betteranimals.compat;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class CompatUtils {
    
    public static <T extends Entity>void reg(Class<T> clazz, IRenderFactory<T> factory) {
        RenderingRegistry.registerEntityRenderingHandler(clazz, factory);
    }
    
}
