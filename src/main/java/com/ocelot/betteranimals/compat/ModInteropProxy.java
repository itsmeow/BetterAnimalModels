package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.primal.RenderNewSteppeWolf;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public interface ModInteropProxy {
	void register();
}
