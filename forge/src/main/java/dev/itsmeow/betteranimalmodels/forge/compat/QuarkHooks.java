package dev.itsmeow.betteranimalmodels.forge.compat;

import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.imdlib.util.config.ConfigBuilder;
import net.minecraft.resources.ResourceLocation;
import vazkii.quark.content.client.module.VariantAnimalTexturesModule;

import java.util.function.Supplier;

public class QuarkHooks {

    private static Supplier<Boolean> cow;
    private static Supplier<Boolean> pig;
    private static Supplier<Boolean> chicken;
    private static Supplier<Boolean> dolphin;
    private static final ResourceLocation DOLPHIN_DEFAULT = new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/dolphin.png");

    public static void initConfig(ConfigBuilder builder) {
        builder.push("quark_compat");
        cow = builder.define("override_quark_cow", "use our own Quark-like variant textures. minecraft/replace_cow must be enabled as well.", true);
        pig = builder.define("override_quark_pig", "use our own Quark-like variant textures. minecraft/replace_pig must be enabled as well.", true);
        chicken = builder.define("override_quark_chicken", "use our own Quark-like textures. minecraft/replace_chicken must be enabled as well.", true);
        dolphin = builder.define("override_quark_dolphin", "adds a shiny variant of our own. minecraft/replace_dolphin must be enabled as well.", true);
        builder.pop();
    }

    public static void preQuark() {
        if (VariantAnimalTexturesModule.enableCow && Replacements.H.getEnabledAndLoaded("minecraft", "cow") && cow.get())
            VariantAnimalTexturesModule.enableCow = false;
        if (VariantAnimalTexturesModule.enablePig && Replacements.H.getEnabledAndLoaded("minecraft", "pig") && pig.get())
            VariantAnimalTexturesModule.enablePig = false;
        if (VariantAnimalTexturesModule.enableChicken && Replacements.H.getEnabledAndLoaded("minecraft", "chicken") && chicken.get())
            VariantAnimalTexturesModule.enableChicken = false;
        if (VariantAnimalTexturesModule.enableShinyDolphin && Replacements.H.getEnabledAndLoaded("minecraft", "dolphin") && dolphin.get())
            VariantAnimalTexturesModule.enableShinyDolphin = false;
        if (VariantAnimalTexturesModule.enableLGBTBees && Replacements.H.getEnabledAndLoaded("minecraft", "bee"))
            VariantAnimalTexturesModule.enableLGBTBees = false;
    }

    public static void configLoad() {
        if(cow.get()) {
            Replacements.cow = r -> Replacements.cow_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.COW));
        }
        if(pig.get()) {
            Replacements.pig = r -> Replacements.pig_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.PIG));
        }
        if(chicken.get()) {
            Replacements.chicken = r -> Replacements.chicken_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.CHICKEN));
        }
        if(dolphin.get()) {
            Replacements.dolphin = r -> Replacements.dolphin_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.DOLPHIN, () -> DOLPHIN_DEFAULT));
        }
        Replacements.initQuarkReplaces();
    }

}