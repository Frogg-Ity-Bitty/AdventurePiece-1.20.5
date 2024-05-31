package net.froggitybitty.adventurepiecemod.item.custom;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SEA_KING_MEAT_COOKED = (new FoodProperties.Builder())
            .nutrition(12).saturationModifier(2F).build();

    public static final FoodProperties SEA_KING_MEAT_RAW = (new FoodProperties.Builder())
            .nutrition(6).saturationModifier(1F).build();
}
