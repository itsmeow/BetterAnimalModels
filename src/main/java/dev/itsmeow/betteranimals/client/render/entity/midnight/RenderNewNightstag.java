package dev.itsmeow.betteranimals.client.render.entity.midnight;

import javax.annotation.Nullable;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mushroom.midnight.client.ClientEventHandler;
import com.mushroom.midnight.client.render.entity.EmissiveLayerRenderer;
import com.mushroom.midnight.common.entity.creature.NightStagEntity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.compat.ModelNewNightstag;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderNewNightstag extends MobRenderer<NightStagEntity, ModelNewNightstag> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/midnight/nightstag.png");
    private static final ResourceLocation EMISSIVE_TEXTURE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/midnight/nightstag_glow.png");

    private static final int FLICK_BRIGHT_LOW = 50;
    private static final int FLICK_BRIGHT_UP = 200;

    private static final int PULSE_BRIGHT_LOW = 200;
    private static final int PULSE_BRIGHT_UP = 240;

    public RenderNewNightstag(EntityRendererManager manager) {
        super(manager, new ModelNewNightstag(), 0.0F);
        this.addLayer(new EmissiveLayerRenderer<NightStagEntity, ModelNewNightstag>(this, EMISSIVE_TEXTURE, RenderNewNightstag::computeBrightness, RenderNewNightstag::computeColor));
    }

    private static int computeColor(NightStagEntity entity, float partialTicks) {
        switch (entity.getAntlerType()) {
            case 1:
                return 0xff6666; // red
            case 2:
                return 0xbbff99; // green
            case 3:
                return 0x99ffff; // blue
            case 4:
                return 0xffaa80; // orange
            case 5:
                return 0xe39cdc; // pink
            case 6:
                return 0xD77CD0; // light pink
            case 7:
                return 0xf2f2f2; // white
            case 8:
                return 0x6699ff; // dark blue
            case 0: default:
                return 0x8051B6; // purple
        }
    }

    private static int computeBrightness(NightStagEntity entity, float partialTicks) {
        double totalTicks = entity.ticksExisted + partialTicks;

        float flicker = computeFlicker(totalTicks, partialTicks);
        float pulse = (float) ((Math.sin(totalTicks * 0.125) + 1.0) * 0.5F);

        float health = entity.getHealth() / entity.getMaxHealth();

        float flickerBrightness = FLICK_BRIGHT_LOW + (FLICK_BRIGHT_UP - FLICK_BRIGHT_LOW) * flicker;
        float healthyBrightness = PULSE_BRIGHT_LOW + (PULSE_BRIGHT_UP - PULSE_BRIGHT_LOW) * pulse;

        return MathHelper.floor(flickerBrightness * (1.0F - health) + healthyBrightness * health);
    }

    private static float computeFlicker(double totalTicks, float partialTicks) {
        float lerpedFlicker = ClientEventHandler.prevFlicker + (ClientEventHandler.flicker - ClientEventHandler.prevFlicker) * partialTicks;
        float pulse = (float) (Math.sin(totalTicks * 0.2) + 1.0) * 0.4F;
        return MathHelper.clamp(lerpedFlicker + pulse, 0.0F, 1.0F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(NightStagEntity entity) {
        return TEXTURE;
    }

    @Override
    protected void preRenderCallback(NightStagEntity entity, float partialTicks) {
        super.preRenderCallback(entity, partialTicks);
        if (entity.isChild()) {
            GlStateManager.scalef(0.5F, 0.5F, 0.5F);
        }
    }
}