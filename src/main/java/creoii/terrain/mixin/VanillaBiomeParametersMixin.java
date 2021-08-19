package creoii.terrain.mixin;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import creoii.terrain.registry.BiomeRegistry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VanillaBiomeParameters.class)
public abstract class VanillaBiomeParametersMixin {
    @Shadow protected abstract void writeCaveBiomeParameters(ImmutableList.Builder<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange temperature, MultiNoiseUtil.ParameterRange humidity, MultiNoiseUtil.ParameterRange continentalness, MultiNoiseUtil.ParameterRange erosion, MultiNoiseUtil.ParameterRange weirdness, float offset, RegistryKey<Biome> biome);
    @Shadow @Final private MultiNoiseUtil.ParameterRange DEFAULT_PARAMETER;

    @Inject(method = "writeCaveBiomes", at = @At("TAIL"))
    private void terrain$applyCaveBiomes(ImmutableList.Builder<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, CallbackInfo ci) {
        this.writeCaveBiomeParameters(parameters, MultiNoiseUtil.createParameterRange(-1.0F, 0.0F), DEFAULT_PARAMETER, DEFAULT_PARAMETER, DEFAULT_PARAMETER, DEFAULT_PARAMETER, 0.0F, BiomeRegistry.FRIGID_CAVES_KEY);
        this.writeCaveBiomeParameters(parameters, DEFAULT_PARAMETER, DEFAULT_PARAMETER, MultiNoiseUtil.createParameterRange(-1.05F, -1.05F), DEFAULT_PARAMETER, DEFAULT_PARAMETER, 0.0F, BiomeRegistry.MUSHROOM_CAVES_KEY);
        this.writeCaveBiomeParameters(parameters, MultiNoiseUtil.createParameterRange(0.0F, 1.0F), DEFAULT_PARAMETER, DEFAULT_PARAMETER, DEFAULT_PARAMETER, DEFAULT_PARAMETER, 0.0F, BiomeRegistry.MOLTEN_CAVES_KEY);
        this.writeCaveBiomeParameters(parameters, MultiNoiseUtil.createParameterRange(0.0F, 1.0F), MultiNoiseUtil.createParameterRange(0.0F, 1.0F), DEFAULT_PARAMETER, DEFAULT_PARAMETER, DEFAULT_PARAMETER, 0.0F, BiomeRegistry.ARID_CAVES_KEY);
    }
}