package net.subthy.baersadditions.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.subthy.baersadditions.BaersAdditions;


public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> Add_Lavender = registerKey("add_lavender");
    public static final ResourceKey<BiomeModifier> Add_Platinum_ore = registerKey("add_platinum_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(Add_Lavender, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Lavender_Placed_Key)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(Add_Platinum_ore, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.Platinum_Ore_Placed_Key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        }
    private static ResourceKey<BiomeModifier> registerKey (String name){
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(BaersAdditions.MOD_ID, name));
    }
}