package com.ocelot.betteranimals.compat;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.render.entity.RenderNewSquid;
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
import com.shinoow.abyssalcraft.common.entity.EntityCoraliumSquid;
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

    public static final ResourceLocation PIG_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/pig.png");
    public static final ResourceLocation COW_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/cow.png");
    public static final ResourceLocation SHEEP_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep.png");
    public static final ResourceLocation SHEEP_LAYER_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/sheep_fur.png");
    public static final ResourceLocation CHICKEN_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/chicken.png");
    
    public static final ResourceLocation DEMON_PIG_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_pig.png");
    public static final ResourceLocation DEMON_COW_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_cow.png");
    public static final ResourceLocation DEMON_SHEEP_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep.png");
    public static final ResourceLocation DEMON_SHEEP_LAYER_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_sheep_fur.png");
    public static final ResourceLocation DEMON_CHICKEN_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/demon_chicken.png");
    
    public static final ResourceLocation ANTI_PIG_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antipig.png");
    public static final ResourceLocation ANTI_COW_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/anticow.png");
    public static final ResourceLocation ANTI_CHICKEN_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antichicken.png");
    public static final ResourceLocation ANTI_SPIDER_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider.png");
    public static final ResourceLocation ANTI_SPIDER_LAYER_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/anti/antispider_eyes.png");
    
    public static final ResourceLocation CORALIUM_SQUID_TEX = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/abyssalcraft/coraliumsquid.png");
    
	@SuppressWarnings("unchecked")
    @Override
	public boolean register() {
		if(BetterAnimalsConfig.enableEvilPig)
			CompatUtils.reg(EntityEvilpig.class, m -> new RenderNewEvilPig(m, PIG_TEX));
		if(BetterAnimalsConfig.enableEvilCow)
			CompatUtils.reg(EntityEvilCow.class, m -> new RenderNewEvilCow(m, COW_TEX));
		if(BetterAnimalsConfig.enableEvilSheep)
			CompatUtils.reg(EntityEvilSheep.class, m -> new RenderNewEvilSheep(m, SHEEP_TEX, SHEEP_LAYER_TEX));
		if(BetterAnimalsConfig.enableEvilChicken)
			CompatUtils.reg(EntityEvilChicken.class, m -> new RenderNewEvilChicken(m, CHICKEN_TEX));

		if(BetterAnimalsConfig.enableDemonPig)
			CompatUtils.reg(EntityDemonPig.class, m -> new RenderNewEvilPig(m, DEMON_PIG_TEX));
		if(BetterAnimalsConfig.enableDemonCow)
			CompatUtils.reg(EntityDemonCow.class, m -> new RenderNewEvilCow(m, DEMON_COW_TEX));
		if(BetterAnimalsConfig.enableDemonSheep)
			CompatUtils.reg(EntityDemonSheep.class, m -> new RenderNewEvilSheep(m, DEMON_SHEEP_TEX, DEMON_SHEEP_LAYER_TEX));
		if(BetterAnimalsConfig.enableDemonChicken)
			CompatUtils.reg(EntityDemonChicken.class, m -> new RenderNewDemonChicken(m, DEMON_CHICKEN_TEX));

		if(BetterAnimalsConfig.enableAntiPig)
			CompatUtils.reg(EntityAntiPig.class, m -> new RenderNewAntiPig(m, ANTI_PIG_TEX));
		if(BetterAnimalsConfig.enableAntiCow)
			CompatUtils.reg(EntityAntiCow.class, m -> new RenderNewAntiCow(m, ANTI_COW_TEX));
		if(BetterAnimalsConfig.enableAntiChicken)
			CompatUtils.reg(EntityAntiChicken.class, m -> new RenderNewAntiChicken(m, ANTI_CHICKEN_TEX));
		if(BetterAnimalsConfig.enableAntiSpider)
			CompatUtils.reg(EntityAntiSpider.class, m -> new RenderNewAntiSpider(m, ANTI_SPIDER_TEX, ANTI_SPIDER_LAYER_TEX));
		if(BetterAnimalsConfig.enableCoraliumSquid)
			CompatUtils.reg(EntityCoraliumSquid.class, m -> new RenderNewSquid(m, CORALIUM_SQUID_TEX));
		return true;
	}

}
