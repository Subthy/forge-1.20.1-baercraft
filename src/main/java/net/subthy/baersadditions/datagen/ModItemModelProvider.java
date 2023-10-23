package net.subthy.baersadditions.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLanguageProvider;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.registries.ForgeRegistries;
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
        simpleItem(ModItems.Nether_Concentrate);
        simpleItem(ModItems.Raw_Platinum);
        simpleItem(ModItems.Rainbow_Road);
        simpleBlockItem(ModBlocks.Lavender);
        simpleItem(ModItems.Arrow_Test);


        complexBlock(ModBlocks.Plushie_Allay.get());
        complexBlock(ModBlocks.Plushie_Axolotl.get());
        complexBlock(ModBlocks.Plushie_Bee.get());
        complexBlock(ModBlocks.Plushie_Chicken.get());
        complexBlock(ModBlocks.Plushie_Cow.get());
        complexBlock(ModBlocks.Plushie_Fox.get());
        complexBlock(ModBlocks.Plushie_Parrot.get());
        complexBlock(ModBlocks.Plushie_Pig.get());
        complexBlock(ModBlocks.Plushie_Sheep.get());
        complexBlock(ModBlocks.Plushie_Turtle.get());
        complexBlock(ModBlocks.Plushie_Camel.get());
        complexBlock(ModBlocks.Plushie_Cat.get());
        complexBlock(ModBlocks.Plushie_Creeper.get());
        complexBlock(ModBlocks.Plushie_Dolphin.get());
        complexBlock(ModBlocks.Plushie_Donkey.get());
        complexBlock(ModBlocks.Plushie_Ender_Dragon.get());
        complexBlock(ModBlocks.Plushie_Enderman.get());
        complexBlock(ModBlocks.Plushie_Frog.get());
        complexBlock(ModBlocks.Plushie_Ghast.get());
        complexBlock(ModBlocks.Plushie_Goat.get());
        complexBlock(ModBlocks.Plushie_Horse.get());
        complexBlock(ModBlocks.Plushie_Mooshroom.get());
        complexBlock(ModBlocks.Plushie_Panda.get());
        complexBlock(ModBlocks.Plushie_Polar_Bear.get());
        complexBlock(ModBlocks.Plushie_Pufferfish.get());
        complexBlock(ModBlocks.Plushie_Rabbit.get());
        complexBlock(ModBlocks.Plushie_Skeleton_Horse.get());
        complexBlock(ModBlocks.Plushie_Sniffer.get());
        complexBlock(ModBlocks.Plushie_Squid.get());
        complexBlock(ModBlocks.Plushie_Wolf.get());
        complexBlock(ModBlocks.Plushie_Bat.get());
        complexBlock(ModBlocks.Plushie_Phantom.get());
        complexBlock(ModBlocks.Plushie_Skeleton.get());
        complexBlock(ModBlocks.Plushie_Spider.get());
        complexBlock(ModBlocks.Plushie_Warden.get());
        complexBlock(ModBlocks.Plushie_Witch.get());
        complexBlock(ModBlocks.Plushie_Wither.get());
        complexBlock(ModBlocks.Plushie_Wither_Skeleton.get());
        complexBlock(ModBlocks.Plushie_Zoglin.get());
        complexBlock(ModBlocks.Plushie_Zombie.get());


    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(BaersAdditions.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
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
