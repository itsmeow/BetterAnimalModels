package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.brownmooshrooms.RenderNewBrownMooshroom;

import quaternary.brownmooshrooms.EntityBrownMooshroom;

public class ActiveCompatBrownMooshrooms implements ModInteropProxy {

	@Override
	public void register() {
		CompatUtils.reg(EntityBrownMooshroom.class, new RenderNewBrownMooshroom());
	}

}
