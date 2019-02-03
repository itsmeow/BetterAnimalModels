package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.brownmooshrooms.RenderNewBrownMooshroom;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import quaternary.brownmooshrooms.EntityBrownMooshroom;

public class ActiveCompatBrownMooshrooms implements ModInteropProxy {

	@Override
	public void register() {
		if(BetterAnimalsConfig.enableBrownMushroom)
			CompatUtils.reg(EntityBrownMooshroom.class, new RenderNewBrownMooshroom());
	}

}
