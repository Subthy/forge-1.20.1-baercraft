package net.subthy.baersadditions.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.item.custom.*;
import net.subthy.baersadditions.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaersAdditions.MOD_ID);

    // Added items
    public static final RegistryObject<Item> Platinum_Ingot = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Raw_Platinum = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Platinum_Nugget = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Peoples_Republic_Tome = ITEMS.register("peoples_republic_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Vial_Bottle = ITEMS.register("vial_bottle",
            () -> new Vial_Bottle(new Item.Properties()));

    public static final RegistryObject<Item> Lavender_Flower = ITEMS.register("lavender_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BaerCraft_Quests = ITEMS.register("baercraft_quests",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BaerCraft_Tome = ITEMS.register("baercraft_tome",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PokeASub_Tome = ITEMS.register("pokeasub_tome",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Trash_Panda_Craft_Tome = ITEMS.register("trash_panda_craft_tome",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Coin = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Blood_Concentrate = ITEMS.register("blood_concentrate",
            () -> new BloodConcentrate(new Item.Properties().food(ModFoods.Blood_Concentrate)));


    public static final RegistryObject<Item> Death_Concentrate = ITEMS.register("death_concentrate",
            () -> new DeathConcentrate(new Item.Properties().food(ModFoods.Death_Concentrate)));

    public static final RegistryObject<Item> Fire_Concentrate = ITEMS.register("fire_concentrate",
            () -> new FireConcentrate(new Item.Properties().food(ModFoods.Fire_Concentrate)));

    public static final RegistryObject<Item> Overworld_Concentrate = ITEMS.register("overworld_concentrate",
            () -> new OverworldConcentrate(new Item.Properties().food(ModFoods.Overworld_Concentrate)));

    public static final RegistryObject<Item> Oxygen_Concentrate = ITEMS.register("oxygen_concentrate",
            () -> new OxygenConcentrate(new Item.Properties().food(ModFoods.Oxygen_Concentrate)));

    public static final RegistryObject<Item> Oxytocin_Concentrate = ITEMS.register("oxytocin_concentrate",
            () -> new OxytocinConcentrate(new  Item.Properties().food(ModFoods.Oxytocin_Concentrate)));

    public static final RegistryObject<Item> Nether_Concentrate = ITEMS.register("nether_concentrate",
            () -> new NetherConcentrate(new Item.Properties().food(ModFoods.Nether_Concentrate)));

    public static final RegistryObject<Item> Experience_Concentrate = ITEMS.register("experience_concentrate",
            () -> new ExperienceConcentrate(new Item.Properties().food((ModFoods.Experience_Concentrate))));

    public static final RegistryObject<Item> Rainbow_Road = ITEMS.register("rainbow_road",
            () -> new RecordItem(4, ModSounds.Rainbow_Road, new Item.Properties().stacksTo(1),1760));

    public static final RegistryObject<Item> Arrow_Test = ITEMS.register("arrow_test",
            () -> new ArrowItem(new Item.Properties()));






    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }
}
