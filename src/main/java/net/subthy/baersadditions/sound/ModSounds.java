package net.subthy.baersadditions.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.baersadditions.BaersAdditions;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> Sound_Event =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BaersAdditions.MOD_ID);

    public static final RegistryObject<SoundEvent> Rainbow_Road = registerSoundEvents("rainbow_road");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(BaersAdditions.MOD_ID, name);
        return Sound_Event.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        Sound_Event.register(eventBus);
    }
}