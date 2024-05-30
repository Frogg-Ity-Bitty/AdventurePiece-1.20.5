package net.froggitybitty.adventurepiecemod.block;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

import static net.froggitybitty.adventurepiecemod.item.ModItems.ITEMS;

public class ModBlocks extends Items{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdventurePieceMod.MODID);

    public static final Supplier<Block> SEA_STONE_BLOCK_50 = BLOCKS.register("sea_stone_block_50", () -> new Block(BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(5.0F, 12.0F).sound(SoundType.METAL)
            .mapColor(MapColor.COLOR_CYAN)){
                @Override
                public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTootipComponents, TooltipFlag pTooltipFlag) {
                    pTootipComponents.add(Component.literal("A rare and powerful mineral infused with the essence of the sea! (50% purity)").withStyle(ChatFormatting.GRAY));
    }});
    public static final DeferredItem<BlockItem> SEA_STONE_BLOCK_50_ITEM = ITEMS.registerSimpleBlockItem("sea_stone_block_50", SEA_STONE_BLOCK_50, new Item.Properties());

    public static final Supplier<Block> SEA_STONE_BLOCK_100 = BLOCKS.register("sea_stone_block_100", () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(10.0F, 24.0F).sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_CYAN)){
                @Override
                public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTootipComponents, TooltipFlag pTooltipFlag) {
                    pTootipComponents.add(Component.literal("A rare and powerful mineral infused with the essence of the sea! (100% purity)").withStyle(ChatFormatting.GRAY));
    }});
    public static final DeferredItem<BlockItem> SEA_STONE_BLOCK_100_ITEM = ITEMS.registerSimpleBlockItem("sea_stone_block_100", SEA_STONE_BLOCK_100, new Item.Properties());


    public static final Supplier<Block> RED_ROCK = BLOCKS.register("red_rock", () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(2.0F, 7.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED)){
                @Override
                public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTootipComponents, TooltipFlag pTooltipFlag) {
                    pTootipComponents.add(Component.literal("The stone that makes up the Red Line!").withStyle(ChatFormatting.GRAY));
    }});
    public static final DeferredItem<BlockItem> RED_ROCK_ITEM = ITEMS.registerSimpleBlockItem("red_rock", RED_ROCK, new Item.Properties());

    public static final Supplier<Block> RED_COBBLE = BLOCKS.register("red_cobble", () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_RED)){
                @Override
                public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTootipComponents, TooltipFlag pTooltipFlag) {
                    pTootipComponents.add(Component.literal("The Cobblestone that makes up the Red Line!").withStyle(ChatFormatting.GRAY));
    }});
    public static final DeferredItem<BlockItem> RED_COBBLE_ITEM = ITEMS.registerSimpleBlockItem("red_cobble", RED_COBBLE, new Item.Properties());
}
