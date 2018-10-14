package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewCow;
import com.ocelot.betteranimals.client.render.layer.LayerNewMooshroomMushroom;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerMooshroomMushroom;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.util.ResourceLocation;

public class RenderNewMooshroom extends RenderLiving<EntityMooshroom>
{
    private static final ResourceLocation MOOSHROOM_TEXTURES = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/mooshroom.png");

    public RenderNewMooshroom()
    {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelNewCow(), 0.7F);
        this.addLayer(new LayerNewMooshroomMushroom(this));
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