package com.ocelot.betteranimals.client;

import com.ocelot.betteranimals.client.render.RenderNewCaveSpider;
import com.ocelot.betteranimals.client.render.RenderNewChicken;
import com.ocelot.betteranimals.client.render.RenderNewCow;
import com.ocelot.betteranimals.client.render.RenderNewPig;
import com.ocelot.betteranimals.client.render.RenderNewSheep;
import com.ocelot.betteranimals.client.render.RenderNewSilverfish;
import com.ocelot.betteranimals.client.render.RenderNewSpider;
import com.ocelot.betteranimals.client.render.RenderNewWolf;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void init() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, new RenderNewCow());
		RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, new RenderNewPig());
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, new RenderNewChicken());
		RenderingRegistry.registerEntityRenderingHandler(EntitySheep.class, new RenderNewSheep());
		RenderingRegistry.registerEntityRenderingHandler(EntityWolf.class, new RenderNewWolf());

		// Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntitySpider.class, new RenderNewSpider());
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveSpider.class, new RenderNewCaveSpider());
		RenderingRegistry.registerEntityRenderingHandler(EntitySilverfish.class, new RenderNewSilverfish());
	}
}
