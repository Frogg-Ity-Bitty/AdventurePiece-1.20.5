package net.froggitybitty.adventurepiecemod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.froggitybitty.adventurepiecemod.block.ModBlocks.SEA_STONE_BLOCK_50_ITEM;
import static net.froggitybitty.adventurepiecemod.item.ModItems.STRAW_HAT_ICON;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create
            (Registries.CREATIVE_MODE_TAB, AdventurePieceMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ADVENTURE_PIECE_TAB = CREATIVE_MODE_TABS.register
            ("adventure_piece_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.adventurepiecemod"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> STRAW_HAT_ICON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
            // The list of every Item in the Adventure Piece Tab
                output.accept(STRAW_HAT_ICON.get());
                output.accept(SEA_STONE_BLOCK_50_ITEM.get());

            }).build());
}
