package creoii.terrain.block;

import creoii.terrain.registry.BlockRegistry;
import creoii.terrain.util.EntityTypeTags;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public class MoltenMagmaBlock extends Block {
    private static final VoxelShape SHAPE = VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.8999999761581421D, 1.0D);

    public MoltenMagmaBlock(Settings settings) {
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
            entity.slowMovement(state, new Vec3d(0.8999999761581421D, 0.8999999761581421D, 0.8999999761581421D));
            if (world.isClient) {
                Random random = world.getRandom();
                boolean bl = entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ();
                if (bl && random.nextBoolean()) {
                    world.addParticle(ParticleTypes.FLAME, entity.getX(), pos.getY() + 1, entity.getZ(), MathHelper.nextBetween(random, -1.0F, 1.0F) * 0.083333336F, 0.05000000074505806D, MathHelper.nextBetween(random, -1.0F, 1.0F) * 0.083333336F);
                }

                if (!entity.isFireImmune()) entity.setOnFireFor(8);
                entity.damage(DamageSource.LAVA, 0.5F);
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
                if (bl || canWalkOnPowderSnow(entity) && context.isAbove(VoxelShapes.fullCube(), pos, false) && !context.isDescending()) {
                    return super.getCollisionShape(state, world, pos, context);
                }
            }
        }
        return VoxelShapes.empty();
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);

        for (Direction direction : Direction.values()) {
            if (direction != Direction.DOWN && world.getFluidState(pos.offset(direction)).isIn(FluidTags.WATER)) {
                world.setBlockState(pos, BlockRegistry.COOLED_MAGMA.getDefaultState(), 3);
            }
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction != Direction.DOWN && neighborState.getFluidState().isIn(FluidTags.WATER)) {
            return BlockRegistry.COOLED_MAGMA.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public static boolean canWalkOnPowderSnow(Entity entity) {
        return entity.getType().isIn(EntityTypeTags.MOLTEN_MAGMA_WALKABLE) || entity instanceof LivingEntity && ((LivingEntity) entity).getEquippedStack(EquipmentSlot.FEET).isOf(Items.NETHERITE_BOOTS);
    }
}