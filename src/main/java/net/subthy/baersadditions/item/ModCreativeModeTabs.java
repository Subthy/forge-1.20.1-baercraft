package net.subthy.baersadditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CEATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaersAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BAERSADDITIONS_TAB = CEATIVE_MOD_TABS.register("baersadditons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BaerCraft_Tome.get()))
                    .title(Component.translatable("creativetab.baersadditions_tab"))
                    .displayItems((pParamiters, pOutput) -> {
                        pOutput.accept(ModItems.Platinum_Ingot.get());
                        pOutput.accept(ModItems.Platinum_Nugget.get());
                        pOutput.accept(ModItems.Vial_Bottle.get());
                        pOutput.accept(ModItems.Peoples_Republic_Tome.get());
                        pOutput.accept(ModItems.BaerCraft_Quests.get());
                        pOutput.accept(ModItems.BaerCraft_Tome.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CEATIVE_MOD_TABS.register(eventBus);
    }

}
