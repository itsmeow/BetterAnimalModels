package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.brownmooshrooms.RenderNewBrownMooshroom;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import quaternary.brownmooshrooms.EntityBrownMooshroom;

public class ActiveCompatBrownMooshrooms implements ModInteropProxy {

	@Override
	public boolean register() {
		if(BetterAnimalsConfig.enableBrownMushroom)
			CompatUtils.reg(EntityBrownMooshroom.class, RenderNewBrownMooshroom::new);
		return true;
	}

}
