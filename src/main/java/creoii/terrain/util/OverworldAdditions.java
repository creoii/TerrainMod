package creoii.terrain.util;

import creoii.terrain.registry.ConfiguredFeatureRegistry;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class OverworldAdditions {
    public static void addFeatures() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.ERODED_BADLANDS), GenerationStep.Feature.VEGETAL_DECORATION, BuiltinRegistries.CONFIGURED_FEATURE.getKey(ConfiguredFeatureRegistry.PALO_VERDE_CHECKED).get());
    }
}
