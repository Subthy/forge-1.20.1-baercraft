package net.subthy.baersadditions.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.block.ModBlocks;
import net.subthy.baersadditions.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // These Blocks drop themselves
        this.dropSelf(ModBlocks.Platinum_Block.get());
        this.dropSelf(ModBlocks.Raw_Platinum_Block.get());
        this.dropSelf(ModBlocks.Lavender.get());
        // These Blocks drop Items
        this.add(ModBlocks.Platinum_Ore.get(),
                block -> createOreDrop(ModBlocks.Platinum_Ore.get(), ModItems.Raw_Platinum.get()));
        this.add(ModBlocks.Deepslate_Platinum_Ore.get(),
                block -> createOreDrop(ModBlocks.Deepslate_Platinum_Ore.get(), ModItems.Raw_Platinum.get()));
        this.add(ModBlocks.Potted_Lavender.get(),
                createPotFlowerItemTable(ModBlocks.Potted_Lavender.get()));
        this.dropSelf(ModBlocks.Plushie_Allay.get());
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
