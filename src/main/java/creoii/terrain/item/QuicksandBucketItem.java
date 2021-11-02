package creoii.terrain.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class QuicksandBucketItem extends BlockItem implements FluidModificationItem {
    private final SoundEvent placeSound;

    public QuicksandBucketItem(Block block, SoundEvent soundEvent, Item.Settings settings) {
        super(block, settings);
        this.placeSound = soundEvent;
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult actionResult = super.useOnBlock(context);
        PlayerEntity playerEntity = context.getPlayer();
        if (actionResult.isAccepted() && playerEntity != null && !playerEntity.isCreative()) {
            Hand hand = context.getHand();
            playerEntity.setStackInHand(hand, Items.BUCKET.getDefaultStack());
        }

        return actionResult;
    }

    public String getTranslationKey() {
        return this.getOrCreateTranslationKey();
    }

    protected SoundEvent getPlaceSound(BlockState state) {
        return this.placeSound;
    }

    public boolean placeFluid(@Nullable PlayerEntity player, World world, BlockPos pos, @Nullable BlockHitResult hitResult) {
        if (world.isInBuildLimit(pos) && world.isAir(pos)) {
            if (!world.isClient) {
                world.setBlockState(pos, this.getBlock().getDefaultState(), Block.NOTIFY_ALL);
            }

            world.playSound(player, pos, this.placeSound, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return true;
        } else {
            return false;
        }
    }
}
