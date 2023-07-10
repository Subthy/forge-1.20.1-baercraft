package net.subthy.baersadditions.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;


import java.util.List;

public class ExperienceConcentrate extends Item {

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            if (pLivingEntity instanceof ServerPlayer) {
                int i = 3 + pLevel.random.nextInt(5) + pLevel.random.nextInt(5);
                ((ServerPlayer) pLivingEntity).giveExperiencePoints(i);
            }
        }

        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }



    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);

        pTooltipComponents.add(Component.translatable("tooltip.baersadditions.experience_bottle.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public ExperienceConcentrate(Properties pProperties) {
        super(pProperties);
    }
}
