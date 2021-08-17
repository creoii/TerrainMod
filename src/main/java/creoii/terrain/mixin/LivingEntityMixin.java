package creoii.terrain.mixin;

import creoii.terrain.registry.BlockRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "getJumpBoostVelocityModifier", at = @At("RETURN"), cancellable = true)
    private void terrain(CallbackInfoReturnable<Double> cir) {
        if (this.getEntityWorld().getBlockState(this.getBlockPos().down()).getBlock() == BlockRegistry.YELLOW_CAVE_MUSHROOM) {
            cir.setReturnValue(cir.getReturnValue() + 0.1D);
        }
    }
}