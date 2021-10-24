package creoii.terrain.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RiverslateBlock extends Block {
    private float slipperiness = 0.6F;

    public RiverslateBlock(Settings settings) {
        super(settings);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (world.getFluidState(fromPos).isIn(FluidTags.WATER)) slipperiness = 0.73F;
        else slipperiness = 0.6F;
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
    }

    @Override
    public float getSlipperiness() {
        return slipperiness;
    }
}