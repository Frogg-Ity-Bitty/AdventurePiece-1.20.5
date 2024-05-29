package net.froggitybitty.adventurepiecemod.block;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.froggitybitty.adventurepiecemod.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdventurePieceMod.MODID);

    public static final DeferredBlock<Block> SEA_STONE_BLOCK_50 = BLOCKS.registerSimpleBlock("sea_stone_block_50", BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.COLOR_CYAN), );

    public static final DeferredItem<BlockItem> SEA_STONE_BLOCK_50_ITEM = ITEMS.registerSimpleBlockItem("sea_stone_block_50", SEA_STONE_BLOCK_50);
}
