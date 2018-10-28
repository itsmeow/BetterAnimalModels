package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.sophisticatedwolves.RenderNewSophisticatedWolf;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ActiveCompatSophisticatedWolves implements ModInteropProxy {

	public static Class wolfClass = null;
	public static Method speciesMethod = null;

	public static Class wolfEnum = null;
	public static Object[] enums = null;
	public static Method tailRotateMethod = null;

	@Override
	public void register() {
		wolfClass = CompatUtils.getClassForEntity("sophisticated_wolves.entity.EntitySophisticatedWolf");
		speciesMethod = CompatUtils.getMethod("getSpecies", wolfClass);
		tailRotateMethod = CompatUtils.getMethod("getTailRotation", wolfClass);
		if(tailRotateMethod == null) {
			tailRotateMethod = CompatUtils.getMethod("func_70920_v", wolfClass);
		}
		try {
			wolfEnum = Class.forName("sophisticated_wolves.api.EnumWolfSpecies").asSubclass(Enum.class);
			enums = wolfEnum.getEnumConstants();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		CompatUtils.reg(wolfClass, new RenderNewSophisticatedWolf());
	}

}
