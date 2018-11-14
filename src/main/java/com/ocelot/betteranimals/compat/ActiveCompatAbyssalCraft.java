package com.ocelot.betteranimals.compat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewAntiSpider;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilChicken;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilCow;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilPig;
import com.ocelot.betteranimals.client.render.entity.abyssal.RenderNewEvilSheep;

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
		Class antiSheep = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSheep");
		antiSpider = CompatUtils.getClassForEntity("com.shinoow.abyssalcraft.common.entity.anti.EntityAntiSpider");
		
		CompatUtils.getMethod("isBesideClimbableBlock", antiSpider);
		
		CompatUtils.reg(evilPig, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png")));
		CompatUtils.reg(evilCow, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png")));
		CompatUtils.reg(evilSheep, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep_fur.png")));
		CompatUtils.reg(evilChicken, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png"), evilChicken));
		
		CompatUtils.reg(demonPig, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_pig.png")));
		CompatUtils.reg(demonCow, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_cow.png")));
		CompatUtils.reg(demonSheep, new RenderNewEvilSheep(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep.png"), new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep_fur.png")));
		CompatUtils.reg(demonChicken, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_chicken.png"), demonChicken));
		
		CompatUtils.reg(antiPig, new RenderNewEvilPig(new ResourceLocation(BetterAnimals.MODID, "textures/abyssalcraft/anti/antipig.png")));
		CompatUtils.reg(antiCow, new RenderNewEvilCow(new ResourceLocation(BetterAnimals.MODID, "textures/abyssalcraft/anti/anticow.png")));
		CompatUtils.reg(antiChicken, new RenderNewEvilChicken(new ResourceLocation(BetterAnimals.MODID, "textures/abyssalcraft/anti/antichicken.png"), antiChicken));
		CompatUtils.reg(antiSpider, new RenderNewAntiSpider(new ResourceLocation(BetterAnimals.MODID, "textures/abyssalcraft/anti/antispider.png"), new ResourceLocation(BetterAnimals.MODID, "textures/abyssalcraft/anti/antispider_eyes.png")));
	}

}
