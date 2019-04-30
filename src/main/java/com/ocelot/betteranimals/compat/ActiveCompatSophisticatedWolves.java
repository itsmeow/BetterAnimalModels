package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.sophisticatedwolves.RenderNewSophisticatedWolf;

import sophisticated_wolves.entity.EntitySophisticatedWolf;

public class ActiveCompatSophisticatedWolves implements ModInteropProxy {

	@Override
	public boolean register() {
		CompatUtils.reg(EntitySophisticatedWolf.class, m -> new RenderNewSophisticatedWolf());
		return true;
	}

}
