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

                        pOutput.accept(ModBlocks.Platinum_Block.get());
                        pOutput.accept(ModBlocks.Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Lavender.get());
                        pOutput.accept(ModBlocks.Deepslate_Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Raw_Platinum_Block.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CEATIVE_MOD_TABS.register(eventBus);
    }

}
