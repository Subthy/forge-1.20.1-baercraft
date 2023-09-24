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
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Axolotl = registerBlock("plushie_axolotl",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Bee = registerBlock("plushie_bee",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Chicken = registerBlock("plushie_chicken",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Cow = registerBlock("plushie_cow",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Fox = registerBlock("plushie_fox",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Parrot = registerBlock("plushie_parrot",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Pig = registerBlock("plushie_pig",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Sheep = registerBlock("plushie_sheep",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Turtle = registerBlock("plushie_turtle",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Camel = registerBlock("plushie_camel",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Cat = registerBlock("plushie_cat",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Creeper = registerBlock("plushie_creeper",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));

    public static final RegistryObject<Block> Plushie_Dolphin = registerBlock("plushie_dolphin",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Ender_Dragon = registerBlock("plushie_enderdragon",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Enderman = registerBlock("plushie_enderman",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Frog = registerBlock("plushie_frog",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Ghast = registerBlock("plushie_ghast",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Goat = registerBlock("plushie_goat",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Horse = registerBlock("plushie_horse",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Mooshroom = registerBlock("plushie_mooshroom",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Panda = registerBlock("plushie_panda",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Polar_Bear = registerBlock("plushie_polar_bear",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Pufferfish = registerBlock("plushie_pufferfish",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Rabbit = registerBlock("plushie_rabbit",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Skeleton_Horse = registerBlock("plushie_skeleton_horse",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Sniffer = registerBlock("plushie_sniffer",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Squid = registerBlock("plushie_squid",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Wolf = registerBlock("plushie_wolf",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Donkey = registerBlock("plushie_donkey",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Bat = registerBlock("plushie_bat",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Phantom = registerBlock("plushie_phantom",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Skeleton = registerBlock("plushie_skeleton",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Spider = registerBlock("plushie_spider",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Warden = registerBlock("plushie_warden",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Witch = registerBlock("plushie_witch",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Wither = registerBlock("plushie_wither",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Wither_Skeleton = registerBlock("plushie_wither_skeleton",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Zoglin = registerBlock("plushie_zoglin",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .noOcclusion()));
    public static final RegistryObject<Block> Plushie_Zombie = registerBlock("plushie_zombie",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
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
