package net.froggitybitty.adventurepiecemod.item;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModItems extends Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdventurePieceMod.MODID);

    public static final DeferredItem<Item> STRAW_HAT_ICON = ITEMS.registerSimpleItem("straw_hat_icon",
            new Item.Properties());

    public static final Supplier<SwordItem> POLE = ITEMS.register("pole", () -> new SwordItem(
            Tiers.WOOD,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.WOOD, 1, -2.2f)
            )
    ){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A wooden pole, whack people or put a hammer head on it").withStyle(ChatFormatting.GRAY));
        }
    });
















}
