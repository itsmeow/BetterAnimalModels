package dev.itsmeow.betteranimals.compat;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.google.common.base.Supplier;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;

import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.quark.client.module.VariantAnimalTexturesModule;

public class QuarkUtil {

    private static ListMultimap<VariantTextureType, String> textures;
    private static Map<VariantTextureType, String> shinyTextures;

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

    @OnlyIn(Dist.CLIENT)
    public static String getTextureOrShiny(Entity e, VariantTextureType type) {
        return getTextureOrShiny(e, type, () -> getRandomTexture(e, type));
    }

    @OnlyIn(Dist.CLIENT)
    public static String getTextureOrShiny(Entity e, VariantTextureType type, Supplier<String> nonShiny) {
        UUID id = e.getUniqueID();
        long most = id.getMostSignificantBits();
        if(VariantAnimalTexturesModule.shinyAnimalChance > 0 && (most % VariantAnimalTexturesModule.shinyAnimalChance) == 0)
            return shinyTextures.get(type);

        return nonShiny.get();
    }

    @OnlyIn(Dist.CLIENT)
    private static String getRandomTexture(Entity e, VariantTextureType type) {
        List<String> styles = textures.get(type);

        UUID id = e.getUniqueID();
        long most = id.getMostSignificantBits();
        int choice = Math.abs((int) (most % styles.size()));
        return styles.get(choice);
    }

    @OnlyIn(Dist.CLIENT)
    private static void registerTextures(VariantTextureType type, int count, String vanilla) {
        String name = type.name().toLowerCase();
        for(int i = 1; i < count + 1; i++)
            textures.put(type, String.format("quark/%s%d", name, i));

        if(vanilla != null)
            textures.put(type, vanilla);
        shinyTextures.put(type, String.format("quark/%s_shiny", name));
    }

    public enum VariantTextureType {
        COW, PIG, CHICKEN
    }

}
