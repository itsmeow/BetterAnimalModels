package com.ocelot.betteranimals.client;

import com.ocelot.betteranimals.client.model.ModelNewChicken;
import com.ocelot.betteranimals.client.model.ModelNewPig;
import com.ocelot.betteranimals.client.model.ModelNewSheep;
import com.ocelot.betteranimals.client.model.ModelNewSpider;
import com.ocelot.betteranimals.client.render.RenderNewCaveSpider;
import com.ocelot.betteranimals.client.render.RenderNewChicken;
import com.ocelot.betteranimals.client.render.RenderNewCow;
import com.ocelot.betteranimals.client.render.RenderNewPig;
import com.ocelot.betteranimals.client.render.RenderNewSheep;
import com.ocelot.betteranimals.client.render.RenderNewSpider;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void init() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCow.class, new RenderNewCow());
		RenderingRegistry.registerEntityRenderingHandler(EntityPig.class, new RenderNewPig());
		RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, new RenderNewChicken());
		RenderingRegistry.registerEntityRenderingHandler(EntitySheep.class, new RenderNewSheep());

		// Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntitySpider.class, new RenderNewSpider());
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveSpider.class, new RenderNewCaveSpider(Minecraft.getMinecraft().getRenderManager(), new ModelNewSpider(), 0.4f));
	}
}
