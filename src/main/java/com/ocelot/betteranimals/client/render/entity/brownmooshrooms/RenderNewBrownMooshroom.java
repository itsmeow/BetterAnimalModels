package com.ocelot.betteranimals.client.render.entity.brownmooshrooms;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;
import com.ocelot.betteranimals.client.render.layer.LayerNewBrownMooshroomMushroom;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import quaternary.brownmooshrooms.EntityBrownMooshroom;

public class RenderNewBrownMooshroom extends RenderLiving<EntityBrownMooshroom>{
    private static final ResourceLocation MOOSHROOM_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom.png");

    public RenderNewBrownMooshroom()
    {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelNewCow(), 0.7F);
        this.addLayer(new LayerNewBrownMooshroomMushroom(this));
    }
    
    @Override
	protected void preRenderCallback(EntityBrownMooshroom entitylivingbaseIn, float partialTickTime) {
		if (!getMainModel().isChild) {
			GlStateManager.scale(0.80D, 0.80, 0.80);
		} else {
			GlStateManager.translate(0, 0.15D, 0);
		}
	}
    
    @Override
	public ModelNewCow getMainModel() {
    	return (ModelNewCow) super.getMainModel();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
	protected ResourceLocation getEntityTexture(EntityBrownMooshroom entity)
    {
        return MOOSHROOM_TEXTURES;
    }

}
