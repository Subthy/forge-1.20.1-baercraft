package net.subthy.baersadditions.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.block.custom.*;
import net.subthy.baersadditions.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BaersAdditions.MOD_ID);

    public static final RegistryObject<Block> Platinum_Block = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Raw_Platinum_Block = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Platinum_Ore = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,5)));

    public static final RegistryObject<Block> Deepslate_Platinum_Ore = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(2,5)));

    public static final RegistryObject<Block> Lavender = registerBlock("lavender",
            () -> new FlowerBlock(() -> MobEffects.REGENERATION, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> Potted_Lavender = BLOCKS.register("potted_lavender",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), Lavender, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> Plushie_Allay = registerBlock("plushie_allay",
            () -> new Plushie_Allay(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Axolotl = registerBlock("plushie_axolotl",
            () -> new Plushie_Axolotl(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Bee = registerBlock("plushie_bee",
            () -> new Plushie_Bee(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Chicken = registerBlock("plushie_chicken",
            () -> new Plushie_Chicken(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Cow = registerBlock("plushie_cow",
            () -> new Plushie_Cow(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Fox = registerBlock("plushie_fox",
            () -> new Plushie_Fox(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Parrot = registerBlock("plushie_parrot",
            () -> new Plushie_Parrot(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Pig = registerBlock("plushie_pig",
            () -> new Plushie_Pig(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Sheep = registerBlock("plushie_sheep",
            () -> new Plushie_Sheep(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Turtle = registerBlock("plushie_turtle",
            () -> new Plushie_Turtle(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
