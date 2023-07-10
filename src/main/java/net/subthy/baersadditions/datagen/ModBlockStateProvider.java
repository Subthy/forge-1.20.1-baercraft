package net.subthy.baersadditions.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.block.ModBlocks;
import net.minecraft.world.level.block.Block;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BaersAdditions.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Add simple blocks here
        blockWithItem(ModBlocks.Platinum_Block);
        blockWithItem(ModBlocks.Platinum_Ore);
        // Flower
        simpleBlock(ModBlocks.Lavender.get(),
                models().cross(blockTexture(ModBlocks.Lavender.get()).getPath(), blockTexture(ModBlocks.Lavender.get())).renderType("cutout"));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
