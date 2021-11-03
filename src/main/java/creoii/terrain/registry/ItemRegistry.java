package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.item.QuicksandBucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item QUICKSAND_BUCKET = new QuicksandBucketItem(BlockRegistry.QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new Item.Settings().group(ItemGroup.MISC).maxCount(1));

    public static void register() {
        createItem("quicksand_bucket", QUICKSAND_BUCKET);
    }

    private static <T extends Item> void createItem(String name, T item) {
        Registry.register(Registry.ITEM, new Identifier(TerrainMod.MOD_ID, name), item);
    }
}
