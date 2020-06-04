package dev.itsmeow.betteranimals.client;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mushroom.midnight.common.entity.creature.NightStagEntity;

import dev.itsmeow.betteranimals.BetterAnimals;
import dev.itsmeow.betteranimals.client.model.ModelNewBear;
import dev.itsmeow.betteranimals.client.model.ModelNewCat;
import dev.itsmeow.betteranimals.client.model.ModelNewChicken;
import dev.itsmeow.betteranimals.client.model.ModelNewCow;
import dev.itsmeow.betteranimals.client.model.ModelNewFox;
import dev.itsmeow.betteranimals.client.model.ModelNewPig;
import dev.itsmeow.betteranimals.client.model.ModelNewSheep;
import dev.itsmeow.betteranimals.client.model.ModelNewSilverfish;
import dev.itsmeow.betteranimals.client.model.ModelNewSpider;
import dev.itsmeow.betteranimals.client.model.ModelNewSquid;
import dev.itsmeow.betteranimals.client.model.ModelNewWolf;
import dev.itsmeow.betteranimals.client.render.entity.compat.RenderNewNightstag;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewCatCollar;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewFoxItem;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewMooshroomMushroom;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewPigSaddle;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewSheepWool;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewSpiderEyes;
import dev.itsmeow.betteranimals.client.render.entity.layer.LayerNewWolfCollar;
import dev.itsmeow.betteranimals.compat.QuarkUtil;
import dev.itsmeow.betteranimals.compat.QuarkUtil.VariantTextureType;
import dev.itsmeow.imdlib.client.IMDLibClient;
import dev.itsmeow.imdlib.client.render.ImplRenderer.RenderDef;
import dev.itsmeow.imdlib.client.render.ImplRenderer.SuperCallApplyRotations;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.RegistrationTime;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler.ReplaceDefinition;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.AgeableEntity;
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
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.ModList;

public class Replacements {

    public static final ModelReplacementHandler H = IMDLibClient.getReplacementHandler(BetterAnimals.MODID);

