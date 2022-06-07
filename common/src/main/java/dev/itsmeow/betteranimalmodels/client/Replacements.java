package dev.itsmeow.betteranimalmodels.client;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.math.Vector3f;
import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.itsmeow.betteranimalmodels.BetterAnimalModels;
import dev.itsmeow.betteranimalmodels.client.model.*;
import dev.itsmeow.betteranimalmodels.client.render.entity.layer.*;
import dev.itsmeow.imdlib.client.IMDLibClient;
import dev.itsmeow.imdlib.client.render.ImplRenderer.SuperCallApplyRotations;
import dev.itsmeow.imdlib.client.util.ModelReplacementHandler;
import net.minecraft.Util;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.animal.horse.Variant;
import net.minecraft.world.level.LightLayer;

import java.util.Map;
import java.util.function.BiConsumer;

public class Replacements {

    public static final ModelReplacementHandler H = IMDLibClient.getReplacementHandler(BetterAnimalModels.MODID);

    private static final Map<Variant, ResourceLocation> HORSE_VARIANTS = Util.make(Maps.newEnumMap(Variant.class), m -> {
        m.put(Variant.WHITE, t("horse/horse_white"));
        m.put(Variant.CREAMY, t("horse/horse_creamy"));
        m.put(Variant.CHESTNUT, t("horse/horse_chestnut"));
        m.put(Variant.BROWN, t("horse/horse_brown"));
        m.put(Variant.BLACK, t("horse/horse_black"));
        m.put(Variant.GRAY, t("horse/horse_gray"));
        m.put(Variant.DARKBROWN, t("horse/horse_darkbrown"));
    });

    public static ResourceLocation t(String s) {
        return new ResourceLocation(BetterAnimalModels.MODID, "textures/entity/" + s + ".png");
    }

