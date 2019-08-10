package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;
import com.ocelot.betteranimals.client.render.entity.layer.LayerNewMooshroomMushroom;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.util.ResourceLocation;

public class RenderNewMooshroom extends net.minecraft.client.renderer.entity.MobRenderer<EntityMooshroom>
{
    private static final ResourceLocation MOOSHROOM_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom.png");

    public RenderNewMooshroom(EntityRendererManager m)
    {
        super(m, new ModelNewCow(), 0.7F);
        this.addLayer(new LayerNewMooshroomMushroom(this));
    }
    
    @Override
	protected void preRenderCallback(EntityMooshroom entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scaled(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translated(0, 0.15D, 0);
		}
	}
    
    public ModelNewCow getMainModel() {
    	return (ModelNewCow) super.getMainModel();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMooshroom entity)
    {
        return MOOSHROOM_TEXTURES;
    }
}