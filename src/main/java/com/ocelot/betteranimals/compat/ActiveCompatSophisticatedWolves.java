package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewOvisAtre;
import com.ocelot.betteranimals.client.render.entity.RenderNewSophisticatedWolf;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ActiveCompatSophisticatedWolves implements ModInteropProxySophisticatedWolves {

	public static Class wolfClass = null;
	public static Method speciesMethod = null;
	public static Method angryMethod = null;
	public static Method tamedMethod = null;
	public static Class wolfEnum = null;
	public static Object[] enums = null;
	public static Method tailRotateMethod = null;

	@Override
	public void sophisticatedwolves_register() {
		wolfClass = CompatUtils.registerClassRenderer("sophisticated_wolves.entity.EntitySophisticatedWolf", new RenderNewSophisticatedWolf());
		speciesMethod = CompatUtils.getMethod("getSpecies", wolfClass);
		angryMethod = CompatUtils.getMethod("isAngry", wolfClass);
		tamedMethod = CompatUtils.getMethod("isTamed", wolfClass);
		tailRotateMethod = CompatUtils.getMethod("getTailRotation", wolfClass);

		try {
			wolfEnum = Class.forName("sophisticated_wolves.api.EnumWolfSpecies").asSubclass(Enum.class);
			enums = wolfEnum.getEnumConstants();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
