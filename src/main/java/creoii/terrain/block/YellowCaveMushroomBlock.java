package creoii.terrain.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;

public class YellowCaveMushroomBlock extends CaveMushroomBlock {
    public YellowCaveMushroomBlock(Settings settings) {
        super(settings);
    }

    public void onEntityLand(BlockView world, Entity entity) {
        if (entity.bypassesLandingEffects()) super.onEntityLand(world, entity);
        else {
            Vec3d vec3d = entity.getVelocity();
            if (vec3d.y < 0.0D) {
                double d = entity instanceof LivingEntity ? 1.0D : 0.8D;
                entity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
            }
        }
    }
}