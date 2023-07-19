package net.subthy.baersadditions.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;
import net.subthy.baersadditions.entity.custom.TestArrow;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BaersAdditions.MOD_ID);


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