    public static void init() {
        H.addReplace("minecraft", "cow", () -> () -> H.lambdaReplace(EntityType.COW, 1.2F, r -> r
        .ageScale(0.8F, 0.4F)
        .tSingle("cow").mSingle(ModelNewCow::new, "cow")));

        H.addReplace("minecraft", "pig", () -> () -> H.lambdaReplace(EntityType.PIG, 0.7F, r -> r
        .childScale(0.5F)
        .layer(LayerNewPigSaddle::new)
        .tSingle("pig").mSingle(ModelNewPig::new, "pig")));

        H.addReplace("minecraft", "chicken", () -> () -> H.lambdaReplace(EntityType.CHICKEN, 0.4F, r -> r
        .childScale(0.45F)
        .handleRotation((e, p) -> {
                float f = e.oFlap + (e.flap - e.oFlap) * p;
                float f1 = e.oFlapSpeed + (e.flapSpeed - e.oFlapSpeed) * p;
                return (Mth.sin(f) + 1.0F) * f1;
        })
        .tSingle("chicken").mSingle(ModelNewChicken::new, "chicken")));


        H.addReplace("minecraft", "sheep", () -> () -> H.lambdaReplace(EntityType.SHEEP, 0.7F, r -> r
        .childScale(0.5F)
        .layer(LayerNewSheepWool::new)
        .tMapped(e -> e.isBaby() ? "lamb" : "sheep").mSingle(ModelNewSheep::new, "sheep")));

        H.addReplace("minecraft", "wolf", () -> () -> H.lambdaReplace(EntityType.WOLF, 0.7F, r -> r
        .preRender((e, s, p) -> {
            s.scale(0.8F, 0.8F, 0.8F);
            if(e.isBaby()) {
                s.scale(0.5F, 0.5F, 0.5F);
            }
        })
        .handleRotation((e, p) -> e.getTailAngle())
        .layer(LayerNewWolfCollar::new)
        .tMapped(e -> e.isTame() ? "wolf/wolf_tame" : (e.isAngry() ? "wolf/wolf_angry" : "wolf/wolf"))
        .mSingle(ModelNewWolf::new, "wolf")));

        H.addReplace("minecraft", "mooshroom", () -> () -> H.lambdaReplace(EntityType.MOOSHROOM, 1.2F, r -> r
        .preRender((e, s, p) -> {
            if(e.isBaby()) {
                s.scale(0.36F, 0.36F, 0.36F);
            }
        })
        .layer(LayerNewMooshroomMushroom::new)
        .tCondition(e -> e.getMushroomType() == MushroomCow.MushroomType.RED, "mooshroom", "mooshroom_brown")
        .mSingle(ModelNewCow::new, "cow")));

        H.addReplace("minecraft", "squid", () -> () -> H.lambdaReplace(EntityType.SQUID, 0.7F, r -> r
        .applyRotations((e, s, a, rot, p) -> {
            float f = e.xBodyRotO + (e.xBodyRot - e.xBodyRotO) * p;
            float f1 = e.zBodyRotO + (e.zBodyRot - e.zBodyRotO) * p;
            s.translate(0.0F, 0.5F, 0.0F);
            s.mulPose(Vector3f.YP.rotationDegrees(180.0F - rot));
            s.mulPose(Vector3f.XP.rotationDegrees(f));
            s.mulPose(Vector3f.YP.rotationDegrees(f1));
            s.translate(0.0F, -1.2F, 0.0F);
        })
        .handleRotation((e, p) -> -(e.oldTentacleAngle + (e.tentacleAngle - e.oldTentacleAngle) * p))
        .tSingle("squid").mSingle(ModelNewSquid::new, "squid")));

        H.addReplace("minecraft", "glow_squid", () -> () -> H.lambdaReplace(EntityType.GLOW_SQUID, 0.7F, r -> r
        .applyRotations((e, s, a, rot, p) -> {
            float f = e.xBodyRotO + (e.xBodyRot - e.xBodyRotO) * p;
            float f1 = e.zBodyRotO + (e.zBodyRot - e.zBodyRotO) * p;
            s.translate(0.0F, 0.5F, 0.0F);
            s.mulPose(Vector3f.YP.rotationDegrees(180.0F - rot));
            s.mulPose(Vector3f.XP.rotationDegrees(f));
            s.mulPose(Vector3f.YP.rotationDegrees(f1));
            s.translate(0.0F, -1.2F, 0.0F);
        })
        .handleRotation((e, p) -> -(e.oldTentacleAngle + (e.tentacleAngle - e.oldTentacleAngle) * p))
        .blockLightLevel((glowSquid, blockPos) -> {
            int i = (int)Mth.clampedLerp(0.0F, 15.0F, 1.0F - (float)glowSquid.getDarkTicksRemaining() / 10.0F);
            return i == 15 ? 15 : Math.max(i, glowSquid.isOnFire() ? 15 : glowSquid.level.getBrightness(LightLayer.BLOCK, blockPos));
        })
        .tSingle("glow_squid").mSingle(ModelNewSquid::new, "squid")));

        H.addReplace("minecraft", "spider", () -> () -> H.lambdaReplace(EntityType.SPIDER, 1F, r -> r
        .preRender((e, s, p) -> {
            if(e.isClimbing()) {
                s.mulPose(Vector3f.XP.rotationDegrees(-90F));
                s.translate(0.0F, 0.75F, -0.5F);
            }
        })
        .layer(LayerNewSpiderEyes::new)
        .tSingle("spider").mSingle(ModelNewSpider::new, "spider")));

        H.addReplace("minecraft", "cavespider", () -> () -> H.lambdaReplace(EntityType.CAVE_SPIDER, 0.4F, r -> r
        .preRender((e, s, p) -> {
            if(e.isClimbing()) {
                s.mulPose(Vector3f.XP.rotationDegrees(-90F));
                s.translate(0.0F, 0.75F, -0.5F);
            }
            s.scale(0.5F, 0.5F, 0.5F);
        })
        .layer(LayerNewSpiderEyes::new)
        .tSingle("cave_spider").mSingle(ModelNewSpider::new, "spider")));

        H.addReplace("minecraft", "silverfish", () -> () -> H.lambdaReplace(EntityType.SILVERFISH, 0.25F, r -> r
        .preRender((e, s, p) -> s.scale(0.5F, 0.5F, 0.5F))
        .tSingle("silverfish").mSingle(ModelNewSilverfish::new, "silverfish")));

        H.addReplace("minecraft", "polar_bear", () -> () -> H.lambdaReplace(EntityType.POLAR_BEAR, 1F, r -> r
        .childScale(0.7F)
        .tSingle("polar_bear").mSingle(ModelNewPolarBear::new, "polar_bear")));

        H.addReplace("minecraft", "ocelot", () -> () -> H.lambdaReplace(EntityType.OCELOT, 0.5F, r -> r
        .preRender((e, s, p) -> {
            s.scale(0.8F, 0.8F, 0.8F);
            if(e.isBaby()) {
                s.scale(0.5F, 0.5F, 0.5F);
            }
        })
        .tSingle("cat/ocelot").mSingle(ModelNewCat::new, "cat")));

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
        H.addReplace("minecraft", "cat", () -> () -> H.lambdaReplace(EntityType.CAT, 0.5F, r -> r
        .preRender((e, s, p) -> {
            s.scale(0.8F, 0.8F, 0.8F);
            if(e.isTame()) {
                s.scale(0.9F, 0.9F, 0.9F);
            }
            if(e.isBaby()) {
                s.scale(0.5F, 0.5F, 0.5F);
            }
        })
        .layer(LayerNewCatCollar::new)
        .tMapped(e -> catTextures.get(e.getCatType())).mSingle(ModelNewCat::new, "cat")));

        H.addReplace("minecraft", "fox", () -> () -> H.<Fox, ModelNewFox<Fox>>lambdaReplace(EntityType.FOX, 0.55F, r -> r
        .preRender((e, s, p) -> {
            if(e.isBaby()) {
                s.scale(0.5F, 0.5F, 0.5F);
            }
            if(e.isSleeping()) {
                s.translate(0F, 0.5F, 0F);
            }
            if(e.isSitting()) {
                s.translate(0F, 0.2F, 0F);
            }
        })
        .applyRotations((e, s, a, rot, p) -> {
            if(e.isPouncing() || e.isFaceplanted()) {
                s.mulPose(Vector3f.XP.rotationDegrees(-Mth.lerp(p, e.xRotO, e.getXRot())));
            }
        }, SuperCallApplyRotations.PRE)
        .layer(LayerNewFoxItem::new)
        .tMapped(e -> e.getFoxType() == Fox.Type.RED ? (e.isSleeping() ? "fox/fox_sleep" : "fox/fox") : (e.isSleeping() ? "fox/snow_fox_sleep" : "fox/snow_fox"))
        .mSingle(ModelNewFox::new, "fox")));

        H.addReplace("minecraft", "bee", () -> () -> H.lambdaReplace(EntityType.BEE, 0.4F, r -> r
        .childScale(0.5F)
        .tMapped(e -> e.isAngry() ? (e.hasNectar() ? "bee/bee_angry_nectar" : "bee/bee_angry") : (e.hasNectar() ? "bee/bee_nectar" : "bee/bee"))
        .mSingle(ModelNewBee::new, "bee")));

        H.addReplace("minecraft", "dolphin", () -> () -> H.lambdaReplace(EntityType.DOLPHIN, 0.7F, r -> r
        .layer(LayerNewDolphinItem::new)
        .tSingle("dolphin")
        .mSingle(ModelNewDolphin::new, "dolphin")));

        H.addReplace("minecraft", "horse", () -> () -> H.lambdaReplace(EntityType.HORSE, 1F, r -> r
        .layer(LayerNewHorseMarking::new)
        .layer(LayerNewHorseArmor::new)
        .childScale(0.5F)
        .tMappedRaw(e -> HORSE_VARIANTS.get(e.getVariant()))
        .mSingle(ModelNewHorse::new, "horse")));

        H.addReplace("minecraft", "zombie_horse", () -> () -> H.lambdaReplace(EntityType.ZOMBIE_HORSE, 1F, r -> r
        .childScale(0.5F)
        .tSingle("horse/horse_zombie")
        .mSingle(ModelNewHorse::new, "horse")));

        H.addReplace("minecraft", "skeleton_horse", () -> () -> H.lambdaReplace(EntityType.SKELETON_HORSE, 1F, r -> r
        .ageScale(0.9F, 0.45F)
        .tSingle("horse/horse_skeleton")
        .mSingle(ModelNewHorse::new, "horse")));

        H.addReplace("minecraft", "donkey", () -> () -> H.lambdaReplace(EntityType.DONKEY, 1F, r -> r
        .ageScale(0.8F, 0.55F)
        .tSingle("horse/donkey")
        .mSingle(ModelNewHorse::new, "horse")));

        H.addReplace("minecraft", "mule", () -> () -> H.lambdaReplace(EntityType.MULE, 1F, r -> r
        .ageScale(0.85F, 0.55F)
        .tSingle("horse/mule")
        .mSingle(ModelNewHorse::new, "horse")));

        Replacements.platformInit();
    }

