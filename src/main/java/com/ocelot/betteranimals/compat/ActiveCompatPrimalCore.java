package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.RenderNewSophisticatedWolf;
import com.ocelot.betteranimals.client.render.entity.RenderNewSteppeWolf;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class ActiveCompatPrimalCore implements ModInteropProxyPrimalCore {

	public static Class atreClass = null;
	public static Method shearMethod;

	public static Class wolfClass = null;

	@Override
	public void primalcore_register() {
		//Ovis Atre
		atreClass = CompatUtils.registerClassRenderer("nmd.primal.core.common.entities.living.EntityOvisAtre", new RenderNewOvisAtre());
		shearMethod = CompatUtils.getMethod("getSheared", atreClass);
		
		// Steppe Wolf
		wolfClass = CompatUtils.registerClassRenderer("nmd.primal.core.common.entities.living.EntityWolfSteppe", new RenderNewSteppeWolf());
	}

}
