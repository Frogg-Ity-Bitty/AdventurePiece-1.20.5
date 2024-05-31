package net.froggitybitty.adventurepiecemod.item;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.froggitybitty.adventurepiecemod.item.custom.HammerItem;
import net.froggitybitty.adventurepiecemod.item.custom.ModFoods;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModItems extends Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdventurePieceMod.MODID);

    public static final DeferredItem<Item> STRAW_HAT_ICON = ITEMS.registerSimpleItem("straw_hat_icon",
            new Item.Properties());

    public static final Supplier<Item> SEA_KING_MEAT = ITEMS.register("sea_king_meat", () -> new Item(
            new Item.Properties().stacksTo(64).food(ModFoods.SEA_KING_MEAT_COOKED)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("The Cooked flesh of a Sea King, Huge and immensely powerful sea creatures!").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> SEA_KING_MEAT_RAW = ITEMS.register("sea_king_meat_raw", () -> new Item(
            new Item.Properties().stacksTo(64).food(ModFoods.SEA_KING_MEAT_RAW)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("The flesh of a Sea King, Huge and immensely powerful sea creatures!").withStyle(ChatFormatting.GRAY));
        }});

    // Hammer parts ----------------------------------------------------------------------------------------------------
    public static final Supplier<SwordItem> POLE = ITEMS.register("pole", () -> new SwordItem(Tiers.WOOD,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.WOOD, 1, -2.2f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A wooden pole, whack people or put a hammer head on it").withStyle(ChatFormatting.GRAY));
    }});
    public static final Supplier<HammerItem> HAMMER = ITEMS.register("hammer", () -> new HammerItem(Tiers.IRON,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.IRON, 3, -2.4f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A steel hammer, can be used to forge a blade").withStyle(ChatFormatting.GRAY));
    }});
    public static final Supplier<Item> HAMMER_HEAD_5 = ITEMS.register("hammer_head_5", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A 5 ton hammer head, craft a hammer with it.").withStyle(ChatFormatting.GRAY));
    }});
    public static final Supplier<HammerItem> HAMMER_5 = ITEMS.register("hammer_5", () -> new HammerItem(Tiers.DIAMOND,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.DIAMOND, 14, -3.4f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A 5 Ton Hammer, needs 50 strength to use.").withStyle(ChatFormatting.GRAY));
    }});
    public static final Supplier<Item> HAMMER_HEAD_10 = ITEMS.register("hammer_head_10", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A 10 ton hammer head, craft a hammer with it.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<HammerItem> HAMMER_10 = ITEMS.register("hammer_10", () -> new HammerItem(Tiers.NETHERITE,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.NETHERITE, 31, -3.8f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A 10 Ton Hammer, needs 100 strength to use.").withStyle(ChatFormatting.GRAY));
    }});

    // Fake Hammer parts -----------------------------------------------------------------------------------------------
    public static final Supplier<Item> HAMMER_HEAD_5_PAPER = ITEMS.register("hammer_head_5_paper", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 5 ton hammer head made of paper, paint it black and craft it into a fake hammer").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> HAMMER_HEAD_5_FAKE = ITEMS.register("hammer_head_5_fake", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 5 ton hammer head, craft a hammer with it.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<HammerItem> HAMMER_5_FAKE = ITEMS.register("hammer_5_fake", () -> new HammerItem(Tiers.DIAMOND,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.DIAMOND, 14, -3.4f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 5 Ton Hammer").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> HAMMER_HEAD_10_PAPER = ITEMS.register("hammer_head_10_paper", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 10 ton hammer head made of paper, paint it black and craft it into a fake hammer").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> HAMMER_HEAD_10_FAKE = ITEMS.register("hammer_head_10_fake", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 10 ton hammer head, craft a hammer with it.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<HammerItem> HAMMER_10_FAKE = ITEMS.register("hammer_10_fake", () -> new HammerItem(Tiers.NETHERITE,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.NETHERITE, 31, -3.8f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A fake 10 Ton Hammer").withStyle(ChatFormatting.GRAY));
        }});

    // Blade parts -----------------------------------------------------------------------------------------------------
    public static final Supplier<Item> RAW_BLADE = ITEMS.register("raw_blade", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Raw steel that still needs to be forged.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> BLADE_FORGED_STAGE_1 = ITEMS.register("blade_forged_stage_1", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("It is starting to look like a blade now.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> BLADE_FORGED_STAGE_2 = ITEMS.register("blade_forged_stage_2", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Getting better, just one more!").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> BLADE_FORGED_STAGE_3 = ITEMS.register("blade_forged_stage_3", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Now polish it on a grindstone!").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> POLISHED_BLADE = ITEMS.register("polished_blade", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Good, now put clay on it for differential tempering.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> CLAYED_BLADE = ITEMS.register("clayed_blade", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Put it in a furnace and then drop it in water.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> UNSHARPENED_BLADE = ITEMS.register("unsharpened_blade", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Now just sharpen it on a grindstone.").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> BLADE = ITEMS.register("blade", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Perfect! Now put a handle on it and its done!").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<Item> HANDLE = ITEMS.register("handle", () -> new Item(
            new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("Put it on a blade to make a sword").withStyle(ChatFormatting.GRAY));
        }});
    public static final Supplier<SwordItem> BASIC_KATANA = ITEMS.register("basic_katana", () -> new SwordItem(Tiers.DIAMOND,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.4f)
            )){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.literal("A standard quality Katana.").withStyle(ChatFormatting.GRAY));
        }});

















}
