package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewBlackBear;
import com.ocelot.betteranimals.client.render.entity.RenderNewBrownBear;
import com.ocelot.betteranimals.client.render.entity.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.RenderNewSteppeWolf;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ActiveCompatPrimalCore implements ModInteropProxyPrimalCore {

	public static Class atreClass = null;
	public static Method shearMethod;

	public static Class steppeWolfClass = null;
	
	public static Class brownBearClass = null;
	public static Class blackBearClass = null;

	@Override
	public void primalcore_register() {
		//Ovis Atre
		atreClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityOvisAtre");
		shearMethod = CompatUtils.getMethod("getSheared", atreClass);
		
		// Steppe Wolf
		steppeWolfClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityCanisCampestris");
		
		brownBearClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityBrownBear");
		
		blackBearClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityBlackBear");
				
		CompatUtils.reg(atreClass, new RenderNewOvisAtre());
		CompatUtils.reg(steppeWolfClass, new RenderNewSteppeWolf());
		CompatUtils.reg(brownBearClass, new RenderNewBrownBear());
		CompatUtils.reg(blackBearClass, new RenderNewBlackBear());
	}
	
}
