package net.subthy.baersadditions.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.subthy.baersadditions.BaersAdditions;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.Copper_Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());

        ItemProperties.register(ModItems.Iron_Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());

        ItemProperties.register(ModItems.Gold_Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());

        ItemProperties.register(ModItems.Diamond_Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());

        ItemProperties.register(ModItems.Netherite_Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());
    }


}
