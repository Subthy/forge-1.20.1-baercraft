package net.subthy.baersadditions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties Blood_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 1200, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 1.0F).alwaysEat().fast().build();

    public static final FoodProperties Death_Concentrate = (new FoodProperties.Builder().nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 2400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 7200, 5), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.WITHER, 800, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.POISON, 400, 1), 1.0F).alwaysEat().fast().build());

    public static final FoodProperties Fire_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 1), 1.0F).alwaysEat().fast().build();

    public static final FoodProperties Overworld_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 1), 1.0F).alwaysEat().fast().build();

    public static final FoodProperties Oxygen_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 2), 1.0F).alwaysEat().fast().build();

    public static final FoodProperties Oxytocin_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 2), 1.0F).alwaysEat().fast().build();

    public static final FoodProperties Experience_Concentrate = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F)
            .alwaysEat().fast().build();


}
