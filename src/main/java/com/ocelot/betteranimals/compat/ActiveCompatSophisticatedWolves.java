package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.sophisticatedwolves.RenderNewSophisticatedWolf;

import sophisticated_wolves.entity.EntitySophisticatedWolf;

public class ActiveCompatSophisticatedWolves implements ModInteropProxy {

	@Override
	public void register() {
		CompatUtils.reg(EntitySophisticatedWolf.class, new RenderNewSophisticatedWolf());
	}

}
