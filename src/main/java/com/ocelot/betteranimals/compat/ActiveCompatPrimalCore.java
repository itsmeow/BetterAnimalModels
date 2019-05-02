package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBlackBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewBrownBear;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.primal.RenderNewSteppeWolf;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import nmd.primal.core.common.entities.living.EntityBlackBear;
import nmd.primal.core.common.entities.living.EntityBrownBear;
import nmd.primal.core.common.entities.living.EntityCanisCampestris;
import nmd.primal.core.common.entities.living.EntityOvisAtre;

public class ActiveCompatPrimalCore implements ModInteropProxy {

	@Override
	public boolean register() {

		if(BetterAnimalsConfig.enableOvisAtre_primalcore)
			CompatUtils.reg(EntityOvisAtre.class, RenderNewOvisAtre::new);
		if(BetterAnimalsConfig.enableSteppeWolf_primalcore)
			CompatUtils.reg(EntityCanisCampestris.class, RenderNewSteppeWolf::new);
		if(BetterAnimalsConfig.enableBrownBear_primalcore)
			CompatUtils.reg(EntityBrownBear.class, RenderNewBrownBear::new);
		if(BetterAnimalsConfig.enableBlackBear_primalcore)
			CompatUtils.reg(EntityBlackBear.class, RenderNewBlackBear::new);
		return true;
	}

}
