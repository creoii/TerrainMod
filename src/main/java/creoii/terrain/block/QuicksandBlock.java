package creoii.terrain.block;

import creoii.terrain.util.EntityTypeTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.Random;

public class QuicksandBlock extends Block {
    private static final VoxelShape SHAPE = VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.8999999761581421D, 1.0D);

    public QuicksandBlock(Settings settings) {
        super(settings);
    }

    @SuppressWarnings("deprecation")
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @SuppressWarnings("deprecation")
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || entity.getBlockStateAtPos().isOf(this)) {
            entity.slowMovement(state, new Vec3d(0.8999999761581421D, 1.5D, 0.8999999761581421D));
            if (world.isClient) {
                Random random = world.getRandom();
                boolean bl = entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ();
                if (bl && random.nextBoolean()) {
                    world.addParticle(new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state), entity.getX(), pos.getY() + 1, entity.getZ(), MathHelper.nextBetween(random, -1.0F, 1.0F) * 0.083333336F, 0.05000000074505806D, MathHelper.nextBetween(random, -1.0F, 1.0F) * 0.083333336F);
                }
            }
        }
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityShapeContext) {
            Optional<Entity> optional = entityShapeContext.getEntity();
            if (optional.isPresent()) {
                Entity entity = optional.get();
                if (entity.fallDistance > 2.5F) return SHAPE;

                boolean bl = entity instanceof FallingBlockEntity;
                if (bl || canWalkOnQuicksand(entity) && context.isAbove(VoxelShapes.fullCube(), pos, false) && !context.isDescending()) {
                    return super.getCollisionShape(state, world, pos, context);
                }
            }
        }
        return VoxelShapes.empty();
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public static boolean canWalkOnQuicksand(Entity entity) {
        return entity.getType().isIn(EntityTypeTags.QUICKSAND_WALKABLE);
    }
}