package creoii.terrain.block;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlueCaveMushroomBlock extends CaveMushroomBlock {
    public static final IntProperty LIGHT = IntProperty.of("light", 2, 14);

    public BlueCaveMushroomBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LIGHT, 8).with(WATERLOGGED, false));
    }

    public static int getLightValue(BlockState state) {
        return state.get(LIGHT);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 0.0F, DamageSource.FALL);

        if (entity instanceof LivingEntity && fallDistance >= 1.0F) {
            if (entity.bypassesLandingEffects()) {
                world.setBlockState(pos, state.with(LIGHT, MathHelper.clamp(state.get(LIGHT) - 2, 2, 14)), 3);
            } else world.setBlockState(pos, state.with(LIGHT, MathHelper.clamp(state.get(LIGHT) + 2, 2, 14)), 3);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIGHT, WATERLOGGED);
    }
}