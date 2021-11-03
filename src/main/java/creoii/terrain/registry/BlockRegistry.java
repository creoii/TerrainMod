package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.block.StairsBlock;
import creoii.terrain.block.*;
import creoii.terrain.util.BlockSettings;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block CAVE_MUSHROOM_STEM = new PillarBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_WHITE));
    public static final Block YELLOW_CAVE_MUSHROOM = new YellowCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_YELLOW));
    public static final Block PURPLE_CAVE_MUSHROOM = new PurpleCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_PURPLE));
    public static final Block GREEN_CAVE_MUSHROOM = new GreenCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.GREEN));
    public static final Block BLUE_CAVE_MUSHROOM = new BlueCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.BLUE).luminance(BlueCaveMushroomBlock::getLightValue));
    public static final Block YELLOW_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.TERRACOTTA_YELLOW));
    public static final Block PURPLE_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.TERRACOTTA_PURPLE));
    public static final Block GREEN_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.GREEN));
    public static final Block BLUE_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.BLUE));

    public static final Block GLACITE = new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.DEEPSLATE_GRAY));
    public static final Block GLACITE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.DEEPSLATE_GRAY));
    public static final Block GLACITE_STAIRS = new StairsBlock(GLACITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.DEEPSLATE_GRAY));
    public static final Block GLACITE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL));

    public static final Block COBBLED_LAVAROCK = new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK = new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_STAIRS = new StairsBlock(LAVAROCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL));
    public static final Block LAVAROCK_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_BRICK_STAIRS = new StairsBlock(LAVAROCK_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK));
    public static final Block LAVAROCK_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL));
    public static final Block MOLTEN_MAGMA = new MoltenMagmaBlock(BlockSettings.MOLTEN_MAGMA);
    public static final Block COOLED_MAGMA = new Block(AbstractBlock.Settings.copy(Blocks.STONE));

    public static final Block ARIDSTONE = new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.DIRT_BROWN));
    public static final Block ARIDSTONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.DIRT_BROWN));
    public static final Block ARIDSTONE_STAIRS = new StairsBlock(ARIDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.DIRT_BROWN));
    public static final Block ARIDSTONE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL));
    public static final Block QUICKSAND = new QuicksandBlock(BlockSettings.QUICKSAND);

    public static final Block CRYSTAL_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.WHITE).luminance((state) -> 3));
    public static final Block CRYSTAL_FLOWER = new CrystalFlowerBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER));
    public static final Block LUMINITE = new LuminiteBlock(BlockSettings.LUMINITE);
    public static final Block LUMINITE_SLAB = new SlabBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE));
    public static final Block LUMINITE_STAIRS = new StairsBlock(LUMINITE.getDefaultState(), AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE));
    public static final Block LUMINITE_WALL = new WallBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE));
    public static final Block CRYSTALLINE_LUMINITE = new LuminiteBlock(BlockSettings.CRYSTALLINE_LUMINITE);

    public static final Block RIVERSLATE = new RiverslateBlock(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.DARK_GREEN));
    public static final Block RIVERSLATE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN));
    public static final Block RIVERSLATE_STAIRS = new StairsBlock(RIVERSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN));
    public static final Block RIVERSLATE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL));

    public static final Block STRIPPED_PALO_VERDE_LOG = new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.PALE_GREEN));
    public static final Block PALO_VERDE_LOG = new LogBlock(STRIPPED_PALO_VERDE_LOG, AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(MapColor.PALE_GREEN));
    public static final Block PALO_VERDE_PLANKS = new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN));
    public static final Block PALO_VERDE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.PALE_GREEN));
    public static final Block PALO_VERDE_STAIRS = new StairsBlock(PALO_VERDE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.PALE_GREEN));
    public static final Block PALO_VERDE_LEAVES = new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).mapColor(MapColor.PALE_YELLOW));

    public static void register() {
        createBlock("cave_mushroom_stem", CAVE_MUSHROOM_STEM, ItemGroup.BUILDING_BLOCKS);
        createBlock("yellow_cave_mushroom", YELLOW_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("purple_cave_mushroom", PURPLE_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("green_cave_mushroom", GREEN_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("blue_cave_mushroom", BLUE_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("yellow_cave_mushroom_block", YELLOW_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("purple_cave_mushroom_block", PURPLE_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("green_cave_mushroom_block", GREEN_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("blue_cave_mushroom_block", BLUE_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);

        createBlock("glacite", GLACITE, ItemGroup.BUILDING_BLOCKS);
        createBlock("glacite_slab", GLACITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("glacite_stairs", GLACITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("glacite_wall", GLACITE_WALL, ItemGroup.DECORATIONS);

        createBlock("cobbled_lavarock", COBBLED_LAVAROCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock", LAVAROCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_slab", LAVAROCK_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_stairs", LAVAROCK_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_wall", LAVAROCK_WALL, ItemGroup.DECORATIONS);
        createBlock("lavarock_bricks", LAVAROCK_BRICKS, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_brick_slab", LAVAROCK_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_brick_stairs", LAVAROCK_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("lavarock_brick_wall", LAVAROCK_BRICK_WALL, ItemGroup.DECORATIONS);
        createBlock("molten_magma", MOLTEN_MAGMA, ItemGroup.DECORATIONS);
        createBlock("cooled_magma", COOLED_MAGMA, ItemGroup.BUILDING_BLOCKS);

        createBlock("aridstone", ARIDSTONE, ItemGroup.BUILDING_BLOCKS);
        createBlock("aridstone_slab", ARIDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("aridstone_stairs", ARIDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("aridstone_wall", ARIDSTONE_WALL, ItemGroup.DECORATIONS);
        createBlock("quicksand", QUICKSAND, null);

        createBlock("crystal_block", CRYSTAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("crystal_flower", CRYSTAL_FLOWER, ItemGroup.DECORATIONS);
        createBlock("luminite", LUMINITE, ItemGroup.BUILDING_BLOCKS);
        createBlock("luminite_slab", LUMINITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("luminite_stairs", LUMINITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("luminite_wall", LUMINITE_WALL, ItemGroup.DECORATIONS);
        createBlock("crystalline_luminite", CRYSTALLINE_LUMINITE, ItemGroup.BUILDING_BLOCKS);

        createBlock("riverslate", RIVERSLATE, ItemGroup.BUILDING_BLOCKS);
        createBlock("riverslate_slab", RIVERSLATE_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("riverslate_stairs", RIVERSLATE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("riverslate_wall", RIVERSLATE_WALL, ItemGroup.DECORATIONS);

        createBlock("stripped_palo_verde_log", STRIPPED_PALO_VERDE_LOG, ItemGroup.BUILDING_BLOCKS);
        createBlock("palo_verde_log", PALO_VERDE_LOG, ItemGroup.BUILDING_BLOCKS);
        createBlock("palo_verde_planks", PALO_VERDE_PLANKS, ItemGroup.BUILDING_BLOCKS);
        createBlock("palo_verde_slab", PALO_VERDE_STAIRS, ItemGroup.BUILDING_BLOCKS);
        createBlock("palo_verde_stairs", PALO_VERDE_SLAB, ItemGroup.BUILDING_BLOCKS);
        createBlock("palo_verde_leaves", PALO_VERDE_LEAVES, ItemGroup.DECORATIONS);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                CRYSTAL_FLOWER,
                PALO_VERDE_LEAVES
        );
    }

    private static <T extends Block> void createBlock(String name, T block, ItemGroup group) {
        Registry.register(Registry.BLOCK, new Identifier(TerrainMod.MOD_ID, name), block);
        if (group != null) Registry.register(Registry.ITEM, new Identifier(TerrainMod.MOD_ID, name), new BlockItem(block, new Item.Settings().group(group)));
    }
}