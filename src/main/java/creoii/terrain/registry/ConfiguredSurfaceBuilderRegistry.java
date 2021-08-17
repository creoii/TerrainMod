package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class ConfiguredSurfaceBuilderRegistry {
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> MOLTEN_CAVES = SurfaceBuilder.BASALT_DELTAS.withConfig(new TernarySurfaceConfig(Blocks.STONE.getDefaultState(), Blocks.SMOOTH_BASALT.getDefaultState(), Blocks.MAGMA_BLOCK.getDefaultState()));

    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(TerrainMod.MOD_ID, "molten_caves"), MOLTEN_CAVES);
    }
}