    @ExpectPlatform
    public static void platformInit() {
        throw new RuntimeException("Platform expected");
    }

    public static void layerDefinitions(ImmutableMap.Builder<ModelLayerLocation, LayerDefinition> b) {
        BiConsumer<String, LayerDefinition> r = (k, l) -> b.put(new ModelLayerLocation(new ResourceLocation(BetterAnimalModels.MODID, k), "main"), l);
        r.accept("bee", ModelNewBee.createBodyLayer());
        r.accept("cat", ModelNewCat.createBodyLayer());
        r.accept("chicken", ModelNewChicken.createBodyLayer());
        r.accept("cow", ModelNewCow.createBodyLayer());
        r.accept("dolphin", ModelNewDolphin.createBodyLayer());
        r.accept("fox", ModelNewFox.createBodyLayer());
        r.accept("pig", ModelNewPig.createBodyLayer());
        r.accept("sheep", ModelNewSheep.createBodyLayer());
        r.accept("silverfish", ModelNewSilverfish.createBodyLayer());
        r.accept("spider", ModelNewSpider.createBodyLayer());
        r.accept("squid", ModelNewSquid.createBodyLayer());
        r.accept("wolf", ModelNewWolf.createBodyLayer());
        r.accept("polar_bear", ModelNewPolarBear.createBodyLayer());
        r.accept("horse", ModelNewHorse.createBodyLayer());
    }

}
