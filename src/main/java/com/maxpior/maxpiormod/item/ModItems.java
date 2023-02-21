package com.maxpior.maxpiormod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.maxpior.maxpiormod.MaxPiorMod;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MaxPiorMod.MODID);

    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget",
            ()-> new Item(new Item.Properties().food(FoodProps.CHICKEN_NUGGET)));

    public static class FoodProps {

        public static final FoodProperties CHICKEN_NUGGET = new FoodProperties.Builder()
                .nutrition(2)
                .meat().fast()
                .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2), 1)
                .build();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
