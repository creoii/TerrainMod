package creoii.terrain;

import creoii.terrain.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class TerrainMod implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "terrain";

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		ItemRegistry.register();
		FeatureRegistry.register();
	}

	@Override
	public void onInitializeClient() {
		BlockRegistry.registerClient();
	}
}