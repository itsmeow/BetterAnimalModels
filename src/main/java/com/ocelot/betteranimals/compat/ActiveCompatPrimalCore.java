package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.RenderNewSteppeWolf;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ActiveCompatPrimalCore implements ModInteropProxyPrimalCore {

	public static Class atreClass = null;
	public static Method shearMethod;

	public static Class steppeWolfClass = null;

	@Override
	public void primalcore_register() {
		//Ovis Atre
		atreClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityOvisAtre");
		shearMethod = CompatUtils.getMethod("getSheared", atreClass);
		
		// Steppe Wolf
		steppeWolfClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityCanisCampestris");
		
		RenderingRegistry.registerEntityRenderingHandler(atreClass, new RenderNewOvisAtre());
		RenderingRegistry.registerEntityRenderingHandler(steppeWolfClass, new RenderNewSteppeWolf());
	}
	
}
