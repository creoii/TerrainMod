package creoii.terrain.world.surface;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import creoii.terrain.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.AbstractNetherSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class DeltasSurfaceBuilder extends AbstractNetherSurfaceBuilder {
    public DeltasSurfaceBuilder(Codec<TernarySurfaceConfig> codec) {
        super(codec);
    }

    protected ImmutableList<BlockState> getSurfaceStates() {
        return ImmutableList.of(Blocks.BASALT.getDefaultState(), Blocks.SMOOTH_BASALT.getDefaultState(), BlockRegistry.LAVAROCK.getDefaultState(), BlockRegistry.LAVAROCK.getDefaultState());
    }

    protected ImmutableList<BlockState> getUnderLavaStates() {
        return ImmutableList.of(Blocks.BASALT.getDefaultState(), Blocks.SMOOTH_BASALT.getDefaultState());
    }

    protected BlockState getLavaShoreState() {
        return Blocks.GRAVEL.getDefaultState();
    }
}