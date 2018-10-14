package com.ocelot.betteranimals.compat;

import java.lang.reflect.Method;

import com.ocelot.betteranimals.client.render.entity.RenderNewOvisAtre;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class ActiveCompatPrimalCore implements ModInteropProxyPrimalCore {
	
	public static Class atreClass = null;
	public static Method shearMethod;
	
	@Override
	public void primalcore_register() {
		try {
			EntityEntry ovisatreentry = EntityRegistry.getEntry(
					Class.forName("nmd.primal.core.common.entities.living.EntityOvisAtre").asSubclass(EntityLiving.class)
			);
			atreClass = ovisatreentry.getEntityClass();
			try {
				shearMethod = atreClass.getMethod("getSheared");
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			System.out.println("Found class " + atreClass);
			RenderingRegistry.registerEntityRenderingHandler(atreClass, new RenderNewOvisAtre());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
