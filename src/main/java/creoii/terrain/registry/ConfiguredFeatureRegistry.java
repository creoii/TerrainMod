package creoii.terrain.registry;

import com.google.common.collect.ImmutableList;
import creoii.terrain.TerrainMod;
import creoii.terrain.util.Decorators;
import creoii.terrain.world.feature.BlockSpikeFeatureConfig;
import creoii.terrain.world.feature.RockFeatureConfig;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CaveSurfaceDecoratorConfig;
import net.minecraft.world.gen.decorator.CountNoiseDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ConfiguredFeatureRegistry {
    public static final ConfiguredFeature<?, ?> BLANK = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new SimpleBlockStateProvider(Blocks.CAVE_AIR.getDefaultState())));

    public static final ConfiguredFeature<?, ?> PATCH_RED_LOTUS = Feature.RANDOM_PATCH.configure(ConfiguredFeatures.Configs.GRASS_CONFIG).decorate(Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(-0.8D, 5, 10)));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> SMALL_YELLOW_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(3, 1, 0), new SimpleBlockStateProvider(BlockRegistry.YELLOW_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.YELLOW_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> SMALL_PURPLE_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(3, 1, 0), new SimpleBlockStateProvider(BlockRegistry.PURPLE_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.PURPLE_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> SMALL_GREEN_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(3, 1, 0), new SimpleBlockStateProvider(BlockRegistry.GREEN_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.GREEN_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> SMALL_BLUE_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(3, 1, 0), new SimpleBlockStateProvider(BlockRegistry.BLUE_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.BLUE_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LARGE_YELLOW_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(5, 4, 3), new SimpleBlockStateProvider(BlockRegistry.YELLOW_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.YELLOW_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LARGE_PURPLE_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(5, 4, 3), new SimpleBlockStateProvider(BlockRegistry.PURPLE_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.PURPLE_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LARGE_GREEN_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(5, 4, 3), new SimpleBlockStateProvider(BlockRegistry.GREEN_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.GREEN_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LARGE_BLUE_CAVE_MUSHROOM = Feature.TREE.configure(new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockRegistry.CAVE_MUSHROOM_STEM.getDefaultState()), new StraightTrunkPlacer(5, 4, 3), new SimpleBlockStateProvider(BlockRegistry.BLUE_CAVE_MUSHROOM_BLOCK.getDefaultState()), new SimpleBlockStateProvider(BlockRegistry.BLUE_CAVE_MUSHROOM.getDefaultState()), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).forceDirt().build());
    public static final ConfiguredFeature<?, ?> CAVE_MUSHROOM_VEGETATION = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(new DataPool.Builder<BlockState>().add(BlockRegistry.YELLOW_CAVE_MUSHROOM.getDefaultState(), 1).add(BlockRegistry.PURPLE_CAVE_MUSHROOM.getDefaultState(), 1).add(BlockRegistry.GREEN_CAVE_MUSHROOM.getDefaultState(), 1).add(BlockRegistry.BLUE_CAVE_MUSHROOM.getDefaultState(), 1).build())));
    public static final ConfiguredFeature<?, ?> MYCELIUM_PATCH = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.MYCELIUM.getDefaultState()), () -> CAVE_MUSHROOM_VEGETATION, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.005F, UniformIntProvider.create(4, 7), 0.3F));
    public static final ConfiguredFeature<?, ?> MUSHROOM_CAVES_VEGETATION = MYCELIUM_PATCH.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> MYCELIUM_WITH_YELLOW_CAVE_MUSHROOM = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.MYCELIUM.getDefaultState()), () -> Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SMALL_YELLOW_CAVE_MUSHROOM, () -> LARGE_YELLOW_CAVE_MUSHROOM)), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.08F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> MYCELIUM_WITH_PURPLE_CAVE_MUSHROOM = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.MYCELIUM.getDefaultState()), () -> Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SMALL_PURPLE_CAVE_MUSHROOM, () -> LARGE_PURPLE_CAVE_MUSHROOM)), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.08F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> MYCELIUM_WITH_GREEN_CAVE_MUSHROOM = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.MYCELIUM.getDefaultState()), () -> Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SMALL_GREEN_CAVE_MUSHROOM, () -> LARGE_GREEN_CAVE_MUSHROOM)), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.08F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> MYCELIUM_WITH_BLUE_CAVE_MUSHROOM = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.MYCELIUM.getDefaultState()), () -> Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SMALL_BLUE_CAVE_MUSHROOM, () -> LARGE_BLUE_CAVE_MUSHROOM)), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.08F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> MUSHROOM_CAVES_MUSHROOMS = Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(new RandomFeatureEntry(MYCELIUM_WITH_YELLOW_CAVE_MUSHROOM, 0.25F), new RandomFeatureEntry(MYCELIUM_WITH_PURPLE_CAVE_MUSHROOM, 0.25F), new RandomFeatureEntry(MYCELIUM_WITH_GREEN_CAVE_MUSHROOM, 0.25F), new RandomFeatureEntry(MYCELIUM_WITH_BLUE_CAVE_MUSHROOM, 0.25F)), BLANK)).decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(30);

    public static final ConfiguredFeature<?, ?> SNOW_VEGETATION = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new SimpleBlockStateProvider(Blocks.SNOW.getDefaultState())));
    public static final ConfiguredFeature<?, ?> SNOW_PATCH = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.SNOW_BLOCK.getDefaultState()), () -> SNOW_VEGETATION, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(2), 0.0F, 5, 0.5F, UniformIntProvider.create(4, 7), 0.3F));
    public static final ConfiguredFeature<?, ?> SNOW_PATCH_CEILING = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.SNOW_BLOCK.getDefaultState()), () -> BLANK, VerticalSurfaceType.CEILING, ConstantIntProvider.create(2), 0.0F, 5, 0.0F, UniformIntProvider.create(4, 7), 0.3F));
    public static final ConfiguredFeature<?, ?> FRIGID_CAVES_VEGETATION = SNOW_PATCH.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> FRIGID_CAVES_CEILING_VEGETATION = SNOW_PATCH_CEILING.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.CEILING, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> ICE_POOL = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.ICE.getDefaultState()), () -> BLANK, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.0F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> POWDER_SNOW_POOL = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.POWDER_SNOW.getDefaultState()), () -> BLANK, VerticalSurfaceType.FLOOR, UniformIntProvider.create(1, 2), 0.1F, 1, 0.0F, UniformIntProvider.create(1, 2), 0.1F));
    public static final ConfiguredFeature<?, ?> FRIGID_CAVES_ICE = Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> ICE_POOL, () -> POWDER_SNOW_POOL)).decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(20);
    public static final ConfiguredFeature<?, ?> BLUE_ICE_STONE_BLOBS = Feature.NETHERRACK_REPLACE_BLOBS.configure(new ReplaceBlobsFeatureConfig(Blocks.STONE.getDefaultState(), Blocks.BLUE_ICE.getDefaultState(), UniformIntProvider.create(1, 3))).range(Decorators.BOTTOM_TO_TOP).spreadHorizontally().repeat(2);
    public static final ConfiguredFeature<?, ?> BLUE_ICE_DEEPSLATE_BLOBS = Feature.NETHERRACK_REPLACE_BLOBS.configure(new ReplaceBlobsFeatureConfig(Blocks.DEEPSLATE.getDefaultState(), Blocks.BLUE_ICE.getDefaultState(), UniformIntProvider.create(1, 3))).range(Decorators.BOTTOM_TO_TOP).spreadHorizontally().repeat(2);
    public static final ConfiguredFeature<?, ?> GIANT_ICE_SPIKE = FeatureRegistry.BLOCK_SPIKE.configure(new BlockSpikeFeatureConfig(new SimpleBlockStateProvider(Blocks.PACKED_ICE.getDefaultState()), 30, UniformIntProvider.create(3, 12), UniformFloatProvider.create(0.4F, 1.5F), 0.25F, UniformFloatProvider.create(0.1F, 0.33F), UniformFloatProvider.create(0.1F, 0.33F), UniformFloatProvider.create(0.0F, 0.5F), 4, 0.2F)).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(UniformIntProvider.create(4, 20));

    public static final ConfiguredFeature<?, ?> LAVA_SOURCE_CEILING = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new SimpleBlockStateProvider(Blocks.LAVA.getDefaultState())));
    public static final ConfiguredFeature<?, ?> SPARSE_SMALL_BASALT_COLUMNS = Feature.BASALT_COLUMNS.configure(new BasaltColumnsFeatureConfig(ConstantIntProvider.create(1), UniformIntProvider.create(2, 3))).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(3)).applyChance(50));
    public static final ConfiguredFeature<?, ?> SPARSE_LARGE_BASALT_COLUMNS = Feature.BASALT_COLUMNS.configure(new BasaltColumnsFeatureConfig(UniformIntProvider.create(1, 2), UniformIntProvider.create(3, 5))).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(1)).applyChance(50));
    public static final ConfiguredFeature<?, ?> LAVAROCK_PATCH = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(BlockRegistry.LAVAROCK.getDefaultState()), () -> Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SPARSE_SMALL_BASALT_COLUMNS, () -> SPARSE_LARGE_BASALT_COLUMNS)), VerticalSurfaceType.FLOOR, UniformIntProvider.create(2, 3), 0.0F, 5, 0.02F, UniformIntProvider.create(2, 5), 0.3F));
    public static final ConfiguredFeature<?, ?> LAVAROCK_PATCH_CEILING = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(BlockRegistry.LAVAROCK.getDefaultState()), () -> BLANK, VerticalSurfaceType.CEILING, UniformIntProvider.create(2, 3), 0.0F, 5, 0.002F, UniformIntProvider.create(2, 5), 0.3F));
    public static final ConfiguredFeature<?, ?> MOLTEN_CAVES_VEGETATION = LAVAROCK_PATCH.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> MOLTEN_CAVES_CEILING_VEGETATION = LAVAROCK_PATCH_CEILING.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.CEILING, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> MOLTEN_SPIKE = FeatureRegistry.BLOCK_SPIKE.configure(new BlockSpikeFeatureConfig(new SimpleBlockStateProvider(Blocks.SMOOTH_BASALT.getDefaultState()), 30, UniformIntProvider.create(5, 9), UniformFloatProvider.create(0.4F, 1.2F), 0.25F, UniformFloatProvider.create(0.33F, 1.0F), UniformFloatProvider.create(0.33F, 1.0F), UniformFloatProvider.create(0.0F, 0.25F), 7, 0.5F)).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(UniformIntProvider.create(16, 32));
    public static final ConfiguredFeature<?, ?> SPARSE_MAGMA_DELTA = Feature.DELTA_FEATURE.configure(new DeltaFeatureConfig(BlockRegistry.MOLTEN_MAGMA.getDefaultState(), Blocks.MAGMA_BLOCK.getDefaultState(), UniformIntProvider.create(3, 6), UniformIntProvider.create(0, 2))).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(24)).applyChance(8));
    public static final ConfiguredFeature<?, ?> SPARSE_DELTA = Feature.DELTA_FEATURE.configure(new DeltaFeatureConfig(Blocks.LAVA.getDefaultState(), Blocks.MAGMA_BLOCK.getDefaultState(), UniformIntProvider.create(4, 8), UniformIntProvider.create(1, 2))).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(20)).applyChance(5));
    public static final ConfiguredFeature<?, ?> PROTOTYPE_ORE_DIAMOND_EXTRA = Feature.ORE.configure(new OreFeatureConfig(ConfiguredFeatures.DIAMOND_ORE_TARGETS, 6, 0.5F)).triangleRange(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)).spreadHorizontally().repeat(8);
    public static final ConfiguredFeature<?, ?> PROTOTYPE_ORE_DIAMOND_LARGE_EXTRA = Feature.ORE.configure(new OreFeatureConfig(ConfiguredFeatures.DIAMOND_ORE_TARGETS, 16, 0.7F)).triangleRange(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)).spreadHorizontally().applyChance(8);

    public static final ConfiguredFeature<?, ?> HOLE = FeatureRegistry.ROCK.configure(new RockFeatureConfig(Blocks.CAVE_AIR.getDefaultState(), UniformIntProvider.create(2, 5)));
    public static final ConfiguredFeature<?, ?> ARIDSTONE_ROCK = FeatureRegistry.ROCK.configure(new RockFeatureConfig(BlockRegistry.ARIDSTONE.getDefaultState(), ConstantIntProvider.create(2)));
    public static final ConfiguredFeature<?, ?> BIG_ARIDSTONE_ROCK = FeatureRegistry.ROCK.configure(new RockFeatureConfig(BlockRegistry.ARIDSTONE.getDefaultState(), UniformIntProvider.create(3, 4)));
    public static final ConfiguredFeature<?, ?> ARID_VEGETATION = Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(BIG_ARIDSTONE_ROCK, 0.2F), new RandomFeatureEntry(ARIDSTONE_ROCK, 0.5F), new RandomFeatureEntry(HOLE, 0.2F)), Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState())))));
    public static final ConfiguredFeature<?, ?> ARIDSTONE_PATCH = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(BlockRegistry.ARIDSTONE.getDefaultState()), () -> ARID_VEGETATION, VerticalSurfaceType.FLOOR, UniformIntProvider.create(2, 3), 0.0F, 5, 0.05F, UniformIntProvider.create(2, 5), 0.3F));
    public static final ConfiguredFeature<?, ?> ARIDSTONE_PATCH_CEILING = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE.getId(), new SimpleBlockStateProvider(BlockRegistry.ARIDSTONE.getDefaultState()), () -> BLANK, VerticalSurfaceType.CEILING, UniformIntProvider.create(2, 3), 0.0F, 5, 0.0F, UniformIntProvider.create(2, 5), 0.3F));
    public static final ConfiguredFeature<?, ?> ARID_CAVES_VEGETATION = ARIDSTONE_PATCH.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> ARID_CAVES_CEILING_VEGETATION = ARIDSTONE_PATCH_CEILING.decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.CEILING, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(60);
    public static final ConfiguredFeature<?, ?> SAND_POOL = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(Blocks.SAND.getDefaultState()), () -> ARID_VEGETATION, VerticalSurfaceType.FLOOR, ConstantIntProvider.create(3), 0.8F, 2, 0.1F, UniformIntProvider.create(4, 7), 0.7F));
    public static final ConfiguredFeature<?, ?> QUICKSAND_POOL = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(BlockTags.LUSH_GROUND_REPLACEABLE.getId(), new SimpleBlockStateProvider(BlockRegistry.QUICKSAND.getDefaultState()), () -> BLANK, VerticalSurfaceType.FLOOR, UniformIntProvider.create(1, 3), 0.1F, 1, 0.0F, UniformIntProvider.create(1, 2), 0.1F));
    public static final ConfiguredFeature<?, ?> ARID_CAVES_SAND = Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> SAND_POOL, () -> QUICKSAND_POOL)).decorate(Decorator.CAVE_SURFACE.configure(new CaveSurfaceDecoratorConfig(VerticalSurfaceType.FLOOR, 12))).range(Decorators.BOTTOM_TO_TOP_BELOW_120).spreadHorizontally().repeat(40);

    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "blank"), BLANK);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "small_yellow_cave_mushroom"), SMALL_YELLOW_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "small_purple_cave_mushroom"), SMALL_PURPLE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "small_green_cave_mushroom"), SMALL_GREEN_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "small_blue_cave_mushroom"), SMALL_BLUE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "large_yellow_cave_mushroom"), LARGE_YELLOW_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "large_purple_cave_mushroom"), LARGE_PURPLE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "large_green_cave_mushroom"), LARGE_GREEN_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "large_blue_cave_mushroom"), LARGE_BLUE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "patch_red_lotus"), PATCH_RED_LOTUS);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mycelium_patch"), MYCELIUM_PATCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mushroom_caves_vegetation"), MUSHROOM_CAVES_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mycelium_with_yellow_cave_mushroom"), MYCELIUM_WITH_YELLOW_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mycelium_with_purple_cave_mushroom"), MYCELIUM_WITH_PURPLE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mycelium_with_green_cave_mushroom"), MYCELIUM_WITH_GREEN_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mycelium_with_blue_cave_mushroom"), MYCELIUM_WITH_BLUE_CAVE_MUSHROOM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "mushroom_caves_mushrooms"), MUSHROOM_CAVES_MUSHROOMS);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "snow_vegetation"), SNOW_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "snow_patch"), SNOW_PATCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "snow_patch_ceiling"), SNOW_PATCH_CEILING);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "frigid_caves_vegetation"), FRIGID_CAVES_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "frigid_caves_ceiling_vegetation"), FRIGID_CAVES_CEILING_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "ice_pool"), ICE_POOL);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "powder_snow_pool"), POWDER_SNOW_POOL);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "frigid_caves_ice"), FRIGID_CAVES_ICE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "blue_ice_stone_blobs"), BLUE_ICE_STONE_BLOBS);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "blue_ice_deepslate_blobs"), BLUE_ICE_DEEPSLATE_BLOBS);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "giant_ice_spike"), GIANT_ICE_SPIKE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "lavarock_patch"), LAVAROCK_PATCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "lavarock_patch_ceiling"), LAVAROCK_PATCH_CEILING);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "molten_caves_vegetation"), MOLTEN_CAVES_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "molten_caves_ceiling_vegetation"), MOLTEN_CAVES_CEILING_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "molten_spike"), MOLTEN_SPIKE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "sparse_small_basalt_columns"), SPARSE_SMALL_BASALT_COLUMNS);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "sparse_large_basalt_columns"), SPARSE_LARGE_BASALT_COLUMNS);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "sparse_magma_delta"), SPARSE_MAGMA_DELTA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "sparse_delta"), SPARSE_DELTA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "prototype_ore_diamond_extra"), PROTOTYPE_ORE_DIAMOND_EXTRA);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "prototype_ore_diamond_large_extra"), PROTOTYPE_ORE_DIAMOND_LARGE_EXTRA);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "hole"), HOLE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "aridstone_rock"), ARIDSTONE_ROCK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "big_aridstone_rock"), BIG_ARIDSTONE_ROCK);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "arid_vegetation"), ARID_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "aridstone_patch"), ARIDSTONE_PATCH);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "aridstone_patch_ceiling"), ARIDSTONE_PATCH_CEILING);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "arid_caves_vegetation"), ARID_CAVES_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "arid_caves_ceiling_vegetation"), ARID_CAVES_CEILING_VEGETATION);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "sand_pool"), SAND_POOL);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "quicksand_pool"), QUICKSAND_POOL);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TerrainMod.MOD_ID, "arid_caves_sand"), ARID_CAVES_SAND);
    }
}