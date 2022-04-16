package dev.itsmeow.betteranimalmodels.forge.compat;

/*
import dev.itsmeow.betteranimalmodels.client.Replacements;
import dev.itsmeow.imdlib.util.config.ConfigBuilder;
import vazkii.quark.content.client.module.VariantAnimalTexturesModule;

import java.util.function.Supplier;
*/

import dev.itsmeow.imdlib.util.config.ConfigBuilder;

public class QuarkHooks {

    /*
    private static Supplier<Boolean> cow;
    private static Supplier<Boolean> pig;
    private static Supplier<Boolean> chicken;
    */

    public static void initConfig(ConfigBuilder builder) {
        /*
        builder.push("quark_compat");
        cow = builder.define("use_quark_cow", "enable copying quark's behavior. minecraft/replace_cow must be enabled as well. Quark's Variant Animal Textures must be disabled.", true);
        pig = builder.define("use_quark_pig", "enable copying quark's behavior. minecraft/replace_pig must be enabled as well. Quark's Variant Animal Textures must be disabled.", true);
        chicken = builder.define("use_quark_chicken", "enable copying quark's behavior. minecraft/replace_chicken must be enabled as well. Quark's Variant Animal Textures must be disabled.", true);
        builder.pop();
        */
    }

    public static void configLoad() {
        /*
        VariantAnimalTexturesModule.enableCow = !cow.get();
        VariantAnimalTexturesModule.enablePig = !pig.get();
        VariantAnimalTexturesModule.enableChicken = !chicken.get();
        if(cow.get()) {
            Replacements.cow = r -> Replacements.cow_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.COW));
        }
        if(pig.get()) {
            Replacements.pig = r -> Replacements.pig_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.PIG));
        }
        if(chicken.get()) {
            Replacements.chicken = r -> Replacements.chicken_f.apply(r).tMappedRaw(e -> QuarkUtil.getTextureOrShiny(e, QuarkUtil.VariantTextureType.CHICKEN));
        }
        Replacements.initCowPigChicken();
        */
    }

}