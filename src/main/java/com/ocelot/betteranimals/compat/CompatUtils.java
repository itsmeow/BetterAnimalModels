package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewSteppeWolf;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CompatUtils {
	
	public static Class getClassForEntity(String classpath) {
		try {
			EntityEntry entry = EntityRegistry.getEntry(
					Class.forName(classpath).asSubclass(EntityLiving.class)
					);
			Class entryClass = entry.getEntityClass();
			System.out.println("Found class " + entryClass);
			return entryClass;
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Method getMethod(String name, Class theClass) {
		try {
			Method method = theClass.getMethod(name);
			System.out.println("Retrieved method: " + method);
			return method;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void reg(Class theClass, RenderLiving renderer) {
		RenderingRegistry.registerEntityRenderingHandler(theClass, renderer);
	}
	
}
