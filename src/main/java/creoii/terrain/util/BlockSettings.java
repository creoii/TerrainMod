package creoii.terrain.util;

import creoii.terrain.block.LuminiteBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BlockSettings {
    public static final AbstractBlock.Settings MOLTEN_MAGMA = AbstractBlock.Settings.of(Material.STONE, MapColor.DARK_RED).strength(0.33F).luminance((state) -> 3).postProcess(BlockSettings::always).emissiveLighting(BlockSettings::always);
    public static final AbstractBlock.Settings QUICKSAND = AbstractBlock.Settings.copy(Blocks.SAND).strength(0.75F, 0.5F).mapColor(MapColor.OAK_TAN);
    public static final AbstractBlock.Settings LUMINITE = AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE).luminance((state) -> state.get(LuminiteBlock.LIT) ? 3 : 0).postProcess((state, world, pos) -> state.get(LuminiteBlock.LIT)).emissiveLighting(((state, world, pos) -> state.get(LuminiteBlock.LIT)));
    public static final AbstractBlock.Settings CRYSTALLINE_LUMINITE = AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE).luminance((state) -> state.get(LuminiteBlock.LIT) ? 5 : 3).postProcess((state, world, pos) -> state.get(LuminiteBlock.LIT)).emissiveLighting(((state, world, pos) -> state.get(LuminiteBlock.LIT)));

    public static AbstractBlock.Settings caveMushroom(MapColor color) {
        return AbstractBlock.Settings.of(Material.WOOD, color).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM);
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) { return true; }
    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
}