package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiSpider;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewDemonChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilSheep;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiChicken;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiCow;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiPig;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSpider;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonChicken;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonCow;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonPig;
import com.shinoow.abyssalcraft.common.entity.demon.EntityDemonSheep;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilChicken;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilCow;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilSheep;
import com.shinoow.abyssalcraft.common.entity.demon.EntityEvilpig;

import net.minecraft.util.ResourceLocation;

public class ActiveCompatAbyssalCraft implements ModInteropProxy {

	@Override
	public void register() {
		if(BetterAnimalsConfig.enableEvilPig)
			CompatUtils.reg(EntityEvilpig.class, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png")));
		if(BetterAnimalsConfig.enableEvilCow)
			CompatUtils.reg(EntityEvilCow.class, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png")));
		if(BetterAnimalsConfig.enableEvilSheep)
			CompatUtils.reg(EntityEvilSheep.class, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep_fur.png")));
		if(BetterAnimalsConfig.enableEvilChicken)
			CompatUtils.reg(EntityEvilChicken.class, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png")));

		if(BetterAnimalsConfig.enableDemonPig)
			CompatUtils.reg(EntityDemonPig.class, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_pig.png")));
		if(BetterAnimalsConfig.enableDemonCow)
			CompatUtils.reg(EntityDemonCow.class, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_cow.png")));
		if(BetterAnimalsConfig.enableDemonSheep)
			CompatUtils.reg(EntityDemonSheep.class, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep_fur.png")));
		if(BetterAnimalsConfig.enableDemonChicken)
			CompatUtils.reg(EntityDemonChicken.class, new RenderNewDemonChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_chicken.png")));

		if(BetterAnimalsConfig.enableAntiPig)
			CompatUtils.reg(EntityAntiPig.class, new RenderNewAntiPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antipig.png")));
		if(BetterAnimalsConfig.enableAntiCow)
			CompatUtils.reg(EntityAntiCow.class, new RenderNewAntiCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/anticow.png")));
		if(BetterAnimalsConfig.enableAntiChicken)
			CompatUtils.reg(EntityAntiChicken.class, new RenderNewAntiChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antichicken.png")));
		if(BetterAnimalsConfig.enableAntiSpider)
			CompatUtils.reg(EntityAntiSpider.class, new RenderNewAntiSpider(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider_eyes.png")));
	}

}
