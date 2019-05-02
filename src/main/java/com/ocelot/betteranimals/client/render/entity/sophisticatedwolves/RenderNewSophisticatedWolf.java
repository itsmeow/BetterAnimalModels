package com.ocelot.betteranimals.client.render.entity.sophisticatedwolves;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewWolf;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import sophisticated_wolves.api.EnumWolfSpecies;
import sophisticated_wolves.entity.EntitySophisticatedWolf;

public class RenderNewSophisticatedWolf extends RenderLiving<EntitySophisticatedWolf> {

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

	public RenderNewSophisticatedWolf(RenderManager m) {
		super(m, new ModelNewWolf(), 0.4F);
	}

	/**
	 * Defines what float the third param in setRotationAngles of ModelBase is
	 */
	@Override
	protected float handleRotationFloat(EntitySophisticatedWolf wolf, float partialTicks)
	{
		return wolf.getTailRotation();
	}

	@Override
	protected void preRenderCallback(EntitySophisticatedWolf wolf, float partialTickTime) {
		if (getMainModel().isChild) {
			GlStateManager.scale(0.5D, 0.5D, 0.5D);
		} else {
			GlStateManager.scale(1.0D, 1.0D, 1.0D);
		}
	}

	/**
	 * Renders the desired {@code T} type Entity.
	 */
	@Override
	public void doRender(EntitySophisticatedWolf wolf, double x, double y, double z, float entityYaw, float partialTicks)
	{
		if (wolf.isWolfWet())
		{
			float f = wolf.getBrightness() * wolf.getShadingWhileWet(partialTicks);
			GlStateManager.color(f, f, f);
		}

		super.doRender(wolf, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySophisticatedWolf wolf) {
		if(wolf.getSpecies() == EnumWolfSpecies.BROWN) {
			if(wolf.isTamed())
				return BROWN_WOLF_TAME;
			if(wolf.isAngry())
				return BROWN_WOLF_ANGRY;
			else
				return BROWN_WOLF;
		}
		if(wolf.getSpecies() == EnumWolfSpecies.BLACK) {
			if (wolf.isTamed())
				return BLACK_WOLF_TAME;
			if (wolf.isAngry())
				return BLACK_WOLF_ANGRY;
			else
				return BLACK_WOLF;
		}
		if(wolf.getSpecies() == EnumWolfSpecies.FOREST) {
			if(wolf.isTamed())
				return FOREST_WOLF_TAME;
			if(wolf.isAngry())
				return FOREST_WOLF_ANGRY;
			else
				return FOREST_WOLF;
		} else if(wolf.getSpecies() == EnumWolfSpecies.VANILLA){
			if(wolf.isTamed())
				return WOLF_TAME;
			if(wolf.isAngry())
				return WOLF_ANGRY;
			else
				return WOLF;
		} else {
			return WOLF;
		}
	}
}
