package creoii.terrain.util;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BlockSettings {
    public static final AbstractBlock.Settings MOLTEN_MAGMA = AbstractBlock.Settings.of(Material.STONE, MapColor.DARK_RED).strength(0.33F).luminance((state) -> 3).postProcess(BlockSettings::always);

    public static AbstractBlock.Settings caveMushroom(MapColor color) {
        return AbstractBlock.Settings.of(Material.WOOD, color).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM);
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) { return true; }
    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
}