package creoii.terrain.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.BlockView;

public class YellowCaveMushroomBlock extends CaveMushroomBlock {
    public YellowCaveMushroomBlock(Settings settings) {
        super(settings);
    }

    public void onEntityLand(BlockView world, Entity entity) {
        if (entity instanceof LivingEntity) {
            LivingEntity living = (LivingEntity) entity;
            //living.getAttributeInstance(AttributeRegistry.GENERIC_GRAVITY).addTemporaryModifier();
        }
    }
}