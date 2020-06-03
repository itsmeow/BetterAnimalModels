package dev.itsmeow.betteranimals.client;

import com.mushroom.midnight.common.entity.creature.NightStagEntity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.BetterAnimalsConfig;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewCat;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewCaveSpider;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewChicken;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewCow;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewFox;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewMooshroom;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewOcelot;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewPig;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewPolarBear;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewSheep;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewSilverfish;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewSpider;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewSquid;
import dev.itsmeow.betteranimals.client.render.entity.RenderNewWolf;
import dev.itsmeow.betteranimals.client.render.entity.midnight.RenderNewNightstag;
import dev.itsmeow.betteranimals.client.render.entity.quark.RenderNewQuarkChicken;
import dev.itsmeow.betteranimals.client.render.entity.quark.RenderNewQuarkCow;
import dev.itsmeow.betteranimals.client.render.entity.quark.RenderNewQuarkPig;
import dev.itsmeow.imdlib.client.IMDLibClient;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.RegistrationTime;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.ReplaceDefinition;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraftforge.fml.ModList;

public class Replacements {

    public static final ModelReplacementHandler HANDLER = IMDLibClient.getReplacementHandler(BetterAnimals.MODID);
    
    public static void addReplaces() {
        HANDLER.addAction(RegistrationTime.CLIENTSETUP, "minecraft", () -> () -> {
            boolean quarkLoaded = ModList.get().isLoaded("quark");
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideCow.get()) {
                HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cow", () -> () -> new ReplaceDefinition<>(CowEntity.class, RenderNewCow::new));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverridePig.get()) {
                HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "pig", () -> () -> new ReplaceDefinition<>(PigEntity.class, RenderNewPig::new));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideChicken.get()) {
                HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "chicken", () -> () -> new ReplaceDefinition<>(ChickenEntity.class, RenderNewChicken::new));
            }

        });
        HANDLER.addAction(RegistrationTime.CLIENTSETUP, "quark", () -> () -> {
            if(BetterAnimalsConfig.enableQuarkOverrideCow.get())
                HANDLER.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "cow", () -> () -> new ReplaceDefinition<>(CowEntity.class, RenderNewQuarkCow::new));
            if(BetterAnimalsConfig.enableQuarkOverridePig.get())
                HANDLER.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "pig", () -> () -> new ReplaceDefinition<>(PigEntity.class, RenderNewQuarkPig::new));
            if(BetterAnimalsConfig.enableQuarkOverrideChicken.get())
                HANDLER.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "chicken", () -> () -> new ReplaceDefinition<>(ChickenEntity.class, RenderNewQuarkChicken::new));
        });

        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "sheep", () -> () -> new ReplaceDefinition<>(SheepEntity.class, RenderNewSheep::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "wolf", () -> () -> new ReplaceDefinition<>(WolfEntity.class, RenderNewWolf::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "mooshroom", () -> () -> new ReplaceDefinition<>(MooshroomEntity.class, RenderNewMooshroom::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "squid", () -> () -> new ReplaceDefinition<>(SquidEntity.class, RenderNewSquid::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "spider", () -> () -> new ReplaceDefinition<>(SpiderEntity.class, RenderNewSpider::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cavespider", () -> () -> new ReplaceDefinition<>(CaveSpiderEntity.class, RenderNewCaveSpider::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "silverfish", () -> () -> new ReplaceDefinition<>(SilverfishEntity.class, RenderNewSilverfish::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "polarbear", () -> () -> new ReplaceDefinition<>(PolarBearEntity.class, RenderNewPolarBear::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "ocelot", () -> () -> new ReplaceDefinition<>(OcelotEntity.class, RenderNewOcelot::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cat", () -> () -> new ReplaceDefinition<>(CatEntity.class, RenderNewCat::new));
        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "fox", () -> () -> new ReplaceDefinition<>(FoxEntity.class, RenderNewFox::new));

        HANDLER.addReplace(RegistrationTime.MODELREGISTRY, "midnight", "nightstag", () -> () -> MidnightReplaces.NIGHTSTAG);
    }

    public static class MidnightReplaces {
        public static final ReplaceDefinition<NightStagEntity> NIGHTSTAG = new ReplaceDefinition<NightStagEntity>(NightStagEntity.class, RenderNewNightstag::new);
    }

}
