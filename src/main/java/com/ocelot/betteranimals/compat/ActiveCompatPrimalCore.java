package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBlackBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBrownBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewSteppeWolf;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ActiveCompatPrimalCore implements ModInteropProxy {

	public static Class atreClass = null;
	public static Method shearMethod;

	public static Class steppeWolfClass = null;

	public static Class brownBearClass = null;
	public static Class blackBearClass = null;

	@Override
	public void register() {
		//Ovis Atre
		atreClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityOvisAtre");
		shearMethod = CompatUtils.getMethod("getSheared", atreClass);

		// Steppe Wolf
		steppeWolfClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityCanisCampestris");

		brownBearClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityBrownBear");

		blackBearClass = CompatUtils.getClassForEntity("nmd.primal.core.common.entities.living.EntityBlackBear");

		if(BetterAnimalsConfig.enableOvisAtre_primalcore)
			CompatUtils.reg(atreClass, new RenderNewOvisAtre());
		if(BetterAnimalsConfig.enableSteppeWolf_primalcore)
			CompatUtils.reg(steppeWolfClass, new RenderNewSteppeWolf());
		if(BetterAnimalsConfig.enableBrownBear_primalcore)
			CompatUtils.reg(brownBearClass, new RenderNewBrownBear());
		if(BetterAnimalsConfig.enableBlackBear_primalcore)
			CompatUtils.reg(blackBearClass, new RenderNewBlackBear());
	}

}
