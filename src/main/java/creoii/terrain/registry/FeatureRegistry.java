package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.world.feature.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

public class FeatureRegistry {
    public static final Feature<BlockSpikeFeatureConfig> BLOCK_SPIKE = new BlockSpikeFeature(BlockSpikeFeatureConfig.CODEC);
    public static final Feature<RockFeatureConfig> ROCK = new RockFeature(RockFeatureConfig.CODEC);
    public static final Feature<TwoSimpleBlocksFeatureConfig> SIMPLE_BLOCK_WITH_BASE = new SimpleBlockWithBaseFeature(TwoSimpleBlocksFeatureConfig.CODEC);

    public static void register() {
        Registry.register(Registry.FEATURE, new Identifier(TerrainMod.MOD_ID, "block_spike"), BLOCK_SPIKE);
        Registry.register(Registry.FEATURE, new Identifier(TerrainMod.MOD_ID, "rock"), ROCK);
        Registry.register(Registry.FEATURE, new Identifier(TerrainMod.MOD_ID, "simple_block_with_base"), SIMPLE_BLOCK_WITH_BASE);
    }
}