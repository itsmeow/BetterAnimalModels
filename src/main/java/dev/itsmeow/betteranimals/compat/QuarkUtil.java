package dev.itsmeow.betteranimals.compat;

import java.util.List;
import java.util.UUID;

import com.google.common.collect.ListMultimap;
import dev.itsmeow.betteranimals.BetterAnimals;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class QuarkUtil {

    public static ListMultimap<RandomTextureType, ResourceLocation> textures;

    /*
     * This code is from Quark except the resource dirs which were changed:
     */

    @SideOnly(Side.CLIENT)
    public static ResourceLocation getRandomTexture(Entity e, RandomTextureType type) {
        return getRandomTexture(e, type, true);
    }

    @SideOnly(Side.CLIENT)
    public static ResourceLocation getRandomTexture(Entity e, RandomTextureType type, boolean choose) {
        List<ResourceLocation> styles = textures.get(type);
        if(!choose)
            return styles.get(styles.size() - 1);

        UUID id = e.getUniqueID();
        int choice = Math.abs((int) (id.getMostSignificantBits() % styles.size()));
        return styles.get(choice);
    }

    public static void registerTextures(RandomTextureType type, int count, ResourceLocation vanilla) {
        String name = type.name().toLowerCase();
        for(int i = 1; i < count + 1; i++)
            textures.put(type, new ResourceLocation(BetterAnimals.MODID, String.format("textures/mobs/quark/%s%d.png", name, i)));

        if(vanilla != null)
            textures.put(type, vanilla);
    }
    
    // Use our own so not to classload
    public static enum RandomTextureType {
        COW, PIG, CHICKEN, CHICK
    }

}
