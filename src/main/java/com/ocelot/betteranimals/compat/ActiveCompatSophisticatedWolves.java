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
		try {
			EntityEntry wolfentry = EntityRegistry.getEntry(
					Class.forName("sophisticated_wolves.entity.EntitySophisticatedWolf").asSubclass(EntityLiving.class)
			);
			wolfClass = wolfentry.getEntityClass();
			try {
				speciesMethod = wolfClass.getMethod("getSpecies");
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			try {
				angryMethod = wolfClass.getMethod("isAngry");
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			try {
				tamedMethod = wolfClass.getMethod("isTamed");
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			try {
				tailRotateMethod = wolfClass.getMethod("getTailRotation");
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			wolfEnum = Class.forName("sophisticated_wolves.api.EnumWolfSpecies").asSubclass(Enum.class);
			enums = wolfEnum.getEnumConstants();
			System.out.println("Found class " + wolfClass);
			System.out.println("Retrieved enum: " + wolfEnum);
			System.out.println("Retrieved method: " + tamedMethod);
			System.out.println("Retrieved method: " + angryMethod);
			System.out.println("Retrieved method: " + speciesMethod);
			System.out.println("Retrieved method: " + tailRotateMethod);
			
			RenderingRegistry.registerEntityRenderingHandler(wolfClass, new RenderNewSophisticatedWolf());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
