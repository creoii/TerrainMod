package creoii.terrain.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class PurpleCaveMushroomBlock extends CaveMushroomBlock {
    public PurpleCaveMushroomBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 0.0F, DamageSource.FALL);

        if (entity instanceof LivingEntity && fallDistance >= 1.0F && !entity.bypassesLandingEffects()) {
            AreaEffectCloudEntity aoe = new AreaEffectCloudEntity(world, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D);
            aoe.setRadius(MathHelper.clamp(fallDistance * 0.5F, 0.0F, 6.0F));
            aoe.setRadiusOnUse(-0.25F);
            aoe.setWaitTime(0);
            aoe.setRadiusGrowth(-aoe.getRadius() / MathHelper.clamp(fallDistance * 12.0F, 0.0F, 600.0F));
            aoe.setPotion(new Potion(new StatusEffectInstance(StatusEffects.POISON, MathHelper.clamp(Math.round(fallDistance * 20.0F), 0, 9600))));
            aoe.addEffect(new StatusEffectInstance(StatusEffects.POISON, 200));
            aoe.setColor(10027261);
            world.spawnEntity(aoe);
        }
    }
}