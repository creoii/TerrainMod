package creoii.terrain.util;

import creoii.terrain.TerrainMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class EntityTypeTags {
    public static final Tag<EntityType<?>> MOLTEN_MAGMA_WALKABLE = TagFactory.ENTITY_TYPE.create(new Identifier(TerrainMod.MOD_ID, "molten_magma_walkable"));
    public static final Tag<EntityType<?>> QUICKSAND_WALKABLE = TagFactory.ENTITY_TYPE.create(new Identifier(TerrainMod.MOD_ID, "quicksand_walkable"));
}