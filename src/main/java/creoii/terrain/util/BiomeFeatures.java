package creoii.terrain.util;

import creoii.terrain.registry.ConfiguredFeatureRegistry;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

public class BiomeFeatures {
    public static void addOres(GenerationSettings.Builder builder, boolean extraDiamond) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_COAL_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_COAL_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_IRON_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_IRON_MIDDLE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_IRON_SMALL);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_GOLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_GOLD_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_REDSTONE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_REDSTONE_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, extraDiamond ? ConfiguredFeatureRegistry.ORE_DIAMOND_EXTRA : ConfiguredFeatures.ORE_DIAMOND);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, extraDiamond ? ConfiguredFeatureRegistry.ORE_DIAMOND_BURIED_EXTRA : ConfiguredFeatures.ORE_DIAMOND_BURIED);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, extraDiamond ? ConfiguredFeatureRegistry.ORE_DIAMOND_LARGE_EXTRA : ConfiguredFeatures.ORE_DIAMOND_LARGE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_LAPIS);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_LAPIS_BURIED);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.ORE_COPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.UNDERWATER_MAGMA);
    }
}