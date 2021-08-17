package creoii.terrain.util;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class BlockSettings {
    public static AbstractBlock.Settings caveMushroom(MapColor color) {
        return AbstractBlock.Settings.of(Material.WOOD, color).strength(2.0F).sounds(BlockSoundGroup.NETHER_STEM);
    }
}