package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.util.BiomeCreator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BiomeRegistry {
    public static Biome FRIGID_CAVES;
    public static Biome MUSHROOM_CAVES;
    public static Biome MOLTEN_CAVES;
    public static Biome ARID_CAVES;

    public static final RegistryKey<Biome> FRIGID_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "frigid_caves"));
    public static final RegistryKey<Biome> MUSHROOM_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "mushroom_caves"));
    public static final RegistryKey<Biome> MOLTEN_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "molten_caves"));
    public static final RegistryKey<Biome> ARID_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "arid_caves"));

    public static void register() {
        FRIGID_CAVES = BiomeCreator.createFrigidCaves();
        MUSHROOM_CAVES = BiomeCreator.createMushroomCaves();
        MOLTEN_CAVES = BiomeCreator.createMoltenCaves();
        ARID_CAVES = BiomeCreator.createAridCaves();
        Registry.register(BuiltinRegistries.BIOME, FRIGID_CAVES_KEY.getValue(), FRIGID_CAVES);
        Registry.register(BuiltinRegistries.BIOME, MUSHROOM_CAVES_KEY.getValue(), MUSHROOM_CAVES);
        Registry.register(BuiltinRegistries.BIOME, MOLTEN_CAVES_KEY.getValue(), MOLTEN_CAVES);
        Registry.register(BuiltinRegistries.BIOME, ARID_CAVES_KEY.getValue(), ARID_CAVES);
    }
}