    public static void addReplaces() {
        // cow
        RenderDef<CowEntity, EntityModel<CowEntity>> cow = r -> r
        .childScale(AgeableEntity::isChild, 0.5F)
        .tSingle("cow").mSingle(new ModelNewCow<>());

        // pig
        RenderDef<PigEntity, EntityModel<PigEntity>> pig = r -> r
        .childScale(AgeableEntity::isChild, 0.5F)
        .layer(LayerNewPigSaddle::new)
        .tSingle("pig").mSingle(new ModelNewPig<>());

        // chicken
        RenderDef<ChickenEntity, EntityModel<ChickenEntity>> chicken = r -> r
        .childScale(AgeableEntity::isChild, 0.45F)
        .handleRotation((e, p) -> {
            float f = e.oFlap + (e.wingRotation - e.oFlap) * p;
            float f1 = e.oFlapSpeed + (e.destPos - e.oFlapSpeed) * p;
            return (MathHelper.sin(f) + 1.0F) * f1;
        })
        .tSingle("chicken").mSingle(new ModelNewChicken<>());

        H.addAction(RegistrationTime.CLIENTSETUP, "minecraft", () -> () -> {
            boolean quarkLoaded = ModList.get().isLoaded("quark");
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideCow.get()) {
                H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cow", () -> () -> H.lambdaReplace(CowEntity.class, 0.7F, cow));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverridePig.get()) {
                H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "pig", () -> () -> H.lambdaReplace(PigEntity.class, 0.7F, pig));
            }
            if(!quarkLoaded || !BetterAnimalsConfig.enableQuarkOverrideChicken.get()) {
                H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "chicken", () -> () -> H.lambdaReplace(ChickenEntity.class, 0.4F, chicken));
            }

        });
        H.addAction(RegistrationTime.CLIENTSETUP, "quark", () -> () -> {
            if(BetterAnimalsConfig.enableQuarkOverrideCow.get())
                H.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "cow", () -> () -> H.lambdaReplace(CowEntity.class, 0.7F, r -> cow.apply(r).tMapped(e -> QuarkUtil.getTextureOrShiny(e, VariantTextureType.COW))));
            if(BetterAnimalsConfig.enableQuarkOverridePig.get())
                H.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "pig", () -> () -> H.lambdaReplace(PigEntity.class, 0.7F, r -> pig.apply(r).tMapped(e -> QuarkUtil.getTextureOrShiny(e, VariantTextureType.PIG))));
            if(BetterAnimalsConfig.enableQuarkOverrideChicken.get())
                H.addReplace(RegistrationTime.CLIENTSETUP, "minecraft", "chicken", () -> () -> H.lambdaReplace(ChickenEntity.class, 0.4F, r -> chicken.apply(r).tMapped(e -> QuarkUtil.getTextureOrShiny(e, VariantTextureType.CHICKEN))));
        });

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "sheep", () -> () -> H.lambdaReplace(SheepEntity.class, 0.4F, r -> r
        .childScale(AgeableEntity::isChild, 0.5F)
        .layer(LayerNewSheepWool::new)
        .tSingle("sheep").mSingle(new ModelNewSheep<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "wolf", () -> () -> H.lambdaReplace(WolfEntity.class, 0.25F, r -> r
        .preRender((e, p) -> {
            GlStateManager.scaled(0.8D, 0.8D, 0.8D);
            if(e.isChild()) {
                GlStateManager.scaled(0.5D, 0.5D, 0.5D);
            }
            if(e.isWolfWet()) {
                float f = e.getBrightness() * e.getShadingWhileWet(p);
                GlStateManager.color3f(f, f, f);
            }
        })
        .handleRotation((e, p) -> e.getTailRotation())
        .layer(LayerNewWolfCollar::new)
        .tMapped(e -> e.isTamed() ? "wolf/wolf_tame" : (e.isAngry() ? "wolf/wolf_angry" : "wolf/wolf"))
        .mSingle(new ModelNewWolf<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "mooshroom", () -> () -> H.lambdaReplace(MooshroomEntity.class, 0.7F, r -> r
        .preRender((e, p) -> {
            if(e.isChild()) {
                GlStateManager.scalef(0.36F, 0.36F, 0.36F);
            } else {
                GlStateManager.translatef(0F, 0.15F, 0F);
            }
        })
        .layer(LayerNewMooshroomMushroom::new)
        .tCondition(e -> e.getMooshroomType() == MooshroomEntity.Type.RED, "mooshroom", "mooshroom_brown")
        .mSingle(new ModelNewCow<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "squid", () -> () -> H.lambdaReplace(SquidEntity.class, 0.7F, r -> r
        .applyRotations((e, a, rot, p) -> {
            float f = e.prevSquidPitch + (e.squidPitch - e.prevSquidPitch) * p;
            float f1 = e.prevSquidYaw + (e.squidYaw - e.prevSquidYaw) * p;
            GlStateManager.translatef(0.0F, 0.5F, 0.0F);
            GlStateManager.rotatef(180.0F - rot, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotatef(f, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotatef(f1, 0.0F, 1.0F, 0.0F);
            GlStateManager.translatef(0.0F, -1.2F, 0.0F);
        })
        .handleRotation((e, p) -> -(e.lastTentacleAngle + (e.tentacleAngle - e.lastTentacleAngle) * p))
        .tSingle("squid").mSingle(new ModelNewSquid<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "spider", () -> () -> H.lambdaReplace(SpiderEntity.class, 1F, r -> r
        .preRender((e, p) -> {
            if(e.isBesideClimbableBlock()) {
                GlStateManager.rotatef(-90, 1, 0, 0);
                GlStateManager.translatef(0.0F, 0.75F, -0.5F);
            }
        })
        .layer(LayerNewSpiderEyes::new)
        .tSingle("spider").mSingle(new ModelNewSpider<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cavespider", () -> () -> H.lambdaReplace(CaveSpiderEntity.class, 0.4F, r -> r
        .preRender((e, p) -> {
            if(e.isBesideClimbableBlock()) {
                GlStateManager.rotatef(-90, 1, 0, 0);
                GlStateManager.translatef(0.0F, 0.75F, -0.5F);
            }
            GlStateManager.scalef(0.5F, 0.5F, 0.5F);
        })
        .layer(LayerNewSpiderEyes::new)
        .tSingle("cave_spider").mSingle(new ModelNewSpider<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "silverfish", () -> () -> H.lambdaReplace(SilverfishEntity.class, 0.25F, r -> r
        .preRender((e, p) -> GlStateManager.scalef(0.5F, 0.5F, 0.5F))
        .tSingle("silverfish").mSingle(new ModelNewSilverfish<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "polarbear", () -> () -> H.lambdaReplace(PolarBearEntity.class, 0.7F, r -> r
        .childScale(AgeableEntity::isChild, 0.7F)
        .tSingle("polarbear").mSingle(new ModelNewBear<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "ocelot", () -> () -> H.lambdaReplace(OcelotEntity.class, 0.5F, r -> r
        .preRender((e, p) -> {
            GlStateManager.scaled(0.8D, 0.8D, 0.8D);
            if(e.isChild()) {
                GlStateManager.scaled(0.5D, 0.5D, 0.5D);
            }
        })
        .tSingle("cat/ocelot").mSingle(new ModelNewCat<>())));

        Map<Integer, String> catTextures = Util.make(Maps.newHashMap(), (map) -> {
            map.put(0, "cat/tabby");
            map.put(1, "cat/black");
            map.put(2, "cat/red");
            map.put(3, "cat/siamese");
            map.put(4, "cat/british_shorthair");
            map.put(5, "cat/calico");
            map.put(6, "cat/persian");
            map.put(7, "cat/ragdoll");
            map.put(8, "cat/white");
            map.put(9, "cat/jellie");
            map.put(10, "cat/all_black");
        });
        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "cat", () -> () -> H.lambdaReplace(CatEntity.class, 0.5F, r -> r
        .preRender((e, p) -> {
            GlStateManager.scaled(0.8D, 0.8D, 0.8D);
            if(e.isTamed()) {
                GlStateManager.scaled(0.9D, 0.9D, 0.9D);
            }
            if(e.isChild()) {
                GlStateManager.scaled(0.5D, 0.5D, 0.5D);
            }
        })
        .layer(LayerNewCatCollar::new)
        .tMapped(e -> catTextures.get(e.getCatType())).mSingle(new ModelNewCat<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "minecraft", "fox", () -> () -> H.<FoxEntity, ModelNewFox<FoxEntity>>lambdaReplace(FoxEntity.class, 0.4F, r -> r
        .preRender((e, p) -> {
            if(e.isChild()) {
                GlStateManager.scaled(0.5D, 0.5D, 0.5D);
            }
            if(e.isSleeping()) {
                GlStateManager.translatef(0F, 0.5F, 0F);
            }
            if(e.isSitting()) {
                GlStateManager.translatef(0F, 0.2F, 0F);
            }
        })
        .applyRotations((e, a, rot, p) -> {
            if(e.func_213480_dY() || e.isStuck()) {
                GlStateManager.rotatef(-MathHelper.lerp(p, e.prevRotationPitch, e.rotationPitch), 1.0F, 0.0F, 0.0F);
            }
        }, SuperCallApplyRotations.PRE)
        .layer(LayerNewFoxItem::new)
        .tMapped(e -> e.getVariantType() == FoxEntity.Type.RED ? (e.isSleeping() ? "fox/fox_sleep" : "fox/fox") : (e.isSleeping() ? "fox/snow_fox_sleep" : "fox/snow_fox"))
        .mSingle(new ModelNewFox<>())));

        H.addReplace(RegistrationTime.MODELREGISTRY, "midnight", "nightstag", () -> () -> MidnightReplaces.NIGHTSTAG);
    }

    public static class MidnightReplaces {
        public static final ReplaceDefinition<NightStagEntity> NIGHTSTAG = new ReplaceDefinition<NightStagEntity>(NightStagEntity.class, RenderNewNightstag::new);
    }

}
