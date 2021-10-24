package creoii.terrain.block;

public class GreenCaveMushroomBlock extends CaveMushroomBlock {
    public GreenCaveMushroomBlock(Settings settings) {
        super(settings);
    }

    @Override
    public float getJumpVelocityMultiplier() {
        return 2.02F;
    }
}