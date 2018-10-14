package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.client.model.ModelNewWolf;
import com.ocelot.betteranimals.compat.ActiveCompatSophisticatedWolves;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import static com.ocelot.betteranimals.compat.ActiveCompatSophisticatedWolves.speciesMethod;
import static com.ocelot.betteranimals.compat.ActiveCompatSophisticatedWolves.wolfClass;

import java.lang.reflect.InvocationTargetException;

import com.ocelot.betteranimals.BetterAnimals;

import static com.ocelot.betteranimals.compat.ActiveCompatSophisticatedWolves.enums;
import static com.ocelot.betteranimals.compat.ActiveCompatSophisticatedWolves.tailRotateMethod;

public class RenderNewSophisticatedWolf extends RenderLiving {

	private static final ResourceLocation BROWN_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown.png");
	private static final ResourceLocation BROWN_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown_tame.png");
	private static final ResourceLocation BROWN_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/brown/wolf_brown_angry.png");

	private static final ResourceLocation BLACK_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black.png");
	private static final ResourceLocation BLACK_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black_tame.png");
	private static final ResourceLocation BLACK_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/black/wolf_black_angry.png");

	private static final ResourceLocation FOREST_WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest.png");
	private static final ResourceLocation FOREST_WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest_tame.png");
	private static final ResourceLocation FOREST_WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/sophisticatedwolves/forest/wolf_forest_angry.png");
	
	private static final ResourceLocation WOLF = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf.png");
	private static final ResourceLocation WOLF_TAME = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_tame.png");
	private static final ResourceLocation WOLF_ANGRY = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/wolf/wolf_angry.png");
	
	public RenderNewSophisticatedWolf() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelNewWolf(), 0.4F);
	}
	
	/**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase livingBase, float partialTicks)
    {
    	Object wolf = wolfClass.cast(livingBase);
    	try {
			return (float) tailRotateMethod.invoke(wolf);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
    	return -0.6829473363053812F; // Default value in model
    }
    
    @Override
	protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime) {
		if (getMainModel().isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityWolf entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        if (entity.isWolfWet())
        {
            float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
            GlStateManager.color(f, f, f);
        }

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		try {
			Object wolf = wolfClass.cast(entity);
			EntityWolf wolfForm = (EntityWolf) wolf;
			if (speciesMethod.invoke(wolf) == enums[3]) {
				if (wolfForm.isTamed())
					return BROWN_WOLF_TAME;
				if (wolfForm.isAngry())
					return BROWN_WOLF_ANGRY;
				else
					return BROWN_WOLF;
			}
			if (speciesMethod.invoke(wolf) == enums[2]) {
				if (wolfForm.isTamed())
					return BLACK_WOLF_TAME;
				if (wolfForm.isAngry())
					return BLACK_WOLF_ANGRY;
				else
					return BLACK_WOLF;
			}
			if (speciesMethod.invoke(wolf) == enums[1]) {
				if (wolfForm.isTamed())
					return FOREST_WOLF_TAME;
				if (wolfForm.isAngry())
					return FOREST_WOLF_ANGRY;
				else
					return FOREST_WOLF;
			} else if(speciesMethod.invoke(wolf) == enums[0]){
				if (wolfForm.isTamed())
					return WOLF_TAME;
				if (wolfForm.isAngry())
					return WOLF_ANGRY;
				else
					return WOLF;
			} else {
				return WOLF;
			}
		} catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			return WOLF;
		}
	}
}
