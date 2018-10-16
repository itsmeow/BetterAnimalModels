package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;
import com.ocelot.betteranimals.client.render.entity.RenderNewEvilAbyssalMob;

import net.minecraft.util.ResourceLocation;

public class ActiveCompatAbyssalCraft implements ModInteropProxy {
	
	@Override
	public void register() {
		Class evilPig = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilpig");
		if(evilPig == null) {
			CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilPig");
		}
		
		
		
		CompatUtils.reg(evilPig, new RenderNewEvilAbyssalMob(new ModelNewPig(), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png")));
	}

}
