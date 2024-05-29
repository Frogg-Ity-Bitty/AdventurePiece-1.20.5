package net.froggitybitty.adventurepiecemod.item;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdventurePieceMod.MODID);

    public static final DeferredItem<Item> STRAW_HAT_ICON = ITEMS.registerSimpleItem("straw_hat_icon",
            new Item.Properties());

}
