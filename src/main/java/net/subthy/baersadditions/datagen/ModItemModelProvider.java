package net.subthy.baersadditions.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLanguageProvider;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.block.ModBlocks;
import net.subthy.baersadditions.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BaersAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Platinum_Ingot);
        simpleItem(ModItems.Platinum_Nugget);
        simpleItem(ModItems.BaerCraft_Quests);
        simpleItem(ModItems.BaerCraft_Tome);
        simpleItem(ModItems.Blood_Concentrate);
        simpleItem(ModItems.Death_Concentrate);
        simpleItem(ModItems.Experience_Concentrate);
        simpleItem(ModItems.Fire_Concentrate);
        simpleItem(ModItems.Overworld_Concentrate);
        simpleItem(ModItems.Oxygen_Concentrate);
        simpleItem(ModItems.Oxytocin_Concentrate);
        simpleItem(ModItems.Peoples_Republic_Tome);
        simpleItem(ModItems.Vial_Bottle);
        simpleBlockItem(ModBlocks.Lavender);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BaersAdditions.MOD_ID, "item/" + item.getId().getPath()));

    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BaersAdditions.MOD_ID, "item/" + item.getId().getPath()));
    }
}
