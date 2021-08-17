package creoii.terrain.util;

import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class Decorators {
    public static final ConfiguredDecorator<HeightmapDecoratorConfig> HEIGHTMAP = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING));
    public static final ConfiguredDecorator<HeightmapDecoratorConfig> TOP_SOLID_HEIGHTMAP = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG));
    public static final ConfiguredDecorator<HeightmapDecoratorConfig> HEIGHTMAP_WORLD_SURFACE = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.WORLD_SURFACE_WG));
    public static final ConfiguredDecorator<HeightmapDecoratorConfig> HEIGHTMAP_OCEAN_FLOOR = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR));
    public static final ConfiguredDecorator<HeightmapDecoratorConfig> HEIGHTMAP_SPREAD_DOUBLE = Decorator.HEIGHTMAP_SPREAD_DOUBLE.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING));
    public static final RangeDecoratorConfig BOTTOM_TO_TOP = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.getBottom(), YOffset.getTop()));
    public static final RangeDecoratorConfig BOTTOM_TO_TOP_OFFSET_10 = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(10), YOffset.belowTop(10)));
    public static final RangeDecoratorConfig BOTTOM_TO_TOP_OFFSET_8 = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(8), YOffset.belowTop(8)));
    public static final RangeDecoratorConfig BOTTOM_TO_TOP_OFFSET_4 = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(4), YOffset.belowTop(4)));
    public static final RangeDecoratorConfig BOTTOM_TO_TOP_BELOW_120 = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(120)));
    public static final ConfiguredDecorator<?> FIRE = Decorator.RANGE.configure(BOTTOM_TO_TOP_OFFSET_4).spreadHorizontally().repeatRandomly(5);
    public static final ConfiguredDecorator<?> SPREAD_32_ABOVE = Decorator.SPREAD_32_ABOVE.configure(NopeDecoratorConfig.INSTANCE);
    public static final ConfiguredDecorator<?> HEIGHTMAP_OCEAN_FLOOR_NO_WATER = HEIGHTMAP_OCEAN_FLOOR.decorate(Decorator.WATER_DEPTH_THRESHOLD.configure(new WaterDepthThresholdDecoratorConfig(0)));
    public static final ConfiguredDecorator<?> SQUARE_HEIGHTMAP_OCEAN_FLOOR_NO_WATER = HEIGHTMAP_OCEAN_FLOOR_NO_WATER.spreadHorizontally();
    public static final ConfiguredDecorator<?> SQUARE_HEIGHTMAP = HEIGHTMAP.spreadHorizontally();
    public static final ConfiguredDecorator<?> SQUARE_HEIGHTMAP_SPREAD_DOUBLE = HEIGHTMAP_SPREAD_DOUBLE.spreadHorizontally();
    public static final ConfiguredDecorator<?> SQUARE_TOP_SOLID_HEIGHTMAP = TOP_SOLID_HEIGHTMAP.spreadHorizontally();
    public static final ConfiguredDecorator<?> DARK_OAK_TREE_HEIGHTMAP = HEIGHTMAP_OCEAN_FLOOR_NO_WATER.decorate(Decorator.DARK_OAK_TREE.configure(DecoratorConfig.DEFAULT));
}