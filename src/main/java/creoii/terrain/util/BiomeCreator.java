package creoii.terrain.util;

import creoii.terrain.registry.ConfiguredFeatureRegistry;
import creoii.terrain.registry.ConfiguredSurfaceBuilderRegistry;
import creoii.terrain.registry.FeatureRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;

public class BiomeCreator {
    public static Biome createFrigidCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        DefaultBiomeFeatures.addSnowyMobs(builder);

        GenerationSettings.Builder builder2 = (new GenerationSettings.Builder()).surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        builder2.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder2);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addDefaultLakes(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2, false);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addFrozenTopLayer(builder2);
        builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.GIANT_ICE_SPIKE);
        builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.BLUE_ICE_STONE_BLOBS);
        builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.BLUE_ICE_DEEPSLATE_BLOBS);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_CEILING_VEGETATION);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_ICE);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.FRIGID_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.SNOW).category(Biome.Category.UNDERGROUND).temperature(0.0F).downfall(0.5F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createMushroomCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(EntityType.AXOLOTL, 10, 4, 6));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.MOOSHROOM, 8, 4, 8));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.Builder builder2 = (new GenerationSettings.Builder()).surfaceBuilder(ConfiguredSurfaceBuilders.MYCELIUM);
        builder2.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder2);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addDefaultLakes(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2, false);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MUSHROOM_CAVES_MUSHROOMS);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MUSHROOM_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(0.5F).downfall(0.5F).effects((new net.minecraft.world.biome.BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }

    public static Biome createMoltenCaves() {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.Builder builder2 = (new GenerationSettings.Builder()).surfaceBuilder(ConfiguredSurfaceBuilderRegistry.MOLTEN_CAVES);
        builder2.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder2);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addDefaultLakes(builder2);
        DefaultBiomeFeatures.addAmethystGeodes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        BiomeFeatures.addOres(builder2, true);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.MOLTEN_SPIKE);
        builder2.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, ConfiguredFeatureRegistry.SPARSE_DELTA);
        builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.MOLTEN_MAGMA_STONE_BLOBS);
        builder2.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatureRegistry.MOLTEN_MAGMA_DEEPSLATE_BLOBS);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MOLTEN_CAVES_CEILING_VEGETATION);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatureRegistry.MOLTEN_CAVES_VEGETATION);

        float sky = MathHelper.clamp(0.0F / 3.0F, -1.0F, 1.0F);
        int skyColor = MathHelper.hsvToRgb(0.62222224F - sky * 0.05F, 0.5F + sky * 0.1F, 1.0F);
        return new Biome.Builder().precipitation(Biome.Precipitation.RAIN).category(Biome.Category.UNDERGROUND).temperature(0.5F).downfall(0.5F).effects((new net.minecraft.world.biome.BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(skyColor).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }
}