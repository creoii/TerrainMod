package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.world.feature.BlockSpikeFeature;
import creoii.terrain.world.feature.BlockSpikeFeatureConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

public class FeatureRegistry {
    public static final Feature<BlockSpikeFeatureConfig> BLOCK_SPIKE = new BlockSpikeFeature(BlockSpikeFeatureConfig.CODEC);

    public static void register() {
        Registry.register(Registry.FEATURE, new Identifier(TerrainMod.MOD_ID, "block_spike"), BLOCK_SPIKE);
    }
}