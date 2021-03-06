package creoii.terrain.util;

import creoii.terrain.registry.ConfiguredFeatureRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class BiomeCreator {
    public static Biome createFrigidCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        DefaultBiomeFeatures.addSnowyMobs(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2, false);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addFrozenTopLayer(builder2);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.GIANT_ICE_SPIKE);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.GLACITE_PATCH);
        //builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.BLUE_ICE_STONE_BLOBS);
        //builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.BLUE_ICE_DEEPSLATE_BLOBS);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_CEILING_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_ICE);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.SNOW).category(Biome.Category.UNDERGROUND).temperature(0.0F).downfall(0.5F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createMushroomCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.AXOLOTLS, new SpawnSettings.SpawnEntry(EntityType.AXOLOTL, 10, 4, 6));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.MOOSHROOM, 8, 4, 8));
        DefaultBiomeFeatures.addCaveMobs(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2, false);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MUSHROOM_CAVES_MUSHROOMS);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MUSHROOM_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(0.5F).downfall(0.5F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createMoltenCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.LAVAROCK_SPIKE);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.SPARSE_MAGMA_DELTA);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.SPARSE_DELTA);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MOLTEN_CAVES_CEILING_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MOLTEN_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(2.0F).downfall(0.0F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createAridCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDesertMobs(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2, false);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.SANDSTONE_PILLAR);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.ARIDSTONE_PILLAR);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.ARID_CAVES_CEILING_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.ARID_CAVES_SAND);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.ARID_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(2.0F).downfall(0.0F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createCrystalCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.AXOLOTLS, new SpawnSettings.SpawnEntry(EntityType.AXOLOTL, 10, 4, 6));
        builder.spawn(SpawnGroup.WATER_AMBIENT, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 25, 8, 8));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.DENSE_AMETHYST_GEODE);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.GIANT_CRYSTAL_SPIKE);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.CRYSTAL_CAVES_CEILING_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.CRYSTAL_CAVES_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.CRYSTAL_BLOCK_POOL);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(0.5F).downfall(0.5F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createJungleCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addJungleMobs(builder);

        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        DefaultBiomeFeatures.addJungleGrass(builder2);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.SPARSE_WATER_DELTA);
        //builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.RIVERSLATE_ROCK);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.JUNGLE_CAVES_CEILING_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.JUNGLE_CAVES_VEGETATION);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.JUNGLE_CAVES_GRASS);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(0.95F).downfall(0.0F).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).foliageColor(171776).grassColor(171776).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createTropicalRiver() {
        SpawnSettings.Builder builder = (new SpawnSettings.Builder()).spawn(SpawnGroup.WATER_AMBIENT, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 20, 4, 4)).spawn(SpawnGroup.WATER_CREATURE, new SpawnSettings.SpawnEntry(EntityType.SQUID, 2, 1, 4)).spawn(SpawnGroup.WATER_AMBIENT, new SpawnSettings.SpawnEntry(EntityType.SALMON, 5, 1, 5));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        DefaultBiomeFeatures.addJungleMobs(builder);
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1, 1));
        GenerationSettings.Builder builder2 = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addBamboo(builder2);
        DefaultBiomeFeatures.addJungleTrees(builder2);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addExtraDefaultFlowers(builder2);
        DefaultBiomeFeatures.addJungleGrass(builder2);
        //DefaultBiomeFeatures.addJungleVegetation(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        //DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addSprings(builder2);
        DefaultBiomeFeatures.addFrozenTopLayer(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2);
        //DefaultBiomeFeatures.addDefaultDisks(builder2);
        //DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        //builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.SEAGRASS_SWAMP);

        float sky = MathHelper.clamp(0.95F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.RIVER).downfall(0.95F).temperature(0.95F).generationSettings(builder2.build()).spawnSettings(builder.build()).effects(new BiomeEffects.Builder().waterColor(3750089).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).build();
    }
}