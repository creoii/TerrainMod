package creoii.terrain.registry;

import creoii.terrain.world.surface.DeltasSurfaceBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SurfaceBuilderRegistry {
    public static final SurfaceBuilder<TernarySurfaceConfig> MOLTEN_CAVES = new DeltasSurfaceBuilder(TernarySurfaceConfig.CODEC);

    public static void register() {
        Registry.register(Registry.SURFACE_BUILDER, "molten_caves", MOLTEN_CAVES);
    }
}