package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiSpider;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilSheep;
import com.ocelot.betteranimals.config.BetterAnimalsConfig;

import net.minecraft.util.ResourceLocation;

public class ActiveCompatAbyssalCraft implements ModInteropProxy {

	public static Class antiSpider = null;
	public static Method spiderAsideClimbableBlock = null;

	@Override
	public void register() {
		Class evilPig = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilpig");
		if(evilPig == null) {
			CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilPig");
		}
		Class evilCow = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilCow");
		Class evilChicken = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilChicken");
		Class evilSheep = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityEvilSheep");

		Class demonPig = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityDemonPig");
		Class demonCow = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityDemonCow");
		Class demonChicken = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityDemonChicken");
		Class demonSheep = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.demon.EntityDemonSheep");

		Class antiPig = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiPig");
		Class antiCow = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiCow");
		Class antiChicken = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiChicken");
		antiSpider = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSpider");

		spiderAsideClimbableBlock = CompatUtils.getMethod("isBesideClimbableBlock", antiSpider);

		if(BetterAnimalsConfig.enableEvilPig)
			CompatUtils.reg(evilPig, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png")));
		if(BetterAnimalsConfig.enableEvilCow)
			CompatUtils.reg(evilCow, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png")));
		if(BetterAnimalsConfig.enableEvilSheep)
			CompatUtils.reg(evilSheep, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep_fur.png")));
		if(BetterAnimalsConfig.enableEvilChicken)
			CompatUtils.reg(evilChicken, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png"), evilChicken));

		if(BetterAnimalsConfig.enableDemonPig)
			CompatUtils.reg(demonPig, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_pig.png")));
		if(BetterAnimalsConfig.enableDemonCow)
			CompatUtils.reg(demonCow, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_cow.png")));
		if(BetterAnimalsConfig.enableDemonSheep)
			CompatUtils.reg(demonSheep, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep_fur.png")));
		if(BetterAnimalsConfig.enableDemonChicken)
			CompatUtils.reg(demonChicken, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_chicken.png"), demonChicken));

		if(BetterAnimalsConfig.enableAntiPig)
			CompatUtils.reg(antiPig, new RenderNewAntiPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antipig.png")));
		if(BetterAnimalsConfig.enableAntiCow)
			CompatUtils.reg(antiCow, new RenderNewAntiCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/anticow.png")));
		if(BetterAnimalsConfig.enableAntiChicken)
			CompatUtils.reg(antiChicken, new RenderNewAntiChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antichicken.png"), antiChicken));
		if(BetterAnimalsConfig.enableAntiSpider)
			CompatUtils.reg(antiSpider, new RenderNewAntiSpider(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider_eyes.png")));
	}

}
