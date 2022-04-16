package dev.itsmeow.betteranimalmodels.forge.compat;

/*
import com.google.common.base.Supplier;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import vazkii.quark.content.client.module.VariantAnimalTexturesModule;

import java.util.*;
*/
public class QuarkUtil {
/*
    private static ListMultimap<VariantTextureType, ResourceLocation> textures;
    private static Map<VariantTextureType, ResourceLocation> shinyTextures;

    private static final int COW_COUNT = 10;
    private static final int PIG_COUNT = 3;
    private static final int CHICKEN_COUNT = 6;

    static {
        textures = Multimaps.newListMultimap(new EnumMap<>(VariantTextureType.class), ArrayList::new);
        shinyTextures = new HashMap<>();

        registerTextures(VariantTextureType.COW, COW_COUNT, "cow");
        registerTextures(VariantTextureType.PIG, PIG_COUNT, "pig");
        registerTextures(VariantTextureType.CHICKEN, CHICKEN_COUNT, "quark/chicken");
    }

    public static ResourceLocation getTextureOrShiny(Entity e, VariantTextureType type) {
        return getTextureOrShiny(e, type, () -> getRandomTexture(e, type));
    }

    public static ResourceLocation getTextureOrShiny(Entity e, VariantTextureType type, Supplier<ResourceLocation> nonShiny) {
        UUID id = e.getUUID();
        long most = id.getMostSignificantBits();
        if (VariantAnimalTexturesModule.shinyAnimalChance > 0 && (most % VariantAnimalTexturesModule.shinyAnimalChance) == 0)
            return shinyTextures.get(type);

        return nonShiny.get();
    }

    private static ResourceLocation getRandomTexture(Entity e, VariantTextureType type) {
        List<ResourceLocation> styles = textures.get(type);

        UUID id = e.getUUID();
        long most = id.getMostSignificantBits();
        int choice = Math.abs((int) (most % styles.size()));
        return styles.get(choice);
    }

    private static void registerTextures(VariantTextureType type, int count, String vanilla) {
        String name = type.name().toLowerCase();
        for (int i = 1; i < count + 1; i++)
            textures.put(type, tex(String.format("quark/%s%d", name, i)));

        if (vanilla != null)
            textures.put(type, tex(vanilla));
        shinyTextures.put(type, tex(String.format("quark/%s_shiny", name)));
    }

    public enum VariantTextureType {
        COW, PIG, CHICKEN
    }

    private static ResourceLocation tex(String name) {
        return new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/" + name + ".png");
    }
*/
}
