package net.subthy.baersadditions.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.entity.Entity;


public class TestArrow extends Item {


    public TestArrow(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult){
        if (Entity instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200));
        }
    }
}
