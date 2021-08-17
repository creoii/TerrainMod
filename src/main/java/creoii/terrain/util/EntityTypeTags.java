package creoii.terrain.util;

import creoii.terrain.TerrainMod;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class EntityTypeTags {
    public static final Tag<EntityType<?>> MOLTEN_MAGMA_WALKABLE = TagRegistry.entityType(new Identifier(TerrainMod.MOD_ID, "molten_magma_walkable"));
}