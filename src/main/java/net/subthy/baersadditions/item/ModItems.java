package net.subthy.baersadditions.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaersAdditions.MOD_ID);

    public static final RegistryObject<Item> Platinum_Ingot = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Platinum_Nugget = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Vial_Bottle = ITEMS.register("vial_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Peoples_Republic_Tome = ITEMS.register("peoples_republic_tome",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BaerCraft_Quests = ITEMS.register("baercraft_quests",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BaerCraft_Tome = ITEMS.register("baercraft_tome",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }
}
