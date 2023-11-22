package net.subthy.baersadditions.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.subthy.baersadditions.BaersAdditions;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.Coin.get(), new ResourceLocation(BaersAdditions.MOD_ID,"count"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.getCount());
    }


}
