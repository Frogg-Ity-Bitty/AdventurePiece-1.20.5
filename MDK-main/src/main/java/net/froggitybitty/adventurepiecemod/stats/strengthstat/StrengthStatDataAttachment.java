package net.froggitybitty.adventurepiecemod.stats.strengthstat;

import com.mojang.serialization.Codec;
import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;


public class StrengthStatDataAttachment {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, AdventurePieceMod.MODID);

    public static final Supplier<AttachmentType<Float>> STRENGTH_STAT = ATTACHMENT_TYPES.register(
            "strength_stat", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());

    public static final Supplier<AttachmentType<Float>> STRENGTH_EXP = ATTACHMENT_TYPES.register(
            "strength_exp", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());
}
