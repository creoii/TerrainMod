package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.block.*;
import creoii.terrain.block.PlantBlock;
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
    public static final Block RED_LOTUS = new PlantBlock(AbstractBlock.Settings.copy(Blocks.GRASS));
    public static final Block CAVE_MUSHROOM_STEM = new PillarBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_WHITE));
    public static final Block YELLOW_CAVE_MUSHROOM = new YellowCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_YELLOW));
    public static final Block PURPLE_CAVE_MUSHROOM = new PurpleCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.TERRACOTTA_PURPLE));
    public static final Block GREEN_CAVE_MUSHROOM = new CaveMushroomBlock(BlockSettings.caveMushroom(MapColor.GREEN));
    public static final Block BLUE_CAVE_MUSHROOM = new BlueCaveMushroomBlock(BlockSettings.caveMushroom(MapColor.BLUE).luminance(BlueCaveMushroomBlock::getLightValue));
    public static final Block YELLOW_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.TERRACOTTA_YELLOW));
    public static final Block PURPLE_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.TERRACOTTA_PURPLE));
    public static final Block GREEN_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.GREEN));
    public static final Block BLUE_CAVE_MUSHROOM_BLOCK = new Block(BlockSettings.caveMushroom(MapColor.BLUE));

    public static void register() {
        createBlock("red_lotus", RED_LOTUS, ItemGroup.DECORATIONS);
        createBlock("cave_mushroom_stem", CAVE_MUSHROOM_STEM, ItemGroup.BUILDING_BLOCKS);
        createBlock("yellow_cave_mushroom", YELLOW_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("purple_cave_mushroom", PURPLE_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("green_cave_mushroom", GREEN_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("blue_cave_mushroom", BLUE_CAVE_MUSHROOM, ItemGroup.DECORATIONS);
        createBlock("yellow_cave_mushroom_block", YELLOW_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("purple_cave_mushroom_block", PURPLE_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("green_cave_mushroom_block", GREEN_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        createBlock("blue_cave_mushroom_block", BLUE_CAVE_MUSHROOM_BLOCK, ItemGroup.BUILDING_BLOCKS);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                RED_LOTUS
        );
    }

    public static <T extends Block> void createBlock(String name, T block, ItemGroup group) {
        Registry.register(Registry.BLOCK, new Identifier(TerrainMod.MOD_ID, name), block);
        if (group != null) Registry.register(Registry.ITEM, new Identifier(TerrainMod.MOD_ID, name), new BlockItem(block, new Item.Settings().group(group)));
    }
}