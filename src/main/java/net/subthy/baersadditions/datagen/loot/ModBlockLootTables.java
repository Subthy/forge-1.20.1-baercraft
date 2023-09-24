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
        this.dropSelf(ModBlocks.Plushie_Axolotl.get());
        this.dropSelf(ModBlocks.Plushie_Bee.get());
        this.dropSelf(ModBlocks.Plushie_Chicken.get());
        this.dropSelf(ModBlocks.Plushie_Cow.get());
        this.dropSelf(ModBlocks.Plushie_Fox.get());
        this.dropSelf(ModBlocks.Plushie_Parrot.get());
        this.dropSelf(ModBlocks.Plushie_Pig.get());
        this.dropSelf(ModBlocks.Plushie_Sheep.get());
        this.dropSelf(ModBlocks.Plushie_Turtle.get());
        this.dropSelf(ModBlocks.Plushie_Camel.get());
        this.dropSelf(ModBlocks.Plushie_Cat.get());
        this.dropSelf(ModBlocks.Plushie_Creeper.get());
        this.dropSelf(ModBlocks.Plushie_Dolphin.get());
        this.dropSelf(ModBlocks.Plushie_Donkey.get());
        this.dropSelf(ModBlocks.Plushie_Ender_Dragon.get());
        this.dropSelf(ModBlocks.Plushie_Enderman.get());
        this.dropSelf(ModBlocks.Plushie_Frog.get());
        this.dropSelf(ModBlocks.Plushie_Ghast.get());
        this.dropSelf(ModBlocks.Plushie_Goat.get());
        this.dropSelf(ModBlocks.Plushie_Horse.get());
        this.dropSelf(ModBlocks.Plushie_Mooshroom.get());
        this.dropSelf(ModBlocks.Plushie_Panda.get());
        this.dropSelf(ModBlocks.Plushie_Polar_Bear.get());
        this.dropSelf(ModBlocks.Plushie_Pufferfish.get());
        this.dropSelf(ModBlocks.Plushie_Rabbit.get());
        this.dropSelf(ModBlocks.Plushie_Skeleton_Horse.get());
        this.dropSelf(ModBlocks.Plushie_Sniffer.get());
        this.dropSelf(ModBlocks.Plushie_Squid.get());
        this.dropSelf(ModBlocks.Plushie_Wolf.get());
        this.dropSelf(ModBlocks.Plushie_Bat.get());
        this.dropSelf(ModBlocks.Plushie_Phantom.get());
        this.dropSelf(ModBlocks.Plushie_Skeleton.get());
        this.dropSelf(ModBlocks.Plushie_Spider.get());
        this.dropSelf(ModBlocks.Plushie_Warden.get());
        this.dropSelf(ModBlocks.Plushie_Witch.get());
        this.dropSelf(ModBlocks.Plushie_Wither.get());
        this.dropSelf(ModBlocks.Plushie_Wither_Skeleton.get());
        this.dropSelf(ModBlocks.Plushie_Zoglin.get());
        this.dropSelf(ModBlocks.Plushie_Zombie.get());
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
