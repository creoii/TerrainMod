package creoii.terrain.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.WorldAccess;

public class PlantBlock extends net.minecraft.block.PlantBlock {
    public PlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);

        //world.getEntitiesByClass(LivingEntity.class, new Box(pos.getX() - 0.5D, pos.getY() - 0.5D, pos.getZ() - 0.5D, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D), LivingEntity::isAlive).forEach((entity -> {
        //    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200));
        //}));
    }
}