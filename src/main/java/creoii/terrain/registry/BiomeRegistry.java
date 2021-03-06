package creoii.terrain.registry;

import creoii.terrain.TerrainMod;
import creoii.terrain.util.BiomeCreator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BiomeRegistry {
    //CAVES
    public static Biome FRIGID_CAVES;
    public static Biome MUSHROOM_CAVES;
    public static Biome MOLTEN_CAVES;
    public static Biome ARID_CAVES;
    public static Biome CRYSTAL_CAVES;
    //wip
    public static Biome JUNGLE_CAVES;
    //MESA CAVES

    //RIVERS
    public static Biome TROPICAL_RIVER;

    public static final RegistryKey<Biome> FRIGID_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "frigid_caves"));
    public static final RegistryKey<Biome> MUSHROOM_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "mushroom_caves"));
    public static final RegistryKey<Biome> MOLTEN_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "molten_caves"));
    public static final RegistryKey<Biome> ARID_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "arid_caves"));
    public static final RegistryKey<Biome> CRYSTAL_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "crystal_caves"));
    public static final RegistryKey<Biome> JUNGLE_CAVES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "jungle_caves"));

    public static final RegistryKey<Biome> TROPICAL_RIVER_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(TerrainMod.MOD_ID, "tropical_river"));

    public static void register() {
        FRIGID_CAVES = BiomeCreator.createFrigidCaves();
        MUSHROOM_CAVES = BiomeCreator.createMushroomCaves();
        MOLTEN_CAVES = BiomeCreator.createMoltenCaves();
        ARID_CAVES = BiomeCreator.createAridCaves();
        CRYSTAL_CAVES = BiomeCreator.createCrystalCaves();
        JUNGLE_CAVES = BiomeCreator.createJungleCaves();
        TROPICAL_RIVER = BiomeCreator.createTropicalRiver();
        Registry.register(BuiltinRegistries.BIOME, FRIGID_CAVES_KEY.getValue(), FRIGID_CAVES);
        Registry.register(BuiltinRegistries.BIOME, MUSHROOM_CAVES_KEY.getValue(), MUSHROOM_CAVES);
        Registry.register(BuiltinRegistries.BIOME, MOLTEN_CAVES_KEY.getValue(), MOLTEN_CAVES);
        Registry.register(BuiltinRegistries.BIOME, ARID_CAVES_KEY.getValue(), ARID_CAVES);
        Registry.register(BuiltinRegistries.BIOME, CRYSTAL_CAVES_KEY.getValue(), CRYSTAL_CAVES);
        //Registry.register(BuiltinRegistries.BIOME, JUNGLE_CAVES_KEY.getValue(), JUNGLE_CAVES);
        Registry.register(BuiltinRegistries.BIOME, TROPICAL_RIVER_KEY.getValue(), TROPICAL_RIVER);
    }
}