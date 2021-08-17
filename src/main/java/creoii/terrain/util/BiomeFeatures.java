package creoii.terrain.util;

import creoii.terrain.registry.ConfiguredFeatureRegistry;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

public class BiomeFeatures {
    public static void addOres(GenerationSettings.Builder builder, boolean extraDiamond) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_COAL_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_COAL_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_IRON_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_IRON_MIDDLE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_IRON_SMALL);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_GOLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_REDSTONE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_REDSTONE_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, extraDiamond ? ConfiguredFeatureRegistry.PROTOTYPE_ORE_DIAMOND_EXTRA : ConfiguredFeatures.PROTOTYPE_ORE_DIAMOND);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, extraDiamond ? ConfiguredFeatureRegistry.PROTOTYPE_ORE_DIAMOND_LARGE_EXTRA : ConfiguredFeatures.PROTOTYPE_ORE_DIAMOND_LARGE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_LAPIS);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_LAPIS_BURIED);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_ORE_COPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ConfiguredFeatures.PROTOTYPE_UNDERWATER_MAGMA);
    }
}