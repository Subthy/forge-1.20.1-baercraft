package net.subthy.baersadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BaersAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Add Block Tags here
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Platinum_Block.get(), ModBlocks.Platinum_Ore.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
