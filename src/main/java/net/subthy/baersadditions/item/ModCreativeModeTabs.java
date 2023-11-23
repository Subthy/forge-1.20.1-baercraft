package net.subthy.baersadditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CEATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaersAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BAERSADDITIONS_TAB = CEATIVE_MOD_TABS.register("baersadditons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BaerCraft_Tome.get()))
                    .title(Component.translatable("creativetab.baersadditions_tab"))
                    .displayItems((pParamiters, pOutput) -> {
                        pOutput.accept(ModItems.Platinum_Ingot.get());
                        pOutput.accept(ModItems.Platinum_Nugget.get());
                        pOutput.accept(ModItems.Peoples_Republic_Tome.get());
                        pOutput.accept(ModItems.BaerCraft_Quests.get());
                        pOutput.accept(ModItems.BaerCraft_Tome.get());
                        pOutput.accept(ModItems.Trash_Panda_Craft_Tome.get());
                        pOutput.accept(ModItems.Blood_Concentrate.get());
                        pOutput.accept(ModItems.Death_Concentrate.get());
                        pOutput.accept(ModItems.Fire_Concentrate.get());
                        pOutput.accept(ModItems.Overworld_Concentrate.get());
                        pOutput.accept(ModItems.Oxygen_Concentrate.get());
                        pOutput.accept(ModItems.Oxytocin_Concentrate.get());
                        pOutput.accept(ModItems.Vial_Bottle.get());
                        pOutput.accept(ModItems.Experience_Concentrate.get());
                        pOutput.accept(ModItems.Trash_Panda_Craft_Tome.get());
                        pOutput.accept(ModItems.Raw_Platinum.get());
                        pOutput.accept(ModItems.Rainbow_Road.get());
                        pOutput.accept(ModItems.PokeASub_Tome.get());
                        pOutput.accept(ModItems.Copper_Coin.get());
                        pOutput.accept(ModItems.Iron_Coin.get());
                        pOutput.accept(ModItems.Gold_Coin.get());
                        pOutput.accept(ModItems.Diamond_Coin.get());
                        pOutput.accept(ModItems.Netherite_Coin.get());

                        pOutput.accept(ModBlocks.Platinum_Block.get());
                        pOutput.accept(ModBlocks.Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Lavender.get());
                        pOutput.accept(ModBlocks.Deepslate_Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Raw_Platinum_Block.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BAERSADDITIONS_PLUSHIE_TAB = CEATIVE_MOD_TABS.register("baersadditons_plushie_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.Plushie_Allay.get()))
                    .title(Component.translatable("creativetab.baersadditions_plushie_tab"))
                    .displayItems((pParamiters, pOutput) -> {
                        pOutput.accept(ModBlocks.Plushie_Allay.get());
                        pOutput.accept(ModBlocks.Plushie_Chicken.get());
                        pOutput.accept(ModBlocks.Plushie_Axolotl.get());
                        pOutput.accept(ModBlocks.Plushie_Bee.get());
                        pOutput.accept(ModBlocks.Plushie_Cow.get());
                        pOutput.accept(ModBlocks.Plushie_Turtle.get());
                        pOutput.accept(ModBlocks.Plushie_Sheep.get());
                        pOutput.accept(ModBlocks.Plushie_Pig.get());
                        pOutput.accept(ModBlocks.Plushie_Parrot.get());
                        pOutput.accept(ModBlocks.Plushie_Fox.get());
                        pOutput.accept(ModBlocks.Plushie_Camel.get());
                        pOutput.accept(ModBlocks.Plushie_Cat.get());
                        pOutput.accept(ModBlocks.Plushie_Creeper.get());
                        pOutput.accept(ModBlocks.Plushie_Dolphin.get());
                        pOutput.accept(ModBlocks.Plushie_Donkey.get());
                        pOutput.accept(ModBlocks.Plushie_Ender_Dragon.get());
                        pOutput.accept(ModBlocks.Plushie_Enderman.get());
                        pOutput.accept(ModBlocks.Plushie_Frog.get());
                        pOutput.accept(ModBlocks.Plushie_Ghast.get());
                        pOutput.accept(ModBlocks.Plushie_Goat.get());
                        pOutput.accept(ModBlocks.Plushie_Horse.get());
                        pOutput.accept(ModBlocks.Plushie_Mooshroom.get());
                        pOutput.accept(ModBlocks.Plushie_Panda.get());
                        pOutput.accept(ModBlocks.Plushie_Polar_Bear.get());
                        pOutput.accept(ModBlocks.Plushie_Pufferfish.get());
                        pOutput.accept(ModBlocks.Plushie_Rabbit.get());
                        pOutput.accept(ModBlocks.Plushie_Skeleton_Horse.get());
                        pOutput.accept(ModBlocks.Plushie_Sniffer.get());
                        pOutput.accept(ModBlocks.Plushie_Squid.get());
                        pOutput.accept(ModBlocks.Plushie_Wolf.get());
                        pOutput.accept(ModBlocks.Plushie_Bat.get());
                        pOutput.accept(ModBlocks.Plushie_Phantom.get());
                        pOutput.accept(ModBlocks.Plushie_Skeleton.get());
                        pOutput.accept(ModBlocks.Plushie_Spider.get());
                        pOutput.accept(ModBlocks.Plushie_Warden.get());
                        pOutput.accept(ModBlocks.Plushie_Witch.get());
                        pOutput.accept(ModBlocks.Plushie_Wither.get());
                        pOutput.accept(ModBlocks.Plushie_Wither_Skeleton.get());
                        pOutput.accept(ModBlocks.Plushie_Zoglin.get());
                        pOutput.accept(ModBlocks.Plushie_Zombie.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CEATIVE_MOD_TABS.register(eventBus);
    }

}
